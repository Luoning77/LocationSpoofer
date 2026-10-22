package defpackage;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import java.util.Arrays;
import java.util.function.Consumer;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qn2 {
    public final w52 a = ke0.H(Boolean.FALSE);

    public final void a(db dbVar, ms2 ms2Var, y70 y70Var, Consumer consumer) {
        gy1 gy1Var = new gy1(new rn2[16]);
        ee0.K(ms2Var.a(), 0, new pn2(1, 8, gy1.class, gy1Var, "add", "add(Ljava/lang/Object;)Z"));
        Arrays.sort(gy1Var.e, 0, gy1Var.g, new q00(new lu0[]{ik0.A, ik0.B}, 0));
        int i = gy1Var.g;
        rn2 rn2Var = (rn2) (i == 0 ? null : gy1Var.e[i - 1]);
        if (rn2Var == null) {
            return;
        }
        l41 l41Var = rn2Var.c;
        q20 q20Var = new q20(rn2Var.a, l41Var, CoroutineScopeKt.CoroutineScope(y70Var), this, dbVar);
        xz1 xz1Var = rn2Var.d;
        pe2 pe2VarD0 = wc0.F(xz1Var).d0(xz1Var, true);
        long jC = l41Var.c();
        ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(dbVar, vd0.H(mh0.X(pe2VarD0)), new Point((int) (jC >> 32), (int) (jC & 4294967295L)), q20Var);
        scrollCaptureTarget.setScrollBounds(vd0.H(l41Var));
        consumer.accept(scrollCaptureTarget);
    }
}
