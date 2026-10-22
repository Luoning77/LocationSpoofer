package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class o5 implements pu0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ au0 g;

    public /* synthetic */ o5(au0 au0Var, boolean z) {
        this.g = au0Var;
        this.f = z;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        boolean z = this.f;
        switch (i) {
            case 0:
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    n51.j(this.g, null, !z, null, null, null, o51.T, ov0Var, 805306368, 506);
                }
                break;
            case 1:
                f30 f30Var2 = (f30) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ov0Var2.W();
                } else {
                    n51.j(this.g, null, !z, null, null, null, ym3.e, ov0Var2, 805306368, 506);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ee0.f(z, this.g, (f30) obj, wc0.m0(1));
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ o5(boolean z, au0 au0Var) {
        this.f = z;
        this.g = au0Var;
    }

    public /* synthetic */ o5(boolean z, au0 au0Var, int i) {
        this.f = z;
        this.g = au0Var;
    }
}
