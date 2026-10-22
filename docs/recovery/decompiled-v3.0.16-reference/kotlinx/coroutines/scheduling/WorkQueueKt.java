package kotlinx.coroutines.scheduling;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class WorkQueueKt {
    public static final int BUFFER_CAPACITY = 128;
    public static final int BUFFER_CAPACITY_BASE = 7;
    public static final int MASK = 127;
    public static final long NOTHING_TO_STEAL = -2;
    public static final int STEAL_ANY = 3;
    public static final int STEAL_BLOCKING_ONLY = 1;
    public static final int STEAL_CPU_ONLY = 2;
    public static final long TASK_STOLEN = -1;

    public static final int getMaskForStealingMode(Task task) {
        return task.taskContext ? 1 : 2;
    }
}
