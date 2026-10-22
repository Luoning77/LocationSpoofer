package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ef extends aa1 implements lu0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ya2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ef(ya2 ya2Var, int i) {
        super(1);
        this.f = i;
        this.g = ya2Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.f;
        mf3 mf3Var = mf3.a;
        ya2 ya2Var = this.g;
        switch (i) {
            case 0:
                pa1 pa1VarB = ((pa1) obj).B();
                pa1VarB.getClass();
                ya2Var.q(pa1VarB);
                break;
            case 1:
                p41 p41Var = (p41) obj;
                long j = p41Var.a;
                ya2Var.m107setPopupContentSizefhxjrPA(p41Var);
                ya2Var.r();
                break;
            default:
                au0 au0Var = (au0) obj;
                Handler handler = ya2Var.getHandler();
                if ((handler != null ? handler.getLooper() : null) != Looper.myLooper()) {
                    Handler handler2 = ya2Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new ma(5, au0Var));
                    }
                } else {
                    au0Var.invoke();
                }
                break;
        }
        return mf3Var;
    }
}
