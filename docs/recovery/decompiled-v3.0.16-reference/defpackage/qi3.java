package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qi3 implements View.OnApplyWindowInsetsListener {
    public ql3 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ n12 c;

    public qi3(View view, n12 n12Var) {
        this.b = view;
        this.c = n12Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        ql3 ql3VarC = ql3.c(windowInsets, view);
        int i = Build.VERSION.SDK_INT;
        n12 n12Var = this.c;
        if (i < 30) {
            ri3.a(windowInsets, this.b);
            if (ql3VarC.equals(this.a)) {
                return n12Var.g(view, ql3VarC).b();
            }
        }
        this.a = ql3VarC;
        ql3 ql3VarG = n12Var.g(view, ql3VarC);
        if (i >= 30) {
            return ql3VarG.b();
        }
        WeakHashMap weakHashMap = yi3.a;
        pi3.c(view);
        return ql3VarG.b();
    }
}
