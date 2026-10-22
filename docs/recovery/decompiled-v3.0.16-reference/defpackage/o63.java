package defpackage;

import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class o63 extends lb0 implements u30, y53 {
    public z92 u;
    public lu0 v;
    public lu0 w;
    public lu0 x;
    public Job y;
    public final fc0 z = by2.b(new ol2(this, 12));
    public pe2 A = pe2.e;

    public o63(z92 z92Var, lu0 lu0Var, lu0 lu0Var2, lu0 lu0Var3) {
        this.u = z92Var;
        this.v = lu0Var;
        this.w = lu0Var2;
        this.x = lu0Var3;
    }

    @Override // defpackage.y53
    public final pe2 E(pa1 pa1Var) {
        if (!this.r) {
            return this.A;
        }
        pe2 pe2Var = (pe2) this.x.invoke(pa1Var);
        if (pe2Var == null) {
            return this.A;
        }
        this.A = pe2Var;
        return pe2Var;
    }

    @Override // defpackage.y53
    public final x53 V0() {
        return (x53) this.z.getValue();
    }

    @Override // defpackage.cv1
    public final void e1() {
        z92 z92Var = this.u;
        z92Var.g = hb3.g;
        z92Var.f = this;
    }

    @Override // defpackage.cv1
    public final void f1() {
        z92 z92Var = this.u;
        z92Var.g = hb3.f;
        z92Var.f = null;
    }

    @Override // defpackage.y53
    public final long z(pa1 pa1Var) {
        return E(pa1Var).e();
    }
}
