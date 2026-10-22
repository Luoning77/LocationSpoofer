package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class od3 implements bh0 {
    public final int a;
    public final int b;
    public final jh0 c;

    public od3(int i, int i2, jh0 jh0Var) {
        this.a = i;
        this.b = i2;
        this.c = jh0Var;
    }

    @Override // defpackage.si
    public final rh3 a(qd3 qd3Var) {
        return new a01(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof od3) {
            od3 od3Var = (od3) obj;
            if (od3Var.a == this.a && od3Var.b == this.b && o51.f(od3Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }

    @Override // defpackage.bh0, defpackage.si
    public final th3 a(qd3 qd3Var) {
        return new a01(this.a, this.b, this.c);
    }
}
