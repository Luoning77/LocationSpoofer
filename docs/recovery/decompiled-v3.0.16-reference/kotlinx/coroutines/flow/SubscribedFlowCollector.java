package kotlinx.coroutines.flow;

import defpackage.ee0;
import defpackage.fo;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.r60;
import defpackage.s90;
import defpackage.z70;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SubscribedFlowCollector<T> implements FlowCollector<T> {
    private final pu0 action;
    private final FlowCollector<T> collector;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {422, 426}, m = "onSubscription")
    public static final class AnonymousClass1 extends r60 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SubscribedFlowCollector<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SubscribedFlowCollector<T> subscribedFlowCollector, q60 q60Var) {
            super(q60Var);
            this.this$0 = subscribedFlowCollector;
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.onSubscription(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubscribedFlowCollector(FlowCollector<? super T> flowCollector, pu0 pu0Var) {
        this.collector = flowCollector;
        this.action = pu0Var;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, q60 q60Var) {
        return this.collector.emit(t, q60Var);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object onSubscription(q60 q60Var) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Throwable th;
        SafeCollector safeCollector;
        SubscribedFlowCollector<T> subscribedFlowCollector;
        FlowCollector<T> flowCollector;
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
        mf3 mf3Var = mf3.a;
        z70 z70Var = z70.e;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    ee0.J(obj);
                    return mf3Var;
                }
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            safeCollector = (SafeCollector) anonymousClass1.L$1;
            subscribedFlowCollector = (SubscribedFlowCollector) anonymousClass1.L$0;
            try {
                ee0.J(obj);
                safeCollector.releaseIntercepted();
                flowCollector = subscribedFlowCollector.collector;
                if (flowCollector instanceof SubscribedFlowCollector) {
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 2;
                    if (((SubscribedFlowCollector) flowCollector).onSubscription(anonymousClass1) == z70Var) {
                    }
                }
                return mf3Var;
            } catch (Throwable th2) {
                th = th2;
                safeCollector.releaseIntercepted();
                throw th;
            }
        }
        ee0.J(obj);
        SafeCollector safeCollector2 = new SafeCollector(this.collector, anonymousClass1.getContext());
        try {
            pu0 pu0Var = this.action;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = safeCollector2;
            anonymousClass1.label = 1;
            if (pu0Var.invoke(safeCollector2, anonymousClass1) != z70Var) {
                subscribedFlowCollector = this;
                safeCollector = safeCollector2;
                safeCollector.releaseIntercepted();
                flowCollector = subscribedFlowCollector.collector;
                if (flowCollector instanceof SubscribedFlowCollector) {
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 2;
                    if (((SubscribedFlowCollector) flowCollector).onSubscription(anonymousClass1) == z70Var) {
                    }
                }
                return mf3Var;
            }
        } catch (Throwable th3) {
            th = th3;
            safeCollector = safeCollector2;
            safeCollector.releaseIntercepted();
            throw th;
        }
        return z70Var;
    }
}
