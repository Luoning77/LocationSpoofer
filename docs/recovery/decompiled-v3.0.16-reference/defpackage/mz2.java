package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mz2 extends pz2 {
    public final List a;
    public final boolean b;
    public final String c;

    public mz2(List list, boolean z, String str) {
        list.getClass();
        this.a = list;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz2)) {
            return false;
        }
        mz2 mz2Var = (mz2) obj;
        return o51.f(this.a, mz2Var.a) && this.b == mz2Var.b && this.c.equals(mz2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + p91.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSearchResults(results=");
        sb.append(this.a);
        sb.append(", show=");
        sb.append(this.b);
        sb.append(", query=");
        return az2.p(sb, this.c, ")");
    }
}
