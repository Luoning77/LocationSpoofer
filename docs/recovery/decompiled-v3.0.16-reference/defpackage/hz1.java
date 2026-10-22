package defpackage;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hz1 extends cv1 implements tc3, az1 {
    public az1 s;
    public dz1 t;
    public hz1 u;
    public final String v = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";

    public hz1(az1 az1Var, dz1 dz1Var) {
        this.s = az1Var;
        this.t = dz1Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r9 == r5) goto L27;
     */
    @Override // defpackage.az1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F0(long r7, defpackage.q60 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.gz1
            if (r0 == 0) goto L13
            r0 = r9
            gz1 r0 = (defpackage.gz1) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L1a
        L13:
            gz1 r0 = new gz1
            r60 r9 = (defpackage.r60) r9
            r0.<init>(r6, r9)
        L1a:
            java.lang.Object r9 = r0.f
            int r1 = r0.h
            r2 = 0
            r3 = 2
            r4 = 1
            z70 r5 = defpackage.z70.e
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2f
            long r6 = r0.e
            defpackage.ee0.J(r9)
            goto L6c
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r6)
            return r2
        L35:
            long r7 = r0.e
            defpackage.ee0.J(r9)
            goto L53
        L3b:
            defpackage.ee0.J(r9)
            boolean r9 = r6.r
            if (r9 == 0) goto L46
            hz1 r2 = r6.n1()
        L46:
            if (r2 == 0) goto L58
            r0.e = r7
            r0.h = r4
            java.lang.Object r9 = r2.F0(r7, r0)
            if (r9 != r5) goto L53
            goto L6a
        L53:
            yh3 r9 = (defpackage.yh3) r9
            long r1 = r9.a
            goto L5a
        L58:
            r1 = 0
        L5a:
            az1 r6 = r6.s
            long r7 = defpackage.yh3.d(r7, r1)
            r0.e = r1
            r0.h = r3
            java.lang.Object r9 = r6.F0(r7, r0)
            if (r9 != r5) goto L6b
        L6a:
            return r5
        L6b:
            r6 = r1
        L6c:
            yh3 r9 = (defpackage.yh3) r9
            long r8 = r9.a
            long r6 = defpackage.yh3.e(r6, r8)
            yh3 r8 = new yh3
            r8.<init>(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hz1.F0(long, q60):java.lang.Object");
    }

    @Override // defpackage.tc3
    public final Object H() {
        return this.v;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // defpackage.az1
    public final Object I0(long j, long j2, q60 q60Var) {
        fz1 fz1Var;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        if (q60Var instanceof fz1) {
            fz1Var = (fz1) q60Var;
            int i = fz1Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                fz1Var.i = i - Integer.MIN_VALUE;
            } else {
                fz1Var = new fz1(this, (r60) q60Var);
            }
        } else {
            fz1Var = new fz1(this, (r60) q60Var);
        }
        fz1 fz1Var2 = fz1Var;
        Object objI0 = fz1Var2.g;
        int i2 = fz1Var2.i;
        hz1 hz1VarN1 = null;
        z70 z70Var = z70.e;
        if (i2 == 0) {
            ee0.J(objI0);
            az1 az1Var = this.s;
            fz1Var2.e = j;
            fz1Var2.f = j2;
            fz1Var2.i = 1;
            objI0 = az1Var.I0(j, j2, fz1Var2);
            if (objI0 != z70Var) {
                j3 = j;
                j4 = j2;
            }
            return z70Var;
        }
        if (i2 == 1) {
            j4 = fz1Var2.f;
            j3 = fz1Var2.e;
            ee0.J(objI0);
        } else {
            if (i2 != 2) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j7 = fz1Var2.e;
            ee0.J(objI0);
        }
        j6 = ((yh3) objI0).a;
        j5 = j7;
        return new yh3(yh3.e(j5, j6));
        j5 = ((yh3) objI0).a;
        boolean z = this.r;
        if (!z) {
            hz1VarN1 = this.u;
        } else if (z) {
            hz1VarN1 = n1();
        }
        if (hz1VarN1 != null) {
            long jE = yh3.e(j3, j5);
            long jD = yh3.d(j4, j5);
            fz1Var2.e = j5;
            fz1Var2.i = 2;
            objI0 = hz1VarN1.I0(jE, jD, fz1Var2);
            if (objI0 != z70Var) {
                j7 = j5;
                j6 = ((yh3) objI0).a;
                j5 = j7;
            }
            return z70Var;
        }
        j6 = 0;
        return new yh3(yh3.e(j5, j6));
    }

    @Override // defpackage.az1
    public final long R0(int i, long j) {
        hz1 hz1VarN1 = this.r ? n1() : null;
        long jR0 = hz1VarN1 != null ? hz1VarN1.R0(i, j) : 0L;
        return c12.e(jR0, this.s.R0(i, c12.d(j, jR0)));
    }

    @Override // defpackage.cv1
    public final void e1() {
        dz1 dz1Var = this.t;
        dz1Var.a = this;
        dz1Var.b = null;
        this.u = null;
        dz1Var.c = new ye(this, 18);
        dz1Var.d = a1();
    }

    @Override // defpackage.cv1
    public final void f1() {
        we2 we2Var = new we2();
        q73.j(this, new va(2, we2Var));
        hz1 hz1Var = (hz1) ((tc3) we2Var.e);
        this.u = hz1Var;
        dz1 dz1Var = this.t;
        dz1Var.b = hz1Var;
        if (dz1Var.a == this) {
            dz1Var.a = null;
        }
    }

    @Override // defpackage.az1
    public final long i0(int i, long j, long j2) {
        long jI0 = this.s.i0(i, j, j2);
        hz1 hz1VarN1 = this.r ? n1() : null;
        return c12.e(jI0, hz1VarN1 != null ? hz1VarN1.i0(i, c12.e(j, jI0), c12.d(j2, jI0)) : 0L);
    }

    public final CoroutineScope m1() {
        hz1 hz1VarN1 = n1();
        CoroutineScope coroutineScopeM1 = hz1VarN1 != null ? hz1VarN1.m1() : null;
        if (coroutineScopeM1 != null && CoroutineScopeKt.isActive(coroutineScopeM1)) {
            return coroutineScopeM1;
        }
        CoroutineScope coroutineScope = this.t.d;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        fo.n("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public final hz1 n1() {
        tz1 tz1Var;
        tc3 tc3Var = null;
        if (!this.r) {
            return null;
        }
        if (!this.e.r) {
            p21.c("visitAncestors called on an unattached node");
        }
        cv1 cv1Var = this.e.i;
        hb1 hb1VarO = xp1.O(this);
        loop0: while (hb1VarO != null) {
            if ((hb1VarO.K.f.h & 262144) != 0) {
                while (cv1Var != null) {
                    if ((cv1Var.g & 262144) != 0) {
                        cv1 cv1VarJ = cv1Var;
                        gy1 gy1Var = null;
                        while (cv1VarJ != null) {
                            if (cv1VarJ instanceof tc3) {
                                tc3 tc3Var2 = (tc3) cv1VarJ;
                                if (o51.f(this.v, tc3Var2.H()) && hz1.class == tc3Var2.getClass()) {
                                    tc3Var = tc3Var2;
                                    break loop0;
                                }
                            }
                            if ((cv1VarJ.g & 262144) != 0 && (cv1VarJ instanceof lb0)) {
                                int i = 0;
                                for (cv1 cv1Var2 = ((lb0) cv1VarJ).t; cv1Var2 != null; cv1Var2 = cv1Var2.j) {
                                    if ((cv1Var2.g & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            cv1VarJ = cv1Var2;
                                        } else {
                                            if (gy1Var == null) {
                                                gy1Var = new gy1(new cv1[16]);
                                            }
                                            if (cv1VarJ != null) {
                                                gy1Var.b(cv1VarJ);
                                                cv1VarJ = null;
                                            }
                                            gy1Var.b(cv1Var2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            cv1VarJ = xp1.J(gy1Var);
                        }
                    }
                    cv1Var = cv1Var.i;
                }
            }
            hb1VarO = hb1VarO.u();
            cv1Var = (hb1VarO == null || (tz1Var = hb1VarO.K) == null) ? null : tz1Var.e;
        }
        return (hz1) tc3Var;
    }
}
