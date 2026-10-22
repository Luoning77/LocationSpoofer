package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hb3 {
    public static final hb3 e;
    public static final hb3 f;
    public static final hb3 g;
    public static final /* synthetic */ hb3[] h;

    static {
        hb3 hb3Var = new hb3("Uninitialized", 0);
        e = hb3Var;
        hb3 hb3Var2 = new hb3("Detached", 1);
        f = hb3Var2;
        hb3 hb3Var3 = new hb3("Attached", 2);
        g = hb3Var3;
        h = new hb3[]{hb3Var, hb3Var2, hb3Var3};
    }

    public static hb3 valueOf(String str) {
        return (hb3) Enum.valueOf(hb3.class, str);
    }

    public static hb3[] values() {
        return (hb3[]) h.clone();
    }
}
