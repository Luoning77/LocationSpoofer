package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudRequestTiming;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class fo implements tv, yl0, pd0, jh0 {
    public final /* synthetic */ int e;

    public /* synthetic */ fo(int i) {
        this.e = i;
    }

    public static /* synthetic */ void d() {
        throw new iv();
    }

    public static /* synthetic */ void e(int i, String str) {
        throw new IllegalArgumentException((str + i + '.').toString());
    }

    public static /* synthetic */ void f(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void g(Object obj, String str) {
        throw new l71(str + ((Object) obj.toString()));
    }

    public static /* synthetic */ void h(Object obj, String str, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void i(String str) {
        throw new IllegalArgumentException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + ((char) i));
    }

    public static /* synthetic */ void k(StringBuilder sb, int i) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void l(StringBuilder sb, Object obj, Throwable th) {
        sb.append(obj);
        throw new l71(sb.toString(), th);
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new IllegalStateException((str + obj + '\'').toString());
    }

    public static /* synthetic */ void n(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void o(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void p(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void q(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void r(String str) throws IOException {
        throw new IOException(str);
    }

    public static /* synthetic */ void s(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    @Override // defpackage.yl0
    public zl0 a(xd2 xd2Var) {
        return CloudRequestTiming.listenerFactory$lambda$4(xd2Var);
    }

    @Override // defpackage.jh0
    public float b(float f) {
        float f2;
        float f3;
        switch (this.e) {
            case 23:
                if (f < 0.36363637f) {
                    return 7.5625f * f * f;
                }
                if (f < 0.72727275f) {
                    float f4 = f - 0.54545456f;
                    f2 = 7.5625f * f4 * f4;
                    f3 = 0.75f;
                } else if (f < 0.90909094f) {
                    float f5 = f - 0.8181818f;
                    f2 = 7.5625f * f5 * f5;
                    f3 = 0.9375f;
                } else {
                    float f6 = f - 0.95454544f;
                    f2 = 7.5625f * f6 * f6;
                    f3 = 0.984375f;
                }
                return f2 + f3;
            default:
                return f;
        }
    }

    @Override // defpackage.pd0
    public double c(double d) {
        switch (this.e) {
            case mc0.b /* 9 */:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case mc0.c /* 10 */:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case 11:
                float[] fArr = qz.a;
                return qz.b(qz.c, d);
            case mc0.d /* 12 */:
                float[] fArr2 = qz.a;
                return qz.a(qz.c, d);
            case 13:
                float[] fArr3 = qz.a;
                return qz.d(qz.d, d);
            default:
                float[] fArr4 = qz.a;
                return qz.c(qz.d, d);
        }
    }

    @Override // defpackage.tv
    public void cancel() {
    }
}
