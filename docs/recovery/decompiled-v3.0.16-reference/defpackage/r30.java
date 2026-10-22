package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class r30 implements t32, w70 {
    public static final c30 f = new c30(1);
    public final ov0 e;

    public r30(ov0 ov0Var) {
        this.e = ov0Var;
    }

    @Override // defpackage.t32
    public final List b(Integer num) {
        return this.e.J();
    }

    @Override // defpackage.y70
    public final /* bridge */ Object fold(Object obj, pu0 pu0Var) {
        return da0.u(this, obj, pu0Var);
    }

    @Override // defpackage.y70
    public final /* bridge */ w70 get(x70 x70Var) {
        return da0.v(this, x70Var);
    }

    @Override // defpackage.w70
    public final x70 getKey() {
        return f;
    }

    @Override // defpackage.t32
    public final boolean h() {
        return this.e.C;
    }

    @Override // defpackage.y70
    public final /* bridge */ y70 minusKey(x70 x70Var) {
        return da0.C(this, x70Var);
    }

    @Override // defpackage.y70
    public final /* bridge */ y70 plus(y70 y70Var) {
        return da0.E(y70Var, this);
    }
}
