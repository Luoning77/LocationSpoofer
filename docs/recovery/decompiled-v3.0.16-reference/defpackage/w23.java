package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class w23 {
    public static final w23 e;
    public static final w23 f;
    public static final w23 g;
    public static final w23 h;
    public static final w23 i;
    public static final /* synthetic */ w23[] j;

    static {
        w23 w23Var = new w23("END", 0);
        e = w23Var;
        w23 w23Var2 = new w23("ROLLBACK", 1);
        f = w23Var2;
        w23 w23Var3 = new w23("BEGIN_EXCLUSIVE", 2);
        g = w23Var3;
        w23 w23Var4 = new w23("BEGIN_IMMEDIATE", 3);
        h = w23Var4;
        w23 w23Var5 = new w23("BEGIN_DEFERRED", 4);
        i = w23Var5;
        j = new w23[]{w23Var, w23Var2, w23Var3, w23Var4, w23Var5};
    }

    public static w23 valueOf(String str) {
        return (w23) Enum.valueOf(w23.class, str);
    }

    public static w23[] values() {
        return (w23[]) j.clone();
    }
}
