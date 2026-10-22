package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class v63 implements zi3 {
    public static x01 a;

    public static final Object a(na2 na2Var, String str, r60 r60Var) {
        Object objD = na2Var.d(str, new i73(9), r60Var);
        return objD == z70.e ? objD : mf3.a;
    }

    public static final long b(double d) {
        return e((float) d, 4294967296L);
    }

    public static final long c(int i) {
        return e(i, 4294967296L);
    }

    public static void d(f83 f83Var, gc0 gc0Var, x83 x83Var, pa1 pa1Var, p83 p83Var, boolean z, e12 e12Var) {
        pe2 pe2VarB;
        if (z) {
            int iR = e12Var.r(f93.e(f83Var.b));
            String str = w63.a;
            if (iR < x83Var.a.a.f.length()) {
                pe2VarB = x83Var.b(iR);
            } else {
                pe2VarB = iR != 0 ? x83Var.b(iR - 1) : new pe2(0.0f, 0.0f, 1.0f, (int) (new p41(w63.a((q93) gc0Var.c, (xb0) gc0Var.d, (lq0) gc0Var.e, w63.a, 1)).a & 4294967295L));
            }
            float f = pe2VarB.b;
            float f2 = pe2VarB.a;
            long jH0 = pa1Var.h0((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            pe2 pe2VarD = ce0.d((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jH0 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jH0 >> 32)))) << 32), (((long) Float.floatToRawIntBits(pe2VarB.c - f2)) << 32) | (((long) Float.floatToRawIntBits(pe2VarB.d - f)) & 4294967295L));
            if (o51.f((p83) p83Var.a.b.get(), p83Var)) {
                p83Var.b.g(pe2VarD);
            }
        }
    }

    public static final long e(float f, long j) {
        long jFloatToRawIntBits = j | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        x93[] x93VarArr = w93.b;
        return jFloatToRawIntBits;
    }

    public static void f(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            p1.e(window, z);
        } else {
            if (i >= 30) {
                p1.d(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }
}
