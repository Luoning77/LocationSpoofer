package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class yu2 extends aa1 implements qu0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yu2(Object obj, int i) {
        super(3);
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                jk1 jk1Var = (jk1) obj;
                ((Number) obj3).intValue();
                ov0 ov0Var = (ov0) ((f30) obj2);
                Object objQ = ov0Var.Q();
                c30 c30Var = d30.a;
                if (objQ == c30Var) {
                    objQ = oi0.j(ov0Var);
                    ov0Var.m0(objQ);
                }
                CoroutineScope coroutineScope = (CoroutineScope) objQ;
                Object objQ2 = ov0Var.Q();
                if (objQ2 == c30Var) {
                    objQ2 = new wu2(jk1Var, coroutineScope);
                    ov0Var.m0(objQ2);
                }
                wu2 wu2Var = (wu2) objQ2;
                ((p10) obj4).invoke(wu2Var, new av2(wu2Var), ov0Var, 6);
                return mf3.a;
            default:
                h82 h82VarS = ((zq1) obj2).s(((l50) obj3).a);
                return ((gr1) obj).H0(h82VarS.e, h82VarS.f, vj0.e, new ze(6, h82VarS, (g60) obj4));
        }
    }
}
