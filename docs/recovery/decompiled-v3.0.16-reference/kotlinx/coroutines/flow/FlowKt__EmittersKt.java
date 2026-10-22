package kotlinx.coroutines.flow;

import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.qu0;
import defpackage.s90;
import defpackage.vd0;
import defpackage.z70;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final /* synthetic */ class FlowKt__EmittersKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1", f = "Emitters.kt", l = {36}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends k33 implements pu0 {
        final /* synthetic */ Flow<T> $this_transform;
        final /* synthetic */ qu0 $transform;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
        public static final class C00021<T> implements FlowCollector {
            final /* synthetic */ FlowCollector<R> $$this$flow;
            final /* synthetic */ qu0 $transform;

            /* JADX WARN: Multi-variable type inference failed */
            public C00021(qu0 qu0Var, FlowCollector<? super R> flowCollector) {
                this.$transform = qu0Var;
                this.$$this$flow = flowCollector;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(T t, q60 q60Var) {
                FlowKt__EmittersKt$transform$1$1$emit$1 flowKt__EmittersKt$transform$1$1$emit$1;
                if (q60Var instanceof FlowKt__EmittersKt$transform$1$1$emit$1) {
                    flowKt__EmittersKt$transform$1$1$emit$1 = (FlowKt__EmittersKt$transform$1$1$emit$1) q60Var;
                    int i = flowKt__EmittersKt$transform$1$1$emit$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        flowKt__EmittersKt$transform$1$1$emit$1.label = i - Integer.MIN_VALUE;
                    } else {
                        flowKt__EmittersKt$transform$1$1$emit$1 = new FlowKt__EmittersKt$transform$1$1$emit$1(this, q60Var);
                    }
                } else {
                    flowKt__EmittersKt$transform$1$1$emit$1 = new FlowKt__EmittersKt$transform$1$1$emit$1(this, q60Var);
                }
                Object obj = flowKt__EmittersKt$transform$1$1$emit$1.result;
                int i2 = flowKt__EmittersKt$transform$1$1$emit$1.label;
                if (i2 == 0) {
                    ee0.J(obj);
                    qu0 qu0Var = this.$transform;
                    Object obj2 = this.$$this$flow;
                    flowKt__EmittersKt$transform$1$1$emit$1.label = 1;
                    Object objInvoke = qu0Var.invoke(obj2, t, flowKt__EmittersKt$transform$1$1$emit$1);
                    z70 z70Var = z70.e;
                    if (objInvoke == z70Var) {
                        return z70Var;
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

            public final Object emit$$forInline(T t, q60 q60Var) {
                new FlowKt__EmittersKt$transform$1$1$emit$1(this, q60Var);
                this.$transform.invoke(this.$$this$flow, t, q60Var);
                return mf3.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Flow<? extends T> flow, qu0 qu0Var, q60 q60Var) {
            super(2, q60Var);
            this.$this_transform = flow;
            this.$transform = qu0Var;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_transform, this.$transform, q60Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.pu0
        public final Object invoke(FlowCollector<? super R> flowCollector, q60 q60Var) {
            return ((AnonymousClass1) create(flowCollector, q60Var)).invokeSuspend(mf3.a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ee0.J(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Flow<T> flow = this.$this_transform;
                C00021 c00021 = new C00021(this.$transform, flowCollector);
                this.label = 1;
                Object objCollect = flow.collect(c00021, this);
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

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final Object invokeSuspend$$forInline(Object obj) {
            this.$this_transform.collect(new C00021(this.$transform, (FlowCollector) this.L$0), this);
            return mf3.a;
        }
    }

    public static final void ensureActive(FlowCollector<?> flowCollector) {
        if (flowCollector instanceof ThrowingCollector) {
            throw ((ThrowingCollector) flowCollector).e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object invokeSafely$FlowKt__EmittersKt(FlowCollector<? super T> flowCollector, qu0 qu0Var, Throwable th, q60 q60Var) throws IllegalAccessException, InvocationTargetException {
        FlowKt__EmittersKt$invokeSafely$1 flowKt__EmittersKt$invokeSafely$1;
        if (q60Var instanceof FlowKt__EmittersKt$invokeSafely$1) {
            flowKt__EmittersKt$invokeSafely$1 = (FlowKt__EmittersKt$invokeSafely$1) q60Var;
            int i = flowKt__EmittersKt$invokeSafely$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__EmittersKt$invokeSafely$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__EmittersKt$invokeSafely$1 = new FlowKt__EmittersKt$invokeSafely$1(q60Var);
            }
        } else {
            flowKt__EmittersKt$invokeSafely$1 = new FlowKt__EmittersKt$invokeSafely$1(q60Var);
        }
        Object obj = flowKt__EmittersKt$invokeSafely$1.result;
        int i2 = flowKt__EmittersKt$invokeSafely$1.label;
        try {
            if (i2 == 0) {
                ee0.J(obj);
                flowKt__EmittersKt$invokeSafely$1.L$0 = th;
                flowKt__EmittersKt$invokeSafely$1.label = 1;
                Object objInvoke = qu0Var.invoke(flowCollector, th, flowKt__EmittersKt$invokeSafely$1);
                Object obj2 = z70.e;
                if (objInvoke == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = (Throwable) flowKt__EmittersKt$invokeSafely$1.L$0;
                ee0.J(obj);
            }
            return mf3.a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                vd0.d(th2, th);
            }
            throw th2;
        }
    }

    public static final <T> Flow<T> onCompletion(Flow<? extends T> flow, qu0 qu0Var) {
        return new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(flow, qu0Var);
    }

    public static final <T> Flow<T> onEmpty(Flow<? extends T> flow, pu0 pu0Var) {
        return new FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1(flow, pu0Var);
    }

    public static final <T> Flow<T> onStart(Flow<? extends T> flow, pu0 pu0Var) {
        return new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(pu0Var, flow);
    }

    public static final <T, R> Flow<R> transform(Flow<? extends T> flow, qu0 qu0Var) {
        return FlowKt.flow(new AnonymousClass1(flow, qu0Var, null));
    }

    public static final <T, R> Flow<R> unsafeTransform(Flow<? extends T> flow, qu0 qu0Var) {
        return new FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1(flow, qu0Var);
    }
}
