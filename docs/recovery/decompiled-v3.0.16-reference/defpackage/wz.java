package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class wz {
    public static final yz a = new yz(am1.g, j9.r);

    public static final yz a(ko koVar, nr nrVar, f30 f30Var, int i) {
        if (koVar.equals(am1.g) && nrVar.equals(j9.r)) {
            ov0 ov0Var = (ov0) f30Var;
            ov0Var.c0(-1446604504);
            ov0Var.p(false);
            return a;
        }
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.c0(-1446550657);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && ov0Var2.f(koVar)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !ov0Var2.f(nrVar)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objQ = ov0Var2.Q();
        if (z3 || objQ == d30.a) {
            objQ = new yz(koVar, nrVar);
            ov0Var2.m0(objQ);
        }
        yz yzVar = (yz) objQ;
        ov0Var2.p(false);
        return yzVar;
    }
}
