package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mb2 implements vc1 {
    public final int e;
    public final gn f;
    public final lu0 g;
    public l50 h;
    public e23 i;
    public ub1 j;
    public boolean k;
    public boolean l;
    public boolean m;
    public Object n;
    public boolean o;
    public lb2 p;
    public boolean q;
    public long r;
    public long s;
    public long t;
    public boolean u;
    public final /* synthetic */ ha1 v;

    public mb2(ha1 ha1Var, int i, gn gnVar, zs0 zs0Var) {
        this.v = ha1Var;
        this.e = i;
        this.f = gnVar;
        this.g = zs0Var;
        int i2 = kv1.b;
        this.t = System.nanoTime() - kv1.a;
    }

    public final void a() {
        ub1 ub1Var = this.j;
        if (ub1Var != null) {
            switch (ub1Var.a) {
                case 0:
                    break;
                default:
                    nb1 nb1VarB = ub1Var.b();
                    if ((nb1VarB != null ? nb1VarB.f : null) != null) {
                        ub1Var.b.e(ub1Var.c);
                    }
                    break;
            }
        }
        this.j = null;
        e23 e23Var = this.i;
        if (e23Var != null) {
            e23Var.dispose();
        }
        this.i = null;
        this.p = null;
    }

    @Override // defpackage.vc1
    public final void b() {
        this.q = true;
    }

    public final boolean c(lf lfVar) {
        boolean zD;
        if (!this.v.a) {
            return false;
        }
        if (this.q) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zD = d(lfVar);
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            zD = d(lfVar);
        }
        ks.e0("compose:lazy:prefetch:execute:item", -1L);
        return zD;
    }

    @Override // defpackage.vc1
    public final void cancel() {
        if (this.l) {
            return;
        }
        this.l = true;
        a();
    }

    /* JADX WARN: Failed to calculate best type for var: r15v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v3 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v3 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v4 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v3 ??, new type: char
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public final boolean d(defpackage.lf r26) {
        /*
            Method dump skipped, instruction units count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mb2.d(lf):boolean");
    }

    public final boolean e() {
        ub1 ub1Var;
        return this.m || ((ub1Var = this.j) != null && ub1Var.c());
    }

    public final void f(Object obj, Object obj2, tp tpVar) {
        ub1 ub1Var;
        ub1 ub1Var2 = this.j;
        int i = 0;
        if (ub1Var2 == null) {
            ha1 ha1Var = this.v;
            pu0 pu0VarA = ((mc1) ha1Var.b).a(this.e, obj, obj2);
            vb1 vb1VarA = ((g23) ha1Var.c).a();
            if (vb1VarA.e.G()) {
                vb1VarA.k(obj, pu0VarA, true);
                ub1Var = new ub1(vb1VarA, obj, 1);
            } else {
                ub1Var = new ub1(vb1VarA, obj, i);
            }
            ub1Var2 = ub1Var;
            this.j = ub1Var2;
            this.n = obj;
        }
        this.u = false;
        while (!ub1Var2.c() && !this.u) {
            kb2 kb2Var = new kb2(this, tpVar);
            switch (ub1Var2.a) {
                case 0:
                    break;
                default:
                    nb1 nb1VarB = ub1Var2.b();
                    g72 g72Var = nb1VarB != null ? nb1VarB.f : null;
                    if (g72Var == null || g72Var.c()) {
                        break;
                    } else {
                        nx2 nx2VarK = wc0.K();
                        lu0 lu0VarE = nx2VarK != null ? nx2VarK.e() : null;
                        nx2 nx2VarS = wc0.S(nx2VarK);
                        try {
                            g72Var.e(kb2Var);
                            wc0.g0(nx2VarK, nx2VarS, lu0VarE);
                            break;
                        } catch (Throwable th) {
                            try {
                                nb1VarB.getClass();
                                throw th;
                            } catch (Throwable th2) {
                                wc0.g0(nx2VarK, nx2VarS, lu0VarE);
                                throw th2;
                            }
                        }
                    }
                    break;
            }
        }
        h();
        boolean z = this.u;
        long j = this.s;
        if (z) {
            tpVar.b = tp.a(j, tpVar.b);
        } else {
            tpVar.a = tp.a(j, tpVar.a);
        }
    }

    public final boolean g(long j, long j2) {
        if (this.q) {
            j2 = 0;
        }
        return j > j2;
    }

    public final void h() {
        long j;
        int i = kv1.b;
        long jNanoTime = System.nanoTime() - kv1.a;
        long j2 = this.t;
        long jL = 0;
        if (((j2 - 1) | 1) == Long.MAX_VALUE) {
            if (jNanoTime == j2) {
                c30 c30Var = ah0.f;
            } else {
                jL = ah0.j(j2 < 0 ? ah0.h : ah0.g);
            }
        } else if ((1 | (jNanoTime - 1)) == Long.MAX_VALUE) {
            jL = jNanoTime < 0 ? ah0.h : ah0.g;
        } else {
            long j3 = jNanoTime - j2;
            long j4 = (j3 ^ jNanoTime) & (~(j3 ^ j2));
            fh0 fh0Var = fh0.NANOSECONDS;
            if (j4 < 0) {
                fh0 fh0Var2 = fh0.MILLISECONDS;
                if (fh0Var.compareTo(fh0Var2) < 0) {
                    long j5 = (jNanoTime / 1000000) - (j2 / 1000000);
                    long j6 = (jNanoTime % 1000000) - (j2 % 1000000);
                    c30 c30Var2 = ah0.f;
                    jL = ah0.g(dh0.L(j5, fh0Var2), dh0.L(j6, fh0Var));
                } else {
                    jL = ah0.j(j3 < 0 ? ah0.h : ah0.g);
                }
            } else {
                jL = dh0.L(j3, fh0Var);
            }
        }
        long j7 = jL >> 1;
        c30 c30Var3 = ah0.f;
        if ((1 & ((int) jL)) == 0) {
            j = j7;
        } else if (j7 > 9223372036854L) {
            j = Long.MAX_VALUE;
        } else {
            j = j7 < -9223372036854L ? Long.MIN_VALUE : j7 * 1000000;
        }
        this.s = j;
        long j8 = this.r - j;
        this.r = j8;
        this.t = jNanoTime;
        ks.e0("compose:lazy:prefetch:available_time_nanos", j8);
    }

    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.e + ", constraints = " + this.h + ", isComposed = " + e() + ", isMeasured = " + this.k + ", isCanceled = " + this.l + " }";
    }
}
