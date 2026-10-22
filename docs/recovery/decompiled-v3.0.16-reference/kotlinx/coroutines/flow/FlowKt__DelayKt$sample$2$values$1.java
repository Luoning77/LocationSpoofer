package kotlinx.coroutines.flow;

import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s90;
import defpackage.z70;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1", f = "Delay.kt", l = {273}, m = "invokeSuspend")
public final class FlowKt__DelayKt$sample$2$values$1 extends k33 implements pu0 {
    final /* synthetic */ Flow<T> $this_sample;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class AnonymousClass1<T> implements FlowCollector {
        final /* synthetic */ ProducerScope<Object> $$this$produce;

        public AnonymousClass1(ProducerScope<Object> producerScope) {
            this.$$this$produce = producerScope;
        }

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
            FlowKt__DelayKt$sample$2$values$1$1$emit$1 flowKt__DelayKt$sample$2$values$1$1$emit$1;
            if (q60Var instanceof FlowKt__DelayKt$sample$2$values$1$1$emit$1) {
                flowKt__DelayKt$sample$2$values$1$1$emit$1 = (FlowKt__DelayKt$sample$2$values$1$1$emit$1) q60Var;
                int i = flowKt__DelayKt$sample$2$values$1$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    flowKt__DelayKt$sample$2$values$1$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    flowKt__DelayKt$sample$2$values$1$1$emit$1 = new FlowKt__DelayKt$sample$2$values$1$1$emit$1(this, q60Var);
                }
            } else {
                flowKt__DelayKt$sample$2$values$1$1$emit$1 = new FlowKt__DelayKt$sample$2$values$1$1$emit$1(this, q60Var);
            }
            Object obj = flowKt__DelayKt$sample$2$values$1$1$emit$1.result;
            int i2 = flowKt__DelayKt$sample$2$values$1$1$emit$1.label;
            if (i2 == 0) {
                ee0.J(obj);
                ProducerScope<Object> producerScope = this.$$this$produce;
                if (t == null) {
                    t = (T) NullSurrogateKt.NULL;
                }
                flowKt__DelayKt$sample$2$values$1$1$emit$1.label = 1;
                Object objSend = producerScope.send(t, flowKt__DelayKt$sample$2$values$1$1$emit$1);
                z70 z70Var = z70.e;
                if (objSend == z70Var) {
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
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$sample$2$values$1(Flow<? extends T> flow, q60 q60Var) {
        super(2, q60Var);
        this.$this_sample = flow;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        FlowKt__DelayKt$sample$2$values$1 flowKt__DelayKt$sample$2$values$1 = new FlowKt__DelayKt$sample$2$values$1(this.$this_sample, q60Var);
        flowKt__DelayKt$sample$2$values$1.L$0 = obj;
        return flowKt__DelayKt$sample$2$values$1;
    }

    @Override // defpackage.pu0
    public final Object invoke(ProducerScope<Object> producerScope, q60 q60Var) {
        return ((FlowKt__DelayKt$sample$2$values$1) create(producerScope, q60Var)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            ee0.J(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            Flow<T> flow = this.$this_sample;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(producerScope);
            this.label = 1;
            Object objCollect = flow.collect(anonymousClass1, this);
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
