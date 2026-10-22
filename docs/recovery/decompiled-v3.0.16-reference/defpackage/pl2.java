package defpackage;

import android.app.PendingIntent;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class pl2 implements mf2 {
    public wm2 e;
    public tl2 f;
    public String g;
    public Object h;
    public Object[] i;
    public sl2 j;
    public final ol2 k = new ol2(this, 0);

    public pl2(wm2 wm2Var, tl2 tl2Var, String str, Object obj, Object[] objArr) {
        this.e = wm2Var;
        this.f = tl2Var;
        this.g = str;
        this.h = obj;
        this.i = objArr;
    }

    @Override // defpackage.mf2
    public final void a() throws PendingIntent.CanceledException {
        d();
    }

    @Override // defpackage.mf2
    public final void b() {
        sl2 sl2Var = this.j;
        if (sl2Var != null) {
            ((gn) sl2Var).G();
        }
    }

    @Override // defpackage.mf2
    public final void c() {
        sl2 sl2Var = this.j;
        if (sl2Var != null) {
            ((gn) sl2Var).G();
        }
    }

    public final void d() throws PendingIntent.CanceledException {
        String strG;
        tl2 tl2Var = this.f;
        if (this.j != null) {
            b81.r(this.j, "entry(", ") is not null");
            return;
        }
        if (tl2Var != null) {
            ol2 ol2Var = this.k;
            Object objInvoke = ol2Var.invoke();
            if (objInvoke == null || tl2Var.b(objInvoke)) {
                this.j = tl2Var.a(this.g, ol2Var);
                return;
            }
            if (objInvoke instanceof yx2) {
                yx2 yx2Var = (yx2) objInvoke;
                if (yx2Var.d() == j9.W || yx2Var.d() == u92.q || yx2Var.d() == u92.h) {
                    strG = "MutableState containing " + yx2Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strG = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strG = wc0.G(objInvoke);
            }
            throw new IllegalArgumentException(strG);
        }
    }
}
