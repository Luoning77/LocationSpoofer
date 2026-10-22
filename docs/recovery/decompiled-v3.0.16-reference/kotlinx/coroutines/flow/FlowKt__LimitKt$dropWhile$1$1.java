package kotlinx.coroutines.flow;

import defpackage.ee0;
import defpackage.fo;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.se2;
import defpackage.z70;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class FlowKt__LimitKt$dropWhile$1$1<T> implements FlowCollector {
    final /* synthetic */ se2 $matched;
    final /* synthetic */ pu0 $predicate;
    final /* synthetic */ FlowCollector<T> $this_flow;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$dropWhile$1$1(se2 se2Var, FlowCollector<? super T> flowCollector, pu0 pu0Var) {
        this.$matched = se2Var;
        this.$this_flow = flowCollector;
        this.$predicate = pu0Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(T t, q60 q60Var) {
        FlowKt__LimitKt$dropWhile$1$1$emit$1 flowKt__LimitKt$dropWhile$1$1$emit$1;
        FlowCollector<T> flowCollector;
        if (q60Var instanceof FlowKt__LimitKt$dropWhile$1$1$emit$1) {
            flowKt__LimitKt$dropWhile$1$1$emit$1 = (FlowKt__LimitKt$dropWhile$1$1$emit$1) q60Var;
            int i = flowKt__LimitKt$dropWhile$1$1$emit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$dropWhile$1$1$emit$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$dropWhile$1$1$emit$1 = new FlowKt__LimitKt$dropWhile$1$1$emit$1(this, q60Var);
            }
        } else {
            flowKt__LimitKt$dropWhile$1$1$emit$1 = new FlowKt__LimitKt$dropWhile$1$1$emit$1(this, q60Var);
        }
        Object objInvoke = flowKt__LimitKt$dropWhile$1$1$emit$1.result;
        int i2 = flowKt__LimitKt$dropWhile$1$1$emit$1.label;
        mf3 mf3Var = mf3.a;
        z70 z70Var = z70.e;
        if (i2 != 0) {
            if (i2 == 1) {
                ee0.J(objInvoke);
                return mf3Var;
            }
            if (i2 == 2) {
                t = (T) flowKt__LimitKt$dropWhile$1$1$emit$1.L$1;
                this = (FlowKt__LimitKt$dropWhile$1$1) flowKt__LimitKt$dropWhile$1$1$emit$1.L$0;
                ee0.J(objInvoke);
                if (!((Boolean) objInvoke).booleanValue()) {
                    this.$matched.e = true;
                    flowCollector = this.$this_flow;
                    flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = null;
                    flowKt__LimitKt$dropWhile$1$1$emit$1.L$1 = null;
                    flowKt__LimitKt$dropWhile$1$1$emit$1.label = 3;
                    if (flowCollector.emit(t, flowKt__LimitKt$dropWhile$1$1$emit$1) == z70Var) {
                        return z70Var;
                    }
                }
            } else {
                if (i2 != 3) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(objInvoke);
            }
            return mf3Var;
        }
        ee0.J(objInvoke);
        if (this.$matched.e) {
            FlowCollector<T> flowCollector2 = this.$this_flow;
            flowKt__LimitKt$dropWhile$1$1$emit$1.label = 1;
            if (flowCollector2.emit(t, flowKt__LimitKt$dropWhile$1$1$emit$1) != z70Var) {
                return mf3Var;
            }
        } else {
            pu0 pu0Var = this.$predicate;
            flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = this;
            flowKt__LimitKt$dropWhile$1$1$emit$1.L$1 = t;
            flowKt__LimitKt$dropWhile$1$1$emit$1.label = 2;
            objInvoke = pu0Var.invoke(t, flowKt__LimitKt$dropWhile$1$1$emit$1);
            if (objInvoke != z70Var) {
                if (!((Boolean) objInvoke).booleanValue()) {
                    this.$matched.e = true;
                    flowCollector = this.$this_flow;
                    flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = null;
                    flowKt__LimitKt$dropWhile$1$1$emit$1.L$1 = null;
                    flowKt__LimitKt$dropWhile$1$1$emit$1.label = 3;
                    if (flowCollector.emit(t, flowKt__LimitKt$dropWhile$1$1$emit$1) == z70Var) {
                    }
                }
                return mf3Var;
            }
        }
        return z70Var;
    }
}
