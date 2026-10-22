package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class gd0 extends aa1 implements au0 {
    public final /* synthetic */ boolean f;
    public final /* synthetic */ qm2 g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd0(boolean z, qm2 qm2Var, String str) {
        super(0);
        this.f = z;
        this.g = qm2Var;
        this.h = str;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        if (this.f) {
            qm2 qm2Var = this.g;
            String str = this.h;
            sm2 sm2Var = qm2Var.a;
            synchronized (sm2Var.c) {
            }
        }
        return mf3.a;
    }
}
