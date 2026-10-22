package defpackage;

import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class o2 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ o2(x01 x01Var, String str, boolean z, int i) {
        this.e = 4;
        this.h = x01Var;
        this.g = str;
        this.f = z;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        long j;
        long jC;
        int i = this.e;
        int i2 = 0;
        mf3 mf3Var = mf3.a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        boolean z = this.f;
        switch (i) {
            case 0:
                String str = (String) obj4;
                au0 au0Var = (au0) obj3;
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(1 & iIntValue, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    zj.b(sb.a0(-1026948378, new t2(str), ov0Var), null, sb.a0(1193998116, new u2(i2, au0Var), ov0Var), null, 0.0f, null, k93.k(z ? bk.a : bk.d, ov0Var), ov0Var, 390, 186);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                wo0.d(z, (j52) obj4, (pu0) obj3, (f30) obj, wc0.m0(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ca1.a((ba1) obj4, z, (au0) obj3, (f30) obj, wc0.m0(1));
                break;
            case 3:
                ey1 ey1Var = (ey1) obj4;
                au0 au0Var2 = (au0) obj3;
                f30 f30Var2 = (f30) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ov0Var2.W();
                } else {
                    boolean zF = ov0Var2.f(ey1Var) | ov0Var2.f(au0Var2);
                    Object objQ = ov0Var2.Q();
                    if (zF || objQ == d30.a) {
                        objQ = new rr1(au0Var2, ey1Var, 0);
                        ov0Var2.m0(objQ);
                    }
                    n51.j((au0) objQ, null, !z, null, null, null, xq1.r, ov0Var2, 805306368, 506);
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                ee0.l((x01) obj3, (String) obj4, z, (f30) obj, wc0.m0(1));
                break;
            case Logger.WARN /* 5 */:
                ((Integer) obj2).getClass();
                ee0.c(z, (au0) obj3, (au0) obj4, (f30) obj, wc0.m0(1));
                break;
            default:
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                f30 f30Var3 = (f30) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ov0 ov0Var3 = (ov0) f30Var3;
                if (!ov0Var3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ov0Var3.W();
                } else {
                    dv1 dv1VarF = zm3.F(av1.a, 0.0f, 10.0f, 1);
                    yz yzVarA = wz.a(am1.g, j9.s, ov0Var3, 48);
                    int iHashCode = Long.hashCode(ov0Var3.T);
                    l72 l72VarL = ov0Var3.l();
                    dv1 dv1VarH = xp1.H(ov0Var3, dv1VarF);
                    w20.b.getClass();
                    x30 x30Var = v20.b;
                    ov0Var3.g0();
                    if (ov0Var3.S) {
                        ov0Var3.k(x30Var);
                    } else {
                        ov0Var3.p0();
                    }
                    q73.h(ov0Var3, v20.e, yzVarA);
                    q73.h(ov0Var3, v20.d, l72VarL);
                    q73.h(ov0Var3, v20.f, Integer.valueOf(iHashCode));
                    q73.g(ov0Var3, v20.g);
                    q73.h(ov0Var3, v20.c, dv1VarH);
                    long jC2 = v63.c(13);
                    jr0 jr0Var = z ? jr0.j : jr0.g;
                    if (z) {
                        ov0Var3.c0(195222379);
                        ov0Var3.p(false);
                        j = bk.g;
                    } else {
                        ov0Var3.c0(195223722);
                        j = ((kz) ov0Var3.j(mz.a)).q;
                        ov0Var3.p(false);
                    }
                    s83.b(str2, null, j, jC2, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 24576, 0, 262058);
                    long jB = v63.b(10.5d);
                    if (z) {
                        ov0Var3.c0(195233075);
                        ov0Var3.p(false);
                        jC = hz.c(0.8f, bk.g);
                    } else {
                        ov0Var3.c0(195235090);
                        long jC3 = hz.c(0.45f, ((kz) ov0Var3.j(mz.a)).q);
                        ov0Var3.p(false);
                        jC = jC3;
                    }
                    s83.b(str3, null, jC, jB, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 24576, 0, 262122);
                    ov0Var3.p(true);
                }
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ o2(int i, Object obj, String str, boolean z) {
        this.e = i;
        this.f = z;
        this.g = str;
        this.h = obj;
    }

    public /* synthetic */ o2(ba1 ba1Var, boolean z, au0 au0Var, int i) {
        this.e = 2;
        this.g = ba1Var;
        this.f = z;
        this.h = au0Var;
    }

    public /* synthetic */ o2(ey1 ey1Var, au0 au0Var, boolean z) {
        this.e = 3;
        this.g = ey1Var;
        this.h = au0Var;
        this.f = z;
    }

    public /* synthetic */ o2(boolean z, au0 au0Var, au0 au0Var2, int i) {
        this.e = 5;
        this.f = z;
        this.h = au0Var;
        this.g = au0Var2;
    }

    public /* synthetic */ o2(boolean z, j52 j52Var, pu0 pu0Var, int i) {
        this.e = 1;
        this.f = z;
        this.g = j52Var;
        this.h = pu0Var;
    }
}
