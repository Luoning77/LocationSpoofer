package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class jk2 {
    public static final kk2 a = new kk2(am1.e, j9.o);

    public static final kk2 a(io ioVar, or orVar, f30 f30Var, int i) {
        if (ioVar.equals(am1.e) && o51.f(orVar, j9.o)) {
            ov0 ov0Var = (ov0) f30Var;
            ov0Var.c0(-1073830487);
            ov0Var.p(false);
            return a;
        }
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.c0(-1073779616);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && ov0Var2.f(ioVar)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !ov0Var2.f(orVar)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objQ = ov0Var2.Q();
        if (z3 || objQ == d30.a) {
            objQ = new kk2(ioVar, orVar);
            ov0Var2.m0(objQ);
        }
        kk2 kk2Var = (kk2) objQ;
        ov0Var2.p(false);
        return kk2Var;
    }
}
