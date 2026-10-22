package kotlinx.coroutines.flow.internal;

import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.lu0;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.qu0;
import defpackage.s90;
import defpackage.y70;
import defpackage.z70;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", l = {123}, m = "invokeSuspend")
public final class CombineKt$zipImpl$1$1 extends k33 implements pu0 {
    final /* synthetic */ Flow<T1> $flow;
    final /* synthetic */ Flow<T2> $flow2;
    final /* synthetic */ FlowCollector<R> $this_unsafeFlow;
    final /* synthetic */ qu0 $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", l = {124}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends k33 implements pu0 {
        final /* synthetic */ Object $cnt;
        final /* synthetic */ CompletableJob $collectJob;
        final /* synthetic */ Flow<T1> $flow;
        final /* synthetic */ y70 $scopeContext;
        final /* synthetic */ ReceiveChannel<Object> $second;
        final /* synthetic */ FlowCollector<R> $this_unsafeFlow;
        final /* synthetic */ qu0 $transform;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
        public static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ Object $cnt;
            final /* synthetic */ CompletableJob $collectJob;
            final /* synthetic */ y70 $scopeContext;
            final /* synthetic */ ReceiveChannel<Object> $second;
            final /* synthetic */ FlowCollector<R> $this_unsafeFlow;
            final /* synthetic */ qu0 $transform;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
            @s90(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", l = {126, 129, 129}, m = "invokeSuspend")
            public static final class C00051 extends k33 implements pu0 {
                final /* synthetic */ CompletableJob $collectJob;
                final /* synthetic */ ReceiveChannel<Object> $second;
                final /* synthetic */ FlowCollector<R> $this_unsafeFlow;
                final /* synthetic */ qu0 $transform;
                final /* synthetic */ T1 $value;
                Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C00051(ReceiveChannel<? extends Object> receiveChannel, FlowCollector<? super R> flowCollector, qu0 qu0Var, T1 t1, CompletableJob completableJob, q60 q60Var) {
                    super(2, q60Var);
                    this.$second = receiveChannel;
                    this.$this_unsafeFlow = flowCollector;
                    this.$transform = qu0Var;
                    this.$value = t1;
                    this.$collectJob = completableJob;
                }

                @Override // defpackage.oq
                public final q60 create(Object obj, q60 q60Var) {
                    return new C00051(this.$second, this.$this_unsafeFlow, this.$transform, this.$value, this.$collectJob, q60Var);
                }

                @Override // defpackage.pu0
                public final Object invoke(mf3 mf3Var, q60 q60Var) {
                    return ((C00051) create(mf3Var, q60Var)).invokeSuspend(mf3.a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
                
                    if (r0.emit(r9, r8) == r5) goto L29;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v3, types: [kotlinx.coroutines.flow.FlowCollector] */
                /* JADX WARN: Type inference failed for: r0v6 */
                /* JADX WARN: Type inference failed for: r0v7 */
                @Override // defpackage.oq
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
                    /*
                        r8 = this;
                        int r0 = r8.label
                        r1 = 0
                        r2 = 3
                        r3 = 2
                        r4 = 1
                        z70 r5 = defpackage.z70.e
                        if (r0 == 0) goto L2c
                        if (r0 == r4) goto L22
                        if (r0 == r3) goto L1a
                        if (r0 != r2) goto L14
                        defpackage.ee0.J(r9)
                        goto L6d
                    L14:
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.fo.n(r8)
                        return r1
                    L1a:
                        java.lang.Object r0 = r8.L$0
                        kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                        defpackage.ee0.J(r9)
                        goto L62
                    L22:
                        defpackage.ee0.J(r9)
                        kotlinx.coroutines.channels.ChannelResult r9 = (kotlinx.coroutines.channels.ChannelResult) r9
                        java.lang.Object r9 = r9.m58unboximpl()
                        goto L3a
                    L2c:
                        defpackage.ee0.J(r9)
                        kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r9 = r8.$second
                        r8.label = r4
                        java.lang.Object r9 = r9.mo38receiveCatchingJP2dKIU(r8)
                        if (r9 != r5) goto L3a
                        goto L6c
                    L3a:
                        kotlinx.coroutines.CompletableJob r0 = r8.$collectJob
                        boolean r4 = r9 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
                        if (r4 == 0) goto L4c
                        java.lang.Throwable r8 = kotlinx.coroutines.channels.ChannelResult.m50exceptionOrNullimpl(r9)
                        if (r8 != 0) goto L4b
                        kotlinx.coroutines.flow.internal.AbortFlowException r8 = new kotlinx.coroutines.flow.internal.AbortFlowException
                        r8.<init>(r0)
                    L4b:
                        throw r8
                    L4c:
                        kotlinx.coroutines.flow.FlowCollector<R> r0 = r8.$this_unsafeFlow
                        qu0 r4 = r8.$transform
                        T1 r6 = r8.$value
                        kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
                        if (r9 != r7) goto L57
                        r9 = r1
                    L57:
                        r8.L$0 = r0
                        r8.label = r3
                        java.lang.Object r9 = r4.invoke(r6, r9, r8)
                        if (r9 != r5) goto L62
                        goto L6c
                    L62:
                        r8.L$0 = r1
                        r8.label = r2
                        java.lang.Object r8 = r0.emit(r9, r8)
                        if (r8 != r5) goto L6d
                    L6c:
                        return r5
                    L6d:
                        mf3 r8 = defpackage.mf3.a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1.C00051.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(y70 y70Var, Object obj, ReceiveChannel<? extends Object> receiveChannel, FlowCollector<? super R> flowCollector, qu0 qu0Var, CompletableJob completableJob) {
                this.$scopeContext = y70Var;
                this.$cnt = obj;
                this.$second = receiveChannel;
                this.$this_unsafeFlow = flowCollector;
                this.$transform = qu0Var;
                this.$collectJob = completableJob;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(T1 t1, q60 q60Var) {
                CombineKt$zipImpl$1$1$2$1$emit$1 combineKt$zipImpl$1$1$2$1$emit$1;
                if (q60Var instanceof CombineKt$zipImpl$1$1$2$1$emit$1) {
                    combineKt$zipImpl$1$1$2$1$emit$1 = (CombineKt$zipImpl$1$1$2$1$emit$1) q60Var;
                    int i = combineKt$zipImpl$1$1$2$1$emit$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        combineKt$zipImpl$1$1$2$1$emit$1.label = i - Integer.MIN_VALUE;
                    } else {
                        combineKt$zipImpl$1$1$2$1$emit$1 = new CombineKt$zipImpl$1$1$2$1$emit$1(this, q60Var);
                    }
                } else {
                    combineKt$zipImpl$1$1$2$1$emit$1 = new CombineKt$zipImpl$1$1$2$1$emit$1(this, q60Var);
                }
                Object obj = combineKt$zipImpl$1$1$2$1$emit$1.result;
                int i2 = combineKt$zipImpl$1$1$2$1$emit$1.label;
                mf3 mf3Var = mf3.a;
                if (i2 == 0) {
                    ee0.J(obj);
                    y70 y70Var = this.$scopeContext;
                    Object obj2 = this.$cnt;
                    C00051 c00051 = new C00051(this.$second, this.$this_unsafeFlow, this.$transform, t1, this.$collectJob, null);
                    combineKt$zipImpl$1$1$2$1$emit$1.label = 1;
                    Object objWithContextUndispatched = ChannelFlowKt.withContextUndispatched(y70Var, mf3Var, obj2, c00051, combineKt$zipImpl$1$1$2$1$emit$1);
                    z70 z70Var = z70.e;
                    if (objWithContextUndispatched == z70Var) {
                        return z70Var;
                    }
                } else {
                    if (i2 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ee0.J(obj);
                }
                return mf3Var;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Flow<? extends T1> flow, y70 y70Var, Object obj, ReceiveChannel<? extends Object> receiveChannel, FlowCollector<? super R> flowCollector, qu0 qu0Var, CompletableJob completableJob, q60 q60Var) {
            super(2, q60Var);
            this.$flow = flow;
            this.$scopeContext = y70Var;
            this.$cnt = obj;
            this.$second = receiveChannel;
            this.$this_unsafeFlow = flowCollector;
            this.$transform = qu0Var;
            this.$collectJob = completableJob;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            return new AnonymousClass2(this.$flow, this.$scopeContext, this.$cnt, this.$second, this.$this_unsafeFlow, this.$transform, this.$collectJob, q60Var);
        }

        @Override // defpackage.pu0
        public final Object invoke(mf3 mf3Var, q60 q60Var) {
            return ((AnonymousClass2) create(mf3Var, q60Var)).invokeSuspend(mf3.a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ee0.J(obj);
                Flow<T1> flow = this.$flow;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scopeContext, this.$cnt, this.$second, this.$this_unsafeFlow, this.$transform, this.$collectJob);
                this.label = 1;
                Object objCollect = flow.collect(anonymousClass1, this);
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
            return mf3.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$zipImpl$1$1(Flow<? extends T2> flow, Flow<? extends T1> flow2, FlowCollector<? super R> flowCollector, qu0 qu0Var, q60 q60Var) {
        super(2, q60Var);
        this.$flow2 = flow;
        this.$flow = flow2;
        this.$this_unsafeFlow = flowCollector;
        this.$transform = qu0Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        CombineKt$zipImpl$1$1 combineKt$zipImpl$1$1 = new CombineKt$zipImpl$1$1(this.$flow2, this.$flow, this.$this_unsafeFlow, this.$transform, q60Var);
        combineKt$zipImpl$1$1.L$0 = obj;
        return combineKt$zipImpl$1$1;
    }

    @Override // defpackage.pu0
    public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
        return ((CombineKt$zipImpl$1$1) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) throws Throwable {
        final CompletableJob completableJobJob$default;
        ReceiveChannel receiveChannel;
        ReceiveChannel receiveChannel2;
        CompletableJob completableJob;
        int i = this.label;
        mf3 mf3Var = mf3.a;
        if (i == 0) {
            ee0.J(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            ReceiveChannel receiveChannelProduce$default = ProduceKt.produce$default(coroutineScope, null, 0, new CombineKt$zipImpl$1$1$second$1(this.$flow2, null), 3, null);
            completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
            receiveChannelProduce$default.getClass();
            ((SendChannel) receiveChannelProduce$default).invokeOnClose(new lu0() { // from class: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.1
                public final void invoke(Throwable th) {
                    if (completableJobJob$default.isActive()) {
                        CompletableJob completableJob2 = completableJobJob$default;
                        completableJob2.cancel((CancellationException) new AbortFlowException(completableJob2));
                    }
                }

                @Override // defpackage.lu0
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Throwable) obj2);
                    return mf3.a;
                }
            });
            try {
                try {
                    y70 coroutineContext = coroutineScope.getCoroutineContext();
                    Object objThreadContextElements = ThreadContextKt.threadContextElements(coroutineContext);
                    y70 y70VarPlus = coroutineScope.getCoroutineContext().plus(completableJobJob$default);
                    try {
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$flow, coroutineContext, objThreadContextElements, receiveChannelProduce$default, this.$this_unsafeFlow, this.$transform, completableJobJob$default, null);
                        receiveChannel = receiveChannelProduce$default;
                        completableJob = completableJobJob$default;
                        try {
                            this.L$0 = receiveChannel;
                            this.L$1 = completableJob;
                            this.label = 1;
                            Object objWithContextUndispatched$default = ChannelFlowKt.withContextUndispatched$default(y70VarPlus, mf3Var, null, anonymousClass2, this, 4, null);
                            z70 z70Var = z70.e;
                            if (objWithContextUndispatched$default == z70Var) {
                                return z70Var;
                            }
                            receiveChannel2 = receiveChannel;
                        } catch (AbortFlowException e) {
                            e = e;
                            completableJobJob$default = completableJob;
                            receiveChannel2 = receiveChannel;
                            FlowExceptions_commonKt.checkOwnership(e, completableJobJob$default);
                        } catch (Throwable th) {
                            th = th;
                            receiveChannel2 = receiveChannel;
                            ReceiveChannel.DefaultImpls.cancel$default(receiveChannel2, (CancellationException) null, 1, (Object) null);
                            throw th;
                        }
                    } catch (AbortFlowException e2) {
                        e = e2;
                        receiveChannel = receiveChannelProduce$default;
                        completableJob = completableJobJob$default;
                    }
                } catch (AbortFlowException e3) {
                    e = e3;
                    receiveChannel = receiveChannelProduce$default;
                }
            } catch (Throwable th2) {
                th = th2;
                receiveChannel = receiveChannelProduce$default;
            }
        } else {
            if (i != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            completableJobJob$default = (CompletableJob) this.L$1;
            receiveChannel2 = (ReceiveChannel) this.L$0;
            try {
                try {
                    ee0.J(obj);
                } catch (AbortFlowException e4) {
                    e = e4;
                    FlowExceptions_commonKt.checkOwnership(e, completableJobJob$default);
                }
            } catch (Throwable th3) {
                th = th3;
                ReceiveChannel.DefaultImpls.cancel$default(receiveChannel2, (CancellationException) null, 1, (Object) null);
                throw th;
            }
        }
        ReceiveChannel.DefaultImpls.cancel$default(receiveChannel2, (CancellationException) null, 1, (Object) null);
        return mf3Var;
    }
}
