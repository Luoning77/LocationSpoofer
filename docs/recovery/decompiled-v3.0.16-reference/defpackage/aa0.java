package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class aa0 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ aa0(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        av1 av1Var = av1.a;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                f30 f30Var = (f30) obj;
                int iIntValue = ((Number) obj2).intValue();
                mn2 mn2Var = (mn2) obj3;
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    ov0Var.j(AndroidCompositionLocals_androidKt.a);
                    String string = ((Context) ov0Var.j(AndroidCompositionLocals_androidKt.b)).getResources().getString(2131624635);
                    dv1 dv1Var = (dv1) mn2Var.f;
                    b52 b52Var = i9.a;
                    dv1 dv1VarN = iw2.n(dv1Var, 280.0f, 560.0f, 10);
                    boolean zF = ov0Var.f(string);
                    Object objQ = ov0Var.Q();
                    if (zF || objQ == d30.a) {
                        objQ = new z90(string, 0);
                        ov0Var.m0(objQ);
                    }
                    dv1 dv1VarD = dv1VarN.d(gs2.a(av1Var, false, (lu0) objQ));
                    er1 er1VarC = ws.c(j9.f, true);
                    int iT = ks.T(ov0Var);
                    l72 l72VarL = ov0Var.l();
                    dv1 dv1VarH = xp1.H(ov0Var, dv1VarD);
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
                    ((p10) mn2Var.h).invoke(ov0Var, 0);
                    ov0Var.p(true);
                }
                break;
            default:
                f30 f30Var2 = (f30) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ov0Var2.W();
                } else {
                    go goVar = am1.f;
                    or orVar = j9.p;
                    qu0 qu0Var = ((xv2) obj3).f;
                    kk2 kk2VarA = jk2.a(goVar, orVar, ov0Var2, 54);
                    int iT2 = ks.T(ov0Var2);
                    l72 l72VarL2 = ov0Var2.l();
                    dv1 dv1VarH2 = xp1.H(ov0Var2, av1Var);
                    w20.b.getClass();
                    x30 x30Var2 = v20.b;
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var2);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, v20.e, kk2VarA);
                    q73.h(ov0Var2, v20.d, l72VarL2);
                    gh ghVar2 = v20.f;
                    if (ov0Var2.S || !o51.f(ov0Var2.Q(), Integer.valueOf(iT2))) {
                        az2.r(iT2, ov0Var2, iT2, ghVar2);
                    }
                    q73.h(ov0Var2, v20.c, dv1VarH2);
                    qu0Var.invoke(lk2.a, ov0Var2, 6);
                    ov0Var2.p(true);
                }
                break;
        }
        return mf3Var;
    }
}
