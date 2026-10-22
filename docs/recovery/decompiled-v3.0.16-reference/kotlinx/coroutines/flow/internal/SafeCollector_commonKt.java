package kotlinx.coroutines.flow.internal;

import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.r60;
import defpackage.s5;
import defpackage.w70;
import defpackage.x70;
import defpackage.y70;
import defpackage.z70;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SafeCollector_commonKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.SafeCollector_commonKt$unsafeFlow$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class AnonymousClass1<T> implements Flow<T> {
        final /* synthetic */ pu0 $block;

        public AnonymousClass1(pu0 pu0Var) {
            this.$block = pu0Var;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super T> flowCollector, q60 q60Var) {
            Object objInvoke = this.$block.invoke(flowCollector, q60Var);
            return objInvoke == z70.e ? objInvoke : mf3.a;
        }

        public Object collect$$forInline(FlowCollector<? super T> flowCollector, final q60 q60Var) {
            new r60(q60Var) { // from class: kotlinx.coroutines.flow.internal.SafeCollector_commonKt$unsafeFlow$1$collect$1
                int label;
                /* synthetic */ Object result;

                @Override // defpackage.oq
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.collect(null, this);
                }
            };
            this.$block.invoke(flowCollector, q60Var);
            return mf3.a;
        }
    }

    public static final void checkContext(SafeCollector<?> safeCollector, y70 y70Var) {
        if (((Number) y70Var.fold(0, new s5(safeCollector, 23))).intValue() == safeCollector.collectContextSize) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + safeCollector.collectContext + ",\n\t\tbut emission happened in " + y70Var + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int checkContext$lambda$0(SafeCollector safeCollector, int i, w70 w70Var) {
        x70 key = w70Var.getKey();
        w70 w70Var2 = safeCollector.collectContext.get(key);
        if (key != Job.Key) {
            if (w70Var != w70Var2) {
                return Integer.MIN_VALUE;
            }
            return i + 1;
        }
        Job job = (Job) w70Var2;
        Job jobTransitiveCoroutineParent = transitiveCoroutineParent((Job) w70Var, job);
        if (jobTransitiveCoroutineParent == job) {
            return job == null ? i : i + 1;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + jobTransitiveCoroutineParent + ", expected child of " + job + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }

    public static final Job transitiveCoroutineParent(Job job, Job job2) {
        while (job != null) {
            if (job == job2 || !(job instanceof ScopeCoroutine)) {
                return job;
            }
            job = ((ScopeCoroutine) job).getParent();
        }
        return null;
    }

    public static final <T> Flow<T> unsafeFlow(pu0 pu0Var) {
        return new AnonymousClass1(pu0Var);
    }
}
