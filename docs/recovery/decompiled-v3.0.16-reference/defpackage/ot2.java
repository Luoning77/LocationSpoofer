package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ot2 implements ei0 {
    public final int a;
    public final int b;

    public ot2(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.ei0
    public final void a(mi0 mi0Var) {
        int iV = mh0.v(this.a, 0, mi0Var.a.c());
        int iV2 = mh0.v(this.b, 0, mi0Var.a.c());
        if (iV < iV2) {
            mi0Var.f(iV, iV2);
        } else {
            mi0Var.f(iV2, iV);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot2)) {
            return false;
        }
        ot2 ot2Var = (ot2) obj;
        return this.a == ot2Var.a && this.b == ot2Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return az2.o(sb, this.b, ')');
    }
}
