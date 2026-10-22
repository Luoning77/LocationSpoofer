package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class kk1 implements jk1 {
    @Override // defpackage.jk1
    public final pa1 c(pa1 pa1Var) {
        fk1 fk1Var;
        fk1 fk1Var2 = pa1Var instanceof fk1 ? (fk1) pa1Var : null;
        if (fk1Var2 != null) {
            return fk1Var2;
        }
        xz1 xz1Var = (xz1) pa1Var;
        ek1 ek1VarR1 = xz1Var.r1();
        return (ek1VarR1 == null || (fk1Var = ek1VarR1.v) == null) ? xz1Var : fk1Var;
    }
}
