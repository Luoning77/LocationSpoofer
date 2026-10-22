package defpackage;

import android.content.Context;
import com.vincenthzr.locationspoofer.data.cloud.CloudGeoSource;
import com.vincenthzr.locationspoofer.data.db.CompleteLocation;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.MapEngine;
import com.vincenthzr.locationspoofer.data.model.SearchMode;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class ii0 implements au0 {
    public final /* synthetic */ int e = 2;
    public final /* synthetic */ ey1 f;
    public final /* synthetic */ ey1 g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ ii0(op0 op0Var, ny2 ny2Var, lu0 lu0Var, AppState appState, CoroutineScope coroutineScope, ul1 ul1Var, Context context, ey1 ey1Var, ey1 ey1Var2) {
        this.h = op0Var;
        this.i = ny2Var;
        this.j = lu0Var;
        this.k = appState;
        this.l = coroutineScope;
        this.m = ul1Var;
        this.n = context;
        this.f = ey1Var;
        this.g = ey1Var2;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Object obj = this.n;
        Object obj2 = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        ey1 ey1Var = this.g;
        ey1 ey1Var2 = this.f;
        Object obj6 = this.m;
        Object obj7 = this.h;
        switch (i) {
            case 0:
                vu0 vu0Var = (vu0) obj7;
                t52 t52Var = (t52) obj6;
                t52 t52Var2 = (t52) obj;
                ey1 ey1Var3 = (ey1) obj5;
                ey1 ey1Var4 = (ey1) obj4;
                ey1 ey1Var5 = (ey1) obj3;
                ey1 ey1Var6 = (ey1) obj2;
                String str = (String) ey1Var2.getValue();
                if (l13.k0(str)) {
                    Locale locale = Locale.US;
                    k41 k41Var = new k41(0, 255, 1);
                    o0 o0Var = od2.e;
                    str = String.format(locale, "02:00:00:%02X:%02X:%02X", Arrays.copyOf(new Object[]{Integer.valueOf(mh0.U(k41Var)), Integer.valueOf(mh0.U(new k41(0, 255, 1))), Integer.valueOf(mh0.U(new k41(0, 255, 1)))}, 3));
                }
                String str2 = str;
                String str3 = (String) ey1Var.getValue();
                if (l13.k0(str3)) {
                    str3 = "Mock_WiFi";
                }
                Integer numValueOf = Integer.valueOf(t52Var.g());
                Integer numValueOf2 = Integer.valueOf(t52Var2.g());
                String str4 = (String) ey1Var3.getValue();
                String str5 = (String) ey1Var4.getValue();
                Boolean bool = (Boolean) ey1Var5.getValue();
                bool.booleanValue();
                Boolean bool2 = (Boolean) ey1Var6.getValue();
                bool2.booleanValue();
                vu0Var.d(str2, str3, numValueOf, numValueOf2, str4, str5, bool, bool2);
                break;
            case 1:
                op0 op0Var = (op0) obj7;
                ny2 ny2Var = (ny2) obj5;
                lu0 lu0Var = (lu0) obj4;
                AppState appState = (AppState) obj3;
                CoroutineScope coroutineScope = (CoroutineScope) obj2;
                ul1 ul1Var = (ul1) obj6;
                Context context = (Context) obj;
                Job job = (Job) ey1Var2.getValue();
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                op0.a(op0Var);
                if (ny2Var != null) {
                    ((nb0) ny2Var).a();
                }
                String str6 = ((uz2) ey1Var.getValue()).f;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (!((uz2) ey1Var.getValue()).g.isEmpty() && ((uz2) ey1Var.getValue()).i.equals(((uz2) ey1Var.getValue()).f) && jCurrentTimeMillis - ((uz2) ey1Var.getValue()).j <= 30000) {
                    lu0Var.invoke(new mz2(((uz2) ey1Var.getValue()).g, true, ((uz2) ey1Var.getValue()).f));
                } else if (appState.getSearchMode() == SearchMode.LOCAL) {
                    ey1Var2.setValue(BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new m(ul1Var, lu0Var, str6, null, 13), 3, null));
                } else if (!l13.k0(((uz2) ey1Var.getValue()).f)) {
                    MapEngine mapEngine = appState.getMapEngine();
                    String str7 = ((uz2) ey1Var.getValue()).f;
                    CloudGeoSource geoSearchSource = appState.getGeoSearchSource();
                    ul1Var.getClass();
                    ey1Var2.setValue(ks.W(context, mapEngine, str7, coroutineScope, geoSearchSource, new j(28, lu0Var, str6)));
                }
                break;
            default:
                CompleteLocation completeLocation = (CompleteLocation) obj7;
                uu0 uu0Var = (uu0) obj6;
                ey1 ey1Var7 = (ey1) obj5;
                ey1 ey1Var8 = (ey1) obj4;
                ey1 ey1Var9 = (ey1) obj3;
                ey1 ey1Var10 = (ey1) obj2;
                ey1 ey1Var11 = (ey1) obj;
                Double dR = r13.R((String) ey1Var2.getValue());
                double dDoubleValue = dR != null ? dR.doubleValue() : completeLocation.getLocation().getLat();
                Double dR2 = r13.R((String) ey1Var.getValue());
                uu0Var.a(Double.valueOf(dDoubleValue), Double.valueOf(dR2 != null ? dR2.doubleValue() : completeLocation.getLocation().getLng()), (String) ey1Var7.getValue(), (String) ey1Var8.getValue(), (String) ey1Var9.getValue(), (String) ey1Var10.getValue(), (String) ey1Var11.getValue());
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ ii0(vu0 vu0Var, ey1 ey1Var, ey1 ey1Var2, t52 t52Var, t52 t52Var2, ey1 ey1Var3, ey1 ey1Var4, ey1 ey1Var5, ey1 ey1Var6) {
        this.h = vu0Var;
        this.f = ey1Var;
        this.g = ey1Var2;
        this.m = t52Var;
        this.n = t52Var2;
        this.i = ey1Var3;
        this.j = ey1Var4;
        this.k = ey1Var5;
        this.l = ey1Var6;
    }

    public /* synthetic */ ii0(CompleteLocation completeLocation, uu0 uu0Var, ey1 ey1Var, ey1 ey1Var2, ey1 ey1Var3, ey1 ey1Var4, ey1 ey1Var5, ey1 ey1Var6, ey1 ey1Var7) {
        this.h = completeLocation;
        this.m = uu0Var;
        this.f = ey1Var;
        this.g = ey1Var2;
        this.i = ey1Var3;
        this.j = ey1Var4;
        this.k = ey1Var5;
        this.l = ey1Var6;
        this.n = ey1Var7;
    }
}
