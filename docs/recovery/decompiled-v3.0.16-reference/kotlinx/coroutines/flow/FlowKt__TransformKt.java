package kotlinx.coroutines.flow;

import defpackage.ee0;
import defpackage.fo;
import defpackage.l11;
import defpackage.l81;
import defpackage.mf3;
import defpackage.o51;
import defpackage.ox;
import defpackage.p91;
import defpackage.pu0;
import defpackage.q60;
import defpackage.qu0;
import defpackage.r60;
import defpackage.s90;
import defpackage.ue2;
import defpackage.we2;
import defpackage.z70;
import java.util.List;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final /* synthetic */ class FlowKt__TransformKt {
    public static final <T> Flow<List<T>> chunked(Flow<? extends T> flow, int i) {
        if (i >= 1) {
            return new FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1(flow, i);
        }
        fo.f(p91.l(i, "Expected positive chunk size, but got "));
        return null;
    }

    public static final <T> Flow<T> filter(Flow<? extends T> flow, pu0 pu0Var) {
        return new FlowKt__TransformKt$filter$$inlined$unsafeTransform$1(flow, pu0Var);
    }

    public static final <R> Flow<R> filterIsInstance(final Flow<?> flow, final l81 l81Var) {
        return (Flow<R>) new Flow<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ l81 $klass$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2$1, reason: invalid class name */
                @s90(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2", f = "Transform.kt", l = {50}, m = "emit")
                public static final class AnonymousClass1 extends r60 {
                    Object L$0;
                    Object L$1;
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

                public AnonymousClass2(FlowCollector flowCollector, l81 l81Var) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$klass$inlined = l81Var;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, q60 q60Var) {
                    AnonymousClass1 anonymousClass1;
                    if (q60Var instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) q60Var;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(q60Var);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(q60Var);
                    }
                    Object obj2 = anonymousClass1.result;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ee0.J(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        if (((ox) this.$klass$inlined).d(obj)) {
                            anonymousClass1.label = 1;
                            Object objEmit = flowCollector.emit(obj, anonymousClass1);
                            z70 z70Var = z70.e;
                            if (objEmit == z70Var) {
                                return z70Var;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            fo.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ee0.J(obj2);
                    }
                    return mf3.a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Object> flowCollector, q60 q60Var) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, l81Var), q60Var);
                return objCollect == z70.e ? objCollect : mf3.a;
            }
        };
    }

    public static final <T> Flow<T> filterNot(Flow<? extends T> flow, pu0 pu0Var) {
        return new FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1(flow, pu0Var);
    }

    public static final <T> Flow<T> filterNotNull(final Flow<? extends T> flow) {
        return new Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
                @s90(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {50}, m = "emit")
                public static final class AnonymousClass1 extends r60 {
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(T t, q60 q60Var) {
                    AnonymousClass1 anonymousClass1;
                    if (q60Var instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) q60Var;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(q60Var);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(q60Var);
                    }
                    Object obj = anonymousClass1.result;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ee0.J(obj);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        if (t != null) {
                            anonymousClass1.label = 1;
                            Object objEmit = flowCollector.emit(t, anonymousClass1);
                            z70 z70Var = z70.e;
                            if (objEmit == z70Var) {
                                return z70Var;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            fo.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ee0.J(obj);
                    }
                    return mf3.a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, q60 q60Var) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), q60Var);
                return objCollect == z70.e ? objCollect : mf3.a;
            }
        };
    }

    public static final <T, R> Flow<R> map(Flow<? extends T> flow, pu0 pu0Var) {
        return new FlowKt__TransformKt$map$$inlined$unsafeTransform$1(flow, pu0Var);
    }

    public static final <T, R> Flow<R> mapNotNull(Flow<? extends T> flow, pu0 pu0Var) {
        return new FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1(flow, pu0Var);
    }

    public static final <T> Flow<T> onEach(final Flow<? extends T> flow, final pu0 pu0Var) {
        return new Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ pu0 $action$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
                @s90(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {50, 51}, m = "emit")
                public static final class AnonymousClass1 extends r60 {
                    Object L$0;
                    Object L$1;
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
                    this.$action$inlined = pu0Var;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
                
                    if (r6.emit(r7, r0) == r5) goto L22;
                 */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r7, defpackage.q60 r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        int r1 = r0.label
                        r2 = 0
                        r3 = 2
                        r4 = 1
                        z70 r5 = defpackage.z70.e
                        if (r1 == 0) goto L3b
                        if (r1 == r4) goto L31
                        if (r1 != r3) goto L2b
                        defpackage.ee0.J(r8)
                        goto L5d
                    L2b:
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.fo.n(r6)
                        return r2
                    L31:
                        java.lang.Object r6 = r0.L$1
                        kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
                        java.lang.Object r7 = r0.L$0
                        defpackage.ee0.J(r8)
                        goto L50
                    L3b:
                        defpackage.ee0.J(r8)
                        kotlinx.coroutines.flow.FlowCollector r8 = r6.$this_unsafeFlow
                        pu0 r6 = r6.$action$inlined
                        r0.L$0 = r7
                        r0.L$1 = r8
                        r0.label = r4
                        java.lang.Object r6 = r6.invoke(r7, r0)
                        if (r6 != r5) goto L4f
                        goto L5c
                    L4f:
                        r6 = r8
                    L50:
                        r0.L$0 = r2
                        r0.L$1 = r2
                        r0.label = r3
                        java.lang.Object r6 = r6.emit(r7, r0)
                        if (r6 != r5) goto L5d
                    L5c:
                        return r5
                    L5d:
                        mf3 r6 = defpackage.mf3.a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2.emit(java.lang.Object, q60):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, q60 q60Var) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, pu0Var), q60Var);
                return objCollect == z70.e ? objCollect : mf3.a;
            }
        };
    }

    public static final <T, R> Flow<R> runningFold(Flow<? extends T> flow, R r, qu0 qu0Var) {
        return new FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1(r, flow, qu0Var);
    }

    public static final <T> Flow<T> runningReduce(final Flow<? extends T> flow, final qu0 qu0Var) {
        return new Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super T> flowCollector, q60 q60Var) {
                we2 we2Var = new we2();
                we2Var.e = NullSurrogateKt.NULL;
                Object objCollect = flow.collect(new FlowKt__TransformKt$runningReduce$1$1(we2Var, qu0Var, flowCollector), q60Var);
                return objCollect == z70.e ? objCollect : mf3.a;
            }
        };
    }

    public static final <T, R> Flow<R> scan(Flow<? extends T> flow, R r, qu0 qu0Var) {
        return FlowKt.runningFold(flow, r, qu0Var);
    }

    public static final <T> Flow<l11> withIndex(final Flow<? extends T> flow) {
        return new Flow<l11>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super l11> flowCollector, q60 q60Var) {
                Object objCollect = flow.collect(new FlowKt__TransformKt$withIndex$1$1(flowCollector, new ue2()), q60Var);
                return objCollect == z70.e ? objCollect : mf3.a;
            }
        };
    }

    public static final <R> Flow<R> filterIsInstance(Flow<?> flow) {
        o51.E();
        throw null;
    }
}
