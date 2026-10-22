package kotlinx.coroutines.flow;

import defpackage.ee0;
import defpackage.fo;
import defpackage.mf3;
import defpackage.o51;
import defpackage.q60;
import defpackage.r60;
import defpackage.s90;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class FlowKt__TransformKt$filterIsInstance$$inlined$filter$1 implements Flow<Object> {
    final /* synthetic */ Flow $this_unsafeTransform$inlined;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ FlowCollector $this_unsafeFlow;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1, reason: invalid class name */
        @s90(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2", f = "Transform.kt", l = {50}, m = "emit")
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
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(FlowCollector flowCollector) {
            this.$this_unsafeFlow = flowCollector;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, q60 q60Var) {
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
            Object obj2 = anonymousClass1.result;
            int i2 = anonymousClass1.label;
            if (i2 == 0) {
                ee0.J(obj2);
                o51.E();
                throw null;
            }
            if (i2 == 1) {
                ee0.J(obj2);
                return mf3.a;
            }
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }

        public final Object emit$$forInline(Object obj, q60 q60Var) {
            new AnonymousClass1(q60Var);
            o51.E();
            throw null;
        }
    }

    public FlowKt__TransformKt$filterIsInstance$$inlined$filter$1(Flow flow) {
        this.$this_unsafeTransform$inlined = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super Object> flowCollector, q60 q60Var) {
        o51.E();
        throw null;
    }

    public Object collect$$forInline(FlowCollector flowCollector, q60 q60Var) {
        new r60(q60Var) { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.1
            int label;
            /* synthetic */ Object result;

            @Override // defpackage.oq
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.this.collect(null, this);
            }
        };
        o51.E();
        throw null;
    }
}
