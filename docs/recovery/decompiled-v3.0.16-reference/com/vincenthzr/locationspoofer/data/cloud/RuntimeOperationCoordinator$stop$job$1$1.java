package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.lu0;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s90;
import defpackage.z70;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.NonCancellable;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "com.vincenthzr.locationspoofer.data.cloud.RuntimeOperationCoordinator$stop$job$1$1", f = "RuntimeOperationCoordinator.kt", l = {51}, m = "invokeSuspend")
public final class RuntimeOperationCoordinator$stop$job$1$1 extends k33 implements pu0 {
    final /* synthetic */ lu0 $block;
    final /* synthetic */ List<Job> $previous;
    int label;

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.cloud.RuntimeOperationCoordinator$stop$job$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.cloud.RuntimeOperationCoordinator$stop$job$1$1$1", f = "RuntimeOperationCoordinator.kt", l = {51, 51}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends k33 implements pu0 {
        final /* synthetic */ lu0 $block;
        final /* synthetic */ List<Job> $previous;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(List<? extends Job> list, lu0 lu0Var, q60 q60Var) {
            super(2, q60Var);
            this.$previous = list;
            this.$block = lu0Var;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            return new AnonymousClass1(this.$previous, this.$block, q60Var);
        }

        @Override // defpackage.pu0
        public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
            return ((AnonymousClass1) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
        
            if (r8.invoke(r7) == r6) goto L18;
         */
        @Override // defpackage.oq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                int r0 = r7.label
                r1 = 0
                r2 = 2
                r3 = 1
                r4 = 0
                if (r0 == 0) goto L28
                if (r0 == r3) goto L16
                if (r0 != r2) goto L10
                defpackage.ee0.J(r8)
                goto L69
            L10:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.fo.n(r7)
                return r4
            L16:
                int r0 = r7.I$0
                java.lang.Object r5 = r7.L$3
                kotlinx.coroutines.Job r5 = (kotlinx.coroutines.Job) r5
                java.lang.Object r5 = r7.L$1
                java.util.Iterator r5 = (java.util.Iterator) r5
                java.lang.Object r6 = r7.L$0
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                defpackage.ee0.J(r8)
                goto L33
            L28:
                defpackage.ee0.J(r8)
                java.util.List<kotlinx.coroutines.Job> r8 = r7.$previous
                java.util.Iterator r8 = r8.iterator()
                r5 = r8
                r0 = r1
            L33:
                boolean r8 = r5.hasNext()
                z70 r6 = defpackage.z70.e
                if (r8 == 0) goto L56
                java.lang.Object r8 = r5.next()
                kotlinx.coroutines.Job r8 = (kotlinx.coroutines.Job) r8
                r7.L$0 = r4
                r7.L$1 = r5
                r7.L$2 = r4
                r7.L$3 = r4
                r7.I$0 = r0
                r7.I$1 = r1
                r7.label = r3
                java.lang.Object r8 = r8.join(r7)
                if (r8 != r6) goto L33
                goto L68
            L56:
                lu0 r8 = r7.$block
                r7.L$0 = r4
                r7.L$1 = r4
                r7.L$2 = r4
                r7.L$3 = r4
                r7.label = r2
                java.lang.Object r7 = r8.invoke(r7)
                if (r7 != r6) goto L69
            L68:
                return r6
            L69:
                mf3 r7 = defpackage.mf3.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vincenthzr.locationspoofer.data.cloud.RuntimeOperationCoordinator$stop$job$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RuntimeOperationCoordinator$stop$job$1$1(List<? extends Job> list, lu0 lu0Var, q60 q60Var) {
        super(2, q60Var);
        this.$previous = list;
        this.$block = lu0Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new RuntimeOperationCoordinator$stop$job$1$1(this.$previous, this.$block, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
        return ((RuntimeOperationCoordinator$stop$job$1$1) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            ee0.J(obj);
            NonCancellable nonCancellable = NonCancellable.INSTANCE;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$previous, this.$block, null);
            this.label = 1;
            Object objWithContext = BuildersKt.withContext(nonCancellable, anonymousClass1, this);
            z70 z70Var = z70.e;
            if (objWithContext == z70Var) {
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
