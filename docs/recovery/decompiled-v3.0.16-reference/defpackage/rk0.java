package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class rk0 {
    public abstract void bind(bl2 bl2Var, Object obj);

    public abstract String createQuery();

    public final void insert(zk2 zk2Var, Object[] objArr) throws Exception {
        zk2Var.getClass();
        if (objArr == null) {
            return;
        }
        bl2 bl2VarA0 = zk2Var.a0(createQuery());
        int i = 0;
        while (i < objArr.length) {
            try {
                int i2 = i + 1;
                try {
                    Object obj = objArr[i];
                    if (obj != null) {
                        bind(bl2VarA0, obj);
                        bl2VarA0.R();
                        bl2VarA0.reset();
                    }
                    i = i2;
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new NoSuchElementException(e.getMessage());
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    am1.j(bl2VarA0, th);
                    throw th2;
                }
            }
        }
        am1.j(bl2VarA0, null);
    }

    public final long insertAndReturnId(zk2 zk2Var, Object obj) throws Exception {
        zk2Var.getClass();
        if (obj == null) {
            return -1L;
        }
        bl2 bl2VarA0 = zk2Var.a0(createQuery());
        try {
            bind(bl2VarA0, obj);
            bl2VarA0.R();
            am1.j(bl2VarA0, null);
            return mc0.s(zk2Var);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                am1.j(bl2VarA0, th);
                throw th2;
            }
        }
    }

    public final long[] insertAndReturnIdsArray(zk2 zk2Var, Collection<Object> collection) throws Exception {
        long jS;
        zk2Var.getClass();
        if (collection == null) {
            return new long[0];
        }
        bl2 bl2VarA0 = zk2Var.a0(createQuery());
        try {
            int size = collection.size();
            long[] jArr = new long[size];
            for (int i = 0; i < size; i++) {
                Object objK0 = zy.k0(i, collection);
                if (objK0 != null) {
                    bind(bl2VarA0, objK0);
                    bl2VarA0.R();
                    bl2VarA0.reset();
                    jS = mc0.s(zk2Var);
                } else {
                    jS = -1;
                }
                jArr[i] = jS;
            }
            am1.j(bl2VarA0, null);
            return jArr;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                am1.j(bl2VarA0, th);
                throw th2;
            }
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(zk2 zk2Var, Collection<Object> collection) throws Exception {
        long jS;
        zk2Var.getClass();
        if (collection == null) {
            return new Long[0];
        }
        bl2 bl2VarA0 = zk2Var.a0(createQuery());
        try {
            int size = collection.size();
            Long[] lArr = new Long[size];
            for (int i = 0; i < size; i++) {
                Object objK0 = zy.k0(i, collection);
                if (objK0 != null) {
                    bind(bl2VarA0, objK0);
                    bl2VarA0.R();
                    bl2VarA0.reset();
                    jS = mc0.s(zk2Var);
                } else {
                    jS = -1;
                }
                lArr[i] = Long.valueOf(jS);
            }
            am1.j(bl2VarA0, null);
            return lArr;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                am1.j(bl2VarA0, th);
                throw th2;
            }
        }
    }

    public final List<Long> insertAndReturnIdsList(zk2 zk2Var, Collection<Object> collection) throws Exception {
        zk2Var.getClass();
        if (collection == null) {
            return uj0.e;
        }
        mg1 mg1VarN = am1.n();
        bl2 bl2VarA0 = zk2Var.a0(createQuery());
        try {
            for (Object obj : collection) {
                if (obj != null) {
                    bind(bl2VarA0, obj);
                    bl2VarA0.R();
                    bl2VarA0.reset();
                    mg1VarN.add(Long.valueOf(mc0.s(zk2Var)));
                } else {
                    mg1VarN.add(-1L);
                }
            }
            am1.j(bl2VarA0, null);
            return am1.f(mg1VarN);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                am1.j(bl2VarA0, th);
                throw th2;
            }
        }
    }

    public final void insert(zk2 zk2Var, Object obj) {
        zk2Var.getClass();
        if (obj == null) {
            return;
        }
        bl2 bl2VarA0 = zk2Var.a0(createQuery());
        try {
            bind(bl2VarA0, obj);
            bl2VarA0.R();
            am1.j(bl2VarA0, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                am1.j(bl2VarA0, th);
                throw th2;
            }
        }
    }

    public final void insert(zk2 zk2Var, Iterable<Object> iterable) throws Exception {
        zk2Var.getClass();
        if (iterable == null) {
            return;
        }
        bl2 bl2VarA0 = zk2Var.a0(createQuery());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    bind(bl2VarA0, obj);
                    bl2VarA0.R();
                    bl2VarA0.reset();
                }
            }
            am1.j(bl2VarA0, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                am1.j(bl2VarA0, th);
                throw th2;
            }
        }
    }

    public final long[] insertAndReturnIdsArray(zk2 zk2Var, Object[] objArr) throws Exception {
        long jS;
        zk2Var.getClass();
        if (objArr == null) {
            return new long[0];
        }
        bl2 bl2VarA0 = zk2Var.a0(createQuery());
        try {
            int length = objArr.length;
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                if (obj != null) {
                    bind(bl2VarA0, obj);
                    bl2VarA0.R();
                    bl2VarA0.reset();
                    jS = mc0.s(zk2Var);
                } else {
                    jS = -1;
                }
                jArr[i] = jS;
            }
            am1.j(bl2VarA0, null);
            return jArr;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                am1.j(bl2VarA0, th);
                throw th2;
            }
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(zk2 zk2Var, Object[] objArr) throws Exception {
        long jS;
        zk2Var.getClass();
        if (objArr == null) {
            return new Long[0];
        }
        bl2 bl2VarA0 = zk2Var.a0(createQuery());
        try {
            int length = objArr.length;
            Long[] lArr = new Long[length];
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                if (obj != null) {
                    bind(bl2VarA0, obj);
                    bl2VarA0.R();
                    bl2VarA0.reset();
                    jS = mc0.s(zk2Var);
                } else {
                    jS = -1;
                }
                lArr[i] = Long.valueOf(jS);
            }
            am1.j(bl2VarA0, null);
            return lArr;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                am1.j(bl2VarA0, th);
                throw th2;
            }
        }
    }

    public final List<Long> insertAndReturnIdsList(zk2 zk2Var, Object[] objArr) throws Exception {
        zk2Var.getClass();
        if (objArr == null) {
            return uj0.e;
        }
        mg1 mg1VarN = am1.n();
        bl2 bl2VarA0 = zk2Var.a0(createQuery());
        try {
            for (Object obj : objArr) {
                if (obj != null) {
                    bind(bl2VarA0, obj);
                    bl2VarA0.R();
                    bl2VarA0.reset();
                    mg1VarN.add(Long.valueOf(mc0.s(zk2Var)));
                } else {
                    mg1VarN.add(-1L);
                }
            }
            am1.j(bl2VarA0, null);
            return am1.f(mg1VarN);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                am1.j(bl2VarA0, th);
                throw th2;
            }
        }
    }
}
