package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class b23 implements List, q81 {
    public final fy2 e;
    public final int f;
    public int g;
    public int h;

    public b23(fy2 fy2Var, int i, int i2) {
        this.e = fy2Var;
        this.f = i;
        this.g = da0.y(fy2Var);
        this.h = i2 - i;
    }

    public final void a() {
        if (da0.y(this.e) != this.g) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i = this.f + this.h;
        fy2 fy2Var = this.e;
        fy2Var.add(i, obj);
        this.h++;
        this.g = da0.y(fy2Var);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        int i2 = i + this.f;
        fy2 fy2Var = this.e;
        boolean zAddAll = fy2Var.addAll(i2, collection);
        if (zAddAll) {
            this.h = collection.size() + this.h;
            this.g = da0.y(fy2Var);
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.h > 0) {
            a();
            int i = this.h;
            int i2 = this.f;
            fy2 fy2Var = this.e;
            fy2Var.d(i2, i + i2);
            this.h = 0;
            this.g = da0.y(fy2Var);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a();
        da0.I(i, this.h);
        return this.e.get(this.f + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int iNextInt;
        a();
        int i = this.h;
        int i2 = this.f;
        Iterator it = mh0.f0(i2, i + i2).iterator();
        do {
            j41 j41Var = (j41) it;
            if (!j41Var.g) {
                return -1;
            }
            iNextInt = j41Var.nextInt();
        } while (!o51.f(obj, this.e.get(iNextInt)));
        return iNextInt - i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.h == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i = this.h;
        int i2 = this.f;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (o51.f(obj, this.e.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        a();
        ue2 ue2Var = new ue2();
        ue2Var.e = i - 1;
        return new dh2(ue2Var, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        a();
        int i2 = this.f + i;
        fy2 fy2Var = this.e;
        Object objRemove = fy2Var.remove(i2);
        this.h--;
        this.g = da0.y(fy2Var);
        return objRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        n0 n0Var;
        nx2 nx2VarH;
        boolean zM;
        a();
        fy2 fy2Var = this.e;
        int i2 = this.f;
        int i3 = this.h + i2;
        int size = fy2Var.size();
        do {
            synchronized (da0.W) {
                u03 u03Var = fy2Var.e;
                u03Var.getClass();
                u03 u03Var2 = (u03) tx2.f(u03Var);
                i = u03Var2.d;
                n0Var = u03Var2.c;
            }
            n0Var.getClass();
            y72 y72VarE = n0Var.e();
            y72VarE.subList(i2, i3).retainAll(collection);
            n0 n0VarC = y72VarE.c();
            if (o51.f(n0VarC, n0Var)) {
                break;
            }
            u03 u03Var3 = fy2Var.e;
            u03Var3.getClass();
            synchronized (tx2.c) {
                nx2VarH = tx2.h();
                zM = da0.m((u03) tx2.w(u03Var3, fy2Var, nx2VarH), i, n0VarC, true);
            }
            tx2.l(nx2VarH, fy2Var);
        } while (!zM);
        int size2 = size - fy2Var.size();
        if (size2 > 0) {
            this.g = da0.y(this.e);
            this.h -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        da0.I(i, this.h);
        a();
        int i2 = i + this.f;
        fy2 fy2Var = this.e;
        Object obj2 = fy2Var.set(i2, obj);
        this.g = da0.y(fy2Var);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.h;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.h) {
            hb2.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i3 = this.f;
        return new b23(this.e, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return sb.f0(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return sb.g0(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        a();
        int i2 = this.f + i;
        fy2 fy2Var = this.e;
        fy2Var.add(i2, obj);
        this.h++;
        this.g = da0.y(fy2Var);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.h, collection);
    }
}
