package kotlinx.coroutines.flow;

import defpackage.au0;
import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.mf3;
import defpackage.o51;
import defpackage.pu0;
import defpackage.q60;
import defpackage.qu0;
import defpackage.s90;
import defpackage.z70;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1", f = "Zip.kt", l = {269}, m = "invokeSuspend")
public final class FlowKt__ZipKt$combineTransformUnsafe$1 extends k33 implements pu0 {
    final /* synthetic */ Flow<T>[] $flows;
    final /* synthetic */ qu0 $transform;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combineTransformUnsafe$1(Flow<? extends T>[] flowArr, qu0 qu0Var, q60 q60Var) {
        super(2, q60Var);
        this.$flows = flowArr;
        this.$transform = qu0Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        FlowKt__ZipKt$combineTransformUnsafe$1 flowKt__ZipKt$combineTransformUnsafe$1 = new FlowKt__ZipKt$combineTransformUnsafe$1(this.$flows, this.$transform, q60Var);
        flowKt__ZipKt$combineTransformUnsafe$1.L$0 = obj;
        return flowKt__ZipKt$combineTransformUnsafe$1;
    }

    @Override // defpackage.pu0
    public final Object invoke(FlowCollector<? super R> flowCollector, q60 q60Var) {
        return ((FlowKt__ZipKt$combineTransformUnsafe$1) create(flowCollector, q60Var)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ee0.J(obj);
                return mf3.a;
            }
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ee0.J(obj);
        au0 unused = new au0() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
            @Override // defpackage.au0
            public final Void invoke() {
                return null;
            }
        };
        o51.E();
        throw null;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        au0 unused = new au0() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
            @Override // defpackage.au0
            public final Void invoke() {
                return null;
            }
        };
        o51.E();
        throw null;
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1$1", f = "Zip.kt", l = {269}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends k33 implements qu0 {
        final /* synthetic */ qu0 $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(qu0 qu0Var, q60 q60Var) {
            super(3, q60Var);
            this.$transform = qu0Var;
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ee0.J(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Object[] objArr = (Object[]) this.L$1;
                qu0 qu0Var = this.$transform;
                this.L$0 = null;
                this.label = 1;
                Object objInvoke = qu0Var.invoke(flowCollector, objArr, this);
                z70 z70Var = z70.e;
                if (objInvoke == z70Var) {
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

        public final Object invokeSuspend$$forInline(Object obj) {
            this.$transform.invoke((FlowCollector) this.L$0, (Object[]) this.L$1, this);
            return mf3.a;
        }

        @Override // defpackage.qu0
        public final Object invoke(FlowCollector<? super R> flowCollector, T[] tArr, q60 q60Var) {
            o51.E();
            throw null;
        }
    }
}
