package kotlinx.coroutines.flow.internal;

import defpackage.au0;
import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.l11;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.qu0;
import defpackage.s90;
import defpackage.z70;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CombineKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {51, 73, 76}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends k33 implements pu0 {
        final /* synthetic */ au0 $arrayFactory;
        final /* synthetic */ Flow<T>[] $flows;
        final /* synthetic */ FlowCollector<R> $this_combineInternal;
        final /* synthetic */ qu0 $transform;
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
        @s90(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {28}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends k33 implements pu0 {
            final /* synthetic */ Flow<T>[] $flows;
            final /* synthetic */ int $i;
            final /* synthetic */ AtomicInteger $nonClosed;
            final /* synthetic */ Channel<l11> $resultChannel;
            int label;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
            public static final class C00041<T> implements FlowCollector {
                final /* synthetic */ int $i;
                final /* synthetic */ Channel<l11> $resultChannel;

                public C00041(Channel<l11> channel, int i) {
                    this.$resultChannel = channel;
                    this.$i = i;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
                
                    if (kotlinx.coroutines.YieldKt.yield(r0) == r4) goto L21;
                 */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r6, defpackage.q60 r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                        if (r0 == 0) goto L13
                        r0 = r7
                        kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                        r0.<init>(r5, r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        int r1 = r0.label
                        r2 = 2
                        r3 = 1
                        z70 r4 = defpackage.z70.e
                        if (r1 == 0) goto L35
                        if (r1 == r3) goto L31
                        if (r1 != r2) goto L2a
                        defpackage.ee0.J(r7)
                        goto L53
                    L2a:
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.fo.n(r5)
                        r5 = 0
                        return r5
                    L31:
                        defpackage.ee0.J(r7)
                        goto L4a
                    L35:
                        defpackage.ee0.J(r7)
                        kotlinx.coroutines.channels.Channel<l11> r7 = r5.$resultChannel
                        l11 r1 = new l11
                        int r5 = r5.$i
                        r1.<init>(r5, r6)
                        r0.label = r3
                        java.lang.Object r5 = r7.send(r1, r0)
                        if (r5 != r4) goto L4a
                        goto L52
                    L4a:
                        r0.label = r2
                        java.lang.Object r5 = kotlinx.coroutines.YieldKt.yield(r0)
                        if (r5 != r4) goto L53
                    L52:
                        return r4
                    L53:
                        mf3 r5 = defpackage.mf3.a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt.AnonymousClass2.AnonymousClass1.C00041.emit(java.lang.Object, q60):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Flow<? extends T>[] flowArr, int i, AtomicInteger atomicInteger, Channel<l11> channel, q60 q60Var) {
                super(2, q60Var);
                this.$flows = flowArr;
                this.$i = i;
                this.$nonClosed = atomicInteger;
                this.$resultChannel = channel;
            }

            @Override // defpackage.oq
            public final q60 create(Object obj, q60 q60Var) {
                return new AnonymousClass1(this.$flows, this.$i, this.$nonClosed, this.$resultChannel, q60Var);
            }

            @Override // defpackage.pu0
            public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
                return ((AnonymousClass1) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
            }

            @Override // defpackage.oq
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                try {
                    if (i == 0) {
                        ee0.J(obj);
                        Flow[] flowArr = this.$flows;
                        int i2 = this.$i;
                        Flow flow = flowArr[i2];
                        C00041 c00041 = new C00041(this.$resultChannel, i2);
                        this.label = 1;
                        Object objCollect = flow.collect(c00041, this);
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
                    if (this.$nonClosed.decrementAndGet() == 0) {
                        SendChannel.DefaultImpls.close$default(this.$resultChannel, null, 1, null);
                    }
                    return mf3.a;
                } catch (Throwable th) {
                    if (this.$nonClosed.decrementAndGet() == 0) {
                        SendChannel.DefaultImpls.close$default(this.$resultChannel, null, 1, null);
                    }
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Flow<? extends T>[] flowArr, au0 au0Var, qu0 qu0Var, FlowCollector<? super R> flowCollector, q60 q60Var) {
            super(2, q60Var);
            this.$flows = flowArr;
            this.$arrayFactory = au0Var;
            this.$transform = qu0Var;
            this.$this_combineInternal = flowCollector;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$flows, this.$arrayFactory, this.$transform, this.$this_combineInternal, q60Var);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.pu0
        public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
            return ((AnonymousClass2) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:27:0x00ba A[LOOP:0: B:27:0x00ba->B:46:?, LOOP_START, PHI: r5 r10
          0x00ba: PHI (r5v4 int) = (r5v3 int), (r5v5 int) binds: [B:24:0x00b5, B:46:?] A[DONT_GENERATE, DONT_INLINE]
          0x00ba: PHI (r10v4 l11) = (r10v3 l11), (r10v17 l11) binds: [B:24:0x00b5, B:46:?] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:29:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:32:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:35:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:37:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:40:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:45:0x00db A[EDGE_INSN: B:45:0x00db->B:34:0x00db BREAK  A[LOOP:0: B:27:0x00ba->B:46:?], SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x011a -> B:19:0x0092). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.oq
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instruction units count: 291
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <R, T> Object combineInternal(FlowCollector<? super R> flowCollector, Flow<? extends T>[] flowArr, au0 au0Var, qu0 qu0Var, q60 q60Var) {
        Object objFlowScope = FlowCoroutineKt.flowScope(new AnonymousClass2(flowArr, au0Var, qu0Var, flowCollector, null), q60Var);
        return objFlowScope == z70.e ? objFlowScope : mf3.a;
    }

    public static final <T1, T2, R> Flow<R> zipImpl(final Flow<? extends T1> flow, final Flow<? extends T2> flow2, final qu0 qu0Var) {
        return new Flow<R>() { // from class: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super R> flowCollector, q60 q60Var) {
                Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new CombineKt$zipImpl$1$1(flow2, flow, flowCollector, qu0Var, null), q60Var);
                return objCoroutineScope == z70.e ? objCoroutineScope : mf3.a;
            }
        };
    }
}
