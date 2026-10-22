package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class ar implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ a93 f;
    public final /* synthetic */ lu0 g;

    public /* synthetic */ ar(a93 a93Var, lu0 lu0Var, int i) {
        this.e = i;
        this.f = a93Var;
        this.g = lu0Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        lu0 lu0Var = this.g;
        a93 a93Var = this.f;
        switch (i) {
            case 0:
                x83 x83Var = (x83) obj;
                if (a93Var != null) {
                    a93Var.a.setValue(x83Var);
                }
                if (lu0Var != null) {
                    lu0Var.invoke(x83Var);
                }
                return mf3.a;
            default:
                a93Var.c.add(lu0Var);
                return new nn(4, a93Var, lu0Var);
        }
    }
}
