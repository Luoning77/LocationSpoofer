package defpackage;

import android.content.ClipDescription;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class x73 {
    public final c51 A;
    public boolean B;
    public final kf3 a;
    public me1 d;
    public au0 g;
    public zx h;
    public CoroutineScope i;
    public z82 j;
    public jx0 k;
    public vp0 l;
    public final w52 m;
    public final w52 n;
    public long o;
    public f93 p;
    public long q;
    public final w52 r;
    public final w52 s;
    public int t;
    public f83 u;
    public yv2 v;
    public f93 w;
    public final w52 x;
    public final z92 y;
    public final v73 z;
    public e12 b = fh3.a;
    public lu0 c = new i73(5);
    public final w52 e = ke0.H(new f83((String) null, 0, 7));
    public ak3 f = u92.w;

    public x73(kf3 kf3Var) {
        this.a = kf3Var;
        Boolean bool = Boolean.TRUE;
        this.m = ke0.H(bool);
        this.n = ke0.H(bool);
        this.o = 0L;
        this.q = 0L;
        this.r = ke0.H(null);
        this.s = ke0.H(null);
        this.t = -1;
        this.u = new f83((String) null, 0L, 7);
        this.x = ke0.H(Boolean.FALSE);
        this.y = new z92(4);
        this.z = new v73(this);
        this.A = new c51(this);
    }

    public static f83 b(dj djVar, long j) {
        return new f83(djVar, j, (f93) null);
    }

    public final Job a(boolean z) {
        CoroutineScope coroutineScope = this.i;
        if (coroutineScope != null) {
            return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new ui2(this, z, null), 1, null);
        }
        return null;
    }

    public final void c() {
        CoroutineScope coroutineScope = this.i;
        if (coroutineScope != null) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new s73(this, null, 1), 1, null);
        }
    }

    public final void d(c12 c12Var) {
        if (!f93.c(l().b)) {
            me1 me1Var = this.d;
            y83 y83VarD = me1Var != null ? me1Var.d() : null;
            int iE = (c12Var == null || y83VarD == null) ? f93.e(l().b) : this.b.n(y83VarD.b(c12Var.a, true));
            f83 f83VarA = f83.a(l(), null, g93.a(iE, iE), 5);
            this.c.invoke(f83VarA);
            this.w = new f93(f83VarA.b);
        }
        r((c12Var == null || l().a.f.length() <= 0) ? dx0.e : dx0.g);
        u(false);
    }

    public final void e(boolean z) {
        vp0 vp0Var;
        me1 me1Var = this.d;
        if (me1Var != null && !me1Var.b() && (vp0Var = this.l) != null) {
            vp0.a(vp0Var);
        }
        this.u = l();
        u(z);
        r(dx0.f);
    }

    public final i52 f() {
        String str;
        f93 f93Var;
        dj djVarK = k();
        if (djVarK == null || (str = djVarK.f) == null || (f93Var = this.w) == null) {
            return null;
        }
        long j = f93Var.a;
        return new i52(str, new f93(g93.a(this.b.r((int) (j >> 32)), this.b.r((int) (j & 4294967295L)))));
    }

    public final c12 g() {
        return (c12) this.s.getValue();
    }

    public final boolean h() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final boolean i() {
        return ((Boolean) this.n.getValue()).booleanValue();
    }

    public final long j(boolean z) {
        y83 y83VarD;
        long j;
        me1 me1Var = this.d;
        if (me1Var == null || (y83VarD = me1Var.d()) == null) {
            return 9205357640488583168L;
        }
        x83 x83Var = y83VarD.a;
        dj djVarK = k();
        if (djVarK == null) {
            return 9205357640488583168L;
        }
        if (!o51.f(djVarK.f, x83Var.a.a.f)) {
            return 9205357640488583168L;
        }
        f83 f83VarL = l();
        if (z) {
            long j2 = f83VarL.b;
            int i = f93.c;
            j = j2 >> 32;
        } else {
            long j3 = f83VarL.b;
            int i2 = f93.c;
            j = j3 & 4294967295L;
        }
        return k93.h(x83Var, this.b.r((int) j), z, f93.g(l().b));
    }

    public final dj k() {
        me1 me1Var = this.d;
        if (me1Var != null) {
            return (dj) me1Var.a.b;
        }
        return null;
    }

    public final f83 l() {
        return (f83) this.e.getValue();
    }

    public final void m() {
        Job job;
        o63 o63Var = (o63) this.y.f;
        if (o63Var == null || (job = o63Var.y) == null) {
            return;
        }
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        o63Var.y = null;
    }

    public final void n(f93 f93Var) {
        dj djVarK;
        String str;
        CoroutineScope coroutineScope;
        if (f93Var == null) {
            return;
        }
        long j = f93Var.a;
        z82 z82Var = this.j;
        if (z82Var == null || (djVarK = k()) == null || (str = djVarK.f) == null) {
            return;
        }
        e12 e12Var = this.b;
        long jA = g93.a(e12Var.r((int) (j >> 32)), e12Var.r((int) (j & 4294967295L)));
        if (str.length() <= 0 || f93.c(jA) || (coroutineScope = this.i) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new y50(z82Var, str, jA, f93Var, this, e12Var, null), 3, null);
    }

    public final void o() {
        CoroutineScope coroutineScope = this.i;
        if (coroutineScope != null) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new s73(this, null, 2), 1, null);
        }
    }

    public final void p(c12 c12Var) {
        this.s.setValue(c12Var);
    }

    public final void q(bx0 bx0Var) {
        this.r.setValue(bx0Var);
    }

    public final void r(dx0 dx0Var) {
        me1 me1Var = this.d;
        if (me1Var != null) {
            if (me1Var.a() == dx0Var) {
                me1Var = null;
            }
            if (me1Var != null) {
                me1Var.k.setValue(dx0Var);
            }
        }
    }

    public final void s() {
        me1 me1Var;
        nx2 nx2VarK = wc0.K();
        lu0 lu0VarE = nx2VarK != null ? nx2VarK.e() : null;
        nx2 nx2VarS = wc0.S(nx2VarK);
        try {
            if (!i() || ((me1Var = this.d) != null && !((Boolean) me1Var.q.getValue()).booleanValue())) {
                wc0.g0(nx2VarK, nx2VarS, lu0VarE);
            } else {
                wc0.g0(nx2VarK, nx2VarS, lu0VarE);
                this.y.j();
            }
        } catch (Throwable th) {
            wc0.g0(nx2VarK, nx2VarS, lu0VarE);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(r60 r60Var) {
        w73 w73Var;
        if (r60Var instanceof w73) {
            w73Var = (w73) r60Var;
            int i = w73Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                w73Var.h = i - Integer.MIN_VALUE;
            } else {
                w73Var = new w73(this, r60Var);
            }
        } else {
            w73Var = new w73(this, r60Var);
        }
        Object objValueOf = w73Var.f;
        int i2 = w73Var.h;
        if (i2 == 0) {
            ee0.J(objValueOf);
            zx zxVar = this.h;
            if (zxVar != null) {
                w73Var.e = this;
                w73Var.h = 1;
                ClipDescription primaryClipDescription = ((ja) zxVar).a.a().getPrimaryClipDescription();
                objValueOf = Boolean.valueOf(primaryClipDescription != null && primaryClipDescription.hasMimeType("text/*"));
                Object obj = z70.e;
                if (objValueOf == obj) {
                    return obj;
                }
            }
            return mf3.a;
        }
        if (i2 != 1) {
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = w73Var.e;
        ee0.J(objValueOf);
        Boolean bool = (Boolean) objValueOf;
        bool.getClass();
        this.x.setValue(bool);
        return mf3.a;
    }

    public final void u(boolean z) {
        me1 me1Var = this.d;
        if (me1Var != null) {
            me1Var.l.setValue(Boolean.valueOf(z));
        }
        if (z) {
            s();
        } else {
            m();
        }
    }

    public final long v(f83 f83Var, long j, boolean z, boolean z2, yp2 yp2Var, boolean z3, kx0 kx0Var) {
        y83 y83VarD;
        long j2;
        xp2 xp2Var;
        boolean z4;
        boolean z5;
        jx0 jx0Var;
        int i;
        me1 me1Var = this.d;
        if (me1Var == null || (y83VarD = me1Var.d()) == null) {
            return f93.b;
        }
        e12 e12Var = this.b;
        long j3 = f83Var.b;
        dj djVar = f83Var.a;
        int i2 = f93.c;
        long jA = g93.a(e12Var.r((int) (j3 >> 32)), this.b.r((int) (j3 & 4294967295L)));
        int iB = y83VarD.b(j, false);
        int i3 = (z2 || z) ? iB : (int) (jA >> 32);
        int i4 = (!z2 || z) ? iB : (int) (jA & 4294967295L);
        yv2 yv2Var = this.v;
        int i5 = (z || yv2Var == null || (i = this.t) == -1) ? -1 : i;
        x83 x83Var = y83VarD.a;
        if (z) {
            j2 = 4294967295L;
            xp2Var = null;
        } else {
            j2 = 4294967295L;
            int i6 = (int) (jA >> 32);
            wp2 wp2Var = new wp2(hd0.F(x83Var, i6), i6, 1L);
            int i7 = (int) (jA & 4294967295L);
            xp2Var = new xp2(wp2Var, new wp2(hd0.F(x83Var, i7), i7, 1L), f93.g(jA));
        }
        yv2 yv2Var2 = new yv2(z2, 1, 1, xp2Var, new qp2(1L, 1, i3, i4, i5, x83Var));
        if (!yv2Var2.g(yv2Var)) {
            return j3;
        }
        this.v = yv2Var2;
        this.t = iB;
        xp2 xp2VarA = yp2Var.a(yv2Var2);
        long jA2 = g93.a(this.b.n(xp2VarA.a.b), this.b.n(xp2VarA.b.b));
        if (f93.b(jA2, j3)) {
            return j3;
        }
        boolean z6 = f93.g(jA2) != f93.g(j3) && f93.b(g93.a((int) (jA2 & j2), (int) (jA2 >> 32)), j3);
        boolean z7 = f93.c(jA2) && f93.c(j3);
        if (z3 && djVar.f.length() > 0 && !z6 && !z7 && kx0Var != null && (jx0Var = this.k) != null) {
            ((m82) jx0Var).a(kx0Var.a);
        }
        this.c.invoke(b(djVar, jA2));
        this.w = new f93(jA2);
        if (!z3) {
            u(!f93.c(jA2));
        }
        me1 me1Var2 = this.d;
        if (me1Var2 != null) {
            me1Var2.q.setValue(Boolean.valueOf(z3));
        }
        me1 me1Var3 = this.d;
        if (me1Var3 != null) {
            me1Var3.m.setValue(Boolean.valueOf(!f93.c(jA2) && a83.g(this, true)));
        }
        me1 me1Var4 = this.d;
        if (me1Var4 != null) {
            if (f93.c(jA2)) {
                z4 = false;
            } else {
                z4 = false;
                if (a83.g(this, false)) {
                    z5 = true;
                }
                me1Var4.n.setValue(Boolean.valueOf(z5));
            }
            z5 = z4;
            me1Var4.n.setValue(Boolean.valueOf(z5));
        } else {
            z4 = false;
        }
        me1 me1Var5 = this.d;
        if (me1Var5 != null) {
            me1Var5.o.setValue(Boolean.valueOf((f93.c(jA2) && a83.g(this, true)) ? true : z4));
        }
        return jA2;
    }
}
