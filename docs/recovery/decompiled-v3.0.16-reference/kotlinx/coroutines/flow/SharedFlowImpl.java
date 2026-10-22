package kotlinx.coroutines.flow;

import defpackage.b81;
import defpackage.fo;
import defpackage.hd0;
import defpackage.mf3;
import defpackage.o51;
import defpackage.q60;
import defpackage.r60;
import defpackage.s90;
import defpackage.uj0;
import defpackage.y70;
import defpackage.z70;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class SharedFlowImpl<T> extends AbstractSharedFlow<SharedFlowSlot> implements MutableSharedFlow<T>, CancellableFlow<T>, FusibleFlow<T> {
    private Object[] buffer;
    private final int bufferCapacity;
    private int bufferSize;
    private long minCollectorIndex;
    private final BufferOverflow onBufferOverflow;
    private int queueSize;
    private final int replay;
    private long replayIndex;

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Emitter implements DisposableHandle {
        public final q60 cont;
        public final SharedFlowImpl<?> flow;
        public long index;
        public final Object value;

        public Emitter(SharedFlowImpl<?> sharedFlowImpl, long j, Object obj, q60 q60Var) {
            this.flow = sharedFlowImpl;
            this.index = j;
            this.value = obj;
            this.cont = q60Var;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public void dispose() {
            this.flow.cancelEmitter(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            try {
                iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.SharedFlowImpl$collect$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {387, 394, 397}, m = "collect$suspendImpl")
    public static final class AnonymousClass1<T> extends r60 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SharedFlowImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SharedFlowImpl<T> sharedFlowImpl, q60 q60Var) {
            super(q60Var);
            this.this$0 = sharedFlowImpl;
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SharedFlowImpl.collect$suspendImpl(this.this$0, null, this);
        }
    }

    public SharedFlowImpl(int i, int i2, BufferOverflow bufferOverflow) {
        this.replay = i;
        this.bufferCapacity = i2;
        this.onBufferOverflow = bufferOverflow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitValue(SharedFlowSlot sharedFlowSlot, q60 q60Var) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(hd0.G(q60Var), 1);
        cancellableContinuationImpl.initCancellability();
        synchronized (this) {
            try {
                if (tryPeekLocked(sharedFlowSlot) < 0) {
                    sharedFlowSlot.cont = cancellableContinuationImpl;
                } else {
                    cancellableContinuationImpl.resumeWith(mf3.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        return result == z70.e ? result : mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelEmitter(Emitter emitter) {
        synchronized (this) {
            if (emitter.index < getHead()) {
                return;
            }
            Object[] objArr = this.buffer;
            objArr.getClass();
            if (SharedFlowKt.getBufferAt(objArr, emitter.index) != emitter) {
                return;
            }
            SharedFlowKt.setBufferAt(objArr, emitter.index, SharedFlowKt.NO_VALUE);
            cleanupTailLocked();
        }
    }

    private final void cleanupTailLocked() {
        if (this.bufferCapacity != 0 || this.queueSize > 1) {
            Object[] objArr = this.buffer;
            objArr.getClass();
            while (this.queueSize > 0 && SharedFlowKt.getBufferAt(objArr, (getHead() + ((long) getTotalSize())) - 1) == SharedFlowKt.NO_VALUE) {
                this.queueSize--;
                SharedFlowKt.setBufferAt(objArr, getHead() + ((long) getTotalSize()), null);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
    
        if (((kotlinx.coroutines.flow.SubscribedFlowCollector) r9).onSubscription(r0) == r5) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> java.lang.Object collect$suspendImpl(kotlinx.coroutines.flow.SharedFlowImpl<T> r8, kotlinx.coroutines.flow.FlowCollector<? super T> r9, defpackage.q60 r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SharedFlowImpl.collect$suspendImpl(kotlinx.coroutines.flow.SharedFlowImpl, kotlinx.coroutines.flow.FlowCollector, q60):java.lang.Object");
    }

    private final void correctCollectorIndexesOnDropOldest(long j) {
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        if (((AbstractSharedFlow) this).nCollectors != 0 && (abstractSharedFlowSlotArr = ((AbstractSharedFlow) this).slots) != null) {
            for (AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
                if (abstractSharedFlowSlot != null) {
                    SharedFlowSlot sharedFlowSlot = (SharedFlowSlot) abstractSharedFlowSlot;
                    long j2 = sharedFlowSlot.index;
                    if (j2 >= 0 && j2 < j) {
                        sharedFlowSlot.index = j;
                    }
                }
            }
        }
        this.minCollectorIndex = j;
    }

    private final void dropOldestLocked() {
        Object[] objArr = this.buffer;
        objArr.getClass();
        SharedFlowKt.setBufferAt(objArr, getHead(), null);
        this.bufferSize--;
        long head = getHead() + 1;
        if (this.replayIndex < head) {
            this.replayIndex = head;
        }
        if (this.minCollectorIndex < head) {
            correctCollectorIndexesOnDropOldest(head);
        }
    }

    public static <T> Object emit$suspendImpl(SharedFlowImpl<T> sharedFlowImpl, T t, q60 q60Var) {
        Object objEmitSuspend;
        boolean zTryEmit = sharedFlowImpl.tryEmit(t);
        mf3 mf3Var = mf3.a;
        return (!zTryEmit && (objEmitSuspend = sharedFlowImpl.emitSuspend(t, q60Var)) == z70.e) ? objEmitSuspend : mf3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object emitSuspend(T t, q60 q60Var) throws Throwable {
        SharedFlowImpl<T> sharedFlowImpl;
        Throwable th;
        q60[] q60VarArrFindSlotsToResumeLocked;
        Emitter emitter;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(hd0.G(q60Var), 1);
        cancellableContinuationImpl.initCancellability();
        q60[] q60VarArrFindSlotsToResumeLocked2 = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            try {
                if (tryEmitLocked(t)) {
                    try {
                        cancellableContinuationImpl.resumeWith(mf3.a);
                        q60VarArrFindSlotsToResumeLocked = findSlotsToResumeLocked(q60VarArrFindSlotsToResumeLocked2);
                        emitter = null;
                        sharedFlowImpl = this;
                    } catch (Throwable th2) {
                        th = th2;
                        sharedFlowImpl = this;
                        throw th;
                    }
                } else {
                    sharedFlowImpl = this;
                    try {
                        Emitter emitter2 = new Emitter(sharedFlowImpl, getHead() + ((long) getTotalSize()), t, cancellableContinuationImpl);
                        sharedFlowImpl.enqueueLocked(emitter2);
                        sharedFlowImpl.queueSize++;
                        if (sharedFlowImpl.bufferCapacity == 0) {
                            q60VarArrFindSlotsToResumeLocked2 = sharedFlowImpl.findSlotsToResumeLocked(q60VarArrFindSlotsToResumeLocked2);
                        }
                        q60VarArrFindSlotsToResumeLocked = q60VarArrFindSlotsToResumeLocked2;
                        emitter = emitter2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (emitter != null) {
                    CancellableContinuationKt.disposeOnCancellation(cancellableContinuationImpl, emitter);
                }
                for (q60 q60Var2 : q60VarArrFindSlotsToResumeLocked) {
                    if (q60Var2 != null) {
                        q60Var2.resumeWith(mf3.a);
                    }
                }
                Object result = cancellableContinuationImpl.getResult();
                return result == z70.e ? result : mf3.a;
            } catch (Throwable th4) {
                th = th4;
                sharedFlowImpl = this;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enqueueLocked(Object obj) {
        int totalSize = getTotalSize();
        Object[] objArrGrowBuffer = this.buffer;
        if (objArrGrowBuffer == null) {
            objArrGrowBuffer = growBuffer(null, 0, 2);
        } else if (totalSize >= objArrGrowBuffer.length) {
            objArrGrowBuffer = growBuffer(objArrGrowBuffer, totalSize, objArrGrowBuffer.length * 2);
        }
        SharedFlowKt.setBufferAt(objArrGrowBuffer, getHead() + ((long) totalSize), obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [q60[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final q60[] findSlotsToResumeLocked(q60[] q60VarArr) {
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        SharedFlowSlot sharedFlowSlot;
        q60 q60Var;
        int length = q60VarArr.length;
        if (((AbstractSharedFlow) this).nCollectors != 0 && (abstractSharedFlowSlotArr = ((AbstractSharedFlow) this).slots) != null) {
            int length2 = abstractSharedFlowSlotArr.length;
            int i = 0;
            while (i < length2) {
                AbstractSharedFlowSlot abstractSharedFlowSlot = abstractSharedFlowSlotArr[i];
                if (abstractSharedFlowSlot == null || (q60Var = (sharedFlowSlot = (SharedFlowSlot) abstractSharedFlowSlot).cont) == null || tryPeekLocked(sharedFlowSlot) < 0) {
                    q60VarArr = q60VarArr;
                } else {
                    if (length >= q60VarArr.length) {
                        q60VarArr = q60VarArr;
                        q60VarArr = q60VarArr;
                        q60VarArr = Arrays.copyOf((Object[]) q60VarArr, Math.max(2, q60VarArr.length * 2));
                    }
                    q60VarArr = q60VarArr;
                    q60VarArr = q60VarArr;
                    ((q60[]) q60VarArr)[length] = q60Var;
                    sharedFlowSlot.cont = null;
                    length++;
                }
                i++;
                q60VarArr = q60VarArr;
            }
            q60VarArr = q60VarArr;
        }
        return (q60[]) q60VarArr;
    }

    private final long getBufferEndIndex() {
        return getHead() + ((long) this.bufferSize);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getHead() {
        return Math.min(this.minCollectorIndex, this.replayIndex);
    }

    private final Object getPeekedValueLockedAt(long j) {
        Object[] objArr = this.buffer;
        objArr.getClass();
        Object bufferAt = SharedFlowKt.getBufferAt(objArr, j);
        return bufferAt instanceof Emitter ? ((Emitter) bufferAt).value : bufferAt;
    }

    private final long getQueueEndIndex() {
        return getHead() + ((long) this.bufferSize) + ((long) this.queueSize);
    }

    private final int getReplaySize() {
        return (int) ((getHead() + ((long) this.bufferSize)) - this.replayIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTotalSize() {
        return this.bufferSize + this.queueSize;
    }

    private final Object[] growBuffer(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            fo.n("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i2];
        this.buffer = objArr2;
        if (objArr != null) {
            long head = getHead();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + head;
                SharedFlowKt.setBufferAt(objArr2, j, SharedFlowKt.getBufferAt(objArr, j));
            }
        }
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean tryEmitLocked(T t) {
        if (getNCollectors() == 0) {
            return tryEmitNoCollectorsLocked(t);
        }
        if (this.bufferSize >= this.bufferCapacity && this.minCollectorIndex <= this.replayIndex) {
            int i = WhenMappings.$EnumSwitchMapping$0[this.onBufferOverflow.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
            if (i != 3) {
                b81.d();
                return false;
            }
        }
        enqueueLocked(t);
        int i2 = this.bufferSize + 1;
        this.bufferSize = i2;
        if (i2 > this.bufferCapacity) {
            dropOldestLocked();
        }
        if (getReplaySize() > this.replay) {
            updateBufferLocked(this.replayIndex + 1, this.minCollectorIndex, getBufferEndIndex(), getQueueEndIndex());
        }
        return true;
    }

    private final boolean tryEmitNoCollectorsLocked(T t) {
        if (this.replay == 0) {
            return true;
        }
        enqueueLocked(t);
        int i = this.bufferSize + 1;
        this.bufferSize = i;
        if (i > this.replay) {
            dropOldestLocked();
        }
        this.minCollectorIndex = getHead() + ((long) this.bufferSize);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long tryPeekLocked(SharedFlowSlot sharedFlowSlot) {
        long j = sharedFlowSlot.index;
        if (j >= getBufferEndIndex() && (this.bufferCapacity > 0 || j > getHead() || this.queueSize == 0)) {
            return -1L;
        }
        return j;
    }

    private final Object tryTakeValue(SharedFlowSlot sharedFlowSlot) {
        Object obj;
        q60[] q60VarArrUpdateCollectorIndexLocked$kotlinx_coroutines_core = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            try {
                long jTryPeekLocked = tryPeekLocked(sharedFlowSlot);
                if (jTryPeekLocked < 0) {
                    obj = SharedFlowKt.NO_VALUE;
                } else {
                    long j = sharedFlowSlot.index;
                    Object peekedValueLockedAt = getPeekedValueLockedAt(jTryPeekLocked);
                    sharedFlowSlot.index = jTryPeekLocked + 1;
                    q60VarArrUpdateCollectorIndexLocked$kotlinx_coroutines_core = updateCollectorIndexLocked$kotlinx_coroutines_core(j);
                    obj = peekedValueLockedAt;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (q60 q60Var : q60VarArrUpdateCollectorIndexLocked$kotlinx_coroutines_core) {
            if (q60Var != null) {
                q60Var.resumeWith(mf3.a);
            }
        }
        return obj;
    }

    private final void updateBufferLocked(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long head = getHead(); head < jMin; head++) {
            Object[] objArr = this.buffer;
            objArr.getClass();
            SharedFlowKt.setBufferAt(objArr, head, null);
        }
        this.replayIndex = j;
        this.minCollectorIndex = j2;
        this.bufferSize = (int) (j3 - jMin);
        this.queueSize = (int) (j4 - j3);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, q60 q60Var) {
        return collect$suspendImpl(this, flowCollector, q60Var);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public SharedFlowSlot createSlot() {
        return new SharedFlowSlot();
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, q60 q60Var) {
        return emit$suspendImpl(this, t, q60Var);
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public Flow<T> fuse(y70 y70Var, int i, BufferOverflow bufferOverflow) {
        return SharedFlowKt.fuseSharedFlow(this, y70Var, i, bufferOverflow);
    }

    public final T getLastReplayedLocked() {
        Object[] objArr = this.buffer;
        objArr.getClass();
        return (T) SharedFlowKt.getBufferAt(objArr, (this.replayIndex + ((long) getReplaySize())) - 1);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List<T> getReplayCache() {
        synchronized (this) {
            int replaySize = getReplaySize();
            if (replaySize == 0) {
                return uj0.e;
            }
            ArrayList arrayList = new ArrayList(replaySize);
            Object[] objArr = this.buffer;
            objArr.getClass();
            for (int i = 0; i < replaySize; i++) {
                arrayList.add(SharedFlowKt.getBufferAt(objArr, this.replayIndex + ((long) i)));
            }
            return arrayList;
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() throws Throwable {
        SharedFlowImpl<T> sharedFlowImpl;
        synchronized (this) {
            try {
                sharedFlowImpl = this;
                try {
                    sharedFlowImpl.updateBufferLocked(getBufferEndIndex(), this.minCollectorIndex, getBufferEndIndex(), getQueueEndIndex());
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                sharedFlowImpl = this;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(T t) {
        int i;
        boolean z;
        q60[] q60VarArrFindSlotsToResumeLocked = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            if (tryEmitLocked(t)) {
                q60VarArrFindSlotsToResumeLocked = findSlotsToResumeLocked(q60VarArrFindSlotsToResumeLocked);
                z = true;
            } else {
                z = false;
            }
        }
        for (q60 q60Var : q60VarArrFindSlotsToResumeLocked) {
            if (q60Var != null) {
                q60Var.resumeWith(mf3.a);
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fe A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ff  */
    public final q60[] updateCollectorIndexLocked$kotlinx_coroutines_core(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        q60[] q60VarArr;
        long jMax;
        Object[] objArr;
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        if (j > this.minCollectorIndex) {
            return AbstractSharedFlowKt.EMPTY_RESUMES;
        }
        long head = getHead();
        long j6 = ((long) this.bufferSize) + head;
        if (this.bufferCapacity == 0 && this.queueSize > 0) {
            j6++;
        }
        int i = 0;
        if (((AbstractSharedFlow) this).nCollectors != 0 && (abstractSharedFlowSlotArr = ((AbstractSharedFlow) this).slots) != null) {
            for (AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
                if (abstractSharedFlowSlot != null) {
                    long j7 = ((SharedFlowSlot) abstractSharedFlowSlot).index;
                    if (j7 >= 0 && j7 < j6) {
                        j6 = j7;
                    }
                }
            }
        }
        if (j6 <= this.minCollectorIndex) {
            return AbstractSharedFlowKt.EMPTY_RESUMES;
        }
        long bufferEndIndex = getBufferEndIndex();
        int nCollectors = getNCollectors();
        int iMin = this.queueSize;
        if (nCollectors > 0) {
            iMin = Math.min(iMin, this.bufferCapacity - ((int) (bufferEndIndex - j6)));
        }
        q60[] q60VarArr2 = AbstractSharedFlowKt.EMPTY_RESUMES;
        long j8 = ((long) this.queueSize) + bufferEndIndex;
        if (iMin > 0) {
            q60VarArr2 = new q60[iMin];
            Object[] objArr2 = this.buffer;
            objArr2.getClass();
            j4 = 1;
            long j9 = bufferEndIndex;
            while (true) {
                if (bufferEndIndex >= j8) {
                    j2 = head;
                    j3 = j6;
                    q60VarArr = q60VarArr2;
                    j5 = j9;
                    break;
                }
                Object bufferAt = SharedFlowKt.getBufferAt(objArr2, bufferEndIndex);
                j2 = head;
                Symbol symbol = SharedFlowKt.NO_VALUE;
                if (bufferAt != symbol) {
                    bufferAt.getClass();
                    Emitter emitter = (Emitter) bufferAt;
                    int i2 = i + 1;
                    j3 = j6;
                    q60VarArr2[i] = emitter.cont;
                    SharedFlowKt.setBufferAt(objArr2, bufferEndIndex, symbol);
                    SharedFlowKt.setBufferAt(objArr2, j9, emitter.value);
                    j5 = j9 + 1;
                    if (i2 < iMin) {
                        i = i2;
                        j9 = j5;
                    }
                } else {
                    j3 = j6;
                }
                bufferEndIndex++;
                head = j2;
                j6 = j3;
            }
            int i3 = (int) (j5 - j2);
            if (getNCollectors() == 0) {
                j3 = j5;
            }
            jMax = Math.max(this.replayIndex, j5 - ((long) Math.min(this.replay, i3)));
            if (this.bufferCapacity == 0 && jMax < j8) {
                objArr = this.buffer;
                objArr.getClass();
                if (o51.f(SharedFlowKt.getBufferAt(objArr, jMax), SharedFlowKt.NO_VALUE)) {
                    j5 += j4;
                    jMax += j4;
                }
            }
            updateBufferLocked(jMax, j3, j5, j8);
            cleanupTailLocked();
            if (q60VarArr.length == 0) {
                return q60VarArr;
            }
            return findSlotsToResumeLocked(q60VarArr);
        }
        j2 = head;
        j3 = j6;
        j4 = 1;
        j5 = bufferEndIndex;
        q60VarArr = q60VarArr2;
        int i4 = (int) (j5 - j2);
        if (getNCollectors() == 0) {
            j3 = j5;
        }
        jMax = Math.max(this.replayIndex, j5 - ((long) Math.min(this.replay, i4)));
        if (this.bufferCapacity == 0) {
            objArr = this.buffer;
            objArr.getClass();
            if (o51.f(SharedFlowKt.getBufferAt(objArr, jMax), SharedFlowKt.NO_VALUE)) {
                j5 += j4;
                jMax += j4;
            }
        }
        updateBufferLocked(jMax, j3, j5, j8);
        cleanupTailLocked();
        if (q60VarArr.length == 0) {
            return q60VarArr;
        }
        return findSlotsToResumeLocked(q60VarArr);
    }

    public final long updateNewCollectorIndexLocked$kotlinx_coroutines_core() {
        long j = this.replayIndex;
        if (j < this.minCollectorIndex) {
            this.minCollectorIndex = j;
        }
        return j;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public SharedFlowSlot[] createSlotArray(int i) {
        return new SharedFlowSlot[i];
    }

    public static /* synthetic */ void getLastReplayedLocked$annotations() {
    }
}
