package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.android.HandlerDispatcherKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class y extends ViewGroup {
    public WeakReference e;
    public IBinder f;
    public qm3 g;
    public o30 h;
    public a30 i;
    public zd2 j;
    public boolean k;
    public boolean l;
    public boolean m;

    public y(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        rd rdVar = new rd(this, 3);
        addOnAttachStateChangeListener(rdVar);
        b81 b81Var = new b81(27);
        ce0.C(this).a.add(b81Var);
        this.j = new zd2(this, rdVar, b81Var, 1);
    }

    private final void setParentContext(o30 o30Var) {
        if (this.h != o30Var) {
            this.h = o30Var;
            if (o30Var != null) {
                this.e = null;
            }
            qm3 qm3Var = this.g;
            if (qm3Var != null) {
                qm3Var.a();
                this.g = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f != iBinder) {
            this.f = iBinder;
            this.e = null;
        }
    }

    public abstract void a(int i, f30 f30Var);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void b() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.i == null) {
                db dbVar = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof db) {
                        dbVar = (db) childAt;
                    }
                }
                if (dbVar != null) {
                    dbVar.setComposeViewContext(l(am1.q(this), dbVar.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                f();
            }
        }
    }

    public final void c() {
        if (this.l) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void d() {
        a30 a30Var;
        if (this.h != null || isAttachedToWindow() || ((a30Var = this.i) != null && a30Var.a.isAttachedToWindow())) {
            f();
        } else {
            fo.n("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        }
    }

    public final void e() {
        View childAt = getChildAt(0);
        db dbVar = childAt instanceof db ? (db) childAt : null;
        if (dbVar != null && dbVar.N0) {
            dbVar.getComposeViewContext().b();
            dbVar.N0 = false;
        }
        qm3 qm3Var = this.g;
        if (qm3Var != null) {
            qm3Var.a();
        }
        this.g = null;
        requestLayout();
    }

    public final void f() {
        if (this.g == null) {
            int i = 0;
            try {
                this.l = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    a30 a30VarJ = this.i;
                    if (a30VarJ == null) {
                        a30VarJ = j();
                    }
                    this.g = sm3.a(this, a30VarJ, new p10(new x(this, i), true, 1003123809));
                    Trace.endSection();
                    this.l = false;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                this.l = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m104getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(2131230788);
        ip ipVar = tag instanceof ip ? (ip) tag : null;
        if (ipVar != null) {
            return ipVar.a;
        }
        return 1;
    }

    public final a30 getComposeViewContext$ui() {
        return this.i;
    }

    public final boolean getHasComposition() {
        return this.g != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.k;
    }

    public void h(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public void i(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.m || super.isTransitionGroup();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    public final a30 j() {
        a30 composeViewContext;
        pj3 pj3Var;
        if (getChildCount() == 0) {
            composeViewContext = null;
        } else {
            View childAt = getChildAt(0);
            db dbVar = childAt instanceof db ? (db) childAt : null;
            if (dbVar != null) {
                composeViewContext = dbVar.getComposeViewContext();
            } else {
                composeViewContext = null;
            }
        }
        View viewQ = am1.q(this);
        a30 a30VarW = am1.w(viewQ);
        if (a30VarW != null) {
            return l(viewQ, a30VarW);
        }
        o30 o30VarK = k();
        df1 df1VarC = a83.c(viewQ);
        if (df1VarC == null) {
            df1VarC = composeViewContext != null ? composeViewContext.c : null;
            if (df1VarC == null) {
                fo.n("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return null;
            }
        }
        df1 df1Var = df1VarC;
        tm2 tm2VarB = g83.b(viewQ);
        if (tm2VarB == null) {
            tm2VarB = composeViewContext != null ? composeViewContext.d : null;
            if (tm2VarB == null) {
                fo.n("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return null;
            }
        }
        tm2 tm2Var = tm2VarB;
        pj3 pj3VarD = u83.d(viewQ);
        if (pj3VarD == null) {
            pj3Var = composeViewContext != null ? composeViewContext.e : null;
        } else {
            pj3Var = pj3VarD;
        }
        a30 a30Var = new a30(am1.w(am1.q(viewQ)), viewQ, o30VarK, df1Var, tm2Var, pj3Var);
        viewQ.setTag(2131230784, new WeakReference(a30Var));
        return a30Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final o30 k() {
        ke2 ke2Var;
        y70 y70Var;
        sg sgVar;
        Object objF;
        o30 o30VarA = this.h;
        if (o30VarA == null) {
            o30VarA = km3.a(this);
            if (o30VarA == null) {
                ViewParent parent = getParent();
                while (true) {
                    if (o30VarA != null || !(objF instanceof View)) {
                        objF = parent;
                        break;
                    }
                    objF = parent;
                    View view = (View) objF;
                    o30VarA = km3.a(view);
                    objF = q73.f(view);
                }
            }
            boolean z = false;
            if (o30VarA != null) {
                o30 o30Var = (!(o30VarA instanceof ke2) || ((ie2) ((ke2) o30VarA).u.getValue()).compareTo(ie2.f) > 0) ? o30VarA : null;
                if (o30Var != null) {
                    this.e = new WeakReference(o30Var);
                }
            } else {
                o30VarA = null;
            }
            if (o30VarA == null) {
                WeakReference weakReference = this.e;
                if (weakReference == null || (o30VarA = (o30) weakReference.get()) == null || ((o30VarA instanceof ke2) && ((ie2) ((ke2) o30VarA).u.getValue()).compareTo(ie2.f) <= 0)) {
                    o30VarA = null;
                }
                if (o30VarA == null) {
                    if (!isAttachedToWindow()) {
                        p21.c("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    View view2 = this;
                    Object parent2 = q73.f(this);
                    while (parent2 instanceof View) {
                        View view3 = (View) parent2;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent2 = view3.getParent();
                    }
                    o30 o30VarA2 = km3.a(view2);
                    if (o30VarA2 == null) {
                        ((em3) gm3.a.get()).getClass();
                        y70 y70Var2 = sj0.e;
                        i43 i43Var = qg.o;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            y70Var = (y70) qg.o.getValue();
                        } else {
                            y70Var = (y70) qg.p.get();
                            if (y70Var == null) {
                                fo.n("no AndroidUiDispatcher for this thread");
                                return null;
                            }
                        }
                        y70 y70VarPlus = y70Var.plus(y70Var2);
                        sg sgVar2 = (sg) y70VarPlus.get(j9.U);
                        if (sgVar2 != null) {
                            sgVar = new sg(sgVar2);
                            ha1 ha1Var = (ha1) sgVar.g;
                            synchronized (ha1Var.b) {
                                ha1Var.a = false;
                            }
                        } else {
                            sgVar = null;
                        }
                        we2 we2Var = new we2();
                        y70 mv1Var = (lv1) y70VarPlus.get(j9.V);
                        if (mv1Var == null) {
                            mv1Var = new mv1(view2.getContext().getApplicationContext());
                            we2Var.e = mv1Var;
                        }
                        if (sgVar != null) {
                            y70Var2 = sgVar;
                        }
                        y70 y70VarPlus2 = y70VarPlus.plus(y70Var2).plus(mv1Var);
                        ke2Var = new ke2(y70VarPlus2);
                        synchronized (ke2Var.c) {
                            ke2Var.t = true;
                        }
                        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(y70VarPlus2);
                        df1 df1VarC = a83.c(view2);
                        xe1 lifecycle = df1VarC != null ? df1VarC.getLifecycle() : null;
                        if (lifecycle == null) {
                            p21.d("ViewTreeLifecycleOwner not found from " + view2);
                            fo.d();
                            return null;
                        }
                        view2.addOnAttachStateChangeListener(new hm3(view2, ke2Var));
                        lifecycle.a(new jm3(CoroutineScope, sgVar, ke2Var, we2Var));
                        view2.setTag(2131230785, ke2Var);
                        view2.addOnAttachStateChangeListener(new fm3(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, HandlerDispatcherKt.from(view2.getHandler(), "windowRecomposer cleanup").getImmediate(), null, new wr1(ke2Var, view2, z ? 1 : 0, 17), 2, null)));
                    } else {
                        if (!(o30VarA2 instanceof ke2)) {
                            fo.n("root viewTreeParentCompositionContext is not a Recomposer");
                            return null;
                        }
                        ke2Var = (ke2) o30VarA2;
                    }
                    ke2 ke2Var2 = ((ie2) ke2Var.u.getValue()).compareTo(ie2.f) > 0 ? ke2Var : null;
                    if (ke2Var2 != null) {
                        this.e = new WeakReference(ke2Var2);
                    }
                    return ke2Var;
                }
            }
        }
        return o30VarA;
    }

    public final a30 l(View view, a30 a30Var) {
        o30 o30VarK = k();
        df1 df1VarC = a83.c(view);
        pj3 pj3VarD = u83.d(view);
        tm2 tm2VarB = g83.b(view);
        o30 o30Var = a30Var.b;
        tm2 tm2Var = a30Var.d;
        df1 df1Var = a30Var.c;
        if (o30VarK == o30Var && df1VarC == df1Var && pj3VarD == a30Var.e && tm2VarB == tm2Var) {
            return a30Var;
        }
        if (o30VarK.j() != a30Var.b.j()) {
            e();
        }
        if (df1VarC == null) {
            df1VarC = df1Var;
        }
        a30 a30Var2 = new a30(a30Var, view, o30VarK, df1VarC, tm2VarB == null ? tm2Var : tm2VarB, pj3VarD);
        view.setTag(2131230784, new WeakReference(a30Var2));
        return a30Var2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        zx1 zx1Var = km3.a;
        Object objF = q73.f(this);
        View view = this;
        while (objF instanceof View) {
            View view2 = (View) objF;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            objF = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new w(this, 0));
        } else {
            b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        h(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        f();
        i(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m105setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(2131230788, new ip(i));
    }

    public final void setComposeViewContext$ui(a30 a30Var) {
        if (this.i != a30Var) {
            if (a30Var == null) {
                e();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                db dbVar = childAt instanceof db ? (db) childAt : null;
                if (dbVar != null) {
                    if (dbVar.getCoroutineContext() != a30Var.b.j()) {
                        e();
                    }
                    dbVar.setComposeViewContext(a30Var);
                }
            }
            this.i = a30Var;
        }
    }

    public final void setParentCompositionContext(o30 o30Var) {
        setParentContext(o30Var);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.k = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((db) ((t42) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.m = true;
    }

    public final void setViewCompositionStrategy(zi3 zi3Var) {
        zd2 zd2Var = this.j;
        if (zd2Var != null) {
            zd2Var.invoke();
        }
        ((v63) zi3Var).getClass();
        rd rdVar = new rd(this, 3);
        addOnAttachStateChangeListener(rdVar);
        b81 b81Var = new b81(27);
        ce0.C(this).a.add(b81Var);
        this.j = new zd2(this, rdVar, b81Var, 1);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        c();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        c();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        c();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i, layoutParams);
    }

    public static /* synthetic */ void getComposeViewContext$ui$annotations() {
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
