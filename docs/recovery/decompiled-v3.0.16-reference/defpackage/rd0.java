package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class rd0 {
    public static final rd0 e;
    public static final rd0 f;
    public static final rd0 g;
    public static final rd0 h;
    public static final /* synthetic */ rd0[] i;

    static {
        rd0 rd0Var = new rd0("Up", 0);
        e = rd0Var;
        rd0 rd0Var2 = new rd0("Drag", 1);
        f = rd0Var2;
        rd0 rd0Var3 = new rd0("Timeout", 2);
        g = rd0Var3;
        rd0 rd0Var4 = new rd0("Cancel", 3);
        h = rd0Var4;
        i = new rd0[]{rd0Var, rd0Var2, rd0Var3, rd0Var4};
    }

    public static rd0 valueOf(String str) {
        return (rd0) Enum.valueOf(rd0.class, str);
    }

    public static rd0[] values() {
        return (rd0[]) i.clone();
    }
}
