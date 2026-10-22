package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hq extends cv1 implements hg0, z02, hs2 {
    public vd0 A;
    public long s;
    public st t;
    public float u;
    public au2 v;
    public long w;
    public qa1 x;
    public vd0 y;
    public au2 z;

    @Override // defpackage.hs2
    public final boolean A() {
        return false;
    }

    @Override // defpackage.hs2
    public final void J0(ss2 ss2Var) {
        qs2.d(ss2Var, this.v);
    }

    @Override // defpackage.z02
    public final void f0() {
        this.w = 9205357640488583168L;
        this.x = null;
        this.y = null;
        this.z = null;
        ig0.z(this);
    }

    @Override // defpackage.hg0
    public final void j0(jb1 jb1Var) {
        vd0 vd0Var;
        st stVar;
        re reVar;
        xv xvVar = jb1Var.e;
        if (this.v == o51.p0) {
            if (!ye3.a(this.s, hz.g)) {
                jg0.c0(jb1Var, this.s, 0L, 0L, 0.0f, null, 0, 126);
            }
            st stVar2 = this.t;
            if (stVar2 != null) {
                jg0.P0(jb1Var, stVar2, 0L, 0L, this.u, null, 0, 118);
            }
        } else {
            if (cw2.a(xvVar.a(), this.w) && jb1Var.getLayoutDirection() == this.x && o51.f(this.z, this.v)) {
                vd0Var = this.y;
                vd0Var.getClass();
            } else {
                gh0.H(this, new m5(6, this, jb1Var));
                vd0Var = this.A;
                this.A = null;
            }
            this.y = vd0Var;
            this.w = xvVar.a();
            this.x = jb1Var.getLayoutDirection();
            this.z = this.v;
            vd0Var.getClass();
            if (!ye3.a(this.s, hz.g)) {
                ce0.p(jb1Var, vd0Var, this.s);
            }
            st stVar3 = this.t;
            if (stVar3 != null) {
                float f = this.u;
                boolean z = vd0Var instanceof a42;
                en0 en0Var = en0.a;
                if (z) {
                    pe2 pe2Var = ((a42) vd0Var).i;
                    float f2 = pe2Var.a;
                    jb1Var.s(stVar3, (4294967295L & ((long) Float.floatToRawIntBits(pe2Var.b))) | (Float.floatToRawIntBits(f2) << 32), ce0.U(pe2Var), f, en0Var, 3);
                } else {
                    if (vd0Var instanceof b42) {
                        b42 b42Var = (b42) vd0Var;
                        reVar = b42Var.j;
                        if (reVar != null) {
                            stVar = stVar3;
                        } else {
                            stVar = stVar3;
                            aj2 aj2Var = b42Var.i;
                            float f3 = aj2Var.b;
                            float f4 = aj2Var.a;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (aj2Var.h >> 32));
                            jb1Var.w(stVar, (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(aj2Var.c - f4)) << 32) | (((long) Float.floatToRawIntBits(aj2Var.d - f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), f, en0Var);
                        }
                    } else if (!(vd0Var instanceof z32)) {
                        b81.d();
                        return;
                    } else {
                        stVar = stVar3;
                        reVar = ((z32) vd0Var).i;
                    }
                    jb1Var.y(reVar, stVar, f, en0Var, 3);
                }
            }
        }
        jb1Var.c();
    }
}
