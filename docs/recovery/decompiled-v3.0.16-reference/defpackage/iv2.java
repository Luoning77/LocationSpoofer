package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudAccount;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import com.vincenthzr.locationspoofer.data.sharing.SharingUiState;
import com.vincenthzr.locationspoofer.data.sync.SyncSelection;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class iv2 implements qu0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ long f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ iv2(long j, SyncSelection syncSelection, tt2 tt2Var) {
        this.f = j;
        this.g = syncSelection;
        this.h = tt2Var;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0154  */
    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        long j;
        CloudAccount account;
        int i2 = this.e;
        mf3 mf3Var = mf3.a;
        Object obj4 = this.h;
        Object obj5 = this.g;
        switch (i2) {
            case 0:
                CloudAccountState cloudAccountState = (CloudAccountState) obj5;
                s03 s03Var = (s03) obj4;
                f30 f30Var = (f30) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((bc1) obj).getClass();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ov0Var.W();
                } else {
                    if (!cloudAccountState.getValidated() || (account = cloudAccountState.getAccount()) == null || account.isGuest()) {
                        i = 2131625001;
                    } else if (((SharingUiState) s03Var.getValue()).getLoading()) {
                        i = 2131625000;
                    } else if (o51.f(((SharingUiState) s03Var.getValue()).getError(), "sharing_save_failed")) {
                        i = 2131625005;
                    } else if (o51.f(((SharingUiState) s03Var.getValue()).getError(), "wifi_upload_limit") || o51.f(((SharingUiState) s03Var.getValue()).getError(), "rate_limited")) {
                        i = 2131624999;
                    } else if (o51.f(((SharingUiState) s03Var.getValue()).getError(), "registered_account_required") || o51.f(((SharingUiState) s03Var.getValue()).getError(), "primary_device_required")) {
                        i = 2131625008;
                    } else if (o51.f(((SharingUiState) s03Var.getValue()).getError(), "subscription_required")) {
                        i = 2131625002;
                    } else if (((SharingUiState) s03Var.getValue()).getError() != null) {
                        i = 2131624994;
                    } else if (!((SharingUiState) s03Var.getValue()).getAvailable()) {
                        i = 2131625009;
                    } else if (!((SharingUiState) s03Var.getValue()).getEligible()) {
                        i = 2131625008;
                    } else if (((SharingUiState) s03Var.getValue()).getUploading()) {
                        i = 2131625010;
                    } else {
                        i = ((SharingUiState) s03Var.getValue()).getEnabled() ? 2131624998 : 2131624996;
                    }
                    String strN = ke0.N(i, ov0Var);
                    q93 q93Var = ((je3) ov0Var.j(le3.a)).l;
                    if (((SharingUiState) s03Var.getValue()).getError() != null) {
                        ov0Var.c0(-929141164);
                        j = ((kz) ov0Var.j(mz.a)).w;
                        ov0Var.p(false);
                    } else {
                        ov0Var.c0(-929140808);
                        ov0Var.p(false);
                        j = this.f;
                    }
                    s83.b(strN, null, j, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, q93Var, ov0Var, 0, 0, 131066);
                }
                break;
            default:
                SyncSelection syncSelection = (SyncSelection) obj5;
                tt2 tt2Var = (tt2) obj4;
                f30 f30Var2 = (f30) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((bc1) obj).getClass();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ov0Var2.W();
                } else {
                    sb.C(null, null, ym3.t(this.f, 0L, ov0Var2, 0, 14), null, sb.a0(-1689460417, new bu(11, syncSelection, tt2Var), ov0Var2), ov0Var2, 196608, 27);
                }
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ iv2(CloudAccountState cloudAccountState, long j, s03 s03Var) {
        this.g = cloudAccountState;
        this.f = j;
        this.h = s03Var;
    }
}
