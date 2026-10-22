package defpackage;

import com.vincenthzr.locationspoofer.data.db.SavedRouteDao_Impl;
import com.vincenthzr.locationspoofer.data.db.SavedRouteEntity;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class bm2 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ SavedRouteDao_Impl f;
    public final /* synthetic */ SavedRouteEntity g;

    public /* synthetic */ bm2(SavedRouteDao_Impl savedRouteDao_Impl, SavedRouteEntity savedRouteEntity, int i) {
        this.e = i;
        this.f = savedRouteDao_Impl;
        this.g = savedRouteEntity;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        SavedRouteEntity savedRouteEntity = this.g;
        SavedRouteDao_Impl savedRouteDao_Impl = this.f;
        zk2 zk2Var = (zk2) obj;
        switch (i) {
            case 0:
                return SavedRouteDao_Impl.insertSavedRoute$lambda$0(savedRouteDao_Impl, savedRouteEntity, zk2Var);
            default:
                return SavedRouteDao_Impl.deleteSavedRoute$lambda$1(savedRouteDao_Impl, savedRouteEntity, zk2Var);
        }
    }
}
