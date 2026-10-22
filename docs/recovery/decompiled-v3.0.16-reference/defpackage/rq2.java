package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class rq2 {
    public static final rq2 e;
    public static final rq2 f;
    public static final rq2 g;
    public static final /* synthetic */ rq2[] h;

    static {
        rq2 rq2Var = new rq2("Left", 0);
        e = rq2Var;
        rq2 rq2Var2 = new rq2("Middle", 1);
        f = rq2Var2;
        rq2 rq2Var3 = new rq2("Right", 2);
        g = rq2Var3;
        h = new rq2[]{rq2Var, rq2Var2, rq2Var3};
    }

    public static rq2 valueOf(String str) {
        return (rq2) Enum.valueOf(rq2.class, str);
    }

    public static rq2[] values() {
        return (rq2[]) h.clone();
    }
}
