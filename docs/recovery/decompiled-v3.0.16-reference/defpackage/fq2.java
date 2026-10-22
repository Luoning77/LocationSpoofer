package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class fq2 implements f12, yu0 {
    public final /* synthetic */ au0 a;

    public fq2(au0 au0Var) {
        this.a = au0Var;
    }

    @Override // defpackage.yu0
    public final xu0 a() {
        return this.a;
    }

    @Override // defpackage.f12
    public final /* synthetic */ long b() {
        return ((c12) this.a.invoke()).a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f12) || !(obj instanceof yu0)) {
            return false;
        }
        return o51.f(this.a, ((yu0) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
