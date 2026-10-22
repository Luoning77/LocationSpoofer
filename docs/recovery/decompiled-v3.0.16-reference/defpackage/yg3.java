package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudGeoRepository;
import com.vincenthzr.locationspoofer.data.cloud.CloudRepository;
import com.vincenthzr.locationspoofer.data.cloud.MembershipRepository;
import com.vincenthzr.locationspoofer.data.db.EnvironmentDao;
import com.vincenthzr.locationspoofer.data.motion.MotionController;
import com.vincenthzr.locationspoofer.data.repository.LocationRepository;
import com.vincenthzr.locationspoofer.data.repository.SettingsRepository;
import com.vincenthzr.locationspoofer.data.repository.WifiRepository;
import com.vincenthzr.locationspoofer.data.sharing.RadioSharingManager;
import com.vincenthzr.locationspoofer.data.sync.AccountSyncManager;
import com.vincenthzr.locationspoofer.utils.LSPosedManager;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class yg3 implements pu0 {
    public final /* synthetic */ int e;

    public /* synthetic */ yg3(int i) {
        this.e = i;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((hb1) obj).l = true;
                return mf3.a;
            case 1:
                kn2 kn2Var = (kn2) obj;
                kn2Var.getClass();
                ((r52) obj2).getClass();
                return new is1((MembershipRepository) kn2Var.a(xe2.a(MembershipRepository.class), null));
            case 2:
                kn2 kn2Var2 = (kn2) obj;
                kn2Var2.getClass();
                ((r52) obj2).getClass();
                return new l6((CloudRepository) kn2Var2.a(xe2.a(CloudRepository.class), null));
            case 3:
                kn2 kn2Var3 = (kn2) obj;
                kn2Var3.getClass();
                ((r52) obj2).getClass();
                return new ul1((LocationRepository) kn2Var3.a(xe2.a(LocationRepository.class), null), (SettingsRepository) kn2Var3.a(xe2.a(SettingsRepository.class), null), (LSPosedManager) kn2Var3.a(xe2.a(LSPosedManager.class), null), (ul0) kn2Var3.a(xe2.a(ul0.class), null), (EnvironmentDao) kn2Var3.a(xe2.a(EnvironmentDao.class), null), (WifiRepository) kn2Var3.a(xe2.a(WifiRepository.class), null), (j22) kn2Var3.a(xe2.a(j22.class), null), (MotionController) kn2Var3.a(xe2.a(MotionController.class), null), dh0.i(kn2Var3), (CloudGeoRepository) kn2Var3.a(xe2.a(CloudGeoRepository.class), null), (RadioSharingManager) kn2Var3.a(xe2.a(RadioSharingManager.class), null), (AccountSyncManager) kn2Var3.a(xe2.a(AccountSyncManager.class), null));
            case 4:
                kn2 kn2Var4 = (kn2) obj;
                kn2Var4.getClass();
                ((r52) obj2).getClass();
                return new xg3(dh0.i(kn2Var4), (CloudRepository) kn2Var4.a(xe2.a(CloudRepository.class), null));
            default:
                kn2 kn2Var5 = (kn2) obj;
                kn2Var5.getClass();
                ((r52) obj2).getClass();
                return new lo1((EnvironmentDao) kn2Var5.a(xe2.a(EnvironmentDao.class), null));
        }
    }
}
