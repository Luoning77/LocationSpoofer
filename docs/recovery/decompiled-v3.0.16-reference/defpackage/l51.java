package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class l51 {
    public static final l51 e;
    public static final l51 f;
    public static final /* synthetic */ l51[] g;

    static {
        l51 l51Var = new l51("Width", 0);
        e = l51Var;
        l51 l51Var2 = new l51("Height", 1);
        f = l51Var2;
        g = new l51[]{l51Var, l51Var2};
    }

    public static l51 valueOf(String str) {
        return (l51) Enum.valueOf(l51.class, str);
    }

    public static l51[] values() {
        return (l51[]) g.clone();
    }
}
