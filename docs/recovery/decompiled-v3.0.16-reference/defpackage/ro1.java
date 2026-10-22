package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class ro1 {
    public int e;
    public int f;
    public int g;
    public Object h;

    public ro1() {
        if (gt2.f == null) {
            gt2.f = new gt2(9);
        }
    }

    public int a(int i) {
        if (i < this.g) {
            return ((ByteBuffer) this.h).getShort(this.f + i);
        }
        return 0;
    }

    public void b() {
        if (((so1) this.h).l != this.g) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i = this.e;
            so1 so1Var = (so1) this.h;
            if (i >= so1Var.j || so1Var.g[i] >= 0) {
                return;
            } else {
                this.e = i + 1;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f) {
            d(view, obj);
            return;
        }
        c1 c1Var = null;
        if (Build.VERSION.SDK_INT >= this.f) {
            tag = c(view);
        } else {
            tag = view.getTag(this.e);
            if (!((Class) this.h).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateE = yi3.e(view);
            if (accessibilityDelegateE != null) {
                c1Var = accessibilityDelegateE instanceof b1 ? ((b1) accessibilityDelegateE).a : new c1(accessibilityDelegateE);
            }
            if (c1Var == null) {
                c1Var = new c1();
            }
            yi3.j(view, c1Var);
            view.setTag(this.e, obj);
            yi3.g(view, this.g);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.e < ((so1) this.h).j;
    }

    public void remove() {
        so1 so1Var = (so1) this.h;
        b();
        if (this.f == -1) {
            fo.n("Call next() before removing element from the iterator.");
            return;
        }
        so1Var.c();
        so1Var.k(this.f);
        this.f = -1;
        this.g = so1Var.l;
    }
}
