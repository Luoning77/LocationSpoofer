package kotlinx.coroutines.flow;

import defpackage.q60;
import defpackage.r60;
import defpackage.s90;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1", f = "Transform.kt", l = {WorkQueueKt.MASK, 129}, m = "emit")
public final class FlowKt__TransformKt$runningReduce$1$1$emit$1 extends r60 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlowKt__TransformKt$runningReduce$1$1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__TransformKt$runningReduce$1$1$emit$1(FlowKt__TransformKt$runningReduce$1$1<? super T> flowKt__TransformKt$runningReduce$1$1, q60 q60Var) {
        super(q60Var);
        this.this$0 = flowKt__TransformKt$runningReduce$1$1;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
