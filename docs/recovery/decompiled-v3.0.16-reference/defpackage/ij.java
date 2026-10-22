package defpackage;

import org.maplibre.android.maps.g;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class ij implements Comparable {
    public long e = -1;
    public g f;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.e;
        long j2 = ((ij) obj).e;
        if (j < j2) {
            return 1;
        }
        return j > j2 ? -1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof ij) && this.e == ((ij) obj).e;
    }

    public final int hashCode() {
        long j = this.e;
        return (int) (j ^ (j >>> 32));
    }
}
