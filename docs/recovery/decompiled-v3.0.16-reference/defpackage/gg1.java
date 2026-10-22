package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class gg1 extends AbstractSet {
    public final /* synthetic */ int e;
    public final /* synthetic */ Map f;

    public /* synthetic */ gg1(Map map, int i) {
        this.e = i;
        this.f = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        int i = this.e;
        Map map = this.f;
        switch (i) {
            case 0:
                ((ig1) map).clear();
                break;
            case 1:
                ((ig1) map).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        hg1 hg1VarA;
        int i = this.e;
        Map map = this.f;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                ig1 ig1Var = (ig1) map;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                hg1 hg1Var = null;
                if (key != null) {
                    try {
                        hg1VarA = ig1Var.a(key, false);
                    } catch (ClassCastException unused) {
                        hg1VarA = null;
                    }
                    break;
                } else {
                    hg1VarA = null;
                }
                if (hg1VarA != null && Objects.equals(hg1VarA.l, entry.getValue())) {
                    hg1Var = hg1VarA;
                }
                return hg1Var != null;
            case 1:
                return ((ig1) map).containsKey(obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.e;
        Map map = this.f;
        switch (i) {
            case 0:
                return new fg1((ig1) map, 0);
            case 1:
                return new fg1((ig1) map, 1);
            default:
                return new ro((to) map);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        hg1 hg1VarA;
        int i = this.e;
        hg1 hg1VarA2 = null;
        Map map = this.f;
        switch (i) {
            case 0:
                ig1 ig1Var = (ig1) map;
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                if (key != null) {
                    try {
                        hg1VarA = ig1Var.a(key, false);
                    } catch (ClassCastException unused) {
                        hg1VarA = null;
                    }
                    break;
                } else {
                    hg1VarA = null;
                }
                if (hg1VarA != null && Objects.equals(hg1VarA.l, entry.getValue())) {
                    hg1VarA2 = hg1VarA;
                }
                if (hg1VarA2 == null) {
                    return false;
                }
                ig1Var.c(hg1VarA2, true);
                return true;
            case 1:
                ig1 ig1Var2 = (ig1) map;
                if (obj != null) {
                    try {
                        hg1VarA2 = ig1Var2.a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (hg1VarA2 != null) {
                    ig1Var2.c(hg1VarA2, true);
                }
                return hg1VarA2 != null;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.e;
        Map map = this.f;
        switch (i) {
            case 0:
                return ((ig1) map).h;
            case 1:
                return ((ig1) map).h;
            default:
                return ((to) map).g;
        }
    }
}
