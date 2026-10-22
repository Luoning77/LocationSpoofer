package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class m11 {
    public static final hh0 a = new hh0(0, new qe0(11));

    public static final dv1 a(dv1 dv1Var, ix1 ix1Var, q11 q11Var) {
        if (q11Var == null) {
            return dv1Var;
        }
        return q11Var instanceof q11 ? dv1Var.d(new o11(q11Var, ix1Var)) : dv1Var.d(new b30(new au(q11Var, ix1Var)));
    }
}
