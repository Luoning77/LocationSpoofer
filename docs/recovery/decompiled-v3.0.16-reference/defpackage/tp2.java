package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class tp2 extends hv1 {
    public final dj a;
    public final q93 b;
    public final lq0 c;
    public final lu0 d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;
    public final List i;
    public final lu0 j;
    public final hq2 k;

    public tp2(dj djVar, q93 q93Var, lq0 lq0Var, lu0 lu0Var, int i, boolean z, int i2, int i3, List list, lu0 lu0Var2, hq2 hq2Var) {
        this.a = djVar;
        this.b = q93Var;
        this.c = lq0Var;
        this.d = lu0Var;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.h = i3;
        this.i = list;
        this.j = lu0Var2;
        this.k = hq2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp2)) {
            return false;
        }
        tp2 tp2Var = (tp2) obj;
        return o51.f(this.a, tp2Var.a) && o51.f(this.b, tp2Var.b) && o51.f(this.i, tp2Var.i) && o51.f(this.c, tp2Var.c) && this.d == tp2Var.d && this.e == tp2Var.e && this.f == tp2Var.f && this.g == tp2Var.g && this.h == tp2Var.h && this.j == tp2Var.j && o51.f(this.k, tp2Var.k);
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        return new up2(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        boolean z;
        up2 up2Var = (up2) cv1Var;
        s53 s53Var = up2Var.v;
        q93 q93Var = s53Var.t;
        q93 q93Var2 = this.b;
        if (q93Var2 != q93Var) {
            if (!q93Var2.a.b(q93Var.a)) {
                z = true;
            }
            boolean zR1 = s53Var.r1(this.a);
            boolean zQ1 = up2Var.v.q1(q93Var2, this.i, this.h, this.g, this.f, this.c, this.e);
            lu0 lu0Var = this.d;
            lu0 lu0Var2 = this.j;
            hq2 hq2Var = this.k;
            s53Var.m1(z, zR1, zQ1, s53Var.p1(lu0Var, lu0Var2, hq2Var, null));
            up2Var.u = hq2Var;
            ld0.z(up2Var);
        }
        q93Var2.getClass();
        z = false;
        boolean zR2 = s53Var.r1(this.a);
        boolean zQ2 = up2Var.v.q1(q93Var2, this.i, this.h, this.g, this.f, this.c, this.e);
        lu0 lu0Var3 = this.d;
        lu0 lu0Var4 = this.j;
        hq2 hq2Var2 = this.k;
        s53Var.m1(z, zR2, zQ2, s53Var.p1(lu0Var3, lu0Var4, hq2Var2, null));
        up2Var.u = hq2Var2;
        ld0.z(up2Var);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + p91.f(this.b, this.a.hashCode() * 31, 31)) * 31;
        lu0 lu0Var = this.d;
        int iE = (((p91.e(p91.b(this.e, (iHashCode + (lu0Var != null ? lu0Var.hashCode() : 0)) * 31, 31), 31, this.f) + this.g) * 31) + this.h) * 31;
        List list = this.i;
        int iHashCode2 = (iE + (list != null ? list.hashCode() : 0)) * 31;
        lu0 lu0Var2 = this.j;
        int iHashCode3 = (iHashCode2 + (lu0Var2 != null ? lu0Var2.hashCode() : 0)) * 31;
        hq2 hq2Var = this.k;
        return (iHashCode3 + (hq2Var != null ? hq2Var.hashCode() : 0)) * 961;
    }
}
