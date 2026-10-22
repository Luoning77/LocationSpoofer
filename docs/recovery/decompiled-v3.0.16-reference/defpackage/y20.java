package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class y20 extends aa1 implements pu0 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ a30 g;
    public final /* synthetic */ db h;
    public final /* synthetic */ p10 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y20(db dbVar, a30 a30Var, p10 p10Var) {
        super(2);
        this.h = dbVar;
        this.g = a30Var;
        this.i = p10Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        mf3 mf3Var = mf3.a;
        p10 p10Var = this.i;
        db dbVar = this.h;
        a30 a30Var = this.g;
        switch (i) {
            case 0:
                f30 f30Var = (f30) obj;
                int iIntValue = ((Number) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    ov0Var.c0(866651995);
                    z30.a(dbVar, a30Var.k, p10Var, ov0Var, 0);
                    ov0Var.p(false);
                }
                break;
            default:
                ((Number) obj2).intValue();
                a30Var.a(dbVar, p10Var, (f30) obj, wc0.m0(1));
                break;
        }
        return mf3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y20(a30 a30Var, db dbVar, p10 p10Var, int i) {
        super(2);
        this.g = a30Var;
        this.h = dbVar;
        this.i = p10Var;
    }
}
