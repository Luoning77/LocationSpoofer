package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class uv2 extends cv1 implements ya1, hs2 {
    public long A;
    public long B;
    public int C;
    public rr D;
    public q9 E;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public long x;
    public au2 y;
    public boolean z;

    @Override // defpackage.hs2
    public final boolean A() {
        return false;
    }

    @Override // defpackage.hs2
    public final void J0(ss2 ss2Var) {
        if (this.z) {
            qs2.d(ss2Var, this.y);
        }
    }

    @Override // defpackage.cv1
    public final boolean b1() {
        return false;
    }

    @Override // defpackage.ya1
    public final fr1 s(gr1 gr1Var, zq1 zq1Var, long j) {
        h82 h82VarS = zq1Var.s(j);
        return gr1Var.H0(h82VarS.e, h82VarS.f, vj0.e, new ze(10, h82VarS, this));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.s);
        sb.append(", scaleY=");
        sb.append(this.t);
        sb.append(", alpha = ");
        sb.append(this.u);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.v);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=");
        sb.append(this.w);
        sb.append(", transformOrigin=");
        sb.append((Object) ac3.b(this.x));
        sb.append(", shape=");
        sb.append(this.y);
        sb.append(", clip=");
        sb.append(this.z);
        sb.append(", renderEffect=null, ambientShadowColor=");
        p91.u(this.A, sb, ", spotShadowColor=");
        p91.u(this.B, sb, ", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) o51.G(this.C));
        sb.append(", colorFilter=");
        sb.append(this.D);
        sb.append(')');
        return sb.toString();
    }
}
