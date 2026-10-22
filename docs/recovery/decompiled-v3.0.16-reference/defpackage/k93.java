package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class k93 {
    public static final float a = 64.0f;
    public static x01 b;

    public k93() {
        new ConcurrentHashMap();
    }

    public static final void a(us1 us1Var, x92 x92Var, long j) {
        gb0 gb0Var = (gb0) us1Var.f;
        ai3 ai3Var = gb0Var.b;
        ai3 ai3Var2 = gb0Var.a;
        boolean zP = mh0.p(x92Var);
        long j2 = x92Var.b;
        if (zP) {
            o90[] o90VarArr = ai3Var2.d;
            yo.s0(0, o90VarArr.length, null, o90VarArr);
            ai3Var2.e = 0;
            o90[] o90VarArr2 = ai3Var.d;
            yo.s0(0, o90VarArr2.length, null, o90VarArr2);
            ai3Var.e = 0;
            gb0Var.c = 0L;
        }
        if (!mh0.r(x92Var)) {
            List list = x92Var.m;
            if (list == null) {
                list = uj0.e;
            }
            int i = 0;
            for (int size = list.size(); i < size; size = size) {
                vx0 vx0Var = (vx0) list.get(i);
                gb0Var.a(vx0Var.a, c12.e(vx0Var.e, j));
                i++;
            }
            gb0Var.a(j2, c12.e(x92Var.n, j));
        }
        if (mh0.r(x92Var) && j2 - gb0Var.c > 40) {
            o90[] o90VarArr3 = ai3Var2.d;
            yo.s0(0, o90VarArr3.length, null, o90VarArr3);
            ai3Var2.e = 0;
            o90[] o90VarArr4 = ai3Var.d;
            yo.s0(0, o90VarArr4.length, null, o90VarArr4);
            ai3Var.e = 0;
            gb0Var.c = 0L;
        }
        gb0Var.c = j2;
    }

    public static final float f(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static lb3 g(kz kzVar) {
        lb3 lb3Var = kzVar.b0;
        if (lb3Var != null) {
            return lb3Var;
        }
        lb3 lb3Var2 = new lb3(mz.c(kzVar, sb.b), mz.c(kzVar, sb.d), mz.c(kzVar, sb.c), mz.c(kzVar, sb.f), mz.c(kzVar, sb.g), mz.c(kzVar, sb.e));
        kzVar.b0 = lb3Var2;
        return lb3Var2;
    }

    public static final long h(x83 x83Var, int i, boolean z, boolean z2) {
        sw1 sw1Var = x83Var.b;
        long j = x83Var.c;
        int iD = sw1Var.d(i);
        if (iD >= sw1Var.f) {
            return 9205357640488583168L;
        }
        boolean z3 = x83Var.a(((!z || z2) && (z || !z2)) ? Math.max(i + (-1), 0) : i) == x83Var.h(i);
        sw1Var.k(i);
        int length = ((dj) sw1Var.a.a).f.length();
        ArrayList arrayList = sw1Var.h;
        l52 l52Var = (l52) arrayList.get(i == length ? arrayList.size() - 1 : hd0.t(arrayList, i));
        le leVar = l52Var.a;
        int iD2 = l52Var.d(i);
        t83 t83Var = leVar.d;
        return (((long) Float.floatToRawIntBits(mh0.u(z3 ? t83Var.i(iD2, false) : t83Var.j(iD2, false), 0.0f, (int) (j >> 32)))) << 32) | (((long) Float.floatToRawIntBits(mh0.u(sw1Var.b(iD), 0.0f, (int) (j & 4294967295L)))) & 4294967295L);
    }

    public static final x01 i() {
        x01 x01Var = b;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.Wifi", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0VarI = p91.i(2.06f, 10.06f);
        nx0VarI.g(0.51f, 0.51f, 1.32f, 0.56f, 1.87f, 0.1f);
        nx0VarI.g(4.67f, -3.84f, 11.45f, -3.84f, 16.13f, -0.01f);
        nx0VarI.g(0.56f, 0.46f, 1.38f, 0.42f, 1.89f, -0.09f);
        nx0VarI.g(0.59f, -0.59f, 0.55f, -1.57f, -0.1f, -2.1f);
        nx0VarI.g(-5.71f, -4.67f, -13.97f, -4.67f, -19.69f, 0.0f);
        nx0VarI.g(-0.65f, 0.52f, -0.7f, 1.5f, -0.1f, 2.1f);
        nx0VarI.e();
        nx0VarI.m(9.82f, 17.82f);
        nx0VarI.l(1.47f, 1.47f);
        nx0VarI.g(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        nx0VarI.l(1.47f, -1.47f);
        nx0VarI.g(0.47f, -0.47f, 0.37f, -1.28f, -0.23f, -1.59f);
        nx0VarI.g(-1.22f, -0.63f, -2.68f, -0.63f, -3.91f, 0.0f);
        nx0VarI.g(-0.57f, 0.31f, -0.68f, 1.12f, -0.21f, 1.59f);
        nx0VarI.e();
        nx0VarI.m(6.09f, 14.09f);
        nx0VarI.g(0.49f, 0.49f, 1.26f, 0.54f, 1.83f, 0.13f);
        nx0VarI.g(2.44f, -1.73f, 5.72f, -1.73f, 8.16f, 0.0f);
        nx0VarI.g(0.57f, 0.4f, 1.34f, 0.36f, 1.83f, -0.13f);
        nx0VarI.l(0.01f, -0.01f);
        nx0VarI.g(0.6f, -0.6f, 0.56f, -1.62f, -0.13f, -2.11f);
        nx0VarI.g(-3.44f, -2.49f, -8.13f, -2.49f, -11.58f, 0.0f);
        nx0VarI.g(-0.69f, 0.5f, -0.73f, 1.51f, -0.12f, 2.12f);
        nx0VarI.e();
        w01.a(w01Var, nx0VarI.a, qy2Var);
        x01 x01VarB = w01Var.b();
        b = x01VarB;
        return x01VarB;
    }

    public static final void j(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            p21.a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float f = f(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * f);
                }
            }
            float fSqrt = (float) Math.sqrt(f(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f2 = 1.0f / fSqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f2;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? 0.0f : f(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float f3 = f(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    f3 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = f3 / fArr11[i14];
        }
    }

    public static lb3 k(long j, ov0 ov0Var) {
        long j2 = hz.g;
        lb3 lb3VarG = g((kz) ov0Var.j(mz.a));
        long j3 = j != 16 ? j : lb3VarG.a;
        long j4 = j2 != 16 ? j2 : lb3VarG.b;
        long j5 = j2 != 16 ? j2 : lb3VarG.c;
        long j6 = j2 != 16 ? j2 : lb3VarG.d;
        long j7 = j2 != 16 ? j2 : lb3VarG.e;
        if (j2 == 16) {
            j2 = lb3VarG.f;
        }
        return new lb3(j3, j4, j5, j6, j7, j2);
    }

    public abstract Typeface b(Context context, br0 br0Var, Resources resources, int i);

    public abstract Typeface c(Context context, lr0[] lr0VarArr, int i);

    public Typeface d(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public abstract Typeface e(Context context, Resources resources, int i, String str);
}
