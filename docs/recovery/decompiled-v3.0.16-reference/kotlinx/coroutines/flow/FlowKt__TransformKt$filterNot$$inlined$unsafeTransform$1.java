package kotlinx.coroutines.flow;

import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.r60;
import defpackage.s90;
import defpackage.z70;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1<T> implements Flow<T> {
    final /* synthetic */ pu0 $predicate$inlined;
    final /* synthetic */ Flow $this_unsafeTransform$inlined;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ pu0 $predicate$inlined;
        final /* synthetic */ FlowCollector $this_unsafeFlow;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
        @s90(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {50, 50}, m = "emit")
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

        public AnonymousClass2(FlowCollector flowCollector, pu0 pu0Var) {
            this.$this_unsafeFlow = flowCollector;
            this.$predicate$inlined = pu0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
        
            if (r7.emit(r8, r0) == r5) goto L24;
         */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r8, defpackage.q60 r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2$1
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.result
                int r1 = r0.label
                r2 = 0
                r3 = 2
                r4 = 1
                z70 r5 = defpackage.z70.e
                if (r1 == 0) goto L3b
                if (r1 == r4) goto L31
                if (r1 != r3) goto L2b
                defpackage.ee0.J(r9)
                goto L67
            L2b:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.fo.n(r7)
                return r2
            L31:
                java.lang.Object r7 = r0.L$1
                kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                java.lang.Object r8 = r0.L$0
                defpackage.ee0.J(r9)
                goto L52
            L3b:
                defpackage.ee0.J(r9)
                kotlinx.coroutines.flow.FlowCollector r9 = r7.$this_unsafeFlow
                pu0 r7 = r7.$predicate$inlined
                r0.L$0 = r8
                r0.L$1 = r9
                r0.label = r4
                java.lang.Object r7 = r7.invoke(r8, r0)
                if (r7 != r5) goto L4f
                goto L66
            L4f:
                r6 = r9
                r9 = r7
                r7 = r6
            L52:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 != 0) goto L67
                r0.L$0 = r2
                r0.L$1 = r2
                r0.label = r3
                java.lang.Object r7 = r7.emit(r8, r0)
                if (r7 != r5) goto L67
            L66:
                return r5
            L67:
                mf3 r7 = defpackage.mf3.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1.AnonymousClass2.emit(java.lang.Object, q60):java.lang.Object");
        }

        public final Object emit$$forInline(Object obj, q60 q60Var) {
            new AnonymousClass1(q60Var);
            FlowCollector flowCollector = this.$this_unsafeFlow;
            if (!((Boolean) this.$predicate$inlined.invoke(obj, q60Var)).booleanValue()) {
                flowCollector.emit(obj, q60Var);
            }
            return mf3.a;
        }
    }

    public FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1(Flow flow, pu0 pu0Var) {
        this.$this_unsafeTransform$inlined = flow;
        this.$predicate$inlined = pu0Var;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector flowCollector, q60 q60Var) {
        Object objCollect = this.$this_unsafeTransform$inlined.collect(new AnonymousClass2(flowCollector, this.$predicate$inlined), q60Var);
        return objCollect == z70.e ? objCollect : mf3.a;
    }

    public Object collect$$forInline(FlowCollector flowCollector, q60 q60Var) {
        new r60(q60Var) { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1.1
            int label;
            /* synthetic */ Object result;

            @Override // defpackage.oq
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1.this.collect(null, this);
            }
        };
        this.$this_unsafeTransform$inlined.collect(new AnonymousClass2(flowCollector, this.$predicate$inlined), q60Var);
        return mf3.a;
    }
}
