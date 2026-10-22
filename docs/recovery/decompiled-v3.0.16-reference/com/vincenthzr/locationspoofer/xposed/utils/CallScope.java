package com.vincenthzr.locationspoofer.xposed.utils;

import defpackage.au0;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CallScope<T> {
    private final ThreadLocal<T> value = new ThreadLocal<>();

    public final T getCurrent() {
        return this.value.get();
    }

    public final <R> R withValue(T t, au0 au0Var) {
        au0Var.getClass();
        T t2 = this.value.get();
        ThreadLocal<T> threadLocal = this.value;
        if (t == null) {
            threadLocal.remove();
        } else {
            threadLocal.set(t);
        }
        try {
            R r = (R) au0Var.invoke();
        } finally {
            ThreadLocal<T> threadLocal2 = this.value;
            if (t2 == null) {
                threadLocal2.remove();
            } else {
                threadLocal2.set(t2);
            }
        }
    }
}
