package com.vincenthzr.locationspoofer.data.cloud

import kotlinx.coroutines.flow.StateFlow
import org.json.JSONArray
import org.json.JSONObject
import java.util.regex.Pattern

class MembershipRepository(cloudRepository: CloudRepository) {
    private val cloud: CloudRepository = cloudRepository
    val accountState: StateFlow<CloudAccountState> = cloudRepository.state

    private fun nullableInt(json: JSONObject, key: String): Int? {
        if (!json.has(key) || json.isNull(key)) return null
        return json.getInt(key)
    }

    private fun nullableLong(json: JSONObject, key: String): Long? {
        if (json.isNull(key)) return null
        return json.getLong(key)
    }

    private fun nullableText(json: JSONObject, key: String): String? {
        if (json.isNull(key)) return null
        return json.getString(key)
    }

    private fun parseOrder(json: JSONObject): MembershipOrder {
        val id = json.getString("id")
        val checkoutMode = json.getString("checkoutMode")
        var status = json.getString("status")
        val cancelled = json.optBoolean("cancelled", false)
        if (cancelled && status != "EXPIRED") {
            throw CloudException("invalid_response")
        }
        if (cancelled) {
            status = "CANCELLED"
        }
        val idOk = Pattern.compile("LSM[a-f0-9]{29}").matcher(id).matches()
        val modeOk = checkoutMode in setOf("alipay_app", "qr")
        val statusOk = status in setOf(
            "CREATING", "PENDING", "PAID", "EXPIRED", "CANCELLED", "FAILED",
            "CREATE_UNKNOWN", "PAID_REVIEW", "REFUNDING", "REFUNDED", "REFUND_FAILED",
        )
        if (!idOk || !modeOk || !statusOk) {
            throw CloudException("invalid_response")
        }
        val amountCents = json.getInt("amountCents")
        if (amountCents < 1 || amountCents >= 1000001) {
            throw CloudException("invalid_response")
        }
        val planId = json.getString("planId")
        val title = json.getString("title")
        val durationDays = json.getInt("durationDays")
        val expiresAt = json.getLong("expiresAt")
        val paidAt = nullableLong(json, "paidAt")
        val grantedUntil = nullableLong(json, "grantedUntil")
        val payUrlRaw = nullableText(json, "payUrl")
        val payUrl = payUrlRaw?.let { MembershipPaymentUrls.validate(it) }
        val qrUrlRaw = nullableText(json, "qrUrl")
        val qrUrl = qrUrlRaw?.let { MembershipPaymentUrls.validate(it) }
        val productKind = json.optString("productKind", "membership")
        return MembershipOrder(
            id = id,
            planId = planId,
            title = title,
            durationDays = durationDays,
            amountCents = amountCents,
            checkoutMode = checkoutMode,
            status = status,
            expiresAt = expiresAt,
            paidAt = paidAt,
            grantedUntil = grantedUntil,
            payUrl = payUrl,
            qrUrl = qrUrl,
            productKind = productKind,
            slotId = nullableText(json, "slotId"),
        )
    }

    suspend fun cancel(sessionId: String?, orderId: String?): MembershipOrder? {
        val json = cloud.authenticatedJson(
            path = "/v2/membership/orders/$orderId/cancel",
            body = JSONObject(),
            expectedSessionId = sessionId,
        )
        val order = parseOrder(json)
        if (order.id != orderId) {
            throw CloudException("invalid_response")
        }
        return order
    }

    suspend fun catalog(sessionId: String?): MembershipCatalog? {
        val json = cloud.authenticatedJson(
            path = "/v2/membership/catalog-v3",
            expectedSessionId = sessionId,
        )
        if (json.getString("currency") != "CNY") {
            throw CloudException("invalid_response")
        }
        val plansArr = json.getJSONArray("plans")
        val benefitsArr = json.getJSONArray("benefits")
        if (plansArr.length() > 64 || benefitsArr.length() > 20) {
            throw CloudException("invalid_response")
        }
        val plans = ArrayList<MembershipPlan>(plansArr.length())
        for (i in 0 until plansArr.length()) {
            val o = plansArr.getJSONObject(i)
            val id = o.getString("id")
            val name = o.getString("name")
            val plan = MembershipPlan(
                id = id,
                name = name,
                durationDays = o.getInt("durationDays"),
                originalPriceCents = o.getInt("originalPriceCents"),
                priceCents = o.getInt("priceCents"),
                activityLabel = nullableText(o, "activityLabel") ?: "",
                revision = o.getLong("revision"),
                softwareDeviceLimit = o.optInt("softwareDeviceLimit", 1),
                tier = o.optString("tier", o.getString("id")),
                remainingStock = nullableInt(o, "remainingStock"),
                accountRemaining = nullableInt(o, "accountRemaining"),
                available = o.optBoolean("available", true),
                productKind = o.optString("productKind", "membership"),
                quotaUnits = o.optInt("quotaUnits"),
            )
            val planIdOk = Pattern.compile("[a-z][a-z0-9_-]{0,31}").matcher(plan.id).matches()
            val nameLen = plan.name.length
            val nameOk = nameLen >= 1 && nameLen < 41 && plan.name.none { it.isISOControl() }
            val durationOk = plan.durationDays >= 1 && plan.durationDays < 1831
            val priceOk = plan.priceCents >= 1 &&
                plan.priceCents <= plan.originalPriceCents &&
                plan.originalPriceCents <= 1000000
            val revisionOk = plan.revision >= 1
            val softwareOk = plan.softwareDeviceLimit >= 1 && plan.softwareDeviceLimit < 21
            val tierOk = plan.tier in TIERS
            val kindOk = plan.productKind in PRODUCT_KINDS
            val quotaOk = plan.quotaUnits >= 0 && plan.quotaUnits < 1000001
            val remainingOk = plan.remainingStock == null || plan.remainingStock in 0..999999
            val accountOk = plan.accountRemaining == null || plan.accountRemaining in 0..10000
            if (!(planIdOk && nameOk && durationOk && priceOk && revisionOk &&
                    softwareOk && tierOk && kindOk && quotaOk && remainingOk && accountOk)
            ) {
                throw CloudException("invalid_response")
            }
            plans.add(plan)
        }
        if (plans.map { it.id }.toSet().size != plans.size) {
            throw CloudException("invalid_response")
        }
        val purchasingEnabled = json.getBoolean("purchasingEnabled")
        val benefits = ArrayList<MembershipBenefit>(benefitsArr.length())
        for (i in 0 until benefitsArr.length()) {
            val o = benefitsArr.getJSONObject(i)
            val id = o.getString("id")
            val name = o.getString("name")
            val free = o.getString("free")
            val member = o.getString("member")
            val values = LinkedHashMap<String, String>()
            val valuesJson = o.optJSONObject("values")
            for (key in listOf("free", "week", "month", "quarter", "year")) {
                val value = valuesJson?.optString(key)
                if (value != null) {
                    if (value.length < 1 || value.length >= 121) {
                        throw CloudException("invalid_response")
                    }
                    if (value.any { it.isISOControl() }) {
                        throw CloudException("invalid_response")
                    }
                    values[key] = value
                }
            }
            benefits.add(MembershipBenefit(id, name, free, member, values))
        }
        val quotaNote = json.getString("quotaNote")
        return MembershipCatalog(purchasingEnabled, plans, benefits, quotaNote)
    }

