package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class dn implements ru0 {
    public final /* synthetic */ Object[] e;
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ ey1 h;

    public dn(Object[] objArr, int i, boolean z, ey1 ey1Var) {
        this.e = objArr;
        this.f = i;
        this.g = z;
        this.h = ey1Var;
    }

    @Override // defpackage.ru0
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        String strH;
        long jC;
        long jC2;
        bc1 bc1Var = (bc1) obj;
        int iIntValue = ((Number) obj2).intValue();
        f30 f30Var = (f30) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (((ov0) f30Var).f(bc1Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= ((ov0) f30Var).d(iIntValue) ? 32 : 16;
        }
        ov0 ov0Var = (ov0) f30Var;
        if (ov0Var.T(i & 1, (i & 147) != 146)) {
            u60 u60Var = (u60) this.e[iIntValue];
            ov0Var.c0(-1817733263);
            ey1 ey1Var = this.h;
            boolean z = ((u60) ey1Var.getValue()) == u60Var;
            int iOrdinal = u60Var.ordinal();
            if (iOrdinal == 0) {
                strH = az2.h(ov0Var, -1256750031, 2131625102, ov0Var, false);
            } else if (iOrdinal == 1) {
                ov0Var.c0(-1256748114);
                strH = ke0.O(2131624370, new Object[]{Integer.valueOf(this.f)}, ov0Var);
                ov0Var.p(false);
            } else if (iOrdinal == 2) {
                strH = az2.h(ov0Var, -1256745385, 2131625109, ov0Var, false);
            } else {
                if (iOrdinal != 3) {
                    ov0Var.c0(-1256750826);
                    ov0Var.p(false);
                    b81.d();
                    return null;
                }
                strH = az2.h(ov0Var, -1256743303, 2131625108, ov0Var, false);
            }
            String str = strH;
            dv1 dv1VarN = xp1.n(av1.a, cj2.a(10.0f));
            if (z) {
                jC = bk.g;
            } else {
                jC = this.g ? hz.c(0.06f, hz.c) : hz.c(0.04f, hz.b);
            }
            dv1 dv1VarK = xp1.k(dv1VarN, jC, o51.p0);
            boolean zD = ov0Var.d(u60Var.ordinal());
            Object objQ = ov0Var.Q();
            if (zD || objQ == d30.a) {
                objQ = new bn(0, u60Var, ey1Var);
                ov0Var.m0(objQ);
            }
            dv1 dv1VarE = zm3.E(bk.a(dv1VarK, (au0) objQ), 12.0f, 6.0f);
            er1 er1VarC = ws.c(j9.f, false);
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
            q73.h(ov0Var, v20.e, er1VarC);
            q73.h(ov0Var, v20.d, l72VarL);
            q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode));
            q73.g(ov0Var, v20.g);
            q73.h(ov0Var, v20.c, dv1VarH);
            long jB = v63.b(12.5d);
            jr0 jr0Var = z ? jr0.j : jr0.g;
            if (z) {
                ov0Var.c0(-2130456981);
                ov0Var.p(false);
                jC2 = hz.c;
            } else {
                ov0Var.c0(-2130455402);
                jC2 = hz.c(0.7f, ((kz) ov0Var.j(mz.a)).q);
                ov0Var.p(false);
            }
            s83.b(str, null, jC2, jB, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 24576, 0, 262058);
            ov0Var.p(true);
            ov0Var.p(false);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }
}
