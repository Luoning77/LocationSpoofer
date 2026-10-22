package defpackage;

import android.database.SQLException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ua2 implements xb3, pd2 {
    public final c30 a;
    public final z40 b;
    public final boolean c;
    public final mo d;
    public volatile boolean e;

    public ua2(c30 c30Var, z40 z40Var, boolean z) {
        c30Var.getClass();
        this.a = c30Var;
        this.b = z40Var;
        this.c = z;
        this.d = new mo();
    }

    @Override // defpackage.xb3
    public final Object a(wb3 wb3Var, pu0 pu0Var, k33 k33Var) {
        if (this.e) {
            mh0.d0(21, "Connection is recycled");
            throw null;
        }
        o40 o40Var = (o40) k33Var.getContext().get(this.a);
        if (o40Var != null && o40Var.f == this) {
            return g(wb3Var, pu0Var, k33Var);
        }
        mh0.d0(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // defpackage.pd2
    public final zk2 b() {
        return this.b;
    }

    @Override // defpackage.xb3
    public final Boolean c(q60 q60Var) {
        if (this.e) {
            mh0.d0(21, "Connection is recycled");
            throw null;
        }
        o40 o40Var = (o40) q60Var.getContext().get(this.a);
        if (o40Var != null && o40Var.f == this) {
            return Boolean.valueOf(!this.d.isEmpty() || this.b.e.c());
        }
        mh0.d0(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.na2
    public final Object d(String str, lu0 lu0Var, r60 r60Var) {
        ta2 ta2Var;
        z40 z40Var;
        if (r60Var instanceof ta2) {
            ta2Var = (ta2) r60Var;
            int i = ta2Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                ta2Var.j = i - Integer.MIN_VALUE;
            } else {
                ta2Var = new ta2(this, r60Var);
            }
        } else {
            ta2Var = new ta2(this, r60Var);
        }
        Object obj = ta2Var.h;
        z70 z70Var = z70.e;
        int i2 = ta2Var.j;
        if (i2 == 0) {
            ee0.J(obj);
            if (this.e) {
                mh0.d0(21, "Connection is recycled");
                throw null;
            }
            o40 o40Var = (o40) ta2Var.getContext().get(this.a);
            if (o40Var == null || o40Var.f != this) {
                mh0.d0(21, "Attempted to use connection on a different coroutine");
                throw null;
            }
            z40Var = this.b;
            ta2Var.e = str;
            ta2Var.f = lu0Var;
            ta2Var.g = z40Var;
            ta2Var.j = 1;
            if (z40Var.f.lock(null, ta2Var) == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z40 z40Var2 = ta2Var.g;
            lu0Var = ta2Var.f;
            String str2 = ta2Var.e;
            ee0.J(obj);
            z40Var = z40Var2;
            str = str2;
        }
        try {
            oa2 oa2Var = new oa2(this, this.b.a0(str));
            try {
                Object objInvoke = lu0Var.invoke(oa2Var);
                am1.j(oa2Var, null);
                z40Var.unlock(null);
                return objInvoke;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    am1.j(oa2Var, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            z40Var.unlock(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object e(wb3 wb3Var, r60 r60Var) {
        qa2 qa2Var;
        z40 z40Var;
        mo moVar = this.d;
        if (r60Var instanceof qa2) {
            qa2Var = (qa2) r60Var;
            int i = qa2Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                qa2Var.i = i - Integer.MIN_VALUE;
            } else {
                qa2Var = new qa2(this, r60Var);
            }
        } else {
            qa2Var = new qa2(this, r60Var);
        }
        Object obj = qa2Var.g;
        int i2 = qa2Var.i;
        z40 z40Var2 = this.b;
        if (i2 == 0) {
            ee0.J(obj);
            qa2Var.e = wb3Var;
            qa2Var.f = z40Var2;
            qa2Var.i = 1;
            Object objLock = z40Var2.f.lock(null, qa2Var);
            z70 z70Var = z70.e;
            if (objLock == z70Var) {
                return z70Var;
            }
            z40Var = z40Var2;
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z40 z40Var3 = qa2Var.f;
            wb3 wb3Var2 = qa2Var.e;
            ee0.J(obj);
            z40Var = z40Var3;
            wb3Var = wb3Var2;
        }
        try {
            int i3 = moVar.g;
            if (moVar.isEmpty()) {
                int iOrdinal = wb3Var.ordinal();
                if (iOrdinal == 0) {
                    mh0.D("BEGIN DEFERRED TRANSACTION", z40Var2);
                } else if (iOrdinal == 1) {
                    mh0.D("BEGIN IMMEDIATE TRANSACTION", z40Var2);
                } else {
                    if (iOrdinal != 2) {
                        throw new iv();
                    }
                    mh0.D("BEGIN EXCLUSIVE TRANSACTION", z40Var2);
                }
            } else {
                mh0.D("SAVEPOINT '" + i3 + '\'', z40Var2);
            }
            moVar.addLast(new pa2(i3));
            mf3 mf3Var = mf3.a;
            z40Var.unlock(null);
            return mf3Var;
        } catch (Throwable th) {
            z40Var.unlock(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object f(boolean z, r60 r60Var) {
        ra2 ra2Var;
        z40 z40Var;
        mo moVar = this.d;
        if (r60Var instanceof ra2) {
            ra2Var = (ra2) r60Var;
            int i = ra2Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                ra2Var.i = i - Integer.MIN_VALUE;
            } else {
                ra2Var = new ra2(this, r60Var);
            }
        } else {
            ra2Var = new ra2(this, r60Var);
        }
        Object obj = ra2Var.g;
        int i2 = ra2Var.i;
        z40 z40Var2 = this.b;
        if (i2 == 0) {
            ee0.J(obj);
            ra2Var.f = z40Var2;
            ra2Var.e = z;
            ra2Var.i = 1;
            Object objLock = z40Var2.f.lock(null, ra2Var);
            z70 z70Var = z70.e;
            if (objLock == z70Var) {
                return z70Var;
            }
            z40Var = z40Var2;
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = ra2Var.e;
            z40Var = ra2Var.f;
            ee0.J(obj);
        }
        try {
            if (moVar.isEmpty()) {
                throw new IllegalStateException("Not in a transaction");
            }
            pa2 pa2Var = (pa2) fz.d0(moVar);
            if (z) {
                pa2Var.getClass();
                if (moVar.isEmpty()) {
                    mh0.D("END TRANSACTION", z40Var2);
                } else {
                    mh0.D("RELEASE SAVEPOINT '" + pa2Var.a + '\'', z40Var2);
                }
            } else if (moVar.isEmpty()) {
                mh0.D("ROLLBACK TRANSACTION", z40Var2);
            } else {
                mh0.D("ROLLBACK TRANSACTION TO SAVEPOINT '" + pa2Var.a + '\'', z40Var2);
            }
            mf3 mf3Var = mf3.a;
            z40Var.unlock(null);
            return mf3Var;
        } catch (Throwable th) {
            z40Var.unlock(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x008f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(wb3 wb3Var, pu0 pu0Var, r60 r60Var) throws Throwable {
        sa2 sa2Var;
        SQLException e;
        Throwable th;
        int i;
        boolean z;
        if (r60Var instanceof sa2) {
            sa2Var = (sa2) r60Var;
            int i2 = sa2Var.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sa2Var.j = i2 - Integer.MIN_VALUE;
            } else {
                sa2Var = new sa2(this, r60Var);
            }
        } else {
            sa2Var = new sa2(this, r60Var);
        }
        Object objInvoke = sa2Var.h;
        int i3 = sa2Var.j;
        Object obj = z70.e;
        try {
            if (i3 == 0) {
                ee0.J(objInvoke);
                if (wb3Var == null) {
                    wb3Var = wb3.e;
                }
                sa2Var.e = pu0Var;
                sa2Var.j = 1;
                if (e(wb3Var, sa2Var) != obj) {
                }
                return obj;
            }
            if (i3 == 1) {
                pu0Var = (pu0) sa2Var.e;
                ee0.J(objInvoke);
            } else {
                if (i3 != 2) {
                    if (i3 == 3 || i3 == 4) {
                        Object obj2 = sa2Var.e;
                        ee0.J(objInvoke);
                        return obj2;
                    }
                    if (i3 != 5) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = sa2Var.f;
                    th = (Throwable) sa2Var.e;
                    try {
                        ee0.J(objInvoke);
                        throw th;
                    } catch (SQLException e2) {
                        e = e2;
                        if (th != null) {
                            throw e;
                        }
                        vd0.d(th, e);
                        throw th;
                    }
                }
                i = sa2Var.g;
                ee0.J(objInvoke);
            }
            z = i != 0;
            sa2Var.e = objInvoke;
            sa2Var.j = 3;
            if (f(z, sa2Var) != obj) {
                return obj;
            }
            return objInvoke;
            z52 z52Var = new z52(this, 1);
            sa2Var.e = null;
            sa2Var.g = 1;
            sa2Var.j = 2;
            objInvoke = pu0Var.invoke(z52Var, sa2Var);
            if (objInvoke != obj) {
                i = 1;
                if (i != 0) {
                }
                sa2Var.e = objInvoke;
                sa2Var.j = 3;
                if (f(z, sa2Var) != obj) {
                    return objInvoke;
                }
            }
            return obj;
        } catch (Throwable th2) {
            th = th2;
            try {
                throw th;
            } catch (Throwable th3) {
                try {
                    sa2Var.e = th;
                    sa2Var.f = th3;
                    sa2Var.j = 5;
                    if (f(false, sa2Var) != obj) {
                        throw th3;
                    }
                } catch (SQLException e3) {
                    e = e3;
                    th = th3;
                    if (th != null) {
                        throw e;
                    }
                    vd0.d(th, e);
                    throw th;
                }
            }
        }
    }
}
