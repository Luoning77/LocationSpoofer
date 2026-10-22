package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class iq2 implements s63 {
    public long a = 0;
    public long b = 0;
    public yp2 c = u92.l;
    public final /* synthetic */ gq2 d;
    public final /* synthetic */ er2 e;
    public final /* synthetic */ long f;

    public iq2(gq2 gq2Var, er2 er2Var, long j) {
        this.d = gq2Var;
        this.e = er2Var;
        this.f = j;
    }

    @Override // defpackage.s63
    public final void a(long j, yp2 yp2Var) {
        this.c = yp2Var;
        pa1 pa1Var = (pa1) this.d.invoke();
        er2 er2Var = this.e;
        if (pa1Var != null) {
            if (!pa1Var.U()) {
                return;
            }
            yp2 yp2Var2 = this.c;
            oe oeVar = er2Var.f;
            if (oeVar != null) {
                oeVar.invoke(Boolean.TRUE, pa1Var, new c12(j), yp2Var2);
            }
            this.a = j;
        }
        if (fr2.a(er2Var, this.f)) {
            this.b = 0L;
        }
    }

    @Override // defpackage.s63
    public final void b() {
        bq2 bq2Var;
        long j = this.f;
        er2 er2Var = this.e;
        if (!fr2.a(er2Var, j) || (bq2Var = er2Var.h) == null) {
            return;
        }
        bq2Var.invoke();
    }

    @Override // defpackage.s63
    public final void e(long j) {
        pa1 pa1Var = (pa1) this.d.invoke();
        if (pa1Var == null || !pa1Var.U()) {
            return;
        }
        er2 er2Var = this.e;
        if (fr2.a(er2Var, this.f)) {
            long jE = c12.e(this.b, j);
            this.b = jE;
            long jE2 = c12.e(this.a, jE);
            if (er2Var.b(pa1Var, jE2, this.a, this.c, true)) {
                this.a = jE2;
                this.b = 0L;
            }
        }
    }

    @Override // defpackage.s63
    public final void onCancel() {
        bq2 bq2Var;
        long j = this.f;
        er2 er2Var = this.e;
        if (!fr2.a(er2Var, j) || (bq2Var = er2Var.h) == null) {
            return;
        }
        bq2Var.invoke();
    }

    @Override // defpackage.s63
    public final void c() {
    }

    @Override // defpackage.s63
    public final void d() {
    }
}
