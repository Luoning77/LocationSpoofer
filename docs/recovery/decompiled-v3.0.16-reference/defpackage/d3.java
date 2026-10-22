package defpackage;

import android.app.PendingIntent;
import com.vincenthzr.locationspoofer.data.cloud.AccountBenefitsRepository;
import java.util.Arrays;
import java.util.Locale;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class d3 implements au0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ d3(u4 u4Var, op0 op0Var, l6 l6Var, ey1 ey1Var, ey1 ey1Var2, ey1 ey1Var3) {
        this.i = u4Var;
        this.j = op0Var;
        this.k = l6Var;
        this.f = ey1Var;
        this.g = ey1Var2;
        this.h = ey1Var3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.au0
    public final Object invoke() throws PendingIntent.CanceledException {
        int i = this.e;
        int i2 = 0;
        Object[] objArr = 0;
        int i3 = 1;
        mf3 mf3Var = mf3.a;
        Object obj = this.k;
        Object obj2 = this.h;
        Object obj3 = this.j;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.i;
        switch (i) {
            case 0:
                AccountBenefitsRepository accountBenefitsRepository = (AccountBenefitsRepository) obj6;
                xq1.q((String) obj3, (CoroutineScope) obj, (ey1) obj4, (ey1) obj2, accountBenefitsRepository, new m(accountBenefitsRepository, (ey1) obj5, objArr == true ? 1 : 0, i3));
                break;
            case 1:
                op0 op0Var = (op0) obj3;
                l6 l6Var = (l6) obj;
                ey1 ey1Var = (ey1) obj5;
                ey1 ey1Var2 = (ey1) obj4;
                ey1 ey1Var3 = (ey1) obj2;
                if (((u4) obj6).c) {
                    op0.a(op0Var);
                    String str = (String) ey1Var.getValue();
                    String str2 = (String) ey1Var2.getValue();
                    String str3 = ((Boolean) ey1Var3.getValue()).booleanValue() ? "" : null;
                    str.getClass();
                    str2.getClass();
                    l6Var.g(new k6(l6Var, str, str2, str3, false, null));
                }
                break;
            case 2:
                su0 su0Var = (su0) obj6;
                ey1 ey1Var4 = (ey1) obj4;
                ey1 ey1Var5 = (ey1) obj2;
                t52 t52Var = (t52) obj3;
                ey1 ey1Var6 = (ey1) obj;
                String str4 = (String) ((ey1) obj5).getValue();
                if (l13.k0(str4)) {
                    Locale locale = Locale.US;
                    k41 k41Var = new k41(0, 255, 1);
                    o0 o0Var = od2.e;
                    str4 = String.format(locale, "02:00:00:%02X:%02X:%02X", Arrays.copyOf(new Object[]{Integer.valueOf(mh0.U(k41Var)), Integer.valueOf(mh0.U(new k41(0, 255, 1))), Integer.valueOf(mh0.U(new k41(0, 255, 1)))}, 3));
                }
                String str5 = (String) ey1Var4.getValue();
                if (l13.k0(str5)) {
                    str5 = "Mock_BLE";
                }
                Object obj7 = (String) ey1Var5.getValue();
                Object objValueOf = Integer.valueOf(t52Var.g());
                Boolean bool = (Boolean) ey1Var6.getValue();
                bool.booleanValue();
                su0Var.b(str4, str5, obj7, objValueOf, bool);
                break;
            default:
                pl2 pl2Var = (pl2) obj6;
                wm2 wm2Var = (wm2) obj5;
                tl2 tl2Var = (tl2) obj4;
                String str6 = (String) obj3;
                Object[] objArr2 = (Object[]) obj;
                if (pl2Var.f != tl2Var) {
                    pl2Var.f = tl2Var;
                    i2 = 1;
                }
                if (o51.f(pl2Var.g, str6)) {
                    i3 = i2;
                } else {
                    pl2Var.g = str6;
                }
                pl2Var.e = wm2Var;
                pl2Var.h = obj2;
                pl2Var.i = objArr2;
                sl2 sl2Var = pl2Var.j;
                if (sl2Var != null && i3 != 0) {
                    ((gn) sl2Var).G();
                    pl2Var.j = null;
                    pl2Var.d();
                }
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ d3(su0 su0Var, ey1 ey1Var, ey1 ey1Var2, ey1 ey1Var3, t52 t52Var, ey1 ey1Var4) {
        this.i = su0Var;
        this.f = ey1Var;
        this.g = ey1Var2;
        this.h = ey1Var3;
        this.j = t52Var;
        this.k = ey1Var4;
    }

    public /* synthetic */ d3(pl2 pl2Var, wm2 wm2Var, tl2 tl2Var, String str, Object obj, Object[] objArr) {
        this.i = pl2Var;
        this.f = wm2Var;
        this.g = tl2Var;
        this.j = str;
        this.h = obj;
        this.k = objArr;
    }

    public /* synthetic */ d3(AccountBenefitsRepository accountBenefitsRepository, ey1 ey1Var, String str, CoroutineScope coroutineScope, ey1 ey1Var2, ey1 ey1Var3) {
        this.i = accountBenefitsRepository;
        this.f = ey1Var;
        this.j = str;
        this.k = coroutineScope;
        this.g = ey1Var2;
        this.h = ey1Var3;
    }
}
