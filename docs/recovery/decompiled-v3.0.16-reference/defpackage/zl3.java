package defpackage;

import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zl3 {
    public final os a;
    public final float b;

    public zl3(Rect rect, float f) {
        this.a = new os(rect);
        this.b = f;
    }

    public final Rect a() {
        os osVar = this.a;
        osVar.getClass();
        return new Rect(osVar.a, osVar.b, osVar.c, osVar.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zl3.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        zl3 zl3Var = (zl3) obj;
        return o51.f(this.a, zl3Var.a) && this.b == zl3Var.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowMetrics(_bounds=");
        sb.append(this.a);
        sb.append(", density=");
        return az2.n(sb, this.b, ')');
    }

    public zl3(os osVar, float f) {
        this.a = osVar;
        this.b = f;
    }
}
