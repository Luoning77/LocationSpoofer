package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class i31 {
    public static final i31 e;
    public static final i31 f;
    public static final i31 g;
    public static final /* synthetic */ i31[] h;

    static {
        i31 i31Var = new i31("Focused", 0);
        e = i31Var;
        i31 i31Var2 = new i31("UnfocusedEmpty", 1);
        f = i31Var2;
        i31 i31Var3 = new i31("UnfocusedNotEmpty", 2);
        g = i31Var3;
        h = new i31[]{i31Var, i31Var2, i31Var3};
    }

    public static i31 valueOf(String str) {
        return (i31) Enum.valueOf(i31.class, str);
    }

    public static i31[] values() {
        return (i31[]) h.clone();
    }
}
