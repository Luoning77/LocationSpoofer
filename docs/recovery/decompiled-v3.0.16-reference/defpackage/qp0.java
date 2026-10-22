package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qp0 extends aa1 implements lu0 {
    public final /* synthetic */ we2 f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp0(int i, we2 we2Var) {
        super(1);
        this.f = we2Var;
        this.g = i;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        Boolean boolValueOf = Boolean.valueOf(((dq0) obj).t1(this.g));
        this.f.e = boolValueOf;
        return boolValueOf;
    }
}
