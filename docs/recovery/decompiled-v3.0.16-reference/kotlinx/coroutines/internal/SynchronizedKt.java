package kotlinx.coroutines.internal;

import defpackage.au0;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SynchronizedKt {
    public static final <T> T synchronizedImpl(Object obj, au0 au0Var) {
        T t;
        synchronized (obj) {
            t = (T) au0Var.invoke();
        }
        return t;
    }

    public static /* synthetic */ void SynchronizedObject$annotations() {
    }
}
