package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qh3 extends oh3 {
    public final String e;
    public final List f;
    public final int g;
    public final st h;
    public final float i;
    public final st j;
    public final float k;
    public final float l;
    public final int m;
    public final int n;
    public final float o;
    public final float p;
    public final float q;
    public final float r;

    public qh3(String str, List list, int i, st stVar, float f, st stVar2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.e = str;
        this.f = list;
        this.g = i;
        this.h = stVar;
        this.i = f;
        this.j = stVar2;
        this.k = f2;
        this.l = f3;
        this.m = i2;
        this.n = i3;
        this.o = f4;
        this.p = f5;
        this.q = f6;
        this.r = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qh3.class != obj.getClass()) {
            return false;
        }
        qh3 qh3Var = (qh3) obj;
        return this.e.equals(qh3Var.e) && o51.f(this.h, qh3Var.h) && this.i == qh3Var.i && o51.f(this.j, qh3Var.j) && this.k == qh3Var.k && this.l == qh3Var.l && this.m == qh3Var.m && this.n == qh3Var.n && this.o == qh3Var.o && this.p == qh3Var.p && this.q == qh3Var.q && this.r == qh3Var.r && this.g == qh3Var.g && o51.f(this.f, qh3Var.f);
    }

    public final int hashCode() {
        int iG = p91.g(this.f, this.e.hashCode() * 31, 31);
        st stVar = this.h;
        int iC = az2.c(this.i, (iG + (stVar != null ? stVar.hashCode() : 0)) * 31, 31);
        st stVar2 = this.j;
        return Integer.hashCode(this.g) + az2.c(this.r, az2.c(this.q, az2.c(this.p, az2.c(this.o, p91.b(this.n, p91.b(this.m, az2.c(this.l, az2.c(this.k, (iC + (stVar2 != null ? stVar2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
