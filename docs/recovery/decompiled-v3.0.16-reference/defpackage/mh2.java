package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mh2 implements Iterator, p81 {
    public final /* synthetic */ int e = 1;
    public int f;
    public int g;
    public int h;
    public Object i;
    public final Object j;

    public mh2(nh2 nh2Var) {
        this.j = nh2Var;
        this.g = nh2Var.h;
        this.h = nh2Var.g;
    }

    public boolean a() {
        this.f = 3;
        int i = this.g;
        if (i == 0) {
            this.f = 2;
            return false;
        }
        nh2 nh2Var = (nh2) this.j;
        Object[] objArr = nh2Var.e;
        int i2 = this.h;
        this.i = objArr[i2];
        this.f = 1;
        this.h = (i2 + 1) % nh2Var.f;
        this.g = i - 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.e) {
            case 0:
                int i = this.f;
                if (i == 0) {
                    return a();
                }
                if (i == 1) {
                    return true;
                }
                if (i != 2) {
                    fo.i("hasNext called when the iterator is in the FAILED state.");
                }
                return false;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                int i = this.f;
                if (i == 1) {
                    this.f = 0;
                    return this.i;
                }
                if (i == 2 || !a()) {
                    b81.p();
                    return null;
                }
                this.f = 0;
                return this.i;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public mh2(hx2 hx2Var, int i, qv0 qv0Var, dh0 dh0Var) {
        this.i = hx2Var;
        this.f = i;
        this.j = dh0Var;
        this.g = hx2Var.l;
    }
}
