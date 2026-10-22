package com.vincenthzr.locationspoofer.data.db;

import defpackage.az2;
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
public final class WifiDevice {
    public static final Companion Companion = new Companion(null);
    private final String bssid;
    private final String capabilities;
    private final int frequency;
    private final String ssid;
    private final String vendor;

    public /* synthetic */ WifiDevice(int i, String str, String str2, int i2, String str3, String str4, ht2 ht2Var) {
        if (1 != (i & 1)) {
            dh0.K(i, 1, WifiDevice$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.bssid = str;
        if ((i & 2) == 0) {
            this.ssid = "";
        } else {
            this.ssid = str2;
        }
        if ((i & 4) == 0) {
            this.frequency = 2412;
        } else {
            this.frequency = i2;
        }
        if ((i & 8) == 0) {
            this.capabilities = "";
        } else {
            this.capabilities = str3;
        }
        if ((i & 16) == 0) {
            this.vendor = "";
        } else {
            this.vendor = str4;
        }
    }

    public static /* synthetic */ WifiDevice copy$default(WifiDevice wifiDevice, String str, String str2, int i, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = wifiDevice.bssid;
        }
        if ((i2 & 2) != 0) {
            str2 = wifiDevice.ssid;
        }
        if ((i2 & 4) != 0) {
            i = wifiDevice.frequency;
        }
        if ((i2 & 8) != 0) {
            str3 = wifiDevice.capabilities;
        }
        if ((i2 & 16) != 0) {
            str4 = wifiDevice.vendor;
        }
        String str5 = str4;
        int i3 = i;
        return wifiDevice.copy(str, str2, i3, str3, str5);
    }

    public static final /* synthetic */ void write$Self$core_data_globalRelease(WifiDevice wifiDevice, m30 m30Var, bt2 bt2Var) {
        m30Var.n(bt2Var, 0, wifiDevice.bssid);
        if (m30Var.d(bt2Var) || !o51.f(wifiDevice.ssid, "")) {
            m30Var.n(bt2Var, 1, wifiDevice.ssid);
        }
        if (m30Var.d(bt2Var) || wifiDevice.frequency != 2412) {
            m30Var.i(2, wifiDevice.frequency, bt2Var);
        }
        if (m30Var.d(bt2Var) || !o51.f(wifiDevice.capabilities, "")) {
            m30Var.n(bt2Var, 3, wifiDevice.capabilities);
        }
        if (!m30Var.d(bt2Var) && o51.f(wifiDevice.vendor, "")) {
            return;
        }
        m30Var.n(bt2Var, 4, wifiDevice.vendor);
    }

    public final String component1() {
        return this.bssid;
    }

    public final String component2() {
        return this.ssid;
    }

    public final int component3() {
        return this.frequency;
    }

    public final String component4() {
        return this.capabilities;
    }

    public final String component5() {
        return this.vendor;
    }

    public final WifiDevice copy(String str, String str2, int i, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new WifiDevice(str, str2, i, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WifiDevice)) {
            return false;
        }
        WifiDevice wifiDevice = (WifiDevice) obj;
        return o51.f(this.bssid, wifiDevice.bssid) && o51.f(this.ssid, wifiDevice.ssid) && this.frequency == wifiDevice.frequency && o51.f(this.capabilities, wifiDevice.capabilities) && o51.f(this.vendor, wifiDevice.vendor);
    }

    public final String getBssid() {
        return this.bssid;
    }

    public final String getCapabilities() {
        return this.capabilities;
    }

    public final int getFrequency() {
        return this.frequency;
    }

    public final String getSsid() {
        return this.ssid;
    }

    public final String getVendor() {
        return this.vendor;
    }

    public int hashCode() {
        return this.vendor.hashCode() + p91.d(p91.b(this.frequency, p91.d(this.bssid.hashCode() * 31, 31, this.ssid), 31), 31, this.capabilities);
    }

    public String toString() {
        String str = this.bssid;
        String str2 = this.ssid;
        int i = this.frequency;
        String str3 = this.capabilities;
        String str4 = this.vendor;
        StringBuilder sbT = p91.t("WifiDevice(bssid=", str, ", ssid=", str2, ", frequency=");
        sbT.append(i);
        sbT.append(", capabilities=");
        sbT.append(str3);
        sbT.append(", vendor=");
        return az2.p(sbT, str4, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        private Companion() {
        }

        public final y81 serializer() {
            return WifiDevice$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }
    }

    public WifiDevice(String str, String str2, int i, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.bssid = str;
        this.ssid = str2;
        this.frequency = i;
        this.capabilities = str3;
        this.vendor = str4;
    }

    public /* synthetic */ WifiDevice(String str, String str2, int i, String str3, String str4, int i2, ca0 ca0Var) {
        this(str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 2412 : i, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4);
    }
}
