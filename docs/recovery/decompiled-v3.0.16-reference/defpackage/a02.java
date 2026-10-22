package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class a02 {
    public static final a02 e;
    public static final a02 f;
    public static final /* synthetic */ a02[] g;

    static {
        a02 a02Var = new a02("Width", 0);
        e = a02Var;
        a02 a02Var2 = new a02("Height", 1);
        f = a02Var2;
        g = new a02[]{a02Var, a02Var2};
    }

    public static a02 valueOf(String str) {
        return (a02) Enum.valueOf(a02.class, str);
    }

    public static a02[] values() {
        return (a02[]) g.clone();
    }
}
