package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class yz implements er1, hk2 {
    public final ko a;
    public final nr b;

    public yz(ko koVar, nr nrVar) {
        this.a = koVar;
        this.b = nrVar;
    }

    @Override // defpackage.hk2
    public final fr1 a(final h82[] h82VarArr, final gr1 gr1Var, final int[] iArr, int i, final int i2) {
        return gr1Var.H0(i2, i, vj0.e, new lu0() { // from class: xz
            @Override // defpackage.lu0
            public final Object invoke(Object obj) {
                g82 g82Var = (g82) obj;
                h82[] h82VarArr2 = h82VarArr;
                int length = h82VarArr2.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    h82 h82Var = h82VarArr2[i3];
                    int i5 = i4 + 1;
                    h82Var.getClass();
                    Object objA = h82Var.A();
                    ik2 ik2Var = objA instanceof ik2 ? (ik2) objA : null;
                    qa1 layoutDirection = gr1Var.getLayoutDirection();
                    d80 d80Var = ik2Var != null ? ik2Var.c : null;
                    int i6 = i2;
                    g82.z(g82Var, h82Var, d80Var != null ? d80Var.a.a(h82Var.e, i6, layoutDirection) : this.b.a(h82Var.e, i6, layoutDirection), iArr[i4]);
                    i3++;
                    i4 = i5;
                }
                return mf3.a;
            }
        });
    }

    @Override // defpackage.er1
    public final int b(g51 g51Var, List list, int i) {
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
            int iW = zq1Var.w(i);
            if (fD == 0.0f) {
                i2 += iW;
            } else if (fD > 0.0f) {
                f += fD;
                iMax = Math.max(iMax, Math.round(iW / fD));
            }
        }
        return ((list.size() - 1) * iN0) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.hk2
    public final void c(int i, gr1 gr1Var, int[] iArr, int[] iArr2) {
        this.a.h(i, gr1Var, iArr, iArr2);
    }

    @Override // defpackage.er1
    public final int d(g51 g51Var, List list, int i) {
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
                int iMin2 = Math.min(zq1Var.w(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, zq1Var.s0(iMin2));
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
                iMax = Math.max(iMax, zq1Var2.s0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fD2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.hk2
    public final long e(int i, int i2, int i3, boolean z) {
        return !z ? m50.a(0, i3, i, i2) : da0.s(0, i3, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz)) {
            return false;
        }
        yz yzVar = (yz) obj;
        return this.a.equals(yzVar.a) && this.b.equals(yzVar.b);
    }

    @Override // defpackage.hk2
    public final int f(h82 h82Var) {
        return h82Var.e;
    }

    @Override // defpackage.er1
    public final fr1 g(gr1 gr1Var, List list, long j) {
        return ig0.E(this, l50.i(j), l50.j(j), l50.g(j), l50.h(j), gr1Var.n0(this.a.a()), gr1Var, list, new h82[list.size()], list.size());
    }

    @Override // defpackage.er1
    public final int h(g51 g51Var, List list, int i) {
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
            int iU0 = zq1Var.u0(i);
            if (fD == 0.0f) {
                i2 += iU0;
            } else if (fD > 0.0f) {
                f += fD;
                iMax = Math.max(iMax, Math.round(iU0 / fD));
            }
        }
        return ((list.size() - 1) * iN0) + Math.round(iMax * f) + i2;
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.hk2
    public final int i(h82 h82Var) {
        return h82Var.f;
    }

    @Override // defpackage.er1
    public final int j(g51 g51Var, List list, int i) {
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
                int iMin2 = Math.min(zq1Var.w(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, zq1Var.j0(iMin2));
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
                iMax = Math.max(iMax, zq1Var2.j0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fD2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + this.b + ')';
    }
}
