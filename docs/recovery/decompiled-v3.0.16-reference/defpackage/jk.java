package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class jk extends CheckedTextView {
    public final kk e;
    public final fk f;
    public final jm g;
    public fl h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, 2130903119);
        qa3.a(context);
        ca3.a(this, getContext());
        jm jmVar = new jm(this);
        this.g = jmVar;
        jmVar.f(attributeSet, 2130903119);
        jmVar.b();
        fk fkVar = new fk(this);
        this.f = fkVar;
        fkVar.r(attributeSet, 2130903119);
        this.e = new kk(this);
        Context context2 = getContext();
        int[] iArr = jd2.l;
        gn gnVarY = gn.y(context2, attributeSet, iArr, 2130903119);
        TypedArray typedArray = (TypedArray) gnVarY.a;
        yi3.i(this, getContext(), iArr, attributeSet, (TypedArray) gnVarY.a, 2130903119);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(k22.v(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(k22.v(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(k22.v(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(gnVarY.j(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(pg0.b(typedArray.getInt(3, -1), null));
            }
            gnVarY.A();
            getEmojiTextViewHelper().a(attributeSet, 2130903119);
        } catch (Throwable th) {
            gnVarY.A();
            throw th;
        }
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

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        jm jmVar = this.g;
        if (jmVar != null) {
            jmVar.b();
        }
        fk fkVar = this.f;
        if (fkVar != null) {
            fkVar.b();
        }
        kk kkVar = this.e;
        if (kkVar != null) {
            kkVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof y93 ? ((y93) customSelectionActionModeCallback).a : customSelectionActionModeCallback;
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

    public ColorStateList getSupportCheckMarkTintList() {
        kk kkVar = this.e;
        if (kkVar != null) {
            return (ColorStateList) kkVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        xq1.L(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
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

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        kk kkVar = this.e;
        if (kkVar != null) {
            if (kkVar.e) {
                kkVar.e = false;
            } else {
                kkVar.e = true;
                kkVar.b();
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(x63.i(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        kk kkVar = this.e;
        if (kkVar != null) {
            kkVar.a = colorStateList;
            kkVar.c = true;
            kkVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        kk kkVar = this.e;
        if (kkVar != null) {
            kkVar.b = mode;
            kkVar.d = true;
            kkVar.b();
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        jm jmVar = this.g;
        if (jmVar != null) {
            jmVar.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(k22.v(getContext(), i));
    }
}
