package defpackage;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class i4 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ i4(int i, boolean z) {
        this.e = 2;
        this.f = z;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) throws XmlPullParserException, IOException {
        int i = this.e;
        av1 av1Var = av1.a;
        mf3 mf3Var = mf3.a;
        boolean z = this.f;
        switch (i) {
            case 0:
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    dv1 dv1VarF = zm3.F(av1Var, 0.0f, 12.0f, 1);
                    er1 er1VarC = ws.c(j9.j, false);
                    int iHashCode = Long.hashCode(ov0Var.T);
                    l72 l72VarL = ov0Var.l();
                    dv1 dv1VarH = xp1.H(ov0Var, dv1VarF);
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
                    s83.b(ke0.N(z ? 2131624250 : 2131624261, ov0Var), null, 0L, 0L, jr0.i, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var.j(le3.a)).m, ov0Var, 1572864, 0, 131006);
                    ov0Var.p(true);
                }
                break;
            case 1:
                f30 f30Var2 = (f30) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ov0Var2.W();
                } else {
                    t01.a(z ? ke0.C() : ig0.w(), ke0.N(z ? 2131624854 : 2131624003, ov0Var2), iw2.k(av1Var, 20.0f), bk.i, ov0Var2, 3456, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ee0.b(z, (f30) obj, wc0.m0(1));
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ i4(boolean z, int i, byte b) {
        this.e = i;
        this.f = z;
    }
}
