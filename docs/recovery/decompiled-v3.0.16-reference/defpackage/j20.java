package defpackage;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class j20 extends View.DragShadowBuilder {
    public final ac0 a;
    public final long b;
    public final lu0 c;

    public j20(ac0 ac0Var, long j, lu0 lu0Var) {
        this.a = ac0Var;
        this.b = j;
        this.c = lu0Var;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        xv xvVar = new xv();
        Canvas canvas2 = ha.a;
        ga gaVar = new ga();
        gaVar.a = canvas;
        wv wvVar = xvVar.e;
        xb0 xb0Var = wvVar.a;
        qa1 qa1Var = wvVar.b;
        vv vvVar = wvVar.c;
        long j = wvVar.d;
        wvVar.a = this.a;
        wvVar.b = qa1.e;
        wvVar.c = gaVar;
        wvVar.d = this.b;
        gaVar.l();
        this.c.invoke(xvVar);
        gaVar.i();
        wvVar.a = xb0Var;
        wvVar.b = qa1Var;
        wvVar.c = vvVar;
        wvVar.d = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        ac0 ac0Var = this.a;
        point.set(ac0Var.n0(fIntBitsToFloat / ac0Var.g()), ac0Var.n0(Float.intBitsToFloat((int) (j & 4294967295L)) / ac0Var.g()));
        point2.set(point.x / 2, point.y / 2);
    }
}
