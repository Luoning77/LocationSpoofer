package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class rc1 {
    public final Object a;
    public final tc1 b;
    public int d;
    public rc1 e;
    public boolean f;
    public int c = -1;
    public final w52 g = ke0.H(null);

    public rc1(Object obj, tc1 tc1Var) {
        this.a = obj;
        this.b = tc1Var;
    }

    public final rc1 a() {
        if (this.f) {
            s21.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.e.add(this);
            rc1 rc1Var = (rc1) this.g.getValue();
            if (rc1Var != null) {
                rc1Var.a();
            } else {
                rc1Var = null;
            }
            this.e = rc1Var;
        }
        this.d++;
        return this;
    }

    public final void b() {
        if (this.f) {
            return;
        }
        if (this.d <= 0) {
            s21.c("Release should only be called once");
        }
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            this.b.e.remove(this);
            rc1 rc1Var = this.e;
            if (rc1Var != null) {
                rc1Var.b();
            }
            this.e = null;
        }
    }
}
