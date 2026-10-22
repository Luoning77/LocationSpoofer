package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class xa3 {
    public static final xa3 e;
    public static final xa3 f;
    public static final xa3 g;
    public static final /* synthetic */ xa3[] h;

    static {
        xa3 xa3Var = new xa3("On", 0);
        e = xa3Var;
        xa3 xa3Var2 = new xa3("Off", 1);
        f = xa3Var2;
        xa3 xa3Var3 = new xa3("Indeterminate", 2);
        g = xa3Var3;
        h = new xa3[]{xa3Var, xa3Var2, xa3Var3};
    }

    public static xa3 valueOf(String str) {
        return (xa3) Enum.valueOf(xa3.class, str);
    }

    public static xa3[] values() {
        return (xa3[]) h.clone();
    }
}
