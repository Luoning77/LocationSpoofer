package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class b43 {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final mx2 f;

    static {
        float f2 = xp1.B;
        a = f2;
        b = xp1.L;
        c = xp1.I;
        float f3 = xp1.F;
        d = f3;
        e = (f3 - f2) / 2.0f;
        f = new mx2(0);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0066  */
    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0095  */
    /* JADX WARN: Code duplicated, block: B:48:0x009a  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:51:0x014c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0152  */
    /* JADX WARN: Code duplicated, block: B:57:0x0168  */
    /* JADX WARN: Code duplicated, block: B:60:0x0177  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    public static final void a(boolean z, lu0 lu0Var, dv1 dv1Var, boolean z2, w33 w33Var, f30 f30Var, int i, int i2) {
        boolean z3;
        int i3;
        w33 w33Var2;
        int i4;
        boolean z4;
        dv1 dv1Var2;
        boolean z5;
        ee2 ee2VarT;
        int i5;
        dv1 dv1VarC0;
        w33 w33Var3;
        int i6;
        w33 w33Var4;
        dv1 dv1Var3;
        kz kzVar;
        w33 w33Var5;
        long j;
        Object objQ;
        ix1 ix1Var;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-263339167);
        int i7 = i | (ov0Var.g(z) ? 4 : 2);
        if ((i & 48) == 0) {
            i7 |= ov0Var.h(lu0Var) ? 32 : 16;
        }
        int i8 = i7 | 3456;
        int i9 = i2 & 16;
        if (i9 != 0) {
            i3 = i7 | 28032;
            z3 = z2;
        } else {
            z3 = z2;
            i3 = i8 | (ov0Var.g(z3) ? 16384 : 8192);
        }
        if ((i2 & 32) == 0) {
            w33Var2 = w33Var;
            int i10 = ov0Var.f(w33Var2) ? 131072 : 65536;
            i4 = i3 | i10 | 1572864;
            if ((599187 & i4) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ov0Var.T(i4 & 1, z4)) {
                ov0Var.Y();
                i5 = i & 1;
                dv1VarC0 = av1.a;
                if (i5 != 0 || ov0Var.B()) {
                    boolean z6 = i9 == 0 ? z3 : true;
                    if ((i2 & 32) != 0) {
                        kzVar = (kz) ov0Var.j(mz.a);
                        w33Var5 = kzVar.h0;
                        j = kzVar.p;
                        if (w33Var5 == null) {
                            long jC = mz.c(kzVar, xp1.A);
                            long jC2 = mz.c(kzVar, xp1.D);
                            long j2 = hz.f;
                            long jC3 = mz.c(kzVar, xp1.C);
                            long jC4 = mz.c(kzVar, xp1.K);
                            long jC5 = mz.c(kzVar, xp1.N);
                            long jC6 = mz.c(kzVar, xp1.J);
                            long jC7 = mz.c(kzVar, xp1.M);
                            long jQ = xp1.q(hz.c(xp1.n, mz.c(kzVar, xp1.m)), j);
                            long jC8 = mz.c(kzVar, xp1.q);
                            float f2 = xp1.r;
                            w33Var3 = new w33(jC, jC2, j2, jC3, jC4, jC5, jC6, jC7, jQ, xp1.q(hz.c(f2, jC8), j), j2, xp1.q(hz.c(xp1.p, mz.c(kzVar, xp1.o)), j), xp1.q(hz.c(xp1.t, mz.c(kzVar, xp1.s)), j), xp1.q(hz.c(f2, mz.c(kzVar, xp1.w)), j), xp1.q(hz.c(f2, mz.c(kzVar, xp1.x)), j), xp1.q(hz.c(xp1.v, mz.c(kzVar, xp1.u)), j));
                            kzVar.h0 = w33Var3;
                        } else {
                            w33Var3 = w33Var5;
                        }
                        i4 &= -458753;
                    } else {
                        w33Var3 = w33Var2;
                    }
                    i6 = i4;
                    z3 = z6;
                    w33Var4 = w33Var3;
                    dv1Var3 = dv1VarC0;
                } else {
                    ov0Var.W();
                    if ((i2 & 32) != 0) {
                        i4 &= -458753;
                    }
                    dv1Var3 = dv1Var;
                    i6 = i4;
                    w33Var4 = w33Var2;
                }
                ov0Var.q();
                ov0Var.c0(1768604058);
                objQ = ov0Var.Q();
                if (objQ == d30.a) {
                    objQ = new ix1();
                    ov0Var.m0(objQ);
                }
                ix1Var = (ix1) objQ;
                ov0Var.p(false);
                if (lu0Var != null) {
                    dy0 dy0Var = v41.a;
                    dv1VarC0 = ks.c0(z, ix1Var, z3, new vh2(2), lu0Var);
                }
                dv1 dv1VarR = iw2.r(dv1Var3.d(dv1VarC0));
                float f3 = c;
                float f4 = d;
                int i11 = (i6 << 3) & 112;
                int i12 = i6 >> 6;
                boolean z7 = z3;
                b(dv1VarR.d(new hw2(f3, f4, f3, f4, false)), z, z7, w33Var4, ix1Var, hu2.a(xp1.y, ov0Var), ov0Var, (i12 & 7168) | i11 | (i12 & 896) | 24576);
                z5 = z7;
                w33Var2 = w33Var4;
                dv1Var2 = dv1Var3;
            } else {
                ov0Var.W();
                dv1Var2 = dv1Var;
                z5 = z3;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new yw(z, lu0Var, dv1Var2, z5, w33Var2, i, i2, 1);
            }
        }
        w33Var2 = w33Var;
        i4 = i3 | i10 | 1572864;
        if ((599187 & i4) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (ov0Var.T(i4 & 1, z4)) {
            ov0Var.Y();
            i5 = i & 1;
            dv1VarC0 = av1.a;
            if (i5 != 0) {
                if (i9 == 0) {
                }
                if ((i2 & 32) != 0) {
                    kzVar = (kz) ov0Var.j(mz.a);
                    w33Var5 = kzVar.h0;
                    j = kzVar.p;
                    if (w33Var5 == null) {
                        long jC9 = mz.c(kzVar, xp1.A);
                        long jC10 = mz.c(kzVar, xp1.D);
                        long j3 = hz.f;
                        long jC11 = mz.c(kzVar, xp1.C);
                        long jC12 = mz.c(kzVar, xp1.K);
                        long jC13 = mz.c(kzVar, xp1.N);
                        long jC14 = mz.c(kzVar, xp1.J);
                        long jC15 = mz.c(kzVar, xp1.M);
                        long jQ2 = xp1.q(hz.c(xp1.n, mz.c(kzVar, xp1.m)), j);
                        long jC16 = mz.c(kzVar, xp1.q);
                        float f5 = xp1.r;
                        w33Var3 = new w33(jC9, jC10, j3, jC11, jC12, jC13, jC14, jC15, jQ2, xp1.q(hz.c(f5, jC16), j), j3, xp1.q(hz.c(xp1.p, mz.c(kzVar, xp1.o)), j), xp1.q(hz.c(xp1.t, mz.c(kzVar, xp1.s)), j), xp1.q(hz.c(f5, mz.c(kzVar, xp1.w)), j), xp1.q(hz.c(f5, mz.c(kzVar, xp1.x)), j), xp1.q(hz.c(xp1.v, mz.c(kzVar, xp1.u)), j));
                        kzVar.h0 = w33Var3;
                    } else {
                        w33Var3 = w33Var5;
                    }
                    i4 &= -458753;
                } else {
                    w33Var3 = w33Var2;
                }
                i6 = i4;
                z3 = z6;
                w33Var4 = w33Var3;
                dv1Var3 = dv1VarC0;
            } else {
                if (i9 == 0) {
                }
                if ((i2 & 32) != 0) {
                    kzVar = (kz) ov0Var.j(mz.a);
                    w33Var5 = kzVar.h0;
                    j = kzVar.p;
                    if (w33Var5 == null) {
                        long jC17 = mz.c(kzVar, xp1.A);
                        long jC18 = mz.c(kzVar, xp1.D);
                        long j4 = hz.f;
                        long jC19 = mz.c(kzVar, xp1.C);
                        long jC110 = mz.c(kzVar, xp1.K);
                        long jC111 = mz.c(kzVar, xp1.N);
                        long jC112 = mz.c(kzVar, xp1.J);
                        long jC113 = mz.c(kzVar, xp1.M);
                        long jQ3 = xp1.q(hz.c(xp1.n, mz.c(kzVar, xp1.m)), j);
                        long jC114 = mz.c(kzVar, xp1.q);
                        float f6 = xp1.r;
                        w33Var3 = new w33(jC17, jC18, j4, jC19, jC110, jC111, jC112, jC113, jQ3, xp1.q(hz.c(f6, jC114), j), j4, xp1.q(hz.c(xp1.p, mz.c(kzVar, xp1.o)), j), xp1.q(hz.c(xp1.t, mz.c(kzVar, xp1.s)), j), xp1.q(hz.c(f6, mz.c(kzVar, xp1.w)), j), xp1.q(hz.c(f6, mz.c(kzVar, xp1.x)), j), xp1.q(hz.c(xp1.v, mz.c(kzVar, xp1.u)), j));
                        kzVar.h0 = w33Var3;
                    } else {
                        w33Var3 = w33Var5;
                    }
                    i4 &= -458753;
                } else {
                    w33Var3 = w33Var2;
                }
                i6 = i4;
                z3 = z6;
                w33Var4 = w33Var3;
                dv1Var3 = dv1VarC0;
            }
            ov0Var.q();
            ov0Var.c0(1768604058);
            objQ = ov0Var.Q();
            if (objQ == d30.a) {
                objQ = new ix1();
                ov0Var.m0(objQ);
            }
            ix1Var = (ix1) objQ;
            ov0Var.p(false);
            if (lu0Var != null) {
                dy0 dy0Var2 = v41.a;
                dv1VarC0 = ks.c0(z, ix1Var, z3, new vh2(2), lu0Var);
            }
            dv1 dv1VarR2 = iw2.r(dv1Var3.d(dv1VarC0));
            float f7 = c;
            float f8 = d;
            int i13 = (i6 << 3) & 112;
            int i14 = i6 >> 6;
            boolean z8 = z3;
            b(dv1VarR2.d(new hw2(f7, f8, f7, f8, false)), z, z8, w33Var4, ix1Var, hu2.a(xp1.y, ov0Var), ov0Var, (i14 & 7168) | i13 | (i14 & 896) | 24576);
            z5 = z8;
            w33Var2 = w33Var4;
            dv1Var2 = dv1Var3;
        } else {
            ov0Var.W();
            dv1Var2 = dv1Var;
            z5 = z3;
        }
        ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new yw(z, lu0Var, dv1Var2, z5, w33Var2, i, i2, 1);
        }
    }

    public static final void b(final dv1 dv1Var, final boolean z, final boolean z2, final w33 w33Var, final ix1 ix1Var, final au2 au2Var, f30 f30Var, final int i) {
        int i2;
        long j;
        long j2;
        long j3;
        long j4;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-670917213);
        if ((i & 6) == 0) {
            i2 = (ov0Var.f(dv1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ov0Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ov0Var.g(z2) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i & 3072) == 0) {
            i2 |= ov0Var.f(w33Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i2 |= ov0Var.h(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ov0Var.f(ix1Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= ov0Var.f(au2Var) ? 1048576 : 524288;
        }
        if (ov0Var.T(i2 & 1, (599187 & i2) != 599186)) {
            if (z2) {
                j = z ? w33Var.b : w33Var.f;
            } else {
                j = z ? w33Var.j : w33Var.n;
            }
            if (z2) {
                j2 = z ? w33Var.a : w33Var.e;
            } else {
                j2 = z ? w33Var.i : w33Var.m;
            }
            au2 au2VarA = hu2.a(xp1.H, ov0Var);
            float f2 = xp1.G;
            if (z2) {
                j3 = j2;
                j4 = z ? w33Var.c : w33Var.g;
            } else {
                j3 = j2;
                j4 = z ? w33Var.k : w33Var.o;
            }
            dv1 dv1VarK = xp1.k(ji2.w(dv1Var, f2, j4, au2VarA), j, au2VarA);
            er1 er1VarC = ws.c(j9.f, false);
            int iT = ks.T(ov0Var);
            l72 l72VarL = ov0Var.l();
            dv1 dv1VarH = xp1.H(ov0Var, dv1VarK);
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            gh ghVar = v20.e;
            q73.h(ov0Var, ghVar, er1VarC);
            gh ghVar2 = v20.d;
            q73.h(ov0Var, ghVar2, l72VarL);
            gh ghVar3 = v20.f;
            if (ov0Var.S || !o51.f(ov0Var.Q(), Integer.valueOf(iT))) {
                az2.r(iT, ov0Var, iT, ghVar3);
            }
            gh ghVar4 = v20.c;
            q73.h(ov0Var, ghVar4, dv1VarH);
            dv1 dv1VarK2 = xp1.k(m11.a(k22.k(av1.a, j9.i).d(new ia3(ix1Var, z, mc0.K(vv1.f, ov0Var))), ix1Var, sh2.a(false, xp1.E / 2.0f, 4)), j3, au2Var);
            er1 er1VarC2 = ws.c(j9.j, false);
            int iT2 = ks.T(ov0Var);
            l72 l72VarL2 = ov0Var.l();
            dv1 dv1VarH2 = xp1.H(ov0Var, dv1VarK2);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, er1VarC2);
            q73.h(ov0Var, ghVar2, l72VarL2);
            if (ov0Var.S || !o51.f(ov0Var.Q(), Integer.valueOf(iT2))) {
                az2.r(iT2, ov0Var, iT2, ghVar3);
            }
            q73.h(ov0Var, ghVar4, dv1VarH2);
            ov0Var.c0(1236071411);
            ov0Var.p(false);
            ov0Var.p(true);
            ov0Var.p(true);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0() { // from class: y33
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b43.b(dv1Var, z, z2, w33Var, ix1Var, au2Var, (f30) obj, wc0.m0(i | 1));
                    return mf3.a;
                }
            };
        }
    }
}
