package defpackage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class xo extends rd3 {
    public static final wo d = new wo(0);
    public final /* synthetic */ int a = 2;
    public final Object b;
    public final Object c;

    public xo(zw0 zw0Var, rd3 rd3Var, Class cls) {
        this.b = new yp1(zw0Var, rd3Var, cls);
        this.c = cls;
    }

    @Override // defpackage.rd3
    public final Object read(z71 z71Var) {
        int i = this.a;
        Collection collection = null;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                Class cls = (Class) obj2;
                if (z71Var.u0() == 9) {
                    z71Var.q0();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                z71Var.A();
                while (z71Var.h0()) {
                    arrayList.add(((rd3) ((yp1) obj).c).read(z71Var));
                }
                z71Var.U();
                int size = arrayList.size();
                if (!cls.isPrimitive()) {
                    return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
                }
                Object objNewInstance = Array.newInstance((Class<?>) cls, size);
                for (int i2 = 0; i2 < size; i2++) {
                    Array.set(objNewInstance, i2, arrayList.get(i2));
                }
                return objNewInstance;
            case 1:
                if (z71Var.u0() == 9) {
                    z71Var.q0();
                } else {
                    collection = (Collection) ((q02) obj2).n();
                    z71Var.A();
                    while (z71Var.h0()) {
                        collection.add(((rd3) ((yp1) obj).c).read(z71Var));
                    }
                    z71Var.U();
                }
                return collection;
            default:
                Class cls2 = (Class) obj2;
                Object obj3 = ((td3) obj).g.read(z71Var);
                if (obj3 == null || cls2.isInstance(obj3)) {
                    return obj3;
                }
                throw new l71("Expected a " + cls2.getName() + " but was " + obj3.getClass().getName() + "; at path " + z71Var.g0());
        }
    }

    @Override // defpackage.rd3
    public final void write(i81 i81Var, Object obj) throws IOException {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                if (obj == null) {
                    i81Var.f0();
                } else {
                    i81Var.F();
                    int length = Array.getLength(obj);
                    for (int i2 = 0; i2 < length; i2++) {
                        ((yp1) obj2).write(i81Var, Array.get(obj, i2));
                    }
                    i81Var.U();
                }
                break;
            case 1:
                Collection collection = (Collection) obj;
                if (collection == null) {
                    i81Var.f0();
                } else {
                    i81Var.F();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((yp1) obj2).write(i81Var, it.next());
                    }
                    i81Var.U();
                }
                break;
            default:
                ((td3) obj2).g.write(i81Var, obj);
                break;
        }
    }

    public xo(zw0 zw0Var, Type type, rd3 rd3Var, q02 q02Var) {
        this.b = new yp1(zw0Var, rd3Var, type);
        this.c = q02Var;
    }

    public xo(td3 td3Var, Class cls) {
        this.b = td3Var;
        this.c = cls;
    }
}
