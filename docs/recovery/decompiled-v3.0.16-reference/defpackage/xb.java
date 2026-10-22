package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class xb extends aa1 implements pu0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(dv1 dv1Var, p10 p10Var, int i) {
        super(2);
        this.f = 3;
        this.g = dv1Var;
        this.h = p10Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        mf3 mf3Var = mf3.a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                js2 js2Var = (js2) obj2;
                yb ybVar = (yb) obj3;
                if (!((ks2) obj4).b.b(js2Var.f)) {
                    ybVar.h(iIntValue, js2Var);
                    ybVar.k.mo32trySendJP2dKIU(mf3Var);
                }
                break;
            case 1:
                f30 f30Var = (f30) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ov0Var.W();
                } else {
                    Boolean bool = (Boolean) ((nb1) obj4).g.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    pu0 pu0Var = (pu0) obj3;
                    ov0Var.f0(bool);
                    boolean zG = ov0Var.g(zBooleanValue);
                    if (zBooleanValue) {
                        pu0Var.invoke(ov0Var, 0);
                    } else {
                        if (ov0Var.l != 0) {
                            j30.a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!ov0Var.S) {
                            if (zG) {
                                gx2 gx2Var = ov0Var.G;
                                int i2 = gx2Var.g;
                                int i3 = gx2Var.h;
                                g30 g30Var = ov0Var.M;
                                g30Var.getClass();
                                g30Var.d(false);
                                g30Var.b.F0.V(r22.c);
                                o51.z(ov0Var.s, i2, i3);
                                ov0Var.G.t();
                            } else {
                                ov0Var.V();
                            }
                        }
                    }
                    if (ov0Var.y && ov0Var.G.i == ov0Var.z) {
                        ov0Var.z = -1;
                        ov0Var.y = false;
                    }
                    ov0Var.p(false);
                }
                break;
            case 2:
                vv vvVar = (vv) obj;
                kw0 kw0Var = (kw0) obj2;
                xz1 xz1Var = (xz1) obj4;
                hb1 hb1Var = xz1Var.s;
                if (!hb1Var.H()) {
                    xz1Var.Q = true;
                } else {
                    xz1Var.N = vvVar;
                    xz1Var.M = kw0Var;
                    v42 snapshotObserver = ((db) kb1.a(hb1Var)).getSnapshotObserver();
                    ah2 ah2Var = xz1.S;
                    snapshotObserver.a.c(xz1Var, ik0.n, (wz1) obj3);
                    xz1Var.Q = false;
                }
                break;
            default:
                ((Number) obj2).intValue();
                zu2.a((dv1) obj4, (p10) obj3, (f30) obj, wc0.m0(49));
                break;
        }
        return mf3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xb(int i, Object obj, Object obj2) {
        super(2);
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }
}
