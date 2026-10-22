package defpackage;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class kd2 extends ut2 {
    public final List c;
    public final long d;
    public final float e;

    public kd2(List list, long j, float f) {
        this.c = list;
        this.d = j;
        this.e = f;
    }

    @Override // defpackage.ut2
    public final Shader b(long j) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j2 = this.d;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            long jZ = gh0.z(j);
            fIntBitsToFloat = Float.intBitsToFloat((int) (jZ >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jZ & 4294967295L));
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            fIntBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
                i2 = (int) (j & 4294967295L);
            }
            fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        float fB = this.e;
        if (fB == Float.POSITIVE_INFINITY) {
            fB = cw2.b(j) / 2.0f;
        }
        float f = fB;
        List list = this.c;
        da0.H(list);
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
        int size = list.size();
        int[] iArr = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr[i3] = xp1.T(((hz) list.get(i3)).a);
        }
        return new RadialGradient(fIntBitsToFloat3, fIntBitsToFloat4, f, iArr, (float[]) null, sb.e0(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd2)) {
            return false;
        }
        kd2 kd2Var = (kd2) obj;
        return this.c.equals(kd2Var.c) && c12.b(this.d, kd2Var.d) && this.e == kd2Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + az2.c(this.e, p91.c(this.c.hashCode() * 961, 31, this.d), 31);
    }

    public final String toString() {
        String str;
        long j = this.d;
        String str2 = "";
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            str = "center=" + ((Object) c12.g(j)) + ", ";
        } else {
            str = "";
        }
        float f = this.e;
        if ((Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040) {
            str2 = "radius=" + f + ", ";
        }
        return "RadialGradient(colors=" + this.c + ", stops=null, " + str + str2 + "tileMode=" + ((Object) u83.h(0)) + ')';
    }
}
