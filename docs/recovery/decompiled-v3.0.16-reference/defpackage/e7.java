package defpackage;

import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class e7 implements Runnable {
    public final /* synthetic */ int e;
    public final Object f;
    public final /* synthetic */ Object g;

    public e7(g7 g7Var, c7 c7Var) {
        this.e = 0;
        this.g = g7Var;
        this.f = c7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ks1 ks1Var;
        int i = this.e;
        Object obj = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                c7 c7Var = (c7) obj2;
                g7 g7Var = (g7) obj;
                ms1 ms1Var = g7Var.g;
                if (ms1Var != null && (ks1Var = ms1Var.e) != null) {
                    ks1Var.j(ms1Var);
                }
                View view = (View) g7Var.l;
                if (view != null && view.getWindowToken() != null) {
                    if (c7Var.b()) {
                        g7Var.w = c7Var;
                    } else if (c7Var.e != null) {
                        c7Var.d(0, 0, false, false);
                        g7Var.w = c7Var;
                    }
                }
                g7Var.y = null;
                return;
            case 1:
                ((o7) obj2).a = obj;
                return;
            case 2:
                ((Application) obj2).unregisterActivityLifecycleCallbacks((o7) obj);
                return;
            case 3:
                try {
                    Method method = p7.d;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        p7.e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e) {
                    if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                        throw e;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 4:
                Typeface typeface = (Typeface) obj;
                dm dmVar = (dm) ((us1) obj2).f;
                if (dmVar != null) {
                    dmVar.k(typeface);
                    return;
                }
                return;
            default:
                ((xq0) obj2).accept(obj);
                return;
        }
    }

    public /* synthetic */ e7(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }
}
