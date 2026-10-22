package okhttp3.internal.publicsuffix;

import defpackage.am1;
import defpackage.ap;
import defpackage.ax0;
import defpackage.ep;
import defpackage.fo;
import defpackage.ji2;
import defpackage.l12;
import defpackage.l13;
import defpackage.l82;
import defpackage.o51;
import defpackage.p91;
import defpackage.pa3;
import defpackage.td2;
import defpackage.uj0;
import defpackage.us2;
import defpackage.vd0;
import defpackage.xg0;
import defpackage.xs2;
import defpackage.yg0;
import defpackage.zy;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class PublicSuffixDatabase {
    public static final byte[] e = {42};
    public static final List f = am1.F("*");
    public static final PublicSuffixDatabase g = new PublicSuffixDatabase();
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);
    public byte[] c;
    public byte[] d;

    public static List c(String str) {
        List listU0 = l13.u0(str, new char[]{'.'}, 6);
        return o51.f(zy.t0(listU0), "") ? zy.j0(listU0) : listU0;
    }

    public final String a(String str) {
        String strI;
        String strI2;
        String strI3;
        List listU0;
        int size;
        int size2;
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List listC = c(unicode);
        List listU1 = uj0.e;
        if (this.a.get() || !this.a.compareAndSet(false, true)) {
            try {
                this.b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e2) {
                        l82 l82Var = l82.a;
                        l82.a.getClass();
                        l82.i("Failed to read public suffix list", 5, e2);
                        if (z) {
                        }
                    }
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.c == null) {
            fo.n("Unable to load publicsuffixes.gz resource from the classpath.");
            return null;
        }
        int size3 = listC.size();
        byte[][] bArr = new byte[size3][];
        for (int i = 0; i < size3; i++) {
            String str2 = (String) listC.get(i);
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            byte[] bytes = str2.getBytes(charset);
            bytes.getClass();
            bArr[i] = bytes;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size3) {
                strI = null;
                break;
            }
            byte[] bArr2 = this.c;
            if (bArr2 == null) {
                o51.F("publicSuffixListBytes");
                throw null;
            }
            strI = vd0.i(bArr2, bArr, i2);
            if (strI != null) {
                break;
            }
            i2++;
        }
        if (size3 <= 1) {
            strI2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                strI2 = null;
                break;
            }
            bArr3[i3] = e;
            byte[] bArr4 = this.c;
            if (bArr4 == null) {
                o51.F("publicSuffixListBytes");
                throw null;
            }
            strI2 = vd0.i(bArr4, bArr3, i3);
            if (strI2 != null) {
                break;
            }
            i3++;
        }
        if (strI2 == null) {
            strI3 = null;
            break;
        }
        int i4 = size3 - 1;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                strI3 = null;
                break;
            }
            byte[] bArr5 = this.d;
            if (bArr5 == null) {
                o51.F("publicSuffixExceptionListBytes");
                throw null;
            }
            strI3 = vd0.i(bArr5, bArr, i5);
            if (strI3 != null) {
                break;
            }
            i5++;
        }
        if (strI3 != null) {
            listU0 = l13.u0("!".concat(strI3), new char[]{'.'}, 6);
        } else if (strI == null && strI2 == null) {
            listU0 = f;
        } else {
            List listU2 = strI != null ? l13.u0(strI, new char[]{'.'}, 6) : listU1;
            if (strI2 != null) {
                listU1 = l13.u0(strI2, new char[]{'.'}, 6);
            }
            listU0 = listU2.size() > listU1.size() ? listU2 : listU1;
        }
        if (listC.size() == listU0.size() && ((String) listU0.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listU0.get(0)).charAt(0) == '!') {
            size = listC.size();
            size2 = listU0.size();
        } else {
            size = listC.size();
            size2 = listU0.size() + 1;
        }
        int i6 = size - size2;
        us2 apVar = new ap(c(str), 1);
        if (i6 < 0) {
            fo.f(p91.m(i6, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i6 != 0) {
            apVar = apVar instanceof yg0 ? ((yg0) apVar).b(i6) : new xg0(apVar, i6, 0);
        }
        return xs2.R(apVar, ".");
    }

    public final void b() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                Logger logger = l12.a;
                td2 td2Var = new td2(new ax0(new ep(1, resourceAsStream, new pa3())));
                try {
                    byte[] bArrP = td2Var.P(td2Var.readInt());
                    byte[] bArrP2 = td2Var.P(td2Var.readInt());
                    td2Var.close();
                    synchronized (this) {
                        this.c = bArrP;
                        this.d = bArrP2;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ji2.z(td2Var, th);
                        throw th2;
                    }
                }
            }
            this.b.countDown();
        } catch (Throwable th3) {
            this.b.countDown();
            throw th3;
        }
    }
}
