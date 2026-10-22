package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class q12 extends aa1 implements au0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ x12 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q12(x12 x12Var, int i) {
        super(0);
        this.f = i;
        this.g = x12Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.f;
        mf3 mf3Var = mf3.a;
        x12 x12Var = this.g;
        switch (i) {
            case 0:
                x12Var.c();
                break;
            case 1:
                x12Var.b();
                break;
            default:
                x12Var.c();
                break;
        }
        return mf3Var;
    }
}
