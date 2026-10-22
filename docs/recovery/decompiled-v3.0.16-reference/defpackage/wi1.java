package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudGeoSource;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.SearchMode;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class wi1 implements qu0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ AppState g;
    public final /* synthetic */ ul1 h;
    public final /* synthetic */ dv1 i;
    public final /* synthetic */ au0 j;
    public final /* synthetic */ vp0 k;
    public final /* synthetic */ ey1 l;
    public final /* synthetic */ Object m;

    public /* synthetic */ wi1(boolean z, AppState appState, ul1 ul1Var, dv1 dv1Var, au0 au0Var, vp0 vp0Var, ey1 ey1Var, ey1 ey1Var2) {
        this.f = z;
        this.g = appState;
        this.h = ul1Var;
        this.i = dv1Var;
        this.j = au0Var;
        this.k = vp0Var;
        this.l = ey1Var;
        this.m = ey1Var2;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        c30 c30Var = d30.a;
        Object obj4 = this.m;
        ey1 ey1Var = this.l;
        dv1 dv1Var = this.i;
        AppState appState = this.g;
        boolean z = this.f;
        switch (i) {
            case 0:
                lu0 lu0Var = (lu0) obj4;
                dv1 dv1Var2 = (dv1) obj;
                f30 f30Var = (f30) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                dv1Var2.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((ov0) f30Var).f(dv1Var2) ? 4 : 2;
                }
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ov0Var.W();
                } else if (!z) {
                    ov0Var.c0(1322995544);
                    String str = ((uz2) ey1Var.getValue()).f;
                    SearchMode searchMode = appState.getSearchMode();
                    CloudGeoSource geoSearchSource = appState.getGeoSearchSource();
                    ul1 ul1Var = this.h;
                    boolean zH = ov0Var.h(ul1Var);
                    Object objQ = ov0Var.Q();
                    if (zH || objQ == c30Var) {
                        objQ = new l(1, ul1Var, hn1.class, "setSearchMode", "setSearchMode(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;Lcom/vincenthzr/locationspoofer/data/model/SearchMode;)V", 1, 6);
                        ov0Var.m0(objQ);
                    }
                    dv1 dv1VarD = dv1Var.d(dv1Var2);
                    lu0 lu0Var2 = (lu0) ((o81) objQ);
                    boolean zF = ov0Var.f(lu0Var);
                    Object objQ2 = ov0Var.Q();
                    if (zF || objQ2 == c30Var) {
                        objQ2 = new am0(5, lu0Var);
                        ov0Var.m0(objQ2);
                    }
                    lu0 lu0Var3 = (lu0) objQ2;
                    boolean zF2 = ov0Var.f(lu0Var);
                    Object objQ3 = ov0Var.Q();
                    if (zF2 || objQ3 == c30Var) {
                        objQ3 = new vi1(7, lu0Var);
                        ov0Var.m0(objQ3);
                    }
                    ks.F(str, searchMode, lu0Var2, lu0Var3, this.j, (au0) objQ3, dv1VarD, this.k, geoSearchSource, ov0Var, 12582912);
                    ov0Var.p(false);
                } else {
                    ov0Var.c0(1323761957);
                    gh0.h(ov0Var, iw2.g(dv1Var2, 52.0f));
                    ov0Var.p(false);
                }
                break;
            default:
                ey1 ey1Var2 = (ey1) obj4;
                dv1 dv1Var3 = (dv1) obj;
                f30 f30Var2 = (f30) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                dv1Var3.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((ov0) f30Var2).f(dv1Var3) ? 4 : 2;
                }
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    ov0Var2.W();
                } else if (!z) {
                    ov0Var2.c0(1792204646);
                    String str2 = (String) ey1Var.getValue();
                    SearchMode searchMode2 = appState.getSearchMode();
                    CloudGeoSource geoSearchSource2 = appState.getGeoSearchSource();
                    ul1 ul1Var2 = this.h;
                    boolean zH2 = ov0Var2.h(ul1Var2);
                    Object objQ4 = ov0Var2.Q();
                    if (zH2 || objQ4 == c30Var) {
                        objQ4 = new l(1, ul1Var2, hn1.class, "setSearchMode", "setSearchMode(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;Lcom/vincenthzr/locationspoofer/data/model/SearchMode;)V", 1, 21);
                        ov0Var2.m0(objQ4);
                    }
                    dv1 dv1VarD2 = dv1Var.d(dv1Var3);
                    lu0 lu0Var4 = (lu0) ((o81) objQ4);
                    Object objQ5 = ov0Var2.Q();
                    if (objQ5 == c30Var) {
                        objQ5 = new vu1(ey1Var, 11);
                        ov0Var2.m0(objQ5);
                    }
                    lu0 lu0Var5 = (lu0) objQ5;
                    Object objQ6 = ov0Var2.Q();
                    if (objQ6 == c30Var) {
                        objQ6 = new xj2(ey1Var2, 2);
                        ov0Var2.m0(objQ6);
                    }
                    ks.F(str2, searchMode2, lu0Var4, lu0Var5, this.j, (au0) objQ6, dv1VarD2, this.k, geoSearchSource2, ov0Var2, 12782592);
                    ov0Var2.p(false);
                } else {
                    ov0Var2.c0(1792947189);
                    gh0.h(ov0Var2, iw2.g(dv1Var3, 52.0f));
                    ov0Var2.p(false);
                }
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ wi1(boolean z, AppState appState, ul1 ul1Var, dv1 dv1Var, lu0 lu0Var, au0 au0Var, vp0 vp0Var, ey1 ey1Var) {
        this.f = z;
        this.g = appState;
        this.h = ul1Var;
        this.i = dv1Var;
        this.m = lu0Var;
        this.j = au0Var;
        this.k = vp0Var;
        this.l = ey1Var;
    }
}
