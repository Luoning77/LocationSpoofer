package defpackage;

import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ap0 implements Flow {
    public final /* synthetic */ Flow e;
    public final /* synthetic */ ii2 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ lu0 h;

    public ap0(Flow flow, ii2 ii2Var, boolean z, lu0 lu0Var) {
        this.e = flow;
        this.f = ii2Var;
        this.g = z;
        this.h = lu0Var;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, q60 q60Var) {
        Object objCollect = this.e.collect(new zo0(flowCollector, this.f, this.g, this.h), q60Var);
        return objCollect == z70.e ? objCollect : mf3.a;
    }
}
