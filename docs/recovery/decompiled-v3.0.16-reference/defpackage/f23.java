package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class f23 extends aa1 implements pu0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ g23 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f23(g23 g23Var, int i) {
        super(2);
        this.f = i;
        this.g = g23Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        mf3 mf3Var = mf3.a;
        g23 g23Var = this.g;
        switch (i) {
            case 0:
                g23Var.a().f = (o30) obj2;
                break;
            case 1:
                vb1 vb1VarA = g23Var.a();
                ((hb1) obj).c0(new rb1(vb1VarA, (pu0) obj2, vb1VarA.t));
                break;
            default:
                hb1 hb1Var = (hb1) obj;
                j23 j23Var = g23Var.a;
                vb1 vb1Var = hb1Var.M;
                if (vb1Var == null) {
                    vb1Var = new vb1(hb1Var, j23Var);
                    hb1Var.M = vb1Var;
                }
                g23Var.b = vb1Var;
                g23Var.a().g();
                vb1 vb1VarA2 = g23Var.a();
                if (vb1VarA2.g != j23Var) {
                    vb1VarA2.g = j23Var;
                    vb1VarA2.i(false);
                    hb1.V(vb1VarA2.e, false, 7);
                }
                break;
        }
        return mf3Var;
    }
}
