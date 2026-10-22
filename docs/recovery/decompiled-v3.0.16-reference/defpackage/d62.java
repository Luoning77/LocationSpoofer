package defpackage;

import android.database.SQLException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class d62 implements xb3, pd2 {
    public final pu0 a;
    public final zk2 b;
    public final AtomicInteger c;
    public wb3 d;

    public d62(pu0 pu0Var, zk2 zk2Var) {
        zk2Var.getClass();
        this.a = pu0Var;
        this.b = zk2Var;
        this.c = new AtomicInteger(0);
    }

    @Override // defpackage.xb3
    public final Object a(wb3 wb3Var, pu0 pu0Var, k33 k33Var) {
        return this.a.invoke(new g6(this, wb3Var, pu0Var, null, 7), k33Var);
    }

    @Override // defpackage.pd2
    public final zk2 b() {
        return this.b;
    }

    @Override // defpackage.xb3
    public final Boolean c(q60 q60Var) {
        return Boolean.valueOf(this.d != null || this.b.c());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.na2
    public final Object d(String str, lu0 lu0Var, r60 r60Var) throws Exception {
        b62 b62Var;
        if (r60Var instanceof b62) {
            b62Var = (b62) r60Var;
            int i = b62Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                b62Var.i = i - Integer.MIN_VALUE;
            } else {
                b62Var = new b62(this, r60Var);
            }
        } else {
            b62Var = new b62(this, r60Var);
        }
        Object objC = b62Var.g;
        int i2 = b62Var.i;
        Object obj = z70.e;
        if (i2 == 0) {
            ee0.J(objC);
            b62Var.e = str;
            b62Var.f = lu0Var;
            b62Var.i = 1;
            objC = c(b62Var);
            if (objC != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ee0.J(objC);
                return objC;
            }
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        lu0Var = b62Var.f;
        str = b62Var.e;
        ee0.J(objC);
        if (((Boolean) objC).booleanValue()) {
            c62 c62Var = new c62(this, str, lu0Var, null);
            b62Var.e = null;
            b62Var.f = null;
            b62Var.i = 2;
            Object objInvoke = this.a.invoke(c62Var, b62Var);
            return objInvoke == obj ? obj : objInvoke;
        }
        bl2 bl2VarA0 = this.b.a0(str);
        try {
            Object objInvoke2 = lu0Var.invoke(bl2VarA0);
            am1.j(bl2VarA0, null);
            return objInvoke2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                am1.j(bl2VarA0, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(wb3 wb3Var, pu0 pu0Var, r60 r60Var) {
        a62 a62Var;
        if (r60Var instanceof a62) {
            a62Var = (a62) r60Var;
            int i = a62Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                a62Var.h = i - Integer.MIN_VALUE;
            } else {
                a62Var = new a62(this, r60Var);
            }
        } else {
            a62Var = new a62(this, r60Var);
        }
        Object objInvoke = a62Var.f;
        int i2 = a62Var.h;
        AtomicInteger atomicInteger = this.c;
        int i3 = 1;
        zk2 zk2Var = this.b;
        try {
            if (i2 == 0) {
                ee0.J(objInvoke);
                int iOrdinal = wb3Var.ordinal();
                if (iOrdinal == 0) {
                    mh0.D("BEGIN DEFERRED TRANSACTION", zk2Var);
                } else if (iOrdinal == 1) {
                    mh0.D("BEGIN IMMEDIATE TRANSACTION", zk2Var);
                } else {
                    if (iOrdinal != 2) {
                        b81.d();
                        return null;
                    }
                    mh0.D("BEGIN EXCLUSIVE TRANSACTION", zk2Var);
                }
                if (atomicInteger.incrementAndGet() > 0) {
                    this.d = wb3Var;
                }
                Object z52Var = new z52(this, 0);
                a62Var.e = 1;
                a62Var.h = 1;
                objInvoke = pu0Var.invoke(z52Var, a62Var);
                Object obj = z70.e;
                if (objInvoke == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = a62Var.e;
                ee0.J(objInvoke);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                this.d = null;
            }
            if (i3 != 0) {
                mh0.D("END TRANSACTION", zk2Var);
                return objInvoke;
            }
            mh0.D("ROLLBACK TRANSACTION", zk2Var);
            return objInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    if (atomicInteger.decrementAndGet() == 0) {
                        this.d = null;
                    }
                    mh0.D("ROLLBACK TRANSACTION", zk2Var);
                } catch (SQLException e) {
                    vd0.d(th, e);
                }
                throw th2;
            }
        }
    }
}
