package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class n01 {
    public Bitmap a;
    public final String b;

    public n01(String str, Bitmap bitmap) {
        this.b = str;
        this.a = bitmap;
    }

    public final Bitmap a() {
        Bitmap bitmap = this.a;
        if (bitmap != null) {
            Bitmap.Config config = bitmap.getConfig();
            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
            if (config != config2) {
                this.a = this.a.copy(config2, false);
            }
        }
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n01.class == obj.getClass()) {
            n01 n01Var = (n01) obj;
            if (this.a.equals(n01Var.a) && this.b.equals(n01Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Bitmap bitmap = this.a;
        int iHashCode = bitmap != null ? bitmap.hashCode() : 0;
        String str = this.b;
        if (str != null) {
            return str.hashCode() + (iHashCode * 31);
        }
        return iHashCode;
    }
}
