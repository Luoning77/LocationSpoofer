package defpackage;

import android.view.ViewStructure;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wa2 extends aa1 implements ru0 {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa2(p10 p10Var) {
        super(4);
        this.g = p10Var;
    }

    @Override // defpackage.ru0
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f;
        mf3 mf3Var = mf3.a;
        Object obj5 = this.g;
        switch (i) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                int iIntValue2 = ((Number) obj2).intValue();
                ((ViewStructure) obj5).setDimens(iIntValue, iIntValue2, 0, 0, ((Number) obj3).intValue() - iIntValue, ((Number) obj4).intValue() - iIntValue2);
                break;
            default:
                wu2 wu2Var = (wu2) obj;
                dv1 dv1Var = (dv1) obj2;
                f30 f30Var = (f30) obj3;
                int iIntValue3 = ((Number) obj4).intValue();
                int i2 = (iIntValue3 & 6) == 0 ? (((ov0) f30Var).f(wu2Var) ? 4 : 2) | iIntValue3 : iIntValue3;
                if ((iIntValue3 & 48) == 0) {
                    i2 |= ((ov0) f30Var).f(dv1Var) ? 32 : 16;
                }
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(i2 & 1, (i2 & 147) != 146)) {
                    ov0Var.W();
                } else {
                    p10 p10Var = (p10) obj5;
                    er1 er1VarC = ws.c(j9.f, false);
                    int iHashCode = Long.hashCode(ov0Var.T);
                    l72 l72VarL = ov0Var.l();
                    dv1 dv1VarH = xp1.H(ov0Var, dv1Var);
                    w20.b.getClass();
                    x30 x30Var = v20.b;
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, v20.e, er1VarC);
                    q73.h(ov0Var, v20.d, l72VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    gh ghVar = v20.f;
                    if (ov0Var.S) {
                        ov0Var.b(numValueOf, ghVar);
                    }
                    q73.g(ov0Var, v20.g);
                    q73.h(ov0Var, v20.c, dv1VarH);
                    p10Var.invoke(wu2Var, ov0Var, Integer.valueOf(i2 & 14));
                    ov0Var.p(true);
                }
                break;
        }
        return mf3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa2(ViewStructure viewStructure) {
        super(4);
        this.g = viewStructure;
    }
}
