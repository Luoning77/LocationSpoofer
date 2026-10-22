package defpackage;

import android.os.Build;
import android.view.DisplayCutout;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bd0 {
    public final DisplayCutout a;

    public bd0(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final j31 a() {
        return Build.VERSION.SDK_INT >= 30 ? j31.c(p1.c(this.a)) : j31.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bd0.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((bd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
