package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class wf implements pu0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ long f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ wf(long j, boolean z, dv1 dv1Var, f12 f12Var) {
        this.f = j;
        this.g = z;
        this.h = dv1Var;
        this.i = f12Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Object obj3 = this.i;
        Object obj4 = this.h;
        switch (i) {
            case 0:
                dv1 dv1Var = (dv1) obj4;
                final f12 f12Var = (f12) obj3;
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                final int i2 = 0;
                final int i3 = 1;
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    long j = this.f;
                    boolean z = this.g;
                    c30 c30Var = d30.a;
                    if (j == 9205357640488583168L) {
                        ov0Var.c0(4389176);
                        boolean zH = ov0Var.h(f12Var);
                        Object objQ = ov0Var.Q();
                        if (zH || objQ == c30Var) {
                            objQ = new au0() { // from class: xf
                                @Override // defpackage.au0
                                public final Object invoke() {
                                    int i4 = i3;
                                    f12 f12Var2 = f12Var;
                                    switch (i4) {
                                        case 0:
                                            return Boolean.valueOf((9223372034707292159L & f12Var2.b()) != 9205357640488583168L);
                                        default:
                                            return Boolean.valueOf((9223372034707292159L & f12Var2.b()) != 9205357640488583168L);
                                    }
                                }
                            };
                            ov0Var.m0(objQ);
                        }
                        ji2.v(dv1Var, (au0) objQ, z, ov0Var, 0);
                        ov0Var.p(false);
                    } else {
                        ov0Var.c0(3458246);
                        go goVar = z ? o51.b : o51.a;
                        dv1 dv1VarJ = iw2.j(dv1Var, xd0.b(j), xd0.a(j), 0.0f, 0.0f, 12);
                        kk2 kk2VarA = jk2.a(goVar, j9.o, ov0Var, 0);
                        int iHashCode = Long.hashCode(ov0Var.T);
                        l72 l72VarL = ov0Var.l();
                        dv1 dv1VarH = xp1.H(ov0Var, dv1VarJ);
                        w20.b.getClass();
                        x30 x30Var = v20.b;
                        ov0Var.g0();
                        if (ov0Var.S) {
                            ov0Var.k(x30Var);
                        } else {
                            ov0Var.p0();
                        }
                        q73.h(ov0Var, v20.e, kk2VarA);
                        q73.h(ov0Var, v20.d, l72VarL);
                        q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode));
                        q73.g(ov0Var, v20.g);
                        q73.h(ov0Var, v20.c, dv1VarH);
                        boolean zH2 = ov0Var.h(f12Var);
                        Object objQ2 = ov0Var.Q();
                        if (zH2 || objQ2 == c30Var) {
                            objQ2 = new au0() { // from class: xf
                                @Override // defpackage.au0
                                public final Object invoke() {
                                    int i4 = i2;
                                    f12 f12Var2 = f12Var;
                                    switch (i4) {
                                        case 0:
                                            return Boolean.valueOf((9223372034707292159L & f12Var2.b()) != 9205357640488583168L);
                                        default:
                                            return Boolean.valueOf((9223372034707292159L & f12Var2.b()) != 9205357640488583168L);
                                    }
                                }
                            };
                            ov0Var.m0(objQ2);
                        }
                        ji2.v(av1.a, (au0) objQ2, z, ov0Var, 6);
                        ov0Var.p(true);
                        ov0Var.p(false);
                    }
                }
                break;
            default:
                ((Integer) obj2).getClass();
                mh0.f((x01) obj4, (String) obj3, this.f, this.g, (f30) obj, wc0.m0(385));
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ wf(x01 x01Var, String str, long j, boolean z, int i) {
        this.h = x01Var;
        this.i = str;
        this.f = j;
        this.g = z;
    }
}
