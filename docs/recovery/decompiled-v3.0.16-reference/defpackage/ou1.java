package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class ou1 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ pu1 f;

    public /* synthetic */ ou1(pu1 pu1Var, int i) {
        this.e = i;
        this.f = pu1Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        pu1 pu1Var = this.f;
        switch (i) {
            case 0:
                if (xq1.C(pu1Var, ed2.a) == null) {
                    return null;
                }
                b81.u();
                return null;
            case 1:
                return (l42) xq1.C(pu1Var, q42.a);
            default:
                xp1.O(pu1Var).U(false);
                return mf3.a;
        }
    }
}
