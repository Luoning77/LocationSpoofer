package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class jr1 {
    public static final jr1 e;
    public static final jr1 f;
    public static final /* synthetic */ jr1[] g;

    static {
        jr1 jr1Var = new jr1("Width", 0);
        e = jr1Var;
        jr1 jr1Var2 = new jr1("Height", 1);
        f = jr1Var2;
        g = new jr1[]{jr1Var, jr1Var2};
    }

    public static jr1 valueOf(String str) {
        return (jr1) Enum.valueOf(jr1.class, str);
    }

    public static jr1[] values() {
        return (jr1[]) g.clone();
    }
}
