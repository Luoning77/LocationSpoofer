package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class tq1 {
    public static final tq1 e;
    public static final tq1 f;
    public static final tq1 g;
    public static final tq1 h;
    public static final tq1 i;
    public static final /* synthetic */ tq1[] j;

    static {
        tq1 tq1Var = new tq1("GREEN", 0);
        e = tq1Var;
        tq1 tq1Var2 = new tq1("RED", 1);
        f = tq1Var2;
        tq1 tq1Var3 = new tq1("ORANGE", 2);
        g = tq1Var3;
        tq1 tq1Var4 = new tq1("DEFAULT", 3);
        h = tq1Var4;
        tq1 tq1Var5 = new tq1("CURRENT", 4);
        i = tq1Var5;
        j = new tq1[]{tq1Var, tq1Var2, tq1Var3, tq1Var4, tq1Var5};
    }

    public static tq1 valueOf(String str) {
        return (tq1) Enum.valueOf(tq1.class, str);
    }

    public static tq1[] values() {
        return (tq1[]) j.clone();
    }
}
