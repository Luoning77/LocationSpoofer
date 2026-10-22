package defpackage;

import com.vincenthzr.locationspoofer.data.model.AppState;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ll1 extends k33 implements pu0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ AppState f;
    public final /* synthetic */ t52 g;
    public final /* synthetic */ ey1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll1(AppState appState, ey1 ey1Var, t52 t52Var, q60 q60Var) {
        super(2, q60Var);
        this.f = appState;
        this.h = ey1Var;
        this.g = t52Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        ey1 ey1Var = this.h;
        t52 t52Var = this.g;
        AppState appState = this.f;
        switch (i) {
            case 0:
                return new ll1(appState, ey1Var, t52Var, q60Var);
            default:
                return new ll1(appState, t52Var, ey1Var, q60Var);
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
                ((ll1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
            default:
                ((ll1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
        }
        return mf3Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        AppState appState = this.f;
        t52 t52Var = this.g;
        ey1 ey1Var = this.h;
        switch (i) {
            case 0:
                ee0.J(obj);
                lr2 lr2Var = (lr2) ey1Var.getValue();
                if (lr2Var != null) {
                    boolean z = (t52Var.g() == js.Location.ordinal() && appState.isSpoofingActive()) ? false : true;
                    if (!lr2Var.i) {
                        jf3 jf3Var = lr2Var.a.b;
                        jf3Var.n = z;
                        jf3Var.k = z;
                        jf3Var.m = z;
                        jf3Var.p = z;
                        jf3Var.q = z;
                        jf3Var.l = false;
                    }
                }
                break;
            default:
                ee0.J(obj);
                if (t52Var.g() == 0) {
                    lr2 lr2Var2 = (lr2) ey1Var.getValue();
                    if (lr2Var2 != null) {
                        lr2Var2.f();
                    }
                    lr2 lr2Var3 = (lr2) ey1Var.getValue();
                    if (lr2Var3 != null) {
                        lr2Var3.l(appState.getMapType());
                    }
                }
                break;
        }
        return mf3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll1(AppState appState, t52 t52Var, ey1 ey1Var, q60 q60Var) {
        super(2, q60Var);
        this.f = appState;
        this.g = t52Var;
        this.h = ey1Var;
    }
}
