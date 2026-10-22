package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class w02 {
    public static final w02 e;
    public static final w02 f;
    public static final w02 g;
    public static final /* synthetic */ w02[] h;

    static {
        w02 w02Var = new w02("NO_OP", 0);
        e = w02Var;
        w02 w02Var2 = new w02("ADD", 1);
        f = w02Var2;
        w02 w02Var3 = new w02("REMOVE", 2);
        g = w02Var3;
        h = new w02[]{w02Var, w02Var2, w02Var3};
    }

    public static w02 valueOf(String str) {
        return (w02) Enum.valueOf(w02.class, str);
    }

    public static w02[] values() {
        return (w02[]) h.clone();
    }
}
