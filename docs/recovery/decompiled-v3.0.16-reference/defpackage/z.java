package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class z implements w70 {
    private final x70 key;

    public z(x70 x70Var) {
        x70Var.getClass();
        this.key = x70Var;
    }

    @Override // defpackage.y70
    public /* bridge */ <R> R fold(R r, pu0 pu0Var) {
        return (R) da0.u(this, r, pu0Var);
    }

    @Override // defpackage.y70
    public /* bridge */ <E extends w70> E get(x70 x70Var) {
        return (E) da0.v(this, x70Var);
    }

    @Override // defpackage.w70
    public x70 getKey() {
        return this.key;
    }

    @Override // defpackage.y70
    public /* bridge */ y70 minusKey(x70 x70Var) {
        return da0.C(this, x70Var);
    }

    @Override // defpackage.y70
    public /* bridge */ y70 plus(y70 y70Var) {
        return da0.E(y70Var, this);
    }
}
