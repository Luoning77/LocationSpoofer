package kotlinx.coroutines.internal;

import defpackage.pu0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class Concurrent_commonKt {
    public static final <T> T getValue(AtomicReference<T> atomicReference) {
        return atomicReference.get();
    }

    public static final <T> void loop(AtomicReference<T> atomicReference, pu0 pu0Var) {
        while (true) {
            pu0Var.invoke(atomicReference, getValue(atomicReference));
        }
    }

    public static final <T> void setValue(AtomicReference<T> atomicReference, T t) {
        atomicReference.set(t);
    }

    public static /* synthetic */ void getValue$annotations(AtomicReference atomicReference) {
    }
}
