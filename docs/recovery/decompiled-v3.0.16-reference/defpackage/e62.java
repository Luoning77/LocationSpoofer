package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class e62 implements w70 {
    public static final k91 f = new k91(13);
    public final d62 e;

    public e62(d62 d62Var) {
        this.e = d62Var;
    }

    @Override // defpackage.y70
    public final Object fold(Object obj, pu0 pu0Var) {
        return da0.u(this, obj, pu0Var);
    }

    @Override // defpackage.y70
    public final w70 get(x70 x70Var) {
        return da0.v(this, x70Var);
    }

    @Override // defpackage.w70
    public final x70 getKey() {
        return f;
    }

    @Override // defpackage.y70
    public final y70 minusKey(x70 x70Var) {
        return da0.C(this, x70Var);
    }

    @Override // defpackage.y70
    public final y70 plus(y70 y70Var) {
        return da0.E(y70Var, this);
    }
}
