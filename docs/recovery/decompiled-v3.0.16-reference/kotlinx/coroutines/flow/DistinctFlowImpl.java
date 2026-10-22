package kotlinx.coroutines.flow;

import defpackage.ee0;
import defpackage.fo;
import defpackage.lu0;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.we2;
import defpackage.z70;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class DistinctFlowImpl<T> implements Flow<T> {
    public final pu0 areEquivalent;
    public final lu0 keySelector;
    private final Flow<T> upstream;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.DistinctFlowImpl$collect$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ FlowCollector<T> $collector;
        final /* synthetic */ we2 $previousKey;
        final /* synthetic */ DistinctFlowImpl<T> this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(DistinctFlowImpl<T> distinctFlowImpl, we2 we2Var, FlowCollector<? super T> flowCollector) {
            this.this$0 = distinctFlowImpl;
            this.$previousKey = we2Var;
            this.$collector = flowCollector;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(T t, q60 q60Var) {
            DistinctFlowImpl$collect$2$emit$1 distinctFlowImpl$collect$2$emit$1;
            if (q60Var instanceof DistinctFlowImpl$collect$2$emit$1) {
                distinctFlowImpl$collect$2$emit$1 = (DistinctFlowImpl$collect$2$emit$1) q60Var;
                int i = distinctFlowImpl$collect$2$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    distinctFlowImpl$collect$2$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    distinctFlowImpl$collect$2$emit$1 = new DistinctFlowImpl$collect$2$emit$1(this, q60Var);
                }
            } else {
                distinctFlowImpl$collect$2$emit$1 = new DistinctFlowImpl$collect$2$emit$1(this, q60Var);
            }
            Object obj = distinctFlowImpl$collect$2$emit$1.result;
            int i2 = distinctFlowImpl$collect$2$emit$1.label;
            mf3 mf3Var = mf3.a;
            if (i2 == 0) {
                ee0.J(obj);
                Object objInvoke = this.this$0.keySelector.invoke(t);
                Object obj2 = this.$previousKey.e;
                if (obj2 != NullSurrogateKt.NULL && ((Boolean) this.this$0.areEquivalent.invoke(obj2, objInvoke)).booleanValue()) {
                    return mf3Var;
                }
                this.$previousKey.e = objInvoke;
                FlowCollector<T> flowCollector = this.$collector;
                distinctFlowImpl$collect$2$emit$1.label = 1;
                Object objEmit = flowCollector.emit(t, distinctFlowImpl$collect$2$emit$1);
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
            return mf3Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DistinctFlowImpl(Flow<? extends T> flow, lu0 lu0Var, pu0 pu0Var) {
        this.upstream = flow;
        this.keySelector = lu0Var;
        this.areEquivalent = pu0Var;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, q60 q60Var) {
        we2 we2Var = new we2();
        we2Var.e = NullSurrogateKt.NULL;
        Object objCollect = this.upstream.collect(new AnonymousClass2(this, we2Var, flowCollector), q60Var);
        return objCollect == z70.e ? objCollect : mf3.a;
    }
}
