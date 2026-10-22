package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class px0 {
    public long a;
    public Object b;

    public px0(x32 x32Var, int i) {
        this(0L, (i & 1) != 0 ? null : x32Var);
    }

    public long a(float f, long j, boolean z) {
        long jE;
        long j2 = this.a;
        if (z) {
            jE = c12.e(j2, j);
            this.a = jE;
        } else {
            jE = c12.e(j2, j);
        }
        if ((((x32) this.b) == null ? c12.c(jE) : Math.abs(b(jE))) < f) {
            return 9205357640488583168L;
        }
        x32 x32Var = (x32) this.b;
        long j3 = this.a;
        if (x32Var == null) {
            float fC = c12.c(j3);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) / fC;
            return c12.d(this.a, c12.f(f, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L)) / fC)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32)));
        }
        float fB = b(j3) - (Math.signum(b(this.a)) * f);
        long j4 = this.a;
        x32 x32Var2 = (x32) this.b;
        x32 x32Var3 = x32.f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (x32Var2 == x32Var3 ? j4 & 4294967295L : j4 >> 32));
        if (((x32) this.b) != x32Var3) {
            return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fB)) << 32);
    }

    public float b(long j) {
        return Float.intBitsToFloat((int) (((x32) this.b) == x32.f ? j >> 32 : j & 4294967295L));
    }

    public ox0 c() {
        ArrayList arrayList = new ArrayList(20);
        while (true) {
            String strG = ((du) this.b).G(this.a);
            this.a -= (long) strG.length();
            if (strG.length() == 0) {
                return new ox0((String[]) arrayList.toArray(new String[0]));
            }
            int iH0 = l13.h0(strG, ':', 1, 4);
            if (iH0 != -1) {
                String strSubstring = strG.substring(0, iH0);
                String strSubstring2 = strG.substring(iH0 + 1);
                arrayList.add(strSubstring);
                arrayList.add(l13.D0(strSubstring2).toString());
            } else if (strG.charAt(0) == ':') {
                String strSubstring3 = strG.substring(1);
                arrayList.add("");
                arrayList.add(l13.D0(strSubstring3).toString());
            } else {
                arrayList.add("");
                arrayList.add(l13.D0(strG).toString());
            }
        }
    }

    public px0(long j, x32 x32Var) {
        this.b = x32Var;
        this.a = j;
    }
}
