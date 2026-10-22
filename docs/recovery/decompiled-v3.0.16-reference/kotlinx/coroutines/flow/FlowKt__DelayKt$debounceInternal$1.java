package kotlinx.coroutines.flow;

import defpackage.k33;
import defpackage.lu0;
import defpackage.mf3;
import defpackage.q60;
import defpackage.qu0;
import defpackage.s90;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", l = {215, 415}, m = "invokeSuspend")
public final class FlowKt__DelayKt$debounceInternal$1 extends k33 implements qu0 {
    final /* synthetic */ Flow<T> $this_debounceInternal;
    final /* synthetic */ lu0 $timeoutMillisSelector;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$debounceInternal$1(lu0 lu0Var, Flow<? extends T> flow, q60 q60Var) {
        super(3, q60Var);
        this.$timeoutMillisSelector = lu0Var;
        this.$this_debounceInternal = flow;
    }

    @Override // defpackage.qu0
    public final Object invoke(CoroutineScope coroutineScope, FlowCollector<? super T> flowCollector, q60 q60Var) {
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new FlowKt__DelayKt$debounceInternal$1(this.$timeoutMillisSelector, this.$this_debounceInternal, q60Var);
        flowKt__DelayKt$debounceInternal$1.L$0 = coroutineScope;
        flowKt__DelayKt$debounceInternal$1.L$1 = flowCollector;
        return flowKt__DelayKt$debounceInternal$1.invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0062  */
    /* JADX WARN: Code duplicated, block: B:16:0x0069  */
    /* JADX WARN: Code duplicated, block: B:18:0x006f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0082  */
    /* JADX WARN: Code duplicated, block: B:22:0x0084  */
    /* JADX WARN: Code duplicated, block: B:24:0x0088  */
    /* JADX WARN: Code duplicated, block: B:29:0x009c A[PHI: r0 r5 r6 r7
      0x009c: PHI (r0v3 ve2) = (r0v5 ve2), (r0v7 ve2), (r0v7 ve2) binds: [B:28:0x009a, B:15:0x0067, B:21:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x009c: PHI (r5v3 we2) = (r5v5 we2), (r5v6 we2), (r5v6 we2) binds: [B:28:0x009a, B:15:0x0067, B:21:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x009c: PHI (r6v2 kotlinx.coroutines.channels.ReceiveChannel) = 
      (r6v4 kotlinx.coroutines.channels.ReceiveChannel)
      (r6v5 kotlinx.coroutines.channels.ReceiveChannel)
      (r6v5 kotlinx.coroutines.channels.ReceiveChannel)
     binds: [B:28:0x009a, B:15:0x0067, B:21:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x009c: PHI (r7v2 kotlinx.coroutines.flow.FlowCollector) = 
      (r7v4 kotlinx.coroutines.flow.FlowCollector)
      (r7v5 kotlinx.coroutines.flow.FlowCollector)
      (r7v5 kotlinx.coroutines.flow.FlowCollector)
     binds: [B:28:0x009a, B:15:0x0067, B:21:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00db  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
    
        if (r7.emit(r15, r14) == r4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d8, code lost:
    
        if (r7.doSelect(r14) == r4) goto L37;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d8 -> B:7:0x001c). Please report as a decompilation issue!!! */
    @Override // defpackage.oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
