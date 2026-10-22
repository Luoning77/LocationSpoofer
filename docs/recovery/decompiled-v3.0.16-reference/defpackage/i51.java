package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class i51 {
    public static final i51 e;
    public static final i51 f;
    public static final /* synthetic */ i51[] g;

    static {
        i51 i51Var = new i51("Min", 0);
        e = i51Var;
        i51 i51Var2 = new i51("Max", 1);
        f = i51Var2;
        g = new i51[]{i51Var, i51Var2};
    }

    public static i51 valueOf(String str) {
        return (i51) Enum.valueOf(i51.class, str);
    }

    public static i51[] values() {
        return (i51[]) g.clone();
    }
}
