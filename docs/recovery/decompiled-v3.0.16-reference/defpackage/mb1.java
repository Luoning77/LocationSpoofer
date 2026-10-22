package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mb1 implements h23, gr1 {
    public final /* synthetic */ pb1 e;
    public final /* synthetic */ vb1 f;

    public mb1(vb1 vb1Var) {
        this.f = vb1Var;
        this.e = vb1Var.l;
    }

    @Override // defpackage.xb0
    public final long A0(long j) {
        return this.e.A0(j);
    }

    @Override // defpackage.xb0
    public final float D() {
        return this.e.g;
    }

    @Override // defpackage.xb0
    public final float G0(long j) {
        return this.e.G0(j);
    }

    @Override // defpackage.gr1
    public final fr1 H0(int i, int i2, Map map, lu0 lu0Var) {
        return this.e.m0(i, i2, map, null, lu0Var);
    }

    @Override // defpackage.g51
    public final boolean J() {
        return this.e.J();
    }

    @Override // defpackage.xb0
    public final long O(float f) {
        return this.e.O(f);
    }

    @Override // defpackage.xb0
    public final long P(long j) {
        return this.e.P(j);
    }

    @Override // defpackage.xb0
    public final long Q0(float f) {
        return this.e.Q0(f);
    }

    @Override // defpackage.xb0
    public final float R(float f) {
        return this.e.g() * f;
    }

    @Override // defpackage.xb0
    public final float U0(int i) {
        return this.e.U0(i);
    }

    @Override // defpackage.xb0
    public final float X0(float f) {
        return f / this.e.g();
    }

    @Override // defpackage.xb0
    public final float e0(long j) {
        return this.e.e0(j);
    }

    @Override // defpackage.xb0
    public final float g() {
        return this.e.f;
    }

    @Override // defpackage.g51
    public final qa1 getLayoutDirection() {
        return this.e.e;
    }

    @Override // defpackage.gr1
    public final fr1 m0(int i, int i2, Map map, lu0 lu0Var, lu0 lu0Var2) {
        return this.e.m0(i, i2, map, lu0Var, lu0Var2);
    }

    @Override // defpackage.xb0
    public final int n0(float f) {
        return this.e.n0(f);
    }

    @Override // defpackage.h23
    public final List z0(Object obj, pu0 pu0Var) {
        vb1 vb1Var = this.f;
        hb1 hb1Var = vb1Var.e;
        zx1 zx1Var = vb1Var.k;
        hb1 hb1Var2 = (hb1) zx1Var.g(obj);
        if (hb1Var2 != null && ((gy1) ((qx1) hb1Var.o()).f).i(hb1Var2) < vb1Var.h) {
            return hb1Var2.m();
        }
        zx1 zx1Var2 = vb1Var.p;
        zx1 zx1Var3 = vb1Var.n;
        gy1 gy1Var = vb1Var.q;
        if (gy1Var.g < vb1Var.i) {
            p21.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        hb1 hb1Var3 = (hb1) zx1Var.g(obj);
        int i = gy1Var.g;
        int i2 = vb1Var.i;
        if (i == i2) {
            gy1Var.b(obj);
        } else {
            Object[] objArr = gy1Var.e;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        vb1Var.i++;
        boolean zB = zx1Var3.b(obj);
        if (zB || hb1Var3 != null) {
            if (!zB && hb1Var3 != null) {
                vb1Var.j(((gy1) ((qx1) hb1Var.o()).f).i(hb1Var3), ((gy1) ((qx1) hb1Var.o()).f).g);
                vb1Var.s++;
                zx1Var.k(obj);
                zx1Var3.m(obj, hb1Var3);
                zx1Var2.m(obj, vb1Var.c(obj));
                if (hb1Var.G()) {
                    vb1Var.g();
                }
            }
            hb1 hb1Var4 = (hb1) zx1Var3.g(obj);
            nb1 nb1Var = hb1Var4 != null ? (nb1) vb1Var.j.g(hb1Var4) : null;
            if (nb1Var != null && nb1Var.d) {
                vb1Var.m(hb1Var4, obj, false, pu0Var);
            }
            if ((nb1Var != null ? nb1Var.f : null) != null) {
                vb1Var.a(nb1Var, true);
            }
        } else {
            vb1Var.k(obj, pu0Var, false);
            zx1Var2.m(obj, vb1Var.c(obj));
        }
        hb1 hb1Var5 = (hb1) zx1Var3.g(obj);
        if (hb1Var5 == null) {
            return uj0.e;
        }
        List listL0 = hb1Var5.L.p.L0();
        qx1 qx1Var = (qx1) listL0;
        int i3 = ((gy1) qx1Var.f).g;
        for (int i4 = 0; i4 < i3; i4++) {
            ((dr1) qx1Var.get(i4)).j.b = true;
        }
        return listL0;
    }
}
