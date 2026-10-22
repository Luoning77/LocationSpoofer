package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class i52 implements Serializable {
    public final Object e;
    public final Object f;

    public i52(Object obj, Object obj2) {
        this.e = obj;
        this.f = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i52)) {
            return false;
        }
        i52 i52Var = (i52) obj;
        return o51.f(this.e, i52Var.e) && o51.f(this.f, i52Var.f);
    }

    public final int hashCode() {
        Object obj = this.e;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.e + ", " + this.f + ')';
    }
}
