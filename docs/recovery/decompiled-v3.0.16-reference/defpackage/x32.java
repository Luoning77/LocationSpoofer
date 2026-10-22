package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class x32 {
    public static final x32 e;
    public static final x32 f;
    public static final /* synthetic */ x32[] g;

    static {
        x32 x32Var = new x32("Vertical", 0);
        e = x32Var;
        x32 x32Var2 = new x32("Horizontal", 1);
        f = x32Var2;
        g = new x32[]{x32Var, x32Var2};
    }

    public static x32 valueOf(String str) {
        return (x32) Enum.valueOf(x32.class, str);
    }

    public static x32[] values() {
        return (x32[]) g.clone();
    }
}
