package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class vv1 {
    public static final vv1 e;
    public static final vv1 f;
    public static final vv1 g;
    public static final vv1 h;
    public static final vv1 i;
    public static final /* synthetic */ vv1[] j;

    static {
        vv1 vv1Var = new vv1("DefaultSpatial", 0);
        e = vv1Var;
        vv1 vv1Var2 = new vv1("FastSpatial", 1);
        f = vv1Var2;
        vv1 vv1Var3 = new vv1("SlowSpatial", 2);
        vv1 vv1Var4 = new vv1("DefaultEffects", 3);
        g = vv1Var4;
        vv1 vv1Var5 = new vv1("FastEffects", 4);
        h = vv1Var5;
        vv1 vv1Var6 = new vv1("SlowEffects", 5);
        i = vv1Var6;
        j = new vv1[]{vv1Var, vv1Var2, vv1Var3, vv1Var4, vv1Var5, vv1Var6};
    }

    public static vv1 valueOf(String str) {
        return (vv1) Enum.valueOf(vv1.class, str);
    }

    public static vv1[] values() {
        return (vv1[]) j.clone();
    }
}
