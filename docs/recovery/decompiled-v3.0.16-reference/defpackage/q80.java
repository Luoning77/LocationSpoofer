package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class q80 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Comparable h;
    public final /* synthetic */ Object i;

    public /* synthetic */ q80(Context context, Configuration configuration, au0 au0Var, long j) {
        this.e = 0;
        this.g = context;
        this.h = configuration;
        this.i = au0Var;
        this.f = j;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Object obj3 = this.i;
        Comparable comparable = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                Context context = (Context) obj4;
                Configuration configuration = (Configuration) comparable;
                au0 au0Var = (au0) obj3;
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = 0;
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    k22.c(new kk[]{AndroidCompositionLocals_androidKt.b.a(context), AndroidCompositionLocals_androidKt.a.a(configuration)}, sb.a0(1275503977, new s80(au0Var, this.f, i2), ov0Var), ov0Var, 56);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                k22.g((x01) obj4, this.f, (String) comparable, (dv1) obj3, (f30) obj, wc0.m0(49));
                break;
            default:
                ((Integer) obj2).getClass();
                sj2.b((x01) obj4, this.f, (String) comparable, (String) obj3, (f30) obj, wc0.m0(49));
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ q80(x01 x01Var, long j, String str, Object obj, int i, int i2) {
        this.e = i2;
        this.g = x01Var;
        this.f = j;
        this.h = str;
        this.i = obj;
    }
}
