package defpackage;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class xk3 extends WindowInsetsAnimation$Callback {
    public final tk3 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public xk3(tk3 tk3Var) {
        super(tk3Var.f);
        this.d = new HashMap();
        this.a = tk3Var;
    }

    public final al3 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.d;
        al3 al3Var = (al3) map.get(windowInsetsAnimation);
        if (al3Var == null) {
            al3Var = new al3(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                al3Var.a = new yk3(windowInsetsAnimation);
            }
            map.put(windowInsetsAnimation, al3Var);
        }
        return al3Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.a(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        this.a.b();
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationK = n1.k(list.get(size));
            al3 al3VarA = a(windowInsetsAnimationK);
            al3VarA.a.e(windowInsetsAnimationK.getFraction());
            this.c.add(al3VarA);
        }
        return this.a.c(ql3.c(windowInsets, null), this.b).b();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        z92 z92VarD = this.a.d(a(windowInsetsAnimation), new z92(bounds));
        z92VarD.getClass();
        n1.o();
        return n1.i(((j31) z92VarD.f).d(), ((j31) z92VarD.g).d());
    }
}
