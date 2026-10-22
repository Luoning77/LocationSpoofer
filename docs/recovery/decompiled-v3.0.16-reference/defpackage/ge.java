package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ge implements pu0 {
    public final /* synthetic */ dv1 e;
    public final /* synthetic */ fy1 f;
    public final /* synthetic */ ey1 g;
    public final /* synthetic */ co2 h;
    public final /* synthetic */ au2 i;
    public final /* synthetic */ long j;
    public final /* synthetic */ float k;
    public final /* synthetic */ p10 l;

    public ge(dv1 dv1Var, fy1 fy1Var, ey1 ey1Var, co2 co2Var, au2 au2Var, long j, float f, p10 p10Var) {
        this.e = dv1Var;
        this.f = fy1Var;
        this.g = ey1Var;
        this.h = co2Var;
        this.i = au2Var;
        this.j = j;
        this.k = f;
        this.l = p10Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        f30 f30Var = (f30) obj;
        int iIntValue = ((Number) obj2).intValue();
        ov0 ov0Var = (ov0) f30Var;
        if (ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            hd0.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, ov0Var, 384);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }
}
