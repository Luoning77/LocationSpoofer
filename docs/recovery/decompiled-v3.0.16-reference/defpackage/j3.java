package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vincenthzr.locationspoofer.data.model.GithubRelease;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class j3 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ j3(dv1 dv1Var, ey1 ey1Var, p10 p10Var, vq vqVar, au0 au0Var) {
        this.e = 3;
        this.g = dv1Var;
        this.f = ey1Var;
        this.h = p10Var;
        this.i = vqVar;
        this.j = au0Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.e;
        c30 c30Var = d30.a;
        av1 av1Var = av1.a;
        mf3 mf3Var = mf3.a;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.f;
        switch (i) {
            case 0:
                ey1 ey1Var = (ey1) obj7;
                ey1 ey1Var2 = (ey1) obj6;
                ey1 ey1Var3 = (ey1) obj5;
                ey1 ey1Var4 = (ey1) obj4;
                ey1 ey1Var5 = (ey1) obj3;
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    yz yzVarA = wz.a(am1.g, j9.r, ov0Var, 0);
                    int iHashCode = Long.hashCode(ov0Var.T);
                    l72 l72VarL = ov0Var.l();
                    dv1 dv1VarH = xp1.H(ov0Var, av1Var);
                    w20.b.getClass();
                    x30 x30Var = v20.b;
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, v20.e, yzVarA);
                    q73.h(ov0Var, v20.d, l72VarL);
                    q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode));
                    q73.g(ov0Var, v20.g);
                    q73.h(ov0Var, v20.c, dv1VarH);
                    s83.b(ke0.N(2131624046, ov0Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var.j(le3.a)).l, ov0Var, 0, 0, 131070);
                    String strW = xq1.w((String) ey1Var.getValue(), ov0Var);
                    if (strW == null) {
                        ov0Var.c0(-849749711);
                        ov0Var.p(false);
                    } else {
                        ov0Var.c0(-849749710);
                        s83.b(strW, null, ((kz) ov0Var.j(mz.a)).w, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 0, 0, 262138);
                        ov0Var.p(false);
                    }
                    if (((Boolean) ey1Var2.getValue()).booleanValue()) {
                        z = false;
                        ov0Var.c0(-859052283);
                    } else {
                        ov0Var.c0(1080970540);
                        dv1 dv1VarH2 = iw2.h(av1Var, 0.0f, 380.0f, 1);
                        Object objQ = ov0Var.Q();
                        if (objQ == c30Var) {
                            objQ = new ji1(ey1Var3, ey1Var4, ey1Var5, 1);
                            ov0Var.m0(objQ);
                        }
                        ke0.d(dv1VarH2, null, null, null, null, null, false, null, (lu0) objQ, ov0Var, 805306374, 510);
                        z = false;
                    }
                    ov0Var.p(z);
                    if (xq1.e(ey1Var5)) {
                        ov0Var.c0(1080995550);
                        vc2.c(iw2.e(av1Var, 1.0f), bk.g, 0L, 0, 0.0f, ov0Var, 54, 28);
                        z2 = false;
                    } else {
                        z2 = false;
                        ov0Var.c0(-859052283);
                    }
                    ov0Var.p(z2);
                    ov0Var.p(true);
                }
                break;
            case 1:
                Context context = (Context) obj5;
                Configuration configuration = (Configuration) obj4;
                pu0 pu0Var = (pu0) obj3;
                ey1 ey1Var6 = (ey1) obj7;
                ey1 ey1Var7 = (ey1) obj6;
                f30 f30Var2 = (f30) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ov0Var2.W();
                } else {
                    k22.c(new kk[]{AndroidCompositionLocals_androidKt.b.a(context), AndroidCompositionLocals_androidKt.a.a(configuration)}, sb.a0(1965335467, new f5(pu0Var, ey1Var6, ey1Var7, 3), ov0Var2), ov0Var2, 56);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                mc0.a((f52) obj7, (String) obj6, (dv1) obj5, (l9) obj4, (c30) obj3, (f30) obj, wc0.m0(393));
                break;
            case 3:
                dv1 dv1Var = (dv1) obj6;
                ey1 ey1Var8 = (ey1) obj7;
                p10 p10Var = (p10) obj5;
                vq vqVar = (vq) obj4;
                au0 au0Var = (au0) obj3;
                f30 f30Var3 = (f30) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ov0 ov0Var3 = (ov0) f30Var3;
                if (!ov0Var3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ov0Var3.W();
                } else {
                    Object objQ2 = ov0Var3.Q();
                    if (objQ2 == c30Var) {
                        objQ2 = new vu1(ey1Var8, 7);
                        ov0Var3.m0(objQ2);
                    }
                    dv1 dv1VarG = k22.G(dv1Var, (lu0) objQ2);
                    er1 er1VarC = ws.c(j9.f, true);
                    int iHashCode2 = Long.hashCode(ov0Var3.T);
                    l72 l72VarL2 = ov0Var3.l();
                    dv1 dv1VarH3 = xp1.H(ov0Var3, dv1VarG);
                    w20.b.getClass();
                    x30 x30Var2 = v20.b;
                    ov0Var3.g0();
                    if (ov0Var3.S) {
                        ov0Var3.k(x30Var2);
                    } else {
                        ov0Var3.p0();
                    }
                    q73.h(ov0Var3, v20.e, er1VarC);
                    q73.h(ov0Var3, v20.d, l72VarL2);
                    q73.h(ov0Var3, v20.f, Integer.valueOf(iHashCode2));
                    q73.g(ov0Var3, v20.g);
                    q73.h(ov0Var3, v20.c, dv1VarH3);
                    p10Var.invoke(ov0Var3, 0);
                    vqVar.b(au0Var, ov0Var3, 6);
                    ov0Var3.p(true);
                }
                break;
            default:
                GithubRelease githubRelease = (GithubRelease) obj7;
                String str = (String) obj6;
                lu0 lu0Var = (lu0) obj5;
                au0 au0Var2 = (au0) obj4;
                au0 au0Var3 = (au0) obj3;
                f30 f30Var4 = (f30) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ov0 ov0Var4 = (ov0) f30Var4;
                if (!ov0Var4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ov0Var4.W();
                } else {
                    zm3.b(iw2.e(av1Var, 1.0f), 22.0f, new b52(22.0f, 22.0f, 22.0f, 22.0f), sb.a0(-675367380, new b3(githubRelease, str, lu0Var, au0Var2, au0Var3, 3), ov0Var4), ov0Var4, 25014, 8);
                }
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ j3(f52 f52Var, String str, dv1 dv1Var, l9 l9Var, c30 c30Var, int i) {
        this.e = 2;
        this.f = f52Var;
        this.g = str;
        this.h = dv1Var;
        this.i = l9Var;
        this.j = c30Var;
    }

    public /* synthetic */ j3(Context context, Configuration configuration, pu0 pu0Var, ey1 ey1Var, ey1 ey1Var2) {
        this.e = 1;
        this.h = context;
        this.i = configuration;
        this.j = pu0Var;
        this.f = ey1Var;
        this.g = ey1Var2;
    }

    public /* synthetic */ j3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
        this.j = obj5;
    }
}
