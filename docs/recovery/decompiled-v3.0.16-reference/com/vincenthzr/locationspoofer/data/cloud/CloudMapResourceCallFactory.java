package com.vincenthzr.locationspoofer.data.cloud;

import com.vincenthzr.locationspoofer.data.cloud.CloudMapResourceCallFactory;
import defpackage.a51;
import defpackage.am1;
import defpackage.au0;
import defpackage.b51;
import defpackage.b81;
import defpackage.bd2;
import defpackage.be2;
import defpackage.bh3;
import defpackage.ca0;
import defpackage.cv;
import defpackage.du;
import defpackage.dv;
import defpackage.ee0;
import defpackage.fo;
import defpackage.gv;
import defpackage.hd0;
import defpackage.if2;
import defpackage.j12;
import defpackage.j9;
import defpackage.ji2;
import defpackage.k12;
import defpackage.kr1;
import defpackage.lu0;
import defpackage.m5;
import defpackage.mc0;
import defpackage.mf3;
import defpackage.nx0;
import defpackage.o51;
import defpackage.p91;
import defpackage.pa3;
import defpackage.pg2;
import defpackage.q2;
import defpackage.q60;
import defpackage.qg2;
import defpackage.s13;
import defpackage.t1;
import defpackage.tg2;
import defpackage.uq1;
import defpackage.vq1;
import defpackage.wg2;
import defpackage.xd2;
import defpackage.xp;
import defpackage.xt;
import defpackage.yc0;
import defpackage.yf2;
import defpackage.yo;
import defpackage.z70;
import defpackage.zy;
import defpackage.zz0;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.sync.SemaphoreKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CloudMapResourceCallFactory implements cv {
    private final CloudMapResourceCache cacheOverride;
    private final ConcurrentHashMap.KeySetView<ResourceCall, Boolean> calls;
    private final zz0 origin;
    private final Semaphore pending;
    private final CloudRepository repository;
    private final CoroutineScope scope;
    private final kotlinx.coroutines.sync.Semaphore slots;
    private final Map<String, RefreshAttempt> styleRefreshes;
    private final k12 transport;
    public static final Companion Companion = new Companion(null);
    private static final if2 SATELLITE = new if2("/v2/maps/satellite/tiles/(0|[1-9][0-9]*)/(0|[1-9][0-9]*)/(0|[1-9][0-9]*)\\.png");
    private static final if2 TILE = new if2("/v2/maps/china/tiles/(0|[1-9][0-9]*)/(0|[1-9][0-9]*)/(0|[1-9][0-9]*)\\.pbf");
    private static final if2 FONT = new if2("/v2/maps/china/fonts/Noto%20Sans%20CJK%20SC%20Regular/(0|[1-9][0-9]*)-(0|[1-9][0-9]*)\\.pbf");

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Download {
        private final byte[] bytes;
        private final int code;
        private final bd2 protocol;

        public Download(byte[] bArr, bd2 bd2Var, int i) {
            bArr.getClass();
            bd2Var.getClass();
            this.bytes = bArr;
            this.protocol = bd2Var;
            this.code = i;
        }

        public final byte[] getBytes() {
            return this.bytes;
        }

        public final int getCode() {
            return this.code;
        }

        public final bd2 getProtocol() {
            return this.protocol;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class RefreshAttempt {
        private final long generation;
        private final long startedAt;

        public RefreshAttempt(long j, long j2) {
            this.generation = j;
            this.startedAt = j2;
        }

        public final long getGeneration() {
            return this.generation;
        }

        public final long getStartedAt() {
            return this.startedAt;
        }
    }

    public CloudMapResourceCallFactory(CloudRepository cloudRepository, zz0 zz0Var, k12 k12Var, CloudMapResourceCache cloudMapResourceCache) {
        cloudRepository.getClass();
        k12Var.getClass();
        this.repository = cloudRepository;
        this.origin = zz0Var;
        this.cacheOverride = cloudMapResourceCache;
        this.scope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));
        this.slots = SemaphoreKt.Semaphore$default(8, 0, 2, null);
        this.pending = new Semaphore(64);
        this.calls = ConcurrentHashMap.newKeySet();
        this.styleRefreshes = new LinkedHashMap();
        j12 j12VarA = k12Var.a();
        j12VarA.c.clear();
        j12VarA.d.clear();
        j12VarA.j = j9.C;
        j9 j9Var = j9.u;
        j12VarA.g = j9Var;
        if (!j9Var.equals(j12VarA.n)) {
            j12VarA.B = null;
        }
        j12VarA.n = j9Var;
        Proxy proxy = Proxy.NO_PROXY;
        if (!o51.f(proxy, j12VarA.l)) {
            j12VarA.B = null;
        }
        j12VarA.l = proxy;
        yc0 yc0Var = new yc0();
        synchronized (yc0Var) {
            yc0Var.a = 8;
        }
        yc0Var.c();
        yc0Var.d(8);
        j12VarA.a = yc0Var;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        j12VarA.b = new t1(8, 10L, timeUnit);
        j12VarA.h = false;
        j12VarA.i = false;
        j12VarA.f = true;
        j12VarA.d.add(new b51() { // from class: com.vincenthzr.locationspoofer.data.cloud.CloudMapResourceCallFactory$special$$inlined$-addNetworkInterceptor$1
            @Override // defpackage.b51
            public final qg2 intercept(a51 a51Var) throws ProtocolException {
                a51Var.getClass();
                try {
                    qg2 qg2VarB = ((be2) a51Var).b(((be2) a51Var).e);
                    int i = qg2VarB.h;
                    if (i == 421) {
                        qg2VarB.close();
                        throw new ProtocolException("地图请求不能重发");
                    }
                    if (i != 408 && i != 503) {
                        return qg2VarB;
                    }
                    pg2 pg2VarO = qg2VarB.O();
                    pg2VarO.f.q("Retry-After", "2147483647");
                    return pg2VarO.a();
                } catch (IOException e) {
                    ProtocolException protocolException = new ProtocolException("地图请求连接后失败，不允许重发");
                    protocolException.initCause(e);
                    throw protocolException;
                }
            }
        });
        timeUnit.getClass();
        j12VarA.x = bh3.b(5L);
        timeUnit.getClass();
        j12VarA.y = bh3.b(10L);
        j12VarA.a(15L);
        this.transport = new k12(j12VarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CloudMapResourceCache getCache() {
        CloudMapResourceCache cloudMapResourceCache = this.cacheOverride;
        return cloudMapResourceCache == null ? this.repository.mapResourceCache$core_data_globalRelease() : cloudMapResourceCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x0039 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:4:0x0003, B:6:0x0017, B:8:0x001f, B:15:0x0039), top: B:24:0x0003 }] */
    public final void refreshCachedStyle(yf2 yf2Var, long j) {
        boolean z;
        synchronized (this.styleRefreshes) {
            try {
                String strB = yf2Var.a.b();
                long jNanoTime = System.nanoTime();
                RefreshAttempt refreshAttempt = this.styleRefreshes.get(strB);
                if (refreshAttempt == null || refreshAttempt.getGeneration() != j) {
                    this.styleRefreshes.put(strB, new RefreshAttempt(j, jNanoTime));
                    z = true;
                } else {
                    long startedAt = jNanoTime - refreshAttempt.getStartedAt();
                    if (0 > startedAt || startedAt >= 60000000000L) {
                        this.styleRefreshes.put(strB, new RefreshAttempt(j, jNanoTime));
                        z = true;
                    } else {
                        z = false;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            new ResourceCall(this, yf2Var, j, true).enqueue(new gv() { // from class: com.vincenthzr.locationspoofer.data.cloud.CloudMapResourceCallFactory.refreshCachedStyle.1
                @Override // defpackage.gv
                public void onFailure(dv dvVar, IOException iOException) {
                    dvVar.getClass();
                    iOException.getClass();
                }

                @Override // defpackage.gv
                public void onResponse(dv dvVar, qg2 qg2Var) {
                    dvVar.getClass();
                    qg2Var.getClass();
                    qg2Var.close();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Resource resource(yf2 yf2Var) throws CloudException {
        int i;
        int i2;
        zz0 zz0Var = yf2Var.a;
        zz0 zz0Var2 = this.origin;
        if (zz0Var2 == null) {
            b81.w("cloud_not_configured");
            return null;
        }
        if (!o51.f(yf2Var.b, "GET") || yf2Var.d != null || !o51.f(zz0Var.a, zz0Var2.a) || !o51.f(zz0Var.d, zz0Var2.d) || zz0Var.e != zz0Var2.e || zz0Var.b.length() > 0 || zz0Var.c.length() > 0 || zz0Var.d() != null || zz0Var.g != null) {
            b81.w("invalid_map_resource");
            return null;
        }
        String strB = zz0Var.b();
        if (yo.H0(new String[]{"/v2/maps/china/style-light.json", "/v2/maps/china/style-dark.json"}).contains(strB)) {
            return new Resource(strB, 1048576L, "application/json", false, false, 24, null);
        }
        if (strB.equals("/v2/maps/satellite/manifest.json")) {
            return new Resource(strB, 65536L, "application/json", false, true, 8, null);
        }
        vq1 vq1VarA = SATELLITE.a(strB);
        if (vq1VarA != null) {
            Integer numA0 = s13.a0((String) ((uq1) vq1VarA.a()).get(1));
            if (numA0 == null) {
                b81.w("invalid_map_resource");
                return null;
            }
            int iIntValue = numA0.intValue();
            Integer numA1 = s13.a0((String) ((uq1) vq1VarA.a()).get(2));
            if (numA1 == null) {
                b81.w("invalid_map_resource");
                return null;
            }
            int iIntValue2 = numA1.intValue();
            Integer numA2 = s13.a0((String) ((uq1) vq1VarA.a()).get(3));
            if (numA2 == null) {
                b81.w("invalid_map_resource");
                return null;
            }
            int iIntValue3 = numA2.intValue();
            if (iIntValue >= 0 && iIntValue < 15 && iIntValue2 >= 0 && iIntValue2 < (i2 = 1 << iIntValue) && iIntValue3 >= 0 && iIntValue3 < i2) {
                return new Resource(strB, 524288L, "image/png", false, true, 8, null);
            }
            b81.w("invalid_map_resource");
            return null;
        }
        vq1 vq1VarA2 = TILE.a(strB);
        if (vq1VarA2 == null) {
            vq1 vq1VarA3 = FONT.a(strB);
            if (vq1VarA3 == null) {
                b81.w("invalid_map_resource");
                return null;
            }
            Integer numA3 = s13.a0((String) ((uq1) vq1VarA3.a()).get(1));
            if (numA3 == null) {
                b81.w("invalid_map_resource");
                return null;
            }
            int iIntValue4 = numA3.intValue();
            Integer numA4 = s13.a0((String) ((uq1) vq1VarA3.a()).get(2));
            if (numA4 == null) {
                b81.w("invalid_map_resource");
                return null;
            }
            int iIntValue5 = numA4.intValue();
            if (iIntValue4 >= 0 && iIntValue4 < 65281 && iIntValue4 % 256 == 0 && iIntValue5 == iIntValue4 + 255) {
                return new Resource(strB, 262144L, "application/x-protobuf", false, false, 24, null);
            }
            b81.w("invalid_map_resource");
            return null;
        }
        Integer numA5 = s13.a0((String) ((uq1) vq1VarA2.a()).get(1));
        if (numA5 == null) {
            b81.w("invalid_map_resource");
            return null;
        }
        int iIntValue6 = numA5.intValue();
        Integer numA6 = s13.a0((String) ((uq1) vq1VarA2.a()).get(2));
        if (numA6 == null) {
            b81.w("invalid_map_resource");
            return null;
        }
        int iIntValue7 = numA6.intValue();
        Integer numA7 = s13.a0((String) ((uq1) vq1VarA2.a()).get(3));
        if (numA7 == null) {
            b81.w("invalid_map_resource");
            return null;
        }
        int iIntValue8 = numA7.intValue();
        if (iIntValue6 >= 0 && iIntValue6 < 15 && iIntValue7 >= 0 && iIntValue7 < (i = 1 << iIntValue6) && iIntValue8 >= 0 && iIntValue8 < i) {
            return new Resource(strB, 8388608L, "application/x-protobuf", true, false, 16, null);
        }
        b81.w("invalid_map_resource");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IOException safeFailure(Exception exc) {
        String message;
        if (exc instanceof CloudException) {
            message = ((CloudException) exc).getCode();
        } else if (exc instanceof CancellationException) {
            message = "map_request_cancelled";
        } else if (exc instanceof IOException) {
            String message2 = exc.getMessage();
            message = (o51.f(message2, "map_request_cancelled") || o51.f(message2, "map_queue_full")) ? exc.getMessage() : "network_error";
        } else {
            message = "invalid_map_response";
        }
        return new IOException(message);
    }

    public final void cancelBefore(long j) {
        ConcurrentHashMap.KeySetView<ResourceCall, Boolean> keySetView = this.calls;
        keySetView.getClass();
        List listJ0 = zy.J0(keySetView);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listJ0) {
            if (((ResourceCall) obj).beforeGeneration(j)) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            ((ResourceCall) obj2).cancel();
        }
    }

    @Override // defpackage.cv
    public dv newCall(yf2 yf2Var) {
        yf2Var.getClass();
        return new ResourceCall(this, yf2Var, this.repository.mapRequestGeneration$core_data_globalRelease(), false, 4, null);
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Resource {
        private final boolean emptyTile;
        private final long limit;
        private final String mime;
        private final String path;
        private final boolean satellite;

        public Resource(String str, long j, String str2, boolean z, boolean z2) {
            str.getClass();
            str2.getClass();
            this.path = str;
            this.limit = j;
            this.mime = str2;
            this.emptyTile = z;
            this.satellite = z2;
        }

        public final boolean getEmptyTile() {
            return this.emptyTile;
        }

        public final long getLimit() {
            return this.limit;
        }

        public final String getMime() {
            return this.mime;
        }

        public final String getPath() {
            return this.path;
        }

        public final boolean getSatellite() {
            return this.satellite;
        }

        public /* synthetic */ Resource(String str, long j, String str2, boolean z, boolean z2, int i, ca0 ca0Var) {
            this(str, j, str2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public final class ResourceCall implements dv {
        private final AtomicBoolean cancelled;
        private final AtomicBoolean delivered;
        private final AtomicBoolean executed;
        private final AtomicReference<dv> network;
        private final boolean networkOnly;
        private final yf2 publicRequest;
        private final long stamp;
        final /* synthetic */ CloudMapResourceCallFactory this$0;
        private final pa3 timer;
        private final AtomicReference<Job> worker;

        /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
        public final class GuardedBody extends tg2 {
            private final CloudMapAuthorization authorization;
            private final ResourceCall call;
            private final long length;
            private final du source;
            final /* synthetic */ ResourceCall this$0;
            private final kr1 type;

            public GuardedBody(ResourceCall resourceCall, byte[] bArr, kr1 kr1Var, CloudMapAuthorization cloudMapAuthorization, ResourceCall resourceCall2) {
                bArr.getClass();
                kr1Var.getClass();
                cloudMapAuthorization.getClass();
                resourceCall2.getClass();
                this.this$0 = resourceCall;
                this.type = kr1Var;
                this.authorization = cloudMapAuthorization;
                this.call = resourceCall2;
                this.length = bArr.length;
                xt xtVar = new xt();
                xtVar.m103write(bArr, 0, bArr.length);
                this.source = guardedSource(xtVar);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final <T> T guarded(au0 au0Var) throws IOException {
                try {
                    return (T) this.this$0.this$0.repository.withMapAuthorization$core_data_globalRelease(this.authorization, new m5(9, this, au0Var));
                } catch (CloudException e) {
                    fo.r(e.getCode());
                    return null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Object guarded$lambda$0(GuardedBody guardedBody, au0 au0Var) throws IOException {
                guardedBody.call.checkCancelled();
                return au0Var.invoke();
            }

            private final du guardedSource(final du duVar) {
                Object objNewProxyInstance = java.lang.reflect.Proxy.newProxyInstance(du.class.getClassLoader(), new Class[]{du.class}, new InvocationHandler() { // from class: iy
                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method, Object[] objArr) {
                        return CloudMapResourceCallFactory.ResourceCall.GuardedBody.guardedSource$lambda$2(duVar, this, obj, method, objArr);
                    }
                });
                objNewProxyInstance.getClass();
                return (du) objNewProxyInstance;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Object guardedSource$lambda$2(du duVar, GuardedBody guardedBody, Object obj, Method method, Object[] objArr) throws IOException {
                if (!o51.f(method.getName(), "close")) {
                    return guardedBody.guarded(new q2(method, duVar, objArr, guardedBody, 3));
                }
                duVar.close();
                return mf3.a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Object guardedSource$lambda$2$lambda$1(Method method, du duVar, Object[] objArr, GuardedBody guardedBody) throws Throwable {
                if (objArr == null) {
                    try {
                        objArr = new Object[0];
                    } catch (InvocationTargetException e) {
                        throw e.getTargetException();
                    }
                }
                Object objInvoke = method.invoke(duVar, Arrays.copyOf(objArr, objArr.length));
                if (!(objInvoke instanceof du)) {
                    return objInvoke instanceof InputStream ? new CloudMapResourceCallFactory$ResourceCall$GuardedBody$guardedSource$1$1$1(objInvoke, guardedBody) : objInvoke;
                }
                du duVar2 = (du) objInvoke;
                return o51.f(method.getReturnType(), du.class) ? guardedBody.guardedSource(duVar2) : duVar2;
            }

            @Override // defpackage.tg2
            public long contentLength() {
                return this.length;
            }

            @Override // defpackage.tg2
            public kr1 contentType() {
                return this.type;
            }

            @Override // defpackage.tg2
            public du source() {
                return this.source;
            }
        }

        public ResourceCall(CloudMapResourceCallFactory cloudMapResourceCallFactory, yf2 yf2Var, long j, boolean z) {
            yf2Var.getClass();
            this.this$0 = cloudMapResourceCallFactory;
            this.stamp = j;
            this.networkOnly = z;
            xp xpVar = new xp(4);
            zz0 zz0Var = yf2Var.a;
            zz0Var.getClass();
            xpVar.a = zz0Var;
            xpVar.n(yf2Var.b, yf2Var.d);
            this.publicRequest = xpVar.f();
            this.executed = new AtomicBoolean();
            this.cancelled = new AtomicBoolean();
            this.delivered = new AtomicBoolean();
            this.worker = new AtomicReference<>();
            this.network = new AtomicReference<>();
            pa3 pa3Var = new pa3();
            pa3Var.g(15L, TimeUnit.SECONDS);
            this.timer = pa3Var;
        }

        private final void begin() {
            if (this.executed.compareAndSet(false, true)) {
                this.this$0.calls.add(this);
            } else {
                fo.n("Already Executed");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String cacheScope(CloudRuntimeBinding cloudRuntimeBinding) {
            return zy.s0(am1.G(String.valueOf(this.this$0.origin), cloudRuntimeBinding.getUserId(), cloudRuntimeBinding.getDeviceId(), cloudRuntimeBinding.getPublicKeyFingerprint()), "\n", null, null, null, 62);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkCancelled() throws IOException {
            if (this.cancelled.get()) {
                fo.r("map_request_cancelled");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mf3 enqueue$lambda$1(CloudMapResourceCallFactory cloudMapResourceCallFactory, ResourceCall resourceCall, gv gvVar, Throwable th) {
            cloudMapResourceCallFactory.calls.remove(resourceCall);
            if (th != null && resourceCall.delivered.compareAndSet(false, true)) {
                BuildersKt__Builders_commonKt.launch$default(cloudMapResourceCallFactory.scope, null, null, new CloudMapResourceCallFactory$ResourceCall$enqueue$1$1(gvVar, resourceCall, null), 3, null);
            }
            return mf3.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object fetch(yf2 yf2Var, final Resource resource, q60 q60Var) throws IOException {
            final dv dvVarNewCall = this.this$0.transport.newCall(yf2Var);
            this.network.set(dvVarNewCall);
            checkCancelled();
            final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(hd0.G(q60Var), 1);
            cancellableContinuationImpl.initCancellability();
            cancellableContinuationImpl.invokeOnCancellation(new lu0() { // from class: com.vincenthzr.locationspoofer.data.cloud.CloudMapResourceCallFactory$ResourceCall$fetch$2$1
                @Override // defpackage.lu0
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return mf3.a;
                }

                public final void invoke(Throwable th) {
                    dvVarNewCall.cancel();
                }
            });
            ((xd2) dvVarNewCall).enqueue(new gv() { // from class: com.vincenthzr.locationspoofer.data.cloud.CloudMapResourceCallFactory$ResourceCall$fetch$2$2
                @Override // defpackage.gv
                public void onFailure(dv dvVar, IOException iOException) {
                    dvVar.getClass();
                    iOException.getClass();
                    AtomicReference atomicReference = this.this$0.network;
                    while (!atomicReference.compareAndSet(dvVar, null) && atomicReference.get() == dvVar) {
                    }
                    if (cancellableContinuationImpl.isActive()) {
                        cancellableContinuationImpl.resumeWith(new wg2(new CloudException("network_error", null, null, null, 14, null)));
                    }
                }

                @Override // defpackage.gv
                public void onResponse(dv dvVar, qg2 qg2Var) {
                    String str;
                    String str2;
                    Object wg2Var;
                    CloudMapResourceCallFactory.Download download;
                    dvVar.getClass();
                    qg2Var.getClass();
                    bd2 bd2Var = qg2Var.f;
                    tg2 tg2Var = qg2Var.k;
                    int i = qg2Var.h;
                    try {
                        try {
                            CloudMapResourceCallFactory.Resource resource2 = resource;
                            if (i != 200) {
                                try {
                                    if (!resource2.getEmptyTile() || i != 204) {
                                        if (300 <= i && i < 400) {
                                            throw new CloudException("redirect_rejected", null, null, null, 14, null);
                                        }
                                        if (i == 401) {
                                            str = "invalid_session";
                                        } else {
                                            str = i == 403 ? "map_forbidden" : "map_unavailable";
                                        }
                                        String str3 = str;
                                        du duVarSource = tg2Var != null ? tg2Var.source() : null;
                                        if (duVarSource == null || duVarSource.s(4097L)) {
                                            str2 = null;
                                        } else {
                                            try {
                                                String strOptString = new JSONObject(duVarSource.y()).optString("code", str3);
                                                strOptString.getClass();
                                                Pattern patternCompile = Pattern.compile("[a-z_]{1,64}");
                                                patternCompile.getClass();
                                                boolean zMatches = patternCompile.matcher(strOptString).matches();
                                                wg2Var = strOptString;
                                                if (!zMatches) {
                                                    wg2Var = null;
                                                }
                                            } catch (Throwable th) {
                                                wg2Var = new wg2(th);
                                            }
                                            boolean z = wg2Var instanceof wg2;
                                            Object obj = wg2Var;
                                            if (z) {
                                                obj = null;
                                            }
                                            str2 = (String) obj;
                                        }
                                        throw new CloudException(str2 == null ? str3 : str2, Integer.valueOf(i), null, null, 12, null);
                                    }
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        ji2.z(qg2Var, th2);
                                        throw th3;
                                    }
                                }
                            }
                            if (tg2Var == null) {
                                throw new CloudException("invalid_map_response", null, null, null, 14, null);
                            }
                            if (i != 204) {
                                kr1 kr1VarContentType = tg2Var.contentType();
                                if (kr1VarContentType != null) {
                                    if ((kr1VarContentType.b + "/" + kr1VarContentType.c).equals(resource2.getMime())) {
                                        if (tg2Var.contentLength() > resource2.getLimit() || tg2Var.source().s(resource2.getLimit() + 1)) {
                                            throw new CloudException("response_too_large", null, null, null, 14, null);
                                        }
                                        download = new CloudMapResourceCallFactory.Download(tg2Var.bytes(), bd2Var, i);
                                    }
                                }
                                throw new CloudException("invalid_map_response", null, null, null, 14, null);
                            }
                            if (tg2Var.source().s(1L)) {
                                throw new CloudException("invalid_map_response", null, null, null, 14, null);
                            }
                            download = new CloudMapResourceCallFactory.Download(new byte[0], bd2Var, i);
                            qg2Var.close();
                            if (cancellableContinuationImpl.isActive()) {
                                cancellableContinuationImpl.resumeWith(download);
                            }
                            AtomicReference atomicReference = this.this$0.network;
                            while (!atomicReference.compareAndSet(dvVar, null) && atomicReference.get() == dvVar) {
                            }
                        } catch (Exception e) {
                            if (cancellableContinuationImpl.isActive()) {
                                cancellableContinuationImpl.resumeWith(new wg2(e));
                            }
                            AtomicReference atomicReference2 = this.this$0.network;
                            while (!atomicReference2.compareAndSet(dvVar, null) && atomicReference2.get() == dvVar) {
                            }
                        }
                    } catch (Throwable th4) {
                        AtomicReference atomicReference3 = this.this$0.network;
                        while (!atomicReference3.compareAndSet(dvVar, null)) {
                            if (atomicReference3.get() != dvVar) {
                                throw th4;
                            }
                        }
                        throw th4;
                    }
                }
            });
            return cancellableContinuationImpl.getResult();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:8:0x0018  */
        public final Object perform(q60 q60Var) throws CloudException, IOException {
            CloudMapResourceCallFactory$ResourceCall$perform$1 cloudMapResourceCallFactory$ResourceCall$perform$1;
            if (q60Var instanceof CloudMapResourceCallFactory$ResourceCall$perform$1) {
                cloudMapResourceCallFactory$ResourceCall$perform$1 = (CloudMapResourceCallFactory$ResourceCall$perform$1) q60Var;
                int i = cloudMapResourceCallFactory$ResourceCall$perform$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    cloudMapResourceCallFactory$ResourceCall$perform$1.label = i - Integer.MIN_VALUE;
                } else {
                    cloudMapResourceCallFactory$ResourceCall$perform$1 = new CloudMapResourceCallFactory$ResourceCall$perform$1(this, q60Var);
                }
            } else {
                cloudMapResourceCallFactory$ResourceCall$perform$1 = new CloudMapResourceCallFactory$ResourceCall$perform$1(this, q60Var);
            }
            CloudMapResourceCallFactory$ResourceCall$perform$1 cloudMapResourceCallFactory$ResourceCall$perform$2 = cloudMapResourceCallFactory$ResourceCall$perform$1;
            Object objWithTimeout = cloudMapResourceCallFactory$ResourceCall$perform$2.result;
            int i2 = cloudMapResourceCallFactory$ResourceCall$perform$2.label;
            try {
                if (i2 == 0) {
                    ee0.J(objWithTimeout);
                    Resource resource = this.this$0.resource(this.publicRequest);
                    CloudMapResourceCache cache = this.this$0.getCache();
                    checkCancelled();
                    if (!this.this$0.pending.tryAcquire()) {
                        fo.r("map_queue_full");
                        return null;
                    }
                    long jH = this.timer.h();
                    if (jH == 0) {
                        jH = 15000000000L;
                    }
                    long jMin = this.timer.e() ? Math.min(jH, this.timer.c() - System.nanoTime()) : jH;
                    long jMax = Math.max(1L, jMin / 1000000);
                    CloudMapResourceCallFactory$ResourceCall$perform$2 cloudMapResourceCallFactory$ResourceCall$perform$3 = new CloudMapResourceCallFactory$ResourceCall$perform$2(this, this.this$0, resource, cache, null);
                    cloudMapResourceCallFactory$ResourceCall$perform$2.L$0 = null;
                    cloudMapResourceCallFactory$ResourceCall$perform$2.L$1 = null;
                    cloudMapResourceCallFactory$ResourceCall$perform$2.J$0 = jH;
                    cloudMapResourceCallFactory$ResourceCall$perform$2.J$1 = jMin;
                    cloudMapResourceCallFactory$ResourceCall$perform$2.label = 1;
                    objWithTimeout = TimeoutKt.withTimeout(jMax, cloudMapResourceCallFactory$ResourceCall$perform$3, cloudMapResourceCallFactory$ResourceCall$perform$2);
                    z70 z70Var = z70.e;
                    if (objWithTimeout == z70Var) {
                        return z70Var;
                    }
                } else {
                    if (i2 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ee0.J(objWithTimeout);
                }
                this.this$0.pending.release();
                return objWithTimeout;
            } catch (Throwable th) {
                this.this$0.pending.release();
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final qg2 response(Download download, Resource resource, CloudMapAuthorization cloudMapAuthorization) {
            byte[] bytes = download.getBytes();
            nx0 nx0Var = new nx0(0);
            yf2 yf2Var = this.publicRequest;
            yf2Var.getClass();
            bd2 protocol = download.getProtocol();
            protocol.getClass();
            int code = download.getCode();
            String str = download.getCode() == 204 ? "No Content" : "OK";
            String mime = resource.getMime();
            mime.getClass();
            nx0Var.q("Content-Type", mime);
            String strValueOf = String.valueOf(bytes.length);
            strValueOf.getClass();
            nx0Var.q("Content-Length", strValueOf);
            nx0Var.q("Cache-Control", "no-store");
            nx0Var.q("X-Content-Type-Options", "nosniff");
            Pattern pattern = kr1.e;
            GuardedBody guardedBody = new GuardedBody(this, bytes, mc0.p(resource.getMime()), cloudMapAuthorization, this);
            if (code >= 0) {
                return new qg2(yf2Var, protocol, str, code, null, nx0Var.c(), guardedBody, null, null, null, 0L, 0L, null);
            }
            b81.g(p91.l(code, "code < 0: "));
            return null;
        }

        public final boolean beforeGeneration(long j) {
            return this.stamp < j;
        }

        @Override // defpackage.dv
        public void cancel() {
            this.cancelled.set(true);
            dv dvVar = this.network.get();
            if (dvVar != null) {
                dvVar.cancel();
            }
            Job job = this.worker.get();
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public dv m0clone() {
            return new ResourceCall(this.this$0, this.publicRequest, this.stamp, this.networkOnly);
        }

        @Override // defpackage.dv
        public void enqueue(final gv gvVar) {
            gvVar.getClass();
            begin();
            Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(this.this$0.scope, null, null, new CloudMapResourceCallFactory$ResourceCall$enqueue$task$1(this, gvVar, this.this$0, null), 3, null);
            this.worker.set(jobLaunch$default);
            final CloudMapResourceCallFactory cloudMapResourceCallFactory = this.this$0;
            jobLaunch$default.invokeOnCompletion(new lu0() { // from class: com.vincenthzr.locationspoofer.data.cloud.a
                @Override // defpackage.lu0
                public final Object invoke(Object obj) {
                    return CloudMapResourceCallFactory.ResourceCall.enqueue$lambda$1(cloudMapResourceCallFactory, this, gvVar, (Throwable) obj);
                }
            });
            if (this.cancelled.get()) {
                Job.DefaultImpls.cancel$default(jobLaunch$default, (CancellationException) null, 1, (Object) null);
            }
        }

        @Override // defpackage.dv
        public qg2 execute() {
            begin();
            try {
                try {
                    qg2 qg2Var = (qg2) BuildersKt.runBlocking(Dispatchers.getIO(), new CloudMapResourceCallFactory$ResourceCall$execute$1(this, null));
                    this.this$0.calls.remove(this);
                    this.worker.set(null);
                    return qg2Var;
                } catch (Exception e) {
                    throw this.this$0.safeFailure(e);
                }
            } catch (Throwable th) {
                this.this$0.calls.remove(this);
                this.worker.set(null);
                throw th;
            }
        }

        public boolean isCanceled() {
            return this.cancelled.get();
        }

        public boolean isExecuted() {
            return this.executed.get();
        }

        @Override // defpackage.dv
        public yf2 request() {
            return this.publicRequest;
        }

        public pa3 timeout() {
            return this.timer;
        }

        public /* synthetic */ ResourceCall(CloudMapResourceCallFactory cloudMapResourceCallFactory, yf2 yf2Var, long j, boolean z, int i, ca0 ca0Var) {
            this(cloudMapResourceCallFactory, yf2Var, j, (i & 4) != 0 ? false : z);
        }
    }

    public /* synthetic */ CloudMapResourceCallFactory(CloudRepository cloudRepository, zz0 zz0Var, k12 k12Var, CloudMapResourceCache cloudMapResourceCache, int i, ca0 ca0Var) {
        this(cloudRepository, zz0Var, k12Var, (i & 8) != 0 ? null : cloudMapResourceCache);
    }
}
