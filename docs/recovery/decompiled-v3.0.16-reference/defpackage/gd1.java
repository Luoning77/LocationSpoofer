package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class gd1 extends cv1 implements hs2 {
    public au0 s;
    public bd1 t;
    public x32 u;
    public boolean v;
    public on2 w;
    public final dd1 x = new dd1(this, 0);
    public dd1 y;

    public gd1(au0 au0Var, bd1 bd1Var, x32 x32Var, boolean z) {
        this.s = au0Var;
        this.t = bd1Var;
        this.u = x32Var;
        this.v = z;
        m1();
    }

    @Override // defpackage.hs2
    public final void J0(ss2 ss2Var) {
        x81[] x81VarArr;
        qs2.f(ss2Var);
        ss2Var.a(os2.N, this.x);
        x32 x32Var = this.u;
        on2 on2Var = this.w;
        if (x32Var == x32.e) {
            if (on2Var == null) {
                o51.F("scrollAxisRange");
                throw null;
            }
            rs2 rs2Var = os2.w;
            x81VarArr = qs2.a;
            x81 x81Var = x81VarArr[13];
            ss2Var.a(rs2Var, on2Var);
        } else {
            if (on2Var == null) {
                o51.F("scrollAxisRange");
                throw null;
            }
            rs2 rs2Var2 = os2.v;
            x81VarArr = qs2.a;
            x81 x81Var2 = x81VarArr[12];
            ss2Var.a(rs2Var2, on2Var);
        }
        dd1 dd1Var = this.y;
        if (dd1Var != null) {
            ss2Var.a(ds2.f, new z0(null, dd1Var));
        }
        ss2Var.a(ds2.C, new z0(null, new q9(new ed1(this, 2), 23)));
        bd1 bd1Var = this.t;
        boolean z = bd1Var.c;
        fc0 fc0Var = bd1Var.a;
        py pyVar = z ? new py(((Number) fc0Var.getValue()).intValue(), 1) : new py(1, ((Number) fc0Var.getValue()).intValue());
        rs2 rs2Var3 = os2.f;
        x81 x81Var3 = x81VarArr[24];
        ss2Var.a(rs2Var3, pyVar);
    }

    @Override // defpackage.cv1
    public final boolean b1() {
        return false;
    }

    public final void m1() {
        this.w = new on2(new ed1(this, 0), new ed1(this, 1));
        this.y = this.v ? new dd1(this, 1) : null;
    }
}
