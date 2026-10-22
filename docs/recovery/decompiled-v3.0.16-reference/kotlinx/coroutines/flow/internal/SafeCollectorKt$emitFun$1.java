package kotlinx.coroutines.flow.internal;

import defpackage.bv0;
import defpackage.q60;
import defpackage.qu0;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public /* synthetic */ class SafeCollectorKt$emitFun$1 extends bv0 implements qu0 {
    public static final SafeCollectorKt$emitFun$1 INSTANCE = new SafeCollectorKt$emitFun$1();

    public SafeCollectorKt$emitFun$1() {
        super(3, FlowCollector.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.qu0
    public final Object invoke(FlowCollector<Object> flowCollector, Object obj, q60 q60Var) {
        return flowCollector.emit(obj, q60Var);
    }
}
