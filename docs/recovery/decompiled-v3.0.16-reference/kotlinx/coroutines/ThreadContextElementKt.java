package kotlinx.coroutines;

import defpackage.mf3;
import defpackage.q60;
import defpackage.y70;
import kotlinx.coroutines.internal.ThreadLocalElement;
import kotlinx.coroutines.internal.ThreadLocalKey;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ThreadContextElementKt {
    public static final <T> ThreadContextElement<T> asContextElement(ThreadLocal<T> threadLocal, T t) {
        return new ThreadLocalElement(t, threadLocal);
    }

    public static /* synthetic */ ThreadContextElement asContextElement$default(ThreadLocal threadLocal, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = threadLocal.get();
        }
        return asContextElement(threadLocal, obj);
    }

    public static final Object ensurePresent(ThreadLocal<?> threadLocal, q60 q60Var) {
        if (q60Var.getContext().get(new ThreadLocalKey(threadLocal)) != null) {
            return mf3.a;
        }
        StringBuilder sb = new StringBuilder("ThreadLocal ");
        sb.append(threadLocal);
        y70 context = q60Var.getContext();
        sb.append(" is missing from context ");
        sb.append(context);
        throw new IllegalStateException(sb.toString().toString());
    }

    private static final Object ensurePresent$$forInline(ThreadLocal<?> threadLocal, q60 q60Var) {
        throw null;
    }

    public static final Object isPresent(ThreadLocal<?> threadLocal, q60 q60Var) {
        return Boolean.valueOf(q60Var.getContext().get(new ThreadLocalKey(threadLocal)) != null);
    }

    private static final Object isPresent$$forInline(ThreadLocal<?> threadLocal, q60 q60Var) {
        throw null;
    }
}
