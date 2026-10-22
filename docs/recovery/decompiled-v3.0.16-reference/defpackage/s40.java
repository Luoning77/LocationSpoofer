package defpackage;

import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.ThreadContextElementKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class s40 implements p40 {
    public final ma2 e;
    public final ma2 f;
    public final c30 g;
    public final ThreadLocal h;
    public volatile boolean i;
    public final long j;

    public s40(final d31 d31Var, final String str, int i) {
        long jL;
        str.getClass();
        this.g = new c30(2);
        this.h = new ThreadLocal();
        c30 c30Var = ah0.f;
        fh0 fh0Var = fh0.SECONDS;
        if (fh0Var.compareTo(fh0Var) <= 0) {
            int i2 = ch0.a;
            jL = 60000000000L;
        } else {
            jL = dh0.L(30L, fh0Var);
        }
        this.j = jL;
        if (i <= 0) {
            fo.i("Maximum number of readers must be greater than 0");
            throw null;
        }
        final int i3 = 0;
        this.e = new ma2(i, new au0() { // from class: q40
            @Override // defpackage.au0
            public final Object invoke() throws Exception {
                int i4 = i3;
                String str2 = str;
                d31 d31Var2 = d31Var;
                switch (i4) {
                    case 0:
                        zk2 zk2VarC = d31Var2.c(str2);
                        mh0.D("PRAGMA query_only = 1", zk2VarC);
                        return zk2VarC;
                    default:
                        return d31Var2.c(str2);
                }
            }
        });
        final int i4 = 1;
        this.f = new ma2(1, new au0() { // from class: q40
            @Override // defpackage.au0
            public final Object invoke() throws Exception {
                int i5 = i4;
                String str2 = str;
                d31 d31Var2 = d31Var;
                switch (i5) {
                    case 0:
                        zk2 zk2VarC = d31Var2.c(str2);
                        mh0.D("PRAGMA query_only = 1", zk2VarC);
                        return zk2VarC;
                    default:
                        return d31Var2.c(str2);
                }
            }
        });
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.e.c();
        this.f.c();
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0138  */
    /* JADX WARN: Code duplicated, block: B:71:0x0144 A[Catch: all -> 0x019b, TRY_LEAVE, TryCatch #3 {all -> 0x019b, blocks: (B:64:0x011d, B:69:0x0139, B:71:0x0144, B:86:0x019f, B:87:0x01a6), top: B:113:0x011d }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0173  */
    /* JADX WARN: Code duplicated, block: B:77:0x017b  */
    /* JADX WARN: Code duplicated, block: B:79:0x017f  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x018c  */
    /* JADX WARN: Code duplicated, block: B:86:0x019f A[Catch: all -> 0x019b, TRY_ENTER, TryCatch #3 {all -> 0x019b, blocks: (B:64:0x011d, B:69:0x0139, B:71:0x0144, B:86:0x019f, B:87:0x01a6), top: B:113:0x011d }] */
    @Override // defpackage.p40
    public final Object z(boolean z, pu0 pu0Var, q60 q60Var) throws Exception {
        r40 r40Var;
        we2 we2Var;
        Throwable th;
        ma2 ma2Var;
        y70 context;
        pu0 pu0Var2;
        c30 c30Var;
        ma2 ma2Var2;
        we2 we2Var2;
        boolean z2;
        Object obj;
        we2 we2Var3;
        ua2 ua2Var;
        boolean z3 = z;
        if (q60Var instanceof r40) {
            r40Var = (r40) q60Var;
            int i = r40Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                r40Var.n = i - Integer.MIN_VALUE;
            } else {
                r40Var = new r40(this, q60Var);
            }
        } else {
            r40Var = new r40(this, q60Var);
        }
        Object objWithContext = r40Var.l;
        z70 z70Var = z70.e;
        int i2 = r40Var.n;
        q60 q60Var2 = null;
        if (i2 != 0) {
            if (i2 == 1) {
                ee0.J(objWithContext);
                return objWithContext;
            }
            if (i2 == 2) {
                ee0.J(objWithContext);
                return objWithContext;
            }
            if (i2 == 3) {
                z3 = r40Var.e;
                c30Var = r40Var.k;
                we2 we2Var4 = r40Var.j;
                y70 y70Var = r40Var.i;
                we2 we2Var5 = r40Var.h;
                ma2Var2 = (ma2) r40Var.g;
                pu0Var2 = (pu0) r40Var.f;
                try {
                    ee0.J(objWithContext);
                    we2Var2 = we2Var4;
                    we2Var = we2Var5;
                    context = y70Var;
                    try {
                        z40 z40Var = (z40) objWithContext;
                        z40Var.getClass();
                        context.getClass();
                        z40Var.g = context;
                        z40Var.h = new Throwable();
                        if (this.e == this.f && z3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        we2Var2.e = new ua2(c30Var, z40Var, z2);
                        obj = we2Var.e;
                        if (obj != null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        ua2 ua2Var2 = (ua2) obj;
                        y70 y70VarE = da0.E(ThreadContextElementKt.asContextElement(this.h, ua2Var2), new o40(this.g, ua2Var2));
                        k kVar = new k(pu0Var2, we2Var, q60Var2, 14);
                        r40Var.f = ma2Var2;
                        r40Var.g = we2Var;
                        r40Var.h = null;
                        r40Var.i = null;
                        r40Var.j = null;
                        r40Var.k = null;
                        r40Var.n = 4;
                        objWithContext = BuildersKt.withContext(y70VarE, kVar, r40Var);
                        if (objWithContext != z70Var) {
                            we2Var3 = we2Var;
                            ma2Var = ma2Var2;
                        }
                        return z70Var;
                    } catch (Throwable th2) {
                        th = th2;
                        ma2Var = ma2Var2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    we2Var = we2Var5;
                    ma2Var = ma2Var2;
                    throw th;
                }
            }
            if (i2 != 4) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            we2Var3 = (we2) r40Var.g;
            ma2Var = (ma2) r40Var.f;
            try {
                ee0.J(objWithContext);
            } catch (Throwable th4) {
                we2Var = we2Var3;
                th = th4;
            }
            ua2Var = (ua2) we2Var3.e;
            if (ua2Var != null) {
                if (!ua2Var.e) {
                    ua2Var.e = true;
                    if (ua2Var.b.e.c()) {
                        mh0.D("ROLLBACK TRANSACTION", ua2Var.b);
                    }
                }
                z40 z40Var2 = ua2Var.b;
                z40Var2.g = null;
                z40Var2.h = null;
                ma2Var.e(z40Var2);
            }
            return objWithContext;
        }
        ee0.J(objWithContext);
        if (this.i) {
            mh0.d0(21, "Connection pool is closed");
            throw null;
        }
        ua2 ua2Var3 = (ua2) this.h.get();
        if (ua2Var3 == null) {
            o40 o40Var = (o40) r40Var.getContext().get(this.g);
            ua2Var3 = o40Var != null ? o40Var.f : null;
        }
        if (ua2Var3 == null) {
            ma2 ma2Var3 = z3 ? this.e : this.f;
            we2Var = new we2();
            try {
                context = r40Var.getContext();
                c30 c30Var2 = this.g;
                long j = this.j;
                sy syVar = new sy(this, z3);
                r40Var.f = pu0Var;
                r40Var.g = ma2Var3;
                r40Var.h = we2Var;
                r40Var.i = context;
                r40Var.j = we2Var;
                r40Var.k = c30Var2;
                r40Var.e = z3;
                r40Var.n = 3;
                Object objB = ma2Var3.b(j, syVar, r40Var);
                if (objB != z70Var) {
                    pu0Var2 = pu0Var;
                    c30Var = c30Var2;
                    ma2Var2 = ma2Var3;
                    objWithContext = objB;
                    we2Var2 = we2Var;
                    z40 z40Var3 = (z40) objWithContext;
                    z40Var3.getClass();
                    context.getClass();
                    z40Var3.g = context;
                    z40Var3.h = new Throwable();
                    if (this.e == this.f) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    we2Var2.e = new ua2(c30Var, z40Var3, z2);
                    obj = we2Var.e;
                    if (obj != null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    ua2 ua2Var4 = (ua2) obj;
                    y70 y70VarE2 = da0.E(ThreadContextElementKt.asContextElement(this.h, ua2Var4), new o40(this.g, ua2Var4));
                    k kVar2 = new k(pu0Var2, we2Var, q60Var2, 14);
                    r40Var.f = ma2Var2;
                    r40Var.g = we2Var;
                    r40Var.h = null;
                    r40Var.i = null;
                    r40Var.j = null;
                    r40Var.k = null;
                    r40Var.n = 4;
                    objWithContext = BuildersKt.withContext(y70VarE2, kVar2, r40Var);
                    if (objWithContext != z70Var) {
                        we2Var3 = we2Var;
                        ma2Var = ma2Var2;
                        ua2Var = (ua2) we2Var3.e;
                        if (ua2Var != null) {
                            if (!ua2Var.e) {
                                ua2Var.e = true;
                                if (ua2Var.b.e.c()) {
                                    mh0.D("ROLLBACK TRANSACTION", ua2Var.b);
                                }
                            }
                            z40 z40Var4 = ua2Var.b;
                            z40Var4.g = null;
                            z40Var4.h = null;
                            ma2Var.e(z40Var4);
                        }
                        return objWithContext;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                ma2Var = ma2Var3;
            }
        } else {
            if (!z3 && ua2Var3.c) {
                mh0.d0(1, "Cannot upgrade connection from reader to writer");
                throw null;
            }
            if (r40Var.getContext().get(this.g) == null) {
                y70 y70VarE3 = da0.E(ThreadContextElementKt.asContextElement(this.h, ua2Var3), new o40(this.g, ua2Var3));
                k kVar3 = new k(pu0Var, ua2Var3, q60Var2, 13);
                r40Var.n = 1;
                Object objWithContext2 = BuildersKt.withContext(y70VarE3, kVar3, r40Var);
                if (objWithContext2 != z70Var) {
                    return objWithContext2;
                }
            } else {
                r40Var.n = 2;
                Object objInvoke = pu0Var.invoke(ua2Var3, r40Var);
                if (objInvoke != z70Var) {
                    return objInvoke;
                }
            }
        }
        return z70Var;
        try {
            throw th;
        } catch (Throwable th6) {
            try {
                ua2 ua2Var5 = (ua2) we2Var.e;
                if (ua2Var5 == null) {
                    throw th6;
                }
                if (!ua2Var5.e) {
                    ua2Var5.e = true;
                    if (ua2Var5.b.e.c()) {
                        mh0.D("ROLLBACK TRANSACTION", ua2Var5.b);
                    }
                }
                z40 z40Var5 = ua2Var5.b;
                z40Var5.g = null;
                z40Var5.h = null;
                ma2Var.e(z40Var5);
                throw th6;
            } catch (Throwable th7) {
                vd0.d(th, th7);
                throw th6;
            }
        }
    }

    public s40(d31 d31Var) {
        long jL;
        this.g = new c30(2);
        this.h = new ThreadLocal();
        c30 c30Var = ah0.f;
        fh0 fh0Var = fh0.SECONDS;
        if (fh0Var.compareTo(fh0Var) <= 0) {
            int i = ch0.a;
            jL = 60000000000L;
        } else {
            jL = dh0.L(30L, fh0Var);
        }
        this.j = jL;
        ma2 ma2Var = new ma2(1, new hd(d31Var, 7));
        this.e = ma2Var;
        this.f = ma2Var;
    }
}
