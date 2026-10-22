package defpackage;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ya2 extends y {
    public final fc0 A;
    public final Rect B;
    public final ky2 C;
    public rj D;
    public final w52 E;
    public boolean F;
    public final int[] G;
    public au0 n;
    public db2 o;
    public String p;
    public final View q;
    public final boolean r;
    public final k91 s;
    public final WindowManager t;
    public final WindowManager.LayoutParams u;
    public cb2 v;
    public qa1 w;
    public final w52 x;
    public final w52 y;
    public l41 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya2(au0 au0Var, db2 db2Var, String str, View view, xb0 xb0Var, cb2 cb2Var, UUID uuid, boolean z) {
        super(view.getContext());
        int i = Build.VERSION.SDK_INT;
        int i2 = 19;
        k91 bb2Var = i >= 30 ? new bb2(i2) : i >= 29 ? new ab2(i2) : new k91(i2);
        this.n = au0Var;
        this.o = db2Var;
        this.p = str;
        this.q = view;
        this.r = z;
        this.s = bb2Var;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.t = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        db2 db2Var2 = this.o;
        boolean zB = jf.b(view);
        boolean z2 = db2Var2.b;
        int i3 = db2Var2.a;
        if (z2 && zB) {
            i3 |= 8192;
        } else if (z2 && !zB) {
            i3 &= -8193;
        }
        layoutParams.flags = i3;
        layoutParams.type = this.o.f;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(2131624377));
        this.u = layoutParams;
        this.v = cb2Var;
        this.w = qa1.e;
        this.x = ke0.H(null);
        this.y = ke0.H(null);
        this.A = by2.b(new ye(this, i2));
        this.B = new Rect();
        this.C = new ky2(new ef(this, 2));
        setId(R.id.content);
        setTag(2131230945, a83.c(view));
        setTag(2131230949, u83.d(view));
        setTag(2131230948, g83.b(view));
        setTag(2131230804, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(xb0Var.R(8.0f));
        setOutlineProvider(new rc0(1));
        this.E = ke0.H(u10.a);
        this.G = new int[2];
    }

    private final pu0 getContent() {
        return (pu0) this.E.getValue();
    }

    private final l41 getDisplayBounds() {
        int i = this.o.a & 512;
        View view = this.q;
        Rect rect = this.B;
        k91 k91Var = this.s;
        if (i == 0) {
            k91Var.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            k91Var.p(view, rect);
        }
        return new l41(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pa1 getParentLayoutCoordinates() {
        return (pa1) this.y.getValue();
    }

    private final void setContent(pu0 pu0Var) {
        this.E.setValue(pu0Var);
    }

    private final void setParentLayoutCoordinates(pa1 pa1Var) {
        this.y.setValue(pa1Var);
    }

    @Override // defpackage.y
    public final void a(int i, f30 f30Var) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-857613600);
        int i2 = (ov0Var.h(this) ? 4 : 2) | i;
        if (ov0Var.T(i2 & 1, (i2 & 3) != 2)) {
            getContent().invoke(ov0Var, 0);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new x(this, i, 7);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.o.c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                au0 au0Var = this.n;
                if (au0Var != null) {
                    au0Var.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.A.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.u;
    }

    public final qa1 getParentLayoutDirection() {
        return this.w;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final p41 m106getPopupContentSizebOM6tXw() {
        return (p41) this.x.getValue();
    }

    public final cb2 getPositionProvider() {
        return this.v;
    }

    @Override // defpackage.y
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.F;
    }

    public final String getTestTag() {
        return this.p;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // defpackage.y
    public final void h(boolean z, int i, int i2, int i3, int i4) {
        super.h(z, i, i2, i3, i4);
        this.o.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.u;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.s.getClass();
        this.t.updateViewLayout(this, layoutParams);
    }

    @Override // defpackage.y
    public final void i(int i, int i2) {
        this.o.getClass();
        l41 displayBounds = getDisplayBounds();
        super.i(View.MeasureSpec.makeMeasureSpec(displayBounds.d(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.b(), Integer.MIN_VALUE));
    }

    public final void n(o30 o30Var, pu0 pu0Var) {
        setParentCompositionContext(o30Var);
        setContent(pu0Var);
        this.F = true;
    }

    public final void o(au0 au0Var, db2 db2Var, String str, qa1 qa1Var) {
        int i;
        this.n = au0Var;
        this.p = str;
        if (!o51.f(this.o, db2Var)) {
            db2Var.getClass();
            this.o = db2Var;
            boolean zB = jf.b(this.q);
            boolean z = db2Var.b;
            int i2 = db2Var.a;
            if (z && zB) {
                i2 |= 8192;
            } else if (z && !zB) {
                i2 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.u;
            layoutParams.flags = i2;
            this.s.getClass();
            this.t.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = qa1Var.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                b81.d();
                return;
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    @Override // defpackage.y, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C.d();
        if (!this.o.c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        rj rjVar = this.D;
        if (rjVar == null) {
            rj rjVar2 = new rj(0, this.n);
            this.D = rjVar2;
            rjVar = rjVar2;
        }
        q1.g(this, rjVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ky2 ky2Var = this.C;
        g8 g8Var = ky2Var.h;
        if (g8Var != null) {
            g8Var.c();
        }
        ky2Var.a();
        if (Build.VERSION.SDK_INT >= 33) {
            q1.h(this, this.D);
        }
        this.D = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.o.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            au0 au0Var = this.n;
            if (au0Var != null) {
                au0Var.invoke();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            au0 au0Var2 = this.n;
            if (au0Var2 != null) {
                au0Var2.invoke();
            }
        }
        return true;
    }

    public final void p() {
        pa1 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.U()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jF0 = parentLayoutCoordinates.f0();
            long jH = this.r ? parentLayoutCoordinates.h(0L) : parentLayoutCoordinates.z(0L);
            l41 l41VarB = mh0.b((((long) Math.round(Float.intBitsToFloat((int) (jH >> 32)))) << 32) | (4294967295L & ((long) Math.round(Float.intBitsToFloat((int) (jH & 4294967295L))))), jF0);
            if (l41VarB.equals(this.z)) {
                return;
            }
            this.z = l41VarB;
            r();
        }
    }

    public final void q(pa1 pa1Var) {
        setParentLayoutCoordinates(pa1Var);
        p();
    }

    public final void r() {
        p41 p41VarM106getPopupContentSizebOM6tXw;
        l41 l41Var = this.z;
        if (l41Var == null || (p41VarM106getPopupContentSizebOM6tXw = m106getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j = p41VarM106getPopupContentSizebOM6tXw.a;
        l41 displayBounds = getDisplayBounds();
        long jB = (((long) displayBounds.b()) & 4294967295L) | (((long) displayBounds.d()) << 32);
        ve2 ve2Var = new ve2();
        ve2Var.e = 0L;
        this.C.c(this, ik0.y, new xa2(ve2Var, this, l41Var, jB, j));
        long j2 = ve2Var.e;
        WindowManager.LayoutParams layoutParams = this.u;
        layoutParams.x = (int) (j2 >> 32);
        layoutParams.y = (int) (j2 & 4294967295L);
        boolean z = this.o.e;
        k91 k91Var = this.s;
        if (z) {
            k91Var.v(this, (int) (jB >> 32), (int) (jB & 4294967295L));
        }
        k91Var.getClass();
        this.t.updateViewLayout(this, layoutParams);
    }

    public final void setParentLayoutDirection(qa1 qa1Var) {
        this.w = qa1Var;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m107setPopupContentSizefhxjrPA(p41 p41Var) {
        this.x.setValue(p41Var);
    }

    public final void setPositionProvider(cb2 cb2Var) {
        this.v = cb2Var;
    }

    public final void setTestTag(String str) {
        this.p = str;
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public y getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}
