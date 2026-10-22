package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class dk1 extends g82 {
    public final /* synthetic */ int f;
    public final Object g;

    public /* synthetic */ dk1(Object obj, int i) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.xb0
    public final float D() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                return ((ck1) obj).D();
            default:
                return ((db) obj).getDensity().D();
        }
    }

    @Override // defpackage.g82
    public float c(gy0 gy0Var) {
        float fIntBitsToFloat;
        int iY0;
        switch (this.f) {
            case 0:
                pu0 pu0Var = gy0Var.a;
                if (pu0Var != null) {
                    return ((Number) pu0Var.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                ck1 ck1Var = (ck1) this.g;
                if (ck1Var.o) {
                    return Float.NaN;
                }
                ck1 ck1Var2 = ck1Var;
                while (true) {
                    fk fkVar = ck1Var2.q;
                    float f = (fkVar == null || (iY0 = yo.y0((gy0[]) fkVar.c, gy0Var)) < 0) ? Float.NaN : ((float[]) fkVar.d)[iY0];
                    if (!Float.isNaN(f)) {
                        ck1Var2.L0(ck1Var.a1(), gy0Var);
                        pa1 pa1VarV0 = ck1Var2.V0();
                        pa1 pa1VarV1 = ck1Var.V0();
                        switch (gy0Var.b) {
                            case 0:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (pa1VarV1.L(pa1VarV0, (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(((int) (pa1VarV0.f0() >> 32)) / 2.0f)) << 32)) & 4294967295L));
                                break;
                            default:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (pa1VarV1.L(pa1VarV0, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(((int) (pa1VarV0.f0() & 4294967295L)) / 2.0f)))) >> 32));
                                break;
                        }
                        return fIntBitsToFloat;
                    }
                    ck1 ck1VarC1 = ck1Var2.c1();
                    if (ck1VarC1 == null) {
                        ck1Var2.L0(ck1Var.a1(), gy0Var);
                        return Float.NaN;
                    }
                    ck1Var2 = ck1VarC1;
                }
                break;
            default:
                return super.c(gy0Var);
        }
    }

    @Override // defpackage.xb0
    public final float g() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                return ((ck1) obj).g();
            default:
                return ((db) obj).getDensity().g();
        }
    }

    @Override // defpackage.g82
    public final pa1 h() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                ck1 ck1Var = (ck1) obj;
                pa1 pa1VarV0 = ck1Var.o ? null : ck1Var.V0();
                if (pa1VarV0 == null) {
                    ck1Var.a1().L.b();
                }
                return pa1VarV0;
            default:
                return ((db) obj).getRoot().K.d;
        }
    }

    @Override // defpackage.g82
    public final qa1 s() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                return ((ck1) obj).getLayoutDirection();
            default:
                return ((db) obj).getLayoutDirection();
        }
    }

    @Override // defpackage.g82
    public final int w() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                return ((ck1) obj).E0();
            default:
                return ((db) obj).getRoot().L.p.e;
        }
    }
}
