package kotlinx.coroutines.flow;

import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s90;
import defpackage.we2;
import defpackage.wg2;
import defpackage.xg2;
import defpackage.z70;
import java.util.NoSuchElementException;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", l = {337}, m = "invokeSuspend")
public final class FlowKt__ShareKt$launchSharingDeferred$1 extends k33 implements pu0 {
    final /* synthetic */ CompletableDeferred<xg2> $result;
    final /* synthetic */ Flow<T> $upstream;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ShareKt$launchSharingDeferred$1(Flow<? extends T> flow, CompletableDeferred<xg2> completableDeferred, q60 q60Var) {
        super(2, q60Var);
        this.$upstream = flow;
        this.$result = completableDeferred;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        FlowKt__ShareKt$launchSharingDeferred$1 flowKt__ShareKt$launchSharingDeferred$1 = new FlowKt__ShareKt$launchSharingDeferred$1(this.$upstream, this.$result, q60Var);
        flowKt__ShareKt$launchSharingDeferred$1.L$0 = obj;
        return flowKt__ShareKt$launchSharingDeferred$1;
    }

    @Override // defpackage.pu0
    public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
        return ((FlowKt__ShareKt$launchSharingDeferred$1) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        final we2 we2Var;
        int i = this.label;
        try {
            if (i == 0) {
                ee0.J(obj);
                final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                we2Var = new we2();
                Flow<T> flow = this.$upstream;
                final CompletableDeferred<xg2> completableDeferred = this.$result;
                FlowCollector flowCollector = new FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(T t, q60 q60Var) {
                        we2 we2Var2 = we2Var;
                        MutableStateFlow mutableStateFlow = (MutableStateFlow) we2Var2.e;
                        if (mutableStateFlow != null) {
                            mutableStateFlow.setValue(t);
                        } else {
                            CoroutineScope coroutineScope2 = coroutineScope;
                            CompletableDeferred<xg2> completableDeferred2 = completableDeferred;
                            MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(t);
                            completableDeferred2.complete(new xg2(new ReadonlyStateFlow(MutableStateFlow, JobKt.getJob(coroutineScope2.getCoroutineContext()))));
                            we2Var2.e = MutableStateFlow;
                        }
                        return mf3.a;
                    }
                };
                this.L$0 = we2Var;
                this.label = 1;
                Object objCollect = flow.collect((FlowCollector<? super T>) flowCollector, this);
                z70 z70Var = z70.e;
                if (objCollect == z70Var) {
                    return z70Var;
                }
            } else {
                if (i != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                we2Var = (we2) this.L$0;
                ee0.J(obj);
            }
            if (we2Var.e == null) {
                this.$result.complete(new xg2(new wg2(new NoSuchElementException("Flow is empty"))));
            }
            return mf3.a;
        } catch (Throwable th) {
            this.$result.completeExceptionally(th);
            throw th;
        }
    }
}
