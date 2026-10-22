package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class er2 {
    public static final z92 l = new z92(2, new xm2(25), new ym2(13));
    public boolean a;
    public final ArrayList b = new ArrayList();
    public final lx1 c;
    public final AtomicLong d;
    public dq2 e;
    public oe f;
    public yq2 g;
    public bq2 h;
    public dq2 i;
    public dq2 j;
    public final w52 k;

    public er2(long j) {
        lx1 lx1Var = nj1.a;
        this.c = new lx1();
        this.d = new AtomicLong(j);
        lx1 lx1Var2 = nj1.a;
        lx1Var2.getClass();
        this.k = ke0.H(lx1Var2);
    }

    public final lx1 a() {
        return (lx1) this.k.getValue();
    }

    public final boolean b(pa1 pa1Var, long j, long j2, yp2 yp2Var, boolean z) {
        yq2 yq2Var = this.g;
        if (yq2Var == null) {
            return true;
        }
        ar2 ar2Var = yq2Var.e;
        long jA = ar2Var.a(pa1Var, j);
        long jA2 = ar2Var.a(pa1Var, j2);
        ar2Var.k(z);
        return ar2Var.n(jA, jA2, false, yp2Var);
    }

    public final ArrayList c(pa1 pa1Var) {
        boolean z = this.a;
        ArrayList arrayList = this.b;
        if (!z) {
            ez.Z(arrayList, new q00(new s5(pa1Var, 28), 1));
            this.a = true;
        }
        return arrayList;
    }

    public final void d(bx1 bx1Var) {
        long j = bx1Var.a;
        lx1 lx1Var = this.c;
        if (lx1Var.b(j)) {
            this.b.remove(bx1Var);
            lx1Var.g(j);
            dq2 dq2Var = this.j;
            if (dq2Var != null) {
                dq2Var.invoke(Long.valueOf(j));
            }
        }
    }
}
