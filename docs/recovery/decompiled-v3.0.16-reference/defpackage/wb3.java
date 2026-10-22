package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wb3 {
    public static final wb3 e;
    public static final wb3 f;
    public static final /* synthetic */ wb3[] g;

    static {
        wb3 wb3Var = new wb3("DEFERRED", 0);
        e = wb3Var;
        wb3 wb3Var2 = new wb3("IMMEDIATE", 1);
        f = wb3Var2;
        g = new wb3[]{wb3Var, wb3Var2, new wb3("EXCLUSIVE", 2)};
    }

    public static wb3 valueOf(String str) {
        return (wb3) Enum.valueOf(wb3.class, str);
    }

    public static wb3[] values() {
        return (wb3[]) g.clone();
    }
}
