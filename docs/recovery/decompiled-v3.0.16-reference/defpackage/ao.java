package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ao implements yn, gr1, jk1 {
    public final bb1 e;
    public ju2 f;
    public boolean g;

    public ao(bb1 bb1Var, ju2 ju2Var) {
        this.e = bb1Var;
        this.f = ju2Var;
    }

    @Override // defpackage.xb0
    public final long A0(long j) {
        return this.e.A0(j);
    }

    @Override // defpackage.xb0
    public final float D() {
        return this.e.D();
    }

    @Override // defpackage.xb0
    public final float G0(long j) {
        return this.e.G0(j);
    }

    @Override // defpackage.gr1
    public final fr1 H0(int i, int i2, Map map, lu0 lu0Var) {
        return this.e.m0(i, i2, map, null, lu0Var);
    }

    @Override // defpackage.g51
    public final boolean J() {
        return false;
    }

    @Override // defpackage.xb0
    public final long O(float f) {
        return this.e.O(f);
    }

    @Override // defpackage.xb0
    public final long P(long j) {
        return this.e.P(j);
    }

    @Override // defpackage.xb0
    public final long Q0(float f) {
        return this.e.Q0(f);
    }

    @Override // defpackage.xb0
    public final float R(float f) {
        return this.e.g() * f;
    }

    @Override // defpackage.xb0
    public final float U0(int i) {
        return this.e.U0(i);
    }

    @Override // defpackage.xb0
    public final float X0(float f) {
        return f / this.e.g();
    }

    @Override // defpackage.jk1
    public final pa1 c(pa1 pa1Var) {
        fk1 fk1Var;
        if (pa1Var instanceof fk1) {
            return pa1Var;
        }
        if (pa1Var instanceof xz1) {
            ek1 ek1VarR1 = ((xz1) pa1Var).r1();
            return (ek1VarR1 == null || (fk1Var = ek1VarR1.v) == null) ? pa1Var : fk1Var;
        }
        p21.b("Unsupported LayoutCoordinates");
        fo.d();
        return null;
    }

    @Override // defpackage.xb0
    public final float e0(long j) {
        return this.e.e0(j);
    }

    @Override // defpackage.xb0
    public final float g() {
        return this.e.g();
    }

    @Override // defpackage.g51
    public final qa1 getLayoutDirection() {
        return this.e.s.E;
    }

    @Override // defpackage.gr1
    public final fr1 m0(int i, int i2, Map map, lu0 lu0Var, lu0 lu0Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            p21.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new zn(i, i2, map, lu0Var, lu0Var2, this, 0);
    }

    @Override // defpackage.xb0
    public final int n0(float f) {
        return this.e.n0(f);
    }
}
