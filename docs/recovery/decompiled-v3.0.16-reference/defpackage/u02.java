package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class u02 implements y81 {
    public final zb1 a = ig0.A(ce1.f, new oi1(this));

    @Override // defpackage.y81
    public final Object deserialize(w90 w90Var) {
        bt2 descriptor = getDescriptor();
        l30 l30VarB = w90Var.b(descriptor);
        int iJ = l30VarB.j(getDescriptor());
        if (iJ != -1) {
            throw new x31(p91.l(iJ, "Unexpected index "));
        }
        l30VarB.a(descriptor);
        return mf3.a;
    }

    @Override // defpackage.y81
    public final bt2 getDescriptor() {
        return (bt2) this.a.getValue();
    }

    @Override // defpackage.y81
    public final void serialize(ak0 ak0Var, Object obj) {
        obj.getClass();
        ak0Var.b(getDescriptor()).a(getDescriptor());
    }
}
