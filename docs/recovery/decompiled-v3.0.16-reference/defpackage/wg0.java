package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wg0 implements Iterator, p81 {
    public final /* synthetic */ int e = 1;
    public final Iterator f;
    public int g;

    public wg0(xg0 xg0Var, byte b) {
        this.g = xg0Var.c;
        this.f = xg0Var.b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.e;
        Iterator it = this.f;
        switch (i) {
            case 0:
                break;
            case 1:
                return it.hasNext();
            default:
                return this.g > 0 && it.hasNext();
        }
        while (this.g > 0 && it.hasNext()) {
            it.next();
            this.g--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.e;
        Iterator it = this.f;
        switch (i) {
            case 0:
                break;
            case 1:
                int i2 = this.g;
                this.g = i2 + 1;
                if (i2 >= 0) {
                    return new l11(i2, it.next());
                }
                am1.X();
                throw null;
            default:
                int i3 = this.g;
                if (i3 != 0) {
                    this.g = i3 - 1;
                    return it.next();
                }
                b81.p();
                return null;
        }
        while (this.g > 0 && it.hasNext()) {
            it.next();
            this.g--;
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public wg0(Iterator it) {
        it.getClass();
        this.f = it;
    }

    public wg0(xg0 xg0Var) {
        this.f = xg0Var.b.iterator();
        this.g = xg0Var.c;
    }
}
