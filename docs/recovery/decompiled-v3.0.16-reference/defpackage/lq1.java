package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class lq1 extends qq1 {
    public final String a;
    public final String b = "";

    public lq1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lq1)) {
            return false;
        }
        lq1 lq1Var = (lq1) obj;
        return this.a.equals(lq1Var.a) && this.b.equals(lq1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return az2.l("CodeBlock(code=", this.a, ", language=", this.b, ")");
    }
}
