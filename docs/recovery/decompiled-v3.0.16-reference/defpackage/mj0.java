package defpackage;

import android.text.InputFilter;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mj0 extends mc0 {
    public final lj0 f;

    public mj0(TextView textView) {
        this.f = new lj0(textView);
    }

    @Override // defpackage.mc0
    public final void F(boolean z) {
        if (wi0.d()) {
            this.f.F(z);
        }
    }

    @Override // defpackage.mc0
    public final void G(boolean z) {
        boolean zD = wi0.d();
        lj0 lj0Var = this.f;
        if (zD) {
            lj0Var.G(z);
        } else {
            lj0Var.h = z;
        }
    }

    @Override // defpackage.mc0
    public final InputFilter[] r(InputFilter[] inputFilterArr) {
        return !wi0.d() ? inputFilterArr : this.f.r(inputFilterArr);
    }
}
