package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class u82 implements q82 {
    public static final u82 a = new u82();

    @Override // defpackage.q82
    public final boolean a() {
        return true;
    }

    @Override // defpackage.q82
    public final p82 b(View view, boolean z, long j, float f, float f2, boolean z2, xb0 xb0Var, float f3) {
        if (z) {
            return new t82(new Magnifier(view));
        }
        long jA0 = xb0Var.A0(j);
        float fR = xb0Var.R(f);
        float fR2 = xb0Var.R(f2);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jA0 != 9205357640488583168L) {
            builder.setSize(xq1.P(Float.intBitsToFloat((int) (jA0 >> 32))), xq1.P(Float.intBitsToFloat((int) (jA0 & 4294967295L))));
        }
        if (!Float.isNaN(fR)) {
            builder.setCornerRadius(fR);
        }
        if (!Float.isNaN(fR2)) {
            builder.setElevation(fR2);
        }
        if (!Float.isNaN(f3)) {
            builder.setInitialZoom(f3);
        }
        builder.setClippingEnabled(z2);
        return new t82(builder.build());
    }
}
