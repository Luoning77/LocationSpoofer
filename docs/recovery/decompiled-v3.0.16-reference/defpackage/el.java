package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class el extends EditText implements d22 {
    public final fk e;
    public final jm f;
    public final d31 g;
    public final z93 h;
    public final d31 i;
    public dl j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903171);
        qa3.a(context);
        ca3.a(this, getContext());
        fk fkVar = new fk(this);
        this.e = fkVar;
        fkVar.r(attributeSet, 2130903171);
        jm jmVar = new jm(this);
        this.f = jmVar;
        jmVar.f(attributeSet, 2130903171);
        jmVar.b();
        d31 d31Var = new d31(6, false);
        d31Var.f = this;
        this.g = d31Var;
        this.h = new z93();
        d31 d31Var2 = new d31(this, 5);
        this.i = d31Var2;
        d31Var2.x(attributeSet, 2130903171);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerU = d31Var2.u(keyListener);
        if (keyListenerU == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerU);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    private dl getSuperCaller() {
        dl dlVar = this.j;
        if (dlVar != null) {
            return dlVar;
        }
        dl dlVar2 = new dl(this);
        this.j = dlVar2;
        return dlVar2;
    }

    @Override // defpackage.d22
    public final e60 a(e60 e60Var) {
        this.h.getClass();
        return z93.a(this, e60Var);
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

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : getEditableText();
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrF;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && inputConnectionOnCreateInputConnection != null) {
            dh0.F(editorInfo, getText());
        }
        xq1.L(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && i <= 30 && (strArrF = yi3.f(this)) != null) {
            editorInfo.contentMimeTypes = strArrF;
            inputConnectionOnCreateInputConnection = new c31(inputConnectionOnCreateInputConnection, new g8(this));
        }
        return this.i.A(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zA = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && yi3.f(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = ml.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        c60 c60Var;
        b60 b60Var;
        t1 t1Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || yi3.f(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            int i3 = 0;
            if (i2 >= 31) {
                t1Var = new t1(primaryClip, 1);
            } else {
                c60Var = new c60(i3);
                c60Var.f = primaryClip;
                c60Var.g = 1;
            }
            if (i != 16908322) {
                b60Var = c60Var;
                b60Var = t1Var;
                i3 = 1;
            }
            b60Var = c60Var;
            b60Var = t1Var;
            b60Var.p(i3);
            yi3.h(this, b60Var.build());
        }
        return true;
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(x63.i(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.i.D(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.i.u(keyListener));
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
}
