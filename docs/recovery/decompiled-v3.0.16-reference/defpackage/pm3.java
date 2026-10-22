package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class pm3 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ qm3 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pm3(qm3 qm3Var, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.g = qm3Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        qm3 qm3Var = this.g;
        switch (i) {
            case 0:
                return new pm3(qm3Var, q60Var, 0);
            default:
                return new pm3(qm3Var, q60Var, 1);
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
                break;
        }
        return ((pm3) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.e;
        qm3 qm3Var = this.g;
        z70 z70Var = z70.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ee0.J(obj);
                    db dbVar = qm3Var.e;
                    this.f = 1;
                    Object objG = dbVar.D.g(this);
                    if (objG != z70Var) {
                        objG = mf3Var;
                    }
                    if (objG == z70Var) {
                        return z70Var;
                    }
                } else {
                    if (i2 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ee0.J(obj);
                }
                return mf3Var;
            default:
                int i3 = this.f;
                if (i3 == 0) {
                    ee0.J(obj);
                    db dbVar2 = qm3Var.e;
                    this.f = 1;
                    Object objA = dbVar2.E.a(this);
                    if (objA != z70Var) {
                        objA = mf3Var;
                    }
                    if (objA == z70Var) {
                        return z70Var;
                    }
                } else {
                    if (i3 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ee0.J(obj);
                }
                return mf3Var;
        }
    }
}
