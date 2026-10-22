package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class gu1 implements q11 {
    public final long a;

    public gu1(long j) {
        this.a = j;
    }

    @Override // defpackage.q11
    public final kb0 a(ix1 ix1Var) {
        ix1Var.getClass();
        return new fu1(ix1Var, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu1)) {
            return false;
        }
        long j = ((gu1) obj).a;
        int i = hz.h;
        return ye3.a(this.a, j);
    }

    @Override // defpackage.q11
    public final int hashCode() {
        int i = hz.h;
        return Long.hashCode(this.a);
    }
}
