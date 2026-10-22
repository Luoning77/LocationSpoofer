package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class jk0 extends aa1 implements lu0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ lu0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jk0(int i, lu0 lu0Var) {
        super(1);
        this.f = i;
        this.g = lu0Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.f;
        lu0 lu0Var = this.g;
        switch (i) {
            case 0:
                break;
        }
        return new h41(((long) ((Number) lu0Var.invoke(Integer.valueOf((int) (((p41) obj).a >> 32)))).intValue()) << 32);
    }
}
