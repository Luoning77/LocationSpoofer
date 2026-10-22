package kotlinx.coroutines.flow;

import defpackage.cc0;
import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.qu0;
import defpackage.r60;
import defpackage.s90;
import defpackage.z70;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.internal.NopCollector;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final /* synthetic */ class FlowKt__CollectKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class AnonymousClass3<T> implements FlowCollector<T> {
        final /* synthetic */ pu0 $action;

        public AnonymousClass3(pu0 pu0Var) {
            this.$action = pu0Var;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public Object emit(T t, q60 q60Var) {
            Object objInvoke = this.$action.invoke(t, q60Var);
            return objInvoke == z70.e ? objInvoke : mf3.a;
        }

        public Object emit$$forInline(T t, final q60 q60Var) {
            new r60(q60Var) { // from class: kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3$emit$1
                int label;
                /* synthetic */ Object result;

                @Override // defpackage.oq
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.emit(null, this);
                }
            };
            this.$action.invoke(t, q60Var);
            return mf3.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class AnonymousClass2<T> implements FlowCollector<T> {
        final /* synthetic */ qu0 $action;
        private int index;

        public AnonymousClass2(qu0 qu0Var) {
            this.$action = qu0Var;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public Object emit(T t, q60 q60Var) {
            qu0 qu0Var = this.$action;
            int i = this.index;
            this.index = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            Object objInvoke = qu0Var.invoke(new Integer(i), t, q60Var);
            return objInvoke == z70.e ? objInvoke : mf3.a;
        }

        public Object emit$$forInline(T t, final q60 q60Var) {
            new r60(q60Var) { // from class: kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2$emit$1
                int label;
                /* synthetic */ Object result;

                @Override // defpackage.oq
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.emit(null, this);
                }
            };
            qu0 qu0Var = this.$action;
            int i = this.index;
            this.index = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            qu0Var.invoke(Integer.valueOf(i), t, q60Var);
            return mf3.a;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", l = {46}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends k33 implements pu0 {
        final /* synthetic */ Flow<T> $this_launchIn;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Flow<? extends T> flow, q60 q60Var) {
            super(2, q60Var);
            this.$this_launchIn = flow;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            return new AnonymousClass1(this.$this_launchIn, q60Var);
        }

        @Override // defpackage.pu0
        public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
            return ((AnonymousClass1) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ee0.J(obj);
                Flow<T> flow = this.$this_launchIn;
                this.label = 1;
                Object objCollect = FlowKt.collect(flow, this);
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

    @cc0
    public static final <T> Object collect(Flow<? extends T> flow, pu0 pu0Var, q60 q60Var) {
        Object objCollect = flow.collect(new AnonymousClass3(pu0Var), q60Var);
        return objCollect == z70.e ? objCollect : mf3.a;
    }

    @cc0
    private static final <T> Object collect$$forInline(Flow<? extends T> flow, pu0 pu0Var, q60 q60Var) {
        flow.collect(new AnonymousClass3(pu0Var), q60Var);
        return mf3.a;
    }

    public static final <T> Object collectIndexed(Flow<? extends T> flow, qu0 qu0Var, q60 q60Var) {
        Object objCollect = flow.collect(new AnonymousClass2(qu0Var), q60Var);
        return objCollect == z70.e ? objCollect : mf3.a;
    }

    private static final <T> Object collectIndexed$$forInline(Flow<? extends T> flow, qu0 qu0Var, q60 q60Var) {
        flow.collect(new AnonymousClass2(qu0Var), q60Var);
        return mf3.a;
    }

    public static final <T> Object collectLatest(Flow<? extends T> flow, pu0 pu0Var, q60 q60Var) {
        Object objCollect = FlowKt.collect(FlowKt__ContextKt.buffer$default(FlowKt.mapLatest(flow, pu0Var), 0, null, 2, null), q60Var);
        return objCollect == z70.e ? objCollect : mf3.a;
    }

    public static final <T> Object emitAll(FlowCollector<? super T> flowCollector, Flow<? extends T> flow, q60 q60Var) {
        FlowKt.ensureActive(flowCollector);
        Object objCollect = flow.collect(flowCollector, q60Var);
        return objCollect == z70.e ? objCollect : mf3.a;
    }

    public static final <T> Job launchIn(Flow<? extends T> flow, CoroutineScope coroutineScope) {
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(flow, null), 3, null);
    }

    public static final Object collect(Flow<?> flow, q60 q60Var) {
        Object objCollect = flow.collect(NopCollector.INSTANCE, q60Var);
        return objCollect == z70.e ? objCollect : mf3.a;
    }
}
