package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class t2 implements pu0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ String f;

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(1 & iIntValue, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    s83.b(this.f, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 0, 0, 262142);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                wc0.i(this.f, (f30) obj, wc0.m0(1));
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ t2(String str, int i) {
        this.f = str;
    }
}
