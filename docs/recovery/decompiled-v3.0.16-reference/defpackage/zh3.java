package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zh3 {
    public static final zh3 e;
    public static final zh3 f;
    public static final /* synthetic */ zh3[] g;

    static {
        zh3 zh3Var = new zh3("Lsq2", 0);
        e = zh3Var;
        zh3 zh3Var2 = new zh3("Impulse", 1);
        f = zh3Var2;
        g = new zh3[]{zh3Var, zh3Var2};
    }

    public static zh3 valueOf(String str) {
        return (zh3) Enum.valueOf(zh3.class, str);
    }

    public static zh3[] values() {
        return (zh3[]) g.clone();
    }
}
