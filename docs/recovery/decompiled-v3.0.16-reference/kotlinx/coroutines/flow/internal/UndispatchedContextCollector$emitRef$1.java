package kotlinx.coroutines.flow.internal;

import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s90;
import defpackage.z70;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {208}, m = "invokeSuspend")
public final class UndispatchedContextCollector$emitRef$1 extends k33 implements pu0 {
    final /* synthetic */ FlowCollector<T> $downstream;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UndispatchedContextCollector$emitRef$1(FlowCollector<? super T> flowCollector, q60 q60Var) {
        super(2, q60Var);
        this.$downstream = flowCollector;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        UndispatchedContextCollector$emitRef$1 undispatchedContextCollector$emitRef$1 = new UndispatchedContextCollector$emitRef$1(this.$downstream, q60Var);
        undispatchedContextCollector$emitRef$1.L$0 = obj;
        return undispatchedContextCollector$emitRef$1;
    }

    @Override // defpackage.pu0
    public final Object invoke(T t, q60 q60Var) {
        return ((UndispatchedContextCollector$emitRef$1) create(t, q60Var)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            ee0.J(obj);
            Object obj2 = this.L$0;
            FlowCollector<T> flowCollector = this.$downstream;
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
        return mf3.a;
    }
}
