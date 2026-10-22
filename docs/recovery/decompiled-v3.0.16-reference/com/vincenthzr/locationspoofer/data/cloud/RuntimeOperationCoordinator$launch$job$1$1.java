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
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "com.vincenthzr.locationspoofer.data.cloud.RuntimeOperationCoordinator$launch$job$1$1", f = "RuntimeOperationCoordinator.kt", l = {31, 34}, m = "invokeSuspend")
public final class RuntimeOperationCoordinator$launch$job$1$1 extends k33 implements pu0 {
    final /* synthetic */ lu0 $block;
    final /* synthetic */ List<Job> $previous;
    final /* synthetic */ long $version;
    int label;
    final /* synthetic */ RuntimeOperationCoordinator this$0;

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.cloud.RuntimeOperationCoordinator$launch$job$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.cloud.RuntimeOperationCoordinator$launch$job$1$1$1", f = "RuntimeOperationCoordinator.kt", l = {31}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends k33 implements pu0 {
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
        public AnonymousClass1(List<? extends Job> list, q60 q60Var) {
            super(2, q60Var);
            this.$previous = list;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            return new AnonymousClass1(this.$previous, q60Var);
        }

        @Override // defpackage.pu0
        public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
            return ((AnonymousClass1) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            int i;
            int i2 = this.label;
            if (i2 == 0) {
                ee0.J(obj);
                it = this.$previous.iterator();
                i = 0;
            } else {
                if (i2 != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.I$0;
                it = (Iterator) this.L$1;
                ee0.J(obj);
            }
            while (it.hasNext()) {
                Job job = (Job) it.next();
                this.L$0 = null;
                this.L$1 = it;
                this.L$2 = null;
                this.L$3 = null;
                this.I$0 = i;
                this.I$1 = 0;
                this.label = 1;
                Object objJoin = job.join(this);
                z70 z70Var = z70.e;
                if (objJoin == z70Var) {
                    return z70Var;
                }
            }
            return mf3.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RuntimeOperationCoordinator$launch$job$1$1(RuntimeOperationCoordinator runtimeOperationCoordinator, lu0 lu0Var, List<? extends Job> list, long j, q60 q60Var) {
        super(2, q60Var);
        this.this$0 = runtimeOperationCoordinator;
        this.$block = lu0Var;
        this.$previous = list;
        this.$version = j;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new RuntimeOperationCoordinator$launch$job$1$1(this.this$0, this.$block, this.$previous, this.$version, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
        return ((RuntimeOperationCoordinator$launch$job$1$1) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r8.invoke(r7) == r0) goto L26;
     */
    @Override // defpackage.oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            z70 r0 = defpackage.z70.e
            int r1 = r7.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1b
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            defpackage.ee0.J(r8)
            goto L5d
        L11:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r7)
            return r2
        L17:
            defpackage.ee0.J(r8)
            goto L30
        L1b:
            defpackage.ee0.J(r8)
            kotlinx.coroutines.NonCancellable r8 = kotlinx.coroutines.NonCancellable.INSTANCE
            com.vincenthzr.locationspoofer.data.cloud.RuntimeOperationCoordinator$launch$job$1$1$1 r1 = new com.vincenthzr.locationspoofer.data.cloud.RuntimeOperationCoordinator$launch$job$1$1$1
            java.util.List<kotlinx.coroutines.Job> r5 = r7.$previous
            r1.<init>(r5, r2)
            r7.label = r4
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r8, r1, r7)
            if (r8 != r0) goto L30
            goto L5c
        L30:
            y70 r8 = r7.getContext()
            kotlinx.coroutines.JobKt.ensureActive(r8)
            com.vincenthzr.locationspoofer.data.cloud.RuntimeOperationCoordinator r8 = r7.this$0
            java.lang.Object r8 = com.vincenthzr.locationspoofer.data.cloud.RuntimeOperationCoordinator.access$getLock$p(r8)
            com.vincenthzr.locationspoofer.data.cloud.RuntimeOperationCoordinator r1 = r7.this$0
            long r5 = r7.$version
            monitor-enter(r8)
            long r1 = com.vincenthzr.locationspoofer.data.cloud.RuntimeOperationCoordinator.access$getEpoch$p(r1)     // Catch: java.lang.Throwable -> L60
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 == 0) goto L4b
            goto L4c
        L4b:
            r4 = 0
        L4c:
            monitor-exit(r8)
            if (r4 == 0) goto L52
            mf3 r7 = defpackage.mf3.a
            return r7
        L52:
            lu0 r8 = r7.$block
            r7.label = r3
            java.lang.Object r7 = r8.invoke(r7)
            if (r7 != r0) goto L5d
        L5c:
            return r0
        L5d:
            mf3 r7 = defpackage.mf3.a
            return r7
        L60:
            r7 = move-exception
            monitor-exit(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vincenthzr.locationspoofer.data.cloud.RuntimeOperationCoordinator$launch$job$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
