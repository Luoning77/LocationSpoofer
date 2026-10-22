package kotlinx.coroutines.flow;

import defpackage.az2;
import defpackage.cc0;
import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.qu0;
import defpackage.ru0;
import defpackage.s90;
import defpackage.y70;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class LintKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.LintKt$retry$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.LintKt$retry$1", f = "Lint.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends k33 implements pu0 {
        int label;

        public AnonymousClass1(q60 q60Var) {
            super(2, q60Var);
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            return new AnonymousClass1(q60Var);
        }

        @Override // defpackage.pu0
        public final Object invoke(Throwable th, q60 q60Var) {
            return ((AnonymousClass1) create(th, q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                ee0.J(obj);
                return Boolean.TRUE;
            }
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @cc0
    public static final void cancel(FlowCollector<?> flowCollector, CancellationException cancellationException) {
        throw az2.d();
    }

    public static /* synthetic */ void cancel$default(FlowCollector flowCollector, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        cancel(flowCollector, cancellationException);
    }

    @cc0
    public static final <T> Flow<T> cancellable(SharedFlow<? extends T> sharedFlow) {
        throw az2.d();
    }

    @cc0
    /* JADX INFO: renamed from: catch, reason: not valid java name */
    private static final <T> Flow<T> m76catch(SharedFlow<? extends T> sharedFlow, qu0 qu0Var) {
        sharedFlow.getClass();
        return FlowKt.m64catch(sharedFlow, qu0Var);
    }

    @cc0
    public static final <T> Flow<T> conflate(StateFlow<? extends T> stateFlow) {
        throw az2.d();
    }

    @cc0
    private static final <T> Object count(SharedFlow<? extends T> sharedFlow, q60 q60Var) {
        sharedFlow.getClass();
        return FlowKt.count(sharedFlow, q60Var);
    }

    @cc0
    public static final <T> Flow<T> distinctUntilChanged(StateFlow<? extends T> stateFlow) {
        throw az2.d();
    }

    @cc0
    public static final <T> Flow<T> flowOn(SharedFlow<? extends T> sharedFlow, y70 y70Var) {
        throw az2.d();
    }

    public static final y70 getCoroutineContext(FlowCollector<?> flowCollector) {
        throw az2.d();
    }

    public static final boolean isActive(FlowCollector<?> flowCollector) {
        throw az2.d();
    }

    @cc0
    private static final <T> Flow<T> retry(SharedFlow<? extends T> sharedFlow, long j, pu0 pu0Var) {
        sharedFlow.getClass();
        return FlowKt.retry(sharedFlow, j, pu0Var);
    }

    public static /* synthetic */ Flow retry$default(SharedFlow sharedFlow, long j, pu0 pu0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Long.MAX_VALUE;
        }
        if ((i & 2) != 0) {
            pu0Var = new AnonymousClass1(null);
        }
        sharedFlow.getClass();
        return FlowKt.retry(sharedFlow, j, pu0Var);
    }

    @cc0
    private static final <T> Flow<T> retryWhen(SharedFlow<? extends T> sharedFlow, ru0 ru0Var) {
        sharedFlow.getClass();
        return FlowKt.retryWhen(sharedFlow, ru0Var);
    }

    private static final <T> Object toList(SharedFlow<? extends T> sharedFlow, List<T> list, q60 q60Var) {
        sharedFlow.getClass();
        FlowKt.toList(sharedFlow, list, q60Var);
        throw new IllegalStateException("this code is supposed to be unreachable");
    }

    private static final <T> Object toSet(SharedFlow<? extends T> sharedFlow, Set<T> set, q60 q60Var) {
        sharedFlow.getClass();
        FlowKt.toSet(sharedFlow, set, q60Var);
        throw new IllegalStateException("this code is supposed to be unreachable");
    }

    @cc0
    private static final <T> Object toList(SharedFlow<? extends T> sharedFlow, q60 q60Var) {
        sharedFlow.getClass();
        return FlowKt__CollectionKt.toList$default(sharedFlow, null, q60Var, 1, null);
    }

    @cc0
    private static final <T> Object toSet(SharedFlow<? extends T> sharedFlow, q60 q60Var) {
        sharedFlow.getClass();
        return FlowKt__CollectionKt.toSet$default(sharedFlow, null, q60Var, 1, null);
    }

    @cc0
    public static /* synthetic */ void getCoroutineContext$annotations(FlowCollector flowCollector) {
    }

    @cc0
    public static /* synthetic */ void isActive$annotations(FlowCollector flowCollector) {
    }
}
