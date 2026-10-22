package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hn0 extends cv1 implements ya1 {
    public vc0 s;
    public float t;

    @Override // defpackage.ya1
    public final fr1 s(gr1 gr1Var, zq1 zq1Var, long j) {
        int iJ;
        int iH;
        int iG;
        int i;
        if (!l50.d(j) || this.s == vc0.e) {
            iJ = l50.j(j);
            iH = l50.h(j);
        } else {
            int iRound = Math.round(l50.h(j) * this.t);
            int iJ2 = l50.j(j);
            iJ = l50.h(j);
            if (iRound < iJ2) {
                iRound = iJ2;
            }
            if (iRound <= iJ) {
                iJ = iRound;
            }
            iH = iJ;
        }
        if (!l50.c(j) || this.s == vc0.f) {
            int i2 = l50.i(j);
            int iG2 = l50.g(j);
            iG = i2;
            i = iG2;
        } else {
            int iRound2 = Math.round(l50.g(j) * this.t);
            int i3 = l50.i(j);
            iG = l50.g(j);
            if (iRound2 < i3) {
                iRound2 = i3;
            }
            if (iRound2 <= iG) {
                iG = iRound2;
            }
            i = iG;
        }
        h82 h82VarS = zq1Var.s(m50.a(iJ, iH, iG, i));
        return gr1Var.H0(h82VarS.e, h82VarS.f, vj0.e, new gn0(h82VarS, 0));
    }
}
