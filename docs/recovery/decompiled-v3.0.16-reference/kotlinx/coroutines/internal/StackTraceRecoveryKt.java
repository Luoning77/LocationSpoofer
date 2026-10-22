package kotlinx.coroutines.internal;

import defpackage.a80;
import defpackage.i52;
import defpackage.o51;
import defpackage.oq;
import defpackage.q60;
import defpackage.s13;
import defpackage.wg2;
import defpackage.xg2;
import defpackage.ym3;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class StackTraceRecoveryKt {
    private static final StackTraceElement ARTIFICIAL_FRAME = ym3.r(new Exception(), ym3.class.getSimpleName());
    private static final String baseContinuationImplClass = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
    private static final String baseContinuationImplClassName;
    private static final String stackTraceRecoveryClass = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
    private static final String stackTraceRecoveryClassName;

    static {
        Object wg2Var;
        Object wg2Var2;
        try {
            wg2Var = oq.class.getCanonicalName();
        } catch (Throwable th) {
            wg2Var = new wg2(th);
        }
        if (xg2.a(wg2Var) != null) {
            wg2Var = baseContinuationImplClass;
        }
        baseContinuationImplClassName = (String) wg2Var;
        try {
            wg2Var2 = StackTraceRecoveryKt.class.getCanonicalName();
        } catch (Throwable th2) {
            wg2Var2 = new wg2(th2);
        }
        if (xg2.a(wg2Var2) != null) {
            wg2Var2 = stackTraceRecoveryClass;
        }
        stackTraceRecoveryClassName = (String) wg2Var2;
    }

    private static final <E extends Throwable> i52 causeAndStacktrace(E e) {
        Throwable cause = e.getCause();
        if (cause == null || !cause.getClass().equals(e.getClass())) {
            return new i52(e, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e.getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (isArtificial(stackTraceElement)) {
                return new i52(cause, stackTrace);
            }
        }
        return new i52(e, new StackTraceElement[0]);
    }

    private static final <E extends Throwable> E createFinalException(E e, E e2, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(ARTIFICIAL_FRAME);
        StackTraceElement[] stackTrace = e.getStackTrace();
        int iFirstFrameIndex = firstFrameIndex(stackTrace, baseContinuationImplClassName);
        int i = 0;
        if (iFirstFrameIndex == -1) {
            e2.setStackTrace((StackTraceElement[]) arrayDeque.toArray(new StackTraceElement[0]));
            return e2;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + iFirstFrameIndex];
        for (int i2 = 0; i2 < iFirstFrameIndex; i2++) {
            stackTraceElementArr[i2] = stackTrace[i2];
        }
        Iterator<T> it = arrayDeque.iterator();
        while (it.hasNext()) {
            stackTraceElementArr[i + iFirstFrameIndex] = (StackTraceElement) it.next();
            i++;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    private static final ArrayDeque<StackTraceElement> createStackTrace(a80 a80Var) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = a80Var.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            a80Var = a80Var.getCallerFrame();
            if (a80Var == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = a80Var.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    private static final boolean elementWiseEquals(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && o51.f(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && o51.f(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && o51.f(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    private static final int firstFrameIndex(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (o51.f(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }

    public static final void initCause(Throwable th, Throwable th2) {
        th.initCause(th2);
    }

    public static final boolean isArtificial(StackTraceElement stackTraceElement) {
        return s13.Z(stackTraceElement.getClassName(), "_COROUTINE", false);
    }

    private static final void mergeRecoveredTraces(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (isArtificial(stackTraceElementArr[i])) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i2 > length2) {
            return;
        }
        while (true) {
            if (elementWiseEquals(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i2) {
                return;
            } else {
                length2--;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> E recoverFromStackFrame(E e, a80 a80Var) {
        i52 i52VarCauseAndStacktrace = causeAndStacktrace(e);
        Throwable th = (Throwable) i52VarCauseAndStacktrace.e;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) i52VarCauseAndStacktrace.f;
        Throwable thTryCopyException = ExceptionsConstructorKt.tryCopyException(th);
        if (thTryCopyException != null) {
            ArrayDeque<StackTraceElement> arrayDequeCreateStackTrace = createStackTrace(a80Var);
            if (!arrayDequeCreateStackTrace.isEmpty()) {
                if (th != e) {
                    mergeRecoveredTraces(stackTraceElementArr, arrayDequeCreateStackTrace);
                }
                return (E) createFinalException(th, thTryCopyException, arrayDequeCreateStackTrace);
            }
        }
        return e;
    }

    private static final <E extends Throwable> E sanitizeStackTrace(E e) {
        StackTraceElement[] stackTrace = e.getStackTrace();
        int length = stackTrace.length;
        int length2 = stackTrace.length - 1;
        if (length2 < 0) {
            length2 = -1;
            break;
        }
        while (true) {
            int i = length2 - 1;
            if (o51.f(stackTraceRecoveryClassName, stackTrace[length2].getClassName())) {
                break;
            }
            if (i < 0) {
                length2 = -1;
                break;
            }
            length2 = i;
        }
        int i2 = length2 + 1;
        int iFirstFrameIndex = firstFrameIndex(stackTrace, baseContinuationImplClassName);
        int i3 = 0;
        int i4 = (length - length2) - (iFirstFrameIndex == -1 ? 0 : length - iFirstFrameIndex);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i4];
        while (i3 < i4) {
            stackTraceElementArr[i3] = i3 == 0 ? ARTIFICIAL_FRAME : stackTrace[(i2 + i3) - 1];
            i3++;
        }
        e.setStackTrace(stackTraceElementArr);
        return e;
    }

    public static final <E extends Throwable> E unwrapImpl(E e) {
        E e2 = (E) e.getCause();
        if (e2 != null && e2.getClass().equals(e.getClass())) {
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                if (isArtificial(stackTraceElement)) {
                    return e2;
                }
            }
        }
        return e;
    }

    public static final <E extends Throwable> E recoverStackTrace(E e, q60 q60Var) {
        return e;
    }

    public static final <E extends Throwable> E recoverStackTrace(E e) {
        return e;
    }

    public static final <E extends Throwable> E unwrap(E e) {
        return e;
    }

    public static final Object recoverAndThrow(Throwable th, q60 q60Var) throws Throwable {
        throw th;
    }

    private static final Object recoverAndThrow$$forInline(Throwable th, q60 q60Var) throws Throwable {
        throw th;
    }
}
