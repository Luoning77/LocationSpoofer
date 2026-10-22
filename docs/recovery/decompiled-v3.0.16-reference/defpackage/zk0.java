package defpackage;

import com.vincenthzr.locationspoofer.data.db.EnvironmentDao_Impl;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class zk0 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ long g;

    public /* synthetic */ zk0(long j, String str, int i) {
        this.e = i;
        this.g = j;
        this.f = str;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                return EnvironmentDao_Impl.deleteLocationWifi$lambda$34("DELETE FROM location_wifi WHERE locationId = ? AND bssid = ?", this.g, this.f, (zk2) obj);
            case 1:
                return EnvironmentDao_Impl.updateSelectedBluetooth$lambda$40("UPDATE location_records SET selectedBluetoothAddress = ? WHERE id = ?", this.f, this.g, (zk2) obj);
            case 2:
                return EnvironmentDao_Impl.updateSelectedCell$lambda$39("UPDATE location_records SET selectedCellKey = ? WHERE id = ?", this.f, this.g, (zk2) obj);
            case 3:
                return EnvironmentDao_Impl.updateSelectedWifi$lambda$38("UPDATE location_records SET selectedWifiBssid = ? WHERE id = ?", this.f, this.g, (zk2) obj);
            case 4:
                return EnvironmentDao_Impl.deleteLocationCell$lambda$36("DELETE FROM location_cells WHERE locationId = ? AND cellKey = ?", this.g, this.f, (zk2) obj);
            default:
                return EnvironmentDao_Impl.deleteLocationBluetooth$lambda$37("DELETE FROM location_bluetooth WHERE locationId = ? AND address = ?", this.g, this.f, (zk2) obj);
        }
    }

    public /* synthetic */ zk0(String str, long j, int i) {
        this.e = i;
        this.f = str;
        this.g = j;
    }
}
