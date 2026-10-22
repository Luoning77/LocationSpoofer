package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class cu2 {
    public static final cu2 e;
    public static final cu2 f;
    public static final cu2 g;
    public static final cu2 h;
    public static final cu2 i;
    public static final /* synthetic */ cu2[] j;

    /* JADX INFO: Fake field, exist only in values array */
    cu2 EF0;

    static {
        cu2 cu2Var = new cu2("CornerExtraExtraLarge", 0);
        cu2 cu2Var2 = new cu2("CornerExtraLarge", 1);
        e = cu2Var2;
        cu2 cu2Var3 = new cu2("CornerExtraLargeIncreased", 2);
        cu2 cu2Var4 = new cu2("CornerExtraLargeTop", 3);
        cu2 cu2Var5 = new cu2("CornerExtraSmall", 4);
        f = cu2Var5;
        cu2 cu2Var6 = new cu2("CornerExtraSmallTop", 5);
        cu2 cu2Var7 = new cu2("CornerFull", 6);
        g = cu2Var7;
        cu2 cu2Var8 = new cu2("CornerLarge", 7);
        cu2 cu2Var9 = new cu2("CornerLargeEnd", 8);
        cu2 cu2Var10 = new cu2("CornerLargeIncreased", 9);
        cu2 cu2Var11 = new cu2("CornerLargeStart", 10);
        cu2 cu2Var12 = new cu2("CornerLargeTop", 11);
        cu2 cu2Var13 = new cu2("CornerMedium", 12);
        h = cu2Var13;
        cu2 cu2Var14 = new cu2("CornerNone", 13);
        cu2 cu2Var15 = new cu2("CornerSmall", 14);
        i = cu2Var15;
        j = new cu2[]{cu2Var, cu2Var2, cu2Var3, cu2Var4, cu2Var5, cu2Var6, cu2Var7, cu2Var8, cu2Var9, cu2Var10, cu2Var11, cu2Var12, cu2Var13, cu2Var14, cu2Var15};
    }

    public static cu2 valueOf(String str) {
        return (cu2) Enum.valueOf(cu2.class, str);
    }

    public static cu2[] values() {
        return (cu2[]) j.clone();
    }
}
