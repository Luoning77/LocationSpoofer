package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class uk3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ al3 a;
    public final /* synthetic */ ql3 b;
    public final /* synthetic */ ql3 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public uk3(al3 al3Var, ql3 ql3Var, ql3 ql3Var2, int i, View view) {
        this.a = al3Var;
        this.b = ql3Var;
        this.c = ql3Var2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        fl3 cl3Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        al3 al3Var = this.a;
        zk3 zk3Var = al3Var.a;
        zk3Var.e(animatedFraction);
        float fC = zk3Var.c();
        PathInterpolator pathInterpolator = wk3.e;
        int i = Build.VERSION.SDK_INT;
        ql3 ql3Var = this.b;
        if (i >= 34) {
            cl3Var = new el3(ql3Var);
        } else if (i >= 30) {
            cl3Var = new dl3(ql3Var);
        } else {
            cl3Var = i >= 29 ? new cl3(ql3Var) : new bl3(ql3Var);
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            nl3 nl3Var = ql3Var.a;
            if (i3 == 0) {
                cl3Var.c(i2, nl3Var.g(i2));
            } else {
                j31 j31VarG = nl3Var.g(i2);
                j31 j31VarG2 = this.c.a.g(i2);
                float f = 1.0f - fC;
                cl3Var.c(i2, ql3.a(j31VarG, (int) (((double) ((j31VarG.a - j31VarG2.a) * f)) + 0.5d), (int) (((double) ((j31VarG.b - j31VarG2.b) * f)) + 0.5d), (int) (((double) ((j31VarG.c - j31VarG2.c) * f)) + 0.5d), (int) (((double) ((j31VarG.d - j31VarG2.d) * f)) + 0.5d)));
            }
        }
        wk3.h(this.e, cl3Var.b(), Collections.singletonList(al3Var));
    }
}
