package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class gc1 extends cv1 implements ya1 {
    public static final ec1 v = new ec1();
    public hd1 s;
    public dt t;
    public x32 u;

    public final boolean m1(cc1 cc1Var, int i) {
        if (i != 5 && i != 6) {
            if (i == 3 || i == 4) {
                if (this.u != x32.e) {
                }
            } else if (i != 1 && i != 2) {
                fo.n("Lazy list does not support beyond bounds layout for the specified direction");
                return false;
            }
            if (n1(i) ? cc1Var.a > 0 : cc1Var.b < this.s.a.h().n - 1) {
                return true;
            }
        } else if (this.u != x32.f) {
            if (n1(i)) {
            }
        }
        return false;
    }

    public final boolean n1(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int iOrdinal = xp1.O(this).E.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            b81.d();
            return false;
        }
        if (i != 4) {
            fo.n("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        int iOrdinal2 = xp1.O(this).E.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        b81.d();
        return false;
    }

    @Override // defpackage.ya1
    public final fr1 s(gr1 gr1Var, zq1 zq1Var, long j) {
        h82 h82VarS = zq1Var.s(j);
        return gr1Var.H0(h82VarS.e, h82VarS.f, vj0.e, new gn0(h82VarS, 3));
    }
}
