package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class gk extends Button {
    public final fk e;
    public final jm f;
    public fl g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903111);
        qa3.a(context);
        ca3.a(this, getContext());
        fk fkVar = new fk(this);
        this.e = fkVar;
        fkVar.r(attributeSet, 2130903111);
        jm jmVar = new jm(this);
        this.f = jmVar;
        jmVar.f(attributeSet, 2130903111);
        jmVar.b();
        getEmojiTextViewHelper().a(attributeSet, 2130903111);
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

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (xj3.b) {
            return super.getAutoSizeMaxTextSize();
        }
        jm jmVar = this.f;
        if (jmVar != null) {
            return Math.round(jmVar.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (xj3.b) {
            return super.getAutoSizeMinTextSize();
        }
        jm jmVar = this.f;
        if (jmVar != null) {
            return Math.round(jmVar.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (xj3.b) {
            return super.getAutoSizeStepGranularity();
        }
        jm jmVar = this.f;
        if (jmVar != null) {
            return Math.round(jmVar.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (xj3.b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        jm jmVar = this.f;
        return jmVar != null ? jmVar.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (xj3.b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        jm jmVar = this.f;
        if (jmVar != null) {
            return jmVar.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof y93 ? ((y93) customSelectionActionModeCallback).a : customSelectionActionModeCallback;
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

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        jm jmVar = this.f;
        if (jmVar == null || xj3.b) {
            return;
        }
        jmVar.i.a();
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        jm jmVar = this.f;
        if (jmVar != null) {
            tm tmVar = jmVar.i;
            if (xj3.b || !tmVar.f()) {
                return;
            }
            tmVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (xj3.b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        jm jmVar = this.f;
        if (jmVar != null) {
            jmVar.h(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (xj3.b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        jm jmVar = this.f;
        if (jmVar != null) {
            jmVar.i(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (xj3.b) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        jm jmVar = this.f;
        if (jmVar != null) {
            jmVar.j(i);
        }
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(x63.i(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((mc0) getEmojiTextViewHelper().b.f).r(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        jm jmVar = this.f;
        if (jmVar != null) {
            jmVar.a.setAllCaps(z);
        }
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

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = xj3.b;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        jm jmVar = this.f;
        if (jmVar != null) {
            tm tmVar = jmVar.i;
            if (z || tmVar.f()) {
                return;
            }
            tmVar.g(i, f);
        }
    }
}
