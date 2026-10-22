package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class q92 {
    public static final q92 e;
    public static final q92 f;
    public static final q92 g;
    public static final /* synthetic */ q92[] h;

    static {
        q92 q92Var = new q92("Initial", 0);
        e = q92Var;
        q92 q92Var2 = new q92("Main", 1);
        f = q92Var2;
        q92 q92Var3 = new q92("Final", 2);
        g = q92Var3;
        h = new q92[]{q92Var, q92Var2, q92Var3};
    }

    public static q92 valueOf(String str) {
        return (q92) Enum.valueOf(q92.class, str);
    }

    public static q92[] values() {
        return (q92[]) h.clone();
    }
}
