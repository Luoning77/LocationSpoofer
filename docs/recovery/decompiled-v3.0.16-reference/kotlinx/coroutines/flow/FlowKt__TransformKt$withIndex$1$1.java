package kotlinx.coroutines.flow;

import defpackage.ee0;
import defpackage.fo;
import defpackage.l11;
import defpackage.mf3;
import defpackage.q60;
import defpackage.ue2;
import defpackage.z70;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class FlowKt__TransformKt$withIndex$1$1<T> implements FlowCollector {
    final /* synthetic */ ue2 $index;
    final /* synthetic */ FlowCollector<l11> $this_flow;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__TransformKt$withIndex$1$1(FlowCollector<? super l11> flowCollector, ue2 ue2Var) {
        this.$this_flow = flowCollector;
        this.$index = ue2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(T t, q60 q60Var) {
        FlowKt__TransformKt$withIndex$1$1$emit$1 flowKt__TransformKt$withIndex$1$1$emit$1;
        if (q60Var instanceof FlowKt__TransformKt$withIndex$1$1$emit$1) {
            flowKt__TransformKt$withIndex$1$1$emit$1 = (FlowKt__TransformKt$withIndex$1$1$emit$1) q60Var;
            int i = flowKt__TransformKt$withIndex$1$1$emit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__TransformKt$withIndex$1$1$emit$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__TransformKt$withIndex$1$1$emit$1 = new FlowKt__TransformKt$withIndex$1$1$emit$1(this, q60Var);
            }
        } else {
            flowKt__TransformKt$withIndex$1$1$emit$1 = new FlowKt__TransformKt$withIndex$1$1$emit$1(this, q60Var);
        }
        Object obj = flowKt__TransformKt$withIndex$1$1$emit$1.result;
        int i2 = flowKt__TransformKt$withIndex$1$1$emit$1.label;
        if (i2 == 0) {
            ee0.J(obj);
            FlowCollector<l11> flowCollector = this.$this_flow;
            ue2 ue2Var = this.$index;
            int i3 = ue2Var.e;
            ue2Var.e = i3 + 1;
            if (i3 < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            l11 l11Var = new l11(i3, t);
            flowKt__TransformKt$withIndex$1$1$emit$1.label = 1;
            Object objEmit = flowCollector.emit(l11Var, flowKt__TransformKt$withIndex$1$1$emit$1);
            z70 z70Var = z70.e;
            if (objEmit == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(obj);
        }
        return mf3.a;
    }
}
