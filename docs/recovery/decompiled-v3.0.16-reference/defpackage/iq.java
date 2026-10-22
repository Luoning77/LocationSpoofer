package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.List;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class iq extends cv1 implements ya1, hg0, hs2, ba2, fv1, y52, na1, aw0, fp0, up0, xp0, u42, fu {
    public bv1 s;

    @Override // defpackage.fv1
    public final ig0 B() {
        return wj0.g;
    }

    @Override // defpackage.ya1
    public final int F(ck1 ck1Var, zq1 zq1Var, int i) {
        bv1 bv1Var = this.s;
        bv1Var.getClass();
        return ((wa1) bv1Var).s(new v51(ck1Var, ck1Var.getLayoutDirection()), new oa0(zq1Var, ir1.f, jr1.f, 1), m50.b(0, i, 0, 0, 13)).b();
    }

    @Override // defpackage.hs2
    public final void J0(ss2 ss2Var) {
        bv1 bv1Var = this.s;
        bv1Var.getClass();
        es2 es2VarE = ((fs2) bv1Var).e();
        ss2Var.getClass();
        es2 es2Var = (es2) ss2Var;
        zx1 zx1Var = es2Var.e;
        if (es2VarE.g) {
            es2Var.g = true;
        }
        if (es2VarE.h) {
            es2Var.h = true;
        }
        zx1 zx1Var2 = es2VarE.e;
        Object[] objArr = zx1Var2.b;
        Object[] objArr2 = zx1Var2.c;
        long[] jArr = zx1Var2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        rs2 rs2Var = (rs2) obj;
                        if (!zx1Var.b(rs2Var)) {
                            zx1Var.m(rs2Var, obj2);
                        } else if (obj2 instanceof z0) {
                            Object objG = zx1Var.g(rs2Var);
                            objG.getClass();
                            z0 z0Var = (z0) objG;
                            String str = z0Var.a;
                            if (str == null) {
                                str = ((z0) obj2).a;
                            }
                            xu0 xu0Var = z0Var.b;
                            if (xu0Var == null) {
                                xu0Var = ((z0) obj2).b;
                            }
                            zx1Var.m(rs2Var, new z0(str, xu0Var));
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.ba2
    public final void K0() {
        bv1 bv1Var = this.s;
        bv1Var.getClass();
        mn2 mn2Var = ((ea2) bv1Var).d;
        da2 da2Var = (da2) mn2Var.f;
        ea2 ea2Var = (ea2) mn2Var.h;
        if (da2Var == da2.f) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            ((yg) ea2Var.f()).invoke(motionEventObtain);
            motionEventObtain.recycle();
            mn2Var.f = da2.e;
            ea2Var.c = false;
            mn2Var.g = null;
        }
    }

    @Override // defpackage.aw0
    public final void L(xz1 xz1Var) {
        this.s.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.u42
    public final boolean S() {
        return this.r;
    }

    @Override // defpackage.hg0
    public final void S0() {
        ig0.z(this);
    }

    @Override // defpackage.ba2
    public final void T0() {
        bv1 bv1Var = this.s;
        bv1Var.getClass();
        ((ea2) bv1Var).d.getClass();
    }

    @Override // defpackage.ya1
    public final int W(ck1 ck1Var, zq1 zq1Var, int i) {
        bv1 bv1Var = this.s;
        bv1Var.getClass();
        return ((wa1) bv1Var).s(new v51(ck1Var, ck1Var.getLayoutDirection()), new oa0(zq1Var, ir1.e, jr1.f, 1), m50.b(0, i, 0, 0, 13)).b();
    }

    @Override // defpackage.y52
    public final Object Z(xb0 xb0Var, Object obj) {
        bv1 bv1Var = this.s;
        bv1Var.getClass();
        return ((x52) bv1Var).c();
    }

    @Override // defpackage.fu
    public final long a() {
        return mc0.J(xp1.L(this, WorkQueueKt.BUFFER_CAPACITY).g);
    }

    @Override // defpackage.kb0
    public final void c() {
        if (this.s instanceof ea2) {
            K0();
        }
    }

    @Override // defpackage.ba2
    public final void d0(p92 p92Var, q92 q92Var, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        bv1 bv1Var = this.s;
        bv1Var.getClass();
        mn2 mn2Var = ((ea2) bv1Var).d;
        ea2 ea2Var = (ea2) mn2Var.h;
        List list = p92Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            }
            x92 x92Var = (x92) list.get(i);
            if (mh0.p(x92Var) || mh0.r(x92Var)) {
                z = false;
                break;
            }
            i++;
        }
        if (!z) {
            z2 = false;
            break;
        }
        int size2 = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                z2 = true;
                break;
            } else {
                if (((x92) list.get(i2)).b()) {
                    z2 = false;
                    break;
                }
                i2++;
            }
        }
        if (ea2Var.c) {
            z3 = true;
            break;
        }
        int size3 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                if (!z2) {
                    z3 = false;
                    break;
                }
                break;
            } else {
                x92 x92Var2 = (x92) list.get(i3);
                if (!mh0.p(x92Var2) && !mh0.r(x92Var2)) {
                    i3++;
                }
            }
            z3 = true;
            break;
        }
        da2 da2Var = (da2) mn2Var.f;
        da2 da2Var2 = da2.g;
        q92 q92Var2 = q92.g;
        if (da2Var != da2Var2) {
            if (q92Var == q92.e && z3) {
                mn2Var.g = p92Var;
                mn2Var.c(p92Var, !z || ea2Var.c);
            }
            if (q92Var == q92.f && z && p92Var == ((p92) mn2Var.g) && ea2Var.c) {
                int size4 = list.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((x92) list.get(i4)).a();
                }
            }
            if (q92Var == q92Var2 && !z3 && p92Var != ((p92) mn2Var.g)) {
                mn2Var.c(p92Var, true);
            }
        }
        if (q92Var == q92Var2) {
            int size5 = list.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    mn2Var.f = da2.e;
                    ((ea2) mn2Var.h).c = false;
                    mn2Var.g = null;
                    break;
                } else if (!mh0.r((x92) list.get(i5))) {
                    break;
                } else {
                    i5++;
                }
            }
            if (p92Var == ((p92) mn2Var.g) && z) {
                int size6 = list.size();
                for (int i6 = 0; i6 < size6; i6++) {
                    if (((x92) list.get(i6)).b()) {
                        if (ea2Var.c) {
                            break;
                        }
                        mn2Var.s(p92Var);
                        return;
                    }
                }
                int size7 = list.size();
                for (int i7 = 0; i7 < size7; i7++) {
                    ((x92) list.get(i7)).a();
                }
            }
        }
    }

    @Override // defpackage.cv1
    public final void e1() {
        m1(true);
    }

    @Override // defpackage.cv1
    public final void f1() {
        if (!this.r) {
            p21.c("unInitializeModifier called on unattached node");
        }
        if ((this.g & 8) != 0) {
            ((db) xp1.P(this)).y();
        }
    }

    @Override // defpackage.fu
    public final xb0 g() {
        return xp1.O(this).D;
    }

    @Override // defpackage.fu
    public final qa1 getLayoutDirection() {
        return xp1.O(this).E;
    }

    @Override // defpackage.hg0
    public final void j0(jb1 jb1Var) {
        bv1 bv1Var = this.s;
        bv1Var.getClass();
        jb1Var.c();
    }

    public final void m1(boolean z) {
        if (!this.r) {
            p21.c("initializeModifier called on unattached node");
        }
        bv1 bv1Var = this.s;
        if ((this.g & 4) != 0 && !z) {
            xp1.L(this, 2).A1();
        }
        if ((this.g & 2) != 0) {
            v43 v43Var = xp1.O(this).K.e;
            v43Var.getClass();
            if (v43Var.s) {
                xz1 xz1Var = this.l;
                xz1Var.getClass();
                ((bb1) xz1Var).V1(this);
                s42 s42Var = xz1Var.R;
                if (s42Var != null) {
                    ((nw0) s42Var).c();
                }
            }
            if (!z) {
                xp1.L(this, 2).A1();
                xp1.O(this).D();
            }
        }
        if (bv1Var instanceof vd1) {
            ((vd1) bv1Var).a.l = xp1.O(this);
        }
        int i = this.g;
        if ((i & 16) != 0 && (bv1Var instanceof ea2)) {
            ((ea2) bv1Var).d.e = this.l;
        }
        if ((i & 8) != 0) {
            ((db) xp1.P(this)).y();
        }
    }

    @Override // defpackage.ya1
    public final int p0(ck1 ck1Var, zq1 zq1Var, int i) {
        bv1 bv1Var = this.s;
        bv1Var.getClass();
        return ((wa1) bv1Var).s(new v51(ck1Var, ck1Var.getLayoutDirection()), new oa0(zq1Var, ir1.e, jr1.e, 1), m50.b(0, 0, 0, i, 7)).e();
    }

    @Override // defpackage.up0
    public final void r0(sp0 sp0Var) {
        bv1 bv1Var = this.s;
        p21.c("applyFocusProperties called on wrong node");
        bv1Var.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.ya1
    public final fr1 s(gr1 gr1Var, zq1 zq1Var, long j) {
        bv1 bv1Var = this.s;
        bv1Var.getClass();
        return ((wa1) bv1Var).s(gr1Var, zq1Var, j);
    }

    public final String toString() {
        return this.s.toString();
    }

    @Override // defpackage.fp0
    public final void u0(zp0 zp0Var) {
        bv1 bv1Var = this.s;
        p21.c("onFocusEvent called on wrong node");
        bv1Var.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.ya1
    public final int x(ck1 ck1Var, zq1 zq1Var, int i) {
        bv1 bv1Var = this.s;
        bv1Var.getClass();
        return ((wa1) bv1Var).s(new v51(ck1Var, ck1Var.getLayoutDirection()), new oa0(zq1Var, ir1.f, jr1.e, 1), m50.b(0, 0, 0, i, 7)).e();
    }

    @Override // defpackage.ba2
    public final boolean x0() {
        bv1 bv1Var = this.s;
        bv1Var.getClass();
        ((ea2) bv1Var).d.getClass();
        return true;
    }

    @Override // defpackage.na1
    public final void G(pa1 pa1Var) {
    }

    @Override // defpackage.na1, defpackage.hr1
    public final void h(long j) {
    }
}
