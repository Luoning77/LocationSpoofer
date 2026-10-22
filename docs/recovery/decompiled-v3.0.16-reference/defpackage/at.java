package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class at extends hv1 {
    public final yg a;

    public at(yg ygVar) {
        this.a = ygVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof at) {
            return this.a == ((at) obj).a;
        }
        return false;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        return new ct(this.a);
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        ct ctVar = (ct) cv1Var;
        yg ygVar = this.a;
        ctVar.s = ygVar;
        if (ctVar.r) {
            ygVar.invoke(ctVar.t);
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
