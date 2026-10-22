package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fn2 {
    public static final fn2 e;
    public static final fn2 f;
    public static final fn2 g;
    public static final fn2 h;
    public static final fn2 i;
    public static final /* synthetic */ fn2[] j;

    static {
        fn2 fn2Var = new fn2("TopBar", 0);
        e = fn2Var;
        fn2 fn2Var2 = new fn2("MainContent", 1);
        f = fn2Var2;
        fn2 fn2Var3 = new fn2("Snackbar", 2);
        g = fn2Var3;
        fn2 fn2Var4 = new fn2("Fab", 3);
        h = fn2Var4;
        fn2 fn2Var5 = new fn2("BottomBar", 4);
        i = fn2Var5;
        j = new fn2[]{fn2Var, fn2Var2, fn2Var3, fn2Var4, fn2Var5};
    }

    public static fn2 valueOf(String str) {
        return (fn2) Enum.valueOf(fn2.class, str);
    }

    public static fn2[] values() {
        return (fn2[]) j.clone();
    }
}
