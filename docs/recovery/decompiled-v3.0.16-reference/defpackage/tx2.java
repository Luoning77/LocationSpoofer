package defpackage;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class tx2 {
    public static final ym2 a = new ym2(18);
    public static final gn b = new gn(15);
    public static final Object c = new Object();
    public static rx2 d;
    public static long e;
    public static final c60 f;
    public static final q01 g;
    public static List h;
    public static List i;
    public static final cw0 j;
    public static final gp k;

    /* JADX WARN: Type inference failed for: r2v2, types: [int[], java.lang.Cloneable] */
    static {
        rx2 rx2Var = rx2.i;
        d = rx2Var;
        e = 2L;
        c60 c60Var = new c60(2);
        c60Var.f = new long[16];
        c60Var.i = new int[16];
        ?? r2 = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            r2[i2] = i3;
            i2 = i3;
        }
        c60Var.j = r2;
        f = c60Var;
        q01 q01Var = new q01(7);
        q01Var.c = new int[16];
        q01Var.d = new ek3[16];
        g = q01Var;
        uj0 uj0Var = uj0.e;
        h = uj0Var;
        i = uj0Var;
        long j2 = e;
        e = 1 + j2;
        cw0 cw0Var = new cw0(j2, rx2Var, null, new zs0(5));
        d = d.e(cw0Var.b);
        j = cw0Var;
        k = new gp(0);
    }

    public static final rx2 a(rx2 rx2Var, long j2, long j3) {
        while (o51.n(j2, j3) < 0) {
            rx2Var = rx2Var.e(j2);
            j2++;
        }
        return rx2Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0090 A[LOOP:1: B:30:0x0056->B:43:0x0090, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0093 A[EDGE_INSN: B:58:0x0093->B:44:0x0093 BREAK  A[LOOP:1: B:30:0x0056->B:43:0x0090], SYNTHETIC] */
    public static final Object b(lu0 lu0Var) {
        ay1 ay1Var;
        Object objU;
        cw0 cw0Var = j;
        synchronized (c) {
            try {
                ay1Var = cw0Var.h;
                if (ay1Var != null) {
                    k.addAndGet(1);
                }
                objU = u(cw0Var, lu0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (ay1Var != null) {
            try {
                List list = h;
                jn2 jn2Var = new jn2(ay1Var);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((pu0) list.get(i2)).invoke(jn2Var, cw0Var);
                }
                k.addAndGet(-1);
            } catch (Throwable th2) {
                k.addAndGet(-1);
                throw th2;
            }
        }
        synchronized (c) {
            d();
            if (ay1Var != null) {
                Object[] objArr = ay1Var.b;
                long[] jArr = ay1Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        } else {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j2) < 128) {
                                    p((x03) objArr[(i3 << 3) + i5]);
                                }
                                j2 >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                            if (i3 != length) {
                                break;
                            }
                            i3++;
                        }
                    }
                }
            }
        }
        return objU;
    }

    public static final void c() {
        b(a);
    }

    public static final void d() {
        q01 q01Var = g;
        int i2 = q01Var.b;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            ek3 ek3Var = ((ek3[]) q01Var.d)[i3];
            Object obj = ek3Var != null ? ek3Var.get() : null;
            if (obj != null && o((x03) obj)) {
                if (i4 != i3) {
                    ((ek3[]) q01Var.d)[i4] = ek3Var;
                    int[] iArr = (int[]) q01Var.c;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((ek3[]) q01Var.d)[i5] = null;
            ((int[]) q01Var.c)[i5] = 0;
        }
        if (i4 != i2) {
            q01Var.b = i4;
        }
    }

    public static final nx2 e(nx2 nx2Var, lu0 lu0Var, boolean z) {
        boolean z2 = nx2Var instanceof dy1;
        if (z2 || nx2Var == null) {
            return new qc3(z2 ? (dy1) nx2Var : null, lu0Var, null, false, z);
        }
        return new rc3(nx2Var, lu0Var, false, z);
    }

    public static final z03 f(z03 z03Var) {
        z03 z03VarR;
        nx2 nx2VarH = h();
        z03 z03VarR2 = r(z03Var, nx2VarH.g(), nx2VarH.d());
        if (z03VarR2 != null) {
            return z03VarR2;
        }
        synchronized (c) {
            nx2 nx2VarH2 = h();
            z03VarR = r(z03Var, nx2VarH2.g(), nx2VarH2.d());
        }
        if (z03VarR != null) {
            return z03VarR;
        }
        q();
        throw null;
    }

    public static final z03 g(z03 z03Var, nx2 nx2Var) {
        z03 z03VarR;
        z03 z03VarR2 = r(z03Var, nx2Var.g(), nx2Var.d());
        if (z03VarR2 != null) {
            return z03VarR2;
        }
        synchronized (c) {
            z03VarR = r(z03Var, nx2Var.g(), nx2Var.d());
        }
        if (z03VarR != null) {
            return z03VarR;
        }
        q();
        throw null;
    }

    public static final nx2 h() {
        nx2 nx2Var = (nx2) b.h();
        return nx2Var == null ? j : nx2Var;
    }

    public static final lu0 i(lu0 lu0Var, lu0 lu0Var2, boolean z) {
        if (!z) {
            lu0Var2 = null;
        }
        if (lu0Var == null || lu0Var2 == null || lu0Var == lu0Var2) {
            return lu0Var == null ? lu0Var2 : lu0Var;
        }
        return new sx2(lu0Var, lu0Var2, 0);
    }

    public static final lu0 j(lu0 lu0Var, lu0 lu0Var2) {
        if (lu0Var == null || lu0Var2 == null || lu0Var == lu0Var2) {
            return lu0Var == null ? lu0Var2 : lu0Var;
        }
        return new sx2(lu0Var, lu0Var2, 1);
    }

    public static final z03 k(z03 z03Var, x03 x03Var) {
        long j2 = e;
        c60 c60Var = f;
        if (c60Var.g > 0) {
            j2 = ((long[]) c60Var.f)[0];
        }
        long j3 = j2 - 1;
        z03 z03Var2 = null;
        z03 z03Var3 = null;
        for (z03 z03VarA = x03Var.a(); z03VarA != null; z03VarA = z03VarA.b) {
            long j4 = z03VarA.a;
            if (j4 != 0) {
                if (j4 != 0 && o51.n(j4, j3) <= 0 && !rx2.i.c(j4)) {
                    if (z03Var3 != null) {
                        if (o51.n(z03VarA.a, z03Var3.a) >= 0) {
                            z03Var2 = z03Var3;
                            break;
                        }
                        break;
                    }
                    z03Var3 = z03VarA;
                }
            }
            z03Var2 = z03VarA;
            break;
        }
        if (z03Var2 != null) {
            z03Var2.a = Long.MAX_VALUE;
            return z03Var2;
        }
        z03 z03VarB = z03Var.b(Long.MAX_VALUE);
        z03VarB.b = x03Var.a();
        x03Var.c(z03VarB);
        return z03VarB;
    }

    public static final void l(nx2 nx2Var, x03 x03Var) {
        nx2Var.t(nx2Var.h() + 1);
        lu0 lu0VarI = nx2Var.i();
        if (lu0VarI != null) {
            lu0VarI.invoke(x03Var);
        }
    }

    public static final HashMap m(long j2, dy1 dy1Var, rx2 rx2Var) {
        long[] jArr;
        rx2 rx2Var2;
        long[] jArr2;
        int i2;
        int i3;
        z03 z03VarR;
        ay1 ay1VarX = dy1Var.x();
        if (ay1VarX != null) {
            long jG = dy1Var.g();
            rx2 rx2VarD = dy1Var.d().e(jG).d(dy1Var.j);
            Object[] objArr = ay1VarX.b;
            long[] jArr3 = ay1VarX.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                HashMap map = null;
                while (true) {
                    long j3 = jArr3[i4];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j3 & 255) < 128) {
                                x03 x03Var = (x03) objArr[(i4 << 3) + i7];
                                z03 z03VarA = x03Var.a();
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                                z03 z03VarR2 = r(z03VarA, j2, rx2Var);
                                if (z03VarR2 != null && (z03VarR = r(z03VarA, jG, rx2VarD)) != null && !z03VarR2.equals(z03VarR)) {
                                    z03 z03VarR3 = r(z03VarA, jG, dy1Var.d());
                                    if (z03VarR3 == null) {
                                        q();
                                        throw null;
                                    }
                                    z03 z03VarB = x03Var.b(z03VarR, z03VarR2, z03VarR3);
                                    if (z03VarB == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(z03VarR2, z03VarB);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                            }
                            j3 >>= i2;
                            i7 = i3 + 1;
                            i5 = i2;
                            jArr3 = jArr2;
                            rx2VarD = rx2VarD;
                        }
                        jArr = jArr3;
                        rx2Var2 = rx2VarD;
                        if (i6 != i5) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        rx2Var2 = rx2VarD;
                    }
                    if (i4 == length) {
                        return map;
                    }
                    i4++;
                    jArr3 = jArr;
                    rx2VarD = rx2Var2;
                }
            }
        }
        return null;
    }

    public static final z03 n(z03 z03Var, y03 y03Var, nx2 nx2Var, z03 z03Var2) {
        z03 z03VarK;
        if (nx2Var.f()) {
            nx2Var.n(y03Var);
        }
        long jG = nx2Var.g();
        if (z03Var2.a == jG) {
            return z03Var2;
        }
        synchronized (c) {
            z03VarK = k(z03Var, y03Var);
        }
        z03VarK.a = jG;
        if (z03Var2.a != 1) {
            nx2Var.n(y03Var);
        }
        return z03VarK;
    }

    public static final boolean o(x03 x03Var) {
        z03 z03Var;
        long j2 = e;
        c60 c60Var = f;
        if (c60Var.g > 0) {
            j2 = ((long[]) c60Var.f)[0];
        }
        z03 z03Var2 = null;
        z03 z03VarA = null;
        int i2 = 0;
        for (z03 z03VarA2 = x03Var.a(); z03VarA2 != null; z03VarA2 = z03VarA2.b) {
            long j3 = z03VarA2.a;
            if (j3 != 0) {
                if (o51.n(j3, j2) >= 0) {
                    i2++;
                } else if (z03Var2 == null) {
                    i2++;
                    z03Var2 = z03VarA2;
                } else {
                    if (o51.n(z03VarA2.a, z03Var2.a) < 0) {
                        z03Var = z03Var2;
                        z03Var2 = z03VarA2;
                    } else {
                        z03Var = z03VarA2;
                    }
                    if (z03VarA == null) {
                        z03VarA = x03Var.a();
                        z03 z03Var3 = z03VarA;
                        while (true) {
                            if (z03VarA == null) {
                                z03VarA = z03Var3;
                                break;
                            }
                            if (o51.n(z03VarA.a, j2) >= 0) {
                                break;
                            }
                            if (o51.n(z03Var3.a, z03VarA.a) < 0) {
                                z03Var3 = z03VarA;
                            }
                            z03VarA = z03VarA.b;
                        }
                    }
                    z03Var2.a = 0L;
                    z03Var2.a(z03VarA);
                    z03Var2 = z03Var;
                }
            }
        }
        return i2 > 1;
    }

    public static final void p(x03 x03Var) {
        if (o(x03Var)) {
            q01 q01Var = g;
            int i2 = q01Var.b;
            int iIdentityHashCode = System.identityHashCode(x03Var);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = q01Var.b - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i3 = -(i5 + 1);
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = ((int[]) q01Var.c)[i6];
                    if (i7 < iIdentityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > iIdentityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        ek3 ek3Var = ((ek3[]) q01Var.d)[i6];
                        if (x03Var == (ek3Var != null ? ek3Var.get() : null)) {
                            i3 = i6;
                            break;
                        }
                        int i8 = i6 - 1;
                        while (true) {
                            if (-1 >= i8 || ((int[]) q01Var.c)[i8] != iIdentityHashCode) {
                                i6++;
                                int i9 = q01Var.b;
                                while (true) {
                                    if (i6 >= i9) {
                                        i3 = -(q01Var.b + 1);
                                        break;
                                    }
                                    if (((int[]) q01Var.c)[i6] != iIdentityHashCode) {
                                        i3 = -(i6 + 1);
                                        break;
                                    }
                                    ek3 ek3Var2 = ((ek3[]) q01Var.d)[i6];
                                    if ((ek3Var2 != null ? ek3Var2.get() : null) == x03Var) {
                                        i3 = i6;
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                ek3 ek3Var3 = ((ek3[]) q01Var.d)[i8];
                                if ((ek3Var3 != null ? ek3Var3.get() : null) == x03Var) {
                                    i3 = i8;
                                    break;
                                }
                                i8--;
                            }
                        }
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            ek3[] ek3VarArr = (ek3[]) q01Var.d;
            int length = ek3VarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                ek3[] ek3VarArr2 = new ek3[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(ek3VarArr, i10, ek3VarArr2, i12, i2 - i10);
                System.arraycopy((ek3[]) q01Var.d, 0, ek3VarArr2, 0, i10);
                yo.k0(i12, i10, i2, (int[]) q01Var.c, iArr);
                yo.o0(0, i10, 6, (int[]) q01Var.c, iArr);
                q01Var.d = ek3VarArr2;
                q01Var.c = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(ek3VarArr, i10, ek3VarArr, i13, i2 - i10);
                int[] iArr2 = (int[]) q01Var.c;
                yo.k0(i13, i10, i2, iArr2, iArr2);
            }
            ((ek3[]) q01Var.d)[i10] = new ek3(x03Var);
            ((int[]) q01Var.c)[i10] = iIdentityHashCode;
            q01Var.b++;
        }
    }

    public static final void q() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final z03 r(z03 z03Var, long j2, rx2 rx2Var) {
        z03 z03Var2 = null;
        while (z03Var != null) {
            long j3 = z03Var.a;
            if (j3 != 0 && o51.n(j3, j2) <= 0 && !rx2Var.c(j3) && (z03Var2 == null || o51.n(z03Var2.a, z03Var.a) < 0)) {
                z03Var2 = z03Var;
            }
            z03Var = z03Var.b;
        }
        if (z03Var2 != null) {
            return z03Var2;
        }
        return null;
    }

    public static final z03 s(z03 z03Var, x03 x03Var) {
        z03 z03VarR;
        nx2 nx2VarH = h();
        lu0 lu0VarE = nx2VarH.e();
        if (lu0VarE != null) {
            lu0VarE.invoke(x03Var);
        }
        z03 z03VarR2 = r(z03Var, nx2VarH.g(), nx2VarH.d());
        if (z03VarR2 != null) {
            return z03VarR2;
        }
        synchronized (c) {
            nx2 nx2VarH2 = h();
            z03 z03VarA = x03Var.a();
            z03VarA.getClass();
            z03VarR = r(z03VarA, nx2VarH2.g(), nx2VarH2.d());
            if (z03VarR == null) {
                q();
                throw null;
            }
        }
        return z03VarR;
    }

    public static final void t(int i2) {
        c60 c60Var = f;
        int i3 = ((int[]) c60Var.j)[i2];
        c60Var.c(i3, c60Var.g - 1);
        c60Var.g--;
        long[] jArr = (long[]) c60Var.f;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (o51.n(jArr[i5], j2) <= 0) {
                break;
            }
            c60Var.c(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = (long[]) c60Var.f;
        int i6 = c60Var.g >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < c60Var.g && o51.n(jArr2[i7], jArr2[i8]) < 0) {
                if (o51.n(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                c60Var.c(i7, i3);
                i3 = i7;
            } else {
                if (o51.n(jArr2[i8], jArr2[i3]) >= 0) {
                    break;
                }
                c60Var.c(i8, i3);
                i3 = i8;
            }
        }
        ((int[]) c60Var.j)[i2] = c60Var.h;
        c60Var.h = i2;
    }

    public static final Object u(cw0 cw0Var, lu0 lu0Var) {
        long j2 = cw0Var.b;
        Object objInvoke = lu0Var.invoke(d.b(j2));
        long j3 = e;
        e = 1 + j3;
        rx2 rx2VarB = d.b(j2);
        d = rx2VarB;
        cw0Var.b = j3;
        cw0Var.a = rx2VarB;
        cw0Var.g = 0;
        cw0Var.h = null;
        cw0Var.o();
        d = d.e(j3);
        return objInvoke;
    }

    public static final void v(nx2 nx2Var) {
        long j2;
        if (d.c(nx2Var.g())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(nx2Var.g());
        sb.append(", disposed=");
        sb.append(nx2Var.c);
        sb.append(", applied=");
        dy1 dy1Var = nx2Var instanceof dy1 ? (dy1) nx2Var : null;
        sb.append(dy1Var != null ? Boolean.valueOf(dy1Var.m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (c) {
            c60 c60Var = f;
            j2 = c60Var.g > 0 ? ((long[]) c60Var.f)[0] : -1L;
        }
        sb.append(j2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final z03 w(z03 z03Var, x03 x03Var, nx2 nx2Var) {
        z03 z03VarR;
        if (nx2Var.f()) {
            nx2Var.n(x03Var);
        }
        long jG = nx2Var.g();
        z03 z03VarR2 = r(z03Var, jG, nx2Var.d());
        if (z03VarR2 == null) {
            q();
            throw null;
        }
        if (z03VarR2.a == nx2Var.g()) {
            return z03VarR2;
        }
        synchronized (c) {
            z03VarR = r(x03Var.a(), jG, nx2Var.d());
            if (z03VarR == null) {
                q();
                throw null;
            }
            if (z03VarR.a != jG) {
                z03 z03VarK = k(z03VarR, x03Var);
                z03VarK.a(z03VarR);
                z03VarK.a = nx2Var.g();
                z03VarR = z03VarK;
            }
        }
        if (z03VarR2.a != 1) {
            nx2Var.n(x03Var);
        }
        return z03VarR;
    }
}
