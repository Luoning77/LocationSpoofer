package kotlinx.coroutines.flow;

import defpackage.am1;
import defpackage.b81;
import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.mf3;
import defpackage.mg1;
import defpackage.p91;
import defpackage.pu0;
import defpackage.q60;
import defpackage.qu0;
import defpackage.s90;
import defpackage.zy;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class StartedWhileSubscribed implements SharingStarted {
    private final long replayExpiration;
    private final long stopTimeout;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StartedWhileSubscribed$command$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends k33 implements pu0 {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(q60 q60Var) {
            super(2, q60Var);
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(q60Var);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.pu0
        public final Object invoke(SharingCommand sharingCommand, q60 q60Var) {
            return ((AnonymousClass2) create(sharingCommand, q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                ee0.J(obj);
                return Boolean.valueOf(((SharingCommand) this.L$0) != SharingCommand.START);
            }
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    public StartedWhileSubscribed(long j, long j2) {
        this.stopTimeout = j;
        this.replayExpiration = j2;
        if (j < 0) {
            b81.h(" ms) cannot be negative", j, "stopTimeout(");
            throw null;
        }
        if (j2 >= 0) {
            return;
        }
        b81.h(" ms) cannot be negative", j2, "replayExpiration(");
        throw null;
    }

    @Override // kotlinx.coroutines.flow.SharingStarted
    public Flow<SharingCommand> command(StateFlow<Integer> stateFlow) {
        return FlowKt.distinctUntilChanged(FlowKt.dropWhile(FlowKt.transformLatest(stateFlow, new AnonymousClass1(null)), new AnonymousClass2(null)));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StartedWhileSubscribed)) {
            return false;
        }
        StartedWhileSubscribed startedWhileSubscribed = (StartedWhileSubscribed) obj;
        return this.stopTimeout == startedWhileSubscribed.stopTimeout && this.replayExpiration == startedWhileSubscribed.replayExpiration;
    }

    public int hashCode() {
        return Long.hashCode(this.replayExpiration) + (Long.hashCode(this.stopTimeout) * 31);
    }

    public String toString() {
        mg1 mg1Var = new mg1(2);
        if (this.stopTimeout > 0) {
            mg1Var.add("stopTimeout=" + this.stopTimeout + "ms");
        }
        if (this.replayExpiration < Long.MAX_VALUE) {
            mg1Var.add("replayExpiration=" + this.replayExpiration + "ms");
        }
        return p91.q(new StringBuilder("SharingStarted.WhileSubscribed("), zy.s0(am1.f(mg1Var), null, null, null, null, 63), ')');
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StartedWhileSubscribed$command$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", l = {174, 176, 178, 179, 181}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends k33 implements qu0 {
        /* synthetic */ int I$0;
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(q60 q60Var) {
            super(3, q60Var);
        }

        public final Object invoke(FlowCollector<? super SharingCommand> flowCollector, int i, q60 q60Var) {
            AnonymousClass1 anonymousClass1 = StartedWhileSubscribed.this.new AnonymousClass1(q60Var);
            anonymousClass1.L$0 = flowCollector;
            anonymousClass1.I$0 = i;
            return anonymousClass1.invokeSuspend(mf3.a);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x006d  */
        /* JADX WARN: Code duplicated, block: B:29:0x007a A[PHI: r0
          0x007a: PHI (r0v4 kotlinx.coroutines.flow.FlowCollector) = (r0v3 kotlinx.coroutines.flow.FlowCollector), (r0v9 kotlinx.coroutines.flow.FlowCollector) binds: [B:27:0x0077, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:32:0x008b A[PHI: r0
          0x008b: PHI (r0v5 kotlinx.coroutines.flow.FlowCollector) = 
          (r0v3 kotlinx.coroutines.flow.FlowCollector)
          (r0v4 kotlinx.coroutines.flow.FlowCollector)
          (r0v11 kotlinx.coroutines.flow.FlowCollector)
         binds: [B:25:0x006b, B:30:0x0088, B:12:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        
            if (r0.emit(r11, r10) == r7) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
        
            if (r0.emit(r11, r10) == r7) goto L34;
         */
        @Override // defpackage.oq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                int r0 = r10.label
                r1 = 0
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                z70 r7 = defpackage.z70.e
                if (r0 == 0) goto L39
                if (r0 == r6) goto L35
                if (r0 == r5) goto L2d
                if (r0 == r4) goto L25
                if (r0 == r3) goto L1d
                if (r0 != r2) goto L17
                goto L35
            L17:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.fo.n(r10)
                return r1
            L1d:
                java.lang.Object r0 = r10.L$0
                kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                defpackage.ee0.J(r11)
                goto L8b
            L25:
                java.lang.Object r0 = r10.L$0
                kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                defpackage.ee0.J(r11)
                goto L7a
            L2d:
                java.lang.Object r0 = r10.L$0
                kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                defpackage.ee0.J(r11)
                goto L61
            L35:
                defpackage.ee0.J(r11)
                goto L98
            L39:
                defpackage.ee0.J(r11)
                java.lang.Object r11 = r10.L$0
                r0 = r11
                kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                int r11 = r10.I$0
                if (r11 <= 0) goto L50
                kotlinx.coroutines.flow.SharingCommand r11 = kotlinx.coroutines.flow.SharingCommand.START
                r10.label = r6
                java.lang.Object r10 = r0.emit(r11, r10)
                if (r10 != r7) goto L98
                goto L97
            L50:
                kotlinx.coroutines.flow.StartedWhileSubscribed r11 = kotlinx.coroutines.flow.StartedWhileSubscribed.this
                long r8 = kotlinx.coroutines.flow.StartedWhileSubscribed.access$getStopTimeout$p(r11)
                r10.L$0 = r0
                r10.label = r5
                java.lang.Object r11 = kotlinx.coroutines.DelayKt.delay(r8, r10)
                if (r11 != r7) goto L61
                goto L97
            L61:
                kotlinx.coroutines.flow.StartedWhileSubscribed r11 = kotlinx.coroutines.flow.StartedWhileSubscribed.this
                long r5 = kotlinx.coroutines.flow.StartedWhileSubscribed.access$getReplayExpiration$p(r11)
                r8 = 0
                int r11 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
                if (r11 <= 0) goto L8b
                kotlinx.coroutines.flow.SharingCommand r11 = kotlinx.coroutines.flow.SharingCommand.STOP
                r10.L$0 = r0
                r10.label = r4
                java.lang.Object r11 = r0.emit(r11, r10)
                if (r11 != r7) goto L7a
                goto L97
            L7a:
                kotlinx.coroutines.flow.StartedWhileSubscribed r11 = kotlinx.coroutines.flow.StartedWhileSubscribed.this
                long r4 = kotlinx.coroutines.flow.StartedWhileSubscribed.access$getReplayExpiration$p(r11)
                r10.L$0 = r0
                r10.label = r3
                java.lang.Object r11 = kotlinx.coroutines.DelayKt.delay(r4, r10)
                if (r11 != r7) goto L8b
                goto L97
            L8b:
                kotlinx.coroutines.flow.SharingCommand r11 = kotlinx.coroutines.flow.SharingCommand.STOP_AND_RESET_REPLAY_CACHE
                r10.L$0 = r1
                r10.label = r2
                java.lang.Object r10 = r0.emit(r11, r10)
                if (r10 != r7) goto L98
            L97:
                return r7
            L98:
                mf3 r10 = defpackage.mf3.a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StartedWhileSubscribed.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.qu0
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((FlowCollector<? super SharingCommand>) obj, ((Number) obj2).intValue(), (q60) obj3);
        }
    }
}
