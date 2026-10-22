package defpackage;

import com.vincenthzr.locationspoofer.xposed.hooks.delivery.FrameworkBleDelivery;
import io.github.libxposed.api.XposedInterface;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class c5 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ c5(FrameworkBleDelivery frameworkBleDelivery, XposedInterface.Chain chain, boolean z) {
        this.e = 2;
        this.g = frameworkBleDelivery;
        this.h = chain;
        this.f = z;
    }

    private final Object f() {
        return FrameworkBleDelivery.install$lambda$27$lambda$17$lambda$16((FrameworkBleDelivery) this.g, (XposedInterface.Chain) this.h, this.f);
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Object obj = this.h;
        Object obj2 = this.g;
        boolean z = this.f;
        switch (i) {
            case 0:
                ey1 ey1Var = (ey1) obj2;
                ey1 ey1Var2 = (ey1) obj;
                if (!z) {
                    ey1Var.setValue(Boolean.FALSE);
                    ey1Var2.setValue("");
                }
                return mf3Var;
            case 1:
                ((ey1) obj2).setValue(Boolean.FALSE);
                lr2 lr2Var = (lr2) ((ey1) obj).getValue();
                if (lr2Var != null) {
                    lr2Var.k = null;
                    lr2Var.k(lr2Var.c, z);
                }
                return mf3Var;
            default:
                return f();
        }
    }

    public /* synthetic */ c5(boolean z, ey1 ey1Var, ey1 ey1Var2, int i) {
        this.e = i;
        this.f = z;
        this.g = ey1Var;
        this.h = ey1Var2;
    }
}
