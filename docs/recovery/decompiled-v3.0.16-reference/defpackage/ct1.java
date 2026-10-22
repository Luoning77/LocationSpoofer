package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ct1 implements pu0 {
    public final /* synthetic */ ss1 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ p10 g;

    public ct1(ss1 ss1Var, boolean z, p10 p10Var) {
        this.e = ss1Var;
        this.f = z;
        this.g = p10Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        f30 f30Var = (f30) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = 2;
        ov0 ov0Var = (ov0) f30Var;
        if (ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            ov0Var.c0(-864293207);
            ov0Var.p(false);
            hh0 hh0Var = v50.a;
            boolean z = this.f;
            ss1 ss1Var = this.e;
            k22.b(hh0Var.a(new hz(z ? ss1Var.a : ss1Var.d)), sb.a0(-893579015, new fw(this.g, i), ov0Var), ov0Var, 56);
            ov0Var.c0(-863072055);
            ov0Var.p(false);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }
}
