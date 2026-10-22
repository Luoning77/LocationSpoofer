package kotlinx.coroutines.flow;

import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.mf3;
import defpackage.p91;
import defpackage.pu0;
import defpackage.q60;
import defpackage.qu0;
import defpackage.r60;
import defpackage.s90;
import defpackage.se2;
import defpackage.ue2;
import defpackage.z70;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.FlowExceptions_commonKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final /* synthetic */ class FlowKt__LimitKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", l = {134}, m = "collectWhile")
    public static final class AnonymousClass1<T> extends r60 {
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
            return FlowKt__LimitKt.collectWhile(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", l = {152}, m = "invokeSuspend")
    public static final class C01361 extends k33 implements pu0 {
        final /* synthetic */ Flow<T> $this_transformWhile;
        final /* synthetic */ qu0 $transform;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C01361(Flow<? extends T> flow, qu0 qu0Var, q60 q60Var) {
            super(2, q60Var);
            this.$this_transformWhile = flow;
            this.$transform = qu0Var;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            C01361 c01361 = new C01361(this.$this_transformWhile, this.$transform, q60Var);
            c01361.L$0 = obj;
            return c01361;
        }

        @Override // defpackage.pu0
        public final Object invoke(FlowCollector<? super R> flowCollector, q60 q60Var) {
            return ((C01361) create(flowCollector, q60Var)).invokeSuspend(mf3.a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1;
            int i = this.label;
            if (i == 0) {
                ee0.J(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Flow<T> flow = this.$this_transformWhile;
                FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$2 = new FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1(this.$transform, flowCollector);
                try {
                    this.L$0 = flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$2;
                    this.label = 1;
                    Object objCollect = flow.collect(flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$2, this);
                    z70 z70Var = z70.e;
                    if (objCollect == z70Var) {
                        return z70Var;
                    }
                } catch (AbortFlowException e) {
                    e = e;
                    flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 = flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$2;
                    FlowExceptions_commonKt.checkOwnership(e, flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1);
                    JobKt.ensureActive(getContext());
                }
            } else {
                if (i != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 = (FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1) this.L$0;
                try {
                    ee0.J(obj);
                } catch (AbortFlowException e2) {
                    e = e2;
                    FlowExceptions_commonKt.checkOwnership(e, flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1);
                    JobKt.ensureActive(getContext());
                }
            }
            return mf3.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object collectWhile(Flow<? extends T> flow, pu0 pu0Var, q60 q60Var) {
        AnonymousClass1 anonymousClass1;
        FlowKt__LimitKt$collectWhile$collector$1 flowKt__LimitKt$collectWhile$collector$1;
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
            FlowKt__LimitKt$collectWhile$collector$1 flowKt__LimitKt$collectWhile$collector$2 = new FlowKt__LimitKt$collectWhile$collector$1(pu0Var);
            try {
                anonymousClass1.L$0 = flowKt__LimitKt$collectWhile$collector$2;
                anonymousClass1.label = 1;
                Object objCollect = flow.collect(flowKt__LimitKt$collectWhile$collector$2, anonymousClass1);
                z70 z70Var = z70.e;
                if (objCollect == z70Var) {
                    return z70Var;
                }
            } catch (AbortFlowException e) {
                e = e;
                flowKt__LimitKt$collectWhile$collector$1 = flowKt__LimitKt$collectWhile$collector$2;
                FlowExceptions_commonKt.checkOwnership(e, flowKt__LimitKt$collectWhile$collector$1);
                JobKt.ensureActive(anonymousClass1.getContext());
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            flowKt__LimitKt$collectWhile$collector$1 = (FlowKt__LimitKt$collectWhile$collector$1) anonymousClass1.L$0;
            try {
                ee0.J(obj);
            } catch (AbortFlowException e2) {
                e = e2;
                FlowExceptions_commonKt.checkOwnership(e, flowKt__LimitKt$collectWhile$collector$1);
                JobKt.ensureActive(anonymousClass1.getContext());
            }
        }
        return mf3.a;
    }

    private static final <T> Object collectWhile$$forInline(Flow<? extends T> flow, pu0 pu0Var, q60 q60Var) {
        FlowKt__LimitKt$collectWhile$collector$1 flowKt__LimitKt$collectWhile$collector$1 = new FlowKt__LimitKt$collectWhile$collector$1(pu0Var);
        try {
            flow.collect(flowKt__LimitKt$collectWhile$collector$1, q60Var);
            return mf3.a;
        } catch (AbortFlowException e) {
            FlowExceptions_commonKt.checkOwnership(e, flowKt__LimitKt$collectWhile$collector$1);
            throw null;
        }
    }

    public static final <T> Flow<T> drop(final Flow<? extends T> flow, final int i) {
        if (i >= 0) {
            return new Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super T> flowCollector, q60 q60Var) {
                    Object objCollect = flow.collect(new FlowKt__LimitKt$drop$2$1(new ue2(), i, flowCollector), q60Var);
                    return objCollect == z70.e ? objCollect : mf3.a;
                }
            };
        }
        fo.f(p91.l(i, "Drop count should be non-negative, but had "));
        return null;
    }

    public static final <T> Flow<T> dropWhile(final Flow<? extends T> flow, final pu0 pu0Var) {
        return new Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super T> flowCollector, q60 q60Var) {
                Object objCollect = flow.collect(new FlowKt__LimitKt$dropWhile$1$1(new se2(), flowCollector, pu0Var), q60Var);
                return objCollect == z70.e ? objCollect : mf3.a;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Object emitAbort$FlowKt__LimitKt(FlowCollector<? super T> flowCollector, T t, Object obj, q60 q60Var) {
        FlowKt__LimitKt$emitAbort$1 flowKt__LimitKt$emitAbort$1;
        if (q60Var instanceof FlowKt__LimitKt$emitAbort$1) {
            flowKt__LimitKt$emitAbort$1 = (FlowKt__LimitKt$emitAbort$1) q60Var;
            int i = flowKt__LimitKt$emitAbort$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$emitAbort$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$emitAbort$1 = new FlowKt__LimitKt$emitAbort$1(q60Var);
            }
        } else {
            flowKt__LimitKt$emitAbort$1 = new FlowKt__LimitKt$emitAbort$1(q60Var);
        }
        Object obj2 = flowKt__LimitKt$emitAbort$1.result;
        int i2 = flowKt__LimitKt$emitAbort$1.label;
        if (i2 == 0) {
            ee0.J(obj2);
            flowKt__LimitKt$emitAbort$1.L$0 = obj;
            flowKt__LimitKt$emitAbort$1.label = 1;
            Object objEmit = flowCollector.emit(t, flowKt__LimitKt$emitAbort$1);
            z70 z70Var = z70.e;
            if (objEmit == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = flowKt__LimitKt$emitAbort$1.L$0;
            ee0.J(obj2);
        }
        throw new AbortFlowException(obj);
    }

    public static final <T> Flow<T> take(Flow<? extends T> flow, int i) {
        if (i > 0) {
            return new FlowKt__LimitKt$take$$inlined$unsafeFlow$1(flow, i);
        }
        fo.f(p91.m(i, "Requested element count ", " should be positive"));
        return null;
    }

    public static final <T> Flow<T> takeWhile(Flow<? extends T> flow, pu0 pu0Var) {
        return new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(flow, pu0Var);
    }

    public static final <T, R> Flow<R> transformWhile(Flow<? extends T> flow, qu0 qu0Var) {
        return FlowKt.flow(new C01361(flow, qu0Var, null));
    }
}
