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
public final class LocationWifi {
    public static final Companion Companion = new Companion(null);
    private final String bssid;
    private final int level;
    private final long locationId;

    public /* synthetic */ LocationWifi(int i, long j, String str, int i2, ht2 ht2Var) {
        if (2 != (i & 2)) {
            dh0.K(i, 2, LocationWifi$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.locationId = (i & 1) == 0 ? 0L : j;
        this.bssid = str;
        if ((i & 4) == 0) {
            this.level = -60;
        } else {
            this.level = i2;
        }
    }

    public static /* synthetic */ LocationWifi copy$default(LocationWifi locationWifi, long j, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = locationWifi.locationId;
        }
        if ((i2 & 2) != 0) {
            str = locationWifi.bssid;
        }
        if ((i2 & 4) != 0) {
            i = locationWifi.level;
        }
        return locationWifi.copy(j, str, i);
    }

    public static final /* synthetic */ void write$Self$core_data_globalRelease(LocationWifi locationWifi, m30 m30Var, bt2 bt2Var) {
        if (m30Var.d(bt2Var) || locationWifi.locationId != 0) {
            m30Var.j(bt2Var, 0, locationWifi.locationId);
        }
        m30Var.n(bt2Var, 1, locationWifi.bssid);
        if (!m30Var.d(bt2Var) && locationWifi.level == -60) {
            return;
        }
        m30Var.i(2, locationWifi.level, bt2Var);
    }

    public final long component1() {
        return this.locationId;
    }

    public final String component2() {
        return this.bssid;
    }

    public final int component3() {
        return this.level;
    }

    public final LocationWifi copy(long j, String str, int i) {
        str.getClass();
        return new LocationWifi(j, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationWifi)) {
            return false;
        }
        LocationWifi locationWifi = (LocationWifi) obj;
        return this.locationId == locationWifi.locationId && o51.f(this.bssid, locationWifi.bssid) && this.level == locationWifi.level;
    }

    public final String getBssid() {
        return this.bssid;
    }

    public final int getLevel() {
        return this.level;
    }

    public final long getLocationId() {
        return this.locationId;
    }

    public int hashCode() {
        return Integer.hashCode(this.level) + p91.d(Long.hashCode(this.locationId) * 31, 31, this.bssid);
    }

    public String toString() {
        return "LocationWifi(locationId=" + this.locationId + ", bssid=" + this.bssid + ", level=" + this.level + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        private Companion() {
        }

        public final y81 serializer() {
            return LocationWifi$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }
    }

    public LocationWifi(long j, String str, int i) {
        str.getClass();
        this.locationId = j;
        this.bssid = str;
        this.level = i;
    }

    public /* synthetic */ LocationWifi(long j, String str, int i, int i2, ca0 ca0Var) {
        this((i2 & 1) != 0 ? 0L : j, str, (i2 & 4) != 0 ? -60 : i);
    }
}
