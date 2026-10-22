package kotlinx.coroutines.flow;

import defpackage.au0;
import defpackage.o51;
import defpackage.pu0;
import defpackage.q60;
import defpackage.r60;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1<R> implements Flow<R> {
    final /* synthetic */ Flow[] $flows$inlined;
    final /* synthetic */ pu0 $transform$inlined;

    public FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1(Flow[] flowArr, pu0 pu0Var) {
        this.$flows$inlined = flowArr;
        this.$transform$inlined = pu0Var;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super R> flowCollector, q60 q60Var) {
        au0 unused = new au0() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
            @Override // defpackage.au0
            public final Void invoke() {
                return null;
            }
        };
        o51.E();
        throw null;
    }

    public Object collect$$forInline(FlowCollector flowCollector, q60 q60Var) {
        new r60(q60Var) { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1.1
            int label;
            /* synthetic */ Object result;

            @Override // defpackage.oq
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1.this.collect(null, this);
            }
        };
        au0 unused = new au0() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
            @Override // defpackage.au0
            public final Void invoke() {
                return null;
            }
        };
        o51.E();
        throw null;
    }
}
