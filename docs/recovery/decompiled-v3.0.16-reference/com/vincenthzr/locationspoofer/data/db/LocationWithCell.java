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
public final class LocationWithCell {
    public static final Companion Companion = new Companion(null);
    private final CellDevice device;
    private final LocationCell locationCell;

    public /* synthetic */ LocationWithCell(int i, LocationCell locationCell, CellDevice cellDevice, ht2 ht2Var) {
        if (3 != (i & 3)) {
            dh0.K(i, 3, LocationWithCell$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.locationCell = locationCell;
        this.device = cellDevice;
    }

    public static /* synthetic */ LocationWithCell copy$default(LocationWithCell locationWithCell, LocationCell locationCell, CellDevice cellDevice, int i, Object obj) {
        if ((i & 1) != 0) {
            locationCell = locationWithCell.locationCell;
        }
        if ((i & 2) != 0) {
            cellDevice = locationWithCell.device;
        }
        return locationWithCell.copy(locationCell, cellDevice);
    }

    public static final /* synthetic */ void write$Self$core_data_globalRelease(LocationWithCell locationWithCell, m30 m30Var, bt2 bt2Var) {
        m30Var.r(bt2Var, 0, LocationCell$$serializer.INSTANCE, locationWithCell.locationCell);
        m30Var.r(bt2Var, 1, CellDevice$$serializer.INSTANCE, locationWithCell.device);
    }

    public final LocationCell component1() {
        return this.locationCell;
    }

    public final CellDevice component2() {
        return this.device;
    }

    public final LocationWithCell copy(LocationCell locationCell, CellDevice cellDevice) {
        locationCell.getClass();
        cellDevice.getClass();
        return new LocationWithCell(locationCell, cellDevice);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationWithCell)) {
            return false;
        }
        LocationWithCell locationWithCell = (LocationWithCell) obj;
        return o51.f(this.locationCell, locationWithCell.locationCell) && o51.f(this.device, locationWithCell.device);
    }

    public final CellDevice getDevice() {
        return this.device;
    }

    public final LocationCell getLocationCell() {
        return this.locationCell;
    }

    public int hashCode() {
        return this.device.hashCode() + (this.locationCell.hashCode() * 31);
    }

    public String toString() {
        return "LocationWithCell(locationCell=" + this.locationCell + ", device=" + this.device + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        private Companion() {
        }

        public final y81 serializer() {
            return LocationWithCell$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }
    }

    public LocationWithCell(LocationCell locationCell, CellDevice cellDevice) {
        locationCell.getClass();
        cellDevice.getClass();
        this.locationCell = locationCell;
        this.device = cellDevice;
    }
}
