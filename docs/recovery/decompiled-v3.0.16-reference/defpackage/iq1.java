package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class iq1 implements Map, p81 {
    public final zx1 e;
    public uk0 f;
    public uk0 g;
    public i23 h;

    public iq1(zx1 zx1Var) {
        this.e = zx1Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.e.c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.e.d(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        uk0 uk0Var = this.f;
        if (uk0Var != null) {
            return uk0Var;
        }
        uk0 uk0Var2 = new uk0(this.e, 0);
        this.f = uk0Var2;
        return uk0Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iq1.class != obj.getClass()) {
            return false;
        }
        return this.e.equals(((iq1) obj).e);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.e.g(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.e.i();
    }

    @Override // java.util.Map
    public final Set keySet() {
        uk0 uk0Var = this.g;
        if (uk0Var != null) {
            return uk0Var;
        }
        uk0 uk0Var2 = new uk0(this.e, 1);
        this.g = uk0Var2;
        return uk0Var2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.e.e;
    }

    public final String toString() {
        return this.e.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        i23 i23Var = this.h;
        if (i23Var != null) {
            return i23Var;
        }
        i23 i23Var2 = new i23(this.e);
        this.h = i23Var2;
        return i23Var2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
