package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class jy1 {
    public static final jy1 e;
    public static final jy1 f;
    public static final /* synthetic */ jy1[] g;

    static {
        jy1 jy1Var = new jy1("Default", 0);
        e = jy1Var;
        jy1 jy1Var2 = new jy1("UserInput", 1);
        f = jy1Var2;
        g = new jy1[]{jy1Var, jy1Var2, new jy1("PreventUserInput", 2)};
    }

    public static jy1 valueOf(String str) {
        return (jy1) Enum.valueOf(jy1.class, str);
    }

    public static jy1[] values() {
        return (jy1[]) g.clone();
    }
}
