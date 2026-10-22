package kotlinx.coroutines;

import defpackage.j9;
import defpackage.o51;
import defpackage.pu0;
import defpackage.q60;
import defpackage.sj0;
import defpackage.y70;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.intrinsics.UndispatchedKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class BuildersKt__Builders_commonKt {
    private static final int RESUMED = 2;
    private static final int SUSPENDED = 1;
    private static final int UNDECIDED = 0;

    public static final <T> Deferred<T> async(CoroutineScope coroutineScope, y70 y70Var, CoroutineStart coroutineStart, pu0 pu0Var) {
        y70 y70VarNewCoroutineContext = CoroutineContextKt.newCoroutineContext(coroutineScope, y70Var);
        DeferredCoroutine lazyDeferredCoroutine = coroutineStart.isLazy() ? new LazyDeferredCoroutine(y70VarNewCoroutineContext, pu0Var) : new DeferredCoroutine(y70VarNewCoroutineContext, true);
        ((AbstractCoroutine) lazyDeferredCoroutine).start(coroutineStart, lazyDeferredCoroutine, pu0Var);
        return (Deferred<T>) lazyDeferredCoroutine;
    }

    public static /* synthetic */ Deferred async$default(CoroutineScope coroutineScope, y70 y70Var, CoroutineStart coroutineStart, pu0 pu0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            y70Var = sj0.e;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return BuildersKt.async(coroutineScope, y70Var, coroutineStart, pu0Var);
    }

    public static final <T> Object invoke(CoroutineDispatcher coroutineDispatcher, pu0 pu0Var, q60 q60Var) {
        return BuildersKt.withContext(coroutineDispatcher, pu0Var, q60Var);
    }

    public static final Job launch(CoroutineScope coroutineScope, y70 y70Var, CoroutineStart coroutineStart, pu0 pu0Var) {
        y70 y70VarNewCoroutineContext = CoroutineContextKt.newCoroutineContext(coroutineScope, y70Var);
        AbstractCoroutine lazyStandaloneCoroutine = coroutineStart.isLazy() ? new LazyStandaloneCoroutine(y70VarNewCoroutineContext, pu0Var) : new StandaloneCoroutine(y70VarNewCoroutineContext, true);
        lazyStandaloneCoroutine.start(coroutineStart, lazyStandaloneCoroutine, pu0Var);
        return lazyStandaloneCoroutine;
    }

    public static /* synthetic */ Job launch$default(CoroutineScope coroutineScope, y70 y70Var, CoroutineStart coroutineStart, pu0 pu0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            y70Var = sj0.e;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return BuildersKt.launch(coroutineScope, y70Var, coroutineStart, pu0Var);
    }

    public static final <T> Object withContext(y70 y70Var, pu0 pu0Var, q60 q60Var) {
        y70 context = q60Var.getContext();
        y70 y70VarNewCoroutineContext = CoroutineContextKt.newCoroutineContext(context, y70Var);
        JobKt.ensureActive(y70VarNewCoroutineContext);
        if (y70VarNewCoroutineContext == context) {
            ScopeCoroutine scopeCoroutine = new ScopeCoroutine(y70VarNewCoroutineContext, q60Var);
            return UndispatchedKt.startUndispatchedOrReturn(scopeCoroutine, scopeCoroutine, pu0Var);
        }
        j9 j9Var = j9.B;
        if (!o51.f(y70VarNewCoroutineContext.get(j9Var), context.get(j9Var))) {
            DispatchedCoroutine dispatchedCoroutine = new DispatchedCoroutine(y70VarNewCoroutineContext, q60Var);
            CancellableKt.startCoroutineCancellable(pu0Var, dispatchedCoroutine, dispatchedCoroutine);
            return dispatchedCoroutine.getResult$kotlinx_coroutines_core();
        }
        UndispatchedCoroutine undispatchedCoroutine = new UndispatchedCoroutine(y70VarNewCoroutineContext, q60Var);
        y70 context2 = undispatchedCoroutine.getContext();
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context2, null);
        try {
            return UndispatchedKt.startUndispatchedOrReturn(undispatchedCoroutine, undispatchedCoroutine, pu0Var);
        } finally {
            ThreadContextKt.restoreThreadContext(context2, objUpdateThreadContext);
        }
    }
}
