package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hg1 implements Map.Entry {
    public hg1 e;
    public hg1 f;
    public hg1 g;
    public hg1 h;
    public hg1 i;
    public final Object j;
    public final boolean k;
    public Object l;
    public int m;

    public hg1(boolean z, hg1 hg1Var, Object obj, hg1 hg1Var2, hg1 hg1Var3) {
        this.e = hg1Var;
        this.j = obj;
        this.k = z;
        this.m = 1;
        this.h = hg1Var2;
        this.i = hg1Var3;
        hg1Var3.h = this;
        hg1Var2.i = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.j;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.l;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.j;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.l;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.j;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.l;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.k) {
            b81.k("value == null");
            return null;
        }
        Object obj2 = this.l;
        this.l = obj;
        return obj2;
    }

    public final String toString() {
        return this.j + "=" + this.l;
    }

    public hg1(boolean z) {
        this.j = null;
        this.k = z;
        this.i = this;
        this.h = this;
    }
}
