package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class k30 extends e30 {
    public final t61 g;
    public int h;

    public k30(x8 x8Var, t61 t61Var) {
        super(x8Var);
        this.g = t61Var;
    }

    @Override // defpackage.e30
    public final void a() {
        this.e = true;
        this.h++;
    }

    @Override // defpackage.e30
    public final void c() {
        this.e = false;
        x8 x8Var = (x8) this.f;
        x8Var.k("\n");
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            x8Var.k(this.g.a.f);
        }
    }

    @Override // defpackage.e30
    public final void d() {
        if (this.e) {
            this.e = false;
        } else {
            c();
        }
    }

    @Override // defpackage.e30
    public final void k() {
        f(' ');
    }

    @Override // defpackage.e30
    public final void l() {
        this.h--;
    }
}
