package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class qk0 {
    public abstract void bind(bl2 bl2Var, Object obj);

    public abstract String createQuery();

    public final int handle(zk2 zk2Var, Object obj) {
        zk2Var.getClass();
        if (obj == null) {
            return 0;
        }
        bl2 bl2VarA0 = zk2Var.a0(createQuery());
        try {
            bind(bl2VarA0, obj);
            bl2VarA0.R();
            am1.j(bl2VarA0, null);
            return mc0.w(zk2Var);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                am1.j(bl2VarA0, th);
                throw th2;
            }
        }
    }

    public final int handleMultiple(zk2 zk2Var, Object[] objArr) throws Exception {
        zk2Var.getClass();
        int iW = 0;
        if (objArr == null) {
            return 0;
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
                        iW += mc0.w(zk2Var);
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
        return iW;
    }

    public final int handleMultiple(zk2 zk2Var, Iterable<Object> iterable) throws Exception {
        zk2Var.getClass();
        int iW = 0;
        if (iterable == null) {
            return 0;
        }
        bl2 bl2VarA0 = zk2Var.a0(createQuery());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    bind(bl2VarA0, obj);
                    bl2VarA0.R();
                    bl2VarA0.reset();
                    iW += mc0.w(zk2Var);
                }
            }
            am1.j(bl2VarA0, null);
            return iW;
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
