package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wt extends InputStream {
    public final /* synthetic */ int e;
    public final /* synthetic */ du f;

    public /* synthetic */ wt(du duVar, int i) {
        this.e = i;
        this.f = duVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        int i = this.e;
        du duVar = this.f;
        switch (i) {
            case 0:
                return (int) Math.min(((xt) duVar).f, 2147483647L);
            default:
                td2 td2Var = (td2) duVar;
                if (!td2Var.g) {
                    return (int) Math.min(td2Var.f.f, 2147483647L);
                }
                fo.r("closed");
                return 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.e) {
            case 0:
                break;
            default:
                ((td2) this.f).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.e;
        du duVar = this.f;
        switch (i) {
            case 0:
                xt xtVar = (xt) duVar;
                if (xtVar.f > 0) {
                    return xtVar.readByte() & 255;
                }
                return -1;
            default:
                td2 td2Var = (td2) duVar;
                xt xtVar2 = td2Var.f;
                if (td2Var.g) {
                    fo.r("closed");
                    return 0;
                }
                if (xtVar2.f == 0 && td2Var.e.C(xtVar2, 8192L) == -1) {
                    return -1;
                }
                return xtVar2.readByte() & 255;
        }
    }

    public final String toString() {
        int i = this.e;
        du duVar = this.f;
        switch (i) {
            case 0:
                return ((xt) duVar) + ".inputStream()";
            default:
                return ((td2) duVar) + ".inputStream()";
        }
    }

    private final void A() {
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.e;
        du duVar = this.f;
        bArr.getClass();
        switch (i3) {
            case 0:
                return ((xt) duVar).read(bArr, i, i2);
            default:
                td2 td2Var = (td2) duVar;
                xt xtVar = td2Var.f;
                if (!td2Var.g) {
                    zm3.j(bArr.length, i, i2);
                    if (xtVar.f == 0 && td2Var.e.C(xtVar, 8192L) == -1) {
                        return -1;
                    }
                    return xtVar.read(bArr, i, i2);
                }
                fo.r("closed");
                return 0;
        }
    }
}
