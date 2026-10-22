package kotlinx.coroutines.internal;

import defpackage.am0;
import defpackage.i52;
import defpackage.lu0;
import defpackage.o51;
import defpackage.wg2;
import defpackage.xe2;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.coroutines.CopyableThrowable;
import kotlinx.coroutines.internal.ExceptionsConstructorKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ExceptionsConstructorKt {
    private static final CtorCache ctorCache;
    private static final int throwableFields = fieldsCountOrDefault(Throwable.class, -1);

    static {
        CtorCache ctorCache2;
        try {
            ctorCache2 = FastServiceLoaderKt.getANDROID_DETECTED() ? WeakMapCtorCache.INSTANCE : ClassValueCtorCache.INSTANCE;
        } catch (Throwable unused) {
            ctorCache2 = WeakMapCtorCache.INSTANCE;
        }
        ctorCache = ctorCache2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> lu0 createConstructor(Class<E> cls) {
        Object next;
        lu0 lu0Var;
        i52 i52Var;
        i52 i52Var2;
        ExceptionsConstructorKt$createConstructor$nullResult$1 exceptionsConstructorKt$createConstructor$nullResult$1 = new lu0() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$nullResult$1
            @Override // defpackage.lu0
            public final Void invoke(Throwable th) {
                return null;
            }
        };
        final int i = 0;
        if (throwableFields == fieldsCountOrDefault(cls, 0)) {
            Constructor<?>[] constructors = cls.getConstructors();
            ArrayList arrayList = new ArrayList(constructors.length);
            int length = constructors.length;
            int i2 = 0;
            while (true) {
                next = null;
                if (i2 >= length) {
                    break;
                }
                final Constructor<?> constructor = constructors[i2];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length2 = parameterTypes.length;
                final int i3 = 3;
                if (length2 != 0) {
                    final int i4 = 2;
                    final int i5 = 1;
                    if (length2 == 1) {
                        Class<?> cls2 = parameterTypes[0];
                        if (o51.f(cls2, String.class)) {
                            i52Var = new i52(safeCtor(new lu0() { // from class: bm0
                                @Override // defpackage.lu0
                                public final Object invoke(Object obj) {
                                    int i6 = i5;
                                    Constructor constructor2 = constructor;
                                    Throwable th = (Throwable) obj;
                                    switch (i6) {
                                        case 0:
                                            return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$1(constructor2, th);
                                        case 1:
                                            return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$3(constructor2, th);
                                        case 2:
                                            return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$4(constructor2, th);
                                        default:
                                            return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$6(constructor2, th);
                                    }
                                }
                            }), 2);
                        } else if (o51.f(cls2, Throwable.class)) {
                            i52Var = new i52(safeCtor(new lu0() { // from class: bm0
                                @Override // defpackage.lu0
                                public final Object invoke(Object obj) {
                                    int i6 = i4;
                                    Constructor constructor2 = constructor;
                                    Throwable th = (Throwable) obj;
                                    switch (i6) {
                                        case 0:
                                            return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$1(constructor2, th);
                                        case 1:
                                            return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$3(constructor2, th);
                                        case 2:
                                            return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$4(constructor2, th);
                                        default:
                                            return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$6(constructor2, th);
                                    }
                                }
                            }), 1);
                        } else {
                            i52Var2 = new i52(null, -1);
                        }
                    } else if (length2 != 2) {
                        i52Var2 = new i52(null, -1);
                    } else if (o51.f(parameterTypes[0], String.class) && o51.f(parameterTypes[1], Throwable.class)) {
                        i52Var = new i52(safeCtor(new lu0() { // from class: bm0
                            @Override // defpackage.lu0
                            public final Object invoke(Object obj) {
                                int i6 = i;
                                Constructor constructor2 = constructor;
                                Throwable th = (Throwable) obj;
                                switch (i6) {
                                    case 0:
                                        return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$1(constructor2, th);
                                    case 1:
                                        return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$3(constructor2, th);
                                    case 2:
                                        return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$4(constructor2, th);
                                    default:
                                        return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$6(constructor2, th);
                                }
                            }
                        }), 3);
                    } else {
                        i52Var2 = new i52(null, -1);
                    }
                    arrayList.add(i52Var2);
                    i2++;
                } else {
                    i52Var = new i52(safeCtor(new lu0() { // from class: bm0
                        @Override // defpackage.lu0
                        public final Object invoke(Object obj) {
                            int i6 = i3;
                            Constructor constructor2 = constructor;
                            Throwable th = (Throwable) obj;
                            switch (i6) {
                                case 0:
                                    return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$1(constructor2, th);
                                case 1:
                                    return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$3(constructor2, th);
                                case 2:
                                    return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$4(constructor2, th);
                                default:
                                    return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$6(constructor2, th);
                            }
                        }
                    }), 0);
                }
                i52Var2 = i52Var;
                arrayList.add(i52Var2);
                i2++;
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iIntValue = ((Number) ((i52) next).f).intValue();
                    do {
                        Object next2 = it.next();
                        int iIntValue2 = ((Number) ((i52) next2).f).intValue();
                        if (iIntValue < iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (it.hasNext());
                }
            }
            i52 i52Var3 = (i52) next;
            if (i52Var3 != null && (lu0Var = (lu0) i52Var3.e) != null) {
                return lu0Var;
            }
        }
        return exceptionsConstructorKt$createConstructor$nullResult$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable createConstructor$lambda$7$lambda$1(Constructor constructor, Throwable th) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(th.getMessage(), th);
        objNewInstance.getClass();
        return (Throwable) objNewInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable createConstructor$lambda$7$lambda$3(Constructor constructor, Throwable th) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(th.getMessage());
        objNewInstance.getClass();
        Throwable th2 = (Throwable) objNewInstance;
        th2.initCause(th);
        return th2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable createConstructor$lambda$7$lambda$4(Constructor constructor, Throwable th) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(th);
        objNewInstance.getClass();
        return (Throwable) objNewInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable createConstructor$lambda$7$lambda$6(Constructor constructor, Throwable th) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(null);
        objNewInstance.getClass();
        Throwable th2 = (Throwable) objNewInstance;
        th2.initCause(th);
        return th2;
    }

    private static final int fieldsCount(Class<?> cls, int i) {
        do {
            int i2 = 0;
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    i2++;
                }
            }
            i += i2;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i;
    }

    public static /* synthetic */ int fieldsCount$default(Class cls, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return fieldsCount(cls, i);
    }

    private static final int fieldsCountOrDefault(Class<?> cls, int i) {
        Object wg2Var;
        cls.getClass();
        xe2.a(cls);
        try {
            wg2Var = Integer.valueOf(fieldsCount$default(cls, 0, 1, null));
        } catch (Throwable th) {
            wg2Var = new wg2(th);
        }
        Object objValueOf = Integer.valueOf(i);
        if (wg2Var instanceof wg2) {
            wg2Var = objValueOf;
        }
        return ((Number) wg2Var).intValue();
    }

    private static final lu0 safeCtor(lu0 lu0Var) {
        return new am0(0, lu0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable safeCtor$lambda$9(lu0 lu0Var, Throwable th) {
        Object wg2Var;
        Throwable th2;
        try {
            th2 = (Throwable) lu0Var.invoke(th);
            boolean zF = o51.f(th.getMessage(), th2.getMessage());
            wg2Var = th2;
            if (!zF && !o51.f(th2.getMessage(), th.toString())) {
                wg2Var = th2;
                wg2Var = null;
            }
        } catch (Throwable th3) {
            wg2Var = new wg2(th3);
        }
        wg2Var = th2;
        return (Throwable) (wg2Var instanceof wg2 ? null : wg2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E extends Throwable> E tryCopyException(E e) {
        Object wg2Var;
        if (!(e instanceof CopyableThrowable)) {
            return (E) ctorCache.get(e.getClass()).invoke(e);
        }
        try {
            wg2Var = ((CopyableThrowable) e).createCopy();
        } catch (Throwable th) {
            wg2Var = new wg2(th);
        }
        if (wg2Var instanceof wg2) {
            wg2Var = null;
        }
        return (E) wg2Var;
    }
}
