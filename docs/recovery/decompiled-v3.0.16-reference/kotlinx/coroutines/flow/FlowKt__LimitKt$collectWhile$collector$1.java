package kotlinx.coroutines.flow;

import defpackage.ee0;
import defpackage.fo;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.z70;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class FlowKt__LimitKt$collectWhile$collector$1<T> implements FlowCollector<T> {
    final /* synthetic */ pu0 $predicate;

    public FlowKt__LimitKt$collectWhile$collector$1(pu0 pu0Var) {
        this.$predicate = pu0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, q60 q60Var) {
        FlowKt__LimitKt$collectWhile$collector$1$emit$1 flowKt__LimitKt$collectWhile$collector$1$emit$1;
        if (q60Var instanceof FlowKt__LimitKt$collectWhile$collector$1$emit$1) {
            flowKt__LimitKt$collectWhile$collector$1$emit$1 = (FlowKt__LimitKt$collectWhile$collector$1$emit$1) q60Var;
            int i = flowKt__LimitKt$collectWhile$collector$1$emit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$collectWhile$collector$1$emit$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$collectWhile$collector$1$emit$1 = new FlowKt__LimitKt$collectWhile$collector$1$emit$1(this, q60Var);
            }
        } else {
            flowKt__LimitKt$collectWhile$collector$1$emit$1 = new FlowKt__LimitKt$collectWhile$collector$1$emit$1(this, q60Var);
        }
        Object objInvoke = flowKt__LimitKt$collectWhile$collector$1$emit$1.result;
        int i2 = flowKt__LimitKt$collectWhile$collector$1$emit$1.label;
        if (i2 == 0) {
            ee0.J(objInvoke);
            pu0 pu0Var = this.$predicate;
            flowKt__LimitKt$collectWhile$collector$1$emit$1.L$0 = this;
            flowKt__LimitKt$collectWhile$collector$1$emit$1.label = 1;
            objInvoke = pu0Var.invoke(t, flowKt__LimitKt$collectWhile$collector$1$emit$1);
            z70 z70Var = z70.e;
            if (objInvoke == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = (FlowKt__LimitKt$collectWhile$collector$1) flowKt__LimitKt$collectWhile$collector$1$emit$1.L$0;
            ee0.J(objInvoke);
        }
        if (((Boolean) objInvoke).booleanValue()) {
            return mf3.a;
        }
        throw new AbortFlowException(this);
    }

    public Object emit$$forInline(T t, q60 q60Var) {
        new FlowKt__LimitKt$collectWhile$collector$1$emit$1(this, q60Var);
        if (((Boolean) this.$predicate.invoke(t, q60Var)).booleanValue()) {
            return mf3.a;
        }
        throw new AbortFlowException(this);
    }
}
