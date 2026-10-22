package kotlinx.coroutines.flow;

import defpackage.ee0;
import defpackage.fo;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.r60;
import defpackage.s90;
import defpackage.we2;
import defpackage.z70;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class FlowKt__ReduceKt$first$$inlined$collectWhile$2<T> implements FlowCollector<T> {
    final /* synthetic */ pu0 $predicate$inlined;
    final /* synthetic */ we2 $result$inlined;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2$1, reason: invalid class name */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", l = {132}, m = "emit")
    public static final class AnonymousClass1 extends r60 {
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
            return FlowKt__ReduceKt$first$$inlined$collectWhile$2.this.emit(null, this);
        }
    }

    public FlowKt__ReduceKt$first$$inlined$collectWhile$2(pu0 pu0Var, we2 we2Var) {
        this.$predicate$inlined = pu0Var;
        this.$result$inlined = we2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, q60 q60Var) {
        AnonymousClass1 anonymousClass1;
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
        Object objInvoke = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ee0.J(objInvoke);
            pu0 pu0Var = this.$predicate$inlined;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = t;
            anonymousClass1.label = 1;
            objInvoke = pu0Var.invoke(t, anonymousClass1);
            z70 z70Var = z70.e;
            if (objInvoke == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            t = (T) anonymousClass1.L$1;
            this = (FlowKt__ReduceKt$first$$inlined$collectWhile$2) anonymousClass1.L$0;
            ee0.J(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return mf3.a;
        }
        this.$result$inlined.e = t;
        throw new AbortFlowException(this);
    }
}
