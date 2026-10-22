package defpackage;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class sg2 {
    public static ce2 a(String str, kr1 kr1Var) {
        str.getClass();
        Charset charset = sw.a;
        if (kr1Var != null) {
            Pattern pattern = kr1.e;
            Charset charsetA = kr1Var.a(null);
            if (charsetA == null) {
                try {
                    kr1Var = mc0.p(kr1Var + "; charset=utf-8");
                } catch (IllegalArgumentException unused) {
                    kr1Var = null;
                }
            } else {
                charset = charsetA;
            }
        }
        kr1 kr1Var2 = kr1Var;
        xt xtVar = new xt();
        charset.getClass();
        int length = str.length();
        str.getClass();
        if (length < 0) {
            fo.f(p91.n("endIndex < beginIndex: ", length, 0, " < "));
        } else if (length > str.length()) {
            fo.k(p91.r(length, "endIndex > string.length: ", " > "), str.length());
        } else if (charset.equals(sw.a)) {
            xtVar.l0(0, length, str);
        } else {
            byte[] bytes = str.substring(0, length).getBytes(charset);
            bytes.getClass();
            xtVar.m103write(bytes, 0, bytes.length);
        }
        return new ce2(kr1Var2, xtVar.f, xtVar, 1);
    }

    public static ce2 b(byte[] bArr, kr1 kr1Var) {
        bArr.getClass();
        xt xtVar = new xt();
        xtVar.m103write(bArr, 0, bArr.length);
        return new ce2(kr1Var, bArr.length, xtVar, 1);
    }
}
