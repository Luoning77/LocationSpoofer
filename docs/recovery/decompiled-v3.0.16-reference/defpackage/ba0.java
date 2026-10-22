package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ba0 {
    public static final ba0 a = new ba0();

    public final void a(mn2 mn2Var, f30 f30Var, int i) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1565826668);
        int i2 = (ov0Var.f(mn2Var) ? 4 : 2) | i;
        int i3 = 0;
        if (ov0Var.T(i2 & 1, (i2 & 3) != 2)) {
            sb.F((au0) mn2Var.e, (qc0) mn2Var.g, sb.a0(1163527043, new aa0(mn2Var, i3), ov0Var), ov0Var, 384, 0);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new j2(i, 10, this, mn2Var);
        }
    }
}
