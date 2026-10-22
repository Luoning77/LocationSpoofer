package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class da2 {
    public static final da2 e;
    public static final da2 f;
    public static final da2 g;
    public static final /* synthetic */ da2[] h;

    static {
        da2 da2Var = new da2("Unknown", 0);
        e = da2Var;
        da2 da2Var2 = new da2("Dispatching", 1);
        f = da2Var2;
        da2 da2Var3 = new da2("NotDispatching", 2);
        g = da2Var3;
        h = new da2[]{da2Var, da2Var2, da2Var3};
    }

    public static da2 valueOf(String str) {
        return (da2) Enum.valueOf(da2.class, str);
    }

    public static da2[] values() {
        return (da2[]) h.clone();
    }
}
