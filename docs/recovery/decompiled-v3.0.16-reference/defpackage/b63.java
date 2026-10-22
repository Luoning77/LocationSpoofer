package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class b63 implements y53 {
    public final long e;
    public final /* synthetic */ c63 f;

    public b63(c63 c63Var, long j) {
        this.f = c63Var;
        this.e = j;
    }

    @Override // defpackage.y53
    public final pe2 E(pa1 pa1Var) {
        return ce0.d(z(pa1Var), 0L);
    }

    @Override // defpackage.y53
    public final x53 V0() {
        return dh0.k(this.f);
    }

    @Override // defpackage.y53
    public final long z(pa1 pa1Var) {
        pa1 pa1Var2 = (pa1) this.f.v.getValue();
        if (pa1Var2 != null) {
            return pa1Var.L(pa1Var2, this.e);
        }
        s21.d("Tried to open context menu before the anchor was placed.");
        fo.d();
        return 0L;
    }
}
