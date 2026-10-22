package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class h52 extends cv1 implements ya1, hg0 {
    public f52 s;
    public boolean t;
    public l9 u;
    public c30 v;
    public float w;
    public rr x;

    public static boolean n1(long j) {
        return !cw2.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean o1(long j) {
        return !cw2.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // defpackage.ya1
    public final int F(ck1 ck1Var, zq1 zq1Var, int i) {
        if (!m1()) {
            return zq1Var.w(i);
        }
        long jP1 = p1(m50.b(0, i, 0, 0, 13));
        return Math.max(l50.i(jP1), zq1Var.w(i));
    }

    @Override // defpackage.ya1
    public final int W(ck1 ck1Var, zq1 zq1Var, int i) {
        if (!m1()) {
            return zq1Var.u0(i);
        }
        long jP1 = p1(m50.b(0, i, 0, 0, 13));
        return Math.max(l50.i(jP1), zq1Var.u0(i));
    }

    @Override // defpackage.cv1
    public final boolean b1() {
        return false;
    }

    @Override // defpackage.hg0
    public final void j0(jb1 jb1Var) {
        xv xvVar = jb1Var.e;
        long jD = this.s.d();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(o1(jD) ? Float.intBitsToFloat((int) (jD >> 32)) : Float.intBitsToFloat((int) (xvVar.a() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(n1(jD) ? Float.intBitsToFloat((int) (jD & 4294967295L)) : Float.intBitsToFloat((int) (xvVar.a() & 4294967295L)))) & 4294967295L);
        long jM = (Float.intBitsToFloat((int) (xvVar.a() >> 32)) == 0.0f || Float.intBitsToFloat((int) (xvVar.a() & 4294967295L)) == 0.0f) ? 0L : ld0.M(jFloatToRawIntBits, this.v.b(jFloatToRawIntBits, xvVar.a()));
        long jA = this.u.a((((long) Math.round(Float.intBitsToFloat((int) (jM >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jM & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (xvVar.a() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (xvVar.a() & 4294967295L)))) & 4294967295L), jb1Var.getLayoutDirection());
        float f = (int) (jA >> 32);
        float f2 = (int) (jA & 4294967295L);
        ((t1) xvVar.f.a).D(f, f2);
        try {
            this.s.c(jb1Var, jM, this.w, this.x);
            ((t1) xvVar.f.a).D(-f, -f2);
            jb1Var.c();
        } catch (Throwable th) {
            ((t1) xvVar.f.a).D(-f, -f2);
            throw th;
        }
    }

    public final boolean m1() {
        return this.t && this.s.d() != 9205357640488583168L;
    }

    @Override // defpackage.ya1
    public final int p0(ck1 ck1Var, zq1 zq1Var, int i) {
        if (!m1()) {
            return zq1Var.j0(i);
        }
        long jP1 = p1(m50.b(0, 0, 0, i, 7));
        return Math.max(l50.j(jP1), zq1Var.j0(i));
    }

    public final long p1(long j) {
        boolean z = false;
        boolean z2 = l50.d(j) && l50.c(j);
        if (l50.f(j) && l50.e(j)) {
            z = true;
        }
        if ((!m1() && z2) || z) {
            return l50.a(j, l50.h(j), 0, l50.g(j), 0, 10);
        }
        long jD = this.s.d();
        int iRound = o1(jD) ? Math.round(Float.intBitsToFloat((int) (jD >> 32))) : l50.j(j);
        int iRound2 = n1(jD) ? Math.round(Float.intBitsToFloat((int) (jD & 4294967295L))) : l50.i(j);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(m50.f(iRound2, j))) & 4294967295L) | (((long) Float.floatToRawIntBits(m50.g(iRound, j))) << 32);
        if (m1()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!o1(this.s.d()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.s.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!n1(this.s.d()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.s.d() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : ld0.M(jFloatToRawIntBits2, this.v.b(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return l50.a(j, m50.g(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j), 0, m50.f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j), 0, 10);
    }

    @Override // defpackage.ya1
    public final fr1 s(gr1 gr1Var, zq1 zq1Var, long j) {
        h82 h82VarS = zq1Var.s(p1(j));
        return gr1Var.H0(h82VarS.e, h82VarS.f, vj0.e, new oa(h82VarS, 5));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.s + ", sizeToIntrinsics=" + this.t + ", alignment=" + this.u + ", alpha=" + this.w + ", colorFilter=" + this.x + ')';
    }

    @Override // defpackage.ya1
    public final int x(ck1 ck1Var, zq1 zq1Var, int i) {
        if (!m1()) {
            return zq1Var.s0(i);
        }
        long jP1 = p1(m50.b(0, 0, 0, i, 7));
        return Math.max(l50.j(jP1), zq1Var.s0(i));
    }
}
