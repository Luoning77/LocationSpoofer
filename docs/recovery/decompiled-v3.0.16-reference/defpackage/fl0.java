package defpackage;

import com.vincenthzr.locationspoofer.data.db.EnvironmentDao_Impl;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class fl0 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ EnvironmentDao_Impl g;

    public /* synthetic */ fl0(long j, EnvironmentDao_Impl environmentDao_Impl, int i) {
        this.e = i;
        this.f = j;
        this.g = environmentDao_Impl;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        EnvironmentDao_Impl environmentDao_Impl = this.g;
        long j = this.f;
        zk2 zk2Var = (zk2) obj;
        switch (i) {
            case 0:
                return EnvironmentDao_Impl.getCollectionRoute$lambda$18("SELECT * FROM collection_routes WHERE id = ?", j, environmentDao_Impl, zk2Var);
            default:
                return EnvironmentDao_Impl.getCompleteLocationById$lambda$13("SELECT * FROM location_records WHERE id = ? LIMIT 1", j, environmentDao_Impl, zk2Var);
        }
    }
}
