package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class q72 extends l0 {
    public final /* synthetic */ int e;
    public final o72 f;

    public /* synthetic */ q72(int i, o72 o72Var) {
        this.e = i;
        this.f = o72Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.e;
        o72 o72Var = this.f;
        switch (i) {
            case 0:
                o72Var.clear();
                break;
            default:
                o72Var.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.e) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    o72 o72Var = this.f;
                    Object obj2 = o72Var.get(key);
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && o72Var.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f.containsKey(obj);
        }
    }

    @Override // defpackage.l0
    public final int getSize() {
        int i = this.e;
        o72 o72Var = this.f;
        switch (i) {
            case 0:
                break;
        }
        return o72Var.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.e;
        o72 o72Var = this.f;
        switch (i) {
            case 0:
                return new bz(o72Var);
            default:
                ad3[] ad3VarArr = new ad3[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    ad3VarArr[i2] = new bd3(1);
                }
                return new r72(o72Var, ad3VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.e) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.f.remove(entry.getKey(), entry.getValue());
            default:
                o72 o72Var = this.f;
                if (!o72Var.containsKey(obj)) {
                    return false;
                }
                o72Var.remove(obj);
                return true;
        }
    }
}
