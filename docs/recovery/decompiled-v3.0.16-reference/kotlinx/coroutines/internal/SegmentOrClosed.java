package kotlinx.coroutines.internal;

import defpackage.fo;
import defpackage.o51;
import kotlinx.coroutines.internal.Segment;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SegmentOrClosed<S extends Segment<S>> {
    private final Object value;

    private /* synthetic */ SegmentOrClosed(Object obj) {
        this.value = obj;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SegmentOrClosed m92boximpl(Object obj) {
        return new SegmentOrClosed(obj);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m94equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof SegmentOrClosed) && o51.f(obj, ((SegmentOrClosed) obj2).m100unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m95equalsimpl0(Object obj, Object obj2) {
        return o51.f(obj, obj2);
    }

    /* JADX INFO: renamed from: getSegment-impl, reason: not valid java name */
    public static final S m96getSegmentimpl(Object obj) {
        if (obj != ConcurrentLinkedListKt.CLOSED) {
            obj.getClass();
            return (S) obj;
        }
        fo.n("Does not contain segment");
        return null;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m97hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: isClosed-impl, reason: not valid java name */
    public static final boolean m98isClosedimpl(Object obj) {
        return obj == ConcurrentLinkedListKt.CLOSED;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m99toStringimpl(Object obj) {
        return "SegmentOrClosed(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m94equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m97hashCodeimpl(this.value);
    }

    public String toString() {
        return m99toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m100unboximpl() {
        return this.value;
    }

    public static /* synthetic */ void getSegment$annotations() {
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <S extends Segment<S>> Object m93constructorimpl(Object obj) {
        return obj;
    }
}
