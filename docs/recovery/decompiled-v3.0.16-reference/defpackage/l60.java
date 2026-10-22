package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class l60 {
    public final fy2 a = new fy2();

    public static void b(l60 l60Var, pu0 pu0Var, p10 p10Var, au0 au0Var, int i) {
        if ((i & 8) != 0) {
            p10Var = null;
        }
        l60Var.a.add(new p10(new oc1(pu0Var, l60Var, p10Var, au0Var), true, -1789283891));
    }

    public final void a(k60 k60Var, f30 f30Var, int i) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-798501095);
        int i2 = (ov0Var.f(k60Var) ? 4 : 2) | i | (ov0Var.f(this) ? 32 : 16);
        if (ov0Var.T(i2 & 1, (i2 & 19) != 18)) {
            fy2 fy2Var = this.a;
            int size = fy2Var.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((qu0) fy2Var.get(i3)).invoke(k60Var, ov0Var, Integer.valueOf(i2 & 14));
            }
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new j2(i, 6, this, k60Var);
        }
    }
}
