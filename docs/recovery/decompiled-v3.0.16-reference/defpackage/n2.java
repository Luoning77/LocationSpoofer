package defpackage;

import android.content.Context;
import com.vincenthzr.locationspoofer.data.cloud.AccountBenefitsRepository;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.SearchMode;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class n2 implements au0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ Object f;
    public final /* synthetic */ ey1 g;
    public final /* synthetic */ ey1 h;
    public final /* synthetic */ ey1 i;
    public final /* synthetic */ ey1 j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ CoroutineScope m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public /* synthetic */ n2(op0 op0Var, ny2 ny2Var, AppState appState, CoroutineScope coroutineScope, Context context, ey1 ey1Var, ul1 ul1Var, ey1 ey1Var2, ey1 ey1Var3, ey1 ey1Var4) {
        this.f = op0Var;
        this.l = ny2Var;
        this.o = appState;
        this.m = coroutineScope;
        this.k = context;
        this.g = ey1Var;
        this.n = ul1Var;
        this.h = ey1Var2;
        this.i = ey1Var3;
        this.j = ey1Var4;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Object obj = this.n;
        Object obj2 = this.k;
        Object obj3 = this.o;
        Object obj4 = this.l;
        Object obj5 = this.f;
        switch (i) {
            case 0:
                AccountBenefitsRepository accountBenefitsRepository = (AccountBenefitsRepository) obj5;
                xq1.q((String) obj3, this.m, (ey1) obj2, (ey1) obj, accountBenefitsRepository, new n3(accountBenefitsRepository, (String) obj4, this.g, this.h, this.i, this.j, null, 1));
                break;
            case 1:
                AccountBenefitsRepository accountBenefitsRepository2 = (AccountBenefitsRepository) obj5;
                xq1.f((String) obj4, this.m, (ey1) obj, (ey1) obj3, accountBenefitsRepository2, new q3(accountBenefitsRepository2, this.g, this.h, this.i, this.j, (ey1) obj2, null));
                break;
            default:
                op0 op0Var = (op0) obj5;
                ny2 ny2Var = (ny2) obj4;
                AppState appState = (AppState) obj3;
                Context context = (Context) obj2;
                ul1 ul1Var = (ul1) obj;
                ey1 ey1Var = this.g;
                Job job = (Job) ey1Var.getValue();
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                op0.a(op0Var);
                if (ny2Var != null) {
                    ((nb0) ny2Var).a();
                }
                SearchMode searchMode = appState.getSearchMode();
                SearchMode searchMode2 = SearchMode.LOCAL;
                CoroutineScope coroutineScope = this.m;
                ey1 ey1Var2 = this.h;
                ey1 ey1Var3 = this.i;
                if (searchMode != searchMode2) {
                    ey1 ey1Var4 = this.j;
                    if (!l13.k0((String) ey1Var4.getValue())) {
                        ey1Var.setValue(ks.W(context, appState.getMapEngine(), (String) ey1Var4.getValue(), coroutineScope, appState.getGeoSearchSource(), new ji1(context, ey1Var2, ey1Var3, 14)));
                    }
                } else {
                    ey1Var.setValue(BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new t3(ul1Var, context, ey1Var2, ey1Var3, (q60) null), 3, null));
                }
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ n2(ey1 ey1Var, ey1 ey1Var2, ey1 ey1Var3, ey1 ey1Var4, ey1 ey1Var5, ey1 ey1Var6, ey1 ey1Var7, AccountBenefitsRepository accountBenefitsRepository, String str, CoroutineScope coroutineScope) {
        this.f = accountBenefitsRepository;
        this.g = ey1Var;
        this.h = ey1Var2;
        this.i = ey1Var3;
        this.j = ey1Var4;
        this.k = ey1Var5;
        this.l = str;
        this.m = coroutineScope;
        this.n = ey1Var6;
        this.o = ey1Var7;
    }

    public /* synthetic */ n2(ey1 ey1Var, ey1 ey1Var2, ey1 ey1Var3, ey1 ey1Var4, ey1 ey1Var5, ey1 ey1Var6, AccountBenefitsRepository accountBenefitsRepository, String str, String str2, CoroutineScope coroutineScope) {
        this.f = accountBenefitsRepository;
        this.l = str;
        this.g = ey1Var;
        this.h = ey1Var2;
        this.i = ey1Var3;
        this.j = ey1Var4;
        this.o = str2;
        this.m = coroutineScope;
        this.k = ey1Var5;
        this.n = ey1Var6;
    }
}
