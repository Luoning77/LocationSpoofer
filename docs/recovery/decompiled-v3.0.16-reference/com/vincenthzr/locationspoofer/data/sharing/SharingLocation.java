package com.vincenthzr.locationspoofer.data.sharing;

import defpackage.az2;
import defpackage.p91;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SharingLocation {
    private final float accuracy;
    private final long elapsedNanos;
    private final double lat;
    private final double lng;
    private final boolean mock;
    private final long time;

    public SharingLocation(double d, double d2, float f, long j, long j2, boolean z) {
        this.lat = d;
        this.lng = d2;
        this.accuracy = f;
        this.time = j;
        this.elapsedNanos = j2;
        this.mock = z;
    }

    public static /* synthetic */ SharingLocation copy$default(SharingLocation sharingLocation, double d, double d2, float f, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            d = sharingLocation.lat;
        }
        double d3 = d;
        if ((i & 2) != 0) {
            d2 = sharingLocation.lng;
        }
        return sharingLocation.copy(d3, d2, (i & 4) != 0 ? sharingLocation.accuracy : f, (i & 8) != 0 ? sharingLocation.time : j, (i & 16) != 0 ? sharingLocation.elapsedNanos : j2, (i & 32) != 0 ? sharingLocation.mock : z);
    }

    public final double component1() {
        return this.lat;
    }

    public final double component2() {
        return this.lng;
    }

    public final float component3() {
        return this.accuracy;
    }

    public final long component4() {
        return this.time;
    }

    public final long component5() {
        return this.elapsedNanos;
    }

    public final boolean component6() {
        return this.mock;
    }

    public final SharingLocation copy(double d, double d2, float f, long j, long j2, boolean z) {
        return new SharingLocation(d, d2, f, j, j2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharingLocation)) {
            return false;
        }
        SharingLocation sharingLocation = (SharingLocation) obj;
        return Double.compare(this.lat, sharingLocation.lat) == 0 && Double.compare(this.lng, sharingLocation.lng) == 0 && Float.compare(this.accuracy, sharingLocation.accuracy) == 0 && this.time == sharingLocation.time && this.elapsedNanos == sharingLocation.elapsedNanos && this.mock == sharingLocation.mock;
    }

    public final float getAccuracy() {
        return this.accuracy;
    }

    public final long getElapsedNanos() {
        return this.elapsedNanos;
    }

    public final double getLat() {
        return this.lat;
    }

    public final double getLng() {
        return this.lng;
    }

    public final boolean getMock() {
        return this.mock;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return Boolean.hashCode(this.mock) + p91.c(p91.c(az2.c(this.accuracy, p91.a(this.lng, Double.hashCode(this.lat) * 31, 31), 31), 31, this.time), 31, this.elapsedNanos);
    }

    public String toString() {
        return "SharingLocation(lat=" + this.lat + ", lng=" + this.lng + ", accuracy=" + this.accuracy + ", time=" + this.time + ", elapsedNanos=" + this.elapsedNanos + ", mock=" + this.mock + ")";
    }
}
