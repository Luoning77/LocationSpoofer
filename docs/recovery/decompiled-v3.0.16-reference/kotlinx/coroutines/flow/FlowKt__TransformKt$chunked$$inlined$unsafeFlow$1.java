package kotlinx.coroutines.flow;

import defpackage.q60;
import defpackage.r60;
import defpackage.s90;
import java.util.List;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1<T> implements Flow<List<? extends T>> {
    final /* synthetic */ int $size$inlined;
    final /* synthetic */ Flow $this_chunked$inlined;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1, reason: invalid class name */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1", f = "Transform.kt", l = {110, 120}, m = "collect")
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
            return FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1(Flow flow, int i) {
        this.$this_chunked$inlined = flow;
        this.$size$inlined = i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r8.emit(r7, r0) == r5) goto L24;
     */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.util.List<? extends T>> r8, defpackage.q60 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            z70 r5 = defpackage.z70.e
            if (r1 == 0) goto L3d
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.ee0.J(r9)
            goto L6b
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r7)
            return r2
        L31:
            java.lang.Object r7 = r0.L$1
            we2 r7 = (defpackage.we2) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.flow.FlowCollector r8 = (kotlinx.coroutines.flow.FlowCollector) r8
            defpackage.ee0.J(r9)
            goto L58
        L3d:
            we2 r9 = defpackage.p91.j(r9)
            kotlinx.coroutines.flow.Flow r1 = r7.$this_chunked$inlined
            kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1 r6 = new kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1
            int r7 = r7.$size$inlined
            r6.<init>(r9, r7, r8)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r7 = r1.collect(r6, r0)
            if (r7 != r5) goto L57
            goto L6a
        L57:
            r7 = r9
        L58:
            java.lang.Object r7 = r7.e
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            if (r7 == 0) goto L6b
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r5) goto L6b
        L6a:
            return r5
        L6b:
            mf3 r7 = defpackage.mf3.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1.collect(kotlinx.coroutines.flow.FlowCollector, q60):java.lang.Object");
    }
}
