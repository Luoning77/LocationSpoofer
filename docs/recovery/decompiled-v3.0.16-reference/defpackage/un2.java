package defpackage;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class un2 implements vn2 {
    public final ScrollFeedbackProvider e;

    public un2(NestedScrollView nestedScrollView) {
        this.e = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // defpackage.vn2
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.e.onScrollLimit(i, i2, i3, z);
    }

    @Override // defpackage.vn2
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.e.onScrollProgress(i, i2, i3, i4);
    }
}
