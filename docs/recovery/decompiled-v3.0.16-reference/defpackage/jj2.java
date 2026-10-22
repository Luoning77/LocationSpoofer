package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class jj2 implements pu0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ x01 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ boolean i;

    public /* synthetic */ jj2(x01 x01Var, String str, String str2, boolean z, int i) {
        this.f = x01Var;
        this.g = str;
        this.h = str2;
        this.i = z;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        long jC;
        long j;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    dv1 dv1VarD = zm3.D(iw2.c, 10.0f);
                    yz yzVarA = wz.a(am1.h, j9.r, ov0Var, 6);
                    int iHashCode = Long.hashCode(ov0Var.T);
                    l72 l72VarL = ov0Var.l();
                    dv1 dv1VarH = xp1.H(ov0Var, dv1VarD);
                    w20.b.getClass();
                    x30 x30Var = v20.b;
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, v20.e, yzVarA);
                    q73.h(ov0Var, v20.d, l72VarL);
                    q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode));
                    q73.g(ov0Var, v20.g);
                    q73.h(ov0Var, v20.c, dv1VarH);
                    boolean z = this.i;
                    if (z) {
                        ov0Var.c0(-1908054406);
                        ov0Var.p(false);
                        jC = bk.g;
                    } else {
                        ov0Var.c0(-1908052696);
                        jC = hz.c(0.6f, ((kz) ov0Var.j(mz.a)).q);
                        ov0Var.p(false);
                    }
                    long j2 = jC;
                    av1 av1Var = av1.a;
                    t01.a(this.f, null, iw2.k(av1Var, 22.0f), j2, ov0Var, 432, 0);
                    gh0.h(ov0Var, iw2.g(av1Var, 4.0f));
                    long jC2 = v63.c(13);
                    jr0 jr0Var = z ? jr0.j : jr0.h;
                    if (z) {
                        ov0Var.c0(-1908041158);
                        ov0Var.p(false);
                        j = bk.g;
                    } else {
                        ov0Var.c0(-1908039815);
                        long j3 = ((kz) ov0Var.j(mz.a)).q;
                        ov0Var.p(false);
                        j = j3;
                    }
                    s83.b(this.g, null, j, jC2, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 24576, 0, 262058);
                    s83.b(this.h, null, hz.c(0.5f, ((kz) ov0Var.j(mz.a)).q), v63.b(10.5d), null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ov0Var, 24576, 24576, 245738);
                    ov0Var.p(true);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                xq1.i(this.f, this.g, this.h, this.i, (f30) obj, wc0.m0(1));
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ jj2(boolean z, x01 x01Var, String str, String str2) {
        this.i = z;
        this.f = x01Var;
        this.g = str;
        this.h = str2;
    }
}
