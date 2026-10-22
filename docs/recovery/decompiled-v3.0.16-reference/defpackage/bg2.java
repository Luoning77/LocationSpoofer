package defpackage;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bg2 {
    public static ag2 a(kr1 kr1Var, byte[] bArr, int i, int i2) {
        bArr.getClass();
        long length = bArr.length;
        long j = i;
        long j2 = i2;
        byte[] bArr2 = bh3.a;
        if ((j | j2) < 0 || j > length || length - j < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return new ag2(kr1Var, bArr, i2, i);
    }

    public static ag2 b(String str, kr1 kr1Var) {
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
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        return a(kr1Var, bytes, 0, bytes.length);
    }

    public static /* synthetic */ ag2 c(bg2 bg2Var, byte[] bArr, kr1 kr1Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            kr1Var = null;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int length = bArr.length;
        bg2Var.getClass();
        return a(kr1Var, bArr, i, length);
    }
}
