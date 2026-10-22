package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ag1 extends bg1 {
    public final String a;
    public final b93 b;

    public ag1(String str, b93 b93Var) {
        this.a = str;
        this.b = b93Var;
    }

    @Override // defpackage.bg1
    public final b93 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag1)) {
            return false;
        }
        ag1 ag1Var = (ag1) obj;
        return o51.f(this.a, ag1Var.a) && o51.f(this.b, ag1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        b93 b93Var = this.b;
        return (iHashCode + (b93Var != null ? b93Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return p91.q(new StringBuilder("LinkAnnotation.Url(url="), this.a, ')');
    }
}
