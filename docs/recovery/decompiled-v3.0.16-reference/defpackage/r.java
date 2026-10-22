package defpackage;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class r extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ s f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(s sVar, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.f = sVar;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        s sVar = this.f;
        switch (i) {
            case 0:
                return new r(sVar, q60Var, 0);
            default:
                return new r(sVar, q60Var, 1);
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
                ((r) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
            default:
                ((r) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
        }
        return mf3Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        q60 q60Var = null;
        s sVar = this.f;
        switch (i) {
            case 0:
                ee0.J(obj);
                if (sVar.G == null) {
                    ly0 ly0Var = new ly0();
                    ix1 ix1Var = sVar.u;
                    if (ix1Var != null) {
                        BuildersKt__Builders_commonKt.launch$default(sVar.a1(), null, null, new k(ix1Var, ly0Var, q60Var, 0), 3, null);
                    }
                    sVar.G = ly0Var;
                }
                break;
            default:
                ee0.J(obj);
                ly0 ly0Var2 = sVar.G;
                if (ly0Var2 != null) {
                    my0 my0Var = new my0(ly0Var2);
                    ix1 ix1Var2 = sVar.u;
                    if (ix1Var2 != null) {
                        BuildersKt__Builders_commonKt.launch$default(sVar.a1(), null, null, new k(ix1Var2, my0Var, q60Var, 1), 3, null);
                    }
                    sVar.G = null;
                }
                break;
        }
        return mf3Var;
    }
}
