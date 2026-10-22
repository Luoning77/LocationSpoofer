package com.vincenthzr.locationspoofer.data.db;

import android.content.Context;
import android.database.Cursor;
import defpackage.am1;
import defpackage.ca0;
import defpackage.ci2;
import defpackage.ii2;
import defpackage.ji2;
import defpackage.l13;
import defpackage.s23;
import defpackage.xt1;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class AppDatabase extends ii2 {
    private static volatile AppDatabase INSTANCE;
    public static final Companion Companion = new Companion(null);
    private static final AppDatabase$Companion$MIGRATION_3_4$1 MIGRATION_3_4 = new xt1() { // from class: com.vincenthzr.locationspoofer.data.db.AppDatabase$Companion$MIGRATION_3_4$1
        @Override // defpackage.xt1
        public void migrate(s23 s23Var) {
            s23Var.getClass();
            s23Var.q("ALTER TABLE location_records ADD COLUMN placeName TEXT NOT NULL DEFAULT ''");
            s23Var.q("ALTER TABLE location_records ADD COLUMN remark TEXT NOT NULL DEFAULT ''");
        }
    };
    private static final AppDatabase$Companion$MIGRATION_6_7$1 MIGRATION_6_7 = new xt1() { // from class: com.vincenthzr.locationspoofer.data.db.AppDatabase$Companion$MIGRATION_6_7$1
        @Override // defpackage.xt1
        public void migrate(s23 s23Var) {
            s23Var.getClass();
            s23Var.q("ALTER TABLE location_records ADD COLUMN selectedWifiBssid TEXT");
            s23Var.q("ALTER TABLE location_records ADD COLUMN selectedBluetoothAddress TEXT");
            s23Var.q("ALTER TABLE location_records ADD COLUMN selectedCellKey TEXT");
        }
    };
    private static final AppDatabase$Companion$MIGRATION_7_8$1 MIGRATION_7_8 = new xt1() { // from class: com.vincenthzr.locationspoofer.data.db.AppDatabase$Companion$MIGRATION_7_8$1
        @Override // defpackage.xt1
        public void migrate(s23 s23Var) {
            s23Var.getClass();
            s23Var.q("CREATE INDEX IF NOT EXISTS index_location_records_lat_lng ON location_records(lat, lng)");
            s23Var.q("CREATE INDEX IF NOT EXISTS index_location_records_timestamp ON location_records(timestamp)");
        }
    };
    private static final AppDatabase$Companion$MIGRATION_8_9$1 MIGRATION_8_9 = new xt1() { // from class: com.vincenthzr.locationspoofer.data.db.AppDatabase$Companion$MIGRATION_8_9$1
        @Override // defpackage.xt1
        public void migrate(s23 s23Var) {
            s23Var.getClass();
            s23Var.q("CREATE TABLE IF NOT EXISTS collection_routes (id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, name TEXT NOT NULL, remark TEXT NOT NULL, pointsJson TEXT NOT NULL, halfWidthM REAL NOT NULL, timestamp INTEGER NOT NULL)");
            s23Var.q("ALTER TABLE location_records ADD COLUMN collectionRouteId INTEGER REFERENCES collection_routes(id) ON DELETE CASCADE");
            s23Var.q("CREATE INDEX IF NOT EXISTS index_location_records_collectionRouteId ON location_records(collectionRouteId)");
        }
    };
    private static final xt1 MIGRATION_9_10 = new xt1() { // from class: com.vincenthzr.locationspoofer.data.db.AppDatabase$Companion$MIGRATION_9_10$1
        @Override // defpackage.xt1
        public void migrate(s23 s23Var) throws IOException {
            s23Var.getClass();
            for (String str : am1.G("location_records", "collection_routes", "saved_routes")) {
                s23Var.q("ALTER TABLE " + str + " ADD COLUMN syncId TEXT NOT NULL DEFAULT ''");
                StringBuilder sb = new StringBuilder("SELECT id FROM ");
                sb.append(str);
                Cursor cursorW = s23Var.W(sb.toString());
                while (cursorW.moveToNext()) {
                    try {
                        String string = UUID.randomUUID().toString();
                        string.getClass();
                        s23Var.L("UPDATE " + str + " SET syncId=? WHERE id=?", new Object[]{string, Long.valueOf(cursorW.getLong(0))});
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            ji2.z(cursorW, th);
                            throw th2;
                        }
                    }
                }
                cursorW.close();
            }
        }
    };

    public abstract EnvironmentDao environmentDao();

    public abstract SavedRouteDao savedRouteDao();

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }

        public final AppDatabase getDatabase(Context context) {
            AppDatabase appDatabase;
            context.getClass();
            AppDatabase appDatabase2 = AppDatabase.INSTANCE;
            if (appDatabase2 != null) {
                return appDatabase2;
            }
            synchronized (this) {
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                if (l13.k0("environment_database")) {
                    throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                }
                ci2 ci2Var = new ci2(applicationContext);
                ci2Var.a(AppDatabase.MIGRATION_3_4, AppDatabase.MIGRATION_6_7, AppDatabase.MIGRATION_7_8, AppDatabase.MIGRATION_8_9, AppDatabase.Companion.getMIGRATION_9_10$core_data_globalRelease());
                ci2Var.k = false;
                ci2Var.l = true;
                appDatabase = (AppDatabase) ci2Var.b();
                AppDatabase.INSTANCE = appDatabase;
            }
            return appDatabase;
        }

        public final xt1 getMIGRATION_9_10$core_data_globalRelease() {
            return AppDatabase.MIGRATION_9_10;
        }

        private Companion() {
        }
    }
}
