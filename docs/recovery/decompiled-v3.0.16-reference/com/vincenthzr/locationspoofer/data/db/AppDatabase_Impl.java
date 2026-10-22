package com.vincenthzr.locationspoofer.data.db;

import com.vincenthzr.locationspoofer.data.db.AppDatabase_Impl;
import defpackage.a61;
import defpackage.am1;
import defpackage.au0;
import defpackage.bl2;
import defpackage.i43;
import defpackage.ki2;
import defpackage.l81;
import defpackage.li2;
import defpackage.mg1;
import defpackage.mh0;
import defpackage.r43;
import defpackage.s13;
import defpackage.s43;
import defpackage.t43;
import defpackage.u43;
import defpackage.vd0;
import defpackage.xe2;
import defpackage.xt1;
import defpackage.xx0;
import defpackage.zb1;
import defpackage.zk2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class AppDatabase_Impl extends AppDatabase {
    private final zb1 _environmentDao;
    private final zb1 _savedRouteDao;

    public AppDatabase_Impl() {
        final int i = 0;
        this._environmentDao = new i43(new au0(this) { // from class: fn
            public final /* synthetic */ AppDatabase_Impl f;

            {
                this.f = this;
            }

            @Override // defpackage.au0
            public final Object invoke() {
                int i2 = i;
                AppDatabase_Impl appDatabase_Impl = this.f;
                switch (i2) {
                    case 0:
                        return AppDatabase_Impl._environmentDao$lambda$0(appDatabase_Impl);
                    default:
                        return AppDatabase_Impl._savedRouteDao$lambda$1(appDatabase_Impl);
                }
            }
        });
        final int i2 = 1;
        this._savedRouteDao = new i43(new au0(this) { // from class: fn
            public final /* synthetic */ AppDatabase_Impl f;

            {
                this.f = this;
            }

            @Override // defpackage.au0
            public final Object invoke() {
                int i3 = i2;
                AppDatabase_Impl appDatabase_Impl = this.f;
                switch (i3) {
                    case 0:
                        return AppDatabase_Impl._environmentDao$lambda$0(appDatabase_Impl);
                    default:
                        return AppDatabase_Impl._savedRouteDao$lambda$1(appDatabase_Impl);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnvironmentDao_Impl _environmentDao$lambda$0(AppDatabase_Impl appDatabase_Impl) {
        return new EnvironmentDao_Impl(appDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SavedRouteDao_Impl _savedRouteDao$lambda$1(AppDatabase_Impl appDatabase_Impl) {
        return new SavedRouteDao_Impl(appDatabase_Impl);
    }

    @Override // defpackage.ii2
    public void clearAllTables() {
        performClear(true, "location_records", "location_connected_wifi", "wifi_devices", "location_wifi", "bluetooth_devices", "location_bluetooth", "cell_devices", "location_cells", "saved_routes", "collection_routes");
    }

    @Override // defpackage.ii2
    public List<xt1> createAutoMigrations(Map<l81, Object> map) {
        map.getClass();
        return new ArrayList();
    }

    @Override // defpackage.ii2
    public a61 createInvalidationTracker() {
        return new a61(this, new LinkedHashMap(), new LinkedHashMap(), "location_records", "location_connected_wifi", "wifi_devices", "location_wifi", "bluetooth_devices", "location_bluetooth", "cell_devices", "location_cells", "saved_routes", "collection_routes");
    }

    @Override // defpackage.ii2
    public li2 createOpenDelegate() {
        return new li2() { // from class: com.vincenthzr.locationspoofer.data.db.AppDatabase_Impl$createOpenDelegate$_openDelegate$1
            {
                super(10, "586350f897bfbc696cbb9b1addb1f159", "73bfdb329ba4ebc8a64c73fc66f6b8cd");
            }

            @Override // defpackage.li2
            public void createAllTables(zk2 zk2Var) throws Exception {
                zk2Var.getClass();
                mh0.D("CREATE TABLE IF NOT EXISTS `location_records` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `lat` REAL NOT NULL, `lng` REAL NOT NULL, `timestamp` INTEGER NOT NULL, `placeName` TEXT NOT NULL, `remark` TEXT NOT NULL, `selectedWifiBssid` TEXT, `selectedBluetoothAddress` TEXT, `selectedCellKey` TEXT, `collectionRouteId` INTEGER, `syncId` TEXT NOT NULL, FOREIGN KEY(`collectionRouteId`) REFERENCES `collection_routes`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )", zk2Var);
                mh0.D("CREATE INDEX IF NOT EXISTS `index_location_records_collectionRouteId` ON `location_records` (`collectionRouteId`)", zk2Var);
                mh0.D("CREATE INDEX IF NOT EXISTS `index_location_records_lat_lng` ON `location_records` (`lat`, `lng`)", zk2Var);
                mh0.D("CREATE INDEX IF NOT EXISTS `index_location_records_timestamp` ON `location_records` (`timestamp`)", zk2Var);
                mh0.D("CREATE TABLE IF NOT EXISTS `location_connected_wifi` (`locationId` INTEGER NOT NULL, `bssid` TEXT NOT NULL, `ssid` TEXT NOT NULL, `vendor` TEXT NOT NULL, `macAddress` TEXT NOT NULL, `frequency` INTEGER NOT NULL, `linkSpeed` INTEGER NOT NULL, `level` INTEGER NOT NULL, `capabilities` TEXT NOT NULL, `networkId` INTEGER NOT NULL, `wifiStandard` INTEGER NOT NULL, PRIMARY KEY(`locationId`), FOREIGN KEY(`locationId`) REFERENCES `location_records`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )", zk2Var);
                mh0.D("CREATE TABLE IF NOT EXISTS `wifi_devices` (`bssid` TEXT NOT NULL, `ssid` TEXT NOT NULL, `frequency` INTEGER NOT NULL, `capabilities` TEXT NOT NULL, `vendor` TEXT NOT NULL, PRIMARY KEY(`bssid`))", zk2Var);
                mh0.D("CREATE TABLE IF NOT EXISTS `location_wifi` (`locationId` INTEGER NOT NULL, `bssid` TEXT NOT NULL, `level` INTEGER NOT NULL, PRIMARY KEY(`locationId`, `bssid`), FOREIGN KEY(`locationId`) REFERENCES `location_records`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`bssid`) REFERENCES `wifi_devices`(`bssid`) ON UPDATE NO ACTION ON DELETE CASCADE )", zk2Var);
                mh0.D("CREATE INDEX IF NOT EXISTS `index_location_wifi_bssid` ON `location_wifi` (`bssid`)", zk2Var);
                mh0.D("CREATE TABLE IF NOT EXISTS `bluetooth_devices` (`address` TEXT NOT NULL, `name` TEXT NOT NULL, `scanRecordHex` TEXT NOT NULL, PRIMARY KEY(`address`))", zk2Var);
                mh0.D("CREATE TABLE IF NOT EXISTS `location_bluetooth` (`locationId` INTEGER NOT NULL, `address` TEXT NOT NULL, `rssi` INTEGER NOT NULL, PRIMARY KEY(`locationId`, `address`), FOREIGN KEY(`locationId`) REFERENCES `location_records`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`address`) REFERENCES `bluetooth_devices`(`address`) ON UPDATE NO ACTION ON DELETE CASCADE )", zk2Var);
                mh0.D("CREATE INDEX IF NOT EXISTS `index_location_bluetooth_address` ON `location_bluetooth` (`address`)", zk2Var);
                mh0.D("CREATE TABLE IF NOT EXISTS `cell_devices` (`cellKey` TEXT NOT NULL, `type` TEXT NOT NULL, `mcc` INTEGER NOT NULL, `mnc` INTEGER NOT NULL, `tac` INTEGER NOT NULL, `ci` INTEGER NOT NULL, `pci` INTEGER NOT NULL, `lac` INTEGER NOT NULL, `cid` INTEGER NOT NULL, `psc` INTEGER NOT NULL, `nci` INTEGER NOT NULL, `networkId` INTEGER NOT NULL, `systemId` INTEGER NOT NULL, `basestationId` INTEGER NOT NULL, PRIMARY KEY(`cellKey`))", zk2Var);
                mh0.D("CREATE TABLE IF NOT EXISTS `location_cells` (`locationId` INTEGER NOT NULL, `cellKey` TEXT NOT NULL, `dbm` INTEGER NOT NULL, `isRegistered` INTEGER NOT NULL, PRIMARY KEY(`locationId`, `cellKey`), FOREIGN KEY(`locationId`) REFERENCES `location_records`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`cellKey`) REFERENCES `cell_devices`(`cellKey`) ON UPDATE NO ACTION ON DELETE CASCADE )", zk2Var);
                mh0.D("CREATE INDEX IF NOT EXISTS `index_location_cells_cellKey` ON `location_cells` (`cellKey`)", zk2Var);
                mh0.D("CREATE TABLE IF NOT EXISTS `saved_routes` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `pointsJson` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `syncId` TEXT NOT NULL)", zk2Var);
                mh0.D("CREATE TABLE IF NOT EXISTS `collection_routes` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `remark` TEXT NOT NULL, `pointsJson` TEXT NOT NULL, `halfWidthM` REAL NOT NULL, `timestamp` INTEGER NOT NULL, `syncId` TEXT NOT NULL)", zk2Var);
                mh0.D("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)", zk2Var);
                mh0.D("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '586350f897bfbc696cbb9b1addb1f159')", zk2Var);
            }

            @Override // defpackage.li2
            public void dropAllTables(zk2 zk2Var) throws Exception {
                zk2Var.getClass();
                mh0.D("DROP TABLE IF EXISTS `location_records`", zk2Var);
                mh0.D("DROP TABLE IF EXISTS `location_connected_wifi`", zk2Var);
                mh0.D("DROP TABLE IF EXISTS `wifi_devices`", zk2Var);
                mh0.D("DROP TABLE IF EXISTS `location_wifi`", zk2Var);
                mh0.D("DROP TABLE IF EXISTS `bluetooth_devices`", zk2Var);
                mh0.D("DROP TABLE IF EXISTS `location_bluetooth`", zk2Var);
                mh0.D("DROP TABLE IF EXISTS `cell_devices`", zk2Var);
                mh0.D("DROP TABLE IF EXISTS `location_cells`", zk2Var);
                mh0.D("DROP TABLE IF EXISTS `saved_routes`", zk2Var);
                mh0.D("DROP TABLE IF EXISTS `collection_routes`", zk2Var);
            }

            @Override // defpackage.li2
            public void onCreate(zk2 zk2Var) {
                zk2Var.getClass();
            }

            @Override // defpackage.li2
            public void onOpen(zk2 zk2Var) throws Exception {
                zk2Var.getClass();
                mh0.D("PRAGMA foreign_keys = ON", zk2Var);
                this.this$0.internalInitInvalidationTracker(zk2Var);
            }

            @Override // defpackage.li2
            public void onPostMigrate(zk2 zk2Var) {
                zk2Var.getClass();
            }

            @Override // defpackage.li2
            public void onPreMigrate(zk2 zk2Var) throws Exception {
                zk2Var.getClass();
                mg1 mg1VarN = am1.n();
                bl2 bl2VarA0 = zk2Var.a0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (bl2VarA0.R()) {
                    try {
                        mg1VarN.add(bl2VarA0.m(0));
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            am1.j(bl2VarA0, th);
                            throw th2;
                        }
                    }
                }
                am1.j(bl2VarA0, null);
                ListIterator listIterator = am1.f(mg1VarN).listIterator(0);
                while (true) {
                    xx0 xx0Var = (xx0) listIterator;
                    if (!xx0Var.hasNext()) {
                        return;
                    }
                    String str = (String) xx0Var.next();
                    if (s13.Z(str, "room_fts_content_sync_", false)) {
                        mh0.D("DROP TRIGGER IF EXISTS ".concat(str), zk2Var);
                    }
                }
            }

            @Override // defpackage.li2
            public ki2 onValidateSchema(zk2 zk2Var) throws Exception {
                zk2Var.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("id", new r43("id", "INTEGER", true, 1, null, 1));
                linkedHashMap.put("lat", new r43("lat", "REAL", true, 0, null, 1));
                linkedHashMap.put("lng", new r43("lng", "REAL", true, 0, null, 1));
                linkedHashMap.put("timestamp", new r43("timestamp", "INTEGER", true, 0, null, 1));
                linkedHashMap.put("placeName", new r43("placeName", "TEXT", true, 0, null, 1));
                linkedHashMap.put("remark", new r43("remark", "TEXT", true, 0, null, 1));
                linkedHashMap.put("selectedWifiBssid", new r43("selectedWifiBssid", "TEXT", false, 0, null, 1));
                linkedHashMap.put("selectedBluetoothAddress", new r43("selectedBluetoothAddress", "TEXT", false, 0, null, 1));
                linkedHashMap.put("selectedCellKey", new r43("selectedCellKey", "TEXT", false, 0, null, 1));
                linkedHashMap.put("collectionRouteId", new r43("collectionRouteId", "INTEGER", false, 0, null, 1));
                linkedHashMap.put("syncId", new r43("syncId", "TEXT", true, 0, null, 1));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(new s43("collection_routes", "CASCADE", "NO ACTION", am1.F("collectionRouteId"), am1.F("id")));
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                linkedHashSet2.add(new t43(false, am1.F("collectionRouteId"), am1.F("ASC"), "index_location_records_collectionRouteId"));
                linkedHashSet2.add(new t43(false, am1.G("lat", "lng"), am1.G("ASC", "ASC"), "index_location_records_lat_lng"));
                linkedHashSet2.add(new t43(false, am1.F("timestamp"), am1.F("ASC"), "index_location_records_timestamp"));
                u43 u43Var = new u43("location_records", linkedHashMap, linkedHashSet, linkedHashSet2);
                u43 u43VarD = vd0.D("location_records", zk2Var);
                if (!u43Var.equals(u43VarD)) {
                    return new ki2(false, "location_records(com.vincenthzr.locationspoofer.data.db.LocationRecord).\n Expected:\n" + u43Var + "\n Found:\n" + u43VarD);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("locationId", new r43("locationId", "INTEGER", true, 1, null, 1));
                linkedHashMap2.put("bssid", new r43("bssid", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("ssid", new r43("ssid", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("vendor", new r43("vendor", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("macAddress", new r43("macAddress", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("frequency", new r43("frequency", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("linkSpeed", new r43("linkSpeed", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("level", new r43("level", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("capabilities", new r43("capabilities", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("networkId", new r43("networkId", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("wifiStandard", new r43("wifiStandard", "INTEGER", true, 0, null, 1));
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                linkedHashSet3.add(new s43("location_records", "CASCADE", "NO ACTION", am1.F("locationId"), am1.F("id")));
                u43 u43Var2 = new u43("location_connected_wifi", linkedHashMap2, linkedHashSet3, new LinkedHashSet());
                u43 u43VarD2 = vd0.D("location_connected_wifi", zk2Var);
                if (!u43Var2.equals(u43VarD2)) {
                    return new ki2(false, "location_connected_wifi(com.vincenthzr.locationspoofer.data.db.LocationConnectedWifi).\n Expected:\n" + u43Var2 + "\n Found:\n" + u43VarD2);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("bssid", new r43("bssid", "TEXT", true, 1, null, 1));
                linkedHashMap3.put("ssid", new r43("ssid", "TEXT", true, 0, null, 1));
                linkedHashMap3.put("frequency", new r43("frequency", "INTEGER", true, 0, null, 1));
                linkedHashMap3.put("capabilities", new r43("capabilities", "TEXT", true, 0, null, 1));
                linkedHashMap3.put("vendor", new r43("vendor", "TEXT", true, 0, null, 1));
                u43 u43Var3 = new u43("wifi_devices", linkedHashMap3, new LinkedHashSet(), new LinkedHashSet());
                u43 u43VarD3 = vd0.D("wifi_devices", zk2Var);
                if (!u43Var3.equals(u43VarD3)) {
                    return new ki2(false, "wifi_devices(com.vincenthzr.locationspoofer.data.db.WifiDevice).\n Expected:\n" + u43Var3 + "\n Found:\n" + u43VarD3);
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                linkedHashMap4.put("locationId", new r43("locationId", "INTEGER", true, 1, null, 1));
                linkedHashMap4.put("bssid", new r43("bssid", "TEXT", true, 2, null, 1));
                linkedHashMap4.put("level", new r43("level", "INTEGER", true, 0, null, 1));
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                linkedHashSet4.add(new s43("location_records", "CASCADE", "NO ACTION", am1.F("locationId"), am1.F("id")));
                linkedHashSet4.add(new s43("wifi_devices", "CASCADE", "NO ACTION", am1.F("bssid"), am1.F("bssid")));
                LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                linkedHashSet5.add(new t43(false, am1.F("bssid"), am1.F("ASC"), "index_location_wifi_bssid"));
                u43 u43Var4 = new u43("location_wifi", linkedHashMap4, linkedHashSet4, linkedHashSet5);
                u43 u43VarD4 = vd0.D("location_wifi", zk2Var);
                if (!u43Var4.equals(u43VarD4)) {
                    return new ki2(false, "location_wifi(com.vincenthzr.locationspoofer.data.db.LocationWifi).\n Expected:\n" + u43Var4 + "\n Found:\n" + u43VarD4);
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                linkedHashMap5.put("address", new r43("address", "TEXT", true, 1, null, 1));
                linkedHashMap5.put("name", new r43("name", "TEXT", true, 0, null, 1));
                linkedHashMap5.put("scanRecordHex", new r43("scanRecordHex", "TEXT", true, 0, null, 1));
                u43 u43Var5 = new u43("bluetooth_devices", linkedHashMap5, new LinkedHashSet(), new LinkedHashSet());
                u43 u43VarD5 = vd0.D("bluetooth_devices", zk2Var);
                if (!u43Var5.equals(u43VarD5)) {
                    return new ki2(false, "bluetooth_devices(com.vincenthzr.locationspoofer.data.db.BluetoothDevice).\n Expected:\n" + u43Var5 + "\n Found:\n" + u43VarD5);
                }
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                linkedHashMap6.put("locationId", new r43("locationId", "INTEGER", true, 1, null, 1));
                linkedHashMap6.put("address", new r43("address", "TEXT", true, 2, null, 1));
                linkedHashMap6.put("rssi", new r43("rssi", "INTEGER", true, 0, null, 1));
                LinkedHashSet linkedHashSet6 = new LinkedHashSet();
                linkedHashSet6.add(new s43("location_records", "CASCADE", "NO ACTION", am1.F("locationId"), am1.F("id")));
                linkedHashSet6.add(new s43("bluetooth_devices", "CASCADE", "NO ACTION", am1.F("address"), am1.F("address")));
                LinkedHashSet linkedHashSet7 = new LinkedHashSet();
                linkedHashSet7.add(new t43(false, am1.F("address"), am1.F("ASC"), "index_location_bluetooth_address"));
                u43 u43Var6 = new u43("location_bluetooth", linkedHashMap6, linkedHashSet6, linkedHashSet7);
                u43 u43VarD6 = vd0.D("location_bluetooth", zk2Var);
                if (!u43Var6.equals(u43VarD6)) {
                    return new ki2(false, "location_bluetooth(com.vincenthzr.locationspoofer.data.db.LocationBluetooth).\n Expected:\n" + u43Var6 + "\n Found:\n" + u43VarD6);
                }
                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                linkedHashMap7.put("cellKey", new r43("cellKey", "TEXT", true, 1, null, 1));
                linkedHashMap7.put("type", new r43("type", "TEXT", true, 0, null, 1));
                linkedHashMap7.put("mcc", new r43("mcc", "INTEGER", true, 0, null, 1));
                linkedHashMap7.put("mnc", new r43("mnc", "INTEGER", true, 0, null, 1));
                linkedHashMap7.put("tac", new r43("tac", "INTEGER", true, 0, null, 1));
                linkedHashMap7.put("ci", new r43("ci", "INTEGER", true, 0, null, 1));
                linkedHashMap7.put("pci", new r43("pci", "INTEGER", true, 0, null, 1));
                linkedHashMap7.put("lac", new r43("lac", "INTEGER", true, 0, null, 1));
                linkedHashMap7.put("cid", new r43("cid", "INTEGER", true, 0, null, 1));
                linkedHashMap7.put("psc", new r43("psc", "INTEGER", true, 0, null, 1));
                linkedHashMap7.put("nci", new r43("nci", "INTEGER", true, 0, null, 1));
                linkedHashMap7.put("networkId", new r43("networkId", "INTEGER", true, 0, null, 1));
                linkedHashMap7.put("systemId", new r43("systemId", "INTEGER", true, 0, null, 1));
                linkedHashMap7.put("basestationId", new r43("basestationId", "INTEGER", true, 0, null, 1));
                u43 u43Var7 = new u43("cell_devices", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
                u43 u43VarD7 = vd0.D("cell_devices", zk2Var);
                if (!u43Var7.equals(u43VarD7)) {
                    return new ki2(false, "cell_devices(com.vincenthzr.locationspoofer.data.db.CellDevice).\n Expected:\n" + u43Var7 + "\n Found:\n" + u43VarD7);
                }
                LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                linkedHashMap8.put("locationId", new r43("locationId", "INTEGER", true, 1, null, 1));
                linkedHashMap8.put("cellKey", new r43("cellKey", "TEXT", true, 2, null, 1));
                linkedHashMap8.put("dbm", new r43("dbm", "INTEGER", true, 0, null, 1));
                linkedHashMap8.put("isRegistered", new r43("isRegistered", "INTEGER", true, 0, null, 1));
                LinkedHashSet linkedHashSet8 = new LinkedHashSet();
                linkedHashSet8.add(new s43("location_records", "CASCADE", "NO ACTION", am1.F("locationId"), am1.F("id")));
                linkedHashSet8.add(new s43("cell_devices", "CASCADE", "NO ACTION", am1.F("cellKey"), am1.F("cellKey")));
                LinkedHashSet linkedHashSet9 = new LinkedHashSet();
                linkedHashSet9.add(new t43(false, am1.F("cellKey"), am1.F("ASC"), "index_location_cells_cellKey"));
                u43 u43Var8 = new u43("location_cells", linkedHashMap8, linkedHashSet8, linkedHashSet9);
                u43 u43VarD8 = vd0.D("location_cells", zk2Var);
                if (!u43Var8.equals(u43VarD8)) {
                    return new ki2(false, "location_cells(com.vincenthzr.locationspoofer.data.db.LocationCell).\n Expected:\n" + u43Var8 + "\n Found:\n" + u43VarD8);
                }
                LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                linkedHashMap9.put("id", new r43("id", "INTEGER", true, 1, null, 1));
                linkedHashMap9.put("name", new r43("name", "TEXT", true, 0, null, 1));
                linkedHashMap9.put("pointsJson", new r43("pointsJson", "TEXT", true, 0, null, 1));
                linkedHashMap9.put("timestamp", new r43("timestamp", "INTEGER", true, 0, null, 1));
                linkedHashMap9.put("syncId", new r43("syncId", "TEXT", true, 0, null, 1));
                u43 u43Var9 = new u43("saved_routes", linkedHashMap9, new LinkedHashSet(), new LinkedHashSet());
                u43 u43VarD9 = vd0.D("saved_routes", zk2Var);
                if (!u43Var9.equals(u43VarD9)) {
                    return new ki2(false, "saved_routes(com.vincenthzr.locationspoofer.data.db.SavedRouteEntity).\n Expected:\n" + u43Var9 + "\n Found:\n" + u43VarD9);
                }
                LinkedHashMap linkedHashMap10 = new LinkedHashMap();
                linkedHashMap10.put("id", new r43("id", "INTEGER", true, 1, null, 1));
                linkedHashMap10.put("name", new r43("name", "TEXT", true, 0, null, 1));
                linkedHashMap10.put("remark", new r43("remark", "TEXT", true, 0, null, 1));
                linkedHashMap10.put("pointsJson", new r43("pointsJson", "TEXT", true, 0, null, 1));
                linkedHashMap10.put("halfWidthM", new r43("halfWidthM", "REAL", true, 0, null, 1));
                linkedHashMap10.put("timestamp", new r43("timestamp", "INTEGER", true, 0, null, 1));
                linkedHashMap10.put("syncId", new r43("syncId", "TEXT", true, 0, null, 1));
                u43 u43Var10 = new u43("collection_routes", linkedHashMap10, new LinkedHashSet(), new LinkedHashSet());
                u43 u43VarD10 = vd0.D("collection_routes", zk2Var);
                if (u43Var10.equals(u43VarD10)) {
                    return new ki2(true, null);
                }
                return new ki2(false, "collection_routes(com.vincenthzr.locationspoofer.data.db.CollectionRouteRecord).\n Expected:\n" + u43Var10 + "\n Found:\n" + u43VarD10);
            }
        };
    }

    @Override // com.vincenthzr.locationspoofer.data.db.AppDatabase
    public EnvironmentDao environmentDao() {
        return (EnvironmentDao) this._environmentDao.getValue();
    }

    @Override // defpackage.ii2
    public Set<l81> getRequiredAutoMigrationSpecClasses() {
        return new LinkedHashSet();
    }

    @Override // defpackage.ii2
    public Map<l81, List<l81>> getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(xe2.a(EnvironmentDao.class), EnvironmentDao_Impl.Companion.getRequiredConverters());
        linkedHashMap.put(xe2.a(SavedRouteDao.class), SavedRouteDao_Impl.Companion.getRequiredConverters());
        return linkedHashMap;
    }

    @Override // com.vincenthzr.locationspoofer.data.db.AppDatabase
    public SavedRouteDao savedRouteDao() {
        return (SavedRouteDao) this._savedRouteDao.getValue();
    }
}
