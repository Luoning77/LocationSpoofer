package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bp2 implements View.OnLayoutChangeListener {
    public final /* synthetic */ SearchView a;

    public bp2(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int dimensionPixelSize;
        SearchView searchView = this.a;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.t;
        View view2 = searchView.B;
        if (view2.getWidth() > 1) {
            Resources resources = searchView.getContext().getResources();
            int paddingLeft = searchView.v.getPaddingLeft();
            Rect rect = new Rect();
            boolean zA = xj3.a(searchView);
            if (searchView.Q) {
                dimensionPixelSize = resources.getDimensionPixelSize(2131099690) + resources.getDimensionPixelSize(2131099689);
            } else {
                dimensionPixelSize = 0;
            }
            searchAutoComplete.getDropDownBackground().getPadding(rect);
            int i9 = rect.left;
            searchAutoComplete.setDropDownHorizontalOffset(zA ? -i9 : paddingLeft - (i9 + dimensionPixelSize));
            searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}
