package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qa1 {
    public static final qa1 e;
    public static final qa1 f;
    public static final /* synthetic */ qa1[] g;

    static {
        qa1 qa1Var = new qa1("Ltr", 0);
        e = qa1Var;
        qa1 qa1Var2 = new qa1("Rtl", 1);
        f = qa1Var2;
        g = new qa1[]{qa1Var, qa1Var2};
    }

    public static qa1 valueOf(String str) {
        return (qa1) Enum.valueOf(qa1.class, str);
    }

    public static qa1[] values() {
        return (qa1[]) g.clone();
    }
}
