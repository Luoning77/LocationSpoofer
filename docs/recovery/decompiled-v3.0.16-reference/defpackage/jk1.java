package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface jk1 {
    pa1 c(pa1 pa1Var);

    default long h(pa1 pa1Var, pa1 pa1Var2) {
        pa1 pa1VarC = c(pa1Var);
        pa1 pa1VarC2 = c(pa1Var2);
        if (pa1VarC instanceof fk1) {
            return ((fk1) pa1VarC).i0(pa1VarC2, 0L, true);
        }
        return pa1VarC2 instanceof fk1 ? ((fk1) pa1VarC2).i0(pa1VarC, 0L, true) ^ (-9223372034707292160L) : pa1VarC.i0(pa1VarC, 0L, true);
    }
}
