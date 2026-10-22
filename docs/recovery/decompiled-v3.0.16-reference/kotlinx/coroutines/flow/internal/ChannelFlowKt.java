package kotlinx.coroutines.flow.internal;

import defpackage.da0;
import defpackage.hd0;
import defpackage.oq;
import defpackage.pu0;
import defpackage.q60;
import defpackage.y70;
import defpackage.z70;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ChannelFlowKt {
    public static final <T> ChannelFlow<T> asChannelFlow(Flow<? extends T> flow) {
        ChannelFlow<T> channelFlow = flow instanceof ChannelFlow ? (ChannelFlow) flow : null;
        if (channelFlow == null) {
            return new ChannelFlowOperatorImpl(flow, null, 0, null, 14, null);
        }
        return channelFlow;
    }

    public static final <T, V> Object withContextUndispatched(y70 y70Var, V v, Object obj, pu0 pu0Var, q60 q60Var) {
        Object objInvoke;
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(y70Var, obj);
        try {
            StackFrameContinuation stackFrameContinuation = new StackFrameContinuation(q60Var, y70Var);
            if (pu0Var instanceof oq) {
                da0.o(2, pu0Var);
                objInvoke = pu0Var.invoke(v, stackFrameContinuation);
            } else {
                objInvoke = hd0.R(pu0Var, v, stackFrameContinuation);
            }
            ThreadContextKt.restoreThreadContext(y70Var, objUpdateThreadContext);
            if (objInvoke == z70.e) {
                q60Var.getClass();
            }
            return objInvoke;
        } catch (Throwable th) {
            ThreadContextKt.restoreThreadContext(y70Var, objUpdateThreadContext);
            throw th;
        }
    }

    public static /* synthetic */ Object withContextUndispatched$default(y70 y70Var, Object obj, Object obj2, pu0 pu0Var, q60 q60Var, int i, Object obj3) {
        if ((i & 4) != 0) {
            obj2 = ThreadContextKt.threadContextElements(y70Var);
        }
        return withContextUndispatched(y70Var, obj, obj2, pu0Var, q60Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> FlowCollector<T> withUndispatchedContextCollector(FlowCollector<? super T> flowCollector, y70 y70Var) {
        return ((flowCollector instanceof SendingCollector) || (flowCollector instanceof NopCollector)) ? flowCollector : new UndispatchedContextCollector(flowCollector, y70Var);
    }
}
