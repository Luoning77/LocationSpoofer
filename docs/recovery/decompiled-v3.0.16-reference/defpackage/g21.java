package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class g21 {
    public final gy1 a = new gy1(new e21[16]);
    public final w52 b = ke0.H(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final w52 d = ke0.H(Boolean.TRUE);

    public final void a(int i, f30 f30Var) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-318043801);
        int i2 = (ov0Var.h(this) ? 4 : 2) | i;
        if (ov0Var.T(i2 & 1, (i2 & 3) != 2)) {
            Object objQ = ov0Var.Q();
            c30 c30Var = d30.a;
            if (objQ == c30Var) {
                objQ = ke0.H(null);
                ov0Var.m0(objQ);
            }
            ey1 ey1Var = (ey1) objQ;
            if (((Boolean) this.d.getValue()).booleanValue() || ((Boolean) this.b.getValue()).booleanValue()) {
                ov0Var.c0(-144841960);
                boolean zH = ov0Var.h(this);
                Object objQ2 = ov0Var.Q();
                if (zH || objQ2 == c30Var) {
                    objQ2 = new t3(ey1Var, this, (q60) null);
                    ov0Var.m0(objQ2);
                }
                oi0.e(ov0Var, (pu0) objQ2, this);
                ov0Var.p(false);
            } else {
                ov0Var.c0(-143455237);
                ov0Var.p(false);
            }
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new s5(i, 9, this);
        }
    }
}
