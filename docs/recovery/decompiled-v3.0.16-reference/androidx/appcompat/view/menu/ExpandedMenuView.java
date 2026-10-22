package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.gn;
import defpackage.ls1;
import defpackage.ms1;
import defpackage.st1;
import defpackage.vs1;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ExpandedMenuView extends ListView implements ls1, st1, AdapterView.OnItemClickListener {
    public static final int[] f = {R.attr.background, R.attr.divider};
    public ms1 e;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        gn gnVarY = gn.y(context, attributeSet, f, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) gnVarY.a;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(gnVarY.m(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(gnVarY.m(1));
        }
        gnVarY.A();
    }

    @Override // defpackage.ls1
    public final boolean a(vs1 vs1Var) {
        return this.e.q(vs1Var, null, 0);
    }

    @Override // defpackage.st1
    public final void b(ms1 ms1Var) {
        this.e = ms1Var;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((vs1) getAdapter().getItem(i));
    }
}
