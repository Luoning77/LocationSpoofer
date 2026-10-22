package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class vt2 extends CharacterStyle implements UpdateAppearance {
    public final ut2 e;
    public final float f;
    public final w52 g = ke0.H(new cw2(9205357640488583168L));
    public final fc0 h = by2.b(new ol2(this, 7));

    public vt2(ut2 ut2Var, float f) {
        this.e = ut2Var;
        this.f = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        zm3.Q(textPaint, this.f);
        textPaint.setShader((Shader) this.h.getValue());
    }
}
