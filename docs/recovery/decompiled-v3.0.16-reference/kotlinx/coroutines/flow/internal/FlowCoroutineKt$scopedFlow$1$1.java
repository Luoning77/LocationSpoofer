package kotlinx.coroutines.flow.internal;

import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.qu0;
import defpackage.s90;
import defpackage.z70;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", l = {47}, m = "invokeSuspend")
public final class FlowCoroutineKt$scopedFlow$1$1 extends k33 implements pu0 {
    final /* synthetic */ qu0 $block;
    final /* synthetic */ FlowCollector<R> $this_flow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowCoroutineKt$scopedFlow$1$1(qu0 qu0Var, FlowCollector<? super R> flowCollector, q60 q60Var) {
        super(2, q60Var);
        this.$block = qu0Var;
        this.$this_flow = flowCollector;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        FlowCoroutineKt$scopedFlow$1$1 flowCoroutineKt$scopedFlow$1$1 = new FlowCoroutineKt$scopedFlow$1$1(this.$block, this.$this_flow, q60Var);
        flowCoroutineKt$scopedFlow$1$1.L$0 = obj;
        return flowCoroutineKt$scopedFlow$1$1;
    }

    @Override // defpackage.pu0
    public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
        return ((FlowCoroutineKt$scopedFlow$1$1) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            ee0.J(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            qu0 qu0Var = this.$block;
            Object obj2 = this.$this_flow;
            this.label = 1;
            Object objInvoke = qu0Var.invoke(coroutineScope, obj2, this);
            z70 z70Var = z70.e;
            if (objInvoke == z70Var) {
                return z70Var;
            }
        } else {
            if (i != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(obj);
        }
        return mf3.a;
    }
}
