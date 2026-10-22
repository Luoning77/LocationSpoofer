package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class vy0 implements sy2 {
    public final sr0 e;
    public boolean f;
    public final /* synthetic */ bz0 g;

    public vy0(bz0 bz0Var) {
        this.g = bz0Var;
        this.e = new sr0(bz0Var.c.d());
    }

    public final void A() {
        bz0 bz0Var = this.g;
        int i = bz0Var.e;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + bz0Var.e);
        }
        sr0 sr0Var = this.e;
        pa3 pa3Var = sr0Var.e;
        sr0Var.e = pa3.d;
        pa3Var.a();
        pa3Var.b();
        bz0Var.e = 6;
    }

    @Override // defpackage.sy2
    public long C(xt xtVar, long j) throws IOException {
        bz0 bz0Var = this.g;
        xtVar.getClass();
        try {
            return bz0Var.c.C(xtVar, j);
        } catch (IOException e) {
            bz0Var.b.k();
            A();
            throw e;
        }
    }

    @Override // defpackage.sy2
    public final pa3 d() {
        return this.e;
    }
}
