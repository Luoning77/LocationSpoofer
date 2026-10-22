package org.maplibre.android.style.layers;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class TransitionOptions {
    private long delay;
    private long duration;
    private boolean enablePlacementTransitions;

    public TransitionOptions(long j, long j2, boolean z) {
        this.duration = j;
        this.delay = j2;
        this.enablePlacementTransitions = z;
    }

    @Deprecated
    public static TransitionOptions fromTransitionOptions(long j, long j2) {
        return new TransitionOptions(j, j2, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TransitionOptions transitionOptions = (TransitionOptions) obj;
            if (this.duration == transitionOptions.duration && this.delay == transitionOptions.delay && this.enablePlacementTransitions == transitionOptions.enablePlacementTransitions) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.duration;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.delay;
        return ((i + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.enablePlacementTransitions ? 1 : 0);
    }

    public final String toString() {
        return "TransitionOptions{duration=" + this.duration + ", delay=" + this.delay + ", enablePlacementTransitions=" + this.enablePlacementTransitions + '}';
    }

    public static TransitionOptions fromTransitionOptions(long j, long j2, boolean z) {
        return new TransitionOptions(j, j2, z);
    }
}
