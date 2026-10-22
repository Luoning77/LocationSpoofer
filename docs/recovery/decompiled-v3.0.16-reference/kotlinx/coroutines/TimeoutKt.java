package kotlinx.coroutines;

import defpackage.ah0;
import defpackage.c30;
import defpackage.dh0;
import defpackage.ee0;
import defpackage.fh0;
import defpackage.fo;
import defpackage.pu0;
import defpackage.q60;
import defpackage.r60;
import defpackage.s90;
import defpackage.we2;
import defpackage.z70;
import kotlinx.coroutines.intrinsics.UndispatchedKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class TimeoutKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", l = {102}, m = "withTimeoutOrNull")
    public static final class AnonymousClass1<T> extends r60 {
        long J$0;
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
            return TimeoutKt.withTimeoutOrNull(0L, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Instruction removed from duplicated block: B:9:0x0018, please report this as an issue */
    public static final TimeoutCancellationException TimeoutCancellationException(long j, Delay delay, Job job) {
        String strM23timeoutMessageLRDsOJo;
        DelayWithTimeoutDiagnostics delayWithTimeoutDiagnostics = delay instanceof DelayWithTimeoutDiagnostics ? (DelayWithTimeoutDiagnostics) delay : null;
        if (delayWithTimeoutDiagnostics != null) {
            c30 c30Var = ah0.f;
            strM23timeoutMessageLRDsOJo = delayWithTimeoutDiagnostics.m23timeoutMessageLRDsOJo(dh0.L(j, fh0.MILLISECONDS));
            if (strM23timeoutMessageLRDsOJo == null) {
                strM23timeoutMessageLRDsOJo = "Timed out waiting for " + j + " ms";
            }
        } else {
            strM23timeoutMessageLRDsOJo = "Timed out waiting for " + j + " ms";
        }
        return new TimeoutCancellationException(strM23timeoutMessageLRDsOJo, job);
    }

    private static final <U, T extends U> Object setupTimeout(TimeoutCoroutine<U, ? super T> timeoutCoroutine, pu0 pu0Var) {
        JobKt.disposeOnCompletion(timeoutCoroutine, DelayKt.getDelay(timeoutCoroutine.uCont.getContext()).invokeOnTimeout(timeoutCoroutine.time, timeoutCoroutine, timeoutCoroutine.getContext()));
        return UndispatchedKt.startUndispatchedOrReturnIgnoreTimeout(timeoutCoroutine, timeoutCoroutine, pu0Var);
    }

    public static final <T> Object withTimeout(long j, pu0 pu0Var, q60 q60Var) {
        if (j <= 0) {
            throw new TimeoutCancellationException("Timed out immediately");
        }
        Object obj = setupTimeout(new TimeoutCoroutine(j, q60Var), pu0Var);
        if (obj == z70.e) {
            q60Var.getClass();
        }
        return obj;
    }

    /* JADX INFO: renamed from: withTimeout-KLykuaI, reason: not valid java name */
    public static final <T> Object m30withTimeoutKLykuaI(long j, pu0 pu0Var, q60 q60Var) {
        return withTimeout(DelayKt.m22toDelayMillisLRDsOJo(j), pu0Var, q60Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object withTimeoutOrNull(long j, pu0 pu0Var, q60 q60Var) {
        AnonymousClass1 anonymousClass1;
        we2 we2Var;
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
            if (j <= 0) {
                return null;
            }
            we2 we2Var2 = new we2();
            try {
                anonymousClass1.L$0 = pu0Var;
                anonymousClass1.L$1 = we2Var2;
                anonymousClass1.J$0 = j;
                anonymousClass1.label = 1;
                TimeoutCoroutine timeoutCoroutine = new TimeoutCoroutine(j, anonymousClass1);
                we2Var2.e = timeoutCoroutine;
                Object obj2 = setupTimeout(timeoutCoroutine, pu0Var);
                z70 z70Var = z70.e;
                return obj2 == z70Var ? z70Var : obj2;
            } catch (TimeoutCancellationException e) {
                e = e;
                we2Var = we2Var2;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            we2Var = (we2) anonymousClass1.L$1;
            try {
                ee0.J(obj);
                return obj;
            } catch (TimeoutCancellationException e2) {
                e = e2;
            }
        }
        if (e.coroutine == we2Var.e) {
            return null;
        }
        throw e;
    }

    /* JADX INFO: renamed from: withTimeoutOrNull-KLykuaI, reason: not valid java name */
    public static final <T> Object m31withTimeoutOrNullKLykuaI(long j, pu0 pu0Var, q60 q60Var) {
        return withTimeoutOrNull(DelayKt.m22toDelayMillisLRDsOJo(j), pu0Var, q60Var);
    }
}
