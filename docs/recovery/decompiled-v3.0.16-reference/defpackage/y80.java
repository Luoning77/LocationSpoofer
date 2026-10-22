package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class y80 extends k33 implements lu0 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ ii2 g;
    public final /* synthetic */ lu0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y80(int i, q60 q60Var, lu0 lu0Var, ii2 ii2Var) {
        super(1, q60Var);
        this.e = i;
        this.g = ii2Var;
        this.h = lu0Var;
    }

    @Override // defpackage.oq
    public final q60 create(q60 q60Var) {
        int i = this.e;
        lu0 lu0Var = this.h;
        ii2 ii2Var = this.g;
        switch (i) {
            case 0:
                return new y80(0, q60Var, lu0Var, ii2Var);
            default:
                return new y80(1, q60Var, lu0Var, ii2Var);
        }
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        q60 q60Var = (q60) obj;
        switch (i) {
            case 0:
                break;
        }
        return ((y80) create(q60Var)).invokeSuspend(mf3Var);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        lu0 lu0Var = this.h;
        z70 z70Var = z70.e;
        ii2 ii2Var = this.g;
        q60 q60Var = null;
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
                x80 x80Var = new x80(0, q60Var, lu0Var, ii2Var);
                this.f = 1;
                Object objUseConnection = ii2Var.useConnection(false, x80Var, this);
                return objUseConnection == z70Var ? z70Var : objUseConnection;
            default:
                int i3 = this.f;
                try {
                    if (i3 == 0) {
                        ee0.J(obj);
                        ii2Var.beginTransaction();
                        this.f = 1;
                        obj = lu0Var.invoke(this);
                        if (obj == z70Var) {
                            return z70Var;
                        }
                    } else {
                        if (i3 != 1) {
                            fo.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ee0.J(obj);
                    }
                    ii2Var.setTransactionSuccessful();
                    ii2Var.endTransaction();
                    return obj;
                } catch (Throwable th) {
                    ii2Var.endTransaction();
                    throw th;
                }
        }
    }
}
