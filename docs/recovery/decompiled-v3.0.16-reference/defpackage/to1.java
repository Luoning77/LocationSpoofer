package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class to1 extends l0 {
    public final /* synthetic */ int e;
    public final so1 f;

    public /* synthetic */ to1(so1 so1Var, int i) {
        this.e = i;
        this.f = so1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.e) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int i = this.e;
        collection.getClass();
        switch (i) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.e;
        so1 so1Var = this.f;
        switch (i) {
            case 0:
                so1Var.clear();
                break;
            default:
                so1Var.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.e;
        so1 so1Var = this.f;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                int iG = so1Var.g(entry.getKey());
                if (iG < 0) {
                    return false;
                }
                Object[] objArr = so1Var.f;
                objArr.getClass();
                return o51.f(objArr[iG], entry.getValue());
            default:
                return so1Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.e) {
            case 0:
                collection.getClass();
                return this.f.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // defpackage.l0
    public final int getSize() {
        int i = this.e;
        so1 so1Var = this.f;
        switch (i) {
            case 0:
                break;
        }
        return so1Var.m;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        int i = this.e;
        so1 so1Var = this.f;
        switch (i) {
            case 0:
                break;
        }
        return so1Var.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.e;
        so1 so1Var = this.f;
        switch (i) {
            case 0:
                return new po1(so1Var, 0);
            default:
                return new po1(so1Var, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.e;
        so1 so1Var = this.f;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    so1Var.c();
                    int iG = so1Var.g(entry.getKey());
                    if (iG >= 0) {
                        Object[] objArr = so1Var.f;
                        objArr.getClass();
                        if (o51.f(objArr[iG], entry.getValue())) {
                            so1Var.k(iG);
                            return true;
                        }
                    }
                }
                return false;
            default:
                so1Var.c();
                int iG2 = so1Var.g(obj);
                if (iG2 < 0) {
                    return false;
                }
                so1Var.k(iG2);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.e;
        so1 so1Var = this.f;
        collection.getClass();
        switch (i) {
            case 0:
                so1Var.c();
                break;
            default:
                so1Var.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.e;
        so1 so1Var = this.f;
        collection.getClass();
        switch (i) {
            case 0:
                so1Var.c();
                break;
            default:
                so1Var.c();
                break;
        }
        return super.retainAll(collection);
    }
}
