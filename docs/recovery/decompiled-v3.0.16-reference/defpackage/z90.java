package defpackage;

import com.vincenthzr.locationspoofer.xposed.hooks.delivery.FrameworkAdapters;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class z90 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;

    public /* synthetic */ z90(String str, int i) {
        this.e = i;
        this.f = str;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        String str = this.f;
        switch (i) {
            case 0:
                x81[] x81VarArr = qs2.a;
                rs2 rs2Var = os2.d;
                x81 x81Var = qs2.a[2];
                ((ss2) obj).a(rs2Var, str);
                return mf3Var;
            case 1:
                return FrameworkAdapters.install$acquire$lambda$0(str, (Throwable) obj);
            case 2:
                ss2 ss2Var = (ss2) obj;
                x81[] x81VarArr2 = qs2.a;
                ss2Var.a(os2.a, am1.F(str));
                qs2.c(ss2Var, 5);
                return mf3Var;
            case 3:
                ss2 ss2Var2 = (ss2) obj;
                x81[] x81VarArr3 = qs2.a;
                ss2Var2.a(os2.a, am1.F(str));
                qs2.c(ss2Var2, 5);
                return mf3Var;
            case 4:
                String str2 = (String) obj;
                str2.getClass();
                if (l13.k0(str2)) {
                    return str2.length() < str.length() ? str : str2;
                }
                return str.concat(str2);
            default:
                x81[] x81VarArr4 = qs2.a;
                ((ss2) obj).a(os2.M, str);
                return mf3Var;
        }
    }
}
