package kotlinx.coroutines;

import defpackage.ah0;
import defpackage.b81;
import defpackage.c30;
import defpackage.dh0;
import defpackage.ee0;
import defpackage.fh0;
import defpackage.fo;
import defpackage.hd0;
import defpackage.j9;
import defpackage.mf3;
import defpackage.q60;
import defpackage.r60;
import defpackage.s90;
import defpackage.w70;
import defpackage.y70;
import defpackage.z70;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class DelayKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.DelayKt$awaitCancellation$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", l = {160}, m = "awaitCancellation")
    public static final class AnonymousClass1 extends r60 {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DelayKt.awaitCancellation(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object awaitCancellation(q60 q60Var) {
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
        Object obj = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ee0.J(obj);
            anonymousClass1.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(hd0.G(anonymousClass1), 1);
            cancellableContinuationImpl.initCancellability();
            Object result = cancellableContinuationImpl.getResult();
            z70 z70Var = z70.e;
            if (result == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(obj);
        }
        fo.d();
        return null;
    }

    public static final Object delay(long j, q60 q60Var) {
        mf3 mf3Var = mf3.a;
        if (j <= 0) {
            return mf3Var;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(hd0.G(q60Var), 1);
        cancellableContinuationImpl.initCancellability();
        if (j < Long.MAX_VALUE) {
            getDelay(cancellableContinuationImpl.getContext()).mo91scheduleResumeAfterDelay(j, cancellableContinuationImpl);
        }
        Object result = cancellableContinuationImpl.getResult();
        return result == z70.e ? result : mf3Var;
    }

    /* JADX INFO: renamed from: delay-VtjQ1oo, reason: not valid java name */
    public static final Object m21delayVtjQ1oo(long j, q60 q60Var) {
        Object objDelay = delay(m22toDelayMillisLRDsOJo(j), q60Var);
        return objDelay == z70.e ? objDelay : mf3.a;
    }

    public static final Delay getDelay(y70 y70Var) {
        w70 w70Var = y70Var.get(j9.B);
        Delay delay = w70Var instanceof Delay ? (Delay) w70Var : null;
        return delay == null ? DefaultExecutorKt.getDefaultDelay() : delay;
    }

    /* JADX INFO: renamed from: toDelayMillis-LRDsOJo, reason: not valid java name */
    public static final long m22toDelayMillisLRDsOJo(long j) {
        c30 c30Var = ah0.f;
        boolean z = j > 0;
        if (z) {
            return ah0.d(ah0.g(j, dh0.L(999999L, fh0.NANOSECONDS)));
        }
        if (!z) {
            return 0L;
        }
        b81.d();
        return 0L;
    }
}
