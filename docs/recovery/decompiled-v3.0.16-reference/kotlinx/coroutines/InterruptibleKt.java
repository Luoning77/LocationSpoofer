package kotlinx.coroutines;

import defpackage.au0;
import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s90;
import defpackage.sj0;
import defpackage.y70;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class InterruptibleKt {
    private static final int FINISHED = 1;
    private static final int INTERRUPTED = 3;
    private static final int INTERRUPTING = 2;
    private static final int WORKING = 0;

    /* JADX INFO: renamed from: kotlinx.coroutines.InterruptibleKt$runInterruptible$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends k33 implements pu0 {
        final /* synthetic */ au0 $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(au0 au0Var, q60 q60Var) {
            super(2, q60Var);
            this.$block = au0Var;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, q60Var);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.pu0
        public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
            return ((AnonymousClass2) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                ee0.J(obj);
                return InterruptibleKt.runInterruptibleInExpectedContext(((CoroutineScope) this.L$0).getCoroutineContext(), this.$block);
            }
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    public static final <T> Object runInterruptible(y70 y70Var, au0 au0Var, q60 q60Var) {
        return BuildersKt.withContext(y70Var, new AnonymousClass2(au0Var, null), q60Var);
    }

    public static /* synthetic */ Object runInterruptible$default(y70 y70Var, au0 au0Var, q60 q60Var, int i, Object obj) {
        if ((i & 1) != 0) {
            y70Var = sj0.e;
        }
        return runInterruptible(y70Var, au0Var, q60Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T runInterruptibleInExpectedContext(y70 y70Var, au0 au0Var) throws Throwable {
        try {
            ThreadState threadState = new ThreadState();
            threadState.setup(JobKt.getJob(y70Var));
            try {
                return (T) au0Var.invoke();
            } finally {
                threadState.clearInterrupt();
            }
        } catch (InterruptedException e) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
        }
    }
}
