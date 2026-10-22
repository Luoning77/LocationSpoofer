package defpackage;

import com.vincenthzr.locationspoofer.data.model.AppState;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class cj1 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ AppState f;
    public final /* synthetic */ ey1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cj1(AppState appState, ey1 ey1Var, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.f = appState;
        this.g = ey1Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        ey1 ey1Var = this.g;
        AppState appState = this.f;
        switch (i) {
            case 0:
                return new cj1(appState, ey1Var, q60Var, 0);
            case 1:
                return new cj1(appState, ey1Var, q60Var, 1);
            default:
                return new cj1(appState, ey1Var, q60Var, 2);
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        q60 q60Var = (q60) obj2;
        switch (i) {
            case 0:
                ((cj1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
            case 1:
                ((cj1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
            default:
                ((cj1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
        }
        return mf3Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        AppState appState = this.f;
        ey1 ey1Var = this.g;
        switch (i) {
            case 0:
                ee0.J(obj);
                if (appState.isSpoofingActive()) {
                    ey1Var.setValue(mi1.e);
                }
                break;
            case 1:
                ee0.J(obj);
                lr2 lr2Var = (lr2) ey1Var.getValue();
                if (lr2Var != null) {
                    lr2Var.l(appState.getMapType());
                }
                break;
            default:
                ee0.J(obj);
                lr2 lr2Var2 = (lr2) ey1Var.getValue();
                if (lr2Var2 != null) {
                    lr2Var2.l(appState.getMapType());
                }
                break;
        }
        return mf3Var;
    }
}
