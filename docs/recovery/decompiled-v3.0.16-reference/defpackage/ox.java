package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ox implements l81, mx {
    public static final Map f;
    public final Class e;

    static {
        List listG = am1.G(au0.class, lu0.class, pu0.class, qu0.class, ru0.class, su0.class, tu0.class, uu0.class, vu0.class, wu0.class, bu0.class, cu0.class, du0.class, eu0.class, fu0.class, gu0.class, hu0.class, iu0.class, ju0.class, ku0.class, mu0.class, nu0.class, ou0.class);
        ArrayList arrayList = new ArrayList(az.Y(listG, 10));
        int i = 0;
        for (Object obj : listG) {
            int i2 = i + 1;
            if (i < 0) {
                am1.X();
                throw null;
            }
            arrayList.add(new i52((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f = jq1.Q(arrayList);
    }

    public ox(Class cls) {
        cls.getClass();
        this.e = cls;
    }

    @Override // defpackage.mx
    public final Class a() {
        return this.e;
    }

    public final String b() {
        String strJ;
        Class cls = this.e;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strJ2 = o51.j(cls.getName());
            return strJ2 == null ? cls.getCanonicalName() : strJ2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strJ = o51.j(componentType.getName())) != null) {
            strConcat = strJ.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public final String c() {
        String strB;
        Class cls = this.e;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strB2 = o51.B(cls.getName());
                return strB2 == null ? cls.getSimpleName() : strB2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strB = o51.B(componentType.getName())) != null) {
                strConcat = strB.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return l13.w0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return l13.x0(simpleName, '$');
        }
        return l13.w0(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final boolean d(Object obj) {
        Class clsS = this.e;
        clsS.getClass();
        Map map = f;
        map.getClass();
        Integer num = (Integer) map.get(clsS);
        if (num != null) {
            return da0.A(num.intValue(), obj);
        }
        if (clsS.isPrimitive()) {
            clsS = ig0.s(xe2.a(clsS));
        }
        return clsS.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ox) && ig0.s(this).equals(ig0.s((l81) obj));
    }

    public final int hashCode() {
        return ig0.s(this).hashCode();
    }

    public final String toString() {
        return this.e.toString() + " (Kotlin reflection is not available)";
    }
}
