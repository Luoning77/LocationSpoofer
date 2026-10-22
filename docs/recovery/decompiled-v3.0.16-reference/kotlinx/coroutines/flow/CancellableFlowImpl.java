package kotlinx.coroutines.flow;

import defpackage.ee0;
import defpackage.fo;
import defpackage.mf3;
import defpackage.q60;
import defpackage.z70;
import kotlinx.coroutines.JobKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class CancellableFlowImpl<T> implements CancellableFlow<T> {
    private final Flow<T> flow;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.CancellableFlowImpl$collect$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ FlowCollector<T> $collector;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(FlowCollector<? super T> flowCollector) {
            this.$collector = flowCollector;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(T t, q60 q60Var) {
            CancellableFlowImpl$collect$2$emit$1 cancellableFlowImpl$collect$2$emit$1;
            if (q60Var instanceof CancellableFlowImpl$collect$2$emit$1) {
                cancellableFlowImpl$collect$2$emit$1 = (CancellableFlowImpl$collect$2$emit$1) q60Var;
                int i = cancellableFlowImpl$collect$2$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    cancellableFlowImpl$collect$2$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    cancellableFlowImpl$collect$2$emit$1 = new CancellableFlowImpl$collect$2$emit$1(this, q60Var);
                }
            } else {
                cancellableFlowImpl$collect$2$emit$1 = new CancellableFlowImpl$collect$2$emit$1(this, q60Var);
            }
            Object obj = cancellableFlowImpl$collect$2$emit$1.result;
            int i2 = cancellableFlowImpl$collect$2$emit$1.label;
            if (i2 == 0) {
                ee0.J(obj);
                JobKt.ensureActive(cancellableFlowImpl$collect$2$emit$1.getContext());
                FlowCollector<T> flowCollector = this.$collector;
                cancellableFlowImpl$collect$2$emit$1.label = 1;
                Object objEmit = flowCollector.emit(t, cancellableFlowImpl$collect$2$emit$1);
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
            return mf3.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CancellableFlowImpl(Flow<? extends T> flow) {
        this.flow = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, q60 q60Var) {
        Object objCollect = this.flow.collect(new AnonymousClass2(flowCollector), q60Var);
        return objCollect == z70.e ? objCollect : mf3.a;
    }
}
