package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class dh2 implements ListIterator, p81 {
    public final /* synthetic */ int e = 0;
    public final Object f;
    public final /* synthetic */ Object g;

    public dh2(uq1 uq1Var, int i) {
        this.g = uq1Var;
        this.f = ((List) uq1Var.f).listIterator(zy.z0(uq1Var, i));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.e) {
            case 0:
                ListIterator listIterator = (ListIterator) this.f;
                listIterator.add(obj);
                listIterator.previous();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((ListIterator) obj).hasPrevious();
            case 1:
                return ((ListIterator) obj).hasPrevious();
            default:
                return ((ue2) obj).e < ((b23) this.g).h - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((ListIterator) obj).hasNext();
            case 1:
                return ((ListIterator) obj).hasNext();
            default:
                return ((ue2) obj).e >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((ListIterator) obj).previous();
            case 1:
                return ((ListIterator) obj).previous();
            default:
                ue2 ue2Var = (ue2) obj;
                int i2 = ue2Var.e + 1;
                b23 b23Var = (b23) this.g;
                da0.I(i2, b23Var.h);
                ue2Var.e = i2;
                return b23Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int iPreviousIndex;
        int size;
        int i = this.e;
        Object obj = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                iPreviousIndex = ((ListIterator) obj2).previousIndex();
                size = ((eh2) obj).size();
                break;
            case 1:
                iPreviousIndex = ((ListIterator) obj2).previousIndex();
                size = ((uq1) obj).size();
                break;
            default:
                return ((ue2) obj2).e + 1;
        }
        return (size - 1) - iPreviousIndex;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((ListIterator) obj).next();
            case 1:
                return ((ListIterator) obj).next();
            default:
                ue2 ue2Var = (ue2) obj;
                int i2 = ue2Var.e;
                b23 b23Var = (b23) this.g;
                da0.I(i2, b23Var.h);
                ue2Var.e = i2 - 1;
                return b23Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int iNextIndex;
        int size;
        int i = this.e;
        Object obj = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                iNextIndex = ((ListIterator) obj2).nextIndex();
                size = ((eh2) obj).size();
                break;
            case 1:
                iNextIndex = ((ListIterator) obj2).nextIndex();
                size = ((uq1) obj).size();
                break;
            default:
                return ((ue2) obj2).e;
        }
        return (size - 1) - iNextIndex;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                ((ListIterator) this.f).remove();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.e) {
            case 0:
                ((ListIterator) this.f).set(obj);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public dh2(eh2 eh2Var, int i) {
        this.g = eh2Var;
        this.f = eh2Var.e.listIterator(zy.z0(eh2Var, i));
    }

    public dh2(ue2 ue2Var, b23 b23Var) {
        this.f = ue2Var;
        this.g = b23Var;
    }
}
