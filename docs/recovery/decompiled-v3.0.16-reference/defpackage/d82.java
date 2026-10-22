package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class d82 implements qu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ au0 f;
    public final /* synthetic */ au0 g;
    public final /* synthetic */ au0 h;
    public final /* synthetic */ au0 i;
    public final /* synthetic */ au0 j;
    public final /* synthetic */ String k;

    public /* synthetic */ d82(au0 au0Var, au0 au0Var2, au0 au0Var3, au0 au0Var4, au0 au0Var5, String str, int i) {
        this.e = i;
        this.f = au0Var;
        this.g = au0Var2;
        this.h = au0Var3;
        this.i = au0Var4;
        this.j = au0Var5;
        this.k = str;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                f30 f30Var = (f30) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((bc1) obj).getClass();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ov0Var.W();
                } else {
                    zm3.b(iw2.e(av1.a, 1.0f), 18.0f, new b52(12.0f, 4.0f, 12.0f, 4.0f), sb.a0(1123695808, new d82(this.f, this.g, this.h, this.i, this.j, this.k, 1), ov0Var), ov0Var, 25014, 8);
                }
                break;
            default:
                f30 f30Var2 = (f30) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ov0Var2.W();
                } else {
                    x01 x01VarW = da0.w();
                    long j = bk.g;
                    ig0.g(x01VarW, j, ke0.N(2131625087, ov0Var2), this.f, null, ov0Var2, 48, 16);
                    ig0.f(0, ov0Var2);
                    ig0.g(vd0.z(), j, ke0.N(2131625006, ov0Var2), this.g, null, ov0Var2, 48, 16);
                    ig0.f(0, ov0Var2);
                    ig0.g(da0.w(), j, ke0.N(2131624123, ov0Var2), this.h, null, ov0Var2, 48, 16);
                    ig0.f(0, ov0Var2);
                    ig0.g(vd0.z(), j, ke0.N(2131624348, ov0Var2), this.i, null, ov0Var2, 48, 16);
                    ig0.f(0, ov0Var2);
                    ig0.g(dh0.q(), j, ke0.N(2131624971, ov0Var2), this.j, this.k, ov0Var2, 48, 0);
                }
                break;
        }
        return mf3Var;
    }
}
