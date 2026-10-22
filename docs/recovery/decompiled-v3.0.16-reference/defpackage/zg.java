package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zg implements er1 {
    public final /* synthetic */ bj3 a;
    public final /* synthetic */ hb1 b;

    public zg(bj3 bj3Var, hb1 hb1Var) {
        this.a = bj3Var;
        this.b = hb1Var;
    }

    @Override // defpackage.er1
    public final int b(g51 g51Var, List list, int i) {
        bj3 bj3Var = this.a;
        ViewGroup.LayoutParams layoutParams = bj3Var.getLayoutParams();
        layoutParams.getClass();
        bj3Var.measure(eh.m(0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return bj3Var.getMeasuredHeight();
    }

    @Override // defpackage.er1
    public final int d(g51 g51Var, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        bj3 bj3Var = this.a;
        ViewGroup.LayoutParams layoutParams = bj3Var.getLayoutParams();
        layoutParams.getClass();
        bj3Var.measure(iMakeMeasureSpec, eh.m(0, i, layoutParams.height));
        return bj3Var.getMeasuredWidth();
    }

    @Override // defpackage.er1
    public final fr1 g(gr1 gr1Var, List list, long j) {
        bj3 bj3Var = this.a;
        int childCount = bj3Var.getChildCount();
        vj0 vj0Var = vj0.e;
        if (childCount == 0) {
            return gr1Var.H0(l50.j(j), l50.i(j), vj0Var, wa.q);
        }
        if (l50.j(j) != 0) {
            bj3Var.getChildAt(0).setMinimumWidth(l50.j(j));
        }
        if (l50.i(j) != 0) {
            bj3Var.getChildAt(0).setMinimumHeight(l50.i(j));
        }
        int iJ = l50.j(j);
        int iH = l50.h(j);
        ViewGroup.LayoutParams layoutParams = bj3Var.getLayoutParams();
        layoutParams.getClass();
        int iM = eh.m(iJ, iH, layoutParams.width);
        int i = l50.i(j);
        int iG = l50.g(j);
        ViewGroup.LayoutParams layoutParams2 = bj3Var.getLayoutParams();
        layoutParams2.getClass();
        bj3Var.measure(iM, eh.m(i, iG, layoutParams2.height));
        return gr1Var.H0(bj3Var.getMeasuredWidth(), bj3Var.getMeasuredHeight(), vj0Var, new xg(bj3Var, this.b, 1));
    }

    @Override // defpackage.er1
    public final int h(g51 g51Var, List list, int i) {
        bj3 bj3Var = this.a;
        ViewGroup.LayoutParams layoutParams = bj3Var.getLayoutParams();
        layoutParams.getClass();
        bj3Var.measure(eh.m(0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return bj3Var.getMeasuredHeight();
    }

    @Override // defpackage.er1
    public final int j(g51 g51Var, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        bj3 bj3Var = this.a;
        ViewGroup.LayoutParams layoutParams = bj3Var.getLayoutParams();
        layoutParams.getClass();
        bj3Var.measure(iMakeMeasureSpec, eh.m(0, i, layoutParams.height));
        return bj3Var.getMeasuredWidth();
    }
}
