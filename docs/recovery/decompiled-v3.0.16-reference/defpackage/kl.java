package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class kl extends RadioButton {
    public final kk e;
    public final fk f;
    public final jm g;
    public fl h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903365);
        qa3.a(context);
        ca3.a(this, getContext());
        kk kkVar = new kk(this);
        this.e = kkVar;
        kkVar.d(attributeSet, 2130903365);
        fk fkVar = new fk(this);
        this.f = fkVar;
        fkVar.r(attributeSet, 2130903365);
        jm jmVar = new jm(this);
        this.g = jmVar;
        jmVar.f(attributeSet, 2130903365);
        getEmojiTextViewHelper().a(attributeSet, 2130903365);
    }

    private fl getEmojiTextViewHelper() {
        fl flVar = this.h;
        if (flVar != null) {
            return flVar;
        }
        fl flVar2 = new fl(this);
        this.h = flVar2;
        return flVar2;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        fk fkVar = this.f;
        if (fkVar != null) {
            fkVar.b();
        }
        jm jmVar = this.g;
        if (jmVar != null) {
            jmVar.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        kk kkVar = this.e;
        if (kkVar != null) {
            kkVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        fk fkVar = this.f;
        if (fkVar != null) {
            return fkVar.p();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        fk fkVar = this.f;
        if (fkVar != null) {
            return fkVar.q();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        kk kkVar = this.e;
        if (kkVar != null) {
            return (ColorStateList) kkVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        kk kkVar = this.e;
        if (kkVar != null) {
            return (PorterDuff.Mode) kkVar.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.g.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        fk fkVar = this.f;
        if (fkVar != null) {
            fkVar.s();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        fk fkVar = this.f;
        if (fkVar != null) {
            fkVar.t(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        kk kkVar = this.e;
        if (kkVar != null) {
            if (kkVar.e) {
                kkVar.e = false;
            } else {
                kkVar.e = true;
                kkVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        jm jmVar = this.g;
        if (jmVar != null) {
            jmVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        jm jmVar = this.g;
        if (jmVar != null) {
            jmVar.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((mc0) getEmojiTextViewHelper().b.f).r(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        fk fkVar = this.f;
        if (fkVar != null) {
            fkVar.x(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        fk fkVar = this.f;
        if (fkVar != null) {
            fkVar.y(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        kk kkVar = this.e;
        if (kkVar != null) {
            kkVar.a = colorStateList;
            kkVar.c = true;
            kkVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        kk kkVar = this.e;
        if (kkVar != null) {
            kkVar.b = mode;
            kkVar.d = true;
            kkVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        jm jmVar = this.g;
        jmVar.k(colorStateList);
        jmVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        jm jmVar = this.g;
        jmVar.l(mode);
        jmVar.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(k22.v(getContext(), i));
    }
}
