package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fy2 implements Parcelable, x03, List, RandomAccess, q81 {
    public static final Parcelable.Creator<fy2> CREATOR = new ey2(0);
    public u03 e;

    public fy2(n0 n0Var) {
        nx2 nx2VarH = tx2.h();
        u03 u03Var = new u03(nx2VarH.g(), n0Var);
        if (!(nx2VarH instanceof cw0)) {
            u03Var.b = new u03(1L, n0Var);
        }
        this.e = u03Var;
    }

    @Override // defpackage.x03
    public final z03 a() {
        return this.e;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        n0 n0Var;
        nx2 nx2VarH;
        boolean zM;
        do {
            synchronized (da0.W) {
                u03 u03Var = this.e;
                u03Var.getClass();
                u03 u03Var2 = (u03) tx2.f(u03Var);
                i = u03Var2.d;
                n0Var = u03Var2.c;
            }
            n0Var.getClass();
            n0 n0VarC = n0Var.c(obj);
            if (n0VarC.equals(n0Var)) {
                return false;
            }
            u03 u03Var3 = this.e;
            u03Var3.getClass();
            synchronized (tx2.c) {
                nx2VarH = tx2.h();
                zM = da0.m((u03) tx2.w(u03Var3, this, nx2VarH), i, n0VarC, true);
            }
            tx2.l(nx2VarH, this);
        } while (!zM);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        n0 n0Var;
        nx2 nx2VarH;
        boolean zM;
        do {
            synchronized (da0.W) {
                u03 u03Var = this.e;
                u03Var.getClass();
                u03 u03Var2 = (u03) tx2.f(u03Var);
                i = u03Var2.d;
                n0Var = u03Var2.c;
            }
            n0Var.getClass();
            n0 n0VarD = n0Var.d(collection);
            if (o51.f(n0VarD, n0Var)) {
                return false;
            }
            u03 u03Var3 = this.e;
            u03Var3.getClass();
            synchronized (tx2.c) {
                nx2VarH = tx2.h();
                zM = da0.m((u03) tx2.w(u03Var3, this, nx2VarH), i, n0VarD, true);
            }
            tx2.l(nx2VarH, this);
        } while (!zM);
        return true;
    }

    @Override // defpackage.x03
    public final void c(z03 z03Var) {
        z03Var.b = this.e;
        this.e = (u03) z03Var;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        nx2 nx2VarH;
        u03 u03Var = this.e;
        u03Var.getClass();
        synchronized (tx2.c) {
            nx2VarH = tx2.h();
            u03 u03Var2 = (u03) tx2.w(u03Var, this, nx2VarH);
            synchronized (da0.W) {
                u03Var2.c = lx2.f;
                u03Var2.d++;
                u03Var2.e++;
            }
        }
        tx2.l(nx2VarH, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return da0.x(this).c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return da0.x(this).c.containsAll(collection);
    }

    public final void d(int i, int i2) {
        int i3;
        n0 n0Var;
        nx2 nx2VarH;
        boolean zM;
        do {
            synchronized (da0.W) {
                u03 u03Var = this.e;
                u03Var.getClass();
                u03 u03Var2 = (u03) tx2.f(u03Var);
                i3 = u03Var2.d;
                n0Var = u03Var2.c;
            }
            n0Var.getClass();
            y72 y72VarE = n0Var.e();
            y72VarE.subList(i, i2).clear();
            n0 n0VarC = y72VarE.c();
            if (o51.f(n0VarC, n0Var)) {
                return;
            }
            u03 u03Var3 = this.e;
            u03Var3.getClass();
            synchronized (tx2.c) {
                nx2VarH = tx2.h();
                zM = da0.m((u03) tx2.w(u03Var3, this, nx2VarH), i3, n0VarC, true);
            }
            tx2.l(nx2VarH, this);
        } while (!zM);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return da0.x(this).c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return da0.x(this).c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return da0.x(this).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return da0.x(this).c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new xx0(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        n0 n0Var;
        nx2 nx2VarH;
        boolean zM;
        do {
            synchronized (da0.W) {
                u03 u03Var = this.e;
                u03Var.getClass();
                u03 u03Var2 = (u03) tx2.f(u03Var);
                i = u03Var2.d;
                n0Var = u03Var2.c;
            }
            n0Var.getClass();
            int iIndexOf = n0Var.indexOf(obj);
            n0 n0VarG = iIndexOf != -1 ? n0Var.g(iIndexOf) : n0Var;
            if (n0VarG.equals(n0Var)) {
                return false;
            }
            u03 u03Var3 = this.e;
            u03Var3.getClass();
            synchronized (tx2.c) {
                nx2VarH = tx2.h();
                zM = da0.m((u03) tx2.w(u03Var3, this, nx2VarH), i, n0VarG, true);
            }
            tx2.l(nx2VarH, this);
        } while (!zM);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        n0 n0Var;
        nx2 nx2VarH;
        boolean zM;
        do {
            synchronized (da0.W) {
                u03 u03Var = this.e;
                u03Var.getClass();
                u03 u03Var2 = (u03) tx2.f(u03Var);
                i = u03Var2.d;
                n0Var = u03Var2.c;
            }
            n0Var.getClass();
            n0 n0VarF = n0Var.f(new m0(0, collection));
            if (o51.f(n0VarF, n0Var)) {
                return false;
            }
            u03 u03Var3 = this.e;
            u03Var3.getClass();
            synchronized (tx2.c) {
                nx2VarH = tx2.h();
                zM = da0.m((u03) tx2.w(u03Var3, this, nx2VarH), i, n0VarF, true);
            }
            tx2.l(nx2VarH, this);
        } while (!zM);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return da0.D(this, new m0(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        n0 n0Var;
        nx2 nx2VarH;
        boolean zM;
        Object obj2 = get(i);
        do {
            synchronized (da0.W) {
                u03 u03Var = this.e;
                u03Var.getClass();
                u03 u03Var2 = (u03) tx2.f(u03Var);
                i2 = u03Var2.d;
                n0Var = u03Var2.c;
            }
            n0Var.getClass();
            n0 n0VarH = n0Var.h(i, obj);
            if (n0VarH.equals(n0Var)) {
                break;
            }
            u03 u03Var3 = this.e;
            u03Var3.getClass();
            synchronized (tx2.c) {
                nx2VarH = tx2.h();
                zM = da0.m((u03) tx2.w(u03Var3, this, nx2VarH), i2, n0VarH, false);
            }
            tx2.l(nx2VarH, this);
        } while (!zM);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return da0.x(this).c.a();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            hb2.a("fromIndex or toIndex are out of bounds");
        }
        return new b23(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return sb.f0(this);
    }

    public final String toString() {
        u03 u03Var = this.e;
        u03Var.getClass();
        return "SnapshotStateList(value=" + ((u03) tx2.f(u03Var)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        n0 n0Var = da0.x(this).c;
        int iA = n0Var.a();
        parcel.writeInt(iA);
        for (int i2 = 0; i2 < iA; i2++) {
            parcel.writeValue(n0Var.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return sb.g0(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new xx0(this, i);
    }

    public fy2() {
        this(lx2.f);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        n0 n0Var;
        nx2 nx2VarH;
        boolean zM;
        do {
            synchronized (da0.W) {
                u03 u03Var = this.e;
                u03Var.getClass();
                u03 u03Var2 = (u03) tx2.f(u03Var);
                i2 = u03Var2.d;
                n0Var = u03Var2.c;
            }
            n0Var.getClass();
            n0 n0VarB = n0Var.b(i, obj);
            if (n0VarB.equals(n0Var)) {
                return;
            }
            u03 u03Var3 = this.e;
            u03Var3.getClass();
            synchronized (tx2.c) {
                nx2VarH = tx2.h();
                zM = da0.m((u03) tx2.w(u03Var3, this, nx2VarH), i2, n0VarB, true);
            }
            tx2.l(nx2VarH, this);
        } while (!zM);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return da0.D(this, new xf0(i, 2, collection));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        n0 n0Var;
        nx2 nx2VarH;
        boolean zM;
        Object obj = get(i);
        do {
            synchronized (da0.W) {
                u03 u03Var = this.e;
                u03Var.getClass();
                u03 u03Var2 = (u03) tx2.f(u03Var);
                i2 = u03Var2.d;
                n0Var = u03Var2.c;
            }
            n0Var.getClass();
            n0 n0VarG = n0Var.g(i);
            if (n0VarG.equals(n0Var)) {
                break;
            }
            u03 u03Var3 = this.e;
            u03Var3.getClass();
            synchronized (tx2.c) {
                nx2VarH = tx2.h();
                zM = da0.m((u03) tx2.w(u03Var3, this, nx2VarH), i2, n0VarG, true);
            }
            tx2.l(nx2VarH, this);
        } while (!zM);
        return obj;
    }
}
