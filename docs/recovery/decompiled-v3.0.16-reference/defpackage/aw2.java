package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class aw2 {
    public static final yz2 a = o51.D(0.0f, 0.0f, null, 7);

    public static final s03 a(long j, ln0 ln0Var, f30 f30Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            ln0Var = a;
        }
        ln0 ln0Var2 = ln0Var;
        String str = (i2 & 4) != 0 ? "ColorAnimation" : "stop_color";
        ov0 ov0Var = (ov0) f30Var;
        boolean zF = ov0Var.f(hz.f(j));
        Object objQ = ov0Var.Q();
        if (zF || objQ == d30.a) {
            qd3 qd3Var = new qd3(wa.y, new q9(hz.f(j), 10));
            ov0Var.m0(qd3Var);
            objQ = qd3Var;
        }
        return qh.b(new hz(j), (qd3) objQ, ln0Var2, null, str, ov0Var, ((i << 3) & 896) | ((i << 6) & 57344), 8);
    }
}
