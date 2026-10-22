package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class pk3 extends r6 implements x6 {
    public static final AccelerateInterpolator y = new AccelerateInterpolator();
    public static final DecelerateInterpolator z = new DecelerateInterpolator();
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public x90 e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public ok3 i;
    public ok3 j;
    public d31 k;
    public boolean l;
    public final ArrayList m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public tj3 s;
    public boolean t;
    public boolean u;
    public final nk3 v;
    public final nk3 w;
    public final us1 x;

    public pk3(Activity activity, boolean z2) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new nk3(this, 0);
        this.w = new nk3(this, 1);
        this.x = new us1(this, 28);
        View decorView = activity.getWindow().getDecorView();
        q(decorView);
        if (z2) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    @Override // defpackage.r6
    public final boolean b() {
        bb3 bb3Var;
        x90 x90Var = this.e;
        if (x90Var == null || (bb3Var = ((jb3) x90Var).a.Q) == null || bb3Var.f == null) {
            return false;
        }
        bb3 bb3Var2 = ((jb3) x90Var).a.Q;
        vs1 vs1Var = bb3Var2 == null ? null : bb3Var2.f;
        if (vs1Var == null) {
            return true;
        }
        vs1Var.collapseActionView();
        return true;
    }

    @Override // defpackage.r6
    public final void c(boolean z2) {
        if (z2 == this.l) {
            return;
        }
        this.l = z2;
        ArrayList arrayList = this.m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        b81.u();
    }

    @Override // defpackage.r6
    public final int d() {
        return ((jb3) this.e).b;
    }

    @Override // defpackage.r6
    public final Context e() {
        Context context = this.b;
        if (context != null) {
            return context;
        }
        TypedValue typedValue = new TypedValue();
        this.a.getTheme().resolveAttribute(2130903050, typedValue, true);
        int i = typedValue.resourceId;
        if (i != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.a, i);
            this.b = contextThemeWrapper;
            return contextThemeWrapper;
        }
        Context context2 = this.a;
        this.b = context2;
        return context2;
    }

    @Override // defpackage.r6
    public final void g() {
        r(this.a.getResources().getBoolean(2130968576));
    }

    @Override // defpackage.r6
    public final boolean i(int i, KeyEvent keyEvent) {
        ms1 ms1Var;
        ok3 ok3Var = this.i;
        if (ok3Var == null || (ms1Var = ok3Var.h) == null) {
            return false;
        }
        ms1Var.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return ms1Var.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.r6
    public final void l(boolean z2) {
        if (this.h) {
            return;
        }
        int i = z2 ? 4 : 0;
        jb3 jb3Var = (jb3) this.e;
        int i2 = jb3Var.b;
        this.h = true;
        jb3Var.a((i & 4) | (i2 & (-5)));
    }

    @Override // defpackage.r6
    public final void m(boolean z2) {
        tj3 tj3Var;
        this.t = z2;
        if (z2 || (tj3Var = this.s) == null) {
            return;
        }
        tj3Var.a();
    }

    @Override // defpackage.r6
    public final void n(CharSequence charSequence) {
        jb3 jb3Var = (jb3) this.e;
        if (jb3Var.g) {
            return;
        }
        Toolbar toolbar = jb3Var.a;
        jb3Var.h = charSequence;
        if ((jb3Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (jb3Var.g) {
                yi3.k(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // defpackage.r6
    public final l7 o(d31 d31Var) {
        ok3 ok3Var = this.i;
        if (ok3Var != null) {
            ok3Var.a();
        }
        this.c.setHideOnContentScrollEnabled(false);
        this.f.e();
        ok3 ok3Var2 = new ok3(this, this.f.getContext(), d31Var);
        ms1 ms1Var = ok3Var2.h;
        ms1Var.w();
        try {
            boolean zI = ((k7) ok3Var2.i.f).i(ok3Var2, ms1Var);
            ms1Var.v();
            if (!zI) {
                return null;
            }
            this.i = ok3Var2;
            ok3Var2.h();
            this.f.c(ok3Var2);
            p(true);
            return ok3Var2;
        } catch (Throwable th) {
            ms1Var.v();
            throw th;
        }
    }

    public final void p(boolean z2) {
        sj3 sj3VarI;
        sj3 sj3VarI2;
        boolean z3 = this.q;
        if (z2) {
            if (!z3) {
                this.q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                s(false);
            }
        } else if (z3) {
            this.q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            s(false);
        }
        ActionBarContainer actionBarContainer = this.d;
        WeakHashMap weakHashMap = yi3.a;
        boolean zIsLaidOut = actionBarContainer.isLaidOut();
        x90 x90Var = this.e;
        if (!zIsLaidOut) {
            if (z2) {
                ((jb3) x90Var).a.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                ((jb3) x90Var).a.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            jb3 jb3Var = (jb3) x90Var;
            sj3VarI = yi3.a(jb3Var.a);
            sj3VarI.a(0.0f);
            sj3VarI.c(100L);
            sj3VarI.d(new ib3(jb3Var, 4));
            sj3VarI2 = this.f.i(0, 200L);
        } else {
            jb3 jb3Var2 = (jb3) x90Var;
            sj3 sj3VarA = yi3.a(jb3Var2.a);
            sj3VarA.a(1.0f);
            sj3VarA.c(200L);
            sj3VarA.d(new ib3(jb3Var2, 0));
            sj3VarI = this.f.i(8, 100L);
            sj3VarI2 = sj3VarA;
        }
        tj3 tj3Var = new tj3();
        ArrayList arrayList = tj3Var.a;
        arrayList.add(sj3VarI);
        View view = (View) sj3VarI.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) sj3VarI2.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(sj3VarI2);
        tj3Var.b();
    }

    public final void q(View view) {
        x90 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(2131230810);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(2131230759);
        if (callbackFindViewById instanceof x90) {
            wrapper = (x90) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(2131230767);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(2131230761);
        this.d = actionBarContainer;
        x90 x90Var = this.e;
        if (x90Var == null || this.f == null || actionBarContainer == null) {
            fo.n(pk3.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((jb3) x90Var).a.getContext();
        this.a = context;
        if ((((jb3) this.e).b & 4) != 0) {
            this.h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        r(context.getResources().getBoolean(2130968576));
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(null, jd2.a, 2130903045, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (!actionBarOverlayLayout2.l) {
                fo.n("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.u = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap = yi3.a;
            ri3.g(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void r(boolean z2) {
        if (z2) {
            this.d.setTabContainer(null);
            ((jb3) this.e).getClass();
        } else {
            ((jb3) this.e).getClass();
            this.d.setTabContainer(null);
        }
        this.e.getClass();
        ((jb3) this.e).a.setCollapsible(false);
        this.c.setHasNonEmbeddedTabs(false);
    }

    public final void s(boolean z2) {
        boolean z3 = this.q || !this.p;
        boolean z4 = this.r;
        final us1 us1Var = this.x;
        View view = this.g;
        if (!z3) {
            if (z4) {
                this.r = false;
                tj3 tj3Var = this.s;
                if (tj3Var != null) {
                    tj3Var.a();
                }
                int i = this.n;
                nk3 nk3Var = this.v;
                if (i != 0 || (!this.t && !z2)) {
                    nk3Var.a();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                tj3 tj3Var2 = new tj3();
                float f = -this.d.getHeight();
                if (z2) {
                    int[] iArr = {0, 0};
                    this.d.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                sj3 sj3VarA = yi3.a(this.d);
                sj3VarA.e(f);
                final View view2 = (View) sj3VarA.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(us1Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: qj3
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((pk3) us1Var.f).d.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z5 = tj3Var2.e;
                ArrayList arrayList = tj3Var2.a;
                if (!z5) {
                    arrayList.add(sj3VarA);
                }
                if (this.o && view != null) {
                    sj3 sj3VarA2 = yi3.a(view);
                    sj3VarA2.e(f);
                    if (!tj3Var2.e) {
                        arrayList.add(sj3VarA2);
                    }
                }
                boolean z6 = tj3Var2.e;
                if (!z6) {
                    tj3Var2.c = y;
                }
                if (!z6) {
                    tj3Var2.b = 250L;
                }
                if (!z6) {
                    tj3Var2.d = nk3Var;
                }
                this.s = tj3Var2;
                tj3Var2.b();
                return;
            }
            return;
        }
        if (z4) {
            return;
        }
        this.r = true;
        tj3 tj3Var3 = this.s;
        if (tj3Var3 != null) {
            tj3Var3.a();
        }
        this.d.setVisibility(0);
        int i2 = this.n;
        nk3 nk3Var2 = this.w;
        if (i2 == 0 && (this.t || z2)) {
            this.d.setTranslationY(0.0f);
            float f2 = -this.d.getHeight();
            if (z2) {
                int[] iArr2 = {0, 0};
                this.d.getLocationInWindow(iArr2);
                f2 -= iArr2[1];
            }
            this.d.setTranslationY(f2);
            tj3 tj3Var4 = new tj3();
            sj3 sj3VarA3 = yi3.a(this.d);
            sj3VarA3.e(0.0f);
            final View view3 = (View) sj3VarA3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(us1Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: qj3
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((pk3) us1Var.f).d.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z7 = tj3Var4.e;
            ArrayList arrayList2 = tj3Var4.a;
            if (!z7) {
                arrayList2.add(sj3VarA3);
            }
            if (this.o && view != null) {
                view.setTranslationY(f2);
                sj3 sj3VarA4 = yi3.a(view);
                sj3VarA4.e(0.0f);
                if (!tj3Var4.e) {
                    arrayList2.add(sj3VarA4);
                }
            }
            boolean z8 = tj3Var4.e;
            if (!z8) {
                tj3Var4.c = z;
            }
            if (!z8) {
                tj3Var4.b = 250L;
            }
            if (!z8) {
                tj3Var4.d = nk3Var2;
            }
            this.s = tj3Var4;
            tj3Var4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.o && view != null) {
                view.setTranslationY(0.0f);
            }
            nk3Var2.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = yi3.a;
            pi3.c(actionBarOverlayLayout);
        }
    }

    public pk3(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new nk3(this, 0);
        this.w = new nk3(this, 1);
        this.x = new us1(this, 28);
        q(dialog.getWindow().getDecorView());
    }
}
