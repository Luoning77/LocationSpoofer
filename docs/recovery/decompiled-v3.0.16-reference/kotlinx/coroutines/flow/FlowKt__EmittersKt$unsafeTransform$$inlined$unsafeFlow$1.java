package kotlinx.coroutines.flow;

import defpackage.mf3;
import defpackage.q60;
import defpackage.qu0;
import defpackage.r60;
import defpackage.z70;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1<R> implements Flow<R> {
    final /* synthetic */ Flow $this_unsafeTransform$inlined;
    final /* synthetic */ qu0 $transform$inlined;

    public FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1(Flow flow, qu0 qu0Var) {
        this.$this_unsafeTransform$inlined = flow;
        this.$transform$inlined = qu0Var;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super R> flowCollector, q60 q60Var) {
        Object objCollect = this.$this_unsafeTransform$inlined.collect(new FlowKt__EmittersKt$unsafeTransform$1$1(this.$transform$inlined, flowCollector), q60Var);
        return objCollect == z70.e ? objCollect : mf3.a;
    }

    public Object collect$$forInline(FlowCollector flowCollector, q60 q60Var) {
        new r60(q60Var) { // from class: kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1.1
            int label;
            /* synthetic */ Object result;

            @Override // defpackage.oq
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1.this.collect(null, this);
            }
        };
        this.$this_unsafeTransform$inlined.collect(new FlowKt__EmittersKt$unsafeTransform$1$1(this.$transform$inlined, flowCollector), q60Var);
        return mf3.a;
    }
}
