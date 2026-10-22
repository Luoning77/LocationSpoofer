package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class yt2 extends hv1 {
    public final float a;
    public final au2 b;
    public final boolean c;
    public final long d;
    public final long e;

    public yt2(float f, au2 au2Var, boolean z, long j, long j2) {
        this.a = f;
        this.b = au2Var;
        this.c = z;
        this.d = j;
        this.e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yt2)) {
            return false;
        }
        yt2 yt2Var = (yt2) obj;
        if (!td0.b(this.a, yt2Var.a) || !o51.f(this.b, yt2Var.b) || this.c != yt2Var.c) {
            return false;
        }
        long j = yt2Var.d;
        int i = hz.h;
        return ye3.a(this.d, j) && ye3.a(this.e, yt2Var.e);
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        return new tr(new q9(this, 24));
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        xz1 xz1Var;
        tr trVar = (tr) cv1Var;
        q9 q9Var = new q9(this, 24);
        trVar.s = q9Var;
        if (trVar.e.r && (xz1Var = xp1.L(trVar, 2).v) != null) {
            xz1Var.S1(q9Var, true);
        }
    }

    public final int hashCode() {
        int iE = p91.e((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31, 31, this.c);
        int i = hz.h;
        return Long.hashCode(this.e) + p91.c(iE, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) td0.c(this.a));
        sb.append(", shape=");
        sb.append(this.b);
        sb.append(", clip=");
        sb.append(this.c);
        sb.append(", ambientColor=");
        p91.u(this.d, sb, ", spotColor=");
        sb.append((Object) hz.i(this.e));
        sb.append(')');
        return sb.toString();
    }
}
