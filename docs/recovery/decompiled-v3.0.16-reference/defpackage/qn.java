package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class qn implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ p10 g;
    public final /* synthetic */ x01 h;

    public /* synthetic */ qn(String str, p10 p10Var, x01 x01Var, int i) {
        this.e = i;
        this.f = str;
        this.g = p10Var;
        this.h = x01Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        x01 x01Var = this.h;
        p10 p10Var = this.g;
        int i2 = 1;
        switch (i) {
            case 0:
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    e33.a(null, cj2.a(28.0f), ((kz) ov0Var.j(mz.a)).p, 0L, 0.0f, 0.0f, null, sb.a0(103001604, new qn(this.f, p10Var, x01Var, i2), ov0Var), ov0Var, 12582912, 121);
                }
                break;
            default:
                f30 f30Var2 = (f30) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ov0Var2.W();
                } else {
                    dv1 dv1VarD = zm3.D(zm3.P(iw2.p(1, 400.0f), zm3.O(ov0Var2), true), 24.0f);
                    yz yzVarA = wz.a(new jo(16.0f, true, new fo(0)), j9.s, ov0Var2, 54);
                    int iHashCode = Long.hashCode(ov0Var2.T);
                    l72 l72VarL = ov0Var2.l();
                    dv1 dv1VarH = xp1.H(ov0Var2, dv1VarD);
                    w20.b.getClass();
                    x30 x30Var = v20.b;
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, v20.e, yzVarA);
                    q73.h(ov0Var2, v20.d, l72VarL);
                    q73.h(ov0Var2, v20.f, Integer.valueOf(iHashCode));
                    q73.g(ov0Var2, v20.g);
                    q73.h(ov0Var2, v20.c, dv1VarH);
                    e33.a(null, cj2.a(20.0f), ((kz) ov0Var2.j(mz.a)).c, 0L, 0.0f, 0.0f, null, sb.a0(-420530027, new s5(x01Var, 2), ov0Var2), ov0Var2, 12582912, 121);
                    s83.b(this.f, null, 0L, 0L, jr0.j, null, 0L, null, new m53(3), 0L, 0, false, 0, 0, ((je3) ov0Var2.j(le3.a)).g, ov0Var2, 1572864, 0, 129982);
                    p10Var.invoke(zz.a, ov0Var2, 6);
                    ov0Var2.p(true);
                }
                break;
        }
        return mf3Var;
    }
}
