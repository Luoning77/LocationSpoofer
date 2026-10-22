package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class dx2 {
    public static final float a = k22.M;
    public static final float b;
    public static final long c;
    public static final float d;
    public static final float e;
    public static final ji3 f;

    static {
        float f2 = k22.K;
        b = f2;
        float f3 = k22.I;
        c = vd0.a(f2, f3);
        vd0.a(f3, f2);
        d = 6.0f;
        e = 2.0f;
        f = new ji3(ww2.e);
    }

    public static final void a(final float f2, final lu0 lu0Var, dv1 dv1Var, boolean z, final fy fyVar, final int i, au0 au0Var, final mw2 mw2Var, ix1 ix1Var, f30 f30Var, final int i2, final int i3) {
        final dv1 dv1Var2;
        int i4;
        au0 au0Var2;
        int i5;
        final boolean z2;
        final ix1 ix1Var2;
        final au0 au0Var3;
        dv1 dv1Var3;
        au0 au0Var4;
        ix1 ix1Var3;
        boolean z3;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-202044027);
        int i6 = i2 | (ov0Var.c(f2) ? 4 : 2) | (ov0Var.h(lu0Var) ? 32 : 16);
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 = i6 | 384;
            dv1Var2 = dv1Var;
        } else {
            dv1Var2 = dv1Var;
            i4 = i6 | (ov0Var.f(dv1Var2) ? 256 : WorkQueueKt.BUFFER_CAPACITY);
        }
        int i8 = i4 | 3072 | (ov0Var.f(fyVar) ? 16384 : 8192);
        int i9 = i3 & 64;
        if (i9 != 0) {
            i5 = i8 | 1572864;
            au0Var2 = au0Var;
        } else {
            au0Var2 = au0Var;
            i5 = i8 | (ov0Var.h(au0Var2) ? 1048576 : 524288);
        }
        int i10 = i5 | (ov0Var.f(mw2Var) ? 8388608 : 4194304) | 100663296;
        if (ov0Var.T(i10 & 1, (38347923 & i10) != 38347922)) {
            ov0Var.Y();
            if ((i2 & 1) == 0 || ov0Var.B()) {
                dv1Var3 = i7 != 0 ? av1.a : dv1Var2;
                if (i9 != 0) {
                    au0Var2 = null;
                }
                Object objQ = ov0Var.Q();
                if (objQ == d30.a) {
                    objQ = new ix1();
                    ov0Var.m0(objQ);
                }
                au0Var4 = au0Var2;
                ix1Var3 = (ix1) objQ;
                z3 = true;
            } else {
                ov0Var.W();
                dv1Var3 = dv1Var2;
                au0Var4 = au0Var2;
                z3 = z;
                ix1Var3 = ix1Var;
            }
            ov0Var.q();
            int i11 = i10 >> 6;
            b(f2, lu0Var, dv1Var3, z3, au0Var4, mw2Var, ix1Var3, i, sb.a0(308249025, new xw2(ix1Var3, mw2Var, z3), ov0Var), sb.a0(-1843234110, new yw2(z3, mw2Var), ov0Var), fyVar, ov0Var, 14155776 | (i10 & 14) | 905969664 | (i10 & 112) | (i10 & 896) | 3072 | (57344 & i11) | (i11 & 458752), (i10 >> 12) & 14);
            au0Var3 = au0Var4;
            ix1Var2 = ix1Var3;
            z2 = z3;
            dv1Var2 = dv1Var3;
        } else {
            ov0Var.W();
            z2 = z;
            ix1Var2 = ix1Var;
            au0Var3 = au0Var2;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0(f2, lu0Var, dv1Var2, z2, fyVar, i, au0Var3, mw2Var, ix1Var2, i2, i3) { // from class: vw2
                public final /* synthetic */ float e;
                public final /* synthetic */ lu0 f;
                public final /* synthetic */ dv1 g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ fy i;
                public final /* synthetic */ int j;
                public final /* synthetic */ au0 k;
                public final /* synthetic */ mw2 l;
                public final /* synthetic */ ix1 m;
                public final /* synthetic */ int n;

                {
                    this.n = i3;
                }

                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM0 = wc0.m0(196609);
                    dx2.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (f30) obj, iM0, this.n);
                    return mf3.a;
                }
            };
        }
    }

    public static final void b(final float f2, final lu0 lu0Var, final dv1 dv1Var, final boolean z, final au0 au0Var, mw2 mw2Var, final ix1 ix1Var, final int i, final p10 p10Var, final p10 p10Var2, final fy fyVar, f30 f30Var, final int i2, final int i3) {
        int i4;
        mw2 mw2Var2;
        ix1 ix1Var2;
        p10 p10Var3;
        int i5;
        ov0 ov0Var;
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(985901935);
        if ((i2 & 6) == 0) {
            i4 = (ov0Var2.c(f2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ov0Var2.h(lu0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ov0Var2.f(dv1Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i2 & 3072) == 0) {
            i4 |= ov0Var2.g(z) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i2 & 24576) == 0) {
            i4 |= ov0Var2.h(au0Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            mw2Var2 = mw2Var;
            i4 |= ov0Var2.f(mw2Var2) ? 131072 : 65536;
        } else {
            mw2Var2 = mw2Var;
        }
        if ((1572864 & i2) == 0) {
            ix1Var2 = ix1Var;
            i4 |= ov0Var2.f(ix1Var2) ? 1048576 : 524288;
        } else {
            ix1Var2 = ix1Var;
        }
        if ((12582912 & i2) == 0) {
            i4 |= ov0Var2.d(i) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            p10Var3 = p10Var;
            i4 |= ov0Var2.h(p10Var3) ? 67108864 : 33554432;
        } else {
            p10Var3 = p10Var;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= ov0Var2.h(p10Var2) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (ov0Var2.f(fyVar) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if (ov0Var2.T(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 3) == 2) ? false : true)) {
            ov0Var2.Y();
            if ((i2 & 1) != 0 && !ov0Var2.B()) {
                ov0Var2.W();
            }
            ov0Var2.q();
            int i6 = i4;
            boolean z2 = ((29360128 & i4) == 8388608) | ((((i5 & 14) ^ 6) > 4 && ov0Var2.f(fyVar)) || (i5 & 6) == 4);
            Object objQ = ov0Var2.Q();
            if (z2 || objQ == d30.a) {
                objQ = new ex2(f2, i, au0Var, fyVar);
                ov0Var2.m0(objQ);
            }
            ex2 ex2Var = (ex2) objQ;
            ex2Var.b = au0Var;
            ex2Var.e = lu0Var;
            ex2Var.d(f2);
            int i7 = i6 >> 9;
            ov0Var = ov0Var2;
            c(ex2Var, dv1Var, z, null, ix1Var2, p10Var3, p10Var2, ov0Var, ((i6 >> 3) & 1008) | ((i6 >> 6) & 57344) | (i7 & 458752) | (i7 & 3670016));
        } else {
            ov0Var = ov0Var2;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            final mw2 mw2Var3 = mw2Var2;
            ee2VarT.d = new pu0() { // from class: tw2
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM0 = wc0.m0(i2 | 1);
                    int iM1 = wc0.m0(i3);
                    dx2.b(f2, lu0Var, dv1Var, z, au0Var, mw2Var3, ix1Var, i, p10Var, p10Var2, fyVar, (f30) obj, iM0, iM1);
                    return mf3.a;
                }
            };
        }
    }

    public static final void c(ex2 ex2Var, dv1 dv1Var, boolean z, mw2 mw2Var, ix1 ix1Var, p10 p10Var, p10 p10Var2, f30 f30Var, int i) {
        int i2;
        mw2 mw2Var2;
        int i3;
        mw2 mw2VarF;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(409861960);
        if ((i & 6) == 0) {
            i2 = (ov0Var.h(ex2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ov0Var.f(dv1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ov0Var.g(z) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i & 3072) == 0) {
            i2 |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i2 |= ov0Var.f(ix1Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ov0Var.h(p10Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= ov0Var.h(p10Var2) ? 1048576 : 524288;
        }
        if (ov0Var.T(i2 & 1, (599187 & i2) != 599186)) {
            ov0Var.Y();
            if ((i & 1) == 0 || ov0Var.B()) {
                sw2 sw2Var = sw2.a;
                i3 = i2 & (-7169);
                mw2VarF = sw2.f((kz) ov0Var.j(mz.a));
            } else {
                ov0Var.W();
                i3 = i2 & (-7169);
                mw2VarF = mw2Var;
            }
            ov0Var.q();
            if (ex2Var.a < 0) {
                fo.i("steps should be >= 0");
                return;
            } else {
                int i4 = i3 >> 3;
                d(dv1Var, ex2Var, z, ix1Var, p10Var, p10Var2, ov0Var, (i3 & 896) | (i4 & 14) | ((i3 << 3) & 112) | (i4 & 7168) | (57344 & i4) | (i4 & 458752));
                mw2Var2 = mw2VarF;
            }
        } else {
            ov0Var.W();
            mw2Var2 = mw2Var;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new vw(ex2Var, dv1Var, z, mw2Var2, ix1Var, p10Var, p10Var2, i);
        }
    }

    public static final void d(dv1 dv1Var, ex2 ex2Var, boolean z, ix1 ix1Var, p10 p10Var, p10 p10Var2, f30 f30Var, int i) {
        int i2;
        p10 p10Var3;
        ex2 ex2Var2;
        p10 p10Var4;
        Object obj;
        Object obj2;
        boolean z2;
        Object obj3;
        p10 p10Var5 = p10Var2;
        s52 s52Var = ex2Var.d;
        fy fyVar = ex2Var.c;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(898172835);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (ov0Var.f(dv1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ov0Var.h(ex2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ov0Var.g(z) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i & 3072) == 0) {
            i2 |= ov0Var.f(ix1Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i2 |= ov0Var.h(p10Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ov0Var.h(p10Var5) ? 131072 : 65536;
        }
        int i4 = i2;
        boolean z3 = false;
        if (ov0Var.T(i4 & 1, (i4 & 74899) != 74898)) {
            boolean z4 = ov0Var.j(z30.n) == qa1.f;
            ex2Var.j = z4;
            x32 x32Var = ex2Var.m;
            if (x32Var == x32.f && z4) {
                z3 = true;
            }
            av1 av1Var = av1.a;
            dv1 dv1VarB = z ? m33.b(av1Var, ex2Var, ix1Var, new qc(ex2Var, i3)) : av1Var;
            x32 x32Var2 = ex2Var.m;
            boolean zBooleanValue = ((Boolean) ex2Var.n.getValue()).booleanValue();
            boolean zH = ov0Var.h(ex2Var);
            Object objQ = ov0Var.Q();
            c30 c30Var = d30.a;
            if (zH || objQ == c30Var) {
                ax2 ax2Var = new ax2(ex2Var, null);
                ov0Var.m0(ax2Var);
                obj = ax2Var;
            } else {
                obj = objQ;
            }
            dv1 dv1Var2 = dv1VarB;
            dv1 dv1VarA = sf0.a(ex2Var, x32Var2, z, ix1Var, zBooleanValue, null, (qu0) obj, z3, 32);
            nw2 nw2Var = nw2.e;
            x32 x32Var3 = x32.e;
            dv1 dv1VarQ = x32Var == x32Var3 ? iw2.q(xp1.E(av1Var, nw2Var)) : iw2.s(xp1.E(av1Var, nw2Var));
            dy0 dy0Var = v41.a;
            dv1 dv1VarD = dv1Var.d(au1.a);
            float f2 = b;
            float f3 = a;
            dv1 dv1VarD2 = gs2.a(iw2.j(dv1VarD, x32Var == x32Var3 ? f3 : f2, x32Var == x32Var3 ? f2 : f3, 0.0f, 0.0f, 12), false, new yc(z, ex2Var, 3)).d(x32Var == x32Var3 ? x1.b : x1.a);
            final float fG = s52Var.g();
            final fy fyVar2 = new fy(Float.valueOf(fyVar.e).floatValue(), Float.valueOf(fyVar.f).floatValue());
            final int i5 = ex2Var.a;
            dv1 dv1VarS = n51.s(gs2.a(dv1VarD2, true, new lu0() { // from class: wc2
                @Override // defpackage.lu0
                public final Object invoke(Object obj4) {
                    Float fValueOf = Float.valueOf(fG);
                    fy fyVar3 = fyVar2;
                    oc2 oc2Var = new oc2(((Number) mh0.x(fValueOf, fyVar3)).floatValue(), fyVar3, i5);
                    x81[] x81VarArr = qs2.a;
                    rs2 rs2Var = os2.c;
                    x81 x81Var = qs2.a[1];
                    ((ss2) obj4).a(rs2Var, oc2Var);
                    return mf3.a;
                }
            }), ix1Var, z);
            int i6 = ex2Var.a;
            float fG2 = s52Var.g();
            lu0 lu0Var = ex2Var.e;
            boolean z5 = z3;
            au0 au0Var = ex2Var.b;
            if (i6 < 0) {
                fo.i("steps should be >= 0");
                return;
            }
            dv1 dv1Var3 = dv1VarQ;
            ex2Var2 = ex2Var;
            dv1 dv1VarD3 = zm3.A(dv1VarS, new bx2(z, lu0Var, fyVar, i6, z5, fG2, au0Var)).d(dv1Var2).d(dv1VarA);
            boolean zH2 = ov0Var.h(ex2Var2);
            Object objQ2 = ov0Var.Q();
            if (zH2 || objQ2 == c30Var) {
                obj2 = objQ2;
                kg1 kg1Var = new kg1(ex2Var2, 1);
                ov0Var.m0(kg1Var);
                obj2 = kg1Var;
            }
            er1 er1Var = (er1) obj2;
            int iT = ks.T(ov0Var);
            l72 l72VarL = ov0Var.l();
            dv1 dv1VarH = xp1.H(ov0Var, dv1VarD3);
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            gh ghVar = v20.e;
            q73.h(ov0Var, ghVar, er1Var);
            gh ghVar2 = v20.d;
            q73.h(ov0Var, ghVar2, l72VarL);
            gh ghVar3 = v20.f;
            if (ov0Var.S || !o51.f(ov0Var.Q(), Integer.valueOf(iT))) {
                az2.r(iT, ov0Var, iT, ghVar3);
            }
            gh ghVar4 = v20.c;
            q73.h(ov0Var, ghVar4, dv1VarH);
            boolean zH3 = ov0Var.h(ex2Var2);
            Object objQ3 = ov0Var.Q();
            if (zH3 || objQ3 == c30Var) {
                z2 = false;
                uw2 uw2Var = new uw2(ex2Var2, false ? 1 : 0);
                ov0Var.m0(uw2Var);
                obj3 = uw2Var;
            } else {
                z2 = false;
                obj3 = objQ3;
            }
            dv1 dv1VarK = ji2.K(dv1Var3, (lu0) obj3);
            pr prVar = j9.f;
            er1 er1VarC = ws.c(prVar, z2);
            int iT2 = ks.T(ov0Var);
            l72 l72VarL2 = ov0Var.l();
            dv1 dv1VarH2 = xp1.H(ov0Var, dv1VarK);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, er1VarC);
            q73.h(ov0Var, ghVar2, l72VarL2);
            if (ov0Var.S || !o51.f(ov0Var.Q(), Integer.valueOf(iT2))) {
                az2.r(iT2, ov0Var, iT2, ghVar3);
            }
            q73.h(ov0Var, ghVar4, dv1VarH2);
            int i7 = (i4 >> 3) & 14;
            p10 p10Var6 = p10Var;
            p10Var6.invoke(ex2Var2, ov0Var, Integer.valueOf(((i4 >> 9) & 112) | i7));
            ov0Var.p(true);
            dv1 dv1VarE = xp1.E(av1Var, nw2.f);
            er1 er1VarC2 = ws.c(prVar, false);
            int iT3 = ks.T(ov0Var);
            l72 l72VarL3 = ov0Var.l();
            dv1 dv1VarH3 = xp1.H(ov0Var, dv1VarE);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, er1VarC2);
            q73.h(ov0Var, ghVar2, l72VarL3);
            if (ov0Var.S || !o51.f(ov0Var.Q(), Integer.valueOf(iT3))) {
                az2.r(iT3, ov0Var, iT3, ghVar3);
            }
            q73.h(ov0Var, ghVar4, dv1VarH3);
            p10 p10Var7 = p10Var2;
            p10Var7.invoke(ex2Var2, ov0Var, Integer.valueOf(((i4 >> 12) & 112) | i7));
            ov0Var.p(true);
            ov0Var.p(true);
            p10Var3 = p10Var6;
            p10Var4 = p10Var7;
        } else {
            p10Var3 = p10Var;
            ex2Var2 = ex2Var;
            ov0Var.W();
            p10Var4 = p10Var5;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new bd(dv1Var, ex2Var2, z, ix1Var, p10Var3, p10Var4, i);
        }
    }

    public static final float e(float f2, float[] fArr, float f3, float f4) {
        Float fValueOf;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f5 = fArr[0];
            int i = 1;
            int length = fArr.length - 1;
            if (length == 0) {
                fValueOf = Float.valueOf(f5);
            } else {
                float fAbs = Math.abs(gh0.E(f3, f4, f5) - f2);
                if (1 <= length) {
                    while (true) {
                        float f6 = fArr[i];
                        float fAbs2 = Math.abs(gh0.E(f3, f4, f6) - f2);
                        if (Float.compare(fAbs, fAbs2) > 0) {
                            f5 = f6;
                            fAbs = fAbs2;
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
                fValueOf = Float.valueOf(f5);
            }
        }
        return fValueOf != null ? gh0.E(f3, f4, fValueOf.floatValue()) : f2;
    }
}
