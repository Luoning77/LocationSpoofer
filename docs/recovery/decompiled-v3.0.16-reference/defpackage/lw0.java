package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class lw0 extends hv1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final au2 f;
    public final boolean g;
    public final long h;
    public final long i;
    public final rr j;

    public lw0(float f, float f2, float f3, float f4, long j, au2 au2Var, boolean z, long j2, long j3, rr rrVar) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = au2Var;
        this.g = z;
        this.h = j2;
        this.i = j3;
        this.j = rrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lw0)) {
            return false;
        }
        lw0 lw0Var = (lw0) obj;
        if (Float.compare(this.a, lw0Var.a) != 0 || Float.compare(this.b, lw0Var.b) != 0 || Float.compare(this.c, lw0Var.c) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(this.d, lw0Var.d) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(8.0f, 8.0f) != 0 || !ac3.a(this.e, lw0Var.e) || !o51.f(this.f, lw0Var.f) || this.g != lw0Var.g) {
            return false;
        }
        long j = lw0Var.h;
        int i = hz.h;
        return ye3.a(this.h, j) && ye3.a(this.i, lw0Var.i) && o51.f(this.j, lw0Var.j);
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        uv2 uv2Var = new uv2();
        uv2Var.s = this.a;
        uv2Var.t = this.b;
        uv2Var.u = this.c;
        uv2Var.v = this.d;
        uv2Var.w = 8.0f;
        uv2Var.x = this.e;
        uv2Var.y = this.f;
        uv2Var.z = this.g;
        uv2Var.A = this.h;
        uv2Var.B = this.i;
        uv2Var.C = 3;
        uv2Var.D = this.j;
        uv2Var.E = new q9(uv2Var, 26);
        return uv2Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        xz1 xz1Var;
        uv2 uv2Var = (uv2) cv1Var;
        uv2Var.s = this.a;
        uv2Var.t = this.b;
        uv2Var.u = this.c;
        uv2Var.v = this.d;
        uv2Var.w = 8.0f;
        uv2Var.x = this.e;
        uv2Var.y = this.f;
        uv2Var.z = this.g;
        uv2Var.A = this.h;
        uv2Var.B = this.i;
        uv2Var.C = 3;
        uv2Var.D = this.j;
        q9 q9Var = uv2Var.E;
        if (uv2Var.e.r && (xz1Var = xp1.L(uv2Var, 2).v) != null) {
            xz1Var.S1(q9Var, true);
        }
    }

    public final int hashCode() {
        int iC = az2.c(8.0f, az2.c(0.0f, az2.c(0.0f, az2.c(0.0f, az2.c(this.d, az2.c(0.0f, az2.c(0.0f, az2.c(this.c, az2.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = ac3.c;
        int iE = p91.e((this.f.hashCode() + p91.c(iC, 31, this.e)) * 31, 961, this.g);
        int i2 = hz.h;
        int iB = p91.b(3, p91.b(0, p91.c(p91.c(iE, 31, this.h), 31, this.i), 31), 31);
        rr rrVar = this.j;
        return iB + (rrVar != null ? rrVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.a);
        sb.append(", scaleY=");
        sb.append(this.b);
        sb.append(", alpha=");
        sb.append(this.c);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.d);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=");
        sb.append((Object) ac3.b(this.e));
        sb.append(", shape=");
        sb.append(this.f);
        sb.append(", clip=");
        sb.append(this.g);
        sb.append(", renderEffect=null, ambientShadowColor=");
        p91.u(this.h, sb, ", spotShadowColor=");
        sb.append((Object) hz.i(this.i));
        sb.append(", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) o51.G(3));
        sb.append(", colorFilter=");
        sb.append(this.j);
        sb.append(')');
        return sb.toString();
    }
}
