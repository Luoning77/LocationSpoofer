package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hg2 {
    public static final hg2 e;
    public static final hg2 f;
    public static final /* synthetic */ hg2[] g;

    static {
        hg2 hg2Var = new hg2("Ltr", 0);
        e = hg2Var;
        hg2 hg2Var2 = new hg2("Rtl", 1);
        f = hg2Var2;
        g = new hg2[]{hg2Var, hg2Var2};
    }

    public static hg2 valueOf(String str) {
        return (hg2) Enum.valueOf(hg2.class, str);
    }

    public static hg2[] values() {
        return (hg2[]) g.clone();
    }
}
