package defpackage;

import android.view.KeyEvent;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class s extends lb0 implements ba2, i91, hs2, tc3, u30, z02, a21, yv0 {
    public static final u92 O = new u92(16);
    public au0 A;
    public final iq0 B;
    public q11 C;
    public zv0 D;
    public kb0 E;
    public vb2 F;
    public ly0 G;
    public final lx1 H;
    public long I;
    public vb2 J;
    public ix1 K;
    public boolean L;
    public Job M;
    public final u92 N;
    public ix1 u;
    public q11 v;
    public boolean w;
    public String x;
    public vh2 y;
    public boolean z;

    public s(ix1 ix1Var, q11 q11Var, boolean z, boolean z2, String str, vh2 vh2Var, au0 au0Var) {
        this.u = ix1Var;
        this.v = q11Var;
        this.w = z;
        this.x = str;
        this.y = vh2Var;
        this.z = z2;
        this.A = au0Var;
        this.B = new iq0(ix1Var, 0, new l(1, this, s.class, "onFocusChange", "onFocusChange(Z)V", 0, 0));
        lx1 lx1Var = nj1.a;
        this.H = new lx1();
        this.I = 0L;
        ix1 ix1Var2 = this.u;
        this.K = ix1Var2;
        this.L = ix1Var2 == null;
        this.N = O;
    }

    public final void A1(ix1 ix1Var, q11 q11Var, boolean z, boolean z2, String str, vh2 vh2Var, au0 au0Var) {
        boolean z3;
        boolean z4;
        kb0 kb0Var;
        boolean z5 = true;
        if (o51.f(this.K, ix1Var)) {
            z3 = false;
        } else {
            q1();
            this.K = ix1Var;
            this.u = ix1Var;
            z3 = true;
        }
        if (!o51.f(this.v, q11Var)) {
            this.v = q11Var;
            z3 = true;
        }
        if (this.w != z) {
            this.w = z;
            if (z) {
                f0();
            }
            z3 = true;
        }
        boolean z6 = this.z;
        iq0 iq0Var = this.B;
        if (z6 != z2) {
            if (z2) {
                m1(iq0Var);
            } else {
                n1(iq0Var);
                q1();
            }
            ee0.C(this);
            this.z = z2;
        }
        if (!o51.f(this.x, str)) {
            this.x = str;
            ee0.C(this);
        }
        if (!o51.f(this.y, vh2Var)) {
            this.y = vh2Var;
            ee0.C(this);
        }
        this.A = au0Var;
        boolean z7 = this.L;
        ix1 ix1Var2 = this.K;
        if (z7 == (ix1Var2 == null)) {
            z5 = z3;
            z4 = z7;
        } else {
            z4 = ix1Var2 == null;
            this.L = z4;
            if (z4 || this.E != null) {
                z7 = z4;
                z5 = z3;
                z4 = z7;
            }
        }
        if (z5 && ((kb0Var = this.E) != null || !z4)) {
            if (kb0Var != null) {
                n1(kb0Var);
            }
            this.E = null;
            w1();
        }
        iq0Var.q1(this.u);
    }

    @Override // defpackage.i91
    public final boolean C(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.tc3
    public final Object H() {
        return this.N;
    }

    @Override // defpackage.hs2
    public final void J0(ss2 ss2Var) {
        vh2 vh2Var = this.y;
        if (vh2Var != null) {
            qs2.c(ss2Var, vh2Var.a);
        }
        String str = this.x;
        i iVar = new i(this, 1);
        x81[] x81VarArr = qs2.a;
        ss2Var.a(ds2.b, new z0(str, iVar));
        if (this.z) {
            this.B.J0(ss2Var);
        } else {
            ss2Var.a(os2.j, mf3.a);
        }
        p1(ss2Var);
    }

    public void K0() {
        ly0 ly0Var;
        ix1 ix1Var = this.u;
        if (ix1Var != null && (ly0Var = this.G) != null) {
            ix1Var.b(new my0(ly0Var));
        }
        this.G = null;
    }

    @Override // defpackage.hs2
    public final boolean M0() {
        return true;
    }

    @Override // defpackage.cv1
    public final boolean b1() {
        return false;
    }

    public void d0(p92 p92Var, q92 q92Var, long j) {
        long j2 = (((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32);
        this.I = (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
        w1();
        if (this.z) {
            if (this.D == null) {
                zv0 zv0Var = new zv0(this);
                m1(zv0Var);
                this.D = zv0Var;
            }
            if (q92Var == q92.f) {
                int i = p92Var.f;
                q60 q60Var = null;
                if (i == 4) {
                    BuildersKt__Builders_commonKt.launch$default(a1(), null, null, new r(this, q60Var, 0), 3, null);
                } else if (i == 5) {
                    BuildersKt__Builders_commonKt.launch$default(a1(), null, null, new r(this, q60Var, 1), 3, null);
                }
            }
        }
    }

    @Override // defpackage.cv1
    public final void e1() {
        f0();
        if (!this.L) {
            w1();
        }
        if (this.z) {
            m1(this.B);
        }
    }

    @Override // defpackage.z02
    public final void f0() {
        if (this.w) {
            gh0.H(this, new i(this, 0));
        }
    }

    @Override // defpackage.cv1
    public final void f1() {
        q1();
        if (this.K == null) {
            this.u = null;
        }
        kb0 kb0Var = this.E;
        if (kb0Var != null) {
            n1(kb0Var);
        }
        this.E = null;
        zv0 zv0Var = this.D;
        if (zv0Var != null) {
            n1(zv0Var);
        }
        this.D = null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[LOOP:0: B:16:0x0037->B:26:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[EDGE_INSN: B:30:0x0076->B:27:0x0076 BREAK  A[LOOP:0: B:16:0x0037->B:26:0x0073], SYNTHETIC] */
    public final void q1() {
        ix1 ix1Var = this.u;
        lx1 lx1Var = this.H;
        if (ix1Var != null) {
            vb2 vb2Var = this.F;
            if (vb2Var != null) {
                ix1Var.b(new ub2(vb2Var));
            }
            vb2 vb2Var2 = this.J;
            if (vb2Var2 != null) {
                ix1Var.b(new ub2(vb2Var2));
            }
            ly0 ly0Var = this.G;
            if (ly0Var != null) {
                ix1Var.b(new my0(ly0Var));
            }
            Object[] objArr = lx1Var.c;
            long[] jArr = lx1Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                ix1Var.b(new ub2((vb2) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        this.F = null;
        this.J = null;
        this.G = null;
        lx1Var.a();
    }

    public final long r1(long j) {
        long jA0 = xp1.O(this).D.A0(((aj3) xq1.C(this, z30.u)).g());
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jA0 >> 32)) - ((int) (j >> 32))) / 2.0f;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jA0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007f A[RETURN] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.i91
    public final boolean s0(KeyEvent keyEvent) {
        boolean z;
        w1();
        long jI = mh0.I(keyEvent);
        boolean z2 = this.z;
        q60 q60Var = null;
        lx1 lx1Var = this.H;
        if (z2) {
            int i = 2;
            if (mh0.L(keyEvent) == 2 && zm3.x(keyEvent)) {
                if (lx1Var.b(jI)) {
                    z = false;
                } else {
                    vb2 vb2Var = new vb2(this.I);
                    lx1Var.h(jI, vb2Var);
                    if (this.u != null) {
                        BuildersKt__Builders_commonKt.launch$default(a1(), null, null, new q(this, vb2Var, q60Var, i), 3, null);
                    }
                    z = true;
                }
                if (y1(keyEvent) || z) {
                    return true;
                }
                return false;
            }
        }
        if (this.z && mh0.L(keyEvent) == 1 && zm3.x(keyEvent)) {
            vb2 vb2Var2 = (vb2) lx1Var.g(jI);
            if (vb2Var2 != null) {
                if (this.u != null) {
                    BuildersKt__Builders_commonKt.launch$default(a1(), null, null, new q(this, vb2Var2, q60Var, 3), 3, null);
                }
                z1(keyEvent);
            }
            if (vb2Var2 != null) {
                return true;
            }
        }
        return false;
    }

    public final void s1(boolean z) {
        ix1 ix1Var = this.u;
        if (ix1Var != null) {
            Job job = this.M;
            q60 q60Var = null;
            if (job == null || !job.isActive()) {
                vb2 vb2Var = z ? this.J : this.F;
                if (vb2Var != null) {
                    ub2 ub2Var = new ub2(vb2Var);
                    Job job2 = (Job) a1().getCoroutineContext().get(Job.Key);
                    BuildersKt__Builders_commonKt.launch$default(a1(), null, null, new m(ix1Var, ub2Var, job2 != null ? job2.invokeOnCompletion(new j(0, ix1Var, ub2Var)) : null, q60Var, 0), 3, null);
                }
            } else {
                Job job3 = this.M;
                if (job3 != null) {
                    Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
                }
            }
            if (z) {
                this.J = null;
            } else {
                this.F = null;
            }
        }
    }

    public final void t1(long j, boolean z) {
        ix1 ix1Var = this.u;
        if (ix1Var != null) {
            Job job = this.M;
            if (job == null || !job.isActive()) {
                vb2 vb2Var = z ? this.J : this.F;
                if (vb2Var != null) {
                    BuildersKt__Builders_commonKt.launch$default(a1(), null, null, new o(vb2Var, ix1Var, null), 3, null);
                }
            } else {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                BuildersKt__Builders_commonKt.launch$default(a1(), null, null, new n(job, j, ix1Var, (q60) null, 0), 3, null);
            }
            if (z) {
                this.J = null;
            } else {
                this.F = null;
            }
        }
    }

    public final void u1(s11 s11Var) {
        ix1 ix1Var = this.u;
        if (ix1Var != null) {
            vb2 vb2Var = new vb2(s11Var.c);
            se2 se2Var = new se2();
            int i = 1;
            q73.i(this, zv0.t, new am0(i, new j(8, s11Var, se2Var)));
            boolean z = se2Var.e;
            q60 q60Var = null;
            if (z || xx.a(this)) {
                this.M = BuildersKt__Builders_commonKt.launch$default(a1(), null, null, new p(ix1Var, vb2Var, this, q60Var, 0), 3, null);
            } else {
                this.J = vb2Var;
                BuildersKt__Builders_commonKt.launch$default(a1(), null, null, new o(ix1Var, vb2Var, q60Var, i), 3, null);
            }
        }
    }

    public final void v1(x92 x92Var) {
        ix1 ix1Var = this.u;
        if (ix1Var != null) {
            vb2 vb2Var = new vb2(x92Var.c);
            se2 se2Var = new se2();
            q73.i(this, zv0.t, new am0(1, new j(9, x92Var, se2Var)));
            boolean z = se2Var.e;
            q60 q60Var = null;
            if (z || xx.a(this)) {
                this.M = BuildersKt__Builders_commonKt.launch$default(a1(), null, null, new p(ix1Var, vb2Var, this, q60Var, 1), 3, null);
            } else {
                this.F = vb2Var;
                BuildersKt__Builders_commonKt.launch$default(a1(), null, null, new o(ix1Var, vb2Var, q60Var, 2), 3, null);
            }
        }
    }

    public final void w1() {
        if (this.E != null) {
            return;
        }
        q11 q11Var = this.w ? this.C : this.v;
        if (q11Var != null) {
            ix1 ix1Var = this.u;
            if (ix1Var == null) {
                ix1Var = new ix1();
                this.u = ix1Var;
            }
            this.B.q1(ix1Var);
            ix1 ix1Var2 = this.u;
            ix1Var2.getClass();
            kb0 kb0VarA = q11Var.a(ix1Var2);
            m1(kb0VarA);
            this.E = kb0VarA;
        }
    }

    public abstract boolean y1(KeyEvent keyEvent);

    public abstract void z1(KeyEvent keyEvent);

    public void x1() {
    }

    public void p1(ss2 ss2Var) {
    }
}
