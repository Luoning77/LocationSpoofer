package defpackage;

import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class sd implements iw0 {
    public static boolean f = true;
    public final db a;
    public final Object b = new Object();
    public gj3 c;
    public boolean d;
    public final qd e;

    public sd(db dbVar) {
        this.a = dbVar;
        qd qdVar = new qd();
        this.e = qdVar;
        if (dbVar.isAttachedToWindow()) {
            Context context = dbVar.getContext();
            if (!this.d) {
                context.getApplicationContext().registerComponentCallbacks(qdVar);
                this.d = true;
            }
        }
        dbVar.addOnAttachStateChangeListener(new rd(this, 0));
    }

    @Override // defpackage.iw0
    public final void a(kw0 kw0Var) {
        synchronized (this.b) {
            if (!kw0Var.s) {
                kw0Var.s = true;
                kw0Var.b();
            }
        }
    }

    @Override // defpackage.iw0
    public final kw0 b() {
        mw0 uw0Var;
        mw0 sw0Var;
        kw0 kw0Var;
        synchronized (this.b) {
            try {
                db dbVar = this.a;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    dbVar.getUniqueDrawingId();
                }
                if (i >= 29) {
                    sw0Var = new sw0();
                } else {
                    if (f) {
                        try {
                            uw0Var = new qw0(this.a, new yv(), new xv());
                        } catch (Throwable unused) {
                            f = false;
                            uw0Var = new uw0(c(this.a));
                        }
                    } else {
                        uw0Var = new uw0(c(this.a));
                    }
                    sw0Var = uw0Var;
                }
                kw0Var = new kw0(sw0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return kw0Var;
    }

    public final gg0 c(db dbVar) {
        gj3 gj3Var = this.c;
        if (gj3Var != null) {
            return gj3Var;
        }
        gj3 gj3Var2 = new gj3(dbVar.getContext());
        gj3Var2.setClipChildren(false);
        gj3Var2.setClipToPadding(false);
        gj3Var2.setTag(2131230829, Boolean.TRUE);
        dbVar.addView(gj3Var2, -1);
        this.c = gj3Var2;
        return gj3Var2;
    }
}
