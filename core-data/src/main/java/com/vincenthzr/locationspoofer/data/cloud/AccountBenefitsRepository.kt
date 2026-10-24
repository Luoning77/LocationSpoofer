package com.vincenthzr.locationspoofer.data.cloud

import kotlinx.coroutines.flow.StateFlow
import org.json.JSONObject
import java.nio.charset.StandardCharsets
import java.util.UUID

class AccountBenefitsRepository(cloudRepository: CloudRepository) {
    private val cloud: CloudRepository = cloudRepository
    val accountState: StateFlow<CloudAccountState> = cloudRepository.state

    private fun uuid(value: String): String {
        val ok = try {
            UUID.fromString(value).toString() == value
        } catch (_: Throwable) {
            false
        }
        if (!ok) throw CloudException("invalid_response")
        return value
    }

    suspend fun archives(
        sessionId: String?,
        kind: String?,
        page: Int = 1,
    ): ArchivePage? {
        require(kind in setOf("history", "trash"))
        require(page in 1..500)
        val query = mapOf("kind" to kind!!, "page" to page.toString())
        val json = cloud.authenticatedJson(
            path = "/v2/account/archives",
            query = query,
            expectedSessionId = sessionId,
        )
        val items = json.getJSONArray("items")
        if (items.length() > 30) {
            throw CloudException("invalid_response")
        }
        val archives = ArrayList<CloudArchive>(items.length())
        for (i in 0 until items.length()) {
            val o = items.getJSONObject(i)
            val countsJson = o.getJSONObject("counts")
            val counts = LinkedHashMap<String, Int>()
            for (key in countsJson.keys()) {
                counts[key] = countsJson.getInt(key)
            }
            val archive = CloudArchive(
                id = uuid(o.getString("id")),
                revision = o.getLong("revision"),
                deviceId = uuid(o.getString("deviceId")),
                createdAt = o.getLong("createdAt"),
                expiresAt = o.getLong("expiresAt"),
                reason = o.getString("reason"),
                counts = counts,
            )
            if (archive.revision < 0 || archive.expiresAt <= archive.createdAt) {
                throw CloudException("invalid_response")
            }
            for ((key, value) in archive.counts) {
                if (key !in COUNT_KEYS || value < 0 || value >= 10001) {
                    throw CloudException("invalid_response")
                }
            }
            archives.add(archive)
        }
        val archivePage = ArchivePage(archives, json.getInt("page"), json.getInt("total"))
        if (archivePage.page != page || archivePage.total < 0 || archivePage.total >= 10001) {
            throw CloudException("invalid_response")
        }
        return archivePage
    }

    fun current(accountId: String?): Boolean {
        val state = cloud.state.value
        if (!state.validated) return false
        return state.account?.id == accountId && state.account?.isGuest != true
    }

    suspend fun preview(
        sessionId: String?,
        kind: String?,
        requestId: String?,
    ): Map<String, String>? {
        require(kind in setOf("history", "trash"))
        uuid(requestId!!)
        val json = cloud.authenticatedJson(
            path = "/v2/account/archives/$requestId",
            query = mapOf("kind" to kind!!),
            expectedSessionId = sessionId,
        )
        val entries = json.getJSONObject("entries")
        if (entries.length() > 10000) {
            throw CloudException("invalid_response")
        }
        val map = LinkedHashMap<String, String>()
        for (key in entries.keys()) {
            map[key] = entries.getString(key)
        }
        var totalBytes = 0L
        for ((k, v) in map) {
            totalBytes += k.toByteArray(StandardCharsets.UTF_8).size.toLong()
            totalBytes += v.toByteArray(StandardCharsets.UTF_8).size.toLong()
        }
        if (totalBytes > 4000000L) {
            throw CloudException("invalid_response")
        }
        return map
    }

    suspend fun redeem(
        sessionId: String?,
        kind: String?,
        deviceId: String?,
        requestId: String?,
    ) {
        uuid(requestId!!)
        require(kind in setOf("search", "coupon"))
        val body = JSONObject()
            .put("kind", kind)
            .put("requestId", requestId)
            .put("deviceId", deviceId ?: JSONObject.NULL)
        cloud.authenticatedJson(
            path = "/v2/account/rewards/redeem",
            body = body,
            expectedSessionId = sessionId,
        )
    }

    suspend fun rewards(sessionId: String?): ContributionStatus? {
        val json = cloud.authenticatedJson(
            path = "/v2/account/rewards",
            expectedSessionId = sessionId,
        )
        val devicesArr = json.getJSONArray("devices")
        val couponsArr = json.getJSONArray("coupons")
        val ledgerArr = json.getJSONArray("ledger")
        if (devicesArr.length() > 100 || couponsArr.length() > 100 || ledgerArr.length() > 50) {
            throw CloudException("invalid_response")
        }
        val devices = ArrayList<RewardDevice>(devicesArr.length())
        for (i in 0 until devicesArr.length()) {
            val o = devicesArr.getJSONObject(i)
            val id = uuid(o.getString("id"))
            val name = o.getString("name").take(80)
            devices.add(RewardDevice(id, name))
        }
        val coupons = ArrayList<RewardCoupon>(couponsArr.length())
        for (i in 0 until couponsArr.length()) {
            val o = couponsArr.getJSONObject(i)
            val id = uuid(o.getString("id"))
            coupons.add(
                RewardCoupon(
                    id = id,
                    amountCents = o.getInt("amountCents"),
                    minimumCents = o.getInt("minimumCents"),
                    expiresAt = o.getLong("expiresAt"),
                ),
            )
        }
        val ledger = ArrayList<RewardEntry>(ledgerArr.length())
        for (i in 0 until ledgerArr.length()) {
            val o = ledgerArr.getJSONObject(i)
            val id = uuid(o.getString("id"))
            ledger.add(
                RewardEntry(
                    id = id,
                    delta = o.getInt("delta"),
                    kind = o.getString("kind"),
                    createdAt = o.getLong("createdAt"),
                ),
            )
        }
        val status = ContributionStatus(
            availablePoints = json.getLong("availablePoints"),
            pendingPoints = json.getLong("pendingPoints"),
            verifiedContributions = json.getInt("verifiedContributions"),
            bonusSearchRemaining = json.getInt("bonusSearchRemaining"),
            devices = devices,
            coupons = coupons,
            ledger = ledger,
            monthlySearchCap = json.getInt("monthlySearchCap"),
            monthlyCouponCap = json.getInt("monthlyCouponCap"),
        )
        if (status.availablePoints < 0 ||
            status.pendingPoints < 0 ||
            status.verifiedContributions < 0 ||
            status.bonusSearchRemaining < 0 ||
            status.monthlySearchCap < 0 ||
            status.monthlySearchCap >= 100001 ||
            status.monthlyCouponCap < 0 ||
            status.monthlyCouponCap >= 11
        ) {
            throw CloudException("invalid_response")
        }
        return status
    }

    companion object {
        private val COUNT_KEYS = setOf("setting", "favorite", "location", "route", "collection")
    }
}
