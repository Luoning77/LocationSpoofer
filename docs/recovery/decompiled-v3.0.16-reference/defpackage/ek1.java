package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class ek1 extends ck1 implements zq1 {
    public final xz1 s;
    public LinkedHashMap u;
    public fr1 w;
    public final ox1 x;
    public long t = 0;
    public final fk1 v = new fk1(this);

    public ek1(xz1 xz1Var) {
        this.s = xz1Var;
        ox1 ox1Var = r02.a;
        this.x = new ox1();
    }

    @Override // defpackage.h82, defpackage.zq1
    public final Object A() {
        return this.s.A();
    }

    @Override // defpackage.xb0
    public final float D() {
        return this.s.D();
    }

    @Override // defpackage.h82
    public final void I0(long j, float f, lu0 lu0Var) {
        k1(j);
        if (this.n) {
            return;
        }
        j1();
    }

    @Override // defpackage.ck1, defpackage.g51
    public final boolean J() {
        return true;
    }

    @Override // defpackage.ck1
    public final ck1 T0() {
        xz1 xz1Var = this.s.v;
        if (xz1Var != null) {
            return xz1Var.r1();
        }
        return null;
    }

    @Override // defpackage.ck1
    public final pa1 V0() {
        return this.v;
    }

    @Override // defpackage.ck1
    public final boolean W0() {
        return this.w != null;
    }

    @Override // defpackage.ck1
    public final hb1 a1() {
        return this.s.s;
    }

    @Override // defpackage.ck1
    public final fr1 b1() {
        fr1 fr1Var = this.w;
        if (fr1Var != null) {
            return fr1Var;
        }
        throw az2.e("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // defpackage.ck1
    public final ck1 c1() {
        xz1 xz1Var = this.s.w;
        if (xz1Var != null) {
            return xz1Var.r1();
        }
        return null;
    }

    @Override // defpackage.ck1
    public final long d1() {
        return this.t;
    }

    @Override // defpackage.xb0
    public final float g() {
        return this.s.g();
    }

    @Override // defpackage.g51
    public final qa1 getLayoutDirection() {
        return this.s.s.E;
    }

    @Override // defpackage.ck1
    public final void h1() {
        I0(this.t, 0.0f, null);
    }

    public final long i1() {
        return (((long) this.e) << 32) | (((long) this.f) & 4294967295L);
    }

    public void j1() {
        b1().a();
    }

    public final void k1(long j) {
        if (!h41.a(this.t, j)) {
            this.t = j;
            xz1 xz1Var = this.s;
            ik1 ik1Var = xz1Var.s.L.q;
            if (ik1Var != null) {
                ik1Var.S0();
            }
            ck1.f1(xz1Var);
        }
        if (this.o) {
            return;
        }
        S0(b1());
    }

    public final long l1(ek1 ek1Var, boolean z) {
        long jC = 0;
        while (!this.equals(ek1Var)) {
            if (!this.m || !z) {
                jC = h41.c(jC, this.t);
            }
            xz1 xz1Var = this.s.w;
            xz1Var.getClass();
            this = xz1Var.r1();
            this.getClass();
        }
        return jC;
    }

    public final void m1(fr1 fr1Var) {
        LinkedHashMap linkedHashMap;
        if (fr1Var != null) {
            J0((((long) fr1Var.b()) & 4294967295L) | (((long) fr1Var.e()) << 32));
        } else {
            J0(0L);
        }
        if (!o51.f(this.w, fr1Var) && fr1Var != null && ((((linkedHashMap = this.u) != null && !linkedHashMap.isEmpty()) || !fr1Var.c().isEmpty()) && !o51.f(fr1Var.c(), this.u))) {
            ik1 ik1Var = this.s.s.L.q;
            ik1Var.getClass();
            ik1Var.v.f();
            LinkedHashMap linkedHashMap2 = this.u;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                this.u = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(fr1Var.c());
        }
        this.w = fr1Var;
    }
}
