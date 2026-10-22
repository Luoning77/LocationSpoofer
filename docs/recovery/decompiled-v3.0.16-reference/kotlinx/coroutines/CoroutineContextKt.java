package kotlinx.coroutines;

import defpackage.a80;
import defpackage.au0;
import defpackage.j9;
import defpackage.q60;
import defpackage.sj0;
import defpackage.ty;
import defpackage.v70;
import defpackage.w70;
import defpackage.we2;
import defpackage.y70;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CoroutineContextKt {
    private static final String DEBUG_THREAD_NAME_SEPARATOR = " @";

    private static final y70 foldCopies(y70 y70Var, y70 y70Var2, boolean z) {
        boolean zHasCopyableElements = hasCopyableElements(y70Var);
        boolean zHasCopyableElements2 = hasCopyableElements(y70Var2);
        if (!zHasCopyableElements && !zHasCopyableElements2) {
            return y70Var.plus(y70Var2);
        }
        we2 we2Var = new we2();
        we2Var.e = y70Var2;
        int i = 2;
        ty tyVar = new ty(we2Var, z, i);
        sj0 sj0Var = sj0.e;
        y70 y70Var3 = (y70) y70Var.fold(sj0Var, tyVar);
        if (zHasCopyableElements2) {
            we2Var.e = ((y70) we2Var.e).fold(sj0Var, new v70(i, (byte) 0));
        }
        return y70Var3.plus((y70) we2Var.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y70 foldCopies$lambda$1(we2 we2Var, boolean z, y70 y70Var, w70 w70Var) {
        if (!(w70Var instanceof CopyableThreadContextElement)) {
            return y70Var.plus(w70Var);
        }
        w70 w70Var2 = ((y70) we2Var.e).get(w70Var.getKey());
        if (w70Var2 == null) {
            return y70Var.plus(z ? ((CopyableThreadContextElement) w70Var).copyForChild() : (CopyableThreadContextElement) w70Var);
        }
        we2Var.e = ((y70) we2Var.e).minusKey(w70Var.getKey());
        return y70Var.plus(((CopyableThreadContextElement) w70Var).mergeForChild(w70Var2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y70 foldCopies$lambda$2(y70 y70Var, w70 w70Var) {
        return w70Var instanceof CopyableThreadContextElement ? y70Var.plus(((CopyableThreadContextElement) w70Var).copyForChild()) : y70Var.plus(w70Var);
    }

    public static final String getCoroutineName(y70 y70Var) {
        return null;
    }

    private static final boolean hasCopyableElements(y70 y70Var) {
        return ((Boolean) y70Var.fold(Boolean.FALSE, new v70(1, (byte) 0))).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasCopyableElements$lambda$0(boolean z, w70 w70Var) {
        return z || (w70Var instanceof CopyableThreadContextElement);
    }

    public static final y70 newCoroutineContext(CoroutineScope coroutineScope, y70 y70Var) {
        y70 y70VarFoldCopies = foldCopies(coroutineScope.getCoroutineContext(), y70Var, true);
        return (y70VarFoldCopies == Dispatchers.getDefault() || y70VarFoldCopies.get(j9.B) != null) ? y70VarFoldCopies : y70VarFoldCopies.plus(Dispatchers.getDefault());
    }

    public static final UndispatchedCoroutine<?> undispatchedCompletion(a80 a80Var) {
        while (!(a80Var instanceof DispatchedCoroutine) && (a80Var = a80Var.getCallerFrame()) != null) {
            if (a80Var instanceof UndispatchedCoroutine) {
                return (UndispatchedCoroutine) a80Var;
            }
        }
        return null;
    }

    public static final UndispatchedCoroutine<?> updateUndispatchedCompletion(q60 q60Var, y70 y70Var, Object obj) {
        if (!(q60Var instanceof a80) || y70Var.get(UndispatchedMarker.INSTANCE) == null) {
            return null;
        }
        UndispatchedCoroutine<?> undispatchedCoroutineUndispatchedCompletion = undispatchedCompletion((a80) q60Var);
        if (undispatchedCoroutineUndispatchedCompletion != null) {
            undispatchedCoroutineUndispatchedCompletion.saveThreadContext(y70Var, obj);
        }
        return undispatchedCoroutineUndispatchedCompletion;
    }

    public static final <T> T withContinuationContext(q60 q60Var, Object obj, au0 au0Var) {
        boolean zClearThreadContext;
        y70 context = q60Var.getContext();
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context, obj);
        UndispatchedCoroutine<?> undispatchedCoroutineUpdateUndispatchedCompletion = objUpdateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? updateUndispatchedCompletion(q60Var, context, objUpdateThreadContext) : null;
        try {
            T t = (T) au0Var.invoke();
            if (undispatchedCoroutineUpdateUndispatchedCompletion != null) {
                if (!zClearThreadContext) {
                    return t;
                }
            }
            return t;
        } finally {
            if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
            }
        }
    }

    public static final <T> T withCoroutineContext(y70 y70Var, Object obj, au0 au0Var) {
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(y70Var, obj);
        try {
            return (T) au0Var.invoke();
        } finally {
            ThreadContextKt.restoreThreadContext(y70Var, objUpdateThreadContext);
        }
    }

    public static final y70 newCoroutineContext(y70 y70Var, y70 y70Var2) {
        return !hasCopyableElements(y70Var2) ? y70Var.plus(y70Var2) : foldCopies(y70Var, y70Var2, false);
    }
}
