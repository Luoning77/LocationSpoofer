package defpackage;

import android.os.Build;
import android.view.ViewParent;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class xz1 extends ck1 implements zq1, pa1, u42 {
    public static final ah2 S = new ah2();
    public static final ma1 T = new ma1();
    public static final float[] U = yq1.a();
    public static final uz1 V = new uz1();
    public static final k91 W = new k91(10);
    public xb0 A;
    public qa1 B;
    public fr1 D;
    public ox1 E;
    public float G;
    public yx1 H;
    public ma1 I;
    public boolean K;
    public boolean L;
    public kw0 M;
    public vv N;
    public xb O;
    public boolean Q;
    public s42 R;
    public final hb1 s;
    public boolean t;
    public boolean u;
    public xz1 v;
    public xz1 w;
    public boolean x;
    public boolean y;
    public lu0 z;
    public float C = 0.8f;
    public long F = 0;
    public au2 J = o51.p0;
    public final wz1 P = new wz1(this, 1);

    public xz1(hb1 hb1Var) {
        this.s = hb1Var;
        this.A = hb1Var.D;
        this.B = hb1Var.E;
    }

    public static xz1 O1(pa1 pa1Var) {
        xz1 xz1Var;
        fk1 fk1Var = pa1Var instanceof fk1 ? (fk1) pa1Var : null;
        if (fk1Var != null && (xz1Var = fk1Var.e.s) != null) {
            return xz1Var;
        }
        pa1Var.getClass();
        return (xz1) pa1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [cv1] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [cv1] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [gy1] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [gy1] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // defpackage.h82, defpackage.zq1
    public final Object A() {
        hb1 hb1Var = this.s;
        if (!hb1Var.K.c(64)) {
            return null;
        }
        t1();
        Object objZ = null;
        for (cv1 cv1Var = hb1Var.K.e; cv1Var != null; cv1Var = cv1Var.i) {
            if ((cv1Var.g & 64) != 0) {
                ?? J = cv1Var;
                ?? gy1Var = 0;
                while (J != 0) {
                    if (J instanceof y52) {
                        objZ = ((y52) J).Z(hb1Var.D, objZ);
                    } else if ((J.g & 64) != 0 && (J instanceof lb0)) {
                        cv1 cv1Var2 = ((lb0) J).t;
                        int i = 0;
                        J = J;
                        gy1Var = gy1Var;
                        while (cv1Var2 != null) {
                            if ((cv1Var2.g & 64) != 0) {
                                i++;
                                if (i == 1) {
                                    gy1Var = gy1Var;
                                    J = cv1Var2;
                                } else {
                                    if (gy1Var == 0) {
                                        gy1Var = new gy1(new cv1[16]);
                                    }
                                    if (J != 0) {
                                        gy1Var.b(J);
                                        J = 0;
                                    }
                                    gy1Var.b(cv1Var2);
                                }
                            }
                            cv1Var2 = cv1Var2.j;
                            J = J;
                            gy1Var = gy1Var;
                        }
                        if (i == 1) {
                        }
                    }
                    J = xp1.J(gy1Var);
                }
            }
        }
        return objZ;
    }

    public final void A1() {
        s42 s42Var = this.R;
        if (s42Var != null) {
            ((nw0) s42Var).c();
            return;
        }
        xz1 xz1Var = this.w;
        if (xz1Var != null) {
            xz1Var.A1();
        }
    }

    @Override // defpackage.pa1
    public final pa1 B() {
        boolean z = t1().r;
        hb1 hb1Var = this.s;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (hb1 hb1VarU = hb1Var; hb1VarU != null; hb1VarU = hb1VarU.u()) {
                sb.append("\n|");
                sb.append(hb1VarU);
                sb.append(" isAttached=");
                sb.append(hb1VarU.G());
                sb.append(" modifier=");
                sb.append(hb1VarU.P);
                sb.append(" tail=");
                sb.append(t1());
            }
            p21.c(sb.toString());
        }
        C1();
        return hb1Var.K.d.w;
    }

    public final boolean B1() {
        if (this.R != null && this.C <= 0.0f) {
            return true;
        }
        xz1 xz1Var = this.w;
        if (xz1Var != null) {
            return xz1Var.B1();
        }
        return false;
    }

    public final void C1() {
        this.s.L.b();
    }

    @Override // defpackage.xb0
    public final float D() {
        return this.s.D.D();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [cv1] */
    /* JADX WARN: Type inference failed for: r7v7, types: [cv1] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [gy1] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [gy1] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void D1() {
        cv1 cv1VarT1;
        boolean zG = yz1.g(WorkQueueKt.BUFFER_CAPACITY);
        cv1 cv1VarV1 = v1(zG);
        if (cv1VarV1 == null || (cv1VarV1.e.h & WorkQueueKt.BUFFER_CAPACITY) == 0) {
            return;
        }
        nx2 nx2VarK = wc0.K();
        lu0 lu0VarE = nx2VarK != null ? nx2VarK.e() : null;
        nx2 nx2VarS = wc0.S(nx2VarK);
        try {
            if (!zG) {
                cv1VarT1 = t1().i;
                if (cv1VarT1 == null) {
                }
                wc0.g0(nx2VarK, nx2VarS, lu0VarE);
            }
            cv1VarT1 = t1();
            for (cv1 cv1VarV2 = v1(zG); cv1VarV2 != null && (cv1VarV2.h & WorkQueueKt.BUFFER_CAPACITY) != 0; cv1VarV2 = cv1VarV2.j) {
                if ((cv1VarV2.g & WorkQueueKt.BUFFER_CAPACITY) != 0) {
                    ?? J = cv1VarV2;
                    ?? gy1Var = 0;
                    while (J != 0) {
                        if (J instanceof hr1) {
                            ((hr1) J).h(this.g);
                        } else if ((J.g & WorkQueueKt.BUFFER_CAPACITY) != 0 && (J instanceof lb0)) {
                            cv1 cv1Var = ((lb0) J).t;
                            int i = 0;
                            J = J;
                            gy1Var = gy1Var;
                            while (cv1Var != null) {
                                if ((cv1Var.g & WorkQueueKt.BUFFER_CAPACITY) != 0) {
                                    i++;
                                    if (i == 1) {
                                        gy1Var = gy1Var;
                                        J = cv1Var;
                                    } else {
                                        if (gy1Var == 0) {
                                            gy1Var = new gy1(new cv1[16]);
                                        }
                                        if (J != 0) {
                                            gy1Var.b(J);
                                            J = 0;
                                        }
                                        gy1Var.b(cv1Var);
                                    }
                                }
                                cv1Var = cv1Var.j;
                                J = J;
                                gy1Var = gy1Var;
                            }
                            if (i == 1) {
                            }
                        }
                        J = xp1.J(gy1Var);
                    }
                }
                if (cv1VarV2 == cv1VarT1) {
                    break;
                }
            }
            wc0.g0(nx2VarK, nx2VarS, lu0VarE);
        } catch (Throwable th) {
            wc0.g0(nx2VarK, nx2VarS, lu0VarE);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [cv1] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [cv1] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [gy1] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [gy1] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void E1() {
        boolean zG = yz1.g(4194304);
        cv1 cv1VarT1 = t1();
        if (!zG && (cv1VarT1 = cv1VarT1.i) == null) {
            return;
        }
        for (cv1 cv1VarV1 = v1(zG); cv1VarV1 != null && (cv1VarV1.h & 4194304) != 0; cv1VarV1 = cv1VarV1.j) {
            if ((cv1VarV1.g & 4194304) != 0) {
                ?? J = cv1VarV1;
                ?? gy1Var = 0;
                while (J != 0) {
                    if (J instanceof na1) {
                        ((na1) J).G(this);
                    } else if ((J.g & 4194304) != 0 && (J instanceof lb0)) {
                        cv1 cv1Var = ((lb0) J).t;
                        int i = 0;
                        J = J;
                        gy1Var = gy1Var;
                        while (cv1Var != null) {
                            if ((cv1Var.g & 4194304) != 0) {
                                i++;
                                if (i == 1) {
                                    gy1Var = gy1Var;
                                    J = cv1Var;
                                } else {
                                    if (gy1Var == 0) {
                                        gy1Var = new gy1(new cv1[16]);
                                    }
                                    if (J != 0) {
                                        gy1Var.b(J);
                                        J = 0;
                                    }
                                    gy1Var.b(cv1Var);
                                }
                            }
                            cv1Var = cv1Var.j;
                            J = J;
                            gy1Var = gy1Var;
                        }
                        if (i == 1) {
                        }
                    }
                    J = xp1.J(gy1Var);
                }
            }
            if (cv1VarV1 == cv1VarT1) {
                return;
            }
        }
    }

    public final void F1() {
        this.x = true;
        this.P.invoke();
        L1();
        if (h41.a(this.F, 0L)) {
            return;
        }
        this.s.M(this);
    }

    public final void G1() {
        boolean zG = yz1.g(1048576);
        cv1 cv1VarV1 = v1(zG);
        if (cv1VarV1 == null || (cv1VarV1.e.h & 1048576) == 0) {
            return;
        }
        cv1 cv1VarT1 = t1();
        if (!zG && (cv1VarT1 = cv1VarT1.i) == null) {
            return;
        }
        for (cv1 cv1VarV2 = v1(zG); cv1VarV2 != null && (cv1VarV2.h & 1048576) != 0; cv1VarV2 = cv1VarV2.j) {
            if ((cv1VarV2.g & 1048576) != 0) {
                cv1 cv1VarJ = cv1VarV2;
                gy1 gy1Var = null;
                while (cv1VarJ != null) {
                    if ((cv1VarJ.g & 1048576) != 0 && (cv1VarJ instanceof lb0)) {
                        int i = 0;
                        for (cv1 cv1Var = ((lb0) cv1VarJ).t; cv1Var != null; cv1Var = cv1Var.j) {
                            if ((cv1Var.g & 1048576) != 0) {
                                i++;
                                if (i == 1) {
                                    cv1VarJ = cv1Var;
                                } else {
                                    if (gy1Var == null) {
                                        gy1Var = new gy1(new cv1[16]);
                                    }
                                    if (cv1VarJ != null) {
                                        gy1Var.b(cv1VarJ);
                                        cv1VarJ = null;
                                    }
                                    gy1Var.b(cv1Var);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    cv1VarJ = xp1.J(gy1Var);
                }
            }
            if (cv1VarV2 == cv1VarT1) {
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x01d7 A[PHI: r3
      0x01d7: PHI (r3v18 ??) = (r3v1 ??), (r3v1 ??), (r3v20 ??) binds: [B:58:0x01a1, B:60:0x01a5, B:74:0x01cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [cv1] */
    /* JADX WARN: Type inference failed for: r2v22, types: [cv1] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v18, types: [gy1] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [gy1] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r4v13 */
    public final void H1(cv1 cv1Var, vz1 vz1Var, long j, zx0 zx0Var, int i, boolean z, float f, boolean z2) {
        char c;
        int i2;
        ?? J;
        sx1 sx1Var = zx0Var.e;
        if (cv1Var == null) {
            z1(vz1Var, j, zx0Var, i, z);
            return;
        }
        if (!vz1Var.c(cv1Var)) {
            H1(ke0.J(cv1Var, vz1Var.b()), vz1Var, j, zx0Var, i, z, f, z2);
            return;
        }
        int i3 = i;
        if (i3 == 3 || i3 == 4) {
            ?? r2 = cv1Var;
            ?? gy1Var = 0;
            while (r2 != 0) {
                if (r2 instanceof ba2) {
                    long jI = ((ba2) r2).I();
                    int i4 = (int) (j >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i4);
                    hb1 hb1Var = this.s;
                    qa1 qa1Var = hb1Var.E;
                    int i5 = ob3.b;
                    long j2 = Long.MIN_VALUE & jI;
                    qa1 qa1Var2 = qa1.e;
                    if (j2 == 0 || qa1Var == qa1Var2) {
                        c = 30;
                        i2 = (int) jI;
                    } else {
                        c = 30;
                        i2 = (int) (jI >> 30);
                    }
                    if (fIntBitsToFloat < (-(i2 & 32767))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i4) >= E0() + (((j2 == 0 || hb1Var.E == qa1Var2) ? (int) (jI >> c) : (int) jI) & 32767)) {
                        break;
                    }
                    int i6 = (int) (j & 4294967295L);
                    if (Float.intBitsToFloat(i6) < (-(((int) (jI >> 15)) & 32767))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i6) >= (((int) (jI >> 45)) & 32767) + D0()) {
                        break;
                    }
                    kx1 kx1Var = zx0Var.f;
                    int i7 = zx0Var.g;
                    int i8 = sx1Var.b;
                    if (i7 == i8 - 1) {
                        zx0Var.b(i7 + 1, i8);
                        zx0Var.g++;
                        sx1Var.a(cv1Var);
                        kx1Var.a(ee0.a(0.0f, z, true));
                        H1(ke0.J(cv1Var, vz1Var.b()), vz1Var, j, zx0Var, i3, z, f, z2);
                        zx0Var.g = i7;
                        return;
                    }
                    long jA = zx0Var.a();
                    int i9 = zx0Var.g;
                    if (!hd0.I(jA)) {
                        if (hd0.x(jA) > 0.0f) {
                            int i10 = zx0Var.g;
                            zx0Var.b(i10 + 1, sx1Var.b);
                            zx0Var.g++;
                            sx1Var.a(cv1Var);
                            kx1Var.a(ee0.a(0.0f, z, true));
                            H1(ke0.J(cv1Var, vz1Var.b()), vz1Var, j, zx0Var, i, z, f, z2);
                            zx0Var.g = i10;
                            return;
                        }
                        return;
                    }
                    int i11 = sx1Var.b;
                    int i12 = i11 - 1;
                    zx0Var.g = i12;
                    zx0Var.b(i11, sx1Var.b);
                    zx0Var.g++;
                    sx1Var.a(cv1Var);
                    kx1Var.a(ee0.a(0.0f, z, true));
                    H1(ke0.J(cv1Var, vz1Var.b()), vz1Var, j, zx0Var, i, z, f, z2);
                    zx0Var.g = i12;
                    if (hd0.x(zx0Var.a()) < 0.0f) {
                        zx0Var.b(i9 + 1, zx0Var.g + 1);
                    }
                    zx0Var.g = i9;
                    return;
                }
                if ((r2.g & 16) == 0 || !(r2 instanceof lb0)) {
                    J = r2;
                    gy1Var = gy1Var;
                    J = xp1.J(gy1Var);
                } else {
                    cv1 cv1Var2 = ((lb0) r2).t;
                    int i13 = 0;
                    while (cv1Var2 != null) {
                        if ((cv1Var2.g & 16) != 0) {
                            i13++;
                            if (i13 == 1) {
                                J = r2;
                                gy1Var = gy1Var;
                                gy1Var = gy1Var;
                                J = cv1Var2;
                            } else {
                                if (gy1Var == 0) {
                                    gy1Var = new gy1(new cv1[16]);
                                }
                                if (J != 0) {
                                    gy1Var.b(J);
                                    J = 0;
                                }
                                gy1Var.b(cv1Var2);
                            }
                        } else {
                            J = r2;
                            gy1Var = gy1Var;
                        }
                        cv1Var2 = cv1Var2.j;
                        J = J;
                        gy1Var = gy1Var;
                    }
                    if (i13 == 1) {
                        J = r2;
                        gy1Var = gy1Var;
                    } else {
                        J = r2;
                        gy1Var = gy1Var;
                        J = xp1.J(gy1Var);
                    }
                }
                i3 = i;
                r2 = J;
                gy1Var = gy1Var;
            }
        }
        if (z2) {
            x1(cv1Var, vz1Var, j, zx0Var, i, z, f);
        } else {
            N1(cv1Var, vz1Var, j, zx0Var, i, z, f);
        }
    }

    public abstract void I1(vv vvVar, kw0 kw0Var);

    public final void J1(long j, float f, lu0 lu0Var) {
        S1(lu0Var, false);
        boolean zA = h41.a(this.F, j);
        hb1 hb1Var = this.s;
        if (!zA) {
            ((db) kb1.a(hb1Var)).L(-4.0f);
            this.F = j;
            s42 s42Var = this.R;
            if (s42Var != null) {
                ((nw0) s42Var).d(j);
            } else {
                xz1 xz1Var = this.w;
                if (xz1Var != null) {
                    xz1Var.A1();
                }
            }
            hb1Var.M(this);
            ck1.f1(this);
            t42 t42Var = hb1Var.s;
            if (t42Var != null) {
                ((db) t42Var).v(hb1Var);
            }
        }
        this.G = f;
        if (this == hb1Var.K.d) {
            ((db) kb1.a(hb1Var)).getRectManager().f(hb1Var);
        }
        if (this.o) {
            return;
        }
        S0(b1());
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    public final void K1(yx1 yx1Var, boolean z, boolean z2) {
        long jFloatToRawIntBits;
        s42 s42Var = this.R;
        if (s42Var != null) {
            if (this.y) {
                if (z2) {
                    long jS1 = s1();
                    float f = yx1Var.a;
                    float f2 = yx1Var.b;
                    if (yx1Var.c >= 0.0f) {
                        long j = this.g;
                        if (f > ((int) (j >> 32)) || yx1Var.d < 0.0f || f2 > ((int) (j & 4294967295L))) {
                            jFloatToRawIntBits = 0;
                        } else {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jS1 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jS1 & 4294967295L));
                            float f3 = (fIntBitsToFloat - (yx1Var.c - yx1Var.a)) / 2.0f;
                            if (f3 > 0.0f) {
                                f -= f3;
                            } else {
                                float f4 = (-fIntBitsToFloat) / 2.0f;
                                if (f < f4) {
                                    f = f4;
                                }
                            }
                            float f5 = (fIntBitsToFloat2 - (yx1Var.d - yx1Var.b)) / 2.0f;
                            if (f5 > 0.0f) {
                                f2 -= f5;
                            } else {
                                float f6 = (-fIntBitsToFloat2) / 2.0f;
                                if (f2 < f6) {
                                    f2 = f6;
                                }
                            }
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
                        }
                    } else {
                        jFloatToRawIntBits = 0;
                    }
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                    long j2 = this.g;
                    float f7 = (int) (j2 >> 32);
                    int i = (int) (jS1 >> 32);
                    float f8 = (int) (j2 & 4294967295L);
                    int i2 = (int) (jS1 & 4294967295L);
                    yx1Var.a(fIntBitsToFloat3, fIntBitsToFloat4, Math.min(Float.intBitsToFloat(i) + f7, Math.max(f7, Float.intBitsToFloat(i) + fIntBitsToFloat3)), Math.min(Float.intBitsToFloat(i2) + f8, Math.max(f8, Float.intBitsToFloat(i2) + fIntBitsToFloat4)));
                } else if (z) {
                    long j3 = this.g;
                    yx1Var.a(0.0f, 0.0f, (int) (j3 >> 32), (int) (j3 & 4294967295L));
                }
                if (yx1Var.b()) {
                    return;
                }
            }
            nw0 nw0Var = (nw0) s42Var;
            float[] fArrB = nw0Var.b();
            if (!nw0Var.w) {
                if (fArrB == null) {
                    yx1Var.a = 0.0f;
                    yx1Var.b = 0.0f;
                    yx1Var.c = 0.0f;
                    yx1Var.d = 0.0f;
                } else {
                    yq1.c(fArrB, yx1Var);
                }
            }
        }
        long j4 = this.F;
        float f9 = (int) (j4 >> 32);
        yx1Var.a += f9;
        yx1Var.c += f9;
        float f10 = (int) (j4 & 4294967295L);
        yx1Var.b += f10;
        yx1Var.d += f10;
    }

    @Override // defpackage.pa1
    public final long L(pa1 pa1Var, long j) {
        return i0(pa1Var, j, true);
    }

    public final void L1() {
        if (this.R != null) {
            S1(null, false);
            this.s.U(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [cv1] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [cv1] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [gy1] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [gy1] */
    public final void M1(fr1 fr1Var) {
        xz1 xz1Var;
        fr1 fr1Var2 = this.D;
        if (fr1Var != fr1Var2) {
            this.D = fr1Var;
            hb1 hb1Var = this.s;
            int i = 0;
            if (fr1Var2 == null || fr1Var.e() != fr1Var2.e() || fr1Var.b() != fr1Var2.b()) {
                int iE = fr1Var.e();
                int iB = fr1Var.b();
                s42 s42Var = this.R;
                if (s42Var != null) {
                    ((nw0) s42Var).e((((long) iE) << 32) | (((long) iB) & 4294967295L));
                } else if (hb1Var.H() && (xz1Var = this.w) != null) {
                    xz1Var.A1();
                }
                J0((((long) iB) & 4294967295L) | (((long) iE) << 32));
                if (this.z != null) {
                    T1(false);
                }
                boolean zG = yz1.g(4);
                cv1 cv1VarT1 = t1();
                if (zG || (cv1VarT1 = cv1VarT1.i) != null) {
                    for (cv1 cv1VarV1 = v1(zG); cv1VarV1 != null && (cv1VarV1.h & 4) != 0; cv1VarV1 = cv1VarV1.j) {
                        if ((cv1VarV1.g & 4) != 0) {
                            ?? J = cv1VarV1;
                            ?? gy1Var = 0;
                            while (J != 0) {
                                if (J instanceof hg0) {
                                    ((hg0) J).S0();
                                } else if ((J.g & 4) != 0 && (J instanceof lb0)) {
                                    cv1 cv1Var = ((lb0) J).t;
                                    int i2 = 0;
                                    J = J;
                                    gy1Var = gy1Var;
                                    while (cv1Var != null) {
                                        if ((cv1Var.g & 4) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                gy1Var = gy1Var;
                                                J = cv1Var;
                                            } else {
                                                if (gy1Var == 0) {
                                                    gy1Var = new gy1(new cv1[16]);
                                                }
                                                if (J != 0) {
                                                    gy1Var.b(J);
                                                    J = 0;
                                                }
                                                gy1Var.b(cv1Var);
                                            }
                                        }
                                        cv1Var = cv1Var.j;
                                        J = J;
                                        gy1Var = gy1Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                J = xp1.J(gy1Var);
                            }
                        }
                        if (cv1VarV1 == cv1VarT1) {
                            break;
                        }
                    }
                }
                t42 t42Var = hb1Var.s;
                if (t42Var != null) {
                    ((db) t42Var).v(hb1Var);
                }
                hb1Var.M(this);
            }
            ox1 ox1Var = this.E;
            if ((ox1Var == null || ox1Var.e == 0) && fr1Var.c().isEmpty()) {
                return;
            }
            ox1 ox1Var2 = this.E;
            Map mapC = fr1Var.c();
            if (ox1Var2 != null && ox1Var2.e == mapC.size()) {
                Object[] objArr = ox1Var2.b;
                int[] iArr = ox1Var2.c;
                long[] jArr = ox1Var2.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = (Integer) mapC.get((m9) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            hb1Var.L.p.B.f();
            ox1 ox1Var3 = this.E;
            if (ox1Var3 == null) {
                ox1 ox1Var4 = r02.a;
                ox1Var3 = new ox1();
                this.E = ox1Var3;
            }
            ox1Var3.a();
            for (Map.Entry entry : fr1Var.c().entrySet()) {
                ox1Var3.g(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    public final void N1(cv1 cv1Var, vz1 vz1Var, long j, zx0 zx0Var, int i, boolean z, float f) {
        int i2;
        sx1 sx1Var = zx0Var.e;
        if (cv1Var == null) {
            z1(vz1Var, j, zx0Var, i, z);
            return;
        }
        if (!vz1Var.c(cv1Var)) {
            N1(ke0.J(cv1Var, vz1Var.b()), vz1Var, j, zx0Var, i, z, f);
            return;
        }
        if (!vz1Var.a(cv1Var)) {
            H1(ke0.J(cv1Var, vz1Var.b()), vz1Var, j, zx0Var, i, z, f, false);
            return;
        }
        kx1 kx1Var = zx0Var.f;
        int i3 = zx0Var.g;
        int i4 = sx1Var.b;
        if (i3 != i4 - 1) {
            long jA = zx0Var.a();
            int i5 = zx0Var.g;
            int i6 = sx1Var.b;
            int i7 = i6 - 1;
            zx0Var.g = i7;
            zx0Var.b(i6, sx1Var.b);
            zx0Var.g++;
            sx1Var.a(cv1Var);
            kx1Var.a(ee0.a(f, z, false));
            H1(ke0.J(cv1Var, vz1Var.b()), vz1Var, j, zx0Var, i, z, f, false);
            zx0Var.g = i7;
            long jA2 = zx0Var.a();
            if (zx0Var.g + 1 >= sx1Var.b - 1 || hd0.q(jA, jA2) <= 0) {
                zx0Var.b(zx0Var.g + 1, sx1Var.b);
            } else {
                int i8 = i5 + 1;
                boolean zI = hd0.I(jA2);
                int i9 = zx0Var.g;
                zx0Var.b(i8, zI ? i9 + 2 : i9 + 1);
            }
            zx0Var.g = i5;
            return;
        }
        int i10 = i3 + 1;
        zx0Var.b(i10, i4);
        zx0Var.g++;
        sx1Var.a(cv1Var);
        kx1Var.a(ee0.a(f, z, false));
        H1(ke0.J(cv1Var, vz1Var.b()), vz1Var, j, zx0Var, i, z, f, false);
        zx0Var.g = i3;
        if (i10 == sx1Var.b - 1 || hd0.I(zx0Var.a())) {
            int i11 = zx0Var.g;
            int i12 = i11 + 1;
            sx1Var.k(i12);
            if (i12 < 0 || i12 >= (i2 = kx1Var.b)) {
                fo.p("Index must be between 0 and size");
                return;
            }
            long[] jArr = kx1Var.a;
            long j2 = jArr[i12];
            if (i12 != i2 - 1) {
                yo.m0(jArr, jArr, i12, i11 + 2, i2);
            }
            kx1Var.b--;
        }
    }

    public final pe2 P1() {
        if (t1().r) {
            pa1 pa1VarF = wc0.F(this);
            yx1 yx1Var = this.H;
            if (yx1Var == null) {
                yx1Var = new yx1();
                this.H = yx1Var;
            }
            long jK1 = k1(s1());
            int i = (int) (jK1 >> 32);
            yx1Var.a = -Float.intBitsToFloat(i);
            int i2 = (int) (jK1 & 4294967295L);
            yx1Var.b = -Float.intBitsToFloat(i2);
            yx1Var.c = Float.intBitsToFloat(i) + E0();
            yx1Var.d = Float.intBitsToFloat(i2) + D0();
            while (this != pa1VarF) {
                this.K1(yx1Var, false, true);
                if (!yx1Var.b()) {
                    this = this.w;
                    this.getClass();
                }
            }
            return new pe2(yx1Var.a, yx1Var.b, yx1Var.c, yx1Var.d);
        }
        return pe2.e;
    }

    public final void Q1(xz1 xz1Var, float[] fArr) {
        float[] fArrA;
        if (o51.f(xz1Var, this)) {
            return;
        }
        xz1 xz1Var2 = this.w;
        xz1Var2.getClass();
        xz1Var2.Q1(xz1Var, fArr);
        if (!h41.a(this.F, 0L)) {
            float[] fArr2 = U;
            yq1.d(fArr2);
            long j = this.F;
            yq1.f(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            yq1.e(fArr, fArr2);
        }
        s42 s42Var = this.R;
        if (s42Var == null || (fArrA = ((nw0) s42Var).a()) == null) {
            return;
        }
        yq1.e(fArr, fArrA);
    }

    public final void R1(xz1 xz1Var, float[] fArr) {
        while (!this.equals(xz1Var)) {
            s42 s42Var = this.R;
            if (s42Var != null) {
                yq1.e(fArr, ((nw0) s42Var).b());
            }
            long j = this.F;
            if (!h41.a(j, 0L)) {
                float[] fArr2 = U;
                yq1.d(fArr2);
                yq1.f(fArr2, (int) (j >> 32), (int) (j & 4294967295L));
                yq1.e(fArr, fArr2);
            }
            this = this.w;
            this.getClass();
        }
    }

    @Override // defpackage.u42
    public final boolean S() {
        return (this.R == null || this.x || !this.s.G()) ? false : true;
    }

    public final void S1(lu0 lu0Var, boolean z) {
        t42 t42Var;
        gy1 gy1Var;
        Reference referencePoll;
        xb xbVar;
        gy1 gy1Var2;
        Reference referencePoll2;
        Object obj;
        int i = 0;
        hb1 hb1Var = this.s;
        boolean z2 = (!z && this.z == lu0Var && o51.f(this.A, hb1Var.D) && this.B == hb1Var.E) ? false : true;
        this.A = hb1Var.D;
        this.B = hb1Var.E;
        boolean zG = hb1Var.G();
        wz1 wz1Var = this.P;
        if (!zG || lu0Var == null) {
            this.z = null;
            s42 s42Var = this.R;
            if (s42Var != null) {
                nw0 nw0Var = (nw0) s42Var;
                if (!mh0.M(nw0Var.b())) {
                    hb1Var.M(this);
                }
                nw0Var.h = null;
                nw0Var.i = null;
                nw0Var.k = true;
                nw0Var.f(false);
                iw0 iw0Var = nw0Var.f;
                if (iw0Var != null) {
                    iw0Var.a(nw0Var.e);
                    db dbVar = nw0Var.g;
                    z92 z92Var = dbVar.C0;
                    do {
                        ReferenceQueue referenceQueue = (ReferenceQueue) z92Var.g;
                        gy1Var = (gy1) z92Var.f;
                        referencePoll = referenceQueue.poll();
                        if (referencePoll != null) {
                            gy1Var.j(referencePoll);
                        }
                    } while (referencePoll != null);
                    gy1Var.b(new WeakReference(nw0Var, (ReferenceQueue) z92Var.g));
                    dbVar.I.j(nw0Var);
                }
                this.R = null;
                hb1Var.O = true;
                wz1Var.invoke();
                if (t1().r && hb1Var.H() && (t42Var = hb1Var.s) != null) {
                    ((db) t42Var).v(hb1Var);
                }
            }
            this.Q = false;
            return;
        }
        this.z = lu0Var;
        if (this.R != null) {
            if (z2) {
                T1(true);
                return;
            }
            return;
        }
        t42 t42VarA = kb1.a(hb1Var);
        xb xbVar2 = this.O;
        if (xbVar2 == null) {
            xb xbVar3 = new xb(2, this, new wz1(this, i));
            this.O = xbVar3;
            xbVar = xbVar3;
        } else {
            xbVar = xbVar2;
        }
        db dbVar2 = (db) t42VarA;
        z92 z92Var2 = dbVar2.C0;
        do {
            ReferenceQueue referenceQueue2 = (ReferenceQueue) z92Var2.g;
            gy1Var2 = (gy1) z92Var2.f;
            referencePoll2 = referenceQueue2.poll();
            if (referencePoll2 != null) {
                gy1Var2.j(referencePoll2);
            }
        } while (referencePoll2 != null);
        do {
            int i2 = gy1Var2.g;
            if (i2 == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) gy1Var2.k(i2 - 1)).get();
        } while (obj == null);
        s42 nw0Var2 = (s42) obj;
        if (nw0Var2 != null) {
            nw0 nw0Var3 = (nw0) nw0Var2;
            iw0 iw0Var2 = nw0Var3.f;
            if (iw0Var2 == null) {
                throw az2.e("currently reuse is only supported when we manage the layer lifecycle");
            }
            if (!nw0Var3.e.s) {
                p21.a("layer should have been released before reuse");
            }
            nw0Var3.e = iw0Var2.b();
            nw0Var3.k = false;
            nw0Var3.h = xbVar;
            nw0Var3.i = wz1Var;
            nw0Var3.u = false;
            nw0Var3.v = false;
            nw0Var3.w = true;
            yq1.d(nw0Var3.l);
            float[] fArr = nw0Var3.m;
            if (fArr != null) {
                yq1.d(fArr);
            }
            nw0Var3.s = ac3.b;
            nw0Var3.x = false;
            nw0Var3.j = 9223372034707292159L;
            nw0Var3.t = null;
            nw0Var3.r = 0;
        } else {
            nw0Var2 = new nw0(dbVar2.getGraphicsContext().b(), dbVar2.getGraphicsContext(), dbVar2, xbVar, wz1Var);
        }
        nw0 nw0Var4 = (nw0) nw0Var2;
        nw0Var4.e(this.g);
        nw0Var4.d(this.F);
        this.R = nw0Var2;
        T1(true);
        hb1Var.O = true;
        wz1Var.invoke();
    }

    @Override // defpackage.pa1
    public final long T(long j) {
        if (!t1().r) {
            p21.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return i0(wc0.F(this), ((db) kb1.a(this.s)).E(j), true);
    }

    @Override // defpackage.ck1
    public final ck1 T0() {
        return this.v;
    }

    public final void T1(boolean z) {
        float f;
        db dbVar;
        int i;
        long j;
        char c;
        db dbVar2;
        boolean z2;
        db dbVar3;
        t42 t42Var;
        au0 au0Var;
        int i2;
        au0 au0Var2;
        s42 s42Var = this.R;
        lu0 lu0Var = this.z;
        if (s42Var == null) {
            if (lu0Var == null) {
                return;
            }
            p21.c("null layer with a non-null layerBlock");
            return;
        }
        if (lu0Var == null) {
            throw az2.e("updateLayerParameters requires a non-null layerBlock");
        }
        ah2 ah2Var = S;
        ah2Var.c();
        hb1 hb1Var = this.s;
        ah2Var.t = hb1Var.D;
        ah2Var.u = hb1Var.E;
        ah2Var.s = mc0.J(this.g);
        ((db) kb1.a(hb1Var)).getSnapshotObserver().a.c(this, ik0.o, new ta(8, lu0Var, this));
        ma1 ma1Var = this.I;
        if (ma1Var == null) {
            ma1Var = new ma1();
            this.I = ma1Var;
        }
        ma1 ma1Var2 = T;
        ma1Var2.getClass();
        ma1Var2.a = ma1Var.a;
        ma1Var2.b = ma1Var.b;
        ma1Var2.c = ma1Var.c;
        ma1Var2.d = ma1Var.d;
        ma1Var2.e = ma1Var.e;
        ma1Var2.f = ma1Var.f;
        ma1Var2.g = ma1Var.g;
        ma1Var2.h = ma1Var.h;
        ma1Var2.i = ma1Var.i;
        float f2 = ah2Var.f;
        ma1Var.a = f2;
        ma1Var.b = ah2Var.g;
        ma1Var.c = ah2Var.i;
        ma1Var.d = ah2Var.j;
        ma1Var.e = 0.0f;
        ma1Var.f = 0.0f;
        ma1Var.g = 0.0f;
        ma1Var.h = ah2Var.n;
        long j2 = ah2Var.o;
        ma1Var.i = j2;
        nw0 nw0Var = (nw0) s42Var;
        db dbVar4 = nw0Var.g;
        int i3 = ah2Var.e | nw0Var.r;
        nw0Var.p = ah2Var.u;
        nw0Var.o = ah2Var.t;
        int i4 = i3 & 4096;
        if (i4 != 0) {
            nw0Var.s = j2;
        }
        if ((i3 & 1) != 0) {
            mw0 mw0Var = nw0Var.e.a;
            if (mw0Var.e() != f2) {
                mw0Var.l(f2);
            }
        }
        if ((i3 & 2) != 0) {
            kw0 kw0Var = nw0Var.e;
            float f3 = ah2Var.g;
            mw0 mw0Var2 = kw0Var.a;
            if (mw0Var2.v() != f3) {
                mw0Var2.r(f3);
            }
        }
        if ((i3 & 4) != 0) {
            nw0Var.e.f(ah2Var.h);
        }
        if ((i3 & 8) != 0) {
            kw0 kw0Var2 = nw0Var.e;
            float f4 = ah2Var.i;
            mw0 mw0Var3 = kw0Var2.a;
            if (mw0Var3.C() != f4) {
                mw0Var3.p(f4);
            }
        }
        if ((i3 & 16) != 0) {
            kw0 kw0Var3 = nw0Var.e;
            float f5 = ah2Var.j;
            mw0 mw0Var4 = kw0Var3.a;
            if (mw0Var4.w() != f5) {
                mw0Var4.j(f5);
            }
        }
        if ((i3 & 32) != 0) {
            kw0 kw0Var4 = nw0Var.e;
            float f6 = ah2Var.k;
            mw0 mw0Var5 = kw0Var4.a;
            if (mw0Var5.N() != f6) {
                mw0Var5.f(f6);
                kw0Var4.g = true;
                kw0Var4.a();
            }
            if (ah2Var.k > 0.0f && !nw0Var.x && (au0Var2 = nw0Var.i) != null) {
                au0Var2.invoke();
            }
        }
        if ((i3 & 64) != 0) {
            kw0 kw0Var5 = nw0Var.e;
            long j3 = ah2Var.l;
            mw0 mw0Var6 = kw0Var5.a;
            f = 0.0f;
            long jS = mw0Var6.S();
            int i5 = hz.h;
            if (!ye3.a(j3, jS)) {
                mw0Var6.k(j3);
            }
        } else {
            f = 0.0f;
        }
        if ((i3 & WorkQueueKt.BUFFER_CAPACITY) != 0) {
            kw0 kw0Var6 = nw0Var.e;
            long j4 = ah2Var.m;
            mw0 mw0Var7 = kw0Var6.a;
            long jY = mw0Var7.y();
            int i6 = hz.h;
            if (!ye3.a(j4, jY)) {
                mw0Var7.q(j4);
            }
        }
        if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
            mw0 mw0Var8 = nw0Var.e.a;
            if (mw0Var8.P() != f) {
                mw0Var8.o();
            }
        }
        if ((i3 & 256) != 0) {
            mw0 mw0Var9 = nw0Var.e.a;
            if (mw0Var9.F() != f) {
                mw0Var9.b();
            }
        }
        if ((i3 & 512) != 0) {
            mw0 mw0Var10 = nw0Var.e.a;
            if (mw0Var10.M() != f) {
                mw0Var10.i();
            }
        }
        if ((i3 & 2048) != 0) {
            kw0 kw0Var7 = nw0Var.e;
            float f7 = ah2Var.n;
            mw0 mw0Var11 = kw0Var7.a;
            if (mw0Var11.A() != f7) {
                mw0Var11.u(f7);
            }
        }
        if (i4 != 0) {
            j = 4294967295L;
            dbVar = dbVar4;
            boolean zA = ac3.a(nw0Var.s, ac3.b);
            kw0 kw0Var8 = nw0Var.e;
            if (zA) {
                if (!c12.b(kw0Var8.v, 9205357640488583168L)) {
                    kw0Var8.v = 9205357640488583168L;
                    kw0Var8.a.R(9205357640488583168L);
                }
                i = i3;
                c = ' ';
            } else {
                c = ' ';
                i = i3;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nw0Var.s & 4294967295L)) * ((int) (nw0Var.j & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nw0Var.s >> 32)) * ((int) (nw0Var.j >> 32)))) << 32);
                if (!c12.b(kw0Var8.v, jFloatToRawIntBits)) {
                    kw0Var8.v = jFloatToRawIntBits;
                    kw0Var8.a.R(jFloatToRawIntBits);
                }
            }
        } else {
            dbVar = dbVar4;
            i = i3;
            j = 4294967295L;
            c = ' ';
        }
        if ((i & 16384) != 0) {
            kw0 kw0Var9 = nw0Var.e;
            boolean z3 = ah2Var.q;
            if (kw0Var9.w != z3) {
                kw0Var9.w = z3;
                kw0Var9.g = true;
                kw0Var9.a();
            }
        }
        if ((131072 & i) != 0) {
            nw0Var.e.g(null);
        }
        if ((262144 & i) != 0) {
            kw0 kw0Var10 = nw0Var.e;
            rr rrVar = ah2Var.v;
            mw0 mw0Var12 = kw0Var10.a;
            if (!o51.f(mw0Var12.H(), rrVar)) {
                mw0Var12.t(rrVar);
            }
        }
        if ((524288 & i) != 0) {
            kw0 kw0Var11 = nw0Var.e;
            int i7 = ah2Var.w;
            mw0 mw0Var13 = kw0Var11.a;
            if (mw0Var13.Q() != i7) {
                mw0Var13.m(i7);
            }
        }
        if ((32768 & i) != 0) {
            kw0 kw0Var12 = nw0Var.e;
            int i8 = ah2Var.r;
            if (i8 == 0) {
                i2 = 0;
            } else if (i8 == 1) {
                i2 = 1;
            } else {
                i2 = 2;
                if (i8 != 2) {
                    fo.n("Not supported composition strategy");
                    return;
                }
            }
            mw0 mw0Var14 = kw0Var12.a;
            if (mw0Var14.E() != i2) {
                mw0Var14.I(i2);
            }
        }
        if ((i & 7963) != 0) {
            nw0Var.u = true;
            nw0Var.v = true;
        }
        if (o51.f(nw0Var.t, ah2Var.x)) {
            dbVar2 = dbVar;
            z2 = false;
        } else {
            vd0 vd0Var = ah2Var.x;
            nw0Var.t = vd0Var;
            if (vd0Var == null) {
                dbVar2 = dbVar;
            } else {
                kw0 kw0Var13 = nw0Var.e;
                if (vd0Var instanceof a42) {
                    pe2 pe2Var = ((a42) vd0Var).i;
                    float f8 = pe2Var.a;
                    float f9 = pe2Var.b;
                    dbVar2 = dbVar;
                    kw0Var13.h((((long) Float.floatToRawIntBits(f8)) << c) | (((long) Float.floatToRawIntBits(f9)) & j), (((long) Float.floatToRawIntBits(pe2Var.c - f8)) << c) | (((long) Float.floatToRawIntBits(pe2Var.d - f9)) & j), 0.0f);
                } else {
                    dbVar2 = dbVar;
                    if (vd0Var instanceof z32) {
                        re reVar = ((z32) vd0Var).i;
                        kw0Var13.k = null;
                        kw0Var13.i = 9205357640488583168L;
                        kw0Var13.h = 0L;
                        kw0Var13.j = 0.0f;
                        kw0Var13.g = true;
                        kw0Var13.n = false;
                        kw0Var13.l = reVar;
                        kw0Var13.a();
                    } else {
                        if (!(vd0Var instanceof b42)) {
                            b81.d();
                            return;
                        }
                        b42 b42Var = (b42) vd0Var;
                        re reVar2 = b42Var.j;
                        if (reVar2 != null) {
                            kw0Var13.k = null;
                            kw0Var13.i = 9205357640488583168L;
                            kw0Var13.h = 0L;
                            kw0Var13.j = 0.0f;
                            kw0Var13.g = true;
                            kw0Var13.n = false;
                            kw0Var13.l = reVar2;
                            kw0Var13.a();
                        } else {
                            aj2 aj2Var = b42Var.i;
                            float f10 = aj2Var.b;
                            float f11 = aj2Var.a;
                            kw0Var13.h((((long) Float.floatToRawIntBits(f11)) << c) | (((long) Float.floatToRawIntBits(f10)) & j), (((long) Float.floatToRawIntBits(aj2Var.c - f11)) << c) | (((long) Float.floatToRawIntBits(aj2Var.d - f10)) & j), Float.intBitsToFloat((int) (aj2Var.h >> c)));
                        }
                    }
                }
                if (Build.VERSION.SDK_INT < 33 && (((vd0Var instanceof z32) || ((vd0Var instanceof b42) && !mh0.O(((b42) vd0Var).i))) && (au0Var = nw0Var.i) != null)) {
                    au0Var.invoke();
                }
            }
            z2 = true;
        }
        nw0Var.r = ah2Var.e;
        if (i != 0 || z2) {
            ViewParent parent = dbVar2.getParent();
            if (parent != null) {
                dbVar3 = dbVar2;
                parent.onDescendantInvalidated(dbVar3, dbVar3);
            } else {
                dbVar3 = dbVar2;
            }
            if (db.l()) {
                dbVar3.L(0.0f);
            }
        }
        boolean z4 = this.y;
        this.y = ah2Var.q;
        this.C = ah2Var.h;
        boolean z5 = ma1Var2.a == ma1Var.a && ma1Var2.b == ma1Var.b && ma1Var2.c == ma1Var.c && ma1Var2.d == ma1Var.d && ma1Var2.e == ma1Var.e && ma1Var2.f == ma1Var.f && ma1Var2.g == ma1Var.g && ma1Var2.h == ma1Var.h && ac3.a(ma1Var2.i, ma1Var.i);
        if (z && ((!z5 || z4 != this.y) && (t42Var = hb1Var.s) != null)) {
            ((db) t42Var).v(hb1Var);
        }
        if (z5) {
            return;
        }
        hb1Var.M(this);
        if (hb1Var.U > 0) {
            db dbVar5 = (db) kb1.a(hb1Var);
            d31 d31Var = dbVar5.d0.e;
            if (hb1Var.U > 0) {
                ((gy1) d31Var.f).b(hb1Var);
                hb1Var.T = true;
            }
            dbVar5.D(null);
        }
    }

    @Override // defpackage.pa1
    public final boolean U() {
        return t1().r;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x017d  */
    public final boolean U1(long j) {
        boolean z;
        boolean z2;
        boolean zC;
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        s42 s42Var = this.R;
        if (s42Var == null || !this.y) {
            return true;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        kw0 kw0Var = ((nw0) s42Var).e;
        if (kw0Var.w) {
            vd0 vd0VarD = kw0Var.d();
            if (vd0VarD instanceof a42) {
                pe2 pe2Var = ((a42) vd0VarD).i;
                if (pe2Var.a > fIntBitsToFloat || fIntBitsToFloat >= pe2Var.c || pe2Var.b > fIntBitsToFloat2 || fIntBitsToFloat2 >= pe2Var.d) {
                    z = false;
                    z2 = true;
                }
                z = false;
                z2 = true;
            } else if (vd0VarD instanceof b42) {
                aj2 aj2Var = ((b42) vd0VarD).i;
                float f = aj2Var.c;
                float f2 = aj2Var.b;
                float f3 = aj2Var.d;
                float f4 = aj2Var.a;
                long j2 = aj2Var.f;
                long j3 = aj2Var.h;
                z = false;
                z2 = true;
                long j4 = aj2Var.g;
                long j5 = aj2Var.e;
                if (fIntBitsToFloat >= f4 && fIntBitsToFloat < f && fIntBitsToFloat2 >= f2 && fIntBitsToFloat2 < f3) {
                    int i = (int) (j5 >> 32);
                    float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                    int i2 = (int) (j2 >> 32);
                    if (Float.intBitsToFloat(i2) + fIntBitsToFloat3 <= f - f4) {
                        int i3 = (int) (j3 >> 32);
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i3);
                        int i4 = (int) (j4 >> 32);
                        if (Float.intBitsToFloat(i4) + fIntBitsToFloat4 <= f - f4) {
                            int i5 = (int) (j5 & 4294967295L);
                            int i6 = (int) (j3 & 4294967295L);
                            if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= f3 - f2) {
                                int i7 = (int) (j2 & 4294967295L);
                                int i8 = (int) (j4 & 4294967295L);
                                if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= f3 - f2) {
                                    float fIntBitsToFloat5 = Float.intBitsToFloat(i) + f4;
                                    float fIntBitsToFloat6 = Float.intBitsToFloat(i5) + f2;
                                    float fIntBitsToFloat7 = f - Float.intBitsToFloat(i2);
                                    float fIntBitsToFloat8 = Float.intBitsToFloat(i7) + f2;
                                    float fIntBitsToFloat9 = f - Float.intBitsToFloat(i4);
                                    float fIntBitsToFloat10 = f3 - Float.intBitsToFloat(i8);
                                    float fIntBitsToFloat11 = f3 - Float.intBitsToFloat(i6);
                                    float fIntBitsToFloat12 = Float.intBitsToFloat(i3) + f4;
                                    if (fIntBitsToFloat < fIntBitsToFloat5 && fIntBitsToFloat2 < fIntBitsToFloat6) {
                                        zC = ld0.C(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat5, fIntBitsToFloat6, aj2Var.e);
                                    } else if (fIntBitsToFloat < fIntBitsToFloat12 && fIntBitsToFloat2 > fIntBitsToFloat11) {
                                        zC = ld0.C(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat12, fIntBitsToFloat11, aj2Var.h);
                                    } else if (fIntBitsToFloat <= fIntBitsToFloat7 || fIntBitsToFloat2 >= fIntBitsToFloat8) {
                                        zC = (fIntBitsToFloat <= fIntBitsToFloat9 || fIntBitsToFloat2 <= fIntBitsToFloat10) ? z2 : ld0.C(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat9, fIntBitsToFloat10, aj2Var.g);
                                    } else {
                                        zC = ld0.C(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat7, fIntBitsToFloat8, aj2Var.f);
                                    }
                                } else {
                                    re reVarA = ue.a();
                                    re.c(reVarA, aj2Var);
                                    zC = ld0.B(fIntBitsToFloat, fIntBitsToFloat2, reVarA);
                                }
                            } else {
                                re reVarA2 = ue.a();
                                re.c(reVarA2, aj2Var);
                                zC = ld0.B(fIntBitsToFloat, fIntBitsToFloat2, reVarA2);
                            }
                        } else {
                            re reVarA3 = ue.a();
                            re.c(reVarA3, aj2Var);
                            zC = ld0.B(fIntBitsToFloat, fIntBitsToFloat2, reVarA3);
                        }
                    } else {
                        re reVarA4 = ue.a();
                        re.c(reVarA4, aj2Var);
                        zC = ld0.B(fIntBitsToFloat, fIntBitsToFloat2, reVarA4);
                    }
                }
            } else {
                z = false;
                z2 = true;
                if (!(vd0VarD instanceof z32)) {
                    b81.d();
                    return false;
                }
                zC = ld0.B(fIntBitsToFloat, fIntBitsToFloat2, ((z32) vd0VarD).i);
            }
            zC = z;
        } else {
            z = false;
            z2 = true;
        }
        return zC ? z2 : z;
    }

    @Override // defpackage.pa1
    public final void W(float[] fArr) {
        t42 t42VarA = kb1.a(this.s);
        xz1 xz1VarO1 = O1(wc0.F(this));
        R1(xz1VarO1, fArr);
        if (t42VarA instanceof db) {
            ((db) t42VarA).p(fArr);
            return;
        }
        long jH = xz1VarO1.h(0L);
        if ((9223372034707292159L & jH) != 9205357640488583168L) {
            yq1.f(fArr, Float.intBitsToFloat((int) (jH >> 32)), Float.intBitsToFloat((int) (jH & 4294967295L)));
        }
    }

    @Override // defpackage.ck1
    public final boolean W0() {
        return this.D != null;
    }

    @Override // defpackage.pa1
    public final void Z(pa1 pa1Var, float[] fArr) {
        xz1 xz1VarO1 = O1(pa1Var);
        xz1VarO1.C1();
        xz1 xz1VarP1 = p1(xz1VarO1);
        yq1.d(fArr);
        xz1VarO1.R1(xz1VarP1, fArr);
        Q1(xz1VarP1, fArr);
    }

    @Override // defpackage.ck1
    public final hb1 a1() {
        return this.s;
    }

    @Override // defpackage.ck1
    public final fr1 b1() {
        fr1 fr1Var = this.D;
        if (fr1Var != null) {
            return fr1Var;
        }
        fo.n("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // defpackage.ck1
    public final ck1 c1() {
        return this.w;
    }

    @Override // defpackage.pa1
    public final pe2 d0(pa1 pa1Var, boolean z) {
        if (!t1().r) {
            p21.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!pa1Var.U()) {
            p21.c("LayoutCoordinates " + pa1Var + " is not attached!");
        }
        xz1 xz1VarO1 = O1(pa1Var);
        xz1VarO1.C1();
        xz1 xz1VarP1 = p1(xz1VarO1);
        yx1 yx1Var = this.H;
        if (yx1Var == null) {
            yx1Var = new yx1();
            this.H = yx1Var;
        }
        yx1Var.a = 0.0f;
        yx1Var.b = 0.0f;
        yx1Var.c = (int) (pa1Var.f0() >> 32);
        yx1Var.d = (int) (pa1Var.f0() & 4294967295L);
        while (xz1VarO1 != xz1VarP1) {
            xz1VarO1.K1(yx1Var, z, false);
            if (yx1Var.b()) {
                return pe2.e;
            }
            xz1VarO1 = xz1VarO1.w;
            xz1VarO1.getClass();
        }
        i1(xz1VarP1, yx1Var, z);
        return new pe2(yx1Var.a, yx1Var.b, yx1Var.c, yx1Var.d);
    }

    @Override // defpackage.ck1
    public final long d1() {
        return this.F;
    }

    @Override // defpackage.pa1
    public final long f0() {
        return this.g;
    }

    @Override // defpackage.xb0
    public final float g() {
        return this.s.D.g();
    }

    @Override // defpackage.g51
    public final qa1 getLayoutDirection() {
        return this.s.E;
    }

    @Override // defpackage.pa1
    public final long h(long j) {
        if (!t1().r) {
            p21.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((db) kb1.a(this.s)).q(h0(j));
    }

    @Override // defpackage.pa1
    public final long h0(long j) {
        if (!t1().r) {
            p21.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        C1();
        while (this != null) {
            hb1 hb1Var = this.s;
            if (this == hb1Var.K.d && !hb1Var.g) {
                long jB = ((db) kb1.a(hb1Var)).getRectManager().b(hb1Var);
                if (!h41.a(jB, 9223372034707292159L)) {
                    return gh0.L(j, jB);
                }
            }
            s42 s42Var = this.R;
            if (s42Var != null) {
                nw0 nw0Var = (nw0) s42Var;
                float[] fArrB = nw0Var.b();
                if (!nw0Var.w) {
                    j = yq1.b(j, fArrB);
                }
            }
            j = gh0.L(j, this.F);
            this = this.w;
        }
        return j;
    }

    @Override // defpackage.ck1
    public final void h1() {
        I0(this.F, this.G, this.z);
    }

    @Override // defpackage.pa1
    public final long i0(pa1 pa1Var, long j, boolean z) {
        if (pa1Var instanceof fk1) {
            fk1 fk1Var = (fk1) pa1Var;
            fk1Var.e.s.C1();
            return fk1Var.i0(this, j ^ (-9223372034707292160L), z) ^ (-9223372034707292160L);
        }
        xz1 xz1VarO1 = O1(pa1Var);
        xz1VarO1.C1();
        xz1 xz1VarP1 = p1(xz1VarO1);
        while (xz1VarO1 != xz1VarP1) {
            s42 s42Var = xz1VarO1.R;
            if (s42Var != null) {
                nw0 nw0Var = (nw0) s42Var;
                float[] fArrB = nw0Var.b();
                if (!nw0Var.w) {
                    j = yq1.b(j, fArrB);
                }
            }
            if (z || !xz1VarO1.m) {
                j = gh0.L(j, xz1VarO1.F);
            }
            xz1VarO1 = xz1VarO1.w;
            xz1VarO1.getClass();
        }
        return j1(xz1VarP1, j, z);
    }

    public final void i1(xz1 xz1Var, yx1 yx1Var, boolean z) {
        if (xz1Var == this) {
            return;
        }
        xz1 xz1Var2 = this.w;
        if (xz1Var2 != null) {
            xz1Var2.i1(xz1Var, yx1Var, z);
        }
        long j = this.F;
        float f = (int) (j >> 32);
        yx1Var.a -= f;
        yx1Var.c -= f;
        float f2 = (int) (j & 4294967295L);
        yx1Var.b -= f2;
        yx1Var.d -= f2;
        s42 s42Var = this.R;
        if (s42Var != null) {
            nw0 nw0Var = (nw0) s42Var;
            float[] fArrA = nw0Var.a();
            if (!nw0Var.w) {
                if (fArrA == null) {
                    yx1Var.a = 0.0f;
                    yx1Var.b = 0.0f;
                    yx1Var.c = 0.0f;
                    yx1Var.d = 0.0f;
                } else {
                    yq1.c(fArrA, yx1Var);
                }
            }
            if (this.y && z) {
                long j2 = this.g;
                yx1Var.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    public final long j1(xz1 xz1Var, long j, boolean z) {
        if (xz1Var == this) {
            return j;
        }
        xz1 xz1Var2 = this.w;
        return (xz1Var2 == null || o51.f(xz1Var, xz1Var2)) ? q1(j, z) : q1(xz1Var2.j1(xz1Var, j, z), z);
    }

    public final long k1(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - E0();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - D0();
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat / 2.0f))) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L);
    }

    public final float l1(long j, long j2) {
        if (E0() >= Float.intBitsToFloat((int) (j2 >> 32)) && D0() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jK1 = k1(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jK1 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jK1 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - E0());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - D0()))) & 4294967295L);
        if (fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) {
            int i = (int) (jFloatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= fIntBitsToFloat) {
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i2) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i);
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
                    return (fIntBitsToFloat6 * fIntBitsToFloat6) + (fIntBitsToFloat5 * fIntBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void m1(vv vvVar, kw0 kw0Var) {
        s42 s42Var = this.R;
        if (s42Var == null) {
            long j = this.F;
            float f = (int) (j >> 32);
            float f2 = (int) (j & 4294967295L);
            vvVar.g(f, f2);
            n1(vvVar, kw0Var);
            vvVar.g(-f, -f2);
            return;
        }
        nw0 nw0Var = (nw0) s42Var;
        xv xvVar = nw0Var.q;
        nw0Var.g();
        nw0Var.x = nw0Var.e.a.N() > 0.0f;
        gn gnVar = xvVar.f;
        gnVar.C(vvVar);
        gnVar.b = kw0Var;
        dh0.m(xvVar, nw0Var.e);
    }

    public final void n1(vv vvVar, kw0 kw0Var) {
        xz1 xz1Var;
        vv vvVar2;
        kw0 kw0Var2;
        cv1 cv1VarU1 = u1(4);
        if (cv1VarU1 == null) {
            I1(vvVar, kw0Var);
            return;
        }
        hb1 hb1Var = this.s;
        hb1Var.getClass();
        jb1 sharedDrawScope = ((db) kb1.a(hb1Var)).getSharedDrawScope();
        long J = mc0.J(this.g);
        sharedDrawScope.getClass();
        gy1 gy1Var = null;
        while (cv1VarU1 != null) {
            if (cv1VarU1 instanceof hg0) {
                xz1Var = this;
                vvVar2 = vvVar;
                kw0Var2 = kw0Var;
                sharedDrawScope.h(vvVar2, J, xz1Var, (hg0) cv1VarU1, kw0Var2);
            } else {
                xz1Var = this;
                vvVar2 = vvVar;
                kw0Var2 = kw0Var;
                if ((cv1VarU1.g & 4) != 0 && (cv1VarU1 instanceof lb0)) {
                    int i = 0;
                    for (cv1 cv1Var = ((lb0) cv1VarU1).t; cv1Var != null; cv1Var = cv1Var.j) {
                        if ((cv1Var.g & 4) != 0) {
                            i++;
                            if (i == 1) {
                                cv1VarU1 = cv1Var;
                            } else {
                                if (gy1Var == null) {
                                    gy1Var = new gy1(new cv1[16]);
                                }
                                if (cv1VarU1 != null) {
                                    gy1Var.b(cv1VarU1);
                                    cv1VarU1 = null;
                                }
                                gy1Var.b(cv1Var);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                vvVar = vvVar2;
                this = xz1Var;
                kw0Var = kw0Var2;
            }
            cv1VarU1 = xp1.J(gy1Var);
            vvVar = vvVar2;
            this = xz1Var;
            kw0Var = kw0Var2;
        }
    }

    public abstract void o1();

    public final xz1 p1(xz1 xz1Var) {
        hb1 hb1VarU = xz1Var.s;
        hb1 hb1Var = this.s;
        if (hb1VarU == hb1Var) {
            cv1 cv1VarT1 = xz1Var.t1();
            cv1 cv1VarT2 = t1();
            if (!cv1VarT2.e.r) {
                p21.c("visitLocalAncestors called on an unattached node");
            }
            for (cv1 cv1Var = cv1VarT2.e.i; cv1Var != null; cv1Var = cv1Var.i) {
                if ((cv1Var.g & 2) != 0 && cv1Var == cv1VarT1) {
                    return xz1Var;
                }
            }
            return this;
        }
        while (hb1VarU.u > hb1Var.u) {
            hb1VarU = hb1VarU.u();
            hb1VarU.getClass();
        }
        hb1 hb1VarU2 = hb1Var;
        while (hb1VarU2.u > hb1VarU.u) {
            hb1VarU2 = hb1VarU2.u();
            hb1VarU2.getClass();
        }
        while (hb1VarU != hb1VarU2) {
            hb1VarU = hb1VarU.u();
            hb1VarU2 = hb1VarU2.u();
            if (hb1VarU == null || hb1VarU2 == null) {
                fo.i("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (hb1VarU2 != hb1Var) {
            if (hb1VarU != xz1Var.s) {
                return hb1VarU.K.c;
            }
            return xz1Var;
        }
        return this;
    }

    public final long q1(long j, boolean z) {
        if (z || !this.m) {
            long j2 = this.F;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
            j = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        }
        s42 s42Var = this.R;
        if (s42Var != null) {
            nw0 nw0Var = (nw0) s42Var;
            float[] fArrA = nw0Var.a();
            if (fArrA == null) {
                return 9187343241974906880L;
            }
            if (!nw0Var.w) {
                return yq1.b(j, fArrA);
            }
        }
        return j;
    }

    public abstract ek1 r1();

    public final long s1() {
        return this.A.A0(this.s.F.g());
    }

    public abstract cv1 t1();

    public final cv1 u1(int i) {
        boolean zG = yz1.g(i);
        cv1 cv1VarT1 = t1();
        if (!zG && (cv1VarT1 = cv1VarT1.i) == null) {
            return null;
        }
        for (cv1 cv1VarV1 = v1(zG); cv1VarV1 != null && (cv1VarV1.h & i) != 0; cv1VarV1 = cv1VarV1.j) {
            if ((cv1VarV1.g & i) != 0) {
                return cv1VarV1;
            }
            if (cv1VarV1 == cv1VarT1) {
                return null;
            }
        }
        return null;
    }

    public final cv1 v1(boolean z) {
        cv1 cv1VarT1;
        tz1 tz1Var = this.s.K;
        if (tz1Var.d == this) {
            return tz1Var.f;
        }
        xz1 xz1Var = this.w;
        if (!z) {
            if (xz1Var != null) {
                return xz1Var.t1();
            }
            return null;
        }
        if (xz1Var == null || (cv1VarT1 = xz1Var.t1()) == null) {
            return null;
        }
        return cv1VarT1.j;
    }

    public final void w1(cv1 cv1Var, vz1 vz1Var, long j, zx0 zx0Var, int i, boolean z) {
        if (cv1Var == null) {
            z1(vz1Var, j, zx0Var, i, z);
            return;
        }
        if (!vz1Var.c(cv1Var)) {
            w1(ke0.J(cv1Var, vz1Var.b()), vz1Var, j, zx0Var, i, z);
            return;
        }
        int i2 = zx0Var.g;
        sx1 sx1Var = zx0Var.e;
        zx0Var.b(i2 + 1, sx1Var.b);
        zx0Var.g++;
        sx1Var.a(cv1Var);
        zx0Var.f.a(ee0.a(-1.0f, z, false));
        w1(ke0.J(cv1Var, vz1Var.b()), vz1Var, j, zx0Var, i, z);
        zx0Var.g = i2;
    }

    @Override // defpackage.pa1
    public final long x(long j) {
        if (!t1().r) {
            p21.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        pa1 pa1VarF = wc0.F(this);
        db dbVar = (db) kb1.a(this.s);
        dbVar.z();
        return i0(pa1VarF, c12.d(yq1.b(j, dbVar.i0), pa1VarF.h0(0L)), true);
    }

    public final void x1(cv1 cv1Var, vz1 vz1Var, long j, zx0 zx0Var, int i, boolean z, float f) {
        if (cv1Var == null) {
            z1(vz1Var, j, zx0Var, i, z);
            return;
        }
        if (!vz1Var.c(cv1Var)) {
            x1(ke0.J(cv1Var, vz1Var.b()), vz1Var, j, zx0Var, i, z, f);
            return;
        }
        int i2 = zx0Var.g;
        sx1 sx1Var = zx0Var.e;
        zx0Var.b(i2 + 1, sx1Var.b);
        zx0Var.g++;
        sx1Var.a(cv1Var);
        zx0Var.f.a(ee0.a(f, z, false));
        H1(ke0.J(cv1Var, vz1Var.b()), vz1Var, j, zx0Var, i, z, f, true);
        zx0Var.g = i2;
    }

    public final void y1(vz1 vz1Var, long j, zx0 zx0Var, int i, boolean z) {
        boolean z2;
        sx1 sx1Var = zx0Var.e;
        cv1 cv1VarU1 = u1(vz1Var.b());
        boolean z3 = false;
        if (!U1(j)) {
            if (i == 1) {
                float fL1 = l1(j, s1());
                if ((Float.floatToRawIntBits(fL1) & Integer.MAX_VALUE) < 2139095040) {
                    if (zx0Var.g != sx1Var.b - 1) {
                        if (hd0.q(zx0Var.a(), ee0.a(fL1, false, false)) <= 0) {
                            return;
                        }
                    }
                    x1(cv1VarU1, vz1Var, j, zx0Var, i, false, fL1);
                    return;
                }
                return;
            }
            return;
        }
        if (cv1VarU1 == null) {
            z1(vz1Var, j, zx0Var, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < E0() && fIntBitsToFloat2 < D0()) {
            w1(cv1VarU1, vz1Var, j, zx0Var, i, z);
            return;
        }
        float fL2 = i == 1 ? l1(j, s1()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fL2) & Integer.MAX_VALUE) < 2139095040) {
            if (zx0Var.g == sx1Var.b - 1) {
                z2 = z;
            } else {
                z2 = z;
                if (hd0.q(zx0Var.a(), ee0.a(fL2, z2, false)) > 0) {
                }
            }
            z3 = true;
        } else {
            z2 = z;
        }
        H1(cv1VarU1, vz1Var, j, zx0Var, i, z2, fL2, z3);
    }

    @Override // defpackage.pa1
    public final long z(long j) {
        long jH0 = h0(j);
        db dbVar = (db) kb1.a(this.s);
        dbVar.z();
        return yq1.b(jH0, dbVar.h0);
    }

    public void z1(vz1 vz1Var, long j, zx0 zx0Var, int i, boolean z) {
        xz1 xz1Var = this.v;
        if (xz1Var != null) {
            xz1Var.y1(vz1Var, xz1Var.q1(j, true), zx0Var, i, z);
        }
    }

    @Override // defpackage.ck1
    public final pa1 V0() {
        return this;
    }
}
