package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bx0 {
    public static final bx0 e;
    public static final bx0 f;
    public static final bx0 g;
    public static final /* synthetic */ bx0[] h;

    static {
        bx0 bx0Var = new bx0("Cursor", 0);
        e = bx0Var;
        bx0 bx0Var2 = new bx0("SelectionStart", 1);
        f = bx0Var2;
        bx0 bx0Var3 = new bx0("SelectionEnd", 2);
        g = bx0Var3;
        h = new bx0[]{bx0Var, bx0Var2, bx0Var3};
    }

    public static bx0 valueOf(String str) {
        return (bx0) Enum.valueOf(bx0.class, str);
    }

    public static bx0[] values() {
        return (bx0[]) h.clone();
    }
}
