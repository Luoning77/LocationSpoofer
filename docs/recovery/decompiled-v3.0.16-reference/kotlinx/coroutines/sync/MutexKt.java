package kotlinx.coroutines.sync;

import defpackage.au0;
import defpackage.ee0;
import defpackage.fo;
import defpackage.q60;
import defpackage.r60;
import defpackage.s90;
import defpackage.z70;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class MutexKt {
    private static final int HOLDS_LOCK_ANOTHER_OWNER = 2;
    private static final int HOLDS_LOCK_UNLOCKED = 0;
    private static final int HOLDS_LOCK_YES = 1;
    private static final Symbol NO_OWNER = new Symbol("NO_OWNER");
    private static final Symbol ON_LOCK_ALREADY_LOCKED_BY_OWNER = new Symbol("ALREADY_LOCKED_BY_OWNER");
    private static final int TRY_LOCK_ALREADY_LOCKED_BY_OWNER = 2;
    private static final int TRY_LOCK_FAILED = 1;
    private static final int TRY_LOCK_SUCCESS = 0;

    /* JADX INFO: renamed from: kotlinx.coroutines.sync.MutexKt$withLock$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.sync.MutexKt", f = "Mutex.kt", l = {121}, m = "withLock")
    public static final class AnonymousClass1<T> extends r60 {
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
            return MutexKt.withLock(null, null, null, this);
        }
    }

    public static final Mutex Mutex(boolean z) {
        return new MutexImpl(z);
    }

    public static /* synthetic */ Mutex Mutex$default(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return Mutex(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object withLock(Mutex mutex, Object obj, au0 au0Var, q60 q60Var) {
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
            anonymousClass1.L$0 = mutex;
            anonymousClass1.L$1 = obj;
            anonymousClass1.L$2 = au0Var;
            anonymousClass1.label = 1;
            Object objLock = mutex.lock(obj, anonymousClass1);
            z70 z70Var = z70.e;
            if (objLock == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            au0Var = (au0) anonymousClass1.L$2;
            obj = anonymousClass1.L$1;
            mutex = (Mutex) anonymousClass1.L$0;
            ee0.J(obj2);
        }
        try {
            return au0Var.invoke();
        } finally {
            mutex.unlock(obj);
        }
    }

    private static final <T> Object withLock$$forInline(Mutex mutex, Object obj, au0 au0Var, q60 q60Var) {
        mutex.lock(obj, q60Var);
        try {
            return au0Var.invoke();
        } finally {
            mutex.unlock(obj);
        }
    }

    public static Object withLock$default(Mutex mutex, Object obj, au0 au0Var, q60 q60Var, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        mutex.lock(obj, q60Var);
        try {
            return au0Var.invoke();
        } finally {
            mutex.unlock(obj);
        }
    }
}
