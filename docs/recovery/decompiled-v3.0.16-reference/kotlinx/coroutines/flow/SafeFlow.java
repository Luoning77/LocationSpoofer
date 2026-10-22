package kotlinx.coroutines.flow;

import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.z70;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class SafeFlow<T> extends AbstractFlow<T> {
    private final pu0 block;

    public SafeFlow(pu0 pu0Var) {
        this.block = pu0Var;
    }

    @Override // kotlinx.coroutines.flow.AbstractFlow
    public Object collectSafely(FlowCollector<? super T> flowCollector, q60 q60Var) {
        Object objInvoke = this.block.invoke(flowCollector, q60Var);
        return objInvoke == z70.e ? objInvoke : mf3.a;
    }
}
