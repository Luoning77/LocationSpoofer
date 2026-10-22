package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class lk implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Context f;

    public /* synthetic */ lk(Context context, int i) {
        this.e = i;
        this.f = context;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    @Override // java.lang.Runnable
    public final void run() {
        uh1 uh1Var;
        int i = this.e;
        Context context = this.f;
        switch (i) {
            case 0:
                if (Build.VERSION.SDK_INT >= 33) {
                    ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (eu.a()) {
                            Object objB = ok.b();
                            if (objB != null) {
                                uh1Var = new uh1(new vh1(nk.a(objB)));
                            } else {
                                uh1Var = uh1.b;
                            }
                        } else {
                            uh1Var = ok.g;
                            if (uh1Var == null) {
                                uh1Var = uh1.b;
                            }
                        }
                        if (uh1Var.b()) {
                            String strQ = ji2.Q(context);
                            Object systemService = context.getSystemService("locale");
                            if (systemService != null) {
                                nk.b(systemService, mk.a(strQ));
                            }
                        }
                        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                ok.j = true;
                break;
            case 1:
                ok.r(context);
                break;
            case 2:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new lk(context, 3));
                break;
            default:
                ym3.P(context, new co(1), ym3.c0, false);
                break;
        }
    }
}
