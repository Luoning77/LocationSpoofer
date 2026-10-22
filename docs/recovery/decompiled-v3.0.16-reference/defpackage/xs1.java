package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class xs1 extends FrameLayout implements oy {
    public final CollapsibleActionView e;

    /* JADX WARN: Multi-variable type inference failed */
    public xs1(View view) {
        super(view.getContext());
        this.e = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // defpackage.oy
    public final void onActionViewCollapsed() {
        this.e.onActionViewCollapsed();
    }

    @Override // defpackage.oy
    public final void onActionViewExpanded() {
        this.e.onActionViewExpanded();
    }
}
