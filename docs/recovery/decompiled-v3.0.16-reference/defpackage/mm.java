package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class mm extends TextView {
    public final fk e;
    public final jm f;
    public final d31 g;
    public fl h;
    public boolean i;
    public t1 j;
    public Future k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        qa3.a(context);
        this.i = false;
        this.j = null;
        ca3.a(this, getContext());
        fk fkVar = new fk(this);
        this.e = fkVar;
        fkVar.r(attributeSet, i);
        jm jmVar = new jm(this);
        this.f = jmVar;
        jmVar.f(attributeSet, i);
        jmVar.b();
        d31 d31Var = new d31(6, false);
        d31Var.f = this;
        this.g = d31Var;
        getEmojiTextViewHelper().a(attributeSet, i);
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public km getSuperCaller() {
        t1 t1Var = this.j;
        if (t1Var != null) {
            return t1Var;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            lm lmVar = new lm(this);
            this.j = lmVar;
            return lmVar;
        }
        t1 t1Var2 = new t1(this, 4);
        this.j = t1Var2;
        return t1Var2;
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
    public CharSequence getText() {
        Future future = this.k;
        if (future != null) {
            try {
                this.k = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                x63.c(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        d31 d31Var;
        if (Build.VERSION.SDK_INT >= 28 || (d31Var = this.g) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) d31Var.g;
        return textClassifier == null ? cm.a((TextView) d31Var.f) : textClassifier;
    }

    public fb2 getTextMetricsParamsCompat() {
        return x63.c(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            dh0.F(editorInfo, getText());
        }
        xq1.L(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
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

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.k;
        if (future != null) {
            try {
                this.k = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                x63.c(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
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

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? k22.v(context, i) : null, i2 != 0 ? k22.v(context, i2) : null, i3 != 0 ? k22.v(context, i3) : null, i4 != 0 ? k22.v(context, i4) : null);
        jm jmVar = this.f;
        if (jmVar != null) {
            jmVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? k22.v(context, i) : null, i2 != 0 ? k22.v(context, i2) : null, i3 != 0 ? k22.v(context, i3) : null, i4 != 0 ? k22.v(context, i4) : null);
        jm jmVar = this.f;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((mc0) getEmojiTextViewHelper().b.f).r(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().k(i);
        } else {
            x63.f(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().d(i);
        } else {
            x63.g(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int fontMetricsInt = getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public void setPrecomputedText(gb2 gb2Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        x63.c(this);
        throw null;
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
    public void setTextClassifier(TextClassifier textClassifier) {
        d31 d31Var;
        if (Build.VERSION.SDK_INT >= 28 || (d31Var = this.g) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            d31Var.g = textClassifier;
        }
    }

    public void setTextFuture(Future<gb2> future) {
        this.k = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(fb2 fb2Var) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = fb2Var.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(fb2Var.a);
        setBreakStrategy(fb2Var.c);
        setHyphenationFrequency(fb2Var.d);
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

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.i) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            k93 k93Var = ae3.a;
            if (context == null) {
                fo.i("Context cannot be null");
                return;
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.i = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.i = false;
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        jm jmVar = this.f;
        if (jmVar != null) {
            jmVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        jm jmVar = this.f;
        if (jmVar != null) {
            jmVar.b();
        }
    }

    public mm(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }
}
