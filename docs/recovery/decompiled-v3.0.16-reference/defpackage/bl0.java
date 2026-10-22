package defpackage;

import com.vincenthzr.locationspoofer.data.db.EnvironmentDao_Impl;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class bl0 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ EnvironmentDao_Impl f;
    public final /* synthetic */ zk2 g;

    public /* synthetic */ bl0(EnvironmentDao_Impl environmentDao_Impl, zk2 zk2Var, int i) {
        this.e = i;
        this.f = environmentDao_Impl;
        this.g = zk2Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        zk2 zk2Var = this.g;
        EnvironmentDao_Impl environmentDao_Impl = this.f;
        switch (i) {
            case 0:
                return EnvironmentDao_Impl.__fetchRelationshiplocationCellsAscomVincenthzrLocationspooferDataDbLocationWithCell$lambda$49(environmentDao_Impl, zk2Var, (zj1) obj);
            case 1:
                return EnvironmentDao_Impl.__fetchRelationshiplocationWifiAscomVincenthzrLocationspooferDataDbLocationWithWifi$lambda$45(environmentDao_Impl, zk2Var, (zj1) obj);
            case 2:
                return EnvironmentDao_Impl.__fetchRelationshipbluetoothDevicesAscomVincenthzrLocationspooferDataDbBluetoothDevice$lambda$46(environmentDao_Impl, zk2Var, (to) obj);
            case 3:
                return EnvironmentDao_Impl.__fetchRelationshiplocationRecordsAscomVincenthzrLocationspooferDataDbCompleteLocation$lambda$50(environmentDao_Impl, zk2Var, (zj1) obj);
            case 4:
                return EnvironmentDao_Impl.__fetchRelationshiplocationBluetoothAscomVincenthzrLocationspooferDataDbLocationWithBluetooth$lambda$47(environmentDao_Impl, zk2Var, (zj1) obj);
            case Logger.WARN /* 5 */:
                return EnvironmentDao_Impl.__fetchRelationshiplocationConnectedWifiAscomVincenthzrLocationspooferDataDbLocationConnectedWifi$lambda$43(environmentDao_Impl, zk2Var, (zj1) obj);
            case Logger.ERROR /* 6 */:
                return EnvironmentDao_Impl.__fetchRelationshipcellDevicesAscomVincenthzrLocationspooferDataDbCellDevice$lambda$48(environmentDao_Impl, zk2Var, (to) obj);
            default:
                return EnvironmentDao_Impl.__fetchRelationshipwifiDevicesAscomVincenthzrLocationspooferDataDbWifiDevice$lambda$44(environmentDao_Impl, zk2Var, (to) obj);
        }
    }
}
