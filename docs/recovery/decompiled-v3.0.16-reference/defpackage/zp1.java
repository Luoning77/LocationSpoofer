package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class zp1 implements pu0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ xu0 j;

    public /* synthetic */ zp1(String str, x01 x01Var, boolean z, boolean z2, au0 au0Var, int i) {
        this.f = str;
        this.g = x01Var;
        this.h = z;
        this.i = z2;
        this.j = au0Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Object obj3 = this.f;
        Object obj4 = this.g;
        xu0 xu0Var = this.j;
        switch (i) {
            case 0:
                au0 au0Var = (au0) xu0Var;
                x01 x01Var = (x01) obj4;
                String str = (String) obj3;
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    av1 av1Var = av1.a;
                    dv1 dv1VarE = iw2.e(av1Var, 1.0f);
                    vh2 vh2Var = new vh2(3);
                    boolean z = this.h;
                    boolean z2 = this.i;
                    dv1 dv1VarD = zm3.D(ks.b0(dv1VarE, z, z2, vh2Var, au0Var), 16.0f);
                    kk2 kk2VarA = jk2.a(new jo(12.0f, true, new fo(0)), j9.p, ov0Var, 54);
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
                    q73.h(ov0Var, v20.e, kk2VarA);
                    q73.h(ov0Var, v20.d, l72VarL);
                    q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode));
                    q73.g(ov0Var, v20.g);
                    q73.h(ov0Var, v20.c, dv1VarH);
                    t01.a(x01Var, null, iw2.k(av1Var, 24.0f), ((kz) ov0Var.j(mz.a)).a, ov0Var, 432, 0);
                    s83.b(str, new wb1(1.0f, true), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var.j(le3.a)).i, ov0Var, 0, 0, 131068);
                    ig0.c(z, null, z2, null, ov0Var, 48, 52);
                    ov0Var.p(true);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                ke0.i((String) obj3, (x01) obj4, this.h, this.i, (au0) xu0Var, (f30) obj, wc0.m0(1));
                break;
            default:
                ((Integer) obj2).getClass();
                wc0.p(this.h, (lu0) xu0Var, (dv1) obj4, (v33) obj3, this.i, (f30) obj, wc0.m0(1));
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ zp1(boolean z, lu0 lu0Var, dv1 dv1Var, v33 v33Var, boolean z2, int i) {
        this.h = z;
        this.j = lu0Var;
        this.g = dv1Var;
        this.f = v33Var;
        this.i = z2;
    }

    public /* synthetic */ zp1(boolean z, boolean z2, au0 au0Var, x01 x01Var, String str) {
        this.h = z;
        this.i = z2;
        this.j = au0Var;
        this.g = x01Var;
        this.f = str;
    }
}
