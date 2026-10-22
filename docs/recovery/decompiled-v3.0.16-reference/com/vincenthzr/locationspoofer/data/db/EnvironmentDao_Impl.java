package com.vincenthzr.locationspoofer.data.db;

import com.vincenthzr.locationspoofer.data.db.EnvironmentDao_Impl;
import defpackage.bl0;
import defpackage.bl2;
import defpackage.ca0;
import defpackage.cl0;
import defpackage.dl0;
import defpackage.ec;
import defpackage.ee0;
import defpackage.fl0;
import defpackage.fo;
import defpackage.gh0;
import defpackage.ig0;
import defpackage.ii2;
import defpackage.j;
import defpackage.jl0;
import defpackage.k33;
import defpackage.ks;
import defpackage.l81;
import defpackage.lu0;
import defpackage.mc0;
import defpackage.mf3;
import defpackage.mh0;
import defpackage.my;
import defpackage.po;
import defpackage.q60;
import defpackage.qk0;
import defpackage.qo;
import defpackage.rk0;
import defpackage.s90;
import defpackage.sk0;
import defpackage.to;
import defpackage.uj0;
import defpackage.wc0;
import defpackage.xk0;
import defpackage.z70;
import defpackage.zj1;
import defpackage.zk0;
import defpackage.zk2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class EnvironmentDao_Impl implements EnvironmentDao {
    public static final Companion Companion = new Companion(null);
    private final ii2 __db;
    private final rk0 __insertAdapterOfCollectionRouteRecord;
    private final rk0 __insertAdapterOfLocationBluetooth;
    private final rk0 __insertAdapterOfLocationCell;
    private final rk0 __insertAdapterOfLocationConnectedWifi;
    private final rk0 __insertAdapterOfLocationRecord;
    private final rk0 __insertAdapterOfLocationWifi;
    private final qk0 __updateAdapterOfCollectionRouteRecord;
    private final qk0 __updateAdapterOfLocationRecord;
    private final sk0 __upsertAdapterOfBluetoothDevice;
    private final sk0 __upsertAdapterOfCellDevice;
    private final sk0 __upsertAdapterOfWifiDevice;

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.db.EnvironmentDao_Impl$findOrCreateCollectionLocation$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.db.EnvironmentDao_Impl$findOrCreateCollectionLocation$2", f = "EnvironmentDao_Impl.kt", l = {335}, m = "invokeSuspend")
    public static final class C00752 extends k33 implements lu0 {
        final /* synthetic */ Long $collectionRouteId;
        final /* synthetic */ double $lat;
        final /* synthetic */ double $lng;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00752(double d, double d2, Long l, q60 q60Var) {
            super(1, q60Var);
            this.$lat = d;
            this.$lng = d2;
            this.$collectionRouteId = l;
        }

        @Override // defpackage.oq
        public final q60 create(q60 q60Var) {
            return EnvironmentDao_Impl.this.new C00752(this.$lat, this.$lng, this.$collectionRouteId, q60Var);
        }

        @Override // defpackage.lu0
        public final Object invoke(q60 q60Var) {
            return ((C00752) create(q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ee0.J(obj);
                    return obj;
                }
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(obj);
            EnvironmentDao_Impl environmentDao_Impl = EnvironmentDao_Impl.this;
            double d = this.$lat;
            double d2 = this.$lng;
            Long l = this.$collectionRouteId;
            this.label = 1;
            Object objFindOrCreateCollectionLocation = EnvironmentDao_Impl.super.findOrCreateCollectionLocation(d, d2, l, this);
            z70 z70Var = z70.e;
            return objFindOrCreateCollectionLocation == z70Var ? z70Var : objFindOrCreateCollectionLocation;
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.db.EnvironmentDao_Impl$insertCompleteCollectionRoute$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.db.EnvironmentDao_Impl$insertCompleteCollectionRoute$2", f = "EnvironmentDao_Impl.kt", l = {343}, m = "invokeSuspend")
    public static final class C00762 extends k33 implements lu0 {
        final /* synthetic */ CompleteCollectionRoute $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00762(CompleteCollectionRoute completeCollectionRoute, q60 q60Var) {
            super(1, q60Var);
            this.$value = completeCollectionRoute;
        }

        @Override // defpackage.oq
        public final q60 create(q60 q60Var) {
            return EnvironmentDao_Impl.this.new C00762(this.$value, q60Var);
        }

        @Override // defpackage.lu0
        public final Object invoke(q60 q60Var) {
            return ((C00762) create(q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ee0.J(obj);
                EnvironmentDao_Impl environmentDao_Impl = EnvironmentDao_Impl.this;
                CompleteCollectionRoute completeCollectionRoute = this.$value;
                this.label = 1;
                Object objInsertCompleteCollectionRoute = EnvironmentDao_Impl.super.insertCompleteCollectionRoute(completeCollectionRoute, this);
                z70 z70Var = z70.e;
                if (objInsertCompleteCollectionRoute == z70Var) {
                    return z70Var;
                }
            } else {
                if (i != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
            }
            return mf3.a;
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.db.EnvironmentDao_Impl$insertCompleteLocationData$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.db.EnvironmentDao_Impl$insertCompleteLocationData$2", f = "EnvironmentDao_Impl.kt", l = {339}, m = "invokeSuspend")
    public static final class C00772 extends k33 implements lu0 {
        final /* synthetic */ Long $routeId;
        final /* synthetic */ CompleteLocation $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00772(CompleteLocation completeLocation, Long l, q60 q60Var) {
            super(1, q60Var);
            this.$value = completeLocation;
            this.$routeId = l;
        }

        @Override // defpackage.oq
        public final q60 create(q60 q60Var) {
            return EnvironmentDao_Impl.this.new C00772(this.$value, this.$routeId, q60Var);
        }

        @Override // defpackage.lu0
        public final Object invoke(q60 q60Var) {
            return ((C00772) create(q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ee0.J(obj);
                EnvironmentDao_Impl environmentDao_Impl = EnvironmentDao_Impl.this;
                CompleteLocation completeLocation = this.$value;
                Long l = this.$routeId;
                this.label = 1;
                Object objInsertCompleteLocationData = EnvironmentDao_Impl.super.insertCompleteLocationData(completeLocation, l, this);
                z70 z70Var = z70.e;
                if (objInsertCompleteLocationData == z70Var) {
                    return z70Var;
                }
            } else {
                if (i != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
            }
            return mf3.a;
        }
    }

    public EnvironmentDao_Impl(ii2 ii2Var) {
        ii2Var.getClass();
        this.__db = ii2Var;
        this.__insertAdapterOfLocationRecord = new rk0() { // from class: com.vincenthzr.locationspoofer.data.db.EnvironmentDao_Impl.1
            @Override // defpackage.rk0
            public void bind(bl2 bl2Var, LocationRecord locationRecord) {
                bl2Var.getClass();
                locationRecord.getClass();
                bl2Var.e(1, locationRecord.getId());
                bl2Var.a(locationRecord.getLat(), 2);
                bl2Var.a(locationRecord.getLng(), 3);
                bl2Var.e(4, locationRecord.getTimestamp());
                bl2Var.D(5, locationRecord.getPlaceName());
                bl2Var.D(6, locationRecord.getRemark());
                String selectedWifiBssid = locationRecord.getSelectedWifiBssid();
                if (selectedWifiBssid == null) {
                    bl2Var.b(7);
                } else {
                    bl2Var.D(7, selectedWifiBssid);
                }
                String selectedBluetoothAddress = locationRecord.getSelectedBluetoothAddress();
                if (selectedBluetoothAddress == null) {
                    bl2Var.b(8);
                } else {
                    bl2Var.D(8, selectedBluetoothAddress);
                }
                String selectedCellKey = locationRecord.getSelectedCellKey();
                if (selectedCellKey == null) {
                    bl2Var.b(9);
                } else {
                    bl2Var.D(9, selectedCellKey);
                }
                Long collectionRouteId = locationRecord.getCollectionRouteId();
                if (collectionRouteId == null) {
                    bl2Var.b(10);
                } else {
                    bl2Var.e(10, collectionRouteId.longValue());
                }
                bl2Var.D(11, locationRecord.getSyncId());
            }

            @Override // defpackage.rk0
            public String createQuery() {
                return "INSERT OR REPLACE INTO `location_records` (`id`,`lat`,`lng`,`timestamp`,`placeName`,`remark`,`selectedWifiBssid`,`selectedBluetoothAddress`,`selectedCellKey`,`collectionRouteId`,`syncId`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?)";
            }
        };
        this.__insertAdapterOfLocationConnectedWifi = new rk0() { // from class: com.vincenthzr.locationspoofer.data.db.EnvironmentDao_Impl.2
            @Override // defpackage.rk0
            public void bind(bl2 bl2Var, LocationConnectedWifi locationConnectedWifi) {
                bl2Var.getClass();
                locationConnectedWifi.getClass();
                bl2Var.e(1, locationConnectedWifi.getLocationId());
                bl2Var.D(2, locationConnectedWifi.getBssid());
                bl2Var.D(3, locationConnectedWifi.getSsid());
                bl2Var.D(4, locationConnectedWifi.getVendor());
                bl2Var.D(5, locationConnectedWifi.getMacAddress());
                bl2Var.e(6, locationConnectedWifi.getFrequency());
                bl2Var.e(7, locationConnectedWifi.getLinkSpeed());
                bl2Var.e(8, locationConnectedWifi.getLevel());
                bl2Var.D(9, locationConnectedWifi.getCapabilities());
                bl2Var.e(10, locationConnectedWifi.getNetworkId());
                bl2Var.e(11, locationConnectedWifi.getWifiStandard());
            }

            @Override // defpackage.rk0
            public String createQuery() {
                return "INSERT OR REPLACE INTO `location_connected_wifi` (`locationId`,`bssid`,`ssid`,`vendor`,`macAddress`,`frequency`,`linkSpeed`,`level`,`capabilities`,`networkId`,`wifiStandard`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            }
        };
        this.__insertAdapterOfLocationWifi = new rk0() { // from class: com.vincenthzr.locationspoofer.data.db.EnvironmentDao_Impl.3
            @Override // defpackage.rk0
            public void bind(bl2 bl2Var, LocationWifi locationWifi) {
                bl2Var.getClass();
                locationWifi.getClass();
                bl2Var.e(1, locationWifi.getLocationId());
                bl2Var.D(2, locationWifi.getBssid());
                bl2Var.e(3, locationWifi.getLevel());
            }

            @Override // defpackage.rk0
            public String createQuery() {
                return "INSERT OR REPLACE INTO `location_wifi` (`locationId`,`bssid`,`level`) VALUES (?,?,?)";
            }
        };
        this.__insertAdapterOfLocationBluetooth = new rk0() { // from class: com.vincenthzr.locationspoofer.data.db.EnvironmentDao_Impl.4
            @Override // defpackage.rk0
            public void bind(bl2 bl2Var, LocationBluetooth locationBluetooth) {
                bl2Var.getClass();
                locationBluetooth.getClass();
                bl2Var.e(1, locationBluetooth.getLocationId());
                bl2Var.D(2, locationBluetooth.getAddress());
                bl2Var.e(3, locationBluetooth.getRssi());
            }

            @Override // defpackage.rk0
            public String createQuery() {
                return "INSERT OR REPLACE INTO `location_bluetooth` (`locationId`,`address`,`rssi`) VALUES (?,?,?)";
            }
        };
        this.__insertAdapterOfLocationCell = new rk0() { // from class: com.vincenthzr.locationspoofer.data.db.EnvironmentDao_Impl.5
            @Override // defpackage.rk0
            public void bind(bl2 bl2Var, LocationCell locationCell) {
                bl2Var.getClass();
                locationCell.getClass();
                bl2Var.e(1, locationCell.getLocationId());
                bl2Var.D(2, locationCell.getCellKey());
                bl2Var.e(3, locationCell.getDbm());
                bl2Var.e(4, locationCell.isRegistered() ? 1L : 0L);
            }

            @Override // defpackage.rk0
            public String createQuery() {
                return "INSERT OR REPLACE INTO `location_cells` (`locationId`,`cellKey`,`dbm`,`isRegistered`) VALUES (?,?,?,?)";
            }
        };
        this.__insertAdapterOfCollectionRouteRecord = new rk0() { // from class: com.vincenthzr.locationspoofer.data.db.EnvironmentDao_Impl.6
            @Override // defpackage.rk0
            public void bind(bl2 bl2Var, CollectionRouteRecord collectionRouteRecord) {
                bl2Var.getClass();
                collectionRouteRecord.getClass();
                bl2Var.e(1, collectionRouteRecord.getId());
                bl2Var.D(2, collectionRouteRecord.getName());
                bl2Var.D(3, collectionRouteRecord.getRemark());
                bl2Var.D(4, collectionRouteRecord.getPointsJson());
                bl2Var.a(collectionRouteRecord.getHalfWidthM(), 5);
                bl2Var.e(6, collectionRouteRecord.getTimestamp());
                bl2Var.D(7, collectionRouteRecord.getSyncId());
            }

            @Override // defpackage.rk0
            public String createQuery() {
                return "INSERT OR ABORT INTO `collection_routes` (`id`,`name`,`remark`,`pointsJson`,`halfWidthM`,`timestamp`,`syncId`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
            }
        };
        this.__updateAdapterOfLocationRecord = new qk0() { // from class: com.vincenthzr.locationspoofer.data.db.EnvironmentDao_Impl.7
            @Override // defpackage.qk0
            public void bind(bl2 bl2Var, LocationRecord locationRecord) {
                bl2Var.getClass();
                locationRecord.getClass();
                bl2Var.e(1, locationRecord.getId());
                bl2Var.a(locationRecord.getLat(), 2);
                bl2Var.a(locationRecord.getLng(), 3);
                bl2Var.e(4, locationRecord.getTimestamp());
                bl2Var.D(5, locationRecord.getPlaceName());
                bl2Var.D(6, locationRecord.getRemark());
                String selectedWifiBssid = locationRecord.getSelectedWifiBssid();
                if (selectedWifiBssid == null) {
                    bl2Var.b(7);
                } else {
                    bl2Var.D(7, selectedWifiBssid);
                }
                String selectedBluetoothAddress = locationRecord.getSelectedBluetoothAddress();
                if (selectedBluetoothAddress == null) {
                    bl2Var.b(8);
                } else {
                    bl2Var.D(8, selectedBluetoothAddress);
                }
                String selectedCellKey = locationRecord.getSelectedCellKey();
                if (selectedCellKey == null) {
                    bl2Var.b(9);
                } else {
                    bl2Var.D(9, selectedCellKey);
                }
                Long collectionRouteId = locationRecord.getCollectionRouteId();
                if (collectionRouteId == null) {
                    bl2Var.b(10);
                } else {
                    bl2Var.e(10, collectionRouteId.longValue());
                }
                bl2Var.D(11, locationRecord.getSyncId());
                bl2Var.e(12, locationRecord.getId());
            }

            @Override // defpackage.qk0
            public String createQuery() {
                return "UPDATE OR ABORT `location_records` SET `id` = ?,`lat` = ?,`lng` = ?,`timestamp` = ?,`placeName` = ?,`remark` = ?,`selectedWifiBssid` = ?,`selectedBluetoothAddress` = ?,`selectedCellKey` = ?,`collectionRouteId` = ?,`syncId` = ? WHERE `id` = ?";
            }
        };
        this.__updateAdapterOfCollectionRouteRecord = new qk0() { // from class: com.vincenthzr.locationspoofer.data.db.EnvironmentDao_Impl.8
            @Override // defpackage.qk0
            public void bind(bl2 bl2Var, CollectionRouteRecord collectionRouteRecord) {
                bl2Var.getClass();
                collectionRouteRecord.getClass();
                bl2Var.e(1, collectionRouteRecord.getId());
                bl2Var.D(2, collectionRouteRecord.getName());
                bl2Var.D(3, collectionRouteRecord.getRemark());
                bl2Var.D(4, collectionRouteRecord.getPointsJson());
                bl2Var.a(collectionRouteRecord.getHalfWidthM(), 5);
                bl2Var.e(6, collectionRouteRecord.getTimestamp());
                bl2Var.D(7, collectionRouteRecord.getSyncId());
                bl2Var.e(8, collectionRouteRecord.getId());
            }

            @Override // defpackage.qk0
            public String createQuery() {
                return "UPDATE OR ABORT `collection_routes` SET `id` = ?,`name` = ?,`remark` = ?,`pointsJson` = ?,`halfWidthM` = ?,`timestamp` = ?,`syncId` = ? WHERE `id` = ?";
            }
        };
        this.__upsertAdapterOfWifiDevice = new sk0(new rk0() { // from class: com.vincenthzr.locationspoofer.data.db.EnvironmentDao_Impl.9
            @Override // defpackage.rk0
            public void bind(bl2 bl2Var, WifiDevice wifiDevice) {
                bl2Var.getClass();
                wifiDevice.getClass();
                bl2Var.D(1, wifiDevice.getBssid());
                bl2Var.D(2, wifiDevice.getSsid());
                bl2Var.e(3, wifiDevice.getFrequency());
                bl2Var.D(4, wifiDevice.getCapabilities());
                bl2Var.D(5, wifiDevice.getVendor());
            }

            @Override // defpackage.rk0
            public String createQuery() {
                return "INSERT INTO `wifi_devices` (`bssid`,`ssid`,`frequency`,`capabilities`,`vendor`) VALUES (?,?,?,?,?)";
            }
        }, new qk0() { // from class: com.vincenthzr.locationspoofer.data.db.EnvironmentDao_Impl.10
            @Override // defpackage.qk0
            public void bind(bl2 bl2Var, WifiDevice wifiDevice) {
                bl2Var.getClass();
                wifiDevice.getClass();
                bl2Var.D(1, wifiDevice.getBssid());
                bl2Var.D(2, wifiDevice.getSsid());
                bl2Var.e(3, wifiDevice.getFrequency());
                bl2Var.D(4, wifiDevice.getCapabilities());
                bl2Var.D(5, wifiDevice.getVendor());
                bl2Var.D(6, wifiDevice.getBssid());
            }

            @Override // defpackage.qk0
            public String createQuery() {
                return "UPDATE `wifi_devices` SET `bssid` = ?,`ssid` = ?,`frequency` = ?,`capabilities` = ?,`vendor` = ? WHERE `bssid` = ?";
            }
        });
        this.__upsertAdapterOfBluetoothDevice = new sk0(new rk0() { // from class: com.vincenthzr.locationspoofer.data.db.EnvironmentDao_Impl.11
            @Override // defpackage.rk0
            public void bind(bl2 bl2Var, BluetoothDevice bluetoothDevice) {
                bl2Var.getClass();
                bluetoothDevice.getClass();
                bl2Var.D(1, bluetoothDevice.getAddress());
                bl2Var.D(2, bluetoothDevice.getName());
                bl2Var.D(3, bluetoothDevice.getScanRecordHex());
            }

            @Override // defpackage.rk0
            public String createQuery() {
                return "INSERT INTO `bluetooth_devices` (`address`,`name`,`scanRecordHex`) VALUES (?,?,?)";
            }
        }, new qk0() { // from class: com.vincenthzr.locationspoofer.data.db.EnvironmentDao_Impl.12
            @Override // defpackage.qk0
            public void bind(bl2 bl2Var, BluetoothDevice bluetoothDevice) {
                bl2Var.getClass();
                bluetoothDevice.getClass();
                bl2Var.D(1, bluetoothDevice.getAddress());
                bl2Var.D(2, bluetoothDevice.getName());
                bl2Var.D(3, bluetoothDevice.getScanRecordHex());
                bl2Var.D(4, bluetoothDevice.getAddress());
            }

            @Override // defpackage.qk0
            public String createQuery() {
                return "UPDATE `bluetooth_devices` SET `address` = ?,`name` = ?,`scanRecordHex` = ? WHERE `address` = ?";
            }
        });
        this.__upsertAdapterOfCellDevice = new sk0(new rk0() { // from class: com.vincenthzr.locationspoofer.data.db.EnvironmentDao_Impl.13
            @Override // defpackage.rk0
            public void bind(bl2 bl2Var, CellDevice cellDevice) {
                bl2Var.getClass();
                cellDevice.getClass();
                bl2Var.D(1, cellDevice.getCellKey());
                bl2Var.D(2, cellDevice.getType());
                bl2Var.e(3, cellDevice.getMcc());
                bl2Var.e(4, cellDevice.getMnc());
                bl2Var.e(5, cellDevice.getTac());
                bl2Var.e(6, cellDevice.getCi());
                bl2Var.e(7, cellDevice.getPci());
                bl2Var.e(8, cellDevice.getLac());
                bl2Var.e(9, cellDevice.getCid());
                bl2Var.e(10, cellDevice.getPsc());
                bl2Var.e(11, cellDevice.getNci());
                bl2Var.e(12, cellDevice.getNetworkId());
                bl2Var.e(13, cellDevice.getSystemId());
                bl2Var.e(14, cellDevice.getBasestationId());
            }

            @Override // defpackage.rk0
            public String createQuery() {
                return "INSERT INTO `cell_devices` (`cellKey`,`type`,`mcc`,`mnc`,`tac`,`ci`,`pci`,`lac`,`cid`,`psc`,`nci`,`networkId`,`systemId`,`basestationId`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
        }, new qk0() { // from class: com.vincenthzr.locationspoofer.data.db.EnvironmentDao_Impl.14
            @Override // defpackage.qk0
            public void bind(bl2 bl2Var, CellDevice cellDevice) {
                bl2Var.getClass();
                cellDevice.getClass();
                bl2Var.D(1, cellDevice.getCellKey());
                bl2Var.D(2, cellDevice.getType());
                bl2Var.e(3, cellDevice.getMcc());
                bl2Var.e(4, cellDevice.getMnc());
                bl2Var.e(5, cellDevice.getTac());
                bl2Var.e(6, cellDevice.getCi());
                bl2Var.e(7, cellDevice.getPci());
                bl2Var.e(8, cellDevice.getLac());
                bl2Var.e(9, cellDevice.getCid());
                bl2Var.e(10, cellDevice.getPsc());
                bl2Var.e(11, cellDevice.getNci());
                bl2Var.e(12, cellDevice.getNetworkId());
                bl2Var.e(13, cellDevice.getSystemId());
                bl2Var.e(14, cellDevice.getBasestationId());
                bl2Var.D(15, cellDevice.getCellKey());
            }

            @Override // defpackage.qk0
            public String createQuery() {
                return "UPDATE `cell_devices` SET `cellKey` = ?,`type` = ?,`mcc` = ?,`mnc` = ?,`tac` = ?,`ci` = ?,`pci` = ?,`lac` = ?,`cid` = ?,`psc` = ?,`nci` = ?,`networkId` = ?,`systemId` = ?,`basestationId` = ? WHERE `cellKey` = ?";
            }
        });
    }

    private final void __fetchRelationshipbluetoothDevicesAscomVincenthzrLocationspooferDataDbBluetoothDevice(zk2 zk2Var, to toVar) throws Exception {
        qo qoVar = (qo) toVar.keySet();
        to toVar2 = qoVar.e;
        if (toVar2.isEmpty()) {
            return;
        }
        int i = 2;
        if (toVar.g > 999) {
            mh0.V(toVar, new bl0(this, zk2Var, i));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `address`,`name`,`scanRecordHex` FROM `bluetooth_devices` WHERE `address` IN (");
        ig0.i(sb, toVar2.g);
        sb.append(")");
        bl2 bl2VarA0 = zk2Var.a0(sb.toString());
        Iterator it = qoVar.iterator();
        int i2 = 1;
        while (true) {
            po poVar = (po) it;
            if (!poVar.hasNext()) {
                try {
                    break;
                } catch (Throwable th) {
                    bl2VarA0.close();
                    throw th;
                }
            }
            bl2VarA0.D(i2, (String) poVar.next());
            i2++;
        }
        int I = wc0.I(bl2VarA0, "address");
        if (I == -1) {
            bl2VarA0.close();
            return;
        }
        while (bl2VarA0.R()) {
            String strM = bl2VarA0.m(I);
            if (toVar.containsKey(strM)) {
                toVar.put(strM, new BluetoothDevice(bl2VarA0.m(0), bl2VarA0.m(1), bl2VarA0.m(2)));
            }
        }
        bl2VarA0.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 __fetchRelationshipbluetoothDevicesAscomVincenthzrLocationspooferDataDbBluetoothDevice$lambda$46(EnvironmentDao_Impl environmentDao_Impl, zk2 zk2Var, to toVar) throws Exception {
        toVar.getClass();
        environmentDao_Impl.__fetchRelationshipbluetoothDevicesAscomVincenthzrLocationspooferDataDbBluetoothDevice(zk2Var, toVar);
        return mf3.a;
    }

    private final void __fetchRelationshipcellDevicesAscomVincenthzrLocationspooferDataDbCellDevice(zk2 zk2Var, to toVar) throws Exception {
        qo qoVar = (qo) toVar.keySet();
        to toVar2 = qoVar.e;
        if (toVar2.isEmpty()) {
            return;
        }
        int i = 6;
        if (toVar.g > 999) {
            mh0.V(toVar, new bl0(this, zk2Var, i));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `cellKey`,`type`,`mcc`,`mnc`,`tac`,`ci`,`pci`,`lac`,`cid`,`psc`,`nci`,`networkId`,`systemId`,`basestationId` FROM `cell_devices` WHERE `cellKey` IN (");
        ig0.i(sb, toVar2.g);
        sb.append(")");
        bl2 bl2VarA0 = zk2Var.a0(sb.toString());
        Iterator it = qoVar.iterator();
        int i2 = 1;
        while (true) {
            po poVar = (po) it;
            if (!poVar.hasNext()) {
                try {
                    break;
                } catch (Throwable th) {
                    bl2VarA0.close();
                    throw th;
                }
            }
            bl2VarA0.D(i2, (String) poVar.next());
            i2++;
        }
        int I = wc0.I(bl2VarA0, "cellKey");
        if (I == -1) {
            bl2VarA0.close();
            return;
        }
        while (bl2VarA0.R()) {
            String strM = bl2VarA0.m(I);
            if (toVar.containsKey(strM)) {
                toVar.put(strM, new CellDevice(bl2VarA0.m(0), bl2VarA0.m(1), (int) bl2VarA0.getLong(2), (int) bl2VarA0.getLong(3), (int) bl2VarA0.getLong(4), (int) bl2VarA0.getLong(5), (int) bl2VarA0.getLong(i), (int) bl2VarA0.getLong(7), (int) bl2VarA0.getLong(8), (int) bl2VarA0.getLong(9), bl2VarA0.getLong(10), (int) bl2VarA0.getLong(11), (int) bl2VarA0.getLong(12), (int) bl2VarA0.getLong(13)));
                i = 6;
            }
        }
        bl2VarA0.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 __fetchRelationshipcellDevicesAscomVincenthzrLocationspooferDataDbCellDevice$lambda$48(EnvironmentDao_Impl environmentDao_Impl, zk2 zk2Var, to toVar) throws Exception {
        toVar.getClass();
        environmentDao_Impl.__fetchRelationshipcellDevicesAscomVincenthzrLocationspooferDataDbCellDevice(zk2Var, toVar);
        return mf3.a;
    }

    private final void __fetchRelationshiplocationBluetoothAscomVincenthzrLocationspooferDataDbLocationWithBluetooth(zk2 zk2Var, zj1 zj1Var) throws Exception {
        if (zj1Var.e()) {
            return;
        }
        if (zj1Var.j() > 999) {
            gh0.N(zj1Var, true, new bl0(this, zk2Var, 4));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `locationId`,`address`,`rssi` FROM `location_bluetooth` WHERE `locationId` IN (");
        ig0.i(sb, zj1Var.j());
        sb.append(")");
        bl2 bl2VarA0 = zk2Var.a0(sb.toString());
        int iJ = zj1Var.j();
        int i = 1;
        for (int i2 = 0; i2 < iJ; i2++) {
            bl2VarA0.e(i, zj1Var.f(i2));
            i++;
        }
        try {
            int I = wc0.I(bl2VarA0, "locationId");
            if (I == -1) {
                bl2VarA0.close();
                return;
            }
            to toVar = new to(0);
            while (bl2VarA0.R()) {
                toVar.put(bl2VarA0.m(1), null);
            }
            bl2VarA0.reset();
            __fetchRelationshipbluetoothDevicesAscomVincenthzrLocationspooferDataDbBluetoothDevice(zk2Var, toVar);
            while (bl2VarA0.R()) {
                List list = (List) zj1Var.c(bl2VarA0.getLong(I));
                if (list != null) {
                    LocationBluetooth locationBluetooth = new LocationBluetooth(bl2VarA0.getLong(0), bl2VarA0.m(1), (int) bl2VarA0.getLong(2));
                    BluetoothDevice bluetoothDevice = (BluetoothDevice) toVar.get(bl2VarA0.m(1));
                    if (bluetoothDevice == null) {
                        throw new IllegalStateException("Relationship item 'device' was expected to be NON-NULL but is NULL in @Relation involving a parent column named 'address' and entityColumn named 'address'.");
                    }
                    list.add(new LocationWithBluetooth(locationBluetooth, bluetoothDevice));
                }
            }
            bl2VarA0.close();
        } catch (Throwable th) {
            bl2VarA0.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 __fetchRelationshiplocationBluetoothAscomVincenthzrLocationspooferDataDbLocationWithBluetooth$lambda$47(EnvironmentDao_Impl environmentDao_Impl, zk2 zk2Var, zj1 zj1Var) throws Exception {
        zj1Var.getClass();
        environmentDao_Impl.__fetchRelationshiplocationBluetoothAscomVincenthzrLocationspooferDataDbLocationWithBluetooth(zk2Var, zj1Var);
        return mf3.a;
    }

    private final void __fetchRelationshiplocationCellsAscomVincenthzrLocationspooferDataDbLocationWithCell(zk2 zk2Var, zj1 zj1Var) throws Exception {
        if (zj1Var.e()) {
            return;
        }
        int i = 0;
        if (zj1Var.j() > 999) {
            gh0.N(zj1Var, true, new bl0(this, zk2Var, i));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `locationId`,`cellKey`,`dbm`,`isRegistered` FROM `location_cells` WHERE `locationId` IN (");
        ig0.i(sb, zj1Var.j());
        sb.append(")");
        bl2 bl2VarA0 = zk2Var.a0(sb.toString());
        int iJ = zj1Var.j();
        int i2 = 1;
        for (int i3 = 0; i3 < iJ; i3++) {
            bl2VarA0.e(i2, zj1Var.f(i3));
            i2++;
        }
        try {
            int I = wc0.I(bl2VarA0, "locationId");
            if (I == -1) {
                bl2VarA0.close();
                return;
            }
            to toVar = new to(0);
            while (bl2VarA0.R()) {
                toVar.put(bl2VarA0.m(1), null);
            }
            bl2VarA0.reset();
            __fetchRelationshipcellDevicesAscomVincenthzrLocationspooferDataDbCellDevice(zk2Var, toVar);
            while (bl2VarA0.R()) {
                List list = (List) zj1Var.c(bl2VarA0.getLong(I));
                if (list != null) {
                    LocationCell locationCell = new LocationCell(bl2VarA0.getLong(0), bl2VarA0.m(1), (int) bl2VarA0.getLong(2), ((int) bl2VarA0.getLong(3)) != 0);
                    CellDevice cellDevice = (CellDevice) toVar.get(bl2VarA0.m(1));
                    if (cellDevice == null) {
                        throw new IllegalStateException("Relationship item 'device' was expected to be NON-NULL but is NULL in @Relation involving a parent column named 'cellKey' and entityColumn named 'cellKey'.");
                    }
                    list.add(new LocationWithCell(locationCell, cellDevice));
                }
            }
            bl2VarA0.close();
        } catch (Throwable th) {
            bl2VarA0.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 __fetchRelationshiplocationCellsAscomVincenthzrLocationspooferDataDbLocationWithCell$lambda$49(EnvironmentDao_Impl environmentDao_Impl, zk2 zk2Var, zj1 zj1Var) throws Exception {
        zj1Var.getClass();
        environmentDao_Impl.__fetchRelationshiplocationCellsAscomVincenthzrLocationspooferDataDbLocationWithCell(zk2Var, zj1Var);
        return mf3.a;
    }

    private final void __fetchRelationshiplocationConnectedWifiAscomVincenthzrLocationspooferDataDbLocationConnectedWifi(zk2 zk2Var, zj1 zj1Var) throws Exception {
        if (zj1Var.e()) {
            return;
        }
        int i = 5;
        int i2 = 0;
        if (zj1Var.j() > 999) {
            gh0.N(zj1Var, false, new bl0(this, zk2Var, i));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `locationId`,`bssid`,`ssid`,`vendor`,`macAddress`,`frequency`,`linkSpeed`,`level`,`capabilities`,`networkId`,`wifiStandard` FROM `location_connected_wifi` WHERE `locationId` IN (");
        ig0.i(sb, zj1Var.j());
        sb.append(")");
        bl2 bl2VarA0 = zk2Var.a0(sb.toString());
        int iJ = zj1Var.j();
        int i3 = 1;
        int i4 = 1;
        for (int i5 = 0; i5 < iJ; i5++) {
            bl2VarA0.e(i4, zj1Var.f(i5));
            i4++;
        }
        try {
            int I = wc0.I(bl2VarA0, "locationId");
            if (I == -1) {
                bl2VarA0.close();
                return;
            }
            while (bl2VarA0.R()) {
                long j = bl2VarA0.getLong(I);
                if (zj1Var.b(j)) {
                    zj1Var.g(j, new LocationConnectedWifi(bl2VarA0.getLong(i2), bl2VarA0.m(i3), bl2VarA0.m(2), bl2VarA0.m(3), bl2VarA0.m(4), (int) bl2VarA0.getLong(i), (int) bl2VarA0.getLong(6), (int) bl2VarA0.getLong(7), bl2VarA0.m(8), (int) bl2VarA0.getLong(9), (int) bl2VarA0.getLong(10)));
                    i3 = 1;
                    i = 5;
                    i2 = 0;
                }
            }
            bl2VarA0.close();
        } catch (Throwable th) {
            bl2VarA0.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 __fetchRelationshiplocationConnectedWifiAscomVincenthzrLocationspooferDataDbLocationConnectedWifi$lambda$43(EnvironmentDao_Impl environmentDao_Impl, zk2 zk2Var, zj1 zj1Var) throws Exception {
        zj1Var.getClass();
        environmentDao_Impl.__fetchRelationshiplocationConnectedWifiAscomVincenthzrLocationspooferDataDbLocationConnectedWifi(zk2Var, zj1Var);
        return mf3.a;
    }

    private final void __fetchRelationshiplocationRecordsAscomVincenthzrLocationspooferDataDbCompleteLocation(zk2 zk2Var, zj1 zj1Var) throws Exception {
        List list;
        if (zj1Var.e()) {
            return;
        }
        int i = 3;
        int i2 = 1;
        if (zj1Var.j() > 999) {
            gh0.N(zj1Var, true, new bl0(this, zk2Var, i));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `id`,`lat`,`lng`,`timestamp`,`placeName`,`remark`,`selectedWifiBssid`,`selectedBluetoothAddress`,`selectedCellKey`,`collectionRouteId`,`syncId` FROM `location_records` WHERE `collectionRouteId` IN (");
        ig0.i(sb, zj1Var.j());
        sb.append(")");
        bl2 bl2VarA0 = zk2Var.a0(sb.toString());
        int iJ = zj1Var.j();
        int i3 = 1;
        for (int i4 = 0; i4 < iJ; i4++) {
            bl2VarA0.e(i3, zj1Var.f(i4));
            i3++;
        }
        try {
            int I = wc0.I(bl2VarA0, "collectionRouteId");
            if (I == -1) {
                bl2VarA0.close();
                return;
            }
            Object obj = null;
            zj1 zj1Var2 = new zj1(obj);
            zj1 zj1Var3 = new zj1(obj);
            zj1 zj1Var4 = new zj1(obj);
            zj1 zj1Var5 = new zj1(obj);
            while (bl2VarA0.R()) {
                zj1Var2.g(bl2VarA0.getLong(0), null);
                long j = bl2VarA0.getLong(0);
                if (!zj1Var3.b(j)) {
                    zj1Var3.g(j, new ArrayList());
                }
                long j2 = bl2VarA0.getLong(0);
                if (!zj1Var4.b(j2)) {
                    zj1Var4.g(j2, new ArrayList());
                }
                long j3 = bl2VarA0.getLong(0);
                if (!zj1Var5.b(j3)) {
                    zj1Var5.g(j3, new ArrayList());
                }
            }
            bl2VarA0.reset();
            __fetchRelationshiplocationConnectedWifiAscomVincenthzrLocationspooferDataDbLocationConnectedWifi(zk2Var, zj1Var2);
            __fetchRelationshiplocationWifiAscomVincenthzrLocationspooferDataDbLocationWithWifi(zk2Var, zj1Var3);
            __fetchRelationshiplocationBluetoothAscomVincenthzrLocationspooferDataDbLocationWithBluetooth(zk2Var, zj1Var4);
            __fetchRelationshiplocationCellsAscomVincenthzrLocationspooferDataDbLocationWithCell(zk2Var, zj1Var5);
            while (bl2VarA0.R()) {
                Long lValueOf = bl2VarA0.isNull(I) ? null : Long.valueOf(bl2VarA0.getLong(I));
                if (lValueOf != null && (list = (List) zj1Var.c(lValueOf.longValue())) != null) {
                    LocationRecord locationRecord = new LocationRecord(bl2VarA0.getLong(0), bl2VarA0.getDouble(i2), bl2VarA0.getDouble(2), bl2VarA0.getLong(i), bl2VarA0.m(4), bl2VarA0.m(5), bl2VarA0.isNull(6) ? null : bl2VarA0.m(6), bl2VarA0.isNull(7) ? null : bl2VarA0.m(7), bl2VarA0.isNull(8) ? null : bl2VarA0.m(8), bl2VarA0.isNull(9) ? null : Long.valueOf(bl2VarA0.getLong(9)), bl2VarA0.m(10));
                    LocationConnectedWifi locationConnectedWifi = (LocationConnectedWifi) zj1Var2.c(bl2VarA0.getLong(0));
                    Object objC = zj1Var3.c(bl2VarA0.getLong(0));
                    if (objC == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    List list2 = (List) objC;
                    Object objC2 = zj1Var4.c(bl2VarA0.getLong(0));
                    if (objC2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    List list3 = (List) objC2;
                    Object objC3 = zj1Var5.c(bl2VarA0.getLong(0));
                    if (objC3 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    list.add(new CompleteLocation(locationRecord, locationConnectedWifi, list2, list3, (List) objC3));
                    i = 3;
                    i2 = 1;
                }
            }
            bl2VarA0.close();
        } catch (Throwable th) {
            bl2VarA0.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 __fetchRelationshiplocationRecordsAscomVincenthzrLocationspooferDataDbCompleteLocation$lambda$50(EnvironmentDao_Impl environmentDao_Impl, zk2 zk2Var, zj1 zj1Var) throws Exception {
        zj1Var.getClass();
        environmentDao_Impl.__fetchRelationshiplocationRecordsAscomVincenthzrLocationspooferDataDbCompleteLocation(zk2Var, zj1Var);
        return mf3.a;
    }

    private final void __fetchRelationshiplocationWifiAscomVincenthzrLocationspooferDataDbLocationWithWifi(zk2 zk2Var, zj1 zj1Var) throws Exception {
        if (zj1Var.e()) {
            return;
        }
        int i = 1;
        if (zj1Var.j() > 999) {
            gh0.N(zj1Var, true, new bl0(this, zk2Var, i));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `locationId`,`bssid`,`level` FROM `location_wifi` WHERE `locationId` IN (");
        ig0.i(sb, zj1Var.j());
        sb.append(")");
        bl2 bl2VarA0 = zk2Var.a0(sb.toString());
        int iJ = zj1Var.j();
        int i2 = 1;
        for (int i3 = 0; i3 < iJ; i3++) {
            bl2VarA0.e(i2, zj1Var.f(i3));
            i2++;
        }
        try {
            int I = wc0.I(bl2VarA0, "locationId");
            if (I == -1) {
                bl2VarA0.close();
                return;
            }
            to toVar = new to(0);
            while (bl2VarA0.R()) {
                toVar.put(bl2VarA0.m(1), null);
            }
            bl2VarA0.reset();
            __fetchRelationshipwifiDevicesAscomVincenthzrLocationspooferDataDbWifiDevice(zk2Var, toVar);
            while (bl2VarA0.R()) {
                List list = (List) zj1Var.c(bl2VarA0.getLong(I));
                if (list != null) {
                    LocationWifi locationWifi = new LocationWifi(bl2VarA0.getLong(0), bl2VarA0.m(1), (int) bl2VarA0.getLong(2));
                    WifiDevice wifiDevice = (WifiDevice) toVar.get(bl2VarA0.m(1));
                    if (wifiDevice == null) {
                        throw new IllegalStateException("Relationship item 'device' was expected to be NON-NULL but is NULL in @Relation involving a parent column named 'bssid' and entityColumn named 'bssid'.");
                    }
                    list.add(new LocationWithWifi(locationWifi, wifiDevice));
                }
            }
            bl2VarA0.close();
        } catch (Throwable th) {
            bl2VarA0.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 __fetchRelationshiplocationWifiAscomVincenthzrLocationspooferDataDbLocationWithWifi$lambda$45(EnvironmentDao_Impl environmentDao_Impl, zk2 zk2Var, zj1 zj1Var) throws Exception {
        zj1Var.getClass();
        environmentDao_Impl.__fetchRelationshiplocationWifiAscomVincenthzrLocationspooferDataDbLocationWithWifi(zk2Var, zj1Var);
        return mf3.a;
    }

    private final void __fetchRelationshipwifiDevicesAscomVincenthzrLocationspooferDataDbWifiDevice(zk2 zk2Var, to toVar) throws Exception {
        qo qoVar = (qo) toVar.keySet();
        to toVar2 = qoVar.e;
        if (toVar2.isEmpty()) {
            return;
        }
        if (toVar.g > 999) {
            mh0.V(toVar, new bl0(this, zk2Var, 7));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `bssid`,`ssid`,`frequency`,`capabilities`,`vendor` FROM `wifi_devices` WHERE `bssid` IN (");
        ig0.i(sb, toVar2.g);
        sb.append(")");
        bl2 bl2VarA0 = zk2Var.a0(sb.toString());
        Iterator it = qoVar.iterator();
        int i = 1;
        while (true) {
            po poVar = (po) it;
            if (!poVar.hasNext()) {
                try {
                    break;
                } catch (Throwable th) {
                    bl2VarA0.close();
                    throw th;
                }
            }
            bl2VarA0.D(i, (String) poVar.next());
            i++;
        }
        int I = wc0.I(bl2VarA0, "bssid");
        if (I == -1) {
            bl2VarA0.close();
            return;
        }
        while (bl2VarA0.R()) {
            String strM = bl2VarA0.m(I);
            if (toVar.containsKey(strM)) {
                toVar.put(strM, new WifiDevice(bl2VarA0.m(0), bl2VarA0.m(1), (int) bl2VarA0.getLong(2), bl2VarA0.m(3), bl2VarA0.m(4)));
            }
        }
        bl2VarA0.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 __fetchRelationshipwifiDevicesAscomVincenthzrLocationspooferDataDbWifiDevice$lambda$44(EnvironmentDao_Impl environmentDao_Impl, zk2 zk2Var, to toVar) throws Exception {
        toVar.getClass();
        environmentDao_Impl.__fetchRelationshipwifiDevicesAscomVincenthzrLocationspooferDataDbWifiDevice(zk2Var, toVar);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 clearAll$lambda$30(String str, zk2 zk2Var) throws Exception {
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0(str);
        try {
            bl2VarA0.R();
            return mf3.a;
        } finally {
            bl2VarA0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 clearCollectionRoutes$lambda$31(String str, zk2 zk2Var) throws Exception {
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0(str);
        try {
            bl2VarA0.R();
            return mf3.a;
        } finally {
            bl2VarA0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 clearSyncBluetooth$lambda$25(String str, long j, zk2 zk2Var) throws Exception {
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0(str);
        try {
            bl2VarA0.e(1, j);
            bl2VarA0.R();
            return mf3.a;
        } finally {
            bl2VarA0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 clearSyncCells$lambda$24(String str, long j, zk2 zk2Var) throws Exception {
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0(str);
        try {
            bl2VarA0.e(1, j);
            bl2VarA0.R();
            return mf3.a;
        } finally {
            bl2VarA0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 clearSyncWifi$lambda$23(String str, long j, zk2 zk2Var) throws Exception {
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0(str);
        try {
            bl2VarA0.e(1, j);
            bl2VarA0.R();
            return mf3.a;
        } finally {
            bl2VarA0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 deleteCollectionRoute$lambda$27(String str, long j, zk2 zk2Var) throws Exception {
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0(str);
        try {
            bl2VarA0.e(1, j);
            bl2VarA0.R();
            return mf3.a;
        } finally {
            bl2VarA0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 deleteConnectedWifi$lambda$35(String str, long j, zk2 zk2Var) throws Exception {
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0(str);
        try {
            bl2VarA0.e(1, j);
            bl2VarA0.R();
            return mf3.a;
        } finally {
            bl2VarA0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 deleteLocation$lambda$32(String str, long j, zk2 zk2Var) throws Exception {
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0(str);
        try {
            bl2VarA0.e(1, j);
            bl2VarA0.R();
            return mf3.a;
        } finally {
            bl2VarA0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 deleteLocationBluetooth$lambda$37(String str, long j, String str2, zk2 zk2Var) throws Exception {
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0(str);
        try {
            bl2VarA0.e(1, j);
            bl2VarA0.D(2, str2);
            bl2VarA0.R();
            return mf3.a;
        } finally {
            bl2VarA0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 deleteLocationCell$lambda$36(String str, long j, String str2, zk2 zk2Var) throws Exception {
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0(str);
        try {
            bl2VarA0.e(1, j);
            bl2VarA0.D(2, str2);
            bl2VarA0.R();
            return mf3.a;
        } finally {
            bl2VarA0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 deleteLocationWifi$lambda$34(String str, long j, String str2, zk2 zk2Var) throws Exception {
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0(str);
        try {
            bl2VarA0.e(1, j);
            bl2VarA0.D(2, str2);
            bl2VarA0.R();
            return mf3.a;
        } finally {
            bl2VarA0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 deleteLocations$lambda$33(String str, List list, zk2 zk2Var) throws Exception {
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0(str);
        try {
            Iterator it = list.iterator();
            int i = 1;
            while (it.hasNext()) {
                bl2VarA0.e(i, ((Number) it.next()).longValue());
                i++;
            }
            bl2VarA0.R();
            return mf3.a;
        } finally {
            bl2VarA0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocationRecord findLocationByCoordinates$lambda$14(String str, double d, double d2, double d3, zk2 zk2Var) throws Exception {
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0(str);
        try {
            bl2VarA0.a(d, 1);
            bl2VarA0.a(d2, 2);
            bl2VarA0.a(d3, 3);
            bl2VarA0.a(d2, 4);
            int iJ = wc0.J(bl2VarA0, "id");
            int iJ2 = wc0.J(bl2VarA0, "lat");
            int iJ3 = wc0.J(bl2VarA0, "lng");
            int iJ4 = wc0.J(bl2VarA0, "timestamp");
            int iJ5 = wc0.J(bl2VarA0, "placeName");
            int iJ6 = wc0.J(bl2VarA0, "remark");
            int iJ7 = wc0.J(bl2VarA0, "selectedWifiBssid");
            int iJ8 = wc0.J(bl2VarA0, "selectedBluetoothAddress");
            int iJ9 = wc0.J(bl2VarA0, "selectedCellKey");
            int iJ10 = wc0.J(bl2VarA0, "collectionRouteId");
            int iJ11 = wc0.J(bl2VarA0, "syncId");
            LocationRecord locationRecord = null;
            if (bl2VarA0.R()) {
                locationRecord = new LocationRecord(bl2VarA0.getLong(iJ), bl2VarA0.getDouble(iJ2), bl2VarA0.getDouble(iJ3), bl2VarA0.getLong(iJ4), bl2VarA0.m(iJ5), bl2VarA0.m(iJ6), bl2VarA0.isNull(iJ7) ? null : bl2VarA0.m(iJ7), bl2VarA0.isNull(iJ8) ? null : bl2VarA0.m(iJ8), bl2VarA0.isNull(iJ9) ? null : bl2VarA0.m(iJ9), bl2VarA0.isNull(iJ10) ? null : Long.valueOf(bl2VarA0.getLong(iJ10)), bl2VarA0.m(iJ11));
            }
            return locationRecord;
        } finally {
            bl2VarA0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getAllCompleteLocations$lambda$20(String str, EnvironmentDao_Impl environmentDao_Impl, zk2 zk2Var) throws Exception {
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0(str);
        try {
            int iJ = wc0.J(bl2VarA0, "id");
            int iJ2 = wc0.J(bl2VarA0, "lat");
            int iJ3 = wc0.J(bl2VarA0, "lng");
            int iJ4 = wc0.J(bl2VarA0, "timestamp");
            int iJ5 = wc0.J(bl2VarA0, "placeName");
            int iJ6 = wc0.J(bl2VarA0, "remark");
            int iJ7 = wc0.J(bl2VarA0, "selectedWifiBssid");
            int iJ8 = wc0.J(bl2VarA0, "selectedBluetoothAddress");
            int iJ9 = wc0.J(bl2VarA0, "selectedCellKey");
            int iJ10 = wc0.J(bl2VarA0, "collectionRouteId");
            int iJ11 = wc0.J(bl2VarA0, "syncId");
            Object obj = null;
            zj1 zj1Var = new zj1(obj);
            int i = iJ11;
            zj1 zj1Var2 = new zj1(obj);
            int i2 = iJ10;
            zj1 zj1Var3 = new zj1(obj);
            int i3 = iJ9;
            zj1 zj1Var4 = new zj1(obj);
            while (bl2VarA0.R()) {
                int i4 = iJ7;
                int i5 = iJ8;
                zj1Var.g(bl2VarA0.getLong(iJ), obj);
                long j = bl2VarA0.getLong(iJ);
                if (!zj1Var2.b(j)) {
                    zj1Var2.g(j, new ArrayList());
                }
                long j2 = bl2VarA0.getLong(iJ);
                if (!zj1Var3.b(j2)) {
                    zj1Var3.g(j2, new ArrayList());
                }
                long j3 = bl2VarA0.getLong(iJ);
                if (!zj1Var4.b(j3)) {
                    zj1Var4.g(j3, new ArrayList());
                }
                iJ7 = i4;
                iJ8 = i5;
                obj = null;
            }
            int i6 = iJ7;
            int i7 = iJ8;
            bl2VarA0.reset();
            environmentDao_Impl.__fetchRelationshiplocationConnectedWifiAscomVincenthzrLocationspooferDataDbLocationConnectedWifi(zk2Var, zj1Var);
            environmentDao_Impl.__fetchRelationshiplocationWifiAscomVincenthzrLocationspooferDataDbLocationWithWifi(zk2Var, zj1Var2);
            environmentDao_Impl.__fetchRelationshiplocationBluetoothAscomVincenthzrLocationspooferDataDbLocationWithBluetooth(zk2Var, zj1Var3);
            environmentDao_Impl.__fetchRelationshiplocationCellsAscomVincenthzrLocationspooferDataDbLocationWithCell(zk2Var, zj1Var4);
            ArrayList arrayList = new ArrayList();
            while (bl2VarA0.R()) {
                long j4 = bl2VarA0.getLong(iJ);
                double d = bl2VarA0.getDouble(iJ2);
                double d2 = bl2VarA0.getDouble(iJ3);
                long j5 = bl2VarA0.getLong(iJ4);
                String strM = bl2VarA0.m(iJ5);
                String strM2 = bl2VarA0.m(iJ6);
                int i8 = i6;
                String strM3 = bl2VarA0.isNull(i8) ? null : bl2VarA0.m(i8);
                int i9 = i7;
                int i10 = i3;
                int i11 = i2;
                i6 = i8;
                int i12 = i;
                LocationRecord locationRecord = new LocationRecord(j4, d, d2, j5, strM, strM2, strM3, bl2VarA0.isNull(i9) ? null : bl2VarA0.m(i9), bl2VarA0.isNull(i10) ? null : bl2VarA0.m(i10), bl2VarA0.isNull(i11) ? null : Long.valueOf(bl2VarA0.getLong(i11)), bl2VarA0.m(i12));
                int i13 = iJ2;
                int i14 = iJ3;
                LocationConnectedWifi locationConnectedWifi = (LocationConnectedWifi) zj1Var.c(bl2VarA0.getLong(iJ));
                Object objC = zj1Var2.c(bl2VarA0.getLong(iJ));
                if (objC == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                List list = (List) objC;
                int i15 = iJ4;
                int i16 = iJ5;
                Object objC2 = zj1Var3.c(bl2VarA0.getLong(iJ));
                if (objC2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                List list2 = (List) objC2;
                Object objC3 = zj1Var4.c(bl2VarA0.getLong(iJ));
                if (objC3 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                arrayList.add(new CompleteLocation(locationRecord, locationConnectedWifi, list, list2, (List) objC3));
                iJ4 = i15;
                i7 = i9;
                iJ3 = i14;
                iJ5 = i16;
                iJ2 = i13;
                i = i12;
                i3 = i10;
                i2 = i11;
            }
            bl2VarA0.close();
            return arrayList;
        } catch (Throwable th) {
            bl2VarA0.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getAllLocations$lambda$19(String str, zk2 zk2Var) throws Exception {
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0(str);
        try {
            int iJ = wc0.J(bl2VarA0, "id");
            int iJ2 = wc0.J(bl2VarA0, "lat");
            int iJ3 = wc0.J(bl2VarA0, "lng");
            int iJ4 = wc0.J(bl2VarA0, "timestamp");
            int iJ5 = wc0.J(bl2VarA0, "placeName");
            int iJ6 = wc0.J(bl2VarA0, "remark");
            int iJ7 = wc0.J(bl2VarA0, "selectedWifiBssid");
            int iJ8 = wc0.J(bl2VarA0, "selectedBluetoothAddress");
            int iJ9 = wc0.J(bl2VarA0, "selectedCellKey");
            int iJ10 = wc0.J(bl2VarA0, "collectionRouteId");
            int iJ11 = wc0.J(bl2VarA0, "syncId");
            ArrayList arrayList = new ArrayList();
            while (bl2VarA0.R()) {
                arrayList.add(new LocationRecord(bl2VarA0.getLong(iJ), bl2VarA0.getDouble(iJ2), bl2VarA0.getDouble(iJ3), bl2VarA0.getLong(iJ4), bl2VarA0.m(iJ5), bl2VarA0.m(iJ6), bl2VarA0.isNull(iJ7) ? null : bl2VarA0.m(iJ7), bl2VarA0.isNull(iJ8) ? null : bl2VarA0.m(iJ8), bl2VarA0.isNull(iJ9) ? null : bl2VarA0.m(iJ9), bl2VarA0.isNull(iJ10) ? null : Long.valueOf(bl2VarA0.getLong(iJ10)), bl2VarA0.m(iJ11)));
            }
            return arrayList;
        } finally {
            bl2VarA0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CompleteCollectionRoute getCollectionRoute$lambda$18(String str, long j, EnvironmentDao_Impl environmentDao_Impl, zk2 zk2Var) throws Exception {
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0(str);
        try {
            bl2VarA0.e(1, j);
            int iJ = wc0.J(bl2VarA0, "id");
            int iJ2 = wc0.J(bl2VarA0, "name");
            int iJ3 = wc0.J(bl2VarA0, "remark");
            int iJ4 = wc0.J(bl2VarA0, "pointsJson");
            int iJ5 = wc0.J(bl2VarA0, "halfWidthM");
            int iJ6 = wc0.J(bl2VarA0, "timestamp");
            int iJ7 = wc0.J(bl2VarA0, "syncId");
            CompleteCollectionRoute completeCollectionRoute = null;
            zj1 zj1Var = new zj1(completeCollectionRoute);
            while (bl2VarA0.R()) {
                long j2 = bl2VarA0.getLong(iJ);
                if (!zj1Var.b(j2)) {
                    zj1Var.g(j2, new ArrayList());
                }
            }
            bl2VarA0.reset();
            environmentDao_Impl.__fetchRelationshiplocationRecordsAscomVincenthzrLocationspooferDataDbCompleteLocation(zk2Var, zj1Var);
            if (bl2VarA0.R()) {
                CollectionRouteRecord collectionRouteRecord = new CollectionRouteRecord(bl2VarA0.getLong(iJ), bl2VarA0.m(iJ2), bl2VarA0.m(iJ3), bl2VarA0.m(iJ4), bl2VarA0.getDouble(iJ5), bl2VarA0.getLong(iJ6), bl2VarA0.m(iJ7));
                Object objC = zj1Var.c(bl2VarA0.getLong(iJ));
                if (objC == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                completeCollectionRoute = new CompleteCollectionRoute(collectionRouteRecord, (List) objC);
            }
            bl2VarA0.close();
            return completeCollectionRoute;
        } catch (Throwable th) {
            bl2VarA0.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getCollectionRoutes$lambda$17(String str, EnvironmentDao_Impl environmentDao_Impl, zk2 zk2Var) throws Exception {
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0(str);
        try {
            int iJ = wc0.J(bl2VarA0, "id");
            int iJ2 = wc0.J(bl2VarA0, "name");
            int iJ3 = wc0.J(bl2VarA0, "remark");
            int iJ4 = wc0.J(bl2VarA0, "pointsJson");
            int iJ5 = wc0.J(bl2VarA0, "halfWidthM");
            int iJ6 = wc0.J(bl2VarA0, "timestamp");
            int iJ7 = wc0.J(bl2VarA0, "syncId");
            zj1 zj1Var = new zj1((Object) null);
            while (bl2VarA0.R()) {
                long j = bl2VarA0.getLong(iJ);
                if (!zj1Var.b(j)) {
                    zj1Var.g(j, new ArrayList());
                }
            }
            bl2VarA0.reset();
            environmentDao_Impl.__fetchRelationshiplocationRecordsAscomVincenthzrLocationspooferDataDbCompleteLocation(zk2Var, zj1Var);
            ArrayList arrayList = new ArrayList();
            while (bl2VarA0.R()) {
                CollectionRouteRecord collectionRouteRecord = new CollectionRouteRecord(bl2VarA0.getLong(iJ), bl2VarA0.m(iJ2), bl2VarA0.m(iJ3), bl2VarA0.m(iJ4), bl2VarA0.getDouble(iJ5), bl2VarA0.getLong(iJ6), bl2VarA0.m(iJ7));
                Object objC = zj1Var.c(bl2VarA0.getLong(iJ));
                if (objC == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                arrayList.add(new CompleteCollectionRoute(collectionRouteRecord, (List) objC));
            }
            bl2VarA0.close();
            return arrayList;
        } catch (Throwable th) {
            bl2VarA0.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CompleteLocation getCompleteLocationById$lambda$13(String str, long j, EnvironmentDao_Impl environmentDao_Impl, zk2 zk2Var) throws Exception {
        CompleteLocation completeLocation;
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0(str);
        try {
            bl2VarA0.e(1, j);
            int iJ = wc0.J(bl2VarA0, "id");
            int iJ2 = wc0.J(bl2VarA0, "lat");
            int iJ3 = wc0.J(bl2VarA0, "lng");
            int iJ4 = wc0.J(bl2VarA0, "timestamp");
            int iJ5 = wc0.J(bl2VarA0, "placeName");
            int iJ6 = wc0.J(bl2VarA0, "remark");
            int iJ7 = wc0.J(bl2VarA0, "selectedWifiBssid");
            int iJ8 = wc0.J(bl2VarA0, "selectedBluetoothAddress");
            int iJ9 = wc0.J(bl2VarA0, "selectedCellKey");
            int iJ10 = wc0.J(bl2VarA0, "collectionRouteId");
            int iJ11 = wc0.J(bl2VarA0, "syncId");
            Object obj = null;
            zj1 zj1Var = new zj1(obj);
            zj1 zj1Var2 = new zj1(obj);
            zj1 zj1Var3 = new zj1(obj);
            zj1 zj1Var4 = new zj1(obj);
            while (bl2VarA0.R()) {
                int i = iJ7;
                int i2 = iJ8;
                zj1Var.g(bl2VarA0.getLong(iJ), obj);
                long j2 = bl2VarA0.getLong(iJ);
                if (!zj1Var2.b(j2)) {
                    zj1Var2.g(j2, new ArrayList());
                }
                long j3 = bl2VarA0.getLong(iJ);
                if (!zj1Var3.b(j3)) {
                    zj1Var3.g(j3, new ArrayList());
                }
                long j4 = bl2VarA0.getLong(iJ);
                if (!zj1Var4.b(j4)) {
                    zj1Var4.g(j4, new ArrayList());
                }
                iJ7 = i;
                iJ8 = i2;
                obj = null;
            }
            int i3 = iJ7;
            int i4 = iJ8;
            bl2VarA0.reset();
            environmentDao_Impl.__fetchRelationshiplocationConnectedWifiAscomVincenthzrLocationspooferDataDbLocationConnectedWifi(zk2Var, zj1Var);
            environmentDao_Impl.__fetchRelationshiplocationWifiAscomVincenthzrLocationspooferDataDbLocationWithWifi(zk2Var, zj1Var2);
            environmentDao_Impl.__fetchRelationshiplocationBluetoothAscomVincenthzrLocationspooferDataDbLocationWithBluetooth(zk2Var, zj1Var3);
            environmentDao_Impl.__fetchRelationshiplocationCellsAscomVincenthzrLocationspooferDataDbLocationWithCell(zk2Var, zj1Var4);
            if (bl2VarA0.R()) {
                LocationRecord locationRecord = new LocationRecord(bl2VarA0.getLong(iJ), bl2VarA0.getDouble(iJ2), bl2VarA0.getDouble(iJ3), bl2VarA0.getLong(iJ4), bl2VarA0.m(iJ5), bl2VarA0.m(iJ6), bl2VarA0.isNull(i3) ? null : bl2VarA0.m(i3), bl2VarA0.isNull(i4) ? null : bl2VarA0.m(i4), bl2VarA0.isNull(iJ9) ? null : bl2VarA0.m(iJ9), bl2VarA0.isNull(iJ10) ? null : Long.valueOf(bl2VarA0.getLong(iJ10)), bl2VarA0.m(iJ11));
                LocationConnectedWifi locationConnectedWifi = (LocationConnectedWifi) zj1Var.c(bl2VarA0.getLong(iJ));
                Object objC = zj1Var2.c(bl2VarA0.getLong(iJ));
                if (objC == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                List list = (List) objC;
                Object objC2 = zj1Var3.c(bl2VarA0.getLong(iJ));
                if (objC2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                List list2 = (List) objC2;
                Object objC3 = zj1Var4.c(bl2VarA0.getLong(iJ));
                if (objC3 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                completeLocation = new CompleteLocation(locationRecord, locationConnectedWifi, list, list2, (List) objC3);
            } else {
                completeLocation = null;
            }
            bl2VarA0.close();
            return completeLocation;
        } catch (Throwable th) {
            bl2VarA0.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getCompleteLocationsInBounds$lambda$12(String str, double d, double d2, double d3, double d4, int i, EnvironmentDao_Impl environmentDao_Impl, zk2 zk2Var) throws Exception {
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0(str);
        try {
            bl2VarA0.a(d, 1);
            bl2VarA0.a(d2, 2);
            bl2VarA0.a(d3, 3);
            bl2VarA0.a(d4, 4);
            bl2VarA0.e(5, i);
            int iJ = wc0.J(bl2VarA0, "id");
            int iJ2 = wc0.J(bl2VarA0, "lat");
            int iJ3 = wc0.J(bl2VarA0, "lng");
            int iJ4 = wc0.J(bl2VarA0, "timestamp");
            int iJ5 = wc0.J(bl2VarA0, "placeName");
            int iJ6 = wc0.J(bl2VarA0, "remark");
            int iJ7 = wc0.J(bl2VarA0, "selectedWifiBssid");
            int iJ8 = wc0.J(bl2VarA0, "selectedBluetoothAddress");
            int iJ9 = wc0.J(bl2VarA0, "selectedCellKey");
            int iJ10 = wc0.J(bl2VarA0, "collectionRouteId");
            int iJ11 = wc0.J(bl2VarA0, "syncId");
            Object obj = null;
            zj1 zj1Var = new zj1(obj);
            int i2 = iJ11;
            zj1 zj1Var2 = new zj1(obj);
            int i3 = iJ10;
            zj1 zj1Var3 = new zj1(obj);
            int i4 = iJ9;
            zj1 zj1Var4 = new zj1(obj);
            while (bl2VarA0.R()) {
                int i5 = iJ7;
                int i6 = iJ8;
                zj1Var.g(bl2VarA0.getLong(iJ), obj);
                long j = bl2VarA0.getLong(iJ);
                if (!zj1Var2.b(j)) {
                    zj1Var2.g(j, new ArrayList());
                }
                long j2 = bl2VarA0.getLong(iJ);
                if (!zj1Var3.b(j2)) {
                    zj1Var3.g(j2, new ArrayList());
                }
                long j3 = bl2VarA0.getLong(iJ);
                if (!zj1Var4.b(j3)) {
                    zj1Var4.g(j3, new ArrayList());
                }
                iJ7 = i5;
                iJ8 = i6;
                obj = null;
            }
            int i7 = iJ7;
            int i8 = iJ8;
            bl2VarA0.reset();
            environmentDao_Impl.__fetchRelationshiplocationConnectedWifiAscomVincenthzrLocationspooferDataDbLocationConnectedWifi(zk2Var, zj1Var);
            environmentDao_Impl.__fetchRelationshiplocationWifiAscomVincenthzrLocationspooferDataDbLocationWithWifi(zk2Var, zj1Var2);
            environmentDao_Impl.__fetchRelationshiplocationBluetoothAscomVincenthzrLocationspooferDataDbLocationWithBluetooth(zk2Var, zj1Var3);
            environmentDao_Impl.__fetchRelationshiplocationCellsAscomVincenthzrLocationspooferDataDbLocationWithCell(zk2Var, zj1Var4);
            ArrayList arrayList = new ArrayList();
            while (bl2VarA0.R()) {
                long j4 = bl2VarA0.getLong(iJ);
                double d5 = bl2VarA0.getDouble(iJ2);
                double d6 = bl2VarA0.getDouble(iJ3);
                long j5 = bl2VarA0.getLong(iJ4);
                String strM = bl2VarA0.m(iJ5);
                String strM2 = bl2VarA0.m(iJ6);
                int i9 = i7;
                String strM3 = bl2VarA0.isNull(i9) ? null : bl2VarA0.m(i9);
                int i10 = i8;
                int i11 = i4;
                int i12 = i3;
                i7 = i9;
                int i13 = i2;
                LocationRecord locationRecord = new LocationRecord(j4, d5, d6, j5, strM, strM2, strM3, bl2VarA0.isNull(i10) ? null : bl2VarA0.m(i10), bl2VarA0.isNull(i11) ? null : bl2VarA0.m(i11), bl2VarA0.isNull(i12) ? null : Long.valueOf(bl2VarA0.getLong(i12)), bl2VarA0.m(i13));
                int i14 = iJ2;
                int i15 = iJ3;
                LocationConnectedWifi locationConnectedWifi = (LocationConnectedWifi) zj1Var.c(bl2VarA0.getLong(iJ));
                Object objC = zj1Var2.c(bl2VarA0.getLong(iJ));
                if (objC == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                List list = (List) objC;
                int i16 = iJ4;
                int i17 = iJ5;
                Object objC2 = zj1Var3.c(bl2VarA0.getLong(iJ));
                if (objC2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                List list2 = (List) objC2;
                Object objC3 = zj1Var4.c(bl2VarA0.getLong(iJ));
                if (objC3 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                arrayList.add(new CompleteLocation(locationRecord, locationConnectedWifi, list, list2, (List) objC3));
                iJ2 = i14;
                iJ3 = i15;
                iJ4 = i16;
                iJ5 = i17;
                i2 = i13;
                i8 = i10;
                i4 = i11;
                i3 = i12;
            }
            bl2VarA0.close();
            return arrayList;
        } catch (Throwable th) {
            bl2VarA0.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getLocationsInBounds$lambda$15(String str, double d, double d2, double d3, double d4, zk2 zk2Var) throws Exception {
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0(str);
        try {
            bl2VarA0.a(d, 1);
            bl2VarA0.a(d2, 2);
            bl2VarA0.a(d3, 3);
            bl2VarA0.a(d4, 4);
            bl2VarA0.a(d3, 5);
            bl2VarA0.a(d4, 6);
            bl2VarA0.a(d3, 7);
            bl2VarA0.a(d4, 8);
            bl2VarA0.a(d3, 9);
            bl2VarA0.a(d4, 10);
            int iJ = wc0.J(bl2VarA0, "id");
            int iJ2 = wc0.J(bl2VarA0, "lat");
            int iJ3 = wc0.J(bl2VarA0, "lng");
            int iJ4 = wc0.J(bl2VarA0, "timestamp");
            int iJ5 = wc0.J(bl2VarA0, "placeName");
            int iJ6 = wc0.J(bl2VarA0, "remark");
            int iJ7 = wc0.J(bl2VarA0, "selectedWifiBssid");
            int iJ8 = wc0.J(bl2VarA0, "selectedBluetoothAddress");
            int iJ9 = wc0.J(bl2VarA0, "selectedCellKey");
            int iJ10 = wc0.J(bl2VarA0, "collectionRouteId");
            int iJ11 = wc0.J(bl2VarA0, "syncId");
            ArrayList arrayList = new ArrayList();
            while (bl2VarA0.R()) {
                arrayList.add(new LocationRecord(bl2VarA0.getLong(iJ), bl2VarA0.getDouble(iJ2), bl2VarA0.getDouble(iJ3), bl2VarA0.getLong(iJ4), bl2VarA0.m(iJ5), bl2VarA0.m(iJ6), bl2VarA0.isNull(iJ7) ? null : bl2VarA0.m(iJ7), bl2VarA0.isNull(iJ8) ? null : bl2VarA0.m(iJ8), bl2VarA0.isNull(iJ9) ? null : bl2VarA0.m(iJ9), bl2VarA0.isNull(iJ10) ? null : Long.valueOf(bl2VarA0.getLong(iJ10)), bl2VarA0.m(iJ11)));
            }
            return arrayList;
        } finally {
            bl2VarA0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getNearestLocations$lambda$11(String str, double d, double d2, int i, EnvironmentDao_Impl environmentDao_Impl, zk2 zk2Var) throws Exception {
        Long lValueOf;
        int i2;
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0(str);
        try {
            bl2VarA0.a(d, 1);
            bl2VarA0.a(d, 2);
            bl2VarA0.a(d2, 3);
            bl2VarA0.a(d2, 4);
            bl2VarA0.e(5, i);
            int iJ = wc0.J(bl2VarA0, "id");
            int iJ2 = wc0.J(bl2VarA0, "lat");
            int iJ3 = wc0.J(bl2VarA0, "lng");
            int iJ4 = wc0.J(bl2VarA0, "timestamp");
            int iJ5 = wc0.J(bl2VarA0, "placeName");
            int iJ6 = wc0.J(bl2VarA0, "remark");
            int iJ7 = wc0.J(bl2VarA0, "selectedWifiBssid");
            int iJ8 = wc0.J(bl2VarA0, "selectedBluetoothAddress");
            int iJ9 = wc0.J(bl2VarA0, "selectedCellKey");
            int iJ10 = wc0.J(bl2VarA0, "collectionRouteId");
            int iJ11 = wc0.J(bl2VarA0, "syncId");
            Object obj = null;
            zj1 zj1Var = new zj1(obj);
            int i3 = iJ11;
            zj1 zj1Var2 = new zj1(obj);
            int i4 = iJ10;
            zj1 zj1Var3 = new zj1(obj);
            int i5 = iJ9;
            zj1 zj1Var4 = new zj1(obj);
            while (bl2VarA0.R()) {
                int i6 = iJ7;
                int i7 = iJ8;
                zj1Var.g(bl2VarA0.getLong(iJ), obj);
                long j = bl2VarA0.getLong(iJ);
                if (!zj1Var2.b(j)) {
                    zj1Var2.g(j, new ArrayList());
                }
                long j2 = bl2VarA0.getLong(iJ);
                if (!zj1Var3.b(j2)) {
                    zj1Var3.g(j2, new ArrayList());
                }
                long j3 = bl2VarA0.getLong(iJ);
                if (!zj1Var4.b(j3)) {
                    zj1Var4.g(j3, new ArrayList());
                }
                iJ7 = i6;
                iJ8 = i7;
                obj = null;
            }
            int i8 = iJ7;
            int i9 = iJ8;
            bl2VarA0.reset();
            environmentDao_Impl.__fetchRelationshiplocationConnectedWifiAscomVincenthzrLocationspooferDataDbLocationConnectedWifi(zk2Var, zj1Var);
            environmentDao_Impl.__fetchRelationshiplocationWifiAscomVincenthzrLocationspooferDataDbLocationWithWifi(zk2Var, zj1Var2);
            environmentDao_Impl.__fetchRelationshiplocationBluetoothAscomVincenthzrLocationspooferDataDbLocationWithBluetooth(zk2Var, zj1Var3);
            environmentDao_Impl.__fetchRelationshiplocationCellsAscomVincenthzrLocationspooferDataDbLocationWithCell(zk2Var, zj1Var4);
            ArrayList arrayList = new ArrayList();
            while (bl2VarA0.R()) {
                long j4 = bl2VarA0.getLong(iJ);
                double d3 = bl2VarA0.getDouble(iJ2);
                double d4 = bl2VarA0.getDouble(iJ3);
                long j5 = bl2VarA0.getLong(iJ4);
                String strM = bl2VarA0.m(iJ5);
                String strM2 = bl2VarA0.m(iJ6);
                int i10 = i8;
                String strM3 = bl2VarA0.isNull(i10) ? null : bl2VarA0.m(i10);
                int i11 = i9;
                String strM4 = bl2VarA0.isNull(i11) ? null : bl2VarA0.m(i11);
                int i12 = i5;
                String strM5 = bl2VarA0.isNull(i12) ? null : bl2VarA0.m(i12);
                int i13 = i4;
                if (bl2VarA0.isNull(i13)) {
                    i2 = iJ2;
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(bl2VarA0.getLong(i13));
                    i2 = iJ2;
                }
                LocationRecord locationRecord = new LocationRecord(j4, d3, d4, j5, strM, strM2, strM3, strM4, strM5, lValueOf, bl2VarA0.m(i3));
                int i14 = i3;
                int i15 = iJ3;
                LocationConnectedWifi locationConnectedWifi = (LocationConnectedWifi) zj1Var.c(bl2VarA0.getLong(iJ));
                Object objC = zj1Var2.c(bl2VarA0.getLong(iJ));
                if (objC == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                List list = (List) objC;
                int i16 = iJ5;
                int i17 = iJ6;
                Object objC2 = zj1Var3.c(bl2VarA0.getLong(iJ));
                if (objC2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                List list2 = (List) objC2;
                Object objC3 = zj1Var4.c(bl2VarA0.getLong(iJ));
                if (objC3 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                arrayList.add(new CompleteLocation(locationRecord, locationConnectedWifi, list, list2, (List) objC3));
                iJ2 = i2;
                iJ3 = i15;
                iJ5 = i16;
                iJ6 = i17;
                i8 = i10;
                i9 = i11;
                i5 = i12;
                i3 = i14;
                i4 = i13;
            }
            bl2VarA0.close();
            return arrayList;
        } catch (Throwable th) {
            bl2VarA0.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getRecordCount$lambda$22(String str, zk2 zk2Var) throws Exception {
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0(str);
        try {
            return bl2VarA0.R() ? (int) bl2VarA0.getLong(0) : 0;
        } finally {
            bl2VarA0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 insertBluetoothDevice$lambda$9(EnvironmentDao_Impl environmentDao_Impl, BluetoothDevice bluetoothDevice, zk2 zk2Var) {
        zk2Var.getClass();
        environmentDao_Impl.__upsertAdapterOfBluetoothDevice.a(zk2Var, bluetoothDevice);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 insertCellDevice$lambda$10(EnvironmentDao_Impl environmentDao_Impl, CellDevice cellDevice, zk2 zk2Var) {
        zk2Var.getClass();
        environmentDao_Impl.__upsertAdapterOfCellDevice.a(zk2Var, cellDevice);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long insertCollectionRoute$lambda$5(EnvironmentDao_Impl environmentDao_Impl, CollectionRouteRecord collectionRouteRecord, zk2 zk2Var) {
        zk2Var.getClass();
        return environmentDao_Impl.__insertAdapterOfCollectionRouteRecord.insertAndReturnId(zk2Var, collectionRouteRecord);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 insertConnectedWifi$lambda$1(EnvironmentDao_Impl environmentDao_Impl, LocationConnectedWifi locationConnectedWifi, zk2 zk2Var) {
        zk2Var.getClass();
        environmentDao_Impl.__insertAdapterOfLocationConnectedWifi.insert(zk2Var, locationConnectedWifi);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long insertLocation$lambda$0(EnvironmentDao_Impl environmentDao_Impl, LocationRecord locationRecord, zk2 zk2Var) {
        zk2Var.getClass();
        return environmentDao_Impl.__insertAdapterOfLocationRecord.insertAndReturnId(zk2Var, locationRecord);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 insertLocationBluetooth$lambda$3(EnvironmentDao_Impl environmentDao_Impl, LocationBluetooth locationBluetooth, zk2 zk2Var) {
        zk2Var.getClass();
        environmentDao_Impl.__insertAdapterOfLocationBluetooth.insert(zk2Var, locationBluetooth);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 insertLocationCell$lambda$4(EnvironmentDao_Impl environmentDao_Impl, LocationCell locationCell, zk2 zk2Var) {
        zk2Var.getClass();
        environmentDao_Impl.__insertAdapterOfLocationCell.insert(zk2Var, locationCell);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 insertLocationWifi$lambda$2(EnvironmentDao_Impl environmentDao_Impl, LocationWifi locationWifi, zk2 zk2Var) {
        zk2Var.getClass();
        environmentDao_Impl.__insertAdapterOfLocationWifi.insert(zk2Var, locationWifi);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 insertWifiDevice$lambda$8(EnvironmentDao_Impl environmentDao_Impl, WifiDevice wifiDevice, zk2 zk2Var) {
        zk2Var.getClass();
        environmentDao_Impl.__upsertAdapterOfWifiDevice.a(zk2Var, wifiDevice);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List observeAllCompleteLocations$lambda$21(String str, EnvironmentDao_Impl environmentDao_Impl, zk2 zk2Var) throws Exception {
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0(str);
        try {
            int iJ = wc0.J(bl2VarA0, "id");
            int iJ2 = wc0.J(bl2VarA0, "lat");
            int iJ3 = wc0.J(bl2VarA0, "lng");
            int iJ4 = wc0.J(bl2VarA0, "timestamp");
            int iJ5 = wc0.J(bl2VarA0, "placeName");
            int iJ6 = wc0.J(bl2VarA0, "remark");
            int iJ7 = wc0.J(bl2VarA0, "selectedWifiBssid");
            int iJ8 = wc0.J(bl2VarA0, "selectedBluetoothAddress");
            int iJ9 = wc0.J(bl2VarA0, "selectedCellKey");
            int iJ10 = wc0.J(bl2VarA0, "collectionRouteId");
            int iJ11 = wc0.J(bl2VarA0, "syncId");
            Object obj = null;
            zj1 zj1Var = new zj1(obj);
            int i = iJ11;
            zj1 zj1Var2 = new zj1(obj);
            int i2 = iJ10;
            zj1 zj1Var3 = new zj1(obj);
            int i3 = iJ9;
            zj1 zj1Var4 = new zj1(obj);
            while (bl2VarA0.R()) {
                int i4 = iJ7;
                int i5 = iJ8;
                zj1Var.g(bl2VarA0.getLong(iJ), obj);
                long j = bl2VarA0.getLong(iJ);
                if (!zj1Var2.b(j)) {
                    zj1Var2.g(j, new ArrayList());
                }
                long j2 = bl2VarA0.getLong(iJ);
                if (!zj1Var3.b(j2)) {
                    zj1Var3.g(j2, new ArrayList());
                }
                long j3 = bl2VarA0.getLong(iJ);
                if (!zj1Var4.b(j3)) {
                    zj1Var4.g(j3, new ArrayList());
                }
                iJ7 = i4;
                iJ8 = i5;
                obj = null;
            }
            int i6 = iJ7;
            int i7 = iJ8;
            bl2VarA0.reset();
            environmentDao_Impl.__fetchRelationshiplocationConnectedWifiAscomVincenthzrLocationspooferDataDbLocationConnectedWifi(zk2Var, zj1Var);
            environmentDao_Impl.__fetchRelationshiplocationWifiAscomVincenthzrLocationspooferDataDbLocationWithWifi(zk2Var, zj1Var2);
            environmentDao_Impl.__fetchRelationshiplocationBluetoothAscomVincenthzrLocationspooferDataDbLocationWithBluetooth(zk2Var, zj1Var3);
            environmentDao_Impl.__fetchRelationshiplocationCellsAscomVincenthzrLocationspooferDataDbLocationWithCell(zk2Var, zj1Var4);
            ArrayList arrayList = new ArrayList();
            while (bl2VarA0.R()) {
                long j4 = bl2VarA0.getLong(iJ);
                double d = bl2VarA0.getDouble(iJ2);
                double d2 = bl2VarA0.getDouble(iJ3);
                long j5 = bl2VarA0.getLong(iJ4);
                String strM = bl2VarA0.m(iJ5);
                String strM2 = bl2VarA0.m(iJ6);
                int i8 = i6;
                String strM3 = bl2VarA0.isNull(i8) ? null : bl2VarA0.m(i8);
                int i9 = i7;
                int i10 = i3;
                int i11 = i2;
                i6 = i8;
                int i12 = i;
                LocationRecord locationRecord = new LocationRecord(j4, d, d2, j5, strM, strM2, strM3, bl2VarA0.isNull(i9) ? null : bl2VarA0.m(i9), bl2VarA0.isNull(i10) ? null : bl2VarA0.m(i10), bl2VarA0.isNull(i11) ? null : Long.valueOf(bl2VarA0.getLong(i11)), bl2VarA0.m(i12));
                int i13 = iJ2;
                int i14 = iJ3;
                LocationConnectedWifi locationConnectedWifi = (LocationConnectedWifi) zj1Var.c(bl2VarA0.getLong(iJ));
                Object objC = zj1Var2.c(bl2VarA0.getLong(iJ));
                if (objC == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                List list = (List) objC;
                int i15 = iJ4;
                int i16 = iJ5;
                Object objC2 = zj1Var3.c(bl2VarA0.getLong(iJ));
                if (objC2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                List list2 = (List) objC2;
                Object objC3 = zj1Var4.c(bl2VarA0.getLong(iJ));
                if (objC3 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                arrayList.add(new CompleteLocation(locationRecord, locationConnectedWifi, list, list2, (List) objC3));
                iJ4 = i15;
                i7 = i9;
                iJ3 = i14;
                iJ5 = i16;
                iJ2 = i13;
                i = i12;
                i3 = i10;
                i2 = i11;
            }
            bl2VarA0.close();
            return arrayList;
        } catch (Throwable th) {
            bl2VarA0.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List observeCollectionRoutes$lambda$16(String str, EnvironmentDao_Impl environmentDao_Impl, zk2 zk2Var) throws Exception {
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0(str);
        try {
            int iJ = wc0.J(bl2VarA0, "id");
            int iJ2 = wc0.J(bl2VarA0, "name");
            int iJ3 = wc0.J(bl2VarA0, "remark");
            int iJ4 = wc0.J(bl2VarA0, "pointsJson");
            int iJ5 = wc0.J(bl2VarA0, "halfWidthM");
            int iJ6 = wc0.J(bl2VarA0, "timestamp");
            int iJ7 = wc0.J(bl2VarA0, "syncId");
            zj1 zj1Var = new zj1((Object) null);
            while (bl2VarA0.R()) {
                long j = bl2VarA0.getLong(iJ);
                if (!zj1Var.b(j)) {
                    zj1Var.g(j, new ArrayList());
                }
            }
            bl2VarA0.reset();
            environmentDao_Impl.__fetchRelationshiplocationRecordsAscomVincenthzrLocationspooferDataDbCompleteLocation(zk2Var, zj1Var);
            ArrayList arrayList = new ArrayList();
            while (bl2VarA0.R()) {
                CollectionRouteRecord collectionRouteRecord = new CollectionRouteRecord(bl2VarA0.getLong(iJ), bl2VarA0.m(iJ2), bl2VarA0.m(iJ3), bl2VarA0.m(iJ4), bl2VarA0.getDouble(iJ5), bl2VarA0.getLong(iJ6), bl2VarA0.m(iJ7));
                Object objC = zj1Var.c(bl2VarA0.getLong(iJ));
                if (objC == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                arrayList.add(new CompleteCollectionRoute(collectionRouteRecord, (List) objC));
            }
            bl2VarA0.close();
            return arrayList;
        } catch (Throwable th) {
            bl2VarA0.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 updateBasicInfo$lambda$29(String str, String str2, String str3, long j, zk2 zk2Var) throws Exception {
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0(str);
        try {
            bl2VarA0.D(1, str2);
            bl2VarA0.D(2, str3);
            bl2VarA0.e(3, j);
            bl2VarA0.R();
            return mf3.a;
        } finally {
            bl2VarA0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 updateCollectionRouteInfo$lambda$26(String str, String str2, String str3, long j, zk2 zk2Var) throws Exception {
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0(str);
        try {
            bl2VarA0.D(1, str2);
            bl2VarA0.D(2, str3);
            bl2VarA0.e(3, j);
            bl2VarA0.R();
            return mf3.a;
        } finally {
            bl2VarA0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 updateCollectionTimestamp$lambda$28(String str, long j, long j2, zk2 zk2Var) throws Exception {
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0(str);
        try {
            bl2VarA0.e(1, j);
            bl2VarA0.e(2, j2);
            bl2VarA0.R();
            return mf3.a;
        } finally {
            bl2VarA0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 updateCoordinates$lambda$42(String str, double d, double d2, long j, zk2 zk2Var) throws Exception {
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0(str);
        try {
            bl2VarA0.a(d, 1);
            bl2VarA0.a(d2, 2);
            bl2VarA0.e(3, j);
            bl2VarA0.R();
            return mf3.a;
        } finally {
            bl2VarA0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 updateMetadata$lambda$41(String str, double d, double d2, String str2, String str3, String str4, String str5, String str6, long j, zk2 zk2Var) throws Exception {
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0(str);
        try {
            bl2VarA0.a(d, 1);
            bl2VarA0.a(d2, 2);
            bl2VarA0.D(3, str2);
            bl2VarA0.D(4, str3);
            if (str4 == null) {
                bl2VarA0.b(5);
            } else {
                bl2VarA0.D(5, str4);
            }
            if (str5 == null) {
                bl2VarA0.b(6);
            } else {
                bl2VarA0.D(6, str5);
            }
            if (str6 == null) {
                bl2VarA0.b(7);
            } else {
                bl2VarA0.D(7, str6);
            }
            bl2VarA0.e(8, j);
            bl2VarA0.R();
            return mf3.a;
        } finally {
            bl2VarA0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 updateSelectedBluetooth$lambda$40(String str, String str2, long j, zk2 zk2Var) throws Exception {
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0(str);
        try {
            if (str2 == null) {
                bl2VarA0.b(1);
            } else {
                bl2VarA0.D(1, str2);
            }
            bl2VarA0.e(2, j);
            bl2VarA0.R();
            bl2VarA0.close();
            return mf3.a;
        } catch (Throwable th) {
            bl2VarA0.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 updateSelectedCell$lambda$39(String str, String str2, long j, zk2 zk2Var) throws Exception {
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0(str);
        try {
            if (str2 == null) {
                bl2VarA0.b(1);
            } else {
                bl2VarA0.D(1, str2);
            }
            bl2VarA0.e(2, j);
            bl2VarA0.R();
            bl2VarA0.close();
            return mf3.a;
        } catch (Throwable th) {
            bl2VarA0.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 updateSelectedWifi$lambda$38(String str, String str2, long j, zk2 zk2Var) throws Exception {
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0(str);
        try {
            if (str2 == null) {
                bl2VarA0.b(1);
            } else {
                bl2VarA0.D(1, str2);
            }
            bl2VarA0.e(2, j);
            bl2VarA0.R();
            bl2VarA0.close();
            return mf3.a;
        } catch (Throwable th) {
            bl2VarA0.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 updateSyncCollectionRoute$lambda$7(EnvironmentDao_Impl environmentDao_Impl, CollectionRouteRecord collectionRouteRecord, zk2 zk2Var) {
        zk2Var.getClass();
        environmentDao_Impl.__updateAdapterOfCollectionRouteRecord.handle(zk2Var, collectionRouteRecord);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 updateSyncLocation$lambda$6(EnvironmentDao_Impl environmentDao_Impl, LocationRecord locationRecord, zk2 zk2Var) {
        zk2Var.getClass();
        environmentDao_Impl.__updateAdapterOfLocationRecord.handle(zk2Var, locationRecord);
        return mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object clearAll(q60 q60Var) {
        Object objX = ks.X(q60Var, new my(23), this.__db, false, true);
        return objX == z70.e ? objX : mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object clearCollectionRoutes(q60 q60Var) {
        Object objX = ks.X(q60Var, new my(25), this.__db, false, true);
        return objX == z70.e ? objX : mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object clearSyncBluetooth(long j, q60 q60Var) {
        Object objX = ks.X(q60Var, new ec(6, j), this.__db, false, true);
        return objX == z70.e ? objX : mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object clearSyncCells(long j, q60 q60Var) {
        Object objX = ks.X(q60Var, new ec(7, j), this.__db, false, true);
        return objX == z70.e ? objX : mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object clearSyncWifi(long j, q60 q60Var) {
        Object objX = ks.X(q60Var, new ec(9, j), this.__db, false, true);
        return objX == z70.e ? objX : mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object deleteCollectionRoute(long j, q60 q60Var) {
        Object objX = ks.X(q60Var, new ec(5, j), this.__db, false, true);
        return objX == z70.e ? objX : mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object deleteConnectedWifi(long j, q60 q60Var) {
        Object objX = ks.X(q60Var, new ec(8, j), this.__db, false, true);
        return objX == z70.e ? objX : mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object deleteLocation(long j, q60 q60Var) {
        Object objX = ks.X(q60Var, new ec(10, j), this.__db, false, true);
        return objX == z70.e ? objX : mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object deleteLocationBluetooth(long j, String str, q60 q60Var) {
        Object objX = ks.X(q60Var, new zk0(j, str, 5), this.__db, false, true);
        return objX == z70.e ? objX : mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object deleteLocationCell(long j, String str, q60 q60Var) {
        Object objX = ks.X(q60Var, new zk0(j, str, 4), this.__db, false, true);
        return objX == z70.e ? objX : mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object deleteLocationWifi(long j, String str, q60 q60Var) {
        Object objX = ks.X(q60Var, new zk0(j, str, 0), this.__db, false, true);
        return objX == z70.e ? objX : mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object deleteLocations(List<Long> list, q60 q60Var) {
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM location_records WHERE id IN (");
        ig0.i(sb, list.size());
        sb.append(")");
        Object objX = ks.X(q60Var, new j(16, sb.toString(), list), this.__db, false, true);
        return objX == z70.e ? objX : mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object findLocationByCoordinates(final double d, final double d2, final double d3, q60 q60Var) {
        return ks.X(q60Var, new lu0() { // from class: hl0
            @Override // defpackage.lu0
            public final Object invoke(Object obj) {
                return EnvironmentDao_Impl.findLocationByCoordinates$lambda$14("SELECT * FROM location_records WHERE collectionRouteId IS NULL AND abs(lat - ?) < ? AND abs(lng - ?) < ? ORDER BY timestamp DESC LIMIT 1", d, d3, d2, (zk2) obj);
            }
        }, this.__db, true, false);
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object findOrCreateCollectionLocation(double d, double d2, Long l, q60 q60Var) {
        return ks.V(q60Var, new C00752(d, d2, l, null), this.__db);
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object getAllCompleteLocations(q60 q60Var) {
        return ks.X(q60Var, new dl0(this, 3), this.__db, true, true);
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object getAllLocations(q60 q60Var) {
        return ks.X(q60Var, new my(26), this.__db, true, false);
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object getCollectionRoute(long j, q60 q60Var) {
        return ks.X(q60Var, new fl0(j, this, 0), this.__db, true, true);
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object getCollectionRoutes(q60 q60Var) {
        return ks.X(q60Var, new dl0(this, 2), this.__db, true, true);
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object getCompleteLocationById(long j, q60 q60Var) {
        return ks.X(q60Var, new fl0(j, this, 1), this.__db, true, true);
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object getCompleteLocationsInBounds(final double d, final double d2, final double d3, final double d4, final int i, q60 q60Var) {
        return ks.X(q60Var, new lu0() { // from class: el0
            @Override // defpackage.lu0
            public final Object invoke(Object obj) {
                return EnvironmentDao_Impl.getCompleteLocationsInBounds$lambda$12("\n        SELECT * FROM location_records \n        WHERE lat BETWEEN ? AND ? \n          AND lng BETWEEN ? AND ? \n        LIMIT ?\n    ", d, d2, d3, d4, i, this, (zk2) obj);
            }
        }, this.__db, true, true);
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object getLocationsInBounds(final double d, final double d2, final double d3, final double d4, q60 q60Var) {
        return ks.X(q60Var, new lu0() { // from class: al0
            @Override // defpackage.lu0
            public final Object invoke(Object obj) {
                return EnvironmentDao_Impl.getLocationsInBounds$lambda$15("\n        SELECT * FROM location_records\n        WHERE lat BETWEEN ? AND ? AND (\n            (? <= ? AND lng BETWEEN ? AND ?) OR\n            (? > ? AND (lng >= ? OR lng <= ?))\n        ) ORDER BY id\n    ", d, d2, d3, d4, (zk2) obj);
            }
        }, this.__db, true, false);
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object getNearestLocations(final double d, final double d2, final int i, q60 q60Var) {
        return ks.X(q60Var, new lu0() { // from class: gl0
            @Override // defpackage.lu0
            public final Object invoke(Object obj) {
                return EnvironmentDao_Impl.getNearestLocations$lambda$11("\n        SELECT * FROM location_records \n        ORDER BY ((lat - ?)*(lat - ?) + (lng - ?)*(lng - ?)) ASC \n        LIMIT ?\n    ", d, d2, i, this, (zk2) obj);
            }
        }, this.__db, true, true);
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object getRecordCount(q60 q60Var) {
        return ks.X(q60Var, new my(24), this.__db, true, false);
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object insertBluetoothDevice(BluetoothDevice bluetoothDevice, q60 q60Var) {
        Object objX = ks.X(q60Var, new j(17, this, bluetoothDevice), this.__db, false, true);
        return objX == z70.e ? objX : mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object insertCellDevice(CellDevice cellDevice, q60 q60Var) {
        Object objX = ks.X(q60Var, new j(18, this, cellDevice), this.__db, false, true);
        return objX == z70.e ? objX : mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object insertCollectionRoute(CollectionRouteRecord collectionRouteRecord, q60 q60Var) {
        return ks.X(q60Var, new xk0(this, collectionRouteRecord, 1), this.__db, false, true);
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object insertCompleteCollectionRoute(CompleteCollectionRoute completeCollectionRoute, q60 q60Var) {
        Object objV = ks.V(q60Var, new C00762(completeCollectionRoute, null), this.__db);
        return objV == z70.e ? objV : mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object insertCompleteLocationData(CompleteLocation completeLocation, Long l, q60 q60Var) {
        Object objV = ks.V(q60Var, new C00772(completeLocation, l, null), this.__db);
        return objV == z70.e ? objV : mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object insertConnectedWifi(LocationConnectedWifi locationConnectedWifi, q60 q60Var) {
        Object objX = ks.X(q60Var, new j(13, this, locationConnectedWifi), this.__db, false, true);
        return objX == z70.e ? objX : mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object insertLocation(LocationRecord locationRecord, q60 q60Var) {
        return ks.X(q60Var, new cl0(this, locationRecord, 0), this.__db, false, true);
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object insertLocationBluetooth(LocationBluetooth locationBluetooth, q60 q60Var) {
        Object objX = ks.X(q60Var, new j(15, this, locationBluetooth), this.__db, false, true);
        return objX == z70.e ? objX : mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object insertLocationCell(LocationCell locationCell, q60 q60Var) {
        Object objX = ks.X(q60Var, new j(14, this, locationCell), this.__db, false, true);
        return objX == z70.e ? objX : mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object insertLocationWifi(LocationWifi locationWifi, q60 q60Var) {
        Object objX = ks.X(q60Var, new j(19, this, locationWifi), this.__db, false, true);
        return objX == z70.e ? objX : mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object insertWifiDevice(WifiDevice wifiDevice, q60 q60Var) {
        Object objX = ks.X(q60Var, new j(20, this, wifiDevice), this.__db, false, true);
        return objX == z70.e ? objX : mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Flow<List<CompleteLocation>> observeAllCompleteLocations() {
        return mc0.n(this.__db, true, new String[]{"location_connected_wifi", "wifi_devices", "location_wifi", "bluetooth_devices", "location_bluetooth", "cell_devices", "location_cells", "location_records"}, new dl0(this, 1));
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Flow<List<CompleteCollectionRoute>> observeCollectionRoutes() {
        return mc0.n(this.__db, true, new String[]{"location_connected_wifi", "wifi_devices", "location_wifi", "bluetooth_devices", "location_bluetooth", "cell_devices", "location_cells", "location_records", "collection_routes"}, new dl0(this, 0));
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object updateBasicInfo(long j, String str, String str2, q60 q60Var) {
        Object objX = ks.X(q60Var, new jl0(str, str2, j, 0), this.__db, false, true);
        return objX == z70.e ? objX : mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object updateCollectionRouteInfo(long j, String str, String str2, q60 q60Var) {
        Object objX = ks.X(q60Var, new jl0(str, str2, j, 1), this.__db, false, true);
        return objX == z70.e ? objX : mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object updateCollectionTimestamp(final long j, final long j2, q60 q60Var) {
        Object objX = ks.X(q60Var, new lu0() { // from class: yk0
            @Override // defpackage.lu0
            public final Object invoke(Object obj) {
                return EnvironmentDao_Impl.updateCollectionTimestamp$lambda$28("UPDATE location_records SET timestamp = ? WHERE id = ?", j2, j, (zk2) obj);
            }
        }, this.__db, false, true);
        return objX == z70.e ? objX : mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object updateCoordinates(final long j, final double d, final double d2, q60 q60Var) {
        Object objX = ks.X(q60Var, new lu0() { // from class: kl0
            @Override // defpackage.lu0
            public final Object invoke(Object obj) {
                return EnvironmentDao_Impl.updateCoordinates$lambda$42("UPDATE location_records SET lat = ?, lng = ? WHERE id = ?", d, d2, j, (zk2) obj);
            }
        }, this.__db, false, true);
        return objX == z70.e ? objX : mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object updateMetadata(final long j, final double d, final double d2, final String str, final String str2, final String str3, final String str4, final String str5, q60 q60Var) {
        Object objX = ks.X(q60Var, new lu0() { // from class: il0
            @Override // defpackage.lu0
            public final Object invoke(Object obj) {
                return EnvironmentDao_Impl.updateMetadata$lambda$41("UPDATE location_records SET lat = ?, lng = ?, placeName = ?, remark = ?, selectedWifiBssid = ?, selectedBluetoothAddress = ?, selectedCellKey = ? WHERE id = ?", d, d2, str, str2, str3, str4, str5, j, (zk2) obj);
            }
        }, this.__db, false, true);
        return objX == z70.e ? objX : mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object updateSelectedBluetooth(long j, String str, q60 q60Var) {
        Object objX = ks.X(q60Var, new zk0(str, j, 1), this.__db, false, true);
        return objX == z70.e ? objX : mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object updateSelectedCell(long j, String str, q60 q60Var) {
        Object objX = ks.X(q60Var, new zk0(str, j, 2), this.__db, false, true);
        return objX == z70.e ? objX : mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object updateSelectedWifi(long j, String str, q60 q60Var) {
        Object objX = ks.X(q60Var, new zk0(str, j, 3), this.__db, false, true);
        return objX == z70.e ? objX : mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object updateSyncCollectionRoute(CollectionRouteRecord collectionRouteRecord, q60 q60Var) {
        Object objX = ks.X(q60Var, new xk0(this, collectionRouteRecord, 0), this.__db, false, true);
        return objX == z70.e ? objX : mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.db.EnvironmentDao
    public Object updateSyncLocation(LocationRecord locationRecord, q60 q60Var) {
        Object objX = ks.X(q60Var, new cl0(this, locationRecord, 1), this.__db, false, true);
        return objX == z70.e ? objX : mf3.a;
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }

        public final List<l81> getRequiredConverters() {
            return uj0.e;
        }

        private Companion() {
        }
    }
}
