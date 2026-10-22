package com.vincenthzr.locationspoofer.data.repository;

import android.content.Context;
import com.vincenthzr.locationspoofer.data.cloud.CloudException;
import com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorization;
import com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager;
import com.vincenthzr.locationspoofer.data.db.SavedRouteDao;
import com.vincenthzr.locationspoofer.data.db.SavedRouteEntity;
import com.vincenthzr.locationspoofer.data.model.RootSolution;
import com.vincenthzr.locationspoofer.data.model.RoutePoint;
import com.vincenthzr.locationspoofer.data.state.SpoofingState;
import com.vincenthzr.locationspoofer.utils.ConfigManager;
import com.vincenthzr.locationspoofer.utils.LSPosedManager;
import defpackage.au0;
import defpackage.ca0;
import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.l80;
import defpackage.lh;
import defpackage.lt2;
import defpackage.lu0;
import defpackage.mc0;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.r13;
import defpackage.r60;
import defpackage.s13;
import defpackage.s90;
import defpackage.tt2;
import defpackage.ui2;
import defpackage.uj0;
import defpackage.vi2;
import defpackage.vj0;
import defpackage.wi2;
import defpackage.z70;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class LocationRepository {
    private final ConfigManager configManager;
    private volatile Boolean lastRootAccess;
    private final Mutex lifecycleMutex;
    private final LSPosedManager lsposedManager;
    private final wi2 rootManager;
    private volatile Context runningContext;
    private final RuntimeAuthorizationManager runtimeAuthorization;
    private final SavedRouteDao savedRouteDao;
    private final tt2 settingsManager;
    private final SpoofingServiceController spoofingServiceController;

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.repository.LocationRepository$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.repository.LocationRepository$1", f = "LocationRepository.kt", l = {47}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends k33 implements lu0 {
        int I$0;
        Object L$0;
        int label;

        public AnonymousClass1(q60 q60Var) {
            super(1, q60Var);
        }

        @Override // defpackage.oq
        public final q60 create(q60 q60Var) {
            return LocationRepository.this.new AnonymousClass1(q60Var);
        }

        @Override // defpackage.lu0
        public final Object invoke(q60 q60Var) {
            return ((AnonymousClass1) create(q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ee0.J(obj);
                Context context = LocationRepository.this.runningContext;
                if (context != null) {
                    LocationRepository locationRepository = LocationRepository.this;
                    this.L$0 = null;
                    this.I$0 = 0;
                    this.label = 1;
                    Object objStopSpoofing = locationRepository.stopSpoofing(context, false, this);
                    z70 z70Var = z70.e;
                    if (objStopSpoofing == z70Var) {
                        return z70Var;
                    }
                }
            } else {
                if (i != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
            }
            return mf3.a;
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.repository.LocationRepository$checkRootAccess$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.repository.LocationRepository", f = "LocationRepository.kt", l = {LockFreeTaskQueueCore.CLOSED_SHIFT}, m = "checkRootAccess")
    public static final class C00821 extends r60 {
        int label;
        /* synthetic */ Object result;

        public C00821(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocationRepository.this.checkRootAccess(this);
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.repository.LocationRepository$recoverAfterBoot$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.repository.LocationRepository", f = "LocationRepository.kt", l = {83, 91, 108, 111}, m = "recoverAfterBoot")
    public static final class C00831 extends r60 {
        double D$0;
        double D$1;
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C00831(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocationRepository.this.recoverAfterBoot(null, this);
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.repository.LocationRepository$startSpoofingInternal$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.repository.LocationRepository", f = "LocationRepository.kt", l = {170, 470, 182, 205, 209, 240, 246, 249}, m = "startSpoofingInternal")
    public static final class C00841 extends r60 {
        double D$0;
        double D$1;
        double D$2;
        double D$3;
        float F$0;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        boolean Z$0;
        boolean Z$1;
        boolean Z$2;
        boolean Z$3;
        boolean Z$4;
        boolean Z$5;
        boolean Z$6;
        boolean Z$7;
        boolean Z$8;
        boolean Z$9;
        int label;
        /* synthetic */ Object result;

        public C00841(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocationRepository.this.startSpoofingInternal(null, 0.0d, 0.0d, null, 0.0f, 0L, null, false, null, null, null, null, false, false, false, false, 0.0d, false, false, 0, false, false, this);
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.repository.LocationRepository$stopLocked$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.repository.LocationRepository", f = "LocationRepository.kt", l = {285, 319}, m = "stopLocked")
    public static final class C00851 extends r60 {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C00851(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocationRepository.this.stopLocked(null, this);
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.repository.LocationRepository$stopSpoofing$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.repository.LocationRepository$stopSpoofing$2", f = "LocationRepository.kt", l = {265}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends k33 implements pu0 {
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, q60 q60Var) {
            super(2, q60Var);
            this.$context = context;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            return LocationRepository.this.new AnonymousClass2(this.$context, q60Var);
        }

        @Override // defpackage.pu0
        public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
            return ((AnonymousClass2) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ee0.J(obj);
                Job jobRequestRuntimeStop = LocationRepository.this.requestRuntimeStop(this.$context);
                this.label = 1;
                Object objJoin = jobRequestRuntimeStop.join(this);
                z70 z70Var = z70.e;
                if (objJoin == z70Var) {
                    return z70Var;
                }
            } else {
                if (i != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
            }
            return mf3.a;
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.repository.LocationRepository$stopSpoofing$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.repository.LocationRepository$stopSpoofing$3", f = "LocationRepository.kt", l = {470, 268}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends k33 implements pu0 {
        final /* synthetic */ Context $context;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Context context, q60 q60Var) {
            super(2, q60Var);
            this.$context = context;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            return LocationRepository.this.new AnonymousClass3(this.$context, q60Var);
        }

        @Override // defpackage.pu0
        public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
            return ((AnonymousClass3) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) throws Throwable {
            Mutex mutex;
            LocationRepository locationRepository;
            Context context;
            int i;
            Throwable th;
            Mutex mutex2;
            int i2 = this.label;
            z70 z70Var = z70.e;
            try {
                if (i2 == 0) {
                    ee0.J(obj);
                    mutex = LocationRepository.this.lifecycleMutex;
                    locationRepository = LocationRepository.this;
                    Context context2 = this.$context;
                    this.L$0 = mutex;
                    this.L$1 = locationRepository;
                    this.L$2 = context2;
                    this.I$0 = 0;
                    this.label = 1;
                    if (mutex.lock(null, this) != z70Var) {
                        context = context2;
                        i = 0;
                    }
                    return z70Var;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutex2 = (Mutex) this.L$0;
                    try {
                        ee0.J(obj);
                        mutex2.unlock(null);
                        return mf3.a;
                    } catch (Throwable th2) {
                        th = th2;
                        mutex2.unlock(null);
                        throw th;
                    }
                }
                i = this.I$0;
                context = (Context) this.L$2;
                locationRepository = (LocationRepository) this.L$1;
                Mutex mutex3 = (Mutex) this.L$0;
                ee0.J(obj);
                mutex = mutex3;
                this.L$0 = mutex;
                this.L$1 = null;
                this.L$2 = null;
                this.I$0 = i;
                this.I$1 = 0;
                this.label = 2;
                if (locationRepository.stopLocked(context, this) != z70Var) {
                    mutex2 = mutex;
                    mutex2.unlock(null);
                    return mf3.a;
                }
                return z70Var;
            } catch (Throwable th3) {
                Mutex mutex4 = mutex;
                th = th3;
                mutex2 = mutex4;
                mutex2.unlock(null);
                throw th;
            }
        }
    }

    public LocationRepository(ConfigManager configManager, wi2 wi2Var, LSPosedManager lSPosedManager, tt2 tt2Var, SavedRouteDao savedRouteDao, SpoofingServiceController spoofingServiceController, RuntimeAuthorizationManager runtimeAuthorizationManager) {
        configManager.getClass();
        wi2Var.getClass();
        lSPosedManager.getClass();
        tt2Var.getClass();
        savedRouteDao.getClass();
        spoofingServiceController.getClass();
        runtimeAuthorizationManager.getClass();
        this.configManager = configManager;
        this.rootManager = wi2Var;
        this.lsposedManager = lSPosedManager;
        this.settingsManager = tt2Var;
        this.savedRouteDao = savedRouteDao;
        this.spoofingServiceController = spoofingServiceController;
        this.runtimeAuthorization = runtimeAuthorizationManager;
        this.lifecycleMutex = MutexKt.Mutex$default(false, 1, null);
        runtimeAuthorizationManager.registerStopHandler("location-repository", new AnonymousClass1(null));
    }

    private final RootSolution currentRootSolution() {
        try {
            String str = "AUTO";
            String string = this.settingsManager.b.getString("root_solution", "AUTO");
            if (string != null) {
                str = string;
            }
            return RootSolution.valueOf(str);
        } catch (Exception unused) {
            return RootSolution.AUTO;
        }
    }

    private final String routePointsToJson(List<RoutePoint> list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (RoutePoint routePoint : list) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("lat", routePoint.getLat());
            jSONObject.put("lng", routePoint.getLng());
            jSONArray.put(jSONObject);
        }
        String string = jSONArray.toString();
        string.getClass();
        return string;
    }

    public static /* synthetic */ void setFloatingJoystickVisible$default(LocationRepository locationRepository, Context context, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        locationRepository.setFloatingJoystickVisible(context, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:113:0x0712  */
    /* JADX WARN: Code duplicated, block: B:132:0x078d  */
    /* JADX WARN: Code duplicated, block: B:136:0x07b9  */
    /* JADX WARN: Code duplicated, block: B:178:0x0870  */
    /* JADX WARN: Code duplicated, block: B:186:0x08ae  */
    /* JADX WARN: Code duplicated, block: B:187:0x08af  */
    /* JADX WARN: Code duplicated, block: B:195:0x08e0  */
    /* JADX WARN: Code duplicated, block: B:198:0x08f0  */
    /* JADX WARN: Code duplicated, block: B:199:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:202:0x08f8 A[Catch: all -> 0x08bd, TRY_ENTER, TRY_LEAVE, TryCatch #59 {all -> 0x08bd, blocks: (B:190:0x08b6, B:202:0x08f8), top: B:676:0x08b6 }] */
    /* JADX WARN: Code duplicated, block: B:204:0x08fd  */
    /* JADX WARN: Code duplicated, block: B:237:0x09c2  */
    /* JADX WARN: Code duplicated, block: B:240:0x09f4 A[Catch: all -> 0x0c62, TRY_LEAVE, TryCatch #27 {all -> 0x0c62, blocks: (B:238:0x09ec, B:240:0x09f4), top: B:612:0x09ec }] */
    /* JADX WARN: Code duplicated, block: B:280:0x0ace  */
    /* JADX WARN: Code duplicated, block: B:309:0x0b6e  */
    /* JADX WARN: Code duplicated, block: B:386:0x0c6a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0628  */
    /* JADX WARN: Code duplicated, block: B:553:0x10e5 A[Catch: all -> 0x10e6, TRY_LEAVE, TryCatch #74 {all -> 0x10e6, blocks: (B:553:0x10e5, B:550:0x107e), top: B:706:0x107e }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0654  */
    /* JADX WARN: Code duplicated, block: B:606:0x064e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0671 A[Catch: all -> 0x0658, TryCatch #24 {all -> 0x0658, blocks: (B:55:0x064e, B:62:0x065d, B:64:0x0671, B:69:0x0681, B:74:0x0691, B:73:0x068c), top: B:606:0x064e }] */
    /* JADX WARN: Code duplicated, block: B:668:0x0780 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:676:0x08b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0680 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:71:0x0688 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:73:0x068c A[Catch: all -> 0x0658, TryCatch #24 {all -> 0x0658, blocks: (B:55:0x064e, B:62:0x065d, B:64:0x0671, B:69:0x0681, B:74:0x0691, B:73:0x068c), top: B:606:0x064e }] */
    /* JADX WARN: Code duplicated, block: B:767:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:768:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:769:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unexpected iteration count in SwitchBreakVisitor. Please report as an issue */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final Object startSpoofingInternal(Context context, double d, double d2, String str, float f, long j, List<RoutePoint> list, boolean z, Map<String, String> map, String str2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5, double d3, boolean z6, boolean z7, int i, boolean z8, boolean z9, q60 q60Var) throws Throwable {
        C00841 c00841;
        double d4;
        double d5;
        float f2;
        Context context2;
        long j2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        double d6;
        boolean z15;
        int i2;
        boolean z16;
        boolean z17;
        boolean z18;
        String str5;
        String str6;
        String str7;
        List<RoutePoint> list2;
        Map<String, String> map2;
        String str8;
        Mutex mutex;
        String str9;
        Context context3;
        long j3;
        String str10;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        double d7;
        boolean z23;
        boolean z24;
        int i3;
        boolean z25;
        boolean z26;
        boolean z27;
        z70 z70Var;
        Context context4;
        float f3;
        boolean z28;
        String str11;
        boolean z29;
        boolean z30;
        boolean z31;
        long j4;
        boolean z32;
        boolean z33;
        boolean z34;
        int i4;
        boolean z35;
        double d8;
        int i5;
        Mutex mutex2;
        String str12;
        Mutex mutex3;
        lt2 lt2Var;
        boolean z36;
        lt2 lt2Var2;
        lt2 lt2VarL;
        boolean z37;
        boolean z38;
        boolean z39;
        Context context5;
        float f4;
        long j5;
        boolean z40;
        double d9;
        boolean z41;
        int i6;
        LocationRepository locationRepository;
        boolean z42;
        boolean z43;
        boolean z44;
        int i7;
        int i8;
        double d10;
        boolean z45;
        int i9;
        boolean z46;
        float f5;
        Context context6;
        boolean z47;
        boolean z48;
        boolean z49;
        boolean z50;
        double d11;
        Throwable th;
        double d12;
        boolean z51;
        long j6;
        RuntimeAuthorizationManager runtimeAuthorizationManager;
        Context context7;
        String str13;
        long j7;
        boolean z52;
        boolean z53;
        boolean z54;
        boolean z55;
        double d13;
        boolean z56;
        boolean z57;
        int i10;
        boolean z58;
        int i11;
        z70 z70Var2;
        boolean z59;
        Set<String> set;
        boolean z60;
        int i12;
        Mutex mutex4;
        boolean z61;
        int i13;
        boolean z62;
        String str14;
        float f6;
        Context context8;
        boolean z63;
        boolean z64;
        boolean z65;
        long j8;
        boolean z66;
        double d14;
        int i14;
        Map<String, String> map3;
        boolean z67;
        Mutex mutex5;
        SpoofingState spoofingState;
        double d15;
        boolean z68;
        wi2 wi2Var;
        Map<String, String> map4;
        Set<String> set2;
        String str15;
        boolean z69;
        boolean z70;
        double d16;
        boolean z71;
        int i15;
        boolean z72;
        boolean z73;
        int i16;
        int i17;
        z70 z70Var3;
        List<RoutePoint> list3;
        Map<String, String> map5;
        Set<String> set3;
        String str16;
        Context context9;
        boolean z74;
        boolean z75;
        double d17;
        boolean z76;
        int i18;
        boolean z77;
        boolean z78;
        int i19;
        int i20;
        boolean z79;
        z70 z70Var4;
        boolean z80;
        Mutex mutex6;
        double d18;
        boolean z81;
        boolean z82;
        double d19;
        boolean z83;
        z70 z70Var5;
        boolean z84;
        String str17;
        String string;
        Double dR;
        double dDoubleValue;
        String str18;
        String string2;
        Integer numA0;
        int iIntValue;
        boolean z85;
        boolean z86;
        double d20;
        boolean z87;
        boolean z88;
        boolean z89;
        int i21;
        double d21;
        int i22;
        Set<String> set4;
        C00841 c00842;
        Object objSaveConfig;
        double d22;
        double d23;
        double d24;
        boolean z90;
        boolean z91;
        boolean z92;
        int i23;
        double d25;
        boolean z93;
        boolean z94;
        Context context10;
        Mutex mutex7;
        boolean z95;
        int i24;
        int i25;
        Object obj;
        Set<String> set5;
        boolean z96;
        boolean zBooleanValue;
        boolean z97;
        long runGeneration;
        LocationRepository$startSpoofingInternal$2$2 locationRepository$startSpoofingInternal$2$2;
        LocationRepository locationRepository2;
        boolean z98;
        int i26;
        boolean z99;
        boolean z100;
        int i27;
        int i28;
        int i29;
        double d26;
        boolean z101;
        int i30;
        Mutex mutex8;
        double d27;
        long j9;
        Context context11;
        boolean z102;
        int i31;
        boolean z103;
        boolean z104;
        boolean z105;
        int i32;
        int i33;
        boolean z106;
        boolean z107;
        double d28;
        double d29;
        Context context12;
        double d30;
        int i34;
        double d31;
        boolean z108;
        RuntimeAuthorizationManager runtimeAuthorizationManager2;
        boolean z109;
        boolean z110;
        boolean z111;
        int i35;
        boolean z112;
        boolean z113;
        int i36;
        int i37;
        Mutex mutex9;
        Object obj2;
        NonCancellable nonCancellable;
        LocationRepository$startSpoofingInternal$2$3 locationRepository$startSpoofingInternal$2$3;
        z70 z70Var6;
        if (q60Var instanceof C00841) {
            c00841 = (C00841) q60Var;
            int i38 = c00841.label;
            if ((i38 & Integer.MIN_VALUE) != 0) {
                c00841.label = i38 - Integer.MIN_VALUE;
            } else {
                c00841 = new C00841(q60Var);
            }
        } else {
            c00841 = new C00841(q60Var);
        }
        Object obj3 = c00841.result;
        z70 z70Var7 = z70.e;
        switch (c00841.label) {
            case 0:
                ee0.J(obj3);
                RuntimeAuthorizationManager runtimeAuthorizationManager3 = this.runtimeAuthorization;
                c00841.L$0 = context;
                c00841.L$1 = str;
                c00841.L$2 = list;
                c00841.L$3 = map;
                c00841.L$4 = str2;
                c00841.L$5 = str3;
                c00841.L$6 = str4;
                d4 = d;
                c00841.D$0 = d4;
                d5 = d2;
                c00841.D$1 = d5;
                f2 = f;
                c00841.F$0 = f2;
                c00841.J$0 = j;
                c00841.Z$0 = z;
                c00841.Z$1 = z2;
                c00841.Z$2 = z3;
                c00841.Z$3 = z4;
                c00841.Z$4 = z5;
                c00841.D$2 = d3;
                c00841.Z$5 = z6;
                c00841.Z$6 = z7;
                c00841.I$0 = i;
                c00841.Z$7 = z8;
                c00841.Z$8 = z9;
                c00841.label = 1;
                if (runtimeAuthorizationManager3.awaitStopped(c00841) != z70Var7) {
                    context2 = context;
                    j2 = j;
                    z10 = z;
                    z11 = z2;
                    z12 = z3;
                    z13 = z4;
                    z14 = z5;
                    d6 = d3;
                    z15 = z6;
                    i2 = i;
                    z16 = z8;
                    z17 = z9;
                    z18 = z7;
                    str5 = str2;
                    str6 = str3;
                    str7 = str4;
                    list2 = list;
                    map2 = map;
                    str8 = str;
                    mutex = this.lifecycleMutex;
                    c00841.L$0 = context2;
                    c00841.L$1 = str8;
                    c00841.L$2 = list2;
                    c00841.L$3 = map2;
                    c00841.L$4 = str5;
                    c00841.L$5 = str6;
                    c00841.L$6 = str7;
                    c00841.L$7 = mutex;
                    c00841.D$0 = d4;
                    c00841.D$1 = d5;
                    c00841.F$0 = f2;
                    str9 = str6;
                    context3 = context2;
                    j3 = j2;
                    c00841.J$0 = j3;
                    str10 = str5;
                    c00841.Z$0 = z10;
                    z19 = z11;
                    c00841.Z$1 = z19;
                    z20 = z12;
                    c00841.Z$2 = z20;
                    z21 = z13;
                    c00841.Z$3 = z21;
                    z22 = z14;
                    c00841.Z$4 = z22;
                    d7 = d6;
                    c00841.D$2 = d7;
                    z23 = z15;
                    c00841.Z$5 = z23;
                    z24 = z18;
                    c00841.Z$6 = z24;
                    i3 = i2;
                    c00841.I$0 = i3;
                    z25 = z16;
                    c00841.Z$7 = z25;
                    z26 = z17;
                    c00841.Z$8 = z26;
                    c00841.I$1 = 0;
                    c00841.label = 2;
                    z70Var7 = z70Var7;
                    if (mutex.lock(null, c00841) != z70Var7) {
                        z27 = z26;
                        z70Var = z70Var7;
                        context4 = context3;
                        f3 = f2;
                        z28 = z10;
                        str11 = str10;
                        z29 = z19;
                        z30 = z20;
                        z31 = z21;
                        j4 = j3;
                        z32 = z22;
                        z33 = z23;
                        z34 = z24;
                        i4 = i3;
                        z35 = z25;
                        d8 = d7;
                        i5 = 0;
                        mutex2 = mutex;
                        str12 = str9;
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (z27) {
                                                                                            try {
                                                                                                if (!getHasLiveSimulation()) {
                                                                                                }
                                                                                                mutex2.unlock(null);
                                                                                                return mf3.a;
                                                                                            } catch (Throwable th2) {
                                                                                                th = th2;
                                                                                                mutex3 = mutex2;
                                                                                                obj2 = null;
                                                                                                mutex3.unlock(obj2);
                                                                                                throw th;
                                                                                            }
                                                                                        }
                                                                                        c00841.I$2 = 0;
                                                                                        c00841.label = 3;
                                                                                        i11 = 0;
                                                                                        z70Var2 = z70Var;
                                                                                        if (runtimeAuthorizationManager.authorizeStart(lt2VarL, false, z42, c00841) == z70Var2) {
                                                                                            return z70Var2;
                                                                                        }
                                                                                        z59 = z36;
                                                                                        set = lt2VarL;
                                                                                        z60 = z42;
                                                                                        i12 = i5;
                                                                                        z70Var = z70Var2;
                                                                                        mutex4 = mutex2;
                                                                                        z61 = z35;
                                                                                        i13 = i4;
                                                                                        z62 = z34;
                                                                                        str14 = str13;
                                                                                        f6 = f4;
                                                                                        context8 = context5;
                                                                                        z63 = z38;
                                                                                        z64 = z37;
                                                                                        z65 = z39;
                                                                                        j8 = j5;
                                                                                        z66 = z40;
                                                                                        d14 = d9;
                                                                                        i14 = 0;
                                                                                        map3 = map2;
                                                                                        z67 = z41;
                                                                                        try {
                                                                                            spoofingState = SpoofingState.INSTANCE;
                                                                                            c00841 = c00841;
                                                                                            try {
                                                                                                spoofingState.setActive(true);
                                                                                                spoofingState.setLatitude(d4);
                                                                                                spoofingState.setLongitude(d5);
                                                                                                spoofingState.setStartTimestamp(j8);
                                                                                                locationRepository = this;
                                                                                                try {
                                                                                                    try {
                                                                                                        d5 = d5;
                                                                                                        try {
                                                                                                            try {
                                                                                                                spoofingState.setRealismLevel(locationRepository.settingsManager.b.getInt("realism_level", 2));
                                                                                                                try {
                                                                                                                    d15 = d4;
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            spoofingState.setSpeedFluctuationPct(locationRepository.settingsManager.b.getInt("speed_fluctuation_pct", 10));
                                                                                                                            spoofingState.setRouteDistanceOffset(0.0d);
                                                                                                                            if (list2.size() >= 2) {
                                                                                                                                z68 = false;
                                                                                                                                spoofingState.setRouteLateralDeviation(z68);
                                                                                                                                spoofingState.setRouteLateralSeed(j8);
                                                                                                                                spoofingState.setSimMode(str8);
                                                                                                                                spoofingState.setSimBearing(f6);
                                                                                                                                spoofingState.setWifiJson(str14);
                                                                                                                                spoofingState.setCellJson(str12);
                                                                                                                                spoofingState.setBluetoothJson(str7);
                                                                                                                                spoofingState.setRouteJson(locationRepository.routePointsToJson(list2));
                                                                                                                                spoofingState.setRouteMode(z63);
                                                                                                                                spoofingState.setEnableJitter(z67);
                                                                                                                                wi2Var = locationRepository.rootManager;
                                                                                                                                c00841 = c00841;
                                                                                                                                context8 = context8;
                                                                                                                                c00841.L$0 = context8;
                                                                                                                                c00841.L$1 = str8;
                                                                                                                                c00841.L$2 = list2;
                                                                                                                                map4 = map3;
                                                                                                                                c00841.L$3 = map4;
                                                                                                                                c00841.L$4 = null;
                                                                                                                                c00841.L$5 = null;
                                                                                                                                c00841.L$6 = null;
                                                                                                                                mutex5 = mutex4;
                                                                                                                                c00841.L$7 = mutex5;
                                                                                                                                set2 = set;
                                                                                                                                c00841.L$8 = set2;
                                                                                                                                d12 = d15;
                                                                                                                                c00841.D$0 = d12;
                                                                                                                                str15 = str8;
                                                                                                                                context8 = context8;
                                                                                                                                d5 = d5;
                                                                                                                                c00841.D$1 = d5;
                                                                                                                                c00841.F$0 = f6;
                                                                                                                                c00841.J$0 = j8;
                                                                                                                                c00841.Z$0 = z63;
                                                                                                                                j8 = j8;
                                                                                                                                z69 = z64;
                                                                                                                                c00841.Z$1 = z69;
                                                                                                                                z48 = z65;
                                                                                                                                c00841.Z$2 = z48;
                                                                                                                                z64 = z69;
                                                                                                                                z70 = z59;
                                                                                                                                c00841.Z$3 = z70;
                                                                                                                                c00841.Z$4 = z67;
                                                                                                                                z59 = z70;
                                                                                                                                z65 = z48;
                                                                                                                                d16 = d14;
                                                                                                                                c00841.D$2 = d16;
                                                                                                                                d14 = d16;
                                                                                                                                z71 = z66;
                                                                                                                                c00841.Z$5 = z71;
                                                                                                                                z62 = z62;
                                                                                                                                c00841.Z$6 = z62;
                                                                                                                                z66 = z71;
                                                                                                                                i15 = i13;
                                                                                                                                c00841.I$0 = i15;
                                                                                                                                i13 = i15;
                                                                                                                                z72 = z61;
                                                                                                                                c00841.Z$7 = z72;
                                                                                                                                z61 = z72;
                                                                                                                                z73 = z60;
                                                                                                                                c00841.Z$8 = z73;
                                                                                                                                z60 = z73;
                                                                                                                                i16 = i12;
                                                                                                                                c00841.I$1 = i16;
                                                                                                                                i12 = i16;
                                                                                                                                i17 = i14;
                                                                                                                                c00841.I$2 = i17;
                                                                                                                                i14 = i17;
                                                                                                                                c00841.label = 4;
                                                                                                                                wi2Var.getClass();
                                                                                                                                z62 = z62;
                                                                                                                                d5 = d5;
                                                                                                                                z70Var3 = z70Var;
                                                                                                                                if (BuildersKt.withContext(Dispatchers.getIO(), new vi2(wi2Var, null, 0), c00841) == z70Var3) {
                                                                                                                                    return z70Var3;
                                                                                                                                }
                                                                                                                                list3 = list2;
                                                                                                                                map5 = map4;
                                                                                                                                set3 = set2;
                                                                                                                                str16 = str15;
                                                                                                                                context9 = context8;
                                                                                                                                z74 = z64;
                                                                                                                                z75 = z59;
                                                                                                                                d17 = d14;
                                                                                                                                z76 = z66;
                                                                                                                                i18 = i13;
                                                                                                                                z77 = z61;
                                                                                                                                z78 = z60;
                                                                                                                                i19 = i12;
                                                                                                                                i20 = i14;
                                                                                                                                z79 = z62;
                                                                                                                                z70Var4 = z70Var3;
                                                                                                                                z80 = z67;
                                                                                                                                f5 = f6;
                                                                                                                                mutex6 = mutex5;
                                                                                                                                j6 = j8;
                                                                                                                                d18 = d12;
                                                                                                                                z81 = z65;
                                                                                                                                z51 = z63;
                                                                                                                                d10 = d5;
                                                                                                                                z82 = z81;
                                                                                                                                z84 = z74;
                                                                                                                                str17 = "0.0";
                                                                                                                                string = locationRepository.settingsManager.b.getString("altitude", "0.0");
                                                                                                                                if (string != null) {
                                                                                                                                    str17 = string;
                                                                                                                                }
                                                                                                                                dR = r13.R(str17);
                                                                                                                                if (dR != null) {
                                                                                                                                    dDoubleValue = dR.doubleValue();
                                                                                                                                } else {
                                                                                                                                    dDoubleValue = 0.0d;
                                                                                                                                }
                                                                                                                                str18 = "10";
                                                                                                                                string2 = locationRepository.settingsManager.b.getString("satellite_count", "10");
                                                                                                                                if (string2 != null) {
                                                                                                                                    str18 = string2;
                                                                                                                                }
                                                                                                                                numA0 = s13.a0(str18);
                                                                                                                                if (numA0 != null) {
                                                                                                                                    iIntValue = numA0.intValue();
                                                                                                                                    break;
                                                                                                                                } else {
                                                                                                                                    iIntValue = 20;
                                                                                                                                }
                                                                                                                                ConfigManager configManager = locationRepository.configManager;
                                                                                                                                SpoofingState spoofingState2 = SpoofingState.INSTANCE;
                                                                                                                                String wifiJson = spoofingState2.getWifiJson();
                                                                                                                                String cellJson = spoofingState2.getCellJson();
                                                                                                                                String bluetoothJson = spoofingState2.getBluetoothJson();
                                                                                                                                c00841.L$0 = context9;
                                                                                                                                c00841.L$1 = null;
                                                                                                                                c00841.L$2 = null;
                                                                                                                                c00841.L$3 = null;
                                                                                                                                c00841.L$4 = null;
                                                                                                                                c00841.L$5 = null;
                                                                                                                                c00841.L$6 = null;
                                                                                                                                c00841.L$7 = mutex6;
                                                                                                                                c00841.L$8 = set3;
                                                                                                                                c00841.D$0 = d18;
                                                                                                                                c00841.D$1 = d10;
                                                                                                                                c00841.F$0 = f5;
                                                                                                                                c00841.J$0 = j6;
                                                                                                                                c00841.Z$0 = z51;
                                                                                                                                z74 = z84;
                                                                                                                                c00841.Z$1 = z74;
                                                                                                                                Set<String> set6 = set3;
                                                                                                                                c00841.Z$2 = z82;
                                                                                                                                z82 = z82;
                                                                                                                                z85 = z75;
                                                                                                                                c00841.Z$3 = z85;
                                                                                                                                z75 = z85;
                                                                                                                                z86 = z80;
                                                                                                                                c00841.Z$4 = z86;
                                                                                                                                z80 = z86;
                                                                                                                                d20 = d18;
                                                                                                                                d19 = d17;
                                                                                                                                c00841.D$2 = d19;
                                                                                                                                z76 = z76;
                                                                                                                                c00841.Z$5 = z76;
                                                                                                                                d19 = d19;
                                                                                                                                z87 = z79;
                                                                                                                                c00841.Z$6 = z87;
                                                                                                                                i18 = i18;
                                                                                                                                c00841.I$0 = i18;
                                                                                                                                z79 = z87;
                                                                                                                                z88 = z77;
                                                                                                                                c00841.Z$7 = z88;
                                                                                                                                z77 = z88;
                                                                                                                                z89 = z78;
                                                                                                                                c00841.Z$8 = z89;
                                                                                                                                z78 = z89;
                                                                                                                                i19 = i19;
                                                                                                                                c00841.I$1 = i19;
                                                                                                                                z83 = z74;
                                                                                                                                i21 = i20;
                                                                                                                                c00841.I$2 = i21;
                                                                                                                                c00841.I$3 = iIntValue;
                                                                                                                                i18 = i18;
                                                                                                                                d21 = dDoubleValue;
                                                                                                                                c00841.D$3 = d21;
                                                                                                                                i22 = iIntValue;
                                                                                                                                c00841.label = 5;
                                                                                                                                i20 = i21;
                                                                                                                                i19 = i19;
                                                                                                                                mutex6 = mutex6;
                                                                                                                                Context context13 = context9;
                                                                                                                                String str19 = str16;
                                                                                                                                set4 = set6;
                                                                                                                                z78 = z78;
                                                                                                                                c00842 = c00841;
                                                                                                                                context9 = context13;
                                                                                                                                z70Var5 = z70Var4;
                                                                                                                                d19 = d19;
                                                                                                                                z76 = z76;
                                                                                                                                d18 = d20;
                                                                                                                                objSaveConfig = configManager.saveConfig(d18, d10, true, str19, f5, j6, list3, z51, wifiJson, map5, cellJson, bluetoothJson, z83, z82, z75, z80, d21, i22, d19, z76, z79, i18, z77, c00842);
                                                                                                                                c00841 = c00842;
                                                                                                                                if (objSaveConfig != z70Var5) {
                                                                                                                                    z70Var = z70Var5;
                                                                                                                                    d22 = d18;
                                                                                                                                    d23 = d10;
                                                                                                                                    d24 = d21;
                                                                                                                                    z47 = z83;
                                                                                                                                    z90 = z75;
                                                                                                                                    z91 = z80;
                                                                                                                                    z92 = z82;
                                                                                                                                    i23 = i22;
                                                                                                                                    d25 = d19;
                                                                                                                                    z93 = z76;
                                                                                                                                    z94 = z79;
                                                                                                                                    i9 = i18;
                                                                                                                                    z45 = z77;
                                                                                                                                    context10 = context9;
                                                                                                                                    mutex7 = mutex6;
                                                                                                                                    z95 = z78;
                                                                                                                                    i24 = i19;
                                                                                                                                    i25 = i20;
                                                                                                                                    obj = objSaveConfig;
                                                                                                                                    set5 = set4;
                                                                                                                                    zBooleanValue = ((Boolean) obj).booleanValue();
                                                                                                                                    if (!zBooleanValue) {
                                                                                                                                        mutex7 = mutex7;
                                                                                                                                        d25 = d25;
                                                                                                                                        z96 = z93;
                                                                                                                                        throw new IllegalStateException("运行配置发布失败");
                                                                                                                                    }
                                                                                                                                    locationRepository.runtimeAuthorization.requireAuthorized(set5);
                                                                                                                                    z96 = z93;
                                                                                                                                    locationRepository.settingsManager.b.edit().putBoolean("is_spoofing_active", true).apply();
                                                                                                                                    context10 = context10;
                                                                                                                                    locationRepository.spoofingServiceController.startForeground(context10, d22, d23);
                                                                                                                                    d25 = d25;
                                                                                                                                    z97 = z91;
                                                                                                                                    d22 = d22;
                                                                                                                                    d23 = d23;
                                                                                                                                    RuntimeAuthorization value = locationRepository.runtimeAuthorization.getAuthorization().getValue();
                                                                                                                                    value.getClass();
                                                                                                                                    runGeneration = value.getRunGeneration();
                                                                                                                                    locationRepository2 = locationRepository;
                                                                                                                                    locationRepository$startSpoofingInternal$2$2 = new LocationRepository$startSpoofingInternal$2$2(locationRepository2, runGeneration, set5, null);
                                                                                                                                    c00841.L$0 = context10;
                                                                                                                                    context10 = context10;
                                                                                                                                    c00841.L$1 = null;
                                                                                                                                    c00841.L$2 = null;
                                                                                                                                    c00841.L$3 = null;
                                                                                                                                    c00841.L$4 = null;
                                                                                                                                    c00841.L$5 = null;
                                                                                                                                    c00841.L$6 = null;
                                                                                                                                    c00841.L$7 = mutex7;
                                                                                                                                    c00841.L$8 = null;
                                                                                                                                    c00841.D$0 = d22;
                                                                                                                                    c00841.D$1 = d23;
                                                                                                                                    c00841.F$0 = f5;
                                                                                                                                    c00841.J$0 = j6;
                                                                                                                                    c00841.Z$0 = z51;
                                                                                                                                    c00841.Z$1 = z47;
                                                                                                                                    c00841.Z$2 = z92;
                                                                                                                                    c00841.Z$3 = z90;
                                                                                                                                    z91 = z97;
                                                                                                                                    c00841.Z$4 = z91;
                                                                                                                                    d22 = d22;
                                                                                                                                    c00841.D$2 = d25;
                                                                                                                                    mutex7 = mutex7;
                                                                                                                                    c00841.Z$5 = z96;
                                                                                                                                    z96 = z96;
                                                                                                                                    z98 = z94;
                                                                                                                                    c00841.Z$6 = z98;
                                                                                                                                    z94 = z98;
                                                                                                                                    i26 = i9;
                                                                                                                                    c00841.I$0 = i26;
                                                                                                                                    i9 = i26;
                                                                                                                                    z99 = z45;
                                                                                                                                    c00841.Z$7 = z99;
                                                                                                                                    z45 = z99;
                                                                                                                                    z100 = z95;
                                                                                                                                    c00841.Z$8 = z100;
                                                                                                                                    z95 = z100;
                                                                                                                                    i27 = i24;
                                                                                                                                    c00841.I$1 = i27;
                                                                                                                                    i24 = i27;
                                                                                                                                    i28 = i25;
                                                                                                                                    c00841.I$2 = i28;
                                                                                                                                    i25 = i28;
                                                                                                                                    i29 = i23;
                                                                                                                                    c00841.I$3 = i29;
                                                                                                                                    d25 = d25;
                                                                                                                                    d26 = d24;
                                                                                                                                    c00841.D$3 = d26;
                                                                                                                                    c00841.Z$9 = zBooleanValue;
                                                                                                                                    c00841.J$1 = runGeneration;
                                                                                                                                    c00841.label = 6;
                                                                                                                                    z70Var5 = z70Var;
                                                                                                                                    if (TimeoutKt.withTimeout(10000L, locationRepository$startSpoofingInternal$2$2, c00841) != z70Var5) {
                                                                                                                                        z70Var = z70Var5;
                                                                                                                                        z101 = z90;
                                                                                                                                        i30 = i25;
                                                                                                                                        mutex8 = mutex7;
                                                                                                                                        d27 = d25;
                                                                                                                                        j9 = runGeneration;
                                                                                                                                        context11 = context10;
                                                                                                                                        z102 = z91;
                                                                                                                                        i31 = i29;
                                                                                                                                        z103 = z94;
                                                                                                                                        z104 = zBooleanValue;
                                                                                                                                        z105 = z92;
                                                                                                                                        i32 = i9;
                                                                                                                                        i33 = i24;
                                                                                                                                        z106 = z95;
                                                                                                                                        d10 = d23;
                                                                                                                                        z107 = z45;
                                                                                                                                        d28 = d26;
                                                                                                                                        d29 = d22;
                                                                                                                                        runtimeAuthorizationManager2 = locationRepository.runtimeAuthorization;
                                                                                                                                        c00841.L$0 = context11;
                                                                                                                                        context12 = context11;
                                                                                                                                        c00841.L$1 = null;
                                                                                                                                        c00841.L$2 = null;
                                                                                                                                        c00841.L$3 = null;
                                                                                                                                        c00841.L$4 = null;
                                                                                                                                        c00841.L$5 = null;
                                                                                                                                        c00841.L$6 = null;
                                                                                                                                        c00841.L$7 = mutex8;
                                                                                                                                        c00841.L$8 = null;
                                                                                                                                        c00841.D$0 = d29;
                                                                                                                                        c00841.D$1 = d10;
                                                                                                                                        c00841.F$0 = f5;
                                                                                                                                        c00841.J$0 = j6;
                                                                                                                                        c00841.Z$0 = z51;
                                                                                                                                        c00841.Z$1 = z47;
                                                                                                                                        c00841.Z$2 = z105;
                                                                                                                                        c00841.Z$3 = z101;
                                                                                                                                        z109 = z102;
                                                                                                                                        c00841.Z$4 = z109;
                                                                                                                                        d30 = d29;
                                                                                                                                        z108 = z101;
                                                                                                                                        d31 = d27;
                                                                                                                                        c00841.D$2 = d31;
                                                                                                                                        z102 = z109;
                                                                                                                                        z110 = z96;
                                                                                                                                        c00841.Z$5 = z110;
                                                                                                                                        z96 = z110;
                                                                                                                                        z111 = z103;
                                                                                                                                        c00841.Z$6 = z111;
                                                                                                                                        z103 = z111;
                                                                                                                                        i35 = i32;
                                                                                                                                        c00841.I$0 = i35;
                                                                                                                                        i32 = i35;
                                                                                                                                        z112 = z107;
                                                                                                                                        c00841.Z$7 = z112;
                                                                                                                                        z107 = z112;
                                                                                                                                        z113 = z106;
                                                                                                                                        c00841.Z$8 = z113;
                                                                                                                                        z106 = z113;
                                                                                                                                        i36 = i33;
                                                                                                                                        c00841.I$1 = i36;
                                                                                                                                        i33 = i36;
                                                                                                                                        i37 = i30;
                                                                                                                                        c00841.I$2 = i37;
                                                                                                                                        i34 = i37;
                                                                                                                                        c00841.I$3 = i31;
                                                                                                                                        c00841.D$3 = d28;
                                                                                                                                        c00841.Z$9 = z104;
                                                                                                                                        c00841.J$1 = j9;
                                                                                                                                        c00841.label = 7;
                                                                                                                                        z70Var5 = z70Var;
                                                                                                                                        if (runtimeAuthorizationManager2.confirmStarted(c00841) != z70Var5) {
                                                                                                                                            mutex9 = mutex8;
                                                                                                                                            mutex2 = mutex9;
                                                                                                                                            mutex2.unlock(null);
                                                                                                                                            return mf3.a;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    z70Var = z70Var;
                                                                                                                                    z48 = z92;
                                                                                                                                    i8 = i25;
                                                                                                                                    i7 = i24;
                                                                                                                                    z44 = z95;
                                                                                                                                    z46 = z94;
                                                                                                                                    mutex3 = mutex7;
                                                                                                                                    z50 = z96;
                                                                                                                                    d11 = d25;
                                                                                                                                    th = th;
                                                                                                                                    d10 = d23;
                                                                                                                                    z49 = z91;
                                                                                                                                    z51 = z51;
                                                                                                                                    z43 = z90;
                                                                                                                                    context6 = context10;
                                                                                                                                    d12 = d22;
                                                                                                                                    nonCancellable = NonCancellable.INSTANCE;
                                                                                                                                    locationRepository$startSpoofingInternal$2$3 = new LocationRepository$startSpoofingInternal$2$3(th, locationRepository, context6, null);
                                                                                                                                    c00841.L$0 = null;
                                                                                                                                    c00841.L$1 = null;
                                                                                                                                    c00841.L$2 = null;
                                                                                                                                    c00841.L$3 = null;
                                                                                                                                    c00841.L$4 = null;
                                                                                                                                    c00841.L$5 = null;
                                                                                                                                    c00841.L$6 = null;
                                                                                                                                    c00841.L$7 = mutex3;
                                                                                                                                    c00841.L$8 = th;
                                                                                                                                    c00841.L$9 = null;
                                                                                                                                    c00841.D$0 = d12;
                                                                                                                                    c00841.D$1 = d10;
                                                                                                                                    c00841.F$0 = f5;
                                                                                                                                    c00841.J$0 = j6;
                                                                                                                                    c00841.Z$0 = z51;
                                                                                                                                    c00841.Z$1 = z47;
                                                                                                                                    c00841.Z$2 = z48;
                                                                                                                                    c00841.Z$3 = z43;
                                                                                                                                    c00841.Z$4 = z49;
                                                                                                                                    c00841.D$2 = d11;
                                                                                                                                    c00841.Z$5 = z50;
                                                                                                                                    c00841.Z$6 = z46;
                                                                                                                                    c00841.I$0 = i9;
                                                                                                                                    c00841.Z$7 = z45;
                                                                                                                                    c00841.Z$8 = z44;
                                                                                                                                    c00841.I$1 = i7;
                                                                                                                                    c00841.I$2 = i8;
                                                                                                                                    c00841.label = 8;
                                                                                                                                    z70Var6 = z70Var;
                                                                                                                                    if (BuildersKt.withContext(nonCancellable, locationRepository$startSpoofingInternal$2$3, c00841) == z70Var6) {
                                                                                                                                        return z70Var6;
                                                                                                                                    }
                                                                                                                                    throw th;
                                                                                                                                }
                                                                                                                                return z70Var5;
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                if (locationRepository.settingsManager.b.getBoolean("route_lateral_deviation", false)) {
                                                                                                                                    z68 = true;
                                                                                                                                } else {
                                                                                                                                    z68 = false;
                                                                                                                                }
                                                                                                                                spoofingState.setRouteLateralDeviation(z68);
                                                                                                                                spoofingState.setRouteLateralSeed(j8);
                                                                                                                                spoofingState.setSimMode(str8);
                                                                                                                                spoofingState.setSimBearing(f6);
                                                                                                                                spoofingState.setWifiJson(str14);
                                                                                                                                spoofingState.setCellJson(str12);
                                                                                                                                spoofingState.setBluetoothJson(str7);
                                                                                                                                spoofingState.setRouteJson(locationRepository.routePointsToJson(list2));
                                                                                                                                spoofingState.setRouteMode(z63);
                                                                                                                                spoofingState.setEnableJitter(z67);
                                                                                                                                wi2Var = locationRepository.rootManager;
                                                                                                                                c00841 = c00841;
                                                                                                                                context8 = context8;
                                                                                                                                try {
                                                                                                                                    c00841.L$0 = context8;
                                                                                                                                    c00841.L$1 = str8;
                                                                                                                                    c00841.L$2 = list2;
                                                                                                                                    map4 = map3;
                                                                                                                                    c00841.L$3 = map4;
                                                                                                                                    c00841.L$4 = null;
                                                                                                                                    c00841.L$5 = null;
                                                                                                                                    c00841.L$6 = null;
                                                                                                                                    mutex5 = mutex4;
                                                                                                                                    try {
                                                                                                                                        c00841.L$7 = mutex5;
                                                                                                                                        set2 = set;
                                                                                                                                        c00841.L$8 = set2;
                                                                                                                                        d12 = d15;
                                                                                                                                        try {
                                                                                                                                            c00841.D$0 = d12;
                                                                                                                                            str15 = str8;
                                                                                                                                            context8 = context8;
                                                                                                                                            d5 = d5;
                                                                                                                                            try {
                                                                                                                                                c00841.D$1 = d5;
                                                                                                                                                c00841.F$0 = f6;
                                                                                                                                                c00841.J$0 = j8;
                                                                                                                                                c00841.Z$0 = z63;
                                                                                                                                                j8 = j8;
                                                                                                                                                z69 = z64;
                                                                                                                                                try {
                                                                                                                                                    c00841.Z$1 = z69;
                                                                                                                                                    z48 = z65;
                                                                                                                                                    try {
                                                                                                                                                        c00841.Z$2 = z48;
                                                                                                                                                        z64 = z69;
                                                                                                                                                        z70 = z59;
                                                                                                                                                        try {
                                                                                                                                                            c00841.Z$3 = z70;
                                                                                                                                                            c00841.Z$4 = z67;
                                                                                                                                                            z59 = z70;
                                                                                                                                                            z65 = z48;
                                                                                                                                                            d16 = d14;
                                                                                                                                                            try {
                                                                                                                                                                c00841.D$2 = d16;
                                                                                                                                                                d14 = d16;
                                                                                                                                                                z71 = z66;
                                                                                                                                                                try {
                                                                                                                                                                    c00841.Z$5 = z71;
                                                                                                                                                                    z62 = z62;
                                                                                                                                                                    try {
                                                                                                                                                                        c00841.Z$6 = z62;
                                                                                                                                                                        z66 = z71;
                                                                                                                                                                        i15 = i13;
                                                                                                                                                                        try {
                                                                                                                                                                            c00841.I$0 = i15;
                                                                                                                                                                            i13 = i15;
                                                                                                                                                                            z72 = z61;
                                                                                                                                                                            try {
                                                                                                                                                                                c00841.Z$7 = z72;
                                                                                                                                                                                z61 = z72;
                                                                                                                                                                                z73 = z60;
                                                                                                                                                                                try {
                                                                                                                                                                                    c00841.Z$8 = z73;
                                                                                                                                                                                    z60 = z73;
                                                                                                                                                                                    i16 = i12;
                                                                                                                                                                                    try {
                                                                                                                                                                                        c00841.I$1 = i16;
                                                                                                                                                                                        i12 = i16;
                                                                                                                                                                                        i17 = i14;
                                                                                                                                                                                        try {
                                                                                                                                                                                            c00841.I$2 = i17;
                                                                                                                                                                                            i14 = i17;
                                                                                                                                                                                            try {
                                                                                                                                                                                                c00841.label = 4;
                                                                                                                                                                                                try {
                                                                                                                                                                                                    wi2Var.getClass();
                                                                                                                                                                                                    z62 = z62;
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        d5 = d5;
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            z70Var3 = z70Var;
                                                                                                                                                                                                            if (BuildersKt.withContext(Dispatchers.getIO(), new vi2(wi2Var, null, 0), c00841) == z70Var3) {
                                                                                                                                                                                                                return z70Var3;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            list3 = list2;
                                                                                                                                                                                                            map5 = map4;
                                                                                                                                                                                                            set3 = set2;
                                                                                                                                                                                                            str16 = str15;
                                                                                                                                                                                                            context9 = context8;
                                                                                                                                                                                                            z74 = z64;
                                                                                                                                                                                                            z75 = z59;
                                                                                                                                                                                                            d17 = d14;
                                                                                                                                                                                                            z76 = z66;
                                                                                                                                                                                                            i18 = i13;
                                                                                                                                                                                                            z77 = z61;
                                                                                                                                                                                                            z78 = z60;
                                                                                                                                                                                                            i19 = i12;
                                                                                                                                                                                                            i20 = i14;
                                                                                                                                                                                                            z79 = z62;
                                                                                                                                                                                                            z70Var4 = z70Var3;
                                                                                                                                                                                                            z80 = z67;
                                                                                                                                                                                                            f5 = f6;
                                                                                                                                                                                                            mutex6 = mutex5;
                                                                                                                                                                                                            j6 = j8;
                                                                                                                                                                                                            d18 = d12;
                                                                                                                                                                                                            z81 = z65;
                                                                                                                                                                                                            z51 = z63;
                                                                                                                                                                                                            d10 = d5;
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                    z82 = z81;
                                                                                                                                                                                                                    z84 = z74;
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        str17 = "0.0";
                                                                                                                                                                                                                        string = locationRepository.settingsManager.b.getString("altitude", "0.0");
                                                                                                                                                                                                                        if (string != null) {
                                                                                                                                                                                                                            str17 = string;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        dR = r13.R(str17);
                                                                                                                                                                                                                        if (dR != null) {
                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                dDoubleValue = dR.doubleValue();
                                                                                                                                                                                                                            } catch (Throwable th3) {
                                                                                                                                                                                                                                c00841 = c00841;
                                                                                                                                                                                                                                mutex3 = mutex6;
                                                                                                                                                                                                                                i7 = i19;
                                                                                                                                                                                                                                z44 = z78;
                                                                                                                                                                                                                                z70Var = z70Var4;
                                                                                                                                                                                                                                i9 = i18;
                                                                                                                                                                                                                                z45 = z77;
                                                                                                                                                                                                                                i8 = i20;
                                                                                                                                                                                                                                d11 = d17;
                                                                                                                                                                                                                                th = th3;
                                                                                                                                                                                                                                context6 = context9;
                                                                                                                                                                                                                                z49 = z80;
                                                                                                                                                                                                                                z47 = z84;
                                                                                                                                                                                                                                z50 = z76;
                                                                                                                                                                                                                                d12 = d18;
                                                                                                                                                                                                                                z48 = z82;
                                                                                                                                                                                                                                z43 = z75;
                                                                                                                                                                                                                                z46 = z79;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                            dDoubleValue = 0.0d;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        str18 = "10";
                                                                                                                                                                                                                        string2 = locationRepository.settingsManager.b.getString("satellite_count", "10");
                                                                                                                                                                                                                        if (string2 != null) {
                                                                                                                                                                                                                            str18 = string2;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        numA0 = s13.a0(str18);
                                                                                                                                                                                                                        if (numA0 != null) {
                                                                                                                                                                                                                            iIntValue = numA0.intValue();
                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                            iIntValue = 20;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        ConfigManager configManager2 = locationRepository.configManager;
                                                                                                                                                                                                                        SpoofingState spoofingState3 = SpoofingState.INSTANCE;
                                                                                                                                                                                                                        String wifiJson2 = spoofingState3.getWifiJson();
                                                                                                                                                                                                                        String cellJson2 = spoofingState3.getCellJson();
                                                                                                                                                                                                                        String bluetoothJson2 = spoofingState3.getBluetoothJson();
                                                                                                                                                                                                                        c00841.L$0 = context9;
                                                                                                                                                                                                                        c00841.L$1 = null;
                                                                                                                                                                                                                        c00841.L$2 = null;
                                                                                                                                                                                                                        c00841.L$3 = null;
                                                                                                                                                                                                                        c00841.L$4 = null;
                                                                                                                                                                                                                        c00841.L$5 = null;
                                                                                                                                                                                                                        c00841.L$6 = null;
                                                                                                                                                                                                                        c00841.L$7 = mutex6;
                                                                                                                                                                                                                        c00841.L$8 = set3;
                                                                                                                                                                                                                        c00841.D$0 = d18;
                                                                                                                                                                                                                        c00841.D$1 = d10;
                                                                                                                                                                                                                        c00841.F$0 = f5;
                                                                                                                                                                                                                        c00841.J$0 = j6;
                                                                                                                                                                                                                        c00841.Z$0 = z51;
                                                                                                                                                                                                                        z74 = z84;
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            c00841.Z$1 = z74;
                                                                                                                                                                                                                            Set<String> set7 = set3;
                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                c00841.Z$2 = z82;
                                                                                                                                                                                                                                z82 = z82;
                                                                                                                                                                                                                                z85 = z75;
                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                    c00841.Z$3 = z85;
                                                                                                                                                                                                                                    z75 = z85;
                                                                                                                                                                                                                                    z86 = z80;
                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                        c00841.Z$4 = z86;
                                                                                                                                                                                                                                        z80 = z86;
                                                                                                                                                                                                                                        d20 = d18;
                                                                                                                                                                                                                                        d19 = d17;
                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                            c00841.D$2 = d19;
                                                                                                                                                                                                                                            z76 = z76;
                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                c00841.Z$5 = z76;
                                                                                                                                                                                                                                                d19 = d19;
                                                                                                                                                                                                                                                z87 = z79;
                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                    c00841.Z$6 = z87;
                                                                                                                                                                                                                                                    i18 = i18;
                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                        c00841.I$0 = i18;
                                                                                                                                                                                                                                                        z79 = z87;
                                                                                                                                                                                                                                                        z88 = z77;
                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                            c00841.Z$7 = z88;
                                                                                                                                                                                                                                                            z77 = z88;
                                                                                                                                                                                                                                                            z89 = z78;
                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                c00841.Z$8 = z89;
                                                                                                                                                                                                                                                                z78 = z89;
                                                                                                                                                                                                                                                                i19 = i19;
                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                    c00841.I$1 = i19;
                                                                                                                                                                                                                                                                    z83 = z74;
                                                                                                                                                                                                                                                                    i21 = i20;
                                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                                        c00841.I$2 = i21;
                                                                                                                                                                                                                                                                        c00841.I$3 = iIntValue;
                                                                                                                                                                                                                                                                        i18 = i18;
                                                                                                                                                                                                                                                                        d21 = dDoubleValue;
                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                            c00841.D$3 = d21;
                                                                                                                                                                                                                                                                            i22 = iIntValue;
                                                                                                                                                                                                                                                                            c00841.label = 5;
                                                                                                                                                                                                                                                                            i20 = i21;
                                                                                                                                                                                                                                                                            i19 = i19;
                                                                                                                                                                                                                                                                            mutex6 = mutex6;
                                                                                                                                                                                                                                                                            Context context14 = context9;
                                                                                                                                                                                                                                                                            String str110 = str16;
                                                                                                                                                                                                                                                                            set4 = set7;
                                                                                                                                                                                                                                                                            z78 = z78;
                                                                                                                                                                                                                                                                            c00842 = c00841;
                                                                                                                                                                                                                                                                            context9 = context14;
                                                                                                                                                                                                                                                                            z70Var5 = z70Var4;
                                                                                                                                                                                                                                                                            d19 = d19;
                                                                                                                                                                                                                                                                            z76 = z76;
                                                                                                                                                                                                                                                                            d18 = d20;
                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                objSaveConfig = configManager2.saveConfig(d18, d10, true, str110, f5, j6, list3, z51, wifiJson2, map5, cellJson2, bluetoothJson2, z83, z82, z75, z80, d21, i22, d19, z76, z79, i18, z77, c00842);
                                                                                                                                                                                                                                                                                c00841 = c00842;
                                                                                                                                                                                                                                                                                if (objSaveConfig != z70Var5) {
                                                                                                                                                                                                                                                                                    z70Var = z70Var5;
                                                                                                                                                                                                                                                                                    d22 = d18;
                                                                                                                                                                                                                                                                                    d23 = d10;
                                                                                                                                                                                                                                                                                    d24 = d21;
                                                                                                                                                                                                                                                                                    z47 = z83;
                                                                                                                                                                                                                                                                                    z90 = z75;
                                                                                                                                                                                                                                                                                    z91 = z80;
                                                                                                                                                                                                                                                                                    z92 = z82;
                                                                                                                                                                                                                                                                                    i23 = i22;
                                                                                                                                                                                                                                                                                    d25 = d19;
                                                                                                                                                                                                                                                                                    z93 = z76;
                                                                                                                                                                                                                                                                                    z94 = z79;
                                                                                                                                                                                                                                                                                    i9 = i18;
                                                                                                                                                                                                                                                                                    z45 = z77;
                                                                                                                                                                                                                                                                                    context10 = context9;
                                                                                                                                                                                                                                                                                    mutex7 = mutex6;
                                                                                                                                                                                                                                                                                    z95 = z78;
                                                                                                                                                                                                                                                                                    i24 = i19;
                                                                                                                                                                                                                                                                                    i25 = i20;
                                                                                                                                                                                                                                                                                    obj = objSaveConfig;
                                                                                                                                                                                                                                                                                    set5 = set4;
                                                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                                                        zBooleanValue = ((Boolean) obj).booleanValue();
                                                                                                                                                                                                                                                                                        if (!zBooleanValue) {
                                                                                                                                                                                                                                                                                            locationRepository.runtimeAuthorization.requireAuthorized(set5);
                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                z96 = z93;
                                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                                    locationRepository.settingsManager.b.edit().putBoolean("is_spoofing_active", true).apply();
                                                                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                                                                        context10 = context10;
                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                            locationRepository.spoofingServiceController.startForeground(context10, d22, d23);
                                                                                                                                                                                                                                                                                                            d25 = d25;
                                                                                                                                                                                                                                                                                                            z97 = z91;
                                                                                                                                                                                                                                                                                                            d22 = d22;
                                                                                                                                                                                                                                                                                                            d23 = d23;
                                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                                RuntimeAuthorization value2 = locationRepository.runtimeAuthorization.getAuthorization().getValue();
                                                                                                                                                                                                                                                                                                                value2.getClass();
                                                                                                                                                                                                                                                                                                                runGeneration = value2.getRunGeneration();
                                                                                                                                                                                                                                                                                                                locationRepository2 = locationRepository;
                                                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                                                    locationRepository$startSpoofingInternal$2$2 = new LocationRepository$startSpoofingInternal$2$2(locationRepository2, runGeneration, set5, null);
                                                                                                                                                                                                                                                                                                                    c00841.L$0 = context10;
                                                                                                                                                                                                                                                                                                                    context10 = context10;
                                                                                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                                                                                        c00841.L$1 = null;
                                                                                                                                                                                                                                                                                                                        c00841.L$2 = null;
                                                                                                                                                                                                                                                                                                                        c00841.L$3 = null;
                                                                                                                                                                                                                                                                                                                        c00841.L$4 = null;
                                                                                                                                                                                                                                                                                                                        c00841.L$5 = null;
                                                                                                                                                                                                                                                                                                                        c00841.L$6 = null;
                                                                                                                                                                                                                                                                                                                        c00841.L$7 = mutex7;
                                                                                                                                                                                                                                                                                                                        c00841.L$8 = null;
                                                                                                                                                                                                                                                                                                                        c00841.D$0 = d22;
                                                                                                                                                                                                                                                                                                                        c00841.D$1 = d23;
                                                                                                                                                                                                                                                                                                                        c00841.F$0 = f5;
                                                                                                                                                                                                                                                                                                                        c00841.J$0 = j6;
                                                                                                                                                                                                                                                                                                                        c00841.Z$0 = z51;
                                                                                                                                                                                                                                                                                                                        c00841.Z$1 = z47;
                                                                                                                                                                                                                                                                                                                        c00841.Z$2 = z92;
                                                                                                                                                                                                                                                                                                                        c00841.Z$3 = z90;
                                                                                                                                                                                                                                                                                                                        z91 = z97;
                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                            c00841.Z$4 = z91;
                                                                                                                                                                                                                                                                                                                            d22 = d22;
                                                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                                                c00841.D$2 = d25;
                                                                                                                                                                                                                                                                                                                                mutex7 = mutex7;
                                                                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                                                                    c00841.Z$5 = z96;
                                                                                                                                                                                                                                                                                                                                    z96 = z96;
                                                                                                                                                                                                                                                                                                                                    z98 = z94;
                                                                                                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                                                                                                        c00841.Z$6 = z98;
                                                                                                                                                                                                                                                                                                                                        z94 = z98;
                                                                                                                                                                                                                                                                                                                                        i26 = i9;
                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                            c00841.I$0 = i26;
                                                                                                                                                                                                                                                                                                                                            i9 = i26;
                                                                                                                                                                                                                                                                                                                                            z99 = z45;
                                                                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                                                                c00841.Z$7 = z99;
                                                                                                                                                                                                                                                                                                                                                z45 = z99;
                                                                                                                                                                                                                                                                                                                                                z100 = z95;
                                                                                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                                                                                    c00841.Z$8 = z100;
                                                                                                                                                                                                                                                                                                                                                    z95 = z100;
                                                                                                                                                                                                                                                                                                                                                    i27 = i24;
                                                                                                                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                                                                                                                        c00841.I$1 = i27;
                                                                                                                                                                                                                                                                                                                                                        i24 = i27;
                                                                                                                                                                                                                                                                                                                                                        i28 = i25;
                                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                                            c00841.I$2 = i28;
                                                                                                                                                                                                                                                                                                                                                            i25 = i28;
                                                                                                                                                                                                                                                                                                                                                            i29 = i23;
                                                                                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                                                                                c00841.I$3 = i29;
                                                                                                                                                                                                                                                                                                                                                                d25 = d25;
                                                                                                                                                                                                                                                                                                                                                                d26 = d24;
                                                                                                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                                                                                                    c00841.D$3 = d26;
                                                                                                                                                                                                                                                                                                                                                                    c00841.Z$9 = zBooleanValue;
                                                                                                                                                                                                                                                                                                                                                                    c00841.J$1 = runGeneration;
                                                                                                                                                                                                                                                                                                                                                                    c00841.label = 6;
                                                                                                                                                                                                                                                                                                                                                                    z70Var5 = z70Var;
                                                                                                                                                                                                                                                                                                                                                                    if (TimeoutKt.withTimeout(10000L, locationRepository$startSpoofingInternal$2$2, c00841) != z70Var5) {
                                                                                                                                                                                                                                                                                                                                                                        z70Var = z70Var5;
                                                                                                                                                                                                                                                                                                                                                                        z101 = z90;
                                                                                                                                                                                                                                                                                                                                                                        i30 = i25;
                                                                                                                                                                                                                                                                                                                                                                        mutex8 = mutex7;
                                                                                                                                                                                                                                                                                                                                                                        d27 = d25;
                                                                                                                                                                                                                                                                                                                                                                        j9 = runGeneration;
                                                                                                                                                                                                                                                                                                                                                                        context11 = context10;
                                                                                                                                                                                                                                                                                                                                                                        z102 = z91;
                                                                                                                                                                                                                                                                                                                                                                        i31 = i29;
                                                                                                                                                                                                                                                                                                                                                                        z103 = z94;
                                                                                                                                                                                                                                                                                                                                                                        z104 = zBooleanValue;
                                                                                                                                                                                                                                                                                                                                                                        z105 = z92;
                                                                                                                                                                                                                                                                                                                                                                        i32 = i9;
                                                                                                                                                                                                                                                                                                                                                                        i33 = i24;
                                                                                                                                                                                                                                                                                                                                                                        z106 = z95;
                                                                                                                                                                                                                                                                                                                                                                        d10 = d23;
                                                                                                                                                                                                                                                                                                                                                                        z107 = z45;
                                                                                                                                                                                                                                                                                                                                                                        d28 = d26;
                                                                                                                                                                                                                                                                                                                                                                        d29 = d22;
                                                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                                                            runtimeAuthorizationManager2 = locationRepository.runtimeAuthorization;
                                                                                                                                                                                                                                                                                                                                                                            c00841.L$0 = context11;
                                                                                                                                                                                                                                                                                                                                                                            context12 = context11;
                                                                                                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                                                                                                c00841.L$1 = null;
                                                                                                                                                                                                                                                                                                                                                                                c00841.L$2 = null;
                                                                                                                                                                                                                                                                                                                                                                                c00841.L$3 = null;
                                                                                                                                                                                                                                                                                                                                                                                c00841.L$4 = null;
                                                                                                                                                                                                                                                                                                                                                                                c00841.L$5 = null;
                                                                                                                                                                                                                                                                                                                                                                                c00841.L$6 = null;
                                                                                                                                                                                                                                                                                                                                                                                c00841.L$7 = mutex8;
                                                                                                                                                                                                                                                                                                                                                                                c00841.L$8 = null;
                                                                                                                                                                                                                                                                                                                                                                                c00841.D$0 = d29;
                                                                                                                                                                                                                                                                                                                                                                                c00841.D$1 = d10;
                                                                                                                                                                                                                                                                                                                                                                                c00841.F$0 = f5;
                                                                                                                                                                                                                                                                                                                                                                                c00841.J$0 = j6;
                                                                                                                                                                                                                                                                                                                                                                                c00841.Z$0 = z51;
                                                                                                                                                                                                                                                                                                                                                                                c00841.Z$1 = z47;
                                                                                                                                                                                                                                                                                                                                                                                c00841.Z$2 = z105;
                                                                                                                                                                                                                                                                                                                                                                                c00841.Z$3 = z101;
                                                                                                                                                                                                                                                                                                                                                                                z109 = z102;
                                                                                                                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                                                                                                                    c00841.Z$4 = z109;
                                                                                                                                                                                                                                                                                                                                                                                    d30 = d29;
                                                                                                                                                                                                                                                                                                                                                                                    z108 = z101;
                                                                                                                                                                                                                                                                                                                                                                                    d31 = d27;
                                                                                                                                                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                                                                                                                                                        c00841.D$2 = d31;
                                                                                                                                                                                                                                                                                                                                                                                        z102 = z109;
                                                                                                                                                                                                                                                                                                                                                                                        z110 = z96;
                                                                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                                                                            c00841.Z$5 = z110;
                                                                                                                                                                                                                                                                                                                                                                                            z96 = z110;
                                                                                                                                                                                                                                                                                                                                                                                            z111 = z103;
                                                                                                                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                                                                                                                c00841.Z$6 = z111;
                                                                                                                                                                                                                                                                                                                                                                                                z103 = z111;
                                                                                                                                                                                                                                                                                                                                                                                                i35 = i32;
                                                                                                                                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                                                                                                                                    c00841.I$0 = i35;
                                                                                                                                                                                                                                                                                                                                                                                                    i32 = i35;
                                                                                                                                                                                                                                                                                                                                                                                                    z112 = z107;
                                                                                                                                                                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                                                                                                                                                                        c00841.Z$7 = z112;
                                                                                                                                                                                                                                                                                                                                                                                                        z107 = z112;
                                                                                                                                                                                                                                                                                                                                                                                                        z113 = z106;
                                                                                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                                                                                            c00841.Z$8 = z113;
                                                                                                                                                                                                                                                                                                                                                                                                            z106 = z113;
                                                                                                                                                                                                                                                                                                                                                                                                            i36 = i33;
                                                                                                                                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                                                                                                                                c00841.I$1 = i36;
                                                                                                                                                                                                                                                                                                                                                                                                                i33 = i36;
                                                                                                                                                                                                                                                                                                                                                                                                                i37 = i30;
                                                                                                                                                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                                                                                                                                                    c00841.I$2 = i37;
                                                                                                                                                                                                                                                                                                                                                                                                                    i34 = i37;
                                                                                                                                                                                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                                                                                                                                                                                        c00841.I$3 = i31;
                                                                                                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                                                                                                            c00841.D$3 = d28;
                                                                                                                                                                                                                                                                                                                                                                                                                            c00841.Z$9 = z104;
                                                                                                                                                                                                                                                                                                                                                                                                                            c00841.J$1 = j9;
                                                                                                                                                                                                                                                                                                                                                                                                                            c00841.label = 7;
                                                                                                                                                                                                                                                                                                                                                                                                                            z70Var5 = z70Var;
                                                                                                                                                                                                                                                                                                                                                                                                                            if (runtimeAuthorizationManager2.confirmStarted(c00841) != z70Var5) {
                                                                                                                                                                                                                                                                                                                                                                                                                                mutex9 = mutex8;
                                                                                                                                                                                                                                                                                                                                                                                                                                mutex2 = mutex9;
                                                                                                                                                                                                                                                                                                                                                                                                                                mutex2.unlock(null);
                                                                                                                                                                                                                                                                                                                                                                                                                                return mf3.a;
                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                        } catch (Throwable th4) {
                                                                                                                                                                                                                                                                                                                                                                                                                            th = th4;
                                                                                                                                                                                                                                                                                                                                                                                                                            z48 = z105;
                                                                                                                                                                                                                                                                                                                                                                                                                            mutex3 = mutex8;
                                                                                                                                                                                                                                                                                                                                                                                                                            i7 = i33;
                                                                                                                                                                                                                                                                                                                                                                                                                            z44 = z106;
                                                                                                                                                                                                                                                                                                                                                                                                                            z45 = z107;
                                                                                                                                                                                                                                                                                                                                                                                                                            i9 = i32;
                                                                                                                                                                                                                                                                                                                                                                                                                            z46 = z103;
                                                                                                                                                                                                                                                                                                                                                                                                                            z50 = z96;
                                                                                                                                                                                                                                                                                                                                                                                                                            z49 = z102;
                                                                                                                                                                                                                                                                                                                                                                                                                            context6 = context12;
                                                                                                                                                                                                                                                                                                                                                                                                                            i8 = i34;
                                                                                                                                                                                                                                                                                                                                                                                                                            d11 = d31;
                                                                                                                                                                                                                                                                                                                                                                                                                            th = th;
                                                                                                                                                                                                                                                                                                                                                                                                                            z43 = z108;
                                                                                                                                                                                                                                                                                                                                                                                                                            z51 = z51;
                                                                                                                                                                                                                                                                                                                                                                                                                            d12 = d30;
                                                                                                                                                                                                                                                                                                                                                                                                                            nonCancellable = NonCancellable.INSTANCE;
                                                                                                                                                                                                                                                                                                                                                                                                                            locationRepository$startSpoofingInternal$2$3 = new LocationRepository$startSpoofingInternal$2$3(th, locationRepository, context6, null);
                                                                                                                                                                                                                                                                                                                                                                                                                            c00841.L$0 = null;
                                                                                                                                                                                                                                                                                                                                                                                                                            c00841.L$1 = null;
                                                                                                                                                                                                                                                                                                                                                                                                                            c00841.L$2 = null;
                                                                                                                                                                                                                                                                                                                                                                                                                            c00841.L$3 = null;
                                                                                                                                                                                                                                                                                                                                                                                                                            c00841.L$4 = null;
                                                                                                                                                                                                                                                                                                                                                                                                                            c00841.L$5 = null;
                                                                                                                                                                                                                                                                                                                                                                                                                            c00841.L$6 = null;
                                                                                                                                                                                                                                                                                                                                                                                                                            c00841.L$7 = mutex3;
                                                                                                                                                                                                                                                                                                                                                                                                                            c00841.L$8 = th;
                                                                                                                                                                                                                                                                                                                                                                                                                            c00841.L$9 = null;
                                                                                                                                                                                                                                                                                                                                                                                                                            c00841.D$0 = d12;
                                                                                                                                                                                                                                                                                                                                                                                                                            c00841.D$1 = d10;
                                                                                                                                                                                                                                                                                                                                                                                                                            c00841.F$0 = f5;
                                                                                                                                                                                                                                                                                                                                                                                                                            c00841.J$0 = j6;
                                                                                                                                                                                                                                                                                                                                                                                                                            c00841.Z$0 = z51;
                                                                                                                                                                                                                                                                                                                                                                                                                            c00841.Z$1 = z47;
                                                                                                                                                                                                                                                                                                                                                                                                                            c00841.Z$2 = z48;
                                                                                                                                                                                                                                                                                                                                                                                                                            c00841.Z$3 = z43;
                                                                                                                                                                                                                                                                                                                                                                                                                            c00841.Z$4 = z49;
                                                                                                                                                                                                                                                                                                                                                                                                                            c00841.D$2 = d11;
                                                                                                                                                                                                                                                                                                                                                                                                                            c00841.Z$5 = z50;
                                                                                                                                                                                                                                                                                                                                                                                                                            c00841.Z$6 = z46;
                                                                                                                                                                                                                                                                                                                                                                                                                            c00841.I$0 = i9;
                                                                                                                                                                                                                                                                                                                                                                                                                            c00841.Z$7 = z45;
                                                                                                                                                                                                                                                                                                                                                                                                                            c00841.Z$8 = z44;
                                                                                                                                                                                                                                                                                                                                                                                                                            c00841.I$1 = i7;
                                                                                                                                                                                                                                                                                                                                                                                                                            c00841.I$2 = i8;
                                                                                                                                                                                                                                                                                                                                                                                                                            c00841.label = 8;
                                                                                                                                                                                                                                                                                                                                                                                                                            z70Var6 = z70Var;
                                                                                                                                                                                                                                                                                                                                                                                                                            if (BuildersKt.withContext(nonCancellable, locationRepository$startSpoofingInternal$2$3, c00841) == z70Var6) {
                                                                                                                                                                                                                                                                                                                                                                                                                                return z70Var6;
                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                            throw th;
                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                    } catch (Throwable th5) {
                                                                                                                                                                                                                                                                                                                                                                                                                        th = th5;
                                                                                                                                                                                                                                                                                                                                                                                                                        z48 = z105;
                                                                                                                                                                                                                                                                                                                                                                                                                        mutex3 = mutex8;
                                                                                                                                                                                                                                                                                                                                                                                                                        i7 = i33;
                                                                                                                                                                                                                                                                                                                                                                                                                        z44 = z106;
                                                                                                                                                                                                                                                                                                                                                                                                                        z45 = z107;
                                                                                                                                                                                                                                                                                                                                                                                                                        i9 = i32;
                                                                                                                                                                                                                                                                                                                                                                                                                        z46 = z103;
                                                                                                                                                                                                                                                                                                                                                                                                                        z50 = z96;
                                                                                                                                                                                                                                                                                                                                                                                                                        z49 = z102;
                                                                                                                                                                                                                                                                                                                                                                                                                        context6 = context12;
                                                                                                                                                                                                                                                                                                                                                                                                                        i8 = i34;
                                                                                                                                                                                                                                                                                                                                                                                                                        d11 = d31;
                                                                                                                                                                                                                                                                                                                                                                                                                        th = th;
                                                                                                                                                                                                                                                                                                                                                                                                                        z43 = z108;
                                                                                                                                                                                                                                                                                                                                                                                                                        z51 = z51;
                                                                                                                                                                                                                                                                                                                                                                                                                        d12 = d30;
                                                                                                                                                                                                                                                                                                                                                                                                                        nonCancellable = NonCancellable.INSTANCE;
                                                                                                                                                                                                                                                                                                                                                                                                                        locationRepository$startSpoofingInternal$2$3 = new LocationRepository$startSpoofingInternal$2$3(th, locationRepository, context6, null);
                                                                                                                                                                                                                                                                                                                                                                                                                        c00841.L$0 = null;
                                                                                                                                                                                                                                                                                                                                                                                                                        c00841.L$1 = null;
                                                                                                                                                                                                                                                                                                                                                                                                                        c00841.L$2 = null;
                                                                                                                                                                                                                                                                                                                                                                                                                        c00841.L$3 = null;
                                                                                                                                                                                                                                                                                                                                                                                                                        c00841.L$4 = null;
                                                                                                                                                                                                                                                                                                                                                                                                                        c00841.L$5 = null;
                                                                                                                                                                                                                                                                                                                                                                                                                        c00841.L$6 = null;
                                                                                                                                                                                                                                                                                                                                                                                                                        c00841.L$7 = mutex3;
                                                                                                                                                                                                                                                                                                                                                                                                                        c00841.L$8 = th;
                                                                                                                                                                                                                                                                                                                                                                                                                        c00841.L$9 = null;
                                                                                                                                                                                                                                                                                                                                                                                                                        c00841.D$0 = d12;
                                                                                                                                                                                                                                                                                                                                                                                                                        c00841.D$1 = d10;
                                                                                                                                                                                                                                                                                                                                                                                                                        c00841.F$0 = f5;
                                                                                                                                                                                                                                                                                                                                                                                                                        c00841.J$0 = j6;
                                                                                                                                                                                                                                                                                                                                                                                                                        c00841.Z$0 = z51;
                                                                                                                                                                                                                                                                                                                                                                                                                        c00841.Z$1 = z47;
                                                                                                                                                                                                                                                                                                                                                                                                                        c00841.Z$2 = z48;
                                                                                                                                                                                                                                                                                                                                                                                                                        c00841.Z$3 = z43;
                                                                                                                                                                                                                                                                                                                                                                                                                        c00841.Z$4 = z49;
                                                                                                                                                                                                                                                                                                                                                                                                                        c00841.D$2 = d11;
                                                                                                                                                                                                                                                                                                                                                                                                                        c00841.Z$5 = z50;
                                                                                                                                                                                                                                                                                                                                                                                                                        c00841.Z$6 = z46;
                                                                                                                                                                                                                                                                                                                                                                                                                        c00841.I$0 = i9;
                                                                                                                                                                                                                                                                                                                                                                                                                        c00841.Z$7 = z45;
                                                                                                                                                                                                                                                                                                                                                                                                                        c00841.Z$8 = z44;
                                                                                                                                                                                                                                                                                                                                                                                                                        c00841.I$1 = i7;
                                                                                                                                                                                                                                                                                                                                                                                                                        c00841.I$2 = i8;
                                                                                                                                                                                                                                                                                                                                                                                                                        c00841.label = 8;
                                                                                                                                                                                                                                                                                                                                                                                                                        z70Var6 = z70Var;
                                                                                                                                                                                                                                                                                                                                                                                                                        if (BuildersKt.withContext(nonCancellable, locationRepository$startSpoofingInternal$2$3, c00841) == z70Var6) {
                                                                                                                                                                                                                                                                                                                                                                                                                            return z70Var6;
                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                        throw th;
                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                } catch (Throwable th6) {
                                                                                                                                                                                                                                                                                                                                                                                                                    th = th6;
                                                                                                                                                                                                                                                                                                                                                                                                                    i34 = i37;
                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                            } catch (Throwable th7) {
                                                                                                                                                                                                                                                                                                                                                                                                                th = th7;
                                                                                                                                                                                                                                                                                                                                                                                                                i33 = i36;
                                                                                                                                                                                                                                                                                                                                                                                                                d31 = d31;
                                                                                                                                                                                                                                                                                                                                                                                                                i34 = i30;
                                                                                                                                                                                                                                                                                                                                                                                                                z48 = z105;
                                                                                                                                                                                                                                                                                                                                                                                                                mutex3 = mutex8;
                                                                                                                                                                                                                                                                                                                                                                                                                i7 = i33;
                                                                                                                                                                                                                                                                                                                                                                                                                z44 = z106;
                                                                                                                                                                                                                                                                                                                                                                                                                z45 = z107;
                                                                                                                                                                                                                                                                                                                                                                                                                i9 = i32;
                                                                                                                                                                                                                                                                                                                                                                                                                z46 = z103;
                                                                                                                                                                                                                                                                                                                                                                                                                z50 = z96;
                                                                                                                                                                                                                                                                                                                                                                                                                z49 = z102;
                                                                                                                                                                                                                                                                                                                                                                                                                context6 = context12;
                                                                                                                                                                                                                                                                                                                                                                                                                i8 = i34;
                                                                                                                                                                                                                                                                                                                                                                                                                d11 = d31;
                                                                                                                                                                                                                                                                                                                                                                                                                th = th;
                                                                                                                                                                                                                                                                                                                                                                                                                z43 = z108;
                                                                                                                                                                                                                                                                                                                                                                                                                z51 = z51;
                                                                                                                                                                                                                                                                                                                                                                                                                d12 = d30;
                                                                                                                                                                                                                                                                                                                                                                                                                nonCancellable = NonCancellable.INSTANCE;
                                                                                                                                                                                                                                                                                                                                                                                                                locationRepository$startSpoofingInternal$2$3 = new LocationRepository$startSpoofingInternal$2$3(th, locationRepository, context6, null);
                                                                                                                                                                                                                                                                                                                                                                                                                c00841.L$0 = null;
                                                                                                                                                                                                                                                                                                                                                                                                                c00841.L$1 = null;
                                                                                                                                                                                                                                                                                                                                                                                                                c00841.L$2 = null;
                                                                                                                                                                                                                                                                                                                                                                                                                c00841.L$3 = null;
                                                                                                                                                                                                                                                                                                                                                                                                                c00841.L$4 = null;
                                                                                                                                                                                                                                                                                                                                                                                                                c00841.L$5 = null;
                                                                                                                                                                                                                                                                                                                                                                                                                c00841.L$6 = null;
                                                                                                                                                                                                                                                                                                                                                                                                                c00841.L$7 = mutex3;
                                                                                                                                                                                                                                                                                                                                                                                                                c00841.L$8 = th;
                                                                                                                                                                                                                                                                                                                                                                                                                c00841.L$9 = null;
                                                                                                                                                                                                                                                                                                                                                                                                                c00841.D$0 = d12;
                                                                                                                                                                                                                                                                                                                                                                                                                c00841.D$1 = d10;
                                                                                                                                                                                                                                                                                                                                                                                                                c00841.F$0 = f5;
                                                                                                                                                                                                                                                                                                                                                                                                                c00841.J$0 = j6;
                                                                                                                                                                                                                                                                                                                                                                                                                c00841.Z$0 = z51;
                                                                                                                                                                                                                                                                                                                                                                                                                c00841.Z$1 = z47;
                                                                                                                                                                                                                                                                                                                                                                                                                c00841.Z$2 = z48;
                                                                                                                                                                                                                                                                                                                                                                                                                c00841.Z$3 = z43;
                                                                                                                                                                                                                                                                                                                                                                                                                c00841.Z$4 = z49;
                                                                                                                                                                                                                                                                                                                                                                                                                c00841.D$2 = d11;
                                                                                                                                                                                                                                                                                                                                                                                                                c00841.Z$5 = z50;
                                                                                                                                                                                                                                                                                                                                                                                                                c00841.Z$6 = z46;
                                                                                                                                                                                                                                                                                                                                                                                                                c00841.I$0 = i9;
                                                                                                                                                                                                                                                                                                                                                                                                                c00841.Z$7 = z45;
                                                                                                                                                                                                                                                                                                                                                                                                                c00841.Z$8 = z44;
                                                                                                                                                                                                                                                                                                                                                                                                                c00841.I$1 = i7;
                                                                                                                                                                                                                                                                                                                                                                                                                c00841.I$2 = i8;
                                                                                                                                                                                                                                                                                                                                                                                                                c00841.label = 8;
                                                                                                                                                                                                                                                                                                                                                                                                                z70Var6 = z70Var;
                                                                                                                                                                                                                                                                                                                                                                                                                if (BuildersKt.withContext(nonCancellable, locationRepository$startSpoofingInternal$2$3, c00841) == z70Var6) {
                                                                                                                                                                                                                                                                                                                                                                                                                    return z70Var6;
                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                throw th;
                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                        } catch (Throwable th8) {
                                                                                                                                                                                                                                                                                                                                                                                                            th = th8;
                                                                                                                                                                                                                                                                                                                                                                                                            z106 = z113;
                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                    } catch (Throwable th9) {
                                                                                                                                                                                                                                                                                                                                                                                                        th = th9;
                                                                                                                                                                                                                                                                                                                                                                                                        z107 = z112;
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                } catch (Throwable th10) {
                                                                                                                                                                                                                                                                                                                                                                                                    th = th10;
                                                                                                                                                                                                                                                                                                                                                                                                    i32 = i35;
                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                            } catch (Throwable th11) {
                                                                                                                                                                                                                                                                                                                                                                                                th = th11;
                                                                                                                                                                                                                                                                                                                                                                                                z103 = z111;
                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                        } catch (Throwable th12) {
                                                                                                                                                                                                                                                                                                                                                                                            th = th12;
                                                                                                                                                                                                                                                                                                                                                                                            z96 = z110;
                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                    } catch (Throwable th13) {
                                                                                                                                                                                                                                                                                                                                                                                        th = th13;
                                                                                                                                                                                                                                                                                                                                                                                        z102 = z109;
                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                } catch (Throwable th14) {
                                                                                                                                                                                                                                                                                                                                                                                    th = th14;
                                                                                                                                                                                                                                                                                                                                                                                    z102 = z109;
                                                                                                                                                                                                                                                                                                                                                                                    d30 = d29;
                                                                                                                                                                                                                                                                                                                                                                                    i34 = i30;
                                                                                                                                                                                                                                                                                                                                                                                    d31 = d27;
                                                                                                                                                                                                                                                                                                                                                                                    z108 = z101;
                                                                                                                                                                                                                                                                                                                                                                                    z48 = z105;
                                                                                                                                                                                                                                                                                                                                                                                    mutex3 = mutex8;
                                                                                                                                                                                                                                                                                                                                                                                    i7 = i33;
                                                                                                                                                                                                                                                                                                                                                                                    z44 = z106;
                                                                                                                                                                                                                                                                                                                                                                                    z45 = z107;
                                                                                                                                                                                                                                                                                                                                                                                    i9 = i32;
                                                                                                                                                                                                                                                                                                                                                                                    z46 = z103;
                                                                                                                                                                                                                                                                                                                                                                                    z50 = z96;
                                                                                                                                                                                                                                                                                                                                                                                    z49 = z102;
                                                                                                                                                                                                                                                                                                                                                                                    context6 = context12;
                                                                                                                                                                                                                                                                                                                                                                                    i8 = i34;
                                                                                                                                                                                                                                                                                                                                                                                    d11 = d31;
                                                                                                                                                                                                                                                                                                                                                                                    th = th;
                                                                                                                                                                                                                                                                                                                                                                                    z43 = z108;
                                                                                                                                                                                                                                                                                                                                                                                    z51 = z51;
                                                                                                                                                                                                                                                                                                                                                                                    d12 = d30;
                                                                                                                                                                                                                                                                                                                                                                                    nonCancellable = NonCancellable.INSTANCE;
                                                                                                                                                                                                                                                                                                                                                                                    locationRepository$startSpoofingInternal$2$3 = new LocationRepository$startSpoofingInternal$2$3(th, locationRepository, context6, null);
                                                                                                                                                                                                                                                                                                                                                                                    c00841.L$0 = null;
                                                                                                                                                                                                                                                                                                                                                                                    c00841.L$1 = null;
                                                                                                                                                                                                                                                                                                                                                                                    c00841.L$2 = null;
                                                                                                                                                                                                                                                                                                                                                                                    c00841.L$3 = null;
                                                                                                                                                                                                                                                                                                                                                                                    c00841.L$4 = null;
                                                                                                                                                                                                                                                                                                                                                                                    c00841.L$5 = null;
                                                                                                                                                                                                                                                                                                                                                                                    c00841.L$6 = null;
                                                                                                                                                                                                                                                                                                                                                                                    c00841.L$7 = mutex3;
                                                                                                                                                                                                                                                                                                                                                                                    c00841.L$8 = th;
                                                                                                                                                                                                                                                                                                                                                                                    c00841.L$9 = null;
                                                                                                                                                                                                                                                                                                                                                                                    c00841.D$0 = d12;
                                                                                                                                                                                                                                                                                                                                                                                    c00841.D$1 = d10;
                                                                                                                                                                                                                                                                                                                                                                                    c00841.F$0 = f5;
                                                                                                                                                                                                                                                                                                                                                                                    c00841.J$0 = j6;
                                                                                                                                                                                                                                                                                                                                                                                    c00841.Z$0 = z51;
                                                                                                                                                                                                                                                                                                                                                                                    c00841.Z$1 = z47;
                                                                                                                                                                                                                                                                                                                                                                                    c00841.Z$2 = z48;
                                                                                                                                                                                                                                                                                                                                                                                    c00841.Z$3 = z43;
                                                                                                                                                                                                                                                                                                                                                                                    c00841.Z$4 = z49;
                                                                                                                                                                                                                                                                                                                                                                                    c00841.D$2 = d11;
                                                                                                                                                                                                                                                                                                                                                                                    c00841.Z$5 = z50;
                                                                                                                                                                                                                                                                                                                                                                                    c00841.Z$6 = z46;
                                                                                                                                                                                                                                                                                                                                                                                    c00841.I$0 = i9;
                                                                                                                                                                                                                                                                                                                                                                                    c00841.Z$7 = z45;
                                                                                                                                                                                                                                                                                                                                                                                    c00841.Z$8 = z44;
                                                                                                                                                                                                                                                                                                                                                                                    c00841.I$1 = i7;
                                                                                                                                                                                                                                                                                                                                                                                    c00841.I$2 = i8;
                                                                                                                                                                                                                                                                                                                                                                                    c00841.label = 8;
                                                                                                                                                                                                                                                                                                                                                                                    z70Var6 = z70Var;
                                                                                                                                                                                                                                                                                                                                                                                    if (BuildersKt.withContext(nonCancellable, locationRepository$startSpoofingInternal$2$3, c00841) == z70Var6) {
                                                                                                                                                                                                                                                                                                                                                                                        return z70Var6;
                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                    throw th;
                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                            } catch (Throwable th15) {
                                                                                                                                                                                                                                                                                                                                                                                th = th15;
                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                        } catch (Throwable th16) {
                                                                                                                                                                                                                                                                                                                                                                            th = th16;
                                                                                                                                                                                                                                                                                                                                                                            context12 = context11;
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                } catch (Throwable th17) {
                                                                                                                                                                                                                                                                                                                                                                    th = th17;
                                                                                                                                                                                                                                                                                                                                                                    z48 = z92;
                                                                                                                                                                                                                                                                                                                                                                    i8 = i25;
                                                                                                                                                                                                                                                                                                                                                                    i7 = i24;
                                                                                                                                                                                                                                                                                                                                                                    z44 = z95;
                                                                                                                                                                                                                                                                                                                                                                    z46 = z94;
                                                                                                                                                                                                                                                                                                                                                                    mutex3 = mutex7;
                                                                                                                                                                                                                                                                                                                                                                    z50 = z96;
                                                                                                                                                                                                                                                                                                                                                                    d11 = d25;
                                                                                                                                                                                                                                                                                                                                                                    th = th;
                                                                                                                                                                                                                                                                                                                                                                    d10 = d23;
                                                                                                                                                                                                                                                                                                                                                                    z49 = z91;
                                                                                                                                                                                                                                                                                                                                                                    z51 = z51;
                                                                                                                                                                                                                                                                                                                                                                    z43 = z90;
                                                                                                                                                                                                                                                                                                                                                                    context6 = context10;
                                                                                                                                                                                                                                                                                                                                                                    d12 = d22;
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                            } catch (Throwable th18) {
                                                                                                                                                                                                                                                                                                                                                                th = th18;
                                                                                                                                                                                                                                                                                                                                                                d25 = d25;
                                                                                                                                                                                                                                                                                                                                                                z48 = z92;
                                                                                                                                                                                                                                                                                                                                                                i8 = i25;
                                                                                                                                                                                                                                                                                                                                                                i7 = i24;
                                                                                                                                                                                                                                                                                                                                                                z44 = z95;
                                                                                                                                                                                                                                                                                                                                                                z46 = z94;
                                                                                                                                                                                                                                                                                                                                                                mutex3 = mutex7;
                                                                                                                                                                                                                                                                                                                                                                z50 = z96;
                                                                                                                                                                                                                                                                                                                                                                d11 = d25;
                                                                                                                                                                                                                                                                                                                                                                th = th;
                                                                                                                                                                                                                                                                                                                                                                d10 = d23;
                                                                                                                                                                                                                                                                                                                                                                z49 = z91;
                                                                                                                                                                                                                                                                                                                                                                z51 = z51;
                                                                                                                                                                                                                                                                                                                                                                z43 = z90;
                                                                                                                                                                                                                                                                                                                                                                context6 = context10;
                                                                                                                                                                                                                                                                                                                                                                d12 = d22;
                                                                                                                                                                                                                                                                                                                                                                nonCancellable = NonCancellable.INSTANCE;
                                                                                                                                                                                                                                                                                                                                                                locationRepository$startSpoofingInternal$2$3 = new LocationRepository$startSpoofingInternal$2$3(th, locationRepository, context6, null);
                                                                                                                                                                                                                                                                                                                                                                c00841.L$0 = null;
                                                                                                                                                                                                                                                                                                                                                                c00841.L$1 = null;
                                                                                                                                                                                                                                                                                                                                                                c00841.L$2 = null;
                                                                                                                                                                                                                                                                                                                                                                c00841.L$3 = null;
                                                                                                                                                                                                                                                                                                                                                                c00841.L$4 = null;
                                                                                                                                                                                                                                                                                                                                                                c00841.L$5 = null;
                                                                                                                                                                                                                                                                                                                                                                c00841.L$6 = null;
                                                                                                                                                                                                                                                                                                                                                                c00841.L$7 = mutex3;
                                                                                                                                                                                                                                                                                                                                                                c00841.L$8 = th;
                                                                                                                                                                                                                                                                                                                                                                c00841.L$9 = null;
                                                                                                                                                                                                                                                                                                                                                                c00841.D$0 = d12;
                                                                                                                                                                                                                                                                                                                                                                c00841.D$1 = d10;
                                                                                                                                                                                                                                                                                                                                                                c00841.F$0 = f5;
                                                                                                                                                                                                                                                                                                                                                                c00841.J$0 = j6;
                                                                                                                                                                                                                                                                                                                                                                c00841.Z$0 = z51;
                                                                                                                                                                                                                                                                                                                                                                c00841.Z$1 = z47;
                                                                                                                                                                                                                                                                                                                                                                c00841.Z$2 = z48;
                                                                                                                                                                                                                                                                                                                                                                c00841.Z$3 = z43;
                                                                                                                                                                                                                                                                                                                                                                c00841.Z$4 = z49;
                                                                                                                                                                                                                                                                                                                                                                c00841.D$2 = d11;
                                                                                                                                                                                                                                                                                                                                                                c00841.Z$5 = z50;
                                                                                                                                                                                                                                                                                                                                                                c00841.Z$6 = z46;
                                                                                                                                                                                                                                                                                                                                                                c00841.I$0 = i9;
                                                                                                                                                                                                                                                                                                                                                                c00841.Z$7 = z45;
                                                                                                                                                                                                                                                                                                                                                                c00841.Z$8 = z44;
                                                                                                                                                                                                                                                                                                                                                                c00841.I$1 = i7;
                                                                                                                                                                                                                                                                                                                                                                c00841.I$2 = i8;
                                                                                                                                                                                                                                                                                                                                                                c00841.label = 8;
                                                                                                                                                                                                                                                                                                                                                                z70Var6 = z70Var;
                                                                                                                                                                                                                                                                                                                                                                if (BuildersKt.withContext(nonCancellable, locationRepository$startSpoofingInternal$2$3, c00841) == z70Var6) {
                                                                                                                                                                                                                                                                                                                                                                    return z70Var6;
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                throw th;
                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                        } catch (Throwable th19) {
                                                                                                                                                                                                                                                                                                                                                            th = th19;
                                                                                                                                                                                                                                                                                                                                                            i25 = i28;
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                    } catch (Throwable th20) {
                                                                                                                                                                                                                                                                                                                                                        th = th20;
                                                                                                                                                                                                                                                                                                                                                        i24 = i27;
                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                } catch (Throwable th21) {
                                                                                                                                                                                                                                                                                                                                                    th = th21;
                                                                                                                                                                                                                                                                                                                                                    z95 = z100;
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                            } catch (Throwable th22) {
                                                                                                                                                                                                                                                                                                                                                th = th22;
                                                                                                                                                                                                                                                                                                                                                z45 = z99;
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                        } catch (Throwable th23) {
                                                                                                                                                                                                                                                                                                                                            th = th23;
                                                                                                                                                                                                                                                                                                                                            i9 = i26;
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                    } catch (Throwable th24) {
                                                                                                                                                                                                                                                                                                                                        th = th24;
                                                                                                                                                                                                                                                                                                                                        z94 = z98;
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                } catch (Throwable th25) {
                                                                                                                                                                                                                                                                                                                                    th = th25;
                                                                                                                                                                                                                                                                                                                                    z96 = z96;
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                            } catch (Throwable th26) {
                                                                                                                                                                                                                                                                                                                                th = th26;
                                                                                                                                                                                                                                                                                                                                mutex7 = mutex7;
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                        } catch (Throwable th27) {
                                                                                                                                                                                                                                                                                                                            th = th27;
                                                                                                                                                                                                                                                                                                                            mutex7 = mutex7;
                                                                                                                                                                                                                                                                                                                            d22 = d22;
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                    } catch (Throwable th28) {
                                                                                                                                                                                                                                                                                                                        th = th28;
                                                                                                                                                                                                                                                                                                                        z91 = z97;
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                } catch (Throwable th29) {
                                                                                                                                                                                                                                                                                                                    th = th29;
                                                                                                                                                                                                                                                                                                                    locationRepository = locationRepository2;
                                                                                                                                                                                                                                                                                                                    context10 = context10;
                                                                                                                                                                                                                                                                                                                    z91 = z97;
                                                                                                                                                                                                                                                                                                                    z48 = z92;
                                                                                                                                                                                                                                                                                                                    i8 = i25;
                                                                                                                                                                                                                                                                                                                    i7 = i24;
                                                                                                                                                                                                                                                                                                                    z44 = z95;
                                                                                                                                                                                                                                                                                                                    z46 = z94;
                                                                                                                                                                                                                                                                                                                    mutex3 = mutex7;
                                                                                                                                                                                                                                                                                                                    z50 = z96;
                                                                                                                                                                                                                                                                                                                    d11 = d25;
                                                                                                                                                                                                                                                                                                                    th = th;
                                                                                                                                                                                                                                                                                                                    d10 = d23;
                                                                                                                                                                                                                                                                                                                    z49 = z91;
                                                                                                                                                                                                                                                                                                                    z51 = z51;
                                                                                                                                                                                                                                                                                                                    z43 = z90;
                                                                                                                                                                                                                                                                                                                    context6 = context10;
                                                                                                                                                                                                                                                                                                                    d12 = d22;
                                                                                                                                                                                                                                                                                                                    nonCancellable = NonCancellable.INSTANCE;
                                                                                                                                                                                                                                                                                                                    locationRepository$startSpoofingInternal$2$3 = new LocationRepository$startSpoofingInternal$2$3(th, locationRepository, context6, null);
                                                                                                                                                                                                                                                                                                                    c00841.L$0 = null;
                                                                                                                                                                                                                                                                                                                    c00841.L$1 = null;
                                                                                                                                                                                                                                                                                                                    c00841.L$2 = null;
                                                                                                                                                                                                                                                                                                                    c00841.L$3 = null;
                                                                                                                                                                                                                                                                                                                    c00841.L$4 = null;
                                                                                                                                                                                                                                                                                                                    c00841.L$5 = null;
                                                                                                                                                                                                                                                                                                                    c00841.L$6 = null;
                                                                                                                                                                                                                                                                                                                    c00841.L$7 = mutex3;
                                                                                                                                                                                                                                                                                                                    c00841.L$8 = th;
                                                                                                                                                                                                                                                                                                                    c00841.L$9 = null;
                                                                                                                                                                                                                                                                                                                    c00841.D$0 = d12;
                                                                                                                                                                                                                                                                                                                    c00841.D$1 = d10;
                                                                                                                                                                                                                                                                                                                    c00841.F$0 = f5;
                                                                                                                                                                                                                                                                                                                    c00841.J$0 = j6;
                                                                                                                                                                                                                                                                                                                    c00841.Z$0 = z51;
                                                                                                                                                                                                                                                                                                                    c00841.Z$1 = z47;
                                                                                                                                                                                                                                                                                                                    c00841.Z$2 = z48;
                                                                                                                                                                                                                                                                                                                    c00841.Z$3 = z43;
                                                                                                                                                                                                                                                                                                                    c00841.Z$4 = z49;
                                                                                                                                                                                                                                                                                                                    c00841.D$2 = d11;
                                                                                                                                                                                                                                                                                                                    c00841.Z$5 = z50;
                                                                                                                                                                                                                                                                                                                    c00841.Z$6 = z46;
                                                                                                                                                                                                                                                                                                                    c00841.I$0 = i9;
                                                                                                                                                                                                                                                                                                                    c00841.Z$7 = z45;
                                                                                                                                                                                                                                                                                                                    c00841.Z$8 = z44;
                                                                                                                                                                                                                                                                                                                    c00841.I$1 = i7;
                                                                                                                                                                                                                                                                                                                    c00841.I$2 = i8;
                                                                                                                                                                                                                                                                                                                    c00841.label = 8;
                                                                                                                                                                                                                                                                                                                    z70Var6 = z70Var;
                                                                                                                                                                                                                                                                                                                    if (BuildersKt.withContext(nonCancellable, locationRepository$startSpoofingInternal$2$3, c00841) == z70Var6) {
                                                                                                                                                                                                                                                                                                                        return z70Var6;
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                    throw th;
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                            } catch (Throwable th30) {
                                                                                                                                                                                                                                                                                                                th = th30;
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                        } catch (Throwable th31) {
                                                                                                                                                                                                                                                                                                            th = th31;
                                                                                                                                                                                                                                                                                                            mutex7 = mutex7;
                                                                                                                                                                                                                                                                                                            d25 = d25;
                                                                                                                                                                                                                                                                                                            d23 = d23;
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                    } catch (Throwable th32) {
                                                                                                                                                                                                                                                                                                        th = th32;
                                                                                                                                                                                                                                                                                                        context10 = context10;
                                                                                                                                                                                                                                                                                                        d23 = d23;
                                                                                                                                                                                                                                                                                                        z48 = z92;
                                                                                                                                                                                                                                                                                                        i8 = i25;
                                                                                                                                                                                                                                                                                                        i7 = i24;
                                                                                                                                                                                                                                                                                                        z44 = z95;
                                                                                                                                                                                                                                                                                                        z46 = z94;
                                                                                                                                                                                                                                                                                                        mutex3 = mutex7;
                                                                                                                                                                                                                                                                                                        z50 = z96;
                                                                                                                                                                                                                                                                                                        d11 = d25;
                                                                                                                                                                                                                                                                                                        th = th;
                                                                                                                                                                                                                                                                                                        d10 = d23;
                                                                                                                                                                                                                                                                                                        z49 = z91;
                                                                                                                                                                                                                                                                                                        z51 = z51;
                                                                                                                                                                                                                                                                                                        z43 = z90;
                                                                                                                                                                                                                                                                                                        context6 = context10;
                                                                                                                                                                                                                                                                                                        d12 = d22;
                                                                                                                                                                                                                                                                                                        nonCancellable = NonCancellable.INSTANCE;
                                                                                                                                                                                                                                                                                                        locationRepository$startSpoofingInternal$2$3 = new LocationRepository$startSpoofingInternal$2$3(th, locationRepository, context6, null);
                                                                                                                                                                                                                                                                                                        c00841.L$0 = null;
                                                                                                                                                                                                                                                                                                        c00841.L$1 = null;
                                                                                                                                                                                                                                                                                                        c00841.L$2 = null;
                                                                                                                                                                                                                                                                                                        c00841.L$3 = null;
                                                                                                                                                                                                                                                                                                        c00841.L$4 = null;
                                                                                                                                                                                                                                                                                                        c00841.L$5 = null;
                                                                                                                                                                                                                                                                                                        c00841.L$6 = null;
                                                                                                                                                                                                                                                                                                        c00841.L$7 = mutex3;
                                                                                                                                                                                                                                                                                                        c00841.L$8 = th;
                                                                                                                                                                                                                                                                                                        c00841.L$9 = null;
                                                                                                                                                                                                                                                                                                        c00841.D$0 = d12;
                                                                                                                                                                                                                                                                                                        c00841.D$1 = d10;
                                                                                                                                                                                                                                                                                                        c00841.F$0 = f5;
                                                                                                                                                                                                                                                                                                        c00841.J$0 = j6;
                                                                                                                                                                                                                                                                                                        c00841.Z$0 = z51;
                                                                                                                                                                                                                                                                                                        c00841.Z$1 = z47;
                                                                                                                                                                                                                                                                                                        c00841.Z$2 = z48;
                                                                                                                                                                                                                                                                                                        c00841.Z$3 = z43;
                                                                                                                                                                                                                                                                                                        c00841.Z$4 = z49;
                                                                                                                                                                                                                                                                                                        c00841.D$2 = d11;
                                                                                                                                                                                                                                                                                                        c00841.Z$5 = z50;
                                                                                                                                                                                                                                                                                                        c00841.Z$6 = z46;
                                                                                                                                                                                                                                                                                                        c00841.I$0 = i9;
                                                                                                                                                                                                                                                                                                        c00841.Z$7 = z45;
                                                                                                                                                                                                                                                                                                        c00841.Z$8 = z44;
                                                                                                                                                                                                                                                                                                        c00841.I$1 = i7;
                                                                                                                                                                                                                                                                                                        c00841.I$2 = i8;
                                                                                                                                                                                                                                                                                                        c00841.label = 8;
                                                                                                                                                                                                                                                                                                        z70Var6 = z70Var;
                                                                                                                                                                                                                                                                                                        if (BuildersKt.withContext(nonCancellable, locationRepository$startSpoofingInternal$2$3, c00841) == z70Var6) {
                                                                                                                                                                                                                                                                                                            return z70Var6;
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                        throw th;
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                } catch (Throwable th33) {
                                                                                                                                                                                                                                                                                                    th = th33;
                                                                                                                                                                                                                                                                                                    z70Var = z70Var;
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                            } catch (Throwable th34) {
                                                                                                                                                                                                                                                                                                th = th34;
                                                                                                                                                                                                                                                                                                z96 = z93;
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                            mutex7 = mutex7;
                                                                                                                                                                                                                                                                                            d25 = d25;
                                                                                                                                                                                                                                                                                            z96 = z93;
                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                throw new IllegalStateException("运行配置发布失败");
                                                                                                                                                                                                                                                                                            } catch (Throwable th35) {
                                                                                                                                                                                                                                                                                                th = th35;
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        z70Var = z70Var;
                                                                                                                                                                                                                                                                                    } catch (Throwable th36) {
                                                                                                                                                                                                                                                                                        th = th36;
                                                                                                                                                                                                                                                                                        z96 = z93;
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    z48 = z92;
                                                                                                                                                                                                                                                                                    i8 = i25;
                                                                                                                                                                                                                                                                                    i7 = i24;
                                                                                                                                                                                                                                                                                    z44 = z95;
                                                                                                                                                                                                                                                                                    z46 = z94;
                                                                                                                                                                                                                                                                                    mutex3 = mutex7;
                                                                                                                                                                                                                                                                                    z50 = z96;
                                                                                                                                                                                                                                                                                    d11 = d25;
                                                                                                                                                                                                                                                                                    th = th;
                                                                                                                                                                                                                                                                                    d10 = d23;
                                                                                                                                                                                                                                                                                    z49 = z91;
                                                                                                                                                                                                                                                                                    z51 = z51;
                                                                                                                                                                                                                                                                                    z43 = z90;
                                                                                                                                                                                                                                                                                    context6 = context10;
                                                                                                                                                                                                                                                                                    d12 = d22;
                                                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                                                        nonCancellable = NonCancellable.INSTANCE;
                                                                                                                                                                                                                                                                                        locationRepository$startSpoofingInternal$2$3 = new LocationRepository$startSpoofingInternal$2$3(th, locationRepository, context6, null);
                                                                                                                                                                                                                                                                                        c00841.L$0 = null;
                                                                                                                                                                                                                                                                                        c00841.L$1 = null;
                                                                                                                                                                                                                                                                                        c00841.L$2 = null;
                                                                                                                                                                                                                                                                                        c00841.L$3 = null;
                                                                                                                                                                                                                                                                                        c00841.L$4 = null;
                                                                                                                                                                                                                                                                                        c00841.L$5 = null;
                                                                                                                                                                                                                                                                                        c00841.L$6 = null;
                                                                                                                                                                                                                                                                                        c00841.L$7 = mutex3;
                                                                                                                                                                                                                                                                                        c00841.L$8 = th;
                                                                                                                                                                                                                                                                                        c00841.L$9 = null;
                                                                                                                                                                                                                                                                                        c00841.D$0 = d12;
                                                                                                                                                                                                                                                                                        c00841.D$1 = d10;
                                                                                                                                                                                                                                                                                        c00841.F$0 = f5;
                                                                                                                                                                                                                                                                                        c00841.J$0 = j6;
                                                                                                                                                                                                                                                                                        c00841.Z$0 = z51;
                                                                                                                                                                                                                                                                                        c00841.Z$1 = z47;
                                                                                                                                                                                                                                                                                        c00841.Z$2 = z48;
                                                                                                                                                                                                                                                                                        c00841.Z$3 = z43;
                                                                                                                                                                                                                                                                                        c00841.Z$4 = z49;
                                                                                                                                                                                                                                                                                        c00841.D$2 = d11;
                                                                                                                                                                                                                                                                                        c00841.Z$5 = z50;
                                                                                                                                                                                                                                                                                        c00841.Z$6 = z46;
                                                                                                                                                                                                                                                                                        c00841.I$0 = i9;
                                                                                                                                                                                                                                                                                        c00841.Z$7 = z45;
                                                                                                                                                                                                                                                                                        c00841.Z$8 = z44;
                                                                                                                                                                                                                                                                                        c00841.I$1 = i7;
                                                                                                                                                                                                                                                                                        c00841.I$2 = i8;
                                                                                                                                                                                                                                                                                        c00841.label = 8;
                                                                                                                                                                                                                                                                                        z70Var6 = z70Var;
                                                                                                                                                                                                                                                                                        if (BuildersKt.withContext(nonCancellable, locationRepository$startSpoofingInternal$2$3, c00841) == z70Var6) {
                                                                                                                                                                                                                                                                                            return z70Var6;
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        throw th;
                                                                                                                                                                                                                                                                                    } catch (Throwable th37) {
                                                                                                                                                                                                                                                                                        th = th37;
                                                                                                                                                                                                                                                                                        obj2 = null;
                                                                                                                                                                                                                                                                                        mutex3.unlock(obj2);
                                                                                                                                                                                                                                                                                        throw th;
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                return z70Var5;
                                                                                                                                                                                                                                                                            } catch (Throwable th38) {
                                                                                                                                                                                                                                                                                th = th38;
                                                                                                                                                                                                                                                                                z82 = z82;
                                                                                                                                                                                                                                                                                c00841 = c00842;
                                                                                                                                                                                                                                                                                z70Var = z70Var5;
                                                                                                                                                                                                                                                                                z47 = z83;
                                                                                                                                                                                                                                                                                z49 = z80;
                                                                                                                                                                                                                                                                                d11 = d19;
                                                                                                                                                                                                                                                                                z50 = z76;
                                                                                                                                                                                                                                                                                i9 = i18;
                                                                                                                                                                                                                                                                                z45 = z77;
                                                                                                                                                                                                                                                                                context6 = context9;
                                                                                                                                                                                                                                                                                mutex3 = mutex6;
                                                                                                                                                                                                                                                                                z44 = z78;
                                                                                                                                                                                                                                                                                i7 = i19;
                                                                                                                                                                                                                                                                                i8 = i20;
                                                                                                                                                                                                                                                                                th = th;
                                                                                                                                                                                                                                                                                d12 = d18;
                                                                                                                                                                                                                                                                                z48 = z82;
                                                                                                                                                                                                                                                                                z43 = z75;
                                                                                                                                                                                                                                                                                z46 = z79;
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                        } catch (Throwable th39) {
                                                                                                                                                                                                                                                                            th = th39;
                                                                                                                                                                                                                                                                            i20 = i21;
                                                                                                                                                                                                                                                                            z78 = z78;
                                                                                                                                                                                                                                                                            d19 = d19;
                                                                                                                                                                                                                                                                            i19 = i19;
                                                                                                                                                                                                                                                                            mutex6 = mutex6;
                                                                                                                                                                                                                                                                            z70Var5 = z70Var4;
                                                                                                                                                                                                                                                                            d18 = d20;
                                                                                                                                                                                                                                                                            context9 = context9;
                                                                                                                                                                                                                                                                            z70Var = z70Var5;
                                                                                                                                                                                                                                                                            z47 = z83;
                                                                                                                                                                                                                                                                            z49 = z80;
                                                                                                                                                                                                                                                                            d11 = d19;
                                                                                                                                                                                                                                                                            z50 = z76;
                                                                                                                                                                                                                                                                            i9 = i18;
                                                                                                                                                                                                                                                                            z45 = z77;
                                                                                                                                                                                                                                                                            context6 = context9;
                                                                                                                                                                                                                                                                            mutex3 = mutex6;
                                                                                                                                                                                                                                                                            z44 = z78;
                                                                                                                                                                                                                                                                            i7 = i19;
                                                                                                                                                                                                                                                                            i8 = i20;
                                                                                                                                                                                                                                                                            th = th;
                                                                                                                                                                                                                                                                            d12 = d18;
                                                                                                                                                                                                                                                                            z48 = z82;
                                                                                                                                                                                                                                                                            z43 = z75;
                                                                                                                                                                                                                                                                            z46 = z79;
                                                                                                                                                                                                                                                                            nonCancellable = NonCancellable.INSTANCE;
                                                                                                                                                                                                                                                                            locationRepository$startSpoofingInternal$2$3 = new LocationRepository$startSpoofingInternal$2$3(th, locationRepository, context6, null);
                                                                                                                                                                                                                                                                            c00841.L$0 = null;
                                                                                                                                                                                                                                                                            c00841.L$1 = null;
                                                                                                                                                                                                                                                                            c00841.L$2 = null;
                                                                                                                                                                                                                                                                            c00841.L$3 = null;
                                                                                                                                                                                                                                                                            c00841.L$4 = null;
                                                                                                                                                                                                                                                                            c00841.L$5 = null;
                                                                                                                                                                                                                                                                            c00841.L$6 = null;
                                                                                                                                                                                                                                                                            c00841.L$7 = mutex3;
                                                                                                                                                                                                                                                                            c00841.L$8 = th;
                                                                                                                                                                                                                                                                            c00841.L$9 = null;
                                                                                                                                                                                                                                                                            c00841.D$0 = d12;
                                                                                                                                                                                                                                                                            c00841.D$1 = d10;
                                                                                                                                                                                                                                                                            c00841.F$0 = f5;
                                                                                                                                                                                                                                                                            c00841.J$0 = j6;
                                                                                                                                                                                                                                                                            c00841.Z$0 = z51;
                                                                                                                                                                                                                                                                            c00841.Z$1 = z47;
                                                                                                                                                                                                                                                                            c00841.Z$2 = z48;
                                                                                                                                                                                                                                                                            c00841.Z$3 = z43;
                                                                                                                                                                                                                                                                            c00841.Z$4 = z49;
                                                                                                                                                                                                                                                                            c00841.D$2 = d11;
                                                                                                                                                                                                                                                                            c00841.Z$5 = z50;
                                                                                                                                                                                                                                                                            c00841.Z$6 = z46;
                                                                                                                                                                                                                                                                            c00841.I$0 = i9;
                                                                                                                                                                                                                                                                            c00841.Z$7 = z45;
                                                                                                                                                                                                                                                                            c00841.Z$8 = z44;
                                                                                                                                                                                                                                                                            c00841.I$1 = i7;
                                                                                                                                                                                                                                                                            c00841.I$2 = i8;
                                                                                                                                                                                                                                                                            c00841.label = 8;
                                                                                                                                                                                                                                                                            z70Var6 = z70Var;
                                                                                                                                                                                                                                                                            if (BuildersKt.withContext(nonCancellable, locationRepository$startSpoofingInternal$2$3, c00841) == z70Var6) {
                                                                                                                                                                                                                                                                                return z70Var6;
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            throw th;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    } catch (Throwable th40) {
                                                                                                                                                                                                                                                                        th = th40;
                                                                                                                                                                                                                                                                        i20 = i21;
                                                                                                                                                                                                                                                                        z70Var5 = z70Var4;
                                                                                                                                                                                                                                                                        d18 = d20;
                                                                                                                                                                                                                                                                        context9 = context9;
                                                                                                                                                                                                                                                                        z70Var = z70Var5;
                                                                                                                                                                                                                                                                        z47 = z83;
                                                                                                                                                                                                                                                                        z49 = z80;
                                                                                                                                                                                                                                                                        d11 = d19;
                                                                                                                                                                                                                                                                        z50 = z76;
                                                                                                                                                                                                                                                                        i9 = i18;
                                                                                                                                                                                                                                                                        z45 = z77;
                                                                                                                                                                                                                                                                        context6 = context9;
                                                                                                                                                                                                                                                                        mutex3 = mutex6;
                                                                                                                                                                                                                                                                        z44 = z78;
                                                                                                                                                                                                                                                                        i7 = i19;
                                                                                                                                                                                                                                                                        i8 = i20;
                                                                                                                                                                                                                                                                        th = th;
                                                                                                                                                                                                                                                                        d12 = d18;
                                                                                                                                                                                                                                                                        z48 = z82;
                                                                                                                                                                                                                                                                        z43 = z75;
                                                                                                                                                                                                                                                                        z46 = z79;
                                                                                                                                                                                                                                                                        nonCancellable = NonCancellable.INSTANCE;
                                                                                                                                                                                                                                                                        locationRepository$startSpoofingInternal$2$3 = new LocationRepository$startSpoofingInternal$2$3(th, locationRepository, context6, null);
                                                                                                                                                                                                                                                                        c00841.L$0 = null;
                                                                                                                                                                                                                                                                        c00841.L$1 = null;
                                                                                                                                                                                                                                                                        c00841.L$2 = null;
                                                                                                                                                                                                                                                                        c00841.L$3 = null;
                                                                                                                                                                                                                                                                        c00841.L$4 = null;
                                                                                                                                                                                                                                                                        c00841.L$5 = null;
                                                                                                                                                                                                                                                                        c00841.L$6 = null;
                                                                                                                                                                                                                                                                        c00841.L$7 = mutex3;
                                                                                                                                                                                                                                                                        c00841.L$8 = th;
                                                                                                                                                                                                                                                                        c00841.L$9 = null;
                                                                                                                                                                                                                                                                        c00841.D$0 = d12;
                                                                                                                                                                                                                                                                        c00841.D$1 = d10;
                                                                                                                                                                                                                                                                        c00841.F$0 = f5;
                                                                                                                                                                                                                                                                        c00841.J$0 = j6;
                                                                                                                                                                                                                                                                        c00841.Z$0 = z51;
                                                                                                                                                                                                                                                                        c00841.Z$1 = z47;
                                                                                                                                                                                                                                                                        c00841.Z$2 = z48;
                                                                                                                                                                                                                                                                        c00841.Z$3 = z43;
                                                                                                                                                                                                                                                                        c00841.Z$4 = z49;
                                                                                                                                                                                                                                                                        c00841.D$2 = d11;
                                                                                                                                                                                                                                                                        c00841.Z$5 = z50;
                                                                                                                                                                                                                                                                        c00841.Z$6 = z46;
                                                                                                                                                                                                                                                                        c00841.I$0 = i9;
                                                                                                                                                                                                                                                                        c00841.Z$7 = z45;
                                                                                                                                                                                                                                                                        c00841.Z$8 = z44;
                                                                                                                                                                                                                                                                        c00841.I$1 = i7;
                                                                                                                                                                                                                                                                        c00841.I$2 = i8;
                                                                                                                                                                                                                                                                        c00841.label = 8;
                                                                                                                                                                                                                                                                        z70Var6 = z70Var;
                                                                                                                                                                                                                                                                        if (BuildersKt.withContext(nonCancellable, locationRepository$startSpoofingInternal$2$3, c00841) == z70Var6) {
                                                                                                                                                                                                                                                                            return z70Var6;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        throw th;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                } catch (Throwable th41) {
                                                                                                                                                                                                                                                                    th = th41;
                                                                                                                                                                                                                                                                    z83 = z74;
                                                                                                                                                                                                                                                                    i20 = i20;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            } catch (Throwable th42) {
                                                                                                                                                                                                                                                                th = th42;
                                                                                                                                                                                                                                                                z78 = z89;
                                                                                                                                                                                                                                                                i18 = i18;
                                                                                                                                                                                                                                                                d19 = d19;
                                                                                                                                                                                                                                                                i20 = i20;
                                                                                                                                                                                                                                                                z76 = z76;
                                                                                                                                                                                                                                                                z83 = z74;
                                                                                                                                                                                                                                                                d18 = d20;
                                                                                                                                                                                                                                                                context9 = context9;
                                                                                                                                                                                                                                                                z70Var5 = z70Var4;
                                                                                                                                                                                                                                                                z70Var = z70Var5;
                                                                                                                                                                                                                                                                z47 = z83;
                                                                                                                                                                                                                                                                z49 = z80;
                                                                                                                                                                                                                                                                d11 = d19;
                                                                                                                                                                                                                                                                z50 = z76;
                                                                                                                                                                                                                                                                i9 = i18;
                                                                                                                                                                                                                                                                z45 = z77;
                                                                                                                                                                                                                                                                context6 = context9;
                                                                                                                                                                                                                                                                mutex3 = mutex6;
                                                                                                                                                                                                                                                                z44 = z78;
                                                                                                                                                                                                                                                                i7 = i19;
                                                                                                                                                                                                                                                                i8 = i20;
                                                                                                                                                                                                                                                                th = th;
                                                                                                                                                                                                                                                                d12 = d18;
                                                                                                                                                                                                                                                                z48 = z82;
                                                                                                                                                                                                                                                                z43 = z75;
                                                                                                                                                                                                                                                                z46 = z79;
                                                                                                                                                                                                                                                                nonCancellable = NonCancellable.INSTANCE;
                                                                                                                                                                                                                                                                locationRepository$startSpoofingInternal$2$3 = new LocationRepository$startSpoofingInternal$2$3(th, locationRepository, context6, null);
                                                                                                                                                                                                                                                                c00841.L$0 = null;
                                                                                                                                                                                                                                                                c00841.L$1 = null;
                                                                                                                                                                                                                                                                c00841.L$2 = null;
                                                                                                                                                                                                                                                                c00841.L$3 = null;
                                                                                                                                                                                                                                                                c00841.L$4 = null;
                                                                                                                                                                                                                                                                c00841.L$5 = null;
                                                                                                                                                                                                                                                                c00841.L$6 = null;
                                                                                                                                                                                                                                                                c00841.L$7 = mutex3;
                                                                                                                                                                                                                                                                c00841.L$8 = th;
                                                                                                                                                                                                                                                                c00841.L$9 = null;
                                                                                                                                                                                                                                                                c00841.D$0 = d12;
                                                                                                                                                                                                                                                                c00841.D$1 = d10;
                                                                                                                                                                                                                                                                c00841.F$0 = f5;
                                                                                                                                                                                                                                                                c00841.J$0 = j6;
                                                                                                                                                                                                                                                                c00841.Z$0 = z51;
                                                                                                                                                                                                                                                                c00841.Z$1 = z47;
                                                                                                                                                                                                                                                                c00841.Z$2 = z48;
                                                                                                                                                                                                                                                                c00841.Z$3 = z43;
                                                                                                                                                                                                                                                                c00841.Z$4 = z49;
                                                                                                                                                                                                                                                                c00841.D$2 = d11;
                                                                                                                                                                                                                                                                c00841.Z$5 = z50;
                                                                                                                                                                                                                                                                c00841.Z$6 = z46;
                                                                                                                                                                                                                                                                c00841.I$0 = i9;
                                                                                                                                                                                                                                                                c00841.Z$7 = z45;
                                                                                                                                                                                                                                                                c00841.Z$8 = z44;
                                                                                                                                                                                                                                                                c00841.I$1 = i7;
                                                                                                                                                                                                                                                                c00841.I$2 = i8;
                                                                                                                                                                                                                                                                c00841.label = 8;
                                                                                                                                                                                                                                                                z70Var6 = z70Var;
                                                                                                                                                                                                                                                                if (BuildersKt.withContext(nonCancellable, locationRepository$startSpoofingInternal$2$3, c00841) == z70Var6) {
                                                                                                                                                                                                                                                                    return z70Var6;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                throw th;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        } catch (Throwable th43) {
                                                                                                                                                                                                                                                            th = th43;
                                                                                                                                                                                                                                                            z77 = z88;
                                                                                                                                                                                                                                                            i18 = i18;
                                                                                                                                                                                                                                                            z78 = z78;
                                                                                                                                                                                                                                                            d19 = d19;
                                                                                                                                                                                                                                                            i20 = i20;
                                                                                                                                                                                                                                                            z76 = z76;
                                                                                                                                                                                                                                                            z83 = z74;
                                                                                                                                                                                                                                                            d18 = d20;
                                                                                                                                                                                                                                                            context9 = context9;
                                                                                                                                                                                                                                                            z70Var5 = z70Var4;
                                                                                                                                                                                                                                                            z70Var = z70Var5;
                                                                                                                                                                                                                                                            z47 = z83;
                                                                                                                                                                                                                                                            z49 = z80;
                                                                                                                                                                                                                                                            d11 = d19;
                                                                                                                                                                                                                                                            z50 = z76;
                                                                                                                                                                                                                                                            i9 = i18;
                                                                                                                                                                                                                                                            z45 = z77;
                                                                                                                                                                                                                                                            context6 = context9;
                                                                                                                                                                                                                                                            mutex3 = mutex6;
                                                                                                                                                                                                                                                            z44 = z78;
                                                                                                                                                                                                                                                            i7 = i19;
                                                                                                                                                                                                                                                            i8 = i20;
                                                                                                                                                                                                                                                            th = th;
                                                                                                                                                                                                                                                            d12 = d18;
                                                                                                                                                                                                                                                            z48 = z82;
                                                                                                                                                                                                                                                            z43 = z75;
                                                                                                                                                                                                                                                            z46 = z79;
                                                                                                                                                                                                                                                            nonCancellable = NonCancellable.INSTANCE;
                                                                                                                                                                                                                                                            locationRepository$startSpoofingInternal$2$3 = new LocationRepository$startSpoofingInternal$2$3(th, locationRepository, context6, null);
                                                                                                                                                                                                                                                            c00841.L$0 = null;
                                                                                                                                                                                                                                                            c00841.L$1 = null;
                                                                                                                                                                                                                                                            c00841.L$2 = null;
                                                                                                                                                                                                                                                            c00841.L$3 = null;
                                                                                                                                                                                                                                                            c00841.L$4 = null;
                                                                                                                                                                                                                                                            c00841.L$5 = null;
                                                                                                                                                                                                                                                            c00841.L$6 = null;
                                                                                                                                                                                                                                                            c00841.L$7 = mutex3;
                                                                                                                                                                                                                                                            c00841.L$8 = th;
                                                                                                                                                                                                                                                            c00841.L$9 = null;
                                                                                                                                                                                                                                                            c00841.D$0 = d12;
                                                                                                                                                                                                                                                            c00841.D$1 = d10;
                                                                                                                                                                                                                                                            c00841.F$0 = f5;
                                                                                                                                                                                                                                                            c00841.J$0 = j6;
                                                                                                                                                                                                                                                            c00841.Z$0 = z51;
                                                                                                                                                                                                                                                            c00841.Z$1 = z47;
                                                                                                                                                                                                                                                            c00841.Z$2 = z48;
                                                                                                                                                                                                                                                            c00841.Z$3 = z43;
                                                                                                                                                                                                                                                            c00841.Z$4 = z49;
                                                                                                                                                                                                                                                            c00841.D$2 = d11;
                                                                                                                                                                                                                                                            c00841.Z$5 = z50;
                                                                                                                                                                                                                                                            c00841.Z$6 = z46;
                                                                                                                                                                                                                                                            c00841.I$0 = i9;
                                                                                                                                                                                                                                                            c00841.Z$7 = z45;
                                                                                                                                                                                                                                                            c00841.Z$8 = z44;
                                                                                                                                                                                                                                                            c00841.I$1 = i7;
                                                                                                                                                                                                                                                            c00841.I$2 = i8;
                                                                                                                                                                                                                                                            c00841.label = 8;
                                                                                                                                                                                                                                                            z70Var6 = z70Var;
                                                                                                                                                                                                                                                            if (BuildersKt.withContext(nonCancellable, locationRepository$startSpoofingInternal$2$3, c00841) == z70Var6) {
                                                                                                                                                                                                                                                                return z70Var6;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            throw th;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    } catch (Throwable th44) {
                                                                                                                                                                                                                                                        th = th44;
                                                                                                                                                                                                                                                        z79 = z87;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                } catch (Throwable th45) {
                                                                                                                                                                                                                                                    th = th45;
                                                                                                                                                                                                                                                    z79 = z87;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            } catch (Throwable th46) {
                                                                                                                                                                                                                                                th = th46;
                                                                                                                                                                                                                                                z76 = z76;
                                                                                                                                                                                                                                                d18 = d20;
                                                                                                                                                                                                                                                z83 = z74;
                                                                                                                                                                                                                                                context9 = context9;
                                                                                                                                                                                                                                                z70Var5 = z70Var4;
                                                                                                                                                                                                                                                z70Var = z70Var5;
                                                                                                                                                                                                                                                z47 = z83;
                                                                                                                                                                                                                                                z49 = z80;
                                                                                                                                                                                                                                                d11 = d19;
                                                                                                                                                                                                                                                z50 = z76;
                                                                                                                                                                                                                                                i9 = i18;
                                                                                                                                                                                                                                                z45 = z77;
                                                                                                                                                                                                                                                context6 = context9;
                                                                                                                                                                                                                                                mutex3 = mutex6;
                                                                                                                                                                                                                                                z44 = z78;
                                                                                                                                                                                                                                                i7 = i19;
                                                                                                                                                                                                                                                i8 = i20;
                                                                                                                                                                                                                                                th = th;
                                                                                                                                                                                                                                                d12 = d18;
                                                                                                                                                                                                                                                z48 = z82;
                                                                                                                                                                                                                                                z43 = z75;
                                                                                                                                                                                                                                                z46 = z79;
                                                                                                                                                                                                                                                nonCancellable = NonCancellable.INSTANCE;
                                                                                                                                                                                                                                                locationRepository$startSpoofingInternal$2$3 = new LocationRepository$startSpoofingInternal$2$3(th, locationRepository, context6, null);
                                                                                                                                                                                                                                                c00841.L$0 = null;
                                                                                                                                                                                                                                                c00841.L$1 = null;
                                                                                                                                                                                                                                                c00841.L$2 = null;
                                                                                                                                                                                                                                                c00841.L$3 = null;
                                                                                                                                                                                                                                                c00841.L$4 = null;
                                                                                                                                                                                                                                                c00841.L$5 = null;
                                                                                                                                                                                                                                                c00841.L$6 = null;
                                                                                                                                                                                                                                                c00841.L$7 = mutex3;
                                                                                                                                                                                                                                                c00841.L$8 = th;
                                                                                                                                                                                                                                                c00841.L$9 = null;
                                                                                                                                                                                                                                                c00841.D$0 = d12;
                                                                                                                                                                                                                                                c00841.D$1 = d10;
                                                                                                                                                                                                                                                c00841.F$0 = f5;
                                                                                                                                                                                                                                                c00841.J$0 = j6;
                                                                                                                                                                                                                                                c00841.Z$0 = z51;
                                                                                                                                                                                                                                                c00841.Z$1 = z47;
                                                                                                                                                                                                                                                c00841.Z$2 = z48;
                                                                                                                                                                                                                                                c00841.Z$3 = z43;
                                                                                                                                                                                                                                                c00841.Z$4 = z49;
                                                                                                                                                                                                                                                c00841.D$2 = d11;
                                                                                                                                                                                                                                                c00841.Z$5 = z50;
                                                                                                                                                                                                                                                c00841.Z$6 = z46;
                                                                                                                                                                                                                                                c00841.I$0 = i9;
                                                                                                                                                                                                                                                c00841.Z$7 = z45;
                                                                                                                                                                                                                                                c00841.Z$8 = z44;
                                                                                                                                                                                                                                                c00841.I$1 = i7;
                                                                                                                                                                                                                                                c00841.I$2 = i8;
                                                                                                                                                                                                                                                c00841.label = 8;
                                                                                                                                                                                                                                                z70Var6 = z70Var;
                                                                                                                                                                                                                                                if (BuildersKt.withContext(nonCancellable, locationRepository$startSpoofingInternal$2$3, c00841) == z70Var6) {
                                                                                                                                                                                                                                                    return z70Var6;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                throw th;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        } catch (Throwable th47) {
                                                                                                                                                                                                                                            th = th47;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    } catch (Throwable th48) {
                                                                                                                                                                                                                                        th = th48;
                                                                                                                                                                                                                                        z80 = z86;
                                                                                                                                                                                                                                        d19 = d17;
                                                                                                                                                                                                                                        z83 = z74;
                                                                                                                                                                                                                                        z70Var5 = z70Var4;
                                                                                                                                                                                                                                        z70Var = z70Var5;
                                                                                                                                                                                                                                        z47 = z83;
                                                                                                                                                                                                                                        z49 = z80;
                                                                                                                                                                                                                                        d11 = d19;
                                                                                                                                                                                                                                        z50 = z76;
                                                                                                                                                                                                                                        i9 = i18;
                                                                                                                                                                                                                                        z45 = z77;
                                                                                                                                                                                                                                        context6 = context9;
                                                                                                                                                                                                                                        mutex3 = mutex6;
                                                                                                                                                                                                                                        z44 = z78;
                                                                                                                                                                                                                                        i7 = i19;
                                                                                                                                                                                                                                        i8 = i20;
                                                                                                                                                                                                                                        th = th;
                                                                                                                                                                                                                                        d12 = d18;
                                                                                                                                                                                                                                        z48 = z82;
                                                                                                                                                                                                                                        z43 = z75;
                                                                                                                                                                                                                                        z46 = z79;
                                                                                                                                                                                                                                        nonCancellable = NonCancellable.INSTANCE;
                                                                                                                                                                                                                                        locationRepository$startSpoofingInternal$2$3 = new LocationRepository$startSpoofingInternal$2$3(th, locationRepository, context6, null);
                                                                                                                                                                                                                                        c00841.L$0 = null;
                                                                                                                                                                                                                                        c00841.L$1 = null;
                                                                                                                                                                                                                                        c00841.L$2 = null;
                                                                                                                                                                                                                                        c00841.L$3 = null;
                                                                                                                                                                                                                                        c00841.L$4 = null;
                                                                                                                                                                                                                                        c00841.L$5 = null;
                                                                                                                                                                                                                                        c00841.L$6 = null;
                                                                                                                                                                                                                                        c00841.L$7 = mutex3;
                                                                                                                                                                                                                                        c00841.L$8 = th;
                                                                                                                                                                                                                                        c00841.L$9 = null;
                                                                                                                                                                                                                                        c00841.D$0 = d12;
                                                                                                                                                                                                                                        c00841.D$1 = d10;
                                                                                                                                                                                                                                        c00841.F$0 = f5;
                                                                                                                                                                                                                                        c00841.J$0 = j6;
                                                                                                                                                                                                                                        c00841.Z$0 = z51;
                                                                                                                                                                                                                                        c00841.Z$1 = z47;
                                                                                                                                                                                                                                        c00841.Z$2 = z48;
                                                                                                                                                                                                                                        c00841.Z$3 = z43;
                                                                                                                                                                                                                                        c00841.Z$4 = z49;
                                                                                                                                                                                                                                        c00841.D$2 = d11;
                                                                                                                                                                                                                                        c00841.Z$5 = z50;
                                                                                                                                                                                                                                        c00841.Z$6 = z46;
                                                                                                                                                                                                                                        c00841.I$0 = i9;
                                                                                                                                                                                                                                        c00841.Z$7 = z45;
                                                                                                                                                                                                                                        c00841.Z$8 = z44;
                                                                                                                                                                                                                                        c00841.I$1 = i7;
                                                                                                                                                                                                                                        c00841.I$2 = i8;
                                                                                                                                                                                                                                        c00841.label = 8;
                                                                                                                                                                                                                                        z70Var6 = z70Var;
                                                                                                                                                                                                                                        if (BuildersKt.withContext(nonCancellable, locationRepository$startSpoofingInternal$2$3, c00841) == z70Var6) {
                                                                                                                                                                                                                                            return z70Var6;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        throw th;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                } catch (Throwable th49) {
                                                                                                                                                                                                                                    th = th49;
                                                                                                                                                                                                                                    z75 = z85;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            } catch (Throwable th50) {
                                                                                                                                                                                                                                th = th50;
                                                                                                                                                                                                                                z82 = z82;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        } catch (Throwable th51) {
                                                                                                                                                                                                                            th = th51;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    } catch (Throwable th52) {
                                                                                                                                                                                                                        th = th52;
                                                                                                                                                                                                                        c00841 = c00841;
                                                                                                                                                                                                                        context9 = context9;
                                                                                                                                                                                                                        mutex6 = mutex6;
                                                                                                                                                                                                                        i19 = i19;
                                                                                                                                                                                                                        z78 = z78;
                                                                                                                                                                                                                        z70Var5 = z70Var4;
                                                                                                                                                                                                                        z83 = z84;
                                                                                                                                                                                                                        i20 = i20;
                                                                                                                                                                                                                        d19 = d17;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                } catch (Throwable th53) {
                                                                                                                                                                                                                    th = th53;
                                                                                                                                                                                                                    context9 = context9;
                                                                                                                                                                                                                    z82 = z81;
                                                                                                                                                                                                                    mutex6 = mutex6;
                                                                                                                                                                                                                    i19 = i19;
                                                                                                                                                                                                                    z78 = z78;
                                                                                                                                                                                                                    i20 = i20;
                                                                                                                                                                                                                    d19 = d17;
                                                                                                                                                                                                                    z83 = z74;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            } catch (Throwable th54) {
                                                                                                                                                                                                                th = th54;
                                                                                                                                                                                                                z82 = z81;
                                                                                                                                                                                                            }
                                                                                                                                                                                                        } catch (Throwable th55) {
                                                                                                                                                                                                            th = th55;
                                                                                                                                                                                                            c00841 = c00841;
                                                                                                                                                                                                            z70Var = z70Var;
                                                                                                                                                                                                            mutex3 = mutex5;
                                                                                                                                                                                                            j6 = j8;
                                                                                                                                                                                                            z47 = z64;
                                                                                                                                                                                                            z48 = z65;
                                                                                                                                                                                                            d11 = d14;
                                                                                                                                                                                                            z50 = z66;
                                                                                                                                                                                                            i9 = i13;
                                                                                                                                                                                                            z45 = z61;
                                                                                                                                                                                                            z44 = z60;
                                                                                                                                                                                                            i7 = i12;
                                                                                                                                                                                                            i8 = i14;
                                                                                                                                                                                                            z46 = z62;
                                                                                                                                                                                                            th = th;
                                                                                                                                                                                                            z51 = z63;
                                                                                                                                                                                                            z49 = z67;
                                                                                                                                                                                                            f5 = f6;
                                                                                                                                                                                                            context6 = context8;
                                                                                                                                                                                                            z43 = z59;
                                                                                                                                                                                                            d10 = d5;
                                                                                                                                                                                                        }
                                                                                                                                                                                                    } catch (Throwable th56) {
                                                                                                                                                                                                        th = th56;
                                                                                                                                                                                                        d5 = d5;
                                                                                                                                                                                                        z70Var = z70Var;
                                                                                                                                                                                                        mutex3 = mutex5;
                                                                                                                                                                                                        j6 = j8;
                                                                                                                                                                                                        z47 = z64;
                                                                                                                                                                                                        z48 = z65;
                                                                                                                                                                                                        d11 = d14;
                                                                                                                                                                                                        z50 = z66;
                                                                                                                                                                                                        i9 = i13;
                                                                                                                                                                                                        z45 = z61;
                                                                                                                                                                                                        z44 = z60;
                                                                                                                                                                                                        i7 = i12;
                                                                                                                                                                                                        i8 = i14;
                                                                                                                                                                                                        z46 = z62;
                                                                                                                                                                                                        th = th;
                                                                                                                                                                                                        z51 = z63;
                                                                                                                                                                                                        z49 = z67;
                                                                                                                                                                                                        f5 = f6;
                                                                                                                                                                                                        context6 = context8;
                                                                                                                                                                                                        z43 = z59;
                                                                                                                                                                                                        d10 = d5;
                                                                                                                                                                                                        nonCancellable = NonCancellable.INSTANCE;
                                                                                                                                                                                                        locationRepository$startSpoofingInternal$2$3 = new LocationRepository$startSpoofingInternal$2$3(th, locationRepository, context6, null);
                                                                                                                                                                                                        c00841.L$0 = null;
                                                                                                                                                                                                        c00841.L$1 = null;
                                                                                                                                                                                                        c00841.L$2 = null;
                                                                                                                                                                                                        c00841.L$3 = null;
                                                                                                                                                                                                        c00841.L$4 = null;
                                                                                                                                                                                                        c00841.L$5 = null;
                                                                                                                                                                                                        c00841.L$6 = null;
                                                                                                                                                                                                        c00841.L$7 = mutex3;
                                                                                                                                                                                                        c00841.L$8 = th;
                                                                                                                                                                                                        c00841.L$9 = null;
                                                                                                                                                                                                        c00841.D$0 = d12;
                                                                                                                                                                                                        c00841.D$1 = d10;
                                                                                                                                                                                                        c00841.F$0 = f5;
                                                                                                                                                                                                        c00841.J$0 = j6;
                                                                                                                                                                                                        c00841.Z$0 = z51;
                                                                                                                                                                                                        c00841.Z$1 = z47;
                                                                                                                                                                                                        c00841.Z$2 = z48;
                                                                                                                                                                                                        c00841.Z$3 = z43;
                                                                                                                                                                                                        c00841.Z$4 = z49;
                                                                                                                                                                                                        c00841.D$2 = d11;
                                                                                                                                                                                                        c00841.Z$5 = z50;
                                                                                                                                                                                                        c00841.Z$6 = z46;
                                                                                                                                                                                                        c00841.I$0 = i9;
                                                                                                                                                                                                        c00841.Z$7 = z45;
                                                                                                                                                                                                        c00841.Z$8 = z44;
                                                                                                                                                                                                        c00841.I$1 = i7;
                                                                                                                                                                                                        c00841.I$2 = i8;
                                                                                                                                                                                                        c00841.label = 8;
                                                                                                                                                                                                        z70Var6 = z70Var;
                                                                                                                                                                                                        if (BuildersKt.withContext(nonCancellable, locationRepository$startSpoofingInternal$2$3, c00841) == z70Var6) {
                                                                                                                                                                                                            return z70Var6;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        throw th;
                                                                                                                                                                                                    }
                                                                                                                                                                                                } catch (Throwable th57) {
                                                                                                                                                                                                    th = th57;
                                                                                                                                                                                                    z62 = z62;
                                                                                                                                                                                                }
                                                                                                                                                                                            } catch (Throwable th58) {
                                                                                                                                                                                                th = th58;
                                                                                                                                                                                                z62 = z62;
                                                                                                                                                                                                d5 = d5;
                                                                                                                                                                                                mutex3 = mutex5;
                                                                                                                                                                                                j6 = j8;
                                                                                                                                                                                                z47 = z64;
                                                                                                                                                                                                z48 = z65;
                                                                                                                                                                                                d11 = d14;
                                                                                                                                                                                                z50 = z66;
                                                                                                                                                                                                i9 = i13;
                                                                                                                                                                                                z45 = z61;
                                                                                                                                                                                                z44 = z60;
                                                                                                                                                                                                i7 = i12;
                                                                                                                                                                                                i8 = i14;
                                                                                                                                                                                                z46 = z62;
                                                                                                                                                                                                th = th;
                                                                                                                                                                                                z51 = z63;
                                                                                                                                                                                                z49 = z67;
                                                                                                                                                                                                f5 = f6;
                                                                                                                                                                                                context6 = context8;
                                                                                                                                                                                                z43 = z59;
                                                                                                                                                                                                d10 = d5;
                                                                                                                                                                                            }
                                                                                                                                                                                        } catch (Throwable th59) {
                                                                                                                                                                                            th = th59;
                                                                                                                                                                                            i14 = i17;
                                                                                                                                                                                        }
                                                                                                                                                                                    } catch (Throwable th60) {
                                                                                                                                                                                        th = th60;
                                                                                                                                                                                        i12 = i16;
                                                                                                                                                                                        i14 = i14;
                                                                                                                                                                                        mutex3 = mutex5;
                                                                                                                                                                                        j6 = j8;
                                                                                                                                                                                        z47 = z64;
                                                                                                                                                                                        z48 = z65;
                                                                                                                                                                                        d11 = d14;
                                                                                                                                                                                        z50 = z66;
                                                                                                                                                                                        i9 = i13;
                                                                                                                                                                                        z45 = z61;
                                                                                                                                                                                        z44 = z60;
                                                                                                                                                                                        i7 = i12;
                                                                                                                                                                                        i8 = i14;
                                                                                                                                                                                        z46 = z62;
                                                                                                                                                                                        th = th;
                                                                                                                                                                                        z51 = z63;
                                                                                                                                                                                        z49 = z67;
                                                                                                                                                                                        f5 = f6;
                                                                                                                                                                                        context6 = context8;
                                                                                                                                                                                        z43 = z59;
                                                                                                                                                                                        d10 = d5;
                                                                                                                                                                                        nonCancellable = NonCancellable.INSTANCE;
                                                                                                                                                                                        locationRepository$startSpoofingInternal$2$3 = new LocationRepository$startSpoofingInternal$2$3(th, locationRepository, context6, null);
                                                                                                                                                                                        c00841.L$0 = null;
                                                                                                                                                                                        c00841.L$1 = null;
                                                                                                                                                                                        c00841.L$2 = null;
                                                                                                                                                                                        c00841.L$3 = null;
                                                                                                                                                                                        c00841.L$4 = null;
                                                                                                                                                                                        c00841.L$5 = null;
                                                                                                                                                                                        c00841.L$6 = null;
                                                                                                                                                                                        c00841.L$7 = mutex3;
                                                                                                                                                                                        c00841.L$8 = th;
                                                                                                                                                                                        c00841.L$9 = null;
                                                                                                                                                                                        c00841.D$0 = d12;
                                                                                                                                                                                        c00841.D$1 = d10;
                                                                                                                                                                                        c00841.F$0 = f5;
                                                                                                                                                                                        c00841.J$0 = j6;
                                                                                                                                                                                        c00841.Z$0 = z51;
                                                                                                                                                                                        c00841.Z$1 = z47;
                                                                                                                                                                                        c00841.Z$2 = z48;
                                                                                                                                                                                        c00841.Z$3 = z43;
                                                                                                                                                                                        c00841.Z$4 = z49;
                                                                                                                                                                                        c00841.D$2 = d11;
                                                                                                                                                                                        c00841.Z$5 = z50;
                                                                                                                                                                                        c00841.Z$6 = z46;
                                                                                                                                                                                        c00841.I$0 = i9;
                                                                                                                                                                                        c00841.Z$7 = z45;
                                                                                                                                                                                        c00841.Z$8 = z44;
                                                                                                                                                                                        c00841.I$1 = i7;
                                                                                                                                                                                        c00841.I$2 = i8;
                                                                                                                                                                                        c00841.label = 8;
                                                                                                                                                                                        z70Var6 = z70Var;
                                                                                                                                                                                        if (BuildersKt.withContext(nonCancellable, locationRepository$startSpoofingInternal$2$3, c00841) == z70Var6) {
                                                                                                                                                                                            return z70Var6;
                                                                                                                                                                                        }
                                                                                                                                                                                        throw th;
                                                                                                                                                                                    }
                                                                                                                                                                                } catch (Throwable th61) {
                                                                                                                                                                                    th = th61;
                                                                                                                                                                                    z60 = z73;
                                                                                                                                                                                    i12 = i12;
                                                                                                                                                                                }
                                                                                                                                                                            } catch (Throwable th62) {
                                                                                                                                                                                th = th62;
                                                                                                                                                                                c00841 = c00841;
                                                                                                                                                                                z61 = z72;
                                                                                                                                                                                z62 = z62;
                                                                                                                                                                                d5 = d5;
                                                                                                                                                                                i12 = i12;
                                                                                                                                                                                i14 = i14;
                                                                                                                                                                                z60 = z60;
                                                                                                                                                                            }
                                                                                                                                                                        } catch (Throwable th63) {
                                                                                                                                                                            th = th63;
                                                                                                                                                                            c00841 = c00841;
                                                                                                                                                                            i13 = i15;
                                                                                                                                                                            z62 = z62;
                                                                                                                                                                            d5 = d5;
                                                                                                                                                                            i12 = i12;
                                                                                                                                                                            i14 = i14;
                                                                                                                                                                            z60 = z60;
                                                                                                                                                                            z61 = z61;
                                                                                                                                                                        }
                                                                                                                                                                    } catch (Throwable th64) {
                                                                                                                                                                        th = th64;
                                                                                                                                                                        c00841 = c00841;
                                                                                                                                                                        z66 = z71;
                                                                                                                                                                        z62 = z62;
                                                                                                                                                                        d5 = d5;
                                                                                                                                                                        i12 = i12;
                                                                                                                                                                        i14 = i14;
                                                                                                                                                                        z60 = z60;
                                                                                                                                                                        z61 = z61;
                                                                                                                                                                        i13 = i13;
                                                                                                                                                                    }
                                                                                                                                                                } catch (Throwable th65) {
                                                                                                                                                                    th = th65;
                                                                                                                                                                    c00841 = c00841;
                                                                                                                                                                    z66 = z71;
                                                                                                                                                                    d5 = d5;
                                                                                                                                                                    i12 = i12;
                                                                                                                                                                    i14 = i14;
                                                                                                                                                                    z60 = z60;
                                                                                                                                                                    z61 = z61;
                                                                                                                                                                    i13 = i13;
                                                                                                                                                                    z62 = z62;
                                                                                                                                                                }
                                                                                                                                                            } catch (Throwable th66) {
                                                                                                                                                                th = th66;
                                                                                                                                                                c00841 = c00841;
                                                                                                                                                                d14 = d16;
                                                                                                                                                                d5 = d5;
                                                                                                                                                                i12 = i12;
                                                                                                                                                                i14 = i14;
                                                                                                                                                                z60 = z60;
                                                                                                                                                                z61 = z61;
                                                                                                                                                                i13 = i13;
                                                                                                                                                                z62 = z62;
                                                                                                                                                                z66 = z66;
                                                                                                                                                            }
                                                                                                                                                        } catch (Throwable th67) {
                                                                                                                                                            th = th67;
                                                                                                                                                            z59 = z70;
                                                                                                                                                            mutex3 = mutex5;
                                                                                                                                                            j6 = j8;
                                                                                                                                                            z47 = z64;
                                                                                                                                                            d11 = d14;
                                                                                                                                                            z50 = z66;
                                                                                                                                                            i9 = i13;
                                                                                                                                                            z45 = z61;
                                                                                                                                                            z44 = z60;
                                                                                                                                                            i7 = i12;
                                                                                                                                                            i8 = i14;
                                                                                                                                                            z46 = z62;
                                                                                                                                                            th = th;
                                                                                                                                                            z51 = z63;
                                                                                                                                                            z49 = z67;
                                                                                                                                                            f5 = f6;
                                                                                                                                                            context6 = context8;
                                                                                                                                                            z43 = z59;
                                                                                                                                                            d10 = d5;
                                                                                                                                                        }
                                                                                                                                                    } catch (Throwable th68) {
                                                                                                                                                        th = th68;
                                                                                                                                                        z64 = z69;
                                                                                                                                                        z59 = z59;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th69) {
                                                                                                                                                    th = th69;
                                                                                                                                                    z64 = z69;
                                                                                                                                                    i12 = i12;
                                                                                                                                                    i14 = i14;
                                                                                                                                                    z60 = z60;
                                                                                                                                                    z61 = z61;
                                                                                                                                                    i13 = i13;
                                                                                                                                                    z62 = z62;
                                                                                                                                                    z65 = z65;
                                                                                                                                                    z66 = z66;
                                                                                                                                                    d14 = d14;
                                                                                                                                                    z59 = z59;
                                                                                                                                                    mutex3 = mutex5;
                                                                                                                                                    j6 = j8;
                                                                                                                                                    z47 = z64;
                                                                                                                                                    z48 = z65;
                                                                                                                                                    d11 = d14;
                                                                                                                                                    z50 = z66;
                                                                                                                                                    i9 = i13;
                                                                                                                                                    z45 = z61;
                                                                                                                                                    z44 = z60;
                                                                                                                                                    i7 = i12;
                                                                                                                                                    i8 = i14;
                                                                                                                                                    z46 = z62;
                                                                                                                                                    th = th;
                                                                                                                                                    z51 = z63;
                                                                                                                                                    z49 = z67;
                                                                                                                                                    f5 = f6;
                                                                                                                                                    context6 = context8;
                                                                                                                                                    z43 = z59;
                                                                                                                                                    d10 = d5;
                                                                                                                                                    nonCancellable = NonCancellable.INSTANCE;
                                                                                                                                                    locationRepository$startSpoofingInternal$2$3 = new LocationRepository$startSpoofingInternal$2$3(th, locationRepository, context6, null);
                                                                                                                                                    c00841.L$0 = null;
                                                                                                                                                    c00841.L$1 = null;
                                                                                                                                                    c00841.L$2 = null;
                                                                                                                                                    c00841.L$3 = null;
                                                                                                                                                    c00841.L$4 = null;
                                                                                                                                                    c00841.L$5 = null;
                                                                                                                                                    c00841.L$6 = null;
                                                                                                                                                    c00841.L$7 = mutex3;
                                                                                                                                                    c00841.L$8 = th;
                                                                                                                                                    c00841.L$9 = null;
                                                                                                                                                    c00841.D$0 = d12;
                                                                                                                                                    c00841.D$1 = d10;
                                                                                                                                                    c00841.F$0 = f5;
                                                                                                                                                    c00841.J$0 = j6;
                                                                                                                                                    c00841.Z$0 = z51;
                                                                                                                                                    c00841.Z$1 = z47;
                                                                                                                                                    c00841.Z$2 = z48;
                                                                                                                                                    c00841.Z$3 = z43;
                                                                                                                                                    c00841.Z$4 = z49;
                                                                                                                                                    c00841.D$2 = d11;
                                                                                                                                                    c00841.Z$5 = z50;
                                                                                                                                                    c00841.Z$6 = z46;
                                                                                                                                                    c00841.I$0 = i9;
                                                                                                                                                    c00841.Z$7 = z45;
                                                                                                                                                    c00841.Z$8 = z44;
                                                                                                                                                    c00841.I$1 = i7;
                                                                                                                                                    c00841.I$2 = i8;
                                                                                                                                                    c00841.label = 8;
                                                                                                                                                    z70Var6 = z70Var;
                                                                                                                                                    if (BuildersKt.withContext(nonCancellable, locationRepository$startSpoofingInternal$2$3, c00841) == z70Var6) {
                                                                                                                                                        return z70Var6;
                                                                                                                                                    }
                                                                                                                                                    throw th;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th70) {
                                                                                                                                                th = th70;
                                                                                                                                                j8 = j8;
                                                                                                                                                z64 = z64;
                                                                                                                                            }
                                                                                                                                        } catch (Throwable th71) {
                                                                                                                                            th = th71;
                                                                                                                                            z64 = z64;
                                                                                                                                            i12 = i12;
                                                                                                                                            i14 = i14;
                                                                                                                                            z60 = z60;
                                                                                                                                            z61 = z61;
                                                                                                                                            i13 = i13;
                                                                                                                                            z62 = z62;
                                                                                                                                            z65 = z65;
                                                                                                                                            z66 = z66;
                                                                                                                                            d14 = d14;
                                                                                                                                            z59 = z59;
                                                                                                                                            j8 = j8;
                                                                                                                                            mutex3 = mutex5;
                                                                                                                                            j6 = j8;
                                                                                                                                            z47 = z64;
                                                                                                                                            z48 = z65;
                                                                                                                                            d11 = d14;
                                                                                                                                            z50 = z66;
                                                                                                                                            i9 = i13;
                                                                                                                                            z45 = z61;
                                                                                                                                            z44 = z60;
                                                                                                                                            i7 = i12;
                                                                                                                                            i8 = i14;
                                                                                                                                            z46 = z62;
                                                                                                                                            th = th;
                                                                                                                                            z51 = z63;
                                                                                                                                            z49 = z67;
                                                                                                                                            f5 = f6;
                                                                                                                                            context6 = context8;
                                                                                                                                            z43 = z59;
                                                                                                                                            d10 = d5;
                                                                                                                                            nonCancellable = NonCancellable.INSTANCE;
                                                                                                                                            locationRepository$startSpoofingInternal$2$3 = new LocationRepository$startSpoofingInternal$2$3(th, locationRepository, context6, null);
                                                                                                                                            c00841.L$0 = null;
                                                                                                                                            c00841.L$1 = null;
                                                                                                                                            c00841.L$2 = null;
                                                                                                                                            c00841.L$3 = null;
                                                                                                                                            c00841.L$4 = null;
                                                                                                                                            c00841.L$5 = null;
                                                                                                                                            c00841.L$6 = null;
                                                                                                                                            c00841.L$7 = mutex3;
                                                                                                                                            c00841.L$8 = th;
                                                                                                                                            c00841.L$9 = null;
                                                                                                                                            c00841.D$0 = d12;
                                                                                                                                            c00841.D$1 = d10;
                                                                                                                                            c00841.F$0 = f5;
                                                                                                                                            c00841.J$0 = j6;
                                                                                                                                            c00841.Z$0 = z51;
                                                                                                                                            c00841.Z$1 = z47;
                                                                                                                                            c00841.Z$2 = z48;
                                                                                                                                            c00841.Z$3 = z43;
                                                                                                                                            c00841.Z$4 = z49;
                                                                                                                                            c00841.D$2 = d11;
                                                                                                                                            c00841.Z$5 = z50;
                                                                                                                                            c00841.Z$6 = z46;
                                                                                                                                            c00841.I$0 = i9;
                                                                                                                                            c00841.Z$7 = z45;
                                                                                                                                            c00841.Z$8 = z44;
                                                                                                                                            c00841.I$1 = i7;
                                                                                                                                            c00841.I$2 = i8;
                                                                                                                                            c00841.label = 8;
                                                                                                                                            z70Var6 = z70Var;
                                                                                                                                            if (BuildersKt.withContext(nonCancellable, locationRepository$startSpoofingInternal$2$3, c00841) == z70Var6) {
                                                                                                                                                return z70Var6;
                                                                                                                                            }
                                                                                                                                            throw th;
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th72) {
                                                                                                                                        th = th72;
                                                                                                                                        d12 = d15;
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                } catch (Throwable th73) {
                                                                                                                                    th = th73;
                                                                                                                                    c00841 = c00841;
                                                                                                                                    context8 = context8;
                                                                                                                                    d5 = d5;
                                                                                                                                    d12 = d15;
                                                                                                                                    mutex5 = mutex4;
                                                                                                                                    j8 = j8;
                                                                                                                                    mutex3 = mutex5;
                                                                                                                                    j6 = j8;
                                                                                                                                    z47 = z64;
                                                                                                                                    z48 = z65;
                                                                                                                                    d11 = d14;
                                                                                                                                    z50 = z66;
                                                                                                                                    i9 = i13;
                                                                                                                                    z45 = z61;
                                                                                                                                    z44 = z60;
                                                                                                                                    i7 = i12;
                                                                                                                                    i8 = i14;
                                                                                                                                    z46 = z62;
                                                                                                                                    th = th;
                                                                                                                                    z51 = z63;
                                                                                                                                    z49 = z67;
                                                                                                                                    f5 = f6;
                                                                                                                                    context6 = context8;
                                                                                                                                    z43 = z59;
                                                                                                                                    d10 = d5;
                                                                                                                                    nonCancellable = NonCancellable.INSTANCE;
                                                                                                                                    locationRepository$startSpoofingInternal$2$3 = new LocationRepository$startSpoofingInternal$2$3(th, locationRepository, context6, null);
                                                                                                                                    c00841.L$0 = null;
                                                                                                                                    c00841.L$1 = null;
                                                                                                                                    c00841.L$2 = null;
                                                                                                                                    c00841.L$3 = null;
                                                                                                                                    c00841.L$4 = null;
                                                                                                                                    c00841.L$5 = null;
                                                                                                                                    c00841.L$6 = null;
                                                                                                                                    c00841.L$7 = mutex3;
                                                                                                                                    c00841.L$8 = th;
                                                                                                                                    c00841.L$9 = null;
                                                                                                                                    c00841.D$0 = d12;
                                                                                                                                    c00841.D$1 = d10;
                                                                                                                                    c00841.F$0 = f5;
                                                                                                                                    c00841.J$0 = j6;
                                                                                                                                    c00841.Z$0 = z51;
                                                                                                                                    c00841.Z$1 = z47;
                                                                                                                                    c00841.Z$2 = z48;
                                                                                                                                    c00841.Z$3 = z43;
                                                                                                                                    c00841.Z$4 = z49;
                                                                                                                                    c00841.D$2 = d11;
                                                                                                                                    c00841.Z$5 = z50;
                                                                                                                                    c00841.Z$6 = z46;
                                                                                                                                    c00841.I$0 = i9;
                                                                                                                                    c00841.Z$7 = z45;
                                                                                                                                    c00841.Z$8 = z44;
                                                                                                                                    c00841.I$1 = i7;
                                                                                                                                    c00841.I$2 = i8;
                                                                                                                                    c00841.label = 8;
                                                                                                                                    z70Var6 = z70Var;
                                                                                                                                    if (BuildersKt.withContext(nonCancellable, locationRepository$startSpoofingInternal$2$3, c00841) == z70Var6) {
                                                                                                                                        return z70Var6;
                                                                                                                                    }
                                                                                                                                    throw th;
                                                                                                                                }
                                                                                                                            } catch (Throwable th74) {
                                                                                                                                th = th74;
                                                                                                                                j6 = j8;
                                                                                                                                z51 = z63;
                                                                                                                                d10 = d5;
                                                                                                                                c00841 = c00841;
                                                                                                                                d12 = d15;
                                                                                                                                z47 = z64;
                                                                                                                                i7 = i12;
                                                                                                                                i8 = i14;
                                                                                                                                z44 = z60;
                                                                                                                                z45 = z61;
                                                                                                                                i9 = i13;
                                                                                                                                z46 = z62;
                                                                                                                                z48 = z65;
                                                                                                                                z50 = z66;
                                                                                                                                d11 = d14;
                                                                                                                                z43 = z59;
                                                                                                                                mutex3 = mutex4;
                                                                                                                                z49 = z67;
                                                                                                                                f5 = f6;
                                                                                                                                context6 = context8;
                                                                                                                            }
                                                                                                                        } catch (Throwable th75) {
                                                                                                                            th = th75;
                                                                                                                            d12 = d15;
                                                                                                                            context8 = context8;
                                                                                                                            mutex5 = mutex4;
                                                                                                                            j8 = j8;
                                                                                                                            mutex3 = mutex5;
                                                                                                                            j6 = j8;
                                                                                                                            z47 = z64;
                                                                                                                            z48 = z65;
                                                                                                                            d11 = d14;
                                                                                                                            z50 = z66;
                                                                                                                            i9 = i13;
                                                                                                                            z45 = z61;
                                                                                                                            z44 = z60;
                                                                                                                            i7 = i12;
                                                                                                                            i8 = i14;
                                                                                                                            z46 = z62;
                                                                                                                            th = th;
                                                                                                                            z51 = z63;
                                                                                                                            z49 = z67;
                                                                                                                            f5 = f6;
                                                                                                                            context6 = context8;
                                                                                                                            z43 = z59;
                                                                                                                            d10 = d5;
                                                                                                                            nonCancellable = NonCancellable.INSTANCE;
                                                                                                                            locationRepository$startSpoofingInternal$2$3 = new LocationRepository$startSpoofingInternal$2$3(th, locationRepository, context6, null);
                                                                                                                            c00841.L$0 = null;
                                                                                                                            c00841.L$1 = null;
                                                                                                                            c00841.L$2 = null;
                                                                                                                            c00841.L$3 = null;
                                                                                                                            c00841.L$4 = null;
                                                                                                                            c00841.L$5 = null;
                                                                                                                            c00841.L$6 = null;
                                                                                                                            c00841.L$7 = mutex3;
                                                                                                                            c00841.L$8 = th;
                                                                                                                            c00841.L$9 = null;
                                                                                                                            c00841.D$0 = d12;
                                                                                                                            c00841.D$1 = d10;
                                                                                                                            c00841.F$0 = f5;
                                                                                                                            c00841.J$0 = j6;
                                                                                                                            c00841.Z$0 = z51;
                                                                                                                            c00841.Z$1 = z47;
                                                                                                                            c00841.Z$2 = z48;
                                                                                                                            c00841.Z$3 = z43;
                                                                                                                            c00841.Z$4 = z49;
                                                                                                                            c00841.D$2 = d11;
                                                                                                                            c00841.Z$5 = z50;
                                                                                                                            c00841.Z$6 = z46;
                                                                                                                            c00841.I$0 = i9;
                                                                                                                            c00841.Z$7 = z45;
                                                                                                                            c00841.Z$8 = z44;
                                                                                                                            c00841.I$1 = i7;
                                                                                                                            c00841.I$2 = i8;
                                                                                                                            c00841.label = 8;
                                                                                                                            z70Var6 = z70Var;
                                                                                                                            if (BuildersKt.withContext(nonCancellable, locationRepository$startSpoofingInternal$2$3, c00841) == z70Var6) {
                                                                                                                                return z70Var6;
                                                                                                                            }
                                                                                                                            throw th;
                                                                                                                        }
                                                                                                                    } catch (Throwable th76) {
                                                                                                                        th = th76;
                                                                                                                        d12 = d15;
                                                                                                                        d5 = d5;
                                                                                                                        c00841 = c00841;
                                                                                                                        z64 = z64;
                                                                                                                        i12 = i12;
                                                                                                                        i14 = i14;
                                                                                                                        z60 = z60;
                                                                                                                        z61 = z61;
                                                                                                                        i13 = i13;
                                                                                                                        z62 = z62;
                                                                                                                        z65 = z65;
                                                                                                                        z66 = z66;
                                                                                                                        d14 = d14;
                                                                                                                        z59 = z59;
                                                                                                                        context8 = context8;
                                                                                                                        mutex5 = mutex4;
                                                                                                                        j8 = j8;
                                                                                                                        z70Var = z70Var;
                                                                                                                        mutex3 = mutex5;
                                                                                                                        j6 = j8;
                                                                                                                        z47 = z64;
                                                                                                                        z48 = z65;
                                                                                                                        d11 = d14;
                                                                                                                        z50 = z66;
                                                                                                                        i9 = i13;
                                                                                                                        z45 = z61;
                                                                                                                        z44 = z60;
                                                                                                                        i7 = i12;
                                                                                                                        i8 = i14;
                                                                                                                        z46 = z62;
                                                                                                                        th = th;
                                                                                                                        z51 = z63;
                                                                                                                        z49 = z67;
                                                                                                                        f5 = f6;
                                                                                                                        context6 = context8;
                                                                                                                        z43 = z59;
                                                                                                                        d10 = d5;
                                                                                                                        nonCancellable = NonCancellable.INSTANCE;
                                                                                                                        locationRepository$startSpoofingInternal$2$3 = new LocationRepository$startSpoofingInternal$2$3(th, locationRepository, context6, null);
                                                                                                                        c00841.L$0 = null;
                                                                                                                        c00841.L$1 = null;
                                                                                                                        c00841.L$2 = null;
                                                                                                                        c00841.L$3 = null;
                                                                                                                        c00841.L$4 = null;
                                                                                                                        c00841.L$5 = null;
                                                                                                                        c00841.L$6 = null;
                                                                                                                        c00841.L$7 = mutex3;
                                                                                                                        c00841.L$8 = th;
                                                                                                                        c00841.L$9 = null;
                                                                                                                        c00841.D$0 = d12;
                                                                                                                        c00841.D$1 = d10;
                                                                                                                        c00841.F$0 = f5;
                                                                                                                        c00841.J$0 = j6;
                                                                                                                        c00841.Z$0 = z51;
                                                                                                                        c00841.Z$1 = z47;
                                                                                                                        c00841.Z$2 = z48;
                                                                                                                        c00841.Z$3 = z43;
                                                                                                                        c00841.Z$4 = z49;
                                                                                                                        c00841.D$2 = d11;
                                                                                                                        c00841.Z$5 = z50;
                                                                                                                        c00841.Z$6 = z46;
                                                                                                                        c00841.I$0 = i9;
                                                                                                                        c00841.Z$7 = z45;
                                                                                                                        c00841.Z$8 = z44;
                                                                                                                        c00841.I$1 = i7;
                                                                                                                        c00841.I$2 = i8;
                                                                                                                        c00841.label = 8;
                                                                                                                        z70Var6 = z70Var;
                                                                                                                        if (BuildersKt.withContext(nonCancellable, locationRepository$startSpoofingInternal$2$3, c00841) == z70Var6) {
                                                                                                                            return z70Var6;
                                                                                                                        }
                                                                                                                        throw th;
                                                                                                                    }
                                                                                                                } catch (Throwable th77) {
                                                                                                                    th = th77;
                                                                                                                    d12 = d4;
                                                                                                                }
                                                                                                            } catch (Throwable th78) {
                                                                                                                th = th78;
                                                                                                                d12 = d4;
                                                                                                            }
                                                                                                        } catch (Throwable th79) {
                                                                                                            th = th79;
                                                                                                            d12 = d4;
                                                                                                        }
                                                                                                    } catch (Throwable th80) {
                                                                                                        th = th80;
                                                                                                        j8 = j8;
                                                                                                        d5 = d5;
                                                                                                        c00841 = c00841;
                                                                                                        z64 = z64;
                                                                                                        i12 = i12;
                                                                                                        i14 = i14;
                                                                                                        z60 = z60;
                                                                                                        z61 = z61;
                                                                                                        i13 = i13;
                                                                                                        z62 = z62;
                                                                                                        z65 = z65;
                                                                                                        z66 = z66;
                                                                                                        d14 = d14;
                                                                                                        z59 = z59;
                                                                                                        context8 = context8;
                                                                                                        d12 = d4;
                                                                                                        mutex5 = mutex4;
                                                                                                    }
                                                                                                } catch (Throwable th81) {
                                                                                                    th = th81;
                                                                                                    c00841 = c00841;
                                                                                                    d12 = d4;
                                                                                                    mutex5 = mutex4;
                                                                                                    mutex3 = mutex5;
                                                                                                    j6 = j8;
                                                                                                    z47 = z64;
                                                                                                    z48 = z65;
                                                                                                    d11 = d14;
                                                                                                    z50 = z66;
                                                                                                    i9 = i13;
                                                                                                    z45 = z61;
                                                                                                    z44 = z60;
                                                                                                    i7 = i12;
                                                                                                    i8 = i14;
                                                                                                    z46 = z62;
                                                                                                    th = th;
                                                                                                    z51 = z63;
                                                                                                    z49 = z67;
                                                                                                    f5 = f6;
                                                                                                    context6 = context8;
                                                                                                    z43 = z59;
                                                                                                    d10 = d5;
                                                                                                    nonCancellable = NonCancellable.INSTANCE;
                                                                                                    locationRepository$startSpoofingInternal$2$3 = new LocationRepository$startSpoofingInternal$2$3(th, locationRepository, context6, null);
                                                                                                    c00841.L$0 = null;
                                                                                                    c00841.L$1 = null;
                                                                                                    c00841.L$2 = null;
                                                                                                    c00841.L$3 = null;
                                                                                                    c00841.L$4 = null;
                                                                                                    c00841.L$5 = null;
                                                                                                    c00841.L$6 = null;
                                                                                                    c00841.L$7 = mutex3;
                                                                                                    c00841.L$8 = th;
                                                                                                    c00841.L$9 = null;
                                                                                                    c00841.D$0 = d12;
                                                                                                    c00841.D$1 = d10;
                                                                                                    c00841.F$0 = f5;
                                                                                                    c00841.J$0 = j6;
                                                                                                    c00841.Z$0 = z51;
                                                                                                    c00841.Z$1 = z47;
                                                                                                    c00841.Z$2 = z48;
                                                                                                    c00841.Z$3 = z43;
                                                                                                    c00841.Z$4 = z49;
                                                                                                    c00841.D$2 = d11;
                                                                                                    c00841.Z$5 = z50;
                                                                                                    c00841.Z$6 = z46;
                                                                                                    c00841.I$0 = i9;
                                                                                                    c00841.Z$7 = z45;
                                                                                                    c00841.Z$8 = z44;
                                                                                                    c00841.I$1 = i7;
                                                                                                    c00841.I$2 = i8;
                                                                                                    c00841.label = 8;
                                                                                                    z70Var6 = z70Var;
                                                                                                    if (BuildersKt.withContext(nonCancellable, locationRepository$startSpoofingInternal$2$3, c00841) == z70Var6) {
                                                                                                        return z70Var6;
                                                                                                    }
                                                                                                    throw th;
                                                                                                }
                                                                                            } catch (Throwable th82) {
                                                                                                th = th82;
                                                                                                locationRepository = this;
                                                                                            }
                                                                                        } catch (Throwable th83) {
                                                                                            th = th83;
                                                                                            c00841 = c00841;
                                                                                            locationRepository = this;
                                                                                        }
                                                                                        mutex3.unlock(obj2);
                                                                                        throw th;
                                                                                    } catch (Throwable th84) {
                                                                                        th = th84;
                                                                                        c00841 = c00841;
                                                                                        i6 = i11;
                                                                                        locationRepository = this;
                                                                                        z43 = z36;
                                                                                        z44 = z42;
                                                                                        i7 = i5;
                                                                                        i8 = i6;
                                                                                        mutex3 = mutex2;
                                                                                        d10 = d5;
                                                                                        z45 = z35;
                                                                                        i9 = i4;
                                                                                        z46 = z34;
                                                                                        f5 = f4;
                                                                                        context6 = context5;
                                                                                        z47 = z37;
                                                                                        z48 = z39;
                                                                                        z49 = z41;
                                                                                        z50 = z40;
                                                                                        d11 = d9;
                                                                                        th = th;
                                                                                        d12 = d4;
                                                                                        z51 = z38;
                                                                                        j6 = j5;
                                                                                    }
                                                                                    c00841.I$1 = i5;
                                                                                    i11 = 0;
                                                                                } catch (Throwable th85) {
                                                                                    th = th85;
                                                                                    i6 = 0;
                                                                                    locationRepository = this;
                                                                                    z43 = z36;
                                                                                    z44 = z42;
                                                                                    i7 = i5;
                                                                                    i8 = i6;
                                                                                    mutex3 = mutex2;
                                                                                    d10 = d5;
                                                                                    z45 = z35;
                                                                                    i9 = i4;
                                                                                    z46 = z34;
                                                                                    f5 = f4;
                                                                                    context6 = context5;
                                                                                    z47 = z37;
                                                                                    z48 = z39;
                                                                                    z49 = z41;
                                                                                    z50 = z40;
                                                                                    d11 = d9;
                                                                                    th = th;
                                                                                    d12 = d4;
                                                                                    z51 = z38;
                                                                                    j6 = j5;
                                                                                    nonCancellable = NonCancellable.INSTANCE;
                                                                                    locationRepository$startSpoofingInternal$2$3 = new LocationRepository$startSpoofingInternal$2$3(th, locationRepository, context6, null);
                                                                                    c00841.L$0 = null;
                                                                                    c00841.L$1 = null;
                                                                                    c00841.L$2 = null;
                                                                                    c00841.L$3 = null;
                                                                                    c00841.L$4 = null;
                                                                                    c00841.L$5 = null;
                                                                                    c00841.L$6 = null;
                                                                                    c00841.L$7 = mutex3;
                                                                                    c00841.L$8 = th;
                                                                                    c00841.L$9 = null;
                                                                                    c00841.D$0 = d12;
                                                                                    c00841.D$1 = d10;
                                                                                    c00841.F$0 = f5;
                                                                                    c00841.J$0 = j6;
                                                                                    c00841.Z$0 = z51;
                                                                                    c00841.Z$1 = z47;
                                                                                    c00841.Z$2 = z48;
                                                                                    c00841.Z$3 = z43;
                                                                                    c00841.Z$4 = z49;
                                                                                    c00841.D$2 = d11;
                                                                                    c00841.Z$5 = z50;
                                                                                    c00841.Z$6 = z46;
                                                                                    c00841.I$0 = i9;
                                                                                    c00841.Z$7 = z45;
                                                                                    c00841.Z$8 = z44;
                                                                                    c00841.I$1 = i7;
                                                                                    c00841.I$2 = i8;
                                                                                    c00841.label = 8;
                                                                                    z70Var6 = z70Var;
                                                                                    if (BuildersKt.withContext(nonCancellable, locationRepository$startSpoofingInternal$2$3, c00841) == z70Var6) {
                                                                                        return z70Var6;
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                                c00841.Z$8 = z42;
                                                                                d9 = d13;
                                                                                i5 = i5;
                                                                            } catch (Throwable th86) {
                                                                                th = th86;
                                                                                d9 = d13;
                                                                                i5 = i5;
                                                                            }
                                                                            c00841.Z$7 = z58;
                                                                            z35 = z58;
                                                                            z42 = z27;
                                                                        } catch (Throwable th87) {
                                                                            th = th87;
                                                                            z35 = z58;
                                                                            c00841 = c00841;
                                                                            d9 = d13;
                                                                            i6 = 0;
                                                                            locationRepository = this;
                                                                            z42 = z27;
                                                                            z43 = z36;
                                                                            z44 = z42;
                                                                            i7 = i5;
                                                                            i8 = i6;
                                                                            mutex3 = mutex2;
                                                                            d10 = d5;
                                                                            z45 = z35;
                                                                            i9 = i4;
                                                                            z46 = z34;
                                                                            f5 = f4;
                                                                            context6 = context5;
                                                                            z47 = z37;
                                                                            z48 = z39;
                                                                            z49 = z41;
                                                                            z50 = z40;
                                                                            d11 = d9;
                                                                            th = th;
                                                                            d12 = d4;
                                                                            z51 = z38;
                                                                            j6 = j5;
                                                                            nonCancellable = NonCancellable.INSTANCE;
                                                                            locationRepository$startSpoofingInternal$2$3 = new LocationRepository$startSpoofingInternal$2$3(th, locationRepository, context6, null);
                                                                            c00841.L$0 = null;
                                                                            c00841.L$1 = null;
                                                                            c00841.L$2 = null;
                                                                            c00841.L$3 = null;
                                                                            c00841.L$4 = null;
                                                                            c00841.L$5 = null;
                                                                            c00841.L$6 = null;
                                                                            c00841.L$7 = mutex3;
                                                                            c00841.L$8 = th;
                                                                            c00841.L$9 = null;
                                                                            c00841.D$0 = d12;
                                                                            c00841.D$1 = d10;
                                                                            c00841.F$0 = f5;
                                                                            c00841.J$0 = j6;
                                                                            c00841.Z$0 = z51;
                                                                            c00841.Z$1 = z47;
                                                                            c00841.Z$2 = z48;
                                                                            c00841.Z$3 = z43;
                                                                            c00841.Z$4 = z49;
                                                                            c00841.D$2 = d11;
                                                                            c00841.Z$5 = z50;
                                                                            c00841.Z$6 = z46;
                                                                            c00841.I$0 = i9;
                                                                            c00841.Z$7 = z45;
                                                                            c00841.Z$8 = z44;
                                                                            c00841.I$1 = i7;
                                                                            c00841.I$2 = i8;
                                                                            c00841.label = 8;
                                                                            z70Var6 = z70Var;
                                                                            if (BuildersKt.withContext(nonCancellable, locationRepository$startSpoofingInternal$2$3, c00841) == z70Var6) {
                                                                                return z70Var6;
                                                                            }
                                                                            throw th;
                                                                        }
                                                                        c00841.I$0 = i10;
                                                                        i4 = i10;
                                                                        z58 = z35;
                                                                    } catch (Throwable th88) {
                                                                        th = th88;
                                                                        i4 = i10;
                                                                    }
                                                                    c00841.Z$6 = z57;
                                                                    z34 = z57;
                                                                    i10 = i4;
                                                                } catch (Throwable th89) {
                                                                    th = th89;
                                                                    z34 = z57;
                                                                }
                                                                c00841.Z$5 = z56;
                                                                z40 = z56;
                                                                z57 = z34;
                                                            } catch (Throwable th90) {
                                                                th = th90;
                                                                z40 = z56;
                                                            }
                                                            c00841.D$2 = d13;
                                                            z41 = z55;
                                                            z56 = z33;
                                                        } catch (Throwable th91) {
                                                            th = th91;
                                                            z41 = z55;
                                                            c00841 = c00841;
                                                            d9 = d13;
                                                            z40 = z33;
                                                        }
                                                        c00841.Z$4 = z55;
                                                        j5 = j7;
                                                        d13 = d8;
                                                    } catch (Throwable th92) {
                                                        th = th92;
                                                        z41 = z55;
                                                        c00841 = c00841;
                                                        j5 = j7;
                                                        z40 = z33;
                                                        d9 = d8;
                                                    }
                                                    c00841.Z$3 = z36;
                                                    z36 = z36;
                                                    z55 = z32;
                                                } catch (Throwable th93) {
                                                    th = th93;
                                                    z36 = z36;
                                                    j5 = j7;
                                                    z40 = z33;
                                                    d9 = d8;
                                                    z41 = z32;
                                                    i6 = 0;
                                                    locationRepository = this;
                                                    z42 = z27;
                                                    z43 = z36;
                                                    z44 = z42;
                                                    i7 = i5;
                                                    i8 = i6;
                                                    mutex3 = mutex2;
                                                    d10 = d5;
                                                    z45 = z35;
                                                    i9 = i4;
                                                    z46 = z34;
                                                    f5 = f4;
                                                    context6 = context5;
                                                    z47 = z37;
                                                    z48 = z39;
                                                    z49 = z41;
                                                    z50 = z40;
                                                    d11 = d9;
                                                    th = th;
                                                    d12 = d4;
                                                    z51 = z38;
                                                    j6 = j5;
                                                    nonCancellable = NonCancellable.INSTANCE;
                                                    locationRepository$startSpoofingInternal$2$3 = new LocationRepository$startSpoofingInternal$2$3(th, locationRepository, context6, null);
                                                    c00841.L$0 = null;
                                                    c00841.L$1 = null;
                                                    c00841.L$2 = null;
                                                    c00841.L$3 = null;
                                                    c00841.L$4 = null;
                                                    c00841.L$5 = null;
                                                    c00841.L$6 = null;
                                                    c00841.L$7 = mutex3;
                                                    c00841.L$8 = th;
                                                    c00841.L$9 = null;
                                                    c00841.D$0 = d12;
                                                    c00841.D$1 = d10;
                                                    c00841.F$0 = f5;
                                                    c00841.J$0 = j6;
                                                    c00841.Z$0 = z51;
                                                    c00841.Z$1 = z47;
                                                    c00841.Z$2 = z48;
                                                    c00841.Z$3 = z43;
                                                    c00841.Z$4 = z49;
                                                    c00841.D$2 = d11;
                                                    c00841.Z$5 = z50;
                                                    c00841.Z$6 = z46;
                                                    c00841.I$0 = i9;
                                                    c00841.Z$7 = z45;
                                                    c00841.Z$8 = z44;
                                                    c00841.I$1 = i7;
                                                    c00841.I$2 = i8;
                                                    c00841.label = 8;
                                                    z70Var6 = z70Var;
                                                    if (BuildersKt.withContext(nonCancellable, locationRepository$startSpoofingInternal$2$3, c00841) == z70Var6) {
                                                        return z70Var6;
                                                    }
                                                    throw th;
                                                }
                                                c00841.Z$2 = z54;
                                                z39 = z54;
                                            } catch (Throwable th94) {
                                                th = th94;
                                                z39 = z54;
                                            }
                                            c00841.Z$1 = z53;
                                            z37 = z53;
                                            z54 = z30;
                                        } catch (Throwable th95) {
                                            th = th95;
                                            z39 = z30;
                                            z37 = z53;
                                        }
                                        c00841.Z$0 = z52;
                                        z38 = z52;
                                        z53 = z29;
                                    } catch (Throwable th96) {
                                        th = th96;
                                        z37 = z29;
                                        z39 = z30;
                                        z38 = z52;
                                    }
                                    c00841.J$0 = j7;
                                    context5 = context7;
                                    z52 = z28;
                                } catch (Throwable th97) {
                                    th = th97;
                                    z37 = z29;
                                    z38 = z28;
                                    z39 = z30;
                                    context5 = context7;
                                }
                                c00841.L$0 = context7;
                                c00841.L$1 = str8;
                                c00841.L$2 = list2;
                                c00841.L$3 = map2;
                                c00841.L$4 = str11;
                                c00841.L$5 = str12;
                                c00841.L$6 = str7;
                                c00841.L$7 = mutex2;
                                c00841.L$8 = lt2VarL;
                                c00841.D$0 = d4;
                                c00841.D$1 = d5;
                                c00841.F$0 = f3;
                                f4 = f3;
                                str13 = str11;
                                j7 = j4;
                            } catch (Throwable th98) {
                                th = th98;
                                z37 = z29;
                                z38 = z28;
                                z39 = z30;
                                context5 = context7;
                                f4 = f3;
                                j5 = j4;
                            }
                            runtimeAuthorizationManager = this.runtimeAuthorization;
                            context7 = context4;
                        } catch (Throwable th99) {
                            th = th99;
                            z37 = z29;
                            z38 = z28;
                            z39 = z30;
                            context5 = context4;
                            c00841 = c00841;
                            f4 = f3;
                            j5 = j4;
                            i5 = i5;
                            z40 = z33;
                            d9 = d8;
                            z41 = z32;
                            i6 = 0;
                            locationRepository = this;
                        }
                        this.runningContext = context4.getApplicationContext();
                        lt2Var = new lt2();
                        z36 = z31;
                        lt2Var.add("spoof");
                        if (!z28 || list2.size() >= 2) {
                            lt2Var2 = lt2Var;
                            lt2Var2.add("route");
                        } else {
                            lt2Var2 = lt2Var;
                        }
                        if (z29 || z30 || z36) {
                            lt2Var2.add("environment");
                        }
                        lt2VarL = mc0.l(lt2Var2);
                    }
                    break;
                }
                return z70Var7;
            case 1:
                boolean z114 = c00841.Z$8;
                boolean z115 = c00841.Z$7;
                int i39 = c00841.I$0;
                boolean z116 = c00841.Z$6;
                boolean z117 = c00841.Z$5;
                double d32 = c00841.D$2;
                boolean z118 = c00841.Z$4;
                boolean z119 = c00841.Z$3;
                boolean z120 = c00841.Z$2;
                boolean z121 = c00841.Z$1;
                boolean z122 = c00841.Z$0;
                long j10 = c00841.J$0;
                float f7 = c00841.F$0;
                j2 = j10;
                double d33 = c00841.D$1;
                double d34 = c00841.D$0;
                String str20 = (String) c00841.L$6;
                String str21 = (String) c00841.L$5;
                String str22 = (String) c00841.L$4;
                Map<String, String> map6 = (Map) c00841.L$3;
                List<RoutePoint> list4 = (List) c00841.L$2;
                str = (String) c00841.L$1;
                Context context15 = (Context) c00841.L$0;
                ee0.J(obj3);
                z18 = z116;
                z15 = z117;
                d6 = d32;
                z14 = z118;
                z13 = z119;
                z12 = z120;
                z11 = z121;
                z16 = z115;
                i2 = i39;
                z17 = z114;
                f2 = f7;
                str7 = str20;
                map2 = map6;
                list2 = list4;
                d4 = d34;
                z10 = z122;
                d5 = d33;
                str6 = str21;
                context2 = context15;
                str5 = str22;
                str8 = str;
                mutex = this.lifecycleMutex;
                c00841.L$0 = context2;
                c00841.L$1 = str8;
                c00841.L$2 = list2;
                c00841.L$3 = map2;
                c00841.L$4 = str5;
                c00841.L$5 = str6;
                c00841.L$6 = str7;
                c00841.L$7 = mutex;
                c00841.D$0 = d4;
                c00841.D$1 = d5;
                c00841.F$0 = f2;
                str9 = str6;
                context3 = context2;
                j3 = j2;
                c00841.J$0 = j3;
                str10 = str5;
                c00841.Z$0 = z10;
                z19 = z11;
                c00841.Z$1 = z19;
                z20 = z12;
                c00841.Z$2 = z20;
                z21 = z13;
                c00841.Z$3 = z21;
                z22 = z14;
                c00841.Z$4 = z22;
                d7 = d6;
                c00841.D$2 = d7;
                z23 = z15;
                c00841.Z$5 = z23;
                z24 = z18;
                c00841.Z$6 = z24;
                i3 = i2;
                c00841.I$0 = i3;
                z25 = z16;
                c00841.Z$7 = z25;
                z26 = z17;
                c00841.Z$8 = z26;
                c00841.I$1 = 0;
                c00841.label = 2;
                z70Var7 = z70Var7;
                if (mutex.lock(null, c00841) != z70Var7) {
                    z27 = z26;
                    z70Var = z70Var7;
                    context4 = context3;
                    f3 = f2;
                    z28 = z10;
                    str11 = str10;
                    z29 = z19;
                    z30 = z20;
                    z31 = z21;
                    j4 = j3;
                    z32 = z22;
                    z33 = z23;
                    z34 = z24;
                    i4 = i3;
                    z35 = z25;
                    d8 = d7;
                    i5 = 0;
                    mutex2 = mutex;
                    str12 = str9;
                    if (z27) {
                        if (!getHasLiveSimulation()) {
                        }
                        mutex2.unlock(null);
                        return mf3.a;
                    }
                    this.runningContext = context4.getApplicationContext();
                    lt2Var = new lt2();
                    z36 = z31;
                    lt2Var.add("spoof");
                    if (z28) {
                        lt2Var2 = lt2Var;
                    } else {
                        lt2Var2 = lt2Var;
                    }
                    lt2Var2.add("route");
                    if (z29) {
                        lt2Var2.add("environment");
                    } else {
                        lt2Var2.add("environment");
                    }
                    lt2VarL = mc0.l(lt2Var2);
                    runtimeAuthorizationManager = this.runtimeAuthorization;
                    context7 = context4;
                    c00841.L$0 = context7;
                    c00841.L$1 = str8;
                    c00841.L$2 = list2;
                    c00841.L$3 = map2;
                    c00841.L$4 = str11;
                    c00841.L$5 = str12;
                    c00841.L$6 = str7;
                    c00841.L$7 = mutex2;
                    c00841.L$8 = lt2VarL;
                    c00841.D$0 = d4;
                    c00841.D$1 = d5;
                    c00841.F$0 = f3;
                    f4 = f3;
                    str13 = str11;
                    j7 = j4;
                    c00841.J$0 = j7;
                    context5 = context7;
                    z52 = z28;
                    c00841.Z$0 = z52;
                    z38 = z52;
                    z53 = z29;
                    c00841.Z$1 = z53;
                    z37 = z53;
                    z54 = z30;
                    c00841.Z$2 = z54;
                    z39 = z54;
                    c00841.Z$3 = z36;
                    z36 = z36;
                    z55 = z32;
                    c00841.Z$4 = z55;
                    j5 = j7;
                    d13 = d8;
                    c00841.D$2 = d13;
                    z41 = z55;
                    z56 = z33;
                    c00841.Z$5 = z56;
                    z40 = z56;
                    z57 = z34;
                    c00841.Z$6 = z57;
                    z34 = z57;
                    i10 = i4;
                    c00841.I$0 = i10;
                    i4 = i10;
                    z58 = z35;
                    c00841.Z$7 = z58;
                    z35 = z58;
                    z42 = z27;
                    c00841.Z$8 = z42;
                    d9 = d13;
                    i5 = i5;
                    c00841.I$1 = i5;
                    i11 = 0;
                    c00841.I$2 = 0;
                    c00841.label = 3;
                    i11 = 0;
                    z70Var2 = z70Var;
                    if (runtimeAuthorizationManager.authorizeStart(lt2VarL, false, z42, c00841) == z70Var2) {
                        return z70Var2;
                    }
                    z59 = z36;
                    set = lt2VarL;
                    z60 = z42;
                    i12 = i5;
                    z70Var = z70Var2;
                    mutex4 = mutex2;
                    z61 = z35;
                    i13 = i4;
                    z62 = z34;
                    str14 = str13;
                    f6 = f4;
                    context8 = context5;
                    z63 = z38;
                    z64 = z37;
                    z65 = z39;
                    j8 = j5;
                    z66 = z40;
                    d14 = d9;
                    i14 = 0;
                    map3 = map2;
                    z67 = z41;
                    spoofingState = SpoofingState.INSTANCE;
                    c00841 = c00841;
                    spoofingState.setActive(true);
                    spoofingState.setLatitude(d4);
                    spoofingState.setLongitude(d5);
                    spoofingState.setStartTimestamp(j8);
                    locationRepository = this;
                    d5 = d5;
                    spoofingState.setRealismLevel(locationRepository.settingsManager.b.getInt("realism_level", 2));
                    d15 = d4;
                    spoofingState.setSpeedFluctuationPct(locationRepository.settingsManager.b.getInt("speed_fluctuation_pct", 10));
                    spoofingState.setRouteDistanceOffset(0.0d);
                    if (list2.size() >= 2) {
                        z68 = false;
                        spoofingState.setRouteLateralDeviation(z68);
                        spoofingState.setRouteLateralSeed(j8);
                        spoofingState.setSimMode(str8);
                        spoofingState.setSimBearing(f6);
                        spoofingState.setWifiJson(str14);
                        spoofingState.setCellJson(str12);
                        spoofingState.setBluetoothJson(str7);
                        spoofingState.setRouteJson(locationRepository.routePointsToJson(list2));
                        spoofingState.setRouteMode(z63);
                        spoofingState.setEnableJitter(z67);
                        wi2Var = locationRepository.rootManager;
                        c00841 = c00841;
                        context8 = context8;
                        c00841.L$0 = context8;
                        c00841.L$1 = str8;
                        c00841.L$2 = list2;
                        map4 = map3;
                        c00841.L$3 = map4;
                        c00841.L$4 = null;
                        c00841.L$5 = null;
                        c00841.L$6 = null;
                        mutex5 = mutex4;
                        c00841.L$7 = mutex5;
                        set2 = set;
                        c00841.L$8 = set2;
                        d12 = d15;
                        c00841.D$0 = d12;
                        str15 = str8;
                        context8 = context8;
                        d5 = d5;
                        c00841.D$1 = d5;
                        c00841.F$0 = f6;
                        c00841.J$0 = j8;
                        c00841.Z$0 = z63;
                        j8 = j8;
                        z69 = z64;
                        c00841.Z$1 = z69;
                        z48 = z65;
                        c00841.Z$2 = z48;
                        z64 = z69;
                        z70 = z59;
                        c00841.Z$3 = z70;
                        c00841.Z$4 = z67;
                        z59 = z70;
                        z65 = z48;
                        d16 = d14;
                        c00841.D$2 = d16;
                        d14 = d16;
                        z71 = z66;
                        c00841.Z$5 = z71;
                        z62 = z62;
                        c00841.Z$6 = z62;
                        z66 = z71;
                        i15 = i13;
                        c00841.I$0 = i15;
                        i13 = i15;
                        z72 = z61;
                        c00841.Z$7 = z72;
                        z61 = z72;
                        z73 = z60;
                        c00841.Z$8 = z73;
                        z60 = z73;
                        i16 = i12;
                        c00841.I$1 = i16;
                        i12 = i16;
                        i17 = i14;
                        c00841.I$2 = i17;
                        i14 = i17;
                        c00841.label = 4;
                        wi2Var.getClass();
                        z62 = z62;
                        d5 = d5;
                        z70Var3 = z70Var;
                        if (BuildersKt.withContext(Dispatchers.getIO(), new vi2(wi2Var, null, 0), c00841) == z70Var3) {
                            return z70Var3;
                        }
                        list3 = list2;
                        map5 = map4;
                        set3 = set2;
                        str16 = str15;
                        context9 = context8;
                        z74 = z64;
                        z75 = z59;
                        d17 = d14;
                        z76 = z66;
                        i18 = i13;
                        z77 = z61;
                        z78 = z60;
                        i19 = i12;
                        i20 = i14;
                        z79 = z62;
                        z70Var4 = z70Var3;
                        z80 = z67;
                        f5 = f6;
                        mutex6 = mutex5;
                        j6 = j8;
                        d18 = d12;
                        z81 = z65;
                        z51 = z63;
                        d10 = d5;
                        z82 = z81;
                        z84 = z74;
                        str17 = "0.0";
                        string = locationRepository.settingsManager.b.getString("altitude", "0.0");
                        if (string != null) {
                            str17 = string;
                        }
                        dR = r13.R(str17);
                        if (dR != null) {
                            dDoubleValue = dR.doubleValue();
                        } else {
                            dDoubleValue = 0.0d;
                        }
                        str18 = "10";
                        string2 = locationRepository.settingsManager.b.getString("satellite_count", "10");
                        if (string2 != null) {
                            str18 = string2;
                        }
                        numA0 = s13.a0(str18);
                        if (numA0 != null) {
                            iIntValue = numA0.intValue();
                            break;
                        } else {
                            iIntValue = 20;
                        }
                        ConfigManager configManager3 = locationRepository.configManager;
                        SpoofingState spoofingState4 = SpoofingState.INSTANCE;
                        String wifiJson3 = spoofingState4.getWifiJson();
                        String cellJson3 = spoofingState4.getCellJson();
                        String bluetoothJson3 = spoofingState4.getBluetoothJson();
                        c00841.L$0 = context9;
                        c00841.L$1 = null;
                        c00841.L$2 = null;
                        c00841.L$3 = null;
                        c00841.L$4 = null;
                        c00841.L$5 = null;
                        c00841.L$6 = null;
                        c00841.L$7 = mutex6;
                        c00841.L$8 = set3;
                        c00841.D$0 = d18;
                        c00841.D$1 = d10;
                        c00841.F$0 = f5;
                        c00841.J$0 = j6;
                        c00841.Z$0 = z51;
                        z74 = z84;
                        c00841.Z$1 = z74;
                        Set<String> set8 = set3;
                        c00841.Z$2 = z82;
                        z82 = z82;
                        z85 = z75;
                        c00841.Z$3 = z85;
                        z75 = z85;
                        z86 = z80;
                        c00841.Z$4 = z86;
                        z80 = z86;
                        d20 = d18;
                        d19 = d17;
                        c00841.D$2 = d19;
                        z76 = z76;
                        c00841.Z$5 = z76;
                        d19 = d19;
                        z87 = z79;
                        c00841.Z$6 = z87;
                        i18 = i18;
                        c00841.I$0 = i18;
                        z79 = z87;
                        z88 = z77;
                        c00841.Z$7 = z88;
                        z77 = z88;
                        z89 = z78;
                        c00841.Z$8 = z89;
                        z78 = z89;
                        i19 = i19;
                        c00841.I$1 = i19;
                        z83 = z74;
                        i21 = i20;
                        c00841.I$2 = i21;
                        c00841.I$3 = iIntValue;
                        i18 = i18;
                        d21 = dDoubleValue;
                        c00841.D$3 = d21;
                        i22 = iIntValue;
                        c00841.label = 5;
                        i20 = i21;
                        i19 = i19;
                        mutex6 = mutex6;
                        Context context16 = context9;
                        String str111 = str16;
                        set4 = set8;
                        z78 = z78;
                        c00842 = c00841;
                        context9 = context16;
                        z70Var5 = z70Var4;
                        d19 = d19;
                        z76 = z76;
                        d18 = d20;
                        objSaveConfig = configManager3.saveConfig(d18, d10, true, str111, f5, j6, list3, z51, wifiJson3, map5, cellJson3, bluetoothJson3, z83, z82, z75, z80, d21, i22, d19, z76, z79, i18, z77, c00842);
                        c00841 = c00842;
                        if (objSaveConfig != z70Var5) {
                            z70Var = z70Var5;
                            d22 = d18;
                            d23 = d10;
                            d24 = d21;
                            z47 = z83;
                            z90 = z75;
                            z91 = z80;
                            z92 = z82;
                            i23 = i22;
                            d25 = d19;
                            z93 = z76;
                            z94 = z79;
                            i9 = i18;
                            z45 = z77;
                            context10 = context9;
                            mutex7 = mutex6;
                            z95 = z78;
                            i24 = i19;
                            i25 = i20;
                            obj = objSaveConfig;
                            set5 = set4;
                            zBooleanValue = ((Boolean) obj).booleanValue();
                            if (!zBooleanValue) {
                                mutex7 = mutex7;
                                d25 = d25;
                                z96 = z93;
                                throw new IllegalStateException("运行配置发布失败");
                            }
                            locationRepository.runtimeAuthorization.requireAuthorized(set5);
                            z96 = z93;
                            locationRepository.settingsManager.b.edit().putBoolean("is_spoofing_active", true).apply();
                            context10 = context10;
                            locationRepository.spoofingServiceController.startForeground(context10, d22, d23);
                            d25 = d25;
                            z97 = z91;
                            d22 = d22;
                            d23 = d23;
                            RuntimeAuthorization value3 = locationRepository.runtimeAuthorization.getAuthorization().getValue();
                            value3.getClass();
                            runGeneration = value3.getRunGeneration();
                            locationRepository2 = locationRepository;
                            locationRepository$startSpoofingInternal$2$2 = new LocationRepository$startSpoofingInternal$2$2(locationRepository2, runGeneration, set5, null);
                            c00841.L$0 = context10;
                            context10 = context10;
                            c00841.L$1 = null;
                            c00841.L$2 = null;
                            c00841.L$3 = null;
                            c00841.L$4 = null;
                            c00841.L$5 = null;
                            c00841.L$6 = null;
                            c00841.L$7 = mutex7;
                            c00841.L$8 = null;
                            c00841.D$0 = d22;
                            c00841.D$1 = d23;
                            c00841.F$0 = f5;
                            c00841.J$0 = j6;
                            c00841.Z$0 = z51;
                            c00841.Z$1 = z47;
                            c00841.Z$2 = z92;
                            c00841.Z$3 = z90;
                            z91 = z97;
                            c00841.Z$4 = z91;
                            d22 = d22;
                            c00841.D$2 = d25;
                            mutex7 = mutex7;
                            c00841.Z$5 = z96;
                            z96 = z96;
                            z98 = z94;
                            c00841.Z$6 = z98;
                            z94 = z98;
                            i26 = i9;
                            c00841.I$0 = i26;
                            i9 = i26;
                            z99 = z45;
                            c00841.Z$7 = z99;
                            z45 = z99;
                            z100 = z95;
                            c00841.Z$8 = z100;
                            z95 = z100;
                            i27 = i24;
                            c00841.I$1 = i27;
                            i24 = i27;
                            i28 = i25;
                            c00841.I$2 = i28;
                            i25 = i28;
                            i29 = i23;
                            c00841.I$3 = i29;
                            d25 = d25;
                            d26 = d24;
                            c00841.D$3 = d26;
                            c00841.Z$9 = zBooleanValue;
                            c00841.J$1 = runGeneration;
                            c00841.label = 6;
                            z70Var5 = z70Var;
                            if (TimeoutKt.withTimeout(10000L, locationRepository$startSpoofingInternal$2$2, c00841) != z70Var5) {
                                z70Var = z70Var5;
                                z101 = z90;
                                i30 = i25;
                                mutex8 = mutex7;
                                d27 = d25;
                                j9 = runGeneration;
                                context11 = context10;
                                z102 = z91;
                                i31 = i29;
                                z103 = z94;
                                z104 = zBooleanValue;
                                z105 = z92;
                                i32 = i9;
                                i33 = i24;
                                z106 = z95;
                                d10 = d23;
                                z107 = z45;
                                d28 = d26;
                                d29 = d22;
                                runtimeAuthorizationManager2 = locationRepository.runtimeAuthorization;
                                c00841.L$0 = context11;
                                context12 = context11;
                                c00841.L$1 = null;
                                c00841.L$2 = null;
                                c00841.L$3 = null;
                                c00841.L$4 = null;
                                c00841.L$5 = null;
                                c00841.L$6 = null;
                                c00841.L$7 = mutex8;
                                c00841.L$8 = null;
                                c00841.D$0 = d29;
                                c00841.D$1 = d10;
                                c00841.F$0 = f5;
                                c00841.J$0 = j6;
                                c00841.Z$0 = z51;
                                c00841.Z$1 = z47;
                                c00841.Z$2 = z105;
                                c00841.Z$3 = z101;
                                z109 = z102;
                                c00841.Z$4 = z109;
                                d30 = d29;
                                z108 = z101;
                                d31 = d27;
                                c00841.D$2 = d31;
                                z102 = z109;
                                z110 = z96;
                                c00841.Z$5 = z110;
                                z96 = z110;
                                z111 = z103;
                                c00841.Z$6 = z111;
                                z103 = z111;
                                i35 = i32;
                                c00841.I$0 = i35;
                                i32 = i35;
                                z112 = z107;
                                c00841.Z$7 = z112;
                                z107 = z112;
                                z113 = z106;
                                c00841.Z$8 = z113;
                                z106 = z113;
                                i36 = i33;
                                c00841.I$1 = i36;
                                i33 = i36;
                                i37 = i30;
                                c00841.I$2 = i37;
                                i34 = i37;
                                c00841.I$3 = i31;
                                c00841.D$3 = d28;
                                c00841.Z$9 = z104;
                                c00841.J$1 = j9;
                                c00841.label = 7;
                                z70Var5 = z70Var;
                                if (runtimeAuthorizationManager2.confirmStarted(c00841) != z70Var5) {
                                    mutex9 = mutex8;
                                    mutex2 = mutex9;
                                    mutex2.unlock(null);
                                    return mf3.a;
                                }
                            }
                            z70Var = z70Var;
                            z48 = z92;
                            i8 = i25;
                            i7 = i24;
                            z44 = z95;
                            z46 = z94;
                            mutex3 = mutex7;
                            z50 = z96;
                            d11 = d25;
                            th = th;
                            d10 = d23;
                            z49 = z91;
                            z51 = z51;
                            z43 = z90;
                            context6 = context10;
                            d12 = d22;
                            nonCancellable = NonCancellable.INSTANCE;
                            locationRepository$startSpoofingInternal$2$3 = new LocationRepository$startSpoofingInternal$2$3(th, locationRepository, context6, null);
                            c00841.L$0 = null;
                            c00841.L$1 = null;
                            c00841.L$2 = null;
                            c00841.L$3 = null;
                            c00841.L$4 = null;
                            c00841.L$5 = null;
                            c00841.L$6 = null;
                            c00841.L$7 = mutex3;
                            c00841.L$8 = th;
                            c00841.L$9 = null;
                            c00841.D$0 = d12;
                            c00841.D$1 = d10;
                            c00841.F$0 = f5;
                            c00841.J$0 = j6;
                            c00841.Z$0 = z51;
                            c00841.Z$1 = z47;
                            c00841.Z$2 = z48;
                            c00841.Z$3 = z43;
                            c00841.Z$4 = z49;
                            c00841.D$2 = d11;
                            c00841.Z$5 = z50;
                            c00841.Z$6 = z46;
                            c00841.I$0 = i9;
                            c00841.Z$7 = z45;
                            c00841.Z$8 = z44;
                            c00841.I$1 = i7;
                            c00841.I$2 = i8;
                            c00841.label = 8;
                            z70Var6 = z70Var;
                            if (BuildersKt.withContext(nonCancellable, locationRepository$startSpoofingInternal$2$3, c00841) == z70Var6) {
                                return z70Var6;
                            }
                            throw th;
                        }
                        return z70Var5;
                    }
                    if (locationRepository.settingsManager.b.getBoolean("route_lateral_deviation", false)) {
                        z68 = true;
                    } else {
                        z68 = false;
                    }
                    spoofingState.setRouteLateralDeviation(z68);
                    spoofingState.setRouteLateralSeed(j8);
                    spoofingState.setSimMode(str8);
                    spoofingState.setSimBearing(f6);
                    spoofingState.setWifiJson(str14);
                    spoofingState.setCellJson(str12);
                    spoofingState.setBluetoothJson(str7);
                    spoofingState.setRouteJson(locationRepository.routePointsToJson(list2));
                    spoofingState.setRouteMode(z63);
                    spoofingState.setEnableJitter(z67);
                    wi2Var = locationRepository.rootManager;
                    c00841 = c00841;
                    context8 = context8;
                    c00841.L$0 = context8;
                    c00841.L$1 = str8;
                    c00841.L$2 = list2;
                    map4 = map3;
                    c00841.L$3 = map4;
                    c00841.L$4 = null;
                    c00841.L$5 = null;
                    c00841.L$6 = null;
                    mutex5 = mutex4;
                    c00841.L$7 = mutex5;
                    set2 = set;
                    c00841.L$8 = set2;
                    d12 = d15;
                    c00841.D$0 = d12;
                    str15 = str8;
                    context8 = context8;
                    d5 = d5;
                    c00841.D$1 = d5;
                    c00841.F$0 = f6;
                    c00841.J$0 = j8;
                    c00841.Z$0 = z63;
                    j8 = j8;
                    z69 = z64;
                    c00841.Z$1 = z69;
                    z48 = z65;
                    c00841.Z$2 = z48;
                    z64 = z69;
                    z70 = z59;
                    c00841.Z$3 = z70;
                    c00841.Z$4 = z67;
                    z59 = z70;
                    z65 = z48;
                    d16 = d14;
                    c00841.D$2 = d16;
                    d14 = d16;
                    z71 = z66;
                    c00841.Z$5 = z71;
                    z62 = z62;
                    c00841.Z$6 = z62;
                    z66 = z71;
                    i15 = i13;
                    c00841.I$0 = i15;
                    i13 = i15;
                    z72 = z61;
                    c00841.Z$7 = z72;
                    z61 = z72;
                    z73 = z60;
                    c00841.Z$8 = z73;
                    z60 = z73;
                    i16 = i12;
                    c00841.I$1 = i16;
                    i12 = i16;
                    i17 = i14;
                    c00841.I$2 = i17;
                    i14 = i17;
                    c00841.label = 4;
                    wi2Var.getClass();
                    z62 = z62;
                    d5 = d5;
                    z70Var3 = z70Var;
                    if (BuildersKt.withContext(Dispatchers.getIO(), new vi2(wi2Var, null, 0), c00841) == z70Var3) {
                        return z70Var3;
                    }
                    list3 = list2;
                    map5 = map4;
                    set3 = set2;
                    str16 = str15;
                    context9 = context8;
                    z74 = z64;
                    z75 = z59;
                    d17 = d14;
                    z76 = z66;
                    i18 = i13;
                    z77 = z61;
                    z78 = z60;
                    i19 = i12;
                    i20 = i14;
                    z79 = z62;
                    z70Var4 = z70Var3;
                    z80 = z67;
                    f5 = f6;
                    mutex6 = mutex5;
                    j6 = j8;
                    d18 = d12;
                    z81 = z65;
                    z51 = z63;
                    d10 = d5;
                    z82 = z81;
                    z84 = z74;
                    str17 = "0.0";
                    string = locationRepository.settingsManager.b.getString("altitude", "0.0");
                    if (string != null) {
                        str17 = string;
                    }
                    dR = r13.R(str17);
                    if (dR != null) {
                        dDoubleValue = dR.doubleValue();
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    str18 = "10";
                    string2 = locationRepository.settingsManager.b.getString("satellite_count", "10");
                    if (string2 != null) {
                        str18 = string2;
                    }
                    numA0 = s13.a0(str18);
                    if (numA0 != null) {
                        iIntValue = numA0.intValue();
                        break;
                    } else {
                        iIntValue = 20;
                    }
                    ConfigManager configManager4 = locationRepository.configManager;
                    SpoofingState spoofingState5 = SpoofingState.INSTANCE;
                    String wifiJson4 = spoofingState5.getWifiJson();
                    String cellJson4 = spoofingState5.getCellJson();
                    String bluetoothJson4 = spoofingState5.getBluetoothJson();
                    c00841.L$0 = context9;
                    c00841.L$1 = null;
                    c00841.L$2 = null;
                    c00841.L$3 = null;
                    c00841.L$4 = null;
                    c00841.L$5 = null;
                    c00841.L$6 = null;
                    c00841.L$7 = mutex6;
                    c00841.L$8 = set3;
                    c00841.D$0 = d18;
                    c00841.D$1 = d10;
                    c00841.F$0 = f5;
                    c00841.J$0 = j6;
                    c00841.Z$0 = z51;
                    z74 = z84;
                    c00841.Z$1 = z74;
                    Set<String> set9 = set3;
                    c00841.Z$2 = z82;
                    z82 = z82;
                    z85 = z75;
                    c00841.Z$3 = z85;
                    z75 = z85;
                    z86 = z80;
                    c00841.Z$4 = z86;
                    z80 = z86;
                    d20 = d18;
                    d19 = d17;
                    c00841.D$2 = d19;
                    z76 = z76;
                    c00841.Z$5 = z76;
                    d19 = d19;
                    z87 = z79;
                    c00841.Z$6 = z87;
                    i18 = i18;
                    c00841.I$0 = i18;
                    z79 = z87;
                    z88 = z77;
                    c00841.Z$7 = z88;
                    z77 = z88;
                    z89 = z78;
                    c00841.Z$8 = z89;
                    z78 = z89;
                    i19 = i19;
                    c00841.I$1 = i19;
                    z83 = z74;
                    i21 = i20;
                    c00841.I$2 = i21;
                    c00841.I$3 = iIntValue;
                    i18 = i18;
                    d21 = dDoubleValue;
                    c00841.D$3 = d21;
                    i22 = iIntValue;
                    c00841.label = 5;
                    i20 = i21;
                    i19 = i19;
                    mutex6 = mutex6;
                    Context context17 = context9;
                    String str112 = str16;
                    set4 = set9;
                    z78 = z78;
                    c00842 = c00841;
                    context9 = context17;
                    z70Var5 = z70Var4;
                    d19 = d19;
                    z76 = z76;
                    d18 = d20;
                    objSaveConfig = configManager4.saveConfig(d18, d10, true, str112, f5, j6, list3, z51, wifiJson4, map5, cellJson4, bluetoothJson4, z83, z82, z75, z80, d21, i22, d19, z76, z79, i18, z77, c00842);
                    c00841 = c00842;
                    if (objSaveConfig != z70Var5) {
                        z70Var = z70Var5;
                        d22 = d18;
                        d23 = d10;
                        d24 = d21;
                        z47 = z83;
                        z90 = z75;
                        z91 = z80;
                        z92 = z82;
                        i23 = i22;
                        d25 = d19;
                        z93 = z76;
                        z94 = z79;
                        i9 = i18;
                        z45 = z77;
                        context10 = context9;
                        mutex7 = mutex6;
                        z95 = z78;
                        i24 = i19;
                        i25 = i20;
                        obj = objSaveConfig;
                        set5 = set4;
                        zBooleanValue = ((Boolean) obj).booleanValue();
                        if (!zBooleanValue) {
                            mutex7 = mutex7;
                            d25 = d25;
                            z96 = z93;
                            throw new IllegalStateException("运行配置发布失败");
                        }
                        locationRepository.runtimeAuthorization.requireAuthorized(set5);
                        z96 = z93;
                        locationRepository.settingsManager.b.edit().putBoolean("is_spoofing_active", true).apply();
                        context10 = context10;
                        locationRepository.spoofingServiceController.startForeground(context10, d22, d23);
                        d25 = d25;
                        z97 = z91;
                        d22 = d22;
                        d23 = d23;
                        RuntimeAuthorization value4 = locationRepository.runtimeAuthorization.getAuthorization().getValue();
                        value4.getClass();
                        runGeneration = value4.getRunGeneration();
                        locationRepository2 = locationRepository;
                        locationRepository$startSpoofingInternal$2$2 = new LocationRepository$startSpoofingInternal$2$2(locationRepository2, runGeneration, set5, null);
                        c00841.L$0 = context10;
                        context10 = context10;
                        c00841.L$1 = null;
                        c00841.L$2 = null;
                        c00841.L$3 = null;
                        c00841.L$4 = null;
                        c00841.L$5 = null;
                        c00841.L$6 = null;
                        c00841.L$7 = mutex7;
                        c00841.L$8 = null;
                        c00841.D$0 = d22;
                        c00841.D$1 = d23;
                        c00841.F$0 = f5;
                        c00841.J$0 = j6;
                        c00841.Z$0 = z51;
                        c00841.Z$1 = z47;
                        c00841.Z$2 = z92;
                        c00841.Z$3 = z90;
                        z91 = z97;
                        c00841.Z$4 = z91;
                        d22 = d22;
                        c00841.D$2 = d25;
                        mutex7 = mutex7;
                        c00841.Z$5 = z96;
                        z96 = z96;
                        z98 = z94;
                        c00841.Z$6 = z98;
                        z94 = z98;
                        i26 = i9;
                        c00841.I$0 = i26;
                        i9 = i26;
                        z99 = z45;
                        c00841.Z$7 = z99;
                        z45 = z99;
                        z100 = z95;
                        c00841.Z$8 = z100;
                        z95 = z100;
                        i27 = i24;
                        c00841.I$1 = i27;
                        i24 = i27;
                        i28 = i25;
                        c00841.I$2 = i28;
                        i25 = i28;
                        i29 = i23;
                        c00841.I$3 = i29;
                        d25 = d25;
                        d26 = d24;
                        c00841.D$3 = d26;
                        c00841.Z$9 = zBooleanValue;
                        c00841.J$1 = runGeneration;
                        c00841.label = 6;
                        z70Var5 = z70Var;
                        if (TimeoutKt.withTimeout(10000L, locationRepository$startSpoofingInternal$2$2, c00841) != z70Var5) {
                            z70Var = z70Var5;
                            z101 = z90;
                            i30 = i25;
                            mutex8 = mutex7;
                            d27 = d25;
                            j9 = runGeneration;
                            context11 = context10;
                            z102 = z91;
                            i31 = i29;
                            z103 = z94;
                            z104 = zBooleanValue;
                            z105 = z92;
                            i32 = i9;
                            i33 = i24;
                            z106 = z95;
                            d10 = d23;
                            z107 = z45;
                            d28 = d26;
                            d29 = d22;
                            runtimeAuthorizationManager2 = locationRepository.runtimeAuthorization;
                            c00841.L$0 = context11;
                            context12 = context11;
                            c00841.L$1 = null;
                            c00841.L$2 = null;
                            c00841.L$3 = null;
                            c00841.L$4 = null;
                            c00841.L$5 = null;
                            c00841.L$6 = null;
                            c00841.L$7 = mutex8;
                            c00841.L$8 = null;
                            c00841.D$0 = d29;
                            c00841.D$1 = d10;
                            c00841.F$0 = f5;
                            c00841.J$0 = j6;
                            c00841.Z$0 = z51;
                            c00841.Z$1 = z47;
                            c00841.Z$2 = z105;
                            c00841.Z$3 = z101;
                            z109 = z102;
                            c00841.Z$4 = z109;
                            d30 = d29;
                            z108 = z101;
                            d31 = d27;
                            c00841.D$2 = d31;
                            z102 = z109;
                            z110 = z96;
                            c00841.Z$5 = z110;
                            z96 = z110;
                            z111 = z103;
                            c00841.Z$6 = z111;
                            z103 = z111;
                            i35 = i32;
                            c00841.I$0 = i35;
                            i32 = i35;
                            z112 = z107;
                            c00841.Z$7 = z112;
                            z107 = z112;
                            z113 = z106;
                            c00841.Z$8 = z113;
                            z106 = z113;
                            i36 = i33;
                            c00841.I$1 = i36;
                            i33 = i36;
                            i37 = i30;
                            c00841.I$2 = i37;
                            i34 = i37;
                            c00841.I$3 = i31;
                            c00841.D$3 = d28;
                            c00841.Z$9 = z104;
                            c00841.J$1 = j9;
                            c00841.label = 7;
                            z70Var5 = z70Var;
                            if (runtimeAuthorizationManager2.confirmStarted(c00841) != z70Var5) {
                                mutex9 = mutex8;
                                mutex2 = mutex9;
                                mutex2.unlock(null);
                                return mf3.a;
                            }
                        }
                        z70Var = z70Var;
                        z48 = z92;
                        i8 = i25;
                        i7 = i24;
                        z44 = z95;
                        z46 = z94;
                        mutex3 = mutex7;
                        z50 = z96;
                        d11 = d25;
                        th = th;
                        d10 = d23;
                        z49 = z91;
                        z51 = z51;
                        z43 = z90;
                        context6 = context10;
                        d12 = d22;
                        nonCancellable = NonCancellable.INSTANCE;
                        locationRepository$startSpoofingInternal$2$3 = new LocationRepository$startSpoofingInternal$2$3(th, locationRepository, context6, null);
                        c00841.L$0 = null;
                        c00841.L$1 = null;
                        c00841.L$2 = null;
                        c00841.L$3 = null;
                        c00841.L$4 = null;
                        c00841.L$5 = null;
                        c00841.L$6 = null;
                        c00841.L$7 = mutex3;
                        c00841.L$8 = th;
                        c00841.L$9 = null;
                        c00841.D$0 = d12;
                        c00841.D$1 = d10;
                        c00841.F$0 = f5;
                        c00841.J$0 = j6;
                        c00841.Z$0 = z51;
                        c00841.Z$1 = z47;
                        c00841.Z$2 = z48;
                        c00841.Z$3 = z43;
                        c00841.Z$4 = z49;
                        c00841.D$2 = d11;
                        c00841.Z$5 = z50;
                        c00841.Z$6 = z46;
                        c00841.I$0 = i9;
                        c00841.Z$7 = z45;
                        c00841.Z$8 = z44;
                        c00841.I$1 = i7;
                        c00841.I$2 = i8;
                        c00841.label = 8;
                        z70Var6 = z70Var;
                        if (BuildersKt.withContext(nonCancellable, locationRepository$startSpoofingInternal$2$3, c00841) == z70Var6) {
                            return z70Var6;
                        }
                        throw th;
                    }
                    return z70Var5;
                    mutex3.unlock(obj2);
                    throw th;
                }
                return z70Var7;
            case 2:
                int i40 = c00841.I$1;
                boolean z123 = c00841.Z$8;
                boolean z124 = c00841.Z$7;
                int i41 = c00841.I$0;
                boolean z125 = c00841.Z$6;
                boolean z126 = c00841.Z$5;
                double d35 = c00841.D$2;
                boolean z127 = c00841.Z$4;
                boolean z128 = c00841.Z$3;
                boolean z129 = c00841.Z$2;
                boolean z130 = c00841.Z$1;
                boolean z131 = c00841.Z$0;
                z35 = z124;
                long j11 = c00841.J$0;
                float f8 = c00841.F$0;
                double d36 = c00841.D$1;
                double d37 = c00841.D$0;
                Mutex mutex10 = (Mutex) c00841.L$7;
                String str23 = (String) c00841.L$6;
                String str24 = (String) c00841.L$5;
                String str25 = (String) c00841.L$4;
                Map<String, String> map7 = (Map) c00841.L$3;
                List<RoutePoint> list5 = (List) c00841.L$2;
                String str26 = (String) c00841.L$1;
                Context context18 = (Context) c00841.L$0;
                ee0.J(obj3);
                z33 = z126;
                d8 = d35;
                z32 = z127;
                i5 = i40;
                j4 = j11;
                str7 = str23;
                map2 = map7;
                list2 = list5;
                context4 = context18;
                i4 = i41;
                z34 = z125;
                z28 = z131;
                mutex2 = mutex10;
                str12 = str24;
                z31 = z128;
                z29 = z130;
                z27 = z123;
                z70Var = z70Var7;
                d4 = d37;
                f3 = f8;
                str11 = str25;
                str8 = str26;
                z30 = z129;
                d5 = d36;
                if (z27) {
                    if (!getHasLiveSimulation()) {
                    }
                    mutex2.unlock(null);
                    return mf3.a;
                }
                this.runningContext = context4.getApplicationContext();
                lt2Var = new lt2();
                z36 = z31;
                lt2Var.add("spoof");
                if (z28) {
                    lt2Var2 = lt2Var;
                } else {
                    lt2Var2 = lt2Var;
                }
                lt2Var2.add("route");
                if (z29) {
                    lt2Var2.add("environment");
                } else {
                    lt2Var2.add("environment");
                }
                lt2VarL = mc0.l(lt2Var2);
                runtimeAuthorizationManager = this.runtimeAuthorization;
                context7 = context4;
                c00841.L$0 = context7;
                c00841.L$1 = str8;
                c00841.L$2 = list2;
                c00841.L$3 = map2;
                c00841.L$4 = str11;
                c00841.L$5 = str12;
                c00841.L$6 = str7;
                c00841.L$7 = mutex2;
                c00841.L$8 = lt2VarL;
                c00841.D$0 = d4;
                c00841.D$1 = d5;
                c00841.F$0 = f3;
                f4 = f3;
                str13 = str11;
                j7 = j4;
                c00841.J$0 = j7;
                context5 = context7;
                z52 = z28;
                c00841.Z$0 = z52;
                z38 = z52;
                z53 = z29;
                c00841.Z$1 = z53;
                z37 = z53;
                z54 = z30;
                c00841.Z$2 = z54;
                z39 = z54;
                c00841.Z$3 = z36;
                z36 = z36;
                z55 = z32;
                c00841.Z$4 = z55;
                j5 = j7;
                d13 = d8;
                c00841.D$2 = d13;
                z41 = z55;
                z56 = z33;
                c00841.Z$5 = z56;
                z40 = z56;
                z57 = z34;
                c00841.Z$6 = z57;
                z34 = z57;
                i10 = i4;
                c00841.I$0 = i10;
                i4 = i10;
                z58 = z35;
                c00841.Z$7 = z58;
                z35 = z58;
                z42 = z27;
                c00841.Z$8 = z42;
                d9 = d13;
                i5 = i5;
                c00841.I$1 = i5;
                i11 = 0;
                c00841.I$2 = 0;
                c00841.label = 3;
                i11 = 0;
                z70Var2 = z70Var;
                if (runtimeAuthorizationManager.authorizeStart(lt2VarL, false, z42, c00841) == z70Var2) {
                    return z70Var2;
                }
                z59 = z36;
                set = lt2VarL;
                z60 = z42;
                i12 = i5;
                z70Var = z70Var2;
                mutex4 = mutex2;
                z61 = z35;
                i13 = i4;
                z62 = z34;
                str14 = str13;
                f6 = f4;
                context8 = context5;
                z63 = z38;
                z64 = z37;
                z65 = z39;
                j8 = j5;
                z66 = z40;
                d14 = d9;
                i14 = 0;
                map3 = map2;
                z67 = z41;
                spoofingState = SpoofingState.INSTANCE;
                c00841 = c00841;
                spoofingState.setActive(true);
                spoofingState.setLatitude(d4);
                spoofingState.setLongitude(d5);
                spoofingState.setStartTimestamp(j8);
                locationRepository = this;
                d5 = d5;
                spoofingState.setRealismLevel(locationRepository.settingsManager.b.getInt("realism_level", 2));
                d15 = d4;
                spoofingState.setSpeedFluctuationPct(locationRepository.settingsManager.b.getInt("speed_fluctuation_pct", 10));
                spoofingState.setRouteDistanceOffset(0.0d);
                if (list2.size() >= 2) {
                    z68 = false;
                    spoofingState.setRouteLateralDeviation(z68);
                    spoofingState.setRouteLateralSeed(j8);
                    spoofingState.setSimMode(str8);
                    spoofingState.setSimBearing(f6);
                    spoofingState.setWifiJson(str14);
                    spoofingState.setCellJson(str12);
                    spoofingState.setBluetoothJson(str7);
                    spoofingState.setRouteJson(locationRepository.routePointsToJson(list2));
                    spoofingState.setRouteMode(z63);
                    spoofingState.setEnableJitter(z67);
                    wi2Var = locationRepository.rootManager;
                    c00841 = c00841;
                    context8 = context8;
                    c00841.L$0 = context8;
                    c00841.L$1 = str8;
                    c00841.L$2 = list2;
                    map4 = map3;
                    c00841.L$3 = map4;
                    c00841.L$4 = null;
                    c00841.L$5 = null;
                    c00841.L$6 = null;
                    mutex5 = mutex4;
                    c00841.L$7 = mutex5;
                    set2 = set;
                    c00841.L$8 = set2;
                    d12 = d15;
                    c00841.D$0 = d12;
                    str15 = str8;
                    context8 = context8;
                    d5 = d5;
                    c00841.D$1 = d5;
                    c00841.F$0 = f6;
                    c00841.J$0 = j8;
                    c00841.Z$0 = z63;
                    j8 = j8;
                    z69 = z64;
                    c00841.Z$1 = z69;
                    z48 = z65;
                    c00841.Z$2 = z48;
                    z64 = z69;
                    z70 = z59;
                    c00841.Z$3 = z70;
                    c00841.Z$4 = z67;
                    z59 = z70;
                    z65 = z48;
                    d16 = d14;
                    c00841.D$2 = d16;
                    d14 = d16;
                    z71 = z66;
                    c00841.Z$5 = z71;
                    z62 = z62;
                    c00841.Z$6 = z62;
                    z66 = z71;
                    i15 = i13;
                    c00841.I$0 = i15;
                    i13 = i15;
                    z72 = z61;
                    c00841.Z$7 = z72;
                    z61 = z72;
                    z73 = z60;
                    c00841.Z$8 = z73;
                    z60 = z73;
                    i16 = i12;
                    c00841.I$1 = i16;
                    i12 = i16;
                    i17 = i14;
                    c00841.I$2 = i17;
                    i14 = i17;
                    c00841.label = 4;
                    wi2Var.getClass();
                    z62 = z62;
                    d5 = d5;
                    z70Var3 = z70Var;
                    if (BuildersKt.withContext(Dispatchers.getIO(), new vi2(wi2Var, null, 0), c00841) == z70Var3) {
                        return z70Var3;
                    }
                    list3 = list2;
                    map5 = map4;
                    set3 = set2;
                    str16 = str15;
                    context9 = context8;
                    z74 = z64;
                    z75 = z59;
                    d17 = d14;
                    z76 = z66;
                    i18 = i13;
                    z77 = z61;
                    z78 = z60;
                    i19 = i12;
                    i20 = i14;
                    z79 = z62;
                    z70Var4 = z70Var3;
                    z80 = z67;
                    f5 = f6;
                    mutex6 = mutex5;
                    j6 = j8;
                    d18 = d12;
                    z81 = z65;
                    z51 = z63;
                    d10 = d5;
                    z82 = z81;
                    z84 = z74;
                    str17 = "0.0";
                    string = locationRepository.settingsManager.b.getString("altitude", "0.0");
                    if (string != null) {
                        str17 = string;
                    }
                    dR = r13.R(str17);
                    if (dR != null) {
                        dDoubleValue = dR.doubleValue();
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    str18 = "10";
                    string2 = locationRepository.settingsManager.b.getString("satellite_count", "10");
                    if (string2 != null) {
                        str18 = string2;
                    }
                    numA0 = s13.a0(str18);
                    if (numA0 != null) {
                        iIntValue = numA0.intValue();
                        break;
                    } else {
                        iIntValue = 20;
                    }
                    ConfigManager configManager5 = locationRepository.configManager;
                    SpoofingState spoofingState6 = SpoofingState.INSTANCE;
                    String wifiJson5 = spoofingState6.getWifiJson();
                    String cellJson5 = spoofingState6.getCellJson();
                    String bluetoothJson5 = spoofingState6.getBluetoothJson();
                    c00841.L$0 = context9;
                    c00841.L$1 = null;
                    c00841.L$2 = null;
                    c00841.L$3 = null;
                    c00841.L$4 = null;
                    c00841.L$5 = null;
                    c00841.L$6 = null;
                    c00841.L$7 = mutex6;
                    c00841.L$8 = set3;
                    c00841.D$0 = d18;
                    c00841.D$1 = d10;
                    c00841.F$0 = f5;
                    c00841.J$0 = j6;
                    c00841.Z$0 = z51;
                    z74 = z84;
                    c00841.Z$1 = z74;
                    Set<String> set10 = set3;
                    c00841.Z$2 = z82;
                    z82 = z82;
                    z85 = z75;
                    c00841.Z$3 = z85;
                    z75 = z85;
                    z86 = z80;
                    c00841.Z$4 = z86;
                    z80 = z86;
                    d20 = d18;
                    d19 = d17;
                    c00841.D$2 = d19;
                    z76 = z76;
                    c00841.Z$5 = z76;
                    d19 = d19;
                    z87 = z79;
                    c00841.Z$6 = z87;
                    i18 = i18;
                    c00841.I$0 = i18;
                    z79 = z87;
                    z88 = z77;
                    c00841.Z$7 = z88;
                    z77 = z88;
                    z89 = z78;
                    c00841.Z$8 = z89;
                    z78 = z89;
                    i19 = i19;
                    c00841.I$1 = i19;
                    z83 = z74;
                    i21 = i20;
                    c00841.I$2 = i21;
                    c00841.I$3 = iIntValue;
                    i18 = i18;
                    d21 = dDoubleValue;
                    c00841.D$3 = d21;
                    i22 = iIntValue;
                    c00841.label = 5;
                    i20 = i21;
                    i19 = i19;
                    mutex6 = mutex6;
                    Context context19 = context9;
                    String str113 = str16;
                    set4 = set10;
                    z78 = z78;
                    c00842 = c00841;
                    context9 = context19;
                    z70Var5 = z70Var4;
                    d19 = d19;
                    z76 = z76;
                    d18 = d20;
                    objSaveConfig = configManager5.saveConfig(d18, d10, true, str113, f5, j6, list3, z51, wifiJson5, map5, cellJson5, bluetoothJson5, z83, z82, z75, z80, d21, i22, d19, z76, z79, i18, z77, c00842);
                    c00841 = c00842;
                    if (objSaveConfig != z70Var5) {
                        z70Var = z70Var5;
                        d22 = d18;
                        d23 = d10;
                        d24 = d21;
                        z47 = z83;
                        z90 = z75;
                        z91 = z80;
                        z92 = z82;
                        i23 = i22;
                        d25 = d19;
                        z93 = z76;
                        z94 = z79;
                        i9 = i18;
                        z45 = z77;
                        context10 = context9;
                        mutex7 = mutex6;
                        z95 = z78;
                        i24 = i19;
                        i25 = i20;
                        obj = objSaveConfig;
                        set5 = set4;
                        zBooleanValue = ((Boolean) obj).booleanValue();
                        if (!zBooleanValue) {
                            mutex7 = mutex7;
                            d25 = d25;
                            z96 = z93;
                            throw new IllegalStateException("运行配置发布失败");
                        }
                        locationRepository.runtimeAuthorization.requireAuthorized(set5);
                        z96 = z93;
                        locationRepository.settingsManager.b.edit().putBoolean("is_spoofing_active", true).apply();
                        context10 = context10;
                        locationRepository.spoofingServiceController.startForeground(context10, d22, d23);
                        d25 = d25;
                        z97 = z91;
                        d22 = d22;
                        d23 = d23;
                        RuntimeAuthorization value5 = locationRepository.runtimeAuthorization.getAuthorization().getValue();
                        value5.getClass();
                        runGeneration = value5.getRunGeneration();
                        locationRepository2 = locationRepository;
                        locationRepository$startSpoofingInternal$2$2 = new LocationRepository$startSpoofingInternal$2$2(locationRepository2, runGeneration, set5, null);
                        c00841.L$0 = context10;
                        context10 = context10;
                        c00841.L$1 = null;
                        c00841.L$2 = null;
                        c00841.L$3 = null;
                        c00841.L$4 = null;
                        c00841.L$5 = null;
                        c00841.L$6 = null;
                        c00841.L$7 = mutex7;
                        c00841.L$8 = null;
                        c00841.D$0 = d22;
                        c00841.D$1 = d23;
                        c00841.F$0 = f5;
                        c00841.J$0 = j6;
                        c00841.Z$0 = z51;
                        c00841.Z$1 = z47;
                        c00841.Z$2 = z92;
                        c00841.Z$3 = z90;
                        z91 = z97;
                        c00841.Z$4 = z91;
                        d22 = d22;
                        c00841.D$2 = d25;
                        mutex7 = mutex7;
                        c00841.Z$5 = z96;
                        z96 = z96;
                        z98 = z94;
                        c00841.Z$6 = z98;
                        z94 = z98;
                        i26 = i9;
                        c00841.I$0 = i26;
                        i9 = i26;
                        z99 = z45;
                        c00841.Z$7 = z99;
                        z45 = z99;
                        z100 = z95;
                        c00841.Z$8 = z100;
                        z95 = z100;
                        i27 = i24;
                        c00841.I$1 = i27;
                        i24 = i27;
                        i28 = i25;
                        c00841.I$2 = i28;
                        i25 = i28;
                        i29 = i23;
                        c00841.I$3 = i29;
                        d25 = d25;
                        d26 = d24;
                        c00841.D$3 = d26;
                        c00841.Z$9 = zBooleanValue;
                        c00841.J$1 = runGeneration;
                        c00841.label = 6;
                        z70Var5 = z70Var;
                        if (TimeoutKt.withTimeout(10000L, locationRepository$startSpoofingInternal$2$2, c00841) != z70Var5) {
                            z70Var = z70Var5;
                            z101 = z90;
                            i30 = i25;
                            mutex8 = mutex7;
                            d27 = d25;
                            j9 = runGeneration;
                            context11 = context10;
                            z102 = z91;
                            i31 = i29;
                            z103 = z94;
                            z104 = zBooleanValue;
                            z105 = z92;
                            i32 = i9;
                            i33 = i24;
                            z106 = z95;
                            d10 = d23;
                            z107 = z45;
                            d28 = d26;
                            d29 = d22;
                            runtimeAuthorizationManager2 = locationRepository.runtimeAuthorization;
                            c00841.L$0 = context11;
                            context12 = context11;
                            c00841.L$1 = null;
                            c00841.L$2 = null;
                            c00841.L$3 = null;
                            c00841.L$4 = null;
                            c00841.L$5 = null;
                            c00841.L$6 = null;
                            c00841.L$7 = mutex8;
                            c00841.L$8 = null;
                            c00841.D$0 = d29;
                            c00841.D$1 = d10;
                            c00841.F$0 = f5;
                            c00841.J$0 = j6;
                            c00841.Z$0 = z51;
                            c00841.Z$1 = z47;
                            c00841.Z$2 = z105;
                            c00841.Z$3 = z101;
                            z109 = z102;
                            c00841.Z$4 = z109;
                            d30 = d29;
                            z108 = z101;
                            d31 = d27;
                            c00841.D$2 = d31;
                            z102 = z109;
                            z110 = z96;
                            c00841.Z$5 = z110;
                            z96 = z110;
                            z111 = z103;
                            c00841.Z$6 = z111;
                            z103 = z111;
                            i35 = i32;
                            c00841.I$0 = i35;
                            i32 = i35;
                            z112 = z107;
                            c00841.Z$7 = z112;
                            z107 = z112;
                            z113 = z106;
                            c00841.Z$8 = z113;
                            z106 = z113;
                            i36 = i33;
                            c00841.I$1 = i36;
                            i33 = i36;
                            i37 = i30;
                            c00841.I$2 = i37;
                            i34 = i37;
                            c00841.I$3 = i31;
                            c00841.D$3 = d28;
                            c00841.Z$9 = z104;
                            c00841.J$1 = j9;
                            c00841.label = 7;
                            z70Var5 = z70Var;
                            if (runtimeAuthorizationManager2.confirmStarted(c00841) != z70Var5) {
                                mutex9 = mutex8;
                                mutex2 = mutex9;
                                mutex2.unlock(null);
                                return mf3.a;
                            }
                        }
                        z70Var = z70Var;
                        z48 = z92;
                        i8 = i25;
                        i7 = i24;
                        z44 = z95;
                        z46 = z94;
                        mutex3 = mutex7;
                        z50 = z96;
                        d11 = d25;
                        th = th;
                        d10 = d23;
                        z49 = z91;
                        z51 = z51;
                        z43 = z90;
                        context6 = context10;
                        d12 = d22;
                        nonCancellable = NonCancellable.INSTANCE;
                        locationRepository$startSpoofingInternal$2$3 = new LocationRepository$startSpoofingInternal$2$3(th, locationRepository, context6, null);
                        c00841.L$0 = null;
                        c00841.L$1 = null;
                        c00841.L$2 = null;
                        c00841.L$3 = null;
                        c00841.L$4 = null;
                        c00841.L$5 = null;
                        c00841.L$6 = null;
                        c00841.L$7 = mutex3;
                        c00841.L$8 = th;
                        c00841.L$9 = null;
                        c00841.D$0 = d12;
                        c00841.D$1 = d10;
                        c00841.F$0 = f5;
                        c00841.J$0 = j6;
                        c00841.Z$0 = z51;
                        c00841.Z$1 = z47;
                        c00841.Z$2 = z48;
                        c00841.Z$3 = z43;
                        c00841.Z$4 = z49;
                        c00841.D$2 = d11;
                        c00841.Z$5 = z50;
                        c00841.Z$6 = z46;
                        c00841.I$0 = i9;
                        c00841.Z$7 = z45;
                        c00841.Z$8 = z44;
                        c00841.I$1 = i7;
                        c00841.I$2 = i8;
                        c00841.label = 8;
                        z70Var6 = z70Var;
                        if (BuildersKt.withContext(nonCancellable, locationRepository$startSpoofingInternal$2$3, c00841) == z70Var6) {
                            return z70Var6;
                        }
                        throw th;
                    }
                    return z70Var5;
                }
                if (locationRepository.settingsManager.b.getBoolean("route_lateral_deviation", false)) {
                    z68 = true;
                } else {
                    z68 = false;
                }
                spoofingState.setRouteLateralDeviation(z68);
                spoofingState.setRouteLateralSeed(j8);
                spoofingState.setSimMode(str8);
                spoofingState.setSimBearing(f6);
                spoofingState.setWifiJson(str14);
                spoofingState.setCellJson(str12);
                spoofingState.setBluetoothJson(str7);
                spoofingState.setRouteJson(locationRepository.routePointsToJson(list2));
                spoofingState.setRouteMode(z63);
                spoofingState.setEnableJitter(z67);
                wi2Var = locationRepository.rootManager;
                c00841 = c00841;
                context8 = context8;
                c00841.L$0 = context8;
                c00841.L$1 = str8;
                c00841.L$2 = list2;
                map4 = map3;
                c00841.L$3 = map4;
                c00841.L$4 = null;
                c00841.L$5 = null;
                c00841.L$6 = null;
                mutex5 = mutex4;
                c00841.L$7 = mutex5;
                set2 = set;
                c00841.L$8 = set2;
                d12 = d15;
                c00841.D$0 = d12;
                str15 = str8;
                context8 = context8;
                d5 = d5;
                c00841.D$1 = d5;
                c00841.F$0 = f6;
                c00841.J$0 = j8;
                c00841.Z$0 = z63;
                j8 = j8;
                z69 = z64;
                c00841.Z$1 = z69;
                z48 = z65;
                c00841.Z$2 = z48;
                z64 = z69;
                z70 = z59;
                c00841.Z$3 = z70;
                c00841.Z$4 = z67;
                z59 = z70;
                z65 = z48;
                d16 = d14;
                c00841.D$2 = d16;
                d14 = d16;
                z71 = z66;
                c00841.Z$5 = z71;
                z62 = z62;
                c00841.Z$6 = z62;
                z66 = z71;
                i15 = i13;
                c00841.I$0 = i15;
                i13 = i15;
                z72 = z61;
                c00841.Z$7 = z72;
                z61 = z72;
                z73 = z60;
                c00841.Z$8 = z73;
                z60 = z73;
                i16 = i12;
                c00841.I$1 = i16;
                i12 = i16;
                i17 = i14;
                c00841.I$2 = i17;
                i14 = i17;
                c00841.label = 4;
                wi2Var.getClass();
                z62 = z62;
                d5 = d5;
                z70Var3 = z70Var;
                if (BuildersKt.withContext(Dispatchers.getIO(), new vi2(wi2Var, null, 0), c00841) == z70Var3) {
                    return z70Var3;
                }
                list3 = list2;
                map5 = map4;
                set3 = set2;
                str16 = str15;
                context9 = context8;
                z74 = z64;
                z75 = z59;
                d17 = d14;
                z76 = z66;
                i18 = i13;
                z77 = z61;
                z78 = z60;
                i19 = i12;
                i20 = i14;
                z79 = z62;
                z70Var4 = z70Var3;
                z80 = z67;
                f5 = f6;
                mutex6 = mutex5;
                j6 = j8;
                d18 = d12;
                z81 = z65;
                z51 = z63;
                d10 = d5;
                z82 = z81;
                z84 = z74;
                str17 = "0.0";
                string = locationRepository.settingsManager.b.getString("altitude", "0.0");
                if (string != null) {
                    str17 = string;
                }
                dR = r13.R(str17);
                if (dR != null) {
                    dDoubleValue = dR.doubleValue();
                } else {
                    dDoubleValue = 0.0d;
                }
                str18 = "10";
                string2 = locationRepository.settingsManager.b.getString("satellite_count", "10");
                if (string2 != null) {
                    str18 = string2;
                }
                numA0 = s13.a0(str18);
                if (numA0 != null) {
                    iIntValue = numA0.intValue();
                    break;
                } else {
                    iIntValue = 20;
                }
                ConfigManager configManager6 = locationRepository.configManager;
                SpoofingState spoofingState7 = SpoofingState.INSTANCE;
                String wifiJson6 = spoofingState7.getWifiJson();
                String cellJson6 = spoofingState7.getCellJson();
                String bluetoothJson6 = spoofingState7.getBluetoothJson();
                c00841.L$0 = context9;
                c00841.L$1 = null;
                c00841.L$2 = null;
                c00841.L$3 = null;
                c00841.L$4 = null;
                c00841.L$5 = null;
                c00841.L$6 = null;
                c00841.L$7 = mutex6;
                c00841.L$8 = set3;
                c00841.D$0 = d18;
                c00841.D$1 = d10;
                c00841.F$0 = f5;
                c00841.J$0 = j6;
                c00841.Z$0 = z51;
                z74 = z84;
                c00841.Z$1 = z74;
                Set<String> set11 = set3;
                c00841.Z$2 = z82;
                z82 = z82;
                z85 = z75;
                c00841.Z$3 = z85;
                z75 = z85;
                z86 = z80;
                c00841.Z$4 = z86;
                z80 = z86;
                d20 = d18;
                d19 = d17;
                c00841.D$2 = d19;
                z76 = z76;
                c00841.Z$5 = z76;
                d19 = d19;
                z87 = z79;
                c00841.Z$6 = z87;
                i18 = i18;
                c00841.I$0 = i18;
                z79 = z87;
                z88 = z77;
                c00841.Z$7 = z88;
                z77 = z88;
                z89 = z78;
                c00841.Z$8 = z89;
                z78 = z89;
                i19 = i19;
                c00841.I$1 = i19;
                z83 = z74;
                i21 = i20;
                c00841.I$2 = i21;
                c00841.I$3 = iIntValue;
                i18 = i18;
                d21 = dDoubleValue;
                c00841.D$3 = d21;
                i22 = iIntValue;
                c00841.label = 5;
                i20 = i21;
                i19 = i19;
                mutex6 = mutex6;
                Context context110 = context9;
                String str114 = str16;
                set4 = set11;
                z78 = z78;
                c00842 = c00841;
                context9 = context110;
                z70Var5 = z70Var4;
                d19 = d19;
                z76 = z76;
                d18 = d20;
                objSaveConfig = configManager6.saveConfig(d18, d10, true, str114, f5, j6, list3, z51, wifiJson6, map5, cellJson6, bluetoothJson6, z83, z82, z75, z80, d21, i22, d19, z76, z79, i18, z77, c00842);
                c00841 = c00842;
                if (objSaveConfig != z70Var5) {
                    z70Var = z70Var5;
                    d22 = d18;
                    d23 = d10;
                    d24 = d21;
                    z47 = z83;
                    z90 = z75;
                    z91 = z80;
                    z92 = z82;
                    i23 = i22;
                    d25 = d19;
                    z93 = z76;
                    z94 = z79;
                    i9 = i18;
                    z45 = z77;
                    context10 = context9;
                    mutex7 = mutex6;
                    z95 = z78;
                    i24 = i19;
                    i25 = i20;
                    obj = objSaveConfig;
                    set5 = set4;
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    if (!zBooleanValue) {
                        mutex7 = mutex7;
                        d25 = d25;
                        z96 = z93;
                        throw new IllegalStateException("运行配置发布失败");
                    }
                    locationRepository.runtimeAuthorization.requireAuthorized(set5);
                    z96 = z93;
                    locationRepository.settingsManager.b.edit().putBoolean("is_spoofing_active", true).apply();
                    context10 = context10;
                    locationRepository.spoofingServiceController.startForeground(context10, d22, d23);
                    d25 = d25;
                    z97 = z91;
                    d22 = d22;
                    d23 = d23;
                    RuntimeAuthorization value6 = locationRepository.runtimeAuthorization.getAuthorization().getValue();
                    value6.getClass();
                    runGeneration = value6.getRunGeneration();
                    locationRepository2 = locationRepository;
                    locationRepository$startSpoofingInternal$2$2 = new LocationRepository$startSpoofingInternal$2$2(locationRepository2, runGeneration, set5, null);
                    c00841.L$0 = context10;
                    context10 = context10;
                    c00841.L$1 = null;
                    c00841.L$2 = null;
                    c00841.L$3 = null;
                    c00841.L$4 = null;
                    c00841.L$5 = null;
                    c00841.L$6 = null;
                    c00841.L$7 = mutex7;
                    c00841.L$8 = null;
                    c00841.D$0 = d22;
                    c00841.D$1 = d23;
                    c00841.F$0 = f5;
                    c00841.J$0 = j6;
                    c00841.Z$0 = z51;
                    c00841.Z$1 = z47;
                    c00841.Z$2 = z92;
                    c00841.Z$3 = z90;
                    z91 = z97;
                    c00841.Z$4 = z91;
                    d22 = d22;
                    c00841.D$2 = d25;
                    mutex7 = mutex7;
                    c00841.Z$5 = z96;
                    z96 = z96;
                    z98 = z94;
                    c00841.Z$6 = z98;
                    z94 = z98;
                    i26 = i9;
                    c00841.I$0 = i26;
                    i9 = i26;
                    z99 = z45;
                    c00841.Z$7 = z99;
                    z45 = z99;
                    z100 = z95;
                    c00841.Z$8 = z100;
                    z95 = z100;
                    i27 = i24;
                    c00841.I$1 = i27;
                    i24 = i27;
                    i28 = i25;
                    c00841.I$2 = i28;
                    i25 = i28;
                    i29 = i23;
                    c00841.I$3 = i29;
                    d25 = d25;
                    d26 = d24;
                    c00841.D$3 = d26;
                    c00841.Z$9 = zBooleanValue;
                    c00841.J$1 = runGeneration;
                    c00841.label = 6;
                    z70Var5 = z70Var;
                    if (TimeoutKt.withTimeout(10000L, locationRepository$startSpoofingInternal$2$2, c00841) != z70Var5) {
                        z70Var = z70Var5;
                        z101 = z90;
                        i30 = i25;
                        mutex8 = mutex7;
                        d27 = d25;
                        j9 = runGeneration;
                        context11 = context10;
                        z102 = z91;
                        i31 = i29;
                        z103 = z94;
                        z104 = zBooleanValue;
                        z105 = z92;
                        i32 = i9;
                        i33 = i24;
                        z106 = z95;
                        d10 = d23;
                        z107 = z45;
                        d28 = d26;
                        d29 = d22;
                        runtimeAuthorizationManager2 = locationRepository.runtimeAuthorization;
                        c00841.L$0 = context11;
                        context12 = context11;
                        c00841.L$1 = null;
                        c00841.L$2 = null;
                        c00841.L$3 = null;
                        c00841.L$4 = null;
                        c00841.L$5 = null;
                        c00841.L$6 = null;
                        c00841.L$7 = mutex8;
                        c00841.L$8 = null;
                        c00841.D$0 = d29;
                        c00841.D$1 = d10;
                        c00841.F$0 = f5;
                        c00841.J$0 = j6;
                        c00841.Z$0 = z51;
                        c00841.Z$1 = z47;
                        c00841.Z$2 = z105;
                        c00841.Z$3 = z101;
                        z109 = z102;
                        c00841.Z$4 = z109;
                        d30 = d29;
                        z108 = z101;
                        d31 = d27;
                        c00841.D$2 = d31;
                        z102 = z109;
                        z110 = z96;
                        c00841.Z$5 = z110;
                        z96 = z110;
                        z111 = z103;
                        c00841.Z$6 = z111;
                        z103 = z111;
                        i35 = i32;
                        c00841.I$0 = i35;
                        i32 = i35;
                        z112 = z107;
                        c00841.Z$7 = z112;
                        z107 = z112;
                        z113 = z106;
                        c00841.Z$8 = z113;
                        z106 = z113;
                        i36 = i33;
                        c00841.I$1 = i36;
                        i33 = i36;
                        i37 = i30;
                        c00841.I$2 = i37;
                        i34 = i37;
                        c00841.I$3 = i31;
                        c00841.D$3 = d28;
                        c00841.Z$9 = z104;
                        c00841.J$1 = j9;
                        c00841.label = 7;
                        z70Var5 = z70Var;
                        if (runtimeAuthorizationManager2.confirmStarted(c00841) != z70Var5) {
                            mutex9 = mutex8;
                            mutex2 = mutex9;
                            mutex2.unlock(null);
                            return mf3.a;
                        }
                    }
                    z70Var = z70Var;
                    z48 = z92;
                    i8 = i25;
                    i7 = i24;
                    z44 = z95;
                    z46 = z94;
                    mutex3 = mutex7;
                    z50 = z96;
                    d11 = d25;
                    th = th;
                    d10 = d23;
                    z49 = z91;
                    z51 = z51;
                    z43 = z90;
                    context6 = context10;
                    d12 = d22;
                    nonCancellable = NonCancellable.INSTANCE;
                    locationRepository$startSpoofingInternal$2$3 = new LocationRepository$startSpoofingInternal$2$3(th, locationRepository, context6, null);
                    c00841.L$0 = null;
                    c00841.L$1 = null;
                    c00841.L$2 = null;
                    c00841.L$3 = null;
                    c00841.L$4 = null;
                    c00841.L$5 = null;
                    c00841.L$6 = null;
                    c00841.L$7 = mutex3;
                    c00841.L$8 = th;
                    c00841.L$9 = null;
                    c00841.D$0 = d12;
                    c00841.D$1 = d10;
                    c00841.F$0 = f5;
                    c00841.J$0 = j6;
                    c00841.Z$0 = z51;
                    c00841.Z$1 = z47;
                    c00841.Z$2 = z48;
                    c00841.Z$3 = z43;
                    c00841.Z$4 = z49;
                    c00841.D$2 = d11;
                    c00841.Z$5 = z50;
                    c00841.Z$6 = z46;
                    c00841.I$0 = i9;
                    c00841.Z$7 = z45;
                    c00841.Z$8 = z44;
                    c00841.I$1 = i7;
                    c00841.I$2 = i8;
                    c00841.label = 8;
                    z70Var6 = z70Var;
                    if (BuildersKt.withContext(nonCancellable, locationRepository$startSpoofingInternal$2$3, c00841) == z70Var6) {
                        return z70Var6;
                    }
                    throw th;
                }
                return z70Var5;
                mutex3.unlock(obj2);
                throw th;
            case 3:
                int i42 = c00841.I$2;
                int i43 = c00841.I$1;
                boolean z132 = c00841.Z$8;
                boolean z133 = c00841.Z$7;
                int i44 = c00841.I$0;
                boolean z134 = c00841.Z$6;
                boolean z135 = c00841.Z$5;
                double d38 = c00841.D$2;
                boolean z136 = c00841.Z$4;
                boolean z137 = c00841.Z$3;
                boolean z138 = c00841.Z$2;
                boolean z139 = c00841.Z$1;
                boolean z140 = c00841.Z$0;
                long j12 = c00841.J$0;
                float f9 = c00841.F$0;
                double d39 = c00841.D$1;
                double d40 = c00841.D$0;
                set = (Set) c00841.L$8;
                Mutex mutex11 = (Mutex) c00841.L$7;
                String str27 = (String) c00841.L$6;
                String str28 = (String) c00841.L$5;
                String str29 = (String) c00841.L$4;
                Map<String, String> map8 = (Map) c00841.L$3;
                List<RoutePoint> list6 = (List) c00841.L$2;
                String str30 = (String) c00841.L$1;
                Context context20 = (Context) c00841.L$0;
                try {
                    ee0.J(obj3);
                    str14 = str29;
                    z60 = z132;
                    z59 = z137;
                    z65 = z138;
                    z61 = z133;
                    i13 = i44;
                    z62 = z134;
                    z66 = z135;
                    d14 = d38;
                    z67 = z136;
                    i14 = i42;
                    z64 = z139;
                    i12 = i43;
                    z63 = z140;
                    f6 = f9;
                    d5 = d39;
                    mutex4 = mutex11;
                    context8 = context20;
                    str7 = str27;
                    str12 = str28;
                    map3 = map8;
                    list2 = list6;
                    z70Var = z70Var7;
                    d4 = d40;
                    j8 = j12;
                    str8 = str30;
                    spoofingState = SpoofingState.INSTANCE;
                    c00841 = c00841;
                    spoofingState.setActive(true);
                    spoofingState.setLatitude(d4);
                    spoofingState.setLongitude(d5);
                    spoofingState.setStartTimestamp(j8);
                    locationRepository = this;
                    d5 = d5;
                    spoofingState.setRealismLevel(locationRepository.settingsManager.b.getInt("realism_level", 2));
                    d15 = d4;
                    spoofingState.setSpeedFluctuationPct(locationRepository.settingsManager.b.getInt("speed_fluctuation_pct", 10));
                    spoofingState.setRouteDistanceOffset(0.0d);
                    if (list2.size() >= 2) {
                        z68 = false;
                        spoofingState.setRouteLateralDeviation(z68);
                        spoofingState.setRouteLateralSeed(j8);
                        spoofingState.setSimMode(str8);
                        spoofingState.setSimBearing(f6);
                        spoofingState.setWifiJson(str14);
                        spoofingState.setCellJson(str12);
                        spoofingState.setBluetoothJson(str7);
                        spoofingState.setRouteJson(locationRepository.routePointsToJson(list2));
                        spoofingState.setRouteMode(z63);
                        spoofingState.setEnableJitter(z67);
                        wi2Var = locationRepository.rootManager;
                        c00841 = c00841;
                        context8 = context8;
                        c00841.L$0 = context8;
                        c00841.L$1 = str8;
                        c00841.L$2 = list2;
                        map4 = map3;
                        c00841.L$3 = map4;
                        c00841.L$4 = null;
                        c00841.L$5 = null;
                        c00841.L$6 = null;
                        mutex5 = mutex4;
                        c00841.L$7 = mutex5;
                        set2 = set;
                        c00841.L$8 = set2;
                        d12 = d15;
                        c00841.D$0 = d12;
                        str15 = str8;
                        context8 = context8;
                        d5 = d5;
                        c00841.D$1 = d5;
                        c00841.F$0 = f6;
                        c00841.J$0 = j8;
                        c00841.Z$0 = z63;
                        j8 = j8;
                        z69 = z64;
                        c00841.Z$1 = z69;
                        z48 = z65;
                        c00841.Z$2 = z48;
                        z64 = z69;
                        z70 = z59;
                        c00841.Z$3 = z70;
                        c00841.Z$4 = z67;
                        z59 = z70;
                        z65 = z48;
                        d16 = d14;
                        c00841.D$2 = d16;
                        d14 = d16;
                        z71 = z66;
                        c00841.Z$5 = z71;
                        z62 = z62;
                        c00841.Z$6 = z62;
                        z66 = z71;
                        i15 = i13;
                        c00841.I$0 = i15;
                        i13 = i15;
                        z72 = z61;
                        c00841.Z$7 = z72;
                        z61 = z72;
                        z73 = z60;
                        c00841.Z$8 = z73;
                        z60 = z73;
                        i16 = i12;
                        c00841.I$1 = i16;
                        i12 = i16;
                        i17 = i14;
                        c00841.I$2 = i17;
                        i14 = i17;
                        c00841.label = 4;
                        wi2Var.getClass();
                        z62 = z62;
                        d5 = d5;
                        z70Var3 = z70Var;
                        if (BuildersKt.withContext(Dispatchers.getIO(), new vi2(wi2Var, null, 0), c00841) == z70Var3) {
                            return z70Var3;
                        }
                        list3 = list2;
                        map5 = map4;
                        set3 = set2;
                        str16 = str15;
                        context9 = context8;
                        z74 = z64;
                        z75 = z59;
                        d17 = d14;
                        z76 = z66;
                        i18 = i13;
                        z77 = z61;
                        z78 = z60;
                        i19 = i12;
                        i20 = i14;
                        z79 = z62;
                        z70Var4 = z70Var3;
                        z80 = z67;
                        f5 = f6;
                        mutex6 = mutex5;
                        j6 = j8;
                        d18 = d12;
                        z81 = z65;
                        z51 = z63;
                        d10 = d5;
                        z82 = z81;
                        z84 = z74;
                        str17 = "0.0";
                        string = locationRepository.settingsManager.b.getString("altitude", "0.0");
                        if (string != null) {
                            str17 = string;
                        }
                        dR = r13.R(str17);
                        if (dR != null) {
                            dDoubleValue = dR.doubleValue();
                        } else {
                            dDoubleValue = 0.0d;
                        }
                        str18 = "10";
                        string2 = locationRepository.settingsManager.b.getString("satellite_count", "10");
                        if (string2 != null) {
                            str18 = string2;
                        }
                        numA0 = s13.a0(str18);
                        if (numA0 != null) {
                            iIntValue = numA0.intValue();
                            break;
                        } else {
                            iIntValue = 20;
                        }
                        ConfigManager configManager7 = locationRepository.configManager;
                        SpoofingState spoofingState8 = SpoofingState.INSTANCE;
                        String wifiJson7 = spoofingState8.getWifiJson();
                        String cellJson7 = spoofingState8.getCellJson();
                        String bluetoothJson7 = spoofingState8.getBluetoothJson();
                        c00841.L$0 = context9;
                        c00841.L$1 = null;
                        c00841.L$2 = null;
                        c00841.L$3 = null;
                        c00841.L$4 = null;
                        c00841.L$5 = null;
                        c00841.L$6 = null;
                        c00841.L$7 = mutex6;
                        c00841.L$8 = set3;
                        c00841.D$0 = d18;
                        c00841.D$1 = d10;
                        c00841.F$0 = f5;
                        c00841.J$0 = j6;
                        c00841.Z$0 = z51;
                        z74 = z84;
                        c00841.Z$1 = z74;
                        Set<String> set12 = set3;
                        c00841.Z$2 = z82;
                        z82 = z82;
                        z85 = z75;
                        c00841.Z$3 = z85;
                        z75 = z85;
                        z86 = z80;
                        c00841.Z$4 = z86;
                        z80 = z86;
                        d20 = d18;
                        d19 = d17;
                        c00841.D$2 = d19;
                        z76 = z76;
                        c00841.Z$5 = z76;
                        d19 = d19;
                        z87 = z79;
                        c00841.Z$6 = z87;
                        i18 = i18;
                        c00841.I$0 = i18;
                        z79 = z87;
                        z88 = z77;
                        c00841.Z$7 = z88;
                        z77 = z88;
                        z89 = z78;
                        c00841.Z$8 = z89;
                        z78 = z89;
                        i19 = i19;
                        c00841.I$1 = i19;
                        z83 = z74;
                        i21 = i20;
                        c00841.I$2 = i21;
                        c00841.I$3 = iIntValue;
                        i18 = i18;
                        d21 = dDoubleValue;
                        c00841.D$3 = d21;
                        i22 = iIntValue;
                        c00841.label = 5;
                        i20 = i21;
                        i19 = i19;
                        mutex6 = mutex6;
                        Context context111 = context9;
                        String str115 = str16;
                        set4 = set12;
                        z78 = z78;
                        c00842 = c00841;
                        context9 = context111;
                        z70Var5 = z70Var4;
                        d19 = d19;
                        z76 = z76;
                        d18 = d20;
                        objSaveConfig = configManager7.saveConfig(d18, d10, true, str115, f5, j6, list3, z51, wifiJson7, map5, cellJson7, bluetoothJson7, z83, z82, z75, z80, d21, i22, d19, z76, z79, i18, z77, c00842);
                        c00841 = c00842;
                        if (objSaveConfig != z70Var5) {
                            z70Var = z70Var5;
                            d22 = d18;
                            d23 = d10;
                            d24 = d21;
                            z47 = z83;
                            z90 = z75;
                            z91 = z80;
                            z92 = z82;
                            i23 = i22;
                            d25 = d19;
                            z93 = z76;
                            z94 = z79;
                            i9 = i18;
                            z45 = z77;
                            context10 = context9;
                            mutex7 = mutex6;
                            z95 = z78;
                            i24 = i19;
                            i25 = i20;
                            obj = objSaveConfig;
                            set5 = set4;
                            zBooleanValue = ((Boolean) obj).booleanValue();
                            if (!zBooleanValue) {
                                mutex7 = mutex7;
                                d25 = d25;
                                z96 = z93;
                                throw new IllegalStateException("运行配置发布失败");
                            }
                            locationRepository.runtimeAuthorization.requireAuthorized(set5);
                            z96 = z93;
                            locationRepository.settingsManager.b.edit().putBoolean("is_spoofing_active", true).apply();
                            context10 = context10;
                            locationRepository.spoofingServiceController.startForeground(context10, d22, d23);
                            d25 = d25;
                            z97 = z91;
                            d22 = d22;
                            d23 = d23;
                            RuntimeAuthorization value7 = locationRepository.runtimeAuthorization.getAuthorization().getValue();
                            value7.getClass();
                            runGeneration = value7.getRunGeneration();
                            locationRepository2 = locationRepository;
                            locationRepository$startSpoofingInternal$2$2 = new LocationRepository$startSpoofingInternal$2$2(locationRepository2, runGeneration, set5, null);
                            c00841.L$0 = context10;
                            context10 = context10;
                            c00841.L$1 = null;
                            c00841.L$2 = null;
                            c00841.L$3 = null;
                            c00841.L$4 = null;
                            c00841.L$5 = null;
                            c00841.L$6 = null;
                            c00841.L$7 = mutex7;
                            c00841.L$8 = null;
                            c00841.D$0 = d22;
                            c00841.D$1 = d23;
                            c00841.F$0 = f5;
                            c00841.J$0 = j6;
                            c00841.Z$0 = z51;
                            c00841.Z$1 = z47;
                            c00841.Z$2 = z92;
                            c00841.Z$3 = z90;
                            z91 = z97;
                            c00841.Z$4 = z91;
                            d22 = d22;
                            c00841.D$2 = d25;
                            mutex7 = mutex7;
                            c00841.Z$5 = z96;
                            z96 = z96;
                            z98 = z94;
                            c00841.Z$6 = z98;
                            z94 = z98;
                            i26 = i9;
                            c00841.I$0 = i26;
                            i9 = i26;
                            z99 = z45;
                            c00841.Z$7 = z99;
                            z45 = z99;
                            z100 = z95;
                            c00841.Z$8 = z100;
                            z95 = z100;
                            i27 = i24;
                            c00841.I$1 = i27;
                            i24 = i27;
                            i28 = i25;
                            c00841.I$2 = i28;
                            i25 = i28;
                            i29 = i23;
                            c00841.I$3 = i29;
                            d25 = d25;
                            d26 = d24;
                            c00841.D$3 = d26;
                            c00841.Z$9 = zBooleanValue;
                            c00841.J$1 = runGeneration;
                            c00841.label = 6;
                            z70Var5 = z70Var;
                            if (TimeoutKt.withTimeout(10000L, locationRepository$startSpoofingInternal$2$2, c00841) != z70Var5) {
                                z70Var = z70Var5;
                                z101 = z90;
                                i30 = i25;
                                mutex8 = mutex7;
                                d27 = d25;
                                j9 = runGeneration;
                                context11 = context10;
                                z102 = z91;
                                i31 = i29;
                                z103 = z94;
                                z104 = zBooleanValue;
                                z105 = z92;
                                i32 = i9;
                                i33 = i24;
                                z106 = z95;
                                d10 = d23;
                                z107 = z45;
                                d28 = d26;
                                d29 = d22;
                                runtimeAuthorizationManager2 = locationRepository.runtimeAuthorization;
                                c00841.L$0 = context11;
                                context12 = context11;
                                c00841.L$1 = null;
                                c00841.L$2 = null;
                                c00841.L$3 = null;
                                c00841.L$4 = null;
                                c00841.L$5 = null;
                                c00841.L$6 = null;
                                c00841.L$7 = mutex8;
                                c00841.L$8 = null;
                                c00841.D$0 = d29;
                                c00841.D$1 = d10;
                                c00841.F$0 = f5;
                                c00841.J$0 = j6;
                                c00841.Z$0 = z51;
                                c00841.Z$1 = z47;
                                c00841.Z$2 = z105;
                                c00841.Z$3 = z101;
                                z109 = z102;
                                c00841.Z$4 = z109;
                                d30 = d29;
                                z108 = z101;
                                d31 = d27;
                                c00841.D$2 = d31;
                                z102 = z109;
                                z110 = z96;
                                c00841.Z$5 = z110;
                                z96 = z110;
                                z111 = z103;
                                c00841.Z$6 = z111;
                                z103 = z111;
                                i35 = i32;
                                c00841.I$0 = i35;
                                i32 = i35;
                                z112 = z107;
                                c00841.Z$7 = z112;
                                z107 = z112;
                                z113 = z106;
                                c00841.Z$8 = z113;
                                z106 = z113;
                                i36 = i33;
                                c00841.I$1 = i36;
                                i33 = i36;
                                i37 = i30;
                                c00841.I$2 = i37;
                                i34 = i37;
                                c00841.I$3 = i31;
                                c00841.D$3 = d28;
                                c00841.Z$9 = z104;
                                c00841.J$1 = j9;
                                c00841.label = 7;
                                z70Var5 = z70Var;
                                if (runtimeAuthorizationManager2.confirmStarted(c00841) != z70Var5) {
                                    mutex9 = mutex8;
                                    mutex2 = mutex9;
                                    mutex2.unlock(null);
                                    return mf3.a;
                                }
                            }
                            z70Var = z70Var;
                            z48 = z92;
                            i8 = i25;
                            i7 = i24;
                            z44 = z95;
                            z46 = z94;
                            mutex3 = mutex7;
                            z50 = z96;
                            d11 = d25;
                            th = th;
                            d10 = d23;
                            z49 = z91;
                            z51 = z51;
                            z43 = z90;
                            context6 = context10;
                            d12 = d22;
                            nonCancellable = NonCancellable.INSTANCE;
                            locationRepository$startSpoofingInternal$2$3 = new LocationRepository$startSpoofingInternal$2$3(th, locationRepository, context6, null);
                            c00841.L$0 = null;
                            c00841.L$1 = null;
                            c00841.L$2 = null;
                            c00841.L$3 = null;
                            c00841.L$4 = null;
                            c00841.L$5 = null;
                            c00841.L$6 = null;
                            c00841.L$7 = mutex3;
                            c00841.L$8 = th;
                            c00841.L$9 = null;
                            c00841.D$0 = d12;
                            c00841.D$1 = d10;
                            c00841.F$0 = f5;
                            c00841.J$0 = j6;
                            c00841.Z$0 = z51;
                            c00841.Z$1 = z47;
                            c00841.Z$2 = z48;
                            c00841.Z$3 = z43;
                            c00841.Z$4 = z49;
                            c00841.D$2 = d11;
                            c00841.Z$5 = z50;
                            c00841.Z$6 = z46;
                            c00841.I$0 = i9;
                            c00841.Z$7 = z45;
                            c00841.Z$8 = z44;
                            c00841.I$1 = i7;
                            c00841.I$2 = i8;
                            c00841.label = 8;
                            z70Var6 = z70Var;
                            if (BuildersKt.withContext(nonCancellable, locationRepository$startSpoofingInternal$2$3, c00841) == z70Var6) {
                                return z70Var6;
                            }
                            throw th;
                        }
                        return z70Var5;
                    }
                    if (locationRepository.settingsManager.b.getBoolean("route_lateral_deviation", false)) {
                        z68 = true;
                    } else {
                        z68 = false;
                    }
                    spoofingState.setRouteLateralDeviation(z68);
                    spoofingState.setRouteLateralSeed(j8);
                    spoofingState.setSimMode(str8);
                    spoofingState.setSimBearing(f6);
                    spoofingState.setWifiJson(str14);
                    spoofingState.setCellJson(str12);
                    spoofingState.setBluetoothJson(str7);
                    spoofingState.setRouteJson(locationRepository.routePointsToJson(list2));
                    spoofingState.setRouteMode(z63);
                    spoofingState.setEnableJitter(z67);
                    wi2Var = locationRepository.rootManager;
                    c00841 = c00841;
                    context8 = context8;
                    c00841.L$0 = context8;
                    c00841.L$1 = str8;
                    c00841.L$2 = list2;
                    map4 = map3;
                    c00841.L$3 = map4;
                    c00841.L$4 = null;
                    c00841.L$5 = null;
                    c00841.L$6 = null;
                    mutex5 = mutex4;
                    c00841.L$7 = mutex5;
                    set2 = set;
                    c00841.L$8 = set2;
                    d12 = d15;
                    c00841.D$0 = d12;
                    str15 = str8;
                    context8 = context8;
                    d5 = d5;
                    c00841.D$1 = d5;
                    c00841.F$0 = f6;
                    c00841.J$0 = j8;
                    c00841.Z$0 = z63;
                    j8 = j8;
                    z69 = z64;
                    c00841.Z$1 = z69;
                    z48 = z65;
                    c00841.Z$2 = z48;
                    z64 = z69;
                    z70 = z59;
                    c00841.Z$3 = z70;
                    c00841.Z$4 = z67;
                    z59 = z70;
                    z65 = z48;
                    d16 = d14;
                    c00841.D$2 = d16;
                    d14 = d16;
                    z71 = z66;
                    c00841.Z$5 = z71;
                    z62 = z62;
                    c00841.Z$6 = z62;
                    z66 = z71;
                    i15 = i13;
                    c00841.I$0 = i15;
                    i13 = i15;
                    z72 = z61;
                    c00841.Z$7 = z72;
                    z61 = z72;
                    z73 = z60;
                    c00841.Z$8 = z73;
                    z60 = z73;
                    i16 = i12;
                    c00841.I$1 = i16;
                    i12 = i16;
                    i17 = i14;
                    c00841.I$2 = i17;
                    i14 = i17;
                    c00841.label = 4;
                    wi2Var.getClass();
                    z62 = z62;
                    d5 = d5;
                    z70Var3 = z70Var;
                    if (BuildersKt.withContext(Dispatchers.getIO(), new vi2(wi2Var, null, 0), c00841) == z70Var3) {
                        return z70Var3;
                    }
                    list3 = list2;
                    map5 = map4;
                    set3 = set2;
                    str16 = str15;
                    context9 = context8;
                    z74 = z64;
                    z75 = z59;
                    d17 = d14;
                    z76 = z66;
                    i18 = i13;
                    z77 = z61;
                    z78 = z60;
                    i19 = i12;
                    i20 = i14;
                    z79 = z62;
                    z70Var4 = z70Var3;
                    z80 = z67;
                    f5 = f6;
                    mutex6 = mutex5;
                    j6 = j8;
                    d18 = d12;
                    z81 = z65;
                    z51 = z63;
                    d10 = d5;
                    z82 = z81;
                    z84 = z74;
                    str17 = "0.0";
                    string = locationRepository.settingsManager.b.getString("altitude", "0.0");
                    if (string != null) {
                        str17 = string;
                    }
                    dR = r13.R(str17);
                    if (dR != null) {
                        dDoubleValue = dR.doubleValue();
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    str18 = "10";
                    string2 = locationRepository.settingsManager.b.getString("satellite_count", "10");
                    if (string2 != null) {
                        str18 = string2;
                    }
                    numA0 = s13.a0(str18);
                    if (numA0 != null) {
                        iIntValue = numA0.intValue();
                        break;
                    } else {
                        iIntValue = 20;
                    }
                    ConfigManager configManager8 = locationRepository.configManager;
                    SpoofingState spoofingState9 = SpoofingState.INSTANCE;
                    String wifiJson8 = spoofingState9.getWifiJson();
                    String cellJson8 = spoofingState9.getCellJson();
                    String bluetoothJson8 = spoofingState9.getBluetoothJson();
                    c00841.L$0 = context9;
                    c00841.L$1 = null;
                    c00841.L$2 = null;
                    c00841.L$3 = null;
                    c00841.L$4 = null;
                    c00841.L$5 = null;
                    c00841.L$6 = null;
                    c00841.L$7 = mutex6;
                    c00841.L$8 = set3;
                    c00841.D$0 = d18;
                    c00841.D$1 = d10;
                    c00841.F$0 = f5;
                    c00841.J$0 = j6;
                    c00841.Z$0 = z51;
                    z74 = z84;
                    c00841.Z$1 = z74;
                    Set<String> set13 = set3;
                    c00841.Z$2 = z82;
                    z82 = z82;
                    z85 = z75;
                    c00841.Z$3 = z85;
                    z75 = z85;
                    z86 = z80;
                    c00841.Z$4 = z86;
                    z80 = z86;
                    d20 = d18;
                    d19 = d17;
                    c00841.D$2 = d19;
                    z76 = z76;
                    c00841.Z$5 = z76;
                    d19 = d19;
                    z87 = z79;
                    c00841.Z$6 = z87;
                    i18 = i18;
                    c00841.I$0 = i18;
                    z79 = z87;
                    z88 = z77;
                    c00841.Z$7 = z88;
                    z77 = z88;
                    z89 = z78;
                    c00841.Z$8 = z89;
                    z78 = z89;
                    i19 = i19;
                    c00841.I$1 = i19;
                    z83 = z74;
                    i21 = i20;
                    c00841.I$2 = i21;
                    c00841.I$3 = iIntValue;
                    i18 = i18;
                    d21 = dDoubleValue;
                    c00841.D$3 = d21;
                    i22 = iIntValue;
                    c00841.label = 5;
                    i20 = i21;
                    i19 = i19;
                    mutex6 = mutex6;
                    Context context112 = context9;
                    String str116 = str16;
                    set4 = set13;
                    z78 = z78;
                    c00842 = c00841;
                    context9 = context112;
                    z70Var5 = z70Var4;
                    d19 = d19;
                    z76 = z76;
                    d18 = d20;
                    objSaveConfig = configManager8.saveConfig(d18, d10, true, str116, f5, j6, list3, z51, wifiJson8, map5, cellJson8, bluetoothJson8, z83, z82, z75, z80, d21, i22, d19, z76, z79, i18, z77, c00842);
                    c00841 = c00842;
                    if (objSaveConfig != z70Var5) {
                        z70Var = z70Var5;
                        d22 = d18;
                        d23 = d10;
                        d24 = d21;
                        z47 = z83;
                        z90 = z75;
                        z91 = z80;
                        z92 = z82;
                        i23 = i22;
                        d25 = d19;
                        z93 = z76;
                        z94 = z79;
                        i9 = i18;
                        z45 = z77;
                        context10 = context9;
                        mutex7 = mutex6;
                        z95 = z78;
                        i24 = i19;
                        i25 = i20;
                        obj = objSaveConfig;
                        set5 = set4;
                        zBooleanValue = ((Boolean) obj).booleanValue();
                        if (!zBooleanValue) {
                            mutex7 = mutex7;
                            d25 = d25;
                            z96 = z93;
                            throw new IllegalStateException("运行配置发布失败");
                        }
                        locationRepository.runtimeAuthorization.requireAuthorized(set5);
                        z96 = z93;
                        locationRepository.settingsManager.b.edit().putBoolean("is_spoofing_active", true).apply();
                        context10 = context10;
                        locationRepository.spoofingServiceController.startForeground(context10, d22, d23);
                        d25 = d25;
                        z97 = z91;
                        d22 = d22;
                        d23 = d23;
                        RuntimeAuthorization value8 = locationRepository.runtimeAuthorization.getAuthorization().getValue();
                        value8.getClass();
                        runGeneration = value8.getRunGeneration();
                        locationRepository2 = locationRepository;
                        locationRepository$startSpoofingInternal$2$2 = new LocationRepository$startSpoofingInternal$2$2(locationRepository2, runGeneration, set5, null);
                        c00841.L$0 = context10;
                        context10 = context10;
                        c00841.L$1 = null;
                        c00841.L$2 = null;
                        c00841.L$3 = null;
                        c00841.L$4 = null;
                        c00841.L$5 = null;
                        c00841.L$6 = null;
                        c00841.L$7 = mutex7;
                        c00841.L$8 = null;
                        c00841.D$0 = d22;
                        c00841.D$1 = d23;
                        c00841.F$0 = f5;
                        c00841.J$0 = j6;
                        c00841.Z$0 = z51;
                        c00841.Z$1 = z47;
                        c00841.Z$2 = z92;
                        c00841.Z$3 = z90;
                        z91 = z97;
                        c00841.Z$4 = z91;
                        d22 = d22;
                        c00841.D$2 = d25;
                        mutex7 = mutex7;
                        c00841.Z$5 = z96;
                        z96 = z96;
                        z98 = z94;
                        c00841.Z$6 = z98;
                        z94 = z98;
                        i26 = i9;
                        c00841.I$0 = i26;
                        i9 = i26;
                        z99 = z45;
                        c00841.Z$7 = z99;
                        z45 = z99;
                        z100 = z95;
                        c00841.Z$8 = z100;
                        z95 = z100;
                        i27 = i24;
                        c00841.I$1 = i27;
                        i24 = i27;
                        i28 = i25;
                        c00841.I$2 = i28;
                        i25 = i28;
                        i29 = i23;
                        c00841.I$3 = i29;
                        d25 = d25;
                        d26 = d24;
                        c00841.D$3 = d26;
                        c00841.Z$9 = zBooleanValue;
                        c00841.J$1 = runGeneration;
                        c00841.label = 6;
                        z70Var5 = z70Var;
                        if (TimeoutKt.withTimeout(10000L, locationRepository$startSpoofingInternal$2$2, c00841) != z70Var5) {
                            z70Var = z70Var5;
                            z101 = z90;
                            i30 = i25;
                            mutex8 = mutex7;
                            d27 = d25;
                            j9 = runGeneration;
                            context11 = context10;
                            z102 = z91;
                            i31 = i29;
                            z103 = z94;
                            z104 = zBooleanValue;
                            z105 = z92;
                            i32 = i9;
                            i33 = i24;
                            z106 = z95;
                            d10 = d23;
                            z107 = z45;
                            d28 = d26;
                            d29 = d22;
                            runtimeAuthorizationManager2 = locationRepository.runtimeAuthorization;
                            c00841.L$0 = context11;
                            context12 = context11;
                            c00841.L$1 = null;
                            c00841.L$2 = null;
                            c00841.L$3 = null;
                            c00841.L$4 = null;
                            c00841.L$5 = null;
                            c00841.L$6 = null;
                            c00841.L$7 = mutex8;
                            c00841.L$8 = null;
                            c00841.D$0 = d29;
                            c00841.D$1 = d10;
                            c00841.F$0 = f5;
                            c00841.J$0 = j6;
                            c00841.Z$0 = z51;
                            c00841.Z$1 = z47;
                            c00841.Z$2 = z105;
                            c00841.Z$3 = z101;
                            z109 = z102;
                            c00841.Z$4 = z109;
                            d30 = d29;
                            z108 = z101;
                            d31 = d27;
                            c00841.D$2 = d31;
                            z102 = z109;
                            z110 = z96;
                            c00841.Z$5 = z110;
                            z96 = z110;
                            z111 = z103;
                            c00841.Z$6 = z111;
                            z103 = z111;
                            i35 = i32;
                            c00841.I$0 = i35;
                            i32 = i35;
                            z112 = z107;
                            c00841.Z$7 = z112;
                            z107 = z112;
                            z113 = z106;
                            c00841.Z$8 = z113;
                            z106 = z113;
                            i36 = i33;
                            c00841.I$1 = i36;
                            i33 = i36;
                            i37 = i30;
                            c00841.I$2 = i37;
                            i34 = i37;
                            c00841.I$3 = i31;
                            c00841.D$3 = d28;
                            c00841.Z$9 = z104;
                            c00841.J$1 = j9;
                            c00841.label = 7;
                            z70Var5 = z70Var;
                            if (runtimeAuthorizationManager2.confirmStarted(c00841) != z70Var5) {
                                mutex9 = mutex8;
                                mutex2 = mutex9;
                                mutex2.unlock(null);
                                return mf3.a;
                            }
                        }
                        z70Var = z70Var;
                        z48 = z92;
                        i8 = i25;
                        i7 = i24;
                        z44 = z95;
                        z46 = z94;
                        mutex3 = mutex7;
                        z50 = z96;
                        d11 = d25;
                        th = th;
                        d10 = d23;
                        z49 = z91;
                        z51 = z51;
                        z43 = z90;
                        context6 = context10;
                        d12 = d22;
                        nonCancellable = NonCancellable.INSTANCE;
                        locationRepository$startSpoofingInternal$2$3 = new LocationRepository$startSpoofingInternal$2$3(th, locationRepository, context6, null);
                        c00841.L$0 = null;
                        c00841.L$1 = null;
                        c00841.L$2 = null;
                        c00841.L$3 = null;
                        c00841.L$4 = null;
                        c00841.L$5 = null;
                        c00841.L$6 = null;
                        c00841.L$7 = mutex3;
                        c00841.L$8 = th;
                        c00841.L$9 = null;
                        c00841.D$0 = d12;
                        c00841.D$1 = d10;
                        c00841.F$0 = f5;
                        c00841.J$0 = j6;
                        c00841.Z$0 = z51;
                        c00841.Z$1 = z47;
                        c00841.Z$2 = z48;
                        c00841.Z$3 = z43;
                        c00841.Z$4 = z49;
                        c00841.D$2 = d11;
                        c00841.Z$5 = z50;
                        c00841.Z$6 = z46;
                        c00841.I$0 = i9;
                        c00841.Z$7 = z45;
                        c00841.Z$8 = z44;
                        c00841.I$1 = i7;
                        c00841.I$2 = i8;
                        c00841.label = 8;
                        z70Var6 = z70Var;
                        if (BuildersKt.withContext(nonCancellable, locationRepository$startSpoofingInternal$2$3, c00841) == z70Var6) {
                            return z70Var6;
                        }
                        throw th;
                    }
                    return z70Var5;
                } catch (Throwable th100) {
                    z44 = z132;
                    z45 = z133;
                    i9 = i44;
                    d11 = d38;
                    i8 = i42;
                    z47 = z139;
                    i7 = i43;
                    f5 = f9;
                    z70Var = z70Var7;
                    d12 = d40;
                    z43 = z137;
                    z48 = z138;
                    z46 = z134;
                    z50 = z135;
                    j6 = j12;
                    d10 = d39;
                    mutex3 = mutex11;
                    c00841 = c00841;
                    locationRepository = this;
                    th = th100;
                    z51 = z140;
                    z49 = z136;
                    context6 = context20;
                }
                mutex3.unlock(obj2);
                throw th;
            case 4:
                int i45 = c00841.I$2;
                int i46 = c00841.I$1;
                boolean z141 = c00841.Z$8;
                boolean z142 = c00841.Z$7;
                int i47 = c00841.I$0;
                boolean z143 = c00841.Z$6;
                boolean z144 = c00841.Z$5;
                double d41 = c00841.D$2;
                boolean z145 = c00841.Z$4;
                boolean z146 = c00841.Z$3;
                boolean z147 = c00841.Z$2;
                i19 = i46;
                boolean z148 = c00841.Z$1;
                boolean z149 = c00841.Z$0;
                z75 = z146;
                long j13 = c00841.J$0;
                float f10 = c00841.F$0;
                double d42 = c00841.D$1;
                d18 = c00841.D$0;
                Set<String> set14 = (Set) c00841.L$8;
                Mutex mutex12 = (Mutex) c00841.L$7;
                Map<String, String> map9 = (Map) c00841.L$3;
                List<RoutePoint> list7 = (List) c00841.L$2;
                String str31 = (String) c00841.L$1;
                Context context21 = (Context) c00841.L$0;
                try {
                    ee0.J(obj3);
                    map5 = map9;
                    list3 = list7;
                    C00841 c00843 = c00841;
                    locationRepository = this;
                    c00841 = c00843;
                    i20 = i45;
                    z77 = z142;
                    d17 = d41;
                    z74 = z148;
                    z51 = z149;
                    context9 = context21;
                    z81 = z147;
                    z78 = z141;
                    i18 = i47;
                    z80 = z145;
                    f5 = f10;
                    d10 = d42;
                    mutex6 = mutex12;
                    z79 = z143;
                    z76 = z144;
                    j6 = j13;
                    z70Var4 = z70Var7;
                    set3 = set14;
                    str16 = str31;
                    z82 = z81;
                    z84 = z74;
                    str17 = "0.0";
                    string = locationRepository.settingsManager.b.getString("altitude", "0.0");
                    if (string != null) {
                        str17 = string;
                    }
                    dR = r13.R(str17);
                    if (dR != null) {
                        dDoubleValue = dR.doubleValue();
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    str18 = "10";
                    string2 = locationRepository.settingsManager.b.getString("satellite_count", "10");
                    if (string2 != null) {
                        str18 = string2;
                    }
                    numA0 = s13.a0(str18);
                    if (numA0 != null) {
                        iIntValue = numA0.intValue();
                        break;
                    } else {
                        iIntValue = 20;
                    }
                    ConfigManager configManager9 = locationRepository.configManager;
                    SpoofingState spoofingState10 = SpoofingState.INSTANCE;
                    String wifiJson9 = spoofingState10.getWifiJson();
                    String cellJson9 = spoofingState10.getCellJson();
                    String bluetoothJson9 = spoofingState10.getBluetoothJson();
                    c00841.L$0 = context9;
                    c00841.L$1 = null;
                    c00841.L$2 = null;
                    c00841.L$3 = null;
                    c00841.L$4 = null;
                    c00841.L$5 = null;
                    c00841.L$6 = null;
                    c00841.L$7 = mutex6;
                    c00841.L$8 = set3;
                    c00841.D$0 = d18;
                    c00841.D$1 = d10;
                    c00841.F$0 = f5;
                    c00841.J$0 = j6;
                    c00841.Z$0 = z51;
                    z74 = z84;
                    c00841.Z$1 = z74;
                    Set<String> set15 = set3;
                    c00841.Z$2 = z82;
                    z82 = z82;
                    z85 = z75;
                    c00841.Z$3 = z85;
                    z75 = z85;
                    z86 = z80;
                    c00841.Z$4 = z86;
                    z80 = z86;
                    d20 = d18;
                    d19 = d17;
                    c00841.D$2 = d19;
                    z76 = z76;
                    c00841.Z$5 = z76;
                    d19 = d19;
                    z87 = z79;
                    c00841.Z$6 = z87;
                    i18 = i18;
                    c00841.I$0 = i18;
                    z79 = z87;
                    z88 = z77;
                    c00841.Z$7 = z88;
                    z77 = z88;
                    z89 = z78;
                    c00841.Z$8 = z89;
                    z78 = z89;
                    i19 = i19;
                    c00841.I$1 = i19;
                    z83 = z74;
                    i21 = i20;
                    c00841.I$2 = i21;
                    c00841.I$3 = iIntValue;
                    i18 = i18;
                    d21 = dDoubleValue;
                    c00841.D$3 = d21;
                    i22 = iIntValue;
                    c00841.label = 5;
                    i20 = i21;
                    i19 = i19;
                    mutex6 = mutex6;
                    Context context113 = context9;
                    String str117 = str16;
                    set4 = set15;
                    z78 = z78;
                    c00842 = c00841;
                    context9 = context113;
                    z70Var5 = z70Var4;
                    d19 = d19;
                    z76 = z76;
                    d18 = d20;
                    objSaveConfig = configManager9.saveConfig(d18, d10, true, str117, f5, j6, list3, z51, wifiJson9, map5, cellJson9, bluetoothJson9, z83, z82, z75, z80, d21, i22, d19, z76, z79, i18, z77, c00842);
                    c00841 = c00842;
                    if (objSaveConfig != z70Var5) {
                        z70Var = z70Var5;
                        d22 = d18;
                        d23 = d10;
                        d24 = d21;
                        z47 = z83;
                        z90 = z75;
                        z91 = z80;
                        z92 = z82;
                        i23 = i22;
                        d25 = d19;
                        z93 = z76;
                        z94 = z79;
                        i9 = i18;
                        z45 = z77;
                        context10 = context9;
                        mutex7 = mutex6;
                        z95 = z78;
                        i24 = i19;
                        i25 = i20;
                        obj = objSaveConfig;
                        set5 = set4;
                        zBooleanValue = ((Boolean) obj).booleanValue();
                        if (!zBooleanValue) {
                            mutex7 = mutex7;
                            d25 = d25;
                            z96 = z93;
                            throw new IllegalStateException("运行配置发布失败");
                        }
                        locationRepository.runtimeAuthorization.requireAuthorized(set5);
                        z96 = z93;
                        locationRepository.settingsManager.b.edit().putBoolean("is_spoofing_active", true).apply();
                        context10 = context10;
                        locationRepository.spoofingServiceController.startForeground(context10, d22, d23);
                        d25 = d25;
                        z97 = z91;
                        d22 = d22;
                        d23 = d23;
                        RuntimeAuthorization value9 = locationRepository.runtimeAuthorization.getAuthorization().getValue();
                        value9.getClass();
                        runGeneration = value9.getRunGeneration();
                        locationRepository2 = locationRepository;
                        locationRepository$startSpoofingInternal$2$2 = new LocationRepository$startSpoofingInternal$2$2(locationRepository2, runGeneration, set5, null);
                        c00841.L$0 = context10;
                        context10 = context10;
                        c00841.L$1 = null;
                        c00841.L$2 = null;
                        c00841.L$3 = null;
                        c00841.L$4 = null;
                        c00841.L$5 = null;
                        c00841.L$6 = null;
                        c00841.L$7 = mutex7;
                        c00841.L$8 = null;
                        c00841.D$0 = d22;
                        c00841.D$1 = d23;
                        c00841.F$0 = f5;
                        c00841.J$0 = j6;
                        c00841.Z$0 = z51;
                        c00841.Z$1 = z47;
                        c00841.Z$2 = z92;
                        c00841.Z$3 = z90;
                        z91 = z97;
                        c00841.Z$4 = z91;
                        d22 = d22;
                        c00841.D$2 = d25;
                        mutex7 = mutex7;
                        c00841.Z$5 = z96;
                        z96 = z96;
                        z98 = z94;
                        c00841.Z$6 = z98;
                        z94 = z98;
                        i26 = i9;
                        c00841.I$0 = i26;
                        i9 = i26;
                        z99 = z45;
                        c00841.Z$7 = z99;
                        z45 = z99;
                        z100 = z95;
                        c00841.Z$8 = z100;
                        z95 = z100;
                        i27 = i24;
                        c00841.I$1 = i27;
                        i24 = i27;
                        i28 = i25;
                        c00841.I$2 = i28;
                        i25 = i28;
                        i29 = i23;
                        c00841.I$3 = i29;
                        d25 = d25;
                        d26 = d24;
                        c00841.D$3 = d26;
                        c00841.Z$9 = zBooleanValue;
                        c00841.J$1 = runGeneration;
                        c00841.label = 6;
                        z70Var5 = z70Var;
                        if (TimeoutKt.withTimeout(10000L, locationRepository$startSpoofingInternal$2$2, c00841) != z70Var5) {
                            z70Var = z70Var5;
                            z101 = z90;
                            i30 = i25;
                            mutex8 = mutex7;
                            d27 = d25;
                            j9 = runGeneration;
                            context11 = context10;
                            z102 = z91;
                            i31 = i29;
                            z103 = z94;
                            z104 = zBooleanValue;
                            z105 = z92;
                            i32 = i9;
                            i33 = i24;
                            z106 = z95;
                            d10 = d23;
                            z107 = z45;
                            d28 = d26;
                            d29 = d22;
                            runtimeAuthorizationManager2 = locationRepository.runtimeAuthorization;
                            c00841.L$0 = context11;
                            context12 = context11;
                            c00841.L$1 = null;
                            c00841.L$2 = null;
                            c00841.L$3 = null;
                            c00841.L$4 = null;
                            c00841.L$5 = null;
                            c00841.L$6 = null;
                            c00841.L$7 = mutex8;
                            c00841.L$8 = null;
                            c00841.D$0 = d29;
                            c00841.D$1 = d10;
                            c00841.F$0 = f5;
                            c00841.J$0 = j6;
                            c00841.Z$0 = z51;
                            c00841.Z$1 = z47;
                            c00841.Z$2 = z105;
                            c00841.Z$3 = z101;
                            z109 = z102;
                            c00841.Z$4 = z109;
                            d30 = d29;
                            z108 = z101;
                            d31 = d27;
                            c00841.D$2 = d31;
                            z102 = z109;
                            z110 = z96;
                            c00841.Z$5 = z110;
                            z96 = z110;
                            z111 = z103;
                            c00841.Z$6 = z111;
                            z103 = z111;
                            i35 = i32;
                            c00841.I$0 = i35;
                            i32 = i35;
                            z112 = z107;
                            c00841.Z$7 = z112;
                            z107 = z112;
                            z113 = z106;
                            c00841.Z$8 = z113;
                            z106 = z113;
                            i36 = i33;
                            c00841.I$1 = i36;
                            i33 = i36;
                            i37 = i30;
                            c00841.I$2 = i37;
                            i34 = i37;
                            c00841.I$3 = i31;
                            c00841.D$3 = d28;
                            c00841.Z$9 = z104;
                            c00841.J$1 = j9;
                            c00841.label = 7;
                            z70Var5 = z70Var;
                            if (runtimeAuthorizationManager2.confirmStarted(c00841) != z70Var5) {
                                mutex9 = mutex8;
                                mutex2 = mutex9;
                                mutex2.unlock(null);
                                return mf3.a;
                            }
                        }
                        z70Var = z70Var;
                        z48 = z92;
                        i8 = i25;
                        i7 = i24;
                        z44 = z95;
                        z46 = z94;
                        mutex3 = mutex7;
                        z50 = z96;
                        d11 = d25;
                        th = th;
                        d10 = d23;
                        z49 = z91;
                        z51 = z51;
                        z43 = z90;
                        context6 = context10;
                        d12 = d22;
                        nonCancellable = NonCancellable.INSTANCE;
                        locationRepository$startSpoofingInternal$2$3 = new LocationRepository$startSpoofingInternal$2$3(th, locationRepository, context6, null);
                        c00841.L$0 = null;
                        c00841.L$1 = null;
                        c00841.L$2 = null;
                        c00841.L$3 = null;
                        c00841.L$4 = null;
                        c00841.L$5 = null;
                        c00841.L$6 = null;
                        c00841.L$7 = mutex3;
                        c00841.L$8 = th;
                        c00841.L$9 = null;
                        c00841.D$0 = d12;
                        c00841.D$1 = d10;
                        c00841.F$0 = f5;
                        c00841.J$0 = j6;
                        c00841.Z$0 = z51;
                        c00841.Z$1 = z47;
                        c00841.Z$2 = z48;
                        c00841.Z$3 = z43;
                        c00841.Z$4 = z49;
                        c00841.D$2 = d11;
                        c00841.Z$5 = z50;
                        c00841.Z$6 = z46;
                        c00841.I$0 = i9;
                        c00841.Z$7 = z45;
                        c00841.Z$8 = z44;
                        c00841.I$1 = i7;
                        c00841.I$2 = i8;
                        c00841.label = 8;
                        z70Var6 = z70Var;
                        if (BuildersKt.withContext(nonCancellable, locationRepository$startSpoofingInternal$2$3, c00841) == z70Var6) {
                            return z70Var6;
                        }
                        throw th;
                    }
                    return z70Var5;
                } catch (Throwable th101) {
                    z44 = z141;
                    i8 = i45;
                    z45 = z142;
                    d11 = d41;
                    i7 = i19;
                    z47 = z148;
                    c00841 = c00841;
                    z70Var = z70Var7;
                    d12 = d18;
                    z48 = z147;
                    i9 = i47;
                    f5 = f10;
                    d10 = d42;
                    mutex3 = mutex12;
                    locationRepository = this;
                    th = th101;
                    z51 = z149;
                    z50 = z144;
                    z46 = z143;
                    j6 = j13;
                    z49 = z145;
                    z43 = z75;
                    context6 = context21;
                }
                break;
            case Logger.WARN /* 5 */:
                obj = obj3;
                double d43 = c00841.D$3;
                int i48 = c00841.I$3;
                int i49 = c00841.I$2;
                int i50 = c00841.I$1;
                boolean z150 = c00841.Z$8;
                boolean z151 = c00841.Z$7;
                int i51 = c00841.I$0;
                boolean z152 = c00841.Z$6;
                boolean z153 = c00841.Z$5;
                double d44 = c00841.D$2;
                boolean z154 = c00841.Z$4;
                boolean z155 = c00841.Z$3;
                boolean z156 = c00841.Z$2;
                boolean z157 = c00841.Z$1;
                boolean z158 = c00841.Z$0;
                long j14 = c00841.J$0;
                float f11 = c00841.F$0;
                double d45 = c00841.D$1;
                double d46 = c00841.D$0;
                set4 = (Set) c00841.L$8;
                Mutex mutex13 = (Mutex) c00841.L$7;
                context10 = (Context) c00841.L$0;
                try {
                    ee0.J(obj);
                    d22 = d46;
                    d25 = d44;
                    d24 = d43;
                    z90 = z155;
                    z51 = z158;
                    d23 = d45;
                    i23 = i48;
                    z95 = z150;
                    i25 = i49;
                    z45 = z151;
                    i9 = i51;
                    z92 = z156;
                    f5 = f11;
                    c00841 = c00841;
                    i24 = i50;
                    z93 = z153;
                    locationRepository = this;
                    z91 = z154;
                    z47 = z157;
                    mutex7 = mutex13;
                    z70Var = z70Var7;
                    z94 = z152;
                    j6 = j14;
                    set5 = set4;
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    if (!zBooleanValue) {
                        mutex7 = mutex7;
                        d25 = d25;
                        z96 = z93;
                        throw new IllegalStateException("运行配置发布失败");
                    }
                    locationRepository.runtimeAuthorization.requireAuthorized(set5);
                    z96 = z93;
                    locationRepository.settingsManager.b.edit().putBoolean("is_spoofing_active", true).apply();
                    context10 = context10;
                    locationRepository.spoofingServiceController.startForeground(context10, d22, d23);
                    d25 = d25;
                    z97 = z91;
                    d22 = d22;
                    d23 = d23;
                    RuntimeAuthorization value10 = locationRepository.runtimeAuthorization.getAuthorization().getValue();
                    value10.getClass();
                    runGeneration = value10.getRunGeneration();
                    locationRepository2 = locationRepository;
                    locationRepository$startSpoofingInternal$2$2 = new LocationRepository$startSpoofingInternal$2$2(locationRepository2, runGeneration, set5, null);
                    c00841.L$0 = context10;
                    context10 = context10;
                    c00841.L$1 = null;
                    c00841.L$2 = null;
                    c00841.L$3 = null;
                    c00841.L$4 = null;
                    c00841.L$5 = null;
                    c00841.L$6 = null;
                    c00841.L$7 = mutex7;
                    c00841.L$8 = null;
                    c00841.D$0 = d22;
                    c00841.D$1 = d23;
                    c00841.F$0 = f5;
                    c00841.J$0 = j6;
                    c00841.Z$0 = z51;
                    c00841.Z$1 = z47;
                    c00841.Z$2 = z92;
                    c00841.Z$3 = z90;
                    z91 = z97;
                    c00841.Z$4 = z91;
                    d22 = d22;
                    c00841.D$2 = d25;
                    mutex7 = mutex7;
                    c00841.Z$5 = z96;
                    z96 = z96;
                    z98 = z94;
                    c00841.Z$6 = z98;
                    z94 = z98;
                    i26 = i9;
                    c00841.I$0 = i26;
                    i9 = i26;
                    z99 = z45;
                    c00841.Z$7 = z99;
                    z45 = z99;
                    z100 = z95;
                    c00841.Z$8 = z100;
                    z95 = z100;
                    i27 = i24;
                    c00841.I$1 = i27;
                    i24 = i27;
                    i28 = i25;
                    c00841.I$2 = i28;
                    i25 = i28;
                    i29 = i23;
                    c00841.I$3 = i29;
                    d25 = d25;
                    d26 = d24;
                    c00841.D$3 = d26;
                    c00841.Z$9 = zBooleanValue;
                    c00841.J$1 = runGeneration;
                    c00841.label = 6;
                    z70Var5 = z70Var;
                    if (TimeoutKt.withTimeout(10000L, locationRepository$startSpoofingInternal$2$2, c00841) != z70Var5) {
                        z70Var = z70Var5;
                        z101 = z90;
                        i30 = i25;
                        mutex8 = mutex7;
                        d27 = d25;
                        j9 = runGeneration;
                        context11 = context10;
                        z102 = z91;
                        i31 = i29;
                        z103 = z94;
                        z104 = zBooleanValue;
                        z105 = z92;
                        i32 = i9;
                        i33 = i24;
                        z106 = z95;
                        d10 = d23;
                        z107 = z45;
                        d28 = d26;
                        d29 = d22;
                        runtimeAuthorizationManager2 = locationRepository.runtimeAuthorization;
                        c00841.L$0 = context11;
                        context12 = context11;
                        c00841.L$1 = null;
                        c00841.L$2 = null;
                        c00841.L$3 = null;
                        c00841.L$4 = null;
                        c00841.L$5 = null;
                        c00841.L$6 = null;
                        c00841.L$7 = mutex8;
                        c00841.L$8 = null;
                        c00841.D$0 = d29;
                        c00841.D$1 = d10;
                        c00841.F$0 = f5;
                        c00841.J$0 = j6;
                        c00841.Z$0 = z51;
                        c00841.Z$1 = z47;
                        c00841.Z$2 = z105;
                        c00841.Z$3 = z101;
                        z109 = z102;
                        c00841.Z$4 = z109;
                        d30 = d29;
                        z108 = z101;
                        d31 = d27;
                        c00841.D$2 = d31;
                        z102 = z109;
                        z110 = z96;
                        c00841.Z$5 = z110;
                        z96 = z110;
                        z111 = z103;
                        c00841.Z$6 = z111;
                        z103 = z111;
                        i35 = i32;
                        c00841.I$0 = i35;
                        i32 = i35;
                        z112 = z107;
                        c00841.Z$7 = z112;
                        z107 = z112;
                        z113 = z106;
                        c00841.Z$8 = z113;
                        z106 = z113;
                        i36 = i33;
                        c00841.I$1 = i36;
                        i33 = i36;
                        i37 = i30;
                        c00841.I$2 = i37;
                        i34 = i37;
                        c00841.I$3 = i31;
                        c00841.D$3 = d28;
                        c00841.Z$9 = z104;
                        c00841.J$1 = j9;
                        c00841.label = 7;
                        z70Var5 = z70Var;
                        if (runtimeAuthorizationManager2.confirmStarted(c00841) != z70Var5) {
                            mutex9 = mutex8;
                            mutex2 = mutex9;
                            mutex2.unlock(null);
                            return mf3.a;
                        }
                    }
                    return z70Var5;
                    z70Var = z70Var;
                    z48 = z92;
                    i8 = i25;
                    i7 = i24;
                    z44 = z95;
                    z46 = z94;
                    mutex3 = mutex7;
                    z50 = z96;
                    d11 = d25;
                    th = th;
                    d10 = d23;
                    z49 = z91;
                    z51 = z51;
                    z43 = z90;
                    context6 = context10;
                    d12 = d22;
                } catch (Throwable th102) {
                    i7 = i50;
                    z44 = z150;
                    i8 = i49;
                    z45 = z151;
                    d11 = d44;
                    f5 = f11;
                    d10 = d45;
                    context6 = context10;
                    c00841 = c00841;
                    locationRepository = this;
                    th = th102;
                    z51 = z158;
                    z50 = z153;
                    d12 = d46;
                    z48 = z156;
                    z46 = z152;
                    z70Var = z70Var7;
                    mutex3 = mutex13;
                    z49 = z154;
                    z43 = z155;
                    z47 = z157;
                    i9 = i51;
                    j6 = j14;
                }
                nonCancellable = NonCancellable.INSTANCE;
                locationRepository$startSpoofingInternal$2$3 = new LocationRepository$startSpoofingInternal$2$3(th, locationRepository, context6, null);
                c00841.L$0 = null;
                c00841.L$1 = null;
                c00841.L$2 = null;
                c00841.L$3 = null;
                c00841.L$4 = null;
                c00841.L$5 = null;
                c00841.L$6 = null;
                c00841.L$7 = mutex3;
                c00841.L$8 = th;
                c00841.L$9 = null;
                c00841.D$0 = d12;
                c00841.D$1 = d10;
                c00841.F$0 = f5;
                c00841.J$0 = j6;
                c00841.Z$0 = z51;
                c00841.Z$1 = z47;
                c00841.Z$2 = z48;
                c00841.Z$3 = z43;
                c00841.Z$4 = z49;
                c00841.D$2 = d11;
                c00841.Z$5 = z50;
                c00841.Z$6 = z46;
                c00841.I$0 = i9;
                c00841.Z$7 = z45;
                c00841.Z$8 = z44;
                c00841.I$1 = i7;
                c00841.I$2 = i8;
                c00841.label = 8;
                z70Var6 = z70Var;
                if (BuildersKt.withContext(nonCancellable, locationRepository$startSpoofingInternal$2$3, c00841) == z70Var6) {
                    return z70Var6;
                }
                throw th;
            case Logger.ERROR /* 6 */:
                long j15 = c00841.J$1;
                boolean z159 = c00841.Z$9;
                double d47 = c00841.D$3;
                int i52 = c00841.I$3;
                int i53 = c00841.I$2;
                int i54 = c00841.I$1;
                boolean z160 = c00841.Z$8;
                boolean z161 = c00841.Z$7;
                int i55 = c00841.I$0;
                boolean z162 = c00841.Z$6;
                boolean z163 = c00841.Z$5;
                double d48 = c00841.D$2;
                boolean z164 = c00841.Z$4;
                boolean z165 = c00841.Z$3;
                boolean z166 = c00841.Z$2;
                boolean z167 = c00841.Z$1;
                boolean z168 = c00841.Z$0;
                long j16 = c00841.J$0;
                float f12 = c00841.F$0;
                double d49 = c00841.D$1;
                d29 = c00841.D$0;
                Mutex mutex14 = (Mutex) c00841.L$7;
                Context context22 = (Context) c00841.L$0;
                try {
                    ee0.J(obj3);
                    z103 = z162;
                    z51 = z168;
                    i30 = i53;
                    z96 = z163;
                    j9 = j15;
                    d27 = d48;
                    z47 = z167;
                    z104 = z159;
                    mutex8 = mutex14;
                    d28 = d47;
                    i33 = i54;
                    z107 = z161;
                    f5 = f12;
                    d10 = d49;
                    C00841 c00844 = c00841;
                    locationRepository = this;
                    context11 = context22;
                    c00841 = c00844;
                    z70Var = z70Var7;
                    z101 = z165;
                    i32 = i55;
                    z105 = z166;
                    z106 = z160;
                    j6 = j16;
                    i31 = i52;
                    z102 = z164;
                    runtimeAuthorizationManager2 = locationRepository.runtimeAuthorization;
                    c00841.L$0 = context11;
                    context12 = context11;
                    c00841.L$1 = null;
                    c00841.L$2 = null;
                    c00841.L$3 = null;
                    c00841.L$4 = null;
                    c00841.L$5 = null;
                    c00841.L$6 = null;
                    c00841.L$7 = mutex8;
                    c00841.L$8 = null;
                    c00841.D$0 = d29;
                    c00841.D$1 = d10;
                    c00841.F$0 = f5;
                    c00841.J$0 = j6;
                    c00841.Z$0 = z51;
                    c00841.Z$1 = z47;
                    c00841.Z$2 = z105;
                    c00841.Z$3 = z101;
                    z109 = z102;
                    c00841.Z$4 = z109;
                    d30 = d29;
                    z108 = z101;
                    d31 = d27;
                    c00841.D$2 = d31;
                    z102 = z109;
                    z110 = z96;
                    c00841.Z$5 = z110;
                    z96 = z110;
                    z111 = z103;
                    c00841.Z$6 = z111;
                    z103 = z111;
                    i35 = i32;
                    c00841.I$0 = i35;
                    i32 = i35;
                    z112 = z107;
                    c00841.Z$7 = z112;
                    z107 = z112;
                    z113 = z106;
                    c00841.Z$8 = z113;
                    z106 = z113;
                    i36 = i33;
                    c00841.I$1 = i36;
                    i33 = i36;
                    i37 = i30;
                    c00841.I$2 = i37;
                    i34 = i37;
                    c00841.I$3 = i31;
                    c00841.D$3 = d28;
                    c00841.Z$9 = z104;
                    c00841.J$1 = j9;
                    c00841.label = 7;
                    z70Var5 = z70Var;
                    if (runtimeAuthorizationManager2.confirmStarted(c00841) != z70Var5) {
                        mutex9 = mutex8;
                        mutex2 = mutex9;
                        mutex2.unlock(null);
                        return mf3.a;
                    }
                    return z70Var5;
                } catch (Throwable th103) {
                    c00841 = c00841;
                    i8 = i53;
                    i7 = i54;
                    z44 = z160;
                    d11 = d48;
                    z47 = z167;
                    f5 = f12;
                    d10 = d49;
                    locationRepository = this;
                    z45 = z161;
                    i9 = i55;
                    z50 = z163;
                    j6 = j16;
                    context6 = context22;
                    th = th103;
                    z51 = z168;
                    z43 = z165;
                    z49 = z164;
                    z70Var = z70Var7;
                    mutex3 = mutex14;
                    z46 = z162;
                    d12 = d29;
                    z48 = z166;
                }
                break;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                int i56 = c00841.I$2;
                int i57 = c00841.I$1;
                boolean z169 = c00841.Z$8;
                boolean z170 = c00841.Z$7;
                int i58 = c00841.I$0;
                boolean z171 = c00841.Z$6;
                boolean z172 = c00841.Z$5;
                double d50 = c00841.D$2;
                boolean z173 = c00841.Z$4;
                boolean z174 = c00841.Z$3;
                boolean z175 = c00841.Z$2;
                i7 = i57;
                boolean z176 = c00841.Z$1;
                boolean z177 = c00841.Z$0;
                long j17 = c00841.J$0;
                float f13 = c00841.F$0;
                double d51 = c00841.D$1;
                double d52 = c00841.D$0;
                mutex9 = (Mutex) c00841.L$7;
                Context context23 = (Context) c00841.L$0;
                try {
                    ee0.J(obj3);
                    mutex2 = mutex9;
                    mutex2.unlock(null);
                    return mf3.a;
                } catch (Throwable th104) {
                    i8 = i56;
                    d11 = d50;
                    c00841 = c00841;
                    locationRepository = this;
                    th = th104;
                    z51 = z177;
                    i9 = i58;
                    z70Var = z70Var7;
                    z46 = z171;
                    z47 = z176;
                    z44 = z169;
                    mutex3 = mutex9;
                    z45 = z170;
                    d10 = d51;
                    z49 = z173;
                    z43 = z174;
                    context6 = context23;
                    d12 = d52;
                    z48 = z175;
                    f5 = f13;
                    z50 = z172;
                    j6 = j17;
                }
                break;
            case 8:
                Throwable th105 = (Throwable) c00841.L$8;
                mutex3 = (Mutex) c00841.L$7;
                try {
                    ee0.J(obj3);
                    throw th105;
                } catch (Throwable th106) {
                    th = th106;
                    obj2 = null;
                }
                break;
            default:
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public static /* synthetic */ Object startSpoofingInternal$default(LocationRepository locationRepository, Context context, double d, double d2, String str, float f, long j, List list, boolean z, Map map, String str2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5, double d3, boolean z6, boolean z7, int i, boolean z8, boolean z9, q60 q60Var, int i2, Object obj) {
        return locationRepository.startSpoofingInternal(context, d, d2, str, f, j, list, z, map, (i2 & 512) != 0 ? "[]" : str2, (i2 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? "[]" : str3, (i2 & 2048) != 0 ? "[]" : str4, (i2 & 4096) != 0 ? true : z2, (i2 & 8192) != 0 ? true : z3, (i2 & 16384) != 0 ? true : z4, (32768 & i2) != 0 ? true : z5, (65536 & i2) != 0 ? 0.0d : d3, (131072 & i2) != 0 ? false : z6, (262144 & i2) != 0 ? true : z7, (524288 & i2) != 0 ? 165 : i, (1048576 & i2) != 0 ? true : z8, (i2 & 2097152) != 0 ? false : z9, q60Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0111, code lost:
    
        if (r6 == r5) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x016e, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getIO(), new defpackage.vi2(r0, null, 1), r7) == r5) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0170, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object stopLocked(android.content.Context r43, defpackage.q60 r44) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vincenthzr.locationspoofer.data.repository.LocationRepository.stopLocked(android.content.Context, q60):java.lang.Object");
    }

    public static /* synthetic */ Object stopSpoofing$default(LocationRepository locationRepository, Context context, boolean z, q60 q60Var, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return locationRepository.stopSpoofing(context, z, q60Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 updateEnvironment$lambda$5(LocationRepository locationRepository, String str, String str2, String str3, JSONObject jSONObject) throws JSONException {
        jSONObject.getClass();
        locationRepository.configManager.putEnvironment(jSONObject, str, str2, str3);
        return mf3.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object checkRootAccess(q60 q60Var) {
        C00821 c00821;
        if (q60Var instanceof C00821) {
            c00821 = (C00821) q60Var;
            int i = c00821.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00821.label = i - Integer.MIN_VALUE;
            } else {
                c00821 = new C00821(q60Var);
            }
        } else {
            c00821 = new C00821(q60Var);
        }
        Object objWithContext = c00821.result;
        z70 z70Var = z70.e;
        int i2 = c00821.label;
        if (i2 == 0) {
            ee0.J(objWithContext);
            wi2 wi2Var = this.rootManager;
            currentRootSolution();
            c00821.label = 1;
            wi2Var.getClass();
            objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new ui2(wi2Var, null), c00821);
            if (objWithContext == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(objWithContext);
        }
        this.lastRootAccess = Boolean.valueOf(((Boolean) objWithContext).booleanValue());
        return objWithContext;
    }

    public final Object deleteSavedRoute(SavedRouteEntity savedRouteEntity, q60 q60Var) {
        Object objDeleteSavedRoute = this.savedRouteDao.deleteSavedRoute(savedRouteEntity, q60Var);
        return objDeleteSavedRoute == z70.e ? objDeleteSavedRoute : mf3.a;
    }

    public final Object forceStopApps(List<String> list, q60 q60Var) {
        wi2 wi2Var = this.rootManager;
        wi2Var.getClass();
        return BuildersKt.withContext(Dispatchers.getIO(), new l80(list, wi2Var, null, 12), q60Var);
    }

    public final Object getAllSavedRoutesList(q60 q60Var) {
        return this.savedRouteDao.getAllSavedRoutesList(q60Var);
    }

    public final Boolean getCachedRootAccess() {
        return this.lastRootAccess;
    }

    public final SharedFlow<mf3> getConfigWriteFailures() {
        return this.configManager.getWriteFailures();
    }

    public final boolean getHasLiveSimulation() {
        RuntimeAuthorization value = this.runtimeAuthorization.getAuthorization().getValue();
        if (value != null) {
            long runGeneration = value.getRunGeneration();
            if (this.runningContext != null && SpoofingState.INSTANCE.isActive() && this.settingsManager.b.getBoolean("is_spoofing_active", false) && this.spoofingServiceController.isRunningFor(runGeneration) && RuntimeAuthorizationManager.isAuthorized$default(this.runtimeAuthorization, null, 1, null)) {
                return true;
            }
        }
        return false;
    }

    public final StateFlow<RuntimeAuthorization> getRuntimeState() {
        return this.runtimeAuthorization.getAuthorization();
    }

    public final Flow<List<SavedRouteEntity>> getSavedRoutes() {
        return this.savedRouteDao.getAllSavedRoutes();
    }

    public final Object insertSavedRoute(String str, List<RoutePoint> list, q60 q60Var) {
        Object objInsertSavedRoute = this.savedRouteDao.insertSavedRoute(new SavedRouteEntity(0L, str, routePointsToJson(list), 0L, (String) null, 25, (ca0) null), q60Var);
        return objInsertSavedRoute == z70.e ? objInsertSavedRoute : mf3.a;
    }

    public final Object insertSavedRouteEntity(SavedRouteEntity savedRouteEntity, q60 q60Var) {
        Object objInsertSavedRoute = this.savedRouteDao.insertSavedRoute(savedRouteEntity, q60Var);
        return objInsertSavedRoute == z70.e ? objInsertSavedRoute : mf3.a;
    }

    public final boolean isFloatingJoystickShowing() {
        return this.spoofingServiceController.isFloatingJoystickShowing();
    }

    public final boolean isModuleActive() {
        return this.lsposedManager.isModuleActive();
    }

    public final Object patchConfig(lu0 lu0Var, q60 q60Var) {
        return this.configManager.patchConfig(lu0Var, q60Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object recoverAfterBoot(Context context, q60 q60Var) {
        C00831 c00831;
        Context context2;
        boolean z;
        boolean z2;
        boolean z3;
        if (q60Var instanceof C00831) {
            c00831 = (C00831) q60Var;
            int i = c00831.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00831.label = i - Integer.MIN_VALUE;
            } else {
                c00831 = new C00831(q60Var);
            }
        } else {
            c00831 = new C00831(q60Var);
        }
        Object obj = c00831.result;
        int i2 = c00831.label;
        Object obj2 = z70.e;
        try {
            if (i2 == 0) {
                ee0.J(obj);
                c00831.L$0 = context;
                c00831.label = 1;
                Object objCheckRootAccess = checkRootAccess(c00831);
                if (objCheckRootAccess != obj2) {
                    context2 = context;
                    obj = objCheckRootAccess;
                }
                return obj2;
            }
            if (i2 == 1) {
                context2 = (Context) c00831.L$0;
                ee0.J(obj);
            } else if (i2 == 2) {
                z3 = c00831.Z$0;
                try {
                    ee0.J(obj);
                } catch (Exception unused) {
                }
            } else {
                if (i2 != 3 && i2 != 4) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z3 = c00831.Z$0;
                ee0.J(obj);
            }
            z2 = z3;
            return Boolean.valueOf(z2);
            Boolean bool = (Boolean) obj;
            boolean zBooleanValue = bool.booleanValue();
            if (getHasLiveSimulation()) {
                return bool;
            }
            if (!this.settingsManager.b.getBoolean("is_spoofing_active", false)) {
                Context context3 = context2;
                z = zBooleanValue;
                C00831 c00832 = c00831;
                if (this.spoofingServiceController.isRunning()) {
                    c00832.L$0 = null;
                    c00832.Z$0 = z;
                    c00832.label = 4;
                    if (stopSpoofing(context3, false, c00832) == obj2) {
                        return obj2;
                    }
                } else {
                    z2 = z;
                }
                return Boolean.valueOf(z2);
            }
            String string = this.settingsManager.b.getString("last_spoofed_lat", "0");
            if (string == null) {
                string = "0";
            }
            Double dR = r13.R(string);
            double dDoubleValue = dR != null ? dR.doubleValue() : 0.0d;
            String string2 = this.settingsManager.b.getString("last_spoofed_lng", "0");
            Double dR2 = r13.R(string2 != null ? string2 : "0");
            double dDoubleValue2 = dR2 != null ? dR2.doubleValue() : 0.0d;
            if (dDoubleValue == 0.0d || dDoubleValue2 == 0.0d) {
                c00831.L$0 = null;
                c00831.Z$0 = zBooleanValue;
                c00831.D$0 = dDoubleValue;
                c00831.D$1 = dDoubleValue2;
                c00831.label = 3;
                if (stopSpoofing(context2, false, c00831) != obj2) {
                    z3 = zBooleanValue;
                }
                return obj2;
            }
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                uj0 uj0Var = uj0.e;
                LinkedHashMap linkedHashMapA = this.settingsManager.a();
                boolean z4 = this.settingsManager.b.getBoolean("mock_wifi", true);
                boolean z5 = this.settingsManager.b.getBoolean("mock_cell", true);
                boolean z6 = this.settingsManager.b.getBoolean("mock_bluetooth", true);
                boolean z7 = this.settingsManager.b.getBoolean("enable_jitter", true);
                c00831.L$0 = null;
                c00831.Z$0 = zBooleanValue;
                c00831.D$0 = dDoubleValue;
                c00831.D$1 = dDoubleValue2;
                c00831.label = 2;
                z = zBooleanValue;
                try {
                    if (startSpoofingInternal$default(this, context2, dDoubleValue, dDoubleValue2, "STILL", 0.0f, jCurrentTimeMillis, uj0Var, false, linkedHashMapA, null, null, null, z4, z5, z6, z7, 0.0d, false, false, 0, false, true, c00831, 2035200, null) == obj2) {
                        return obj2;
                    }
                } catch (Exception unused2) {
                }
            } catch (Exception unused3) {
                z = zBooleanValue;
            }
            z2 = z3;
            return Boolean.valueOf(z2);
            z3 = z;
            z2 = z3;
            return Boolean.valueOf(z2);
        } catch (CancellationException e) {
            throw e;
        }
    }

    public final void registerRuntimeStopSignal(String str, au0 au0Var) {
        str.getClass();
        au0Var.getClass();
        this.runtimeAuthorization.registerStopSignal(str, au0Var);
    }

    public final Job requestRuntimeStop(Context context) {
        context.getClass();
        this.runningContext = context.getApplicationContext();
        Job jobInvalidate$default = RuntimeAuthorizationManager.invalidate$default(this.runtimeAuthorization, true, null, 2, null);
        if (jobInvalidate$default != null) {
            return jobInvalidate$default;
        }
        fo.n("Required value was null.");
        return null;
    }

    public final void requireRuntimeAuthorized() throws CloudException {
        RuntimeAuthorizationManager.requireAuthorized$default(this.runtimeAuthorization, null, 1, null);
    }

    public final void setFloatingJoystickVisible(Context context, boolean z, boolean z2) {
        context.getClass();
        if (z && !z2) {
            RuntimeAuthorizationManager.requireAuthorized$default(this.runtimeAuthorization, null, 1, null);
        }
        this.spoofingServiceController.setFloatingJoystickVisible(context, z, z2);
    }

    public final Object startSpoofing(Context context, double d, double d2, String str, float f, long j, List<RoutePoint> list, boolean z, Map<String, String> map, String str2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5, double d3, boolean z6, boolean z7, int i, boolean z8, q60 q60Var) {
        Object objStartSpoofingInternal$default = startSpoofingInternal$default(this, context, d, d2, str, f, j, list, z, map, str2, str3, str4, z2, z3, z4, z5, d3, z6, z7, i, z8, false, q60Var, 2097152, null);
        return objStartSpoofingInternal$default == z70.e ? objStartSpoofingInternal$default : mf3.a;
    }

    public final Object stopSpoofing(Context context, boolean z, q60 q60Var) {
        z70 z70Var = z70.e;
        mf3 mf3Var = mf3.a;
        if (z) {
            Object objWithContext = BuildersKt.withContext(NonCancellable.INSTANCE, new AnonymousClass2(context, null), q60Var);
            return objWithContext == z70Var ? objWithContext : mf3Var;
        }
        Object objWithContext2 = BuildersKt.withContext(NonCancellable.INSTANCE, new AnonymousClass3(context, null), q60Var);
        return objWithContext2 == z70Var ? objWithContext2 : mf3Var;
    }

    public final Object testRootSetup(q60 q60Var) {
        wi2 wi2Var = this.rootManager;
        RootSolution rootSolutionCurrentRootSolution = currentRootSolution();
        wi2Var.getClass();
        return BuildersKt.withContext(Dispatchers.getIO(), new l80(wi2Var, rootSolutionCurrentRootSolution, null, 13), q60Var);
    }

    public final void unregisterRuntimeStopHandler(String str) {
        str.getClass();
        this.runtimeAuthorization.unregisterStopHandler(str);
    }

    public final Object updateConfig(double d, double d2, String str, float f, long j, List<RoutePoint> list, boolean z, Map<String, String> map, String str2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5, double d3, boolean z6, boolean z7, int i, boolean z8, q60 q60Var) {
        SpoofingState spoofingState = SpoofingState.INSTANCE;
        spoofingState.setLatitude(d);
        spoofingState.setLongitude(d2);
        spoofingState.setStartTimestamp(j);
        spoofingState.setSimMode(str);
        spoofingState.setSimBearing(f);
        spoofingState.setRouteJson(routePointsToJson(list));
        spoofingState.setRouteMode(z);
        spoofingState.setWifiJson(str2);
        spoofingState.setCellJson(str3);
        spoofingState.setBluetoothJson(str4);
        spoofingState.setEnableJitter(z5);
        String string = this.settingsManager.b.getString("altitude", "0.0");
        Double dR = r13.R(string != null ? string : "0.0");
        double dDoubleValue = dR != null ? dR.doubleValue() : 0.0d;
        String string2 = this.settingsManager.b.getString("satellite_count", "10");
        Integer numA0 = s13.a0(string2 != null ? string2 : "10");
        Object objSaveConfig = this.configManager.saveConfig(d, d2, true, str, f, j, list, z, spoofingState.getWifiJson(), map, spoofingState.getCellJson(), spoofingState.getBluetoothJson(), z2, z3, z4, z5, dDoubleValue, numA0 != null ? numA0.intValue() : 20, d3, z6, z7, i, z8, q60Var);
        return objSaveConfig == z70.e ? objSaveConfig : mf3.a;
    }

    public final Object updateEnvironment(String str, String str2, String str3, q60 q60Var) {
        SpoofingState spoofingState = SpoofingState.INSTANCE;
        spoofingState.setWifiJson(str);
        spoofingState.setCellJson(str2);
        spoofingState.setBluetoothJson(str3);
        Object objPatchConfig = this.configManager.patchConfig(new lh(this, str, str2, str3, 8), q60Var);
        return objPatchConfig == z70.e ? objPatchConfig : mf3.a;
    }

    public final Object updateWifiJson(String str, Map<String, String> map, q60 q60Var) {
        SpoofingState spoofingState = SpoofingState.INSTANCE;
        spoofingState.setWifiJson(str);
        ConfigManager configManager = this.configManager;
        double latitude = spoofingState.getLatitude();
        double longitude = spoofingState.getLongitude();
        boolean zIsActive = spoofingState.isActive();
        String simMode = spoofingState.getSimMode();
        float simBearing = spoofingState.getSimBearing();
        long startTimestamp = spoofingState.getStartTimestamp();
        String cellJson = spoofingState.getCellJson();
        String bluetoothJson = spoofingState.getBluetoothJson();
        boolean z = this.settingsManager.b.getBoolean("mock_wifi", true);
        boolean z2 = this.settingsManager.b.getBoolean("mock_cell", true);
        boolean z3 = this.settingsManager.b.getBoolean("mock_bluetooth", true);
        String string = this.settingsManager.b.getString("altitude", "0.0");
        Double dR = r13.R(string != null ? string : "0.0");
        double dDoubleValue = dR != null ? dR.doubleValue() : 0.0d;
        String string2 = this.settingsManager.b.getString("satellite_count", "10");
        Integer numA0 = s13.a0(string2 != null ? string2 : "10");
        Object objSaveConfig = configManager.saveConfig(latitude, longitude, zIsActive, (8388600 & 8) != 0 ? "STILL" : simMode, (8388600 & 16) != 0 ? 0.0f : simBearing, (8388600 & 32) != 0 ? System.currentTimeMillis() : startTimestamp, (8388600 & 64) != 0 ? uj0.e : null, (8388600 & WorkQueueKt.BUFFER_CAPACITY) != 0 ? false : false, (8388600 & 256) != 0 ? "[]" : str, (8388600 & 512) != 0 ? vj0.e : map, (8388600 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? "[]" : cellJson, (8388600 & 2048) != 0 ? "[]" : bluetoothJson, (8388600 & 4096) != 0 ? true : z, (8388600 & 8192) != 0 ? true : z2, (8388600 & 16384) != 0 ? true : z3, (32768 & 8388600) != 0, (65536 & 8388600) != 0 ? 0.0d : dDoubleValue, (131072 & 8388600) != 0 ? 20 : numA0 != null ? numA0.intValue() : 20, (262144 & 8388600) != 0 ? 0.0d : 0.0d, (524288 & 8388600) != 0 ? false : false, (1048576 & 8388600) != 0, (2097152 & 8388600) != 0 ? 165 : 0, (8388600 & 4194304) != 0, q60Var);
        return objSaveConfig == z70.e ? objSaveConfig : mf3.a;
    }
}
