package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.AbsSeekBar;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ol extends d31 {
    public final nl j;
    public Drawable k;
    public ColorStateList l;
    public PorterDuff.Mode m;
    public boolean n;
    public boolean o;

    public ol(nl nlVar) {
        super((AbsSeekBar) nlVar);
        this.l = null;
        this.m = null;
        this.n = false;
        this.o = false;
        this.j = nlVar;
    }

    public final void G() {
        Drawable drawable = this.k;
        if (drawable != null) {
            if (this.n || this.o) {
                Drawable drawableMutate = drawable.mutate();
                this.k = drawableMutate;
                if (this.n) {
                    drawableMutate.setTintList(this.l);
                }
                if (this.o) {
                    this.k.setTintMode(this.m);
                }
                if (this.k.isStateful()) {
                    this.k.setState(this.j.getDrawableState());
                }
            }
        }
    }

    public final void H(Canvas canvas) {
        if (this.k != null) {
            nl nlVar = this.j;
            int max = nlVar.getMax();
            if (max > 1) {
                int intrinsicWidth = this.k.getIntrinsicWidth();
                int intrinsicHeight = this.k.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.k.setBounds(-i, -i2, i, i2);
                float width = ((nlVar.getWidth() - nlVar.getPaddingLeft()) - nlVar.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(nlVar.getPaddingLeft(), nlVar.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.k.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // defpackage.d31
    public final void x(AttributeSet attributeSet, int i) {
        super.x(attributeSet, 2130903374);
        nl nlVar = this.j;
        Context context = nlVar.getContext();
        int[] iArr = jd2.g;
        gn gnVarY = gn.y(context, attributeSet, iArr, 2130903374);
        TypedArray typedArray = (TypedArray) gnVarY.a;
        yi3.i(nlVar, nlVar.getContext(), iArr, attributeSet, (TypedArray) gnVarY.a, 2130903374);
        Drawable drawableN = gnVarY.n(0);
        if (drawableN != null) {
            nlVar.setThumb(drawableN);
        }
        Drawable drawableM = gnVarY.m(1);
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.k = drawableM;
        if (drawableM != null) {
            drawableM.setCallback(nlVar);
            drawableM.setLayoutDirection(nlVar.getLayoutDirection());
            if (drawableM.isStateful()) {
                drawableM.setState(nlVar.getDrawableState());
            }
            G();
        }
        nlVar.invalidate();
        if (typedArray.hasValue(3)) {
            this.m = pg0.b(typedArray.getInt(3, -1), this.m);
            this.o = true;
        }
        if (typedArray.hasValue(2)) {
            this.l = gnVarY.j(2);
            this.n = true;
        }
        gnVarY.A();
        G();
    }
}
