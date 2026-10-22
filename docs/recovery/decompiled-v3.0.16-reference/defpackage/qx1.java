package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qx1 implements List, q81 {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ qx1(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.e;
        Object obj2 = this.f;
        switch (i3) {
            case 0:
                sx1 sx1Var = (sx1) obj2;
                if (i < 0 || i > (i2 = sx1Var.b)) {
                    sx1Var.p(i);
                    throw null;
                }
                int i4 = i2 + 1;
                Object[] objArr = sx1Var.a;
                if (objArr.length < i4) {
                    sx1Var.m(objArr, i4);
                }
                Object[] objArr2 = sx1Var.a;
                int i5 = sx1Var.b;
                if (i != i5) {
                    yo.n0(objArr2, objArr2, i + 1, i, i5);
                }
                objArr2[i] = obj;
                sx1Var.b++;
                return;
            default:
                ((gy1) obj2).a(i, obj);
                return;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.e;
        Object obj = this.f;
        switch (i2) {
            case 0:
                collection.getClass();
                sx1 sx1Var = (sx1) obj;
                if (i < 0 || i > sx1Var.b) {
                    sx1Var.p(i);
                    throw null;
                }
                int i3 = 0;
                if (collection.isEmpty()) {
                    return false;
                }
                int size = collection.size() + sx1Var.b;
                Object[] objArr = sx1Var.a;
                if (objArr.length < size) {
                    sx1Var.m(objArr, size);
                }
                Object[] objArr2 = sx1Var.a;
                if (i != sx1Var.b) {
                    yo.n0(objArr2, objArr2, collection.size() + i, i, sx1Var.b);
                }
                for (Object obj2 : collection) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        am1.X();
                        throw null;
                    }
                    objArr2[i3 + i] = obj2;
                    i3 = i4;
                }
                sx1Var.b = collection.size() + sx1Var.b;
                return true;
            default:
                return ((gy1) obj).e(i, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                ((sx1) obj).d();
                break;
            default:
                ((gy1) obj).g();
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                return ((sx1) obj2).g(obj) >= 0;
            default:
                return ((gy1) obj2).h(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                collection.getClass();
                sx1 sx1Var = (sx1) obj;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (sx1Var.g(it.next()) < 0) {
                        return false;
                    }
                }
                return true;
            default:
                gy1 gy1Var = (gy1) obj;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!gy1Var.h(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.e;
        Object obj = this.f;
        switch (i2) {
            case 0:
                s02.a(this, i);
                return ((sx1) obj).f(i);
            default:
                hy1.a(this, i);
                return ((gy1) obj).e[i];
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                return ((sx1) obj2).g(obj);
            default:
                return ((gy1) obj2).i(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((sx1) obj).h();
            default:
                return ((gy1) obj).g == 0;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.e) {
            case 0:
                return new px1(this, 0, 0);
            default:
                return new px1(this, 0, 1);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        int i2 = this.e;
        Object obj2 = this.f;
        switch (i2) {
            case 0:
                sx1 sx1Var = (sx1) obj2;
                Object[] objArr = sx1Var.a;
                int i3 = sx1Var.b;
                if (obj == null) {
                    i = i3 - 1;
                    while (-1 < i) {
                        if (objArr[i] != null) {
                            i--;
                        }
                    }
                    return -1;
                }
                i = i3 - 1;
                while (-1 < i) {
                    if (!obj.equals(objArr[i])) {
                        i--;
                    }
                }
                return -1;
                return i;
            default:
                gy1 gy1Var = (gy1) obj2;
                Object[] objArr2 = gy1Var.e;
                for (int i4 = gy1Var.g - 1; i4 >= 0; i4--) {
                    if (o51.f(obj, objArr2[i4])) {
                        return i4;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.e) {
            case 0:
                return new px1(this, 0, 0);
            default:
                return new px1(this, 0, 1);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.e;
        Object obj = this.f;
        switch (i2) {
            case 0:
                s02.a(this, i);
                return ((sx1) obj).k(i);
            default:
                hy1.a(this, i);
                return ((gy1) obj).k(i);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                collection.getClass();
                sx1 sx1Var = (sx1) obj;
                int i2 = sx1Var.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    sx1Var.j(it.next());
                }
                return i2 != sx1Var.b;
            default:
                gy1 gy1Var = (gy1) obj;
                if (!collection.isEmpty()) {
                    int i3 = gy1Var.g;
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        gy1Var.j(it2.next());
                    }
                    if (i3 != gy1Var.g) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                collection.getClass();
                sx1 sx1Var = (sx1) obj;
                int i2 = sx1Var.b;
                Object[] objArr = sx1Var.a;
                for (int i3 = i2 - 1; -1 < i3; i3--) {
                    if (!collection.contains(objArr[i3])) {
                        sx1Var.k(i3);
                    }
                }
                return i2 != sx1Var.b;
            default:
                gy1 gy1Var = (gy1) obj;
                int i4 = gy1Var.g;
                for (int i5 = i4 - 1; -1 < i5; i5--) {
                    if (!collection.contains(gy1Var.e[i5])) {
                        gy1Var.k(i5);
                    }
                }
                return i4 != gy1Var.g;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.e;
        Object obj2 = this.f;
        switch (i2) {
            case 0:
                s02.a(this, i);
                return ((sx1) obj2).n(i, obj);
            default:
                hy1.a(this, i);
                Object[] objArr = ((gy1) obj2).e;
                Object obj3 = objArr[i];
                objArr[i] = obj;
                return obj3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((sx1) obj).b;
            default:
                return ((gy1) obj).g;
        }
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.e) {
            case 0:
                s02.b(this, i, i2);
                return new rx1(this, i, i2, 0);
            default:
                hy1.b(this, i, i2);
                return new rx1(this, i, i2, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.e) {
            case 0:
                objArr.getClass();
                break;
        }
        return sb.g0(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.e) {
            case 0:
                break;
        }
        return sb.f0(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.e) {
            case 0:
                return new px1(this, i, 0);
            default:
                return new px1(this, i, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                return ((sx1) obj2).j(obj);
            default:
                return ((gy1) obj2).j(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ((sx1) obj2).a(obj);
                break;
            default:
                ((gy1) obj2).b(obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                collection.getClass();
                sx1 sx1Var = (sx1) obj;
                int i2 = sx1Var.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    sx1Var.a(it.next());
                }
                return i2 != sx1Var.b;
            default:
                gy1 gy1Var = (gy1) obj;
                return gy1Var.e(gy1Var.g, collection);
        }
    }
}
