package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class ok {
    public static final in e = new in(new jn());
    public static final int f = -100;
    public static uh1 g = null;
    public static uh1 h = null;
    public static Boolean i = null;
    public static boolean j = false;
    public static final vo k = new vo(0);
    public static final Object l = new Object();
    public static final Object m = new Object();

    public static void a() {
        uh1 uh1Var;
        vo voVar = k;
        voVar.getClass();
        po poVar = new po(voVar);
        while (poVar.hasNext()) {
            ok okVar = (ok) ((WeakReference) poVar.next()).get();
            if (okVar != null) {
                zk zkVar = (zk) okVar;
                Context context = zkVar.o;
                int i2 = 1;
                if (f(context) && (uh1Var = g) != null && !uh1Var.equals(h)) {
                    e.execute(new lk(context, i2));
                }
                zkVar.s(true, true);
            }
        }
    }

    public static Object b() {
        Context context;
        vo voVar = k;
        voVar.getClass();
        po poVar = new po(voVar);
        while (poVar.hasNext()) {
            ok okVar = (ok) ((WeakReference) poVar.next()).get();
            if (okVar != null && (context = ((zk) okVar).o) != null) {
                return context.getSystemService("locale");
            }
        }
        return null;
    }

    public static boolean f(Context context) {
        if (i == null) {
            try {
                Bundle bundle = AppLocalesMetadataHolderService.getServiceInfo(context).metaData;
                if (bundle != null) {
                    i = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                i = Boolean.FALSE;
            }
        }
        return i.booleanValue();
    }

    public static void i(zk zkVar) {
        synchronized (l) {
            try {
                vo voVar = k;
                voVar.getClass();
                po poVar = new po(voVar);
                while (poVar.hasNext()) {
                    ok okVar = (ok) ((WeakReference) poVar.next()).get();
                    if (okVar == zkVar || okVar == null) {
                        poVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void l(uh1 uh1Var) {
        Objects.requireNonNull(uh1Var);
        if (eu.a()) {
            Object objB = b();
            if (objB != null) {
                nk.b(objB, mk.a(uh1Var.a.a.toLanguageTags()));
                return;
            }
            return;
        }
        if (uh1Var.equals(g)) {
            return;
        }
        synchronized (l) {
            g = uh1Var;
            a();
        }
    }

    public static void r(Context context) {
        if (f(context)) {
            if (eu.a()) {
                if (j) {
                    return;
                }
                e.execute(new lk(context, 0));
                return;
            }
            synchronized (m) {
                try {
                    uh1 uh1Var = g;
                    if (uh1Var == null) {
                        uh1 uh1VarA = h;
                        if (uh1VarA == null) {
                            uh1VarA = uh1.a(ji2.Q(context));
                            h = uh1VarA;
                        }
                        if (uh1VarA.b()) {
                        } else {
                            g = h;
                        }
                    } else if (!uh1Var.equals(h)) {
                        uh1 uh1Var2 = g;
                        h = uh1Var2;
                        ji2.O(context, uh1Var2.a.a.toLanguageTags());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public abstract void c();

    public abstract void d();

    public abstract void g();

    public abstract void h();

    public abstract boolean k(int i2);

    public abstract void m(int i2);

    public abstract void n(View view);

    public abstract void o(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void p(CharSequence charSequence);

    public abstract l7 q(k7 k7Var);
}
