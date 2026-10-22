package kotlinx.coroutines.internal;

import defpackage.lu0;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class ClassValueCtorCache extends CtorCache {
    public static final ClassValueCtorCache INSTANCE = new ClassValueCtorCache();
    private static final ClassValueCtorCache$cache$1 cache = new ClassValue<lu0>() { // from class: kotlinx.coroutines.internal.ClassValueCtorCache$cache$1
        @Override // java.lang.ClassValue
        /* JADX INFO: renamed from: computeValue, reason: avoid collision after fix types in other method */
        public lu0 computeValue2(Class<?> cls) {
            cls.getClass();
            return ExceptionsConstructorKt.createConstructor(cls);
        }

        @Override // java.lang.ClassValue
        public /* bridge */ /* synthetic */ lu0 computeValue(Class cls) {
            return computeValue2((Class<?>) cls);
        }
    };

    private ClassValueCtorCache() {
    }

    @Override // kotlinx.coroutines.internal.CtorCache
    public lu0 get(Class<? extends Throwable> cls) {
        return (lu0) cache.get(cls);
    }
}
