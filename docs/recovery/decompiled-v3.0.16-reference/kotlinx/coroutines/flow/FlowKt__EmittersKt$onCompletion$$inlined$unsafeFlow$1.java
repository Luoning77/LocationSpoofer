package kotlinx.coroutines.flow;

import defpackage.ee0;
import defpackage.fo;
import defpackage.mf3;
import defpackage.q60;
import defpackage.qu0;
import defpackage.r60;
import defpackage.s90;
import defpackage.z70;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1<T> implements Flow<T> {
    final /* synthetic */ qu0 $action$inlined;
    final /* synthetic */ Flow $this_onCompletion$inlined;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1, reason: invalid class name */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {110, 117, 124}, m = "collect")
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
            return FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(Flow flow, qu0 qu0Var) {
        this.$this_onCompletion$inlined = flow;
        this.$action$inlined = qu0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, q60 q60Var) throws Throwable {
        AnonymousClass1 anonymousClass1;
        SafeCollector safeCollector;
        SafeCollector safeCollector2;
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
        z70 z70Var = z70.e;
        try {
            try {
                if (i2 == 0) {
                    ee0.J(obj);
                    Flow flow = this.$this_onCompletion$inlined;
                    anonymousClass1.L$0 = this;
                    anonymousClass1.L$1 = flowCollector;
                    anonymousClass1.label = 1;
                    if (flow.collect(flowCollector, anonymousClass1) != z70Var) {
                    }
                    return z70Var;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        Throwable th = (Throwable) anonymousClass1.L$0;
                        ee0.J(obj);
                        throw th;
                    }
                    if (i2 != 3) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    safeCollector2 = (SafeCollector) anonymousClass1.L$0;
                    try {
                        ee0.J(obj);
                        safeCollector2.releaseIntercepted();
                        return mf3.a;
                    } catch (Throwable th2) {
                        th = th2;
                        safeCollector2.releaseIntercepted();
                        throw th;
                    }
                }
                flowCollector = (FlowCollector) anonymousClass1.L$1;
                this = (FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1) anonymousClass1.L$0;
                ee0.J(obj);
                qu0 qu0Var = this.$action$inlined;
                anonymousClass1.L$0 = safeCollector;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 3;
                if (qu0Var.invoke(safeCollector, null, anonymousClass1) != z70Var) {
                    safeCollector2 = safeCollector;
                    safeCollector2.releaseIntercepted();
                    return mf3.a;
                }
            } catch (Throwable th3) {
                th = th3;
                safeCollector2 = safeCollector;
                safeCollector2.releaseIntercepted();
                throw th;
            }
            safeCollector = new SafeCollector(flowCollector, anonymousClass1.getContext());
        } catch (Throwable th4) {
            FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1<T> flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = this;
            ThrowingCollector throwingCollector = new ThrowingCollector(th4);
            qu0 qu0Var2 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.$action$inlined;
            anonymousClass1.L$0 = th4;
            anonymousClass1.L$1 = null;
            anonymousClass1.label = 2;
            if (FlowKt__EmittersKt.invokeSafely$FlowKt__EmittersKt(throwingCollector, qu0Var2, th4, anonymousClass1) != z70Var) {
                throw th4;
            }
        }
        return z70Var;
    }
}
