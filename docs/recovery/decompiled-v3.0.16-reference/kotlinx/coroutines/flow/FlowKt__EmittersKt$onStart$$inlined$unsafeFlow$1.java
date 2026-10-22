package kotlinx.coroutines.flow;

import defpackage.pu0;
import defpackage.q60;
import defpackage.r60;
import defpackage.s90;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1<T> implements Flow<T> {
    final /* synthetic */ pu0 $action$inlined;
    final /* synthetic */ Flow $this_onStart$inlined;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1, reason: invalid class name */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {112, 116}, m = "collect")
    public static final class AnonymousClass1 extends r60 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(pu0 pu0Var, Flow flow) {
        this.$action$inlined = pu0Var;
        this.$this_onStart$inlined = flow;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (r6.collect(r7, r0) == r5) goto L27;
     */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r7, defpackage.q60 r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            r4 = 0
            z70 r5 = defpackage.z70.e
            if (r1 == 0) goto L43
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.ee0.J(r8)
            goto L76
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r6)
            return r4
        L31:
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.flow.internal.SafeCollector r6 = (kotlinx.coroutines.flow.internal.SafeCollector) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            java.lang.Object r1 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 r1 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1) r1
            defpackage.ee0.J(r8)     // Catch: java.lang.Throwable -> L41
            goto L62
        L41:
            r7 = move-exception
            goto L7b
        L43:
            defpackage.ee0.J(r8)
            kotlinx.coroutines.flow.internal.SafeCollector r8 = new kotlinx.coroutines.flow.internal.SafeCollector
            y70 r1 = r0.getContext()
            r8.<init>(r7, r1)
            pu0 r1 = r6.$action$inlined     // Catch: java.lang.Throwable -> L79
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L79
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L79
            r0.L$2 = r8     // Catch: java.lang.Throwable -> L79
            r0.label = r3     // Catch: java.lang.Throwable -> L79
            java.lang.Object r1 = r1.invoke(r8, r0)     // Catch: java.lang.Throwable -> L79
            if (r1 != r5) goto L60
            goto L75
        L60:
            r1 = r6
            r6 = r8
        L62:
            r6.releaseIntercepted()
            kotlinx.coroutines.flow.Flow r6 = r1.$this_onStart$inlined
            r0.L$0 = r4
            r0.L$1 = r4
            r0.L$2 = r4
            r0.label = r2
            java.lang.Object r6 = r6.collect(r7, r0)
            if (r6 != r5) goto L76
        L75:
            return r5
        L76:
            mf3 r6 = defpackage.mf3.a
            return r6
        L79:
            r7 = move-exception
            r6 = r8
        L7b:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.collect(kotlinx.coroutines.flow.FlowCollector, q60):java.lang.Object");
    }
}
