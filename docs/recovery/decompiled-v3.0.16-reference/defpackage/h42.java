package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class h42 implements qu0 {
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ ak3 h;
    public final /* synthetic */ ix1 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ pu0 k;
    public final /* synthetic */ pu0 l;
    public final /* synthetic */ pu0 m;
    public final /* synthetic */ pu0 n;
    public final /* synthetic */ pu0 o;
    public final /* synthetic */ t63 p;
    public final /* synthetic */ au2 q;

    public h42(String str, boolean z, boolean z2, ak3 ak3Var, ix1 ix1Var, boolean z3, pu0 pu0Var, pu0 pu0Var2, pu0 pu0Var3, pu0 pu0Var4, pu0 pu0Var5, t63 t63Var, au2 au2Var) {
        this.e = str;
        this.f = z;
        this.g = z2;
        this.h = ak3Var;
        this.i = ix1Var;
        this.j = z3;
        this.k = pu0Var;
        this.l = pu0Var2;
        this.m = pu0Var3;
        this.n = pu0Var4;
        this.o = pu0Var5;
        this.p = t63Var;
        this.q = au2Var;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        pu0 pu0Var = (pu0) obj;
        f30 f30Var = (f30) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((ov0) f30Var).h(pu0Var) ? 4 : 2;
        }
        ov0 ov0Var = (ov0) f30Var;
        if (ov0Var.T(iIntValue & 1, (iIntValue & 19) != 18)) {
            j9 j9Var = j9.Z;
            au2 au2Var = this.q;
            boolean z = this.f;
            boolean z2 = this.j;
            ix1 ix1Var = this.i;
            t63 t63Var = this.p;
            j9Var.i(this.e, pu0Var, z, this.g, this.h, ix1Var, z2, this.k, this.l, this.m, this.n, this.o, t63Var, null, sb.a0(-656940872, new g42(z, z2, ix1Var, t63Var, au2Var), ov0Var), ov0Var, (iIntValue << 3) & 112);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }
}
