package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class g83 {
    public static final void a(long j, byte[] bArr, int i, int i2, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = tx0.a[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 == i5) {
                return;
            } else {
                i4--;
            }
        }
    }

    public static final tm2 b(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(2131230948);
            tm2 tm2Var = tag instanceof tm2 ? (tm2) tag : null;
            if (tm2Var != null) {
                return tm2Var;
            }
            Object objF = q73.f(view);
            view = objF instanceof View ? (View) objF : null;
        }
        return null;
    }

    public static final dj c(f83 f83Var) {
        dj djVar = f83Var.a;
        long j = f83Var.b;
        djVar.getClass();
        return djVar.subSequence(f93.f(j), f93.e(j));
    }

    public static final dj d(f83 f83Var, int i) {
        dj djVar = f83Var.a;
        dj djVar2 = f83Var.a;
        long j = f83Var.b;
        int iE = f93.e(j);
        int iE2 = f93.e(j);
        int length = iE2 + i;
        if (((i ^ length) & (iE2 ^ length)) < 0) {
            length = djVar2.f.length();
        }
        return djVar.subSequence(iE, Math.min(length, djVar2.f.length()));
    }

    public static final dj e(f83 f83Var, int i) {
        dj djVar = f83Var.a;
        long j = f83Var.b;
        int iF = f93.f(j);
        int i2 = iF - i;
        if (((iF ^ i2) & (i ^ iF)) < 0) {
            i2 = 0;
        }
        return djVar.subSequence(Math.max(0, i2), f93.f(j));
    }

    public static fa3 f(String str, au0 au0Var) {
        fa3 fa3Var = new fa3(au0Var);
        fa3Var.setDaemon(true);
        fa3Var.setName(str);
        fa3Var.start();
        return fa3Var;
    }

    public static final i52 g(Object obj, Object obj2) {
        return new i52(obj, obj2);
    }

    public static final s31 h(j31 j31Var) {
        return new s31(j31Var.a, j31Var.b, j31Var.c, j31Var.d);
    }

    public static final void i(int i, String str, String str2) {
        throw new IllegalArgumentException("Expected " + str2 + " at index " + i + ", but was '" + str.charAt(i) + '\'');
    }
}
