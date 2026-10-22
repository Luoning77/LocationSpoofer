package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class dx0 {
    public static final dx0 e;
    public static final dx0 f;
    public static final dx0 g;
    public static final /* synthetic */ dx0[] h;

    static {
        dx0 dx0Var = new dx0("None", 0);
        e = dx0Var;
        dx0 dx0Var2 = new dx0("Selection", 1);
        f = dx0Var2;
        dx0 dx0Var3 = new dx0("Cursor", 2);
        g = dx0Var3;
        h = new dx0[]{dx0Var, dx0Var2, dx0Var3};
    }

    public static dx0 valueOf(String str) {
        return (dx0) Enum.valueOf(dx0.class, str);
    }

    public static dx0[] values() {
        return (dx0[]) h.clone();
    }
}
