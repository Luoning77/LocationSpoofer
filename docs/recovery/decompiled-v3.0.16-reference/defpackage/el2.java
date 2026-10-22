package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class el2 implements Map.Entry {
    public final cf1 e;
    public final ef1 f;
    public el2 g;
    public el2 h;

    public el2(cf1 cf1Var, ef1 ef1Var) {
        this.e = cf1Var;
        this.f = ef1Var;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof el2) {
            el2 el2Var = (el2) obj;
            return this.e.equals(el2Var.e) && this.f == el2Var.f;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.e;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f.hashCode() ^ this.e.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.e + "=" + this.f;
    }
}
