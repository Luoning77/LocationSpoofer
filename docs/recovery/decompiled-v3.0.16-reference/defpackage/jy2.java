package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class jy2 {
    public final lu0 a;
    public Object b;
    public ox1 c;
    public boolean j;
    public int k;
    public int d = -1;
    public final zx1 e = ce0.k();
    public final zx1 f = new zx1();
    public final ay1 g = new ay1();
    public final gy1 h = new gy1(new fc0[16]);
    public final nv0 i = new nv0(this, 1);
    public final zx1 l = ce0.k();
    public final HashMap m = new HashMap();

    public jy2(lu0 lu0Var) {
        this.a = lu0Var;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 16781. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final boolean a(java.util.Set r46) {
        /*
            Method dump skipped, instruction units count: 1678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jy2.a(java.util.Set):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008d A[LOOP:0: B:15:0x0048->B:28:0x008d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x0090 A[EDGE_INSN: B:37:0x0090->B:29:0x0090 BREAK  A[LOOP:0: B:15:0x0048->B:28:0x008d], SYNTHETIC] */
    public final void b(Object obj, int i, Object obj2, ox1 ox1Var) {
        int i2;
        if (this.k > 0) {
            return;
        }
        int iC = ox1Var.c(obj);
        if (iC < 0) {
            iC = ~iC;
            i2 = -1;
        } else {
            i2 = ox1Var.c[iC];
        }
        ox1Var.b[iC] = obj;
        ox1Var.c[iC] = i;
        if ((obj instanceof fc0) && i2 != i) {
            ec0 ec0VarH = ((fc0) obj).h();
            this.m.put(obj, ec0VarH.f);
            ox1 ox1Var2 = ec0VarH.e;
            zx1 zx1Var = this.l;
            ce0.T(zx1Var, obj);
            Object[] objArr = ox1Var2.b;
            long[] jArr = ox1Var2.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i3 != length) {
                            break;
                            break;
                        }
                        i3++;
                    } else {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((j & 255) < 128) {
                                x03 x03Var = (x03) objArr[(i3 << 3) + i5];
                                if (x03Var instanceof y03) {
                                    ((y03) x03Var).f(2);
                                }
                                ce0.f(zx1Var, x03Var, obj);
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        } else if (i3 != length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        if (i2 == -1) {
            if (obj instanceof y03) {
                ((y03) obj).f(2);
            }
            ce0.f(this.e, obj, obj2);
        }
    }

    public final void c(Object obj, Object obj2) {
        zx1 zx1Var = this.e;
        ce0.S(zx1Var, obj2, obj);
        if (!(obj2 instanceof fc0) || zx1Var.c(obj2)) {
            return;
        }
        ce0.T(this.l, obj2);
        this.m.remove(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x009f A[LOOP:2: B:16:0x0064->B:28:0x009f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ae A[EDGE_INSN: B:48:0x00ae->B:30:0x00ae BREAK  A[LOOP:2: B:16:0x0064->B:28:0x009f], SYNTHETIC] */
    public final void d() {
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        boolean z;
        zx1 zx1Var = this.f;
        long[] jArr3 = zx1Var.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j3 = jArr3[i2];
            char c2 = 7;
            long j4 = -9187201950435737472L;
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j3 & 255) < 128) {
                        int i6 = (i2 << 3) + i5;
                        c = c2;
                        Object obj = zx1Var.b[i6];
                        j2 = j4;
                        ox1 ox1Var = (ox1) zx1Var.c[i6];
                        obj.getClass();
                        boolean zS = ((u42) obj).S();
                        if (zS) {
                            jArr2 = jArr3;
                            j = j3;
                            z = zS;
                        } else {
                            Object[] objArr = ox1Var.b;
                            int[] iArr = ox1Var.c;
                            long[] jArr4 = ox1Var.a;
                            int i7 = i3;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j = j3;
                                int i8 = 0;
                                while (true) {
                                    long j5 = jArr4[i8];
                                    long[] jArr5 = jArr4;
                                    z = zS;
                                    if ((((~j5) << c) & j5 & j2) == j2) {
                                        if (i8 != length2) {
                                            break;
                                            break;
                                        }
                                        i8++;
                                        zS = z;
                                        jArr4 = jArr5;
                                        i7 = 8;
                                    } else {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            if ((j5 & 255) < 128) {
                                                int i11 = (i8 << 3) + i10;
                                                Object obj2 = objArr[i11];
                                                int i12 = iArr[i11];
                                                c(obj, obj2);
                                            }
                                            j5 >>= i7;
                                        }
                                        if (i9 != i7) {
                                            break;
                                        }
                                        if (i8 != length2) {
                                            break;
                                        }
                                        i8++;
                                        zS = z;
                                        jArr4 = jArr5;
                                        i7 = 8;
                                    }
                                }
                            } else {
                                jArr2 = jArr3;
                                j = j3;
                                z = zS;
                            }
                        }
                        if (!z) {
                            zx1Var.l(i6);
                        }
                        i = 8;
                    } else {
                        jArr2 = jArr3;
                        j = j3;
                        c = c2;
                        j2 = j4;
                        i = i3;
                    }
                    i5++;
                    i3 = i;
                    j3 = j >> i;
                    c2 = c;
                    j4 = j2;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i4 != i3) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i2 == length) {
                return;
            }
            i2++;
            jArr3 = jArr;
        }
    }
}
