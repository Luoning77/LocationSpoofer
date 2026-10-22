package kotlinx.coroutines.flow;

import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s90;
import defpackage.we2;
import defpackage.z70;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", f = "Delay.kt", l = {293}, m = "invokeSuspend")
public final class FlowKt__DelayKt$sample$2$1$2 extends k33 implements pu0 {
    final /* synthetic */ FlowCollector<T> $downstream;
    final /* synthetic */ we2 $lastValue;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$sample$2$1$2(we2 we2Var, FlowCollector<? super T> flowCollector, q60 q60Var) {
        super(2, q60Var);
        this.$lastValue = we2Var;
        this.$downstream = flowCollector;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new FlowKt__DelayKt$sample$2$1$2(this.$lastValue, this.$downstream, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(mf3 mf3Var, q60 q60Var) {
        return ((FlowKt__DelayKt$sample$2$1$2) create(mf3Var, q60Var)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        mf3 mf3Var = mf3.a;
        if (i == 0) {
            ee0.J(obj);
            we2 we2Var = this.$lastValue;
            Object obj2 = we2Var.e;
            if (obj2 == null) {
                return mf3Var;
            }
            we2Var.e = null;
            FlowCollector<T> flowCollector = this.$downstream;
            Object obj3 = obj2 != NullSurrogateKt.NULL ? obj2 : null;
            this.label = 1;
            Object objEmit = flowCollector.emit((T) obj3, this);
            z70 z70Var = z70.e;
            if (objEmit == z70Var) {
                return z70Var;
            }
        } else {
            if (i != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(obj);
        }
        return mf3Var;
    }
}
