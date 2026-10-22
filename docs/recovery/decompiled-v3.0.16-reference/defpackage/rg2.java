package defpackage;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class rg2 extends Reader {
    public final du e;
    public final Charset f;
    public boolean g;
    public InputStreamReader h;

    public rg2(du duVar, Charset charset) {
        duVar.getClass();
        charset.getClass();
        this.e = duVar;
        this.f = charset;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        mf3 mf3Var;
        this.g = true;
        InputStreamReader inputStreamReader = this.h;
        if (inputStreamReader != null) {
            inputStreamReader.close();
            mf3Var = mf3.a;
        } else {
            mf3Var = null;
        }
        if (mf3Var == null) {
            this.e.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        cArr.getClass();
        if (this.g) {
            fo.r("Stream closed");
            return 0;
        }
        InputStreamReader inputStreamReader = this.h;
        if (inputStreamReader == null) {
            du duVar = this.e;
            inputStreamReader = new InputStreamReader(duVar.b0(), bh3.q(duVar, this.f));
            this.h = inputStreamReader;
        }
        return inputStreamReader.read(cArr, i, i2);
    }
}
