package defpackage;

import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mw1 implements Flow {
    public final /* synthetic */ Flow e;
    public final /* synthetic */ String[] f;

    public mw1(Flow flow, String[] strArr) {
        this.e = flow;
        this.f = strArr;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, q60 q60Var) {
        Object objCollect = this.e.collect(new c6(5, flowCollector, this.f), q60Var);
        return objCollect == z70.e ? objCollect : mf3.a;
    }
}
