package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hz {
    public static final long b = xp1.d(4278190080L);
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final /* synthetic */ int h = 0;
    public final long a;

    static {
        xp1.d(4282664004L);
        xp1.d(4287137928L);
        xp1.d(4291611852L);
        c = xp1.d(4294967295L);
        d = xp1.d(4294901760L);
        xp1.d(4278255360L);
        e = xp1.d(4278190335L);
        xp1.d(4294967040L);
        xp1.d(4278255615L);
        xp1.d(4294902015L);
        f = xp1.c(0);
        g = xp1.b(0.0f, 0.0f, 0.0f, 0.0f, qz.u);
    }

    public /* synthetic */ hz(long j) {
        this.a = j;
    }

    public static final /* synthetic */ hz a(long j) {
        return new hz(j);
    }

    public static final long b(long j, oz ozVar) {
        d50 d50VarO;
        oz ozVarF = f(j);
        int i = ozVarF.c;
        int i2 = ozVar.c;
        if ((i | i2) < 0) {
            d50VarO = k22.o(ozVarF, ozVar);
        } else {
            gx1 gx1Var = e50.a;
            int i3 = i | (i2 << 6);
            Object objB = gx1Var.b(i3);
            if (objB == null) {
                objB = k22.o(ozVarF, ozVar);
                gx1Var.h(i3, objB);
            }
            d50VarO = (d50) objB;
        }
        return d50VarO.a(j);
    }

    public static long c(float f2, long j) {
        return xp1.b(h(j), g(j), e(j), f2, f(j));
    }

    public static final float d(long j) {
        float fH;
        float f2;
        if ((63 & j) == 0) {
            fH = (float) x63.h((j >>> 56) & 255);
            f2 = 255.0f;
        } else {
            fH = (float) x63.h((j >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return fH / f2;
    }

    public static final float e(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) x63.h((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - vn0.a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final oz f(long j) {
        float[] fArr = qz.a;
        return qz.y[(int) (j & 63)];
    }

    public static final float g(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) x63.h((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - vn0.a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final float h(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) x63.h((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - vn0.a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static String i(long j) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(h(j));
        sb.append(", ");
        sb.append(g(j));
        sb.append(", ");
        sb.append(e(j));
        sb.append(", ");
        sb.append(d(j));
        sb.append(", ");
        return p91.q(sb, f(j).a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hz) {
            return this.a == ((hz) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return i(this.a);
    }
}
