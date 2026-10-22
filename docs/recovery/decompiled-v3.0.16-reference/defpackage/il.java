package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class il extends MultiAutoCompleteTextView {
    public static final int[] h = {R.attr.popupBackground};
    public final fk e;
    public final jm f;
    public final d31 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903089);
        qa3.a(context);
        ca3.a(this, getContext());
        gn gnVarY = gn.y(getContext(), attributeSet, h, 2130903089);
        if (((TypedArray) gnVarY.a).hasValue(0)) {
            setDropDownBackgroundDrawable(gnVarY.m(0));
        }
        gnVarY.A();
        fk fkVar = new fk(this);
        this.e = fkVar;
        fkVar.r(attributeSet, 2130903089);
        jm jmVar = new jm(this);
        this.f = jmVar;
        jmVar.f(attributeSet, 2130903089);
        jmVar.b();
        d31 d31Var = new d31(this, 5);
        this.g = d31Var;
        d31Var.x(attributeSet, 2130903089);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerU = d31Var.u(keyListener);
        if (keyListenerU == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerU);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        fk fkVar = this.e;
        if (fkVar != null) {
            fkVar.b();
        }
        jm jmVar = this.f;
        if (jmVar != null) {
            jmVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        fk fkVar = this.e;
        if (fkVar != null) {
            return fkVar.p();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        fk fkVar = this.e;
        if (fkVar != null) {
            return fkVar.q();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        xq1.L(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.g.A(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        fk fkVar = this.e;
        if (fkVar != null) {
            fkVar.s();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        fk fkVar = this.e;
        if (fkVar != null) {
            fkVar.t(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        jm jmVar = this.f;
        if (jmVar != null) {
            jmVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        jm jmVar = this.f;
        if (jmVar != null) {
            jmVar.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(k22.v(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.g.D(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.g.u(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        fk fkVar = this.e;
        if (fkVar != null) {
            fkVar.x(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        fk fkVar = this.e;
        if (fkVar != null) {
            fkVar.y(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        jm jmVar = this.f;
        jmVar.k(colorStateList);
        jmVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        jm jmVar = this.f;
        jmVar.l(mode);
        jmVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        jm jmVar = this.f;
        if (jmVar != null) {
            jmVar.g(context, i);
        }
    }
}
