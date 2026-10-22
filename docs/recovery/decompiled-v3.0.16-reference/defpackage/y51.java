package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class y51 {
    public static final y51 e;
    public static final y51 f;
    public static final y51 g;
    public static final y51 h;
    public static final /* synthetic */ y51[] i;

    static {
        y51 y51Var = new y51("IGNORED", 0);
        e = y51Var;
        y51 y51Var2 = new y51("SCHEDULED", 1);
        f = y51Var2;
        y51 y51Var3 = new y51("DEFERRED", 2);
        g = y51Var3;
        y51 y51Var4 = new y51("IMMINENT", 3);
        h = y51Var4;
        i = new y51[]{y51Var, y51Var2, y51Var3, y51Var4};
    }

    public static y51 valueOf(String str) {
        return (y51) Enum.valueOf(y51.class, str);
    }

    public static y51[] values() {
        return (y51[]) i.clone();
    }
}
