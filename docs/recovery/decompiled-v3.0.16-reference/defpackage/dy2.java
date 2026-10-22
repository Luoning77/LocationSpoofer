package defpackage;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class dy2 implements FlowCollector {
    public final /* synthetic */ int e;
    public final /* synthetic */ kc2 f;

    public /* synthetic */ dy2(kc2 kc2Var, int i) {
        this.e = i;
        this.f = kc2Var;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, q60 q60Var) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        kc2 kc2Var = this.f;
        switch (i) {
            case 0:
                kc2Var.setValue(obj);
                break;
            default:
                kc2Var.setValue(obj);
                break;
        }
        return mf3Var;
    }
}
