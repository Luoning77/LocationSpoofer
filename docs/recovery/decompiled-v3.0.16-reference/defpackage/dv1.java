package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface dv1 {
    Object a(Object obj, pu0 pu0Var);

    boolean b(lu0 lu0Var);

    default dv1 d(dv1 dv1Var) {
        return dv1Var == av1.a ? this : new g00(this, dv1Var);
    }
}
