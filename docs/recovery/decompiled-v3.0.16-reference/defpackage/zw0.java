package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import org.maplibre.geojson.GeoJson;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zw0 {
    public final ThreadLocal a = new ThreadLocal();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final d31 c;
    public final yy d;
    public final List e;

    public zw0(jm0 jm0Var, HashMap map, ArrayList arrayList, ArrayList arrayList2) {
        d31 d31Var = new d31(11, map, arrayList2);
        this.c = d31Var;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(wd3.A);
        arrayList3.add(v02.b);
        arrayList3.add(jm0Var);
        arrayList3.addAll(arrayList);
        arrayList3.add(wd3.p);
        arrayList3.add(wd3.g);
        arrayList3.add(wd3.d);
        arrayList3.add(wd3.e);
        arrayList3.add(wd3.f);
        p02 p02Var = wd3.k;
        arrayList3.add(new gf2(Long.TYPE, Long.class, p02Var));
        int i = 1;
        arrayList3.add(new gf2(Double.TYPE, Double.class, new p02(i)));
        int i2 = 2;
        arrayList3.add(new gf2(Float.TYPE, Float.class, new p02(i2)));
        arrayList3.add(p02.b);
        arrayList3.add(wd3.h);
        arrayList3.add(wd3.i);
        int i3 = 0;
        arrayList3.add(new td3(AtomicLong.class, new b03(p02Var, i).nullSafe(), i3));
        arrayList3.add(new td3(AtomicLongArray.class, new b03(p02Var, i2).nullSafe(), i3));
        arrayList3.add(wd3.j);
        arrayList3.add(wd3.l);
        arrayList3.add(wd3.q);
        arrayList3.add(wd3.r);
        arrayList3.add(new td3(BigDecimal.class, wd3.m, i3));
        arrayList3.add(new td3(BigInteger.class, wd3.n, i3));
        arrayList3.add(new td3(yb1.class, wd3.o, i3));
        arrayList3.add(wd3.s);
        arrayList3.add(wd3.t);
        arrayList3.add(wd3.v);
        arrayList3.add(wd3.w);
        arrayList3.add(wd3.y);
        arrayList3.add(wd3.u);
        arrayList3.add(wd3.b);
        arrayList3.add(a03.e);
        arrayList3.add(wd3.x);
        if (c03.a) {
            arrayList3.add(c03.c);
            arrayList3.add(c03.b);
            arrayList3.add(c03.d);
        }
        arrayList3.add(xo.d);
        arrayList3.add(wd3.a);
        arrayList3.add(new yy(d31Var, i3));
        arrayList3.add(new yy(d31Var, i2));
        yy yyVar = new yy(d31Var, i);
        this.d = yyVar;
        arrayList3.add(yyVar);
        arrayList3.add(wd3.B);
        arrayList3.add(new gf2(d31Var, jm0Var, yyVar, arrayList2));
        this.e = Collections.unmodifiableList(arrayList3);
    }

    public static void a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final Object b(Class cls, String str) {
        zd3 zd3Var = new zd3(cls);
        Object obj = null;
        if (str != null) {
            z71 z71Var = new z71(new StringReader(str));
            boolean z = true;
            z71Var.f = true;
            try {
                try {
                    try {
                        try {
                            z71Var.u0();
                            try {
                                obj = c(zd3Var).read(z71Var);
                            } catch (EOFException e) {
                                e = e;
                                z = false;
                                if (!z) {
                                    throw new l71(e);
                                }
                            }
                        } catch (IOException e2) {
                            throw new l71(e2);
                        }
                    } catch (AssertionError e3) {
                        throw new AssertionError("AssertionError (GSON 2.10.1): " + e3.getMessage(), e3);
                    } catch (IllegalStateException e4) {
                        throw new l71(e4);
                    }
                } catch (Throwable th) {
                    z71Var.f = false;
                    throw th;
                }
            } catch (EOFException e5) {
                e = e5;
            }
            z71Var.f = false;
            if (obj != null) {
                try {
                    if (z71Var.u0() != 10) {
                        throw new l71("JSON document was not fully consumed.");
                    }
                } catch (qn1 e6) {
                    throw new l71(e6);
                } catch (IOException e7) {
                    throw new l71(e7);
                }
            }
        }
        if (cls == Integer.TYPE) {
            cls = Integer.class;
        } else if (cls == Float.TYPE) {
            cls = Float.class;
        } else if (cls == Byte.TYPE) {
            cls = Byte.class;
        } else if (cls == Double.TYPE) {
            cls = Double.class;
        } else if (cls == Long.TYPE) {
            cls = Long.class;
        } else if (cls == Character.TYPE) {
            cls = Character.class;
        } else if (cls == Boolean.TYPE) {
            cls = Boolean.class;
        } else if (cls == Short.TYPE) {
            cls = Short.class;
        } else if (cls == Void.TYPE) {
            cls = Void.class;
        }
        return cls.cast(obj);
    }

    public final rd3 c(zd3 zd3Var) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.b;
        rd3 rd3Var = (rd3) concurrentHashMap.get(zd3Var);
        if (rd3Var != null) {
            return rd3Var;
        }
        ThreadLocal threadLocal = this.a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            rd3 rd3Var2 = (rd3) map.get(zd3Var);
            if (rd3Var2 != null) {
                return rd3Var2;
            }
            z = false;
        }
        try {
            yw0 yw0Var = new yw0();
            yw0Var.a = null;
            map.put(zd3Var, yw0Var);
            Iterator it = this.e.iterator();
            rd3 rd3VarCreate = null;
            while (it.hasNext()) {
                rd3VarCreate = ((sd3) it.next()).create(this, zd3Var);
                if (rd3VarCreate != null) {
                    if (yw0Var.a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    yw0Var.a = rd3VarCreate;
                    map.put(zd3Var, rd3VarCreate);
                    break;
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (rd3VarCreate == null) {
                fo.q(zd3Var, "GSON (2.10.1) cannot handle ");
                return null;
            }
            if (z) {
                concurrentHashMap.putAll(map);
            }
            return rd3VarCreate;
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final rd3 d(sd3 sd3Var, zd3 zd3Var) {
        List<sd3> list = this.e;
        if (!list.contains(sd3Var)) {
            sd3Var = this.d;
        }
        boolean z = false;
        for (sd3 sd3Var2 : list) {
            if (z) {
                rd3 rd3VarCreate = sd3Var2.create(this, zd3Var);
                if (rd3VarCreate != null) {
                    return rd3VarCreate;
                }
            } else if (sd3Var2 == sd3Var) {
                z = true;
            }
        }
        fo.q(zd3Var, "GSON cannot serialize ");
        return null;
    }

    public final String e(Serializable serializable, Class cls) {
        StringWriter stringWriter = new StringWriter();
        try {
            i81 i81Var = new i81(stringWriter);
            i81Var.j = true;
            i81Var.i = false;
            i81Var.l = false;
            g(serializable, cls, i81Var);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new l71(e);
        }
    }

    public final String f(GeoJson geoJson) {
        return e(geoJson, geoJson.getClass());
    }

    public final void g(Serializable serializable, Class cls, i81 i81Var) {
        rd3 rd3VarC = c(new zd3(cls));
        boolean z = i81Var.i;
        i81Var.i = true;
        boolean z2 = i81Var.j;
        i81Var.j = true;
        boolean z3 = i81Var.l;
        i81Var.l = false;
        try {
            try {
                try {
                    rd3VarC.write(i81Var, serializable);
                    i81Var.i = z;
                    i81Var.j = z2;
                    i81Var.l = z3;
                } catch (IOException e) {
                    throw new l71(e);
                }
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            i81Var.i = z;
            i81Var.j = z2;
            i81Var.l = z3;
            throw th;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }
}
