package defpackage;

import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class lt extends cv1 implements bt, na1 {
    public a60 s;
    public boolean t;

    public static final pe2 m1(lt ltVar, xz1 xz1Var, ta taVar) {
        pe2 pe2Var;
        if (ltVar.r && ltVar.t) {
            xz1 xz1VarN = xp1.N(ltVar);
            if (!xz1Var.t1().r) {
                xz1Var = null;
            }
            if (xz1Var != null && (pe2Var = (pe2) taVar.invoke()) != null) {
                return pe2Var.j(xz1VarN.d0(xz1Var, false).e());
            }
        }
        return null;
    }

    @Override // defpackage.bt
    public final Object E0(xz1 xz1Var, ta taVar, r60 r60Var) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new kt(this, xz1Var, taVar, new a6(this, xz1Var, taVar, 4), null), r60Var);
        return objCoroutineScope == z70.e ? objCoroutineScope : mf3.a;
    }

    @Override // defpackage.na1
    public final void G(pa1 pa1Var) {
        this.t = true;
    }

    @Override // defpackage.cv1
    public final boolean b1() {
        return false;
    }
}
