package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class uv implements w70, x70 {
    public static final u92 f = new u92(28);
    public static final uv g = new uv(1);
    public final /* synthetic */ int e;

    public /* synthetic */ uv(int i) {
        this.e = i;
    }

    @Override // defpackage.y70
    public final Object fold(Object obj, pu0 pu0Var) {
        switch (this.e) {
            case 0:
                break;
        }
        return da0.u(this, obj, pu0Var);
    }

    @Override // defpackage.y70
    public final w70 get(x70 x70Var) {
        switch (this.e) {
            case 0:
                break;
        }
        return da0.v(this, x70Var);
    }

    @Override // defpackage.w70
    public final x70 getKey() {
        switch (this.e) {
            case 0:
                return f;
            default:
                return g;
        }
    }

    @Override // defpackage.y70
    public final y70 minusKey(x70 x70Var) {
        switch (this.e) {
            case 0:
                break;
        }
        return da0.C(this, x70Var);
    }

    @Override // defpackage.y70
    public final y70 plus(y70 y70Var) {
        switch (this.e) {
            case 0:
                break;
        }
        return da0.E(y70Var, this);
    }
}
