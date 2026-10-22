package defpackage;

import android.R;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class sc0 extends k10 {
    public au0 h;
    public qc0 i;
    public final View j;
    public final pc0 k;
    public boolean l;

    public sc0(au0 au0Var, qc0 qc0Var, View view, qa1 qa1Var, xb0 xb0Var, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), qc0Var.e ? 2131689633 : 2131689636), 0);
        this.h = au0Var;
        this.i = qc0Var;
        this.j = view;
        Window window = getWindow();
        if (window == null) {
            fo.n("Dialog has no window");
            throw null;
        }
        qc0 qc0Var2 = this.i;
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.type = qc0Var2.g;
            window2.setAttributes(attributes);
        }
        int i = 1;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        v63.f(window, this.i.e);
        window.setGravity(17);
        if (!this.i.e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 28) {
                oj.a.a(attributes2);
            }
            if (i2 >= 30) {
                pj pjVar = pj.a;
                pjVar.b(attributes2, 0);
                pjVar.c(attributes2, 0);
            }
            window.setAttributes(attributes2);
        }
        pc0 pc0Var = new pc0(getContext(), window);
        setTitle(this.i.f);
        pc0Var.setTag(2131230804, "Dialog:" + uuid);
        pc0Var.setClipChildren(false);
        pc0Var.setElevation(xb0Var.R(8.0f));
        pc0Var.setOutlineProvider(new rc0(0));
        this.k = pc0Var;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            d(viewGroup);
        }
        setContentView(pc0Var);
        pc0Var.setTag(2131230945, a83.c(view));
        pc0Var.setTag(2131230949, u83.d(view));
        pc0Var.setTag(2131230948, g83.b(view));
        e(this.h, this.i, qa1Var);
        x12 x12Var = this.g;
        hc hcVar = new hc(this, i);
        x12Var.getClass();
        x12Var.a(this, new as0(hcVar));
    }

    public static final void d(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof pc0) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                d(viewGroup2);
            }
        }
    }

    public final void e(au0 au0Var, qc0 qc0Var, qa1 qa1Var) {
        int i;
        this.h = au0Var;
        this.i = qc0Var;
        ip2 ip2Var = qc0Var.c;
        boolean zB = jf.b(this.j);
        int iOrdinal = ip2Var.ordinal();
        int i2 = 0;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zB = true;
            } else {
                if (iOrdinal != 2) {
                    b81.d();
                    return;
                }
                zB = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(zB ? 8192 : -8193, 8192);
        int iOrdinal2 = qa1Var.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else {
            if (iOrdinal2 != 1) {
                b81.d();
                return;
            }
            i = 1;
        }
        pc0 pc0Var = this.k;
        pc0Var.setLayoutDirection(i);
        boolean z = qc0Var.e;
        boolean z2 = qc0Var.d;
        Window window2 = pc0Var.n;
        boolean z3 = (pc0Var.r && z2 == pc0Var.p && z == pc0Var.q) ? false : true;
        pc0Var.p = z2;
        pc0Var.q = z;
        if (z3) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i3 = z2 ? -2 : -1;
            if (i3 != attributes.width || !pc0Var.r) {
                window2.setLayout(i3, -2);
                pc0Var.r = true;
            }
        }
        setCanceledOnTouchOutside(qc0Var.b);
        Window window3 = getWindow();
        if (window3 != null) {
            if (!z) {
                i2 = Build.VERSION.SDK_INT < 31 ? 16 : 48;
            }
            window3.setSoftInputMode(i2);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.i.a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.h.invoke();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked;
        View childAt;
        int iP;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.i.b) {
            actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
            }
            this.l = false;
            return zOnTouchEvent;
        }
        pc0 pc0Var = this.k;
        pc0Var.getClass();
        if (Math.abs(motionEvent.getX()) <= Float.MAX_VALUE && Math.abs(motionEvent.getY()) <= Float.MAX_VALUE && (childAt = pc0Var.getChildAt(0)) != null) {
            int left = childAt.getLeft() + pc0Var.getLeft();
            int width = childAt.getWidth() + left;
            int top = childAt.getTop() + pc0Var.getTop();
            int height = childAt.getHeight() + top;
            int iP2 = xq1.P(motionEvent.getX());
            if (left <= iP2 && iP2 <= width && top <= (iP = xq1.P(motionEvent.getY())) && iP <= height) {
                actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0 || actionMasked == 1 || actionMasked == 3) {
                    this.l = false;
                    return zOnTouchEvent;
                }
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0) {
            this.l = true;
            return true;
        }
        if (actionMasked2 != 1) {
            if (actionMasked2 == 3) {
                this.l = false;
                return zOnTouchEvent;
            }
        } else if (this.l) {
            this.h.invoke();
            this.l = false;
            return true;
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
