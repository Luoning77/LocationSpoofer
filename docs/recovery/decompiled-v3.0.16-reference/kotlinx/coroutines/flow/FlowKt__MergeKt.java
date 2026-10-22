package kotlinx.coroutines.flow;

import defpackage.fo;
import defpackage.k33;
import defpackage.mf3;
import defpackage.p91;
import defpackage.pu0;
import defpackage.q60;
import defpackage.qu0;
import defpackage.r60;
import defpackage.s90;
import defpackage.uj0;
import defpackage.z70;
import defpackage.zo;
import kotlinx.coroutines.flow.internal.ChannelFlowMerge;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge;
import kotlinx.coroutines.internal.SystemPropsKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final /* synthetic */ class FlowKt__MergeKt {
    private static final int DEFAULT_CONCURRENCY = SystemPropsKt.systemProp(FlowKt.DEFAULT_CONCURRENCY_PROPERTY_NAME, 16, 1, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1", f = "Merge.kt", l = {189, 189}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends k33 implements qu0 {
        final /* synthetic */ pu0 $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(pu0 pu0Var, q60 q60Var) {
            super(3, q60Var);
            this.$transform = pu0Var;
        }

        @Override // defpackage.qu0
        public final Object invoke(FlowCollector<? super R> flowCollector, T t, q60 q60Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transform, q60Var);
            anonymousClass1.L$0 = flowCollector;
            anonymousClass1.L$1 = t;
            return anonymousClass1.invokeSuspend(mf3.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.emitAll(r0, (kotlinx.coroutines.flow.Flow) r7, r6) == r4) goto L15;
         */
        @Override // defpackage.oq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                int r0 = r6.label
                r1 = 0
                r2 = 2
                r3 = 1
                z70 r4 = defpackage.z70.e
                if (r0 == 0) goto L1f
                if (r0 == r3) goto L17
                if (r0 != r2) goto L11
                defpackage.ee0.J(r7)
                goto L43
            L11:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.fo.n(r6)
                return r1
            L17:
                java.lang.Object r0 = r6.L$0
                kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                defpackage.ee0.J(r7)
                goto L36
            L1f:
                defpackage.ee0.J(r7)
                java.lang.Object r7 = r6.L$0
                r0 = r7
                kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                java.lang.Object r7 = r6.L$1
                pu0 r5 = r6.$transform
                r6.L$0 = r0
                r6.label = r3
                java.lang.Object r7 = r5.invoke(r7, r6)
                if (r7 != r4) goto L36
                goto L42
            L36:
                kotlinx.coroutines.flow.Flow r7 = (kotlinx.coroutines.flow.Flow) r7
                r6.L$0 = r1
                r6.label = r2
                java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt.emitAll(r0, r7, r6)
                if (r6 != r4) goto L43
            L42:
                return r4
            L43:
                mf3 r6 = defpackage.mf3.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__MergeKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            FlowKt.emitAll((FlowCollector) this.L$0, (Flow) this.$transform.invoke(this.L$1, this), this);
            return mf3.a;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", l = {213, 213}, m = "invokeSuspend")
    public static final class C01391 extends k33 implements qu0 {
        final /* synthetic */ pu0 $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01391(pu0 pu0Var, q60 q60Var) {
            super(3, q60Var);
            this.$transform = pu0Var;
        }

        @Override // defpackage.qu0
        public final Object invoke(FlowCollector<? super R> flowCollector, T t, q60 q60Var) {
            C01391 c01391 = new C01391(this.$transform, q60Var);
            c01391.L$0 = flowCollector;
            c01391.L$1 = t;
            return c01391.invokeSuspend(mf3.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        
            if (r0.emit(r7, r6) == r4) goto L15;
         */
        @Override // defpackage.oq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                int r0 = r6.label
                r1 = 0
                r2 = 2
                r3 = 1
                z70 r4 = defpackage.z70.e
                if (r0 == 0) goto L1f
                if (r0 == r3) goto L17
                if (r0 != r2) goto L11
                defpackage.ee0.J(r7)
                goto L41
            L11:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.fo.n(r6)
                return r1
            L17:
                java.lang.Object r0 = r6.L$0
                kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                defpackage.ee0.J(r7)
                goto L36
            L1f:
                defpackage.ee0.J(r7)
                java.lang.Object r7 = r6.L$0
                r0 = r7
                kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                java.lang.Object r7 = r6.L$1
                pu0 r5 = r6.$transform
                r6.L$0 = r0
                r6.label = r3
                java.lang.Object r7 = r5.invoke(r7, r6)
                if (r7 != r4) goto L36
                goto L40
            L36:
                r6.L$0 = r1
                r6.label = r2
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r4) goto L41
            L40:
                return r4
            L41:
                mf3 r6 = defpackage.mf3.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__MergeKt.C01391.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <T, R> Flow<R> flatMapConcat(final Flow<? extends T> flow, final pu0 pu0Var) {
        return FlowKt.flattenConcat(new Flow<Flow<? extends R>>() { // from class: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ pu0 $transform$inlined;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1, reason: invalid class name */
                @s90(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2", f = "Merge.kt", l = {50, 50}, m = "emit")
                public static final class AnonymousClass1 extends r60 {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(q60 q60Var) {
                        super(q60Var);
                    }

                    @Override // defpackage.oq
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, pu0 pu0Var) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$transform$inlined = pu0Var;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
                
                    if (r7.emit(r9, r0) == r5) goto L22;
                 */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r8, defpackage.q60 r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r9
                        kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1
                        r0.<init>(r9)
                    L18:
                        java.lang.Object r9 = r0.result
                        int r1 = r0.label
                        r2 = 0
                        r3 = 2
                        r4 = 1
                        z70 r5 = defpackage.z70.e
                        if (r1 == 0) goto L39
                        if (r1 == r4) goto L31
                        if (r1 != r3) goto L2b
                        defpackage.ee0.J(r9)
                        goto L59
                    L2b:
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.fo.n(r7)
                        return r2
                    L31:
                        java.lang.Object r7 = r0.L$0
                        kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                        defpackage.ee0.J(r9)
                        goto L4e
                    L39:
                        defpackage.ee0.J(r9)
                        kotlinx.coroutines.flow.FlowCollector r9 = r7.$this_unsafeFlow
                        pu0 r7 = r7.$transform$inlined
                        r0.L$0 = r9
                        r0.label = r4
                        java.lang.Object r7 = r7.invoke(r8, r0)
                        if (r7 != r5) goto L4b
                        goto L58
                    L4b:
                        r6 = r9
                        r9 = r7
                        r7 = r6
                    L4e:
                        r0.L$0 = r2
                        r0.label = r3
                        java.lang.Object r7 = r7.emit(r9, r0)
                        if (r7 != r5) goto L59
                    L58:
                        return r5
                    L59:
                        mf3 r7 = defpackage.mf3.a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, q60):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, q60 q60Var) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, pu0Var), q60Var);
                return objCollect == z70.e ? objCollect : mf3.a;
            }
        });
    }

    public static final <T, R> Flow<R> flatMapLatest(Flow<? extends T> flow, pu0 pu0Var) {
        return FlowKt.transformLatest(flow, new AnonymousClass1(pu0Var, null));
    }

    public static final <T, R> Flow<R> flatMapMerge(final Flow<? extends T> flow, int i, final pu0 pu0Var) {
        return FlowKt.flattenMerge(new Flow<Flow<? extends R>>() { // from class: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ pu0 $transform$inlined;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1, reason: invalid class name */
                @s90(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2", f = "Merge.kt", l = {50, 50}, m = "emit")
                public static final class AnonymousClass1 extends r60 {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(q60 q60Var) {
                        super(q60Var);
                    }

                    @Override // defpackage.oq
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, pu0 pu0Var) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$transform$inlined = pu0Var;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
                
                    if (r7.emit(r9, r0) == r5) goto L22;
                 */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r8, defpackage.q60 r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r9
                        kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1
                        r0.<init>(r9)
                    L18:
                        java.lang.Object r9 = r0.result
                        int r1 = r0.label
                        r2 = 0
                        r3 = 2
                        r4 = 1
                        z70 r5 = defpackage.z70.e
                        if (r1 == 0) goto L39
                        if (r1 == r4) goto L31
                        if (r1 != r3) goto L2b
                        defpackage.ee0.J(r9)
                        goto L59
                    L2b:
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.fo.n(r7)
                        return r2
                    L31:
                        java.lang.Object r7 = r0.L$0
                        kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                        defpackage.ee0.J(r9)
                        goto L4e
                    L39:
                        defpackage.ee0.J(r9)
                        kotlinx.coroutines.flow.FlowCollector r9 = r7.$this_unsafeFlow
                        pu0 r7 = r7.$transform$inlined
                        r0.L$0 = r9
                        r0.label = r4
                        java.lang.Object r7 = r7.invoke(r8, r0)
                        if (r7 != r5) goto L4b
                        goto L58
                    L4b:
                        r6 = r9
                        r9 = r7
                        r7 = r6
                    L4e:
                        r0.L$0 = r2
                        r0.label = r3
                        java.lang.Object r7 = r7.emit(r9, r0)
                        if (r7 != r5) goto L59
                    L58:
                        return r5
                    L59:
                        mf3 r7 = defpackage.mf3.a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, q60):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, q60 q60Var) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, pu0Var), q60Var);
                return objCollect == z70.e ? objCollect : mf3.a;
            }
        }, i);
    }

    public static /* synthetic */ Flow flatMapMerge$default(Flow flow, int i, pu0 pu0Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = DEFAULT_CONCURRENCY;
        }
        return FlowKt.flatMapMerge(flow, i, pu0Var);
    }

    public static final <T> Flow<T> flattenConcat(final Flow<? extends Flow<? extends T>> flow) {
        return new Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super T> flowCollector, q60 q60Var) {
                Object objCollect = flow.collect(new FlowKt__MergeKt$flattenConcat$1$1(flowCollector), q60Var);
                return objCollect == z70.e ? objCollect : mf3.a;
            }
        };
    }

    public static final <T> Flow<T> flattenMerge(Flow<? extends Flow<? extends T>> flow, int i) {
        if (i <= 0) {
            fo.f(p91.l(i, "Expected positive concurrency level, but had "));
            return null;
        }
        if (i == 1) {
            return FlowKt.flattenConcat(flow);
        }
        return new ChannelFlowMerge(flow, i, null, 0, null, 28, null);
    }

    public static /* synthetic */ Flow flattenMerge$default(Flow flow, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = DEFAULT_CONCURRENCY;
        }
        return FlowKt.flattenMerge(flow, i);
    }

    public static final int getDEFAULT_CONCURRENCY() {
        return DEFAULT_CONCURRENCY;
    }

    public static final <T, R> Flow<R> mapLatest(Flow<? extends T> flow, pu0 pu0Var) {
        return FlowKt.transformLatest(flow, new C01391(pu0Var, null));
    }

    public static final <T> Flow<T> merge(Flow<? extends T>... flowArr) {
        flowArr.getClass();
        return FlowKt.merge(flowArr.length == 0 ? uj0.e : new zo(flowArr, 0));
    }

    public static final <T, R> Flow<R> transformLatest(Flow<? extends T> flow, qu0 qu0Var) {
        return new ChannelFlowTransformLatest(qu0Var, flow, null, 0, null, 28, null);
    }

    public static final <T> Flow<T> merge(Iterable<? extends Flow<? extends T>> iterable) {
        return new ChannelLimitedFlowMerge(iterable, null, 0, null, 14, null);
    }

    public static /* synthetic */ void getDEFAULT_CONCURRENCY$annotations() {
    }

    public static /* synthetic */ void getDEFAULT_CONCURRENCY_PROPERTY_NAME$annotations() {
    }
}
