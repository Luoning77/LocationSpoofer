package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class b42 extends vd0 {
    public final aj2 i;
    public final re j;

    public b42(aj2 aj2Var) {
        re reVarA;
        this.i = aj2Var;
        if (mh0.O(aj2Var)) {
            reVarA = null;
        } else {
            reVarA = ue.a();
            re.c(reVarA, aj2Var);
        }
        this.j = reVarA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b42) {
            return this.i.equals(((b42) obj).i);
        }
        return false;
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    @Override // defpackage.vd0
    public final pe2 v() {
        aj2 aj2Var = this.i;
        return new pe2(aj2Var.a, aj2Var.b, aj2Var.c, aj2Var.d);
    }
}
