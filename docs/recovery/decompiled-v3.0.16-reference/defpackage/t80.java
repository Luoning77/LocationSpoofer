package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class t80 {
    public static final t80 e;
    public static final t80 f;
    public static final t80 g;
    public static final /* synthetic */ t80[] h;

    static {
        t80 t80Var = new t80("None", 0);
        e = t80Var;
        t80 t80Var2 = new t80("Cancelled", 1);
        f = t80Var2;
        t80 t80Var3 = new t80("Redirected", 2);
        g = t80Var3;
        h = new t80[]{t80Var, t80Var2, t80Var3, new t80("RedirectCancelled", 3)};
    }

    public static t80 valueOf(String str) {
        return (t80) Enum.valueOf(t80.class, str);
    }

    public static t80[] values() {
        return (t80[]) h.clone();
    }
}
