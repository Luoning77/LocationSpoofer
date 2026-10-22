package kotlinx.coroutines.flow;

import defpackage.ee0;
import defpackage.fo;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.r60;
import defpackage.s90;
import defpackage.ue2;
import defpackage.z70;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final /* synthetic */ class FlowKt__CountKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CountKt$count$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", l = {13}, m = "count")
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
            return FlowKt.count(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CountKt$count$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", l = {25}, m = "count")
    public static final class AnonymousClass3<T> extends r60 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass3(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.count(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CountKt$count$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class AnonymousClass4<T> implements FlowCollector {
        final /* synthetic */ ue2 $i;
        final /* synthetic */ pu0 $predicate;

        public AnonymousClass4(pu0 pu0Var, ue2 ue2Var) {
            this.$predicate = pu0Var;
            this.$i = ue2Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(T t, q60 q60Var) {
            FlowKt__CountKt$count$4$emit$1 flowKt__CountKt$count$4$emit$1;
            if (q60Var instanceof FlowKt__CountKt$count$4$emit$1) {
                flowKt__CountKt$count$4$emit$1 = (FlowKt__CountKt$count$4$emit$1) q60Var;
                int i = flowKt__CountKt$count$4$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    flowKt__CountKt$count$4$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    flowKt__CountKt$count$4$emit$1 = new FlowKt__CountKt$count$4$emit$1(this, q60Var);
                }
            } else {
                flowKt__CountKt$count$4$emit$1 = new FlowKt__CountKt$count$4$emit$1(this, q60Var);
            }
            Object objInvoke = flowKt__CountKt$count$4$emit$1.result;
            int i2 = flowKt__CountKt$count$4$emit$1.label;
            if (i2 == 0) {
                ee0.J(objInvoke);
                pu0 pu0Var = this.$predicate;
                flowKt__CountKt$count$4$emit$1.L$0 = this;
                flowKt__CountKt$count$4$emit$1.label = 1;
                objInvoke = pu0Var.invoke(t, flowKt__CountKt$count$4$emit$1);
                z70 z70Var = z70.e;
                if (objInvoke == z70Var) {
                    return z70Var;
                }
            } else {
                if (i2 != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = (AnonymousClass4) flowKt__CountKt$count$4$emit$1.L$0;
                ee0.J(objInvoke);
            }
            if (((Boolean) objInvoke).booleanValue()) {
                this.$i.e++;
            }
            return mf3.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object count(Flow<? extends T> flow, q60 q60Var) {
        AnonymousClass1 anonymousClass1;
        ue2 ue2Var;
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
            final ue2 ue2Var2 = new ue2();
            FlowCollector<? super Object> flowCollector = new FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__CountKt.count.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(T t, q60 q60Var2) {
                    ue2Var2.e++;
                    return mf3.a;
                }
            };
            anonymousClass1.L$0 = ue2Var2;
            anonymousClass1.label = 1;
            Object objCollect = flow.collect(flowCollector, anonymousClass1);
            z70 z70Var = z70.e;
            if (objCollect == z70Var) {
                return z70Var;
            }
            ue2Var = ue2Var2;
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ue2Var = (ue2) anonymousClass1.L$0;
            ee0.J(obj);
        }
        return new Integer(ue2Var.e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object count(Flow<? extends T> flow, pu0 pu0Var, q60 q60Var) {
        AnonymousClass3 anonymousClass3;
        ue2 ue2Var;
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
            ee0.J(obj);
            ue2 ue2Var2 = new ue2();
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(pu0Var, ue2Var2);
            anonymousClass3.L$0 = ue2Var2;
            anonymousClass3.label = 1;
            Object objCollect = flow.collect(anonymousClass4, anonymousClass3);
            z70 z70Var = z70.e;
            if (objCollect == z70Var) {
                return z70Var;
            }
            ue2Var = ue2Var2;
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ue2Var = (ue2) anonymousClass3.L$0;
            ee0.J(obj);
        }
        return new Integer(ue2Var.e);
    }
}
