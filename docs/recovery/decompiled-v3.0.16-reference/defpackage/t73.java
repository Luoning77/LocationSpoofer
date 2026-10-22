package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class t73 extends k33 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ x73 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t73(x73 x73Var, q60 q60Var, int i) {
        super(1, q60Var);
        this.e = i;
        this.f = x73Var;
    }

    @Override // defpackage.oq
    public final q60 create(q60 q60Var) {
        int i = this.e;
        x73 x73Var = this.f;
        switch (i) {
            case 0:
                return new t73(x73Var, q60Var, 0);
            case 1:
                return new t73(x73Var, q60Var, 1);
            case 2:
                return new t73(x73Var, q60Var, 2);
            default:
                return new t73(x73Var, q60Var, 3);
        }
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        q60 q60Var = (q60) obj;
        switch (i) {
            case 0:
                ((t73) create(q60Var)).invokeSuspend(mf3Var);
                break;
            case 1:
                ((t73) create(q60Var)).invokeSuspend(mf3Var);
                break;
            case 2:
                ((t73) create(q60Var)).invokeSuspend(mf3Var);
                break;
            default:
                ((t73) create(q60Var)).invokeSuspend(mf3Var);
                break;
        }
        return mf3Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        x73 x73Var = this.f;
        switch (i) {
            case 0:
                ee0.J(obj);
                x73Var.B = false;
                break;
            case 1:
                ee0.J(obj);
                x73Var.c();
                break;
            case 2:
                ee0.J(obj);
                x73Var.a(x73Var.B);
                break;
            default:
                ee0.J(obj);
                x73Var.o();
                break;
        }
        return mf3Var;
    }
}
