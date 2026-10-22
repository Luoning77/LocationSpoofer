package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class w51 {
    public static final w51 e;
    public static final w51 f;
    public static final w51 g;
    public static final w51 h;
    public static final /* synthetic */ w51[] i;

    static {
        w51 w51Var = new w51("LookaheadMeasurement", 0);
        e = w51Var;
        w51 w51Var2 = new w51("LookaheadPlacement", 1);
        f = w51Var2;
        w51 w51Var3 = new w51("Measurement", 2);
        g = w51Var3;
        w51 w51Var4 = new w51("Placement", 3);
        h = w51Var4;
        i = new w51[]{w51Var, w51Var2, w51Var3, w51Var4};
    }

    public static w51 valueOf(String str) {
        return (w51) Enum.valueOf(w51.class, str);
    }

    public static w51[] values() {
        return (w51[]) i.clone();
    }
}
