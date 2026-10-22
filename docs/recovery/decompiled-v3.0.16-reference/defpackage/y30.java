package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class y30 extends aa1 implements pu0 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ p10 g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y30(t42 t42Var, tg tgVar, p10 p10Var, int i) {
        super(2);
        this.h = t42Var;
        this.i = tgVar;
        this.g = p10Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        mf3 mf3Var = mf3.a;
        p10 p10Var = this.g;
        Object obj3 = this.i;
        Object obj4 = this.h;
        int i2 = 1;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                z30.a((t42) obj4, (tg) obj3, p10Var, (f30) obj, wc0.m0(1));
                break;
            default:
                f30 f30Var = (f30) obj;
                int iIntValue = ((Number) obj2).intValue();
                qm3 qm3Var = (qm3) obj4;
                int i3 = 0;
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    db dbVar = qm3Var.e;
                    boolean zH = ov0Var.h(qm3Var);
                    Object objQ = ov0Var.Q();
                    q60 q60Var = null;
                    c30 c30Var = d30.a;
                    if (zH || objQ == c30Var) {
                        objQ = new pm3(qm3Var, q60Var, i3);
                        ov0Var.m0(objQ);
                    }
                    oi0.e(ov0Var, (pu0) objQ, dbVar);
                    boolean zH2 = ov0Var.h(qm3Var);
                    Object objQ2 = ov0Var.Q();
                    if (zH2 || objQ2 == c30Var) {
                        objQ2 = new pm3(qm3Var, q60Var, i2);
                        ov0Var.m0(objQ2);
                    }
                    oi0.e(ov0Var, (pu0) objQ2, dbVar);
                    ((a30) obj3).a(dbVar, p10Var, ov0Var, 0);
                }
                break;
        }
        return mf3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y30(qm3 qm3Var, a30 a30Var, p10 p10Var) {
        super(2);
        this.h = qm3Var;
        this.i = a30Var;
        this.g = p10Var;
    }
}
