package com.vincenthzr.locationspoofer.data.sharing;

import defpackage.o51;
import defpackage.p91;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SharedBluetooth {
    private final String address;
    private final String name;
    private final int rssi;

    public SharedBluetooth(String str, String str2, int i) {
        str.getClass();
        str2.getClass();
        this.address = str;
        this.name = str2;
        this.rssi = i;
    }

    public static /* synthetic */ SharedBluetooth copy$default(SharedBluetooth sharedBluetooth, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sharedBluetooth.address;
        }
        if ((i2 & 2) != 0) {
            str2 = sharedBluetooth.name;
        }
        if ((i2 & 4) != 0) {
            i = sharedBluetooth.rssi;
        }
        return sharedBluetooth.copy(str, str2, i);
    }

    public final String component1() {
        return this.address;
    }

    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.rssi;
    }

    public final SharedBluetooth copy(String str, String str2, int i) {
        str.getClass();
        str2.getClass();
        return new SharedBluetooth(str, str2, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedBluetooth)) {
            return false;
        }
        SharedBluetooth sharedBluetooth = (SharedBluetooth) obj;
        return o51.f(this.address, sharedBluetooth.address) && o51.f(this.name, sharedBluetooth.name) && this.rssi == sharedBluetooth.rssi;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getName() {
        return this.name;
    }

    public final int getRssi() {
        return this.rssi;
    }

    public int hashCode() {
        return Integer.hashCode(this.rssi) + p91.d(this.address.hashCode() * 31, 31, this.name);
    }

    public String toString() {
        String str = this.address;
        String str2 = this.name;
        int i = this.rssi;
        StringBuilder sbT = p91.t("SharedBluetooth(address=", str, ", name=", str2, ", rssi=");
        sbT.append(i);
        sbT.append(")");
        return sbT.toString();
    }
}
