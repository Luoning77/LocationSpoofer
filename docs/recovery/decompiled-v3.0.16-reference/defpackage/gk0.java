package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class gk0 extends aa1 implements lu0 {
    public final /* synthetic */ boolean f;
    public final /* synthetic */ au0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk0(boolean z, au0 au0Var) {
        super(1);
        this.f = z;
        this.g = au0Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        ((ow0) obj).n(!this.f && ((Boolean) this.g.invoke()).booleanValue());
        return mf3.a;
    }
}
