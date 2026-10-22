package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class pc0 extends y implements n12 {
    public final Window n;
    public final w52 o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;

    public pc0(Context context, Window window) {
        super(context);
        this.n = window;
        this.o = ke0.H(t10.a);
        WeakHashMap weakHashMap = yi3.a;
        ri3.h(this, this);
        al3.a(this, new wg(this, 1));
    }

    @Override // defpackage.y
    public final void a(int i, f30 f30Var) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1735448596);
        int i2 = (ov0Var.h(this) ? 4 : 2) | i;
        if (ov0Var.T(i2 & 1, (i2 & 3) != 2)) {
            ((pu0) this.o.getValue()).invoke(ov0Var, 0);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new x(this, i, 5);
        }
    }

    @Override // defpackage.n12
    public final ql3 g(View view, ql3 ql3Var) {
        if (!this.q) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return ql3Var.a.n(iMax, iMax2, iMax3, iMax4);
            }
        }
        return ql3Var;
    }

    @Override // defpackage.y
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.s;
    }

    @Override // defpackage.y
    public final void h(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i5 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i6 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    @Override // defpackage.y
    public final void i(int i, int i2) {
        int iA;
        int iMin;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.i(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        Window window = this.n;
        if (mode != Integer.MIN_VALUE || this.p || window.getAttributes().height != -2) {
            iA = size2;
        } else if (this.q) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 30) {
                iA = nj.a.a(window);
            } else if (i3 < 32) {
                iA = pj.a.a(window);
            } else {
                iA = size2;
            }
        } else {
            iA = size2 + 1;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i4 = size - paddingRight;
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = iA - paddingBottom;
        int i6 = i5 >= 0 ? i5 : 0;
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        }
        childAt.measure(i, i2);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        if (mode != Integer.MIN_VALUE) {
            iMin = mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2;
        } else {
            iMin = Math.min(size2, childAt.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, iMin);
        if (this.q || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        if (this.p) {
            return;
        }
        window.setLayout(-1, -1);
    }
}
