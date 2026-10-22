package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class pq1 extends qq1 {
    public final List a;
    public final List b;

    public pq1(List list, List list2) {
        list.getClass();
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq1)) {
            return false;
        }
        pq1 pq1Var = (pq1) obj;
        return o51.f(this.a, pq1Var.a) && this.b.equals(pq1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Table(header=" + this.a + ", rows=" + this.b + ")";
    }
}
