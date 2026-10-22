package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class pp1 {
    private static final /* synthetic */ pp1[] $VALUES;
    public static final pp1 CONTINUOUS;
    public static final pp1 WHEN_DIRTY;

    static {
        pp1 pp1Var = new pp1("WHEN_DIRTY", 0);
        WHEN_DIRTY = pp1Var;
        pp1 pp1Var2 = new pp1("CONTINUOUS", 1);
        CONTINUOUS = pp1Var2;
        $VALUES = new pp1[]{pp1Var, pp1Var2};
    }

    public static pp1 valueOf(String str) {
        return (pp1) Enum.valueOf(pp1.class, str);
    }

    public static pp1[] values() {
        return (pp1[]) $VALUES.clone();
    }
}
