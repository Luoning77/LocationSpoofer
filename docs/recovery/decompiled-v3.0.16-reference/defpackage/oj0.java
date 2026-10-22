package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class oj0 implements TextWatcher {
    public final EditText e;
    public nj0 f;
    public boolean g = true;

    public oj0(EditText editText) {
        this.e = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            wi0 wi0VarA = wi0.a();
            if (editableText == null) {
                length = 0;
            } else {
                wi0VarA.getClass();
                length = editableText.length();
            }
            wi0VarA.g(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        EditText editText = this.e;
        if (!editText.isInEditMode() && this.g && wi0.d() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iC = wi0.a().c();
            if (iC != 0) {
                if (iC == 1) {
                    wi0.a().g(i, i3 + i, 0, (Spannable) charSequence);
                    return;
                } else if (iC != 3) {
                    return;
                }
            }
            wi0 wi0VarA = wi0.a();
            nj0 nj0Var = this.f;
            if (nj0Var == null) {
                nj0Var = new nj0(editText);
                this.f = nj0Var;
            }
            wi0VarA.h(nj0Var);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
