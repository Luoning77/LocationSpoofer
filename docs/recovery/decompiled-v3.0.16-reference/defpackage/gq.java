package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class gq extends hv1 {
    public final long a;
    public final st b;
    public final au2 c;

    public gq(long j, vf1 vf1Var, au2 au2Var, int i) {
        j = (i & 1) != 0 ? hz.g : j;
        vf1Var = (i & 2) != 0 ? null : vf1Var;
        this.a = j;
        this.b = vf1Var;
        this.c = au2Var;
    }

    public final boolean equals(Object obj) {
        gq gqVar = obj instanceof gq ? (gq) obj : null;
        if (gqVar == null) {
            return false;
        }
        long j = gqVar.a;
        int i = hz.h;
        return ye3.a(this.a, j) && o51.f(this.b, gqVar.b) && o51.f(this.c, gqVar.c);
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        hq hqVar = new hq();
        hqVar.s = this.a;
        hqVar.t = this.b;
        hqVar.u = 1.0f;
        hqVar.v = this.c;
        hqVar.w = 9205357640488583168L;
        return hqVar;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        hq hqVar = (hq) cv1Var;
        hqVar.s = this.a;
        hqVar.t = this.b;
        hqVar.u = 1.0f;
        au2 au2Var = hqVar.v;
        au2 au2Var2 = this.c;
        if (!o51.f(au2Var, au2Var2)) {
            hqVar.v = au2Var2;
            ee0.C(hqVar);
        }
        ig0.z(hqVar);
    }

    public final int hashCode() {
        int i = hz.h;
        int iHashCode = Long.hashCode(this.a) * 31;
        st stVar = this.b;
        return this.c.hashCode() + az2.c(1.0f, (iHashCode + (stVar != null ? stVar.hashCode() : 0)) * 31, 31);
    }
}
