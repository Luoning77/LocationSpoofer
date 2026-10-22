package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class aq extends aa1 implements pu0 {
    public final /* synthetic */ boolean f;
    public final /* synthetic */ au0 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq(boolean z, au0 au0Var, int i, int i2) {
        super(2);
        this.f = z;
        this.g = au0Var;
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i = this.h | 1;
        int i2 = this.i;
        xq1.g(this.f, this.g, (f30) obj, i, i2);
        return mf3.a;
    }
}
