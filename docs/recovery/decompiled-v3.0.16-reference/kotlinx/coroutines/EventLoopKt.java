package kotlinx.coroutines;

import defpackage.au0;
import defpackage.fo;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class EventLoopKt {
    public static final EventLoop createEventLoop() {
        return new BlockingEventLoop(Thread.currentThread());
    }

    public static final boolean isIoDispatcherThread(Thread thread) {
        if (thread instanceof CoroutineScheduler.Worker) {
            return ((CoroutineScheduler.Worker) thread).isIo();
        }
        return false;
    }

    public static final void platformAutoreleasePool(au0 au0Var) {
        au0Var.invoke();
    }

    public static final long processNextEventInCurrentThread() {
        EventLoop eventLoopCurrentOrNull$kotlinx_coroutines_core = ThreadLocalEventLoop.INSTANCE.currentOrNull$kotlinx_coroutines_core();
        if (eventLoopCurrentOrNull$kotlinx_coroutines_core != null) {
            return eventLoopCurrentOrNull$kotlinx_coroutines_core.processNextEvent();
        }
        return Long.MAX_VALUE;
    }

    public static final long runSingleTaskFromCurrentSystemDispatcher() {
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread instanceof CoroutineScheduler.Worker) {
            return ((CoroutineScheduler.Worker) threadCurrentThread).runSingleTask();
        }
        fo.s(threadCurrentThread, "Expected CoroutineScheduler.Worker, but got ");
        return 0L;
    }
}
