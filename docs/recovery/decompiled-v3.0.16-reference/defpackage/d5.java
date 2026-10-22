package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class d5 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ no1 f;

    public /* synthetic */ d5(no1 no1Var, int i) {
        this.e = i;
        this.f = no1Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        no1 no1Var = this.f;
        switch (i) {
            case 0:
                no1Var.a("android.permission.ACCESS_LOCAL_NETWORK");
                break;
            case 1:
                no1Var.a("environment_data_" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date()) + ".json");
                break;
            case 2:
                no1Var.a(new String[]{"application/json", "*/*"});
                break;
            default:
                no1Var.a(new String[]{"application/json", "*/*"});
                break;
        }
        return mf3Var;
    }
}
