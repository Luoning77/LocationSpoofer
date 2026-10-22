package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class d70 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ x73 f;

    public /* synthetic */ d70(x73 x73Var, int i) {
        this.e = i;
        this.f = x73Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0122  */
    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        pe2 pe2Var;
        pa1 pa1VarC;
        char c;
        float fIntBitsToFloat;
        pa1 pa1VarC2;
        pa1 pa1VarC3;
        pa1 pa1VarC4;
        pa1 pa1VarC5;
        int i = this.e;
        x73 x73Var = this.f;
        switch (i) {
            case 0:
                return new h8(x73Var, 7);
            case 1:
                x73Var.s();
                return mf3.a;
            default:
                pa1 pa1Var = (pa1) obj;
                me1 me1Var = x73Var.d;
                if (me1Var == null) {
                    pe2Var = pe2.e;
                } else {
                    if (me1Var.p) {
                        me1Var = null;
                    }
                    if (me1Var != null) {
                        e12 e12Var = x73Var.b;
                        long j = x73Var.l().b;
                        int i2 = f93.c;
                        int iR = e12Var.r((int) (j >> 32));
                        int iR2 = x73Var.b.r((int) (x73Var.l().b & 4294967295L));
                        me1 me1Var2 = x73Var.d;
                        long jH0 = 0;
                        long jH1 = (me1Var2 == null || (pa1VarC5 = me1Var2.c()) == null) ? 0L : pa1VarC5.h0(x73Var.j(true));
                        me1 me1Var3 = x73Var.d;
                        if (me1Var3 != null && (pa1VarC4 = me1Var3.c()) != null) {
                            jH0 = pa1VarC4.h0(x73Var.j(false));
                        }
                        me1 me1Var4 = x73Var.d;
                        float fIntBitsToFloat2 = 0.0f;
                        if (me1Var4 == null || (pa1VarC3 = me1Var4.c()) == null) {
                            c = ' ';
                            fIntBitsToFloat = 0.0f;
                        } else {
                            y83 y83VarD = me1Var.d();
                            c = ' ';
                            fIntBitsToFloat = Float.intBitsToFloat((int) (pa1VarC3.h0((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(y83VarD != null ? y83VarD.a.c(iR).b : 0.0f)) & 4294967295L)) & 4294967295L));
                        }
                        me1 me1Var5 = x73Var.d;
                        if (me1Var5 != null && (pa1VarC2 = me1Var5.c()) != null) {
                            y83 y83VarD2 = me1Var.d();
                            fIntBitsToFloat2 = Float.intBitsToFloat((int) (pa1VarC2.h0((((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(y83VarD2 != null ? y83VarD2.a.c(iR2).b : 0.0f)) & 4294967295L)) & 4294967295L));
                        }
                        int i3 = (int) (jH1 >> c);
                        int i4 = (int) (jH0 >> c);
                        pe2Var = new pe2(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), (((xb0) me1Var.a.d).g() * 25.0f) + Math.max(Float.intBitsToFloat((int) (jH1 & 4294967295L)), Float.intBitsToFloat((int) (jH0 & 4294967295L))));
                    } else {
                        pe2Var = pe2.e;
                    }
                }
                me1 me1Var6 = x73Var.d;
                if (me1Var6 == null || (pa1VarC = me1Var6.c()) == null) {
                    return null;
                }
                return zm3.V(pe2Var, pa1VarC, pa1Var);
        }
    }
}
