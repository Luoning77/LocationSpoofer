package com.vincenthzr.locationspoofer.data.db;

import defpackage.bl2;
import defpackage.bm2;
import defpackage.ca0;
import defpackage.cm2;
import defpackage.ii2;
import defpackage.ks;
import defpackage.l81;
import defpackage.mc0;
import defpackage.mf3;
import defpackage.q60;
import defpackage.qk0;
import defpackage.rk0;
import defpackage.uj0;
import defpackage.wc0;
import defpackage.yk1;
import defpackage.z70;
import defpackage.zk2;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SavedRouteDao_Impl implements SavedRouteDao {
    public static final Companion Companion = new Companion(null);
    private final ii2 __db;
    private final qk0 __deleteAdapterOfSavedRouteEntity;
    private final rk0 __insertAdapterOfSavedRouteEntity;

    public SavedRouteDao_Impl(ii2 ii2Var) {
        ii2Var.getClass();
        this.__db = ii2Var;
        this.__insertAdapterOfSavedRouteEntity = new rk0() { // from class: com.vincenthzr.locationspoofer.data.db.SavedRouteDao_Impl.1
            @Override // defpackage.rk0
            public void bind(bl2 bl2Var, SavedRouteEntity savedRouteEntity) {
                bl2Var.getClass();
                savedRouteEntity.getClass();
                bl2Var.e(1, savedRouteEntity.getId());
                bl2Var.D(2, savedRouteEntity.getName());
                bl2Var.D(3, savedRouteEntity.getPointsJson());
                bl2Var.e(4, savedRouteEntity.getTimestamp());
                bl2Var.D(5, savedRouteEntity.getSyncId());
            }

            @Override // defpackage.rk0
            public String createQuery() {
                return "INSERT OR REPLACE INTO `saved_routes` (`id`,`name`,`pointsJson`,`timestamp`,`syncId`) VALUES (nullif(?, 0),?,?,?,?)";
            }
        };
        this.__deleteAdapterOfSavedRouteEntity = new qk0() { // from class: com.vincenthzr.locationspoofer.data.db.SavedRouteDao_Impl.2
            @Override // defpackage.qk0
            public void bind(bl2 bl2Var, SavedRouteEntity savedRouteEntity) {
                bl2Var.getClass();
                savedRouteEntity.getClass();
                bl2Var.e(1, savedRouteEntity.getId());
            }

            @Override // defpackage.qk0
            public String createQuery() {
                return "DELETE FROM `saved_routes` WHERE `id` = ?";
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 deleteSavedRoute$lambda$1(SavedRouteDao_Impl savedRouteDao_Impl, SavedRouteEntity savedRouteEntity, zk2 zk2Var) {
        zk2Var.getClass();
        savedRouteDao_Impl.__deleteAdapterOfSavedRouteEntity.handle(zk2Var, savedRouteEntity);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getAllSavedRoutes$lambda$2(String str, zk2 zk2Var) throws Exception {
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0(str);
        try {
            int iJ = wc0.J(bl2VarA0, "id");
            int iJ2 = wc0.J(bl2VarA0, "name");
            int iJ3 = wc0.J(bl2VarA0, "pointsJson");
            int iJ4 = wc0.J(bl2VarA0, "timestamp");
            int iJ5 = wc0.J(bl2VarA0, "syncId");
            ArrayList arrayList = new ArrayList();
            while (bl2VarA0.R()) {
                arrayList.add(new SavedRouteEntity(bl2VarA0.getLong(iJ), bl2VarA0.m(iJ2), bl2VarA0.m(iJ3), bl2VarA0.getLong(iJ4), bl2VarA0.m(iJ5)));
            }
            bl2VarA0.close();
            return arrayList;
        } catch (Throwable th) {
            bl2VarA0.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getAllSavedRoutesList$lambda$3(String str, zk2 zk2Var) throws Exception {
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0(str);
        try {
            int iJ = wc0.J(bl2VarA0, "id");
            int iJ2 = wc0.J(bl2VarA0, "name");
            int iJ3 = wc0.J(bl2VarA0, "pointsJson");
            int iJ4 = wc0.J(bl2VarA0, "timestamp");
            int iJ5 = wc0.J(bl2VarA0, "syncId");
            ArrayList arrayList = new ArrayList();
            while (bl2VarA0.R()) {
                arrayList.add(new SavedRouteEntity(bl2VarA0.getLong(iJ), bl2VarA0.m(iJ2), bl2VarA0.m(iJ3), bl2VarA0.getLong(iJ4), bl2VarA0.m(iJ5)));
            }
            bl2VarA0.close();
            return arrayList;
        } catch (Throwable th) {
            bl2VarA0.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 insertSavedRoute$lambda$0(SavedRouteDao_Impl savedRouteDao_Impl, SavedRouteEntity savedRouteEntity, zk2 zk2Var) {
        zk2Var.getClass();
        savedRouteDao_Impl.__insertAdapterOfSavedRouteEntity.insert(zk2Var, savedRouteEntity);
        return mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.db.SavedRouteDao
    public Object deleteSavedRoute(SavedRouteEntity savedRouteEntity, q60 q60Var) {
        Object objX = ks.X(q60Var, new bm2(this, savedRouteEntity, 1), this.__db, false, true);
        return objX == z70.e ? objX : mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.db.SavedRouteDao
    public Flow<List<SavedRouteEntity>> getAllSavedRoutes() {
        return mc0.n(this.__db, false, new String[]{"saved_routes"}, new yk1(29));
    }

    @Override // com.vincenthzr.locationspoofer.data.db.SavedRouteDao
    public Object getAllSavedRoutesList(q60 q60Var) {
        return ks.X(q60Var, new cm2(0), this.__db, true, false);
    }

    @Override // com.vincenthzr.locationspoofer.data.db.SavedRouteDao
    public Object insertSavedRoute(SavedRouteEntity savedRouteEntity, q60 q60Var) {
        Object objX = ks.X(q60Var, new bm2(this, savedRouteEntity, 0), this.__db, false, true);
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
