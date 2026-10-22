package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class vc2 {
    public static final f80 a = wv1.a;
    public static final f80 b = wv1.c;

    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:49:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x009b  */
    /* JADX WARN: Code duplicated, block: B:51:0x009e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00af  */
    /* JADX WARN: Code duplicated, block: B:61:0x0172  */
    /* JADX WARN: Code duplicated, block: B:62:0x0174  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:79:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    public static final void a(dv1 dv1Var, long j, float f, long j2, int i, float f2, f30 f30Var, final int i2, final int i3) {
        dv1 dv1Var2;
        int i4;
        long jD;
        float f3;
        int i5;
        boolean z;
        final long j3;
        final dv1 dv1Var3;
        final long j4;
        final float f4;
        final int i6;
        final float f5;
        ee2 ee2VarT;
        long j5;
        int i7;
        final float f6;
        final int i8;
        final t13 t13Var;
        final e21 e21VarP;
        final e21 e21VarP2;
        final e21 e21VarP3;
        boolean z2;
        boolean zF;
        Object objQ;
        final long j6;
        final float f7;
        final long j7;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(333154241);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i2 | 6;
            dv1Var2 = dv1Var;
        } else if ((i2 & 6) == 0) {
            dv1Var2 = dv1Var;
            i4 = (ov0Var.f(dv1Var2) ? 4 : 2) | i2;
        } else {
            dv1Var2 = dv1Var;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            jD = j;
            i4 |= ((i3 & 2) == 0 && ov0Var.e(jD)) ? 32 : 16;
        } else {
            jD = j;
        }
        int i10 = i3 & 4;
        if (i10 == 0) {
            if ((i2 & 384) == 0) {
                f3 = f;
                i4 |= ov0Var.c(f3) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
            }
            i5 = i4 | 222208;
            if ((74899 & i5) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (ov0Var.T(i5 & 1, z)) {
                ov0Var.Y();
                if ((i2 & 1) != 0 || ov0Var.B()) {
                    if (i9 != 0) {
                        dv1Var3 = av1.a;
                    } else {
                        dv1Var3 = dv1Var2;
                    }
                    if ((i3 & 2) != 0) {
                        jD = mz.d(ks.M, ov0Var);
                        i5 &= -113;
                    }
                    if (i10 != 0) {
                        f3 = 4.0f;
                    }
                    j5 = hz.f;
                    i7 = i5 & (-7169);
                    f6 = 4.0f;
                    i8 = 1;
                } else {
                    ov0Var.W();
                    if ((i3 & 2) != 0) {
                        i5 &= -113;
                    }
                    j5 = j2;
                    i8 = i;
                    f6 = f2;
                    i7 = i5 & (-7169);
                    dv1Var3 = dv1Var2;
                }
                ov0Var.q();
                t13Var = new t13(((xb0) ov0Var.j(z30.h)).R(f3), 0.0f, i8, 0, null, 26);
                g21 g21VarE = ee0.E(ov0Var);
                e21VarP = ee0.p(g21VarE, 0.0f, 1080.0f, o51.u(o51.I(6000, 2, lh0.c), null, 6), ov0Var);
                yk1 yk1Var = new yk1(21);
                r91 r91Var = new r91();
                yk1Var.invoke(r91Var);
                e21VarP2 = ee0.p(g21VarE, 0.0f, 360.0f, o51.u(new s91(r91Var), null, 6), ov0Var);
                r91 r91Var2 = new r91();
                r91Var2.a = 6000;
                r91Var2.a(Float.valueOf(0.87f), 3000).b = b;
                r91Var2.a(Float.valueOf(0.1f), 6000);
                e21VarP3 = ee0.p(g21VarE, 0.1f, 0.87f, o51.u(new s91(r91Var2), null, 6), ov0Var);
                dv1 dv1VarK = iw2.k(gs2.a(dv1Var3, true, new yk1(22)), 40.0f);
                boolean zF2 = ov0Var.f(e21VarP3);
                if ((i7 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zF = z2 | zF2 | ov0Var.f(e21VarP) | ov0Var.f(e21VarP2) | ov0Var.e(j5) | ov0Var.h(t13Var) | ((((i7 & 112) ^ 48) <= 32 && ov0Var.e(jD)) || (i7 & 48) == 32);
                objQ = ov0Var.Q();
                if (!zF || objQ == d30.a) {
                    j6 = jD;
                    f7 = f3;
                    j7 = j5;
                    objQ = new lu0() { // from class: pc2
                        @Override // defpackage.lu0
                        public final Object invoke(Object obj) {
                            long j8 = j7;
                            t13 t13Var2 = t13Var;
                            long j9 = j6;
                            jg0 jg0Var = (jg0) obj;
                            float fFloatValue = ((Number) e21VarP3.getValue()).floatValue() * 360.0f;
                            int i11 = i8;
                            float f8 = f6;
                            if (i11 != 0 && Float.intBitsToFloat((int) (jg0Var.a() & 4294967295L)) <= Float.intBitsToFloat((int) (jg0Var.a() >> 32))) {
                                f8 += f7;
                            }
                            float fX0 = (f8 / ((float) (((double) jg0Var.X0(Float.intBitsToFloat((int) (jg0Var.a() >> 32)))) * 3.141592653589793d))) * 360.0f;
                            float fFloatValue2 = ((Number) e21VarP2.getValue()).floatValue() + ((Number) e21VarP.getValue()).floatValue();
                            long jV0 = jg0Var.v0();
                            gn gnVarX = jg0Var.X();
                            long jR = gnVarX.r();
                            gnVarX.i().l();
                            try {
                                ((t1) gnVarX.a).A(fFloatValue2, jV0);
                                vc2.d(jg0Var, Math.min(fFloatValue, fX0) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fX0) * 2.0f), j8, t13Var2);
                                vc2.d(jg0Var, 0.0f, fFloatValue, j9, t13Var2);
                                return mf3.a;
                            } finally {
                                p91.v(gnVarX, jR);
                            }
                        }
                    };
                    ov0Var.m0(objQ);
                } else {
                    j6 = jD;
                    f7 = f3;
                    j7 = j5;
                }
                ji2.o(dv1VarK, (lu0) objQ, ov0Var, 0);
                i6 = i8;
                f5 = f6;
                f4 = f7;
                j3 = j7;
                j4 = j6;
            } else {
                ov0Var.W();
                j3 = j2;
                dv1Var3 = dv1Var2;
                j4 = jD;
                f4 = f3;
                i6 = i;
                f5 = f2;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new pu0() { // from class: qc2
                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        vc2.a(dv1Var3, j4, f4, j3, i6, f5, (f30) obj, wc0.m0(i2 | 1), i3);
                        return mf3.a;
                    }
                };
            }
        }
        i4 |= 384;
        f3 = f;
        i5 = i4 | 222208;
        if ((74899 & i5) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (ov0Var.T(i5 & 1, z)) {
            ov0Var.Y();
            if ((i2 & 1) != 0) {
                if (i9 != 0) {
                    dv1Var3 = av1.a;
                } else {
                    dv1Var3 = dv1Var2;
                }
                if ((i3 & 2) != 0) {
                    jD = mz.d(ks.M, ov0Var);
                    i5 &= -113;
                }
                if (i10 != 0) {
                    f3 = 4.0f;
                }
                j5 = hz.f;
                i7 = i5 & (-7169);
                f6 = 4.0f;
                i8 = 1;
            } else {
                if (i9 != 0) {
                    dv1Var3 = av1.a;
                } else {
                    dv1Var3 = dv1Var2;
                }
                if ((i3 & 2) != 0) {
                    jD = mz.d(ks.M, ov0Var);
                    i5 &= -113;
                }
                if (i10 != 0) {
                    f3 = 4.0f;
                }
                j5 = hz.f;
                i7 = i5 & (-7169);
                f6 = 4.0f;
                i8 = 1;
            }
            ov0Var.q();
            t13Var = new t13(((xb0) ov0Var.j(z30.h)).R(f3), 0.0f, i8, 0, null, 26);
            g21 g21VarE2 = ee0.E(ov0Var);
            e21VarP = ee0.p(g21VarE2, 0.0f, 1080.0f, o51.u(o51.I(6000, 2, lh0.c), null, 6), ov0Var);
            yk1 yk1Var2 = new yk1(21);
            r91 r91Var3 = new r91();
            yk1Var2.invoke(r91Var3);
            e21VarP2 = ee0.p(g21VarE2, 0.0f, 360.0f, o51.u(new s91(r91Var3), null, 6), ov0Var);
            r91 r91Var4 = new r91();
            r91Var4.a = 6000;
            r91Var4.a(Float.valueOf(0.87f), 3000).b = b;
            r91Var4.a(Float.valueOf(0.1f), 6000);
            e21VarP3 = ee0.p(g21VarE2, 0.1f, 0.87f, o51.u(new s91(r91Var4), null, 6), ov0Var);
            dv1 dv1VarK2 = iw2.k(gs2.a(dv1Var3, true, new yk1(22)), 40.0f);
            boolean zF3 = ov0Var.f(e21VarP3);
            if ((i7 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            zF = z2 | zF3 | ov0Var.f(e21VarP) | ov0Var.f(e21VarP2) | ov0Var.e(j5) | ov0Var.h(t13Var) | ((((i7 & 112) ^ 48) <= 32 && ov0Var.e(jD)) || (i7 & 48) == 32);
            objQ = ov0Var.Q();
            if (zF) {
                j6 = jD;
                f7 = f3;
                j7 = j5;
                objQ = new lu0() { // from class: pc2
                    @Override // defpackage.lu0
                    public final Object invoke(Object obj) {
                        long j8 = j7;
                        t13 t13Var2 = t13Var;
                        long j9 = j6;
                        jg0 jg0Var = (jg0) obj;
                        float fFloatValue = ((Number) e21VarP3.getValue()).floatValue() * 360.0f;
                        int i11 = i8;
                        float f8 = f6;
                        if (i11 != 0 && Float.intBitsToFloat((int) (jg0Var.a() & 4294967295L)) <= Float.intBitsToFloat((int) (jg0Var.a() >> 32))) {
                            f8 += f7;
                        }
                        float fX0 = (f8 / ((float) (((double) jg0Var.X0(Float.intBitsToFloat((int) (jg0Var.a() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) e21VarP2.getValue()).floatValue() + ((Number) e21VarP.getValue()).floatValue();
                        long jV0 = jg0Var.v0();
                        gn gnVarX = jg0Var.X();
                        long jR = gnVarX.r();
                        gnVarX.i().l();
                        try {
                            ((t1) gnVarX.a).A(fFloatValue2, jV0);
                            vc2.d(jg0Var, Math.min(fFloatValue, fX0) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fX0) * 2.0f), j8, t13Var2);
                            vc2.d(jg0Var, 0.0f, fFloatValue, j9, t13Var2);
                            return mf3.a;
                        } finally {
                            p91.v(gnVarX, jR);
                        }
                    }
                };
                ov0Var.m0(objQ);
            } else {
                j6 = jD;
                f7 = f3;
                j7 = j5;
                objQ = new lu0() { // from class: pc2
                    @Override // defpackage.lu0
                    public final Object invoke(Object obj) {
                        long j8 = j7;
                        t13 t13Var2 = t13Var;
                        long j9 = j6;
                        jg0 jg0Var = (jg0) obj;
                        float fFloatValue = ((Number) e21VarP3.getValue()).floatValue() * 360.0f;
                        int i11 = i8;
                        float f8 = f6;
                        if (i11 != 0 && Float.intBitsToFloat((int) (jg0Var.a() & 4294967295L)) <= Float.intBitsToFloat((int) (jg0Var.a() >> 32))) {
                            f8 += f7;
                        }
                        float fX0 = (f8 / ((float) (((double) jg0Var.X0(Float.intBitsToFloat((int) (jg0Var.a() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) e21VarP2.getValue()).floatValue() + ((Number) e21VarP.getValue()).floatValue();
                        long jV0 = jg0Var.v0();
                        gn gnVarX = jg0Var.X();
                        long jR = gnVarX.r();
                        gnVarX.i().l();
                        try {
                            ((t1) gnVarX.a).A(fFloatValue2, jV0);
                            vc2.d(jg0Var, Math.min(fFloatValue, fX0) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fX0) * 2.0f), j8, t13Var2);
                            vc2.d(jg0Var, 0.0f, fFloatValue, j9, t13Var2);
                            return mf3.a;
                        } finally {
                            p91.v(gnVarX, jR);
                        }
                    }
                };
                ov0Var.m0(objQ);
            }
            ji2.o(dv1VarK2, (lu0) objQ, ov0Var, 0);
            i6 = i8;
            f5 = f6;
            f4 = f7;
            j3 = j7;
            j4 = j6;
        } else {
            ov0Var.W();
            j3 = j2;
            dv1Var3 = dv1Var2;
            j4 = jD;
            f4 = f3;
            i6 = i;
            f5 = f2;
        }
        ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0() { // from class: qc2
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vc2.a(dv1Var3, j4, f4, j3, i6, f5, (f30) obj, wc0.m0(i2 | 1), i3);
                    return mf3.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0116 A[PHI: r12
      0x0116: PHI (r12v5 long) = (r12v3 long), (r12v6 long) binds: [B:65:0x0114, B:61:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x012d  */
    public static final void b(final au0 au0Var, final dv1 dv1Var, final long j, long j2, int i, float f, lu0 lu0Var, f30 f30Var, final int i2, final int i3) {
        long jD;
        final lu0 lu0Var2;
        final long j3;
        final int i4;
        final float f2;
        long j4;
        lu0 lu0Var3;
        int i5;
        long j5;
        final float f3;
        final int i6;
        long j6;
        boolean z;
        boolean zF;
        Object objQ;
        final lu0 lu0Var4;
        final long j7;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-339970038);
        int i7 = (ov0Var.h(au0Var) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i7 |= ov0Var.f(dv1Var) ? 32 : 16;
        }
        if ((i2 & 3072) == 0) {
            jD = j2;
            i7 |= ((i3 & 8) == 0 && ov0Var.e(jD)) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        } else {
            jD = j2;
        }
        int i8 = i7 | 745472;
        if (ov0Var.T(i8 & 1, (599187 & i8) != 599186)) {
            ov0Var.Y();
            int i9 = i2 & 1;
            c30 c30Var = d30.a;
            if (i9 == 0 || ov0Var.B()) {
                if ((i3 & 8) != 0) {
                    jD = mz.d(ks.N, ov0Var);
                    i8 &= -7169;
                }
                Object objQ2 = ov0Var.Q();
                if (objQ2 == c30Var) {
                    j4 = j;
                    objQ2 = new ec(12, j4);
                    ov0Var.m0(objQ2);
                } else {
                    j4 = j;
                }
                lu0Var3 = (lu0) objQ2;
                i5 = i8 & (-3670017);
                j5 = jD;
                f3 = 4.0f;
                i6 = 1;
            } else {
                ov0Var.W();
                if ((i3 & 8) != 0) {
                    i8 &= -7169;
                }
                i5 = i8 & (-3670017);
                i6 = i;
                f3 = f;
                lu0Var3 = lu0Var;
                j5 = jD;
                j4 = j;
            }
            ov0Var.q();
            boolean z2 = (i5 & 14) == 4;
            Object objQ3 = ov0Var.Q();
            if (z2 || objQ3 == c30Var) {
                objQ3 = new o6(19, au0Var);
                ov0Var.m0(objQ3);
            }
            final au0 au0Var2 = (au0) objQ3;
            dv1 dv1VarD = dv1Var.d(x1.b);
            boolean zF2 = ov0Var.f(au0Var2);
            Object objQ4 = ov0Var.Q();
            if (zF2 || objQ4 == c30Var) {
                objQ4 = new m4(6, au0Var2);
                ov0Var.m0(objQ4);
            }
            dv1 dv1VarL = iw2.l(gs2.a(dv1VarD, true, (lu0) objQ4), 240.0f, 4.0f);
            boolean zF3 = ov0Var.f(au0Var2);
            if (((i5 & 7168) ^ 3072) > 2048) {
                j6 = j5;
                if (ov0Var.e(j6)) {
                    z = true;
                }
                zF = z | zF3 | ov0Var.f(lu0Var3);
                objQ = ov0Var.Q();
                if (!zF || objQ == c30Var) {
                    lu0Var4 = lu0Var3;
                    final long j8 = j4;
                    j7 = j6;
                    objQ = new lu0() { // from class: tc2
                        @Override // defpackage.lu0
                        public final Object invoke(Object obj) {
                            jg0 jg0Var = (jg0) obj;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jg0Var.a() & 4294967295L));
                            int i10 = i6;
                            float fX0 = f3;
                            if (i10 != 0 && Float.intBitsToFloat((int) (jg0Var.a() & 4294967295L)) <= Float.intBitsToFloat((int) (jg0Var.a() >> 32))) {
                                fX0 += jg0Var.X0(fIntBitsToFloat);
                            }
                            float fX1 = fX0 / jg0Var.X0(Float.intBitsToFloat((int) (jg0Var.a() >> 32)));
                            float fFloatValue = ((Number) au0Var2.invoke()).floatValue();
                            float fMin = Math.min(fFloatValue, fX1) + fFloatValue;
                            if (fMin <= 1.0f) {
                                vc2.e(jg0Var, fMin, 1.0f, j7, fIntBitsToFloat, i10);
                            }
                            vc2.e(jg0Var, 0.0f, fFloatValue, j8, fIntBitsToFloat, i10);
                            lu0Var4.invoke(jg0Var);
                            return mf3.a;
                        }
                    };
                    ov0Var.m0(objQ);
                } else {
                    lu0Var4 = lu0Var3;
                    j7 = j6;
                }
                ji2.o(dv1VarL, (lu0) objQ, ov0Var, 0);
                i4 = i6;
                f2 = f3;
                j3 = j7;
                lu0Var2 = lu0Var4;
            } else {
                j6 = j5;
            }
            if ((i5 & 3072) == 2048) {
                z = true;
            } else {
                z = false;
            }
            zF = z | zF3 | ov0Var.f(lu0Var3);
            objQ = ov0Var.Q();
            if (zF) {
                lu0Var4 = lu0Var3;
                final long j9 = j4;
                j7 = j6;
                objQ = new lu0() { // from class: tc2
                    @Override // defpackage.lu0
                    public final Object invoke(Object obj) {
                        jg0 jg0Var = (jg0) obj;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (jg0Var.a() & 4294967295L));
                        int i10 = i6;
                        float fX0 = f3;
                        if (i10 != 0 && Float.intBitsToFloat((int) (jg0Var.a() & 4294967295L)) <= Float.intBitsToFloat((int) (jg0Var.a() >> 32))) {
                            fX0 += jg0Var.X0(fIntBitsToFloat);
                        }
                        float fX1 = fX0 / jg0Var.X0(Float.intBitsToFloat((int) (jg0Var.a() >> 32)));
                        float fFloatValue = ((Number) au0Var2.invoke()).floatValue();
                        float fMin = Math.min(fFloatValue, fX1) + fFloatValue;
                        if (fMin <= 1.0f) {
                            vc2.e(jg0Var, fMin, 1.0f, j7, fIntBitsToFloat, i10);
                        }
                        vc2.e(jg0Var, 0.0f, fFloatValue, j9, fIntBitsToFloat, i10);
                        lu0Var4.invoke(jg0Var);
                        return mf3.a;
                    }
                };
                ov0Var.m0(objQ);
            } else {
                lu0Var4 = lu0Var3;
                final long j10 = j4;
                j7 = j6;
                objQ = new lu0() { // from class: tc2
                    @Override // defpackage.lu0
                    public final Object invoke(Object obj) {
                        jg0 jg0Var = (jg0) obj;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (jg0Var.a() & 4294967295L));
                        int i10 = i6;
                        float fX0 = f3;
                        if (i10 != 0 && Float.intBitsToFloat((int) (jg0Var.a() & 4294967295L)) <= Float.intBitsToFloat((int) (jg0Var.a() >> 32))) {
                            fX0 += jg0Var.X0(fIntBitsToFloat);
                        }
                        float fX1 = fX0 / jg0Var.X0(Float.intBitsToFloat((int) (jg0Var.a() >> 32)));
                        float fFloatValue = ((Number) au0Var2.invoke()).floatValue();
                        float fMin = Math.min(fFloatValue, fX1) + fFloatValue;
                        if (fMin <= 1.0f) {
                            vc2.e(jg0Var, fMin, 1.0f, j7, fIntBitsToFloat, i10);
                        }
                        vc2.e(jg0Var, 0.0f, fFloatValue, j10, fIntBitsToFloat, i10);
                        lu0Var4.invoke(jg0Var);
                        return mf3.a;
                    }
                };
                ov0Var.m0(objQ);
            }
            ji2.o(dv1VarL, (lu0) objQ, ov0Var, 0);
            i4 = i6;
            f2 = f3;
            j3 = j7;
            lu0Var2 = lu0Var4;
        } else {
            ov0Var.W();
            lu0Var2 = lu0Var;
            j3 = jD;
            i4 = i;
            f2 = f;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0() { // from class: uc2
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vc2.b(au0Var, dv1Var, j, j3, i4, f2, lu0Var2, (f30) obj, wc0.m0(i2 | 1), i3);
                    return mf3.a;
                }
            };
        }
    }

    public static final void c(dv1 dv1Var, long j, long j2, int i, float f, f30 f30Var, final int i2, final int i3) {
        long jD;
        int i4;
        dv1 dv1Var2;
        final long j3;
        final int i5;
        final float f2;
        final long j4;
        long jD2;
        int i6;
        final int i7;
        final float f3;
        final long j5;
        final long j6;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(567589233);
        if ((i2 & 48) == 0) {
            jD = j;
            i4 = i2 | (((i3 & 2) == 0 && ov0Var.e(jD)) ? 32 : 16);
        } else {
            jD = j;
            i4 = i2;
        }
        int i8 = i4 | 27776;
        if (ov0Var.T(i8 & 1, (i8 & 9363) != 9362)) {
            ov0Var.Y();
            if ((i2 & 1) == 0 || ov0Var.B()) {
                if ((i3 & 2) != 0) {
                    jD = mz.d(ks.M, ov0Var);
                    i8 &= -113;
                }
                jD2 = mz.d(ks.N, ov0Var);
                i6 = i8 & (-897);
                i7 = 1;
                f3 = 4.0f;
            } else {
                ov0Var.W();
                if ((i3 & 2) != 0) {
                    i8 &= -113;
                }
                i6 = i8 & (-897);
                jD2 = j2;
                i7 = i;
                f3 = f;
            }
            ov0Var.q();
            g21 g21VarE = ee0.E(ov0Var);
            r91 r91Var = new r91();
            r91Var.a = 1750;
            q91 q91VarA = r91Var.a(fValueOf2, 0);
            f80 f80Var = a;
            q91VarA.b = f80Var;
            r91Var.a(fValueOf, 1000);
            final e21 e21VarP = ee0.p(g21VarE, 0.0f, 1.0f, o51.u(new s91(r91Var), null, 6), ov0Var);
            r91 r91Var2 = new r91();
            r91Var2.a = 1750;
            r91Var2.a(fValueOf2, 250).b = f80Var;
            r91Var2.a(fValueOf, 1250);
            final e21 e21VarP2 = ee0.p(g21VarE, 0.0f, 1.0f, o51.u(new s91(r91Var2), null, 6), ov0Var);
            r91 r91Var3 = new r91();
            r91Var3.a = 1750;
            r91Var3.a(fValueOf2, 650).b = f80Var;
            r91Var3.a(fValueOf, 1500);
            final e21 e21VarP3 = ee0.p(g21VarE, 0.0f, 1.0f, o51.u(new s91(r91Var3), null, 6), ov0Var);
            r91 r91Var4 = new r91();
            r91Var4.a = 1750;
            r91Var4.a(fValueOf2, 900).b = f80Var;
            r91Var4.a(fValueOf, 1750);
            final e21 e21VarP4 = ee0.p(g21VarE, 0.0f, 1.0f, o51.u(new s91(r91Var4), null, 6), ov0Var);
            dv1Var2 = dv1Var;
            dv1 dv1VarL = iw2.l(gs2.a(dv1Var2.d(x1.b), true, new yk1(22)), 240.0f, 4.0f);
            boolean zF = ov0Var.f(e21VarP) | ov0Var.e(jD2) | ov0Var.f(e21VarP2) | ((((i6 & 112) ^ 48) > 32 && ov0Var.e(jD)) || (i6 & 48) == 32) | ov0Var.f(e21VarP3) | ov0Var.f(e21VarP4);
            Object objQ = ov0Var.Q();
            if (zF || objQ == d30.a) {
                j5 = jD;
                j6 = jD2;
                lu0 lu0Var = new lu0() { // from class: rc2
                    @Override // defpackage.lu0
                    public final Object invoke(Object obj) {
                        long j7;
                        jg0 jg0Var = (jg0) obj;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (jg0Var.a() & 4294967295L));
                        int i9 = i7;
                        float fX0 = f3;
                        if (i9 != 0 && Float.intBitsToFloat((int) (4294967295L & jg0Var.a())) <= Float.intBitsToFloat((int) (jg0Var.a() >> 32))) {
                            fX0 += jg0Var.X0(fIntBitsToFloat);
                        }
                        float fX1 = fX0 / jg0Var.X0(Float.intBitsToFloat((int) (jg0Var.a() >> 32)));
                        s03 s03Var = e21VarP;
                        float fFloatValue = ((Number) s03Var.getValue()).floatValue();
                        float f4 = 1.0f - fX1;
                        long j8 = j6;
                        if (fFloatValue < f4) {
                            vc2.e(jg0Var, ((Number) s03Var.getValue()).floatValue() > 0.0f ? ((Number) s03Var.getValue()).floatValue() + fX1 : 0.0f, 1.0f, j8, fIntBitsToFloat, i9);
                        }
                        long j9 = j8;
                        float fFloatValue2 = ((Number) s03Var.getValue()).floatValue();
                        s03 s03Var2 = e21VarP2;
                        float fFloatValue3 = fFloatValue2 - ((Number) s03Var2.getValue()).floatValue();
                        long j10 = j5;
                        if (fFloatValue3 > 0.0f) {
                            vc2.e(jg0Var, ((Number) s03Var.getValue()).floatValue(), ((Number) s03Var2.getValue()).floatValue(), j10, fIntBitsToFloat, i9);
                            j7 = j10;
                        } else {
                            j7 = j10;
                        }
                        float fFloatValue4 = ((Number) s03Var2.getValue()).floatValue();
                        s03 s03Var3 = e21VarP3;
                        if (fFloatValue4 > fX1) {
                            vc2.e(jg0Var, ((Number) s03Var3.getValue()).floatValue() > 0.0f ? ((Number) s03Var3.getValue()).floatValue() + fX1 : 0.0f, ((Number) s03Var2.getValue()).floatValue() < 1.0f ? ((Number) s03Var2.getValue()).floatValue() - fX1 : 1.0f, j9, fIntBitsToFloat, i9);
                            j9 = j9;
                        }
                        float fFloatValue5 = ((Number) s03Var3.getValue()).floatValue();
                        s03 s03Var4 = e21VarP4;
                        if (fFloatValue5 - ((Number) s03Var4.getValue()).floatValue() > 0.0f) {
                            vc2.e(jg0Var, ((Number) s03Var3.getValue()).floatValue(), ((Number) s03Var4.getValue()).floatValue(), j7, fIntBitsToFloat, i9);
                            jg0Var = jg0Var;
                            fIntBitsToFloat = fIntBitsToFloat;
                        }
                        if (((Number) s03Var4.getValue()).floatValue() > fX1) {
                            vc2.e(jg0Var, 0.0f, ((Number) s03Var4.getValue()).floatValue() < 1.0f ? ((Number) s03Var4.getValue()).floatValue() - fX1 : 1.0f, j9, fIntBitsToFloat, i9);
                        }
                        return mf3.a;
                    }
                };
                ov0Var.m0(lu0Var);
                objQ = lu0Var;
            } else {
                j5 = jD;
                j6 = jD2;
            }
            ji2.o(dv1VarL, (lu0) objQ, ov0Var, 0);
            i5 = i7;
            f2 = f3;
            j3 = j6;
            j4 = j5;
        } else {
            dv1Var2 = dv1Var;
            ov0Var.W();
            j3 = j2;
            i5 = i;
            f2 = f;
            j4 = jD;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            final dv1 dv1Var3 = dv1Var2;
            ee2VarT.d = new pu0() { // from class: sc2
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vc2.c(dv1Var3, j4, j3, i5, f2, (f30) obj, wc0.m0(i2 | 1), i3);
                    return mf3.a;
                }
            };
        }
    }

    public static final void d(jg0 jg0Var, float f, float f2, long j, t13 t13Var) {
        float f3 = t13Var.a / 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jg0Var.a() >> 32)) - (2.0f * f3);
        jg0Var.Y0(j, f, f2, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), t13Var);
    }

    public static final void e(jg0 jg0Var, float f, float f2, long j, float f3, int i) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jg0Var.a() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jg0Var.a() & 4294967295L));
        float f4 = fIntBitsToFloat2 / 2.0f;
        boolean z = jg0Var.getLayoutDirection() == qa1.e;
        float f5 = (z ? f : 1.0f - f2) * fIntBitsToFloat;
        float f6 = (z ? f2 : 1.0f - f) * fIntBitsToFloat;
        if (i == 0 || fIntBitsToFloat2 > fIntBitsToFloat) {
            jg0.k0(jg0Var, j, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), f3, 0, 496);
            return;
        }
        float f7 = f3 / 2.0f;
        float f8 = fIntBitsToFloat - f7;
        if (f5 < f7) {
            f5 = f7;
        }
        if (f5 > f8) {
            f5 = f8;
        }
        if (f6 < f7) {
            f6 = f7;
        }
        if (f6 <= f8) {
            f8 = f6;
        }
        if (Math.abs(f2 - f) > 0.0f) {
            jg0.k0(jg0Var, j, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), f3, i, 480);
        }
    }
}
