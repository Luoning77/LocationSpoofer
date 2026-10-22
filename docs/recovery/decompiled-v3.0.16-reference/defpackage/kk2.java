package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class kk2 implements er1, hk2 {
    public final io a;
    public final or b;

    public kk2(io ioVar, or orVar) {
        this.a = ioVar;
        this.b = orVar;
    }

    @Override // defpackage.hk2
    public final fr1 a(h82[] h82VarArr, gr1 gr1Var, int[] iArr, int i, int i2) {
        return gr1Var.H0(i, i2, vj0.e, new f9(h82VarArr, this, i2, iArr));
    }

    @Override // defpackage.er1
    public final int b(g51 g51Var, List list, int i) {
        int iN0 = g51Var.n0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iN0, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            zq1 zq1Var = (zq1) list.get(i2);
            float fD = ke0.D(ke0.z(zq1Var));
            if (fD == 0.0f) {
                int iMin2 = Math.min(zq1Var.s0(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, zq1Var.w(iMin2));
            } else if (fD > 0.0f) {
                f += fD;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            zq1 zq1Var2 = (zq1) list.get(i3);
            float fD2 = ke0.D(ke0.z(zq1Var2));
            if (fD2 > 0.0f) {
                iMax = Math.max(iMax, zq1Var2.w(iRound != Integer.MAX_VALUE ? Math.round(iRound * fD2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.hk2
    public final void c(int i, gr1 gr1Var, int[] iArr, int[] iArr2) {
        this.a.g(gr1Var, i, iArr, gr1Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.er1
    public final int d(g51 g51Var, List list, int i) {
        int iN0 = g51Var.n0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            zq1 zq1Var = (zq1) list.get(i3);
            float fD = ke0.D(ke0.z(zq1Var));
            int iS0 = zq1Var.s0(i);
            if (fD == 0.0f) {
                i2 += iS0;
            } else if (fD > 0.0f) {
                f += fD;
                iMax = Math.max(iMax, Math.round(iS0 / fD));
            }
        }
        return ((list.size() - 1) * iN0) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.hk2
    public final long e(int i, int i2, int i3, boolean z) {
        return !z ? m50.a(i, i2, 0, i3) : da0.t(i, i2, 0, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk2)) {
            return false;
        }
        kk2 kk2Var = (kk2) obj;
        return this.a.equals(kk2Var.a) && o51.f(this.b, kk2Var.b);
    }

    @Override // defpackage.hk2
    public final int f(h82 h82Var) {
        return h82Var.f;
    }

    @Override // defpackage.er1
    public final fr1 g(gr1 gr1Var, List list, long j) {
        return ig0.E(this, l50.j(j), l50.i(j), l50.h(j), l50.g(j), gr1Var.n0(this.a.a()), gr1Var, list, new h82[list.size()], list.size());
    }

    @Override // defpackage.er1
    public final int h(g51 g51Var, List list, int i) {
        int iN0 = g51Var.n0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iN0, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            zq1 zq1Var = (zq1) list.get(i2);
            float fD = ke0.D(ke0.z(zq1Var));
            if (fD == 0.0f) {
                int iMin2 = Math.min(zq1Var.s0(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, zq1Var.u0(iMin2));
            } else if (fD > 0.0f) {
                f += fD;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            zq1 zq1Var2 = (zq1) list.get(i3);
            float fD2 = ke0.D(ke0.z(zq1Var2));
            if (fD2 > 0.0f) {
                iMax = Math.max(iMax, zq1Var2.u0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fD2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.hk2
    public final int i(h82 h82Var) {
        return h82Var.e;
    }

    @Override // defpackage.er1
    public final int j(g51 g51Var, List list, int i) {
        int iN0 = g51Var.n0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            zq1 zq1Var = (zq1) list.get(i3);
            float fD = ke0.D(ke0.z(zq1Var));
            int iJ0 = zq1Var.j0(i);
            if (fD == 0.0f) {
                i2 += iJ0;
            } else if (fD > 0.0f) {
                f += fD;
                iMax = Math.max(iMax, Math.round(iJ0 / fD));
            }
        }
        return ((list.size() - 1) * iN0) + Math.round(iMax * f) + i2;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ')';
    }
}
