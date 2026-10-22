package defpackage;

import android.view.View;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class rk1 extends cv1 implements aw0, hg0, hs2, z02 {
    public q82 A;
    public View B;
    public xb0 C;
    public p82 D;
    public fc0 F;
    public p41 H;
    public Channel I;
    public lu0 s;
    public lu0 t;
    public float u = Float.NaN;
    public boolean v = true;
    public long w = 9205357640488583168L;
    public float x = Float.NaN;
    public float y = Float.NaN;
    public boolean z = true;
    public final w52 E = new w52(null, j9.W);
    public long G = 9205357640488583168L;

    public rk1(lu0 lu0Var, lu0 lu0Var2, q82 q82Var) {
        this.s = lu0Var;
        this.t = lu0Var2;
        this.A = q82Var;
    }

    @Override // defpackage.hs2
    public final void J0(ss2 ss2Var) {
        ss2Var.a(sk1.a, new qk1(this, 1));
    }

    @Override // defpackage.aw0
    public final void L(xz1 xz1Var) {
        this.E.setValue(xz1Var);
    }

    @Override // defpackage.cv1
    public final void e1() {
        f0();
        this.I = ChannelKt.Channel$default(0, null, null, 7, null);
        BuildersKt__Builders_commonKt.launch$default(a1(), null, CoroutineStart.UNDISPATCHED, new d6(this, (q60) null, 8), 1, null);
    }

    @Override // defpackage.z02
    public final void f0() {
        gh0.H(this, new qk1(this, 0));
    }

    @Override // defpackage.cv1
    public final void f1() {
        p82 p82Var = this.D;
        if (p82Var != null) {
            ((r82) p82Var).b();
        }
        this.D = null;
    }

    @Override // defpackage.hg0
    public final void j0(jb1 jb1Var) {
        jb1Var.c();
        Channel channel = this.I;
        if (channel != null) {
            ChannelResult.m46boximpl(channel.mo32trySendJP2dKIU(mf3.a));
        }
    }

    public final long m1() {
        fc0 fc0VarB = this.F;
        if (fc0VarB == null) {
            fc0VarB = by2.b(new qk1(this, 2));
            this.F = fc0VarB;
        }
        return ((c12) fc0VarB.getValue()).a;
    }

    public final void n1() {
        p82 p82Var = this.D;
        if (p82Var != null) {
            ((r82) p82Var).b();
        }
        View viewN = this.B;
        if (viewN == null) {
            viewN = xq1.N(this);
        }
        View view = viewN;
        this.B = view;
        xb0 xb0Var = this.C;
        if (xb0Var == null) {
            xb0Var = xp1.O(this).D;
        }
        xb0 xb0Var2 = xb0Var;
        this.C = xb0Var2;
        this.D = this.A.b(view, this.v, this.w, this.x, this.y, this.z, xb0Var2, this.u);
        p1();
    }

    public final void o1() {
        xb0 xb0Var = this.C;
        if (xb0Var == null) {
            xb0Var = xp1.O(this).D;
            this.C = xb0Var;
        }
        long j = ((c12) this.s.invoke(xb0Var)).a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & m1()) == 9205357640488583168L) {
            this.G = 9205357640488583168L;
            p82 p82Var = this.D;
            if (p82Var != null) {
                ((r82) p82Var).b();
                return;
            }
            return;
        }
        this.G = c12.e(m1(), j);
        if (this.D == null) {
            n1();
        }
        p82 p82Var2 = this.D;
        if (p82Var2 != null) {
            p82Var2.a(this.G, 9205357640488583168L, this.u);
        }
        p1();
    }

    public final void p1() {
        xb0 xb0Var;
        p82 p82Var = this.D;
        if (p82Var == null || (xb0Var = this.C) == null) {
            return;
        }
        r82 r82Var = (r82) p82Var;
        if (p41.a(r82Var.c(), this.H)) {
            return;
        }
        lu0 lu0Var = this.t;
        if (lu0Var != null) {
            lu0Var.invoke(new xd0(xb0Var.P(mc0.J(r82Var.c()))));
        }
        this.H = new p41(r82Var.c());
    }
}
