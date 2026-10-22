package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class ix {
    public static final b52 a;

    static {
        zm3.e(2, 8.0f);
        a = zm3.e(2, 8.0f);
        zm3.e(2, 8.0f);
    }

    public static final void a(final p10 p10Var, final q93 q93Var, final long j, final long j2, final long j3, final float f, final z42 z42Var, f30 f30Var, final int i) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-2070754602);
        int i2 = i | (ov0Var.h(p10Var) ? 4 : 2) | (ov0Var.f(q93Var) ? 32 : 16) | (ov0Var.e(j) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var.h(null) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (ov0Var.h(null) ? 16384 : 8192) | (ov0Var.h(null) ? 131072 : 65536) | (ov0Var.e(j2) ? 1048576 : 524288) | (ov0Var.e(j3) ? 8388608 : 4194304) | (ov0Var.c(f) ? 67108864 : 33554432) | (ov0Var.f(z42Var) ? 536870912 : 268435456);
        if (ov0Var.T(i2 & 1, (306783379 & i2) != 306783378)) {
            k22.c(new kk[]{v50.a.a(new hz(j)), s83.a.a(q93Var)}, sb.a0(-668234218, new gx(f, z42Var, j2, p10Var, j3), ov0Var), ov0Var, 56);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0(q93Var, j, j2, j3, f, z42Var, i) { // from class: fx
                public final /* synthetic */ q93 f;
                public final /* synthetic */ long g;
                public final /* synthetic */ long h;
                public final /* synthetic */ long i;
                public final /* synthetic */ float j;
                public final /* synthetic */ z42 k;

                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM0 = wc0.m0(1);
                    ix.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, (f30) obj, iM0);
                    return mf3.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX WARN: Code duplicated, block: B:36:0x007b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x0100  */
    /* JADX WARN: Code duplicated, block: B:65:0x0103  */
    /* JADX WARN: Code duplicated, block: B:68:0x0148  */
    /* JADX WARN: Code duplicated, block: B:71:0x0158  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    public static final void b(final boolean z, final au0 au0Var, final p10 p10Var, dv1 dv1Var, boolean z2, au2 au2Var, np2 np2Var, op2 op2Var, is isVar, f30 f30Var, final int i, final int i2) {
        final dv1 dv1Var2;
        int i3;
        boolean z3;
        int i4;
        final np2 np2Var2;
        int i5;
        boolean z4;
        final op2 op2Var2;
        final is isVar2;
        final boolean z5;
        final au2 au2Var2;
        ee2 ee2VarT;
        int i6;
        int i7;
        np2 np2VarG;
        int i8;
        long jD;
        long j;
        long jC;
        float f;
        boolean z6;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1385473344);
        int i9 = i | (ov0Var.g(z) ? 4 : 2) | (ov0Var.h(au0Var) ? 32 : 16);
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 = i9 | 3072;
            dv1Var2 = dv1Var;
        } else {
            dv1Var2 = dv1Var;
            i3 = i9 | (ov0Var.f(dv1Var2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        }
        int i11 = i2 & 16;
        if (i11 != 0) {
            i4 = i3 | 24576;
            z3 = z2;
        } else {
            z3 = z2;
            i4 = i3 | (ov0Var.g(z3) ? 16384 : 8192);
        }
        int i12 = i4 | 5963776;
        if ((i2 & 256) == 0) {
            np2Var2 = np2Var;
            int i13 = ov0Var.f(np2Var2) ? 67108864 : 33554432;
            i5 = i12 | i13 | 268435456;
            if ((306783379 & i5) == 306783378) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (ov0Var.T(i5 & 1, z4)) {
                ov0Var.Y();
                if ((i & 1) != 0 || ov0Var.B()) {
                    if (i10 != 0) {
                        dv1Var2 = av1.a;
                    }
                    if (i11 != 0) {
                        z3 = true;
                    }
                    au2 au2VarA = hu2.a(zm3.j, ov0Var);
                    i6 = i5 & (-29360129);
                    if ((i2 & 256) != 0) {
                        np2VarG = mh0.G((kz) ov0Var.j(mz.a));
                        i7 = i5 & (-264241153);
                    } else {
                        i7 = i6;
                        np2VarG = np2Var2;
                    }
                    op2 op2Var3 = new op2(zm3.s, zm3.m);
                    i8 = i7 & (-1879048193);
                    jD = mz.d(zm3.t, ov0Var);
                    j = hz.f;
                    jC = hz.c(zm3.q, mz.d(zm3.p, ov0Var));
                    f = zm3.u;
                    if (z3) {
                        if (z) {
                            jD = j;
                        }
                    } else if (z) {
                        jD = j;
                    } else {
                        jD = jC;
                    }
                    if (z) {
                        f = 0.0f;
                    }
                    is isVarH = da0.h(f, jD);
                    boolean z7 = z3;
                    au2Var2 = au2VarA;
                    z6 = z7;
                    np2Var2 = np2VarG;
                    op2Var2 = op2Var3;
                    isVar2 = isVarH;
                } else {
                    ov0Var.W();
                    int i14 = i5 & (-29360129);
                    if ((i2 & 256) != 0) {
                        i14 = i5 & (-264241153);
                    }
                    i8 = i14 & (-1879048193);
                    op2Var2 = op2Var;
                    isVar2 = isVar;
                    z6 = z3;
                    au2Var2 = au2Var;
                }
                int i15 = i8;
                dv1 dv1Var3 = dv1Var2;
                ov0Var.q();
                c(z, dv1Var3, au0Var, z6, p10Var, le3.a(zm3.v, ov0Var), au2Var2, np2Var2, op2Var2, isVar2, 32.0f, a, ov0Var, (i15 & 14) | 12582912 | ((i15 >> 6) & 112) | ((i15 << 3) & 896) | ((i15 >> 3) & 7168) | 102260736, ((i15 >> 24) & 14) | 224256);
                dv1Var2 = dv1Var3;
                z5 = z6;
            } else {
                ov0Var.W();
                op2Var2 = op2Var;
                isVar2 = isVar;
                z5 = z3;
                au2Var2 = au2Var;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new pu0(z, au0Var, p10Var, dv1Var2, z5, au2Var2, np2Var2, op2Var2, isVar2, i, i2) { // from class: dx
                    public final /* synthetic */ boolean e;
                    public final /* synthetic */ au0 f;
                    public final /* synthetic */ p10 g;
                    public final /* synthetic */ dv1 h;
                    public final /* synthetic */ boolean i;
                    public final /* synthetic */ au2 j;
                    public final /* synthetic */ np2 k;
                    public final /* synthetic */ op2 l;
                    public final /* synthetic */ is m;
                    public final /* synthetic */ int n;

                    {
                        this.n = i2;
                    }

                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM0 = wc0.m0(385);
                        ix.b(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (f30) obj, iM0, this.n);
                        return mf3.a;
                    }
                };
            }
        }
        np2Var2 = np2Var;
        i5 = i12 | i13 | 268435456;
        if ((306783379 & i5) == 306783378) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (ov0Var.T(i5 & 1, z4)) {
            ov0Var.Y();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    dv1Var2 = av1.a;
                }
                if (i11 != 0) {
                    z3 = true;
                }
                au2 au2VarA2 = hu2.a(zm3.j, ov0Var);
                i6 = i5 & (-29360129);
                if ((i2 & 256) != 0) {
                    np2VarG = mh0.G((kz) ov0Var.j(mz.a));
                    i7 = i5 & (-264241153);
                } else {
                    i7 = i6;
                    np2VarG = np2Var2;
                }
                op2 op2Var4 = new op2(zm3.s, zm3.m);
                i8 = i7 & (-1879048193);
                jD = mz.d(zm3.t, ov0Var);
                j = hz.f;
                jC = hz.c(zm3.q, mz.d(zm3.p, ov0Var));
                f = zm3.u;
                if (z3) {
                    if (z) {
                        jD = j;
                    }
                } else if (z) {
                    jD = j;
                } else {
                    jD = jC;
                }
                if (z) {
                    f = 0.0f;
                }
                is isVarH2 = da0.h(f, jD);
                boolean z8 = z3;
                au2Var2 = au2VarA2;
                z6 = z8;
                np2Var2 = np2VarG;
                op2Var2 = op2Var4;
                isVar2 = isVarH2;
            } else {
                if (i10 != 0) {
                    dv1Var2 = av1.a;
                }
                if (i11 != 0) {
                    z3 = true;
                }
                au2 au2VarA3 = hu2.a(zm3.j, ov0Var);
                i6 = i5 & (-29360129);
                if ((i2 & 256) != 0) {
                    np2VarG = mh0.G((kz) ov0Var.j(mz.a));
                    i7 = i5 & (-264241153);
                } else {
                    i7 = i6;
                    np2VarG = np2Var2;
                }
                op2 op2Var5 = new op2(zm3.s, zm3.m);
                i8 = i7 & (-1879048193);
                jD = mz.d(zm3.t, ov0Var);
                j = hz.f;
                jC = hz.c(zm3.q, mz.d(zm3.p, ov0Var));
                f = zm3.u;
                if (z3) {
                    if (z) {
                        jD = j;
                    }
                } else if (z) {
                    jD = j;
                } else {
                    jD = jC;
                }
                if (z) {
                    f = 0.0f;
                }
                is isVarH3 = da0.h(f, jD);
                boolean z9 = z3;
                au2Var2 = au2VarA3;
                z6 = z9;
                np2Var2 = np2VarG;
                op2Var2 = op2Var5;
                isVar2 = isVarH3;
            }
            int i16 = i8;
            dv1 dv1Var4 = dv1Var2;
            ov0Var.q();
            c(z, dv1Var4, au0Var, z6, p10Var, le3.a(zm3.v, ov0Var), au2Var2, np2Var2, op2Var2, isVar2, 32.0f, a, ov0Var, (i16 & 14) | 12582912 | ((i16 >> 6) & 112) | ((i16 << 3) & 896) | ((i16 >> 3) & 7168) | 102260736, ((i16 >> 24) & 14) | 224256);
            dv1Var2 = dv1Var4;
            z5 = z6;
        } else {
            ov0Var.W();
            op2Var2 = op2Var;
            isVar2 = isVar;
            z5 = z3;
            au2Var2 = au2Var;
        }
        ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0(z, au0Var, p10Var, dv1Var2, z5, au2Var2, np2Var2, op2Var2, isVar2, i, i2) { // from class: dx
                public final /* synthetic */ boolean e;
                public final /* synthetic */ au0 f;
                public final /* synthetic */ p10 g;
                public final /* synthetic */ dv1 h;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ au2 j;
                public final /* synthetic */ np2 k;
                public final /* synthetic */ op2 l;
                public final /* synthetic */ is m;
                public final /* synthetic */ int n;

                {
                    this.n = i2;
                }

                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM0 = wc0.m0(385);
                    ix.b(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (f30) obj, iM0, this.n);
                    return mf3.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:158:0x022f  */
    public static final void c(final boolean z, final dv1 dv1Var, final au0 au0Var, final boolean z2, final p10 p10Var, final q93 q93Var, final au2 au2Var, final np2 np2Var, final op2 op2Var, final is isVar, final float f, final z42 z42Var, f30 f30Var, final int i, final int i2) {
        int i3;
        int i4;
        ov0 ov0Var;
        long j;
        float f2;
        oh ohVar;
        boolean z3;
        ti tiVar;
        ix1 ix1Var;
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(1786844928);
        if ((i & 6) == 0) {
            i3 = (ov0Var2.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ov0Var2.f(dv1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ov0Var2.h(au0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        int i5 = i & 3072;
        int i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        if (i5 == 0) {
            i3 |= ov0Var2.g(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ov0Var2.h(p10Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= ov0Var2.f(q93Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= ov0Var2.h(null) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= ov0Var2.h(null) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= ov0Var2.h(null) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= ov0Var2.f(au2Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (ov0Var2.f(np2Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ov0Var2.f(op2Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ov0Var2.f(isVar) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i2 & 3072) == 0) {
            if (ov0Var2.c(f)) {
                i6 = 2048;
            }
            i4 |= i6;
        }
        if ((i2 & 24576) == 0) {
            i4 |= ov0Var2.f(z42Var) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= ov0Var2.f(null) ? 131072 : 65536;
        }
        int i7 = i3;
        boolean z4 = true;
        if (ov0Var2.T(i7 & 1, ((306783379 & i3) == 306783378 && (i4 & 74899) == 74898) ? false : true)) {
            ov0Var2.c0(73215547);
            Object objQ = ov0Var2.Q();
            c30 c30Var = d30.a;
            if (objQ == c30Var) {
                objQ = new ix1();
                ov0Var2.m0(objQ);
            }
            ix1 ix1Var2 = (ix1) objQ;
            ov0Var2.p(false);
            Object objQ2 = ov0Var2.Q();
            if (objQ2 == c30Var) {
                objQ2 = new v1(27);
                ov0Var2.m0(objQ2);
            }
            dv1 dv1VarA = gs2.a(dv1Var, false, (lu0) objQ2);
            if (z2) {
                j = !z ? np2Var.a : np2Var.i;
            } else {
                j = z ? np2Var.j : np2Var.e;
            }
            if (op2Var == null) {
                ov0Var2.c0(73531126);
                ov0Var2.p(false);
                ix1Var2 = ix1Var2;
                c30Var = c30Var;
                j = j;
                tiVar = null;
            } else {
                ov0Var2.c0(-828912021);
                int i8 = ((i4 << 3) & 896) | ((i7 >> 9) & 14);
                Object objQ3 = ov0Var2.Q();
                if (objQ3 == c30Var) {
                    objQ3 = new fy2();
                    ov0Var2.m0(objQ3);
                }
                fy2 fy2Var = (fy2) objQ3;
                Object objQ4 = ov0Var2.Q();
                if (objQ4 == c30Var) {
                    objQ4 = ke0.H(null);
                    ov0Var2.m0(objQ4);
                }
                ey1 ey1Var = (ey1) objQ4;
                boolean zF = ov0Var2.f(ix1Var2);
                Object objQ5 = ov0Var2.Q();
                if (zF || objQ5 == c30Var) {
                    objQ5 = new ju(ix1Var2, fy2Var, null, 2);
                    ov0Var2.m0(objQ5);
                }
                oi0.e(ov0Var2, (pu0) objQ5, ix1Var2);
                s41 s41Var = (s41) zy.u0(fy2Var);
                if (!z2 || (s41Var instanceof vb2)) {
                    f2 = 0.0f;
                } else if (s41Var instanceof ly0) {
                    f2 = op2Var.a;
                } else if (!(s41Var instanceof jp0) && (s41Var instanceof mf0)) {
                    f2 = op2Var.b;
                } else {
                    f2 = 0.0f;
                }
                Object objQ6 = ov0Var2.Q();
                if (objQ6 == c30Var) {
                    objQ6 = new oh(new td0(f2), o51.x0, null, 12);
                    ov0Var2.m0(objQ6);
                }
                oh ohVar2 = (oh) objQ6;
                td0 td0Var = new td0(f2);
                boolean zH = ov0Var2.h(ohVar2) | ov0Var2.c(f2);
                if ((((i8 & 14) ^ 6) <= 4 || !ov0Var2.g(z2)) && (i8 & 6) != 4) {
                    z4 = false;
                }
                boolean zH2 = zH | z4 | ov0Var2.h(s41Var);
                Object objQ7 = ov0Var2.Q();
                if (zH2 || objQ7 == c30Var) {
                    ohVar = ohVar2;
                    z3 = false;
                    ku kuVar = new ku(ohVar, f2, z2, s41Var, ey1Var, null);
                    ov0Var2.m0(kuVar);
                    objQ7 = kuVar;
                } else {
                    ohVar = ohVar2;
                    z3 = false;
                }
                oi0.e(ov0Var2, (pu0) objQ7, td0Var);
                tiVar = ohVar.c;
                ov0Var2.p(z3);
            }
            float f3 = tiVar != null ? ((td0) tiVar.f.getValue()).e : 0.0f;
            c30 c30Var2 = c30Var;
            p10 p10VarA0 = sb.a0(-990050154, new hx(np2Var, z2, z, p10Var, q93Var, f, z42Var), ov0Var2);
            hh0 hh0Var = e33.a;
            long jB = mz.b(j, ov0Var2);
            if (ix1Var2 == null) {
                ov0Var2.c0(1528143336);
                Object objQ8 = ov0Var2.Q();
                if (objQ8 == c30Var2) {
                    objQ8 = new ix1();
                    ov0Var2.m0(objQ8);
                }
                ix1Var = (ix1) objQ8;
                ov0Var2.p(false);
            } else {
                ov0Var2.c0(-227800369);
                ov0Var2.p(false);
                ix1Var = ix1Var2;
            }
            hh0 hh0Var2 = e33.a;
            float f4 = ((td0) ov0Var2.j(hh0Var2)).e + 0.0f;
            ov0Var = ov0Var2;
            k22.c(new kk[]{v50.a.a(new hz(jB)), hh0Var2.a(new td0(f4))}, sb.a0(1508735219, new d33(dv1VarA, au2Var, j, f4, isVar, z, ix1Var, z2, au0Var, f3, p10VarA0), ov0Var), ov0Var, 56);
        } else {
            ov0Var = ov0Var2;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0() { // from class: ex
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM0 = wc0.m0(i | 1);
                    int iM1 = wc0.m0(i2);
                    ix.c(z, dv1Var, au0Var, z2, p10Var, q93Var, au2Var, np2Var, op2Var, isVar, f, z42Var, (f30) obj, iM0, iM1);
                    return mf3.a;
                }
            };
        }
    }
}
