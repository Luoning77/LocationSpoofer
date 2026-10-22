package defpackage;

import org.maplibre.android.maps.m;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class jr2 {
    public final /* synthetic */ lr2 a;
    public final /* synthetic */ String b;

    public /* synthetic */ jr2(lr2 lr2Var, String str) {
        this.a = lr2Var;
        this.b = str;
    }

    public final void a(m mVar) {
        mVar.getClass();
        lr2 lr2Var = this.a;
        if (lr2Var.i || !o51.f(lr2Var.k, this.b)) {
            return;
        }
        lr2Var.n(mVar);
        lr2Var.f.invoke();
        if (lr2Var.j) {
            return;
        }
        lr2Var.j = true;
        lr2Var.g.invoke(lr2Var);
    }
}
