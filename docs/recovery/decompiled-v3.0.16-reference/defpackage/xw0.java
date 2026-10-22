package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class xw0 implements Iterator, p81 {
    public final hx2 e;
    public final int f;
    public int g;
    public final int h;

    public xw0(hx2 hx2Var, int i, int i2) {
        this.e = hx2Var;
        this.f = i2;
        this.g = i;
        this.h = hx2Var.l;
        if (hx2Var.k) {
            jx2.e();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g < this.f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        hx2 hx2Var = this.e;
        int i = hx2Var.l;
        int i2 = this.h;
        if (i != i2) {
            jx2.e();
        }
        int i3 = this.g;
        this.g = hx2Var.e[(i3 * 5) + 3] + i3;
        return new ix2(hx2Var, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
