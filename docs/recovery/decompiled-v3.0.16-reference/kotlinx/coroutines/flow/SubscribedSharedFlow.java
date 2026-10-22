package kotlinx.coroutines.flow;

import defpackage.ee0;
import defpackage.fo;
import defpackage.pu0;
import defpackage.q60;
import defpackage.r60;
import defpackage.s90;
import defpackage.z70;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class SubscribedSharedFlow<T> implements SharedFlow<T> {
    private final pu0 action;
    private final SharedFlow<T> sharedFlow;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", l = {412}, m = "collect")
    public static final class AnonymousClass1 extends r60 {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SubscribedSharedFlow<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SubscribedSharedFlow<T> subscribedSharedFlow, q60 q60Var) {
            super(q60Var);
            this.this$0 = subscribedSharedFlow;
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubscribedSharedFlow(SharedFlow<? extends T> sharedFlow, pu0 pu0Var) {
        this.sharedFlow = sharedFlow;
        this.action = pu0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, q60 q60Var) {
        AnonymousClass1 anonymousClass1;
        if (q60Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) q60Var;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(this, q60Var);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(this, q60Var);
        }
        Object obj = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ee0.J(obj);
            SharedFlow<T> sharedFlow = this.sharedFlow;
            SubscribedFlowCollector subscribedFlowCollector = new SubscribedFlowCollector(flowCollector, this.action);
            anonymousClass1.label = 1;
            Object objCollect = sharedFlow.collect(subscribedFlowCollector, anonymousClass1);
            z70 z70Var = z70.e;
            if (objCollect == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(obj);
        }
        fo.d();
        return null;
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List<T> getReplayCache() {
        return this.sharedFlow.getReplayCache();
    }
}
