package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class zk1 implements pu0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ xu0 j;
    public final /* synthetic */ Object k;

    public /* synthetic */ zk1(ml1 ml1Var, t52 t52Var, lu0 lu0Var, ja1 ja1Var, int i, boolean z) {
        this.h = ml1Var;
        this.i = t52Var;
        this.j = lu0Var;
        this.k = ja1Var;
        this.g = i;
        this.f = z;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Object obj3 = this.k;
        xu0 xu0Var = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        switch (i) {
            case 0:
                ml1 ml1Var = (ml1) obj5;
                final t52 t52Var = (t52) obj4;
                final lu0 lu0Var = (lu0) xu0Var;
                final ja1 ja1Var = (ja1) obj3;
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    boolean z = ml1Var == ml1.e;
                    pk0 pk0VarA = kk0.d(o51.I(180, 6, null), 2).a(kk0.c(o51.I(180, 6, null), 14));
                    lm0 lm0VarA = kk0.e(o51.I(140, 6, null), 2).a(kk0.h(o51.I(140, 6, null), 14));
                    final int i2 = this.g;
                    final boolean z2 = this.f;
                    da0.d(z, null, pk0VarA, lm0VarA, null, sb.a0(521259122, new qu0() { // from class: bl1
                        @Override // defpackage.qu0
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            f30 f30Var2 = (f30) obj7;
                            ((Integer) obj8).getClass();
                            ((mi) obj6).getClass();
                            dv1 dv1VarG = zm3.G(ji2.J(iw2.e(av1.a, 1.0f)), 0.0f, 0.0f, 0.0f, 14.0f, 7);
                            er1 er1VarC = ws.c(j9.m, false);
                            ov0 ov0Var2 = (ov0) f30Var2;
                            int iHashCode = Long.hashCode(ov0Var2.T);
                            l72 l72VarL = ov0Var2.l();
                            dv1 dv1VarH = xp1.H(f30Var2, dv1VarG);
                            w20.b.getClass();
                            x30 x30Var = v20.b;
                            ov0 ov0Var3 = (ov0) f30Var2;
                            ov0Var3.g0();
                            if (ov0Var3.S) {
                                ov0Var3.k(x30Var);
                            } else {
                                ov0Var3.p0();
                            }
                            q73.h(f30Var2, v20.e, er1VarC);
                            q73.h(f30Var2, v20.d, l72VarL);
                            q73.h(f30Var2, v20.f, Integer.valueOf(iHashCode));
                            q73.g(f30Var2, v20.g);
                            q73.h(f30Var2, v20.c, dv1VarH);
                            t52 t52Var2 = t52Var;
                            boolean zF = ov0Var3.f(t52Var2);
                            Object objQ = ov0Var3.Q();
                            if (zF || objQ == d30.a) {
                                objQ = new id(t52Var2, 2);
                                ov0Var3.m0(objQ);
                            }
                            lu0 lu0Var2 = lu0Var;
                            nd.a(null, (au0) objQ, lu0Var2, ja1Var, i2, false, sb.a0(144772487, new gl1(lu0Var2, t52Var2, z2), f30Var2), f30Var2, 12582912);
                            ov0Var3.p(true);
                            return mf3.a;
                        }
                    }, ov0Var), ov0Var, 200064, 18);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                mc0.e((String) obj5, (String) obj4, this.f, (au0) xu0Var, (au0) obj3, (f30) obj, wc0.m0(this.g | 1));
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ zk1(String str, String str2, boolean z, au0 au0Var, au0 au0Var2, int i) {
        this.h = str;
        this.i = str2;
        this.f = z;
        this.j = au0Var;
        this.k = au0Var2;
        this.g = i;
    }
}
