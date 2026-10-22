package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class ta1 extends hv1 {
    public final Object a;

    public ta1(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ta1) && this.a.equals(((ta1) obj).a);
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        ua1 ua1Var = new ua1();
        ua1Var.s = this.a;
        return ua1Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        ((ua1) cv1Var).s = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.a + ')';
    }
}
