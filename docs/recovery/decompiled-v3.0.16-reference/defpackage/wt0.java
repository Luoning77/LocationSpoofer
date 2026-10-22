package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wt0 implements t23 {
    public final Context e;
    public final String f;
    public final x8 g;
    public final i43 h;
    public boolean i;

    public wt0(Context context, String str, x8 x8Var) {
        x8Var.getClass();
        this.e = context;
        this.f = str;
        this.g = x8Var;
        this.h = new i43(new hd(this, 16));
    }

    @Override // defpackage.t23
    public final s23 V() {
        return ((vt0) this.h.getValue()).A(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        i43 i43Var = this.h;
        if (i43Var.a()) {
            ((vt0) i43Var.getValue()).close();
        }
    }

    @Override // defpackage.t23
    public final String getDatabaseName() {
        return this.f;
    }

    @Override // defpackage.t23
    public final void setWriteAheadLoggingEnabled(boolean z) {
        i43 i43Var = this.h;
        if (i43Var.a()) {
            ((vt0) i43Var.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.i = z;
    }
}
