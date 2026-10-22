package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.ComponentActivity;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class g10 extends aa1 implements au0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ComponentActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g10(ComponentActivity componentActivity, int i) {
        super(0);
        this.f = i;
        this.g = componentActivity;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.f;
        int i2 = 1;
        ComponentActivity componentActivity = this.g;
        switch (i) {
            case 0:
                return new um2(componentActivity.getApplication(), componentActivity, componentActivity.getIntent() != null ? componentActivity.getIntent().getExtras() : null);
            case 1:
                componentActivity.reportFullyDrawn();
                return mf3.a;
            case 2:
                return new zt0(componentActivity.reportFullyDrawnExecutor, new g10(componentActivity, i2));
            default:
                x12 x12Var = new x12(new t00(componentActivity, i2));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (o51.f(Looper.myLooper(), Looper.getMainLooper())) {
                        componentActivity.addObserverForBackInvoker(x12Var);
                    } else {
                        new Handler(Looper.getMainLooper()).post(new ub(2, componentActivity, x12Var));
                    }
                }
                return x12Var;
        }
    }
}
