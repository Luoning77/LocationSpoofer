package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class dn2 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ pu0 f;
    public final /* synthetic */ p10 g;
    public final /* synthetic */ pu0 h;
    public final /* synthetic */ pu0 i;
    public final /* synthetic */ iy1 j;
    public final /* synthetic */ pu0 k;

    public dn2(int i, pu0 pu0Var, p10 p10Var, pu0 pu0Var2, pu0 pu0Var3, iy1 iy1Var, pu0 pu0Var4) {
        this.e = i;
        this.f = pu0Var;
        this.g = p10Var;
        this.h = pu0Var2;
        this.i = pu0Var3;
        this.j = iy1Var;
        this.k = pu0Var4;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        f30 f30Var = (f30) obj;
        int iIntValue = ((Number) obj2).intValue();
        ov0 ov0Var = (ov0) f30Var;
        if (ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            wc0.o(this.e, this.f, this.g, this.h, this.i, this.j, this.k, ov0Var, 0);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }
}
