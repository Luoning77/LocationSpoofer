package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class yd0 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yd0) && td0.b(10.0f, 10.0f) && td0.b(40.0f, 40.0f) && td0.b(10.0f, 10.0f) && td0.b(40.0f, 40.0f);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + az2.c(40.0f, az2.c(10.0f, az2.c(40.0f, Float.hashCode(10.0f) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) td0.c(10.0f)) + ", top=" + ((Object) td0.c(40.0f)) + ", end=" + ((Object) td0.c(10.0f)) + ", bottom=" + ((Object) td0.c(40.0f)) + ", isLayoutDirectionAware=true)";
    }
}
