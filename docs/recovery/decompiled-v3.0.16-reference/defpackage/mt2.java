package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mt2 implements ei0 {
    public final int a;
    public final int b;

    public mt2(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.ei0
    public final void a(mi0 mi0Var) {
        boolean z = mi0Var.d != -1;
        dm dmVar = mi0Var.a;
        if (z) {
            mi0Var.d = -1;
            mi0Var.e = -1;
        }
        int iV = mh0.v(this.a, 0, dmVar.c());
        int iV2 = mh0.v(this.b, 0, dmVar.c());
        if (iV != iV2) {
            if (iV < iV2) {
                mi0Var.e(iV, iV2);
            } else {
                mi0Var.e(iV2, iV);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt2)) {
            return false;
        }
        mt2 mt2Var = (mt2) obj;
        return this.a == mt2Var.a && this.b == mt2Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return az2.o(sb, this.b, ')');
    }
}
