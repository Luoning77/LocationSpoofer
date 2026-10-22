package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qh2 extends ViewGroup {
    public final int e;
    public final ArrayList f;
    public final ArrayList g;
    public final z92 h;
    public int i;

    public qh2(Context context) {
        super(context);
        this.e = 5;
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.g = arrayList2;
        this.h = new z92(1);
        setClipChildren(false);
        rh2 rh2Var = new rh2(context);
        addView(rh2Var);
        arrayList.add(rh2Var);
        arrayList2.add(rh2Var);
        this.i = 1;
        setTag(2131230831, Boolean.TRUE);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
