package kotlinx.coroutines.debug.internal;

import defpackage.a80;
import defpackage.y70;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class DebugCoroutineInfo {
    private final y70 context;
    private final a80 creationStackBottom;
    private final List<StackTraceElement> creationStackTrace;
    private final a80 lastObservedFrame;
    private final List<StackTraceElement> lastObservedStackTrace;
    private final Thread lastObservedThread;
    private final long sequenceNumber;
    private final String state;

    public DebugCoroutineInfo(DebugCoroutineInfoImpl debugCoroutineInfoImpl, y70 y70Var) {
        this.context = y70Var;
        this.creationStackBottom = debugCoroutineInfoImpl.getCreationStackBottom$kotlinx_coroutines_core();
        this.sequenceNumber = debugCoroutineInfoImpl.sequenceNumber;
        this.creationStackTrace = debugCoroutineInfoImpl.getCreationStackTrace();
        this.state = debugCoroutineInfoImpl.getState$kotlinx_coroutines_core();
        this.lastObservedThread = debugCoroutineInfoImpl.lastObservedThread;
        this.lastObservedFrame = debugCoroutineInfoImpl.getLastObservedFrame$kotlinx_coroutines_core();
        this.lastObservedStackTrace = debugCoroutineInfoImpl.lastObservedStackTrace$kotlinx_coroutines_core();
    }

    public final y70 getContext() {
        return this.context;
    }

    public final a80 getCreationStackBottom$kotlinx_coroutines_core() {
        return this.creationStackBottom;
    }

    public final List<StackTraceElement> getCreationStackTrace() {
        return this.creationStackTrace;
    }

    public final a80 getLastObservedFrame() {
        return this.lastObservedFrame;
    }

    public final Thread getLastObservedThread() {
        return this.lastObservedThread;
    }

    public final long getSequenceNumber() {
        return this.sequenceNumber;
    }

    public final String getState() {
        return this.state;
    }

    public final List<StackTraceElement> lastObservedStackTrace() {
        return this.lastObservedStackTrace;
    }
}
