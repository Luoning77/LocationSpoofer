package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudAccount;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import com.vincenthzr.locationspoofer.data.cloud.CloudRuntimeBinding;
import com.vincenthzr.locationspoofer.data.model.AppState;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ql1 implements FlowCollector {
    public final /* synthetic */ int e;
    public final /* synthetic */ FlowCollector f;

    public /* synthetic */ ql1(FlowCollector flowCollector, int i) {
        this.e = i;
        this.f = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, q60 q60Var) {
        pl1 pl1Var;
        en1 en1Var;
        zr1 zr1Var;
        rg3 rg3Var;
        CloudAccount account;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        FlowCollector flowCollector = this.f;
        z70 z70Var = z70.e;
        String id = null;
        switch (i) {
            case 0:
                if (q60Var instanceof pl1) {
                    pl1Var = (pl1) q60Var;
                    int i2 = pl1Var.f;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        pl1Var.f = i2 - Integer.MIN_VALUE;
                    } else {
                        pl1Var = new pl1(this, q60Var);
                    }
                } else {
                    pl1Var = new pl1(this, q60Var);
                }
                Object obj2 = pl1Var.e;
                int i3 = pl1Var.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ee0.J(obj2);
                        return mf3Var;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj2);
                CloudAccountState cloudAccountState = (CloudAccountState) obj;
                CloudAccount account2 = cloudAccountState.getAccount();
                i52 i52Var = new i52((!cloudAccountState.getValidated() || account2 == null) ? null : new CloudRuntimeBinding(account2.getId(), cloudAccountState.getDeviceId(), cloudAccountState.getPublicKeyFingerprint(), account2.getSessionId()), account2 != null ? account2.getPlan() : null);
                pl1Var.f = 1;
                return flowCollector.emit(i52Var, pl1Var) == z70Var ? z70Var : mf3Var;
            case 1:
                if (q60Var instanceof en1) {
                    en1Var = (en1) q60Var;
                    int i4 = en1Var.f;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        en1Var.f = i4 - Integer.MIN_VALUE;
                    } else {
                        en1Var = new en1(this, q60Var);
                    }
                } else {
                    en1Var = new en1(this, q60Var);
                }
                Object obj3 = en1Var.e;
                int i5 = en1Var.f;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ee0.J(obj3);
                        return mf3Var;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj3);
                AppState appState = (AppState) obj;
                i52 i52Var2 = new i52(appState.getLatitudeInput(), appState.getLongitudeInput());
                en1Var.f = 1;
                return flowCollector.emit(i52Var2, en1Var) == z70Var ? z70Var : mf3Var;
            case 2:
                if (q60Var instanceof zr1) {
                    zr1Var = (zr1) q60Var;
                    int i6 = zr1Var.f;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        zr1Var.f = i6 - Integer.MIN_VALUE;
                    } else {
                        zr1Var = new zr1(this, q60Var);
                    }
                } else {
                    zr1Var = new zr1(this, q60Var);
                }
                Object obj4 = zr1Var.e;
                int i7 = zr1Var.f;
                if (i7 != 0) {
                    if (i7 == 1) {
                        ee0.J(obj4);
                        return mf3Var;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj4);
                CloudAccount account3 = ((CloudAccountState) obj).getAccount();
                id = account3 != null ? account3.getId() : null;
                zr1Var.f = 1;
                return flowCollector.emit(id, zr1Var) == z70Var ? z70Var : mf3Var;
            default:
                if (q60Var instanceof rg3) {
                    rg3Var = (rg3) q60Var;
                    int i8 = rg3Var.f;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        rg3Var.f = i8 - Integer.MIN_VALUE;
                    } else {
                        rg3Var = new rg3(this, q60Var);
                    }
                } else {
                    rg3Var = new rg3(this, q60Var);
                }
                Object obj5 = rg3Var.e;
                int i9 = rg3Var.f;
                if (i9 != 0) {
                    if (i9 == 1) {
                        ee0.J(obj5);
                        return mf3Var;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj5);
                CloudAccountState cloudAccountState2 = (CloudAccountState) obj;
                if (cloudAccountState2.getValidated() && (account = cloudAccountState2.getAccount()) != null) {
                    id = account.getId();
                }
                rg3Var.f = 1;
                return flowCollector.emit(id, rg3Var) == z70Var ? z70Var : mf3Var;
        }
    }
}
