package defpackage;

import android.graphics.RenderEffect;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class xr extends t20 {
    public final float b;
    public final float c;

    public xr(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr)) {
            return false;
        }
        xr xrVar = (xr) obj;
        return this.b == xrVar.b && this.c == xrVar.c;
    }

    @Override // defpackage.t20
    public final RenderEffect f() {
        float f = this.b;
        float f2 = this.c;
        return (f == 0.0f && f2 == 0.0f) ? RenderEffect.createOffsetEffect(0.0f, 0.0f) : RenderEffect.createBlurEffect(f, f2, sb.e0(3));
    }

    public final int hashCode() {
        return Integer.hashCode(3) + az2.c(this.c, Float.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        return "BlurEffect(renderEffect=null, radiusX=" + this.b + ", radiusY=" + this.c + ", edgeTreatment=" + ((Object) u83.h(3)) + ')';
    }
}
