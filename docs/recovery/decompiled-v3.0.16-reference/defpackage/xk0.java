package defpackage;

import com.vincenthzr.locationspoofer.data.db.CollectionRouteRecord;
import com.vincenthzr.locationspoofer.data.db.EnvironmentDao_Impl;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class xk0 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ EnvironmentDao_Impl f;
    public final /* synthetic */ CollectionRouteRecord g;

    public /* synthetic */ xk0(EnvironmentDao_Impl environmentDao_Impl, CollectionRouteRecord collectionRouteRecord, int i) {
        this.e = i;
        this.f = environmentDao_Impl;
        this.g = collectionRouteRecord;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        CollectionRouteRecord collectionRouteRecord = this.g;
        EnvironmentDao_Impl environmentDao_Impl = this.f;
        zk2 zk2Var = (zk2) obj;
        switch (i) {
            case 0:
                return EnvironmentDao_Impl.updateSyncCollectionRoute$lambda$7(environmentDao_Impl, collectionRouteRecord, zk2Var);
            default:
                return Long.valueOf(EnvironmentDao_Impl.insertCollectionRoute$lambda$5(environmentDao_Impl, collectionRouteRecord, zk2Var));
        }
    }
}
