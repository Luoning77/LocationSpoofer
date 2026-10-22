package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class um extends ToggleButton {
    public final fk e;
    public final jm f;
    public fl g;

    public um(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        ca3.a(this, getContext());
        fk fkVar = new fk(this);
        this.e = fkVar;
        fkVar.r(attributeSet, R.attr.buttonStyleToggle);
        jm jmVar = new jm(this);
        this.f = jmVar;
        jmVar.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyleToggle);
    }

    private fl getEmojiTextViewHelper() {
        fl flVar = this.g;
        if (flVar != null) {
            return flVar;
        }
        fl flVar2 = new fl(this);
        this.g = flVar2;
        return flVar2;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
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

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((mc0) getEmojiTextViewHelper().b.f).r(inputFilterArr));
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
}
