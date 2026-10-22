package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class lg0 extends CharacterStyle implements UpdateAppearance {
    public final kg0 e;

    public lg0(kg0 kg0Var) {
        this.e = kg0Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            en0 en0Var = en0.a;
            kg0 kg0Var = this.e;
            if (o51.f(kg0Var, en0Var)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(kg0Var instanceof t13)) {
                b81.d();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            t13 t13Var = (t13) kg0Var;
            textPaint.setStrokeWidth(t13Var.a);
            textPaint.setStrokeMiter(t13Var.b);
            int i = t13Var.d;
            if (i == 0) {
                join = Paint.Join.MITER;
            } else if (i == 1) {
                join = Paint.Join.ROUND;
            } else {
                join = i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER;
            }
            textPaint.setStrokeJoin(join);
            int i2 = t13Var.c;
            if (i2 == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i2 == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
            }
            textPaint.setStrokeCap(cap);
            textPaint.setPathEffect(null);
        }
    }
}
