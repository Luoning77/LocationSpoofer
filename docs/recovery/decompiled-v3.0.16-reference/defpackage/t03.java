package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class t03 {
    public static final t03 e;
    public static final t03 f;
    public static final t03 g;
    public static final /* synthetic */ t03[] h;

    static {
        t03 t03Var = new t03("NoRequest", 0);
        e = t03Var;
        t03 t03Var2 = new t03("MatchFound", 1);
        f = t03Var2;
        t03 t03Var3 = new t03("VisibleContentAbsentDuringTransition", 2);
        g = t03Var3;
        h = new t03[]{t03Var, t03Var2, t03Var3, new t03("NoMatchFound", 3)};
    }

    public static t03 valueOf(String str) {
        return (t03) Enum.valueOf(t03.class, str);
    }

    public static t03[] values() {
        return (t03[]) h.clone();
    }
}
