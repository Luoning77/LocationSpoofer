package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class rx2 implements Iterable, p81 {
    public static final rx2 i = new rx2(0, 0, 0, null);
    public final long e;
    public final long f;
    public final long g;
    public final long[] h;

    public rx2(long j, long j2, long j3, long[] jArr) {
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = jArr;
    }

    public final rx2 a(rx2 rx2Var) {
        long[] jArr;
        rx2 rx2VarB = this;
        rx2 rx2Var2 = i;
        if (rx2Var == rx2Var2) {
            return rx2VarB;
        }
        if (rx2VarB == rx2Var2) {
            return rx2Var2;
        }
        long j = rx2Var.g;
        long j2 = rx2Var.g;
        long[] jArr2 = rx2Var.h;
        long j3 = rx2Var.f;
        long j4 = rx2Var.e;
        long j5 = rx2VarB.g;
        if (j == j5 && jArr2 == (jArr = rx2VarB.h)) {
            return new rx2(rx2VarB.e & (~j4), rx2VarB.f & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                rx2VarB = rx2VarB.b(j6);
            }
        }
        if (j3 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j3) != 0) {
                    rx2VarB = rx2VarB.b(((long) i2) + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j4) != 0) {
                    rx2VarB = rx2VarB.b(((long) i3) + j2 + 64);
                }
            }
        }
        return rx2VarB;
    }

    public final rx2 b(long j) {
        long[] jArr;
        int iH;
        long[] jArr2;
        long j2 = j - this.g;
        if (o51.n(j2, 0L) >= 0 && o51.n(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.f;
            if ((j4 & j3) != 0) {
                return new rx2(this.e, j4 & (~j3), this.g, this.h);
            }
        } else if (o51.n(j2, 64L) >= 0 && o51.n(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.e;
            if ((j6 & j5) != 0) {
                return new rx2(j6 & (~j5), this.f, this.g, this.h);
            }
        } else if (o51.n(j2, 0L) < 0 && (jArr = this.h) != null && (iH = vd0.h(jArr, j)) >= 0) {
            int length = jArr.length;
            int i2 = length - 1;
            if (i2 == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i2];
                if (iH > 0) {
                    yo.m0(jArr, jArr3, 0, 0, iH);
                }
                if (iH < i2) {
                    yo.m0(jArr, jArr3, iH, iH + 1, length);
                }
                jArr2 = jArr3;
            }
            return new rx2(this.e, this.f, this.g, jArr2);
        }
        return this;
    }

    public final boolean c(long j) {
        long[] jArr;
        long j2 = j - this.g;
        if (o51.n(j2, 0L) >= 0 && o51.n(j2, 64L) < 0) {
            return ((1 << ((int) j2)) & this.f) != 0;
        }
        if (o51.n(j2, 64L) < 0 || o51.n(j2, 128L) >= 0) {
            return o51.n(j2, 0L) <= 0 && (jArr = this.h) != null && vd0.h(jArr, j) >= 0;
        }
        return ((1 << (((int) j2) + (-64))) & this.e) != 0;
    }

    public final rx2 d(rx2 rx2Var) {
        rx2 rx2VarE;
        long[] jArr;
        rx2 rx2VarE2 = this;
        rx2 rx2Var2 = i;
        if (rx2Var == rx2Var2) {
            return rx2VarE2;
        }
        if (rx2VarE2 == rx2Var2) {
            return rx2Var;
        }
        long j = rx2Var.g;
        long j2 = rx2Var.g;
        long[] jArr2 = rx2Var.h;
        long j3 = rx2Var.f;
        long j4 = rx2Var.e;
        long j5 = rx2VarE2.g;
        long j6 = rx2VarE2.f;
        long j7 = rx2VarE2.e;
        if (j == j5 && jArr2 == (jArr = rx2VarE2.h)) {
            return new rx2(j7 | j4, j6 | j3, j5, jArr);
        }
        int i2 = 0;
        long[] jArr3 = rx2VarE2.h;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    rx2VarE2 = rx2VarE2.e(j8);
                }
            }
            if (j3 != 0) {
                for (int i3 = 0; i3 < 64; i3++) {
                    if (((1 << i3) & j3) != 0) {
                        rx2VarE2 = rx2VarE2.e(((long) i3) + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i2 < 64) {
                    if (((1 << i2) & j4) != 0) {
                        rx2VarE2 = rx2VarE2.e(((long) i2) + j2 + 64);
                    }
                    i2++;
                }
            }
            return rx2VarE2;
        }
        if (jArr3 != null) {
            rx2VarE = rx2Var;
            for (long j9 : jArr3) {
                rx2VarE = rx2VarE.e(j9);
            }
        } else {
            rx2VarE = rx2Var;
        }
        long j10 = rx2VarE2.g;
        if (j6 != 0) {
            for (int i4 = 0; i4 < 64; i4++) {
                if (((1 << i4) & j6) != 0) {
                    rx2VarE = rx2VarE.e(((long) i4) + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i2 < 64) {
                if (((1 << i2) & j7) != 0) {
                    rx2VarE = rx2VarE.e(((long) i2) + j10 + 64);
                }
                i2++;
            }
        }
        return rx2VarE;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00fa  */
    public final rx2 e(long j) {
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i2;
        long j4 = this.g;
        long j5 = j - j4;
        long j6 = 0;
        int iN = o51.n(j5, 0L);
        long j7 = this.f;
        if (iN < 0 || o51.n(j5, 64L) >= 0) {
            int iN2 = o51.n(j5, 64L);
            long j8 = this.e;
            int i3 = 64;
            if (iN2 < 0 || o51.n(j5, 128L) >= 0) {
                int iN3 = o51.n(j5, 128L);
                long[] jArr3 = this.h;
                if (iN3 < 0) {
                    if (jArr3 == null) {
                        return new rx2(this.e, this.f, this.g, new long[]{j});
                    }
                    int iH = vd0.h(jArr3, j);
                    if (iH < 0) {
                        int i4 = -(iH + 1);
                        int length = jArr3.length;
                        long[] jArr4 = new long[length + 1];
                        yo.m0(jArr3, jArr4, 0, 0, i4);
                        yo.m0(jArr3, jArr4, i4 + 1, i4, length);
                        jArr4[i4] = j;
                        return new rx2(this.e, this.f, this.g, jArr4);
                    }
                } else if (!c(j)) {
                    long j9 = ((j + 1) / 64) * 64;
                    if (o51.n(j9, 0L) < 0) {
                        j9 = 9223372036854775680L;
                    }
                    long j10 = j8;
                    us1 us1Var = null;
                    while (true) {
                        if (o51.n(j4, j9) >= 0) {
                            j2 = j4;
                            j3 = j7;
                            break;
                        }
                        if (j7 != j6) {
                            if (us1Var == null) {
                                us1Var = new us1(jArr3);
                            }
                            int i5 = 0;
                            i2 = i3;
                            while (i5 < i2) {
                                if ((j7 & (1 << i5)) != j6) {
                                    ((kx1) us1Var.f).a(((long) i5) + j4);
                                }
                                i5++;
                                j6 = j6;
                            }
                        } else {
                            i2 = i3;
                        }
                        long j11 = j6;
                        if (j10 == j11) {
                            j2 = j9;
                            j3 = j11;
                            break;
                        }
                        j4 += 64;
                        j6 = j11;
                        j7 = j10;
                        i3 = i2;
                        j10 = j6;
                    }
                    if (us1Var == null) {
                        jArr = jArr3;
                    } else {
                        kx1 kx1Var = (kx1) us1Var.f;
                        int i6 = kx1Var.b;
                        if (i6 == 0) {
                            jArr2 = null;
                        } else {
                            long[] jArr5 = new long[i6];
                            long[] jArr6 = kx1Var.a;
                            for (int i7 = 0; i7 < i6; i7++) {
                                jArr5[i7] = jArr6[i7];
                            }
                            jArr2 = jArr5;
                        }
                        if (jArr2 == null) {
                            jArr = jArr3;
                        } else {
                            jArr = jArr2;
                        }
                    }
                    return new rx2(j10, j3, j2, jArr).e(j);
                }
            } else {
                long j12 = 1 << (((int) j5) - 64);
                if ((j8 & j12) == 0) {
                    return new rx2(j8 | j12, this.f, this.g, this.h);
                }
            }
        } else {
            long j13 = 1 << ((int) j5);
            if ((j7 & j13) == 0) {
                return new rx2(this.e, j7 | j13, this.g, this.h);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return dh0.v(new qx2(this, null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(az.Y(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = arrayList.get(i3);
            i2++;
            if (i2 > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
