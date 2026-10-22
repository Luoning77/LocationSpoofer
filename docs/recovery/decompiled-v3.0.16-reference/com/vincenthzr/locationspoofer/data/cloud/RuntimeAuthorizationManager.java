package com.vincenthzr.locationspoofer.data.cloud;

import android.os.SystemClock;
import defpackage.am1;
import defpackage.au0;
import defpackage.az2;
import defpackage.b81;
import defpackage.bv0;
import defpackage.ca0;
import defpackage.ee0;
import defpackage.fo;
import defpackage.i52;
import defpackage.k33;
import defpackage.lt2;
import defpackage.lu0;
import defpackage.mc0;
import defpackage.mf3;
import defpackage.o51;
import defpackage.pk2;
import defpackage.pt2;
import defpackage.pu0;
import defpackage.q60;
import defpackage.qk2;
import defpackage.r60;
import defpackage.rk2;
import defpackage.s90;
import defpackage.vk2;
import defpackage.wg2;
import defpackage.yo;
import defpackage.z70;
import defpackage.zy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class RuntimeAuthorizationManager {
    public static final Companion Companion = new Companion(null);
    private final MutableStateFlow<RuntimeAuthorization> _authorization;
    private final StateFlow<RuntimeAuthorization> authorization;
    private volatile BillingRun billingRun;
    private final CloudRepository cloud;
    private long generation;
    private final LinkedHashMap<String, lu0> handlers;
    private long nextRunGeneration;
    private Job pendingStop;
    private final Mutex requestMutex;
    private final CoroutineScope scope;
    private final LinkedHashMap<String, au0> stopSignals;
    private final Object transitionLock;
    private final vk2 verifier;

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final /* synthetic */ class AnonymousClass1 extends bv0 implements au0 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0, SystemClock.class, "elapsedRealtime", "elapsedRealtime()J", 0);
        }

        @Override // defpackage.au0
        public final Long invoke() {
            return Long.valueOf(SystemClock.elapsedRealtime());
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager$2", f = "RuntimeAuthorizationManager.kt", l = {54}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends k33 implements pu0 {
        int label;

        public AnonymousClass2(q60 q60Var) {
            super(2, q60Var);
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            return RuntimeAuthorizationManager.this.new AnonymousClass2(q60Var);
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
                StateFlow<CloudAccountState> state = RuntimeAuthorizationManager.this.cloud.getState();
                final RuntimeAuthorizationManager runtimeAuthorizationManager = RuntimeAuthorizationManager.this;
                FlowCollector<? super CloudAccountState> flowCollector = new FlowCollector() { // from class: com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager.2.1
                    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(CloudAccountState cloudAccountState, q60 q60Var) {
                        RuntimeAuthorization runtimeAuthorization = (RuntimeAuthorization) runtimeAuthorizationManager._authorization.getValue();
                        if (runtimeAuthorization != null) {
                            RuntimeAuthorizationManager runtimeAuthorizationManager2 = runtimeAuthorizationManager;
                            pk2 pk2Var = runtimeAuthorization.getClaims().b;
                            CloudAccount account = cloudAccountState.getAccount();
                            if (cloudAccountState.getValidated()) {
                                if (o51.f(account != null ? account.getId() : null, pk2Var.a) && o51.f(cloudAccountState.getDeviceId(), pk2Var.b) && o51.f(cloudAccountState.getPublicKeyFingerprint(), pk2Var.c)) {
                                    if (!o51.f(account != null ? account.getSessionId() : null, pk2Var.d) || (account != null && account.getSoftwareMembershipRequired())) {
                                        RuntimeAuthorizationManager.invalidate$default(runtimeAuthorizationManager2, false, null, 3, null);
                                    }
                                } else {
                                    RuntimeAuthorizationManager.invalidate$default(runtimeAuthorizationManager2, false, null, 3, null);
                                }
                            } else {
                                RuntimeAuthorizationManager.invalidate$default(runtimeAuthorizationManager2, false, null, 3, null);
                            }
                        }
                        return mf3.a;
                    }
                };
                this.label = 1;
                Object objCollect = state.collect(flowCollector, this);
                z70 z70Var = z70.e;
                if (objCollect == z70Var) {
                    return z70Var;
                }
            } else {
                if (i != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
            }
            fo.d();
            return null;
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager$3", f = "RuntimeAuthorizationManager.kt", l = {66}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends k33 implements pu0 {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass3(q60 q60Var) {
            super(2, q60Var);
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            AnonymousClass3 anonymousClass3 = RuntimeAuthorizationManager.this.new AnonymousClass3(q60Var);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // defpackage.pu0
        public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
            return ((AnonymousClass3) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x001f  */
        /* JADX WARN: Code duplicated, block: B:13:0x002d A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:16:0x003a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002b -> B:14:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x001f
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.oq
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.L$0
                kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
                int r1 = r6.label
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L16
                if (r1 != r2) goto L10
                defpackage.ee0.J(r7)
                goto L2e
            L10:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.fo.n(r6)
                return r3
            L16:
                defpackage.ee0.J(r7)
            L19:
                boolean r7 = kotlinx.coroutines.CoroutineScopeKt.isActive(r0)
                if (r7 == 0) goto L4a
                r6.L$0 = r0
                r6.label = r2
                r4 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r7 = kotlinx.coroutines.DelayKt.delay(r4, r6)
                z70 r1 = defpackage.z70.e
                if (r7 != r1) goto L2e
                return r1
            L2e:
                com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager r7 = com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager.this
                kotlinx.coroutines.flow.MutableStateFlow r7 = com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager.access$get_authorization$p(r7)
                java.lang.Object r7 = r7.getValue()
                if (r7 == 0) goto L19
                com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager r7 = com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager.this
                boolean r7 = com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager.isAuthorized$default(r7, r3, r2, r3)
                if (r7 != 0) goto L19
                com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager r7 = com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager.this
                r1 = 0
                r4 = 3
                com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager.invalidate$default(r7, r1, r3, r4, r3)
                goto L19
            L4a:
                mf3 r6 = defpackage.mf3.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager$4", f = "RuntimeAuthorizationManager.kt", l = {72, 73}, m = "invokeSuspend")
    public static final class AnonymousClass4 extends k33 implements pu0 {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass4(q60 q60Var) {
            super(2, q60Var);
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            AnonymousClass4 anonymousClass4 = RuntimeAuthorizationManager.this.new AnonymousClass4(q60Var);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // defpackage.pu0
        public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
            return ((AnonymousClass4) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x001f  */
        /* JADX WARN: Code duplicated, block: B:13:0x0025  */
        /* JADX WARN: Code duplicated, block: B:16:0x0032  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x003c -> B:11:0x001f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.oq
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.L$0
                kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
                int r1 = r7.label
                r2 = 2
                r3 = 1
                z70 r4 = defpackage.z70.e
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L11
                goto L1c
            L11:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.fo.n(r7)
                r7 = 0
                return r7
            L18:
                defpackage.ee0.J(r8)
                goto L32
            L1c:
                defpackage.ee0.J(r8)
            L1f:
                boolean r8 = kotlinx.coroutines.CoroutineScopeKt.isActive(r0)
                if (r8 == 0) goto L3f
                r7.L$0 = r0
                r7.label = r3
                r5 = 30000(0x7530, double:1.4822E-319)
                java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r5, r7)
                if (r8 != r4) goto L32
                goto L3e
            L32:
                com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager r8 = com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager.this
                r7.L$0 = r0
                r7.label = r2
                java.lang.Object r8 = r8.renewScheduledPermit$core_data_globalRelease(r7)
                if (r8 != r4) goto L1f
            L3e:
                return r4
            L3f:
                mf3 r7 = defpackage.mf3.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class BillingRun {
        private final String id;
        private final String session;

        public BillingRun(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.session = str2;
        }

        public static /* synthetic */ BillingRun copy$default(BillingRun billingRun, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = billingRun.id;
            }
            if ((i & 2) != 0) {
                str2 = billingRun.session;
            }
            return billingRun.copy(str, str2);
        }

        public final String component1() {
            return this.id;
        }

        public final String component2() {
            return this.session;
        }

        public final BillingRun copy(String str, String str2) {
            str.getClass();
            str2.getClass();
            return new BillingRun(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BillingRun)) {
                return false;
            }
            BillingRun billingRun = (BillingRun) obj;
            return o51.f(this.id, billingRun.id) && o51.f(this.session, billingRun.session);
        }

        public final String getId() {
            return this.id;
        }

        public final String getSession() {
            return this.session;
        }

        public int hashCode() {
            return this.session.hashCode() + (this.id.hashCode() * 31);
        }

        public String toString() {
            return az2.l("BillingRun(id=", this.id, ", session=", this.session, ")");
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager$authorizeStart$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager", f = "RuntimeAuthorizationManager.kt", l = {80, 289, Logger.NONE}, m = "authorizeStart")
    public static final class C00681 extends r60 {
        int I$0;
        int I$1;
        int I$2;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        public C00681(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RuntimeAuthorizationManager.this.authorizeStart(null, false, false, this);
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager$awaitStopped$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager", f = "RuntimeAuthorizationManager.kt", l = {210}, m = "awaitStopped")
    public static final class C00691 extends r60 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C00691(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RuntimeAuthorizationManager.this.awaitStopped(this);
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager$closeBillingRun$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager$closeBillingRun$2", f = "RuntimeAuthorizationManager.kt", l = {130}, m = "invokeSuspend")
    public static final class C00702 extends k33 implements pu0 {
        final /* synthetic */ BillingRun $run;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00702(BillingRun billingRun, q60 q60Var) {
            super(2, q60Var);
            this.$run = billingRun;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            C00702 c00702 = RuntimeAuthorizationManager.this.new C00702(this.$run, q60Var);
            c00702.L$0 = obj;
            return c00702;
        }

        @Override // defpackage.pu0
        public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
            return ((C00702) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            try {
                if (i == 0) {
                    ee0.J(obj);
                    RuntimeAuthorizationManager runtimeAuthorizationManager = RuntimeAuthorizationManager.this;
                    BillingRun billingRun = this.$run;
                    CloudRepository cloudRepository = runtimeAuthorizationManager.cloud;
                    String id = billingRun.getId();
                    String session = billingRun.getSession();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.I$0 = 0;
                    this.label = 1;
                    Object objFinishRuntimeRun$core_data_globalRelease = cloudRepository.finishRuntimeRun$core_data_globalRelease(id, "stop", session, this);
                    z70 z70Var = z70.e;
                    if (objFinishRuntimeRun$core_data_globalRelease == z70Var) {
                        return z70Var;
                    }
                } else {
                    if (i != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ee0.J(obj);
                }
            } catch (Throwable unused) {
            }
            return mf3.a;
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager$confirmStarted$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager", f = "RuntimeAuthorizationManager.kt", l = {289, 114, 119}, m = "confirmStarted")
    public static final class C00711 extends r60 {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        int I$5;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C00711(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RuntimeAuthorizationManager.this.confirmStarted(this);
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager$fetchPermit$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager", f = "RuntimeAuthorizationManager.kt", l = {159}, m = "fetchPermit")
    public static final class C00721 extends r60 {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        public C00721(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RuntimeAuthorizationManager.this.fetchPermit(null, false, false, null, this);
        }
    }

    public RuntimeAuthorizationManager(CloudRepository cloudRepository, vk2 vk2Var, CoroutineScope coroutineScope) {
        cloudRepository.getClass();
        vk2Var.getClass();
        coroutineScope.getClass();
        this.cloud = cloudRepository;
        this.verifier = vk2Var;
        this.scope = coroutineScope;
        this.requestMutex = MutexKt.Mutex$default(false, 1, null);
        this.transitionLock = new Object();
        this.handlers = new LinkedHashMap<>();
        this.stopSignals = new LinkedHashMap<>();
        MutableStateFlow<RuntimeAuthorization> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._authorization = MutableStateFlow;
        this.authorization = FlowKt.asStateFlow(MutableStateFlow);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object authorizeStart$default(RuntimeAuthorizationManager runtimeAuthorizationManager, Set set, boolean z, boolean z2, q60 q60Var, int i, Object obj) {
        if ((i & 1) != 0) {
            set = mc0.H("spoof");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return runtimeAuthorizationManager.authorizeStart(set, z, z2, q60Var);
    }

    private final boolean bindingMatchesAccount(pk2 pk2Var) {
        CloudAccountState value = this.cloud.getState().getValue();
        CloudAccount account = value.getAccount();
        if (!value.getValidated()) {
            return false;
        }
        if (account != null && account.getSoftwareMembershipRequired()) {
            return false;
        }
        if (o51.f(account != null ? account.getId() : null, pk2Var.a)) {
            return o51.f(account != null ? account.getSessionId() : null, pk2Var.d) && o51.f(value.getDeviceId(), pk2Var.b) && o51.f(value.getPublicKeyFingerprint(), pk2Var.c);
        }
        return false;
    }

    private final void closeBillingRun() {
        BillingRun billingRun = this.billingRun;
        if (billingRun == null) {
            return;
        }
        this.billingRun = null;
        try {
            this.cloud.saveRuntimeRun$core_data_globalRelease(null);
        } catch (Throwable unused) {
        }
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C00702(billingRun, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object fetchPermit(Set<String> set, boolean z, boolean z2, Long l, q60 q60Var) throws JSONException {
        C00721 c00721;
        long j;
        boolean z3;
        long runGeneration;
        Set<String> set2 = set;
        if (q60Var instanceof C00721) {
            c00721 = (C00721) q60Var;
            int i = c00721.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00721.label = i - Integer.MIN_VALUE;
            } else {
                c00721 = new C00721(q60Var);
            }
        } else {
            c00721 = new C00721(q60Var);
        }
        Object objRuntimePermitAndBinding = c00721.result;
        z70 z70Var = z70.e;
        int i2 = c00721.label;
        if (i2 == 0) {
            ee0.J(objRuntimePermitAndBinding);
            synchronized (this.transitionLock) {
                if (l != null) {
                    try {
                        if (this.generation != l.longValue()) {
                            throw new CloudException("runtime_request_cancelled", null, null, null, 14, null);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                j = this.generation;
            }
            JSONObject jSONObjectPut = new JSONObject().put("requiredCapabilities", new JSONArray((Collection) zy.J0(set2)));
            BillingRun billingRun = this.billingRun;
            if (billingRun != null) {
                jSONObjectPut.put("runId", billingRun.getId()).put("action", z2 ? "prepare" : "renew");
            }
            CloudRepository cloudRepository = this.cloud;
            jSONObjectPut.getClass();
            c00721.L$0 = set2;
            c00721.L$1 = null;
            c00721.L$2 = null;
            c00721.Z$0 = z;
            c00721.Z$1 = z2;
            c00721.J$0 = j;
            c00721.label = 1;
            objRuntimePermitAndBinding = cloudRepository.runtimePermitAndBinding(jSONObjectPut, c00721);
            if (objRuntimePermitAndBinding == z70Var) {
                return z70Var;
            }
            z3 = z;
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j2 = c00721.J$0;
            z3 = c00721.Z$0;
            Set<String> set3 = (Set) c00721.L$0;
            ee0.J(objRuntimePermitAndBinding);
            j = j2;
            set2 = set3;
        }
        CloudRuntimeAuthorization cloudRuntimeAuthorization = (CloudRuntimeAuthorization) objRuntimePermitAndBinding;
        pk2 pk2Var = new pk2(cloudRuntimeAuthorization.getBinding().getUserId(), cloudRuntimeAuthorization.getBinding().getDeviceId(), cloudRuntimeAuthorization.getBinding().getPublicKeyFingerprint(), cloudRuntimeAuthorization.getBinding().getSessionId());
        rk2 rk2Var = new rk2(cloudRuntimeAuthorization.getPermit().getPayload(), cloudRuntimeAuthorization.getPermit().getSignature());
        synchronized (this.transitionLock) {
            try {
                if (this.generation != j) {
                    throw new CloudException("runtime_request_cancelled", null, null, null, 14, null);
                }
                if (!bindingMatchesAccount(pk2Var)) {
                    throw new CloudException("login_required", null, null, null, 14, null);
                }
                try {
                    qk2 qk2VarA = this.verifier.a(rk2Var, pk2Var, set2);
                    if (z3) {
                        runGeneration = this.nextRunGeneration + 1;
                        this.nextRunGeneration = runGeneration;
                    } else {
                        RuntimeAuthorization value = this._authorization.getValue();
                        if (value == null) {
                            throw new CloudException("runtime_request_cancelled", null, null, null, 14, null);
                        }
                        runGeneration = value.getRunGeneration();
                    }
                    this._authorization.setValue(new RuntimeAuthorization(rk2Var, qk2VarA, zy.N0(set2), runGeneration));
                } catch (Exception unused) {
                    throw new CloudException("invalid_runtime_permit", null, null, null, 14, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mf3.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object fetchPermit$default(RuntimeAuthorizationManager runtimeAuthorizationManager, Set set, boolean z, boolean z2, Long l, q60 q60Var, int i, Object obj) {
        if ((i & 1) != 0) {
            set = mc0.H("spoof");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            l = null;
        }
        return runtimeAuthorizationManager.fetchPermit(set, z, z2, l, q60Var);
    }

    public static /* synthetic */ Job invalidate$default(RuntimeAuthorizationManager runtimeAuthorizationManager, boolean z, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            l = null;
        }
        return runtimeAuthorizationManager.invalidate(z, l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean isAuthorized$default(RuntimeAuthorizationManager runtimeAuthorizationManager, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            set = mc0.H("spoof");
        }
        return runtimeAuthorizationManager.isAuthorized(set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void requireAuthorized$default(RuntimeAuthorizationManager runtimeAuthorizationManager, Set set, int i, Object obj) throws CloudException {
        if ((i & 1) != 0) {
            set = mc0.H("spoof");
        }
        runtimeAuthorizationManager.requireAuthorized(set);
    }

    public final void attach(JSONObject jSONObject) {
        jSONObject.getClass();
        synchronized (this.transitionLock) {
            try {
                if (jSONObject.optBoolean("active", false)) {
                    Set<String> setRequiredCapabilities = Companion.requiredCapabilities(jSONObject);
                    requireAuthorized(setRequiredCapabilities);
                    RuntimeAuthorization value = this._authorization.getValue();
                    if (value == null) {
                        throw new CloudException("runtime_authorization_required", null, null, null, 14, null);
                    }
                    pk2 pk2Var = value.getClaims().b;
                    jSONObject.put("runtime_permit", new JSONObject().put("payload", value.getEnvelope().a).put("signature", value.getEnvelope().b));
                    jSONObject.put("runtime_binding", new JSONObject().put("userId", pk2Var.a).put("deviceId", pk2Var.b).put("publicKeyFingerprint", pk2Var.c).put("sessionId", pk2Var.d));
                    if (!o51.f(value.getRequiredCapabilities(), setRequiredCapabilities)) {
                        this._authorization.setValue(RuntimeAuthorization.copy$default(value, null, null, setRequiredCapabilities, 0L, 11, null));
                    }
                } else {
                    jSONObject.remove("runtime_permit");
                    jSONObject.remove("runtime_binding");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x00f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:72:0x0144  */
    /* JADX WARN: Code duplicated, block: B:77:0x016c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0180 A[Catch: all -> 0x010d, TRY_ENTER, TryCatch #4 {all -> 0x010d, blocks: (B:57:0x00f8, B:60:0x0100, B:63:0x0106, B:68:0x0113, B:70:0x0120, B:85:0x0180, B:86:0x018d), top: B:103:0x00f8, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        if (awaitStopped(r6) == r7) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object authorizeStart(java.util.Set<java.lang.String> r23, boolean r24, boolean r25, defpackage.q60 r26) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager.authorizeStart(java.util.Set, boolean, boolean, q60):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:41:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0048 -> B:25:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object awaitStopped(defpackage.q60 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager.C00691
            if (r0 == 0) goto L13
            r0 = r6
            com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager$awaitStopped$1 r0 = (com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager.C00691) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager$awaitStopped$1 r0 = new com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager$awaitStopped$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            z70 r1 = defpackage.z70.e
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            defpackage.ee0.J(r6)
            goto L4b
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r5)
            r5 = 0
            return r5
        L32:
            defpackage.ee0.J(r6)
        L35:
            java.lang.Object r6 = r5.transitionLock
            monitor-enter(r6)
            kotlinx.coroutines.Job r2 = r5.pendingStop     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r6)
            if (r2 != 0) goto L40
            mf3 r5 = defpackage.mf3.a
            return r5
        L40:
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r2.join(r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            java.lang.Object r6 = r5.transitionLock
            monitor-enter(r6)
            kotlinx.coroutines.Job r4 = r5.pendingStop     // Catch: java.lang.Throwable -> L5b
            if (r4 != r2) goto L54
            r2 = r3
            goto L55
        L54:
            r2 = 0
        L55:
            monitor-exit(r6)
            if (r2 == 0) goto L35
            mf3 r5 = defpackage.mf3.a
            return r5
        L5b:
            r5 = move-exception
            monitor-exit(r6)
            throw r5
        L5e:
            r5 = move-exception
            monitor-exit(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager.awaitStopped(q60):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:85|41|42|83|43|44|88|45|(1:48)|73) */
    /* JADX WARN: Code duplicated, block: B:48:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:63:0x0116 A[Catch: all -> 0x0055, TryCatch #4 {all -> 0x0055, blocks: (B:14:0x0047, B:74:0x014f, B:41:0x00c6, B:43:0x00d0, B:45:0x00e9, B:50:0x00f4, B:61:0x010a, B:63:0x0116, B:65:0x011c, B:70:0x0127, B:71:0x0128, B:76:0x0159, B:80:0x016e, B:79:0x0160, B:75:0x0158, B:35:0x00b0, B:38:0x00b5), top: B:87:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x011c A[Catch: all -> 0x0055, TryCatch #4 {all -> 0x0055, blocks: (B:14:0x0047, B:74:0x014f, B:41:0x00c6, B:43:0x00d0, B:45:0x00e9, B:50:0x00f4, B:61:0x010a, B:63:0x0116, B:65:0x011c, B:70:0x0127, B:71:0x0128, B:76:0x0159, B:80:0x016e, B:79:0x0160, B:75:0x0158, B:35:0x00b0, B:38:0x00b5), top: B:87:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0121  */
    /* JADX WARN: Code duplicated, block: B:69:0x0126  */
    /* JADX WARN: Code duplicated, block: B:70:0x0127 A[Catch: all -> 0x0055, TryCatch #4 {all -> 0x0055, blocks: (B:14:0x0047, B:74:0x014f, B:41:0x00c6, B:43:0x00d0, B:45:0x00e9, B:50:0x00f4, B:61:0x010a, B:63:0x0116, B:65:0x011c, B:70:0x0127, B:71:0x0128, B:76:0x0159, B:80:0x016e, B:79:0x0160, B:75:0x0158, B:35:0x00b0, B:38:0x00b5), top: B:87:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0159 A[Catch: all -> 0x0055, TryCatch #4 {all -> 0x0055, blocks: (B:14:0x0047, B:74:0x014f, B:41:0x00c6, B:43:0x00d0, B:45:0x00e9, B:50:0x00f4, B:61:0x010a, B:63:0x0116, B:65:0x011c, B:70:0x0127, B:71:0x0128, B:76:0x0159, B:80:0x016e, B:79:0x0160, B:75:0x0158, B:35:0x00b0, B:38:0x00b5), top: B:87:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x015f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0160 A[Catch: all -> 0x0055, TryCatch #4 {all -> 0x0055, blocks: (B:14:0x0047, B:74:0x014f, B:41:0x00c6, B:43:0x00d0, B:45:0x00e9, B:50:0x00f4, B:61:0x010a, B:63:0x0116, B:65:0x011c, B:70:0x0127, B:71:0x0128, B:76:0x0159, B:80:0x016e, B:79:0x0160, B:75:0x0158, B:35:0x00b0, B:38:0x00b5), top: B:87:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:85:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fa, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fb, code lost:
    
        r13 = r2;
        r2 = r4;
        r14 = r5;
        r4 = r10;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0103, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0106, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0107, code lost:
    
        r16 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014c, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(((long) (r10 + 1)) * 200, r2) == r3) goto L73;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x014c -> B:16:0x0051). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object confirmStarted(defpackage.q60 r20) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager.confirmStarted(q60):java.lang.Object");
    }

    public final void endRun() {
        synchronized (this.transitionLock) {
            this.generation++;
            closeBillingRun();
            this._authorization.setValue(null);
            this.verifier.d();
        }
    }

    public final StateFlow<RuntimeAuthorization> getAuthorization() {
        return this.authorization;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:5:0x000b, B:7:0x0015, B:11:0x0023, B:14:0x002b, B:18:0x004c, B:19:0x0050, B:21:0x006f, B:22:0x0070, B:44:0x00d5, B:45:0x00d6, B:20:0x0051), top: B:50:0x000b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final Job invalidate(boolean z, Long l) {
        i52 i52Var;
        Object wg2Var;
        RuntimeAuthorization value;
        CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        synchronized (this.transitionLock) {
            if (l != null) {
                try {
                    RuntimeAuthorization value2 = this._authorization.getValue();
                    if (o51.f(value2 != null ? Long.valueOf(value2.getRunGeneration()) : null, l)) {
                        this.generation++;
                        closeBillingRun();
                        value = this._authorization.getValue();
                        this._authorization.setValue(null);
                        this.verifier.d();
                        if (value == null || z) {
                            Job job = this.pendingStop;
                            synchronized (this.handlers) {
                                Collection<lu0> collectionValues = this.handlers.values();
                                collectionValues.getClass();
                                List listJ0 = zy.J0(collectionValues);
                                Collection<au0> collectionValues2 = this.stopSignals.values();
                                collectionValues2.getClass();
                                List listJ1 = zy.J0(collectionValues2);
                            }
                            Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(this.scope, null, CoroutineStart.LAZY, new RuntimeAuthorizationManager$invalidate$plan$1$stopping$1(job, completableDeferredCompletableDeferred$default, listJ0, null), 1, null);
                            this.pendingStop = jobLaunch$default;
                            i52Var = new i52(jobLaunch$default, listJ1);
                        } else {
                            i52Var = null;
                        }
                    } else {
                        i52Var = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                this.generation++;
                closeBillingRun();
                value = this._authorization.getValue();
                this._authorization.setValue(null);
                this.verifier.d();
                if (value == null) {
                }
                Job job2 = this.pendingStop;
                synchronized (this.handlers) {
                    Collection<lu0> collectionValues3 = this.handlers.values();
                    collectionValues3.getClass();
                    List listJ2 = zy.J0(collectionValues3);
                    Collection<au0> collectionValues4 = this.stopSignals.values();
                    collectionValues4.getClass();
                    List listJ3 = zy.J0(collectionValues4);
                    Job jobLaunch$default2 = BuildersKt__Builders_commonKt.launch$default(this.scope, null, CoroutineStart.LAZY, new RuntimeAuthorizationManager$invalidate$plan$1$stopping$1(job2, completableDeferredCompletableDeferred$default, listJ2, null), 1, null);
                    this.pendingStop = jobLaunch$default2;
                    i52Var = new i52(jobLaunch$default2, listJ3);
                }
            }
        }
        if (i52Var == null) {
            return null;
        }
        Iterable iterable = (Iterable) i52Var.f;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            try {
                wg2Var = (Job) ((au0) it.next()).invoke();
            } catch (Throwable th2) {
                wg2Var = new wg2(th2);
            }
            if (wg2Var instanceof wg2) {
                wg2Var = null;
            }
            Job job3 = (Job) wg2Var;
            if (job3 != null) {
                arrayList.add(job3);
            }
        }
        completableDeferredCompletableDeferred$default.complete(arrayList);
        ((Job) i52Var.e).start();
        return (Job) i52Var.e;
    }

    public final boolean isAuthorized(Set<String> set) {
        set.getClass();
        synchronized (this.transitionLock) {
            RuntimeAuthorization value = this._authorization.getValue();
            boolean z = false;
            if (value == null) {
                return false;
            }
            if (bindingMatchesAccount(value.getClaims().b) && this.verifier.f(value.getClaims().b, pt2.N(value.getRequiredCapabilities(), set))) {
                z = true;
            }
            return z;
        }
    }

    public final void registerStopHandler(String str, lu0 lu0Var) {
        str.getClass();
        lu0Var.getClass();
        synchronized (this.handlers) {
            this.handlers.put(str, lu0Var);
        }
    }

    public final void registerStopSignal(String str, au0 au0Var) {
        str.getClass();
        au0Var.getClass();
        synchronized (this.handlers) {
            this.stopSignals.put(str, au0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object renewPermit$core_data_globalRelease(q60 q60Var) throws Throwable {
        RuntimeAuthorizationManager$renewPermit$1 runtimeAuthorizationManager$renewPermit$1;
        Mutex mutex;
        int i;
        Throwable th;
        Mutex mutex2;
        if (q60Var instanceof RuntimeAuthorizationManager$renewPermit$1) {
            runtimeAuthorizationManager$renewPermit$1 = (RuntimeAuthorizationManager$renewPermit$1) q60Var;
            int i2 = runtimeAuthorizationManager$renewPermit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                runtimeAuthorizationManager$renewPermit$1.label = i2 - Integer.MIN_VALUE;
            } else {
                runtimeAuthorizationManager$renewPermit$1 = new RuntimeAuthorizationManager$renewPermit$1(this, q60Var);
            }
        } else {
            runtimeAuthorizationManager$renewPermit$1 = new RuntimeAuthorizationManager$renewPermit$1(this, q60Var);
        }
        RuntimeAuthorizationManager$renewPermit$1 runtimeAuthorizationManager$renewPermit$2 = runtimeAuthorizationManager$renewPermit$1;
        Object obj = runtimeAuthorizationManager$renewPermit$2.result;
        int i3 = runtimeAuthorizationManager$renewPermit$2.label;
        z70 z70Var = z70.e;
        try {
            if (i3 == 0) {
                ee0.J(obj);
                mutex = this.requestMutex;
                runtimeAuthorizationManager$renewPermit$2.L$0 = mutex;
                runtimeAuthorizationManager$renewPermit$2.I$0 = 0;
                runtimeAuthorizationManager$renewPermit$2.label = 1;
                if (mutex.lock(null, runtimeAuthorizationManager$renewPermit$2) != z70Var) {
                    i = 0;
                }
                return z70Var;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mutex2 = (Mutex) runtimeAuthorizationManager$renewPermit$2.L$0;
                try {
                    ee0.J(obj);
                    mutex = mutex2;
                    mutex.unlock(null);
                    return mf3.a;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            i = runtimeAuthorizationManager$renewPermit$2.I$0;
            Mutex mutex3 = (Mutex) runtimeAuthorizationManager$renewPermit$2.L$0;
            ee0.J(obj);
            mutex = mutex3;
            RuntimeAuthorization value = this._authorization.getValue();
            if (value != null) {
                Set<String> requiredCapabilities = value.getRequiredCapabilities();
                runtimeAuthorizationManager$renewPermit$2.L$0 = mutex;
                runtimeAuthorizationManager$renewPermit$2.L$1 = null;
                runtimeAuthorizationManager$renewPermit$2.I$0 = i;
                runtimeAuthorizationManager$renewPermit$2.I$1 = 0;
                runtimeAuthorizationManager$renewPermit$2.I$2 = 0;
                runtimeAuthorizationManager$renewPermit$2.label = 2;
                if (fetchPermit$default(this, requiredCapabilities, false, false, null, runtimeAuthorizationManager$renewPermit$2, 14, null) != z70Var) {
                    mutex2 = mutex;
                    mutex = mutex2;
                }
                return z70Var;
            }
            mutex.unlock(null);
            return mf3.a;
        } catch (Throwable th3) {
            Mutex mutex4 = mutex;
            th = th3;
            mutex2 = mutex4;
            mutex2.unlock(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00be  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object renewScheduledPermit$core_data_globalRelease(q60 q60Var) throws Throwable {
        RuntimeAuthorizationManager$renewScheduledPermit$1 runtimeAuthorizationManager$renewScheduledPermit$1;
        long j;
        Integer httpStatus;
        Integer httpStatus2;
        int iIntValue;
        if (q60Var instanceof RuntimeAuthorizationManager$renewScheduledPermit$1) {
            runtimeAuthorizationManager$renewScheduledPermit$1 = (RuntimeAuthorizationManager$renewScheduledPermit$1) q60Var;
            int i = runtimeAuthorizationManager$renewScheduledPermit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                runtimeAuthorizationManager$renewScheduledPermit$1.label = i - Integer.MIN_VALUE;
            } else {
                runtimeAuthorizationManager$renewScheduledPermit$1 = new RuntimeAuthorizationManager$renewScheduledPermit$1(this, q60Var);
            }
        } else {
            runtimeAuthorizationManager$renewScheduledPermit$1 = new RuntimeAuthorizationManager$renewScheduledPermit$1(this, q60Var);
        }
        Object obj = runtimeAuthorizationManager$renewScheduledPermit$1.result;
        int i2 = runtimeAuthorizationManager$renewScheduledPermit$1.label;
        mf3 mf3Var = mf3.a;
        try {
            if (i2 == 0) {
                ee0.J(obj);
                RuntimeAuthorization value = this._authorization.getValue();
                if (value == null) {
                    return mf3Var;
                }
                long runGeneration = value.getRunGeneration();
                try {
                    runtimeAuthorizationManager$renewScheduledPermit$1.J$0 = runGeneration;
                    runtimeAuthorizationManager$renewScheduledPermit$1.label = 1;
                    Object objRenewPermit$core_data_globalRelease = renewPermit$core_data_globalRelease(runtimeAuthorizationManager$renewScheduledPermit$1);
                    Object obj2 = z70.e;
                    if (objRenewPermit$core_data_globalRelease == obj2) {
                        return obj2;
                    }
                } catch (CloudException e) {
                    e = e;
                    j = runGeneration;
                    if (zy.g0(yo.H0(new Integer[]{new Integer(401), new Integer(403)}), e.getHttpStatus())) {
                        invalidate$default(this, false, new Long(j), 1, null);
                    } else {
                        invalidate$default(this, false, new Long(j), 1, null);
                    }
                } catch (Exception unused) {
                    j = runGeneration;
                    invalidate$default(this, false, new Long(j), 1, null);
                }
            } else {
                if (i2 != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = runtimeAuthorizationManager$renewScheduledPermit$1.J$0;
                try {
                    ee0.J(obj);
                } catch (CloudException e2) {
                    e = e2;
                    if (zy.g0(yo.H0(new Integer[]{new Integer(401), new Integer(403)}), e.getHttpStatus()) || (!yo.H0(new String[]{"network_error", "service_unavailable", "rate_limited", "runtime_unavailable"}).contains(e.getCode()) && (((httpStatus = e.getHttpStatus()) == null || httpStatus.intValue() != 429) && ((httpStatus2 = e.getHttpStatus()) == null || 500 > (iIntValue = httpStatus2.intValue()) || iIntValue >= 600)))) {
                        invalidate$default(this, false, new Long(j), 1, null);
                    }
                } catch (Exception unused2) {
                    invalidate$default(this, false, new Long(j), 1, null);
                }
            }
            return mf3Var;
        } catch (CancellationException e3) {
            throw e3;
        }
    }

    public final void requireAuthorized(Set<String> set) throws CloudException {
        set.getClass();
        if (isAuthorized(set)) {
            return;
        }
        b81.w("runtime_authorization_required");
    }

    public final void unregisterStopHandler(String str) {
        str.getClass();
        synchronized (this.handlers) {
            this.handlers.remove(str);
            this.stopSignals.remove(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        public final Set<String> requiredCapabilities(JSONObject jSONObject) {
            jSONObject.getClass();
            lt2 lt2Var = new lt2();
            lt2Var.add("spoof");
            if (jSONObject.optBoolean("is_route_mode", false)) {
                lt2Var.add("route");
            } else {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("route_points");
                if ((jSONArrayOptJSONArray != null ? jSONArrayOptJSONArray.length() : 0) >= 2) {
                    lt2Var.add("route");
                }
            }
            List<String> listG = am1.G("wifi", "cell", "bluetooth");
            if (!listG.isEmpty()) {
                for (String str : listG) {
                    if (!jSONObject.optBoolean("mock_" + str, false)) {
                        if (jSONObject.optBoolean("mock_" + str + "_requested", false)) {
                        }
                    }
                    lt2Var.add("environment");
                }
            }
            return mc0.l(lt2Var);
        }

        private Companion() {
        }
    }

    public /* synthetic */ RuntimeAuthorizationManager(CloudRepository cloudRepository, vk2 vk2Var, CoroutineScope coroutineScope, int i, ca0 ca0Var) {
        this(cloudRepository, (i & 2) != 0 ? new vk2(3, AnonymousClass1.INSTANCE) : vk2Var, (i & 4) != 0 ? CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO())) : coroutineScope);
    }
}
