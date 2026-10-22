package kotlinx.coroutines;

import defpackage.da0;
import defpackage.pu0;
import defpackage.w70;
import defpackage.x70;
import defpackage.y70;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class UndispatchedMarker implements w70, x70 {
    public static final UndispatchedMarker INSTANCE = new UndispatchedMarker();

    private UndispatchedMarker() {
    }

    @Override // defpackage.y70
    public <R> R fold(R r, pu0 pu0Var) {
        return (R) da0.u(this, r, pu0Var);
    }

    @Override // defpackage.y70
    public <E extends w70> E get(x70 x70Var) {
        return (E) da0.v(this, x70Var);
    }

    @Override // defpackage.y70
    public y70 minusKey(x70 x70Var) {
        return da0.C(this, x70Var);
    }

    @Override // defpackage.y70
    public y70 plus(y70 y70Var) {
        return da0.E(y70Var, this);
    }

    @Override // defpackage.w70
    public x70 getKey() {
        return this;
    }
}
