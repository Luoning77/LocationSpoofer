package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.am1;
import defpackage.az;
import defpackage.az2;
import defpackage.b81;
import defpackage.ee0;
import defpackage.fo;
import defpackage.i52;
import defpackage.j41;
import defpackage.jq1;
import defpackage.k41;
import defpackage.mf3;
import defpackage.mh0;
import defpackage.o51;
import defpackage.q60;
import defpackage.r60;
import defpackage.s90;
import defpackage.yo;
import defpackage.z70;
import defpackage.zy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlinx.coroutines.flow.StateFlow;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class MembershipRepository {
    private final StateFlow<CloudAccountState> accountState;
    private final CloudRepository cloud;

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.cloud.MembershipRepository$cancel$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.cloud.MembershipRepository", f = "MembershipRepository.kt", l = {49}, m = "cancel")
    public static final class AnonymousClass1 extends r60 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MembershipRepository.this.cancel(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.cloud.MembershipRepository$catalog$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.cloud.MembershipRepository", f = "MembershipRepository.kt", l = {30}, m = "catalog")
    public static final class C00621 extends r60 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C00621(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MembershipRepository.this.catalog(null, this);
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.cloud.MembershipRepository$coupons$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.cloud.MembershipRepository", f = "MembershipRepository.kt", l = {63}, m = "coupons")
    public static final class C00631 extends r60 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C00631(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MembershipRepository.this.coupons(null, this);
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.cloud.MembershipRepository$entitlements$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.cloud.MembershipRepository", f = "MembershipRepository.kt", l = {55}, m = "entitlements")
    public static final class C00641 extends r60 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C00641(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MembershipRepository.this.entitlements(null, this);
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.cloud.MembershipRepository$order$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.cloud.MembershipRepository", f = "MembershipRepository.kt", l = {48}, m = "order")
    public static final class C00651 extends r60 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C00651(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MembershipRepository.this.order(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.cloud.MembershipRepository$orders$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.cloud.MembershipRepository", f = "MembershipRepository.kt", l = {44}, m = "orders")
    public static final class C00661 extends r60 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C00661(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MembershipRepository.this.orders(null, this);
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.cloud.MembershipRepository$purchase$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.cloud.MembershipRepository", f = "MembershipRepository.kt", l = {52}, m = "purchase")
    public static final class C00671 extends r60 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public C00671(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MembershipRepository.this.purchase(null, null, null, null, null, null, this);
        }
    }

    public MembershipRepository(CloudRepository cloudRepository) {
        cloudRepository.getClass();
        this.cloud = cloudRepository;
        this.accountState = cloudRepository.getState();
    }

    private final Integer nullableInt(JSONObject jSONObject, String str) {
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        return Integer.valueOf(jSONObject.getInt(str));
    }

    private final Long nullableLong(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return Long.valueOf(jSONObject.getLong(str));
    }

    private final String nullableText(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.getString(str);
    }

    private final MembershipOrder parseOrder(JSONObject jSONObject) throws JSONException, CloudException {
        String string = jSONObject.getString("id");
        String string2 = jSONObject.getString("checkoutMode");
        String string3 = jSONObject.getString("status");
        boolean zOptBoolean = jSONObject.optBoolean("cancelled", false);
        if (zOptBoolean && !o51.f(string3, "EXPIRED")) {
            b81.w("invalid_response");
            return null;
        }
        if (zOptBoolean) {
            string3 = "CANCELLED";
        }
        String str = string3;
        Pattern patternCompile = Pattern.compile("LSM[a-f0-9]{29}");
        patternCompile.getClass();
        string.getClass();
        if (!patternCompile.matcher(string).matches() || !yo.H0(new String[]{"alipay_app", "qr"}).contains(string2) || !yo.H0(new String[]{"CREATING", "PENDING", "PAID", "EXPIRED", "CANCELLED", "FAILED", "CREATE_UNKNOWN", "PAID_REVIEW", "REFUNDING", "REFUNDED", "REFUND_FAILED"}).contains(str)) {
            b81.w("invalid_response");
            return null;
        }
        int i = jSONObject.getInt("amountCents");
        if (1 > i || i >= 1000001) {
            b81.w("invalid_response");
            return null;
        }
        String string4 = jSONObject.getString("planId");
        String strM = az2.m(string4, jSONObject, "title");
        int i2 = jSONObject.getInt("durationDays");
        string2.getClass();
        str.getClass();
        long j = jSONObject.getLong("expiresAt");
        Long lNullableLong = nullableLong(jSONObject, "paidAt");
        Long lNullableLong2 = nullableLong(jSONObject, "grantedUntil");
        String strNullableText = nullableText(jSONObject, "payUrl");
        String strValidate = strNullableText != null ? MembershipPaymentUrls.INSTANCE.validate(strNullableText) : null;
        String strNullableText2 = nullableText(jSONObject, "qrUrl");
        String strValidate2 = strNullableText2 != null ? MembershipPaymentUrls.INSTANCE.validate(strNullableText2) : null;
        String strOptString = jSONObject.optString("productKind", "membership");
        strOptString.getClass();
        return new MembershipOrder(string, string4, strM, i2, i, string2, str, j, lNullableLong, lNullableLong2, strValidate, strValidate2, strOptString, nullableText(jSONObject, "slotId"));
    }

    public static /* synthetic */ Object purchase$default(MembershipRepository membershipRepository, String str, MembershipPlan membershipPlan, String str2, String str3, String str4, String str5, q60 q60Var, int i, Object obj) {
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        return membershipRepository.purchase(str, membershipPlan, str2, str3, str4, str5, q60Var);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object cancel(String str, String str2, q60 q60Var) throws JSONException, CloudException {
        AnonymousClass1 anonymousClass1;
        if (q60Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) q60Var;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(q60Var);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(q60Var);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object objAuthenticatedJson$default = anonymousClass2.result;
        int i2 = anonymousClass2.label;
        if (i2 == 0) {
            ee0.J(objAuthenticatedJson$default);
            CloudRepository cloudRepository = this.cloud;
            String strK = az2.k("/v2/membership/orders/", str2, "/cancel");
            JSONObject jSONObject = new JSONObject();
            anonymousClass2.L$0 = null;
            anonymousClass2.L$1 = str2;
            anonymousClass2.L$2 = this;
            anonymousClass2.label = 1;
            objAuthenticatedJson$default = CloudRepository.authenticatedJson$default(cloudRepository, strK, null, jSONObject, null, str, null, anonymousClass2, 42, null);
            z70 z70Var = z70.e;
            if (objAuthenticatedJson$default == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = (MembershipRepository) anonymousClass2.L$2;
            str2 = (String) anonymousClass2.L$1;
            ee0.J(objAuthenticatedJson$default);
        }
        MembershipOrder order = this.parseOrder((JSONObject) objAuthenticatedJson$default);
        if (o51.f(order.getId(), str2)) {
            return order;
        }
        b81.w("invalid_response");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:142:0x02ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v8 */
    public final Object catalog(String str, q60 q60Var) {
        C00621 c00621;
        JSONObject jSONObject;
        String str2;
        Object i52Var;
        String strOptString;
        int length;
        int softwareDeviceLimit;
        int quotaUnits;
        if (q60Var instanceof C00621) {
            c00621 = (C00621) q60Var;
            int i = c00621.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00621.label = i - Integer.MIN_VALUE;
            } else {
                c00621 = new C00621(q60Var);
            }
        } else {
            c00621 = new C00621(q60Var);
        }
        C00621 c00622 = c00621;
        Object objAuthenticatedJson$default = c00622.result;
        int i2 = c00622.label;
        String str3 = null;
        ?? r14 = 1;
        if (i2 == 0) {
            ee0.J(objAuthenticatedJson$default);
            CloudRepository cloudRepository = this.cloud;
            c00622.L$0 = null;
            c00622.label = 1;
            objAuthenticatedJson$default = CloudRepository.authenticatedJson$default(cloudRepository, "/v2/membership/catalog-v3", null, null, null, str, null, c00622, 46, null);
            z70 z70Var = z70.e;
            if (objAuthenticatedJson$default == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(objAuthenticatedJson$default);
        }
        JSONObject jSONObject2 = (JSONObject) objAuthenticatedJson$default;
        if (!o51.f(jSONObject2.getString("currency"), "CNY")) {
            b81.w("invalid_response");
            return null;
        }
        JSONArray jSONArray = jSONObject2.getJSONArray("plans");
        JSONArray jSONArray2 = jSONObject2.getJSONArray("benefits");
        if (jSONArray.length() > 64 || jSONArray2.length() > 20) {
            b81.w("invalid_response");
            return null;
        }
        k41 k41VarF0 = mh0.f0(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(az.Y(k41VarF0, 10));
        Iterator it = k41VarF0.iterator();
        while (true) {
            j41 j41Var = (j41) it;
            String str4 = str3;
            String str5 = "id";
            if (j41Var.g) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(j41Var.nextInt());
                String string = jSONObject3.getString("id");
                String strM = az2.m(string, jSONObject3, "name");
                int i3 = jSONObject3.getInt("durationDays");
                int i4 = jSONObject3.getInt("originalPriceCents");
                int i5 = jSONObject3.getInt("priceCents");
                String strNullableText = nullableText(jSONObject3, "activityLabel");
                long j = jSONObject3.getLong("revision");
                int iOptInt = jSONObject3.optInt("softwareDeviceLimit", r14);
                String strOptString2 = jSONObject3.optString("tier", jSONObject3.getString("id"));
                strOptString2.getClass();
                Integer numNullableInt = nullableInt(jSONObject3, "remainingStock");
                Integer numNullableInt2 = nullableInt(jSONObject3, "accountRemaining");
                boolean zOptBoolean = jSONObject3.optBoolean("available", r14);
                String strOptString3 = jSONObject3.optString("productKind", "membership");
                strOptString3.getClass();
                MembershipPlan membershipPlan = new MembershipPlan(string, strM, i3, i4, i5, strNullableText, j, iOptInt, strOptString2, numNullableInt, numNullableInt2, zOptBoolean, strOptString3, jSONObject3.optInt("quotaUnits"));
                Pattern patternCompile = Pattern.compile("[a-z][a-z0-9_-]{0,31}");
                patternCompile.getClass();
                String id = membershipPlan.getId();
                id.getClass();
                if (patternCompile.matcher(id).matches() && r14 <= (length = membershipPlan.getName().length()) && length < 41) {
                    String name = membershipPlan.getName();
                    for (int i6 = 0; i6 < name.length(); i6++) {
                        if (!Character.isISOControl(name.charAt(i6))) {
                        }
                    }
                    int durationDays = membershipPlan.getDurationDays();
                    if (1 <= durationDays && durationDays < 1831) {
                        int originalPriceCents = membershipPlan.getOriginalPriceCents();
                        int priceCents = membershipPlan.getPriceCents();
                        if (1 <= priceCents && priceCents <= originalPriceCents && membershipPlan.getOriginalPriceCents() <= 1000000 && membershipPlan.getRevision() >= 1 && 1 <= (softwareDeviceLimit = membershipPlan.getSoftwareDeviceLimit()) && softwareDeviceLimit < 21 && yo.H0(new String[]{"week", "month", "quarter", "year"}).contains(membershipPlan.getTier()) && yo.H0(new String[]{"membership", "device_slot", "quota"}).contains(membershipPlan.getProductKind()) && (quotaUnits = membershipPlan.getQuotaUnits()) >= 0 && quotaUnits < 1000001 && ((membershipPlan.getRemainingStock() == null || new k41(0, 1000000, 1).c(membershipPlan.getRemainingStock().intValue())) && (membershipPlan.getAccountRemaining() == null || new k41(0, 10000, 1).c(membershipPlan.getAccountRemaining().intValue())))) {
                            arrayList.add(membershipPlan);
                            str3 = str4;
                            r14 = 1;
                        }
                    }
                }
                b81.w("invalid_response");
                return str4;
            }
            ArrayList arrayList2 = new ArrayList(az.Y(arrayList, 10));
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                arrayList2.add(((MembershipPlan) obj).getId());
            }
            if (zy.h0(arrayList2).size() != arrayList.size()) {
                b81.w("invalid_response");
                return str4;
            }
            boolean z = jSONObject2.getBoolean("purchasingEnabled");
            k41 k41VarF1 = mh0.f0(0, jSONArray2.length());
            ArrayList arrayList3 = new ArrayList(az.Y(k41VarF1, 10));
            Iterator it2 = k41VarF1.iterator();
            while (true) {
                j41 j41Var2 = (j41) it2;
                if (!j41Var2.g) {
                    String string2 = jSONObject2.getString("quotaNote");
                    string2.getClass();
                    return new MembershipCatalog(z, arrayList, arrayList3, string2);
                }
                JSONObject jSONObject4 = jSONArray2.getJSONObject(j41Var2.nextInt());
                String string3 = jSONObject4.getString(str5);
                String strM2 = az2.m(string3, jSONObject4, "name");
                String string4 = jSONObject4.getString("free");
                Iterator it3 = it2;
                String strM3 = az2.m(string4, jSONObject4, "member");
                List listG = am1.G("free", "week", "month", "quarter", "year");
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = listG.iterator();
                while (it4.hasNext()) {
                    Iterator it5 = it4;
                    String str6 = (String) it4.next();
                    JSONArray jSONArray3 = jSONArray2;
                    JSONObject jSONObjectOptJSONObject = jSONObject4.optJSONObject("values");
                    if (jSONObjectOptJSONObject == null || (strOptString = jSONObjectOptJSONObject.optString(str6)) == null) {
                        jSONObject = jSONObject4;
                        str2 = str5;
                    } else {
                        jSONObject = jSONObject4;
                        int length2 = strOptString.length();
                        str2 = str5;
                        if (1 > length2 || length2 >= 121) {
                            strOptString = str4;
                            break;
                        }
                        for (int i8 = 0; i8 < strOptString.length(); i8++) {
                            if (Character.isISOControl(strOptString.charAt(i8))) {
                                strOptString = str4;
                                break;
                            }
                        }
                        if (strOptString != null) {
                            i52Var = new i52(str6, strOptString);
                        }
                        if (i52Var != null) {
                            arrayList4.add(i52Var);
                        }
                        it4 = it5;
                        jSONObject4 = jSONObject;
                        jSONArray2 = jSONArray3;
                        str5 = str2;
                    }
                    i52Var = str4;
                    if (i52Var != null) {
                        arrayList4.add(i52Var);
                    }
                    it4 = it5;
                    jSONObject4 = jSONObject;
                    jSONArray2 = jSONArray3;
                    str5 = str2;
                }
                arrayList3.add(new MembershipBenefit(string3, strM2, string4, strM3, jq1.Q(arrayList4)));
                it2 = it3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object coupons(String str, q60 q60Var) {
        C00631 c00631;
        if (q60Var instanceof C00631) {
            c00631 = (C00631) q60Var;
            int i = c00631.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00631.label = i - Integer.MIN_VALUE;
            } else {
                c00631 = new C00631(q60Var);
            }
        } else {
            c00631 = new C00631(q60Var);
        }
        Object objRewards = c00631.result;
        int i2 = c00631.label;
        if (i2 == 0) {
            ee0.J(objRewards);
            AccountBenefitsRepository accountBenefitsRepository = new AccountBenefitsRepository(this.cloud);
            c00631.L$0 = null;
            c00631.label = 1;
            objRewards = accountBenefitsRepository.rewards(str, c00631);
            z70 z70Var = z70.e;
            if (objRewards == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(objRewards);
        }
        return ((ContributionStatus) objRewards).getCoupons();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object entitlements(String str, q60 q60Var) {
        C00641 c00641;
        if (q60Var instanceof C00641) {
            c00641 = (C00641) q60Var;
            int i = c00641.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00641.label = i - Integer.MIN_VALUE;
            } else {
                c00641 = new C00641(q60Var);
            }
        } else {
            c00641 = new C00641(q60Var);
        }
        C00641 c00642 = c00641;
        Object objAuthenticatedJson$default = c00642.result;
        int i2 = c00642.label;
        if (i2 == 0) {
            ee0.J(objAuthenticatedJson$default);
            CloudRepository cloudRepository = this.cloud;
            c00642.L$0 = null;
            c00642.label = 1;
            objAuthenticatedJson$default = CloudRepository.authenticatedJson$default(cloudRepository, "/v2/membership/entitlements", null, null, null, str, null, c00642, 46, null);
            z70 z70Var = z70.e;
            if (objAuthenticatedJson$default == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(objAuthenticatedJson$default);
        }
        JSONObject jSONObject = (JSONObject) objAuthenticatedJson$default;
        JSONArray jSONArray = jSONObject.getJSONArray("slots");
        if (jSONArray.length() > 500) {
            b81.w("invalid_response");
            return null;
        }
        int i3 = 0;
        k41 k41VarF0 = mh0.f0(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(az.Y(k41VarF0, 10));
        Iterator it = k41VarF0.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(((j41) it).nextInt());
            JSONObject jSONObject3 = jSONObject2.getJSONObject("quota");
            String string = jSONObject2.getString("id");
            String strM = az2.m(string, jSONObject2, "kind");
            String strNullableText = nullableText(jSONObject2, "deviceId");
            String strNullableText2 = nullableText(jSONObject2, "name");
            boolean z = jSONObject2.getBoolean("active");
            Long lNullableLong = nullableLong(jSONObject2, "purchasedUntil");
            int i4 = jSONObject3.getInt("limit");
            int i5 = jSONObject3.getInt("used");
            int i6 = jSONObject3.getInt("extraRemaining");
            long j = jSONObject3.getLong("resetsAt");
            boolean zOptBoolean = jSONObject2.optBoolean("eligible", true);
            String strOptString = jSONObject2.optString("origin", "hardware");
            strOptString.getClass();
            arrayList.add(new CloudDeviceSlot(string, strM, strNullableText, strNullableText2, z, lNullableLong, i4, i5, i6, j, zOptBoolean, strOptString, jSONObject2.optInt("position")));
        }
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                CloudDeviceSlot cloudDeviceSlot = (CloudDeviceSlot) obj;
                int length = cloudDeviceSlot.getId().length();
                if (1 > length || length >= 121 || !yo.H0(new String[]{"tee", "software", "account"}).contains(cloudDeviceSlot.getKind()) || cloudDeviceSlot.getLimit() < 0 || cloudDeviceSlot.getUsed() < 0 || cloudDeviceSlot.getExtraRemaining() < 0) {
                    b81.w("invalid_response");
                    return null;
                }
            }
        }
        String string2 = jSONObject.getString("tier");
        string2.getClass();
        return new CloudEntitlements(string2, jSONObject.getInt("loginLimit"), jSONObject.getInt("softwareLimit"), jSONObject.getInt("softwareMaximum"), arrayList);
    }

    public final StateFlow<CloudAccountState> getAccountState() {
        return this.accountState;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object order(String str, String str2, q60 q60Var) {
        C00651 c00651;
        if (q60Var instanceof C00651) {
            c00651 = (C00651) q60Var;
            int i = c00651.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00651.label = i - Integer.MIN_VALUE;
            } else {
                c00651 = new C00651(q60Var);
            }
        } else {
            c00651 = new C00651(q60Var);
        }
        C00651 c00652 = c00651;
        Object objAuthenticatedJson$default = c00652.result;
        int i2 = c00652.label;
        if (i2 == 0) {
            ee0.J(objAuthenticatedJson$default);
            CloudRepository cloudRepository = this.cloud;
            String strJ = az2.j("/v2/membership/orders/", str2);
            c00652.L$0 = null;
            c00652.L$1 = null;
            c00652.L$2 = this;
            c00652.label = 1;
            objAuthenticatedJson$default = CloudRepository.authenticatedJson$default(cloudRepository, strJ, null, null, null, str, null, c00652, 46, null);
            z70 z70Var = z70.e;
            if (objAuthenticatedJson$default == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = (MembershipRepository) c00652.L$2;
            ee0.J(objAuthenticatedJson$default);
        }
        return this.parseOrder((JSONObject) objAuthenticatedJson$default);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object orders(String str, q60 q60Var) throws JSONException, CloudException {
        C00661 c00661;
        if (q60Var instanceof C00661) {
            c00661 = (C00661) q60Var;
            int i = c00661.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00661.label = i - Integer.MIN_VALUE;
            } else {
                c00661 = new C00661(q60Var);
            }
        } else {
            c00661 = new C00661(q60Var);
        }
        C00661 c00662 = c00661;
        Object objAuthenticatedJson$default = c00662.result;
        int i2 = c00662.label;
        if (i2 == 0) {
            ee0.J(objAuthenticatedJson$default);
            CloudRepository cloudRepository = this.cloud;
            c00662.L$0 = null;
            c00662.label = 1;
            objAuthenticatedJson$default = CloudRepository.authenticatedJson$default(cloudRepository, "/v2/membership/orders", null, null, null, str, null, c00662, 46, null);
            z70 z70Var = z70.e;
            if (objAuthenticatedJson$default == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(objAuthenticatedJson$default);
        }
        JSONArray jSONArray = ((JSONObject) objAuthenticatedJson$default).getJSONArray("orders");
        if (jSONArray.length() > 20) {
            b81.w("invalid_response");
            return null;
        }
        k41 k41VarF0 = mh0.f0(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(az.Y(k41VarF0, 10));
        Iterator it = k41VarF0.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = jSONArray.getJSONObject(((j41) it).nextInt());
            jSONObject.getClass();
            arrayList.add(parseOrder(jSONObject));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object purchase(String str, MembershipPlan membershipPlan, String str2, String str3, String str4, String str5, q60 q60Var) throws JSONException {
        C00671 c00671;
        if (q60Var instanceof C00671) {
            c00671 = (C00671) q60Var;
            int i = c00671.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00671.label = i - Integer.MIN_VALUE;
            } else {
                c00671 = new C00671(q60Var);
            }
        } else {
            c00671 = new C00671(q60Var);
        }
        C00671 c00672 = c00671;
        Object objAuthenticatedJson$default = c00672.result;
        int i2 = c00672.label;
        if (i2 == 0) {
            ee0.J(objAuthenticatedJson$default);
            CloudRepository cloudRepository = this.cloud;
            JSONObject jSONObjectPut = new JSONObject().put("planId", membershipPlan.getId()).put("revision", membershipPlan.getRevision()).put("priceCents", membershipPlan.getPriceCents()).put("requestId", str2).put("checkoutMode", str3).put("couponId", str4 == null ? JSONObject.NULL : str4).put("slotId", str5 == null ? JSONObject.NULL : str5);
            c00672.L$0 = null;
            c00672.L$1 = null;
            c00672.L$2 = null;
            c00672.L$3 = null;
            c00672.L$4 = null;
            c00672.L$5 = null;
            c00672.L$6 = this;
            c00672.label = 1;
            objAuthenticatedJson$default = CloudRepository.authenticatedJson$default(cloudRepository, "/v2/membership/orders", null, jSONObjectPut, null, str, null, c00672, 42, null);
            z70 z70Var = z70.e;
            if (objAuthenticatedJson$default == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = (MembershipRepository) c00672.L$6;
            ee0.J(objAuthenticatedJson$default);
        }
        return this.parseOrder((JSONObject) objAuthenticatedJson$default);
    }

    public final Object refreshAccount(q60 q60Var) throws Throwable {
        Object objRefreshAccount = this.cloud.refreshAccount(q60Var);
        return objRefreshAccount == z70.e ? objRefreshAccount : mf3.a;
    }
}
