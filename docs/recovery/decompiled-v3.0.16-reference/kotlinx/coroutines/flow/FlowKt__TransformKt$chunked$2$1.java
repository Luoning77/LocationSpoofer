package kotlinx.coroutines.flow;

import defpackage.ee0;
import defpackage.fo;
import defpackage.mf3;
import defpackage.q60;
import defpackage.we2;
import defpackage.z70;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class FlowKt__TransformKt$chunked$2$1<T> implements FlowCollector {
    final /* synthetic */ we2 $result;
    final /* synthetic */ int $size;
    final /* synthetic */ FlowCollector<List<? extends T>> $this_flow;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__TransformKt$chunked$2$1(we2 we2Var, int i, FlowCollector<? super List<? extends T>> flowCollector) {
        this.$result = we2Var;
        this.$size = i;
        this.$this_flow = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(T t, q60 q60Var) {
        FlowKt__TransformKt$chunked$2$1$emit$1 flowKt__TransformKt$chunked$2$1$emit$1;
        if (q60Var instanceof FlowKt__TransformKt$chunked$2$1$emit$1) {
            flowKt__TransformKt$chunked$2$1$emit$1 = (FlowKt__TransformKt$chunked$2$1$emit$1) q60Var;
            int i = flowKt__TransformKt$chunked$2$1$emit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__TransformKt$chunked$2$1$emit$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__TransformKt$chunked$2$1$emit$1 = new FlowKt__TransformKt$chunked$2$1$emit$1(this, q60Var);
            }
        } else {
            flowKt__TransformKt$chunked$2$1$emit$1 = new FlowKt__TransformKt$chunked$2$1$emit$1(this, q60Var);
        }
        Object obj = flowKt__TransformKt$chunked$2$1$emit$1.result;
        int i2 = flowKt__TransformKt$chunked$2$1$emit$1.label;
        if (i2 == 0) {
            ee0.J(obj);
            ArrayList arrayList = (ArrayList) this.$result.e;
            if (arrayList == null) {
                arrayList = new ArrayList(this.$size);
                this.$result.e = arrayList;
            }
            arrayList.add(t);
            if (arrayList.size() == this.$size) {
                FlowCollector<List<? extends T>> flowCollector = this.$this_flow;
                flowKt__TransformKt$chunked$2$1$emit$1.L$0 = this;
                flowKt__TransformKt$chunked$2$1$emit$1.label = 1;
                Object objEmit = flowCollector.emit(arrayList, flowKt__TransformKt$chunked$2$1$emit$1);
                z70 z70Var = z70.e;
                if (objEmit == z70Var) {
                    return z70Var;
                }
            }
            return mf3.a;
        }
        if (i2 != 1) {
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = (FlowKt__TransformKt$chunked$2$1) flowKt__TransformKt$chunked$2$1$emit$1.L$0;
        ee0.J(obj);
        this.$result.e = null;
        return mf3.a;
    }
}
