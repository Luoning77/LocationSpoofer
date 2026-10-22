package defpackage;

import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class rl1 implements Flow {
    public final /* synthetic */ int e;
    public final /* synthetic */ Flow f;

    public /* synthetic */ rl1(Flow flow, int i) {
        this.e = i;
        this.f = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, q60 q60Var) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        z70 z70Var = z70.e;
        Flow flow = this.f;
        switch (i) {
            case 0:
                Object objCollect = flow.collect(new ql1(flowCollector, 0), q60Var);
                return objCollect == z70Var ? objCollect : mf3Var;
            case 1:
                Object objCollect2 = flow.collect(new ql1(flowCollector, 1), q60Var);
                return objCollect2 == z70Var ? objCollect2 : mf3Var;
            case 2:
                Object objCollect3 = flow.collect(new ql1(flowCollector, 2), q60Var);
                return objCollect3 == z70Var ? objCollect3 : mf3Var;
            default:
                Object objCollect4 = flow.collect(new ql1(flowCollector, 3), q60Var);
                return objCollect4 == z70Var ? objCollect4 : mf3Var;
        }
    }
}
