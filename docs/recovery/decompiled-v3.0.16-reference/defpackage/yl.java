package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class yl extends wg1 implements am {
    public CharSequence F;
    public vl G;
    public final Rect H;
    public int I;
    public final /* synthetic */ bm J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl(bm bmVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903385);
        this.J = bmVar;
        this.H = new Rect();
        this.s = bmVar;
        this.B = true;
        this.C.setFocusable(true);
        this.t = new wl(this, 0);
    }

    @Override // defpackage.am
    public final void e(CharSequence charSequence) {
        this.F = charSequence;
    }

    @Override // defpackage.am
    public final void k(int i) {
        this.I = i;
    }

    @Override // defpackage.am
    public final void m(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        jl jlVar = this.C;
        boolean zIsShowing = jlVar.isShowing();
        s();
        jlVar.setInputMethodMode(2);
        c();
        vg0 vg0Var = this.g;
        int i3 = 1;
        vg0Var.setChoiceMode(1);
        sl.d(vg0Var, i);
        sl.c(vg0Var, i2);
        bm bmVar = this.J;
        int selectedItemPosition = bmVar.getSelectedItemPosition();
        vg0 vg0Var2 = this.g;
        if (jlVar.isShowing() && vg0Var2 != null) {
            vg0Var2.setListSelectionHidden(false);
            vg0Var2.setSelection(selectedItemPosition);
            if (vg0Var2.getChoiceMode() != 0) {
                vg0Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = bmVar.getViewTreeObserver()) == null) {
            return;
        }
        ql qlVar = new ql(this, i3);
        viewTreeObserver.addOnGlobalLayoutListener(qlVar);
        jlVar.setOnDismissListener(new xl(this, qlVar));
    }

    @Override // defpackage.am
    public final CharSequence o() {
        return this.F;
    }

    @Override // defpackage.wg1, defpackage.am
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.G = (vl) listAdapter;
    }

    public final void s() {
        int i;
        jl jlVar = this.C;
        Drawable background = jlVar.getBackground();
        bm bmVar = this.J;
        Rect rect = bmVar.l;
        if (background != null) {
            background.getPadding(rect);
            i = xj3.a(bmVar) ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = bmVar.getPaddingLeft();
        int paddingRight = bmVar.getPaddingRight();
        int width = bmVar.getWidth();
        int i2 = bmVar.k;
        if (i2 == -2) {
            int iA = bmVar.a(this.G, jlVar.getBackground());
            int i3 = (bmVar.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i3) {
                iA = i3;
            }
            r(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        this.j = xj3.a(bmVar) ? (((width - paddingRight) - this.i) - this.I) + i : paddingLeft + this.I + i;
    }
}
