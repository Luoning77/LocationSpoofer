package defpackage;

import java.util.List;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class fj implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ fj(List list, int i, pq1 pq1Var) {
        this.e = 4;
        this.h = list;
        this.f = i;
        this.g = pq1Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        int i2 = this.f;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                hj.a((dj) obj4, (List) obj3, (f30) obj, wc0.m0(1 | i2));
                return mf3Var;
            case 1:
                ((Integer) obj2).getClass();
                ((p10) obj4).g(obj3, (f30) obj, 1 | wc0.m0(i2));
                return mf3Var;
            case 2:
                ((Integer) obj2).intValue();
                k22.b((kk) obj4, (pu0) obj3, (f30) obj, wc0.m0(1 | i2));
                return mf3Var;
            case 3:
                ((Integer) obj2).getClass();
                k22.c((kk[]) obj4, (pu0) obj3, (f30) obj, wc0.m0(1 | i2));
                return mf3Var;
            case 4:
                List list = (List) obj3;
                pq1 pq1Var = (pq1) obj4;
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                    return mf3Var;
                }
                av1 av1Var = av1.a;
                dv1 dv1VarE = zm3.E(av1Var, 10.0f, 8.0f);
                yz yzVarA = wz.a(new jo(2.0f, true, new fo(0)), j9.r, ov0Var, 6);
                int iHashCode = Long.hashCode(ov0Var.T);
                l72 l72VarL = ov0Var.l();
                dv1 dv1VarH = xp1.H(ov0Var, dv1VarE);
                w20.b.getClass();
                x30 x30Var = v20.b;
                ov0Var.g0();
                if (ov0Var.S) {
                    ov0Var.k(x30Var);
                } else {
                    ov0Var.p0();
                }
                gh ghVar = v20.e;
                q73.h(ov0Var, ghVar, yzVarA);
                gh ghVar2 = v20.d;
                q73.h(ov0Var, ghVar2, l72VarL);
                Integer numValueOf = Integer.valueOf(iHashCode);
                gh ghVar3 = v20.f;
                q73.h(ov0Var, ghVar3, numValueOf);
                wa waVar = v20.g;
                q73.g(ov0Var, waVar);
                gh ghVar4 = v20.c;
                q73.h(ov0Var, ghVar4, dv1VarH);
                kk2 kk2VarA = jk2.a(am1.e, j9.o, ov0Var, 48);
                int iHashCode2 = Long.hashCode(ov0Var.T);
                l72 l72VarL2 = ov0Var.l();
                dv1 dv1VarH2 = xp1.H(ov0Var, av1Var);
                ov0Var.g0();
                if (ov0Var.S) {
                    ov0Var.k(x30Var);
                } else {
                    ov0Var.p0();
                }
                q73.h(ov0Var, ghVar, kk2VarA);
                q73.h(ov0Var, ghVar2, l72VarL2);
                az2.s(iHashCode2, ov0Var, ghVar3, ov0Var, waVar);
                q73.h(ov0Var, ghVar4, dv1VarH2);
                s83.c(rq1.c((String) (list.size() > 0 ? list.get(0) : "")), new wb1(1.0f, true), ((kz) ov0Var.j(mz.a)).q, v63.c(13), jr0.j, 0L, 0L, 0, false, 0, 0, null, null, null, ov0Var, 1597440, 0, 524200);
                String str = (String) zy.p0(list, i2);
                String str2 = (str == null || l13.k0(str)) ? null : str;
                if (str2 == null) {
                    ov0Var.c0(1219306505);
                } else {
                    ov0Var.c0(1219306506);
                    gh0.h(ov0Var, iw2.o(av1Var, 8.0f));
                    s83.b(str2, null, 0L, v63.c(13), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 24576, 0, 262126);
                }
                ov0Var.p(false);
                ov0Var.p(true);
                ov0Var.c0(-1670916885);
                int i3 = 0;
                for (Object obj5 : list) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        am1.X();
                        throw null;
                    }
                    String strK = (String) obj5;
                    if (i3 != 0 && i3 != i2 && !l13.k0(strK) && !strK.equals("—") && !strK.equals("-")) {
                        String str3 = (String) zy.p0(pq1Var.a, i3);
                        if (str3 == null) {
                            str3 = "";
                        }
                        if (!l13.k0(str3)) {
                            strK = az2.k(str3, "：", strK);
                        }
                        s83.c(rq1.c(strK), null, hz.c(0.7f, ((kz) ov0Var.j(mz.a)).q), v63.c(12), null, 0L, v63.c(17), 0, false, 0, 0, null, null, null, ov0Var, 24576, 48, 522218);
                    }
                    i3 = i4;
                }
                ov0Var.p(false);
                ov0Var.p(true);
                return mf3Var;
            case Logger.WARN /* 5 */:
                ((Integer) obj2).getClass();
                hd0.j((x01) obj4, (au0) obj3, (f30) obj, wc0.m0(1 | i2));
                return mf3Var;
            case Logger.ERROR /* 6 */:
                ((Integer) obj2).getClass();
                s83.a((q93) obj4, (p10) obj3, (f30) obj, wc0.m0(1 | i2));
                return mf3Var;
            default:
                ((Integer) obj2).intValue();
                ((mc3) obj4).a(obj3, (f30) obj, wc0.m0(1 | i2));
                return mf3Var;
        }
    }

    public /* synthetic */ fj(int i, int i2, Object obj, Object obj2) {
        this.e = i2;
        this.g = obj;
        this.h = obj2;
        this.f = i;
    }
}
