package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class kc1 {
    public final zx1 a;
    public q01 b;
    public final ay1 c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final dv1 i;

    public kc1() {
        long[] jArr = hn2.a;
        this.a = new zx1();
        ay1 ay1Var = in2.a;
        this.c = new ay1();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new hc1(this);
    }

    public static int e(int[] iArr, rd1 rd1Var) {
        rd1Var.getClass();
        int i = iArr[0] + rd1Var.n;
        iArr[0] = i;
        return Math.max(0, i);
    }

    public final long a() {
        ArrayList arrayList = this.h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        p91.x(arrayList.get(0));
        throw null;
    }

    public final void b(int i, int i2, ArrayList arrayList, q01 q01Var, od1 od1Var, boolean z, boolean z2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        ay1 ay1Var;
        q01 q01Var2 = this.b;
        this.b = q01Var;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            rd1 rd1Var = (rd1) arrayList.get(i9);
            int size2 = rd1Var.b.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((h82) rd1Var.b.get(i10)).A();
            }
        }
        zx1 zx1Var = this.a;
        if (zx1Var.i()) {
            c();
            return;
        }
        boolean z3 = z || !z2;
        Object[] objArr = zx1Var.b;
        long[] jArr = zx1Var.a;
        int length = jArr.length - 2;
        ay1 ay1Var2 = this.c;
        int i11 = 8;
        boolean z4 = z3;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                long j = jArr[i12];
                ay1 ay1Var3 = ay1Var2;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    long j2 = j;
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j2 & 255) < 128) {
                            ay1Var = ay1Var3;
                            ay1Var.a(objArr[(i12 << 3) + i14]);
                        } else {
                            ay1Var = ay1Var3;
                        }
                        j2 >>= 8;
                        i14++;
                        ay1Var3 = ay1Var;
                    }
                    ay1Var2 = ay1Var3;
                    if (i13 != 8) {
                        break;
                    }
                } else {
                    ay1Var2 = ay1Var3;
                }
                if (i12 == length) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        int size3 = arrayList.size();
        for (int i15 = 0; i15 < size3; i15++) {
            rd1 rd1Var2 = (rd1) arrayList.get(i15);
            Object obj = rd1Var2.i;
            List list = rd1Var2.b;
            ay1Var2.l(obj);
            int size4 = list.size();
            for (int i16 = 0; i16 < size4; i16++) {
                ((h82) list.get(i16)).A();
            }
            p91.x(zx1Var.k(rd1Var2.i));
        }
        int[] iArr = new int[1];
        ArrayList arrayList2 = this.e;
        ArrayList arrayList3 = this.d;
        if (z4 && q01Var2 != null) {
            if (arrayList3.isEmpty()) {
                i8 = 0;
            } else {
                if (arrayList3.size() > 1) {
                    ez.Z(arrayList3, new jc1(q01Var2, 2));
                }
                if (arrayList3.size() > 0) {
                    rd1 rd1Var3 = (rd1) arrayList3.get(0);
                    e(iArr, rd1Var3);
                    Object objG = zx1Var.g(rd1Var3.i);
                    objG.getClass();
                    p91.x(objG);
                    rd1Var3.a(0);
                    throw null;
                }
                i8 = 0;
                Arrays.fill(iArr, 0, 1, 0);
            }
            if (!arrayList2.isEmpty()) {
                if (arrayList2.size() > 1) {
                    ez.Z(arrayList2, new jc1(q01Var2, i8));
                }
                if (arrayList2.size() > 0) {
                    rd1 rd1Var4 = (rd1) arrayList2.get(i8);
                    e(iArr, rd1Var4);
                    Object objG2 = zx1Var.g(rd1Var4.i);
                    objG2.getClass();
                    p91.x(objG2);
                    rd1Var4.a(i8);
                    throw null;
                }
                Arrays.fill(iArr, i8, 1, i8);
            }
        }
        Object[] objArr2 = ay1Var2.b;
        long[] jArr2 = ay1Var2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i17 = 0;
            while (true) {
                long j3 = jArr2[i17];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i18 = 8 - ((~(i17 - length2)) >>> 31);
                    int i19 = 0;
                    while (i19 < i18) {
                        if ((j3 & 255) < 128) {
                            p91.x(zx1Var.g(objArr2[(i17 << 3) + i19]));
                        }
                        j3 >>= i11;
                        i19++;
                        i11 = i11;
                    }
                    i7 = i11;
                    if (i18 != i7) {
                        break;
                    }
                } else {
                    i7 = i11;
                }
                if (i17 == length2) {
                    break;
                }
                i17++;
                i11 = i7;
            }
        }
        ArrayList arrayList4 = this.f;
        if (arrayList4.isEmpty()) {
            i5 = 1;
        } else {
            if (arrayList4.size() > 1) {
                ez.Z(arrayList4, new jc1(q01Var, 3));
            }
            int size5 = arrayList4.size();
            for (int i20 = 0; i20 < size5; i20++) {
                rd1 rd1Var5 = (rd1) arrayList4.get(i20);
                Object objG3 = zx1Var.g(rd1Var5.i);
                objG3.getClass();
                p91.x(objG3);
                int iE = e(iArr, rd1Var5);
                if (z) {
                    rd1 rd1Var6 = (rd1) zy.n0(arrayList);
                    long jA = rd1Var6.a(0);
                    i6 = (int) (rd1Var6.c ? 4294967295L & jA : jA >> 32);
                } else {
                    i6 = 0;
                }
                rd1Var5.c(i6 - iE, i, i2);
                if (z4) {
                    d(rd1Var5, true);
                    throw null;
                }
            }
            i5 = 1;
            Arrays.fill(iArr, 0, 1, 0);
        }
        ArrayList arrayList5 = this.g;
        if (!arrayList5.isEmpty()) {
            if (arrayList5.size() > i5) {
                ez.Z(arrayList5, new jc1(q01Var, i5));
            }
            int size6 = arrayList5.size();
            for (int i21 = 0; i21 < size6; i21++) {
                rd1 rd1Var7 = (rd1) arrayList5.get(i21);
                Object objG4 = zx1Var.g(rd1Var7.i);
                objG4.getClass();
                p91.x(objG4);
                rd1Var7.c((0 - rd1Var7.n) + e(iArr, rd1Var7), i, i2);
                if (z4) {
                    d(rd1Var7, true);
                    throw null;
                }
            }
        }
        Collections.reverse(arrayList4);
        arrayList.addAll(0, arrayList4);
        arrayList.addAll(arrayList5);
        arrayList3.clear();
        arrayList2.clear();
        arrayList4.clear();
        arrayList5.clear();
        ay1Var2.b();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004a A[LOOP:0: B:7:0x0013->B:18:0x004a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x004d A[EDGE_INSN: B:22:0x004d->B:19:0x004d BREAK  A[LOOP:0: B:7:0x0013->B:18:0x004a], SYNTHETIC] */
    public final void c() {
        zx1 zx1Var = this.a;
        if (zx1Var.j()) {
            Object[] objArr = zx1Var.c;
            long[] jArr = zx1Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                p91.x(objArr[(i << 3) + i3]);
                                throw null;
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            zx1Var.a();
        }
    }

    public final void d(rd1 rd1Var, boolean z) {
        Object objG = this.a.g(rd1Var.i);
        objG.getClass();
        p91.x(objG);
        throw null;
    }
}
