package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class tr extends cv1 implements ya1, hs2 {
    public lu0 s;

    public tr(lu0 lu0Var) {
        this.s = lu0Var;
    }

    @Override // defpackage.hs2
    public final boolean A() {
        return false;
    }

    @Override // defpackage.hs2
    public final void J0(ss2 ss2Var) {
        au2 au2Var;
        boolean z;
        xz1 xz1VarL = xp1.L(this, 2);
        if (xz1VarL.L) {
            au2Var = xz1VarL.J;
            z = xz1VarL.K;
        } else {
            ah2 ah2Var = am1.D;
            if (ah2Var == null) {
                am1.D = new ah2();
            } else {
                ah2Var.c();
            }
            ah2 ah2Var2 = am1.D;
            ah2Var2.getClass();
            ah2Var2.t = xz1VarL.s.D;
            ah2Var2.s = mc0.J(xz1VarL.g);
            nx2 nx2VarK = wc0.K();
            lu0 lu0VarE = nx2VarK != null ? nx2VarK.e() : null;
            nx2 nx2VarS = wc0.S(nx2VarK);
            try {
                this.s.invoke(ah2Var2);
                wc0.g0(nx2VarK, nx2VarS, lu0VarE);
                au2Var = ah2Var2.p;
                z = ah2Var2.q;
            } catch (Throwable th) {
                wc0.g0(nx2VarK, nx2VarS, lu0VarE);
                throw th;
            }
        }
        if (z) {
            qs2.d(ss2Var, au2Var);
        }
    }

    @Override // defpackage.cv1
    public final boolean b1() {
        return false;
    }

    @Override // defpackage.ya1
    public final fr1 s(gr1 gr1Var, zq1 zq1Var, long j) {
        h82 h82VarS = zq1Var.s(j);
        return gr1Var.H0(h82VarS.e, h82VarS.f, vj0.e, new ze(7, h82VarS, this));
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.s + ')';
    }
}
