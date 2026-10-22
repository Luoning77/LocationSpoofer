package com.vincenthzr.locationspoofer.data.sharing;

import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import com.vincenthzr.locationspoofer.data.cloud.CloudException;
import com.vincenthzr.locationspoofer.data.cloud.CloudRepository;
import defpackage.b81;
import defpackage.ee0;
import defpackage.fo;
import defpackage.mf3;
import defpackage.q60;
import defpackage.r60;
import defpackage.s90;
import defpackage.z70;
import kotlinx.coroutines.flow.StateFlow;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class RadioSharingRepository implements RadioSharingSource {
    private final StateFlow<CloudAccountState> accountState;
    private final CloudRepository cloud;

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.sharing.RadioSharingRepository$status$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.sharing.RadioSharingRepository", f = "RadioSharingRepository.kt", l = {34}, m = "status")
    public static final class AnonymousClass1 extends r60 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RadioSharingRepository.this.status(null, this);
        }
    }

    public RadioSharingRepository(CloudRepository cloudRepository) {
        cloudRepository.getClass();
        this.cloud = cloudRepository;
        this.accountState = cloudRepository.getState();
    }

    @Override // com.vincenthzr.locationspoofer.data.sharing.RadioSharingSource
    public StateFlow<CloudAccountState> getAccountState() {
        return this.accountState;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.vincenthzr.locationspoofer.data.sharing.RadioSharingSource
    public Object status(String str, q60 q60Var) throws JSONException, CloudException {
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
            anonymousClass2.L$0 = null;
            anonymousClass2.label = 1;
            objAuthenticatedJson$default = CloudRepository.authenticatedJson$default(cloudRepository, "/v2/sharing/status", null, null, null, str, null, anonymousClass2, 46, null);
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
        JSONObject jSONObject2 = jSONObject.getJSONObject("counts");
        SharingCounts sharingCounts = new SharingCounts(jSONObject2.getLong("wifi"), jSONObject2.getLong("bluetooth"), jSONObject2.getLong("cells"));
        if (sharingCounts.getWifi() >= 0 && sharingCounts.getBluetooth() >= 0 && sharingCounts.getCells() >= 0) {
            return new SharingStatus(jSONObject.getBoolean("enabled"), jSONObject.getBoolean("canContribute"), sharingCounts);
        }
        b81.w("invalid_response");
        return null;
    }

    @Override // com.vincenthzr.locationspoofer.data.sharing.RadioSharingSource
    public Object upload(RadioContributionDraft radioContributionDraft, String str, q60 q60Var) {
        Object objAuthenticatedJson$default = CloudRepository.authenticatedJson$default(this.cloud, "/v2/sharing/contributions", null, radioContributionDraft.body(), null, str, null, q60Var, 42, null);
        return objAuthenticatedJson$default == z70.e ? objAuthenticatedJson$default : mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.sharing.RadioSharingSource
    public Object withdraw(String str, q60 q60Var) {
        Object objAuthenticatedJson$default = CloudRepository.authenticatedJson$default(this.cloud, "/v2/sharing/contributions", null, null, "DELETE", str, null, q60Var, 38, null);
        return objAuthenticatedJson$default == z70.e ? objAuthenticatedJson$default : mf3.a;
    }
}
