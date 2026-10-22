package kotlinx.coroutines.internal;

import defpackage.y70;
import kotlinx.coroutines.ThreadContextElement;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class ThreadState {
    public final y70 context;
    private final ThreadContextElement<Object>[] elements;
    private int i;
    private final Object[] values;

    public ThreadState(y70 y70Var, int i) {
        this.context = y70Var;
        this.values = new Object[i];
        this.elements = new ThreadContextElement[i];
    }

    public final void append(ThreadContextElement<?> threadContextElement, Object obj) {
        Object[] objArr = this.values;
        int i = this.i;
        objArr[i] = obj;
        ThreadContextElement<Object>[] threadContextElementArr = this.elements;
        this.i = i + 1;
        threadContextElement.getClass();
        threadContextElementArr[i] = threadContextElement;
    }

    public final void restore(y70 y70Var) {
        int length = this.elements.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            ThreadContextElement<Object> threadContextElement = this.elements[length];
            threadContextElement.getClass();
            threadContextElement.restoreThreadContext(y70Var, this.values[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
