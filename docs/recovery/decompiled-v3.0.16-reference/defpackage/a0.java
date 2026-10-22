package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class a0 implements x70 {
    private final lu0 safeCast;
    private final x70 topmostKey;

    public a0(x70 x70Var, lu0 lu0Var) {
        x70Var.getClass();
        this.safeCast = lu0Var;
        this.topmostKey = x70Var instanceof a0 ? ((a0) x70Var).topmostKey : x70Var;
    }

    public final boolean isSubKey$kotlin_stdlib(x70 x70Var) {
        x70Var.getClass();
        return x70Var == this || this.topmostKey == x70Var;
    }

    public final Object tryCast$kotlin_stdlib(w70 w70Var) {
        w70Var.getClass();
        return (w70) this.safeCast.invoke(w70Var);
    }
}
