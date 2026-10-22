package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hh0 extends cd2 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hh0(int i, au0 au0Var) {
        super(au0Var);
        this.b = i;
    }

    @Override // defpackage.cd2
    public final kk a(Object obj) {
        switch (this.b) {
            case 0:
                return new kk(this, obj, obj == null, u92.q, true);
            default:
                return new kk(this, obj, obj == null, null, false);
        }
    }
}
