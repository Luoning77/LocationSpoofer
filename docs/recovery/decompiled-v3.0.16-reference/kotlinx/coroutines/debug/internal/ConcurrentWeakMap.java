package kotlinx.coroutines.debug.internal;

import defpackage.b81;
import defpackage.ca0;
import defpackage.fo;
import defpackage.g20;
import defpackage.iv;
import defpackage.k0;
import defpackage.l0;
import defpackage.lu0;
import defpackage.o51;
import defpackage.p81;
import defpackage.pu0;
import defpackage.r81;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ConcurrentWeakMap<K, V> extends k0 {
    private static final /* synthetic */ AtomicIntegerFieldUpdater _size$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(ConcurrentWeakMap.class, "_size$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater core$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(ConcurrentWeakMap.class, Object.class, "core$volatile");
    private volatile /* synthetic */ int _size$volatile;
    private volatile /* synthetic */ Object core$volatile;
    private final ReferenceQueue<K> weakRefQueue;

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public final class Core {
        private static final /* synthetic */ AtomicIntegerFieldUpdater load$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(Core.class, "load$volatile");
        private final int allocated;
        private final /* synthetic */ AtomicReferenceArray keys;
        private volatile /* synthetic */ int load$volatile;
        private final int shift;
        private final int threshold;
        private final /* synthetic */ AtomicReferenceArray values;

        /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
        public final class KeyValueIterator<E> implements Iterator<E>, p81 {
            private final pu0 factory;
            private int index = -1;
            private K key;
            private V value;

            public KeyValueIterator(pu0 pu0Var) {
                this.factory = pu0Var;
                findNext();
            }

            private final void findNext() {
                K k;
                while (true) {
                    int i = this.index + 1;
                    this.index = i;
                    if (i >= ((Core) Core.this).allocated) {
                        return;
                    }
                    HashedWeakRef hashedWeakRef = (HashedWeakRef) Core.this.getKeys().get(this.index);
                    if (hashedWeakRef != null && (k = (K) hashedWeakRef.get()) != null) {
                        this.key = k;
                        Object obj = (V) Core.this.getValues().get(this.index);
                        if (obj instanceof Marked) {
                            obj = (V) ((Marked) obj).ref;
                        }
                        if (obj != null) {
                            this.value = (V) obj;
                            return;
                        }
                    }
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < ((Core) Core.this).allocated;
            }

            @Override // java.util.Iterator
            public E next() {
                if (this.index >= ((Core) Core.this).allocated) {
                    b81.p();
                    return null;
                }
                pu0 pu0Var = this.factory;
                K k = this.key;
                if (k == null) {
                    o51.F("key");
                    throw null;
                }
                V v = this.value;
                if (v == null) {
                    o51.F("value");
                    throw null;
                }
                E e = (E) pu0Var.invoke(k, v);
                findNext();
                return e;
            }

            @Override // java.util.Iterator
            public Void remove() {
                ConcurrentWeakMapKt.noImpl();
                throw new iv();
            }
        }

        public Core(int i) {
            this.allocated = i;
            this.shift = Integer.numberOfLeadingZeros(i) + 1;
            this.threshold = (i * 2) / 3;
            this.keys = new AtomicReferenceArray(i);
            this.values = new AtomicReferenceArray(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final /* synthetic */ AtomicReferenceArray getKeys() {
            return this.keys;
        }

        private final /* synthetic */ int getLoad$volatile() {
            return this.load$volatile;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final /* synthetic */ AtomicReferenceArray getValues() {
            return this.values;
        }

        private final int index(int i) {
            return (i * (-1640531527)) >>> this.shift;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object putImpl$default(Core core, Object obj, Object obj2, HashedWeakRef hashedWeakRef, int i, Object obj3) {
            if ((i & 4) != 0) {
                hashedWeakRef = null;
            }
            return core.putImpl(obj, obj2, hashedWeakRef);
        }

        private final void removeCleanedAt(int i) {
            while (true) {
                Object obj = getValues().get(i);
                if (obj == null || (obj instanceof Marked)) {
                    return;
                }
                AtomicReferenceArray values = getValues();
                do {
                    if (values.compareAndSet(i, obj, null)) {
                        ConcurrentWeakMap.this.decrementSize();
                        return;
                    }
                } while (values.get(i) == obj);
            }
        }

        private final /* synthetic */ void setLoad$volatile(int i) {
            this.load$volatile = i;
        }

        private final /* synthetic */ void update$atomicfu$ATOMIC_FIELD_UPDATER$Int(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, lu0 lu0Var) {
            int i;
            do {
                i = atomicIntegerFieldUpdater.get(obj);
            } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i, ((Number) lu0Var.invoke(Integer.valueOf(i))).intValue()));
        }

        public final void cleanWeakRef(HashedWeakRef<?> hashedWeakRef) {
            int iIndex = index(hashedWeakRef.hash);
            while (true) {
                HashedWeakRef<?> hashedWeakRef2 = (HashedWeakRef) getKeys().get(iIndex);
                if (hashedWeakRef2 == null) {
                    return;
                }
                if (hashedWeakRef2 == hashedWeakRef) {
                    removeCleanedAt(iIndex);
                    return;
                } else {
                    if (iIndex == 0) {
                        iIndex = this.allocated;
                    }
                    iIndex--;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final V getImpl(K k) {
            int iIndex = index(k.hashCode());
            while (true) {
                HashedWeakRef hashedWeakRef = (HashedWeakRef) getKeys().get(iIndex);
                if (hashedWeakRef == null) {
                    return null;
                }
                Object obj = hashedWeakRef.get();
                if (k.equals(obj)) {
                    V v = (V) getValues().get(iIndex);
                    return v instanceof Marked ? (V) ((Marked) v).ref : v;
                }
                if (obj == null) {
                    removeCleanedAt(iIndex);
                }
                if (iIndex == 0) {
                    iIndex = this.allocated;
                }
                iIndex--;
            }
        }

        public final <E> Iterator<E> keyValueIterator(pu0 pu0Var) {
            return new KeyValueIterator(pu0Var);
        }

        public final Object putImpl(K k, V v, HashedWeakRef<K> hashedWeakRef) {
            int i;
            int iIndex = index(k.hashCode());
            boolean z = false;
            loop0: while (true) {
                HashedWeakRef hashedWeakRef2 = (HashedWeakRef) getKeys().get(iIndex);
                if (hashedWeakRef2 != null) {
                    Object obj = hashedWeakRef2.get();
                    if (k.equals(obj)) {
                        if (!z) {
                            break;
                        }
                        load$volatile$FU.decrementAndGet(this);
                        break;
                    }
                    if (obj == null) {
                        removeCleanedAt(iIndex);
                    }
                    if (iIndex == 0) {
                        iIndex = this.allocated;
                    }
                    iIndex--;
                } else {
                    if (v == null) {
                        return null;
                    }
                    if (!z) {
                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = load$volatile$FU;
                        do {
                            i = atomicIntegerFieldUpdater.get(this);
                            if (i >= this.threshold) {
                                return ConcurrentWeakMapKt.REHASH;
                            }
                        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1));
                        z = true;
                    }
                    boolean z2 = z;
                    if (hashedWeakRef == null) {
                        hashedWeakRef = new HashedWeakRef<>(k, ((ConcurrentWeakMap) ConcurrentWeakMap.this).weakRefQueue);
                    }
                    HashedWeakRef<K> hashedWeakRef3 = hashedWeakRef;
                    AtomicReferenceArray keys = getKeys();
                    do {
                        if (keys.compareAndSet(iIndex, null, hashedWeakRef3)) {
                            break loop0;
                        }
                    } while (keys.get(iIndex) == null);
                    z = z2;
                    hashedWeakRef = hashedWeakRef3;
                }
            }
            while (true) {
                Object obj2 = getValues().get(iIndex);
                if (obj2 instanceof Marked) {
                    return ConcurrentWeakMapKt.REHASH;
                }
                AtomicReferenceArray values = getValues();
                while (!values.compareAndSet(iIndex, obj2, v)) {
                    if (values.get(iIndex) != obj2) {
                    }
                }
                return obj2;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final ConcurrentWeakMap<K, V>.Core rehash() {
            Object obj;
            while (true) {
                int size = ConcurrentWeakMap.this.size();
                if (size < 4) {
                    size = 4;
                }
                ConcurrentWeakMap<K, V>.Core core = (ConcurrentWeakMap<K, V>.Core) ConcurrentWeakMap.this.new Core(Integer.highestOneBit(size) * 4);
                int i = this.allocated;
                for (int i2 = 0; i2 < i; i2++) {
                    HashedWeakRef hashedWeakRef = (HashedWeakRef) getKeys().get(i2);
                    Object obj2 = hashedWeakRef != null ? hashedWeakRef.get() : null;
                    if (hashedWeakRef != null && obj2 == null) {
                        removeCleanedAt(i2);
                    }
                    while (true) {
                        obj = getValues().get(i2);
                        if (obj instanceof Marked) {
                            obj = ((Marked) obj).ref;
                            break;
                        }
                        AtomicReferenceArray values = getValues();
                        Marked markedMark = ConcurrentWeakMapKt.mark(obj);
                        do {
                            if (values.compareAndSet(i2, obj, markedMark)) {
                                break;
                            }
                        } while (values.get(i2) == obj);
                    }
                    if (obj2 == null || obj == null || core.putImpl(obj2, obj, hashedWeakRef) != ConcurrentWeakMapKt.REHASH) {
                    }
                }
                return core;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Entry<K, V> implements Map.Entry<K, V>, r81 {
        private final K key;
        private final V value;

        public Entry(K k, V v) {
            this.key = k;
            this.value = v;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            ConcurrentWeakMapKt.noImpl();
            throw new iv();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public final class KeyValueSet<E> extends l0 {
        private final pu0 factory;

        public KeyValueSet(pu0 pu0Var) {
            this.factory = pu0Var;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(E e) {
            ConcurrentWeakMapKt.noImpl();
            throw new iv();
        }

        @Override // defpackage.l0
        public int getSize() {
            return ConcurrentWeakMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return ((Core) ConcurrentWeakMap.getCore$volatile$FU().get(ConcurrentWeakMap.this)).keyValueIterator(this.factory);
        }
    }

    public ConcurrentWeakMap(boolean z) {
        this.core$volatile = new Core(16);
        this.weakRefQueue = z ? new ReferenceQueue<>() : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map.Entry _get_entries_$lambda$1(Object obj, Object obj2) {
        return new Entry(obj, obj2);
    }

    private final void cleanWeakRef(HashedWeakRef<?> hashedWeakRef) {
        ((Core) core$volatile$FU.get(this)).cleanWeakRef(hashedWeakRef);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void decrementSize() {
        _size$volatile$FU.decrementAndGet(this);
    }

    private final /* synthetic */ Object getCore$volatile() {
        return this.core$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater getCore$volatile$FU() {
        return core$volatile$FU;
    }

    private final /* synthetic */ int get_size$volatile() {
        return this._size$volatile;
    }

    private final synchronized V putSynchronized(K k, V v) {
        V v2;
        Core coreRehash = (Core) core$volatile$FU.get(this);
        while (true) {
            K k2 = k;
            V v3 = v;
            v2 = (V) Core.putImpl$default(coreRehash, k2, v3, null, 4, null);
            if (v2 == ConcurrentWeakMapKt.REHASH) {
                coreRehash = coreRehash.rehash();
                core$volatile$FU.set(this, coreRehash);
                k = k2;
                v = v3;
            }
        }
        return v2;
    }

    private final /* synthetic */ void setCore$volatile(Object obj) {
        this.core$volatile = obj;
    }

    private final /* synthetic */ void set_size$volatile(int i) {
        this._size$volatile = i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Iterator<Object> it = keySet().iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (V) ((Core) core$volatile$FU.get(this)).getImpl(obj);
    }

    @Override // defpackage.k0
    public Set<Map.Entry<K, V>> getEntries() {
        return new KeyValueSet(new g20(3));
    }

    @Override // defpackage.k0
    public Set<K> getKeys() {
        return new KeyValueSet(new g20(2));
    }

    @Override // defpackage.k0
    public int getSize() {
        return _size$volatile$FU.get(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        V vPutSynchronized = (V) Core.putImpl$default((Core) core$volatile$FU.get(this), k, v, null, 4, null);
        if (vPutSynchronized == ConcurrentWeakMapKt.REHASH) {
            vPutSynchronized = putSynchronized(k, v);
        }
        if (vPutSynchronized == null) {
            _size$volatile$FU.incrementAndGet(this);
        }
        return vPutSynchronized;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        if (obj == 0) {
            return null;
        }
        V vPutSynchronized = (V) Core.putImpl$default((Core) core$volatile$FU.get(this), obj, null, null, 4, null);
        if (vPutSynchronized == ConcurrentWeakMapKt.REHASH) {
            vPutSynchronized = putSynchronized(obj, null);
        }
        if (vPutSynchronized != null) {
            _size$volatile$FU.decrementAndGet(this);
        }
        return vPutSynchronized;
    }

    public final void runWeakRefQueueCleaningLoopUntilInterrupted() {
        if (this.weakRefQueue == null) {
            fo.n("Must be created with weakRefQueue = true");
            return;
        }
        while (true) {
            try {
                Reference<? extends K> referenceRemove = this.weakRefQueue.remove();
                referenceRemove.getClass();
                cleanWeakRef((HashedWeakRef) referenceRemove);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public /* synthetic */ ConcurrentWeakMap(boolean z, int i, ca0 ca0Var) {
        this((i & 1) != 0 ? false : z);
    }

    public ConcurrentWeakMap() {
        this(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object _get_keys_$lambda$0(Object obj, Object obj2) {
        return obj;
    }
}
