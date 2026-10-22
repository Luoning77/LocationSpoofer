package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ce1 {
    public static final ce1 e;
    public static final ce1 f;
    public static final ce1 g;
    public static final /* synthetic */ ce1[] h;

    static {
        ce1 ce1Var = new ce1("SYNCHRONIZED", 0);
        e = ce1Var;
        ce1 ce1Var2 = new ce1("PUBLICATION", 1);
        f = ce1Var2;
        ce1 ce1Var3 = new ce1("NONE", 2);
        g = ce1Var3;
        h = new ce1[]{ce1Var, ce1Var2, ce1Var3};
    }

    public static ce1 valueOf(String str) {
        return (ce1) Enum.valueOf(ce1.class, str);
    }

    public static ce1[] values() {
        return (ce1[]) h.clone();
    }
}
