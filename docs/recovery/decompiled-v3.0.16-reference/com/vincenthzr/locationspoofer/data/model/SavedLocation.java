package com.vincenthzr.locationspoofer.data.model;

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
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SavedLocation {
    public static final Companion Companion = new Companion(null);
    private final String bluetoothJson;
    private final String cellJson;
    private final double lat;
    private final double lng;
    private final String name;
    private final Long sourceLocationId;
    private final String sourceLocationSyncId;
    private final String syncId;
    private final String wifiJson;

    public /* synthetic */ SavedLocation(int i, String str, double d, double d2, String str2, String str3, String str4, Long l, String str5, String str6, ht2 ht2Var) {
        if (7 != (i & 7)) {
            dh0.K(i, 7, SavedLocation$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.name = str;
        this.lat = d;
        this.lng = d2;
        if ((i & 8) == 0) {
            this.wifiJson = "[]";
        } else {
            this.wifiJson = str2;
        }
        if ((i & 16) == 0) {
            this.cellJson = "[]";
        } else {
            this.cellJson = str3;
        }
        if ((i & 32) == 0) {
            this.bluetoothJson = "[]";
        } else {
            this.bluetoothJson = str4;
        }
        if ((i & 64) == 0) {
            this.sourceLocationId = null;
        } else {
            this.sourceLocationId = l;
        }
        if ((i & WorkQueueKt.BUFFER_CAPACITY) == 0) {
            String string = UUID.randomUUID().toString();
            string.getClass();
            this.syncId = string;
        } else {
            this.syncId = str5;
        }
        if ((i & 256) == 0) {
            this.sourceLocationSyncId = null;
        } else {
            this.sourceLocationSyncId = str6;
        }
    }

    public static /* synthetic */ SavedLocation copy$default(SavedLocation savedLocation, String str, double d, double d2, String str2, String str3, String str4, Long l, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savedLocation.name;
        }
        if ((i & 2) != 0) {
            d = savedLocation.lat;
        }
        if ((i & 4) != 0) {
            d2 = savedLocation.lng;
        }
        if ((i & 8) != 0) {
            str2 = savedLocation.wifiJson;
        }
        if ((i & 16) != 0) {
            str3 = savedLocation.cellJson;
        }
        if ((i & 32) != 0) {
            str4 = savedLocation.bluetoothJson;
        }
        if ((i & 64) != 0) {
            l = savedLocation.sourceLocationId;
        }
        if ((i & WorkQueueKt.BUFFER_CAPACITY) != 0) {
            str5 = savedLocation.syncId;
        }
        if ((i & 256) != 0) {
            str6 = savedLocation.sourceLocationSyncId;
        }
        String str7 = str5;
        String str8 = str6;
        double d3 = d2;
        return savedLocation.copy(str, d, d3, str2, str3, str4, l, str7, str8);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    public static final /* synthetic */ void write$Self$core_data_globalRelease(SavedLocation savedLocation, m30 m30Var, bt2 bt2Var) {
        m30Var.n(bt2Var, 0, savedLocation.name);
        m30Var.t(bt2Var, 1, savedLocation.lat);
        m30Var.t(bt2Var, 2, savedLocation.lng);
        if (m30Var.d(bt2Var) || !o51.f(savedLocation.wifiJson, "[]")) {
            m30Var.n(bt2Var, 3, savedLocation.wifiJson);
        }
        if (m30Var.d(bt2Var) || !o51.f(savedLocation.cellJson, "[]")) {
            m30Var.n(bt2Var, 4, savedLocation.cellJson);
        }
        if (m30Var.d(bt2Var) || !o51.f(savedLocation.bluetoothJson, "[]")) {
            m30Var.n(bt2Var, 5, savedLocation.bluetoothJson);
        }
        if (m30Var.d(bt2Var) || savedLocation.sourceLocationId != null) {
            m30Var.u(bt2Var, 6, xj1.a, savedLocation.sourceLocationId);
        }
        if (m30Var.d(bt2Var)) {
            m30Var.n(bt2Var, 7, savedLocation.syncId);
        } else {
            String str = savedLocation.syncId;
            String string = UUID.randomUUID().toString();
            string.getClass();
            if (!o51.f(str, string)) {
                m30Var.n(bt2Var, 7, savedLocation.syncId);
            }
        }
        if (!m30Var.d(bt2Var) && savedLocation.sourceLocationSyncId == null) {
            return;
        }
        m30Var.u(bt2Var, 8, k13.a, savedLocation.sourceLocationSyncId);
    }

    public final String component1() {
        return this.name;
    }

    public final double component2() {
        return this.lat;
    }

    public final double component3() {
        return this.lng;
    }

    public final String component4() {
        return this.wifiJson;
    }

    public final String component5() {
        return this.cellJson;
    }

    public final String component6() {
        return this.bluetoothJson;
    }

    public final Long component7() {
        return this.sourceLocationId;
    }

    public final String component8() {
        return this.syncId;
    }

    public final String component9() {
        return this.sourceLocationSyncId;
    }

    public final SavedLocation copy(String str, double d, double d2, String str2, String str3, String str4, Long l, String str5, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        return new SavedLocation(str, d, d2, str2, str3, str4, l, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedLocation)) {
            return false;
        }
        SavedLocation savedLocation = (SavedLocation) obj;
        return o51.f(this.name, savedLocation.name) && Double.compare(this.lat, savedLocation.lat) == 0 && Double.compare(this.lng, savedLocation.lng) == 0 && o51.f(this.wifiJson, savedLocation.wifiJson) && o51.f(this.cellJson, savedLocation.cellJson) && o51.f(this.bluetoothJson, savedLocation.bluetoothJson) && o51.f(this.sourceLocationId, savedLocation.sourceLocationId) && o51.f(this.syncId, savedLocation.syncId) && o51.f(this.sourceLocationSyncId, savedLocation.sourceLocationSyncId);
    }

    public final String getBluetoothJson() {
        return this.bluetoothJson;
    }

    public final String getCellJson() {
        return this.cellJson;
    }

    public final double getLat() {
        return this.lat;
    }

    public final double getLng() {
        return this.lng;
    }

    public final String getName() {
        return this.name;
    }

    public final Long getSourceLocationId() {
        return this.sourceLocationId;
    }

    public final String getSourceLocationSyncId() {
        return this.sourceLocationSyncId;
    }

    public final String getSyncId() {
        return this.syncId;
    }

    public final String getWifiJson() {
        return this.wifiJson;
    }

    public int hashCode() {
        int iD = p91.d(p91.d(p91.d(p91.a(this.lng, p91.a(this.lat, this.name.hashCode() * 31, 31), 31), 31, this.wifiJson), 31, this.cellJson), 31, this.bluetoothJson);
        Long l = this.sourceLocationId;
        int iD2 = p91.d((iD + (l == null ? 0 : l.hashCode())) * 31, 31, this.syncId);
        String str = this.sourceLocationSyncId;
        return iD2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.name;
        double d = this.lat;
        double d2 = this.lng;
        String str2 = this.wifiJson;
        String str3 = this.cellJson;
        String str4 = this.bluetoothJson;
        Long l = this.sourceLocationId;
        String str5 = this.syncId;
        String str6 = this.sourceLocationSyncId;
        StringBuilder sb = new StringBuilder("SavedLocation(name=");
        sb.append(str);
        sb.append(", lat=");
        sb.append(d);
        az2.x(sb, ", lng=", d2, ", wifiJson=");
        p91.y(sb, str2, ", cellJson=", str3, ", bluetoothJson=");
        sb.append(str4);
        sb.append(", sourceLocationId=");
        sb.append(l);
        sb.append(", syncId=");
        sb.append(str5);
        sb.append(", sourceLocationSyncId=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        private Companion() {
        }

        public final y81 serializer() {
            return SavedLocation$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }
    }

    public SavedLocation(String str, double d, double d2, String str2, String str3, String str4, Long l, String str5, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.name = str;
        this.lat = d;
        this.lng = d2;
        this.wifiJson = str2;
        this.cellJson = str3;
        this.bluetoothJson = str4;
        this.sourceLocationId = l;
        this.syncId = str5;
        this.sourceLocationSyncId = str6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SavedLocation(String str, double d, double d2, String str2, String str3, String str4, Long l, String str5, String str6, int i, ca0 ca0Var) {
        str2 = (i & 8) != 0 ? "[]" : str2;
        str3 = (i & 16) != 0 ? "[]" : str3;
        str4 = (i & 32) != 0 ? "[]" : str4;
        l = (i & 64) != 0 ? null : l;
        if ((i & WorkQueueKt.BUFFER_CAPACITY) != 0) {
            str5 = UUID.randomUUID().toString();
            str5.getClass();
        }
        this(str, d, d2, str2, str3, str4, l, str5, (i & 256) != 0 ? null : str6);
    }
}
