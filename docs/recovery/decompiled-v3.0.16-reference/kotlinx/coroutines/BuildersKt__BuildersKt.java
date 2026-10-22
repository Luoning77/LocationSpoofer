package kotlinx.coroutines;

import defpackage.j9;
import defpackage.pu0;
import defpackage.s60;
import defpackage.sj0;
import defpackage.y70;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class BuildersKt__BuildersKt {
    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    public static final <T> T runBlocking(y70 y70Var, pu0 pu0Var) {
        EventLoop eventLoopCurrentOrNull$kotlinx_coroutines_core;
        y70 y70VarNewCoroutineContext;
        Thread threadCurrentThread = Thread.currentThread();
        s60 s60Var = (s60) y70Var.get(j9.B);
        if (s60Var == null) {
            eventLoopCurrentOrNull$kotlinx_coroutines_core = ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
            y70VarNewCoroutineContext = CoroutineContextKt.newCoroutineContext(GlobalScope.INSTANCE, y70Var.plus(eventLoopCurrentOrNull$kotlinx_coroutines_core));
        } else {
            EventLoop eventLoop = s60Var instanceof EventLoop ? (EventLoop) s60Var : null;
            if (eventLoop == null) {
                eventLoopCurrentOrNull$kotlinx_coroutines_core = ThreadLocalEventLoop.INSTANCE.currentOrNull$kotlinx_coroutines_core();
            } else {
                EventLoop eventLoop2 = eventLoop.shouldBeProcessedFromContext() ? eventLoop : null;
                if (eventLoop2 == null) {
                    eventLoopCurrentOrNull$kotlinx_coroutines_core = ThreadLocalEventLoop.INSTANCE.currentOrNull$kotlinx_coroutines_core();
                } else {
                    eventLoopCurrentOrNull$kotlinx_coroutines_core = eventLoop2;
                }
            }
            y70VarNewCoroutineContext = CoroutineContextKt.newCoroutineContext(GlobalScope.INSTANCE, y70Var);
        }
        BlockingCoroutine blockingCoroutine = new BlockingCoroutine(y70VarNewCoroutineContext, threadCurrentThread, eventLoopCurrentOrNull$kotlinx_coroutines_core);
        blockingCoroutine.start(CoroutineStart.DEFAULT, blockingCoroutine, pu0Var);
        return (T) blockingCoroutine.joinBlocking();
    }

    public static /* synthetic */ Object runBlocking$default(y70 y70Var, pu0 pu0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            y70Var = sj0.e;
        }
        return BuildersKt.runBlocking(y70Var, pu0Var);
    }
}
