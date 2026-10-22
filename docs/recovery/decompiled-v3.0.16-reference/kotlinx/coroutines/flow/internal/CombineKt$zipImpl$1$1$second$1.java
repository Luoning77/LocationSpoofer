package kotlinx.coroutines.flow.internal;

import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s90;
import defpackage.z70;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", f = "Combine.kt", l = {86}, m = "invokeSuspend")
public final class CombineKt$zipImpl$1$1$second$1 extends k33 implements pu0 {
    final /* synthetic */ Flow<T2> $flow2;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class AnonymousClass1<T> implements FlowCollector {
        final /* synthetic */ ProducerScope<Object> $$this$produce;

        public AnonymousClass1(ProducerScope<Object> producerScope) {
            this.$$this$produce = producerScope;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(T2 t2, q60 q60Var) {
            CombineKt$zipImpl$1$1$second$1$1$emit$1 combineKt$zipImpl$1$1$second$1$1$emit$1;
            Object obj;
            if (q60Var instanceof CombineKt$zipImpl$1$1$second$1$1$emit$1) {
                combineKt$zipImpl$1$1$second$1$1$emit$1 = (CombineKt$zipImpl$1$1$second$1$1$emit$1) q60Var;
                int i = combineKt$zipImpl$1$1$second$1$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    combineKt$zipImpl$1$1$second$1$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    combineKt$zipImpl$1$1$second$1$1$emit$1 = new CombineKt$zipImpl$1$1$second$1$1$emit$1(this, q60Var);
                }
            } else {
                combineKt$zipImpl$1$1$second$1$1$emit$1 = new CombineKt$zipImpl$1$1$second$1$1$emit$1(this, q60Var);
            }
            Object obj2 = combineKt$zipImpl$1$1$second$1$1$emit$1.result;
            int i2 = combineKt$zipImpl$1$1$second$1$1$emit$1.label;
            if (i2 == 0) {
                ee0.J(obj2);
                SendChannel<Object> channel = this.$$this$produce.getChannel();
                if (t2 == 0) {
                    obj = t2;
                    obj = NullSurrogateKt.NULL;
                }
                obj = t2;
                combineKt$zipImpl$1$1$second$1$1$emit$1.label = 1;
                Object objSend = channel.send(obj, combineKt$zipImpl$1$1$second$1$1$emit$1);
                z70 z70Var = z70.e;
                if (objSend == z70Var) {
                    return z70Var;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$zipImpl$1$1$second$1(Flow<? extends T2> flow, q60 q60Var) {
        super(2, q60Var);
        this.$flow2 = flow;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        CombineKt$zipImpl$1$1$second$1 combineKt$zipImpl$1$1$second$1 = new CombineKt$zipImpl$1$1$second$1(this.$flow2, q60Var);
        combineKt$zipImpl$1$1$second$1.L$0 = obj;
        return combineKt$zipImpl$1$1$second$1;
    }

    @Override // defpackage.pu0
    public final Object invoke(ProducerScope<Object> producerScope, q60 q60Var) {
        return ((CombineKt$zipImpl$1$1$second$1) create(producerScope, q60Var)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            ee0.J(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            Flow<T2> flow = this.$flow2;
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
