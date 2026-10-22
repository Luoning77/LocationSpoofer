package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class re2 {
    public final db a;
    public final q01 b;
    public final ha3 c;
    public final sx1 d;
    public boolean e;
    public boolean f;
    public boolean g;
    public ma h;
    public long i;
    public final ye j;
    public final yx1 k;

    public re2(db dbVar) {
        this.a = dbVar;
        q01 q01Var = new q01(6);
        q01Var.c = new long[192];
        q01Var.d = new long[192];
        this.b = q01Var;
        this.c = new ha3();
        this.d = new sx1();
        this.i = -1L;
        this.j = new ye(this, 20);
        this.k = new yx1();
    }

    public static boolean c(xz1 xz1Var) {
        s42 s42Var = xz1Var.R;
        return (s42Var == null || mh0.M(((nw0) s42Var).b())) ? false : true;
    }

    public static long e(hb1 hb1Var) {
        tz1 tz1Var = hb1Var.K;
        xz1 xz1Var = tz1Var.d;
        long jC = 0;
        for (xz1 xz1Var2 = tz1Var.c; xz1Var2 != null && xz1Var2 != xz1Var; xz1Var2 = xz1Var2.w) {
            if (c(xz1Var2)) {
                return 9223372034707292159L;
            }
            jC = h41.c(jC, xz1Var2.F);
        }
        return jC;
    }

    public static void h(hb1 hb1Var) {
        if (!hb1Var.g || c(hb1Var.K.d)) {
            return;
        }
        hb1Var.g = false;
        if (hb1Var.i) {
            hb1Var.h = e(hb1Var);
            hb1Var.i = false;
        }
        if (h41.a(hb1Var.h, 9223372034707292159L)) {
            return;
        }
        gy1 gy1VarY = hb1Var.y();
        Object[] objArr = gy1VarY.e;
        int i = gy1VarY.g;
        for (int i2 = 0; i2 < i; i2++) {
            h((hb1) objArr[i2]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0242  */
    /* JADX WARN: Code duplicated, block: B:103:0x024b A[LOOP:11: B:102:0x0249->B:103:0x024b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x0254 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0256 A[LOOP:9: B:95:0x0225->B:107:0x0256, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x025d A[ADDED_TO_REGION, LOOP:12: B:110:0x025d->B:111:0x025f, LOOP_START, PHI: r1
      0x025d: PHI (r1v8 ga3) = (r1v7 ga3), (r1v9 ga3) binds: [B:109:0x025b, B:111:0x025f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:111:0x025f A[LOOP:12: B:110:0x025d->B:111:0x025f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x026a  */
    /* JADX WARN: Code duplicated, block: B:135:0x0207 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0259 A[EDGE_INSN: B:136:0x0259->B:108:0x0259 BREAK  A[LOOP:9: B:95:0x0225->B:107:0x0256], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0259 A[EDGE_INSN: B:137:0x0259->B:108:0x0259 BREAK  A[LOOP:9: B:95:0x0225->B:107:0x0256], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x017f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0189 A[ADDED_TO_REGION, LOOP:7: B:73:0x0189->B:74:0x018b, LOOP_START, PHI: r3
      0x0189: PHI (r3v6 ga3) = (r3v5 ga3), (r3v7 ga3) binds: [B:72:0x0187, B:74:0x018b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x018b A[LOOP:7: B:73:0x0189->B:74:0x018b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x0211  */
    /* JADX WARN: Code duplicated, block: B:92:0x0219  */
    /* JADX WARN: Code duplicated, block: B:94:0x0224  */
    /* JADX WARN: Code duplicated, block: B:97:0x0231  */
    /* JADX WARN: Code duplicated, block: B:99:0x023c  */
    public final void a() {
        boolean z;
        long j;
        int i;
        long j2;
        long j3;
        int i2;
        long j4;
        Object[] objArr;
        long[] jArr;
        int length;
        ga3 ga3Var;
        int i3;
        long j5;
        int i4;
        long j6;
        int i5;
        ga3 ga3Var2;
        long[] jArr2;
        long[] jArr3;
        int i6;
        int i7;
        int i8;
        long j7;
        long j8;
        float[] fArr;
        ga3 ga3Var3;
        long[] jArr4;
        long j9;
        long j10;
        ma maVar = this.h;
        if (maVar != null) {
            this.a.removeCallbacks(maVar);
            this.h = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.e;
        boolean z3 = z2 || this.f;
        q01 q01Var = this.b;
        boolean z4 = true;
        ha3 ha3Var = this.c;
        if (z2) {
            this.e = false;
            sx1 sx1Var = this.d;
            Object[] objArr2 = sx1Var.a;
            int i9 = sx1Var.b;
            for (int i10 = 0; i10 < i9; i10++) {
                ((au0) objArr2[i10]).invoke();
            }
            long[] jArr5 = (long[]) q01Var.c;
            int i11 = q01Var.b;
            int i12 = 0;
            while (i12 < jArr5.length - 2 && i12 < i11) {
                long j11 = jArr5[i12 + 2];
                boolean z5 = z4;
                int i13 = i11;
                if ((((int) (j11 >> 60)) & 1) != 0) {
                    long j12 = jArr5[i12];
                    long j13 = jArr5[i12 + 1];
                    ga3 ga3Var4 = (ga3) ha3Var.a.b(((int) j11) & 33554431);
                    while (ga3Var4 != null) {
                        ga3 ga3Var5 = ga3Var4.d;
                        boolean z6 = z3;
                        long j14 = ga3Var4.g;
                        boolean z7 = (jCurrentTimeMillis - j14 >= 0 || j14 == Long.MIN_VALUE) ? z5 : false;
                        ga3Var4.e = j12;
                        ga3Var4.f = j13;
                        if (z7) {
                            ga3Var4.g = jCurrentTimeMillis;
                            j9 = j12;
                            j10 = j13;
                            ga3Var4.a(j9, j10, ha3Var.d, ha3Var.e, ha3Var.g);
                        } else {
                            j9 = j12;
                            j10 = j13;
                        }
                        ga3Var4 = ga3Var5;
                        j12 = j9;
                        j13 = j10;
                        z3 = z6;
                    }
                }
                i12 += 3;
                z4 = z5;
                i11 = i13;
                z3 = z3;
            }
            z = z3;
            j = 0;
            long[] jArr6 = (long[]) q01Var.c;
            int i14 = q01Var.b;
            for (int i15 = 0; i15 < jArr6.length - 2 && i15 < i14; i15 += 3) {
                int i16 = i15 + 2;
                jArr6[i16] = jArr6[i16] & (-1152921504606846977L);
            }
        } else {
            z = z3;
            j = 0;
        }
        if (this.f) {
            this.f = false;
            long j15 = ha3Var.d;
            long j16 = ha3Var.e;
            float[] fArr2 = ha3Var.g;
            gx1 gx1Var = ha3Var.a;
            j2 = 128;
            Object[] objArr3 = gx1Var.c;
            long[] jArr7 = gx1Var.a;
            int length2 = jArr7.length - 2;
            if (length2 >= 0) {
                int i17 = 0;
                int i18 = 8;
                j3 = 255;
                while (true) {
                    long j17 = j15;
                    long j18 = jArr7[i17];
                    int i19 = i18;
                    q01Var = q01Var;
                    if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i20 = 8 - ((~(i17 - length2)) >>> 31);
                        long j19 = j18;
                        int i21 = 0;
                        while (i21 < i20) {
                            if ((j19 & 255) < 128) {
                                ga3 ga3Var6 = (ga3) objArr3[(i17 << 3) + i21];
                                while (ga3Var6 != null) {
                                    ha3Var.a(ga3Var6, j17, j16, fArr2, jCurrentTimeMillis);
                                    ga3Var6 = ga3Var6.d;
                                    i19 = i19;
                                    jArr7 = jArr7;
                                }
                            }
                            long[] jArr8 = jArr7;
                            int i22 = i19;
                            j19 >>= i22;
                            i21++;
                            j17 = j17;
                            i19 = i22;
                            jArr7 = jArr8;
                        }
                        jArr4 = jArr7;
                        i = i19;
                        j15 = j17;
                        if (i20 != i) {
                            break;
                        }
                    } else {
                        jArr4 = jArr7;
                        i = i19;
                        j15 = j17;
                    }
                    if (i17 == length2) {
                        break;
                    }
                    i17++;
                    i18 = i;
                    q01Var = q01Var;
                    jArr7 = jArr4;
                }
            } else {
                i = 8;
            }
            if (z) {
                j7 = ha3Var.d;
                j8 = ha3Var.e;
                fArr = ha3Var.g;
                ga3Var3 = ha3Var.b;
                if (ga3Var3 != null) {
                    while (ga3Var3 != null) {
                        hb1 hb1VarO = xp1.O(ga3Var3.b);
                        long jB = ((db) kb1.a(hb1VarO)).getRectManager().b(hb1VarO);
                        ga3Var3.e = jB;
                        dr1 dr1Var = hb1VarO.L.p;
                        ga3Var3.f = (((long) (dr1Var.e + ((int) (jB >> 32)))) << 32) | (((long) (dr1Var.f + ((int) (jB & 4294967295L)))) & 4294967295L);
                        ha3Var.a(ga3Var3, j7, j8, fArr, jCurrentTimeMillis);
                        ga3Var3 = ga3Var3.d;
                    }
                }
            }
            if (this.g) {
                i2 = 0;
                this.g = false;
                q01 q01Var2 = q01Var;
                jArr2 = (long[]) q01Var2.c;
                int i23 = q01Var2.b;
                jArr3 = (long[]) q01Var2.d;
                i7 = 0;
                for (i6 = 0; i6 < jArr2.length - 2 && i7 < jArr3.length - 2 && i6 < i23; i6 += 3) {
                    i8 = i6 + 2;
                    if (jArr2[i8] != qe2.a) {
                        jArr3[i7] = jArr2[i6];
                        jArr3[i7 + 1] = jArr2[i6 + 1];
                        jArr3[i7 + 2] = jArr2[i8];
                        i7 += 3;
                    }
                }
                q01Var2.b = i7;
                q01Var2.c = jArr3;
                q01Var2.d = jArr2;
            } else {
                i2 = 0;
            }
            j4 = ha3Var.c;
            if (j4 <= jCurrentTimeMillis) {
                gx1 gx1Var2 = ha3Var.a;
                objArr = gx1Var2.c;
                jArr = gx1Var2.a;
                length = jArr.length - 2;
                if (length >= 0) {
                    i3 = i2;
                    while (true) {
                        j5 = jArr[i3];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        } else {
                            i4 = 8 - ((~(i3 - length)) >>> 31);
                            j6 = j5;
                            for (i5 = i2; i5 < i4; i5++) {
                                if ((j6 & j3) < j2) {
                                    for (ga3Var2 = (ga3) objArr[(i3 << 3) + i5]; ga3Var2 != null; ga3Var2 = ga3Var2.d) {
                                    }
                                }
                                j6 >>= i;
                            }
                            if (i4 == i) {
                                break;
                            } else if (i3 != length) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                ga3Var = ha3Var.b;
                if (ga3Var != null) {
                    while (ga3Var != null) {
                        ga3Var = ga3Var.d;
                    }
                }
                j4 = -1;
                ha3Var.c = -1L;
            }
            if (j4 > j) {
                i();
            }
        }
        i = 8;
        j2 = 128;
        j3 = 255;
        if (z) {
            j7 = ha3Var.d;
            j8 = ha3Var.e;
            fArr = ha3Var.g;
            ga3Var3 = ha3Var.b;
            if (ga3Var3 != null) {
                while (ga3Var3 != null) {
                    hb1 hb1VarO2 = xp1.O(ga3Var3.b);
                    long jB2 = ((db) kb1.a(hb1VarO2)).getRectManager().b(hb1VarO2);
                    ga3Var3.e = jB2;
                    dr1 dr1Var2 = hb1VarO2.L.p;
                    ga3Var3.f = (((long) (dr1Var2.e + ((int) (jB2 >> 32)))) << 32) | (((long) (dr1Var2.f + ((int) (jB2 & 4294967295L)))) & 4294967295L);
                    ha3Var.a(ga3Var3, j7, j8, fArr, jCurrentTimeMillis);
                    ga3Var3 = ga3Var3.d;
                }
            }
        }
        if (this.g) {
            i2 = 0;
            this.g = false;
            q01 q01Var3 = q01Var;
            jArr2 = (long[]) q01Var3.c;
            int i24 = q01Var3.b;
            jArr3 = (long[]) q01Var3.d;
            i7 = 0;
            while (i6 < jArr2.length - 2) {
                i8 = i6 + 2;
                if (jArr2[i8] != qe2.a) {
                    jArr3[i7] = jArr2[i6];
                    jArr3[i7 + 1] = jArr2[i6 + 1];
                    jArr3[i7 + 2] = jArr2[i8];
                    i7 += 3;
                }
            }
            q01Var3.b = i7;
            q01Var3.c = jArr3;
            q01Var3.d = jArr2;
        } else {
            i2 = 0;
        }
        j4 = ha3Var.c;
        if (j4 <= jCurrentTimeMillis) {
            gx1 gx1Var3 = ha3Var.a;
            objArr = gx1Var3.c;
            jArr = gx1Var3.a;
            length = jArr.length - 2;
            if (length >= 0) {
                i3 = i2;
                while (true) {
                    j5 = jArr[i3];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        if (i3 != length) {
                            break;
                            break;
                        }
                        i3++;
                    } else {
                        i4 = 8 - ((~(i3 - length)) >>> 31);
                        j6 = j5;
                        while (i5 < i4) {
                            if ((j6 & j3) < j2) {
                                while (ga3Var2 != null) {
                                }
                            }
                            j6 >>= i;
                        }
                        if (i4 == i) {
                            break;
                            break;
                        } else {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        }
                    }
                }
            }
            ga3Var = ha3Var.b;
            if (ga3Var != null) {
                while (ga3Var != null) {
                    ga3Var = ga3Var.d;
                }
            }
            j4 = -1;
            ha3Var.c = -1L;
        }
        if (j4 > j) {
            i();
        }
    }

    public final long b(hb1 hb1Var) {
        long j;
        int i = hb1Var.f & 33554431;
        q01 q01Var = this.b;
        long[] jArr = (long[]) q01Var.c;
        int i2 = q01Var.b;
        int i3 = 0;
        while (true) {
            if (i3 >= jArr.length - 2 || i3 >= i2) {
                j = Long.MAX_VALUE;
                break;
            }
            if ((((int) jArr[i3 + 2]) & 33554431) == i) {
                j = jArr[i3];
                break;
            }
            i3 += 3;
        }
        if (j == Long.MAX_VALUE) {
            return 9223372034707292159L;
        }
        return (((long) ((int) j)) & 4294967295L) | (((long) ((int) (j >> 32))) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:33:0x0102  */
    public final void d(hb1 hb1Var) {
        boolean z;
        hb1 hb1VarU;
        int i;
        boolean z2 = true;
        hb1Var.g = true;
        tz1 tz1Var = hb1Var.K;
        dr1 dr1Var = hb1Var.L.p;
        int iE0 = dr1Var.E0();
        float fD0 = dr1Var.D0();
        yx1 yx1Var = this.k;
        yx1Var.a = 0.0f;
        yx1Var.b = 0.0f;
        yx1Var.c = iE0;
        yx1Var.d = fD0;
        for (xz1 xz1Var = tz1Var.d; xz1Var != null; xz1Var = xz1Var.w) {
            hb1 hb1Var2 = xz1Var.s;
            if (xz1Var == hb1Var2.K.d && !hb1Var2.g) {
                long jB = b(hb1Var2);
                if (!h41.a(jB, 9223372034707292159L)) {
                    yx1Var.c((((long) Float.floatToRawIntBits((int) (jB >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jB & 4294967295L))) & 4294967295L));
                    break;
                }
            }
            s42 s42Var = xz1Var.R;
            if (s42Var != null) {
                float[] fArrB = ((nw0) s42Var).b();
                if (!mh0.M(fArrB)) {
                    yq1.c(fArrB, yx1Var);
                }
            }
            long j = xz1Var.F;
            yx1Var.c((4294967295L & ((long) Float.floatToRawIntBits((int) (j & 4294967295L)))) | (Float.floatToRawIntBits((int) (j >> 32)) << 32));
        }
        int i2 = (int) yx1Var.a;
        int i3 = (int) yx1Var.b;
        int i4 = (int) yx1Var.c;
        int i5 = (int) yx1Var.d;
        int i6 = hb1Var.f;
        boolean z3 = hb1Var.k;
        hb1Var.k = true;
        q01 q01Var = this.b;
        if (z3) {
            int i7 = i6 & 33554431;
            long[] jArr = (long[]) q01Var.c;
            int i8 = q01Var.b;
            int i9 = 0;
            while (true) {
                if (i9 >= jArr.length - 2 || i9 >= i8) {
                    z = z2;
                    hb1VarU = hb1Var.u();
                    if (hb1VarU != null) {
                        i = hb1VarU.f;
                    } else {
                        i = -1;
                    }
                    q01Var.g(i6, i2, i3, i4, i5, (512 & 32) != 0 ? -1 : i, tz1Var.c(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY), tz1Var.c(16), this.c.a.a(i6), -1);
                } else {
                    int i10 = i9 + 2;
                    long j2 = jArr[i10];
                    z = z2;
                    if ((((int) j2) & 33554431) == i7) {
                        jArr[i9] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
                        jArr[i9 + 1] = (((long) i4) << 32) | (((long) i5) & 4294967295L);
                        jArr[i10] = (((j2 >> 63) & 1) << 60) | j2;
                    } else {
                        i9 += 3;
                        z2 = z;
                    }
                }
            }
        } else {
            z = z2;
            hb1VarU = hb1Var.u();
            if (hb1VarU != null) {
                i = hb1VarU.f;
            } else {
                i = -1;
            }
            q01Var.g(i6, i2, i3, i4, i5, (512 & 32) != 0 ? -1 : i, tz1Var.c(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY), tz1Var.c(16), this.c.a.a(i6), -1);
        }
        hb1Var.j = false;
        this.e = z;
        gy1 gy1VarY = hb1Var.y();
        Object[] objArr = gy1VarY.e;
        int i11 = gy1VarY.g;
        for (int i12 = 0; i12 < i11; i12++) {
            hb1 hb1Var3 = (hb1) objArr[i12];
            if (hb1Var3.H()) {
                d(hb1Var3);
            }
        }
    }

    public final void f(hb1 hb1Var) {
        long j;
        boolean zH = hb1Var.H();
        tz1 tz1Var = hb1Var.K;
        if (zH && hb1Var.j) {
            hb1 hb1VarU = hb1Var.u();
            if (hb1VarU == null || hb1VarU.g) {
                j = hb1VarU == null ? 0L : 9223372034707292159L;
            } else {
                if (hb1VarU.i) {
                    hb1VarU.i = false;
                    hb1VarU.h = e(hb1VarU);
                }
                j = hb1VarU.h;
            }
            xz1 xz1Var = tz1Var.d;
            if (h41.a(j, 9223372034707292159L) || c(xz1Var)) {
                d(hb1Var);
            } else if (hb1Var.g) {
                d(hb1Var);
                h(hb1Var);
            } else {
                long jC = h41.c(j, xz1Var.F);
                dr1 dr1Var = hb1Var.L.p;
                int iE0 = dr1Var.E0();
                int iD0 = dr1Var.D0();
                int i = hb1Var.f;
                boolean z = hb1Var.k;
                q01 q01Var = this.b;
                long j2 = 4294967295L;
                if (!z) {
                    hb1Var.k = true;
                    boolean zC = tz1Var.c(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                    boolean zC2 = tz1Var.c(16);
                    boolean zA = this.c.a.a(i);
                    if (hb1VarU != null) {
                        int i2 = hb1VarU.f;
                        int i3 = (int) (jC >> 32);
                        int i4 = (int) (jC & 4294967295L);
                        int i5 = i & 33554431;
                        long[] jArr = (long[]) q01Var.c;
                        for (int i6 = q01Var.b - 3; i6 >= 0; i6 -= 3) {
                            if ((((int) jArr[i6 + 2]) & 33554431) == i2) {
                                long j3 = jArr[i6];
                                int i7 = ((int) (j3 >> 32)) + i3;
                                int i8 = ((int) j3) + i4;
                                q01Var.g(i5, i7, i8, i7 + iE0, i8 + iD0, i2, zC, zC2, zA, i6);
                                break;
                            }
                        }
                    } else {
                        int i9 = (int) (jC >> 32);
                        int i10 = (int) (jC & 4294967295L);
                        q01Var.g(i, i9, i10, i9 + iE0, i10 + iD0, (512 & 32) != 0 ? -1 : 0, zC, zC2, zA, -1);
                    }
                } else if (hb1VarU != null) {
                    int i11 = hb1VarU.f;
                    int i12 = (int) (jC >> 32);
                    int i13 = (int) (jC & 4294967295L);
                    int i14 = i & 33554431;
                    long[] jArr2 = (long[]) q01Var.c;
                    int i15 = q01Var.b;
                    int i16 = 0;
                    loop0: while (i16 < jArr2.length - 2 && i16 < i15) {
                        long j4 = j2;
                        if ((((int) jArr2[i16 + 2]) & 33554431) == i11) {
                            long j5 = jArr2[i16];
                            int i17 = ((int) (j5 >> 32)) + i12;
                            int i18 = ((int) j5) + i13;
                            int i19 = i17 + iE0;
                            int i20 = i18 + iD0;
                            i16 += 3;
                            while (i16 < jArr2.length - 2 && i16 < i15) {
                                int i21 = i16 + 2;
                                int i22 = i11;
                                int i23 = i12;
                                long j6 = jArr2[i21];
                                int i24 = i13;
                                if ((((int) j6) & 33554431) == i14) {
                                    long j7 = jArr2[i16];
                                    long[] jArr3 = jArr2;
                                    int i25 = i17 - ((int) (j7 >> 32));
                                    int i26 = i18 - ((int) j7);
                                    jArr3[i16] = (((long) i18) & j4) | (((long) i17) << 32);
                                    jArr3[i16 + 1] = (((long) i19) << 32) | (((long) i20) & j4);
                                    jArr3[i21] = j6 | (((j6 >> 63) & 1) << 60);
                                    if (i25 != 0 || i26 != 0) {
                                        int i27 = qe2.b;
                                        q01Var.k(i25, i26, (j6 & (-1125899873288193L)) | (((long) ((i16 + 3) & 33554431)) << 25));
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                i16 += 3;
                                i11 = i22;
                                i12 = i23;
                                i13 = i24;
                            }
                        }
                        i16 += 3;
                        jArr2 = jArr2;
                        j2 = j4;
                        i11 = i11;
                        i12 = i12;
                        i13 = i13;
                    }
                } else {
                    int i28 = (int) (jC >> 32);
                    int i29 = (int) (jC & 4294967295L);
                    int i30 = iE0 + i28;
                    int i31 = i29 + iD0;
                    int i32 = i & 33554431;
                    long[] jArr4 = (long[]) q01Var.c;
                    int i33 = q01Var.b;
                    for (int i34 = 0; i34 < jArr4.length - 2 && i34 < i33; i34 += 3) {
                        int i35 = i34 + 2;
                        long j8 = jArr4[i35];
                        if ((((int) j8) & 33554431) == i32) {
                            long j9 = jArr4[i34];
                            int i36 = i34;
                            jArr4[i36] = (((long) i28) << 32) | (((long) i29) & 4294967295L);
                            jArr4[i36 + 1] = (((long) i30) << 32) | (((long) i31) & 4294967295L);
                            jArr4[i35] = (((j8 >> 63) & 1) << 60) | j8;
                            int i37 = i28 - ((int) (j9 >> 32));
                            int i38 = i29 - ((int) j9);
                            if (!(i37 != 0) && !(i38 != 0)) {
                                break;
                            }
                            int i39 = qe2.b;
                            q01Var.k(i37, i38, (j8 & (-1125899873288193L)) | (((long) ((i36 + 3) & 33554431)) << 25));
                            break;
                        }
                    }
                }
            }
            hb1Var.j = false;
            this.e = true;
            i();
        }
    }

    public final void g(hb1 hb1Var) {
        if (hb1Var.k) {
            int i = hb1Var.f & 33554431;
            q01 q01Var = this.b;
            long[] jArr = (long[]) q01Var.c;
            int i2 = q01Var.b;
            for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
                int i4 = i3 + 2;
                if ((((int) jArr[i4]) & 33554431) == i) {
                    jArr[i3] = -1;
                    jArr[i3 + 1] = -1;
                    jArr[i4] = qe2.a;
                    break;
                }
            }
            hb1Var.k = false;
            hb1Var.j = true;
            this.e = true;
            this.g = true;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void i() {
        ma maVar = this.h;
        boolean z = maVar != null;
        long j = this.c.c;
        if (j >= 0 || !z) {
            if (this.i == j && z) {
                return;
            }
            db dbVar = this.a;
            if (maVar != null) {
                dbVar.removeCallbacks(maVar);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j, 16 + jCurrentTimeMillis);
            this.i = jMax;
            ma maVar2 = new ma(0, this.j);
            dbVar.postDelayed(maVar2, jMax - jCurrentTimeMillis);
            this.h = maVar2;
        }
    }
}
