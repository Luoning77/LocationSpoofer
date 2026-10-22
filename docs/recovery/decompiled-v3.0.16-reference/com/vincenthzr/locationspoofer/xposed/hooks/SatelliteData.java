package com.vincenthzr.locationspoofer.xposed.hooks;

import defpackage.az2;
import defpackage.p91;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SatelliteData {
    private final float azimuth;
    private final float cn0;
    private final float elevation;
    private final int svid;
    private final int type;
    private final boolean usedInFix;

    public SatelliteData(int i, int i2, float f, float f2, float f3, boolean z) {
        this.svid = i;
        this.type = i2;
        this.elevation = f;
        this.azimuth = f2;
        this.cn0 = f3;
        this.usedInFix = z;
    }

    public static /* synthetic */ SatelliteData copy$default(SatelliteData satelliteData, int i, int i2, float f, float f2, float f3, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = satelliteData.svid;
        }
        if ((i3 & 2) != 0) {
            i2 = satelliteData.type;
        }
        if ((i3 & 4) != 0) {
            f = satelliteData.elevation;
        }
        if ((i3 & 8) != 0) {
            f2 = satelliteData.azimuth;
        }
        if ((i3 & 16) != 0) {
            f3 = satelliteData.cn0;
        }
        if ((i3 & 32) != 0) {
            z = satelliteData.usedInFix;
        }
        float f4 = f3;
        boolean z2 = z;
        return satelliteData.copy(i, i2, f, f2, f4, z2);
    }

    public final int component1() {
        return this.svid;
    }

    public final int component2() {
        return this.type;
    }

    public final float component3() {
        return this.elevation;
    }

    public final float component4() {
        return this.azimuth;
    }

    public final float component5() {
        return this.cn0;
    }

    public final boolean component6() {
        return this.usedInFix;
    }

    public final SatelliteData copy(int i, int i2, float f, float f2, float f3, boolean z) {
        return new SatelliteData(i, i2, f, f2, f3, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SatelliteData)) {
            return false;
        }
        SatelliteData satelliteData = (SatelliteData) obj;
        return this.svid == satelliteData.svid && this.type == satelliteData.type && Float.compare(this.elevation, satelliteData.elevation) == 0 && Float.compare(this.azimuth, satelliteData.azimuth) == 0 && Float.compare(this.cn0, satelliteData.cn0) == 0 && this.usedInFix == satelliteData.usedInFix;
    }

    public final float getAzimuth() {
        return this.azimuth;
    }

    public final float getCn0() {
        return this.cn0;
    }

    public final float getElevation() {
        return this.elevation;
    }

    public final int getSvid() {
        return this.svid;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean getUsedInFix() {
        return this.usedInFix;
    }

    public int hashCode() {
        return Boolean.hashCode(this.usedInFix) + az2.c(this.cn0, az2.c(this.azimuth, az2.c(this.elevation, p91.b(this.type, Integer.hashCode(this.svid) * 31, 31), 31), 31), 31);
    }

    public String toString() {
        int i = this.svid;
        int i2 = this.type;
        float f = this.elevation;
        float f2 = this.azimuth;
        float f3 = this.cn0;
        boolean z = this.usedInFix;
        StringBuilder sbS = p91.s("SatelliteData(svid=", ", type=", i, i2, ", elevation=");
        sbS.append(f);
        sbS.append(", azimuth=");
        sbS.append(f2);
        sbS.append(", cn0=");
        sbS.append(f3);
        sbS.append(", usedInFix=");
        sbS.append(z);
        sbS.append(")");
        return sbS.toString();
    }
}
