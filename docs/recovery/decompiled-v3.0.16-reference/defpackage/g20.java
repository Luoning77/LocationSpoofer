package defpackage;

import android.content.SharedPreferences;
import android.os.Build;
import com.vincenthzr.locationspoofer.data.BuildConfig;
import com.vincenthzr.locationspoofer.data.cloud.AccountBenefitsRepository;
import com.vincenthzr.locationspoofer.data.cloud.AccountCloudSessionStore;
import com.vincenthzr.locationspoofer.data.cloud.CloudGeoRepository;
import com.vincenthzr.locationspoofer.data.cloud.CloudRepository;
import com.vincenthzr.locationspoofer.data.cloud.CloudSessionStore;
import com.vincenthzr.locationspoofer.data.cloud.CommunityWifiRepository;
import com.vincenthzr.locationspoofer.data.cloud.MembershipRepository;
import com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager;
import com.vincenthzr.locationspoofer.data.db.AppDatabase;
import com.vincenthzr.locationspoofer.data.db.SavedRouteDao;
import com.vincenthzr.locationspoofer.data.motion.ConfigMotionSink;
import com.vincenthzr.locationspoofer.data.motion.MotionController;
import com.vincenthzr.locationspoofer.data.repository.HookStatusRepository;
import com.vincenthzr.locationspoofer.data.repository.LocationRepository;
import com.vincenthzr.locationspoofer.data.repository.SettingsRepository;
import com.vincenthzr.locationspoofer.data.repository.SpoofingServiceController;
import com.vincenthzr.locationspoofer.data.repository.WifiRepository;
import com.vincenthzr.locationspoofer.data.sharing.LocalSharingConsentStore;
import com.vincenthzr.locationspoofer.data.sharing.RadioSharingManager;
import com.vincenthzr.locationspoofer.data.sharing.RadioSharingRepository;
import com.vincenthzr.locationspoofer.data.sharing.RadioSharingSource;
import com.vincenthzr.locationspoofer.data.sharing.SharingConsentStore;
import com.vincenthzr.locationspoofer.data.state.SpoofingState;
import com.vincenthzr.locationspoofer.data.sync.AccountSyncManager;
import com.vincenthzr.locationspoofer.utils.ConfigManager;
import com.vincenthzr.locationspoofer.utils.LSPosedManager;
import kotlinx.coroutines.debug.internal.ConcurrentWeakMap;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class g20 implements pu0 {
    public final /* synthetic */ int e;

    public /* synthetic */ g20(int i) {
        this.e = i;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        int i2 = 9;
        boolean z = false;
        final int i3 = 1;
        q60 q60Var = null;
        switch (i) {
            case 0:
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    s83.b(ke0.N(2131625087, ov0Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 0, 0, 262142);
                } else {
                    ov0Var.W();
                }
                return mf3Var;
            case 1:
                f30 f30Var2 = (f30) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    t01.a(n51.u(), ke0.N(2131624056, ov0Var2), null, 0L, ov0Var2, 0, 12);
                } else {
                    ov0Var2.W();
                }
                return mf3Var;
            case 2:
                return ConcurrentWeakMap._get_keys_$lambda$0(obj, obj2);
            case 3:
                return ConcurrentWeakMap._get_entries_$lambda$1(obj, obj2);
            case 4:
                kn2 kn2Var = (kn2) obj;
                kn2Var.getClass();
                ((r52) obj2).getClass();
                return new WifiRepository((CommunityWifiRepository) kn2Var.a(xe2.a(CommunityWifiRepository.class), null));
            case Logger.WARN /* 5 */:
                kn2 kn2Var2 = (kn2) obj;
                kn2Var2.getClass();
                ((r52) obj2).getClass();
                return new LocationRepository((ConfigManager) kn2Var2.a(xe2.a(ConfigManager.class), null), (wi2) kn2Var2.a(xe2.a(wi2.class), null), (LSPosedManager) kn2Var2.a(xe2.a(LSPosedManager.class), null), (tt2) kn2Var2.a(xe2.a(tt2.class), null), (SavedRouteDao) kn2Var2.a(xe2.a(SavedRouteDao.class), null), (SpoofingServiceController) kn2Var2.a(xe2.a(SpoofingServiceController.class), null), (RuntimeAuthorizationManager) kn2Var2.a(xe2.a(RuntimeAuthorizationManager.class), null));
            case Logger.ERROR /* 6 */:
                kn2 kn2Var3 = (kn2) obj;
                kn2Var3.getClass();
                ((r52) obj2).getClass();
                return new AccountCloudSessionStore(dh0.i(kn2Var3), BuildConfig.CLOUD_API_BASE_URL);
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                kn2 kn2Var4 = (kn2) obj;
                kn2Var4.getClass();
                ((r52) obj2).getClass();
                return new SettingsRepository((tt2) kn2Var4.a(xe2.a(tt2.class), null));
            case 8:
                kn2 kn2Var5 = (kn2) obj;
                kn2Var5.getClass();
                ((r52) obj2).getClass();
                return new HookStatusRepository((wi2) kn2Var5.a(xe2.a(wi2.class), null));
            case mc0.b /* 9 */:
                kn2 kn2Var6 = (kn2) obj;
                kn2Var6.getClass();
                ((r52) obj2).getClass();
                final tt2 tt2Var = (tt2) kn2Var6.a(xe2.a(tt2.class), null);
                return new MotionController(new ConfigMotionSink((LocationRepository) kn2Var6.a(xe2.a(LocationRepository.class), null), (ConfigManager) kn2Var6.a(xe2.a(ConfigManager.class), null)), new au0() { // from class: a70
                    @Override // defpackage.au0
                    public final Object invoke() {
                        int i4 = i3;
                        tt2 tt2Var2 = tt2Var;
                        switch (i4) {
                            case 0:
                                return Boolean.valueOf(tt2Var2.b.getBoolean("is_spoofing_active", false) || SpoofingState.INSTANCE.isActive());
                            default:
                                SharedPreferences sharedPreferences = tt2Var2.b;
                                SpoofingState spoofingState = SpoofingState.INSTANCE;
                                int realismLevel = spoofingState.getRealismLevel();
                                Integer numValueOf = Integer.valueOf(realismLevel);
                                if (realismLevel < 0) {
                                    numValueOf = null;
                                }
                                Integer numValueOf2 = Integer.valueOf(numValueOf != null ? numValueOf.intValue() : sharedPreferences.getInt("realism_level", 2));
                                int speedFluctuationPct = spoofingState.getSpeedFluctuationPct();
                                Integer numValueOf3 = speedFluctuationPct >= 0 ? Integer.valueOf(speedFluctuationPct) : null;
                                return new i52(numValueOf2, Integer.valueOf(numValueOf3 != null ? numValueOf3.intValue() : sharedPreferences.getInt("speed_fluctuation_pct", 10)));
                        }
                    }
                }, null, false, new hd(kn2Var6, i2), 12, null);
            case mc0.c /* 10 */:
                kn2 kn2Var7 = (kn2) obj;
                kn2Var7.getClass();
                ((r52) obj2).getClass();
                return AppDatabase.Companion.getDatabase(dh0.i(kn2Var7));
            case 11:
                kn2 kn2Var8 = (kn2) obj;
                kn2Var8.getClass();
                ((r52) obj2).getClass();
                return ((AppDatabase) kn2Var8.a(xe2.a(AppDatabase.class), null)).environmentDao();
            case mc0.d /* 12 */:
                kn2 kn2Var9 = (kn2) obj;
                kn2Var9.getClass();
                ((r52) obj2).getClass();
                return ((AppDatabase) kn2Var9.a(xe2.a(AppDatabase.class), null)).savedRouteDao();
            case 13:
                kn2 kn2Var10 = (kn2) obj;
                kn2Var10.getClass();
                ((r52) obj2).getClass();
                k12 k12VarDefaultClient$core_data_globalRelease$default = CloudRepository.Companion.defaultClient$core_data_globalRelease$default(CloudRepository.Companion, null, 1, null);
                return new CloudRepository(BuildConfig.CLOUD_API_BASE_URL, (CloudSessionStore) kn2Var10.a(xe2.a(CloudSessionStore.class), null), k12VarDefaultClient$core_data_globalRelease$default, false, l13.B0(80, Build.MANUFACTURER + " " + Build.MODEL), null, null, false, null, 480, null);
            case 14:
                kn2 kn2Var11 = (kn2) obj;
                kn2Var11.getClass();
                ((r52) obj2).getClass();
                return new MembershipRepository((CloudRepository) kn2Var11.a(xe2.a(CloudRepository.class), null));
            case a83.e /* 15 */:
                ((kn2) obj).getClass();
                ((r52) obj2).getClass();
                return new wi2();
            case 16:
                kn2 kn2Var12 = (kn2) obj;
                kn2Var12.getClass();
                ((r52) obj2).getClass();
                return new RuntimeAuthorizationManager((CloudRepository) kn2Var12.a(xe2.a(CloudRepository.class), null), null, null, 6, null);
            case 17:
                kn2 kn2Var13 = (kn2) obj;
                kn2Var13.getClass();
                ((r52) obj2).getClass();
                wi2 wi2Var = (wi2) kn2Var13.a(xe2.a(wi2.class), null);
                RuntimeAuthorizationManager runtimeAuthorizationManager = (RuntimeAuthorizationManager) kn2Var13.a(xe2.a(RuntimeAuthorizationManager.class), null);
                return new oi2(new t5(2, wi2Var, wi2.class, "executeBackgroundCommand", "executeBackgroundCommand(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 1), new k(wi2Var, q60Var, 15), new t(runtimeAuthorizationManager, i2), new j2(7, kn2Var13, runtimeAuthorizationManager));
            case 18:
                kn2 kn2Var14 = (kn2) obj;
                kn2Var14.getClass();
                ((r52) obj2).getClass();
                return new CloudGeoRepository((CloudRepository) kn2Var14.a(xe2.a(CloudRepository.class), null));
            case 19:
                kn2 kn2Var15 = (kn2) obj;
                kn2Var15.getClass();
                ((r52) obj2).getClass();
                return new ConfigManager(dh0.i(kn2Var15), (wi2) kn2Var15.a(xe2.a(wi2.class), null), (RuntimeAuthorizationManager) kn2Var15.a(xe2.a(RuntimeAuthorizationManager.class), null), (CloudGeoRepository) kn2Var15.a(xe2.a(CloudGeoRepository.class), null));
            case 20:
                ((kn2) obj).getClass();
                ((r52) obj2).getClass();
                return new LSPosedManager();
            case 21:
                kn2 kn2Var16 = (kn2) obj;
                kn2Var16.getClass();
                ((r52) obj2).getClass();
                return new tt2(dh0.i(kn2Var16));
            case 22:
                kn2 kn2Var17 = (kn2) obj;
                kn2Var17.getClass();
                ((r52) obj2).getClass();
                return new AccountBenefitsRepository((CloudRepository) kn2Var17.a(xe2.a(CloudRepository.class), null));
            case 23:
                kn2 kn2Var18 = (kn2) obj;
                kn2Var18.getClass();
                ((r52) obj2).getClass();
                return new AccountSyncManager(dh0.i(kn2Var18), (CloudRepository) kn2Var18.a(xe2.a(CloudRepository.class), null), (tt2) kn2Var18.a(xe2.a(tt2.class), null), (AppDatabase) kn2Var18.a(xe2.a(AppDatabase.class), null));
            case 24:
                kn2 kn2Var19 = (kn2) obj;
                kn2Var19.getClass();
                ((r52) obj2).getClass();
                return new ul0(dh0.i(kn2Var19));
            case 25:
                kn2 kn2Var20 = (kn2) obj;
                kn2Var20.getClass();
                ((r52) obj2).getClass();
                return new CommunityWifiRepository((CloudRepository) kn2Var20.a(xe2.a(CloudRepository.class), null));
            case 26:
                kn2 kn2Var21 = (kn2) obj;
                kn2Var21.getClass();
                ((r52) obj2).getClass();
                return new RadioSharingRepository((CloudRepository) kn2Var21.a(xe2.a(CloudRepository.class), null));
            case 27:
                kn2 kn2Var22 = (kn2) obj;
                kn2Var22.getClass();
                ((r52) obj2).getClass();
                return new LocalSharingConsentStore(dh0.i(kn2Var22));
            case 28:
                kn2 kn2Var23 = (kn2) obj;
                kn2Var23.getClass();
                ((r52) obj2).getClass();
                final tt2 tt2Var2 = (tt2) kn2Var23.a(xe2.a(tt2.class), null);
                RadioSharingSource radioSharingSource = (RadioSharingSource) kn2Var23.a(xe2.a(RadioSharingSource.class), null);
                SharingConsentStore sharingConsentStore = (SharingConsentStore) kn2Var23.a(xe2.a(SharingConsentStore.class), null);
                final int i4 = z ? 1 : 0;
                return new RadioSharingManager(radioSharingSource, sharingConsentStore, new au0() { // from class: a70
                    @Override // defpackage.au0
                    public final Object invoke() {
                        int i5 = i4;
                        tt2 tt2Var3 = tt2Var2;
                        switch (i5) {
                            case 0:
                                return Boolean.valueOf(tt2Var3.b.getBoolean("is_spoofing_active", false) || SpoofingState.INSTANCE.isActive());
                            default:
                                SharedPreferences sharedPreferences = tt2Var3.b;
                                SpoofingState spoofingState = SpoofingState.INSTANCE;
                                int realismLevel = spoofingState.getRealismLevel();
                                Integer numValueOf = Integer.valueOf(realismLevel);
                                if (realismLevel < 0) {
                                    numValueOf = null;
                                }
                                Integer numValueOf2 = Integer.valueOf(numValueOf != null ? numValueOf.intValue() : sharedPreferences.getInt("realism_level", 2));
                                int speedFluctuationPct = spoofingState.getSpeedFluctuationPct();
                                Integer numValueOf3 = speedFluctuationPct >= 0 ? Integer.valueOf(speedFluctuationPct) : null;
                                return new i52(numValueOf2, Integer.valueOf(numValueOf3 != null ? numValueOf3.intValue() : sharedPreferences.getInt("speed_fluctuation_pct", 10)));
                        }
                    }
                }, null, 8, null);
            default:
                kn2 kn2Var24 = (kn2) obj;
                kn2Var24.getClass();
                ((r52) obj2).getClass();
                return new j22((CloudGeoRepository) kn2Var24.a(xe2.a(CloudGeoRepository.class), null));
        }
    }
}
