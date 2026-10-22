package defpackage;

import java.util.WeakHashMap;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class zj {
    public static final hh0 a = new hh0(0, new p4(6));
    public static final float b;
    public static final float c;

    static {
        new de1(new p4(7));
        new f80(0.8f, 0.0f, 0.8f, 0.15f);
        b = 4.0f;
        c = 12.0f;
    }

    public static final void a(final dv1 dv1Var, final p10 p10Var, final q93 q93Var, final q93 q93Var2, final p10 p10Var2, final qu0 qu0Var, final float f, final sk3 sk3Var, final lb3 lb3Var, f30 f30Var, final int i, final int i2) {
        int i3;
        qu0 qu0Var2;
        float f2;
        int i4;
        nr nrVar = j9.r;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-2033800111);
        if ((i & 6) == 0) {
            i3 = (ov0Var.f(dv1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ov0Var.h(p10Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ov0Var.f(q93Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i & 3072) == 0) {
            i3 |= ov0Var.h(null) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i3 |= ov0Var.f(q93Var2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= ov0Var.f(nrVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= ov0Var.h(p10Var2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            qu0Var2 = qu0Var;
            i3 |= ov0Var.h(qu0Var2) ? 8388608 : 4194304;
        } else {
            qu0Var2 = qu0Var;
        }
        if ((100663296 & i) == 0) {
            f2 = f;
            i3 |= ov0Var.c(f2) ? 67108864 : 33554432;
        } else {
            f2 = f;
        }
        if ((805306368 & i) == 0) {
            i3 |= ov0Var.f(sk3Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (ov0Var.f(lb3Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ov0Var.f(null) ? 32 : 16;
        }
        if (ov0Var.T(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            ((za0) ov0Var.j(a)).a(new xv2(dv1Var, p10Var, q93Var, q93Var2, p10Var2, qu0Var2, f2, sk3Var, lb3Var), ov0Var, 0);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0() { // from class: yj
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zj.a(dv1Var, p10Var, q93Var, q93Var2, p10Var2, qu0Var, f, sk3Var, lb3Var, (f30) obj, wc0.m0(i | 1), wc0.m0(i2));
                    return mf3.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:27:0x0096  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    public static final void b(final p10 p10Var, dv1 dv1Var, final p10 p10Var2, qu0 qu0Var, float f, sk3 sk3Var, lb3 lb3Var, f30 f30Var, final int i, final int i2) {
        lb3 lb3VarG;
        int i3;
        boolean z;
        final dv1 dv1Var2;
        final qu0 qu0Var2;
        final float f2;
        final sk3 sk3Var2;
        final lb3 lb3Var2;
        ee2 ee2VarT;
        sk3 mf1Var;
        int i4;
        int i5;
        lb3 lb3Var3;
        qu0 qu0Var3;
        float f3;
        int i6;
        dv1 dv1Var3;
        float f4;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1784421840);
        int i7 = i | 93232;
        if ((i2 & 64) == 0) {
            lb3VarG = lb3Var;
            int i8 = ov0Var.f(lb3VarG) ? 1048576 : 524288;
            i3 = i7 | i8 | 12582912;
            if ((4793491 & i3) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (ov0Var.T(i3 & 1, z)) {
                ov0Var.Y();
                if ((i & 1) != 0 || ov0Var.B()) {
                    p10 p10Var3 = x10.a;
                    WeakHashMap weakHashMap = ul3.w;
                    mf1Var = new mf1(new lf3(q73.b(ov0Var).g, q73.b(ov0Var).b), 15 | 16);
                    i4 = (-458753) & i3;
                    if ((i2 & 64) != 0) {
                        lb3VarG = k93.g((kz) ov0Var.j(mz.a));
                        i5 = i3 & (-4128769);
                    } else {
                        i5 = i4;
                    }
                    lb3Var3 = lb3VarG;
                    qu0Var3 = p10Var3;
                    f3 = 64.0f;
                    i6 = i5;
                    dv1Var3 = av1.a;
                } else {
                    ov0Var.W();
                    i6 = i3 & (-458753);
                    if ((i2 & 64) != 0) {
                        i6 = i3 & (-4128769);
                    }
                    dv1Var3 = dv1Var;
                    qu0Var3 = qu0Var;
                    f3 = f;
                    mf1Var = sk3Var;
                    lb3Var3 = lb3VarG;
                }
                ov0Var.q();
                q93 q93VarA = le3.a(zm3.a, ov0Var);
                q93 q93Var = q93.d;
                if (!td0.b(f3, Float.NaN) || td0.b(f3, Float.POSITIVE_INFINITY)) {
                    f4 = 64.0f;
                } else {
                    f4 = f3;
                }
                a(dv1Var3, p10Var, q93VarA, q93Var, p10Var2, qu0Var3, f4, mf1Var, lb3Var3, ov0Var, 14380086, (i6 >> 18) & 126);
                dv1Var2 = dv1Var3;
                qu0Var2 = qu0Var3;
                sk3Var2 = mf1Var;
                lb3Var2 = lb3Var3;
                f2 = f3;
            } else {
                ov0Var.W();
                dv1Var2 = dv1Var;
                qu0Var2 = qu0Var;
                f2 = f;
                sk3Var2 = sk3Var;
                lb3Var2 = lb3VarG;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new pu0(dv1Var2, p10Var2, qu0Var2, f2, sk3Var2, lb3Var2, i, i2) { // from class: xj
                    public final /* synthetic */ dv1 f;
                    public final /* synthetic */ p10 g;
                    public final /* synthetic */ qu0 h;
                    public final /* synthetic */ float i;
                    public final /* synthetic */ sk3 j;
                    public final /* synthetic */ lb3 k;
                    public final /* synthetic */ int l;

                    {
                        this.l = i2;
                    }

                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM0 = wc0.m0(391);
                        zj.b(this.e, this.f, this.g, this.h, this.i, this.j, this.k, (f30) obj, iM0, this.l);
                        return mf3.a;
                    }
                };
            }
        }
        lb3VarG = lb3Var;
        i3 = i7 | i8 | 12582912;
        if ((4793491 & i3) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (ov0Var.T(i3 & 1, z)) {
            ov0Var.Y();
            if ((i & 1) != 0) {
                p10 p10Var4 = x10.a;
                WeakHashMap weakHashMap2 = ul3.w;
                mf1Var = new mf1(new lf3(q73.b(ov0Var).g, q73.b(ov0Var).b), 15 | 16);
                i4 = (-458753) & i3;
                if ((i2 & 64) != 0) {
                    lb3VarG = k93.g((kz) ov0Var.j(mz.a));
                    i5 = i3 & (-4128769);
                } else {
                    i5 = i4;
                }
                lb3Var3 = lb3VarG;
                qu0Var3 = p10Var4;
                f3 = 64.0f;
                i6 = i5;
                dv1Var3 = av1.a;
            } else {
                p10 p10Var5 = x10.a;
                WeakHashMap weakHashMap3 = ul3.w;
                mf1Var = new mf1(new lf3(q73.b(ov0Var).g, q73.b(ov0Var).b), 15 | 16);
                i4 = (-458753) & i3;
                if ((i2 & 64) != 0) {
                    lb3VarG = k93.g((kz) ov0Var.j(mz.a));
                    i5 = i3 & (-4128769);
                } else {
                    i5 = i4;
                }
                lb3Var3 = lb3VarG;
                qu0Var3 = p10Var5;
                f3 = 64.0f;
                i6 = i5;
                dv1Var3 = av1.a;
            }
            ov0Var.q();
            q93 q93VarA2 = le3.a(zm3.a, ov0Var);
            q93 q93Var2 = q93.d;
            if (td0.b(f3, Float.NaN)) {
                f4 = 64.0f;
            } else {
                f4 = 64.0f;
            }
            a(dv1Var3, p10Var, q93VarA2, q93Var2, p10Var2, qu0Var3, f4, mf1Var, lb3Var3, ov0Var, 14380086, (i6 >> 18) & 126);
            dv1Var2 = dv1Var3;
            qu0Var2 = qu0Var3;
            sk3Var2 = mf1Var;
            lb3Var2 = lb3Var3;
            f2 = f3;
        } else {
            ov0Var.W();
            dv1Var2 = dv1Var;
            qu0Var2 = qu0Var;
            f2 = f;
            sk3Var2 = sk3Var;
            lb3Var2 = lb3VarG;
        }
        ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0(dv1Var2, p10Var2, qu0Var2, f2, sk3Var2, lb3Var2, i, i2) { // from class: xj
                public final /* synthetic */ dv1 f;
                public final /* synthetic */ p10 g;
                public final /* synthetic */ qu0 h;
                public final /* synthetic */ float i;
                public final /* synthetic */ sk3 j;
                public final /* synthetic */ lb3 k;
                public final /* synthetic */ int l;

                {
                    this.l = i2;
                }

                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM0 = wc0.m0(391);
                    zj.b(this.e, this.f, this.g, this.h, this.i, this.j, this.k, (f30) obj, iM0, this.l);
                    return mf3.a;
                }
            };
        }
    }

    public static final void c(final dv1 dv1Var, final zn0 zn0Var, final long j, final long j2, final long j3, long j4, final p10 p10Var, final q93 q93Var, final q93 q93Var2, au0 au0Var, final p10 p10Var2, p10 p10Var3, final float f, f30 f30Var, final int i) {
        final au0 au0Var2;
        p10 p10Var4;
        ov0 ov0Var;
        final long j5 = j4;
        nr nrVar = j9.r;
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(126395868);
        int i2 = i | (ov0Var2.f(dv1Var) ? 4 : 2) | (ov0Var2.f(zn0Var) ? 32 : 16) | (ov0Var2.e(j) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var2.e(j2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (ov0Var2.e(j3) ? 16384 : 8192) | (ov0Var2.e(j5) ? 131072 : 65536) | (ov0Var2.h(p10Var) ? 1048576 : 524288) | (ov0Var2.f(q93Var) ? 8388608 : 4194304) | (ov0Var2.h(null) ? 67108864 : 33554432) | (ov0Var2.f(q93Var2) ? 536870912 : 268435456);
        int i3 = 1600566 | (ov0Var2.f(nrVar) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var2.h(p10Var2) ? 131072 : 65536) | (ov0Var2.c(f) ? 8388608 : 4194304);
        if (ov0Var2.T(i2 & 1, ((i2 & 306783379) == 306783378 && (4793491 & i3) == 4793490) ? false : true)) {
            boolean z = ((i2 & 112) == 32) | ((i3 & 896) == 256) | ((29360128 & i3) == 8388608);
            Object objQ = ov0Var2.Q();
            c30 c30Var = d30.a;
            if (z || objQ == c30Var) {
                objQ = new nb3(zn0Var, f);
                ov0Var2.m0(objQ);
            }
            nb3 nb3Var = (nb3) objQ;
            int iT = ks.T(ov0Var2);
            l72 l72VarL = ov0Var2.l();
            dv1 dv1VarH = xp1.H(ov0Var2, dv1Var);
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var);
            } else {
                ov0Var2.p0();
            }
            gh ghVar = v20.e;
            q73.h(ov0Var2, ghVar, nb3Var);
            gh ghVar2 = v20.d;
            q73.h(ov0Var2, ghVar2, l72VarL);
            gh ghVar3 = v20.f;
            if (ov0Var2.S || !o51.f(ov0Var2.Q(), Integer.valueOf(iT))) {
                az2.r(iT, ov0Var2, iT, ghVar3);
            }
            gh ghVar4 = v20.c;
            q73.h(ov0Var2, ghVar4, dv1VarH);
            av1 av1Var = av1.a;
            dv1 dv1VarE = xp1.E(av1Var, "navigationIcon");
            float f2 = b;
            dv1 dv1VarG = zm3.G(dv1VarE, f2, 0.0f, 0.0f, 0.0f, 14);
            pr prVar = j9.f;
            er1 er1VarC = ws.c(prVar, false);
            int iT2 = ks.T(ov0Var2);
            l72 l72VarL2 = ov0Var2.l();
            dv1 dv1VarH2 = xp1.H(ov0Var2, dv1VarG);
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, ghVar, er1VarC);
            q73.h(ov0Var2, ghVar2, l72VarL2);
            if (ov0Var2.S || !o51.f(ov0Var2.Q(), Integer.valueOf(iT2))) {
                az2.r(iT2, ov0Var2, iT2, ghVar3);
            }
            q73.h(ov0Var2, ghVar4, dv1VarH2);
            hh0 hh0Var = v50.a;
            k22.b(hh0Var.a(new hz(j)), p10Var2, ov0Var2, ((i3 >> 12) & 112) | 8);
            ov0Var2.p(true);
            ov0Var2.c0(-1359701523);
            dv1 dv1VarF = zm3.F(xp1.E(av1Var, "title"), f2, 0.0f, 2);
            ov0Var2.c0(510340109);
            ov0Var2.p(false);
            dv1 dv1VarD = dv1VarF.d(av1Var);
            Object objQ2 = ov0Var2.Q();
            if (objQ2 == c30Var) {
                au0Var2 = au0Var;
                objQ2 = new m4(3, au0Var2);
                ov0Var2.m0(objQ2);
            } else {
                au0Var2 = au0Var;
            }
            dv1 dv1VarZ = am1.z(dv1VarD, (lu0) objQ2);
            er1 er1VarC2 = ws.c(prVar, false);
            int iT3 = ks.T(ov0Var2);
            l72 l72VarL3 = ov0Var2.l();
            dv1 dv1VarH3 = xp1.H(ov0Var2, dv1VarZ);
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, ghVar, er1VarC2);
            q73.h(ov0Var2, ghVar2, l72VarL3);
            if (ov0Var2.S || !o51.f(ov0Var2.Q(), Integer.valueOf(iT3))) {
                az2.r(iT3, ov0Var2, iT3, ghVar3);
            }
            q73.h(ov0Var2, ghVar4, dv1VarH3);
            hd0.i(j2, q93Var, p10Var, ov0Var2, ((i2 >> 9) & 14) | ((i2 >> 18) & 112) | ((i2 >> 12) & 896));
            ov0Var = ov0Var2;
            ov0Var.p(true);
            ov0Var.p(false);
            dv1 dv1VarG2 = zm3.G(xp1.E(av1Var, "actionIcons"), 0.0f, 0.0f, f2, 0.0f, 11);
            er1 er1VarC3 = ws.c(prVar, false);
            int iT4 = ks.T(ov0Var);
            l72 l72VarL4 = ov0Var.l();
            dv1 dv1VarH4 = xp1.H(ov0Var, dv1VarG2);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, er1VarC3);
            q73.h(ov0Var, ghVar2, l72VarL4);
            if (ov0Var.S || !o51.f(ov0Var.Q(), Integer.valueOf(iT4))) {
                az2.r(iT4, ov0Var, iT4, ghVar3);
            }
            q73.h(ov0Var, ghVar4, dv1VarH4);
            j5 = j4;
            p10Var4 = p10Var3;
            k22.b(hh0Var.a(new hz(j5)), p10Var4, ov0Var, 56);
            ov0Var.p(true);
            ov0Var.p(true);
        } else {
            au0Var2 = au0Var;
            p10Var4 = p10Var3;
            ov0Var = ov0Var2;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            final p10 p10Var5 = p10Var4;
            ee2VarT.d = new pu0(zn0Var, j, j2, j3, j5, p10Var, q93Var, q93Var2, au0Var2, p10Var2, p10Var5, f, i) { // from class: wj
                public final /* synthetic */ zn0 f;
                public final /* synthetic */ long g;
                public final /* synthetic */ long h;
                public final /* synthetic */ long i;
                public final /* synthetic */ long j;
                public final /* synthetic */ p10 k;
                public final /* synthetic */ q93 l;
                public final /* synthetic */ q93 m;
                public final /* synthetic */ au0 n;
                public final /* synthetic */ p10 o;
                public final /* synthetic */ p10 p;
                public final /* synthetic */ float q;

                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM0 = wc0.m0(1);
                    zj.c(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, (f30) obj, iM0);
                    return mf3.a;
                }
            };
        }
    }
}
