package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class to extends tv2 implements Map {
    public gg1 h;
    public qo i;
    public so j;

    @Override // java.util.Map
    public final Set entrySet() {
        gg1 gg1Var = this.h;
        if (gg1Var != null) {
            return gg1Var;
        }
        gg1 gg1Var2 = new gg1(this, 2);
        this.h = gg1Var2;
        return gg1Var2;
    }

    public final boolean i(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(Collection collection) {
        int i = this.g;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.g;
    }

    @Override // java.util.Map
    public final Set keySet() {
        qo qoVar = this.i;
        if (qoVar != null) {
            return qoVar;
        }
        qo qoVar2 = new qo(this);
        this.i = qoVar2;
        return qoVar2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.g;
        int i = this.g;
        int[] iArr = this.e;
        if (iArr.length < size) {
            this.e = Arrays.copyOf(iArr, size);
            this.f = Arrays.copyOf(this.f, size * 2);
        }
        if (this.g != i) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        so soVar = this.j;
        if (soVar != null) {
            return soVar;
        }
        so soVar2 = new so(this);
        this.j = soVar2;
        return soVar2;
    }
}
