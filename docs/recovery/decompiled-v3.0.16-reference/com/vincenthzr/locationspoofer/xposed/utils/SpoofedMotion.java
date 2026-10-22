package com.vincenthzr.locationspoofer.xposed.utils;

import defpackage.az2;
import defpackage.p91;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SpoofedMotion {
    private final float bearing;
    private final double lat;
    private final double lng;
    private final float speed;

    public SpoofedMotion(double d, double d2, float f, float f2) {
        this.lat = d;
        this.lng = d2;
        this.bearing = f;
        this.speed = f2;
    }

    public static /* synthetic */ SpoofedMotion copy$default(SpoofedMotion spoofedMotion, double d, double d2, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = spoofedMotion.lat;
        }
        double d3 = d;
        if ((i & 2) != 0) {
            d2 = spoofedMotion.lng;
        }
        double d4 = d2;
        if ((i & 4) != 0) {
            f = spoofedMotion.bearing;
        }
        float f3 = f;
        if ((i & 8) != 0) {
            f2 = spoofedMotion.speed;
        }
        return spoofedMotion.copy(d3, d4, f3, f2);
    }

    public final double component1() {
        return this.lat;
    }

    public final double component2() {
        return this.lng;
    }

    public final float component3() {
        return this.bearing;
    }

    public final float component4() {
        return this.speed;
    }

    public final SpoofedMotion copy(double d, double d2, float f, float f2) {
        return new SpoofedMotion(d, d2, f, f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpoofedMotion)) {
            return false;
        }
        SpoofedMotion spoofedMotion = (SpoofedMotion) obj;
        return Double.compare(this.lat, spoofedMotion.lat) == 0 && Double.compare(this.lng, spoofedMotion.lng) == 0 && Float.compare(this.bearing, spoofedMotion.bearing) == 0 && Float.compare(this.speed, spoofedMotion.speed) == 0;
    }

    public final float getBearing() {
        return this.bearing;
    }

    public final double getLat() {
        return this.lat;
    }

    public final double getLng() {
        return this.lng;
    }

    public final float getSpeed() {
        return this.speed;
    }

    public int hashCode() {
        return Float.hashCode(this.speed) + az2.c(this.bearing, p91.a(this.lng, Double.hashCode(this.lat) * 31, 31), 31);
    }

    public String toString() {
        return "SpoofedMotion(lat=" + this.lat + ", lng=" + this.lng + ", bearing=" + this.bearing + ", speed=" + this.speed + ")";
    }
}
