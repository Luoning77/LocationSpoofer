package defpackage;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hi implements FlowCollector {
    public final /* synthetic */ kc2 e;
    public final /* synthetic */ mc3 f;
    public final /* synthetic */ ey1 g;

    public hi(kc2 kc2Var, mc3 mc3Var, ey1 ey1Var) {
        this.e = kc2Var;
        this.f = mc3Var;
        this.g = ey1Var;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, q60 q60Var) {
        boolean zBooleanValue;
        if (((Boolean) obj).booleanValue()) {
            pu0 pu0Var = (pu0) this.g.getValue();
            mc3 mc3Var = this.f;
            zBooleanValue = ((Boolean) pu0Var.invoke(mc3Var.c(), mc3Var.d.getValue())).booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.e.setValue(Boolean.valueOf(zBooleanValue));
        return mf3.a;
    }
}
