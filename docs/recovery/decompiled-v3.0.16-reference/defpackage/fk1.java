package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fk1 implements pa1 {
    public final ek1 e;

    public fk1(ek1 ek1Var) {
        this.e = ek1Var;
    }

    @Override // defpackage.pa1
    public final pa1 B() {
        ek1 ek1VarR1;
        if (!U()) {
            p21.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        xz1 xz1Var = this.e.s.s.K.d.w;
        if (xz1Var == null || (ek1VarR1 = xz1Var.r1()) == null) {
            return null;
        }
        return ek1VarR1.v;
    }

    @Override // defpackage.pa1
    public final long L(pa1 pa1Var, long j) {
        return i0(pa1Var, j, true);
    }

    @Override // defpackage.pa1
    public final long T(long j) {
        return c12.e(this.e.s.T(j), a());
    }

    @Override // defpackage.pa1
    public final boolean U() {
        return this.e.s.t1().r;
    }

    @Override // defpackage.pa1
    public final void W(float[] fArr) {
        this.e.s.W(fArr);
    }

    @Override // defpackage.pa1
    public final void Z(pa1 pa1Var, float[] fArr) {
        this.e.s.Z(pa1Var, fArr);
    }

    public final long a() {
        ek1 ek1Var = this.e;
        ek1 ek1VarD = ce0.D(ek1Var);
        return c12.d(i0(ek1VarD.v, 0L, true), ek1Var.s.i0(ek1VarD.s, 0L, true));
    }

    @Override // defpackage.pa1
    public final pe2 d0(pa1 pa1Var, boolean z) {
        return this.e.s.d0(pa1Var, z);
    }

    @Override // defpackage.pa1
    public final long f0() {
        ek1 ek1Var = this.e;
        return (((long) ek1Var.e) << 32) | (((long) ek1Var.f) & 4294967295L);
    }

    @Override // defpackage.pa1
    public final long h(long j) {
        return this.e.s.h(c12.e(0L, a()));
    }

    @Override // defpackage.pa1
    public final long h0(long j) {
        return this.e.s.h0(c12.e(j, a()));
    }

    @Override // defpackage.pa1
    public final long i0(pa1 pa1Var, long j, boolean z) {
        boolean z2 = pa1Var instanceof fk1;
        ek1 ek1Var = this.e;
        if (!z2) {
            ek1 ek1VarD = ce0.D(ek1Var);
            xz1 xz1Var = ek1VarD.s;
            long jI0 = i0(ek1VarD.v, j, z);
            long j2 = ek1VarD.t;
            long jD = c12.d(jI0, (4294967295L & ((long) Float.floatToRawIntBits((int) (j2 & 4294967295L)))) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32));
            if (!xz1Var.t1().r) {
                p21.c("LayoutCoordinate operations are only valid when isAttached is true");
            }
            xz1Var.C1();
            xz1 xz1Var2 = xz1Var.w;
            if (xz1Var2 != null) {
                xz1Var = xz1Var2;
            }
            return c12.e(jD, xz1Var.i0(pa1Var, 0L, z));
        }
        ek1 ek1Var2 = ((fk1) pa1Var).e;
        xz1 xz1Var3 = ek1Var2.s;
        xz1Var3.C1();
        ek1 ek1VarR1 = ek1Var.s.p1(xz1Var3).r1();
        if (ek1VarR1 != null) {
            boolean z3 = !z;
            long jB = h41.b(h41.c(ek1Var2.l1(ek1VarR1, z3), gh0.O(j)), ek1Var.l1(ek1VarR1, z3));
            return (((long) Float.floatToRawIntBits((int) (jB >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jB & 4294967295L))) & 4294967295L);
        }
        ek1 ek1VarD2 = ce0.D(ek1Var2);
        boolean z4 = !z;
        long jC = h41.c(h41.c(ek1Var2.l1(ek1VarD2, z4), ek1VarD2.t), gh0.O(j));
        ek1 ek1VarD3 = ce0.D(ek1Var);
        long jB2 = h41.b(jC, h41.c(ek1Var.l1(ek1VarD3, z4), ek1VarD3.t));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jB2 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jB2 & 4294967295L))) & 4294967295L;
        xz1 xz1Var4 = ek1VarD3.s.w;
        xz1Var4.getClass();
        xz1 xz1Var5 = ek1VarD2.s.w;
        xz1Var5.getClass();
        return xz1Var4.i0(xz1Var5, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), z);
    }

    @Override // defpackage.pa1
    public final long x(long j) {
        return c12.e(this.e.s.x(j), a());
    }

    @Override // defpackage.pa1
    public final long z(long j) {
        return this.e.s.z(c12.e(j, a()));
    }
}
