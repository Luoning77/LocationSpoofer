package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class h9 implements pu0 {
    public final /* synthetic */ pu0 e;
    public final /* synthetic */ pu0 f;
    public final /* synthetic */ au2 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;
    public final /* synthetic */ long j;
    public final /* synthetic */ long k;
    public final /* synthetic */ pu0 l;
    public final /* synthetic */ p10 m;

    public h9(pu0 pu0Var, pu0 pu0Var2, au2 au2Var, long j, long j2, long j3, long j4, pu0 pu0Var3, p10 p10Var) {
        this.e = pu0Var;
        this.f = pu0Var2;
        this.g = au2Var;
        this.h = j;
        this.i = j2;
        this.j = j3;
        this.k = j4;
        this.l = pu0Var3;
        this.m = p10Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        f30 f30Var = (f30) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = 1;
        ov0 ov0Var = (ov0) f30Var;
        if (ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            i9.a(sb.a0(1367541877, new g9(this.l, this.m, i), ov0Var), null, this.e, this.f, this.g, this.h, mz.d(sb.K, ov0Var), this.i, this.j, this.k, ov0Var, 6);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }
}
