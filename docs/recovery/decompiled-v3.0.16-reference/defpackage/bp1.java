package defpackage;

import android.graphics.PointF;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bp1 {
    public final float a;
    public final float b;
    public final float c;
    public final double d;
    public boolean e;
    public float f;
    public double g;
    public double h;
    public final /* synthetic */ dp1 i;

    public bp1(dp1 dp1Var, double d, float f, float f2, float f3) {
        this.i = dp1Var;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = d * 0.004d;
    }

    public final PointF a(m03 m03Var) {
        dp1 dp1Var = this.i;
        jf3 jf3Var = dp1Var.c;
        PointF pointF = dp1Var.m;
        if (pointF != null) {
            return pointF;
        }
        return this.e ? new PointF(jf3Var.c.c() / 2.0f, jf3Var.c.b() / 2.0f) : m03Var.n;
    }
}
