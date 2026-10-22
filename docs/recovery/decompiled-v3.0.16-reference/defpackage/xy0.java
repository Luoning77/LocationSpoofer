package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class xy0 extends vy0 {
    public final zz0 h;
    public long i;
    public boolean j;
    public final /* synthetic */ bz0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy0(bz0 bz0Var, zz0 zz0Var) {
        super(bz0Var);
        zz0Var.getClass();
        this.k = bz0Var;
        this.h = zz0Var;
        this.i = -1L;
        this.j = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        if (r11.j == false) goto L27;
     */
    @Override // defpackage.vy0, defpackage.sy2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long C(defpackage.xt r12, long r13) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xy0.C(xt, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zS;
        if (this.f) {
            return;
        }
        if (this.j) {
            byte[] bArr = bh3.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zS = bh3.s(this, 100);
            } catch (IOException unused) {
                zS = false;
            }
            if (!zS) {
                this.k.b.k();
                A();
            }
        }
        this.f = true;
    }
}
