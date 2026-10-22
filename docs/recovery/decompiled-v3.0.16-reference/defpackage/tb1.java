package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class tb1 implements e23 {
    public final hx1 a;
    public final /* synthetic */ vb1 b;
    public final /* synthetic */ Object c;

    public tb1(vb1 vb1Var, Object obj) {
        this.b = vb1Var;
        this.c = obj;
        int[] iArr = o41.a;
        this.a = new hx1();
    }

    @Override // defpackage.e23
    public final int a() {
        hb1 hb1Var = (hb1) this.b.n.g(this.c);
        if (hb1Var != null) {
            return ((gy1) ((qx1) hb1Var.n()).f).g;
        }
        return 0;
    }

    @Override // defpackage.e23
    public final void b(gm1 gm1Var) {
        tz1 tz1Var;
        hb1 hb1Var = (hb1) this.b.n.g(this.c);
        cv1 cv1Var = (hb1Var == null || (tz1Var = hb1Var.K) == null) ? null : tz1Var.f;
        if (cv1Var == null || !cv1Var.r) {
            return;
        }
        q73.k(cv1Var, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", gm1Var);
    }

    @Override // defpackage.e23
    public final void c(int i, long j) {
        vb1 vb1Var = this.b;
        hb1 hb1Var = (hb1) vb1Var.n.g(this.c);
        if (hb1Var == null || !hb1Var.G()) {
            return;
        }
        int i2 = ((gy1) ((qx1) hb1Var.n()).f).g;
        if (i < 0 || i >= i2) {
            p21.e("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (hb1Var.H()) {
            p21.a("Pre-measure called on node that is not placed");
        }
        hb1 hb1Var2 = vb1Var.e;
        hb1Var2.v = true;
        ((db) kb1.a(hb1Var)).s((hb1) ((qx1) hb1Var.n()).get(i), j);
        hb1Var2.v = false;
        this.a.a(i);
    }

    @Override // defpackage.e23
    public final void dispose() {
        this.b.e(this.c);
    }
}
