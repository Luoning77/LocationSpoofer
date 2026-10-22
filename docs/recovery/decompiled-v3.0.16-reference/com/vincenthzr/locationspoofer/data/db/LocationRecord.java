package com.vincenthzr.locationspoofer.data.db;

import defpackage.az2;
import defpackage.bt2;
import defpackage.ca0;
import defpackage.dh0;
import defpackage.ht2;
import defpackage.k13;
import defpackage.m30;
import defpackage.o51;
import defpackage.p91;
import defpackage.xj1;
import defpackage.y81;
import java.util.UUID;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class LocationRecord {
    public static final Companion Companion = new Companion(null);
    private final Long collectionRouteId;
    private final long id;
    private final double lat;
    private final double lng;
    private final String placeName;
    private final String remark;
    private final String selectedBluetoothAddress;
    private final String selectedCellKey;
    private final String selectedWifiBssid;
    private final String syncId;
    private final long timestamp;

    public /* synthetic */ LocationRecord(int i, long j, double d, double d2, long j2, String str, String str2, String str3, String str4, String str5, Long l, String str6, ht2 ht2Var) {
        String string;
        if (6 != (i & 6)) {
            dh0.K(i, 6, LocationRecord$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = (i & 1) == 0 ? 0L : j;
        this.lat = d;
        this.lng = d2;
        if ((i & 8) == 0) {
            this.timestamp = System.currentTimeMillis();
        } else {
            this.timestamp = j2;
        }
        if ((i & 16) == 0) {
            this.placeName = "";
        } else {
            this.placeName = str;
        }
        if ((i & 32) == 0) {
            this.remark = "";
        } else {
            this.remark = str2;
        }
        if ((i & 64) == 0) {
            this.selectedWifiBssid = null;
        } else {
            this.selectedWifiBssid = str3;
        }
        if ((i & WorkQueueKt.BUFFER_CAPACITY) == 0) {
            this.selectedBluetoothAddress = null;
        } else {
            this.selectedBluetoothAddress = str4;
        }
        if ((i & 256) == 0) {
            this.selectedCellKey = null;
        } else {
            this.selectedCellKey = str5;
        }
        if ((i & 512) == 0) {
            this.collectionRouteId = null;
        } else {
            this.collectionRouteId = l;
        }
        if ((i & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0) {
            string = UUID.randomUUID().toString();
            string.getClass();
        } else {
            string = str6;
        }
        this.syncId = string;
    }

    public static final /* synthetic */ void write$Self$core_data_globalRelease(LocationRecord locationRecord, m30 m30Var, bt2 bt2Var) {
        if (m30Var.d(bt2Var) || locationRecord.id != 0) {
            m30Var.j(bt2Var, 0, locationRecord.id);
        }
        m30Var.t(bt2Var, 1, locationRecord.lat);
        m30Var.t(bt2Var, 2, locationRecord.lng);
        if (m30Var.d(bt2Var) || locationRecord.timestamp != System.currentTimeMillis()) {
            m30Var.j(bt2Var, 3, locationRecord.timestamp);
        }
        if (m30Var.d(bt2Var) || !o51.f(locationRecord.placeName, "")) {
            m30Var.n(bt2Var, 4, locationRecord.placeName);
        }
        if (m30Var.d(bt2Var) || !o51.f(locationRecord.remark, "")) {
            m30Var.n(bt2Var, 5, locationRecord.remark);
        }
        if (m30Var.d(bt2Var) || locationRecord.selectedWifiBssid != null) {
            m30Var.u(bt2Var, 6, k13.a, locationRecord.selectedWifiBssid);
        }
        if (m30Var.d(bt2Var) || locationRecord.selectedBluetoothAddress != null) {
            m30Var.u(bt2Var, 7, k13.a, locationRecord.selectedBluetoothAddress);
        }
        if (m30Var.d(bt2Var) || locationRecord.selectedCellKey != null) {
            m30Var.u(bt2Var, 8, k13.a, locationRecord.selectedCellKey);
        }
        if (m30Var.d(bt2Var) || locationRecord.collectionRouteId != null) {
            m30Var.u(bt2Var, 9, xj1.a, locationRecord.collectionRouteId);
        }
        if (!m30Var.d(bt2Var)) {
            String str = locationRecord.syncId;
            String string = UUID.randomUUID().toString();
            string.getClass();
            if (o51.f(str, string)) {
                return;
            }
        }
        m30Var.n(bt2Var, 10, locationRecord.syncId);
    }

    public final long component1() {
        return this.id;
    }

    public final Long component10() {
        return this.collectionRouteId;
    }

    public final String component11() {
        return this.syncId;
    }

    public final double component2() {
        return this.lat;
    }

    public final double component3() {
        return this.lng;
    }

    public final long component4() {
        return this.timestamp;
    }

    public final String component5() {
        return this.placeName;
    }

    public final String component6() {
        return this.remark;
    }

    public final String component7() {
        return this.selectedWifiBssid;
    }

    public final String component8() {
        return this.selectedBluetoothAddress;
    }

    public final String component9() {
        return this.selectedCellKey;
    }

    public final LocationRecord copy(long j, double d, double d2, long j2, String str, String str2, String str3, String str4, String str5, Long l, String str6) {
        str.getClass();
        str2.getClass();
        str6.getClass();
        return new LocationRecord(j, d, d2, j2, str, str2, str3, str4, str5, l, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRecord)) {
            return false;
        }
        LocationRecord locationRecord = (LocationRecord) obj;
        return this.id == locationRecord.id && Double.compare(this.lat, locationRecord.lat) == 0 && Double.compare(this.lng, locationRecord.lng) == 0 && this.timestamp == locationRecord.timestamp && o51.f(this.placeName, locationRecord.placeName) && o51.f(this.remark, locationRecord.remark) && o51.f(this.selectedWifiBssid, locationRecord.selectedWifiBssid) && o51.f(this.selectedBluetoothAddress, locationRecord.selectedBluetoothAddress) && o51.f(this.selectedCellKey, locationRecord.selectedCellKey) && o51.f(this.collectionRouteId, locationRecord.collectionRouteId) && o51.f(this.syncId, locationRecord.syncId);
    }

    public final Long getCollectionRouteId() {
        return this.collectionRouteId;
    }

    public final long getId() {
        return this.id;
    }

    public final double getLat() {
        return this.lat;
    }

    public final double getLng() {
        return this.lng;
    }

    public final String getPlaceName() {
        return this.placeName;
    }

    public final String getRemark() {
        return this.remark;
    }

    public final String getSelectedBluetoothAddress() {
        return this.selectedBluetoothAddress;
    }

    public final String getSelectedCellKey() {
        return this.selectedCellKey;
    }

    public final String getSelectedWifiBssid() {
        return this.selectedWifiBssid;
    }

    public final String getSyncId() {
        return this.syncId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iD = p91.d(p91.d(p91.c(p91.a(this.lng, p91.a(this.lat, Long.hashCode(this.id) * 31, 31), 31), 31, this.timestamp), 31, this.placeName), 31, this.remark);
        String str = this.selectedWifiBssid;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.selectedBluetoothAddress;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.selectedCellKey;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.collectionRouteId;
        return this.syncId.hashCode() + ((iHashCode3 + (l != null ? l.hashCode() : 0)) * 31);
    }

    public String toString() {
        long j = this.id;
        double d = this.lat;
        double d2 = this.lng;
        long j2 = this.timestamp;
        String str = this.placeName;
        String str2 = this.remark;
        String str3 = this.selectedWifiBssid;
        String str4 = this.selectedBluetoothAddress;
        String str5 = this.selectedCellKey;
        Long l = this.collectionRouteId;
        String str6 = this.syncId;
        StringBuilder sb = new StringBuilder("LocationRecord(id=");
        sb.append(j);
        sb.append(", lat=");
        sb.append(d);
        az2.x(sb, ", lng=", d2, ", timestamp=");
        sb.append(j2);
        sb.append(", placeName=");
        sb.append(str);
        p91.y(sb, ", remark=", str2, ", selectedWifiBssid=", str3);
        p91.y(sb, ", selectedBluetoothAddress=", str4, ", selectedCellKey=", str5);
        sb.append(", collectionRouteId=");
        sb.append(l);
        sb.append(", syncId=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        private Companion() {
        }

        public final y81 serializer() {
            return LocationRecord$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }
    }

    public LocationRecord(long j, double d, double d2, long j2, String str, String str2, String str3, String str4, String str5, Long l, String str6) {
        str.getClass();
        str2.getClass();
        str6.getClass();
        this.id = j;
        this.lat = d;
        this.lng = d2;
        this.timestamp = j2;
        this.placeName = str;
        this.remark = str2;
        this.selectedWifiBssid = str3;
        this.selectedBluetoothAddress = str4;
        this.selectedCellKey = str5;
        this.collectionRouteId = l;
        this.syncId = str6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LocationRecord(long j, double d, double d2, long j2, String str, String str2, String str3, String str4, String str5, Long l, String str6, int i, ca0 ca0Var) {
        String str7;
        long j3 = (i & 1) != 0 ? 0L : j;
        long jCurrentTimeMillis = (i & 8) != 0 ? System.currentTimeMillis() : j2;
        String str8 = (i & 16) != 0 ? "" : str;
        String str9 = (i & 32) != 0 ? "" : str2;
        String str10 = (i & 64) != 0 ? null : str3;
        String str11 = (i & WorkQueueKt.BUFFER_CAPACITY) != 0 ? null : str4;
        String str12 = (i & 256) != 0 ? null : str5;
        Long l2 = (i & 512) != 0 ? null : l;
        if ((i & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
            String string = UUID.randomUUID().toString();
            string.getClass();
            str7 = string;
        } else {
            str7 = str6;
        }
        this(j3, d, d2, jCurrentTimeMillis, str8, str9, str10, str11, str12, l2, str7);
    }
}
