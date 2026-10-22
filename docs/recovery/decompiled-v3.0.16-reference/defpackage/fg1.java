package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fg1 implements Iterator {
    public hg1 e;
    public hg1 f = null;
    public int g;
    public final /* synthetic */ ig1 h;
    public final /* synthetic */ int i;

    public fg1(ig1 ig1Var, int i) {
        this.i = i;
        this.h = ig1Var;
        this.e = ig1Var.j.h;
        this.g = ig1Var.i;
    }

    public final Object a() {
        return b();
    }

    public final hg1 b() {
        hg1 hg1Var = this.e;
        ig1 ig1Var = this.h;
        if (hg1Var == ig1Var.j) {
            b81.p();
            return null;
        }
        if (ig1Var.i != this.g) {
            throw new ConcurrentModificationException();
        }
        this.e = hg1Var.h;
        this.f = hg1Var;
        return hg1Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e != this.h.j;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.i) {
            case 1:
                return b().j;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        hg1 hg1Var = this.f;
        if (hg1Var == null) {
            throw new IllegalStateException();
        }
        ig1 ig1Var = this.h;
        ig1Var.c(hg1Var, true);
        this.f = null;
        this.g = ig1Var.i;
    }
}
