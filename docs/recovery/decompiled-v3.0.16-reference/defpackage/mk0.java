package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mk0 extends aa1 implements lu0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ok0 g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mk0(ok0 ok0Var, long j, int i) {
        super(1);
        this.f = i;
        this.g = ok0Var;
        this.h = j;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        lu0 lu0Var;
        lu0 lu0Var2;
        int iOrdinal;
        int i = this.f;
        long jB = 0;
        long j = this.h;
        ok0 ok0Var = this.g;
        switch (i) {
            case 0:
                int iOrdinal2 = ((ck0) obj).ordinal();
                if (iOrdinal2 == 0) {
                    lw lwVar = ok0Var.x.a.c;
                    if (lwVar != null && (lu0Var = lwVar.b) != null) {
                        j = ((p41) lu0Var.invoke(new p41(j))).a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        b81.d();
                        return null;
                    }
                    lw lwVar2 = ok0Var.y.a.c;
                    if (lwVar2 != null && (lu0Var2 = lwVar2.b) != null) {
                        j = ((p41) lu0Var2.invoke(new p41(j))).a;
                    }
                }
                return new p41(j);
            case 1:
                ck0 ck0Var = (ck0) obj;
                if (ok0Var.C != null && ok0Var.o1() != null && !o51.f(ok0Var.C, ok0Var.o1()) && (iOrdinal = ck0Var.ordinal()) != 0 && iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        b81.d();
                        return null;
                    }
                    lw lwVar3 = ok0Var.y.a.c;
                    if (lwVar3 != null) {
                        lu0 lu0Var3 = lwVar3.b;
                        long j2 = this.h;
                        long j3 = ((p41) lu0Var3.invoke(new p41(j2))).a;
                        l9 l9VarO1 = ok0Var.o1();
                        l9VarO1.getClass();
                        qa1 qa1Var = qa1.e;
                        long jA = l9VarO1.a(j2, j3, qa1Var);
                        l9 l9Var = ok0Var.C;
                        l9Var.getClass();
                        jB = h41.b(jA, l9Var.a(j2, j3, qa1Var));
                    }
                }
                return new h41(jB);
            default:
                ck0 ck0Var2 = (ck0) obj;
                lw2 lw2Var = ok0Var.x.a.b;
                long j4 = lw2Var != null ? ((h41) lw2Var.a.invoke(new p41(j))).a : 0L;
                lw2 lw2Var2 = ok0Var.y.a.b;
                long j5 = lw2Var2 != null ? ((h41) lw2Var2.a.invoke(new p41(j))).a : 0L;
                int iOrdinal3 = ck0Var2.ordinal();
                if (iOrdinal3 == 0) {
                    jB = j4;
                } else if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        b81.d();
                        return null;
                    }
                    jB = j5;
                }
                return new h41(jB);
        }
    }
}
