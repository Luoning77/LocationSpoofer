package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ip0 extends cv1 implements up0, ViewTreeObserver.OnGlobalFocusChangeListener {
    public View s;
    public ViewTreeObserver t;
    public final hp0 u = new hp0(this, 0);
    public final hp0 v = new hp0(this, 1);

    @Override // defpackage.cv1
    public final void e1() {
        ViewTreeObserver viewTreeObserver = xq1.N(this).getViewTreeObserver();
        this.t = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // defpackage.cv1
    public final void f1() {
        ViewTreeObserver viewTreeObserver = this.t;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.t = null;
        xq1.N(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.s = null;
    }

    public final dq0 m1() {
        boolean z;
        if (!this.e.r) {
            p21.c("visitLocalDescendants called on an unattached node");
        }
        cv1 cv1Var = this.e;
        if ((cv1Var.h & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
            boolean z2 = false;
            for (cv1 cv1Var2 = cv1Var.j; cv1Var2 != null; cv1Var2 = cv1Var2.j) {
                if ((cv1Var2.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                    cv1 cv1VarJ = cv1Var2;
                    gy1 gy1Var = null;
                    while (cv1VarJ != null) {
                        if (cv1VarJ instanceof dq0) {
                            dq0 dq0Var = (dq0) cv1VarJ;
                            if (z2) {
                                return dq0Var;
                            }
                            z = false;
                            z2 = true;
                        } else {
                            z = true;
                        }
                        if (z && (cv1VarJ.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (cv1VarJ instanceof lb0)) {
                            int i = 0;
                            for (cv1 cv1Var3 = ((lb0) cv1VarJ).t; cv1Var3 != null; cv1Var3 = cv1Var3.j) {
                                if ((cv1Var3.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                    i++;
                                    if (i == 1) {
                                        cv1VarJ = cv1Var3;
                                    } else {
                                        if (gy1Var == null) {
                                            gy1Var = new gy1(new cv1[16]);
                                        }
                                        if (cv1VarJ != null) {
                                            gy1Var.b(cv1VarJ);
                                            cv1VarJ = null;
                                        }
                                        gy1Var.b(cv1Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        cv1VarJ = xp1.J(gy1Var);
                    }
                }
            }
        }
        fo.n("Could not find focus target of embedded view wrapper");
        return null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z;
        if (xp1.O(this).s == null) {
            return;
        }
        View viewL = wc0.L(this);
        op0 focusOwner = ((db) xp1.P(this)).getFocusOwner();
        t42 t42VarP = xp1.P(this);
        boolean z2 = true;
        if (view != null && !view.equals(t42VarP)) {
            ViewParent parent = view.getParent();
            while (true) {
                if (parent == null) {
                    z = false;
                    break;
                } else {
                    if (parent == viewL.getParent()) {
                        z = true;
                        break;
                    }
                    parent = parent.getParent();
                }
            }
        } else {
            z = false;
            break;
        }
        if (view2 != null && !view2.equals(t42VarP)) {
            ViewParent parent2 = view2.getParent();
            while (true) {
                if (parent2 == null) {
                    z2 = false;
                    break;
                } else if (parent2 == viewL.getParent()) {
                    break;
                } else {
                    parent2 = parent2.getParent();
                }
            }
        } else {
            z2 = false;
            break;
        }
        if (z && z2) {
            this.s = view2;
            return;
        }
        if (z2) {
            this.s = view2;
            dq0 dq0VarM1 = m1();
            if (dq0VarM1.r1().a()) {
                return;
            }
            ld0.I(dq0VarM1);
            return;
        }
        if (!z) {
            this.s = null;
            return;
        }
        this.s = null;
        if (m1().r1().b()) {
            ((rp0) focusOwner).c(8, false, false);
        }
    }

    @Override // defpackage.up0
    public final void r0(sp0 sp0Var) {
        sp0Var.d(false);
        sp0Var.b(this.u);
        sp0Var.a(this.v);
    }
}
