package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class gf2 implements sd3 {
    public final /* synthetic */ int e = 0;
    public final Object f;
    public final Object g;
    public final Object h;

    public gf2(d31 d31Var, jm0 jm0Var, yy yyVar, ArrayList arrayList) {
        this.f = d31Var;
        this.g = jm0Var;
        this.h = arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0136  */
    /* JADX WARN: Code duplicated, block: B:55:0x013e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0157  */
    /* JADX WARN: Code duplicated, block: B:68:0x0171  */
    /* JADX WARN: Code duplicated, block: B:71:0x0182  */
    /* JADX WARN: Code duplicated, block: B:72:0x018b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0190  */
    /* JADX WARN: Code duplicated, block: B:76:0x0193  */
    /* JADX WARN: Code duplicated, block: B:78:0x0196  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:93:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x01db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x01bb A[SYNTHETIC] */
    public LinkedHashMap a(zw0 zw0Var, zd3 zd3Var, Class cls, boolean z) {
        Method methodU;
        Field[] fieldArr;
        List listSingletonList;
        List list;
        int size;
        cf2 cf2Var;
        int i;
        List list2;
        int i2;
        int i3;
        cf2 cf2Var2;
        boolean z2;
        zd3 zd3Var2;
        Class cls2;
        boolean z3;
        int modifiers;
        boolean z4;
        cf2 cf2Var3;
        u61 u61Var;
        rd3 rd3VarC;
        boolean z5;
        String name;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!cls.isInterface()) {
            zd3 zd3Var3 = zd3Var;
            Class cls3 = cls;
            while (true) {
                Type type = zd3Var3.b;
                if (cls3 != Object.class) {
                    Field[] declaredFields = cls3.getDeclaredFields();
                    if (cls3 != cls && declaredFields.length > 0) {
                        ee0.x((ArrayList) this.h);
                    }
                    int length = declaredFields.length;
                    boolean z6 = false;
                    int i4 = 0;
                    while (i4 < length) {
                        int i5 = length;
                        Field field = declaredFields[i4];
                        boolean zB = this.b(field, true);
                        boolean zB2 = this.b(field, z6);
                        if (zB || zB2) {
                            if (!z) {
                                methodU = null;
                            } else if (Modifier.isStatic(field.getModifiers())) {
                                zB2 = z6;
                                methodU = null;
                            } else {
                                methodU = bf2.a.u(cls3, field);
                                bf2.e(methodU);
                                if (methodU.getAnnotation(it2.class) != null && field.getAnnotation(it2.class) == null) {
                                    throw new l71(az2.k("@SerializedName on ", bf2.d(methodU, z6), " is not supported"));
                                }
                            }
                            if (methodU == null) {
                                bf2.e(field);
                            }
                            boolean z7 = true;
                            Type typeC0 = sb.c0(type, cls3, field.getGenericType(), new HashMap());
                            it2 it2Var = (it2) field.getAnnotation(it2.class);
                            if (it2Var == null) {
                                switch (1) {
                                    case 1:
                                        name = field.getName();
                                        break;
                                    case 2:
                                        name = az2.b(field.getName());
                                        break;
                                    case 3:
                                        name = az2.b(az2.a(field.getName(), ' '));
                                        break;
                                    case 4:
                                        name = az2.a(field.getName(), '_').toUpperCase(Locale.ENGLISH);
                                        break;
                                    case Logger.WARN /* 5 */:
                                        name = az2.a(field.getName(), '_').toLowerCase(Locale.ENGLISH);
                                        break;
                                    case Logger.ERROR /* 6 */:
                                        name = az2.a(field.getName(), '-').toLowerCase(Locale.ENGLISH);
                                        break;
                                    default:
                                        name = az2.a(field.getName(), '.').toLowerCase(Locale.ENGLISH);
                                        break;
                                }
                                listSingletonList = Collections.singletonList(name);
                                fieldArr = declaredFields;
                            } else {
                                String strValue = it2Var.value();
                                String[] strArrAlternate = it2Var.alternate();
                                fieldArr = declaredFields;
                                if (strArrAlternate.length == 0) {
                                    listSingletonList = Collections.singletonList(strValue);
                                } else {
                                    ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
                                    arrayList.add(strValue);
                                    Collections.addAll(arrayList, strArrAlternate);
                                    list = arrayList;
                                }
                                size = list.size();
                                cf2Var = null;
                                i = 0;
                                list2 = list;
                                while (i < size) {
                                    String str = (String) list2.get(i);
                                    if (i != 0) {
                                        zB = false;
                                    }
                                    int i6 = i4;
                                    boolean z8 = zB2;
                                    zd3Var2 = new zd3(typeC0);
                                    List list3 = list2;
                                    cls2 = zd3Var2.a;
                                    if (cls2 == null && cls2.isPrimitive()) {
                                        z3 = z7;
                                    } else {
                                        z3 = false;
                                    }
                                    modifiers = field.getModifiers();
                                    if (Modifier.isStatic(modifiers) || !Modifier.isFinal(modifiers)) {
                                        z4 = false;
                                    } else {
                                        z4 = z7;
                                    }
                                    cf2Var3 = cf2Var;
                                    u61Var = (u61) field.getAnnotation(u61.class);
                                    int i7 = size;
                                    if (u61Var != null) {
                                        rd3VarC = yy.a((d31) this.f, zw0Var, zd3Var2, u61Var);
                                    } else {
                                        rd3VarC = null;
                                    }
                                    int i8 = i;
                                    if (rd3VarC != null) {
                                        z5 = z7;
                                    } else {
                                        z5 = false;
                                    }
                                    if (rd3VarC == null) {
                                        rd3VarC = zw0Var.c(zd3Var2);
                                    }
                                    boolean z9 = z7;
                                    Type type2 = typeC0;
                                    boolean z10 = zB;
                                    cf2Var = (cf2) linkedHashMap.put(str, new cf2(str, field, z10, z8, methodU, z5, rd3VarC, zw0Var, zd3Var2, z3, z4));
                                    if (cf2Var3 == null) {
                                        cf2Var = cf2Var3;
                                    }
                                    i = i8 + 1;
                                    this = this;
                                    zw0Var = zw0Var;
                                    zB = z10;
                                    zB2 = z8;
                                    methodU = methodU;
                                    typeC0 = type2;
                                    i4 = i6;
                                    list2 = list3;
                                    i5 = i5;
                                    z7 = z9;
                                    size = i7;
                                }
                                i2 = i4;
                                i3 = i5;
                                cf2Var2 = cf2Var;
                                z2 = false;
                                if (cf2Var2 == null) {
                                    throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + cf2Var2.a + "'; conflict is caused by fields " + bf2.c(cf2Var2.b) + " and " + bf2.c(field));
                                }
                            }
                            list = listSingletonList;
                            size = list.size();
                            cf2Var = null;
                            i = 0;
                            list2 = list;
                            while (i < size) {
                                String str2 = (String) list2.get(i);
                                if (i != 0) {
                                    zB = false;
                                }
                                int i9 = i4;
                                boolean z11 = zB2;
                                zd3Var2 = new zd3(typeC0);
                                List list4 = list2;
                                cls2 = zd3Var2.a;
                                if (cls2 == null) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                modifiers = field.getModifiers();
                                if (Modifier.isStatic(modifiers)) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                cf2Var3 = cf2Var;
                                u61Var = (u61) field.getAnnotation(u61.class);
                                int i10 = size;
                                if (u61Var != null) {
                                    rd3VarC = yy.a((d31) this.f, zw0Var, zd3Var2, u61Var);
                                } else {
                                    rd3VarC = null;
                                }
                                int i11 = i;
                                if (rd3VarC != null) {
                                    z5 = z7;
                                } else {
                                    z5 = false;
                                }
                                if (rd3VarC == null) {
                                    rd3VarC = zw0Var.c(zd3Var2);
                                }
                                boolean z12 = z7;
                                Type type3 = typeC0;
                                boolean z13 = zB;
                                cf2Var = (cf2) linkedHashMap.put(str2, new cf2(str2, field, z13, z11, methodU, z5, rd3VarC, zw0Var, zd3Var2, z3, z4));
                                if (cf2Var3 == null) {
                                    cf2Var = cf2Var3;
                                }
                                i = i11 + 1;
                                this = this;
                                zw0Var = zw0Var;
                                zB = z13;
                                zB2 = z11;
                                methodU = methodU;
                                typeC0 = type3;
                                i4 = i9;
                                list2 = list4;
                                i5 = i5;
                                z7 = z12;
                                size = i10;
                            }
                            i2 = i4;
                            i3 = i5;
                            cf2Var2 = cf2Var;
                            z2 = false;
                            if (cf2Var2 == null) {
                                throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + cf2Var2.a + "'; conflict is caused by fields " + bf2.c(cf2Var2.b) + " and " + bf2.c(field));
                            }
                        } else {
                            fieldArr = declaredFields;
                            z2 = z6;
                            i2 = i4;
                            i3 = i5;
                        }
                        i4 = i2 + 1;
                        this = this;
                        zw0Var = zw0Var;
                        declaredFields = fieldArr;
                        length = i3;
                        z6 = z2;
                    }
                    zd3Var3 = new zd3(sb.c0(type, cls3, cls3.getGenericSuperclass(), new HashMap()));
                    cls3 = zd3Var3.a;
                }
            }
        }
        return linkedHashMap;
    }

    public boolean b(Field field, boolean z) {
        jm0 jm0Var = (jm0) this.g;
        Class<?> type = field.getType();
        jm0Var.getClass();
        if (jm0.b(type)) {
            return false;
        }
        jm0Var.a(z);
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || jm0.b(field.getType())) {
            return false;
        }
        List list = z ? jm0Var.e : jm0Var.f;
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw az2.g(it);
        }
        return true;
    }

    @Override // defpackage.sd3
    public final rd3 create(zw0 zw0Var, zd3 zd3Var) {
        int i = this.e;
        Object obj = this.h;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                Class cls = zd3Var.a;
                if (!Object.class.isAssignableFrom(cls)) {
                    return null;
                }
                ee0.x((ArrayList) obj);
                return bf2.a.E(cls) ? new ff2(cls, a(zw0Var, zd3Var, cls, true)) : new ef2(((d31) obj2).s(zd3Var), a(zw0Var, zd3Var, cls, false));
            default:
                Class cls2 = zd3Var.a;
                if (cls2 == ((Class) obj2) || cls2 == ((Class) this.g)) {
                    return (rd3) obj;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.e) {
            case 1:
                return "Factory[type=" + ((Class) this.g).getName() + "+" + ((Class) this.f).getName() + ",adapter=" + ((rd3) this.h) + "]";
            default:
                return super.toString();
        }
    }

    public gf2(Class cls, Class cls2, rd3 rd3Var) {
        this.f = cls;
        this.g = cls2;
        this.h = rd3Var;
    }
}
