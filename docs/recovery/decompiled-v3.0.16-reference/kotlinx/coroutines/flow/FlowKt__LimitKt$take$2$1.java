package kotlinx.coroutines.flow;

import defpackage.ee0;
import defpackage.fo;
import defpackage.mf3;
import defpackage.q60;
import defpackage.ue2;
import defpackage.z70;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class FlowKt__LimitKt$take$2$1<T> implements FlowCollector {
    final /* synthetic */ ue2 $consumed;
    final /* synthetic */ int $count;
    final /* synthetic */ Object $ownershipMarker;
    final /* synthetic */ FlowCollector<T> $this_flow;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$take$2$1(ue2 ue2Var, int i, FlowCollector<? super T> flowCollector, Object obj) {
        this.$consumed = ue2Var;
        this.$count = i;
        this.$this_flow = flowCollector;
        this.$ownershipMarker = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(T t, q60 q60Var) {
        FlowKt__LimitKt$take$2$1$emit$1 flowKt__LimitKt$take$2$1$emit$1;
        if (q60Var instanceof FlowKt__LimitKt$take$2$1$emit$1) {
            flowKt__LimitKt$take$2$1$emit$1 = (FlowKt__LimitKt$take$2$1$emit$1) q60Var;
            int i = flowKt__LimitKt$take$2$1$emit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$take$2$1$emit$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$take$2$1$emit$1 = new FlowKt__LimitKt$take$2$1$emit$1(this, q60Var);
            }
        } else {
            flowKt__LimitKt$take$2$1$emit$1 = new FlowKt__LimitKt$take$2$1$emit$1(this, q60Var);
        }
        Object obj = flowKt__LimitKt$take$2$1$emit$1.result;
        int i2 = flowKt__LimitKt$take$2$1$emit$1.label;
        mf3 mf3Var = mf3.a;
        if (i2 != 0) {
            if (i2 == 1) {
                ee0.J(obj);
                return mf3Var;
            }
            if (i2 == 2) {
                ee0.J(obj);
                return mf3Var;
            }
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ee0.J(obj);
        ue2 ue2Var = this.$consumed;
        int i3 = ue2Var.e + 1;
        ue2Var.e = i3;
        int i4 = this.$count;
        FlowCollector<T> flowCollector = this.$this_flow;
        z70 z70Var = z70.e;
        if (i3 < i4) {
            flowKt__LimitKt$take$2$1$emit$1.label = 1;
            if (flowCollector.emit(t, flowKt__LimitKt$take$2$1$emit$1) != z70Var) {
                return mf3Var;
            }
        } else {
            Object obj2 = this.$ownershipMarker;
            flowKt__LimitKt$take$2$1$emit$1.label = 2;
            if (FlowKt__LimitKt.emitAbort$FlowKt__LimitKt(flowCollector, t, obj2, flowKt__LimitKt$take$2$1$emit$1) != z70Var) {
                return mf3Var;
            }
        }
        return z70Var;
    }
}
