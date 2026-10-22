package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class gk1 {
    public static final gk1 e;
    public static final gk1 f;
    public static final gk1 g;
    public static final /* synthetic */ gk1[] h;

    static {
        gk1 gk1Var = new gk1("IsPlacedInLookahead", 0);
        e = gk1Var;
        gk1 gk1Var2 = new gk1("IsPlacedInApproach", 1);
        f = gk1Var2;
        gk1 gk1Var3 = new gk1("IsNotPlaced", 2);
        g = gk1Var3;
        h = new gk1[]{gk1Var, gk1Var2, gk1Var3};
    }

    public static gk1 valueOf(String str) {
        return (gk1) Enum.valueOf(gk1.class, str);
    }

    public static gk1[] values() {
        return (gk1[]) h.clone();
    }
}
