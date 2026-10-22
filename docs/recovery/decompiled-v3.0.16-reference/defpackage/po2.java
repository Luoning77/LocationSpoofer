package defpackage;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class po2 extends kf0 implements i91, hs2 {
    public o42 N;
    public ka0 O;
    public final dz1 P;
    public final ka0 Q;
    public final wo2 R;
    public final e30 S;
    public final dq0 T;
    public final a60 U;
    public s5 V;
    public no2 W;
    public dw1 X;
    public ub3 Y;

    public po2(ka0 ka0Var, ix1 ix1Var, x32 x32Var, o42 o42Var, qo2 qo2Var, boolean z, boolean z2) {
        super(jo2.a, z, ix1Var, x32Var);
        this.N = o42Var;
        this.O = ka0Var;
        dz1 dz1Var = new dz1();
        this.P = dz1Var;
        ka0 ka0Var2 = new ka0(new u90(new us1(jo2.d)));
        this.Q = ka0Var2;
        o42 o42Var2 = this.N;
        ka0 ka0Var3 = this.O;
        wo2 wo2Var = new wo2(qo2Var, o42Var2, ka0Var3 == null ? ka0Var2 : ka0Var3, x32Var, z2, dz1Var, this, new lo2(this, 0));
        this.R = wo2Var;
        e30 e30Var = new e30(wo2Var, z);
        this.S = e30Var;
        dq0 dq0Var = new dq0(2, null, 10);
        m1(dq0Var);
        this.T = dq0Var;
        a60 a60Var = new a60(x32Var, wo2Var, z2, new lo2(this, 1));
        m1(a60Var);
        this.U = a60Var;
        m1(new hz1(e30Var, dz1Var));
        lt ltVar = new lt();
        ltVar.s = a60Var;
        m1(ltVar);
    }

    @Override // defpackage.i91
    public final boolean C(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.kf0
    public final boolean E1() {
        wo2 wo2Var = this.R;
        if (wo2Var.a.b()) {
            return true;
        }
        o42 o42Var = wo2Var.b;
        return o42Var != null ? o42Var.b() : false;
    }

    public final void H1(ka0 ka0Var, ix1 ix1Var, x32 x32Var, o42 o42Var, qo2 qo2Var, boolean z, boolean z2) {
        boolean z3;
        boolean z4 = true;
        boolean z5 = false;
        if (this.w != z) {
            this.S.e = z;
            z3 = true;
        } else {
            z3 = false;
        }
        ka0 ka0Var2 = ka0Var == null ? this.Q : ka0Var;
        wo2 wo2Var = this.R;
        if (!o51.f(wo2Var.a, qo2Var)) {
            wo2Var.a = qo2Var;
            z5 = true;
        }
        wo2Var.b = o42Var;
        x32 x32Var2 = wo2Var.d;
        if (x32Var2 != x32Var) {
            wo2Var.d = x32Var;
            x32Var2 = x32Var;
            z5 = true;
        }
        if (wo2Var.e != z2) {
            wo2Var.e = z2;
        } else {
            z4 = z5;
        }
        wo2Var.c = ka0Var2;
        wo2Var.f = this.P;
        a60 a60Var = this.U;
        a60Var.s = x32Var;
        a60Var.u = z2;
        this.N = o42Var;
        this.O = ka0Var;
        ym2 ym2Var = jo2.a;
        x32 x32Var3 = x32.e;
        if (x32Var2 != x32Var3) {
            x32Var3 = x32.f;
        }
        G1(ym2Var, z, ix1Var, x32Var3, z4);
        if (z3) {
            this.V = null;
            this.W = null;
            ee0.C(this);
        }
    }

    @Override // defpackage.hs2
    public final void J0(ss2 ss2Var) {
        if (this.w && (this.V == null || this.W == null)) {
            this.V = new s5(this, 25);
            this.W = new no2(this, null);
        }
        s5 s5Var = this.V;
        if (s5Var != null) {
            x81[] x81VarArr = qs2.a;
            ss2Var.a(ds2.d, new z0(null, s5Var));
        }
        no2 no2Var = this.W;
        if (no2Var != null) {
            x81[] x81VarArr2 = qs2.a;
            ss2Var.a(ds2.e, no2Var);
        }
    }

    @Override // defpackage.cv1
    public final boolean b1() {
        return false;
    }

    @Override // defpackage.kb0
    public final void c() {
        K0();
        if (this.r) {
            xb0 xb0Var = xp1.O(this).D;
            ka0 ka0Var = this.Q;
            ka0Var.getClass();
            ka0Var.a = new u90(new us1(xb0Var));
        }
        dw1 dw1Var = this.X;
        if (dw1Var != null) {
            dw1Var.c = xp1.O(this).D;
        }
        ub3 ub3Var = this.Y;
        if (ub3Var != null) {
            ub3Var.c = xp1.O(this).D;
        }
    }

    @Override // defpackage.kf0, defpackage.ba2
    public final void d0(p92 p92Var, q92 q92Var, long j) {
        q92 q92Var2;
        int i;
        int i2;
        List list = p92Var.a;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((Boolean) this.v.invoke(new ga2(((x92) list.get(i3)).i))).booleanValue()) {
                super.d0(p92Var, q92Var, j);
                break;
            }
        }
        if (this.y == null) {
            zv0 zv0Var = new zv0(this);
            m1(zv0Var);
            this.y = zv0Var;
        }
        if (this.w) {
            q92 q92Var3 = q92.e;
            q60 q60Var = null;
            wo2 wo2Var = this.R;
            if (q92Var == q92Var3 && p92Var.f == 6) {
                dw1 dw1Var = this.X;
                int i4 = 3;
                if (dw1Var == null) {
                    i2 = 3;
                    dw1 dw1Var2 = new dw1(wo2Var, new t1(ViewConfiguration.get(xq1.N(this).getContext()), i4), new o10(2, this, po2.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 1), xp1.O(this).D);
                    this.X = dw1Var2;
                    dw1Var = dw1Var2;
                } else {
                    i2 = 3;
                }
                CoroutineScope coroutineScopeA1 = a1();
                if (dw1Var.h == null) {
                    dw1Var.h = BuildersKt__Builders_commonKt.launch$default(coroutineScopeA1, null, null, new wr1(dw1Var, q60Var, i2), 3, null);
                }
            }
            dw1 dw1Var3 = this.X;
            q92 q92Var4 = q92.f;
            if (dw1Var3 == null || p92Var.f != 6) {
                q92Var2 = q92Var;
                break;
            }
            int size2 = list.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size2) {
                    q92Var2 = q92Var;
                    if (q92Var2 == q92Var3 && dw1Var3.d) {
                        dw1Var3.f(p92Var);
                        e02.a(p92Var);
                    }
                    if (q92Var2 != q92Var4 || dw1Var3.d || !dw1Var3.f(p92Var)) {
                        break;
                        break;
                        break;
                    } else {
                        e02.a(p92Var);
                        break;
                    }
                }
                if (((x92) list.get(i5)).b()) {
                    q92Var2 = q92Var;
                    break;
                }
                i5++;
            }
            if (q92Var2 == q92Var3 && ((i = p92Var.f) == 10 || i == 11 || i == 12)) {
                ub3 ub3Var = this.Y;
                if (ub3Var == null) {
                    ub3 ub3Var2 = new ub3(wo2Var, new o10(2, this, po2.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4, 2), xp1.O(this).D);
                    this.Y = ub3Var2;
                    ub3Var = ub3Var2;
                }
                CoroutineScope coroutineScopeA2 = a1();
                if (ub3Var.g == null) {
                    ub3Var.g = BuildersKt__Builders_commonKt.launch$default(coroutineScopeA2, null, null, new t3(ub3Var, q60Var, 17), 3, null);
                }
            }
            ub3 ub3Var3 = this.Y;
            if (ub3Var3 != null) {
                int i6 = p92Var.f;
                if (i6 == 10 || i6 == 11 || i6 == 12) {
                    int size3 = list.size();
                    for (int i7 = 0; i7 < size3; i7++) {
                        if (((x92) list.get(i7)).b()) {
                            return;
                        }
                    }
                    if (q92Var2 == q92Var3 && ub3Var3.d) {
                        ub3Var3.d(p92Var);
                        e02.a(p92Var);
                    }
                    if (q92Var2 == q92Var4 && !ub3Var3.d && ub3Var3.d(p92Var)) {
                        e02.a(p92Var);
                    }
                }
            }
        }
    }

    @Override // defpackage.cv1
    public final void e1() {
        if (this.r) {
            xb0 xb0Var = xp1.O(this).D;
            ka0 ka0Var = this.Q;
            ka0Var.getClass();
            ka0Var.a = new u90(new us1(xb0Var));
        }
        dw1 dw1Var = this.X;
        if (dw1Var != null) {
            dw1Var.c = xp1.O(this).D;
        }
        ub3 ub3Var = this.Y;
        if (ub3Var != null) {
            ub3Var.c = xp1.O(this).D;
        }
    }

    @Override // defpackage.kf0
    public final Object q1(jf0 jf0Var, jf0 jf0Var2) {
        wo2 wo2Var = this.R;
        Object objF = wo2Var.f(jy1.f, new m(jf0Var, wo2Var, null, 23), jf0Var2);
        return objF == z70.e ? objF : mf3.a;
    }

    @Override // defpackage.i91
    public final boolean s0(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        if (!this.w || ((!c91.a(mh0.I(keyEvent), c91.D) && !c91.a(hd0.e(keyEvent.getKeyCode()), c91.C)) || mh0.L(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z = this.R.d == x32.e;
        a60 a60Var = this.U;
        if (z) {
            int iN1 = (int) (a60Var.n1() & 4294967295L);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(c91.a(hd0.e(keyEvent.getKeyCode()), c91.C) ? iN1 : -iN1)));
        } else {
            int iN2 = (int) (a60Var.n1() >> 32);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(c91.a(hd0.e(keyEvent.getKeyCode()), c91.C) ? iN2 : -iN2)) << 32);
        }
        BuildersKt__Builders_commonKt.launch$default(a1(), null, null, new no2(this, jFloatToRawIntBits, null, 0), 3, null);
        return true;
    }

    @Override // defpackage.kf0
    public final void w1(oe0 oe0Var) {
        BuildersKt__Builders_commonKt.launch$default(this.P.c(), null, null, new wr1(oe0Var, this, null, 9), 3, null);
    }

    @Override // defpackage.kf0
    public final void v1(long j) {
    }
}
