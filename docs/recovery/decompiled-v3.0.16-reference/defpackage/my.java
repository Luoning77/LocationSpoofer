package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.AccountBenefitsRepository;
import com.vincenthzr.locationspoofer.data.cloud.CloudGeoRepository;
import com.vincenthzr.locationspoofer.data.cloud.CloudRepository;
import com.vincenthzr.locationspoofer.data.cloud.CloudSessionStore;
import com.vincenthzr.locationspoofer.data.cloud.CloudSigningRetryKt;
import com.vincenthzr.locationspoofer.data.cloud.CloudStorageDiagnosticCollector;
import com.vincenthzr.locationspoofer.data.cloud.CommunityWifiRepository;
import com.vincenthzr.locationspoofer.data.cloud.DeviceSignalCollector;
import com.vincenthzr.locationspoofer.data.cloud.EncryptedCloudSessionStore;
import com.vincenthzr.locationspoofer.data.cloud.EncryptedMapResourceCache;
import com.vincenthzr.locationspoofer.data.cloud.MembershipRepository;
import com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager;
import com.vincenthzr.locationspoofer.data.db.AppDatabase;
import com.vincenthzr.locationspoofer.data.db.EnvironmentDao;
import com.vincenthzr.locationspoofer.data.db.EnvironmentDao_Impl;
import com.vincenthzr.locationspoofer.data.db.SavedRouteDao;
import com.vincenthzr.locationspoofer.data.model.CollectionRouteGeometryKt;
import com.vincenthzr.locationspoofer.data.motion.MotionController;
import com.vincenthzr.locationspoofer.data.repository.HookStatusRepository;
import com.vincenthzr.locationspoofer.data.repository.LocationRepository;
import com.vincenthzr.locationspoofer.data.repository.SettingsRepository;
import com.vincenthzr.locationspoofer.data.repository.WifiRepository;
import com.vincenthzr.locationspoofer.data.sharing.RadioSharingManager;
import com.vincenthzr.locationspoofer.data.sharing.RadioSharingSource;
import com.vincenthzr.locationspoofer.data.sharing.SharingConsentStore;
import com.vincenthzr.locationspoofer.data.sync.AccountSyncManager;
import com.vincenthzr.locationspoofer.utils.ConfigManager;
import com.vincenthzr.locationspoofer.utils.LSPosedManager;
import com.vincenthzr.locationspoofer.xposed.hooks.delivery.FrameworkBleReflection;
import java.lang.reflect.Method;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class my implements lu0 {
    public final /* synthetic */ int e;

    public /* synthetic */ my(int i) {
        this.e = i;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                return CloudRepository.downloadArtifact$lambda$96(((Integer) obj).intValue());
            case 1:
                return CloudSessionStore.publicKeyFingerprint$lambda$0(((Byte) obj).byteValue());
            case 2:
                return CloudSigningRetryKt.retryCloudSignature$lambda$0((Exception) obj);
            case 3:
                return CloudStorageDiagnosticCollector.collect$lambda$0((Throwable) obj);
            case 4:
                return CollectionRouteGeometryKt.collectionRouteJson$lambda$0((y61) obj);
            case Logger.WARN /* 5 */:
                iv1 iv1Var = (iv1) obj;
                iv1Var.getClass();
                g20 g20Var = new g20(14);
                ox oxVarA = xe2.a(MembershipRepository.class);
                j13 j13Var = mn2.i;
                t91 t91Var = t91.e;
                iv1Var.a(new vv2(new ir(j13Var, oxVarA, g20Var, t91Var)));
                iv1Var.a(new vv2(new ir(j13Var, xe2.a(CloudSessionStore.class), new g20(6), t91Var)));
                iv1Var.a(new vv2(new ir(j13Var, xe2.a(CloudRepository.class), new g20(13), t91Var)));
                iv1Var.a(new vv2(new ir(j13Var, xe2.a(wi2.class), new g20(15), t91Var)));
                iv1Var.a(new vv2(new ir(j13Var, xe2.a(RuntimeAuthorizationManager.class), new g20(16), t91Var)));
                iv1Var.a(new vv2(new ir(j13Var, xe2.a(oi2.class), new g20(17), t91Var)));
                iv1Var.a(new vv2(new ir(j13Var, xe2.a(CloudGeoRepository.class), new g20(18), t91Var)));
                iv1Var.a(new vv2(new ir(j13Var, xe2.a(ConfigManager.class), new g20(19), t91Var)));
                iv1Var.a(new vv2(new ir(j13Var, xe2.a(LSPosedManager.class), new g20(20), t91Var)));
                iv1Var.a(new vv2(new ir(j13Var, xe2.a(tt2.class), new g20(21), t91Var)));
                iv1Var.a(new vv2(new ir(j13Var, xe2.a(AccountBenefitsRepository.class), new g20(22), t91Var)));
                iv1Var.a(new vv2(new ir(j13Var, xe2.a(AccountSyncManager.class), new g20(23), t91Var)));
                iv1Var.a(new vv2(new ir(j13Var, xe2.a(ul0.class), new g20(24), t91Var)));
                iv1Var.a(new vv2(new ir(j13Var, xe2.a(CommunityWifiRepository.class), new g20(25), t91Var)));
                iv1Var.a(new vv2(new ir(j13Var, xe2.a(RadioSharingSource.class), new g20(26), t91Var)));
                iv1Var.a(new vv2(new ir(j13Var, xe2.a(SharingConsentStore.class), new g20(27), t91Var)));
                iv1Var.a(new vv2(new ir(j13Var, xe2.a(RadioSharingManager.class), new g20(28), t91Var)));
                iv1Var.a(new vv2(new ir(j13Var, xe2.a(j22.class), new g20(29), t91Var)));
                iv1Var.a(new vv2(new ir(j13Var, xe2.a(WifiRepository.class), new g20(4), t91Var)));
                iv1Var.a(new vv2(new ir(j13Var, xe2.a(LocationRepository.class), new g20(5), t91Var)));
                iv1Var.a(new vv2(new ir(j13Var, xe2.a(SettingsRepository.class), new g20(7), t91Var)));
                iv1Var.a(new vv2(new ir(j13Var, xe2.a(HookStatusRepository.class), new g20(8), t91Var)));
                iv1Var.a(new vv2(new ir(j13Var, xe2.a(MotionController.class), new g20(9), t91Var)));
                iv1Var.a(new vv2(new ir(j13Var, xe2.a(AppDatabase.class), new g20(10), t91Var)));
                iv1Var.a(new vv2(new ir(j13Var, xe2.a(EnvironmentDao.class), new g20(11), t91Var)));
                iv1Var.a(new vv2(new ir(j13Var, xe2.a(SavedRouteDao.class), new g20(12), t91Var)));
                return mf3Var;
            case Logger.ERROR /* 6 */:
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return CoroutineDispatcher.Key._init_$lambda$0((w70) obj);
            case 8:
                ((Long) obj).getClass();
                return mf3Var;
            case mc0.b /* 9 */:
                return Boolean.valueOf(DebugProbesImpl.dumpCoroutinesSynchronized$lambda$14((DebugProbesImpl.CoroutineOwner) obj));
            case mc0.c /* 10 */:
                qs2.f((ss2) obj);
                return mf3Var;
            case 11:
                return DeviceSignalCollector.Companion.hashSignal$lambda$15(((Byte) obj).byteValue());
            case mc0.d /* 12 */:
                return mf3Var;
            case 13:
                return mf3Var;
            case 14:
                return Boolean.TRUE;
            case a83.e /* 15 */:
                return mf3Var;
            case 16:
                return EncryptedCloudSessionStore.storageFailure$lambda$64((Throwable) obj);
            case 17:
                return EncryptedCloudSessionStore.mapCache_delegate$lambda$15$lambda$14((String) obj);
            case 18:
                return EncryptedCloudSessionStore.recordStorageFailure$lambda$66((Throwable) obj);
            case 19:
                return EncryptedCloudSessionStore.recordStorageFailure$lambda$67((Throwable) obj);
            case 20:
                return EncryptedCloudSessionStore.keyStoreError$lambda$35((Throwable) obj);
            case 21:
                return EncryptedCloudSessionStore.Companion.hex$lambda$0(((Byte) obj).byteValue());
            case 22:
                return EncryptedMapResourceCache._init_$lambda$0((String) obj);
            case 23:
                return EnvironmentDao_Impl.clearAll$lambda$30("DELETE FROM location_records", (zk2) obj);
            case 24:
                return Integer.valueOf(EnvironmentDao_Impl.getRecordCount$lambda$22("SELECT (SELECT COUNT(*) FROM location_records WHERE collectionRouteId IS NULL) + (SELECT COUNT(*) FROM collection_routes)", (zk2) obj));
            case 25:
                return EnvironmentDao_Impl.clearCollectionRoutes$lambda$31("DELETE FROM collection_routes", (zk2) obj);
            case 26:
                return EnvironmentDao_Impl.getAllLocations$lambda$19("SELECT * FROM location_records", (zk2) obj);
            case 27:
                return ExecutorCoroutineDispatcher.Key._init_$lambda$0((w70) obj);
            case 28:
                return FrameworkBleReflection.methods$lambda$6((Class) obj);
            default:
                return Boolean.valueOf(FrameworkBleReflection.resolve$lambda$14((Method) obj));
        }
    }
}
