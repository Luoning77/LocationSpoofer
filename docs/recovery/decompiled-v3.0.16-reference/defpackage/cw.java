package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class cw {
    public final float a;
    public final float b;
    public final float c;

    public cw(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    public final s03 a(boolean z, ix1 ix1Var, f30 f30Var, int i) {
        Object obj;
        oh ohVar;
        Object obj2;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.c0(-1763481333);
        float f = this.a;
        c30 c30Var = d30.a;
        if (ix1Var == null) {
            ov0Var.c0(167751211);
            Object objQ = ov0Var.Q();
            if (objQ == c30Var) {
                obj2 = objQ;
                w52 w52VarH = ke0.H(new td0(f));
                ov0Var.m0(w52VarH);
                obj2 = w52VarH;
            }
            obj2 = objQ;
            ey1 ey1Var = (ey1) obj2;
            ov0Var.p(false);
            ov0Var.p(false);
            return ey1Var;
        }
        ov0Var.c0(167824247);
        ov0Var.p(false);
        Object objQ2 = ov0Var.Q();
        if (objQ2 == c30Var) {
            obj = objQ2;
            fy2 fy2Var = new fy2();
            ov0Var.m0(fy2Var);
            obj = fy2Var;
        }
        obj = objQ2;
        fy2 fy2Var2 = (fy2) obj;
        int i2 = 1;
        boolean z2 = (((i & 112) ^ 48) > 32 && ov0Var.f(ix1Var)) || (i & 48) == 32;
        Object objQ3 = ov0Var.Q();
        q60 q60Var = null;
        Object obj3 = objQ3;
        if (z2 || objQ3 == c30Var) {
            ju juVar = new ju(ix1Var, fy2Var2, q60Var, i2);
            ov0Var.m0(juVar);
            obj3 = juVar;
        }
        oi0.e(ov0Var, (pu0) obj3, ix1Var);
        s41 s41Var = (s41) zy.u0(fy2Var2);
        if (!z || (s41Var instanceof vb2)) {
            f = 0.0f;
        } else if (s41Var instanceof ly0) {
            f = this.b;
        } else if (s41Var instanceof jp0) {
            f = 0.0f;
        } else if (s41Var instanceof mf0) {
            f = this.c;
        }
        Object objQ4 = ov0Var.Q();
        Object obj4 = objQ4;
        if (objQ4 == c30Var) {
            oh ohVar2 = new oh(new td0(f), o51.x0, null, 12);
            ov0Var.m0(ohVar2);
            obj4 = ohVar2;
        }
        oh ohVar3 = (oh) obj4;
        td0 td0Var = new td0(f);
        int i3 = (ov0Var.h(ohVar3) ? 1 : 0) | (ov0Var.c(f) ? 1 : 0) | (((((i & 14) ^ 6) <= 4 || !ov0Var.g(z)) && (i & 6) != 4) ? 0 : 1);
        if ((((i & 896) ^ 384) <= 256 || !ov0Var.f(this)) && (i & 384) != 256) {
            i2 = 0;
        }
        int i4 = i3 | i2 | (ov0Var.h(s41Var) ? 1 : 0);
        Object objQ5 = ov0Var.Q();
        if (i4 != 0 || objQ5 == c30Var) {
            ohVar = ohVar3;
            ku kuVar = new ku(ohVar, f, z, this, s41Var, null, 1);
            ov0Var.m0(kuVar);
            objQ5 = kuVar;
        } else {
            ohVar = ohVar3;
        }
        oi0.e(ov0Var, (pu0) objQ5, td0Var);
        ti tiVar = ohVar.c;
        ov0Var.p(false);
        return tiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof cw)) {
            return false;
        }
        cw cwVar = (cw) obj;
        return td0.b(this.a, cwVar.a) && td0.b(0.0f, 0.0f) && td0.b(0.0f, 0.0f) && td0.b(this.b, cwVar.b) && td0.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + az2.c(this.b, az2.c(0.0f, az2.c(0.0f, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
