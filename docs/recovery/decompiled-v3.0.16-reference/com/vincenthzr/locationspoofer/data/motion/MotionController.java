package com.vincenthzr.locationspoofer.data.motion;

import com.vincenthzr.locationspoofer.data.model.RoutePoint;
import com.vincenthzr.locationspoofer.data.state.SpoofingState;
import defpackage.am1;
import defpackage.au0;
import defpackage.az;
import defpackage.az2;
import defpackage.bv0;
import defpackage.ca0;
import defpackage.ce0;
import defpackage.ee0;
import defpackage.fo;
import defpackage.hd0;
import defpackage.i52;
import defpackage.k33;
import defpackage.l13;
import defpackage.lu0;
import defpackage.mf3;
import defpackage.mh0;
import defpackage.o51;
import defpackage.oi1;
import defpackage.p91;
import defpackage.pu0;
import defpackage.q60;
import defpackage.r60;
import defpackage.rv1;
import defpackage.s90;
import defpackage.sv1;
import defpackage.tj2;
import defpackage.uj2;
import defpackage.vd0;
import defpackage.vk0;
import defpackage.z60;
import defpackage.z70;
import defpackage.zy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class MotionController {
    private static final long MIN_WRITE_INTERVAL_MS = 250;
    private static final long TICK_MS = 100;
    private static final long WRITE_INTERVAL_MS = 1000;
    private final MutableStateFlow<State> _state;
    private final au0 authorized;
    private final boolean autoTick;
    private final au0 clock;
    private volatile double joyBearing;
    private volatile float joyIntensity;
    private long lastTickTs;
    private long lastWriteTs;
    private float lastWrittenBearing;
    private double lastWrittenSpeed;
    private boolean lateralDeviation;
    private long lateralSeed;
    private uj2 path;
    private double pauseDistance;
    private z60 pausePoint;
    private final AtomicReference<lu0> pendingWrite;
    private final au0 realismParams;
    private final ArrayList<z60> recorded;
    private double routeOffset;
    private long routeStartTs;
    private final CoroutineScope scope;
    private final MotionSink sink;
    private final StateFlow<State> state;
    private boolean stopAtDestination;
    private Job tickJob;
    private final Channel<mf3> writeSignal;
    public static final Companion Companion = new Companion(null);
    private static final List<SpeedPreset> PRESETS = am1.G(new SpeedPreset("WALKING", 1.4d), new SpeedPreset(DebugCoroutineInfoImplKt.RUNNING, 3.0d), new SpeedPreset("CYCLING", 5.5d), new SpeedPreset("DRIVING", 15.0d));

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.motion.MotionController$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final /* synthetic */ class AnonymousClass1 extends bv0 implements au0 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // defpackage.au0
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.motion.MotionController$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.motion.MotionController$3", f = "MotionController.kt", l = {143, 149}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends k33 implements pu0 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public AnonymousClass3(q60 q60Var) {
            super(2, q60Var);
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            return MotionController.this.new AnonymousClass3(q60Var);
        }

        @Override // defpackage.pu0
        public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
            return ((AnonymousClass3) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0047  */
        /* JADX WARN: Code duplicated, block: B:19:0x0052  */
        /* JADX WARN: Code duplicated, block: B:22:0x0064 A[Catch: Exception -> 0x007b, TRY_ENTER, TryCatch #0 {Exception -> 0x007b, blocks: (B:7:0x0019, B:22:0x0064, B:24:0x006c), top: B:31:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:28:0x007d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0061 -> B:27:0x007b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006a -> B:27:0x007b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0078 -> B:27:0x007b). Please report as a decompilation issue!!! */
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
                int r0 = r7.label
                r1 = 2
                r2 = 1
                r3 = 0
                z70 r4 = defpackage.z70.e
                if (r0 == 0) goto L2b
                if (r0 == r2) goto L23
                if (r0 != r1) goto L1d
                java.lang.Object r0 = r7.L$2
                lu0 r0 = (defpackage.lu0) r0
                java.lang.Object r0 = r7.L$1
                mf3 r0 = (defpackage.mf3) r0
                java.lang.Object r0 = r7.L$0
                kotlinx.coroutines.channels.ChannelIterator r0 = (kotlinx.coroutines.channels.ChannelIterator) r0
                defpackage.ee0.J(r8)     // Catch: java.lang.Exception -> L7b
                goto L7b
            L1d:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.fo.n(r7)
                return r3
            L23:
                java.lang.Object r0 = r7.L$0
                kotlinx.coroutines.channels.ChannelIterator r0 = (kotlinx.coroutines.channels.ChannelIterator) r0
                defpackage.ee0.J(r8)
                goto L4a
            L2b:
                defpackage.ee0.J(r8)
                com.vincenthzr.locationspoofer.data.motion.MotionController r8 = com.vincenthzr.locationspoofer.data.motion.MotionController.this
                kotlinx.coroutines.channels.Channel r8 = com.vincenthzr.locationspoofer.data.motion.MotionController.access$getWriteSignal$p(r8)
                kotlinx.coroutines.channels.ChannelIterator r8 = r8.iterator()
            L38:
                r7.L$0 = r8
                r7.L$1 = r3
                r7.L$2 = r3
                r7.label = r2
                java.lang.Object r0 = r8.hasNext(r7)
                if (r0 != r4) goto L47
                goto L7a
            L47:
                r6 = r0
                r0 = r8
                r8 = r6
            L4a:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L7d
                r0.next()
                com.vincenthzr.locationspoofer.data.motion.MotionController r8 = com.vincenthzr.locationspoofer.data.motion.MotionController.this
                java.util.concurrent.atomic.AtomicReference r8 = com.vincenthzr.locationspoofer.data.motion.MotionController.access$getPendingWrite$p(r8)
                java.lang.Object r8 = r8.getAndSet(r3)
                lu0 r8 = (defpackage.lu0) r8
                if (r8 != 0) goto L64
                goto L7b
            L64:
                com.vincenthzr.locationspoofer.data.motion.MotionController r5 = com.vincenthzr.locationspoofer.data.motion.MotionController.this     // Catch: java.lang.Exception -> L7b
                boolean r5 = com.vincenthzr.locationspoofer.data.motion.MotionController.access$ensureAuthorized(r5)     // Catch: java.lang.Exception -> L7b
                if (r5 == 0) goto L7b
                r7.L$0 = r0     // Catch: java.lang.Exception -> L7b
                r7.L$1 = r3     // Catch: java.lang.Exception -> L7b
                r7.L$2 = r3     // Catch: java.lang.Exception -> L7b
                r7.label = r1     // Catch: java.lang.Exception -> L7b
                java.lang.Object r8 = r8.invoke(r7)     // Catch: java.lang.Exception -> L7b
                if (r8 != r4) goto L7b
            L7a:
                return r4
            L7b:
                r8 = r0
                goto L38
            L7d:
                mf3 r7 = defpackage.mf3.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vincenthzr.locationspoofer.data.motion.MotionController.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public enum Mode {
        IDLE,
        STATIC,
        ROUTE,
        MANUAL;

        private static final /* synthetic */ vk0 $ENTRIES = hd0.s(values());

        public static vk0 getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public interface MotionSink {
        Object saveRoute(String str, List<RoutePoint> list, q60 q60Var);

        Object writeManual(double d, double d2, float f, double d3, long j, q60 q60Var);

        Object writeRoute(double d, double d2, float f, SpeedPreset speedPreset, List<RoutePoint> list, long j, double d3, boolean z, q60 q60Var);
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class RouteSession {
        private final boolean enableStepSimulation;
        private final boolean isAutoCadence;
        private final List<RoutePoint> points;
        private final boolean startedManually;
        private final int stepCadenceSpm;
        private final boolean stopAtDestination;

        public RouteSession(List<RoutePoint> list, boolean z, boolean z2, boolean z3, int i, boolean z4) {
            list.getClass();
            this.points = list;
            this.stopAtDestination = z;
            this.startedManually = z2;
            this.enableStepSimulation = z3;
            this.stepCadenceSpm = i;
            this.isAutoCadence = z4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RouteSession copy$default(RouteSession routeSession, List list, boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = routeSession.points;
            }
            if ((i2 & 2) != 0) {
                z = routeSession.stopAtDestination;
            }
            if ((i2 & 4) != 0) {
                z2 = routeSession.startedManually;
            }
            if ((i2 & 8) != 0) {
                z3 = routeSession.enableStepSimulation;
            }
            if ((i2 & 16) != 0) {
                i = routeSession.stepCadenceSpm;
            }
            if ((i2 & 32) != 0) {
                z4 = routeSession.isAutoCadence;
            }
            int i3 = i;
            boolean z5 = z4;
            return routeSession.copy(list, z, z2, z3, i3, z5);
        }

        public final List<RoutePoint> component1() {
            return this.points;
        }

        public final boolean component2() {
            return this.stopAtDestination;
        }

        public final boolean component3() {
            return this.startedManually;
        }

        public final boolean component4() {
            return this.enableStepSimulation;
        }

        public final int component5() {
            return this.stepCadenceSpm;
        }

        public final boolean component6() {
            return this.isAutoCadence;
        }

        public final RouteSession copy(List<RoutePoint> list, boolean z, boolean z2, boolean z3, int i, boolean z4) {
            list.getClass();
            return new RouteSession(list, z, z2, z3, i, z4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RouteSession)) {
                return false;
            }
            RouteSession routeSession = (RouteSession) obj;
            return o51.f(this.points, routeSession.points) && this.stopAtDestination == routeSession.stopAtDestination && this.startedManually == routeSession.startedManually && this.enableStepSimulation == routeSession.enableStepSimulation && this.stepCadenceSpm == routeSession.stepCadenceSpm && this.isAutoCadence == routeSession.isAutoCadence;
        }

        public final boolean getEnableStepSimulation() {
            return this.enableStepSimulation;
        }

        public final List<RoutePoint> getPoints() {
            return this.points;
        }

        public final boolean getStartedManually() {
            return this.startedManually;
        }

        public final int getStepCadenceSpm() {
            return this.stepCadenceSpm;
        }

        public final boolean getStopAtDestination() {
            return this.stopAtDestination;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isAutoCadence) + p91.b(this.stepCadenceSpm, p91.e(p91.e(p91.e(this.points.hashCode() * 31, 31, this.stopAtDestination), 31, this.startedManually), 31, this.enableStepSimulation), 31);
        }

        public final boolean isAutoCadence() {
            return this.isAutoCadence;
        }

        public String toString() {
            return "RouteSession(points=" + this.points + ", stopAtDestination=" + this.stopAtDestination + ", startedManually=" + this.startedManually + ", enableStepSimulation=" + this.enableStepSimulation + ", stepCadenceSpm=" + this.stepCadenceSpm + ", isAutoCadence=" + this.isAutoCadence + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class SpeedPreset {
        private final String name;
        private final double speedMs;

        public SpeedPreset(String str, double d) {
            str.getClass();
            this.name = str;
            this.speedMs = d;
        }

        public static /* synthetic */ SpeedPreset copy$default(SpeedPreset speedPreset, String str, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                str = speedPreset.name;
            }
            if ((i & 2) != 0) {
                d = speedPreset.speedMs;
            }
            return speedPreset.copy(str, d);
        }

        public final String component1() {
            return this.name;
        }

        public final double component2() {
            return this.speedMs;
        }

        public final SpeedPreset copy(String str, double d) {
            str.getClass();
            return new SpeedPreset(str, d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpeedPreset)) {
                return false;
            }
            SpeedPreset speedPreset = (SpeedPreset) obj;
            return o51.f(this.name, speedPreset.name) && Double.compare(this.speedMs, speedPreset.speedMs) == 0;
        }

        public final String getName() {
            return this.name;
        }

        public final double getSpeedMs() {
            return this.speedMs;
        }

        public int hashCode() {
            return Double.hashCode(this.speedMs) + (this.name.hashCode() * 31);
        }

        public String toString() {
            return "SpeedPreset(name=" + this.name + ", speedMs=" + this.speedMs + ")";
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.motion.MotionController$ensureTicking$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.motion.MotionController$ensureTicking$1", f = "MotionController.kt", l = {363}, m = "invokeSuspend")
    public static final class C00781 extends k33 implements pu0 {
        private /* synthetic */ Object L$0;
        int label;

        public C00781(q60 q60Var) {
            super(2, q60Var);
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            C00781 c00781 = MotionController.this.new C00781(q60Var);
            c00781.L$0 = obj;
            return c00781;
        }

        @Override // defpackage.pu0
        public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
            return ((C00781) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            int i = this.label;
            if (i != 0 && i != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(obj);
            while (CoroutineScopeKt.isActive(coroutineScope)) {
                MotionController motionController = MotionController.this;
                motionController.tick$core_data_globalRelease(((Number) motionController.clock.invoke()).longValue());
                this.L$0 = coroutineScope;
                this.label = 1;
                Object objDelay = DelayKt.delay(MotionController.TICK_MS, this);
                z70 z70Var = z70.e;
                if (objDelay == z70Var) {
                    return z70Var;
                }
            }
            return mf3.a;
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.motion.MotionController$requestManualWrite$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.motion.MotionController$requestManualWrite$1", f = "MotionController.kt", l = {435}, m = "invokeSuspend")
    public static final class C00791 extends k33 implements lu0 {
        final /* synthetic */ float $bearing;
        final /* synthetic */ double $lat;
        final /* synthetic */ double $lng;
        final /* synthetic */ long $now;
        final /* synthetic */ double $speed;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00791(double d, double d2, float f, double d3, long j, q60 q60Var) {
            super(1, q60Var);
            this.$lat = d;
            this.$lng = d2;
            this.$bearing = f;
            this.$speed = d3;
            this.$now = j;
        }

        @Override // defpackage.oq
        public final q60 create(q60 q60Var) {
            return MotionController.this.new C00791(this.$lat, this.$lng, this.$bearing, this.$speed, this.$now, q60Var);
        }

        @Override // defpackage.lu0
        public final Object invoke(q60 q60Var) {
            return ((C00791) create(q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ee0.J(obj);
                MotionSink motionSink = MotionController.this.sink;
                double d = this.$lat;
                double d2 = this.$lng;
                float f = this.$bearing;
                double d3 = this.$speed;
                long j = this.$now;
                this.label = 1;
                Object objWriteManual = motionSink.writeManual(d, d2, f, d3, j, this);
                z70 z70Var = z70.e;
                if (objWriteManual == z70Var) {
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

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.motion.MotionController$requestRouteWrite$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.motion.MotionController$requestRouteWrite$1", f = "MotionController.kt", l = {450}, m = "invokeSuspend")
    public static final class C00801 extends k33 implements lu0 {
        final /* synthetic */ double $offset;
        final /* synthetic */ List<RoutePoint> $points;
        final /* synthetic */ State $s;
        final /* synthetic */ long $start;
        final /* synthetic */ boolean $stop;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00801(State state, List<RoutePoint> list, long j, double d, boolean z, q60 q60Var) {
            super(1, q60Var);
            this.$s = state;
            this.$points = list;
            this.$start = j;
            this.$offset = d;
            this.$stop = z;
        }

        @Override // defpackage.oq
        public final q60 create(q60 q60Var) {
            return MotionController.this.new C00801(this.$s, this.$points, this.$start, this.$offset, this.$stop, q60Var);
        }

        @Override // defpackage.lu0
        public final Object invoke(q60 q60Var) {
            return ((C00801) create(q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ee0.J(obj);
                MotionSink motionSink = MotionController.this.sink;
                double lat = this.$s.getLat();
                double lng = this.$s.getLng();
                float bearing = this.$s.getBearing();
                SpeedPreset preset = this.$s.getPreset();
                List<RoutePoint> list = this.$points;
                long j = this.$start;
                double d = this.$offset;
                boolean z = this.$stop;
                this.label = 1;
                Object objWriteRoute = motionSink.writeRoute(lat, lng, bearing, preset, list, j, d, z, this);
                z70 z70Var = z70.e;
                if (objWriteRoute == z70Var) {
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

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.motion.MotionController$saveRecording$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.motion.MotionController", f = "MotionController.kt", l = {314}, m = "saveRecording")
    public static final class C00811 extends r60 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C00811(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MotionController.this.saveRecording(null, this);
        }
    }

    public MotionController(MotionSink motionSink, au0 au0Var, au0 au0Var2, boolean z, au0 au0Var3) {
        motionSink.getClass();
        au0Var.getClass();
        au0Var2.getClass();
        au0Var3.getClass();
        this.sink = motionSink;
        this.realismParams = au0Var;
        this.clock = au0Var2;
        this.autoTick = z;
        this.authorized = au0Var3;
        MutableStateFlow<State> MutableStateFlow = StateFlowKt.MutableStateFlow(new State(null, 0.0d, 0.0d, 0.0f, 0.0d, false, null, false, false, null, false, 0, 0.0d, false, 16383, null));
        this._state = MutableStateFlow;
        this.state = FlowKt.asStateFlow(MutableStateFlow);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getDefault()));
        this.scope = CoroutineScope;
        this.recorded = new ArrayList<>();
        this.pendingWrite = new AtomicReference<>(null);
        this.writeSignal = ChannelKt.Channel$default(-1, null, null, 6, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new AnonymousClass3(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0() {
        return false;
    }

    private final float angleDiff(float f, float f2) {
        float fAbs = Math.abs(f - f2) % 360.0f;
        return fAbs > 180.0f ? 360.0f - fAbs : fAbs;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0046  */
    private final void appendRecordedPoint(z60 z60Var, boolean z) {
        boolean z2;
        State value;
        State state;
        State value2;
        z60 z60Var2 = (z60) zy.u0(this.recorded);
        if (z60Var2 == null) {
            this.recorded.add(z60Var);
        } else {
            double dO = vd0.o(z60Var2, z60Var);
            if (this.recorded.size() >= 2) {
                ArrayList<z60> arrayList = this.recorded;
                z60 z60Var3 = arrayList.get(arrayList.size() - 2);
                z60Var3.getClass();
                if (angleDiff(vd0.g(z60Var3, z60Var2), vd0.g(z60Var2, z60Var)) >= 25.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            if (dO < 5.0d && ((dO < 2.0d || !z2) && (!z || dO < 0.5d))) {
                return;
            }
            this.recorded.add(z60Var);
            MutableStateFlow<State> mutableStateFlow = this._state;
            do {
                value = mutableStateFlow.getValue();
                state = value;
            } while (!mutableStateFlow.compareAndSet(value, State.copy$default(state, null, 0.0d, 0.0d, 0.0f, 0.0d, false, null, false, false, null, false, 0, state.getRecordedDistanceM() + dO, false, 12287, null)));
        }
        MutableStateFlow<State> mutableStateFlow2 = this._state;
        do {
            value2 = mutableStateFlow2.getValue();
        } while (!mutableStateFlow2.compareAndSet(value2, State.copy$default(value2, null, 0.0d, 0.0d, 0.0f, 0.0d, false, null, false, false, null, false, this.recorded.size(), 0.0d, false, 14335, null)));
    }

    private final void clearRoute() {
        this.path = null;
        this.routeOffset = 0.0d;
        this.pausePoint = null;
        SpoofingState.INSTANCE.setRouteDistanceOffset(0.0d);
    }

    private final void enqueueWrite(lu0 lu0Var) {
        this.pendingWrite.set(lu0Var);
        this.writeSignal.mo32trySendJP2dKIU(mf3.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean ensureAuthorized() {
        if (((Boolean) this.authorized.invoke()).booleanValue()) {
            return true;
        }
        onStopped();
        return false;
    }

    private final void ensureTicking() {
        if (this.autoTick) {
            Job job = this.tickJob;
            if (job == null || !job.isActive()) {
                this.lastTickTs = ((Number) this.clock.invoke()).longValue();
                this.tickJob = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C00781(null), 3, null);
            }
        }
    }

    private final void finishRecording() {
        State value;
        State value2 = this._state.getValue();
        appendRecordedPoint(new z60(value2.getLat(), value2.getLng()), true);
        MutableStateFlow<State> mutableStateFlow = this._state;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, State.copy$default(value, null, 0.0d, 0.0d, 0.0f, 0.0d, false, null, false, false, null, false, 0, 0.0d, this.recorded.size() >= 2, 7167, null)));
    }

    private final void moveBy(z60 z60Var, float f, double d, double d2, long j) {
        z60 z60Var2;
        float f2 = f;
        z60 z60VarM = vd0.m(z60Var, f2, d);
        MutableStateFlow<State> mutableStateFlow = this._state;
        while (true) {
            State value = mutableStateFlow.getValue();
            MutableStateFlow<State> mutableStateFlow2 = mutableStateFlow;
            z60Var2 = z60VarM;
            if (mutableStateFlow2.compareAndSet(value, State.copy$default(value, null, z60VarM.a, z60VarM.b, f2, d2, false, null, false, false, null, false, 0, 0.0d, false, 16353, null))) {
                break;
            }
            f2 = f;
            mutableStateFlow = mutableStateFlow2;
            z60VarM = z60Var2;
        }
        boolean z = angleDiff(f2, this.lastWrittenBearing) >= 20.0f;
        boolean z2 = Math.abs(d2 - this.lastWrittenSpeed) > Math.max(this.lastWrittenSpeed * 0.3d, 0.2d);
        long j2 = j - this.lastWriteTs;
        if (j2 >= WRITE_INTERVAL_MS || ((z || z2) && j2 >= MIN_WRITE_INTERVAL_MS)) {
            requestManualWrite(z60Var2.a, z60Var2.b, f2, d2, j);
        }
    }

    private final rv1 realism(long j) {
        i52 i52Var = (i52) this.realismParams.invoke();
        return sv1.c(((Number) i52Var.e).intValue(), ((Number) i52Var.f).intValue(), j);
    }

    private final void requestManualWrite(double d, double d2, float f, double d3, long j) {
        this.lastWriteTs = j;
        this.lastWrittenBearing = f;
        this.lastWrittenSpeed = d3;
        SpoofingState spoofingState = SpoofingState.INSTANCE;
        spoofingState.setLatitude(d);
        spoofingState.setLongitude(d2);
        spoofingState.setSimMode("JOYSTICK");
        spoofingState.setSimBearing(f);
        spoofingState.setStartTimestamp(j);
        spoofingState.setRouteMode(false);
        enqueueWrite(new C00791(d, d2, f, d3, j, null));
    }

    private final void requestRouteWrite(long j) {
        uj2 uj2Var = this.path;
        if (uj2Var == null) {
            return;
        }
        State value = this._state.getValue();
        double d = this.routeOffset;
        long j2 = this.routeStartTs;
        SpoofingState spoofingState = SpoofingState.INSTANCE;
        spoofingState.setStartTimestamp(j2);
        spoofingState.setRouteDistanceOffset(d);
        spoofingState.setRouteMode(true);
        spoofingState.setSimMode(value.getPreset().getName());
        ArrayList arrayList = uj2Var.a;
        ArrayList arrayList2 = new ArrayList(az.Y(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            z60 z60Var = (z60) obj;
            arrayList2.add(new RoutePoint(z60Var.a, z60Var.b, 0.0d, 4, (ca0) null));
        }
        enqueueWrite(new C00801(value, arrayList2, j2, d, this.stopAtDestination, null));
    }

    private final void resumeRoute(long j) {
        State value;
        z60 z60Var = this.pausePoint;
        if (z60Var == null) {
            return;
        }
        this.routeOffset = this.pauseDistance;
        this.routeStartTs = j;
        this.pausePoint = null;
        MutableStateFlow<State> mutableStateFlow = this._state;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, State.copy$default(value, Mode.ROUTE, z60Var.a, z60Var.b, 0.0f, 0.0d, false, null, false, false, null, false, 0, 0.0d, false, 15992, null)));
        requestRouteWrite(j);
    }

    private final tj2 routePosition(uj2 uj2Var, double d) {
        boolean z = this.lateralDeviation;
        boolean z2 = this.stopAtDestination;
        return z ? ce0.O(uj2Var, d, z2, this.lateralSeed) : uj2Var.b(d, z2);
    }

    private final double traveledAt(long j) {
        long j2 = this.routeStartTs;
        long j3 = j - j2;
        if (j3 < 0) {
            j3 = 0;
        }
        double d = j3 / 1000.0d;
        double d2 = this.routeOffset;
        rv1 rv1VarRealism = realism(j2);
        return (((rv1VarRealism.e.u(d) * rv1VarRealism.d) + d) * this._state.getValue().getPreset().getSpeedMs()) + d2;
    }

    public final void discardRecording() {
        State value;
        this.recorded.clear();
        MutableStateFlow<State> mutableStateFlow = this._state;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, State.copy$default(value, null, 0.0d, 0.0d, 0.0f, 0.0d, false, null, false, false, null, false, 0, 0.0d, false, 1023, null)));
    }

    public final StateFlow<State> getState() {
        return this.state;
    }

    public final void joystick(double d, float f) {
        State value;
        MotionController motionController = this;
        if (!motionController.ensureAuthorized()) {
            return;
        }
        State value2 = motionController._state.getValue();
        if (!value2.getJoystickEnabled()) {
            return;
        }
        if (f > 0.0f && value2.getMode() == Mode.STATIC) {
            MutableStateFlow<State> mutableStateFlow = motionController._state;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, State.copy$default(value, Mode.MANUAL, 0.0d, 0.0d, 0.0f, 0.0d, false, null, false, false, null, false, 0, 0.0d, false, 16382, null)));
        }
        boolean z = motionController.joyIntensity > 0.0f;
        motionController.joyBearing = d;
        motionController.joyIntensity = mh0.u(f, 0.0f, 1.0f);
        if (!z || motionController.joyIntensity != 0.0f) {
            return;
        }
        State value3 = motionController._state.getValue();
        MutableStateFlow<State> mutableStateFlow2 = motionController._state;
        while (true) {
            State value4 = mutableStateFlow2.getValue();
            if (mutableStateFlow2.compareAndSet(value4, State.copy$default(value4, null, 0.0d, 0.0d, 0.0f, 0.0d, false, null, false, false, null, false, 0, 0.0d, false, 16367, null))) {
                motionController.requestManualWrite(value3.getLat(), value3.getLng(), value3.getBearing(), 0.0d, ((Number) motionController.clock.invoke()).longValue());
                return;
            }
            motionController = this;
        }
    }

    public final void onRouteStarted(List<RoutePoint> list, SpeedPreset speedPreset, boolean z, long j, boolean z2, boolean z3, long j2, boolean z4, int i, boolean z5) {
        list.getClass();
        speedPreset.getClass();
        if (!ensureAuthorized()) {
            return;
        }
        ArrayList arrayList = new ArrayList(az.Y(list, 10));
        for (RoutePoint routePoint : list) {
            arrayList.add(new z60(routePoint.getLat(), routePoint.getLng()));
        }
        uj2 uj2Var = new uj2(arrayList);
        if (!uj2Var.a()) {
            return;
        }
        this.path = uj2Var;
        this.lateralDeviation = z3;
        this.lateralSeed = j2;
        boolean z6 = z;
        this.stopAtDestination = z6;
        this.routeStartTs = j;
        this.routeOffset = 0.0d;
        this.joyIntensity = 0.0f;
        z60 z60Var = (z60) zy.n0(arrayList);
        if (z2) {
            this.pausePoint = z60Var;
            this.pauseDistance = 0.0d;
        } else {
            this.pausePoint = null;
        }
        MutableStateFlow<State> mutableStateFlow = this._state;
        while (true) {
            State value = mutableStateFlow.getValue();
            if (mutableStateFlow.compareAndSet(value, State.copy$default(value, z2 ? Mode.MANUAL : Mode.ROUTE, z60Var.a, z60Var.b, 0.0f, 0.0d, true, new RouteSession(zy.J0(list), z6, z2, z4, i, z5), z2, false, speedPreset, false, 0, 0.0d, false, 15368, null))) {
                ensureTicking();
                return;
            }
            z6 = z;
        }
    }

    public final void onStaticStarted(double d, double d2) {
        State value;
        if (ensureAuthorized()) {
            clearRoute();
            this.joyIntensity = 0.0f;
            MutableStateFlow<State> mutableStateFlow = this._state;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, State.copy$default(value, Mode.STATIC, d, d2, 0.0f, 0.0d, false, null, false, false, null, false, 0, 0.0d, false, 15880, null)));
            ensureTicking();
        }
    }

    public final void onStopped() {
        State value;
        clearRoute();
        this.joyIntensity = 0.0f;
        this.pendingWrite.set(null);
        if (this._state.getValue().getRecording()) {
            finishRecording();
        }
        MutableStateFlow<State> mutableStateFlow = this._state;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, State.copy$default(value, Mode.IDLE, 0.0d, 0.0d, 0.0f, 0.0d, false, null, false, false, null, false, 0, 0.0d, false, 15886, null)));
        Job job = this.tickJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.tickJob = null;
    }

    public final void pause() {
        MotionController motionController = this;
        if (!motionController.ensureAuthorized()) {
            return;
        }
        State value = motionController._state.getValue();
        uj2 uj2Var = motionController.path;
        if (uj2Var == null || value.getMode() != Mode.ROUTE) {
            return;
        }
        long jLongValue = ((Number) motionController.clock.invoke()).longValue();
        double dTraveledAt = motionController.traveledAt(jLongValue);
        tj2 tj2VarRoutePosition = motionController.routePosition(uj2Var, dTraveledAt);
        motionController.pauseDistance = dTraveledAt;
        motionController.pausePoint = new z60(tj2VarRoutePosition.a, tj2VarRoutePosition.b);
        motionController.joyIntensity = 0.0f;
        MutableStateFlow<State> mutableStateFlow = motionController._state;
        while (true) {
            State value2 = mutableStateFlow.getValue();
            if (mutableStateFlow.compareAndSet(value2, State.copy$default(value2, Mode.MANUAL, tj2VarRoutePosition.a, tj2VarRoutePosition.b, tj2VarRoutePosition.c, 0.0d, false, null, true, false, null, false, 0, 0.0d, false, 16224, null))) {
                motionController.requestManualWrite(tj2VarRoutePosition.a, tj2VarRoutePosition.b, tj2VarRoutePosition.c, 0.0d, jLongValue);
                return;
            }
            motionController = this;
        }
    }

    public final void resume() {
        State value;
        if (ensureAuthorized()) {
            State value2 = this._state.getValue();
            z60 z60Var = this.pausePoint;
            if (z60Var != null && value2.getPaused()) {
                this.joyIntensity = 0.0f;
                if (vd0.o(new z60(value2.getLat(), value2.getLng()), z60Var) < 1.0d) {
                    resumeRoute(((Number) this.clock.invoke()).longValue());
                    return;
                }
                MutableStateFlow<State> mutableStateFlow = this._state;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, State.copy$default(value, null, 0.0d, 0.0d, 0.0f, 0.0d, false, null, false, true, null, false, 0, 0.0d, false, 16127, null)));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object saveRecording(String str, q60 q60Var) {
        C00811 c00811;
        if (q60Var instanceof C00811) {
            c00811 = (C00811) q60Var;
            int i = c00811.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00811.label = i - Integer.MIN_VALUE;
            } else {
                c00811 = new C00811(q60Var);
            }
        } else {
            c00811 = new C00811(q60Var);
        }
        Object obj = c00811.result;
        int i2 = c00811.label;
        if (i2 == 0) {
            ee0.J(obj);
            if (this.recorded.size() < 2 || l13.k0(str)) {
                return Boolean.FALSE;
            }
            ArrayList<z60> arrayList = this.recorded;
            ArrayList arrayList2 = new ArrayList(az.Y(arrayList, 10));
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                z60 z60Var = arrayList.get(i3);
                i3++;
                z60 z60Var2 = z60Var;
                arrayList2.add(new RoutePoint(z60Var2.a, z60Var2.b, 0.0d, 4, (ca0) null));
            }
            MotionSink motionSink = this.sink;
            String string = l13.D0(str).toString();
            c00811.L$0 = null;
            c00811.L$1 = null;
            c00811.label = 1;
            Object objSaveRoute = motionSink.saveRoute(string, arrayList2, c00811);
            z70 z70Var = z70.e;
            if (objSaveRoute == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(obj);
        }
        discardRecording();
        return Boolean.TRUE;
    }

    public final void setSpeedPreset(SpeedPreset speedPreset) {
        State value;
        State value2;
        speedPreset.getClass();
        if (!this._state.getValue().getActive() || ensureAuthorized()) {
            if (this._state.getValue().getMode() != Mode.ROUTE || this.path == null) {
                MutableStateFlow<State> mutableStateFlow = this._state;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, State.copy$default(value, null, 0.0d, 0.0d, 0.0f, 0.0d, false, null, false, false, speedPreset, false, 0, 0.0d, false, 15871, null)));
                return;
            }
            long jLongValue = ((Number) this.clock.invoke()).longValue();
            this.routeOffset = traveledAt(jLongValue);
            this.routeStartTs = jLongValue;
            MutableStateFlow<State> mutableStateFlow2 = this._state;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, State.copy$default(value2, null, 0.0d, 0.0d, 0.0f, 0.0d, false, null, false, false, speedPreset, false, 0, 0.0d, false, 15871, null)));
            requestRouteWrite(jLongValue);
        }
    }

    public final void startRecording() {
        State value;
        if (ensureAuthorized()) {
            State value2 = this._state.getValue();
            if (!value2.getActive() || value2.getRecording()) {
                return;
            }
            this.recorded.clear();
            this.recorded.add(new z60(value2.getLat(), value2.getLng()));
            MutableStateFlow<State> mutableStateFlow = this._state;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, State.copy$default(value, null, 0.0d, 0.0d, 0.0f, 0.0d, false, null, false, false, null, true, 1, 0.0d, false, 1023, null)));
        }
    }

    public final void stopRecording() {
        if (this._state.getValue().getRecording()) {
            finishRecording();
        }
    }

    public final void syncFromSpoofingStateIfIdle() {
        if (ensureAuthorized() && this._state.getValue().getMode() == Mode.IDLE) {
            SpoofingState spoofingState = SpoofingState.INSTANCE;
            if (spoofingState.isActive()) {
                onStaticStarted(spoofingState.getLatitude(), spoofingState.getLongitude());
            }
        }
    }

    public final void tick$core_data_globalRelease(long j) {
        State value;
        double dH;
        if (ensureAuthorized()) {
            double dW = mh0.w(j - this.lastTickTs, 0L, WRITE_INTERVAL_MS) / 1000.0d;
            this.lastTickTs = j;
            State value2 = this._state.getValue();
            if (value2.getMode() == Mode.ROUTE) {
                uj2 uj2Var = this.path;
                if (uj2Var == null) {
                    return;
                }
                long j2 = j - this.routeStartTs;
                if (j2 < 0) {
                    j2 = 0;
                }
                double d = j2 / 1000.0d;
                tj2 tj2VarRoutePosition = routePosition(uj2Var, traveledAt(j));
                if (tj2VarRoutePosition.d) {
                    dH = 0.0d;
                } else {
                    rv1 rv1VarRealism = realism(this.routeStartTs);
                    dH = ((rv1VarRealism.e.H(d) * rv1VarRealism.d) + 1.0d) * value2.getPreset().getSpeedMs();
                }
                double d2 = dH;
                MutableStateFlow<State> mutableStateFlow = this._state;
                while (true) {
                    State value3 = mutableStateFlow.getValue();
                    double d3 = d2;
                    if (mutableStateFlow.compareAndSet(value3, State.copy$default(value3, null, tj2VarRoutePosition.a, tj2VarRoutePosition.b, tj2VarRoutePosition.c, d2, false, null, false, false, null, false, 0, 0.0d, false, 16353, null))) {
                        break;
                    } else {
                        d2 = d3;
                    }
                }
            } else if (value2.getReturning()) {
                z60 z60Var = this.pausePoint;
                if (z60Var == null) {
                    return;
                }
                z60 z60Var2 = new z60(value2.getLat(), value2.getLng());
                double dO = vd0.o(z60Var2, z60Var);
                double speedMs = value2.getPreset().getSpeedMs() * dW;
                if (dO <= Math.max(speedMs, 1.0d)) {
                    MutableStateFlow<State> mutableStateFlow2 = this._state;
                    do {
                        value = mutableStateFlow2.getValue();
                    } while (!mutableStateFlow2.compareAndSet(value, State.copy$default(value, null, z60Var.a, z60Var.b, 0.0f, 0.0d, false, null, false, false, null, false, 0, 0.0d, false, 16377, null)));
                    resumeRoute(j);
                } else {
                    moveBy(z60Var2, vd0.g(z60Var2, z60Var), speedMs, value2.getPreset().getSpeedMs(), j);
                }
            } else if (value2.getMode() == Mode.MANUAL && this.joyIntensity > 0.0f) {
                double speedMs2 = value2.getPreset().getSpeedMs() * ((double) this.joyIntensity);
                moveBy(new z60(value2.getLat(), value2.getLng()), (float) this.joyBearing, speedMs2 * dW, speedMs2, j);
            }
            if (this._state.getValue().getRecording()) {
                appendRecordedPoint(new z60(this._state.getValue().getLat(), this._state.getValue().getLng()), false);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }

        public final List<SpeedPreset> getPRESETS() {
            return MotionController.PRESETS;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MotionController(MotionSink motionSink, au0 au0Var, au0 au0Var2, boolean z, au0 au0Var3, int i, ca0 ca0Var) {
        this(motionSink, au0Var, (i & 4) != 0 ? AnonymousClass1.INSTANCE : au0Var2, (i & 8) != 0 ? true : z, (i & 16) != 0 ? new oi1(9) : au0Var3);
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class State {
        private final float bearing;
        private final boolean hasPendingRecording;
        private final boolean hasRoute;
        private final double lat;
        private final double lng;
        private final Mode mode;
        private final boolean paused;
        private final SpeedPreset preset;
        private final double recordedDistanceM;
        private final int recordedPointCount;
        private final boolean recording;
        private final boolean returning;
        private final RouteSession route;
        private final double speedMs;

        public /* synthetic */ State(Mode mode, double d, double d2, float f, double d3, boolean z, RouteSession routeSession, boolean z2, boolean z3, SpeedPreset speedPreset, boolean z4, int i, double d4, boolean z5, int i2, ca0 ca0Var) {
            this((i2 & 1) != 0 ? Mode.IDLE : mode, (i2 & 2) != 0 ? 0.0d : d, (i2 & 4) != 0 ? 0.0d : d2, (i2 & 8) != 0 ? 0.0f : f, (i2 & 16) != 0 ? 0.0d : d3, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? null : routeSession, (i2 & WorkQueueKt.BUFFER_CAPACITY) != 0 ? false : z2, (i2 & 256) != 0 ? false : z3, (i2 & 512) != 0 ? (SpeedPreset) zy.n0(MotionController.Companion.getPRESETS()) : speedPreset, (i2 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? false : z4, (i2 & 2048) != 0 ? 0 : i, (i2 & 4096) != 0 ? 0.0d : d4, (i2 & 8192) != 0 ? false : z5);
        }

        public static /* synthetic */ State copy$default(State state, Mode mode, double d, double d2, float f, double d3, boolean z, RouteSession routeSession, boolean z2, boolean z3, SpeedPreset speedPreset, boolean z4, int i, double d4, boolean z5, int i2, Object obj) {
            return state.copy((i2 & 1) != 0 ? state.mode : mode, (i2 & 2) != 0 ? state.lat : d, (i2 & 4) != 0 ? state.lng : d2, (i2 & 8) != 0 ? state.bearing : f, (i2 & 16) != 0 ? state.speedMs : d3, (i2 & 32) != 0 ? state.hasRoute : z, (i2 & 64) != 0 ? state.route : routeSession, (i2 & WorkQueueKt.BUFFER_CAPACITY) != 0 ? state.paused : z2, (i2 & 256) != 0 ? state.returning : z3, (i2 & 512) != 0 ? state.preset : speedPreset, (i2 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? state.recording : z4, (i2 & 2048) != 0 ? state.recordedPointCount : i, (i2 & 4096) != 0 ? state.recordedDistanceM : d4, (i2 & 8192) != 0 ? state.hasPendingRecording : z5);
        }

        public final Mode component1() {
            return this.mode;
        }

        public final SpeedPreset component10() {
            return this.preset;
        }

        public final boolean component11() {
            return this.recording;
        }

        public final int component12() {
            return this.recordedPointCount;
        }

        public final double component13() {
            return this.recordedDistanceM;
        }

        public final boolean component14() {
            return this.hasPendingRecording;
        }

        public final double component2() {
            return this.lat;
        }

        public final double component3() {
            return this.lng;
        }

        public final float component4() {
            return this.bearing;
        }

        public final double component5() {
            return this.speedMs;
        }

        public final boolean component6() {
            return this.hasRoute;
        }

        public final RouteSession component7() {
            return this.route;
        }

        public final boolean component8() {
            return this.paused;
        }

        public final boolean component9() {
            return this.returning;
        }

        public final State copy(Mode mode, double d, double d2, float f, double d3, boolean z, RouteSession routeSession, boolean z2, boolean z3, SpeedPreset speedPreset, boolean z4, int i, double d4, boolean z5) {
            mode.getClass();
            speedPreset.getClass();
            return new State(mode, d, d2, f, d3, z, routeSession, z2, z3, speedPreset, z4, i, d4, z5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return this.mode == state.mode && Double.compare(this.lat, state.lat) == 0 && Double.compare(this.lng, state.lng) == 0 && Float.compare(this.bearing, state.bearing) == 0 && Double.compare(this.speedMs, state.speedMs) == 0 && this.hasRoute == state.hasRoute && o51.f(this.route, state.route) && this.paused == state.paused && this.returning == state.returning && o51.f(this.preset, state.preset) && this.recording == state.recording && this.recordedPointCount == state.recordedPointCount && Double.compare(this.recordedDistanceM, state.recordedDistanceM) == 0 && this.hasPendingRecording == state.hasPendingRecording;
        }

        public final boolean getActive() {
            return this.mode != Mode.IDLE;
        }

        public final float getBearing() {
            return this.bearing;
        }

        public final boolean getHasPendingRecording() {
            return this.hasPendingRecording;
        }

        public final boolean getHasRoute() {
            return this.hasRoute;
        }

        public final boolean getJoystickEnabled() {
            return (!getActive() || this.mode == Mode.ROUTE || this.returning) ? false : true;
        }

        public final boolean getKeepJoystickVisible() {
            return getActive() || this.hasPendingRecording;
        }

        public final double getLat() {
            return this.lat;
        }

        public final double getLng() {
            return this.lng;
        }

        public final Mode getMode() {
            return this.mode;
        }

        public final boolean getPaused() {
            return this.paused;
        }

        public final SpeedPreset getPreset() {
            return this.preset;
        }

        public final double getRecordedDistanceM() {
            return this.recordedDistanceM;
        }

        public final int getRecordedPointCount() {
            return this.recordedPointCount;
        }

        public final boolean getRecording() {
            return this.recording;
        }

        public final boolean getReturning() {
            return this.returning;
        }

        public final RouteSession getRoute() {
            return this.route;
        }

        public final double getSpeedMs() {
            return this.speedMs;
        }

        public int hashCode() {
            int iE = p91.e(p91.a(this.speedMs, az2.c(this.bearing, p91.a(this.lng, p91.a(this.lat, this.mode.hashCode() * 31, 31), 31), 31), 31), 31, this.hasRoute);
            RouteSession routeSession = this.route;
            return Boolean.hashCode(this.hasPendingRecording) + p91.a(this.recordedDistanceM, p91.b(this.recordedPointCount, p91.e((this.preset.hashCode() + p91.e(p91.e((iE + (routeSession == null ? 0 : routeSession.hashCode())) * 31, 31, this.paused), 31, this.returning)) * 31, 31, this.recording), 31), 31);
        }

        public String toString() {
            Mode mode = this.mode;
            double d = this.lat;
            double d2 = this.lng;
            float f = this.bearing;
            double d3 = this.speedMs;
            boolean z = this.hasRoute;
            RouteSession routeSession = this.route;
            boolean z2 = this.paused;
            boolean z3 = this.returning;
            SpeedPreset speedPreset = this.preset;
            boolean z4 = this.recording;
            int i = this.recordedPointCount;
            double d4 = this.recordedDistanceM;
            boolean z5 = this.hasPendingRecording;
            StringBuilder sb = new StringBuilder("State(mode=");
            sb.append(mode);
            sb.append(", lat=");
            sb.append(d);
            az2.x(sb, ", lng=", d2, ", bearing=");
            sb.append(f);
            sb.append(", speedMs=");
            sb.append(d3);
            sb.append(", hasRoute=");
            sb.append(z);
            sb.append(", route=");
            sb.append(routeSession);
            sb.append(", paused=");
            sb.append(z2);
            sb.append(", returning=");
            sb.append(z3);
            sb.append(", preset=");
            sb.append(speedPreset);
            sb.append(", recording=");
            sb.append(z4);
            sb.append(", recordedPointCount=");
            sb.append(i);
            sb.append(", recordedDistanceM=");
            sb.append(d4);
            sb.append(", hasPendingRecording=");
            sb.append(z5);
            sb.append(")");
            return sb.toString();
        }

        public State(Mode mode, double d, double d2, float f, double d3, boolean z, RouteSession routeSession, boolean z2, boolean z3, SpeedPreset speedPreset, boolean z4, int i, double d4, boolean z5) {
            mode.getClass();
            speedPreset.getClass();
            this.mode = mode;
            this.lat = d;
            this.lng = d2;
            this.bearing = f;
            this.speedMs = d3;
            this.hasRoute = z;
            this.route = routeSession;
            this.paused = z2;
            this.returning = z3;
            this.preset = speedPreset;
            this.recording = z4;
            this.recordedPointCount = i;
            this.recordedDistanceM = d4;
            this.hasPendingRecording = z5;
        }

        public State() {
            this(null, 0.0d, 0.0d, 0.0f, 0.0d, false, null, false, false, null, false, 0, 0.0d, false, 16383, null);
        }
    }
}
