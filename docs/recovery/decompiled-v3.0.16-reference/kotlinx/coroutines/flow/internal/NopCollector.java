package kotlinx.coroutines.flow.internal;

import defpackage.mf3;
import defpackage.q60;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class NopCollector implements FlowCollector<Object> {
    public static final NopCollector INSTANCE = new NopCollector();

    private NopCollector() {
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(Object obj, q60 q60Var) {
        return mf3.a;
    }
}
