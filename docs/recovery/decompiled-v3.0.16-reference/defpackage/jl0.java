package defpackage;

import com.vincenthzr.locationspoofer.data.db.EnvironmentDao_Impl;
import java.io.Serializable;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class jl0 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ long h;

    public /* synthetic */ jl0(Serializable serializable, Object obj, long j, int i) {
        this.e = i;
        this.f = serializable;
        this.g = obj;
        this.h = j;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        long j = this.h;
        Object obj2 = this.g;
        Serializable serializable = this.f;
        switch (i) {
            case 0:
                return EnvironmentDao_Impl.updateBasicInfo$lambda$29("UPDATE location_records SET placeName = ?, remark = ? WHERE id = ?", (String) serializable, (String) obj2, j, (zk2) obj);
            case 1:
                return EnvironmentDao_Impl.updateCollectionRouteInfo$lambda$26("UPDATE collection_routes SET name = ?, remark = ? WHERE id = ?", (String) serializable, (String) obj2, j, (zk2) obj);
            default:
                ue2 ue2Var = (ue2) serializable;
                xg3 xg3Var = (xg3) obj2;
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue != ue2Var.e) {
                    ue2Var.e = iIntValue;
                    BuildersKt__Builders_commonKt.launch$default(am1.y(xg3Var), null, null, new wg3(xg3Var, this.h, iIntValue, null), 3, null);
                }
                return mf3.a;
        }
    }
}
