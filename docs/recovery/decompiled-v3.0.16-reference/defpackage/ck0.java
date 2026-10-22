package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ck0 {
    public static final ck0 e;
    public static final ck0 f;
    public static final ck0 g;
    public static final /* synthetic */ ck0[] h;

    static {
        ck0 ck0Var = new ck0("PreEnter", 0);
        e = ck0Var;
        ck0 ck0Var2 = new ck0("Visible", 1);
        f = ck0Var2;
        ck0 ck0Var3 = new ck0("PostExit", 2);
        g = ck0Var3;
        h = new ck0[]{ck0Var, ck0Var2, ck0Var3};
    }

    public static ck0 valueOf(String str) {
        return (ck0) Enum.valueOf(ck0.class, str);
    }

    public static ck0[] values() {
        return (ck0[]) h.clone();
    }
}
