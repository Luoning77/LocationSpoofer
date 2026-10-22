package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class t11 {
    public static final t11 e;
    public static final t11 f;
    public static final t11 g;
    public static final /* synthetic */ t11[] h;

    static {
        t11 t11Var = new t11("Yes", 0);
        e = t11Var;
        t11 t11Var2 = new t11("No", 1);
        f = t11Var2;
        t11 t11Var3 = new t11("NotInitialized", 2);
        g = t11Var3;
        h = new t11[]{t11Var, t11Var2, t11Var3};
    }

    public static t11 valueOf(String str) {
        return (t11) Enum.valueOf(t11.class, str);
    }

    public static t11[] values() {
        return (t11[]) h.clone();
    }
}
