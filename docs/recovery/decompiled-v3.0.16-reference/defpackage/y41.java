package defpackage;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class y41 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ z41 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y41(z41 z41Var, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.g = z41Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        z41 z41Var = this.g;
        switch (i) {
            case 0:
                y41 y41Var = new y41(z41Var, q60Var, 0);
                y41Var.f = obj;
                return y41Var;
            case 1:
                y41 y41Var2 = new y41(z41Var, q60Var, 1);
                y41Var2.f = obj;
                return y41Var2;
            default:
                y41 y41Var3 = new y41(z41Var, q60Var, 2);
                y41Var3.f = obj;
                return y41Var3;
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        q60 q60Var = (q60) obj2;
        switch (i) {
            case 0:
                ((y41) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
            case 1:
                ((y41) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
            default:
                ((y41) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
        }
        return mf3Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        q60 q60Var = null;
        z41 z41Var = this.g;
        CoroutineScope coroutineScope = (CoroutineScope) this.f;
        switch (i) {
            case 0:
                ee0.J(obj);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new x41(z41Var, q60Var, 0), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new x41(z41Var, q60Var, 1), 3, null);
                break;
            case 1:
                ee0.J(obj);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new x41(z41Var, q60Var, 2), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new x41(z41Var, q60Var, 3), 3, null);
                break;
            default:
                ee0.J(obj);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new x41(z41Var, q60Var, 4), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new x41(z41Var, q60Var, 5), 3, null);
                break;
        }
        return mf3Var;
    }
}
