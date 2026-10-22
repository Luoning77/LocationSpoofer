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
public final class LocationCell {
    public static final Companion Companion = new Companion(null);
    private final String cellKey;
    private final int dbm;
    private final boolean isRegistered;
    private final long locationId;

    public /* synthetic */ LocationCell(int i, long j, String str, int i2, boolean z, ht2 ht2Var) {
        if (2 != (i & 2)) {
            dh0.K(i, 2, LocationCell$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.locationId = (i & 1) == 0 ? 0L : j;
        this.cellKey = str;
        if ((i & 4) == 0) {
            this.dbm = -80;
        } else {
            this.dbm = i2;
        }
        if ((i & 8) == 0) {
            this.isRegistered = true;
        } else {
            this.isRegistered = z;
        }
    }

    public static /* synthetic */ LocationCell copy$default(LocationCell locationCell, long j, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = locationCell.locationId;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            str = locationCell.cellKey;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            i = locationCell.dbm;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = locationCell.isRegistered;
        }
        return locationCell.copy(j2, str2, i3, z);
    }

    public static final /* synthetic */ void write$Self$core_data_globalRelease(LocationCell locationCell, m30 m30Var, bt2 bt2Var) {
        if (m30Var.d(bt2Var) || locationCell.locationId != 0) {
            m30Var.j(bt2Var, 0, locationCell.locationId);
        }
        m30Var.n(bt2Var, 1, locationCell.cellKey);
        if (m30Var.d(bt2Var) || locationCell.dbm != -80) {
            m30Var.i(2, locationCell.dbm, bt2Var);
        }
        if (!m30Var.d(bt2Var) && locationCell.isRegistered) {
            return;
        }
        m30Var.o(bt2Var, 3, locationCell.isRegistered);
    }

    public final long component1() {
        return this.locationId;
    }

    public final String component2() {
        return this.cellKey;
    }

    public final int component3() {
        return this.dbm;
    }

    public final boolean component4() {
        return this.isRegistered;
    }

    public final LocationCell copy(long j, String str, int i, boolean z) {
        str.getClass();
        return new LocationCell(j, str, i, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationCell)) {
            return false;
        }
        LocationCell locationCell = (LocationCell) obj;
        return this.locationId == locationCell.locationId && o51.f(this.cellKey, locationCell.cellKey) && this.dbm == locationCell.dbm && this.isRegistered == locationCell.isRegistered;
    }

    public final String getCellKey() {
        return this.cellKey;
    }

    public final int getDbm() {
        return this.dbm;
    }

    public final long getLocationId() {
        return this.locationId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isRegistered) + p91.b(this.dbm, p91.d(Long.hashCode(this.locationId) * 31, 31, this.cellKey), 31);
    }

    public final boolean isRegistered() {
        return this.isRegistered;
    }

    public String toString() {
        return "LocationCell(locationId=" + this.locationId + ", cellKey=" + this.cellKey + ", dbm=" + this.dbm + ", isRegistered=" + this.isRegistered + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        private Companion() {
        }

        public final y81 serializer() {
            return LocationCell$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }
    }

    public LocationCell(long j, String str, int i, boolean z) {
        str.getClass();
        this.locationId = j;
        this.cellKey = str;
        this.dbm = i;
        this.isRegistered = z;
    }

    public /* synthetic */ LocationCell(long j, String str, int i, boolean z, int i2, ca0 ca0Var) {
        this((i2 & 1) != 0 ? 0L : j, str, (i2 & 4) != 0 ? -80 : i, (i2 & 8) != 0 ? true : z);
    }
}
