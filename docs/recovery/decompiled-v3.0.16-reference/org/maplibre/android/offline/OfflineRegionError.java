package org.maplibre.android.offline;

import defpackage.az2;
import defpackage.o51;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class OfflineRegionError {
    public final String a;
    public final String b;

    private OfflineRegionError(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !OfflineRegionError.class.equals(obj.getClass())) {
            return false;
        }
        OfflineRegionError offlineRegionError = (OfflineRegionError) obj;
        if (o51.f(this.a, offlineRegionError.a)) {
            return o51.f(this.b, offlineRegionError.b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return az2.l("OfflineRegionError{reason='", this.a, "', message='", this.b, "'}");
    }
}
