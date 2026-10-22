package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.o51;
import defpackage.p91;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CloudCompanionDevice {
    private final Long activeUntil;
    private final long boundAt;
    private final String deviceId;
    private final String deviceName;

    public CloudCompanionDevice(String str, String str2, long j, Long l) {
        str.getClass();
        str2.getClass();
        this.deviceId = str;
        this.deviceName = str2;
        this.boundAt = j;
        this.activeUntil = l;
    }

    public static /* synthetic */ CloudCompanionDevice copy$default(CloudCompanionDevice cloudCompanionDevice, String str, String str2, long j, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cloudCompanionDevice.deviceId;
        }
        if ((i & 2) != 0) {
            str2 = cloudCompanionDevice.deviceName;
        }
        if ((i & 4) != 0) {
            j = cloudCompanionDevice.boundAt;
        }
        if ((i & 8) != 0) {
            l = cloudCompanionDevice.activeUntil;
        }
        Long l2 = l;
        return cloudCompanionDevice.copy(str, str2, j, l2);
    }

    public final String component1() {
        return this.deviceId;
    }

    public final String component2() {
        return this.deviceName;
    }

    public final long component3() {
        return this.boundAt;
    }

    public final Long component4() {
        return this.activeUntil;
    }

    public final CloudCompanionDevice copy(String str, String str2, long j, Long l) {
        str.getClass();
        str2.getClass();
        return new CloudCompanionDevice(str, str2, j, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloudCompanionDevice)) {
            return false;
        }
        CloudCompanionDevice cloudCompanionDevice = (CloudCompanionDevice) obj;
        return o51.f(this.deviceId, cloudCompanionDevice.deviceId) && o51.f(this.deviceName, cloudCompanionDevice.deviceName) && this.boundAt == cloudCompanionDevice.boundAt && o51.f(this.activeUntil, cloudCompanionDevice.activeUntil);
    }

    public final Long getActiveUntil() {
        return this.activeUntil;
    }

    public final long getBoundAt() {
        return this.boundAt;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getDeviceName() {
        return this.deviceName;
    }

    public int hashCode() {
        int iC = p91.c(p91.d(this.deviceId.hashCode() * 31, 31, this.deviceName), 31, this.boundAt);
        Long l = this.activeUntil;
        return iC + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        String str = this.deviceId;
        String str2 = this.deviceName;
        long j = this.boundAt;
        Long l = this.activeUntil;
        StringBuilder sbT = p91.t("CloudCompanionDevice(deviceId=", str, ", deviceName=", str2, ", boundAt=");
        sbT.append(j);
        sbT.append(", activeUntil=");
        sbT.append(l);
        sbT.append(")");
        return sbT.toString();
    }
}
