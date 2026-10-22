package defpackage;

import com.vincenthzr.locationspoofer.data.db.EnvironmentDao_Impl;
import com.vincenthzr.locationspoofer.data.db.LocationRecord;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class cl0 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ EnvironmentDao_Impl f;
    public final /* synthetic */ LocationRecord g;

    public /* synthetic */ cl0(EnvironmentDao_Impl environmentDao_Impl, LocationRecord locationRecord, int i) {
        this.e = i;
        this.f = environmentDao_Impl;
        this.g = locationRecord;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        LocationRecord locationRecord = this.g;
        EnvironmentDao_Impl environmentDao_Impl = this.f;
        zk2 zk2Var = (zk2) obj;
        switch (i) {
            case 0:
                return Long.valueOf(EnvironmentDao_Impl.insertLocation$lambda$0(environmentDao_Impl, locationRecord, zk2Var));
            default:
                return EnvironmentDao_Impl.updateSyncLocation$lambda$6(environmentDao_Impl, locationRecord, zk2Var);
        }
    }
}
