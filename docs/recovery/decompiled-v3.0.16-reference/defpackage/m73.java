package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class m73 {
    public final dj a;
    public final long b;
    public final x83 c;
    public final e12 d;
    public final e93 e;
    public long f;
    public final dj g;
    public final f83 h;
    public final y83 i;

    public m73(f83 f83Var, e12 e12Var, y83 y83Var, e93 e93Var) {
        dj djVar = f83Var.a;
        long j = f83Var.b;
        x83 x83Var = y83Var != null ? y83Var.a : null;
        this.a = djVar;
        this.b = j;
        this.c = x83Var;
        this.d = e12Var;
        this.e = e93Var;
        this.f = j;
        this.g = djVar;
        this.h = f83Var;
        this.i = y83Var;
    }

    public final List a(lu0 lu0Var) {
        if (!f93.c(this.f)) {
            return am1.G(new h00("", 0), new ot2(f93.f(this.f), f93.f(this.f)));
        }
        ei0 ei0Var = (ei0) lu0Var.invoke(this);
        if (ei0Var != null) {
            return am1.F(ei0Var);
        }
        return null;
    }

    public final Integer b() {
        x83 x83Var = this.c;
        if (x83Var == null) {
            return null;
        }
        sw1 sw1Var = x83Var.b;
        int iE = f93.e(this.f);
        e12 e12Var = this.d;
        return Integer.valueOf(e12Var.n(sw1Var.c(sw1Var.d(e12Var.r(iE)), true)));
    }

    public final Integer c() {
        x83 x83Var = this.c;
        if (x83Var == null) {
            return null;
        }
        int iF = f93.f(this.f);
        e12 e12Var = this.d;
        return Integer.valueOf(e12Var.n(x83Var.g(x83Var.b.d(e12Var.r(iF)))));
    }

    public final Integer d() {
        int length;
        x83 x83Var = this.c;
        if (x83Var == null) {
            return null;
        }
        int iR = r();
        while (true) {
            dj djVar = this.a;
            if (iR < djVar.f.length()) {
                int length2 = this.g.f.length() - 1;
                if (iR <= length2) {
                    length2 = iR;
                }
                long j = x83Var.j(length2);
                int i = f93.c;
                int i2 = (int) (j & 4294967295L);
                if (i2 > iR) {
                    length = this.d.n(i2);
                    break;
                }
                iR++;
            } else {
                length = djVar.f.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer e() {
        int iN;
        x83 x83Var = this.c;
        if (x83Var == null) {
            return null;
        }
        for (int iR = r(); iR > 0; iR--) {
            int length = this.g.f.length() - 1;
            if (iR <= length) {
                length = iR;
            }
            long j = x83Var.j(length);
            int i = f93.c;
            int i2 = (int) (j >> 32);
            if (i2 < iR) {
                iN = this.d.n(i2);
                return Integer.valueOf(iN);
            }
        }
        iN = 0;
        return Integer.valueOf(iN);
    }

    public final boolean f() {
        x83 x83Var = this.c;
        return (x83Var != null ? x83Var.h(r()) : null) != hg2.f;
    }

    public final int g(x83 x83Var, int i) {
        int iR = r();
        e93 e93Var = this.e;
        if (e93Var.a == null) {
            e93Var.a = Float.valueOf(x83Var.c(iR).a);
        }
        sw1 sw1Var = x83Var.b;
        int iD = sw1Var.d(iR) + i;
        if (iD < 0) {
            return 0;
        }
        if (iD >= sw1Var.f) {
            return this.g.f.length();
        }
        float fB = sw1Var.b(iD) - 1.0f;
        Float f = e93Var.a;
        f.getClass();
        float fFloatValue = f.floatValue();
        if ((f() && fFloatValue >= x83Var.f(iD)) || (!f() && fFloatValue <= x83Var.e(iD))) {
            return sw1Var.c(iD, true);
        }
        return this.d.n(sw1Var.g((((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public final int h(y83 y83Var, int i) {
        pe2 pe2VarD0;
        pa1 pa1Var = y83Var.b;
        x83 x83Var = y83Var.a;
        if (pa1Var == null) {
            pe2VarD0 = pe2.e;
        } else {
            pa1 pa1Var2 = y83Var.c;
            pe2VarD0 = pa1Var2 != null ? pa1Var2.d0(pa1Var, true) : null;
            if (pe2VarD0 == null) {
                pe2VarD0 = pe2.e;
            }
        }
        long j = this.h.b;
        int i2 = f93.c;
        e12 e12Var = this.d;
        pe2 pe2VarC = x83Var.c(e12Var.r((int) (j & 4294967295L)));
        float f = pe2VarC.a;
        return e12Var.n(x83Var.b.g((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (pe2VarD0.d() & 4294967295L)) * i) + pe2VarC.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)));
    }

    public final void i() {
        e93 e93Var = this.e;
        e93Var.a = null;
        dj djVar = this.g;
        if (djVar.f.length() > 0) {
            if (f()) {
                k();
                return;
            }
            e93Var.a = null;
            if (djVar.f.length() > 0) {
                String str = djVar.f;
                long j = this.f;
                int i = f93.c;
                int iQ = ce0.q((int) (j & 4294967295L), str);
                if (iQ != -1) {
                    q(iQ, iQ);
                }
            }
        }
    }

    public final void j() {
        this.e.a = null;
        dj djVar = this.g;
        String str = djVar.f;
        String str2 = djVar.f;
        if (str.length() > 0) {
            int iQ = vd0.q(str2, f93.e(this.f));
            if (iQ == f93.e(this.f) && iQ != str2.length()) {
                iQ = vd0.q(str2, iQ + 1);
            }
            q(iQ, iQ);
        }
    }

    public final void k() {
        this.e.a = null;
        dj djVar = this.g;
        if (djVar.f.length() > 0) {
            String str = djVar.f;
            long j = this.f;
            int i = f93.c;
            int iR = ce0.r((int) (j & 4294967295L), str);
            if (iR != -1) {
                q(iR, iR);
            }
        }
    }

    public final void l() {
        this.e.a = null;
        dj djVar = this.g;
        String str = djVar.f;
        String str2 = djVar.f;
        if (str.length() > 0) {
            int iR = vd0.r(str2, f93.f(this.f));
            if (iR == f93.f(this.f) && iR != 0) {
                iR = vd0.r(str2, iR - 1);
            }
            q(iR, iR);
        }
    }

    public final void m() {
        e93 e93Var = this.e;
        e93Var.a = null;
        dj djVar = this.g;
        if (djVar.f.length() > 0) {
            if (!f()) {
                k();
                return;
            }
            e93Var.a = null;
            if (djVar.f.length() > 0) {
                String str = djVar.f;
                long j = this.f;
                int i = f93.c;
                int iQ = ce0.q((int) (j & 4294967295L), str);
                if (iQ != -1) {
                    q(iQ, iQ);
                }
            }
        }
    }

    public final void n() {
        Integer numB;
        this.e.a = null;
        if (this.g.f.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        q(iIntValue, iIntValue);
    }

    public final void o() {
        Integer numC;
        this.e.a = null;
        if (this.g.f.length() <= 0 || (numC = c()) == null) {
            return;
        }
        int iIntValue = numC.intValue();
        q(iIntValue, iIntValue);
    }

    public final void p() {
        if (this.g.f.length() > 0) {
            int i = f93.c;
            this.f = g93.a((int) (this.b >> 32), (int) (this.f & 4294967295L));
        }
    }

    public final void q(int i, int i2) {
        this.f = g93.a(i, i2);
    }

    public final int r() {
        long j = this.f;
        int i = f93.c;
        return this.d.r((int) (j & 4294967295L));
    }
}
