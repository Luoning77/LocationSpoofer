package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class h51 {
    public static final h51 e;
    public static final h51 f;
    public static final /* synthetic */ h51[] g;

    static {
        h51 h51Var = new h51("Min", 0);
        e = h51Var;
        h51 h51Var2 = new h51("Max", 1);
        f = h51Var2;
        g = new h51[]{h51Var, h51Var2};
    }

    public static h51 valueOf(String str) {
        return (h51) Enum.valueOf(h51.class, str);
    }

    public static h51[] values() {
        return (h51[]) g.clone();
    }
}
