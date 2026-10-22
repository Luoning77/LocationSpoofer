package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class rp2 implements qu0 {
    public final /* synthetic */ q11 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ vh2 h;
    public final /* synthetic */ au0 i;

    public rp2(q11 q11Var, boolean z, boolean z2, vh2 vh2Var, au0 au0Var) {
        this.e = q11Var;
        this.f = z;
        this.g = z2;
        this.h = vh2Var;
        this.i = au0Var;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        ov0 ov0Var = (ov0) ((f30) obj2);
        ov0Var.c0(-1525724089);
        Object objQ = ov0Var.Q();
        if (objQ == d30.a) {
            objQ = new ix1();
            ov0Var.m0(objQ);
        }
        ix1 ix1Var = (ix1) objQ;
        dv1 dv1VarD = m11.a(av1.a, ix1Var, this.e).d(new pp2(this.f, ix1Var, null, false, this.g, this.h, this.i));
        ov0Var.p(false);
        return dv1VarD;
    }
}
