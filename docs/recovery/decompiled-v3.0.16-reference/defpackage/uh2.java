package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class uh2 implements q11 {
    public final boolean a;
    public final float b;
    public final long c;

    public uh2(float f, long j, boolean z) {
        this.a = z;
        this.b = f;
        this.c = j;
    }

    @Override // defpackage.q11
    public final kb0 a(ix1 ix1Var) {
        return new qb0(ix1Var, this.a, this.b, new pb0(this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uh2)) {
            return false;
        }
        uh2 uh2Var = (uh2) obj;
        if (this.a != uh2Var.a || !td0.b(this.b, uh2Var.b)) {
            return false;
        }
        long j = uh2Var.c;
        int i = hz.h;
        return ye3.a(this.c, j);
    }

    @Override // defpackage.q11
    public final int hashCode() {
        int iC = az2.c(this.b, Boolean.hashCode(this.a) * 31, 961);
        int i = hz.h;
        return Long.hashCode(this.c) + iC;
    }
}
