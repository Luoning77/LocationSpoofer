package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ty2 implements q30, Iterable, p81 {
    public final hx2 e;
    public final int f;
    public final jf2 g;

    public ty2(hx2 hx2Var, int i, qv0 qv0Var, jf2 jf2Var) {
        this.e = hx2Var;
        this.f = i;
        this.g = jf2Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ty2)) {
            return false;
        }
        ty2 ty2Var = (ty2) obj;
        return ty2Var.f == this.f && ty2Var.e == this.e && ty2Var.g.equals(this.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.e.hashCode() + (this.f * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new mh2(this.e, this.f, null, this.g);
    }
}
