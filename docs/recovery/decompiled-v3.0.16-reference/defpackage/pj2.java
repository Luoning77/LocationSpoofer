package defpackage;

import com.vincenthzr.locationspoofer.data.model.AppState;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class pj2 implements qu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ AppState f;
    public final /* synthetic */ lu0 g;

    public /* synthetic */ pj2(AppState appState, lu0 lu0Var, int i) {
        this.e = i;
        this.f = appState;
        this.g = lu0Var;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        av1 av1Var = av1.a;
        AppState appState = this.f;
        switch (i) {
            case 0:
                f30 f30Var = (f30) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ov0Var.W();
                } else {
                    kk2 kk2VarA = jk2.a(am1.e, j9.p, ov0Var, 48);
                    int iHashCode = Long.hashCode(ov0Var.T);
                    l72 l72VarL = ov0Var.l();
                    dv1 dv1VarH = xp1.H(ov0Var, av1Var);
                    w20.b.getClass();
                    x30 x30Var = v20.b;
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var);
                    } else {
                        ov0Var.p0();
                    }
                    gh ghVar = v20.e;
                    q73.h(ov0Var, ghVar, kk2VarA);
                    gh ghVar2 = v20.d;
                    q73.h(ov0Var, ghVar2, l72VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    gh ghVar3 = v20.f;
                    q73.h(ov0Var, ghVar3, numValueOf);
                    wa waVar = v20.g;
                    q73.g(ov0Var, waVar);
                    gh ghVar4 = v20.c;
                    q73.h(ov0Var, ghVar4, dv1VarH);
                    wb1 wb1Var = new wb1(1.0f, true);
                    yz yzVarA = wz.a(am1.g, j9.r, ov0Var, 0);
                    int iHashCode2 = Long.hashCode(ov0Var.T);
                    l72 l72VarL2 = ov0Var.l();
                    dv1 dv1VarH2 = xp1.H(ov0Var, wb1Var);
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, ghVar, yzVarA);
                    q73.h(ov0Var, ghVar2, l72VarL2);
                    az2.s(iHashCode2, ov0Var, ghVar3, ov0Var, waVar);
                    q73.h(ov0Var, ghVar4, dv1VarH2);
                    String strN = ke0.N(2131624058, ov0Var);
                    long jB = v63.b(15.5d);
                    jr0 jr0Var = jr0.j;
                    hh0 hh0Var = mz.a;
                    s83.b(strN, null, ((kz) ov0Var.j(hh0Var)).q, jB, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597440, 0, 262058);
                    gh0.h(ov0Var, iw2.g(av1Var, 5.0f));
                    s83.b(ke0.N(2131624057, ov0Var), null, hz.c(0.6f, ((kz) ov0Var.j(hh0Var)).q), v63.c(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 24576, 0, 262122);
                    az2.t(ov0Var, true, av1Var, 12.0f, ov0Var);
                    b43.a(appState.getBarometerFluctuation(), this.g, null, false, mc0.m(hz.c, bk.g, 0L, 0L, 0L, 0L, ov0Var, 65532), ov0Var, 0, 92);
                    ov0Var.p(true);
                }
                break;
            default:
                f30 f30Var2 = (f30) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ov0Var2.W();
                } else {
                    x01 x01VarB = wc0.c;
                    if (x01VarB == null) {
                        w01 w01Var = new w01("Rounded.Speed", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i2 = nh3.a;
                        long j = hz.b;
                        qy2 qy2Var = new qy2(j);
                        nx0 nx0Var = new nx0(3);
                        nx0Var.m(19.46f, 10.0f);
                        nx0Var.b(1.0f, 1.0f, false, false, -0.07f, 1.0f);
                        nx0Var.b(7.55f, 7.55f, false, true, 0.52f, 1.81f);
                        nx0Var.b(8.0f, 8.0f, false, true, -0.69f, 4.73f);
                        nx0Var.b(1.0f, 1.0f, false, true, -0.89f, 0.53f);
                        nx0Var.h(5.68f);
                        nx0Var.b(1.0f, 1.0f, false, true, -0.89f, -0.54f);
                        l62 l62Var = new l62(8.0f, 8.0f, 0.0f, false, true, 13.0f, 6.06f);
                        ArrayList arrayList = nx0Var.a;
                        arrayList.add(l62Var);
                        nx0Var.b(7.69f, 7.69f, false, true, 2.11f, 0.56f);
                        nx0Var.b(1.0f, 1.0f, false, false, 1.0f, -0.07f);
                        nx0Var.b(1.0f, 1.0f, false, false, -0.17f, -1.76f);
                        arrayList.add(new l62(10.0f, 10.0f, 0.0f, false, false, 3.35f, 19.0f));
                        nx0Var.b(2.0f, 2.0f, false, false, 1.72f, 1.0f);
                        nx0Var.i(13.85f);
                        nx0Var.b(2.0f, 2.0f, false, false, 1.74f, -1.0f);
                        nx0Var.b(10.0f, 10.0f, false, false, 0.55f, -8.89f);
                        nx0Var.b(1.0f, 1.0f, false, false, -1.75f, -0.11f);
                        nx0Var.e();
                        w01.a(w01Var, arrayList, qy2Var);
                        qy2 qy2Var2 = new qy2(j);
                        ArrayList arrayList2 = new ArrayList(32);
                        arrayList2.add(new q62(10.59f, 12.59f));
                        arrayList2.add(new u62(2.0f, 2.0f, 0.0f, false, false, 2.83f, 2.83f));
                        arrayList2.add(new x62(5.66f, -8.49f));
                        arrayList2.add(m62.c);
                        w01.a(w01Var, arrayList2, qy2Var2);
                        x01VarB = w01Var.b();
                        wc0.c = x01VarB;
                    }
                    x01 x01Var = x01VarB;
                    long j2 = bk.i;
                    sj2.b(x01Var, j2, ke0.N(2131625033, ov0Var2), ke0.N(2131625032, ov0Var2), ov0Var2, 48);
                    gh0.h(ov0Var2, iw2.g(av1Var, 8.0f));
                    boolean zD = ov0Var2.d(appState.getSpeedFluctuationPct());
                    Object objQ = ov0Var2.Q();
                    c30 c30Var = d30.a;
                    if (zD || objQ == c30Var) {
                        objQ = new s52(appState.getSpeedFluctuationPct());
                        ov0Var2.m0(objQ);
                    }
                    s52 s52Var = (s52) objQ;
                    kk2 kk2VarA2 = jk2.a(am1.e, j9.p, ov0Var2, 48);
                    int iHashCode3 = Long.hashCode(ov0Var2.T);
                    l72 l72VarL3 = ov0Var2.l();
                    dv1 dv1VarH3 = xp1.H(ov0Var2, av1Var);
                    w20.b.getClass();
                    x30 x30Var2 = v20.b;
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var2);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, v20.e, kk2VarA2);
                    q73.h(ov0Var2, v20.d, l72VarL3);
                    q73.h(ov0Var2, v20.f, Integer.valueOf(iHashCode3));
                    q73.g(ov0Var2, v20.g);
                    q73.h(ov0Var2, v20.c, dv1VarH3);
                    float fG = s52Var.g();
                    fy fyVar = new fy(0.0f, 30.0f);
                    sw2 sw2Var = sw2.a;
                    mw2 mw2VarD = sw2.d(j2, j2, 0L, ov0Var2, 1020);
                    wb1 wb1Var2 = new wb1(1.0f, true);
                    boolean zF = ov0Var2.f(s52Var);
                    Object objQ2 = ov0Var2.Q();
                    if (zF || objQ2 == c30Var) {
                        objQ2 = new ci1(s52Var, 2);
                        ov0Var2.m0(objQ2);
                    }
                    lu0 lu0Var = (lu0) objQ2;
                    lu0 lu0Var2 = this.g;
                    boolean zF2 = ov0Var2.f(lu0Var2) | ov0Var2.f(s52Var);
                    Object objQ3 = ov0Var2.Q();
                    if (zF2 || objQ3 == c30Var) {
                        objQ3 = new qi2(6, lu0Var2, s52Var);
                        ov0Var2.m0(objQ3);
                    }
                    dx2.a(fG, lu0Var, wb1Var2, false, fyVar, 5, (au0) objQ3, mw2VarD, null, ov0Var2, 196608, 264);
                    gh0.h(ov0Var2, iw2.o(av1Var, 12.0f));
                    s83.b(ke0.O(2131625034, new Object[]{Integer.valueOf(xq1.P(s52Var.g()))}, ov0Var2), iw2.p(2, 0.0f), j2, v63.c(14), jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 1597872, 0, 262056);
                    ov0Var2.p(true);
                }
                break;
        }
        return mf3Var;
    }
}
