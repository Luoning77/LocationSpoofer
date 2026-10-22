package defpackage;

import android.os.IBinder;
import io.github.libxposed.service.XposedService;
import io.github.libxposed.service.XposedServiceHelper;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class xm3 implements IBinder.DeathRecipient {
    public final /* synthetic */ int a;
    public final /* synthetic */ XposedService b;

    public /* synthetic */ xm3(XposedService xposedService, int i) {
        this.a = i;
        this.b = xposedService;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        int i = this.a;
        XposedService xposedService = this.b;
        switch (i) {
            case 0:
                XposedServiceHelper.lambda$registerListener$1(xposedService);
                break;
            default:
                XposedServiceHelper.lambda$onBinderReceived$0(xposedService);
                break;
        }
    }
}
