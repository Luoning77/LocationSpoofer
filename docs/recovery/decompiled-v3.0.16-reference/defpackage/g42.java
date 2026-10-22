package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class g42 implements pu0 {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ix1 g;
    public final /* synthetic */ t63 h;
    public final /* synthetic */ au2 i;

    public g42(boolean z, boolean z2, ix1 ix1Var, t63 t63Var, au2 au2Var) {
        this.e = z;
        this.f = z2;
        this.g = ix1Var;
        this.h = t63Var;
        this.i = au2Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        f30 f30Var = (f30) obj;
        int iIntValue = ((Number) obj2).intValue();
        ov0 ov0Var = (ov0) f30Var;
        if (ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            j9.Z.h(this.e, this.f, this.g, null, this.h, this.i, 0.0f, 0.0f, ov0Var, 100663296, 200);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }
}
