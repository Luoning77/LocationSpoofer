package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class vk3 implements View.OnApplyWindowInsetsListener {
    public final tk3 a;
    public ql3 b;

    public vk3(View view, tk3 tk3Var) {
        ql3 ql3VarB;
        this.a = tk3Var;
        WeakHashMap weakHashMap = yi3.a;
        ql3 ql3VarA = si3.a(view);
        if (ql3VarA != null) {
            int i = Build.VERSION.SDK_INT;
            ql3VarB = (i >= 34 ? new el3(ql3VarA) : i >= 30 ? new dl3(ql3VarA) : i >= 29 ? new cl3(ql3VarA) : new bl3(ql3VarA)).b();
        } else {
            ql3VarB = null;
        }
        this.b = ql3VarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.b = ql3.c(windowInsets, view);
            return view.getTag(2131230911) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        ql3 ql3VarC = ql3.c(windowInsets, view);
        nl3 nl3Var = ql3VarC.a;
        ql3 ql3VarA = this.b;
        if (ql3VarA == null) {
            WeakHashMap weakHashMap = yi3.a;
            ql3VarA = si3.a(view);
            this.b = ql3VarA;
        }
        if (ql3VarA == null) {
            this.b = ql3VarC;
            if (view.getTag(2131230911) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            tk3 tk3VarJ = wk3.j(view);
            if (tk3VarJ == null || !Objects.equals(tk3VarJ.e, ql3VarC)) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                ql3 ql3Var = this.b;
                int i = 1;
                while (i <= 512) {
                    j31 j31VarG = nl3Var.g(i);
                    j31 j31VarG2 = ql3Var.a.g(i);
                    int i2 = j31VarG.a;
                    int i3 = j31VarG.d;
                    int i4 = j31VarG.c;
                    int i5 = j31VarG.b;
                    int i6 = j31VarG2.a;
                    int i7 = j31VarG2.d;
                    int[] iArr3 = iArr;
                    int i8 = j31VarG2.c;
                    int i9 = j31VarG2.b;
                    boolean z = i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7;
                    if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                        if (z) {
                            iArr3[0] = iArr3[0] | i;
                        } else {
                            iArr2[0] = iArr2[0] | i;
                        }
                    }
                    i <<= 1;
                    iArr = iArr3;
                    iArr2 = iArr2;
                }
                int i10 = iArr[0];
                int i11 = iArr2[0];
                int i12 = i10 | i11;
                if (i12 == 0) {
                    this.b = ql3VarC;
                    if (view.getTag(2131230911) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    ql3 ql3Var2 = this.b;
                    if ((i10 & 8) != 0) {
                        interpolator = wk3.e;
                    } else if ((i11 & 8) != 0) {
                        interpolator = wk3.f;
                    } else if ((i10 & 519) != 0) {
                        interpolator = wk3.g;
                    } else {
                        interpolator = (i11 & 519) != 0 ? wk3.h : null;
                    }
                    al3 al3Var = new al3(i12, interpolator, (i12 & 8) != 0 ? 160L : 250L);
                    al3Var.a.e(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(al3Var.a.b());
                    j31 j31VarG3 = nl3Var.g(i12);
                    j31 j31VarG4 = ql3Var2.a.g(i12);
                    int iMin = Math.min(j31VarG3.a, j31VarG4.a);
                    int i13 = j31VarG3.b;
                    int i14 = j31VarG4.b;
                    int iMin2 = Math.min(i13, i14);
                    int i15 = j31VarG3.c;
                    int i16 = j31VarG4.c;
                    int iMin3 = Math.min(i15, i16);
                    int i17 = j31VarG3.d;
                    int i18 = j31VarG4.d;
                    z92 z92Var = new z92(10, j31.b(iMin, iMin2, iMin3, Math.min(i17, i18)), j31.b(Math.max(j31VarG3.a, j31VarG4.a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)));
                    wk3.g(view, al3Var, ql3VarC, false);
                    duration.addUpdateListener(new uk3(al3Var, ql3VarC, ql3Var2, i12, view));
                    duration.addListener(new rj3(al3Var, view, 1));
                    gw gwVar = new gw(view, al3Var, z92Var, duration);
                    if (view != null) {
                        h22 h22Var = new h22(view, gwVar);
                        view.getViewTreeObserver().addOnPreDrawListener(h22Var);
                        view.addOnAttachStateChangeListener(h22Var);
                    } else {
                        b81.k("view == null");
                    }
                    this.b = ql3VarC;
                    if (view.getTag(2131230911) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            } else if (view.getTag(2131230911) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }
}
