package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class gr2 {
    public static final gr2 e;
    public static final gr2 f;
    public static final gr2 g;
    public static final gr2 h;
    public static final gr2 i;
    public static final /* synthetic */ gr2[] j;

    static {
        gr2 gr2Var = new gr2("LOADING", 0);
        e = gr2Var;
        gr2 gr2Var2 = new gr2("AVAILABLE", 1);
        f = gr2Var2;
        gr2 gr2Var3 = new gr2("ACCOUNT_REQUIRED", 2);
        g = gr2Var3;
        gr2 gr2Var4 = new gr2("MEMBERSHIP_REQUIRED", 3);
        h = gr2Var4;
        gr2 gr2Var5 = new gr2("UNAVAILABLE", 4);
        i = gr2Var5;
        j = new gr2[]{gr2Var, gr2Var2, gr2Var3, gr2Var4, gr2Var5};
    }

    public static gr2 valueOf(String str) {
        return (gr2) Enum.valueOf(gr2.class, str);
    }

    public static gr2[] values() {
        return (gr2[]) j.clone();
    }
}
