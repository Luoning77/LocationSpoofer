package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class tg2 implements Closeable {
    public static final sg2 Companion = new sg2();
    private Reader reader;

    @cc0
    public static final tg2 create(kr1 kr1Var, uu uuVar) {
        Companion.getClass();
        uuVar.getClass();
        xt xtVar = new xt();
        xtVar.g0(uuVar);
        return new ce2(kr1Var, uuVar.a(), xtVar, 1);
    }

    public final InputStream byteStream() {
        return source().b0();
    }

    public final uu byteString() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            fo.r(p91.o("Cannot buffer entire body for content length: ", jContentLength));
            return null;
        }
        du duVarSource = source();
        try {
            uu uuVarN = duVarSource.n();
            duVarSource.close();
            int iA = uuVarN.a();
            if (jContentLength == -1 || jContentLength == iA) {
                return uuVarN;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iA + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ji2.z(duVarSource, th);
                throw th2;
            }
        }
    }

    public final byte[] bytes() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            fo.r(p91.o("Cannot buffer entire body for content length: ", jContentLength));
            return null;
        }
        du duVarSource = source();
        try {
            byte[] bArrV = duVarSource.v();
            duVarSource.close();
            int length = bArrV.length;
            if (jContentLength == -1 || jContentLength == length) {
                return bArrV;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ji2.z(duVarSource, th);
                throw th2;
            }
        }
    }

    public final Reader charStream() {
        Charset charsetA;
        Reader rg2Var = this.reader;
        if (rg2Var == null) {
            du duVarSource = source();
            kr1 kr1VarContentType = contentType();
            if (kr1VarContentType == null || (charsetA = kr1VarContentType.a(sw.a)) == null) {
                charsetA = sw.a;
            }
            rg2Var = new rg2(duVarSource, charsetA);
            this.reader = rg2Var;
        }
        return rg2Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        bh3.c(source());
    }

    public abstract long contentLength();

    public abstract kr1 contentType();

    public abstract du source();

    public final String string() throws IOException {
        Charset charsetA;
        du duVarSource = source();
        try {
            kr1 kr1VarContentType = contentType();
            if (kr1VarContentType == null || (charsetA = kr1VarContentType.a(sw.a)) == null) {
                charsetA = sw.a;
            }
            String strZ = duVarSource.Z(bh3.q(duVarSource, charsetA));
            duVarSource.close();
            return strZ;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ji2.z(duVarSource, th);
                throw th2;
            }
        }
    }

    @cc0
    public static final tg2 create(kr1 kr1Var, long j, du duVar) {
        Companion.getClass();
        duVar.getClass();
        return new ce2(kr1Var, j, duVar, 1);
    }

    @cc0
    public static final tg2 create(kr1 kr1Var, String str) {
        Companion.getClass();
        str.getClass();
        return sg2.a(str, kr1Var);
    }

    @cc0
    public static final tg2 create(kr1 kr1Var, byte[] bArr) {
        Companion.getClass();
        bArr.getClass();
        return sg2.b(bArr, kr1Var);
    }

    public static final tg2 create(String str, kr1 kr1Var) {
        Companion.getClass();
        return sg2.a(str, kr1Var);
    }

    public static final tg2 create(byte[] bArr, kr1 kr1Var) {
        Companion.getClass();
        return sg2.b(bArr, kr1Var);
    }

    public static final tg2 create(uu uuVar, kr1 kr1Var) {
        Companion.getClass();
        uuVar.getClass();
        xt xtVar = new xt();
        xtVar.g0(uuVar);
        return new ce2(kr1Var, uuVar.a(), xtVar, 1);
    }

    public static final tg2 create(du duVar, kr1 kr1Var, long j) {
        Companion.getClass();
        duVar.getClass();
        return new ce2(kr1Var, j, duVar, 1);
    }
}
