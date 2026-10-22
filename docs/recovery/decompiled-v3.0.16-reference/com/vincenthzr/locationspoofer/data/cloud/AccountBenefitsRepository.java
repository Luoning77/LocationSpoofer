package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.az;
import defpackage.az2;
import defpackage.b81;
import defpackage.ee0;
import defpackage.fo;
import defpackage.i52;
import defpackage.j41;
import defpackage.jq1;
import defpackage.k41;
import defpackage.k50;
import defpackage.l13;
import defpackage.mf3;
import defpackage.mh0;
import defpackage.o51;
import defpackage.q60;
import defpackage.r60;
import defpackage.s90;
import defpackage.sw;
import defpackage.us2;
import defpackage.wg2;
import defpackage.xs2;
import defpackage.yo;
import defpackage.z70;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlinx.coroutines.flow.StateFlow;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class AccountBenefitsRepository {
    private final StateFlow<CloudAccountState> accountState;
    private final CloudRepository cloud;

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.cloud.AccountBenefitsRepository$archives$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.cloud.AccountBenefitsRepository", f = "AccountBenefitsRepository.kt", l = {19}, m = "archives")
    public static final class AnonymousClass1 extends r60 {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccountBenefitsRepository.this.archives(null, null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.cloud.AccountBenefitsRepository$preview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.cloud.AccountBenefitsRepository", f = "AccountBenefitsRepository.kt", l = {29}, m = "preview")
    public static final class C00061 extends r60 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C00061(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccountBenefitsRepository.this.preview(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.cloud.AccountBenefitsRepository$rewards$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.cloud.AccountBenefitsRepository", f = "AccountBenefitsRepository.kt", l = {34}, m = "rewards")
    public static final class C00071 extends r60 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C00071(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccountBenefitsRepository.this.rewards(null, this);
        }
    }

    public AccountBenefitsRepository(CloudRepository cloudRepository) {
        cloudRepository.getClass();
        this.cloud = cloudRepository;
        this.accountState = cloudRepository.getState();
    }

    public static /* synthetic */ Object archives$default(AccountBenefitsRepository accountBenefitsRepository, String str, String str2, int i, q60 q60Var, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 1;
        }
        return accountBenefitsRepository.archives(str, str2, i, q60Var);
    }

    private final String uuid(String str) throws CloudException {
        Object wg2Var;
        try {
            wg2Var = Boolean.valueOf(o51.f(UUID.fromString(str).toString(), str));
        } catch (Throwable th) {
            wg2Var = new wg2(th);
        }
        Object obj = Boolean.FALSE;
        if (wg2Var instanceof wg2) {
            wg2Var = obj;
        }
        if (((Boolean) wg2Var).booleanValue()) {
            return str;
        }
        b81.w("invalid_response");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object archives(String str, String str2, int i, q60 q60Var) throws JSONException, CloudException {
        AnonymousClass1 anonymousClass1;
        int total;
        Object obj;
        AccountBenefitsRepository accountBenefitsRepository = this;
        int i2 = i;
        if (q60Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) q60Var;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = accountBenefitsRepository.new AnonymousClass1(q60Var);
            }
        } else {
            anonymousClass1 = accountBenefitsRepository.new AnonymousClass1(q60Var);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object objAuthenticatedJson$default = anonymousClass2.result;
        int i4 = anonymousClass2.label;
        Object obj2 = null;
        if (i4 == 0) {
            ee0.J(objAuthenticatedJson$default);
            if (!yo.H0(new String[]{"history", "trash"}).contains(str2)) {
                fo.i("Failed requirement.");
                return null;
            }
            if (1 > i2 || i2 >= 501) {
                fo.i("Failed requirement.");
                return null;
            }
            CloudRepository cloudRepository = accountBenefitsRepository.cloud;
            Map mapN = jq1.N(new i52("kind", str2), new i52("page", String.valueOf(i2)));
            anonymousClass2.L$0 = null;
            anonymousClass2.L$1 = null;
            anonymousClass2.I$0 = i2;
            anonymousClass2.label = 1;
            objAuthenticatedJson$default = CloudRepository.authenticatedJson$default(cloudRepository, "/v2/account/archives", mapN, null, null, str, null, anonymousClass2, 44, null);
            z70 z70Var = z70.e;
            if (objAuthenticatedJson$default == z70Var) {
                return z70Var;
            }
        } else {
            if (i4 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i5 = anonymousClass2.I$0;
            ee0.J(objAuthenticatedJson$default);
            i2 = i5;
        }
        JSONObject jSONObject = (JSONObject) objAuthenticatedJson$default;
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        if (jSONArray.length() > 30) {
            b81.w("invalid_response");
            return null;
        }
        k41 k41VarF0 = mh0.f0(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(az.Y(k41VarF0, 10));
        Iterator it = k41VarF0.iterator();
        while (true) {
            j41 j41Var = (j41) it;
            if (!j41Var.g) {
                Object obj3 = obj2;
                ArchivePage archivePage = new ArchivePage(arrayList, jSONObject.getInt("page"), jSONObject.getInt("total"));
                if (archivePage.getPage() == i2 && (total = archivePage.getTotal()) >= 0 && total < 10001) {
                    return archivePage;
                }
                b81.w("invalid_response");
                return obj3;
            }
            JSONObject jSONObject2 = jSONArray.getJSONObject(j41Var.nextInt());
            JSONObject jSONObject3 = jSONObject2.getJSONObject("counts");
            String string = jSONObject2.getString("id");
            string.getClass();
            String strUuid = accountBenefitsRepository.uuid(string);
            long j = jSONObject2.getLong("revision");
            String string2 = jSONObject2.getString("deviceId");
            string2.getClass();
            String strUuid2 = accountBenefitsRepository.uuid(string2);
            long j2 = jSONObject2.getLong("createdAt");
            long j3 = jSONObject2.getLong("expiresAt");
            String string3 = jSONObject2.getString("reason");
            string3.getClass();
            Iterator<String> itKeys = jSONObject3.keys();
            itKeys.getClass();
            us2 us2VarN = xs2.N(itKeys);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj4 : (k50) us2VarN) {
                linkedHashMap.put(obj4, new Integer(jSONObject3.getInt((String) obj4)));
            }
            CloudArchive cloudArchive = new CloudArchive(strUuid, j, strUuid2, j2, j3, string3, linkedHashMap);
            if (cloudArchive.getRevision() < 0 || cloudArchive.getExpiresAt() <= cloudArchive.getCreatedAt()) {
                obj = obj2;
            } else {
                Map<String, Integer> counts = cloudArchive.getCounts();
                if (!counts.isEmpty()) {
                    for (Map.Entry<String, Integer> entry : counts.entrySet()) {
                        String key = entry.getKey();
                        int iIntValue = entry.getValue().intValue();
                        obj = obj2;
                        if (yo.H0(new String[]{"setting", "favorite", "location", "route", "collection"}).contains(key) && iIntValue >= 0 && iIntValue < 10001) {
                            obj2 = obj;
                        }
                    }
                }
                Object obj5 = obj2;
                arrayList.add(cloudArchive);
                accountBenefitsRepository = this;
                obj2 = obj5;
            }
            b81.w("invalid_response");
            return obj;
        }
    }

    public final boolean current(String str) {
        str.getClass();
        CloudAccountState value = this.cloud.getState().getValue();
        if (!value.getValidated()) {
            return false;
        }
        CloudAccount account = value.getAccount();
        return o51.f(account != null ? account.getId() : null, str) && !value.getAccount().isGuest();
    }

    public final StateFlow<CloudAccountState> getAccountState() {
        return this.accountState;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object preview(String str, String str2, String str3, q60 q60Var) throws JSONException, CloudException {
        C00061 c00061;
        if (q60Var instanceof C00061) {
            c00061 = (C00061) q60Var;
            int i = c00061.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00061.label = i - Integer.MIN_VALUE;
            } else {
                c00061 = new C00061(q60Var);
            }
        } else {
            c00061 = new C00061(q60Var);
        }
        C00061 c00062 = c00061;
        Object objAuthenticatedJson$default = c00062.result;
        int i2 = c00062.label;
        if (i2 == 0) {
            ee0.J(objAuthenticatedJson$default);
            if (!yo.H0(new String[]{"history", "trash"}).contains(str2)) {
                fo.i("Failed requirement.");
                return null;
            }
            uuid(str3);
            CloudRepository cloudRepository = this.cloud;
            String strJ = az2.j("/v2/account/archives/", str3);
            Map mapSingletonMap = Collections.singletonMap("kind", str2);
            mapSingletonMap.getClass();
            c00062.L$0 = null;
            c00062.L$1 = null;
            c00062.L$2 = null;
            c00062.label = 1;
            objAuthenticatedJson$default = CloudRepository.authenticatedJson$default(cloudRepository, strJ, mapSingletonMap, null, null, str, null, c00062, 44, null);
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
        JSONObject jSONObject = ((JSONObject) objAuthenticatedJson$default).getJSONObject("entries");
        if (jSONObject.length() > 10000) {
            b81.w("invalid_response");
            return null;
        }
        Iterator<String> itKeys = jSONObject.keys();
        itKeys.getClass();
        us2 us2VarN = xs2.N(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : (k50) us2VarN) {
            linkedHashMap.put(obj, jSONObject.getString((String) obj));
        }
        long length = 0;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            key.getClass();
            Charset charset = sw.a;
            byte[] bytes = ((String) key).getBytes(charset);
            bytes.getClass();
            long length2 = bytes.length;
            Object value = entry.getValue();
            value.getClass();
            byte[] bytes2 = ((String) value).getBytes(charset);
            bytes2.getClass();
            length += length2 + ((long) bytes2.length);
        }
        if (length <= 4000000) {
            return linkedHashMap;
        }
        b81.w("invalid_response");
        return null;
    }

    public final Object redeem(String str, String str2, String str3, String str4, q60 q60Var) throws CloudException {
        uuid(str4);
        if (yo.H0(new String[]{"search", "coupon"}).contains(str2)) {
            Object objAuthenticatedJson$default = CloudRepository.authenticatedJson$default(this.cloud, "/v2/account/rewards/redeem", null, new JSONObject().put("kind", str2).put("requestId", str4).put("deviceId", str3 == null ? JSONObject.NULL : str3), null, str, null, q60Var, 42, null);
            return objAuthenticatedJson$default == z70.e ? objAuthenticatedJson$default : mf3.a;
        }
        fo.i("Failed requirement.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object rewards(String str, q60 q60Var) {
        C00071 c00071;
        int monthlySearchCap;
        int monthlyCouponCap;
        if (q60Var instanceof C00071) {
            c00071 = (C00071) q60Var;
            int i = c00071.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00071.label = i - Integer.MIN_VALUE;
            } else {
                c00071 = new C00071(q60Var);
            }
        } else {
            c00071 = new C00071(q60Var);
        }
        C00071 c00072 = c00071;
        Object objAuthenticatedJson$default = c00072.result;
        int i2 = c00072.label;
        if (i2 == 0) {
            ee0.J(objAuthenticatedJson$default);
            CloudRepository cloudRepository = this.cloud;
            c00072.L$0 = null;
            c00072.label = 1;
            objAuthenticatedJson$default = CloudRepository.authenticatedJson$default(cloudRepository, "/v2/account/rewards", null, null, null, str, null, c00072, 46, null);
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
        JSONArray jSONArray = jSONObject.getJSONArray("devices");
        JSONArray jSONArray2 = jSONObject.getJSONArray("coupons");
        JSONArray jSONArray3 = jSONObject.getJSONArray("ledger");
        if (jSONArray.length() > 100 || jSONArray2.length() > 100 || jSONArray3.length() > 50) {
            b81.w("invalid_response");
            return null;
        }
        long j = jSONObject.getLong("availablePoints");
        long j2 = jSONObject.getLong("pendingPoints");
        int i3 = jSONObject.getInt("verifiedContributions");
        int i4 = jSONObject.getInt("bonusSearchRemaining");
        k41 k41VarF0 = mh0.f0(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(az.Y(k41VarF0, 10));
        Iterator it = k41VarF0.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(((j41) it).nextInt());
            String string = jSONObject2.getString("id");
            string.getClass();
            String strUuid = uuid(string);
            String string2 = jSONObject2.getString("name");
            string2.getClass();
            arrayList.add(new RewardDevice(strUuid, l13.B0(80, string2)));
        }
        k41 k41VarF1 = mh0.f0(0, jSONArray2.length());
        ArrayList arrayList2 = new ArrayList(az.Y(k41VarF1, 10));
        Iterator it2 = k41VarF1.iterator();
        while (it2.hasNext()) {
            JSONObject jSONObject3 = jSONArray2.getJSONObject(((j41) it2).nextInt());
            String string3 = jSONObject3.getString("id");
            string3.getClass();
            arrayList2.add(new RewardCoupon(uuid(string3), jSONObject3.getInt("amountCents"), jSONObject3.getInt("minimumCents"), jSONObject3.getLong("expiresAt")));
        }
        k41 k41VarF2 = mh0.f0(0, jSONArray3.length());
        ArrayList arrayList3 = new ArrayList(az.Y(k41VarF2, 10));
        Iterator it3 = k41VarF2.iterator();
        while (it3.hasNext()) {
            JSONObject jSONObject4 = jSONArray3.getJSONObject(((j41) it3).nextInt());
            String string4 = jSONObject4.getString("id");
            string4.getClass();
            String strUuid2 = uuid(string4);
            int i5 = jSONObject4.getInt("delta");
            String string5 = jSONObject4.getString("kind");
            string5.getClass();
            arrayList3.add(new RewardEntry(strUuid2, i5, string5, jSONObject4.getLong("createdAt")));
        }
        ContributionStatus contributionStatus = new ContributionStatus(j, j2, i3, i4, arrayList, arrayList2, arrayList3, jSONObject.getInt("monthlySearchCap"), jSONObject.getInt("monthlyCouponCap"));
        if (contributionStatus.getAvailablePoints() >= 0 && contributionStatus.getPendingPoints() >= 0 && contributionStatus.getVerifiedContributions() >= 0 && contributionStatus.getBonusSearchRemaining() >= 0 && (monthlySearchCap = contributionStatus.getMonthlySearchCap()) >= 0 && monthlySearchCap < 100001 && (monthlyCouponCap = contributionStatus.getMonthlyCouponCap()) >= 0 && monthlyCouponCap < 11) {
            return contributionStatus;
        }
        b81.w("invalid_response");
        return null;
    }
}
