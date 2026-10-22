package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.az;
import defpackage.az2;
import defpackage.b81;
import defpackage.ee0;
import defpackage.fo;
import defpackage.j41;
import defpackage.k41;
import defpackage.mf3;
import defpackage.mh0;
import defpackage.q60;
import defpackage.r60;
import defpackage.s90;
import defpackage.z70;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.coroutines.flow.StateFlow;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CommunityWifiRepository {
    private final StateFlow<CloudAccountState> accountState;
    private final CloudRepository cloud;

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.cloud.CommunityWifiRepository$nearby$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.cloud.CommunityWifiRepository", f = "CommunityWifiRepository.kt", l = {45}, m = "nearby")
    public static final class AnonymousClass1 extends r60 {
        double D$0;
        double D$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommunityWifiRepository.this.nearby(0.0d, 0.0d, this);
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.cloud.CommunityWifiRepository$status$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.cloud.CommunityWifiRepository", f = "CommunityWifiRepository.kt", l = {27}, m = "status")
    public static final class C00601 extends r60 {
        int label;
        /* synthetic */ Object result;

        public C00601(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommunityWifiRepository.this.status(this);
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.cloud.CommunityWifiRepository$upload$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.cloud.CommunityWifiRepository", f = "CommunityWifiRepository.kt", l = {37}, m = "upload")
    public static final class C00611 extends r60 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C00611(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommunityWifiRepository.this.upload(null, null, this);
        }
    }

    public CommunityWifiRepository(CloudRepository cloudRepository) {
        cloudRepository.getClass();
        this.cloud = cloudRepository;
        this.accountState = cloudRepository.getState();
    }

    public final StateFlow<CloudAccountState> getAccountState() {
        return this.accountState;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object nearby(double d, double d2, q60 q60Var) throws JSONException, CloudException {
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
            if (Math.abs(d) > Double.MAX_VALUE || Math.abs(d2) > Double.MAX_VALUE || -90.0d > d || d > 90.0d || -180.0d > d2 || d2 > 180.0d) {
                b81.w("invalid_coordinates");
                return null;
            }
            CloudRepository cloudRepository = this.cloud;
            JSONObject jSONObjectPut = new JSONObject().put("lat", d).put("lng", d2);
            anonymousClass2.D$0 = d;
            anonymousClass2.D$1 = d2;
            anonymousClass2.label = 1;
            objAuthenticatedJson$default = CloudRepository.authenticatedJson$default(cloudRepository, "/v2/wifi/nearby", null, jSONObjectPut, null, null, null, anonymousClass2, 58, null);
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
        JSONArray jSONArray = ((JSONObject) objAuthenticatedJson$default).getJSONArray("result");
        if (jSONArray.length() > 10) {
            b81.w("invalid_response");
            return null;
        }
        String string = jSONArray.toString();
        string.getClass();
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object status(q60 q60Var) throws JSONException, CloudException {
        C00601 c00601;
        if (q60Var instanceof C00601) {
            c00601 = (C00601) q60Var;
            int i = c00601.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00601.label = i - Integer.MIN_VALUE;
            } else {
                c00601 = new C00601(q60Var);
            }
        } else {
            c00601 = new C00601(q60Var);
        }
        C00601 c00602 = c00601;
        Object objAuthenticatedJson$default = c00602.result;
        int i2 = c00602.label;
        if (i2 == 0) {
            ee0.J(objAuthenticatedJson$default);
            CloudRepository cloudRepository = this.cloud;
            c00602.label = 1;
            objAuthenticatedJson$default = CloudRepository.authenticatedJson$default(cloudRepository, "/v2/wifi/status", null, null, null, null, null, c00602, 62, null);
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
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("historicalSources");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        if (jSONArrayOptJSONArray.length() > 10) {
            b81.w("invalid_response");
            return null;
        }
        k41 k41VarF0 = mh0.f0(0, jSONArrayOptJSONArray.length());
        ArrayList arrayList = new ArrayList(az.Y(k41VarF0, 10));
        Iterator it = k41VarF0.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(((j41) it).nextInt());
            String string = jSONObject2.getString("sourceId");
            String strM = az2.m(string, jSONObject2, "attribution");
            String string2 = jSONObject2.getString("licenseUrl");
            string2.getClass();
            arrayList.add(new WifiDatasetAttribution(string, strM, string2));
        }
        return new CommunityWifiStatus(jSONObject.getBoolean("enabled"), jSONObject.getBoolean("subscribed"), jSONObject.getBoolean("canContribute"), jSONObject.getLong("hotspots"), arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object upload(WifiContributionDraft wifiContributionDraft, String str, q60 q60Var) throws JSONException {
        C00611 c00611;
        if (q60Var instanceof C00611) {
            c00611 = (C00611) q60Var;
            int i = c00611.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00611.label = i - Integer.MIN_VALUE;
            } else {
                c00611 = new C00611(q60Var);
            }
        } else {
            c00611 = new C00611(q60Var);
        }
        C00611 c00612 = c00611;
        Object objAuthenticatedJson$default = c00612.result;
        int i2 = c00612.label;
        if (i2 == 0) {
            ee0.J(objAuthenticatedJson$default);
            CloudRepository cloudRepository = this.cloud;
            JSONObject jSONObjectBody = wifiContributionDraft.body();
            c00612.L$0 = null;
            c00612.L$1 = null;
            c00612.label = 1;
            objAuthenticatedJson$default = CloudRepository.authenticatedJson$default(cloudRepository, "/v2/wifi/contributions", null, jSONObjectBody, null, str, null, c00612, 42, null);
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
        return new WifiContributionReceipt(jSONObject.getInt("accepted"), jSONObject.getInt("ignored"), jSONObject.getBoolean("duplicate"));
    }

    public final Object withdraw(String str, q60 q60Var) {
        Object objAuthenticatedJson$default = CloudRepository.authenticatedJson$default(this.cloud, "/v2/wifi/contributions", null, null, "DELETE", str, null, q60Var, 38, null);
        return objAuthenticatedJson$default == z70.e ? objAuthenticatedJson$default : mf3.a;
    }
}
