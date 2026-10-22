package defpackage;

import com.google.gson.JsonPrimitive;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class yp1 extends rd3 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public yp1(Class cls) {
        this.a = 2;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new vd3(cls))) {
                Enum r4 = (Enum) field.get(null);
                String strName = r4.name();
                String string = r4.toString();
                it2 it2Var = (it2) field.getAnnotation(it2.class);
                if (it2Var != null) {
                    strName = it2Var.value();
                    for (String str : it2Var.alternate()) {
                        ((HashMap) this.b).put(str, r4);
                    }
                }
                ((HashMap) this.b).put(strName, r4);
                ((HashMap) this.c).put(string, r4);
                ((HashMap) this.d).put(r4, strName);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.rd3
    public final Object read(z71 z71Var) throws IOException {
        int i = this.a;
        Object obj = this.b;
        Map map = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                rd3 rd3Var = (rd3) ((yp1) obj2).c;
                rd3 rd3Var2 = (rd3) ((yp1) obj).c;
                int iU0 = z71Var.u0();
                if (iU0 == 9) {
                    z71Var.q0();
                } else {
                    map = (Map) ((q02) this.d).n();
                    if (iU0 == 1) {
                        z71Var.A();
                        while (z71Var.h0()) {
                            z71Var.A();
                            Object obj3 = rd3Var2.read(z71Var);
                            if (map.put(obj3, rd3Var.read(z71Var)) != null) {
                                throw new l71("duplicate key: " + obj3);
                            }
                            z71Var.U();
                        }
                        z71Var.U();
                    } else {
                        z71Var.F();
                        while (z71Var.h0()) {
                            j9.T.getClass();
                            if (z71Var instanceof f81) {
                                f81 f81Var = (f81) z71Var;
                                f81Var.C0(5);
                                Map.Entry entry = (Map.Entry) ((Iterator) f81Var.G0()).next();
                                f81Var.I0(entry.getValue());
                                f81Var.I0(new JsonPrimitive((String) entry.getKey()));
                            } else {
                                int iP = z71Var.l;
                                if (iP == 0) {
                                    iP = z71Var.P();
                                }
                                if (iP == 13) {
                                    z71Var.l = 9;
                                } else if (iP == 12) {
                                    z71Var.l = 8;
                                } else if (iP == 14) {
                                    z71Var.l = 10;
                                } else {
                                    fo.h(az2.A(z71Var.u0()), "Expected a name but was ", z71Var.j0());
                                }
                            }
                            Object obj4 = rd3Var2.read(z71Var);
                            if (map.put(obj4, rd3Var.read(z71Var)) != null) {
                                throw new l71("duplicate key: " + obj4);
                            }
                        }
                        z71Var.c0();
                    }
                }
                return map;
            case 1:
                return ((rd3) obj2).read(z71Var);
            default:
                if (z71Var.u0() == 9) {
                    z71Var.q0();
                    return null;
                }
                String strS0 = z71Var.s0();
                Enum r2 = (Enum) ((HashMap) obj).get(strS0);
                return r2 == null ? (Enum) ((HashMap) obj2).get(strS0) : r2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    @Override // defpackage.rd3
    public final void write(i81 i81Var, Object obj) throws IOException {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                yp1 yp1Var = (yp1) obj2;
                if (map == null) {
                    i81Var.f0();
                } else {
                    i81Var.O();
                    for (Map.Entry entry : map.entrySet()) {
                        i81Var.d0(String.valueOf(entry.getKey()));
                        yp1Var.write(i81Var, entry.getValue());
                    }
                    i81Var.c0();
                }
                break;
            case 1:
                rd3 rd3Var = (rd3) obj2;
                Type type = (Type) obj3;
                Type type2 = (obj == null || !((type instanceof Class) || (type instanceof TypeVariable))) ? type : obj.getClass();
                if (type2 != type) {
                    rd3 rd3VarC = ((zw0) this.b).c(new zd3(type2));
                    if (rd3VarC instanceof df2) {
                        rd3 rd3Var2 = rd3Var;
                        while (rd3Var2 instanceof yw0) {
                            rd3 rd3Var3 = ((yw0) rd3Var2).a;
                            if (rd3Var3 == null) {
                                fo.n("Adapter for type with cyclic dependency has been used before dependency has been resolved");
                                rd3Var3 = null;
                            }
                            if (rd3Var3 != rd3Var2) {
                                rd3Var2 = rd3Var3;
                            } else if (rd3Var2 instanceof df2) {
                                rd3Var = rd3VarC;
                            }
                        }
                        if (rd3Var2 instanceof df2) {
                            rd3Var = rd3VarC;
                        }
                    } else {
                        rd3Var = rd3VarC;
                    }
                }
                rd3Var.write(i81Var, obj);
                break;
            default:
                Enum r6 = (Enum) obj;
                i81Var.m0(r6 != null ? (String) ((HashMap) obj3).get(r6) : null);
                break;
        }
    }

    public yp1(zw0 zw0Var, rd3 rd3Var, Type type) {
        this.a = 1;
        this.b = zw0Var;
        this.c = rd3Var;
        this.d = type;
    }

    public yp1(yy yyVar, zw0 zw0Var, Type type, rd3 rd3Var, Type type2, rd3 rd3Var2, q02 q02Var) {
        this.a = 0;
        this.b = new yp1(zw0Var, rd3Var, type);
        this.c = new yp1(zw0Var, rd3Var2, type2);
        this.d = q02Var;
    }
}
