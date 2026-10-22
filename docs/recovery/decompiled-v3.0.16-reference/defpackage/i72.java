package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class i72 {
    public static final i72 e;
    public static final i72 f;
    public static final i72 g;
    public static final i72 h;
    public static final i72 i;
    public static final i72 j;
    public static final i72 k;
    public static final /* synthetic */ i72[] l;

    static {
        i72 i72Var = new i72("Invalid", 0);
        e = i72Var;
        i72 i72Var2 = new i72("Cancelled", 1);
        f = i72Var2;
        i72 i72Var3 = new i72("InitialPending", 2);
        g = i72Var3;
        i72 i72Var4 = new i72("RecomposePending", 3);
        h = i72Var4;
        i72 i72Var5 = new i72("Recomposing", 4);
        i = i72Var5;
        i72 i72Var6 = new i72("ApplyPending", 5);
        j = i72Var6;
        i72 i72Var7 = new i72("Applied", 6);
        k = i72Var7;
        l = new i72[]{i72Var, i72Var2, i72Var3, i72Var4, i72Var5, i72Var6, i72Var7};
    }

    public static i72 valueOf(String str) {
        return (i72) Enum.valueOf(i72.class, str);
    }

    public static i72[] values() {
        return (i72[]) l.clone();
    }
}
