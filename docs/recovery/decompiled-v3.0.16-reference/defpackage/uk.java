package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class uk {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, zk zkVar) {
        Objects.requireNonNull(zkVar);
        tk tkVar = new tk(zkVar, 0);
        m1.j(obj).registerOnBackInvokedCallback(1000000, tkVar);
        return tkVar;
    }

    public static void c(Object obj, Object obj2) {
        m1.j(obj).unregisterOnBackInvokedCallback(m1.g(obj2));
    }
}
