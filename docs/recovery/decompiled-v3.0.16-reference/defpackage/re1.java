package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class re1 {
    public static final re1 e;
    public static final re1 f;
    public static final re1 g;
    public static final re1 h;
    public static final re1 i;
    public static final /* synthetic */ re1[] j;

    static {
        re1 re1Var = new re1("DEBUG", 0);
        e = re1Var;
        re1 re1Var2 = new re1("INFO", 1);
        f = re1Var2;
        re1 re1Var3 = new re1("WARNING", 2);
        g = re1Var3;
        re1 re1Var4 = new re1("ERROR", 3);
        h = re1Var4;
        re1 re1Var5 = new re1("NONE", 4);
        i = re1Var5;
        j = new re1[]{re1Var, re1Var2, re1Var3, re1Var4, re1Var5};
    }

    public static re1 valueOf(String str) {
        return (re1) Enum.valueOf(re1.class, str);
    }

    public static re1[] values() {
        return (re1[]) j.clone();
    }
}
