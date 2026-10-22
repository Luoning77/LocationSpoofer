package kotlinx.coroutines.debug.internal;

import defpackage.a80;
import defpackage.ap;
import defpackage.az;
import defpackage.az2;
import defpackage.da0;
import defpackage.ez;
import defpackage.fo;
import defpackage.g83;
import defpackage.i52;
import defpackage.jn0;
import defpackage.jq1;
import defpackage.lu0;
import defpackage.m13;
import defpackage.mf3;
import defpackage.my;
import defpackage.o51;
import defpackage.p4;
import defpackage.p91;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s13;
import defpackage.sj0;
import defpackage.wg2;
import defpackage.wv0;
import defpackage.xs2;
import defpackage.y70;
import defpackage.ym3;
import defpackage.yo;
import defpackage.zm3;
import defpackage.zy;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineId;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class DebugProbesImpl {
    private static final StackTraceElement ARTIFICIAL_FRAME;
    public static final DebugProbesImpl INSTANCE;
    private static final ConcurrentWeakMap<a80, DebugCoroutineInfoImpl> callerInfoCache;
    private static final ConcurrentWeakMap<CoroutineOwner<?>, Boolean> capturedCoroutinesMap;
    private static final SimpleDateFormat dateFormat;
    private static final lu0 dynamicAttach;
    private static boolean enableCreationStackTraces;
    private static boolean ignoreCoroutinesWithEmptyContext;
    private static final /* synthetic */ AtomicInteger installations;
    private static boolean sanitizeStackTraces;
    private static final /* synthetic */ AtomicLong sequenceNumber;
    private static Thread weakRefCleanerThread;

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class CoroutineOwner<T> implements q60, a80 {
        public final q60 delegate;
        public final DebugCoroutineInfoImpl info;

        public CoroutineOwner(q60 q60Var, DebugCoroutineInfoImpl debugCoroutineInfoImpl) {
            this.delegate = q60Var;
            this.info = debugCoroutineInfoImpl;
        }

        private final StackTraceFrame getFrame() {
            return this.info.getCreationStackBottom$kotlinx_coroutines_core();
        }

        @Override // defpackage.a80
        public a80 getCallerFrame() {
            StackTraceFrame frame = getFrame();
            if (frame != null) {
                return frame.getCallerFrame();
            }
            return null;
        }

        @Override // defpackage.q60
        public y70 getContext() {
            return this.delegate.getContext();
        }

        @Override // defpackage.a80
        public StackTraceElement getStackTraceElement() {
            StackTraceFrame frame = getFrame();
            if (frame != null) {
                return frame.getStackTraceElement();
            }
            return null;
        }

        @Override // defpackage.q60
        public void resumeWith(Object obj) {
            DebugProbesImpl.INSTANCE.probeCoroutineCompleted(this);
            this.delegate.resumeWith(obj);
        }

        public String toString() {
            return this.delegate.toString();
        }
    }

    static {
        DebugProbesImpl debugProbesImpl = new DebugProbesImpl();
        INSTANCE = debugProbesImpl;
        ARTIFICIAL_FRAME = ym3.r(new Exception(), zm3.class.getSimpleName());
        dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        capturedCoroutinesMap = new ConcurrentWeakMap<>(false, 1, null);
        installations = new AtomicInteger(0);
        sequenceNumber = new AtomicLong(0L);
        sanitizeStackTraces = true;
        ignoreCoroutinesWithEmptyContext = true;
        dynamicAttach = debugProbesImpl.getDynamicAttach();
        callerInfoCache = new ConcurrentWeakMap<>(true);
    }

    private DebugProbesImpl() {
    }

    private final void build(Job job, Map<Job, DebugCoroutineInfoImpl> map, StringBuilder sb, String str) {
        DebugCoroutineInfoImpl debugCoroutineInfoImpl = map.get(job);
        if (debugCoroutineInfoImpl != null) {
            StackTraceElement stackTraceElement = (StackTraceElement) zy.o0(debugCoroutineInfoImpl.lastObservedStackTrace$kotlinx_coroutines_core());
            String state$kotlinx_coroutines_core = debugCoroutineInfoImpl.getState$kotlinx_coroutines_core();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            p91.y(sb2, getDebugString(job), ", continuation is ", state$kotlinx_coroutines_core, " at line ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
            sb.append(sb2.toString());
            str = str + '\t';
        } else if (!(job instanceof ScopeCoroutine)) {
            sb.append(str + getDebugString(job) + '\n');
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append('\t');
            str = sb3.toString();
        }
        Iterator it = job.getChildren().iterator();
        while (it.hasNext()) {
            build((Job) it.next(), map, sb, str);
        }
    }

    private final <T> q60 createOwner(q60 q60Var, StackTraceFrame stackTraceFrame) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            return q60Var;
        }
        CoroutineOwner<?> coroutineOwner = new CoroutineOwner<>(q60Var, new DebugCoroutineInfoImpl(q60Var.getContext(), stackTraceFrame, getSequenceNumber().incrementAndGet()));
        ConcurrentWeakMap<CoroutineOwner<?>, Boolean> concurrentWeakMap = capturedCoroutinesMap;
        concurrentWeakMap.put(coroutineOwner, Boolean.TRUE);
        if (!isInstalled$kotlinx_coroutines_debug()) {
            concurrentWeakMap.clear();
        }
        return coroutineOwner;
    }

    private final <R> List<R> dumpCoroutinesInfoImpl(final pu0 pu0Var) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            fo.n("Debug probes are not installed");
            return null;
        }
        Set<CoroutineOwner<?>> capturedCoroutines = getCapturedCoroutines();
        capturedCoroutines.getClass();
        int i = 1;
        return xs2.U(xs2.S(new wv0(i, new ap(capturedCoroutines, i), new DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1()), new lu0() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl.dumpCoroutinesInfoImpl.3
            /* JADX WARN: Type inference failed for: r2v2, types: [R, java.lang.Object] */
            @Override // defpackage.lu0
            public final R invoke(CoroutineOwner<?> coroutineOwner) {
                y70 context;
                if (DebugProbesImpl.INSTANCE.isFinished(coroutineOwner) || (context = coroutineOwner.info.getContext()) == null) {
                    return null;
                }
                return pu0Var.invoke(coroutineOwner, context);
            }
        }));
    }

    private final void dumpCoroutinesSynchronized(PrintStream printStream) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            fo.n("Debug probes are not installed");
            return;
        }
        printStream.print("Coroutines dump " + dateFormat.format(Long.valueOf(System.currentTimeMillis())));
        Set<CoroutineOwner<?>> capturedCoroutines = getCapturedCoroutines();
        capturedCoroutines.getClass();
        jn0 jn0VarO = xs2.O(new ap(capturedCoroutines, 1), new my(9));
        Comparator comparator = new Comparator() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesSynchronized$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Long.valueOf(((DebugProbesImpl.CoroutineOwner) t).info.sequenceNumber).compareTo(Long.valueOf(((DebugProbesImpl.CoroutineOwner) t2).info.sequenceNumber));
            }
        };
        ArrayList<CoroutineOwner> arrayList = new ArrayList();
        Iterator it = jn0VarO.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        ez.Z(arrayList, comparator);
        for (CoroutineOwner coroutineOwner : arrayList) {
            DebugCoroutineInfoImpl debugCoroutineInfoImpl = coroutineOwner.info;
            List<StackTraceElement> listLastObservedStackTrace$kotlinx_coroutines_core = debugCoroutineInfoImpl.lastObservedStackTrace$kotlinx_coroutines_core();
            DebugProbesImpl debugProbesImpl = INSTANCE;
            List<StackTraceElement> listEnhanceStackTraceWithThreadDumpImpl = debugProbesImpl.enhanceStackTraceWithThreadDumpImpl(debugCoroutineInfoImpl.getState$kotlinx_coroutines_core(), debugCoroutineInfoImpl.lastObservedThread, listLastObservedStackTrace$kotlinx_coroutines_core);
            printStream.print("\n\nCoroutine " + coroutineOwner.delegate + ", state: " + ((o51.f(debugCoroutineInfoImpl.getState$kotlinx_coroutines_core(), DebugCoroutineInfoImplKt.RUNNING) && listEnhanceStackTraceWithThreadDumpImpl == listLastObservedStackTrace$kotlinx_coroutines_core) ? debugCoroutineInfoImpl.getState$kotlinx_coroutines_core() + " (Last suspension stacktrace, not an actual stacktrace)" : debugCoroutineInfoImpl.getState$kotlinx_coroutines_core()));
            if (listLastObservedStackTrace$kotlinx_coroutines_core.isEmpty()) {
                printStream.print("\n\tat " + ARTIFICIAL_FRAME);
                debugProbesImpl.printStackTrace(printStream, debugCoroutineInfoImpl.getCreationStackTrace());
            } else {
                debugProbesImpl.printStackTrace(printStream, listEnhanceStackTraceWithThreadDumpImpl);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean dumpCoroutinesSynchronized$lambda$14(CoroutineOwner coroutineOwner) {
        return !INSTANCE.isFinished(coroutineOwner);
    }

    private final List<StackTraceElement> enhanceStackTraceWithThreadDumpImpl(String str, Thread thread, List<StackTraceElement> list) {
        Object wg2Var;
        if (o51.f(str, DebugCoroutineInfoImplKt.RUNNING) && thread != null) {
            try {
                wg2Var = thread.getStackTrace();
            } catch (Throwable th) {
                wg2Var = new wg2(th);
            }
            if (wg2Var instanceof wg2) {
                wg2Var = null;
            }
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) wg2Var;
            if (stackTraceElementArr != null) {
                int length = stackTraceElementArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTraceElementArr[i];
                    if (o51.f(stackTraceElement.getClassName(), "kotlin.coroutines.jvm.internal.BaseContinuationImpl") && o51.f(stackTraceElement.getMethodName(), "resumeWith") && o51.f(stackTraceElement.getFileName(), "ContinuationImpl.kt")) {
                        break;
                    }
                    i++;
                }
                i52 i52VarFindContinuationStartIndex = findContinuationStartIndex(i, stackTraceElementArr, list);
                int iIntValue = ((Number) i52VarFindContinuationStartIndex.e).intValue();
                int iIntValue2 = ((Number) i52VarFindContinuationStartIndex.f).intValue();
                if (iIntValue != -1) {
                    ArrayList arrayList = new ArrayList((((list.size() + i) - iIntValue) - 1) - iIntValue2);
                    int i2 = i - iIntValue2;
                    for (int i3 = 0; i3 < i2; i3++) {
                        arrayList.add(stackTraceElementArr[i3]);
                    }
                    int size = list.size();
                    for (int i4 = iIntValue + 1; i4 < size; i4++) {
                        arrayList.add(list.get(i4));
                    }
                    return arrayList;
                }
            }
        }
        return list;
    }

    private final i52 findContinuationStartIndex(int i, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        for (int i2 = 0; i2 < 3; i2++) {
            int iFindIndexOfFrame = INSTANCE.findIndexOfFrame((i - 1) - i2, stackTraceElementArr, list);
            if (iFindIndexOfFrame != -1) {
                return new i52(Integer.valueOf(iFindIndexOfFrame), Integer.valueOf(i2));
            }
        }
        return new i52(-1, 0);
    }

    private final int findIndexOfFrame(int i, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        StackTraceElement stackTraceElement = (StackTraceElement) yo.x0(stackTraceElementArr, i);
        if (stackTraceElement == null) {
            return -1;
        }
        int i2 = 0;
        for (StackTraceElement stackTraceElement2 : list) {
            if (o51.f(stackTraceElement2.getFileName(), stackTraceElement.getFileName()) && o51.f(stackTraceElement2.getClassName(), stackTraceElement.getClassName()) && o51.f(stackTraceElement2.getMethodName(), stackTraceElement.getMethodName())) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    private final Set<CoroutineOwner<?>> getCapturedCoroutines() {
        return capturedCoroutinesMap.keySet();
    }

    private final String getDebugString(Job job) {
        return job instanceof JobSupport ? ((JobSupport) job).toDebugString() : job.toString();
    }

    private final lu0 getDynamicAttach() {
        Object wg2Var;
        try {
            Object objNewInstance = Class.forName("kotlinx.coroutines.debug.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(null);
            objNewInstance.getClass();
            da0.o(1, objNewInstance);
            wg2Var = (lu0) objNewInstance;
        } catch (Throwable th) {
            wg2Var = new wg2(th);
        }
        return (lu0) (wg2Var instanceof wg2 ? null : wg2Var);
    }

    private final /* synthetic */ AtomicInteger getInstallations() {
        return installations;
    }

    private final /* synthetic */ AtomicLong getSequenceNumber() {
        return sequenceNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFinished(CoroutineOwner<?> coroutineOwner) {
        Job job;
        y70 context = coroutineOwner.info.getContext();
        if (context == null || (job = (Job) context.get(Job.Key)) == null || !job.isCompleted()) {
            return false;
        }
        capturedCoroutinesMap.remove(coroutineOwner);
        return true;
    }

    private final boolean isInternalMethod(StackTraceElement stackTraceElement) {
        return s13.Z(stackTraceElement.getClassName(), "kotlinx.coroutines", false);
    }

    private final CoroutineOwner<?> owner(q60 q60Var) {
        a80 a80Var = q60Var instanceof a80 ? (a80) q60Var : null;
        if (a80Var != null) {
            return owner(a80Var);
        }
        return null;
    }

    private final void printStackTrace(PrintStream printStream, List<StackTraceElement> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            printStream.print("\n\tat " + ((StackTraceElement) it.next()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void probeCoroutineCompleted(CoroutineOwner<?> coroutineOwner) {
        a80 a80VarRealCaller;
        capturedCoroutinesMap.remove(coroutineOwner);
        a80 lastObservedFrame$kotlinx_coroutines_core = coroutineOwner.info.getLastObservedFrame$kotlinx_coroutines_core();
        if (lastObservedFrame$kotlinx_coroutines_core == null || (a80VarRealCaller = realCaller(lastObservedFrame$kotlinx_coroutines_core)) == null) {
            return;
        }
        callerInfoCache.remove(a80VarRealCaller);
    }

    private final a80 realCaller(a80 a80Var) {
        do {
            a80Var = a80Var.getCallerFrame();
            if (a80Var == null) {
                return null;
            }
        } while (a80Var.getStackTraceElement() == null);
        return a80Var;
    }

    private final <T extends Throwable> List<StackTraceElement> sanitizeStackTrace(T t) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i2 = length2 - 1;
                if (o51.f(stackTrace[length2].getClassName(), "kotlin.coroutines.jvm.internal.DebugProbesKt")) {
                    i = length2;
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                length2 = i2;
            }
        }
        int i3 = i + 1;
        if (!sanitizeStackTraces) {
            int i4 = length - i3;
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList.add(stackTrace[i5 + i3]);
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((length - i3) + 1);
        while (i3 < length) {
            if (isInternalMethod(stackTrace[i3])) {
                arrayList2.add(stackTrace[i3]);
                int i6 = i3 + 1;
                while (i6 < length && isInternalMethod(stackTrace[i6])) {
                    i6++;
                }
                int i7 = i6 - 1;
                int i8 = i7;
                while (i8 > i3 && stackTrace[i8].getFileName() == null) {
                    i8--;
                }
                if (i8 > i3 && i8 < i7) {
                    arrayList2.add(stackTrace[i8]);
                }
                arrayList2.add(stackTrace[i7]);
                i3 = i6;
            } else {
                arrayList2.add(stackTrace[i3]);
                i3++;
            }
        }
        return arrayList2;
    }

    private final void startWeakRefCleanerThread() {
        weakRefCleanerThread = g83.f("Coroutines Debugger Cleaner", new p4(27));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 startWeakRefCleanerThread$lambda$2() {
        callerInfoCache.runWeakRefQueueCleaningLoopUntilInterrupted();
        return mf3.a;
    }

    private final void stopWeakRefCleanerThread() throws InterruptedException {
        Thread thread = weakRefCleanerThread;
        if (thread == null) {
            return;
        }
        weakRefCleanerThread = null;
        thread.interrupt();
        thread.join();
    }

    private final StackTraceFrame toStackTraceFrame(List<StackTraceElement> list) {
        StackTraceFrame stackTraceFrame = null;
        if (!list.isEmpty()) {
            ListIterator<StackTraceElement> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                stackTraceFrame = new StackTraceFrame(stackTraceFrame, listIterator.previous());
            }
        }
        return new StackTraceFrame(stackTraceFrame, ARTIFICIAL_FRAME);
    }

    private final String toStringRepr(Object obj) {
        return DebugProbesImplKt.repr(obj.toString());
    }

    private final void updateRunningState(a80 a80Var, String str) {
        boolean z;
        if (isInstalled$kotlinx_coroutines_debug()) {
            ConcurrentWeakMap<a80, DebugCoroutineInfoImpl> concurrentWeakMap = callerInfoCache;
            DebugCoroutineInfoImpl debugCoroutineInfoImplRemove = concurrentWeakMap.remove(a80Var);
            if (debugCoroutineInfoImplRemove != null) {
                z = false;
            } else {
                CoroutineOwner<?> coroutineOwnerOwner = owner(a80Var);
                if (coroutineOwnerOwner == null || (debugCoroutineInfoImplRemove = coroutineOwnerOwner.info) == null) {
                    return;
                }
                a80 lastObservedFrame$kotlinx_coroutines_core = debugCoroutineInfoImplRemove.getLastObservedFrame$kotlinx_coroutines_core();
                a80 a80VarRealCaller = lastObservedFrame$kotlinx_coroutines_core != null ? realCaller(lastObservedFrame$kotlinx_coroutines_core) : null;
                if (a80VarRealCaller != null) {
                    concurrentWeakMap.remove(a80VarRealCaller);
                }
                z = true;
            }
            a80Var.getClass();
            debugCoroutineInfoImplRemove.updateState$kotlinx_coroutines_core(str, (q60) a80Var, z);
            a80 a80VarRealCaller2 = realCaller(a80Var);
            if (a80VarRealCaller2 == null) {
                return;
            }
            concurrentWeakMap.put(a80VarRealCaller2, debugCoroutineInfoImplRemove);
        }
    }

    private final void updateState(q60 q60Var, String str) {
        if (isInstalled$kotlinx_coroutines_debug()) {
            if (ignoreCoroutinesWithEmptyContext && q60Var.getContext() == sj0.e) {
                return;
            }
            if (o51.f(str, DebugCoroutineInfoImplKt.RUNNING)) {
                a80 a80Var = q60Var instanceof a80 ? (a80) q60Var : null;
                if (a80Var == null) {
                    return;
                }
                updateRunningState(a80Var, str);
                return;
            }
            CoroutineOwner<?> coroutineOwnerOwner = owner(q60Var);
            if (coroutineOwnerOwner == null) {
                return;
            }
            updateState(coroutineOwnerOwner, q60Var, str);
        }
    }

    public final void dumpCoroutines(PrintStream printStream) {
        synchronized (printStream) {
            INSTANCE.dumpCoroutinesSynchronized(printStream);
        }
    }

    public final List<DebugCoroutineInfo> dumpCoroutinesInfo() {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            fo.n("Debug probes are not installed");
            return null;
        }
        Set<CoroutineOwner<?>> capturedCoroutines = getCapturedCoroutines();
        capturedCoroutines.getClass();
        int i = 1;
        return xs2.U(xs2.S(new wv0(i, new ap(capturedCoroutines, i), new DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1()), new lu0() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfo$$inlined$dumpCoroutinesInfoImpl$1
            @Override // defpackage.lu0
            public final DebugCoroutineInfo invoke(DebugProbesImpl.CoroutineOwner<?> coroutineOwner) {
                y70 context;
                if (DebugProbesImpl.INSTANCE.isFinished(coroutineOwner) || (context = coroutineOwner.info.getContext()) == null) {
                    return null;
                }
                return new DebugCoroutineInfo(coroutineOwner.info, context);
            }
        }));
    }

    public final Object[] dumpCoroutinesInfoAsJsonAndReferences() {
        String name;
        List<DebugCoroutineInfo> listDumpCoroutinesInfo = dumpCoroutinesInfo();
        int size = listDumpCoroutinesInfo.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        ArrayList arrayList3 = new ArrayList(size);
        for (DebugCoroutineInfo debugCoroutineInfo : listDumpCoroutinesInfo) {
            y70 context = debugCoroutineInfo.getContext();
            CoroutineName coroutineName = (CoroutineName) context.get(CoroutineName.Key);
            Long lValueOf = null;
            String stringRepr = (coroutineName == null || (name = coroutineName.getName()) == null) ? null : toStringRepr(name);
            CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) context.get(CoroutineDispatcher.Key);
            String stringRepr2 = coroutineDispatcher != null ? toStringRepr(coroutineDispatcher) : null;
            StringBuilder sbQ = az2.q("\n                {\n                    \"name\": ", stringRepr, ",\n                    \"id\": ");
            CoroutineId coroutineId = (CoroutineId) context.get(CoroutineId.Key);
            if (coroutineId != null) {
                lValueOf = Long.valueOf(coroutineId.getId());
            }
            sbQ.append(lValueOf);
            sbQ.append(",\n                    \"dispatcher\": ");
            sbQ.append(stringRepr2);
            sbQ.append(",\n                    \"sequenceNumber\": ");
            sbQ.append(debugCoroutineInfo.getSequenceNumber());
            sbQ.append(",\n                    \"state\": \"");
            sbQ.append(debugCoroutineInfo.getState());
            sbQ.append("\"\n                } \n                ");
            arrayList3.add(m13.O(sbQ.toString()));
            arrayList2.add(debugCoroutineInfo.getLastObservedFrame());
            arrayList.add(debugCoroutineInfo.getLastObservedThread());
        }
        return new Object[]{p91.q(new StringBuilder("["), zy.s0(arrayList3, null, null, null, null, 63), ']'), arrayList.toArray(new Thread[0]), arrayList2.toArray(new a80[0]), listDumpCoroutinesInfo.toArray(new DebugCoroutineInfo[0])};
    }

    public final List<DebuggerInfo> dumpDebuggerInfo() {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            fo.n("Debug probes are not installed");
            return null;
        }
        Set<CoroutineOwner<?>> capturedCoroutines = getCapturedCoroutines();
        capturedCoroutines.getClass();
        int i = 1;
        return xs2.U(xs2.S(new wv0(i, new ap(capturedCoroutines, i), new DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1()), new lu0() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpDebuggerInfo$$inlined$dumpCoroutinesInfoImpl$1
            @Override // defpackage.lu0
            public final DebuggerInfo invoke(DebugProbesImpl.CoroutineOwner<?> coroutineOwner) {
                y70 context;
                if (DebugProbesImpl.INSTANCE.isFinished(coroutineOwner) || (context = coroutineOwner.info.getContext()) == null) {
                    return null;
                }
                return new DebuggerInfo(coroutineOwner.info, context);
            }
        }));
    }

    public final List<StackTraceElement> enhanceStackTraceWithThreadDump(DebugCoroutineInfo debugCoroutineInfo, List<StackTraceElement> list) {
        return enhanceStackTraceWithThreadDumpImpl(debugCoroutineInfo.getState(), debugCoroutineInfo.getLastObservedThread(), list);
    }

    public final String enhanceStackTraceWithThreadDumpAsJson(DebugCoroutineInfo debugCoroutineInfo) {
        List<StackTraceElement> listEnhanceStackTraceWithThreadDump = enhanceStackTraceWithThreadDump(debugCoroutineInfo, debugCoroutineInfo.lastObservedStackTrace());
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : listEnhanceStackTraceWithThreadDump) {
            StringBuilder sb = new StringBuilder("\n                {\n                    \"declaringClass\": \"");
            sb.append(stackTraceElement.getClassName());
            sb.append("\",\n                    \"methodName\": \"");
            sb.append(stackTraceElement.getMethodName());
            sb.append("\",\n                    \"fileName\": ");
            String fileName = stackTraceElement.getFileName();
            sb.append(fileName != null ? toStringRepr(fileName) : null);
            sb.append(",\n                    \"lineNumber\": ");
            sb.append(stackTraceElement.getLineNumber());
            sb.append("\n                }\n                ");
            arrayList.add(m13.O(sb.toString()));
        }
        return p91.q(new StringBuilder("["), zy.s0(arrayList, null, null, null, null, 63), ']');
    }

    public final boolean getEnableCreationStackTraces$kotlinx_coroutines_core() {
        return enableCreationStackTraces;
    }

    public final boolean getIgnoreCoroutinesWithEmptyContext() {
        return ignoreCoroutinesWithEmptyContext;
    }

    public final boolean getSanitizeStackTraces$kotlinx_coroutines_core() {
        return sanitizeStackTraces;
    }

    public final String hierarchyToString$kotlinx_coroutines_core(Job job) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            fo.n("Debug probes are not installed");
            return null;
        }
        Set<CoroutineOwner<?>> capturedCoroutines = getCapturedCoroutines();
        ArrayList arrayList = new ArrayList();
        for (Object obj : capturedCoroutines) {
            if (((CoroutineOwner) obj).delegate.getContext().get(Job.Key) != null) {
                arrayList.add(obj);
            }
        }
        int iM = jq1.M(az.Y(arrayList, 10));
        if (iM < 16) {
            iM = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            CoroutineOwner coroutineOwner = (CoroutineOwner) obj2;
            linkedHashMap.put(JobKt.getJob(coroutineOwner.delegate.getContext()), coroutineOwner.info);
        }
        StringBuilder sb = new StringBuilder();
        INSTANCE.build(job, linkedHashMap, sb, "");
        return sb.toString();
    }

    public final void install$kotlinx_coroutines_core() {
        lu0 lu0Var;
        if (getInstallations().incrementAndGet() > 1) {
            return;
        }
        startWeakRefCleanerThread();
        if (AgentInstallationType.INSTANCE.isInstalledStatically$kotlinx_coroutines_core() || (lu0Var = dynamicAttach) == null) {
            return;
        }
        lu0Var.invoke(Boolean.TRUE);
    }

    public final boolean isInstalled$kotlinx_coroutines_debug() {
        return getInstallations().get() > 0;
    }

    public final <T> q60 probeCoroutineCreated$kotlinx_coroutines_core(q60 q60Var) {
        if (isInstalled$kotlinx_coroutines_debug() && (!(ignoreCoroutinesWithEmptyContext && q60Var.getContext() == sj0.e) && owner(q60Var) == null)) {
            return createOwner(q60Var, enableCreationStackTraces ? toStackTraceFrame(sanitizeStackTrace(new Exception())) : null);
        }
        return q60Var;
    }

    public final void probeCoroutineResumed$kotlinx_coroutines_core(q60 q60Var) {
        updateState(q60Var, DebugCoroutineInfoImplKt.RUNNING);
    }

    public final void probeCoroutineSuspended$kotlinx_coroutines_core(q60 q60Var) {
        updateState(q60Var, DebugCoroutineInfoImplKt.SUSPENDED);
    }

    public final void setEnableCreationStackTraces$kotlinx_coroutines_core(boolean z) {
        enableCreationStackTraces = z;
    }

    public final void setIgnoreCoroutinesWithEmptyContext(boolean z) {
        ignoreCoroutinesWithEmptyContext = z;
    }

    public final void setSanitizeStackTraces$kotlinx_coroutines_core(boolean z) {
        sanitizeStackTraces = z;
    }

    public final void uninstall$kotlinx_coroutines_core() throws InterruptedException {
        lu0 lu0Var;
        if (!isInstalled$kotlinx_coroutines_debug()) {
            fo.n("Agent was not installed");
            return;
        }
        if (getInstallations().decrementAndGet() != 0) {
            return;
        }
        stopWeakRefCleanerThread();
        capturedCoroutinesMap.clear();
        callerInfoCache.clear();
        if (AgentInstallationType.INSTANCE.isInstalledStatically$kotlinx_coroutines_core() || (lu0Var = dynamicAttach) == null) {
            return;
        }
        lu0Var.invoke(Boolean.FALSE);
    }

    private final CoroutineOwner<?> owner(a80 a80Var) {
        while (!(a80Var instanceof CoroutineOwner)) {
            a80Var = a80Var.getCallerFrame();
            if (a80Var == null) {
                return null;
            }
        }
        return (CoroutineOwner) a80Var;
    }

    private static /* synthetic */ void getDebugString$annotations(Job job) {
    }

    private final void updateState(CoroutineOwner<?> coroutineOwner, q60 q60Var, String str) {
        if (isInstalled$kotlinx_coroutines_debug()) {
            coroutineOwner.info.updateState$kotlinx_coroutines_core(str, q60Var, true);
        }
    }
}
