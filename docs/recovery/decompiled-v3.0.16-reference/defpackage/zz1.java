package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zz1 {
    public static final zz1 e;
    public static final zz1 f;
    public static final /* synthetic */ zz1[] g;

    static {
        zz1 zz1Var = new zz1("Min", 0);
        e = zz1Var;
        zz1 zz1Var2 = new zz1("Max", 1);
        f = zz1Var2;
        g = new zz1[]{zz1Var, zz1Var2};
    }

    public static zz1 valueOf(String str) {
        return (zz1) Enum.valueOf(zz1.class, str);
    }

    public static zz1[] values() {
        return (zz1[]) g.clone();
    }
}
