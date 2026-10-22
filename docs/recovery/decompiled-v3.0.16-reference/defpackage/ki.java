package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ki extends aa1 implements qu0 {
    public final /* synthetic */ lu0 f;
    public final /* synthetic */ mc3 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki(lu0 lu0Var, mc3 mc3Var) {
        super(3);
        this.f = lu0Var;
        this.g = mc3Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0032  */
    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        gr1 gr1Var = (gr1) obj;
        h82 h82VarS = ((zq1) obj2).s(((l50) obj3).a);
        if (gr1Var.J()) {
            if (((Boolean) this.f.invoke(this.g.d.getValue())).booleanValue()) {
                j = (((long) h82VarS.e) << 32) | (((long) h82VarS.f) & 4294967295L);
            } else {
                j = 0;
            }
        } else {
            j = (((long) h82VarS.e) << 32) | (((long) h82VarS.f) & 4294967295L);
        }
        return gr1Var.H0((int) (j >> 32), (int) (4294967295L & j), vj0.e, new oa(h82VarS, 2));
    }
}
