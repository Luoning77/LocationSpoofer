package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ut0 {
    public static final ut0 e;
    public static final ut0 f;
    public static final ut0 g;
    public static final ut0 h;
    public static final ut0 i;
    public static final /* synthetic */ ut0[] j;

    static {
        ut0 ut0Var = new ut0("ON_CONFIGURE", 0);
        e = ut0Var;
        ut0 ut0Var2 = new ut0("ON_CREATE", 1);
        f = ut0Var2;
        ut0 ut0Var3 = new ut0("ON_UPGRADE", 2);
        g = ut0Var3;
        ut0 ut0Var4 = new ut0("ON_DOWNGRADE", 3);
        h = ut0Var4;
        ut0 ut0Var5 = new ut0("ON_OPEN", 4);
        i = ut0Var5;
        j = new ut0[]{ut0Var, ut0Var2, ut0Var3, ut0Var4, ut0Var5};
    }

    public static ut0 valueOf(String str) {
        return (ut0) Enum.valueOf(ut0.class, str);
    }

    public static ut0[] values() {
        return (ut0[]) j.clone();
    }
}
