package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class vc0 {
    public static final vc0 e;
    public static final vc0 f;
    public static final vc0 g;
    public static final /* synthetic */ vc0[] h;

    static {
        vc0 vc0Var = new vc0("Vertical", 0);
        e = vc0Var;
        vc0 vc0Var2 = new vc0("Horizontal", 1);
        f = vc0Var2;
        vc0 vc0Var3 = new vc0("Both", 2);
        g = vc0Var3;
        h = new vc0[]{vc0Var, vc0Var2, vc0Var3};
    }

    public static vc0 valueOf(String str) {
        return (vc0) Enum.valueOf(vc0.class, str);
    }

    public static vc0[] values() {
        return (vc0[]) h.clone();
    }
}
