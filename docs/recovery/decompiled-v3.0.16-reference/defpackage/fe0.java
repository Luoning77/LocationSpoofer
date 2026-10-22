package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fe0 {
    public static final fe0 e;
    public static final fe0 f;
    public static final fe0 g;
    public static final /* synthetic */ fe0[] h;

    static {
        fe0 fe0Var = new fe0("Yes", 0);
        e = fe0Var;
        fe0 fe0Var2 = new fe0("No", 1);
        f = fe0Var2;
        fe0 fe0Var3 = new fe0("NotInitialized", 2);
        g = fe0Var3;
        h = new fe0[]{fe0Var, fe0Var2, fe0Var3};
    }

    public static fe0 valueOf(String str) {
        return (fe0) Enum.valueOf(fe0.class, str);
    }

    public static fe0[] values() {
        return (fe0[]) h.clone();
    }
}
