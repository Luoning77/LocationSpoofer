package kotlinx.coroutines.flow;

import defpackage.au0;
import defpackage.k41;
import defpackage.lu0;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.us2;
import defpackage.wj1;
import defpackage.z70;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final /* synthetic */ class FlowKt__BuildersKt {
    public static final <T> Flow<T> asFlow(final au0 au0Var) {
        return new Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super T> flowCollector, q60 q60Var) {
                Object objEmit = flowCollector.emit(au0Var.invoke(), q60Var);
                return objEmit == z70.e ? objEmit : mf3.a;
            }
        };
    }

    public static final <T> Flow<T> callbackFlow(pu0 pu0Var) {
        return new CallbackFlowBuilder(pu0Var, null, 0, null, 14, null);
    }

    public static final <T> Flow<T> channelFlow(pu0 pu0Var) {
        return new ChannelFlowBuilder(pu0Var, null, 0, null, 14, null);
    }

    public static final <T> Flow<T> emptyFlow() {
        return EmptyFlow.INSTANCE;
    }

    public static final <T> Flow<T> flow(pu0 pu0Var) {
        return new SafeFlow(pu0Var);
    }

    public static final <T> Flow<T> flowOf(T... tArr) {
        return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1(tArr);
    }

    public static final <T> Flow<T> asFlow(lu0 lu0Var) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2(lu0Var);
    }

    public static final <T> Flow<T> flowOf(final T t) {
        return new Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super T> flowCollector, q60 q60Var) {
                Object objEmit = flowCollector.emit((Object) t, q60Var);
                return objEmit == z70.e ? objEmit : mf3.a;
            }
        };
    }

    public static final <T> Flow<T> asFlow(Iterable<? extends T> iterable) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3(iterable);
    }

    public static final <T> Flow<T> asFlow(Iterator<? extends T> it) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$4(it);
    }

    public static final <T> Flow<T> asFlow(us2 us2Var) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5(us2Var);
    }

    public static final <T> Flow<T> asFlow(T[] tArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6(tArr);
    }

    public static final Flow<Integer> asFlow(int[] iArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7(iArr);
    }

    public static final Flow<Long> asFlow(long[] jArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8(jArr);
    }

    public static final Flow<Integer> asFlow(k41 k41Var) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9(k41Var);
    }

    public static final Flow<Long> asFlow(wj1 wj1Var) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10(wj1Var);
    }
}
