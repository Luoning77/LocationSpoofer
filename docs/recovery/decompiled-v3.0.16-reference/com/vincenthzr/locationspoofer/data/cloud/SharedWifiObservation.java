package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.az2;
import defpackage.o51;
import defpackage.p91;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SharedWifiObservation {
    private final String bssid;
    private final String capabilities;
    private final int frequency;
    private final int level;
    private final String ssid;

    public SharedWifiObservation(String str, String str2, int i, int i2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.bssid = str;
        this.ssid = str2;
        this.frequency = i;
        this.level = i2;
        this.capabilities = str3;
    }

    public static /* synthetic */ SharedWifiObservation copy$default(SharedWifiObservation sharedWifiObservation, String str, String str2, int i, int i2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = sharedWifiObservation.bssid;
        }
        if ((i3 & 2) != 0) {
            str2 = sharedWifiObservation.ssid;
        }
        if ((i3 & 4) != 0) {
            i = sharedWifiObservation.frequency;
        }
        if ((i3 & 8) != 0) {
            i2 = sharedWifiObservation.level;
        }
        if ((i3 & 16) != 0) {
            str3 = sharedWifiObservation.capabilities;
        }
        String str4 = str3;
        int i4 = i;
        return sharedWifiObservation.copy(str, str2, i4, i2, str4);
    }

    public final String component1() {
        return this.bssid;
    }

    public final String component2() {
        return this.ssid;
    }

    public final int component3() {
        return this.frequency;
    }

    public final int component4() {
        return this.level;
    }

    public final String component5() {
        return this.capabilities;
    }

    public final SharedWifiObservation copy(String str, String str2, int i, int i2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new SharedWifiObservation(str, str2, i, i2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedWifiObservation)) {
            return false;
        }
        SharedWifiObservation sharedWifiObservation = (SharedWifiObservation) obj;
        return o51.f(this.bssid, sharedWifiObservation.bssid) && o51.f(this.ssid, sharedWifiObservation.ssid) && this.frequency == sharedWifiObservation.frequency && this.level == sharedWifiObservation.level && o51.f(this.capabilities, sharedWifiObservation.capabilities);
    }

    public final String getBssid() {
        return this.bssid;
    }

    public final String getCapabilities() {
        return this.capabilities;
    }

    public final int getFrequency() {
        return this.frequency;
    }

    public final int getLevel() {
        return this.level;
    }

    public final String getSsid() {
        return this.ssid;
    }

    public int hashCode() {
        return this.capabilities.hashCode() + p91.b(this.level, p91.b(this.frequency, p91.d(this.bssid.hashCode() * 31, 31, this.ssid), 31), 31);
    }

    public String toString() {
        String str = this.bssid;
        String str2 = this.ssid;
        int i = this.frequency;
        int i2 = this.level;
        String str3 = this.capabilities;
        StringBuilder sbT = p91.t("SharedWifiObservation(bssid=", str, ", ssid=", str2, ", frequency=");
        az2.w(sbT, i, ", level=", i2, ", capabilities=");
        return az2.p(sbT, str3, ")");
    }
}
