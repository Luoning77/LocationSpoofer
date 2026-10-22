package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class rr0 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float e;
    public final int f;
    public final int g;
    public final View h;
    public qr0 i;
    public qr0 j;
    public boolean k;
    public int l;
    public final int[] m = new int[2];

    public rr0(View view) {
        this.h = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f = tapTimeout;
        this.g = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        qr0 qr0Var = this.j;
        View view = this.h;
        if (qr0Var != null) {
            view.removeCallbacks(qr0Var);
        }
        qr0 qr0Var2 = this.i;
        if (qr0Var2 != null) {
            view.removeCallbacks(qr0Var2);
        }
    }

    public abstract rv2 b();

    public abstract boolean c();

    public boolean d() {
        rv2 rv2VarB = b();
        if (rv2VarB == null || !rv2VarB.a()) {
            return true;
        }
        rv2VarB.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        vg0 vg0VarH;
        boolean z2 = this.k;
        View view2 = this.h;
        if (z2) {
            rv2 rv2VarB = b();
            if (rv2VarB != null && rv2VarB.a() && (vg0VarH = rv2VarB.h()) != null && vg0VarH.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.m;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                vg0VarH.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = vg0VarH.b(motionEventObtainNoHistory, this.l);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z3) {
                    z = true;
                } else if (d()) {
                    z = false;
                } else {
                    z = true;
                }
            } else if (d()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.l = motionEvent.getPointerId(0);
                    qr0 qr0Var = this.i;
                    if (qr0Var == null) {
                        qr0Var = new qr0(this, 0);
                        this.i = qr0Var;
                    }
                    view2.postDelayed(qr0Var, this.f);
                    qr0 qr0Var2 = this.j;
                    if (qr0Var2 == null) {
                        qr0Var2 = new qr0(this, 1);
                        this.j = qr0Var2;
                    }
                    view2.postDelayed(qr0Var2, this.g);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.l);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f = this.e;
                        float f2 = -f;
                        if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                            a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (c()) {
                                z = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
                z = false;
            } else {
                z = false;
            }
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.k = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.k = false;
        this.l = -1;
        qr0 qr0Var = this.i;
        if (qr0Var != null) {
            this.h.removeCallbacks(qr0Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
