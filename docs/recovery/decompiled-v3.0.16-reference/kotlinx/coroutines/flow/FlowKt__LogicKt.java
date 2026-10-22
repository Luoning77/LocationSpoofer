package kotlinx.coroutines.flow;

import defpackage.ee0;
import defpackage.fo;
import defpackage.pu0;
import defpackage.q60;
import defpackage.r60;
import defpackage.s90;
import defpackage.se2;
import defpackage.z70;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.FlowExceptions_commonKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final /* synthetic */ class FlowKt__LogicKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LogicKt$all$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__LogicKt", f = "Logic.kt", l = {119}, m = "all")
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
            return FlowKt.all(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LogicKt$any$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__LogicKt", f = "Logic.kt", l = {119}, m = "any")
    public static final class C01371<T> extends r60 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C01371(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.any(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LogicKt$none$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__LogicKt", f = "Logic.kt", l = {107}, m = "none")
    public static final class C01381<T> extends r60 {
        int label;
        /* synthetic */ Object result;

        public C01381(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.none(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object all(Flow<? extends T> flow, pu0 pu0Var, q60 q60Var) {
        AnonymousClass1 anonymousClass1;
        se2 se2Var;
        AbortFlowException e;
        FlowKt__LogicKt$all$$inlined$collectWhile$1 flowKt__LogicKt$all$$inlined$collectWhile$1;
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
            se2 se2Var2 = new se2();
            FlowKt__LogicKt$all$$inlined$collectWhile$1 flowKt__LogicKt$all$$inlined$collectWhile$2 = new FlowKt__LogicKt$all$$inlined$collectWhile$1(pu0Var, se2Var2);
            try {
                anonymousClass1.L$0 = se2Var2;
                anonymousClass1.L$1 = flowKt__LogicKt$all$$inlined$collectWhile$2;
                anonymousClass1.label = 1;
                Object objCollect = flow.collect(flowKt__LogicKt$all$$inlined$collectWhile$2, anonymousClass1);
                z70 z70Var = z70.e;
                if (objCollect == z70Var) {
                    return z70Var;
                }
                se2Var = se2Var2;
            } catch (AbortFlowException e2) {
                se2Var = se2Var2;
                e = e2;
                flowKt__LogicKt$all$$inlined$collectWhile$1 = flowKt__LogicKt$all$$inlined$collectWhile$2;
                FlowExceptions_commonKt.checkOwnership(e, flowKt__LogicKt$all$$inlined$collectWhile$1);
                JobKt.ensureActive(anonymousClass1.getContext());
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            flowKt__LogicKt$all$$inlined$collectWhile$1 = (FlowKt__LogicKt$all$$inlined$collectWhile$1) anonymousClass1.L$1;
            se2Var = (se2) anonymousClass1.L$0;
            try {
                ee0.J(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                FlowExceptions_commonKt.checkOwnership(e, flowKt__LogicKt$all$$inlined$collectWhile$1);
                JobKt.ensureActive(anonymousClass1.getContext());
            }
        }
        return Boolean.valueOf(!se2Var.e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object any(Flow<? extends T> flow, pu0 pu0Var, q60 q60Var) {
        C01371 c01371;
        se2 se2Var;
        AbortFlowException e;
        FlowKt__LogicKt$any$$inlined$collectWhile$1 flowKt__LogicKt$any$$inlined$collectWhile$1;
        if (q60Var instanceof C01371) {
            c01371 = (C01371) q60Var;
            int i = c01371.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01371.label = i - Integer.MIN_VALUE;
            } else {
                c01371 = new C01371(q60Var);
            }
        } else {
            c01371 = new C01371(q60Var);
        }
        Object obj = c01371.result;
        int i2 = c01371.label;
        if (i2 == 0) {
            ee0.J(obj);
            se2 se2Var2 = new se2();
            FlowKt__LogicKt$any$$inlined$collectWhile$1 flowKt__LogicKt$any$$inlined$collectWhile$2 = new FlowKt__LogicKt$any$$inlined$collectWhile$1(pu0Var, se2Var2);
            try {
                c01371.L$0 = se2Var2;
                c01371.L$1 = flowKt__LogicKt$any$$inlined$collectWhile$2;
                c01371.label = 1;
                Object objCollect = flow.collect(flowKt__LogicKt$any$$inlined$collectWhile$2, c01371);
                z70 z70Var = z70.e;
                if (objCollect == z70Var) {
                    return z70Var;
                }
                se2Var = se2Var2;
            } catch (AbortFlowException e2) {
                se2Var = se2Var2;
                e = e2;
                flowKt__LogicKt$any$$inlined$collectWhile$1 = flowKt__LogicKt$any$$inlined$collectWhile$2;
                FlowExceptions_commonKt.checkOwnership(e, flowKt__LogicKt$any$$inlined$collectWhile$1);
                JobKt.ensureActive(c01371.getContext());
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            flowKt__LogicKt$any$$inlined$collectWhile$1 = (FlowKt__LogicKt$any$$inlined$collectWhile$1) c01371.L$1;
            se2Var = (se2) c01371.L$0;
            try {
                ee0.J(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                FlowExceptions_commonKt.checkOwnership(e, flowKt__LogicKt$any$$inlined$collectWhile$1);
                JobKt.ensureActive(c01371.getContext());
            }
        }
        return Boolean.valueOf(se2Var.e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object none(Flow<? extends T> flow, pu0 pu0Var, q60 q60Var) {
        C01381 c01381;
        if (q60Var instanceof C01381) {
            c01381 = (C01381) q60Var;
            int i = c01381.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01381.label = i - Integer.MIN_VALUE;
            } else {
                c01381 = new C01381(q60Var);
            }
        } else {
            c01381 = new C01381(q60Var);
        }
        Object objAny = c01381.result;
        int i2 = c01381.label;
        if (i2 == 0) {
            ee0.J(objAny);
            c01381.label = 1;
            objAny = FlowKt.any(flow, pu0Var, c01381);
            z70 z70Var = z70.e;
            if (objAny == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(objAny);
        }
        return Boolean.valueOf(!((Boolean) objAny).booleanValue());
    }
}
