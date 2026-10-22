package kotlinx.coroutines.internal;

import defpackage.pu0;
import defpackage.w70;
import defpackage.xm2;
import defpackage.y70;
import kotlinx.coroutines.ThreadContextElement;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ThreadContextKt {
    public static final Symbol NO_THREAD_ELEMENTS = new Symbol("NO_THREAD_ELEMENTS");
    private static final pu0 countAll = new xm2(28);
    private static final pu0 findOne = new xm2(29);
    private static final pu0 updateState = new a();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object countAll$lambda$0(Object obj, w70 w70Var) {
        if (!(w70Var instanceof ThreadContextElement)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? w70Var : Integer.valueOf(iIntValue + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ThreadContextElement<?> findOne$lambda$1(ThreadContextElement<?> threadContextElement, w70 w70Var) {
        if (threadContextElement != null) {
            return threadContextElement;
        }
        if (w70Var instanceof ThreadContextElement) {
            return (ThreadContextElement) w70Var;
        }
        return null;
    }

    public static final void restoreThreadContext(y70 y70Var, Object obj) {
        if (obj == NO_THREAD_ELEMENTS) {
            return;
        }
        if (obj instanceof ThreadState) {
            ((ThreadState) obj).restore(y70Var);
            return;
        }
        Object objFold = y70Var.fold(null, findOne);
        objFold.getClass();
        ((ThreadContextElement) objFold).restoreThreadContext(y70Var, obj);
    }

    public static final Object threadContextElements(y70 y70Var) {
        Object objFold = y70Var.fold(0, countAll);
        objFold.getClass();
        return objFold;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ThreadState updateState$lambda$2(ThreadState threadState, w70 w70Var) {
        if (w70Var instanceof ThreadContextElement) {
            ThreadContextElement<?> threadContextElement = (ThreadContextElement) w70Var;
            threadState.append(threadContextElement, threadContextElement.updateThreadContext(threadState.context));
        }
        return threadState;
    }

    public static final Object updateThreadContext(y70 y70Var, Object obj) {
        if (obj == null) {
            obj = threadContextElements(y70Var);
        }
        if (obj == 0) {
            return NO_THREAD_ELEMENTS;
        }
        if (obj instanceof Integer) {
            return y70Var.fold(new ThreadState(y70Var, ((Number) obj).intValue()), updateState);
        }
        obj.getClass();
        return ((ThreadContextElement) obj).updateThreadContext(y70Var);
    }
}
