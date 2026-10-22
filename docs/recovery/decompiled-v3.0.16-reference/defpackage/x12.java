package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class x12 {
    public final Runnable a;
    public final mo b = new mo();
    public o12 c;
    public final OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    public x12(Runnable runnable) {
        OnBackInvokedCallback onBackInvokedCallbackA;
        this.a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                onBackInvokedCallbackA = t12.a.a(new p12(this, 0), new p12(this, 1), new q12(this, 0), new q12(this, 1));
            } else {
                onBackInvokedCallbackA = r12.a.a(new q12(this, 2));
            }
            this.d = onBackInvokedCallbackA;
        }
    }

    public final void a(df1 df1Var, o12 o12Var) {
        df1Var.getClass();
        o12Var.getClass();
        xe1 lifecycle = df1Var.getLifecycle();
        if (((ff1) lifecycle).d == we1.e) {
            return;
        }
        o12Var.b.add(new u12(this, lifecycle, o12Var));
        e();
        o12Var.c = new w12(0, this, x12.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0);
    }

    public final void b() {
        Object objPrevious;
        o12 o12Var = this.c;
        if (o12Var == null) {
            mo moVar = this.b;
            ListIterator<E> listIterator = moVar.listIterator(moVar.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((o12) objPrevious).a);
            o12Var = (o12) objPrevious;
        }
        this.c = null;
        if (o12Var != null) {
            o12Var.a();
        }
    }

    public final void c() {
        Object objPrevious;
        o12 o12Var = this.c;
        if (o12Var == null) {
            mo moVar = this.b;
            ListIterator listIterator = moVar.listIterator(moVar.a());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((o12) objPrevious).a);
            o12Var = (o12) objPrevious;
        }
        this.c = null;
        if (o12Var != null) {
            o12Var.b();
        } else {
            this.a.run();
        }
    }

    public final void d(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.d) == null) {
            return;
        }
        r12 r12Var = r12.a;
        if (z && !this.f) {
            r12Var.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f = true;
        } else {
            if (z || !this.f) {
                return;
            }
            r12Var.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = false;
        }
    }

    public final void e() {
        boolean z = this.g;
        boolean z2 = false;
        mo moVar = this.b;
        if (moVar == null || !moVar.isEmpty()) {
            Iterator<E> it = moVar.iterator();
            while (it.hasNext()) {
                if (((o12) it.next()).a) {
                    z2 = true;
                    break;
                }
            }
        }
        this.g = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z2);
    }
}
