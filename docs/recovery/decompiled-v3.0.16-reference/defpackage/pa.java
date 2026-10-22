package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class pa extends cv1 implements bt, hs2, i91, ya1, tc3 {
    public final q9 s = new q9(this, 2);
    public final /* synthetic */ db t;

    public pa(db dbVar) {
        this.t = dbVar;
    }

    @Override // defpackage.i91
    public final boolean C(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.bt
    public final Object E0(xz1 xz1Var, ta taVar, r60 r60Var) {
        long jH0 = xz1Var.h0(0L);
        pe2 pe2Var = (pe2) taVar.invoke();
        pe2 pe2VarJ = pe2Var != null ? pe2Var.j(jH0) : null;
        if (pe2VarJ != null) {
            this.t.requestRectangleOnScreen(new Rect((int) pe2VarJ.a, (int) pe2VarJ.b, (int) pe2VarJ.c, (int) pe2VarJ.d), false);
        }
        return mf3.a;
    }

    @Override // defpackage.tc3
    public final Object H() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // defpackage.ya1
    public final fr1 s(gr1 gr1Var, zq1 zq1Var, long j) {
        h82 h82VarS = zq1Var.s(j);
        return gr1Var.m0(h82VarS.e, h82VarS.f, vj0.e, this.s, new oa(h82VarS, 0));
    }

    @Override // defpackage.i91
    public final boolean s0(KeyEvent keyEvent) {
        ep0 ep0Var;
        int[] iArr = lp0.a;
        long jI = mh0.I(keyEvent);
        if (c91.a(jI, c91.b)) {
            ep0Var = new ep0(2);
        } else if (c91.a(jI, c91.c)) {
            ep0Var = new ep0(1);
        } else if (c91.a(jI, c91.p)) {
            ep0Var = new ep0(keyEvent.isShiftPressed() ? 2 : 1);
        } else if (c91.a(jI, c91.g)) {
            ep0Var = new ep0(4);
        } else if (c91.a(jI, c91.f)) {
            ep0Var = new ep0(3);
        } else if (c91.a(jI, c91.d) || c91.a(jI, c91.C)) {
            ep0Var = new ep0(5);
        } else if (c91.a(jI, c91.e) || c91.a(jI, c91.D)) {
            ep0Var = new ep0(6);
        } else if (c91.a(jI, c91.h) || c91.a(jI, c91.r) || c91.a(jI, c91.E)) {
            ep0Var = new ep0(7);
        } else {
            ep0Var = (c91.a(jI, c91.a) || c91.a(jI, c91.u)) ? new ep0(8) : null;
        }
        if (ep0Var != null) {
            int i = ep0Var.a;
            if (mh0.L(keyEvent) == 2) {
                db dbVar = this.t;
                dq0 dq0VarG = ((rp0) dbVar.getFocusOwner()).g();
                if (dq0VarG == null || !dq0VarG.s || !dbVar.t(i)) {
                    Boolean boolF = ((rp0) dbVar.getFocusOwner()).f(i, dbVar.getEmbeddedViewFocusRect(), new q9(ep0Var, 1));
                    if (!(boolF != null ? boolF.booleanValue() : true)) {
                        if (i == 1 || i == 2) {
                            Integer numC = lp0.c(i);
                            int iIntValue = numC != null ? numC.intValue() : 2;
                            FocusFinder focusFinder = FocusFinder.getInstance();
                            View rootView = dbVar.getRootView();
                            rootView.getClass();
                            View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, dbVar.getView(), iIntValue);
                            if (viewFindNextFocus == null || viewFindNextFocus.equals(dbVar)) {
                                return ((rp0) dbVar.getFocusOwner()).i(i);
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hs2
    public final void J0(ss2 ss2Var) {
    }
}
