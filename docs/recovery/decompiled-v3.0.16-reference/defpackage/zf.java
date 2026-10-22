package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class zf implements qu0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ au0 g;

    public /* synthetic */ zf(au0 au0Var, boolean z) {
        this.g = au0Var;
        this.f = z;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        final au0 au0Var = this.g;
        final boolean z = this.f;
        switch (i) {
            case 0:
                dv1 dv1Var = (dv1) obj;
                ((Integer) obj3).getClass();
                ov0 ov0Var = (ov0) ((f30) obj2);
                ov0Var.c0(-196777734);
                final long j = ((i93) ov0Var.j(j93.a)).a;
                boolean zE = ov0Var.e(j) | ov0Var.f(au0Var) | ov0Var.g(z);
                Object objQ = ov0Var.Q();
                if (zE || objQ == d30.a) {
                    objQ = new lu0() { // from class: ag
                        @Override // defpackage.lu0
                        public final Object invoke(Object obj4) {
                            xu xuVar = (xu) obj4;
                            return xuVar.c(new sf(0, au0Var, ji2.C(xuVar, Float.intBitsToFloat((int) (xuVar.e.a() >> 32)) / 2.0f), new rr(5, j), z));
                        }
                    };
                    ov0Var.m0(objQ);
                }
                dv1 dv1VarV = xp1.v(dv1Var, (lu0) objQ);
                ov0Var.p(false);
                return dv1VarV;
            default:
                f30 f30Var = (f30) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((bc1) obj).getClass();
                ov0 ov0Var2 = (ov0) f30Var;
                if (ov0Var2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ee0.f(z, au0Var, ov0Var2, 0);
                } else {
                    ov0Var2.W();
                }
                return mf3.a;
        }
    }

    public /* synthetic */ zf(boolean z, au0 au0Var) {
        this.f = z;
        this.g = au0Var;
    }
}
