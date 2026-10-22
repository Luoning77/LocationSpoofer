package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hs extends hv1 {
    public final float a;
    public final qy2 b;
    public final au2 c;

    public hs(float f, qy2 qy2Var, au2 au2Var) {
        this.a = f;
        this.b = qy2Var;
        this.c = au2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs)) {
            return false;
        }
        hs hsVar = (hs) obj;
        return td0.b(this.a, hsVar.a) && this.b.equals(hsVar.b) && o51.f(this.c, hsVar.c);
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        return new gs(this.a, this.b, this.c);
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        gs gsVar = (gs) cv1Var;
        float f = gsVar.v;
        wu wuVar = gsVar.y;
        float f2 = this.a;
        if (!td0.b(f, f2)) {
            gsVar.v = f2;
            wuVar.m1();
        }
        qy2 qy2Var = gsVar.w;
        qy2 qy2Var2 = this.b;
        if (!o51.f(qy2Var, qy2Var2)) {
            gsVar.w = qy2Var2;
            wuVar.m1();
        }
        au2 au2Var = gsVar.x;
        au2 au2Var2 = this.c;
        if (o51.f(au2Var, au2Var2)) {
            return;
        }
        gsVar.x = au2Var2;
        wuVar.m1();
        ee0.C(gsVar);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) td0.c(this.a)) + ", brush=" + this.b + ", shape=" + this.c + ')';
    }
}
