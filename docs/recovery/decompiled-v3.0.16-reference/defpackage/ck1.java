package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class ck1 extends h82 implements gr1, tv1 {
    public ak1 j;
    public lu0 k;
    public j82 l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final dk1 p = new dk1(this, 0);
    public fk q;
    public zx1 r;

    public static void f1(xz1 xz1Var) {
        ib1 ib1Var;
        xz1 xz1Var2 = xz1Var.v;
        hb1 hb1Var = xz1Var.s;
        if (!o51.f(xz1Var2 != null ? xz1Var2.s : null, hb1Var)) {
            hb1Var.L.p.B.f();
            return;
        }
        r9 r9VarH = hb1Var.L.p.H();
        if (r9VarH == null || (ib1Var = ((dr1) r9VarH).B) == null) {
            return;
        }
        ib1Var.f();
    }

    @Override // defpackage.tv1
    public final void E(boolean z) {
        ck1 ck1VarC1 = c1();
        hb1 hb1VarA1 = ck1VarC1 != null ? ck1VarC1.a1() : null;
        if (o51.f(hb1VarA1, a1())) {
            this.m = z;
            return;
        }
        if ((hb1VarA1 != null ? hb1VarA1.L.d : null) != db1.g) {
            if ((hb1VarA1 != null ? hb1VarA1.L.d : null) != db1.h) {
                return;
            }
        }
        this.m = z;
    }

    @Override // defpackage.g51
    public boolean J() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0108  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void L0(hb1 hb1Var, gy0 gy0Var) {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        zx1 zx1Var = this.r;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (zx1Var != null) {
            Object[] objArr = zx1Var.c;
            long[] jArr3 = zx1Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c3) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c2 = c3;
                                ay1 ay1Var = (ay1) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = ay1Var.b;
                                long[] jArr4 = ay1Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    hb1 hb1Var2 = (hb1) ((dk3) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (hb1Var2 != null) {
                                                        boolean zG = hb1Var2.G();
                                                        i4 = i8;
                                                        if (zG) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    ay1Var.m(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c2 = c3;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c3 = c2;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 255;
                j3 = 128;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        zx1 zx1Var2 = this.r;
        if (zx1Var2 != null) {
            long[] jArr5 = zx1Var2.a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i15 = 0;
                while (true) {
                    long j11 = jArr5[i15];
                    if ((((~j11) << c) & j11 & j) != j) {
                        int i16 = 8 - ((~(i15 - length3)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((j11 & j2) < j3) {
                                int i18 = (i15 << 3) + i17;
                                if (((ay1) zx1Var2.c[i18]).g()) {
                                    zx1Var2.l(i18);
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        }
                    }
                    if (i15 == length3) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
        }
        zx1 zx1Var3 = this.r;
        if (zx1Var3 == null) {
            zx1Var3 = new zx1();
            this.r = zx1Var3;
        }
        Object objG = zx1Var3.g(gy0Var);
        if (objG == null) {
            objG = new ay1();
            zx1Var3.m(gy0Var, objG);
        }
        ((ay1) objG).k(new dk3(hb1Var));
    }

    public abstract int M0(m9 m9Var);

    /* JADX WARN: Multi-variable type inference failed */
    public final void R0(j82 j82Var, long j, long j2) {
        char c;
        long j3;
        long j4;
        long j5;
        hb1 hb1Var;
        int i;
        char c2;
        long j6;
        ck1 ck1VarC1;
        v42 snapshotObserver;
        zx1 zx1Var = this.r;
        fk fkVar = this.q;
        if (fkVar == null) {
            fkVar = new fk();
            this.q = fkVar;
        }
        fk fkVar2 = fkVar;
        t42 t42Var = a1().s;
        if (t42Var != null && (snapshotObserver = ((db) t42Var).getSnapshotObserver()) != null) {
            snapshotObserver.a.c(j82Var, ik0.m, new bk1(this, j, j2, j82Var));
        }
        boolean zJ = J();
        ay1 ay1Var = (ay1) fkVar2.f;
        ay1 ay1Var2 = (ay1) fkVar2.g;
        int i2 = fkVar2.b;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) fkVar2.e)[i3];
            if (b == 3) {
                gy0 gy0Var = ((gy0[]) fkVar2.c)[i3];
                gy0Var.getClass();
                ay1Var2.k(gy0Var);
            } else if (b != 0 && zx1Var != null) {
                gy0 gy0Var2 = ((gy0[]) fkVar2.c)[i3];
                gy0Var2.getClass();
                ay1 ay1Var3 = (ay1) zx1Var.k(gy0Var2);
                if (ay1Var3 != null) {
                    ay1Var.j(ay1Var3);
                }
            }
        }
        int i4 = fkVar2.b;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) fkVar2.e;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                gy0[] gy0VarArr = (gy0[]) fkVar2.c;
                gy0VarArr[i6 - i5] = gy0VarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = fkVar2.b;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((gy0[]) fkVar2.c)[i8] = null;
        }
        fkVar2.b -= i5;
        ck1 ck1VarC2 = c1();
        Object[] objArr = ay1Var2.b;
        long[] jArr = ay1Var2.a;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            gy0 gy0Var3 = (gy0) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            ck1 ck1Var = ck1VarC2 == null ? this : ck1VarC2;
                            i = i9;
                            ck1 ck1Var2 = ck1Var;
                            while (true) {
                                fk fkVar3 = ck1Var2.q;
                                if ((fkVar3 != null && yo.y0((gy0[]) fkVar3.c, gy0Var3) >= 0) || (ck1VarC1 = ck1Var2.c1()) == null) {
                                    break;
                                } else {
                                    ck1Var2 = ck1VarC1;
                                }
                            }
                            zx1 zx1Var2 = ck1Var2.r;
                            ay1 ay1Var4 = zx1Var2 != null ? (ay1) zx1Var2.k(gy0Var3) : null;
                            if (ay1Var4 != null) {
                                ck1Var.g1(ay1Var4);
                            }
                        } else {
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                    }
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                i9 = 8;
            }
        } else {
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        ay1Var2.b();
        Object[] objArr2 = ay1Var.b;
        long[] jArr2 = ay1Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (hb1Var = (hb1) ((dk3) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (zJ) {
                                hb1Var.R(false);
                            } else {
                                hb1Var.U(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        ay1Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[LOOP:0: B:11:0x001b->B:21:0x0052, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x0055 A[EDGE_INSN: B:48:0x0055->B:22:0x0055 BREAK  A[LOOP:0: B:11:0x001b->B:21:0x0052], SYNTHETIC] */
    public final void S0(fr1 fr1Var) {
        long j;
        long j2;
        zx1 zx1Var = this.r;
        if (this.o) {
            return;
        }
        lu0 lu0VarD = fr1Var.d();
        if (lu0VarD != null) {
            boolean z = this.k != lu0VarD;
            if (z || !e1().e) {
                j = 0;
                j2 = 9223372034707292159L;
            } else {
                pa1 pa1VarV0 = V0();
                long jO = gh0.O(pa1VarV0.h(0L));
                long jF0 = pa1VarV0.f0();
                j2 = jO;
                j = jF0;
                z = (h41.a(jO, e1().f) && p41.b(jF0, e1().g)) ? false : true;
            }
            if (z) {
                j82 j82Var = this.l;
                if (j82Var != null) {
                    j82Var.e = fr1Var;
                } else {
                    j82Var = new j82(fr1Var, this);
                    this.l = j82Var;
                }
                R0(j82Var, j2, j);
                this.k = fr1Var.d();
                return;
            }
            return;
        }
        if (zx1Var != null) {
            Object[] objArr = zx1Var.c;
            long[] jArr = zx1Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j3 = jArr[i];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j3) < 128) {
                                g1((ay1) objArr[(i << 3) + i3]);
                            }
                            j3 >>= 8;
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

    public abstract ck1 T0();

    public abstract pa1 V0();

    public abstract boolean W0();

    public abstract hb1 a1();

    public abstract fr1 b1();

    public abstract ck1 c1();

    public abstract long d1();

    public final ak1 e1() {
        ak1 ak1Var = this.j;
        if (ak1Var != null) {
            return ak1Var;
        }
        ak1 ak1Var2 = new ak1(this);
        this.j = ak1Var2;
        return ak1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g1(ay1 ay1Var) {
        hb1 hb1Var;
        Object[] objArr = ay1Var.b;
        long[] jArr = ay1Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (hb1Var = (hb1) ((dk3) objArr[(i << 3) + i3]).get()) != null) {
                        if (J()) {
                            hb1Var.R(false);
                        } else {
                            hb1Var.U(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public abstract void h1();

    @Override // defpackage.gr1
    public final fr1 m0(int i, int i2, Map map, lu0 lu0Var, lu0 lu0Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            p21.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new zn(i, i2, map, lu0Var, lu0Var2, this, 1);
    }

    @Override // defpackage.h82
    public final int x0(m9 m9Var) {
        int iM0;
        if (!W0() || (iM0 = M0(m9Var)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = m9Var instanceof ji3;
        long j = this.i;
        return iM0 + ((int) (z ? j >> 32 : 4294967295L & j));
    }
}
