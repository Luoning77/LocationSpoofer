package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class e80 {
    public static final e80 e;
    public static final e80 f;
    public static final e80 g;
    public static final /* synthetic */ e80[] h;

    static {
        e80 e80Var = new e80("CROSSED", 0);
        e = e80Var;
        e80 e80Var2 = new e80("NOT_CROSSED", 1);
        f = e80Var2;
        e80 e80Var3 = new e80("COLLAPSED", 2);
        g = e80Var3;
        h = new e80[]{e80Var, e80Var2, e80Var3};
    }

    public static e80 valueOf(String str) {
        return (e80) Enum.valueOf(e80.class, str);
    }

    public static e80[] values() {
        return (e80[]) h.clone();
    }
}
