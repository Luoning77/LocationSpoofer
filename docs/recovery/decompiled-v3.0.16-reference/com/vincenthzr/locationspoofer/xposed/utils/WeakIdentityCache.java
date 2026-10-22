package com.vincenthzr.locationspoofer.xposed.utils;

import defpackage.au0;
import defpackage.ca0;
import defpackage.da0;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class WeakIdentityCache<T> {
    private final ReferenceQueue<Object> queue = new ReferenceQueue<>();
    private final HashMap<Key, T> values = new HashMap<>();

    private final void clean() {
        while (true) {
            HashMap<Key, T> map = this.values;
            Reference<? extends Object> referencePoll = this.queue.poll();
            if (referencePoll == null) {
                return;
            } else {
                da0.l(map).remove(referencePoll);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized T get(Object obj) {
        obj.getClass();
        clean();
        return this.values.get(new Key(obj, null, 2, 0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized T getOrCreate(Object obj, au0 au0Var) {
        T t;
        obj.getClass();
        au0Var.getClass();
        clean();
        t = this.values.get(new Key(obj, null, 2, 0 == true ? 1 : 0));
        if (t == null) {
            t = (T) au0Var.invoke();
            this.values.put(new Key(obj, this.queue), t);
        }
        return t;
    }

    public final synchronized void put(Object obj, T t) {
        obj.getClass();
        clean();
        this.values.put(new Key(obj, this.queue), t);
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Key extends WeakReference<Object> {
        private final int identityHash;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Key(Object obj, ReferenceQueue<Object> referenceQueue) {
            super(obj, referenceQueue);
            obj.getClass();
            this.identityHash = System.identityHashCode(obj);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Key) && get() != null && get() == ((Key) obj).get();
            }
            return true;
        }

        public int hashCode() {
            return this.identityHash;
        }

        public /* synthetic */ Key(Object obj, ReferenceQueue referenceQueue, int i, ca0 ca0Var) {
            this(obj, (i & 2) != 0 ? null : referenceQueue);
        }
    }
}
