package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class rf0 extends k33 implements qu0 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rf0(int i, q60 q60Var, int i2) {
        super(i, q60Var);
        this.e = i2;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        int i2 = 3;
        switch (i) {
            case 0:
                long j = ((c12) obj2).a;
                new rf0(i2, (q60) obj3, 0).invokeSuspend(mf3Var);
                break;
            case 1:
                ((Number) obj2).floatValue();
                new rf0(i2, (q60) obj3, 1).invokeSuspend(mf3Var);
                break;
            default:
                long j2 = ((c12) obj2).a;
                new rf0(i2, (q60) obj3, 2).invokeSuspend(mf3Var);
                break;
        }
        return mf3Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                ee0.J(obj);
                break;
            case 1:
                ee0.J(obj);
                break;
            default:
                ee0.J(obj);
                break;
        }
        return mf3Var;
    }
}
