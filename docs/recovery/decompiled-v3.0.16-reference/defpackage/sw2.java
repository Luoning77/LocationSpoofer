package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class sw2 {
    public static final sw2 a = new sw2();
    public static final float b;
    public static final float c;
    public static final re d;

    static {
        float f = k22.N;
        b = f;
        c = f;
        d = ue.a();
    }

    public static mw2 d(long j, long j2, long j3, ov0 ov0Var, int i) {
        long j4 = hz.g;
        long j5 = (i & 8) != 0 ? j4 : j3;
        mw2 mw2VarF = f((kz) ov0Var.j(mz.a));
        long j6 = j != 16 ? j : mw2VarF.a;
        long j7 = j2 != 16 ? j2 : mw2VarF.b;
        long j8 = j4 != 16 ? j4 : mw2VarF.c;
        if (j5 == 16) {
            j5 = mw2VarF.d;
        }
        long j9 = j5;
        long j10 = j4 != 16 ? j4 : mw2VarF.e;
        long j11 = j4 != 16 ? j4 : mw2VarF.f;
        long j12 = j4 != 16 ? j4 : mw2VarF.g;
        long j13 = j4 != 16 ? j4 : mw2VarF.h;
        long j14 = j4 != 16 ? j4 : mw2VarF.i;
        if (j4 == 16) {
            j4 = mw2VarF.j;
        }
        return new mw2(j6, j7, j8, j9, j10, j11, j12, j13, j14, j4);
    }

    public static void e(jg0 jg0Var, x32 x32Var, long j, long j2, long j3, float f, float f2) {
        aj2 aj2Var;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
        if (x32Var == x32.e) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            pe2 pe2VarD = ce0.d(j, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
            aj2Var = new aj2(pe2VarD.a, pe2VarD.b, pe2VarD.c, pe2VarD.d, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2);
        } else {
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 >> 32));
            pe2 pe2VarD2 = ce0.d(j, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32));
            aj2Var = new aj2(pe2VarD2.a, pe2VarD2.b, pe2VarD2.c, pe2VarD2.d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits);
        }
        re reVar = d;
        re.c(reVar, aj2Var);
        jg0.O0(jg0Var, reVar, j3, null, 60);
        reVar.h();
    }

    public static mw2 f(kz kzVar) {
        mw2 mw2Var = kzVar.g0;
        if (mw2Var != null) {
            return mw2Var;
        }
        long jC = mz.c(kzVar, k22.H);
        lz lzVar = k22.A;
        long jC2 = mz.c(kzVar, lzVar);
        lz lzVar2 = k22.L;
        long jC3 = mz.c(kzVar, lzVar2);
        long jC4 = mz.c(kzVar, lzVar2);
        long jC5 = mz.c(kzVar, lzVar);
        long jQ = xp1.q(hz.c(k22.E, mz.c(kzVar, k22.D)), kzVar.p);
        lz lzVar3 = k22.B;
        long jC6 = mz.c(kzVar, lzVar3);
        float f = k22.C;
        long jC7 = hz.c(f, jC6);
        lz lzVar4 = k22.F;
        long jC8 = mz.c(kzVar, lzVar4);
        float f2 = k22.G;
        mw2 mw2Var2 = new mw2(jC, jC2, jC3, jC4, jC5, jQ, jC7, hz.c(f2, jC8), hz.c(f2, mz.c(kzVar, lzVar4)), hz.c(f, mz.c(kzVar, lzVar3)));
        kzVar.g0 = mw2Var2;
        return mw2Var2;
    }

    public final void a(ix1 ix1Var, dv1 dv1Var, mw2 mw2Var, boolean z, long j, f30 f30Var, int i) {
        dv1 dv1Var2;
        long j2;
        dv1 dv1Var3;
        long jFloatToRawIntBits;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-290277409);
        int i2 = i | (ov0Var.f(ix1Var) ? 4 : 2) | 48 | (ov0Var.f(mw2Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var.g(z) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | 24576;
        if (ov0Var.T(i2 & 1, (74899 & i2) != 74898)) {
            ov0Var.Y();
            if ((i & 1) == 0 || ov0Var.B()) {
                j2 = dx2.c;
                dv1Var3 = av1.a;
            } else {
                ov0Var.W();
                dv1Var3 = dv1Var;
                j2 = j;
            }
            ov0Var.q();
            Object objQ = ov0Var.Q();
            c30 c30Var = d30.a;
            if (objQ == c30Var) {
                objQ = new fy2();
                ov0Var.m0(objQ);
            }
            fy2 fy2Var = (fy2) objQ;
            boolean z2 = (i2 & 14) == 4;
            Object objQ2 = ov0Var.Q();
            if (z2 || objQ2 == c30Var) {
                objQ2 = new ju(ix1Var, fy2Var, null, 3);
                ov0Var.m0(objQ2);
            }
            oi0.e(ov0Var, (pu0) objQ2, ix1Var);
            if (fy2Var.isEmpty()) {
                jFloatToRawIntBits = j2;
            } else {
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(xd0.b(j2) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(xd0.a(j2))) & 4294967295L);
            }
            fn0 fn0Var = iw2.a;
            gh0.h(ov0Var, xp1.k(xp1.A(iw2.l(dv1Var3, xd0.b(jFloatToRawIntBits), xd0.a(jFloatToRawIntBits)), ix1Var, true), z ? mw2Var.a : mw2Var.f, hu2.a(k22.J, ov0Var)));
            dv1Var2 = dv1Var3;
        } else {
            ov0Var.W();
            dv1Var2 = dv1Var;
            j2 = j;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pw2(this, ix1Var, dv1Var2, mw2Var, z, j2, i);
        }
    }

    public final void b(final ex2 ex2Var, dv1 dv1Var, final boolean z, final mw2 mw2Var, pu0 pu0Var, qu0 qu0Var, float f, float f2, f30 f30Var, final int i) {
        int i2;
        final dv1 dv1Var2;
        final pu0 pu0Var2;
        final qu0 qu0Var2;
        final float f3;
        final float f4;
        int i3;
        pu0 pu0Var3;
        float f5;
        qu0 qu0Var3;
        dv1 dv1Var3;
        float f6;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(49984771);
        int i4 = 4;
        if ((i & 6) == 0) {
            i2 = (ov0Var.h(ex2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i5 = i2 | 48;
        if ((i & 384) == 0) {
            i5 |= ov0Var.g(z) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i & 3072) == 0) {
            i5 |= ov0Var.f(mw2Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i5 |= 8192;
        }
        int i6 = i5 | 14352384;
        if ((100663296 & i) == 0) {
            i6 |= ov0Var.f(this) ? 67108864 : 33554432;
        }
        if (ov0Var.T(i6 & 1, (38347923 & i6) != 38347922)) {
            ov0Var.Y();
            if ((i & 1) == 0 || ov0Var.B()) {
                boolean z2 = ((((i6 & 7168) ^ 3072) > 2048 && ov0Var.f(mw2Var)) || (i6 & 3072) == 2048) | ((i6 & 896) == 256);
                Object objQ = ov0Var.Q();
                c30 c30Var = d30.a;
                if (z2 || objQ == c30Var) {
                    objQ = new ty(mw2Var, z, i4);
                    ov0Var.m0(objQ);
                }
                pu0 pu0Var4 = (pu0) objQ;
                i3 = i6 & (-57345);
                Object objQ2 = ov0Var.Q();
                if (objQ2 == c30Var) {
                    objQ2 = v10.g;
                    ov0Var.m0(objQ2);
                }
                float f7 = dx2.d;
                pu0Var3 = pu0Var4;
                f5 = dx2.e;
                qu0Var3 = (qu0) objQ2;
                dv1Var3 = av1.a;
                f6 = f7;
            } else {
                ov0Var.W();
                i3 = i6 & (-57345);
                dv1Var3 = dv1Var;
                pu0Var3 = pu0Var;
                qu0Var3 = qu0Var;
                f6 = f;
                f5 = f2;
            }
            ov0Var.q();
            int i7 = i3 << 3;
            c(ex2Var, dv1Var3, z, mw2Var, pu0Var3, qu0Var3, f6, f5, ov0Var, 805306416 | (i3 & 14) | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (3670016 & i7) | (29360128 & i7) | (i7 & 234881024), ((i3 >> 21) & 112) | 6);
            dv1Var2 = dv1Var3;
            f4 = f5;
            f3 = f6;
            qu0Var2 = qu0Var3;
            pu0Var2 = pu0Var3;
        } else {
            ov0Var.W();
            dv1Var2 = dv1Var;
            pu0Var2 = pu0Var;
            qu0Var2 = qu0Var;
            f3 = f;
            f4 = f2;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0() { // from class: ow2
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.e.b(ex2Var, dv1Var2, z, mw2Var, pu0Var2, qu0Var2, f3, f4, (f30) obj, wc0.m0(i | 1));
                    return mf3.a;
                }
            };
        }
    }

    public final void c(final ex2 ex2Var, final dv1 dv1Var, final boolean z, final mw2 mw2Var, final pu0 pu0Var, final qu0 qu0Var, final float f, final float f2, f30 f30Var, final int i, final int i2) {
        int i3;
        float f3;
        int i4;
        ov0 ov0Var;
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(133396521);
        if ((i & 6) == 0) {
            i3 = (ov0Var2.h(ex2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ov0Var2.c(Float.NaN) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ov0Var2.f(dv1Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i & 3072) == 0) {
            i3 |= ov0Var2.g(z) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i3 |= ov0Var2.f(mw2Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= ov0Var2.h(pu0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= ov0Var2.h(qu0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            f3 = f;
            i3 |= ov0Var2.c(f3) ? 8388608 : 4194304;
        } else {
            f3 = f;
        }
        if ((i & 100663296) == 0) {
            i3 |= ov0Var2.c(f2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= ov0Var2.g(false) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (ov0Var2.g(false) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (ov0Var2.T(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            final long jA = mw2Var.a(z, false);
            final long jA2 = mw2Var.a(z, true);
            long j = z ? mw2Var.e : mw2Var.j;
            long j2 = z ? mw2Var.c : mw2Var.h;
            dv1 dv1VarC = ex2Var.m == x32.e ? iw2.c(iw2.o(dv1Var, dx2.a), 1.0f) : iw2.g(iw2.e(dv1Var, 1.0f), dx2.a);
            int i5 = i3 & 112;
            int i6 = i3;
            boolean zH = (i5 == 32) | ov0Var2.h(ex2Var);
            Object objQ = ov0Var2.Q();
            c30 c30Var = d30.a;
            if (zH || objQ == c30Var) {
                objQ = new au(ex2Var, 13);
                ov0Var2.m0(objQ);
            }
            dv1 dv1VarD = dv1VarC.d(k22.A(av1.a, (qu0) objQ));
            boolean zH2 = ((i6 & 29360128) == 8388608) | (i5 == 32) | ov0Var2.h(ex2Var) | ov0Var2.e(jA) | ov0Var2.e(jA2) | ov0Var2.e(j) | ov0Var2.e(j2) | ((i6 & 234881024) == 67108864) | ((i6 & 458752) == 131072) | ((i6 & 3670016) == 1048576) | ((i6 & 1879048192) == 536870912) | ((i4 & 14) == 4);
            Object objQ2 = ov0Var2.Q();
            if (zH2 || objQ2 == c30Var) {
                final long j3 = j2;
                ov0Var = ov0Var2;
                final long j4 = j;
                final float f4 = f3;
                lu0 lu0Var = new lu0() { // from class: qw2
                    /* JADX WARN: Code duplicated, block: B:100:0x0250  */
                    /* JADX WARN: Code duplicated, block: B:135:0x0327  */
                    @Override // defpackage.lu0
                    public final Object invoke(Object obj) {
                        float fR;
                        long j5;
                        long jA3;
                        float f5;
                        x32 x32Var;
                        float f6;
                        char c2;
                        pu0 pu0Var2;
                        long jFloatToRawIntBits;
                        int iFloatToRawIntBits;
                        long jFloatToRawIntBits2;
                        long jFloatToRawIntBits3;
                        int iFloatToRawIntBits2;
                        jg0 jg0Var;
                        long jFloatToRawIntBits4;
                        int iFloatToRawIntBits3;
                        long jFloatToRawIntBits5;
                        long jFloatToRawIntBits6;
                        int iFloatToRawIntBits4;
                        jg0 jg0Var2;
                        long jFloatToRawIntBits7;
                        int iFloatToRawIntBits5;
                        long jFloatToRawIntBits8;
                        long jFloatToRawIntBits9;
                        int iFloatToRawIntBits6;
                        long jFloatToRawIntBits10;
                        float fR2;
                        float fR3;
                        jg0 jg0Var3 = (jg0) obj;
                        boolean zB = td0.b(Float.NaN, Float.NaN);
                        x32 x32Var2 = x32.e;
                        ex2 ex2Var2 = ex2Var;
                        if (zB) {
                            fR = (ex2Var2.m == x32Var2 ? Float.intBitsToFloat((int) (jg0Var3.a() >> 32)) : Float.intBitsToFloat((int) (jg0Var3.a() & 4294967295L))) / 2.0f;
                        } else {
                            fR = jg0Var3.R(Float.NaN);
                        }
                        sw2 sw2Var = sw2.a;
                        float[] fArr = ex2Var2.g;
                        float fC = ex2Var2.c();
                        int i7 = 0;
                        float fU0 = jg0Var3.U0(0);
                        float fU1 = jg0Var3.U0(0);
                        float fU2 = jg0Var3.U0(ex2Var2.k.g());
                        float fU3 = jg0Var3.U0(ex2Var2.l.g());
                        float fX0 = jg0Var3.X0(fR);
                        x32 x32Var3 = ex2Var2.m;
                        boolean z2 = x32Var3 == x32Var2;
                        boolean z3 = jg0Var3.getLayoutDirection() == qa1.f;
                        boolean z4 = z3 && !z2;
                        float fR4 = jg0Var3.R(fX0);
                        if (z2) {
                            j5 = 4294967295L;
                            jA3 = jg0Var3.a() & 4294967295L;
                        } else {
                            j5 = 4294967295L;
                            jA3 = jg0Var3.a() >> 32;
                        }
                        float fIntBitsToFloat = Float.intBitsToFloat((int) jA3);
                        fArr.getClass();
                        if (o51.e(0.0f, fArr.length == 0 ? null : Float.valueOf(fArr[0])) || o51.e(0.0f, yo.B0(fArr))) {
                        }
                        float f7 = (fArr.length == 0 || (o51.e(fC, fArr.length != 0 ? Float.valueOf(fArr[0]) : null) || o51.e(fC, yo.B0(fArr)))) ? ((fIntBitsToFloat - 0.0f) * fC) + 0.0f : (((fIntBitsToFloat - 0.0f) - (fR4 * 2.0f)) * fC) + 0.0f + fR4;
                        int length = fArr.length;
                        float fR5 = jg0Var3.R(f2);
                        float f8 = f4;
                        if (td0.a(f8, 0.0f) > 0) {
                            if (z2) {
                                jg0Var3.R(fU1);
                                jg0Var3.R(f8);
                                fR2 = jg0Var3.R(fU3) / 2.0f;
                                fR3 = jg0Var3.R(f8);
                            } else {
                                jg0Var3.R(fU0);
                                jg0Var3.R(f8);
                                fR2 = jg0Var3.R(fU2) / 2.0f;
                                fR3 = jg0Var3.R(f8);
                            }
                            f5 = fR3 + fR2;
                        } else {
                            f5 = 0.0f;
                        }
                        long jV0 = jg0Var3.v0();
                        Float.intBitsToFloat((int) (z2 ? jV0 & j5 : jV0 >> 32));
                        float f9 = (fIntBitsToFloat - f5) - fR4;
                        pu0 pu0Var3 = pu0Var;
                        if (f7 < f9) {
                            float f10 = z4 ? fR4 : fR5;
                            float f11 = z4 ? fR5 : fR4;
                            float f12 = f7 + f5;
                            float f13 = fIntBitsToFloat - f12;
                            if (z2) {
                                jFloatToRawIntBits6 = Float.floatToRawIntBits(0.0f);
                                iFloatToRawIntBits4 = Float.floatToRawIntBits(f12);
                                f6 = 0.0f;
                                c2 = ' ';
                            } else {
                                f6 = 0.0f;
                                c2 = ' ';
                                if (z3) {
                                    jFloatToRawIntBits6 = Float.floatToRawIntBits(0.0f);
                                    iFloatToRawIntBits4 = Float.floatToRawIntBits(0.0f);
                                } else {
                                    jFloatToRawIntBits6 = Float.floatToRawIntBits(f12);
                                    iFloatToRawIntBits4 = Float.floatToRawIntBits(0.0f);
                                }
                            }
                            long j6 = (jFloatToRawIntBits6 << c2) | (((long) iFloatToRawIntBits4) & j5);
                            if (z2) {
                                jFloatToRawIntBits7 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (jg0Var3.a() >> c2)));
                                jg0Var2 = jg0Var3;
                                jFloatToRawIntBits8 = Float.floatToRawIntBits(f13);
                            } else {
                                jg0Var2 = jg0Var3;
                                if (z3) {
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jg0Var2.a() >> c2)) - f12;
                                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jg0Var2.a() & j5));
                                    jFloatToRawIntBits7 = Float.floatToRawIntBits(fIntBitsToFloat2);
                                    iFloatToRawIntBits5 = Float.floatToRawIntBits(fIntBitsToFloat3);
                                } else {
                                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jg0Var2.a() & j5));
                                    jFloatToRawIntBits7 = Float.floatToRawIntBits(f13);
                                    iFloatToRawIntBits5 = Float.floatToRawIntBits(fIntBitsToFloat4);
                                }
                                jFloatToRawIntBits8 = iFloatToRawIntBits5;
                            }
                            long j7 = (jFloatToRawIntBits8 & j5) | (jFloatToRawIntBits7 << c2);
                            x32Var = x32Var3;
                            jg0Var3 = jg0Var2;
                            pu0Var2 = pu0Var3;
                            sw2.e(jg0Var3, x32Var, j6, j7, jA, f10, f11);
                            if (z2) {
                                jFloatToRawIntBits9 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (jg0Var3.v0() >> c2)));
                                iFloatToRawIntBits6 = Float.floatToRawIntBits(fIntBitsToFloat - fR4);
                            } else {
                                if (z3) {
                                    jFloatToRawIntBits10 = (((long) Float.floatToRawIntBits(fR4)) << c2) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jg0Var3.v0() & j5)))) & j5);
                                } else {
                                    float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jg0Var3.v0() & j5));
                                    jFloatToRawIntBits9 = Float.floatToRawIntBits(fIntBitsToFloat - fR4);
                                    iFloatToRawIntBits6 = Float.floatToRawIntBits(fIntBitsToFloat5);
                                }
                                if (pu0Var2 != null) {
                                    pu0Var2.invoke(jg0Var3, new c12(jFloatToRawIntBits10));
                                }
                            }
                            jFloatToRawIntBits10 = (((long) iFloatToRawIntBits6) & j5) | (jFloatToRawIntBits9 << c2);
                            if (pu0Var2 != null) {
                                pu0Var2.invoke(jg0Var3, new c12(jFloatToRawIntBits10));
                            }
                        } else {
                            x32Var = x32Var3;
                            f6 = 0.0f;
                            c2 = ' ';
                            pu0Var2 = pu0Var3;
                        }
                        float f14 = f7 - f5;
                        float f15 = !z4 ? fR4 : fR5;
                        float f16 = z4 ? fR4 : fR5;
                        float f17 = z4 ? f14 : f14 - f6;
                        if (f17 > f15) {
                            if (!z2 && z3) {
                                jFloatToRawIntBits3 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (jg0Var3.a() >> c2)) - f14);
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f6);
                            } else {
                                jFloatToRawIntBits3 = Float.floatToRawIntBits(f6);
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f6);
                            }
                            long j8 = (jFloatToRawIntBits3 << c2) | (((long) iFloatToRawIntBits2) & j5);
                            if (z2) {
                                jg0Var = jg0Var3;
                                jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(f17)) & j5) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jg0Var3.a() >> c2)))) << c2);
                            } else {
                                jg0Var = jg0Var3;
                                if (z3) {
                                    float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jg0Var.a() & j5));
                                    jFloatToRawIntBits4 = Float.floatToRawIntBits(f14);
                                    iFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat6);
                                } else {
                                    float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jg0Var.a() & j5));
                                    jFloatToRawIntBits4 = Float.floatToRawIntBits(f17);
                                    iFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat7);
                                }
                                jFloatToRawIntBits5 = (jFloatToRawIntBits4 << c2) | (((long) iFloatToRawIntBits3) & j5);
                            }
                            long j9 = jFloatToRawIntBits5;
                            jg0Var3 = jg0Var;
                            sw2.e(jg0Var3, x32Var, j8, j9, jA2, f15, f16);
                        }
                        float f18 = f6 + fR4;
                        float f19 = fIntBitsToFloat - fR4;
                        float f20 = f7 - f5;
                        float f21 = f7 + f5;
                        int length2 = fArr.length;
                        int i8 = 0;
                        while (i7 < length2) {
                            float f22 = fArr[i7];
                            int i9 = i8 + 1;
                            if (pu0Var2 == null || i8 != fArr.length - 1) {
                                float fE = gh0.E(f18, f19, f22);
                                if (fE < f20 || fE > f21) {
                                    if (z2) {
                                        jFloatToRawIntBits = Float.floatToRawIntBits(Float.intBitsToFloat((int) (jg0Var3.v0() >> c2)));
                                        jFloatToRawIntBits2 = Float.floatToRawIntBits(fE);
                                    } else {
                                        if (z3) {
                                            float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jg0Var3.a() >> c2)) - fE;
                                            float fIntBitsToFloat9 = Float.intBitsToFloat((int) (jg0Var3.v0() & j5));
                                            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat8);
                                            iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat9);
                                        } else {
                                            float fIntBitsToFloat10 = Float.intBitsToFloat((int) (jg0Var3.v0() & j5));
                                            jFloatToRawIntBits = Float.floatToRawIntBits(fE);
                                            iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat10);
                                        }
                                        jFloatToRawIntBits2 = iFloatToRawIntBits;
                                    }
                                    qu0Var.invoke(jg0Var3, new c12((jFloatToRawIntBits2 & j5) | (jFloatToRawIntBits << c2)), new hz((fE < f6 || fE > f14) ? j4 : j3));
                                } else {
                                    f18 = f18;
                                    f20 = f20;
                                }
                            } else {
                                f18 = f18;
                                f20 = f20;
                            }
                            i7++;
                            i8 = i9;
                            f18 = f18;
                            f20 = f20;
                        }
                        return mf3.a;
                    }
                };
                ov0Var.m0(lu0Var);
                objQ2 = lu0Var;
            } else {
                ov0Var = ov0Var2;
            }
            ji2.o(dv1VarD, (lu0) objQ2, ov0Var, 0);
        } else {
            ov0Var = ov0Var2;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0() { // from class: rw2
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.e.c(ex2Var, dv1Var, z, mw2Var, pu0Var, qu0Var, f, f2, (f30) obj, wc0.m0(i | 1), wc0.m0(i2));
                    return mf3.a;
                }
            };
        }
    }
}
