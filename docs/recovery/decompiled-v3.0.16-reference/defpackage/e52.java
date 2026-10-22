package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class e52 {
    public final String a;
    public final Object b;

    public e52(Object obj, String str) {
        this.a = str;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e52.class != obj.getClass()) {
            return false;
        }
        e52 e52Var = (e52) obj;
        Object obj2 = e52Var.b;
        if (!this.a.equals(e52Var.a)) {
            return false;
        }
        Object obj3 = this.b;
        return obj3 instanceof Object[] ? Arrays.deepEquals((Object[]) obj3, (Object[]) obj2) : obj3.equals(obj2);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return String.format("%s: %s", this.a, this.b);
    }
}
