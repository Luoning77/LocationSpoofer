package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class z70 {
    public static final z70 e;
    public static final z70 f;
    public static final z70 g;
    public static final /* synthetic */ z70[] h;

    static {
        z70 z70Var = new z70("COROUTINE_SUSPENDED", 0);
        e = z70Var;
        z70 z70Var2 = new z70("UNDECIDED", 1);
        f = z70Var2;
        z70 z70Var3 = new z70("RESUMED", 2);
        g = z70Var3;
        h = new z70[]{z70Var, z70Var2, z70Var3};
    }

    public static z70 valueOf(String str) {
        return (z70) Enum.valueOf(z70.class, str);
    }

    public static z70[] values() {
        return (z70[]) h.clone();
    }
}
