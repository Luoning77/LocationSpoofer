package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class xx0 implements ListIterator, p81 {
    public final /* synthetic */ int e;
    public int f;
    public int g;
    public int h;
    public final Object i;

    public xx0(fy2 fy2Var, int i) {
        this.e = 3;
        this.i = fy2Var;
        this.f = i - 1;
        this.g = -1;
        this.h = da0.y(fy2Var);
    }

    public void a() {
        if (((AbstractList) ((lg1) this.i).i).modCount != this.h) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.e;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                lg1 lg1Var = (lg1) obj2;
                int i2 = this.f;
                this.f = i2 + 1;
                lg1Var.add(i2, obj);
                this.g = -1;
                this.h = ((AbstractList) lg1Var).modCount;
                return;
            case 2:
                b();
                mg1 mg1Var = (mg1) obj2;
                int i3 = this.f;
                this.f = i3 + 1;
                mg1Var.add(i3, obj);
                this.g = -1;
                this.h = ((AbstractList) mg1Var).modCount;
                return;
            default:
                c();
                fy2 fy2Var = (fy2) obj2;
                fy2Var.add(this.f + 1, obj);
                this.g = -1;
                this.f++;
                this.h = da0.y(fy2Var);
                return;
        }
    }

    public void b() {
        if (((AbstractList) ((mg1) this.i)).modCount != this.h) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        if (da0.y((fy2) this.i) != this.h) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.e;
        Object obj = this.i;
        switch (i) {
            case 0:
                return this.f < this.h;
            case 1:
                return this.f < ((lg1) obj).g;
            case 2:
                return this.f < ((mg1) obj).f;
            default:
                return this.f < ((fy2) obj).size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.e) {
            case 0:
                return this.f > this.g;
            case 1:
                return this.f > 0;
            case 2:
                return this.f > 0;
            default:
                return this.f >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.e;
        Object obj = this.i;
        switch (i) {
            case 0:
                sx1 sx1Var = ((zx0) obj).e;
                int i2 = this.f;
                this.f = i2 + 1;
                Object objF = sx1Var.f(i2);
                objF.getClass();
                return (cv1) objF;
            case 1:
                a();
                int i3 = this.f;
                lg1 lg1Var = (lg1) obj;
                if (i3 >= lg1Var.g) {
                    b81.p();
                    return null;
                }
                this.f = i3 + 1;
                this.g = i3;
                return lg1Var.e[lg1Var.f + i3];
            case 2:
                b();
                int i4 = this.f;
                mg1 mg1Var = (mg1) obj;
                if (i4 >= mg1Var.f) {
                    b81.p();
                    return null;
                }
                this.f = i4 + 1;
                this.g = i4;
                return mg1Var.e[i4];
            default:
                c();
                int i5 = this.f + 1;
                this.g = i5;
                fy2 fy2Var = (fy2) obj;
                da0.I(i5, fy2Var.size());
                Object obj2 = fy2Var.get(i5);
                this.f = i5;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.e) {
            case 0:
                return this.f - this.g;
            case 1:
                return this.f;
            case 2:
                return this.f;
            default:
                return this.f + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.e;
        Object obj = this.i;
        switch (i) {
            case 0:
                sx1 sx1Var = ((zx0) obj).e;
                int i2 = this.f - 1;
                this.f = i2;
                Object objF = sx1Var.f(i2);
                objF.getClass();
                return (cv1) objF;
            case 1:
                a();
                int i3 = this.f;
                if (i3 <= 0) {
                    b81.p();
                    return null;
                }
                int i4 = i3 - 1;
                this.f = i4;
                this.g = i4;
                lg1 lg1Var = (lg1) obj;
                return lg1Var.e[lg1Var.f + i4];
            case 2:
                b();
                int i5 = this.f;
                if (i5 <= 0) {
                    b81.p();
                    return null;
                }
                int i6 = i5 - 1;
                this.f = i6;
                this.g = i6;
                return ((mg1) obj).e[i6];
            default:
                c();
                fy2 fy2Var = (fy2) obj;
                da0.I(this.f, fy2Var.size());
                int i7 = this.f;
                this.g = i7;
                Object obj2 = fy2Var.get(i7);
                this.f--;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.e) {
            case 0:
                return (this.f - this.g) - 1;
            case 1:
                i = this.f;
                break;
            case 2:
                i = this.f;
                break;
            default:
                return this.f;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.e;
        Object obj = this.i;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                lg1 lg1Var = (lg1) obj;
                a();
                int i2 = this.g;
                if (i2 == -1) {
                    fo.n("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                lg1Var.b(i2);
                this.f = this.g;
                this.g = -1;
                this.h = ((AbstractList) lg1Var).modCount;
                return;
            case 2:
                mg1 mg1Var = (mg1) obj;
                b();
                int i3 = this.g;
                if (i3 == -1) {
                    fo.n("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                mg1Var.b(i3);
                this.f = this.g;
                this.g = -1;
                this.h = ((AbstractList) mg1Var).modCount;
                return;
            default:
                c();
                fy2 fy2Var = (fy2) obj;
                fy2Var.remove(this.g);
                this.f--;
                this.g = -1;
                this.h = da0.y(fy2Var);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.e;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i2 = this.g;
                if (i2 != -1) {
                    ((lg1) obj2).set(i2, obj);
                    return;
                } else {
                    fo.n("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 2:
                b();
                int i3 = this.g;
                if (i3 != -1) {
                    ((mg1) obj2).set(i3, obj);
                    return;
                } else {
                    fo.n("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                fy2 fy2Var = (fy2) obj2;
                c();
                int i4 = this.g;
                if (i4 < 0) {
                    fo.n("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    fy2Var.set(i4, obj);
                    this.h = da0.y(fy2Var);
                    return;
                }
        }
    }

    public xx0(mg1 mg1Var, int i) {
        this.e = 2;
        this.i = mg1Var;
        this.f = i;
        this.g = -1;
        this.h = ((AbstractList) mg1Var).modCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xx0(zx0 zx0Var, int i, int i2) {
        this(zx0Var, (i2 & 1) != 0 ? 0 : i, 0, zx0Var.e.b);
        this.e = 0;
    }

    public xx0(zx0 zx0Var, int i, int i2, int i3) {
        this.e = 0;
        this.i = zx0Var;
        this.f = i;
        this.g = i2;
        this.h = i3;
    }

    public xx0(lg1 lg1Var, int i) {
        this.e = 1;
        this.i = lg1Var;
        this.f = i;
        this.g = -1;
        this.h = ((AbstractList) lg1Var).modCount;
    }
}
