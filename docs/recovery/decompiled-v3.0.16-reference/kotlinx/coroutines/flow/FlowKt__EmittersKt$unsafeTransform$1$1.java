package kotlinx.coroutines.flow;

import defpackage.ee0;
import defpackage.fo;
import defpackage.mf3;
import defpackage.q60;
import defpackage.qu0;
import defpackage.z70;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class FlowKt__EmittersKt$unsafeTransform$1$1<T> implements FlowCollector {
    final /* synthetic */ FlowCollector<R> $this_unsafeFlow;
    final /* synthetic */ qu0 $transform;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__EmittersKt$unsafeTransform$1$1(qu0 qu0Var, FlowCollector<? super R> flowCollector) {
        this.$transform = qu0Var;
        this.$this_unsafeFlow = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(T t, q60 q60Var) {
        FlowKt__EmittersKt$unsafeTransform$1$1$emit$1 flowKt__EmittersKt$unsafeTransform$1$1$emit$1;
        if (q60Var instanceof FlowKt__EmittersKt$unsafeTransform$1$1$emit$1) {
            flowKt__EmittersKt$unsafeTransform$1$1$emit$1 = (FlowKt__EmittersKt$unsafeTransform$1$1$emit$1) q60Var;
            int i = flowKt__EmittersKt$unsafeTransform$1$1$emit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__EmittersKt$unsafeTransform$1$1$emit$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__EmittersKt$unsafeTransform$1$1$emit$1 = new FlowKt__EmittersKt$unsafeTransform$1$1$emit$1(this, q60Var);
            }
        } else {
            flowKt__EmittersKt$unsafeTransform$1$1$emit$1 = new FlowKt__EmittersKt$unsafeTransform$1$1$emit$1(this, q60Var);
        }
        Object obj = flowKt__EmittersKt$unsafeTransform$1$1$emit$1.result;
        int i2 = flowKt__EmittersKt$unsafeTransform$1$1$emit$1.label;
        if (i2 == 0) {
            ee0.J(obj);
            qu0 qu0Var = this.$transform;
            Object obj2 = this.$this_unsafeFlow;
            flowKt__EmittersKt$unsafeTransform$1$1$emit$1.label = 1;
            Object objInvoke = qu0Var.invoke(obj2, t, flowKt__EmittersKt$unsafeTransform$1$1$emit$1);
            z70 z70Var = z70.e;
            if (objInvoke == z70Var) {
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

    public final Object emit$$forInline(T t, q60 q60Var) {
        new FlowKt__EmittersKt$unsafeTransform$1$1$emit$1(this, q60Var);
        this.$transform.invoke(this.$this_unsafeFlow, t, q60Var);
        return mf3.a;
    }
}
