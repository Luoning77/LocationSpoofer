package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class mk1 {
    public final int a;
    public final nk1 b;
    public final k91 c;
    public int d;
    public int e;
    public int f;

    public mk1(int i) {
        this.a = i;
        if (i <= 0) {
            fo.i("maxSize <= 0");
            throw null;
        }
        this.b = new nk1(0);
        this.c = new k91(3);
    }

    public Object a(Object obj) {
        return null;
    }

    public void b(Object obj, Object obj2, Object obj3) {
        obj.getClass();
    }

    public final Object c(Object obj) {
        Object objPut;
        synchronized (this.c) {
            Object obj2 = this.b.a.get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            Object objA = a(obj);
            if (objA == null) {
                return null;
            }
            synchronized (this.c) {
                try {
                    objPut = this.b.a.put(obj, objA);
                    if (objPut != null) {
                        this.b.a.put(obj, objPut);
                    } else {
                        this.d++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (objPut != null) {
                b(obj, objA, objPut);
                return objPut;
            }
            e(this.a);
            return objA;
        }
    }

    public final Object d(Object obj, Object obj2) {
        Object objPut;
        obj.getClass();
        synchronized (this.c) {
            this.d++;
            objPut = this.b.a.put(obj, obj2);
            if (objPut != null) {
                this.d--;
            }
        }
        if (objPut != null) {
            b(obj, objPut, obj2);
        }
        e(this.a);
        return objPut;
    }

    public final void e(int i) {
        Object next;
        Object key;
        Object value;
        while (true) {
            synchronized (this.c) {
                try {
                    if (this.d < 0 || (this.b.a.isEmpty() && this.d != 0)) {
                        break;
                    }
                    if (this.d > i && !this.b.a.isEmpty()) {
                        Set setEntrySet = this.b.a.entrySet();
                        setEntrySet.getClass();
                        Set set = setEntrySet;
                        if (set instanceof List) {
                            List list = (List) set;
                            next = list.isEmpty() ? null : list.get(0);
                        } else {
                            Iterator it = set.iterator();
                            if (it.hasNext()) {
                                next = it.next();
                            }
                        }
                        Map.Entry entry = (Map.Entry) next;
                        if (entry == null) {
                            return;
                        }
                        key = entry.getKey();
                        value = entry.getValue();
                        nk1 nk1Var = this.b;
                        key.getClass();
                        nk1Var.a.remove(key);
                        int i2 = this.d;
                        value.getClass();
                        this.d = i2 - 1;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
            b(key, value, null);
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public final String toString() {
        String str;
        synchronized (this.c) {
            try {
                int i = this.e;
                int i2 = this.f + i;
                str = "LruCache[maxSize=" + this.a + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
