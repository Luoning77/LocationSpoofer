package kotlinx.coroutines.flow;

import defpackage.au0;
import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.mf3;
import defpackage.o51;
import defpackage.pu0;
import defpackage.q60;
import defpackage.qu0;
import defpackage.ru0;
import defpackage.s90;
import defpackage.su0;
import defpackage.tu0;
import defpackage.uu0;
import defpackage.z70;
import kotlinx.coroutines.flow.internal.CombineKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final /* synthetic */ class FlowKt__ZipKt {
    public static final <T1, T2, T3, T4, T5, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, final tu0 tu0Var) {
        final Flow[] flowArr = {flow, flow2, flow3, flow4, flow5};
        return new Flow<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
            @s90(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", f = "Zip.kt", l = {259, 258}, m = "invokeSuspend")
            public static final class AnonymousClass2 extends k33 implements qu0 {
                final /* synthetic */ tu0 $transform$inlined;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(q60 q60Var, tu0 tu0Var) {
                    super(3, q60Var);
                    this.$transform$inlined = tu0Var;
                }

                @Override // defpackage.qu0
                public final Object invoke(FlowCollector<? super R> flowCollector, Object[] objArr, q60 q60Var) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(q60Var, this.$transform$inlined);
                    anonymousClass2.L$0 = flowCollector;
                    anonymousClass2.L$1 = objArr;
                    return anonymousClass2.invokeSuspend(mf3.a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
                
                    if (r0.emit(r13, r11) == r4) goto L15;
                 */
                @Override // defpackage.oq
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                    /*
                        r12 = this;
                        int r0 = r12.label
                        r1 = 0
                        r2 = 2
                        r3 = 1
                        z70 r4 = defpackage.z70.e
                        if (r0 == 0) goto L20
                        if (r0 == r3) goto L17
                        if (r0 != r2) goto L11
                        defpackage.ee0.J(r13)
                        goto L52
                    L11:
                        java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.fo.n(r12)
                        return r1
                    L17:
                        java.lang.Object r0 = r12.L$0
                        kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                        defpackage.ee0.J(r13)
                        r11 = r12
                        goto L47
                    L20:
                        defpackage.ee0.J(r13)
                        java.lang.Object r13 = r12.L$0
                        r0 = r13
                        kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                        java.lang.Object r13 = r12.L$1
                        java.lang.Object[] r13 = (java.lang.Object[]) r13
                        tu0 r5 = r12.$transform$inlined
                        r6 = 0
                        r6 = r13[r6]
                        r7 = r13[r3]
                        r8 = r13[r2]
                        r9 = 3
                        r9 = r13[r9]
                        r10 = 4
                        r10 = r13[r10]
                        r12.L$0 = r0
                        r12.label = r3
                        r11 = r12
                        java.lang.Object r13 = r5.c(r6, r7, r8, r9, r10, r11)
                        if (r13 != r4) goto L47
                        goto L51
                    L47:
                        r11.L$0 = r1
                        r11.label = r2
                        java.lang.Object r12 = r0.emit(r13, r11)
                        if (r12 != r4) goto L52
                    L51:
                        return r4
                    L52:
                        mf3 r12 = defpackage.mf3.a
                        return r12
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, q60 q60Var) {
                Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new au0() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
                    @Override // defpackage.au0
                    public final Void invoke() {
                        return null;
                    }
                }, new AnonymousClass2(null, tu0Var), q60Var);
                return objCombineInternal == z70.e ? objCombineInternal : mf3.a;
            }
        };
    }

    public static final <T1, T2, T3, T4, T5, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, uu0 uu0Var) {
        return FlowKt.flow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5(new Flow[]{flow, flow2, flow3, flow4, flow5}, null, uu0Var));
    }

    private static final <T, R> Flow<R> combineTransformUnsafe$FlowKt__ZipKt(Flow<? extends T>[] flowArr, qu0 qu0Var) {
        o51.E();
        throw null;
    }

    private static final <T, R> Flow<R> combineUnsafe$FlowKt__ZipKt(Flow<? extends T>[] flowArr, pu0 pu0Var) {
        o51.E();
        throw null;
    }

    public static final <T1, T2, R> Flow<R> flowCombine(final Flow<? extends T1> flow, final Flow<? extends T2> flow2, final qu0 qu0Var) {
        return new Flow<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super R> flowCollector, q60 q60Var) {
                Object objCombineInternal = CombineKt.combineInternal(flowCollector, new Flow[]{flow, flow2}, new au0() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
                    @Override // defpackage.au0
                    public final Void invoke() {
                        return null;
                    }
                }, new FlowKt__ZipKt$combine$1$1(qu0Var, null), q60Var);
                return objCombineInternal == z70.e ? objCombineInternal : mf3.a;
            }
        };
    }

    public static final <T1, T2, R> Flow<R> flowCombineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, ru0 ru0Var) {
        return FlowKt.flow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1(new Flow[]{flow, flow2}, null, ru0Var));
    }

    public static final <T1, T2, R> Flow<R> zip(Flow<? extends T1> flow, Flow<? extends T2> flow2, qu0 qu0Var) {
        return CombineKt.zipImpl(flow, flow2, qu0Var);
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6", f = "Zip.kt", l = {247}, m = "invokeSuspend")
    public static final class AnonymousClass6 extends k33 implements pu0 {
        final /* synthetic */ Flow<T>[] $flows;
        final /* synthetic */ qu0 $transform;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
        public static final class AnonymousClass1 implements au0 {
            final /* synthetic */ Flow<T>[] $flows;

            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Flow<? extends T>[] flowArr) {
                this.$flows = flowArr;
            }

            @Override // defpackage.au0
            public final T[] invoke() {
                int length = this.$flows.length;
                o51.E();
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(Flow<? extends T>[] flowArr, qu0 qu0Var, q60 q60Var) {
            super(2, q60Var);
            this.$flows = flowArr;
            this.$transform = qu0Var;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            AnonymousClass6 anonymousClass6 = new AnonymousClass6(this.$flows, this.$transform, q60Var);
            anonymousClass6.L$0 = obj;
            return anonymousClass6;
        }

        @Override // defpackage.pu0
        public final Object invoke(FlowCollector<? super R> flowCollector, q60 q60Var) {
            return ((AnonymousClass6) create(flowCollector, q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ee0.J(obj);
                o51.E();
                throw null;
            }
            if (i == 1) {
                ee0.J(obj);
                return mf3.a;
            }
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            o51.E();
            throw null;
        }

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
        @s90(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2", f = "Zip.kt", l = {247}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends k33 implements qu0 {
            final /* synthetic */ qu0 $transform;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(qu0 qu0Var, q60 q60Var) {
                super(3, q60Var);
                this.$transform = qu0Var;
            }

            @Override // defpackage.oq
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    ee0.J(obj);
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    qu0 qu0Var = this.$transform;
                    this.L$0 = null;
                    this.label = 1;
                    Object objInvoke = qu0Var.invoke(flowCollector, objArr, this);
                    z70 z70Var = z70.e;
                    if (objInvoke == z70Var) {
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

            public final Object invokeSuspend$$forInline(Object obj) {
                this.$transform.invoke((FlowCollector) this.L$0, (Object[]) this.L$1, this);
                return mf3.a;
            }

            @Override // defpackage.qu0
            public final Object invoke(FlowCollector<? super R> flowCollector, T[] tArr, q60 q60Var) {
                o51.E();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7", f = "Zip.kt", l = {304}, m = "invokeSuspend")
    public static final class AnonymousClass7 extends k33 implements pu0 {
        final /* synthetic */ Flow<T>[] $flowArray;
        final /* synthetic */ qu0 $transform;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
        public static final class AnonymousClass1 implements au0 {
            final /* synthetic */ Flow<T>[] $flowArray;

            public AnonymousClass1(Flow<T>[] flowArr) {
                this.$flowArray = flowArr;
            }

            @Override // defpackage.au0
            public final T[] invoke() {
                int length = this.$flowArray.length;
                o51.E();
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(Flow<T>[] flowArr, qu0 qu0Var, q60 q60Var) {
            super(2, q60Var);
            this.$flowArray = flowArr;
            this.$transform = qu0Var;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            AnonymousClass7 anonymousClass7 = new AnonymousClass7(this.$flowArray, this.$transform, q60Var);
            anonymousClass7.L$0 = obj;
            return anonymousClass7;
        }

        @Override // defpackage.pu0
        public final Object invoke(FlowCollector<? super R> flowCollector, q60 q60Var) {
            return ((AnonymousClass7) create(flowCollector, q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ee0.J(obj);
                o51.E();
                throw null;
            }
            if (i == 1) {
                ee0.J(obj);
                return mf3.a;
            }
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            o51.E();
            throw null;
        }

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
        @s90(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2", f = "Zip.kt", l = {304}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends k33 implements qu0 {
            final /* synthetic */ qu0 $transform;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(qu0 qu0Var, q60 q60Var) {
                super(3, q60Var);
                this.$transform = qu0Var;
            }

            @Override // defpackage.oq
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    ee0.J(obj);
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    qu0 qu0Var = this.$transform;
                    this.L$0 = null;
                    this.label = 1;
                    Object objInvoke = qu0Var.invoke(flowCollector, objArr, this);
                    z70 z70Var = z70.e;
                    if (objInvoke == z70Var) {
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

            public final Object invokeSuspend$$forInline(Object obj) {
                this.$transform.invoke((FlowCollector) this.L$0, (Object[]) this.L$1, this);
                return mf3.a;
            }

            @Override // defpackage.qu0
            public final Object invoke(FlowCollector<? super R> flowCollector, T[] tArr, q60 q60Var) {
                o51.E();
                throw null;
            }
        }
    }

    public static final <T1, T2, T3, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, final ru0 ru0Var) {
        final Flow[] flowArr = {flow, flow2, flow3};
        return new Flow<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
            @s90(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", l = {259, 258}, m = "invokeSuspend")
            public static final class AnonymousClass2 extends k33 implements qu0 {
                final /* synthetic */ ru0 $transform$inlined;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(q60 q60Var, ru0 ru0Var) {
                    super(3, q60Var);
                    this.$transform$inlined = ru0Var;
                }

                @Override // defpackage.qu0
                public final Object invoke(FlowCollector<? super R> flowCollector, Object[] objArr, q60 q60Var) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(q60Var, this.$transform$inlined);
                    anonymousClass2.L$0 = flowCollector;
                    anonymousClass2.L$1 = objArr;
                    return anonymousClass2.invokeSuspend(mf3.a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
                
                    if (r0.emit(r9, r8) == r4) goto L15;
                 */
                @Override // defpackage.oq
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                    /*
                        r8 = this;
                        int r0 = r8.label
                        r1 = 0
                        r2 = 2
                        r3 = 1
                        z70 r4 = defpackage.z70.e
                        if (r0 == 0) goto L1f
                        if (r0 == r3) goto L17
                        if (r0 != r2) goto L11
                        defpackage.ee0.J(r9)
                        goto L4a
                    L11:
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.fo.n(r8)
                        return r1
                    L17:
                        java.lang.Object r0 = r8.L$0
                        kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                        defpackage.ee0.J(r9)
                        goto L3f
                    L1f:
                        defpackage.ee0.J(r9)
                        java.lang.Object r9 = r8.L$0
                        r0 = r9
                        kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                        java.lang.Object r9 = r8.L$1
                        java.lang.Object[] r9 = (java.lang.Object[]) r9
                        ru0 r5 = r8.$transform$inlined
                        r6 = 0
                        r6 = r9[r6]
                        r7 = r9[r3]
                        r9 = r9[r2]
                        r8.L$0 = r0
                        r8.label = r3
                        java.lang.Object r9 = r5.invoke(r6, r7, r9, r8)
                        if (r9 != r4) goto L3f
                        goto L49
                    L3f:
                        r8.L$0 = r1
                        r8.label = r2
                        java.lang.Object r8 = r0.emit(r9, r8)
                        if (r8 != r4) goto L4a
                    L49:
                        return r4
                    L4a:
                        mf3 r8 = defpackage.mf3.a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, q60 q60Var) {
                Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new au0() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
                    @Override // defpackage.au0
                    public final Void invoke() {
                        return null;
                    }
                }, new AnonymousClass2(null, ru0Var), q60Var);
                return objCombineInternal == z70.e ? objCombineInternal : mf3.a;
            }
        };
    }

    public static final <T1, T2, T3, T4, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, final su0 su0Var) {
        final Flow[] flowArr = {flow, flow2, flow3, flow4};
        return new Flow<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
            @s90(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", l = {259, 258}, m = "invokeSuspend")
            public static final class AnonymousClass2 extends k33 implements qu0 {
                final /* synthetic */ su0 $transform$inlined;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(q60 q60Var, su0 su0Var) {
                    super(3, q60Var);
                    this.$transform$inlined = su0Var;
                }

                @Override // defpackage.qu0
                public final Object invoke(FlowCollector<? super R> flowCollector, Object[] objArr, q60 q60Var) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(q60Var, this.$transform$inlined);
                    anonymousClass2.L$0 = flowCollector;
                    anonymousClass2.L$1 = objArr;
                    return anonymousClass2.invokeSuspend(mf3.a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
                
                    if (r0.emit(r12, r10) == r4) goto L15;
                 */
                @Override // defpackage.oq
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                    /*
                        r11 = this;
                        int r0 = r11.label
                        r1 = 0
                        r2 = 2
                        r3 = 1
                        z70 r4 = defpackage.z70.e
                        if (r0 == 0) goto L20
                        if (r0 == r3) goto L17
                        if (r0 != r2) goto L11
                        defpackage.ee0.J(r12)
                        goto L4f
                    L11:
                        java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.fo.n(r11)
                        return r1
                    L17:
                        java.lang.Object r0 = r11.L$0
                        kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                        defpackage.ee0.J(r12)
                        r10 = r11
                        goto L44
                    L20:
                        defpackage.ee0.J(r12)
                        java.lang.Object r12 = r11.L$0
                        r0 = r12
                        kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                        java.lang.Object r12 = r11.L$1
                        java.lang.Object[] r12 = (java.lang.Object[]) r12
                        su0 r5 = r11.$transform$inlined
                        r6 = 0
                        r6 = r12[r6]
                        r7 = r12[r3]
                        r8 = r12[r2]
                        r9 = 3
                        r9 = r12[r9]
                        r11.L$0 = r0
                        r11.label = r3
                        r10 = r11
                        java.lang.Object r12 = r5.b(r6, r7, r8, r9, r10)
                        if (r12 != r4) goto L44
                        goto L4e
                    L44:
                        r10.L$0 = r1
                        r10.label = r2
                        java.lang.Object r11 = r0.emit(r12, r10)
                        if (r11 != r4) goto L4f
                    L4e:
                        return r4
                    L4f:
                        mf3 r11 = defpackage.mf3.a
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, q60 q60Var) {
                Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new au0() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
                    @Override // defpackage.au0
                    public final Void invoke() {
                        return null;
                    }
                }, new AnonymousClass2(null, su0Var), q60Var);
                return objCombineInternal == z70.e ? objCombineInternal : mf3.a;
            }
        };
    }

    public static final <T1, T2, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, qu0 qu0Var) {
        return FlowKt.flowCombine(flow, flow2, qu0Var);
    }

    public static final <T, R> Flow<R> combine(Flow<? extends T>[] flowArr, pu0 pu0Var) {
        o51.E();
        throw null;
    }

    public static final <T1, T2, T3, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, su0 su0Var) {
        return FlowKt.flow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3(new Flow[]{flow, flow2, flow3}, null, su0Var));
    }

    public static final <T, R> Flow<R> combine(Iterable<? extends Flow<? extends T>> iterable, pu0 pu0Var) {
        o51.E();
        throw null;
    }

    public static final <T1, T2, T3, T4, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, tu0 tu0Var) {
        return FlowKt.flow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4(new Flow[]{flow, flow2, flow3, flow4}, null, tu0Var));
    }

    public static final <T1, T2, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, ru0 ru0Var) {
        return FlowKt.flow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2(new Flow[]{flow, flow2}, null, ru0Var));
    }

    public static final <T, R> Flow<R> combineTransform(Flow<? extends T>[] flowArr, qu0 qu0Var) {
        o51.E();
        throw null;
    }

    public static final <T, R> Flow<R> combineTransform(Iterable<? extends Flow<? extends T>> iterable, qu0 qu0Var) {
        o51.E();
        throw null;
    }
}
