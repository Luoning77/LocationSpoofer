package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qb {
    public static final qb a = new qb();

    public final void a(View view, v92 v92Var) {
        Context context = view.getContext();
        PointerIcon systemIcon = v92Var instanceof bf ? PointerIcon.getSystemIcon(context, ((bf) v92Var).b) : PointerIcon.getSystemIcon(context, 1000);
        if (o51.f(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
