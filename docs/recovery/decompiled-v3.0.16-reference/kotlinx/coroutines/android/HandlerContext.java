package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import defpackage.az2;
import defpackage.ca0;
import defpackage.j;
import defpackage.mf3;
import defpackage.o51;
import defpackage.ub;
import defpackage.y70;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.NonDisposableHandle;
import kotlinx.coroutines.android.HandlerContext;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class HandlerContext extends HandlerDispatcher implements Delay {
    private final Handler handler;
    private final HandlerContext immediate;
    private final boolean invokeImmediately;
    private final String name;

    private HandlerContext(Handler handler, String str, boolean z) {
        super(null);
        this.handler = handler;
        this.name = str;
        this.invokeImmediately = z;
        this.immediate = z ? this : new HandlerContext(handler, str, true);
    }

    private final void cancelOnRejection(y70 y70Var, Runnable runnable) {
        JobKt.cancel(y70Var, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        Dispatchers.getIO().mo90dispatch(y70Var, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeOnTimeout$lambda$3(HandlerContext handlerContext, Runnable runnable) {
        handlerContext.handler.removeCallbacks(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleResumeAfterDelay$lambda$1(CancellableContinuation cancellableContinuation, HandlerContext handlerContext) {
        cancellableContinuation.resumeUndispatched(handlerContext, mf3.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 scheduleResumeAfterDelay$lambda$2(HandlerContext handlerContext, Runnable runnable, Throwable th) {
        handlerContext.handler.removeCallbacks(runnable);
        return mf3.a;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo90dispatch(y70 y70Var, Runnable runnable) {
        if (this.handler.post(runnable)) {
            return;
        }
        cancelOnRejection(y70Var, runnable);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof HandlerContext)) {
            return false;
        }
        HandlerContext handlerContext = (HandlerContext) obj;
        return handlerContext.handler == this.handler && handlerContext.invokeImmediately == this.invokeImmediately;
    }

    public int hashCode() {
        return (this.invokeImmediately ? 1231 : 1237) ^ System.identityHashCode(this.handler);
    }

    @Override // kotlinx.coroutines.android.HandlerDispatcher, kotlinx.coroutines.Delay
    public DisposableHandle invokeOnTimeout(long j, final Runnable runnable, y70 y70Var) {
        Handler handler = this.handler;
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (handler.postDelayed(runnable, j)) {
            return new DisposableHandle() { // from class: ex0
                @Override // kotlinx.coroutines.DisposableHandle
                public final void dispose() {
                    HandlerContext.invokeOnTimeout$lambda$3(this.e, runnable);
                }
            };
        }
        cancelOnRejection(y70Var, runnable);
        return NonDisposableHandle.INSTANCE;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(y70 y70Var) {
        return (this.invokeImmediately && o51.f(Looper.myLooper(), this.handler.getLooper())) ? false : true;
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo91scheduleResumeAfterDelay(long j, CancellableContinuation<? super mf3> cancellableContinuation) {
        ub ubVar = new ub(3, cancellableContinuation, this);
        Handler handler = this.handler;
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (handler.postDelayed(ubVar, j)) {
            cancellableContinuation.invokeOnCancellation(new j(23, this, ubVar));
        } else {
            cancelOnRejection(cancellableContinuation.getContext(), ubVar);
        }
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String stringInternalImpl = toStringInternalImpl();
        if (stringInternalImpl == null) {
            stringInternalImpl = this.name;
            if (stringInternalImpl == null) {
                stringInternalImpl = this.handler.toString();
            }
            if (this.invokeImmediately) {
                return az2.y(stringInternalImpl, ".immediate");
            }
        }
        return stringInternalImpl;
    }

    @Override // kotlinx.coroutines.android.HandlerDispatcher, kotlinx.coroutines.MainCoroutineDispatcher
    public HandlerContext getImmediate() {
        return this.immediate;
    }

    public /* synthetic */ HandlerContext(Handler handler, String str, int i, ca0 ca0Var) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public HandlerContext(Handler handler, String str) {
        this(handler, str, false);
    }
}
