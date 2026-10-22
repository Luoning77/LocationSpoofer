package com.vincenthzr.locationspoofer.data.db;

import defpackage.bt2;
import defpackage.ca0;
import defpackage.dh0;
import defpackage.ht2;
import defpackage.m30;
import defpackage.o51;
import defpackage.p91;
import defpackage.y81;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class LocationBluetooth {
    public static final Companion Companion = new Companion(null);
    private final String address;
    private final long locationId;
    private final int rssi;

    public /* synthetic */ LocationBluetooth(int i, long j, String str, int i2, ht2 ht2Var) {
        if (2 != (i & 2)) {
            dh0.K(i, 2, LocationBluetooth$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.locationId = (i & 1) == 0 ? 0L : j;
        this.address = str;
        if ((i & 4) == 0) {
            this.rssi = -70;
        } else {
            this.rssi = i2;
        }
    }

    public static /* synthetic */ LocationBluetooth copy$default(LocationBluetooth locationBluetooth, long j, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = locationBluetooth.locationId;
        }
        if ((i2 & 2) != 0) {
            str = locationBluetooth.address;
        }
        if ((i2 & 4) != 0) {
            i = locationBluetooth.rssi;
        }
        return locationBluetooth.copy(j, str, i);
    }

    public static final /* synthetic */ void write$Self$core_data_globalRelease(LocationBluetooth locationBluetooth, m30 m30Var, bt2 bt2Var) {
        if (m30Var.d(bt2Var) || locationBluetooth.locationId != 0) {
            m30Var.j(bt2Var, 0, locationBluetooth.locationId);
        }
        m30Var.n(bt2Var, 1, locationBluetooth.address);
        if (!m30Var.d(bt2Var) && locationBluetooth.rssi == -70) {
            return;
        }
        m30Var.i(2, locationBluetooth.rssi, bt2Var);
    }

    public final long component1() {
        return this.locationId;
    }

    public final String component2() {
        return this.address;
    }

    public final int component3() {
        return this.rssi;
    }

    public final LocationBluetooth copy(long j, String str, int i) {
        str.getClass();
        return new LocationBluetooth(j, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationBluetooth)) {
            return false;
        }
        LocationBluetooth locationBluetooth = (LocationBluetooth) obj;
        return this.locationId == locationBluetooth.locationId && o51.f(this.address, locationBluetooth.address) && this.rssi == locationBluetooth.rssi;
    }

    public final String getAddress() {
        return this.address;
    }

    public final long getLocationId() {
        return this.locationId;
    }

    public final int getRssi() {
        return this.rssi;
    }

    public int hashCode() {
        return Integer.hashCode(this.rssi) + p91.d(Long.hashCode(this.locationId) * 31, 31, this.address);
    }

    public String toString() {
        return "LocationBluetooth(locationId=" + this.locationId + ", address=" + this.address + ", rssi=" + this.rssi + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        private Companion() {
        }

        public final y81 serializer() {
            return LocationBluetooth$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }
    }

    public LocationBluetooth(long j, String str, int i) {
        str.getClass();
        this.locationId = j;
        this.address = str;
        this.rssi = i;
    }

    public /* synthetic */ LocationBluetooth(long j, String str, int i, int i2, ca0 ca0Var) {
        this((i2 & 1) != 0 ? 0L : j, str, (i2 & 4) != 0 ? -70 : i);
    }
}
