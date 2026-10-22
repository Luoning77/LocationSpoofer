package kotlinx.coroutines.flow;

import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.lu0;
import defpackage.mf3;
import defpackage.q60;
import defpackage.s90;
import defpackage.we2;
import defpackage.z70;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", l = {226}, m = "invokeSuspend")
public final class FlowKt__DelayKt$debounceInternal$1$3$1 extends k33 implements lu0 {
    final /* synthetic */ FlowCollector<T> $downstream;
    final /* synthetic */ we2 $lastValue;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$debounceInternal$1$3$1(FlowCollector<? super T> flowCollector, we2 we2Var, q60 q60Var) {
        super(1, q60Var);
        this.$downstream = flowCollector;
        this.$lastValue = we2Var;
    }

    @Override // defpackage.oq
    public final q60 create(q60 q60Var) {
        return new FlowKt__DelayKt$debounceInternal$1$3$1(this.$downstream, this.$lastValue, q60Var);
    }

    @Override // defpackage.lu0
    public final Object invoke(q60 q60Var) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$1) create(q60Var)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            ee0.J(obj);
            FlowCollector<T> flowCollector = this.$downstream;
            Symbol symbol = NullSurrogateKt.NULL;
            Object obj2 = this.$lastValue.e;
            if (obj2 == symbol) {
                obj2 = null;
            }
            this.label = 1;
            Object objEmit = flowCollector.emit((T) obj2, this);
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
        this.$lastValue.e = null;
        return mf3.a;
    }
}
