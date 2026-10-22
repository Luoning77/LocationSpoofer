package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class vw implements pu0 {
    public final /* synthetic */ int e = 2;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ vw(ex2 ex2Var, dv1 dv1Var, boolean z, mw2 mw2Var, ix1 ix1Var, p10 p10Var, p10 p10Var2, int i) {
        this.h = ex2Var;
        this.l = dv1Var;
        this.f = z;
        this.i = mw2Var;
        this.j = ix1Var;
        this.k = p10Var;
        this.m = p10Var2;
        this.g = i;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00e1  */
    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.e;
        int i2 = this.g;
        mf3 mf3Var = mf3.a;
        Object obj3 = this.m;
        Object obj4 = this.k;
        Object obj5 = this.j;
        Object obj6 = this.i;
        Object obj7 = this.l;
        Object obj8 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ym3.n((xa3) obj8, (au0) obj6, (t13) obj5, (t13) obj4, (dv1) obj7, this.f, (uw) obj3, (f30) obj, wc0.m0(i2 | 1));
                break;
            case 1:
                x73 x73Var = (x73) obj8;
                me1 me1Var = (me1) obj6;
                lu0 lu0Var = (lu0) obj5;
                f83 f83Var = (f83) obj4;
                e12 e12Var = (e12) obj7;
                xb0 xb0Var = (xb0) obj3;
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    l70 l70Var = new l70(me1Var, lu0Var, f83Var, e12Var, xb0Var, this.g);
                    int iHashCode = Long.hashCode(ov0Var.T);
                    l72 l72VarL = ov0Var.l();
                    dv1 dv1VarH = xp1.H(ov0Var, av1.a);
                    w20.b.getClass();
                    x30 x30Var = v20.b;
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, v20.e, l70Var);
                    q73.h(ov0Var, v20.d, l72VarL);
                    q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode));
                    q73.g(ov0Var, v20.g);
                    q73.h(ov0Var, v20.c, dv1VarH);
                    ov0Var.p(true);
                    dx0 dx0VarA = me1Var.a();
                    dx0 dx0Var = dx0.e;
                    boolean z2 = this.f;
                    if (dx0VarA != dx0Var && me1Var.c() != null) {
                        pa1 pa1VarC = me1Var.c();
                        pa1VarC.getClass();
                        z = pa1VarC.U() && z2;
                    }
                    k22.h(x73Var, z, ov0Var, 0);
                    if (me1Var.a() == dx0.g && z2) {
                        ov0Var.c0(-714666198);
                        k22.i(x73Var, ov0Var, 0);
                        ov0Var.p(false);
                    } else {
                        ov0Var.c0(-714589318);
                        ov0Var.p(false);
                    }
                }
                break;
            default:
                ((Integer) obj2).getClass();
                dx2.c((ex2) obj8, (dv1) obj7, this.f, (mw2) obj6, (ix1) obj5, (p10) obj4, (p10) obj3, (f30) obj, wc0.m0(i2 | 1));
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ vw(x73 x73Var, me1 me1Var, boolean z, lu0 lu0Var, f83 f83Var, e12 e12Var, xb0 xb0Var, int i) {
        this.h = x73Var;
        this.i = me1Var;
        this.f = z;
        this.j = lu0Var;
        this.k = f83Var;
        this.l = e12Var;
        this.m = xb0Var;
        this.g = i;
    }

    public /* synthetic */ vw(xa3 xa3Var, au0 au0Var, t13 t13Var, t13 t13Var2, dv1 dv1Var, boolean z, uw uwVar, int i) {
        this.h = xa3Var;
        this.i = au0Var;
        this.j = t13Var;
        this.k = t13Var2;
        this.l = dv1Var;
        this.f = z;
        this.m = uwVar;
        this.g = i;
    }
}
