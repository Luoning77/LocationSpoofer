package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ah0 implements Comparable {
    public static final c30 f = new c30(17);
    public static final long g = dh0.n(4611686018427387903L);
    public static final long h = dh0.n(-4611686018427387903L);
    public static final long i = 9223372036854759646L;
    public final long e;

    public static final long a(long j, long j2) {
        long j3 = j2 / 1000000;
        long jH = dh0.h(j, j3);
        if (-4611686018426L > jH || jH >= 4611686018427L) {
            return dh0.n(jH);
        }
        long j4 = ((jH * 1000000) + (j2 - (j3 * 1000000))) << 1;
        int i2 = ch0.a;
        return j4;
    }

    public static final void b(StringBuilder sb, int i2, int i3, int i4, String str, boolean z) {
        sb.append(i2);
        if (i3 != 0) {
            sb.append('.');
            String strO0 = l13.o0(i4, String.valueOf(i3));
            int i5 = -1;
            int length = strO0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i6 = length - 1;
                    if (strO0.charAt(length) != '0') {
                        i5 = length;
                        break;
                    } else if (i6 < 0) {
                        break;
                    } else {
                        length = i6;
                    }
                }
            }
            int i7 = i5 + 1;
            if (z || i7 >= 3) {
                sb.append((CharSequence) strO0, 0, ((i5 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strO0, 0, i7);
            }
        }
        sb.append(str);
    }

    public static int c(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return o51.n(j, j2);
        }
        int i2 = (((int) j) & 1) - (((int) j2) & 1);
        return j < 0 ? -i2 : i2;
    }

    public static final long d(long j) {
        return ((((int) j) & 1) != 1 || f(j)) ? h(j, fh0.MILLISECONDS) : j >> 1;
    }

    public static final int e(long j) {
        if (f(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
    }

    public static final boolean f(long j) {
        return j == g || j == h;
    }

    public static final long g(long j, long j2) {
        int i2 = ((int) j) & 1;
        if (i2 != (((int) j2) & 1)) {
            return i2 == 1 ? a(j >> 1, j2 >> 1) : a(j2 >> 1, j >> 1);
        }
        if (i2 == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            if (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) {
                return dh0.n(j3 / 1000000);
            }
            long j4 = j3 << 1;
            int i3 = ch0.a;
            return j4;
        }
        long jH = dh0.h(j >> 1, j2 >> 1);
        if (jH == 9223372036854759646L) {
            fo.i("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (jH == 4611686018427387903L || jH == -4611686018427387903L) {
            return dh0.n(jH);
        }
        if (-4611686018426L > jH || jH >= 4611686018427L) {
            return dh0.n(mh0.w(jH, -4611686018427387903L, 4611686018427387903L));
        }
        long j5 = (jH * 1000000) << 1;
        int i4 = ch0.a;
        return j5;
    }

    public static final long h(long j, fh0 fh0Var) {
        if (j == g) {
            return Long.MAX_VALUE;
        }
        if (j == h) {
            return Long.MIN_VALUE;
        }
        return fh0Var.e.convert(j >> 1, ((((int) j) & 1) == 0 ? fh0.NANOSECONDS : fh0.MILLISECONDS).e);
    }

    public static String i(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == g) {
            return "Infinity";
        }
        if (j == h) {
            return "-Infinity";
        }
        int i2 = 0;
        boolean z = j < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (j < 0) {
            j = j(j);
        }
        long jH = h(j, fh0.DAYS);
        int iH = f(j) ? 0 : (int) (h(j, fh0.HOURS) % 24);
        int iH2 = f(j) ? 0 : (int) (h(j, fh0.MINUTES) % 60);
        int iH3 = f(j) ? 0 : (int) (h(j, fh0.SECONDS) % 60);
        int iE = e(j);
        boolean z2 = jH != 0;
        boolean z3 = iH != 0;
        boolean z4 = iH2 != 0;
        boolean z5 = (iH3 == 0 && iE == 0) ? false : true;
        if (z2) {
            sb.append(jH);
            sb.append('d');
            i2 = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i3 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(iH);
            sb.append('h');
            i2 = i3;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i4 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(iH2);
            sb.append('m');
            i2 = i4;
        }
        if (z5) {
            int i5 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            if (iH3 != 0 || z2 || z3 || z4) {
                b(sb, iH3, iE, 9, "s", false);
            } else if (iE >= 1000000) {
                b(sb, iE / 1000000, iE % 1000000, 6, "ms", false);
            } else if (iE >= 1000) {
                b(sb, iE / 1000, iE % 1000, 3, "us", false);
            } else {
                sb.append(iE);
                sb.append("ns");
            }
            i2 = i5;
        }
        if (z && i2 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long j(long j) {
        long j2 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
        int i2 = ch0.a;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.e, ((ah0) obj).e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ah0) {
            return this.e == ((ah0) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e);
    }

    public final String toString() {
        return i(this.e);
    }
}
