package defpackage;

import android.content.Context;
import android.net.Uri;
import com.vincenthzr.locationspoofer.data.cloud.AccountBenefitsRepository;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class x2 implements lu0 {
    public final /* synthetic */ int e = 2;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ x2(ey1 ey1Var, lr2 lr2Var, op0 op0Var, ny2 ny2Var, ey1 ey1Var2, ey1 ey1Var3) {
        this.i = ey1Var;
        this.f = lr2Var;
        this.g = op0Var;
        this.h = ny2Var;
        this.j = ey1Var2;
        this.k = ey1Var3;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Object obj2 = this.k;
        Object obj3 = this.j;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.i;
        switch (i) {
            case 0:
                String str = (String) obj6;
                AccountBenefitsRepository accountBenefitsRepository = (AccountBenefitsRepository) obj5;
                CoroutineScope coroutineScope = (CoroutineScope) obj4;
                ey1 ey1Var = (ey1) obj7;
                Context context = (Context) obj2;
                ey1 ey1Var2 = (ey1) obj3;
                Uri uri = (Uri) obj;
                String str2 = (String) ey1Var.getValue();
                ey1Var.setValue(null);
                if (uri != null && str2 != null && str != null && accountBenefitsRepository.current(str)) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new t3(context, uri, str2, ey1Var2, null, 0), 3, null);
                }
                break;
            case 1:
                h82[] h82VarArr = (h82[]) obj6;
                List list = (List) obj5;
                gr1 gr1Var = (gr1) obj4;
                ue2 ue2Var = (ue2) obj7;
                ue2 ue2Var2 = (ue2) obj3;
                ys ysVar = (ys) obj2;
                g82 g82Var = (g82) obj;
                int length = h82VarArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    h82 h82Var = h82VarArr[i2];
                    h82Var.getClass();
                    ws.d(g82Var, h82Var, (zq1) list.get(i3), gr1Var.getLayoutDirection(), ue2Var.e, ue2Var2.e, ysVar.a);
                    i2++;
                    i3++;
                }
                break;
            default:
                kd1 kd1Var = (kd1) obj;
                kd1Var.getClass();
                List list2 = (List) ((ey1) obj7).getValue();
                kd1Var.c(list2.size(), null, new u3(list2, 10), new p10(new fk2(list2, (lr2) obj6, (op0) obj5, (ny2) obj4, (ey1) obj3, (ey1) obj2), true, 802480018));
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ x2(String str, AccountBenefitsRepository accountBenefitsRepository, CoroutineScope coroutineScope, ey1 ey1Var, Context context, ey1 ey1Var2) {
        this.f = str;
        this.g = accountBenefitsRepository;
        this.h = coroutineScope;
        this.i = ey1Var;
        this.k = context;
        this.j = ey1Var2;
    }

    public /* synthetic */ x2(h82[] h82VarArr, List list, gr1 gr1Var, ue2 ue2Var, ue2 ue2Var2, ys ysVar) {
        this.f = h82VarArr;
        this.g = list;
        this.h = gr1Var;
        this.i = ue2Var;
        this.j = ue2Var2;
        this.k = ysVar;
    }
}
