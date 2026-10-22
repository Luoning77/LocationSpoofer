package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class b33 implements pu0 {
    public final /* synthetic */ dv1 e;
    public final /* synthetic */ au2 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ float h;
    public final /* synthetic */ is i;
    public final /* synthetic */ float j;
    public final /* synthetic */ p10 k;

    public b33(dv1 dv1Var, au2 au2Var, long j, float f, is isVar, float f2, p10 p10Var) {
        this.e = dv1Var;
        this.f = au2Var;
        this.g = j;
        this.h = f;
        this.i = isVar;
        this.j = f2;
        this.k = p10Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        f30 f30Var = (f30) obj;
        int iIntValue = ((Number) obj2).intValue();
        ov0 ov0Var = (ov0) f30Var;
        boolean zT = ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2);
        mf3 mf3Var = mf3.a;
        if (!zT) {
            ov0Var.W();
            return mf3Var;
        }
        dv1 dv1VarC = e33.c(this.e, this.f, e33.d(this.g, this.h, ov0Var), this.i, ((xb0) ov0Var.j(z30.h)).R(this.j));
        Object objQ = ov0Var.Q();
        c30 c30Var = d30.a;
        if (objQ == c30Var) {
            objQ = new ym2(21);
            ov0Var.m0(objQ);
        }
        dv1 dv1VarA = gs2.a(dv1VarC, false, (lu0) objQ);
        Object objQ2 = ov0Var.Q();
        if (objQ2 == c30Var) {
            objQ2 = xa0.c;
            ov0Var.m0(objQ2);
        }
        dv1 dv1VarA2 = m33.a(dv1VarA, mf3Var, (PointerInputEventHandler) objQ2);
        er1 er1VarC = ws.c(j9.f, true);
        int iT = ks.T(ov0Var);
        l72 l72VarL = ov0Var.l();
        dv1 dv1VarH = xp1.H(ov0Var, dv1VarA2);
        w20.b.getClass();
        x30 x30Var = v20.b;
        ov0Var.g0();
        if (ov0Var.S) {
            ov0Var.k(x30Var);
        } else {
            ov0Var.p0();
        }
        q73.h(ov0Var, v20.e, er1VarC);
        q73.h(ov0Var, v20.d, l72VarL);
        gh ghVar = v20.f;
        if (ov0Var.S || !o51.f(ov0Var.Q(), Integer.valueOf(iT))) {
            az2.r(iT, ov0Var, iT, ghVar);
        }
        q73.h(ov0Var, v20.c, dv1VarH);
        this.k.invoke(ov0Var, 0);
        ov0Var.p(true);
        return mf3Var;
    }
}
