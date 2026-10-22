package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mi1 {
    public static final mi1 e;
    public static final mi1 f;
    public static final mi1 g;
    public static final /* synthetic */ mi1[] h;

    static {
        mi1 mi1Var = new mi1("COLLAPSED", 0);
        e = mi1Var;
        mi1 mi1Var2 = new mi1("DEFAULT", 1);
        f = mi1Var2;
        mi1 mi1Var3 = new mi1("EXPANDED", 2);
        g = mi1Var3;
        h = new mi1[]{mi1Var, mi1Var2, mi1Var3};
    }

    public static mi1 valueOf(String str) {
        return (mi1) Enum.valueOf(mi1.class, str);
    }

    public static mi1[] values() {
        return (mi1[]) h.clone();
    }
}
