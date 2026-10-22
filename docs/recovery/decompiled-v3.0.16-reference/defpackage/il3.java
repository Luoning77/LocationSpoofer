package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class il3 extends hl3 {
    public il3(ql3 ql3Var, WindowInsets windowInsets) {
        super(ql3Var, windowInsets);
    }

    @Override // defpackage.nl3
    public ql3 a() {
        return ql3.c(this.c.consumeDisplayCutout(), null);
    }

    @Override // defpackage.gl3, defpackage.nl3
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il3)) {
            return false;
        }
        il3 il3Var = (il3) obj;
        return Objects.equals(this.c, il3Var.c) && Objects.equals(this.g, il3Var.g) && gl3.C(this.h, il3Var.h);
    }

    @Override // defpackage.nl3
    public bd0 f() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new bd0(displayCutout);
    }

    @Override // defpackage.nl3
    public int hashCode() {
        return this.c.hashCode();
    }

    public il3(ql3 ql3Var, il3 il3Var) {
        super(ql3Var, il3Var);
    }
}
