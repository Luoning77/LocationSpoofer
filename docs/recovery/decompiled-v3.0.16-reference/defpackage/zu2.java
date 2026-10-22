package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class zu2 {
    public static final xu2 a;

    static {
        o51.D(0.0f, 400.0f, zj3.a, 1);
        a = new xu2();
        new zx1();
    }

    public static final void a(dv1 dv1Var, p10 p10Var, f30 f30Var, int i) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(646379026);
        int i2 = i | 6;
        if (ov0Var.T(i2 & 1, (i2 & 19) != 18)) {
            b(sb.a0(1948801580, new wa2(p10Var), ov0Var), ov0Var, 6);
            dv1Var = av1.a;
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new xb(dv1Var, p10Var, i);
        }
    }

    public static final void b(p10 p10Var, f30 f30Var, int i) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1908320054);
        int i2 = 0;
        int i3 = 1;
        if (ov0Var.T(i & 1, (i & 3) != 2)) {
            ee0.e(sb.a0(2062852661, new yu2(p10Var, i2), ov0Var), ov0Var, 6);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new lk1(p10Var, i, i3);
        }
    }
}
