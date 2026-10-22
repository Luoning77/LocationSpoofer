package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ih2 extends aa1 implements lu0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ jh2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ih2(jh2 jh2Var, int i) {
        super(1);
        this.f = i;
        this.g = jh2Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.f;
        jh2 jh2Var = this.g;
        switch (i) {
            case 0:
                return Double.valueOf(jh2Var.n.c(mh0.t(((Number) obj).doubleValue(), jh2Var.e, jh2Var.f)));
            default:
                return Double.valueOf(mh0.t(jh2Var.k.c(((Number) obj).doubleValue()), jh2Var.e, jh2Var.f));
        }
    }
}
