package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ke3 {
    public static final ke3 e;
    public static final ke3 f;
    public static final ke3 g;
    public static final ke3 h;
    public static final /* synthetic */ ke3[] i;

    /* JADX INFO: Fake field, exist only in values array */
    ke3 EF1;

    static {
        ke3 ke3Var = new ke3("BodyLarge", 0);
        ke3 ke3Var2 = new ke3("BodyMedium", 1);
        e = ke3Var2;
        ke3 ke3Var3 = new ke3("BodySmall", 2);
        ke3 ke3Var4 = new ke3("DisplayLarge", 3);
        ke3 ke3Var5 = new ke3("DisplayMedium", 4);
        ke3 ke3Var6 = new ke3("DisplaySmall", 5);
        ke3 ke3Var7 = new ke3("HeadlineLarge", 6);
        ke3 ke3Var8 = new ke3("HeadlineMedium", 7);
        ke3 ke3Var9 = new ke3("HeadlineSmall", 8);
        f = ke3Var9;
        ke3 ke3Var10 = new ke3("LabelLarge", 9);
        g = ke3Var10;
        ke3 ke3Var11 = new ke3("LabelMedium", 10);
        ke3 ke3Var12 = new ke3("LabelSmall", 11);
        ke3 ke3Var13 = new ke3("TitleLarge", 12);
        h = ke3Var13;
        i = new ke3[]{ke3Var, ke3Var2, ke3Var3, ke3Var4, ke3Var5, ke3Var6, ke3Var7, ke3Var8, ke3Var9, ke3Var10, ke3Var11, ke3Var12, ke3Var13, new ke3("TitleMedium", 13), new ke3("TitleSmall", 14), new ke3("BodyLargeEmphasized", 15), new ke3("BodyMediumEmphasized", 16), new ke3("BodySmallEmphasized", 17), new ke3("DisplayLargeEmphasized", 18), new ke3("DisplayMediumEmphasized", 19), new ke3("DisplaySmallEmphasized", 20), new ke3("HeadlineLargeEmphasized", 21), new ke3("HeadlineMediumEmphasized", 22), new ke3("HeadlineSmallEmphasized", 23), new ke3("LabelLargeEmphasized", 24), new ke3("LabelMediumEmphasized", 25), new ke3("LabelSmallEmphasized", 26), new ke3("TitleLargeEmphasized", 27), new ke3("TitleMediumEmphasized", 28), new ke3("TitleSmallEmphasized", 29)};
    }

    public static ke3 valueOf(String str) {
        return (ke3) Enum.valueOf(ke3.class, str);
    }

    public static ke3[] values() {
        return (ke3[]) i.clone();
    }
}
