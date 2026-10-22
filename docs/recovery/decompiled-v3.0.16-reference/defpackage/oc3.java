package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class oc3 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ mc3 f;

    public /* synthetic */ oc3(mc3 mc3Var, int i) {
        this.e = i;
        this.f = mc3Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        mc3 mc3Var = this.f;
        switch (i) {
            case 0:
                return new pc3(mc3Var, 1);
            default:
                return new pc3(mc3Var, 0);
        }
    }
}
