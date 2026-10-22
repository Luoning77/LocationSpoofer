package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import com.vincenthzr.locationspoofer.data.model.AppInfoItem;
import com.vincenthzr.locationspoofer.data.model.AppState;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class w5 implements pu0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ au0 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ w5(p10 p10Var, au0 au0Var, dv1 dv1Var, boolean z, ss1 ss1Var, z42 z42Var, int i) {
        this.h = p10Var;
        this.f = au0Var;
        this.i = dv1Var;
        this.g = z;
        this.j = ss1Var;
        this.k = z42Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        av1 av1Var = av1.a;
        mf3 mf3Var = mf3.a;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        Object obj6 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                da0.a((CloudAccountState) obj6, this.f, this.g, (au0) obj5, (au0) obj4, (au0) obj3, (f30) obj, wc0.m0(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                he.b((p10) obj6, this.f, (dv1) obj5, this.g, (ss1) obj4, (z42) obj3, (f30) obj, wc0.m0(7));
                break;
            case 2:
                AppInfoItem appInfoItem = (AppInfoItem) obj6;
                List list = (List) obj5;
                ey1 ey1Var = (ey1) obj4;
                lu0 lu0Var = (lu0) obj3;
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    zm3.b(iw2.q(iw2.e(av1Var, 0.92f)), 24.0f, new b52(22.0f, 22.0f, 22.0f, 22.0f), sb.a0(-224897097, new x60(this.g, this.f, appInfoItem, list, ey1Var, lu0Var), ov0Var), ov0Var, 25014, 8);
                }
                break;
            case 3:
                ul1 ul1Var = (ul1) obj6;
                AppState appState = (AppState) obj3;
                au0 au0Var = (au0) obj5;
                au0 au0Var2 = (au0) obj4;
                f30 f30Var2 = (f30) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ov0Var2.W();
                } else {
                    dv1 dv1VarE = zm3.E(iw2.e(av1Var, 1.0f), 16.0f, 14.0f);
                    yz yzVarA = wz.a(am1.g, j9.r, ov0Var2, 0);
                    int iHashCode = Long.hashCode(ov0Var2.T);
                    l72 l72VarL = ov0Var2.l();
                    dv1 dv1VarH = xp1.H(ov0Var2, dv1VarE);
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
                    am1.b(ul1Var, appState, this.g, this.f, au0Var, ov0Var2, 0);
                    gh0.h(ov0Var2, iw2.g(av1Var, 12.0f));
                    Object objQ = ov0Var2.Q();
                    if (objQ == d30.a) {
                        objQ = new qe0(27);
                        ov0Var2.m0(objQ);
                    }
                    ym3.a(ul1Var, appState, (au0) objQ, au0Var2, ov0Var2, 384);
                    ov0Var2.p(true);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                wc0.m((String) obj6, (String) obj5, (x01) obj4, this.g, this.f, (dv1) obj3, (f30) obj, wc0.m0(1));
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ w5(ul1 ul1Var, AppState appState, boolean z, au0 au0Var, au0 au0Var2, au0 au0Var3) {
        this.h = ul1Var;
        this.k = appState;
        this.g = z;
        this.f = au0Var;
        this.i = au0Var2;
        this.j = au0Var3;
    }

    public /* synthetic */ w5(CloudAccountState cloudAccountState, au0 au0Var, boolean z, au0 au0Var2, au0 au0Var3, au0 au0Var4, int i) {
        this.h = cloudAccountState;
        this.f = au0Var;
        this.g = z;
        this.i = au0Var2;
        this.j = au0Var3;
        this.k = au0Var4;
    }

    public /* synthetic */ w5(String str, String str2, x01 x01Var, boolean z, au0 au0Var, dv1 dv1Var, int i) {
        this.h = str;
        this.i = str2;
        this.j = x01Var;
        this.g = z;
        this.f = au0Var;
        this.k = dv1Var;
    }

    public /* synthetic */ w5(boolean z, au0 au0Var, AppInfoItem appInfoItem, List list, ey1 ey1Var, lu0 lu0Var) {
        this.g = z;
        this.f = au0Var;
        this.h = appInfoItem;
        this.i = list;
        this.j = ey1Var;
        this.k = lu0Var;
    }
}
