package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class t50 {
    public static final t50 e;
    public static final t50 f;
    public static final /* synthetic */ t50[] g;

    static {
        t50 t50Var = new t50("VIEW_APPEAR", 0);
        e = t50Var;
        t50 t50Var2 = new t50("VIEW_DISAPPEAR", 1);
        f = t50Var2;
        g = new t50[]{t50Var, t50Var2};
    }

    public static t50 valueOf(String str) {
        return (t50) Enum.valueOf(t50.class, str);
    }

    public static t50[] values() {
        return (t50[]) g.clone();
    }
}
