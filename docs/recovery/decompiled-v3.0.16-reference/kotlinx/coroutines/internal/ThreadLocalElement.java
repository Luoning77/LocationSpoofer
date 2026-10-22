package kotlinx.coroutines.internal;

import defpackage.o51;
import defpackage.pu0;
import defpackage.sj0;
import defpackage.w70;
import defpackage.x70;
import defpackage.y70;
import kotlinx.coroutines.ThreadContextElement;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ThreadLocalElement<T> implements ThreadContextElement<T> {
    private final x70 key;
    private final ThreadLocal<T> threadLocal;
    private final T value;

    public ThreadLocalElement(T t, ThreadLocal<T> threadLocal) {
        this.value = t;
        this.threadLocal = threadLocal;
        this.key = new ThreadLocalKey(threadLocal);
    }

    @Override // kotlinx.coroutines.ThreadContextElement, defpackage.y70
    public <R> R fold(R r, pu0 pu0Var) {
        return (R) ThreadContextElement.DefaultImpls.fold(this, r, pu0Var);
    }

    @Override // kotlinx.coroutines.ThreadContextElement, defpackage.y70
    public <E extends w70> E get(x70 x70Var) {
        if (o51.f(getKey(), x70Var)) {
            return this;
        }
        return null;
    }

    @Override // kotlinx.coroutines.ThreadContextElement, defpackage.w70
    public x70 getKey() {
        return this.key;
    }

    @Override // kotlinx.coroutines.ThreadContextElement, defpackage.y70
    public y70 minusKey(x70 x70Var) {
        return o51.f(getKey(), x70Var) ? sj0.e : this;
    }

    @Override // kotlinx.coroutines.ThreadContextElement, defpackage.y70
    public y70 plus(y70 y70Var) {
        return ThreadContextElement.DefaultImpls.plus(this, y70Var);
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public void restoreThreadContext(y70 y70Var, T t) {
        this.threadLocal.set(t);
    }

    public String toString() {
        return "ThreadLocal(value=" + this.value + ", threadLocal = " + this.threadLocal + ')';
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public T updateThreadContext(y70 y70Var) {
        T t = this.threadLocal.get();
        this.threadLocal.set(this.value);
        return t;
    }
}
