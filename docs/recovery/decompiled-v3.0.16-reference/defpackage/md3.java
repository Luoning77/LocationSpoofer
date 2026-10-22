package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class md3 implements Serializable {
    public final Object e;
    public final Object f;
    public final Object g;

    public md3(Object obj, Object obj2, Object obj3) {
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md3)) {
            return false;
        }
        md3 md3Var = (md3) obj;
        return o51.f(this.e, md3Var.e) && o51.f(this.f, md3Var.f) && o51.f(this.g, md3Var.g);
    }

    public final int hashCode() {
        Object obj = this.e;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.g;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.e + ", " + this.f + ", " + this.g + ')';
    }
}
