package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class ai<S> extends hv1 {
    public final hc3 a;
    public final ey1 b;
    public final ei c;

    public ai(hc3 hc3Var, ey1 ey1Var, ei eiVar) {
        this.a = hc3Var;
        this.b = ey1Var;
        this.c = eiVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ai)) {
            return false;
        }
        ai aiVar = (ai) obj;
        return o51.f(aiVar.a, this.a) && aiVar.b.equals(this.b);
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        di diVar = new di(1);
        diVar.t = this.a;
        diVar.u = this.b;
        diVar.v = this.c;
        diVar.w = -9223372034707292160L;
        return diVar;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        di diVar = (di) cv1Var;
        diVar.t = this.a;
        diVar.u = this.b;
        diVar.v = this.c;
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        hc3 hc3Var = this.a;
        return this.b.hashCode() + ((iHashCode + (hc3Var != null ? hc3Var.hashCode() : 0)) * 31);
    }
}
