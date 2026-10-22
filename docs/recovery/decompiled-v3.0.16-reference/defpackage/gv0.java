package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class gv0 {
    public static final gv0 e;
    public static final gv0 f;
    public static final gv0 g;
    public static final /* synthetic */ gv0[] h;

    static {
        gv0 gv0Var = new gv0("TOO_SHORT", 0);
        e = gv0Var;
        gv0 gv0Var2 = new gv0("NO_RHYTHM", 1);
        f = gv0Var2;
        gv0 gv0Var3 = new gv0("TOO_FEW_STRIDES", 2);
        g = gv0Var3;
        h = new gv0[]{gv0Var, gv0Var2, gv0Var3};
    }

    public static gv0 valueOf(String str) {
        return (gv0) Enum.valueOf(gv0.class, str);
    }

    public static gv0[] values() {
        return (gv0[]) h.clone();
    }
}
