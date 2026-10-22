package defpackage;

import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class t70 extends lb0 implements hs2 {
    public x73 A;
    public c11 B;
    public vp0 C;
    public bc3 u;
    public f83 v;
    public me1 w;
    public boolean x;
    public boolean y;
    public e12 z;

    public static void p1(me1 me1Var, String str, boolean z) {
        if (z) {
            p83 p83Var = me1Var.e;
            f70 f70Var = me1Var.v;
            if (p83Var == null) {
                int length = str.length();
                f70Var.invoke(new f83(str, g93.a(length, length), 4));
            } else {
                f83 f83VarM = me1Var.d.m(am1.G(new rb0(), new h00(str, 1)));
                p83Var.a(null, f83VarM);
                f70Var.invoke(f83VarM);
            }
        }
    }

    @Override // defpackage.hs2
    public final void J0(ss2 ss2Var) {
        boolean z = this.y;
        dj djVar = this.v.a;
        x81[] x81VarArr = qs2.a;
        rs2 rs2Var = os2.F;
        x81[] x81VarArr2 = qs2.a;
        x81 x81Var = x81VarArr2[18];
        ss2Var.a(rs2Var, djVar);
        dj djVar2 = this.u.a;
        rs2 rs2Var2 = os2.G;
        x81 x81Var2 = x81VarArr2[19];
        ss2Var.a(rs2Var2, djVar2);
        long j = this.v.b;
        rs2 rs2Var3 = os2.H;
        x81 x81Var3 = x81VarArr2[20];
        ss2Var.a(rs2Var3, new f93(j));
        zb zbVar = j9.z;
        rs2 rs2Var4 = os2.s;
        x81 x81Var4 = x81VarArr2[9];
        ss2Var.a(rs2Var4, zbVar);
        tc tcVar = new tc(AutofillValue.forText(this.v.a));
        rs2 rs2Var5 = os2.t;
        x81 x81Var5 = x81VarArr2[10];
        ss2Var.a(rs2Var5, tcVar);
        qs2.b(ss2Var, new s70(this, 0));
        int i = this.B.d;
        if (i == 6) {
            i60.a.getClass();
            ac acVar = h60.c;
            rs2 rs2Var6 = os2.r;
            x81 x81Var6 = x81VarArr2[8];
            ss2Var.a(rs2Var6, acVar);
        } else if (i == 7 || i == 8) {
            i60.a.getClass();
            ac acVar2 = h60.b;
            rs2 rs2Var7 = os2.r;
            x81 x81Var7 = x81VarArr2[8];
            ss2Var.a(rs2Var7, acVar2);
        } else if (i == 4) {
            i60.a.getClass();
            ac acVar3 = h60.d;
            rs2 rs2Var8 = os2.r;
            x81 x81Var8 = x81VarArr2[8];
            ss2Var.a(rs2Var8, acVar3);
        }
        boolean z2 = this.x;
        mf3 mf3Var = mf3.a;
        if (!z2) {
            ss2Var.a(os2.j, mf3Var);
        }
        if (z) {
            ss2Var.a(os2.L, mf3Var);
        }
        boolean z3 = this.x;
        rs2 rs2Var9 = os2.O;
        x81 x81Var9 = x81VarArr2[28];
        ss2Var.a(rs2Var9, Boolean.valueOf(z3));
        qs2.a(ss2Var, new s70(this, 1));
        if (z3) {
            ss2Var.a(ds2.k, new z0(null, new s70(this, 2)));
            ss2Var.a(ds2.o, new z0(null, new s70(this, ss2Var)));
        }
        ss2Var.a(ds2.j, new z0(null, new au(this, 1)));
        int i2 = this.B.e;
        r70 r70Var = new r70(this, 6);
        ss2Var.a(os2.I, new b11(i2));
        ss2Var.a(ds2.p, new z0(null, r70Var));
        ss2Var.a(ds2.b, new z0(null, new r70(this, 7)));
        ss2Var.a(ds2.c, new z0(null, new r70(this, 1)));
        if (!f93.c(this.v.b) && !z) {
            ss2Var.a(ds2.q, new z0(null, new r70(this, 2)));
            if (this.x) {
                ss2Var.a(ds2.r, new z0(null, new r70(this, 3)));
            }
        }
        if (this.x) {
            ss2Var.a(ds2.s, new z0(null, new r70(this, 5)));
        }
    }

    @Override // defpackage.hs2
    public final boolean M0() {
        return true;
    }
}
