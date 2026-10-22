package kotlinx.coroutines.internal;

import defpackage.lu0;
import defpackage.vd0;
import defpackage.y70;
import java.lang.reflect.InvocationTargetException;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class OnUndeliveredElementKt {
    public static final <E> void callUndeliveredElement(lu0 lu0Var, E e, y70 y70Var) throws IllegalAccessException, InvocationTargetException {
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException = callUndeliveredElementCatchingException(lu0Var, e, null);
        if (undeliveredElementExceptionCallUndeliveredElementCatchingException != null) {
            CoroutineExceptionHandlerKt.handleCoroutineException(y70Var, undeliveredElementExceptionCallUndeliveredElementCatchingException);
        }
    }

    public static final <E> UndeliveredElementException callUndeliveredElementCatchingException(lu0 lu0Var, E e, UndeliveredElementException undeliveredElementException) throws IllegalAccessException, InvocationTargetException {
        try {
            lu0Var.invoke(e);
            return undeliveredElementException;
        } catch (Throwable th) {
            if (undeliveredElementException != null && undeliveredElementException.getCause() != th) {
                vd0.d(undeliveredElementException, th);
                return undeliveredElementException;
            }
            return new UndeliveredElementException("Exception in undelivered element handler for " + e, th);
        }
    }

    public static /* synthetic */ UndeliveredElementException callUndeliveredElementCatchingException$default(lu0 lu0Var, Object obj, UndeliveredElementException undeliveredElementException, int i, Object obj2) {
        if ((i & 2) != 0) {
            undeliveredElementException = null;
        }
        return callUndeliveredElementCatchingException(lu0Var, obj, undeliveredElementException);
    }
}
