package kotlinx.coroutines.debug.internal;

import defpackage.j9;
import defpackage.s60;
import defpackage.y70;
import java.io.Serializable;
import java.util.List;
import kotlinx.coroutines.CoroutineId;
import kotlinx.coroutines.CoroutineName;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class DebuggerInfo implements Serializable {
    private final Long coroutineId;
    private final String dispatcher;
    private final List<StackTraceElement> lastObservedStackTrace;
    private final String lastObservedThreadName;
    private final String lastObservedThreadState;
    private final String name;
    private final long sequenceNumber;
    private final String state;

    public DebuggerInfo(DebugCoroutineInfoImpl debugCoroutineInfoImpl, y70 y70Var) {
        Thread.State state;
        CoroutineId coroutineId = (CoroutineId) y70Var.get(CoroutineId.Key);
        this.coroutineId = coroutineId != null ? Long.valueOf(coroutineId.getId()) : null;
        s60 s60Var = (s60) y70Var.get(j9.B);
        this.dispatcher = s60Var != null ? s60Var.toString() : null;
        CoroutineName coroutineName = (CoroutineName) y70Var.get(CoroutineName.Key);
        this.name = coroutineName != null ? coroutineName.getName() : null;
        this.state = debugCoroutineInfoImpl.getState$kotlinx_coroutines_core();
        Thread thread = debugCoroutineInfoImpl.lastObservedThread;
        this.lastObservedThreadState = (thread == null || (state = thread.getState()) == null) ? null : state.toString();
        Thread thread2 = debugCoroutineInfoImpl.lastObservedThread;
        this.lastObservedThreadName = thread2 != null ? thread2.getName() : null;
        this.lastObservedStackTrace = debugCoroutineInfoImpl.lastObservedStackTrace$kotlinx_coroutines_core();
        this.sequenceNumber = debugCoroutineInfoImpl.sequenceNumber;
    }

    public final Long getCoroutineId() {
        return this.coroutineId;
    }

    public final String getDispatcher() {
        return this.dispatcher;
    }

    public final List<StackTraceElement> getLastObservedStackTrace() {
        return this.lastObservedStackTrace;
    }

    public final String getLastObservedThreadName() {
        return this.lastObservedThreadName;
    }

    public final String getLastObservedThreadState() {
        return this.lastObservedThreadState;
    }

    public final String getName() {
        return this.name;
    }

    public final long getSequenceNumber() {
        return this.sequenceNumber;
    }

    public final String getState() {
        return this.state;
    }
}
