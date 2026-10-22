package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class t91 {
    public static final t91 e;
    public static final t91 f;
    public static final /* synthetic */ t91[] g;

    static {
        t91 t91Var = new t91("Singleton", 0);
        e = t91Var;
        t91 t91Var2 = new t91("Factory", 1);
        f = t91Var2;
        g = new t91[]{t91Var, t91Var2, new t91("Scoped", 2)};
    }

    public static t91 valueOf(String str) {
        return (t91) Enum.valueOf(t91.class, str);
    }

    public static t91[] values() {
        return (t91[]) g.clone();
    }
}
