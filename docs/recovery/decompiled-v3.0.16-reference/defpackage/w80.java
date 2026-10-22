package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class w80 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ lu0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w80(lu0 lu0Var, q60 q60Var) {
        super(2, q60Var);
        this.e = 2;
        this.h = lu0Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        switch (this.e) {
            case 0:
                w80 w80Var = new w80(q60Var, this.h, 0);
                w80Var.g = obj;
                return w80Var;
            case 1:
                w80 w80Var2 = new w80(q60Var, this.h, 1);
                w80Var2.g = obj;
                return w80Var2;
            default:
                w80 w80Var3 = new w80(this.h, q60Var);
                w80Var3.g = obj;
                return w80Var3;
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                return ((w80) create((z52) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 1:
                return ((w80) create((z52) obj, (q60) obj2)).invokeSuspend(mf3Var);
            default:
                return ((w80) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
        }
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        lu0 lu0Var = this.h;
        z70 z70Var = z70.e;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ee0.J(obj);
                        return obj;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                this.f = 1;
                Object objInvoke = lu0Var.invoke(this);
                return objInvoke == z70Var ? z70Var : objInvoke;
            case 1:
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ee0.J(obj);
                        return obj;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                this.f = 1;
                Object objInvoke2 = lu0Var.invoke(this);
                return objInvoke2 == z70Var ? z70Var : objInvoke2;
            default:
                int i4 = this.f;
                if (i4 == 0) {
                    ee0.J(obj);
                    if (((CoroutineScope) this.g).getCoroutineContext().get(vb3.f) != null) {
                        this.f = 1;
                        Object objInvoke3 = lu0Var.invoke(this);
                        return objInvoke3 == z70Var ? z70Var : objInvoke3;
                    }
                    fo.n("Expected a TransactionElement in the CoroutineContext but none was found.");
                } else {
                    if (i4 == 1) {
                        ee0.J(obj);
                        return obj;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w80(q60 q60Var, lu0 lu0Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.h = lu0Var;
    }
}
