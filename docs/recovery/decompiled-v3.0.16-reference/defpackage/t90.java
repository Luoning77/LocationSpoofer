package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class t90 implements oi {
    public final mn2 a;
    public final qd3 b;
    public final Object c;
    public final yi d;
    public final yi e;
    public final yi f;
    public final Object g;
    public final long h;

    public t90(u90 u90Var, qd3 qd3Var, Object obj, yi yiVar) {
        mn2 mn2Var = new mn2(u90Var.a);
        this.a = mn2Var;
        this.b = qd3Var;
        this.c = obj;
        yi yiVar2 = (yi) qd3Var.a.invoke(obj);
        this.d = yiVar2;
        this.e = xp1.r(yiVar);
        lu0 lu0Var = qd3Var.b;
        yi yiVarC = (yi) mn2Var.h;
        if (yiVarC == null) {
            yiVarC = yiVar2.c();
            mn2Var.h = yiVarC;
        }
        int iB = yiVarC.b();
        int i = 0;
        while (true) {
            yi yiVar3 = (yi) mn2Var.h;
            if (i >= iB) {
                if (yiVar3 == null) {
                    o51.F("targetVector");
                    throw null;
                }
                this.g = lu0Var.invoke(yiVar3);
                mn2 mn2Var2 = this.a;
                yi yiVar4 = this.d;
                yi yiVarC2 = (yi) mn2Var2.g;
                if (yiVarC2 == null) {
                    yiVarC2 = yiVar4.c();
                    mn2Var2.g = yiVarC2;
                }
                int iB2 = yiVarC2.b();
                long jMax = 0;
                for (int i2 = 0; i2 < iB2; i2++) {
                    us1 us1Var = (us1) mn2Var2.e;
                    yiVar4.getClass();
                    jMax = Math.max(jMax, ((long) (Math.exp(((sn0) us1Var.f).b(yiVar.a(i2)) / (((double) tn0.a) - 1.0d)) * 1000.0d)) * 1000000);
                }
                this.h = jMax;
                yi yiVarR = xp1.r(this.a.n(jMax, this.d, yiVar));
                this.f = yiVarR;
                int iB3 = yiVarR.b();
                for (int i3 = 0; i3 < iB3; i3++) {
                    yi yiVar5 = this.f;
                    float fA = yiVar5.a(i3);
                    this.a.getClass();
                    this.a.getClass();
                    yiVar5.e(i3, mh0.u(fA, -0.0f, 0.0f));
                }
                return;
            }
            if (yiVar3 == null) {
                o51.F("targetVector");
                throw null;
            }
            us1 us1Var2 = (us1) mn2Var.e;
            float fA2 = yiVar2.a(i);
            float fA3 = yiVar.a(i);
            sn0 sn0Var = (sn0) us1Var2.f;
            double dB = sn0Var.b(fA3);
            double d = tn0.a;
            yiVar3.e(i, (Math.signum(fA3) * ((float) (Math.exp((d / (d - 1.0d)) * dB) * ((double) (sn0Var.a * sn0Var.b))))) + fA2);
            i++;
            mn2Var = mn2Var;
            iB = iB;
        }
    }

    @Override // defpackage.oi
    public final boolean a() {
        return false;
    }

    @Override // defpackage.oi
    public final Object b(long j) {
        if (g(j)) {
            return this.g;
        }
        lu0 lu0Var = this.b.b;
        mn2 mn2Var = this.a;
        yi yiVarC = (yi) mn2Var.f;
        yi yiVar = this.d;
        if (yiVarC == null) {
            yiVarC = yiVar.c();
            mn2Var.f = yiVarC;
        }
        int iB = yiVarC.b();
        int i = 0;
        while (true) {
            yi yiVar2 = (yi) mn2Var.f;
            if (i >= iB) {
                if (yiVar2 != null) {
                    return lu0Var.invoke(yiVar2);
                }
                o51.F("valueVector");
                throw null;
            }
            if (yiVar2 == null) {
                o51.F("valueVector");
                throw null;
            }
            us1 us1Var = (us1) mn2Var.e;
            float fA = yiVar.a(i);
            long j2 = j / 1000000;
            rn0 rn0VarA = ((sn0) us1Var.f).a(this.e.a(i));
            long j3 = rn0VarA.c;
            yiVar2.e(i, (Math.signum(rn0VarA.a) * rn0VarA.b * vc.a(j3 > 0 ? j2 / j3 : 1.0f).a) + fA);
            i++;
        }
    }

    @Override // defpackage.oi
    public final long c() {
        return this.h;
    }

    @Override // defpackage.oi
    public final qd3 d() {
        return this.b;
    }

    @Override // defpackage.oi
    public final Object e() {
        return this.g;
    }

    @Override // defpackage.oi
    public final yi f(long j) {
        if (g(j)) {
            return this.f;
        }
        return this.a.n(j, this.d, this.e);
    }
}
