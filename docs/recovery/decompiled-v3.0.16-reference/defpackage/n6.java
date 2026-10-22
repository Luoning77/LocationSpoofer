package defpackage;

import com.vincenthzr.locationspoofer.data.model.AppState;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class n6 implements qu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ AppState f;

    public /* synthetic */ n6(AppState appState, int i) {
        this.e = i;
        this.f = appState;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        av1 av1Var = av1.a;
        mf3 mf3Var = mf3.a;
        AppState appState = this.f;
        switch (i) {
            case 0:
                f30 f30Var = (f30) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ov0Var.W();
                } else if (!appState.isSavingConfig()) {
                    ov0Var.c0(1343664170);
                    t01.a(vd0.y(), null, iw2.k(av1Var, 18.0f), 0L, ov0Var, 432, 8);
                    s83.b(az2.i(av1Var, 6.0f, ov0Var, 2131624463, ov0Var), null, 0L, v63.c(14), jr0.i, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597440, 0, 262062);
                    ov0Var.p(false);
                } else {
                    ov0Var.c0(1343268083);
                    vc2.a(iw2.k(av1Var, 18.0f), ((kz) ov0Var.j(mz.a)).b, 2.0f, 0L, 0, 0.0f, ov0Var, 390, 56);
                    s83.b(az2.i(av1Var, 8.0f, ov0Var, 2131625048, ov0Var), null, 0L, v63.c(14), jr0.i, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597440, 0, 262062);
                    ov0Var.p(false);
                }
                break;
            case 1:
                int i2 = 2131624313;
                f30 f30Var2 = (f30) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ov0Var2.W();
                } else {
                    if (!appState.isStoppingCollection()) {
                        i2 = appState.isContinuousScanning() ? 2131625059 : appState.isRouteCollection() ? 2131624308 : 2131625044;
                    }
                    s83.b(ke0.N(i2, ov0Var2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 0, 0, 262142);
                }
                break;
            case 2:
                f30 f30Var3 = (f30) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var3 = (ov0) f30Var3;
                if (!ov0Var3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ov0Var3.W();
                } else {
                    x01 x01VarB = ce0.d;
                    if (x01VarB == null) {
                        w01 w01Var = new w01("Rounded.Radar", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i3 = nh3.a;
                        qy2 qy2Var = new qy2(hz.b);
                        nx0 nx0VarI = p91.i(19.74f, 18.33f);
                        nx0VarI.f(21.15f, 16.6f, 22.0f, 14.4f, 22.0f, 12.0f);
                        nx0VarI.g(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
                        nx0VarI.n(2.0f, 6.48f, 2.0f, 12.0f);
                        nx0VarI.o(4.48f, 10.0f, 10.0f, 10.0f);
                        nx0VarI.g(2.4f, 0.0f, 4.6f, -0.85f, 6.33f, -2.26f);
                        nx0VarI.g(0.27f, -0.22f, 0.53f, -0.46f, 0.78f, -0.71f);
                        nx0VarI.g(0.03f, -0.03f, 0.05f, -0.06f, 0.07f, -0.08f);
                        nx0VarI.f(19.38f, 18.75f, 19.57f, 18.54f, 19.74f, 18.33f);
                        nx0VarI.e();
                        nx0VarI.m(12.0f, 20.0f);
                        nx0VarI.g(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
                        nx0VarI.o(3.59f, -8.0f, 8.0f, -8.0f);
                        nx0VarI.o(8.0f, 3.59f, 8.0f, 8.0f);
                        nx0VarI.g(0.0f, 1.85f, -0.63f, 3.54f, -1.69f, 4.9f);
                        nx0VarI.l(-1.43f, -1.43f);
                        nx0VarI.g(0.69f, -0.98f, 1.1f, -2.17f, 1.1f, -3.46f);
                        nx0VarI.g(0.0f, -3.31f, -2.69f, -6.0f, -6.0f, -6.0f);
                        nx0VarI.o(-6.0f, 2.69f, -6.0f, 6.0f);
                        nx0VarI.o(2.69f, 6.0f, 6.0f, 6.0f);
                        nx0VarI.g(1.3f, 0.0f, 2.51f, -0.42f, 3.49f, -1.13f);
                        nx0VarI.l(1.42f, 1.42f);
                        nx0VarI.f(15.54f, 19.37f, 13.85f, 20.0f, 12.0f, 20.0f);
                        nx0VarI.e();
                        nx0VarI.m(13.92f, 12.51f);
                        nx0VarI.g(0.17f, -0.66f, 0.02f, -1.38f, -0.49f, -1.9f);
                        nx0VarI.l(-0.02f, -0.02f);
                        nx0VarI.g(-0.77f, -0.77f, -2.0f, -0.78f, -2.78f, -0.04f);
                        nx0VarI.g(-0.01f, 0.01f, -0.03f, 0.02f, -0.05f, 0.04f);
                        nx0VarI.g(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
                        nx0VarI.l(0.02f, 0.02f);
                        nx0VarI.g(0.52f, 0.51f, 1.25f, 0.67f, 1.91f, 0.49f);
                        nx0VarI.l(1.51f, 1.51f);
                        nx0VarI.g(-0.6f, 0.36f, -1.29f, 0.58f, -2.04f, 0.58f);
                        nx0VarI.g(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
                        nx0VarI.o(1.79f, -4.0f, 4.0f, -4.0f);
                        nx0VarI.o(4.0f, 1.79f, 4.0f, 4.0f);
                        nx0VarI.g(0.0f, 0.73f, -0.21f, 1.41f, -0.56f, 2.0f);
                        nx0VarI.k(13.92f, 12.51f);
                        nx0VarI.e();
                        w01.a(w01Var, nx0VarI.a, qy2Var);
                        x01VarB = w01Var.b();
                        ce0.d = x01VarB;
                    }
                    t01.a(x01VarB, null, iw2.k(av1Var, 18.0f), 0L, ov0Var3, 432, 8);
                    gh0.h(ov0Var3, iw2.o(av1Var, 8.0f));
                    s83.b(appState.isStoppingCollection() ? az2.h(ov0Var3, -1152059236, 2131624313, ov0Var3, false) : appState.isContinuousScanning() ? az2.h(ov0Var3, -1151920480, 2131625059, ov0Var3, false) : az2.h(ov0Var3, -1151819265, 2131625044, ov0Var3, false), null, 0L, v63.c(15), jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 1597440, 0, 262062);
                }
                break;
            case 3:
                f30 f30Var4 = (f30) obj2;
                ((Integer) obj3).getClass();
                ((mi) obj).getClass();
                zm3.b(null, 14.0f, new b52(12.0f, 10.0f, 12.0f, 10.0f), sb.a0(1854628347, new n6(appState, 4), f30Var4), f30Var4, 25008, 9);
                break;
            default:
                f30 f30Var5 = (f30) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var4 = (ov0) f30Var5;
                if (!ov0Var4.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    ov0Var4.W();
                } else {
                    yz yzVarA = wz.a(new jo(4.0f, true, new fo(0)), j9.r, ov0Var4, 54);
                    int iHashCode = Long.hashCode(ov0Var4.T);
                    l72 l72VarL = ov0Var4.l();
                    dv1 dv1VarH = xp1.H(ov0Var4, av1Var);
                    w20.b.getClass();
                    x30 x30Var = v20.b;
                    ov0Var4.g0();
                    if (ov0Var4.S) {
                        ov0Var4.k(x30Var);
                    } else {
                        ov0Var4.p0();
                    }
                    q73.h(ov0Var4, v20.e, yzVarA);
                    q73.h(ov0Var4, v20.d, l72VarL);
                    q73.h(ov0Var4, v20.f, Integer.valueOf(iHashCode));
                    q73.g(ov0Var4, v20.g);
                    q73.h(ov0Var4, v20.c, dv1VarH);
                    String strO = ke0.O(2131624950, new Object[]{Integer.valueOf(appState.getScannedWifiCount())}, ov0Var4);
                    long jC = v63.c(12);
                    jr0 jr0Var = jr0.h;
                    hh0 hh0Var = mz.a;
                    s83.b(strO, null, ((kz) ov0Var4.j(hh0Var)).q, jC, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 1597440, 0, 262058);
                    s83.b(ke0.O(2131624949, new Object[]{Integer.valueOf(appState.getScannedCellCount())}, ov0Var4), null, ((kz) ov0Var4.j(hh0Var)).q, v63.c(12), jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 1597440, 0, 262058);
                    s83.b(ke0.O(2131624948, new Object[]{Integer.valueOf(appState.getScannedBluetoothCount())}, ov0Var4), null, ((kz) ov0Var4.j(hh0Var)).q, v63.c(12), jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 1597440, 0, 262058);
                    ov0Var4.p(true);
                }
                break;
        }
        return mf3Var;
    }
}
