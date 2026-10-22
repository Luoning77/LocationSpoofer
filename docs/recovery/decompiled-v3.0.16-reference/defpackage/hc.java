package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hc extends aa1 implements lu0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ sc0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hc(sc0 sc0Var, int i) {
        super(1);
        this.f = i;
        this.g = sc0Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.f;
        sc0 sc0Var = this.g;
        switch (i) {
            case 0:
                sc0Var.show();
                return new h8(sc0Var, 1);
            default:
                if (sc0Var.i.a) {
                    sc0Var.h.invoke();
                }
                return mf3.a;
        }
    }
}
