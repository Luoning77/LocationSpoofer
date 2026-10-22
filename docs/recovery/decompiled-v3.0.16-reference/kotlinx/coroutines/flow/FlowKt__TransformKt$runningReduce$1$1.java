package kotlinx.coroutines.flow;

import defpackage.qu0;
import defpackage.we2;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class FlowKt__TransformKt$runningReduce$1$1<T> implements FlowCollector {
    final /* synthetic */ we2 $accumulator;
    final /* synthetic */ qu0 $operation;
    final /* synthetic */ FlowCollector<T> $this_flow;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__TransformKt$runningReduce$1$1(we2 we2Var, qu0 qu0Var, FlowCollector<? super T> flowCollector) {
        this.$accumulator = we2Var;
        this.$operation = qu0Var;
        this.$this_flow = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        if (r9.emit((T) r8, r0) == r5) goto L26;
     */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(T r9, defpackage.q60 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            z70 r5 = defpackage.z70.e
            if (r1 == 0) goto L3d
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.ee0.J(r10)
            goto L75
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r8)
            return r2
        L31:
            java.lang.Object r8 = r0.L$1
            we2 r8 = (defpackage.we2) r8
            java.lang.Object r9 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1 r9 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1) r9
            defpackage.ee0.J(r10)
            goto L5c
        L3d:
            defpackage.ee0.J(r10)
            we2 r10 = r8.$accumulator
            java.lang.Object r1 = r10.e
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            if (r1 != r6) goto L49
            goto L60
        L49:
            qu0 r6 = r8.$operation
            r0.L$0 = r8
            r0.L$1 = r10
            r0.label = r4
            java.lang.Object r9 = r6.invoke(r1, r9, r0)
            if (r9 != r5) goto L58
            goto L74
        L58:
            r7 = r9
            r9 = r8
            r8 = r10
            r10 = r7
        L5c:
            r7 = r10
            r10 = r8
            r8 = r9
            r9 = r7
        L60:
            r10.e = r9
            kotlinx.coroutines.flow.FlowCollector<T> r9 = r8.$this_flow
            we2 r8 = r8.$accumulator
            java.lang.Object r8 = r8.e
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r8 = r9.emit(r8, r0)
            if (r8 != r5) goto L75
        L74:
            return r5
        L75:
            mf3 r8 = defpackage.mf3.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1.emit(java.lang.Object, q60):java.lang.Object");
    }
}
