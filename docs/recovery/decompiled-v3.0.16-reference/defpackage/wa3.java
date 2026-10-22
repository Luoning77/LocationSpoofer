package defpackage;

import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wa3 extends wx {
    public boolean R;
    public lu0 S;
    public final ol2 T;

    public wa3(boolean z, ix1 ix1Var, boolean z2, boolean z3, vh2 vh2Var, lu0 lu0Var) {
        super(ix1Var, null, z2, z3, null, vh2Var, new xw(lu0Var, z, 2));
        this.R = z;
        this.S = lu0Var;
        this.T = new ol2(this, 15);
    }

    @Override // defpackage.s
    public final void p1(ss2 ss2Var) {
        qs2.e(ss2Var, g93.b(this.R));
        zb zbVar = j9.A;
        rs2 rs2Var = os2.s;
        x81[] x81VarArr = qs2.a;
        x81 x81Var = x81VarArr[9];
        ss2Var.a(rs2Var, zbVar);
        tc tcVar = new tc(AutofillValue.forToggle(this.R));
        rs2 rs2Var2 = os2.t;
        x81 x81Var2 = x81VarArr[10];
        ss2Var.a(rs2Var2, tcVar);
        qs2.b(ss2Var, new va3(ss2Var, 0));
    }
}
