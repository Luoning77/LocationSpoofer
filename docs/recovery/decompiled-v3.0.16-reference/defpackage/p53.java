package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class p53 extends hv1 {
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
    public final lu0 k;

    public p53(dj djVar, q93 q93Var, lq0 lq0Var, lu0 lu0Var, int i, boolean z, int i2, int i3, List list, lu0 lu0Var2, lu0 lu0Var3) {
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
        this.k = lu0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p53)) {
            return false;
        }
        p53 p53Var = (p53) obj;
        return o51.f(this.a, p53Var.a) && o51.f(this.b, p53Var.b) && o51.f(this.i, p53Var.i) && o51.f(this.c, p53Var.c) && this.d == p53Var.d && this.k == p53Var.k && this.e == p53Var.e && this.f == p53Var.f && this.g == p53Var.g && this.h == p53Var.h && this.j == p53Var.j;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        return new s53(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, null, this.k);
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        boolean z;
        s53 s53Var = (s53) cv1Var;
        q93 q93Var = s53Var.t;
        q93 q93Var2 = this.b;
        if (q93Var2 != q93Var) {
            if (!q93Var2.a.b(q93Var.a)) {
                z = true;
            }
            s53Var.m1(z, s53Var.r1(this.a), s53Var.q1(this.b, this.i, this.h, this.g, this.f, this.c, this.e), s53Var.p1(this.d, this.j, null, this.k));
        }
        q93Var2.getClass();
        z = false;
        s53Var.m1(z, s53Var.r1(this.a), s53Var.q1(this.b, this.i, this.h, this.g, this.f, this.c, this.e), s53Var.p1(this.d, this.j, null, this.k));
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + p91.f(this.b, this.a.hashCode() * 31, 31)) * 31;
        lu0 lu0Var = this.d;
        int iE = (((p91.e(p91.b(this.e, (iHashCode + (lu0Var != null ? lu0Var.hashCode() : 0)) * 31, 31), 31, this.f) + this.g) * 31) + this.h) * 31;
        List list = this.i;
        int iHashCode2 = (iE + (list != null ? list.hashCode() : 0)) * 31;
        lu0 lu0Var2 = this.j;
        int iHashCode3 = (iHashCode2 + (lu0Var2 != null ? lu0Var2.hashCode() : 0)) * 29791;
        lu0 lu0Var3 = this.k;
        return iHashCode3 + (lu0Var3 != null ? lu0Var3.hashCode() : 0);
    }
}
