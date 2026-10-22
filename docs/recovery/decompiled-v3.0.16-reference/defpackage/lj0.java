package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class lj0 extends mc0 {
    public final TextView f;
    public final fj0 g;
    public boolean h = true;

    public lj0(TextView textView) {
        this.f = textView;
        this.g = new fj0(textView);
    }

    @Override // defpackage.mc0
    public final void F(boolean z) {
        if (z) {
            L();
        }
    }

    @Override // defpackage.mc0
    public final void G(boolean z) {
        this.h = z;
        L();
        TextView textView = this.f;
        textView.setFilters(r(textView.getFilters()));
    }

    public final void L() {
        TextView textView = this.f;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.h) {
            if (!(transformationMethod instanceof pj0) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new pj0(transformationMethod);
            }
        } else if (transformationMethod instanceof pj0) {
            transformationMethod = ((pj0) transformationMethod).e;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // defpackage.mc0
    public final InputFilter[] r(InputFilter[] inputFilterArr) {
        if (!this.h) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof fj0) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            fj0 fj0Var = this.g;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = fj0Var;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == fj0Var) {
                return inputFilterArr;
            }
            i4++;
        }
    }
}
