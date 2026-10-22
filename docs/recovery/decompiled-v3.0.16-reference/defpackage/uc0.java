package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class uc0 {
    public static final uc0 e;
    public static final uc0 f;
    public static final uc0 g;
    public static final /* synthetic */ uc0[] h;

    static {
        uc0 uc0Var = new uc0("BEFORE", 0);
        e = uc0Var;
        uc0 uc0Var2 = new uc0("ON", 1);
        f = uc0Var2;
        uc0 uc0Var3 = new uc0("AFTER", 2);
        g = uc0Var3;
        h = new uc0[]{uc0Var, uc0Var2, uc0Var3};
    }

    public static uc0 valueOf(String str) {
        return (uc0) Enum.valueOf(uc0.class, str);
    }

    public static uc0[] values() {
        return (uc0[]) h.clone();
    }
}