    suspend fun coupons(sessionId: String?): List<RewardCoupon>? {
        val status = AccountBenefitsRepository(cloud).rewards(sessionId) ?: return null
        return status.coupons
    }

    suspend fun entitlements(sessionId: String?): CloudEntitlements? {
        val json = cloud.authenticatedJson(
            path = "/v2/membership/entitlements",
            expectedSessionId = sessionId,
        )
        val slotsArr = json.getJSONArray("slots")
        if (slotsArr.length() > 500) {
            throw CloudException("invalid_response")
        }
        val slots = ArrayList<CloudDeviceSlot>(slotsArr.length())
        for (i in 0 until slotsArr.length()) {
            val o = slotsArr.getJSONObject(i)
            val quota = o.getJSONObject("quota")
            val slot = CloudDeviceSlot(
                id = o.getString("id"),
                kind = o.getString("kind"),
                deviceId = nullableText(o, "deviceId") ?: "",
                name = nullableText(o, "name") ?: "",
                active = o.getBoolean("active"),
                purchasedUntil = nullableLong(o, "purchasedUntil"),
                limit = quota.getInt("limit"),
                used = quota.getInt("used"),
                extraRemaining = quota.getInt("extraRemaining"),
                resetsAt = quota.getLong("resetsAt"),
                eligible = o.optBoolean("eligible", true),
                origin = o.optString("origin", "hardware"),
                position = o.optInt("position"),
            )
            val idLen = slot.id.length
            val idOk = idLen >= 1 && idLen < 121
            val kindOk = slot.kind in setOf("tee", "software", "account")
            val countsOk = slot.limit >= 0 && slot.used >= 0 && slot.extraRemaining >= 0
            if (!idOk || !kindOk || !countsOk) {
                throw CloudException("invalid_response")
            }
            slots.add(slot)
        }
        val tier = json.getString("tier")
        return CloudEntitlements(
            tier = tier,
            loginLimit = json.getInt("loginLimit"),
            softwareLimit = json.getInt("softwareLimit"),
            softwareMaximum = json.getInt("softwareMaximum"),
            slots = slots,
        )
    }

    suspend fun order(sessionId: String?, orderId: String?): MembershipOrder? {
        val json = cloud.authenticatedJson(
            path = "/v2/membership/orders/$orderId",
            expectedSessionId = sessionId,
        )
        return parseOrder(json)
    }

    suspend fun orders(sessionId: String?): List<MembershipOrder>? {
        val json = cloud.authenticatedJson(
            path = "/v2/membership/orders",
            expectedSessionId = sessionId,
        )
        val arr = json.getJSONArray("orders")
        if (arr.length() > 20) {
            throw CloudException("invalid_response")
        }
        val orders = ArrayList<MembershipOrder>(arr.length())
        for (i in 0 until arr.length()) {
            orders.add(parseOrder(arr.getJSONObject(i)))
        }
        return orders
    }

    suspend fun purchase(
        sessionId: String?,
        plan: MembershipPlan?,
        requestId: String?,
        checkoutMode: String?,
        couponId: String? = null,
        slotId: String? = null,
    ): MembershipOrder? {
        val body = JSONObject()
            .put("planId", plan!!.id)
            .put("revision", plan.revision)
            .put("priceCents", plan.priceCents)
            .put("requestId", requestId)
            .put("checkoutMode", checkoutMode)
            .put("couponId", couponId ?: JSONObject.NULL)
            .put("slotId", slotId ?: JSONObject.NULL)
        val json = cloud.authenticatedJson(
            path = "/v2/membership/orders",
            body = body,
            expectedSessionId = sessionId,
        )
        return parseOrder(json)
    }

    suspend fun refreshAccount() {
        cloud.refreshAccount()
    }

    companion object {
        private val TIERS = setOf("week", "month", "quarter", "year")
        private val PRODUCT_KINDS = setOf("membership", "device_slot", "quota")
    }
}
