package defpackage;

import com.vincenthzr.locationspoofer.data.db.EnvironmentDao_Impl;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class dl0 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ EnvironmentDao_Impl f;

    public /* synthetic */ dl0(EnvironmentDao_Impl environmentDao_Impl, int i) {
        this.e = i;
        this.f = environmentDao_Impl;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        EnvironmentDao_Impl environmentDao_Impl = this.f;
        zk2 zk2Var = (zk2) obj;
        switch (i) {
            case 0:
                return EnvironmentDao_Impl.observeCollectionRoutes$lambda$16("SELECT * FROM collection_routes ORDER BY timestamp DESC", environmentDao_Impl, zk2Var);
            case 1:
                return EnvironmentDao_Impl.observeAllCompleteLocations$lambda$21("SELECT * FROM location_records", environmentDao_Impl, zk2Var);
            case 2:
                return EnvironmentDao_Impl.getCollectionRoutes$lambda$17("SELECT * FROM collection_routes ORDER BY timestamp DESC", environmentDao_Impl, zk2Var);
            default:
                return EnvironmentDao_Impl.getAllCompleteLocations$lambda$20("SELECT * FROM location_records", environmentDao_Impl, zk2Var);
        }
    }
}
