package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fc2 extends qj0 {
    final /* synthetic */ gc2 this$0;

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class a extends qj0 {
        final /* synthetic */ gc2 this$0;

        public a(gc2 gc2Var) {
            this.this$0 = gc2Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            gc2 gc2Var = this.this$0;
            int i = gc2Var.e + 1;
            gc2Var.e = i;
            if (i == 1 && gc2Var.h) {
                gc2Var.j.e(ve1.ON_START);
                gc2Var.h = false;
            }
        }
    }

    public fc2(gc2 gc2Var) {
        this.this$0 = gc2Var;
    }

    @Override // defpackage.qj0, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = xf2.f;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            fragmentFindFragmentByTag.getClass();
            ((xf2) fragmentFindFragmentByTag).e = this.this$0.l;
        }
    }

    @Override // defpackage.qj0, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        gc2 gc2Var = this.this$0;
        int i = gc2Var.f - 1;
        gc2Var.f = i;
        if (i == 0) {
            Handler handler = gc2Var.i;
            handler.getClass();
            handler.postDelayed(gc2Var.k, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        rn.k(activity, new a(this.this$0));
    }

    @Override // defpackage.qj0, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        gc2 gc2Var = this.this$0;
        int i = gc2Var.e - 1;
        gc2Var.e = i;
        if (i == 0 && gc2Var.g) {
            gc2Var.j.e(ve1.ON_STOP);
            gc2Var.h = true;
        }
    }
}
