package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.af1;
import defpackage.fc2;
import defpackage.fo;
import defpackage.gc2;
import defpackage.gn;
import defpackage.k21;
import defpackage.uj0;
import defpackage.ve1;
import defpackage.ze1;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ProcessLifecycleInitializer implements k21 {
    @Override // defpackage.k21
    public final List a() {
        return uj0.e;
    }

    @Override // defpackage.k21
    public final Object b(Context context) {
        context.getClass();
        gn gnVarP = gn.p(context);
        gnVarP.getClass();
        if (!((HashSet) gnVarP.b).contains(ProcessLifecycleInitializer.class)) {
            fo.n("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!af1.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new ze1());
        }
        gc2 gc2Var = gc2.m;
        gc2Var.getClass();
        gc2Var.i = new Handler();
        gc2Var.j.e(ve1.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new fc2(gc2Var));
        return gc2Var;
    }
}
