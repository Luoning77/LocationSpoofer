package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface bv1 extends dv1 {
    @Override // defpackage.dv1
    default Object a(Object obj, pu0 pu0Var) {
        return pu0Var.invoke(obj, this);
    }

    @Override // defpackage.dv1
    default boolean b(lu0 lu0Var) {
        return ((Boolean) lu0Var.invoke(this)).booleanValue();
    }
}
