package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class q43 extends q31 {
    public lu0 v;
    public ul3 w;

    @Override // defpackage.l31, defpackage.cv1
    public final void e1() {
        View viewN = xq1.N(this);
        WeakHashMap weakHashMap = ul3.w;
        ul3 ul3VarE = q73.e(viewN);
        ul3VarE.a(viewN);
        sk3 sk3Var = (sk3) this.v.invoke(ul3VarE);
        if (!o51.f(sk3Var, this.u)) {
            this.u = sk3Var;
            n1();
        }
        this.w = ul3VarE;
        super.e1();
    }

    @Override // defpackage.l31, defpackage.cv1
    public final void f1() {
        View viewN = xq1.N(this);
        ul3 ul3Var = this.w;
        if (ul3Var != null) {
            int i = ul3Var.u - 1;
            ul3Var.u = i;
            if (i == 0) {
                WeakHashMap weakHashMap = yi3.a;
                ri3.h(viewN, null);
                al3.a(viewN, null);
                viewN.removeOnAttachStateChangeListener(ul3Var.v);
            }
        }
        super.f1();
    }
}
