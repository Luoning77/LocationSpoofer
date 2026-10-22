package com.vincenthzr.locationspoofer.data.db;

import defpackage.az2;
import defpackage.bt2;
import defpackage.ca0;
import defpackage.ht2;
import defpackage.m30;
import defpackage.n41;
import defpackage.o51;
import defpackage.p91;
import defpackage.y81;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ExportedSettings {
    public static final Companion Companion = new Companion(null);
    private final String altitude;
    private final Integer altitudeVariationM;
    private final boolean enableJitter;
    private final String mapEngine;
    private final String mapType;
    private final boolean mockBluetooth;
    private final boolean mockCell;
    private final boolean mockWifi;
    private final String satelliteCount;

    public /* synthetic */ ExportedSettings(int i, boolean z, boolean z2, boolean z3, boolean z4, String str, Integer num, String str2, String str3, String str4, ht2 ht2Var) {
        if ((i & 1) == 0) {
            this.mockWifi = true;
        } else {
            this.mockWifi = z;
        }
        if ((i & 2) == 0) {
            this.mockCell = true;
        } else {
            this.mockCell = z2;
        }
        if ((i & 4) == 0) {
            this.mockBluetooth = true;
        } else {
            this.mockBluetooth = z3;
        }
        if ((i & 8) == 0) {
            this.enableJitter = true;
        } else {
            this.enableJitter = z4;
        }
        if ((i & 16) == 0) {
            this.altitude = "";
        } else {
            this.altitude = str;
        }
        if ((i & 32) == 0) {
            this.altitudeVariationM = null;
        } else {
            this.altitudeVariationM = num;
        }
        if ((i & 64) == 0) {
            this.satelliteCount = "";
        } else {
            this.satelliteCount = str2;
        }
        if ((i & WorkQueueKt.BUFFER_CAPACITY) == 0) {
            this.mapType = "";
        } else {
            this.mapType = str3;
        }
        if ((i & 256) == 0) {
            this.mapEngine = "";
        } else {
            this.mapEngine = str4;
        }
    }

    public static /* synthetic */ ExportedSettings copy$default(ExportedSettings exportedSettings, boolean z, boolean z2, boolean z3, boolean z4, String str, Integer num, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = exportedSettings.mockWifi;
        }
        if ((i & 2) != 0) {
            z2 = exportedSettings.mockCell;
        }
        if ((i & 4) != 0) {
            z3 = exportedSettings.mockBluetooth;
        }
        if ((i & 8) != 0) {
            z4 = exportedSettings.enableJitter;
        }
        if ((i & 16) != 0) {
            str = exportedSettings.altitude;
        }
        if ((i & 32) != 0) {
            num = exportedSettings.altitudeVariationM;
        }
        if ((i & 64) != 0) {
            str2 = exportedSettings.satelliteCount;
        }
        if ((i & WorkQueueKt.BUFFER_CAPACITY) != 0) {
            str3 = exportedSettings.mapType;
        }
        if ((i & 256) != 0) {
            str4 = exportedSettings.mapEngine;
        }
        String str5 = str3;
        String str6 = str4;
        Integer num2 = num;
        String str7 = str2;
        String str8 = str;
        boolean z5 = z3;
        return exportedSettings.copy(z, z2, z5, z4, str8, num2, str7, str5, str6);
    }

    public static final /* synthetic */ void write$Self$core_data_globalRelease(ExportedSettings exportedSettings, m30 m30Var, bt2 bt2Var) {
        if (m30Var.d(bt2Var) || !exportedSettings.mockWifi) {
            m30Var.o(bt2Var, 0, exportedSettings.mockWifi);
        }
        if (m30Var.d(bt2Var) || !exportedSettings.mockCell) {
            m30Var.o(bt2Var, 1, exportedSettings.mockCell);
        }
        if (m30Var.d(bt2Var) || !exportedSettings.mockBluetooth) {
            m30Var.o(bt2Var, 2, exportedSettings.mockBluetooth);
        }
        if (m30Var.d(bt2Var) || !exportedSettings.enableJitter) {
            m30Var.o(bt2Var, 3, exportedSettings.enableJitter);
        }
        if (m30Var.d(bt2Var) || !o51.f(exportedSettings.altitude, "")) {
            m30Var.n(bt2Var, 4, exportedSettings.altitude);
        }
        if (m30Var.d(bt2Var) || exportedSettings.altitudeVariationM != null) {
            m30Var.u(bt2Var, 5, n41.a, exportedSettings.altitudeVariationM);
        }
        if (m30Var.d(bt2Var) || !o51.f(exportedSettings.satelliteCount, "")) {
            m30Var.n(bt2Var, 6, exportedSettings.satelliteCount);
        }
        if (m30Var.d(bt2Var) || !o51.f(exportedSettings.mapType, "")) {
            m30Var.n(bt2Var, 7, exportedSettings.mapType);
        }
        if (!m30Var.d(bt2Var) && o51.f(exportedSettings.mapEngine, "")) {
            return;
        }
        m30Var.n(bt2Var, 8, exportedSettings.mapEngine);
    }

    public final boolean component1() {
        return this.mockWifi;
    }

    public final boolean component2() {
        return this.mockCell;
    }

    public final boolean component3() {
        return this.mockBluetooth;
    }

    public final boolean component4() {
        return this.enableJitter;
    }

    public final String component5() {
        return this.altitude;
    }

    public final Integer component6() {
        return this.altitudeVariationM;
    }

    public final String component7() {
        return this.satelliteCount;
    }

    public final String component8() {
        return this.mapType;
    }

    public final String component9() {
        return this.mapEngine;
    }

    public final ExportedSettings copy(boolean z, boolean z2, boolean z3, boolean z4, String str, Integer num, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new ExportedSettings(z, z2, z3, z4, str, num, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExportedSettings)) {
            return false;
        }
        ExportedSettings exportedSettings = (ExportedSettings) obj;
        return this.mockWifi == exportedSettings.mockWifi && this.mockCell == exportedSettings.mockCell && this.mockBluetooth == exportedSettings.mockBluetooth && this.enableJitter == exportedSettings.enableJitter && o51.f(this.altitude, exportedSettings.altitude) && o51.f(this.altitudeVariationM, exportedSettings.altitudeVariationM) && o51.f(this.satelliteCount, exportedSettings.satelliteCount) && o51.f(this.mapType, exportedSettings.mapType) && o51.f(this.mapEngine, exportedSettings.mapEngine);
    }

    public final String getAltitude() {
        return this.altitude;
    }

    public final Integer getAltitudeVariationM() {
        return this.altitudeVariationM;
    }

    public final boolean getEnableJitter() {
        return this.enableJitter;
    }

    public final String getMapEngine() {
        return this.mapEngine;
    }

    public final String getMapType() {
        return this.mapType;
    }

    public final boolean getMockBluetooth() {
        return this.mockBluetooth;
    }

    public final boolean getMockCell() {
        return this.mockCell;
    }

    public final boolean getMockWifi() {
        return this.mockWifi;
    }

    public final String getSatelliteCount() {
        return this.satelliteCount;
    }

    public int hashCode() {
        int iD = p91.d(p91.e(p91.e(p91.e(Boolean.hashCode(this.mockWifi) * 31, 31, this.mockCell), 31, this.mockBluetooth), 31, this.enableJitter), 31, this.altitude);
        Integer num = this.altitudeVariationM;
        return this.mapEngine.hashCode() + p91.d(p91.d((iD + (num == null ? 0 : num.hashCode())) * 31, 31, this.satelliteCount), 31, this.mapType);
    }

    public String toString() {
        boolean z = this.mockWifi;
        boolean z2 = this.mockCell;
        boolean z3 = this.mockBluetooth;
        boolean z4 = this.enableJitter;
        String str = this.altitude;
        Integer num = this.altitudeVariationM;
        String str2 = this.satelliteCount;
        String str3 = this.mapType;
        String str4 = this.mapEngine;
        StringBuilder sb = new StringBuilder("ExportedSettings(mockWifi=");
        sb.append(z);
        sb.append(", mockCell=");
        sb.append(z2);
        sb.append(", mockBluetooth=");
        sb.append(z3);
        sb.append(", enableJitter=");
        sb.append(z4);
        sb.append(", altitude=");
        sb.append(str);
        sb.append(", altitudeVariationM=");
        sb.append(num);
        sb.append(", satelliteCount=");
        p91.y(sb, str2, ", mapType=", str3, ", mapEngine=");
        return az2.p(sb, str4, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        private Companion() {
        }

        public final y81 serializer() {
            return ExportedSettings$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }
    }

    public ExportedSettings() {
        this(false, false, false, false, (String) null, (Integer) null, (String) null, (String) null, (String) null, 511, (ca0) null);
    }

    public ExportedSettings(boolean z, boolean z2, boolean z3, boolean z4, String str, Integer num, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.mockWifi = z;
        this.mockCell = z2;
        this.mockBluetooth = z3;
        this.enableJitter = z4;
        this.altitude = str;
        this.altitudeVariationM = num;
        this.satelliteCount = str2;
        this.mapType = str3;
        this.mapEngine = str4;
    }

    public /* synthetic */ ExportedSettings(boolean z, boolean z2, boolean z3, boolean z4, String str, Integer num, String str2, String str3, String str4, int i, ca0 ca0Var) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? true : z4, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? null : num, (i & 64) != 0 ? "" : str2, (i & WorkQueueKt.BUFFER_CAPACITY) != 0 ? "" : str3, (i & 256) != 0 ? "" : str4);
    }
}
