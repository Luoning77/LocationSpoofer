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
public final class LocationWithBluetooth {
    public static final Companion Companion = new Companion(null);
    private final BluetoothDevice device;
    private final LocationBluetooth locationBluetooth;

    public /* synthetic */ LocationWithBluetooth(int i, LocationBluetooth locationBluetooth, BluetoothDevice bluetoothDevice, ht2 ht2Var) {
        if (3 != (i & 3)) {
            dh0.K(i, 3, LocationWithBluetooth$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.locationBluetooth = locationBluetooth;
        this.device = bluetoothDevice;
    }

    public static /* synthetic */ LocationWithBluetooth copy$default(LocationWithBluetooth locationWithBluetooth, LocationBluetooth locationBluetooth, BluetoothDevice bluetoothDevice, int i, Object obj) {
        if ((i & 1) != 0) {
            locationBluetooth = locationWithBluetooth.locationBluetooth;
        }
        if ((i & 2) != 0) {
            bluetoothDevice = locationWithBluetooth.device;
        }
        return locationWithBluetooth.copy(locationBluetooth, bluetoothDevice);
    }

    public static final /* synthetic */ void write$Self$core_data_globalRelease(LocationWithBluetooth locationWithBluetooth, m30 m30Var, bt2 bt2Var) {
        m30Var.r(bt2Var, 0, LocationBluetooth$$serializer.INSTANCE, locationWithBluetooth.locationBluetooth);
        m30Var.r(bt2Var, 1, BluetoothDevice$$serializer.INSTANCE, locationWithBluetooth.device);
    }

    public final LocationBluetooth component1() {
        return this.locationBluetooth;
    }

    public final BluetoothDevice component2() {
        return this.device;
    }

    public final LocationWithBluetooth copy(LocationBluetooth locationBluetooth, BluetoothDevice bluetoothDevice) {
        locationBluetooth.getClass();
        bluetoothDevice.getClass();
        return new LocationWithBluetooth(locationBluetooth, bluetoothDevice);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationWithBluetooth)) {
            return false;
        }
        LocationWithBluetooth locationWithBluetooth = (LocationWithBluetooth) obj;
        return o51.f(this.locationBluetooth, locationWithBluetooth.locationBluetooth) && o51.f(this.device, locationWithBluetooth.device);
    }

    public final BluetoothDevice getDevice() {
        return this.device;
    }

    public final LocationBluetooth getLocationBluetooth() {
        return this.locationBluetooth;
    }

    public int hashCode() {
        return this.device.hashCode() + (this.locationBluetooth.hashCode() * 31);
    }

    public String toString() {
        return "LocationWithBluetooth(locationBluetooth=" + this.locationBluetooth + ", device=" + this.device + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        private Companion() {
        }

        public final y81 serializer() {
            return LocationWithBluetooth$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }
    }

    public LocationWithBluetooth(LocationBluetooth locationBluetooth, BluetoothDevice bluetoothDevice) {
        locationBluetooth.getClass();
        bluetoothDevice.getClass();
        this.locationBluetooth = locationBluetooth;
        this.device = bluetoothDevice;
    }
}
