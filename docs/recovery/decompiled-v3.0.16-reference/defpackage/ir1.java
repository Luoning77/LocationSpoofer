package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ir1 {
    public static final ir1 e;
    public static final ir1 f;
    public static final /* synthetic */ ir1[] g;

    static {
        ir1 ir1Var = new ir1("Min", 0);
        e = ir1Var;
        ir1 ir1Var2 = new ir1("Max", 1);
        f = ir1Var2;
        g = new ir1[]{ir1Var, ir1Var2};
    }

    public static ir1 valueOf(String str) {
        return (ir1) Enum.valueOf(ir1.class, str);
    }

    public static ir1[] values() {
        return (ir1[]) g.clone();
    }
}
