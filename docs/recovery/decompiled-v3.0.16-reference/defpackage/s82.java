package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class s82 implements q82 {
    public static final s82 a = new s82();

    @Override // defpackage.q82
    public final boolean a() {
        return false;
    }

    @Override // defpackage.q82
    public final p82 b(View view, boolean z, long j, float f, float f2, boolean z2, xb0 xb0Var, float f3) {
        return new r82(new Magnifier(view));
    }
}
