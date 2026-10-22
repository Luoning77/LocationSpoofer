package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class rb1 extends eb1 {
    public final /* synthetic */ vb1 b;
    public final /* synthetic */ pu0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb1(vb1 vb1Var, pu0 pu0Var, String str) {
        super(str);
        this.b = vb1Var;
        this.c = pu0Var;
    }

    @Override // defpackage.er1
    public final fr1 g(gr1 gr1Var, List list, long j) {
        vb1 vb1Var = this.b;
        pb1 pb1Var = vb1Var.l;
        pb1Var.e = gr1Var.getLayoutDirection();
        pb1Var.f = gr1Var.g();
        pb1Var.g = gr1Var.D();
        boolean zJ = gr1Var.J();
        pu0 pu0Var = this.c;
        if (zJ || vb1Var.e.m == null) {
            vb1Var.h = 0;
            fr1 fr1Var = (fr1) pu0Var.invoke(pb1Var, new l50(j));
            return new qb1(fr1Var, vb1Var, vb1Var.h, fr1Var, 1);
        }
        vb1Var.i = 0;
        fr1 fr1Var2 = (fr1) pu0Var.invoke(vb1Var.m, new l50(j));
        return new qb1(fr1Var2, vb1Var, vb1Var.i, fr1Var2, 0);
    }
}
