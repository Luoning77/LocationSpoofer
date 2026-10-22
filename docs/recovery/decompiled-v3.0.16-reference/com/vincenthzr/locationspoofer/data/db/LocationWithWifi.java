package com.vincenthzr.locationspoofer.data.db;

import defpackage.bt2;
import defpackage.ca0;
import defpackage.dh0;
import defpackage.ht2;
import defpackage.m30;
import defpackage.o51;
import defpackage.y81;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class LocationWithWifi {
    public static final Companion Companion = new Companion(null);
    private final WifiDevice device;
    private final LocationWifi locationWifi;

    public /* synthetic */ LocationWithWifi(int i, LocationWifi locationWifi, WifiDevice wifiDevice, ht2 ht2Var) {
        if (3 != (i & 3)) {
            dh0.K(i, 3, LocationWithWifi$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.locationWifi = locationWifi;
        this.device = wifiDevice;
    }

    public static /* synthetic */ LocationWithWifi copy$default(LocationWithWifi locationWithWifi, LocationWifi locationWifi, WifiDevice wifiDevice, int i, Object obj) {
        if ((i & 1) != 0) {
            locationWifi = locationWithWifi.locationWifi;
        }
        if ((i & 2) != 0) {
            wifiDevice = locationWithWifi.device;
        }
        return locationWithWifi.copy(locationWifi, wifiDevice);
    }

    public static final /* synthetic */ void write$Self$core_data_globalRelease(LocationWithWifi locationWithWifi, m30 m30Var, bt2 bt2Var) {
        m30Var.r(bt2Var, 0, LocationWifi$$serializer.INSTANCE, locationWithWifi.locationWifi);
        m30Var.r(bt2Var, 1, WifiDevice$$serializer.INSTANCE, locationWithWifi.device);
    }

    public final LocationWifi component1() {
        return this.locationWifi;
    }

    public final WifiDevice component2() {
        return this.device;
    }

    public final LocationWithWifi copy(LocationWifi locationWifi, WifiDevice wifiDevice) {
        locationWifi.getClass();
        wifiDevice.getClass();
        return new LocationWithWifi(locationWifi, wifiDevice);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationWithWifi)) {
            return false;
        }
        LocationWithWifi locationWithWifi = (LocationWithWifi) obj;
        return o51.f(this.locationWifi, locationWithWifi.locationWifi) && o51.f(this.device, locationWithWifi.device);
    }

    public final WifiDevice getDevice() {
        return this.device;
    }

    public final LocationWifi getLocationWifi() {
        return this.locationWifi;
    }

    public int hashCode() {
        return this.device.hashCode() + (this.locationWifi.hashCode() * 31);
    }

    public String toString() {
        return "LocationWithWifi(locationWifi=" + this.locationWifi + ", device=" + this.device + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        private Companion() {
        }

        public final y81 serializer() {
            return LocationWithWifi$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }
    }

    public LocationWithWifi(LocationWifi locationWifi, WifiDevice wifiDevice) {
        locationWifi.getClass();
        wifiDevice.getClass();
        this.locationWifi = locationWifi;
        this.device = wifiDevice;
    }
}
