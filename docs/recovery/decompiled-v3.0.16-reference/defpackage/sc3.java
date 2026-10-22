package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class sc3 {
    public static final sc3 e;
    public static final sc3 f;
    public static final sc3 g;
    public static final /* synthetic */ sc3[] h;

    static {
        sc3 sc3Var = new sc3("ContinueTraversal", 0);
        e = sc3Var;
        sc3 sc3Var2 = new sc3("SkipSubtreeAndContinueTraversal", 1);
        f = sc3Var2;
        sc3 sc3Var3 = new sc3("CancelTraversal", 2);
        g = sc3Var3;
        h = new sc3[]{sc3Var, sc3Var2, sc3Var3};
    }

    public static sc3 valueOf(String str) {
        return (sc3) Enum.valueOf(sc3.class, str);
    }

    public static sc3[] values() {
        return (sc3[]) h.clone();
    }
}
