package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ga implements vv {
    public Canvas a = ha.a;
    public Rect b;
    public Rect c;

    @Override // defpackage.vv
    public final void a(td tdVar, je jeVar) {
        this.a.drawBitmap(n51.l(tdVar), Float.intBitsToFloat(0), Float.intBitsToFloat(0), (Paint) jeVar.c);
    }

    @Override // defpackage.vv
    public final void b(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.vv
    public final void c(float f) {
        this.a.rotate(f);
    }

    @Override // defpackage.vv
    public final void d(float f, long j, je jeVar) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) jeVar.c);
    }

    @Override // defpackage.vv
    public final void e(td tdVar, long j, long j2, long j3, je jeVar) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap bitmapL = n51.l(tdVar);
        Rect rect = this.b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.c;
        rect2.getClass();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(bitmapL, rect, rect2, (Paint) jeVar.c);
    }

    @Override // defpackage.vv
    public final void f(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // defpackage.vv
    public final void g(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.vv
    public final void h(re reVar, je jeVar) {
        Canvas canvas = this.a;
        if (reVar instanceof re) {
            canvas.drawPath(reVar.a, xq1.H(jeVar));
        } else {
            b81.s("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.vv
    public final void i() {
        this.a.restore();
    }

    @Override // defpackage.vv
    public final void j(float f, float f2, float f3, float f4, float f5, float f6, je jeVar) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, xq1.H(jeVar));
    }

    @Override // defpackage.vv
    public final void l() {
        this.a.save();
    }

    @Override // defpackage.vv
    public final void m(long j, long j2, je jeVar) {
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) jeVar.c);
    }

    @Override // defpackage.vv
    public final void n() {
        da0.r(this.a, false);
    }

    @Override // defpackage.vv
    public final void o(pe2 pe2Var, je jeVar) {
        this.a.saveLayer(pe2Var.a, pe2Var.b, pe2Var.c, pe2Var.d, xq1.H(jeVar), 31);
    }

    @Override // defpackage.vv
    public final void p(float f, float f2, float f3, float f4, je jeVar) {
        this.a.drawRect(f, f2, f3, f4, xq1.H(jeVar));
    }

    @Override // defpackage.vv
    public final void q(float[] fArr) {
        if (mh0.M(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        am1.S(matrix, fArr);
        this.a.concat(matrix);
    }

    @Override // defpackage.vv
    public final void r() {
        da0.r(this.a, true);
    }

    @Override // defpackage.vv
    public final void s(re reVar) {
        Canvas canvas = this.a;
        if (reVar instanceof re) {
            canvas.clipPath(reVar.a, Region.Op.INTERSECT);
        } else {
            b81.s("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.vv
    public final void t(float f, float f2, float f3, float f4, float f5, float f6, je jeVar) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, (Paint) jeVar.c);
    }
}
