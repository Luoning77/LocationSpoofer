package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ys implements er1 {
    public final pr a;
    public final boolean b;

    public ys(pr prVar, boolean z) {
        this.a = prVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys)) {
            return false;
        }
        ys ysVar = (ys) obj;
        return this.a.equals(ysVar.a) && this.b == ysVar.b;
    }

    @Override // defpackage.er1
    public final fr1 g(final gr1 gr1Var, List list, long j) {
        boolean zIsEmpty = list.isEmpty();
        vj0 vj0Var = vj0.e;
        if (zIsEmpty) {
            return gr1Var.H0(l50.j(j), l50.i(j), vj0Var, new v1(20));
        }
        long j2 = this.b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            final zq1 zq1Var = (zq1) list.get(0);
            zq1Var.A();
            final h82 h82VarS = zq1Var.s(j2);
            final int iMax = Math.max(l50.j(j), h82VarS.e);
            final int iMax2 = Math.max(l50.i(j), h82VarS.f);
            return gr1Var.H0(iMax, iMax2, vj0Var, new lu0() { // from class: xs
                @Override // defpackage.lu0
                public final Object invoke(Object obj) {
                    ws.d((g82) obj, h82VarS, zq1Var, gr1Var.getLayoutDirection(), iMax, iMax2, this.a);
                    return mf3.a;
                }
            });
        }
        h82[] h82VarArr = new h82[list.size()];
        ue2 ue2Var = new ue2();
        ue2Var.e = l50.j(j);
        ue2 ue2Var2 = new ue2();
        ue2Var2.e = l50.i(j);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            zq1 zq1Var2 = (zq1) list.get(i);
            zq1Var2.A();
            h82 h82VarS2 = zq1Var2.s(j2);
            h82VarArr[i] = h82VarS2;
            ue2Var.e = Math.max(ue2Var.e, h82VarS2.e);
            ue2Var2.e = Math.max(ue2Var2.e, h82VarS2.f);
        }
        return gr1Var.H0(ue2Var.e, ue2Var2.e, vj0Var, new x2(h82VarArr, list, gr1Var, ue2Var, ue2Var2, this));
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ')';
    }
}
