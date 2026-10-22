package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fb1 {
    public static final fb1 e;
    public static final fb1 f;
    public static final fb1 g;
    public static final /* synthetic */ fb1[] h;

    static {
        fb1 fb1Var = new fb1("InMeasureBlock", 0);
        e = fb1Var;
        fb1 fb1Var2 = new fb1("InLayoutBlock", 1);
        f = fb1Var2;
        fb1 fb1Var3 = new fb1("NotUsed", 2);
        g = fb1Var3;
        h = new fb1[]{fb1Var, fb1Var2, fb1Var3};
    }

    public static fb1 valueOf(String str) {
        return (fb1) Enum.valueOf(fb1.class, str);
    }

    public static fb1[] values() {
        return (fb1[]) h.clone();
    }
}
