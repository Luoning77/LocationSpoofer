package kotlinx.coroutines.flow;

import defpackage.b81;
import defpackage.ee0;
import defpackage.fo;
import defpackage.mf3;
import defpackage.p91;
import defpackage.pu0;
import defpackage.q60;
import defpackage.qu0;
import defpackage.r60;
import defpackage.s90;
import defpackage.we2;
import defpackage.z70;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.FlowExceptions_commonKt;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final /* synthetic */ class FlowKt__ReduceKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "first")
    public static final class AnonymousClass1<T> extends r60 {
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
            return FlowKt.first(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "first")
    public static final class AnonymousClass3<T> extends r60 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass3(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.first(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "firstOrNull")
    public static final class C01411<T> extends r60 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C01411(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.firstOrNull(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "firstOrNull")
    public static final class C01423<T> extends r60 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C01423(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.firstOrNull(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {40}, m = "fold")
    public static final class C01431<T, R> extends r60 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C01431(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__ReduceKt.fold(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ we2 $accumulator;
        final /* synthetic */ qu0 $operation;

        public AnonymousClass2(we2 we2Var, qu0 qu0Var) {
            this.$accumulator = we2Var;
            this.$operation = qu0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(T t, q60 q60Var) {
            FlowKt__ReduceKt$fold$2$emit$1 flowKt__ReduceKt$fold$2$emit$1;
            we2 we2Var;
            if (q60Var instanceof FlowKt__ReduceKt$fold$2$emit$1) {
                flowKt__ReduceKt$fold$2$emit$1 = (FlowKt__ReduceKt$fold$2$emit$1) q60Var;
                int i = flowKt__ReduceKt$fold$2$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    flowKt__ReduceKt$fold$2$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    flowKt__ReduceKt$fold$2$emit$1 = new FlowKt__ReduceKt$fold$2$emit$1(this, q60Var);
                }
            } else {
                flowKt__ReduceKt$fold$2$emit$1 = new FlowKt__ReduceKt$fold$2$emit$1(this, q60Var);
            }
            Object obj = flowKt__ReduceKt$fold$2$emit$1.result;
            int i2 = flowKt__ReduceKt$fold$2$emit$1.label;
            if (i2 == 0) {
                ee0.J(obj);
                we2 we2Var2 = this.$accumulator;
                qu0 qu0Var = this.$operation;
                Object obj2 = we2Var2.e;
                flowKt__ReduceKt$fold$2$emit$1.L$0 = we2Var2;
                flowKt__ReduceKt$fold$2$emit$1.label = 1;
                Object objInvoke = qu0Var.invoke(obj2, t, flowKt__ReduceKt$fold$2$emit$1);
                z70 z70Var = z70.e;
                if (objInvoke == z70Var) {
                    return z70Var;
                }
                obj = objInvoke;
                we2Var = we2Var2;
            } else {
                if (i2 != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                we2Var = (we2) flowKt__ReduceKt$fold$2$emit$1.L$0;
                ee0.J(obj);
            }
            we2Var.e = obj;
            return mf3.a;
        }

        public final Object emit$$forInline(T t, q60 q60Var) {
            new FlowKt__ReduceKt$fold$2$emit$1(this, q60Var);
            we2 we2Var = this.$accumulator;
            we2Var.e = this.$operation.invoke(we2Var.e, t, q60Var);
            return mf3.a;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$last$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {151}, m = "last")
    public static final class C01441<T> extends r60 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C01441(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.last(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {163}, m = "lastOrNull")
    public static final class C01461<T> extends r60 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C01461(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.lastOrNull(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {18}, m = "reduce")
    public static final class C01481<S, T extends S> extends r60 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C01481(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.reduce(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class C01492<T> implements FlowCollector {
        final /* synthetic */ we2 $accumulator;
        final /* synthetic */ qu0 $operation;

        public C01492(we2 we2Var, qu0 qu0Var) {
            this.$accumulator = we2Var;
            this.$operation = qu0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(T t, q60 q60Var) {
            FlowKt__ReduceKt$reduce$2$emit$1 flowKt__ReduceKt$reduce$2$emit$1;
            we2 we2Var;
            Object obj;
            we2 we2Var2;
            Object obj2;
            if (q60Var instanceof FlowKt__ReduceKt$reduce$2$emit$1) {
                flowKt__ReduceKt$reduce$2$emit$1 = (FlowKt__ReduceKt$reduce$2$emit$1) q60Var;
                int i = flowKt__ReduceKt$reduce$2$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    flowKt__ReduceKt$reduce$2$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    flowKt__ReduceKt$reduce$2$emit$1 = new FlowKt__ReduceKt$reduce$2$emit$1(this, q60Var);
                }
            } else {
                flowKt__ReduceKt$reduce$2$emit$1 = new FlowKt__ReduceKt$reduce$2$emit$1(this, q60Var);
            }
            Object obj3 = flowKt__ReduceKt$reduce$2$emit$1.result;
            int i2 = flowKt__ReduceKt$reduce$2$emit$1.label;
            if (i2 == 0) {
                ee0.J(obj3);
                we2Var = this.$accumulator;
                Object obj4 = we2Var.e;
                if (obj4 != NullSurrogateKt.NULL) {
                    qu0 qu0Var = this.$operation;
                    flowKt__ReduceKt$reduce$2$emit$1.L$0 = we2Var;
                    flowKt__ReduceKt$reduce$2$emit$1.label = 1;
                    Object objInvoke = qu0Var.invoke(obj4, t, flowKt__ReduceKt$reduce$2$emit$1);
                    z70 z70Var = z70.e;
                    if (objInvoke == z70Var) {
                        obj2 = t;
                        return z70Var;
                    }
                    obj2 = t;
                    obj = objInvoke;
                    we2Var2 = we2Var;
                }
                obj2 = t;
                we2Var.e = obj2;
                return mf3.a;
            }
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            we2Var2 = (we2) flowKt__ReduceKt$reduce$2$emit$1.L$0;
            ee0.J(obj3);
            obj = (T) obj3;
            we2Var = we2Var2;
            obj2 = obj;
            obj2 = t;
            we2Var.e = obj2;
            return mf3.a;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$single$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {53}, m = "single")
    public static final class C01501<T> extends r60 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C01501(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.single(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "singleOrNull")
    public static final class C01521<T> extends r60 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C01521(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.singleOrNull(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object first(Flow<? extends T> flow, pu0 pu0Var, q60 q60Var) {
        AnonymousClass3 anonymousClass3;
        we2 we2Var;
        AbortFlowException e;
        FlowKt__ReduceKt$first$$inlined$collectWhile$2 flowKt__ReduceKt$first$$inlined$collectWhile$2;
        if (q60Var instanceof AnonymousClass3) {
            anonymousClass3 = (AnonymousClass3) q60Var;
            int i = anonymousClass3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass3.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass3 = new AnonymousClass3(q60Var);
            }
        } else {
            anonymousClass3 = new AnonymousClass3(q60Var);
        }
        Object obj = anonymousClass3.result;
        int i2 = anonymousClass3.label;
        if (i2 == 0) {
            we2 we2VarJ = p91.j(obj);
            we2VarJ.e = NullSurrogateKt.NULL;
            FlowKt__ReduceKt$first$$inlined$collectWhile$2 flowKt__ReduceKt$first$$inlined$collectWhile$3 = new FlowKt__ReduceKt$first$$inlined$collectWhile$2(pu0Var, we2VarJ);
            try {
                anonymousClass3.L$0 = we2VarJ;
                anonymousClass3.L$1 = flowKt__ReduceKt$first$$inlined$collectWhile$3;
                anonymousClass3.label = 1;
                Object objCollect = flow.collect(flowKt__ReduceKt$first$$inlined$collectWhile$3, anonymousClass3);
                z70 z70Var = z70.e;
                if (objCollect == z70Var) {
                    return z70Var;
                }
                we2Var = we2VarJ;
            } catch (AbortFlowException e2) {
                we2Var = we2VarJ;
                e = e2;
                flowKt__ReduceKt$first$$inlined$collectWhile$2 = flowKt__ReduceKt$first$$inlined$collectWhile$3;
                FlowExceptions_commonKt.checkOwnership(e, flowKt__ReduceKt$first$$inlined$collectWhile$2);
                JobKt.ensureActive(anonymousClass3.getContext());
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            flowKt__ReduceKt$first$$inlined$collectWhile$2 = (FlowKt__ReduceKt$first$$inlined$collectWhile$2) anonymousClass3.L$1;
            we2Var = (we2) anonymousClass3.L$0;
            try {
                ee0.J(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                FlowExceptions_commonKt.checkOwnership(e, flowKt__ReduceKt$first$$inlined$collectWhile$2);
                JobKt.ensureActive(anonymousClass3.getContext());
            }
        }
        Object obj2 = we2Var.e;
        if (obj2 != NullSurrogateKt.NULL) {
            return obj2;
        }
        b81.y("Expected at least one element matching the predicate");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object firstOrNull(Flow<? extends T> flow, pu0 pu0Var, q60 q60Var) {
        C01423 c01423;
        we2 we2Var;
        AbortFlowException e;
        FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
        if (q60Var instanceof C01423) {
            c01423 = (C01423) q60Var;
            int i = c01423.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01423.label = i - Integer.MIN_VALUE;
            } else {
                c01423 = new C01423(q60Var);
            }
        } else {
            c01423 = new C01423(q60Var);
        }
        Object obj = c01423.result;
        int i2 = c01423.label;
        if (i2 == 0) {
            we2 we2VarJ = p91.j(obj);
            FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$3 = new FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2(pu0Var, we2VarJ);
            try {
                c01423.L$0 = we2VarJ;
                c01423.L$1 = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$3;
                c01423.label = 1;
                Object objCollect = flow.collect(flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$3, c01423);
                z70 z70Var = z70.e;
                if (objCollect == z70Var) {
                    return z70Var;
                }
                we2Var = we2VarJ;
            } catch (AbortFlowException e2) {
                we2Var = we2VarJ;
                e = e2;
                flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$3;
                FlowExceptions_commonKt.checkOwnership(e, flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2);
                JobKt.ensureActive(c01423.getContext());
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) c01423.L$1;
            we2Var = (we2) c01423.L$0;
            try {
                ee0.J(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                FlowExceptions_commonKt.checkOwnership(e, flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2);
                JobKt.ensureActive(c01423.getContext());
            }
        }
        return we2Var.e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T, R> Object fold(Flow<? extends T> flow, R r, qu0 qu0Var, q60 q60Var) {
        C01431 c01431;
        we2 we2Var;
        if (q60Var instanceof C01431) {
            c01431 = (C01431) q60Var;
            int i = c01431.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01431.label = i - Integer.MIN_VALUE;
            } else {
                c01431 = new C01431(q60Var);
            }
        } else {
            c01431 = new C01431(q60Var);
        }
        Object obj = c01431.result;
        int i2 = c01431.label;
        if (i2 == 0) {
            we2 we2VarJ = p91.j(obj);
            we2VarJ.e = r;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(we2VarJ, qu0Var);
            c01431.L$0 = we2VarJ;
            c01431.label = 1;
            Object objCollect = flow.collect(anonymousClass2, c01431);
            z70 z70Var = z70.e;
            if (objCollect == z70Var) {
                return z70Var;
            }
            we2Var = we2VarJ;
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            we2Var = (we2) c01431.L$0;
            ee0.J(obj);
        }
        return we2Var.e;
    }

    private static final <T, R> Object fold$$forInline(Flow<? extends T> flow, R r, qu0 qu0Var, q60 q60Var) {
        we2 we2Var = new we2();
        we2Var.e = r;
        flow.collect(new AnonymousClass2(we2Var, qu0Var), q60Var);
        return we2Var.e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object last(Flow<? extends T> flow, q60 q60Var) {
        C01441 c01441;
        we2 we2Var;
        if (q60Var instanceof C01441) {
            c01441 = (C01441) q60Var;
            int i = c01441.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01441.label = i - Integer.MIN_VALUE;
            } else {
                c01441 = new C01441(q60Var);
            }
        } else {
            c01441 = new C01441(q60Var);
        }
        Object obj = c01441.result;
        int i2 = c01441.label;
        if (i2 == 0) {
            final we2 we2VarJ = p91.j(obj);
            we2VarJ.e = NullSurrogateKt.NULL;
            FlowCollector<? super Object> flowCollector = new FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt.last.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(T t, q60 q60Var2) {
                    we2VarJ.e = t;
                    return mf3.a;
                }
            };
            c01441.L$0 = we2VarJ;
            c01441.label = 1;
            Object objCollect = flow.collect(flowCollector, c01441);
            z70 z70Var = z70.e;
            if (objCollect == z70Var) {
                return z70Var;
            }
            we2Var = we2VarJ;
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            we2Var = (we2) c01441.L$0;
            ee0.J(obj);
        }
        Object obj2 = we2Var.e;
        if (obj2 != NullSurrogateKt.NULL) {
            return obj2;
        }
        b81.y("Expected at least one element");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object lastOrNull(Flow<? extends T> flow, q60 q60Var) {
        C01461 c01461;
        we2 we2Var;
        if (q60Var instanceof C01461) {
            c01461 = (C01461) q60Var;
            int i = c01461.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01461.label = i - Integer.MIN_VALUE;
            } else {
                c01461 = new C01461(q60Var);
            }
        } else {
            c01461 = new C01461(q60Var);
        }
        Object obj = c01461.result;
        int i2 = c01461.label;
        if (i2 == 0) {
            final we2 we2VarJ = p91.j(obj);
            FlowCollector<? super Object> flowCollector = new FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt.lastOrNull.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(T t, q60 q60Var2) {
                    we2VarJ.e = t;
                    return mf3.a;
                }
            };
            c01461.L$0 = we2VarJ;
            c01461.label = 1;
            Object objCollect = flow.collect(flowCollector, c01461);
            z70 z70Var = z70.e;
            if (objCollect == z70Var) {
                return z70Var;
            }
            we2Var = we2VarJ;
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            we2Var = (we2) c01461.L$0;
            ee0.J(obj);
        }
        return we2Var.e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <S, T extends S> Object reduce(Flow<? extends T> flow, qu0 qu0Var, q60 q60Var) {
        C01481 c01481;
        we2 we2Var;
        if (q60Var instanceof C01481) {
            c01481 = (C01481) q60Var;
            int i = c01481.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01481.label = i - Integer.MIN_VALUE;
            } else {
                c01481 = new C01481(q60Var);
            }
        } else {
            c01481 = new C01481(q60Var);
        }
        Object obj = c01481.result;
        int i2 = c01481.label;
        if (i2 == 0) {
            we2 we2VarJ = p91.j(obj);
            we2VarJ.e = NullSurrogateKt.NULL;
            C01492 c01492 = new C01492(we2VarJ, qu0Var);
            c01481.L$0 = we2VarJ;
            c01481.label = 1;
            Object objCollect = flow.collect(c01492, c01481);
            z70 z70Var = z70.e;
            if (objCollect == z70Var) {
                return z70Var;
            }
            we2Var = we2VarJ;
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            we2Var = (we2) c01481.L$0;
            ee0.J(obj);
        }
        Object obj2 = we2Var.e;
        if (obj2 != NullSurrogateKt.NULL) {
            return obj2;
        }
        b81.y("Empty flow can't be reduced");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object single(Flow<? extends T> flow, q60 q60Var) {
        C01501 c01501;
        we2 we2Var;
        if (q60Var instanceof C01501) {
            c01501 = (C01501) q60Var;
            int i = c01501.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01501.label = i - Integer.MIN_VALUE;
            } else {
                c01501 = new C01501(q60Var);
            }
        } else {
            c01501 = new C01501(q60Var);
        }
        Object obj = c01501.result;
        int i2 = c01501.label;
        if (i2 == 0) {
            final we2 we2VarJ = p91.j(obj);
            we2VarJ.e = NullSurrogateKt.NULL;
            FlowCollector<? super Object> flowCollector = new FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt.single.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(T t, q60 q60Var2) {
                    we2 we2Var2 = we2VarJ;
                    if (we2Var2.e == NullSurrogateKt.NULL) {
                        we2Var2.e = t;
                        return mf3.a;
                    }
                    fo.i("Flow has more than one element");
                    return null;
                }
            };
            c01501.L$0 = we2VarJ;
            c01501.label = 1;
            Object objCollect = flow.collect(flowCollector, c01501);
            z70 z70Var = z70.e;
            if (objCollect == z70Var) {
                return z70Var;
            }
            we2Var = we2VarJ;
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            we2Var = (we2) c01501.L$0;
            ee0.J(obj);
        }
        Object obj2 = we2Var.e;
        if (obj2 != NullSurrogateKt.NULL) {
            return obj2;
        }
        b81.y("Flow is empty");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object singleOrNull(Flow<? extends T> flow, q60 q60Var) {
        C01521 c01521;
        final we2 we2VarJ;
        AbortFlowException e;
        FlowCollector<T> flowCollector;
        if (q60Var instanceof C01521) {
            c01521 = (C01521) q60Var;
            int i = c01521.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01521.label = i - Integer.MIN_VALUE;
            } else {
                c01521 = new C01521(q60Var);
            }
        } else {
            c01521 = new C01521(q60Var);
        }
        Object obj = c01521.result;
        int i2 = c01521.label;
        if (i2 == 0) {
            we2VarJ = p91.j(obj);
            we2VarJ.e = NullSurrogateKt.NULL;
            FlowCollector<T> flowCollector2 = new FlowCollector<T>() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public Object emit(T t, q60 q60Var2) {
                    we2 we2Var = we2VarJ;
                    Object obj2 = we2Var.e;
                    Symbol symbol = NullSurrogateKt.NULL;
                    if (obj2 == symbol) {
                        we2Var.e = t;
                        return mf3.a;
                    }
                    we2Var.e = symbol;
                    throw new AbortFlowException(this);
                }
            };
            try {
                c01521.L$0 = we2VarJ;
                c01521.L$1 = flowCollector2;
                c01521.label = 1;
                Object objCollect = flow.collect(flowCollector2, c01521);
                z70 z70Var = z70.e;
                if (objCollect == z70Var) {
                    return z70Var;
                }
            } catch (AbortFlowException e2) {
                e = e2;
                flowCollector = flowCollector2;
                FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                JobKt.ensureActive(c01521.getContext());
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            flowCollector = (FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1) c01521.L$1;
            we2VarJ = (we2) c01521.L$0;
            try {
                ee0.J(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                JobKt.ensureActive(c01521.getContext());
            }
        }
        Object obj2 = we2VarJ.e;
        if (obj2 == NullSurrogateKt.NULL) {
            return null;
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object firstOrNull(Flow<? extends T> flow, q60 q60Var) {
        C01411 c01411;
        final we2 we2VarJ;
        AbortFlowException e;
        FlowCollector<T> flowCollector;
        if (q60Var instanceof C01411) {
            c01411 = (C01411) q60Var;
            int i = c01411.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01411.label = i - Integer.MIN_VALUE;
            } else {
                c01411 = new C01411(q60Var);
            }
        } else {
            c01411 = new C01411(q60Var);
        }
        Object obj = c01411.result;
        int i2 = c01411.label;
        if (i2 == 0) {
            we2VarJ = p91.j(obj);
            FlowCollector<T> flowCollector2 = new FlowCollector<T>() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public Object emit(T t, q60 q60Var2) {
                    we2VarJ.e = t;
                    throw new AbortFlowException(this);
                }
            };
            try {
                c01411.L$0 = we2VarJ;
                c01411.L$1 = flowCollector2;
                c01411.label = 1;
                Object objCollect = flow.collect(flowCollector2, c01411);
                z70 z70Var = z70.e;
                if (objCollect == z70Var) {
                    return z70Var;
                }
            } catch (AbortFlowException e2) {
                e = e2;
                flowCollector = flowCollector2;
                FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                JobKt.ensureActive(c01411.getContext());
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            flowCollector = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1) c01411.L$1;
            we2VarJ = (we2) c01411.L$0;
            try {
                ee0.J(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                JobKt.ensureActive(c01411.getContext());
            }
        }
        return we2VarJ.e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object first(Flow<? extends T> flow, q60 q60Var) {
        AnonymousClass1 anonymousClass1;
        final we2 we2VarJ;
        AbortFlowException e;
        FlowCollector<T> flowCollector;
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
            we2VarJ = p91.j(obj);
            we2VarJ.e = NullSurrogateKt.NULL;
            FlowCollector<T> flowCollector2 = new FlowCollector<T>() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public Object emit(T t, q60 q60Var2) {
                    we2VarJ.e = t;
                    throw new AbortFlowException(this);
                }
            };
            try {
                anonymousClass1.L$0 = we2VarJ;
                anonymousClass1.L$1 = flowCollector2;
                anonymousClass1.label = 1;
                Object objCollect = flow.collect(flowCollector2, anonymousClass1);
                z70 z70Var = z70.e;
                if (objCollect == z70Var) {
                    return z70Var;
                }
            } catch (AbortFlowException e2) {
                e = e2;
                flowCollector = flowCollector2;
                FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                JobKt.ensureActive(anonymousClass1.getContext());
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            flowCollector = (FlowKt__ReduceKt$first$$inlined$collectWhile$1) anonymousClass1.L$1;
            we2VarJ = (we2) anonymousClass1.L$0;
            try {
                ee0.J(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                JobKt.ensureActive(anonymousClass1.getContext());
            }
        }
        Object obj2 = we2VarJ.e;
        if (obj2 != NullSurrogateKt.NULL) {
            return obj2;
        }
        b81.y("Expected at least one element");
        return null;
    }
}
