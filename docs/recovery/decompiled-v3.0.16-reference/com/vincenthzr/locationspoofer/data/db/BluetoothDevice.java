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
public final class BluetoothDevice {
    public static final Companion Companion = new Companion(null);
    private final String address;
    private final String name;
    private final String scanRecordHex;

    public /* synthetic */ BluetoothDevice(int i, String str, String str2, String str3, ht2 ht2Var) {
        if (1 != (i & 1)) {
            dh0.K(i, 1, BluetoothDevice$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.address = str;
        if ((i & 2) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.scanRecordHex = "";
        } else {
            this.scanRecordHex = str3;
        }
    }

    public static /* synthetic */ BluetoothDevice copy$default(BluetoothDevice bluetoothDevice, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bluetoothDevice.address;
        }
        if ((i & 2) != 0) {
            str2 = bluetoothDevice.name;
        }
        if ((i & 4) != 0) {
            str3 = bluetoothDevice.scanRecordHex;
        }
        return bluetoothDevice.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$core_data_globalRelease(BluetoothDevice bluetoothDevice, m30 m30Var, bt2 bt2Var) {
        m30Var.n(bt2Var, 0, bluetoothDevice.address);
        if (m30Var.d(bt2Var) || !o51.f(bluetoothDevice.name, "")) {
            m30Var.n(bt2Var, 1, bluetoothDevice.name);
        }
        if (!m30Var.d(bt2Var) && o51.f(bluetoothDevice.scanRecordHex, "")) {
            return;
        }
        m30Var.n(bt2Var, 2, bluetoothDevice.scanRecordHex);
    }

    public final String component1() {
        return this.address;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.scanRecordHex;
    }

    public final BluetoothDevice copy(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new BluetoothDevice(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BluetoothDevice)) {
            return false;
        }
        BluetoothDevice bluetoothDevice = (BluetoothDevice) obj;
        return o51.f(this.address, bluetoothDevice.address) && o51.f(this.name, bluetoothDevice.name) && o51.f(this.scanRecordHex, bluetoothDevice.scanRecordHex);
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getName() {
        return this.name;
    }

    public final String getScanRecordHex() {
        return this.scanRecordHex;
    }

    public int hashCode() {
        return this.scanRecordHex.hashCode() + p91.d(this.address.hashCode() * 31, 31, this.name);
    }

    public String toString() {
        String str = this.address;
        String str2 = this.name;
        return az2.p(p91.t("BluetoothDevice(address=", str, ", name=", str2, ", scanRecordHex="), this.scanRecordHex, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        private Companion() {
        }

        public final y81 serializer() {
            return BluetoothDevice$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }
    }

    public BluetoothDevice(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.address = str;
        this.name = str2;
        this.scanRecordHex = str3;
    }

    public /* synthetic */ BluetoothDevice(String str, String str2, String str3, int i, ca0 ca0Var) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
