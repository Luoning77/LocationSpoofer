package kotlinx.coroutines.flow;

import defpackage.ah0;
import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.lu0;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.qu0;
import defpackage.s90;
import defpackage.we2;
import defpackage.z70;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.FlowCoroutineKt;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.selects.SelectImplementation;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final /* synthetic */ class FlowKt__DelayKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1", f = "Delay.kt", l = {307, 309, 310}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends k33 implements pu0 {
        final /* synthetic */ long $delayMillis;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, q60 q60Var) {
            super(2, q60Var);
            this.$delayMillis = j;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$delayMillis, q60Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.pu0
        public final Object invoke(ProducerScope<? super mf3> producerScope, q60 q60Var) {
            return ((AnonymousClass1) create(producerScope, q60Var)).invokeSuspend(mf3.a);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x003c A[PHI: r0
          0x003c: PHI (r0v3 kotlinx.coroutines.channels.ProducerScope) = 
          (r0v2 kotlinx.coroutines.channels.ProducerScope)
          (r0v4 kotlinx.coroutines.channels.ProducerScope)
          (r0v6 kotlinx.coroutines.channels.ProducerScope)
         binds: [B:13:0x0039, B:19:0x0057, B:11:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:18:0x004d A[PHI: r0
          0x004d: PHI (r0v4 kotlinx.coroutines.channels.ProducerScope) = (r0v3 kotlinx.coroutines.channels.ProducerScope), (r0v8 kotlinx.coroutines.channels.ProducerScope) binds: [B:16:0x004a, B:10:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0057 -> B:15:0x003c). Please report as a decompilation issue!!! */
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
                r1 = 3
                r2 = 2
                r3 = 1
                z70 r4 = defpackage.z70.e
                if (r0 == 0) goto L27
                if (r0 == r3) goto L1f
                if (r0 == r2) goto L17
                if (r0 != r1) goto L10
                goto L1f
            L10:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.fo.n(r7)
                r7 = 0
                return r7
            L17:
                java.lang.Object r0 = r7.L$0
                kotlinx.coroutines.channels.ProducerScope r0 = (kotlinx.coroutines.channels.ProducerScope) r0
                defpackage.ee0.J(r8)
                goto L4d
            L1f:
                java.lang.Object r0 = r7.L$0
                kotlinx.coroutines.channels.ProducerScope r0 = (kotlinx.coroutines.channels.ProducerScope) r0
                defpackage.ee0.J(r8)
                goto L3c
            L27:
                defpackage.ee0.J(r8)
                java.lang.Object r8 = r7.L$0
                r0 = r8
                kotlinx.coroutines.channels.ProducerScope r0 = (kotlinx.coroutines.channels.ProducerScope) r0
                long r5 = r7.$delayMillis
                r7.L$0 = r0
                r7.label = r3
                java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r5, r7)
                if (r8 != r4) goto L3c
                goto L59
            L3c:
                kotlinx.coroutines.channels.SendChannel r8 = r0.getChannel()
                r7.L$0 = r0
                r7.label = r2
                mf3 r3 = defpackage.mf3.a
                java.lang.Object r8 = r8.send(r3, r7)
                if (r8 != r4) goto L4d
                goto L59
            L4d:
                long r5 = r7.$delayMillis
                r7.L$0 = r0
                r7.label = r1
                java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r5, r7)
                if (r8 != r4) goto L3c
            L59:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", l = {412}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends k33 implements qu0 {
        final /* synthetic */ long $periodMillis;
        final /* synthetic */ Flow<T> $this_sample;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(long j, Flow<? extends T> flow, q60 q60Var) {
            super(3, q60Var);
            this.$periodMillis = j;
            this.$this_sample = flow;
        }

        @Override // defpackage.qu0
        public final Object invoke(CoroutineScope coroutineScope, FlowCollector<? super T> flowCollector, q60 q60Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$periodMillis, this.$this_sample, q60Var);
            anonymousClass2.L$0 = coroutineScope;
            anonymousClass2.L$1 = flowCollector;
            return anonymousClass2.invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            ReceiveChannel receiveChannel;
            ReceiveChannel<mf3> receiveChannelFixedPeriodTicker;
            we2 we2Var;
            FlowCollector flowCollector;
            int i = this.label;
            if (i == 0) {
                ee0.J(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                FlowCollector flowCollector2 = (FlowCollector) this.L$1;
                ReceiveChannel receiveChannelProduce$default = ProduceKt.produce$default(coroutineScope, null, -1, new FlowKt__DelayKt$sample$2$values$1(this.$this_sample, null), 1, null);
                we2 we2Var2 = new we2();
                receiveChannel = receiveChannelProduce$default;
                receiveChannelFixedPeriodTicker = FlowKt.fixedPeriodTicker(coroutineScope, this.$periodMillis);
                we2Var = we2Var2;
                flowCollector = flowCollector2;
            } else {
                if (i != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                receiveChannelFixedPeriodTicker = (ReceiveChannel) this.L$3;
                we2Var = (we2) this.L$2;
                receiveChannel = (ReceiveChannel) this.L$1;
                flowCollector = (FlowCollector) this.L$0;
                ee0.J(obj);
            }
            while (we2Var.e != NullSurrogateKt.DONE) {
                SelectImplementation selectImplementation = new SelectImplementation(getContext());
                selectImplementation.invoke(receiveChannel.getOnReceiveCatching(), new FlowKt__DelayKt$sample$2$1$1(we2Var, receiveChannelFixedPeriodTicker, null));
                selectImplementation.invoke(receiveChannelFixedPeriodTicker.getOnReceive(), new FlowKt__DelayKt$sample$2$1$2(we2Var, flowCollector, null));
                this.L$0 = flowCollector;
                this.L$1 = receiveChannel;
                this.L$2 = we2Var;
                this.L$3 = receiveChannelFixedPeriodTicker;
                this.label = 1;
                Object objDoSelect = selectImplementation.doSelect(this);
                z70 z70Var = z70.e;
                if (objDoSelect == z70Var) {
                    return z70Var;
                }
            }
            return mf3.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Flow<T> debounce(Flow<? extends T> flow, final long j) {
        if (j >= 0) {
            return j == 0 ? flow : debounceInternal$FlowKt__DelayKt(flow, new lu0() { // from class: kotlinx.coroutines.flow.b
                @Override // defpackage.lu0
                public final Object invoke(Object obj) {
                    return Long.valueOf(FlowKt__DelayKt.debounce$lambda$1$FlowKt__DelayKt(j, obj));
                }
            });
        }
        fo.i("Debounce timeout should not be negative");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long debounce$lambda$2$FlowKt__DelayKt(lu0 lu0Var, Object obj) {
        return DelayKt.m22toDelayMillisLRDsOJo(((ah0) lu0Var.invoke(obj)).e);
    }

    /* JADX INFO: renamed from: debounce-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m68debounceHG0u8IE(Flow<? extends T> flow, long j) {
        return FlowKt.debounce(flow, DelayKt.m22toDelayMillisLRDsOJo(j));
    }

    public static final <T> Flow<T> debounceDuration(Flow<? extends T> flow, final lu0 lu0Var) {
        return debounceInternal$FlowKt__DelayKt(flow, new lu0() { // from class: kotlinx.coroutines.flow.a
            @Override // defpackage.lu0
            public final Object invoke(Object obj) {
                return Long.valueOf(FlowKt__DelayKt.debounce$lambda$2$FlowKt__DelayKt(lu0Var, obj));
            }
        });
    }

    private static final <T> Flow<T> debounceInternal$FlowKt__DelayKt(Flow<? extends T> flow, lu0 lu0Var) {
        return FlowCoroutineKt.scopedFlow(new FlowKt__DelayKt$debounceInternal$1(lu0Var, flow, null));
    }

    public static final ReceiveChannel<mf3> fixedPeriodTicker(CoroutineScope coroutineScope, long j) {
        return ProduceKt.produce$default(coroutineScope, null, 0, new AnonymousClass1(j, null), 1, null);
    }

    public static final <T> Flow<T> sample(Flow<? extends T> flow, long j) {
        if (j > 0) {
            return FlowCoroutineKt.scopedFlow(new AnonymousClass2(j, flow, null));
        }
        fo.i("Sample period should be positive");
        return null;
    }

    /* JADX INFO: renamed from: sample-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m69sampleHG0u8IE(Flow<? extends T> flow, long j) {
        return FlowKt.sample(flow, DelayKt.m22toDelayMillisLRDsOJo(j));
    }

    /* JADX INFO: renamed from: timeout-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m70timeoutHG0u8IE(Flow<? extends T> flow, long j) {
        return m71timeoutInternalHG0u8IE$FlowKt__DelayKt(flow, j);
    }

    /* JADX INFO: renamed from: timeoutInternal-HG0u8IE$FlowKt__DelayKt, reason: not valid java name */
    private static final <T> Flow<T> m71timeoutInternalHG0u8IE$FlowKt__DelayKt(Flow<? extends T> flow, long j) {
        return FlowCoroutineKt.scopedFlow(new FlowKt__DelayKt$timeoutInternal$1(j, flow, null));
    }

    public static final <T> Flow<T> debounce(Flow<? extends T> flow, lu0 lu0Var) {
        return debounceInternal$FlowKt__DelayKt(flow, lu0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long debounce$lambda$1$FlowKt__DelayKt(long j, Object obj) {
        return j;
    }
}
