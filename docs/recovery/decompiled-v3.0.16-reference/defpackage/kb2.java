package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class kb2 implements pv2 {
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ kb2(Object obj, Object obj2) {
        this.e = obj;
        this.f = obj2;
    }

    @Override // defpackage.pv2
    public boolean b() {
        mb2 mb2Var = (mb2) this.e;
        tp tpVar = (tp) this.f;
        boolean z = mb2Var.u;
        if (z) {
            return z;
        }
        mb2Var.h();
        long jA = tp.a(mb2Var.s, tpVar.a);
        tpVar.a = jA;
        boolean z2 = !mb2Var.g(mb2Var.r, jA + tpVar.b);
        mb2Var.u = z2;
        return z2;
    }
}
