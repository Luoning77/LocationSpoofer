package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ei2 {
    public static final ei2 e;
    public static final ei2 f;
    public static final /* synthetic */ ei2[] g;

    /* JADX INFO: Fake field, exist only in values array */
    ei2 EF0;

    static {
        ei2 ei2Var = new ei2("AUTOMATIC", 0);
        ei2 ei2Var2 = new ei2("TRUNCATE", 1);
        e = ei2Var2;
        ei2 ei2Var3 = new ei2("WRITE_AHEAD_LOGGING", 2);
        f = ei2Var3;
        g = new ei2[]{ei2Var, ei2Var2, ei2Var3};
    }

    public static ei2 valueOf(String str) {
        return (ei2) Enum.valueOf(ei2.class, str);
    }

    public static ei2[] values() {
        return (ei2[]) g.clone();
    }
}
