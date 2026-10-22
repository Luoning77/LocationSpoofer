package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class o03 implements rh3 {
    public final rh3 e;
    public final long f;

    public o03(rh3 rh3Var, long j) {
        this.e = rh3Var;
        this.f = j;
    }

    @Override // defpackage.rh3
    public final boolean a() {
        return this.e.a();
    }

    @Override // defpackage.rh3
    public final long b(yi yiVar, yi yiVar2, yi yiVar3) {
        return this.e.b(yiVar, yiVar2, yiVar3) + this.f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o03)) {
            return false;
        }
        o03 o03Var = (o03) obj;
        return o03Var.f == this.f && o51.f(o03Var.e, this.e);
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + (this.e.hashCode() * 31);
    }

    @Override // defpackage.rh3
    public final yi m(long j, yi yiVar, yi yiVar2, yi yiVar3) {
        long j2 = this.f;
        return j < j2 ? yiVar3 : this.e.m(j - j2, yiVar, yiVar2, yiVar3);
    }

    @Override // defpackage.rh3
    public final yi p(long j, yi yiVar, yi yiVar2, yi yiVar3) {
        long j2 = this.f;
        return j < j2 ? yiVar : this.e.p(j - j2, yiVar, yiVar2, yiVar3);
    }
}
