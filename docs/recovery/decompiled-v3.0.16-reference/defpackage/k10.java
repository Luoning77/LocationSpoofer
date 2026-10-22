package defpackage;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class k10 extends Dialog implements df1, y12, tm2 {
    public ff1 e;
    public final rm2 f;
    public final x12 g;

    public k10(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, i);
        this.f = new rm2(new sm2(this, new ol2(this, 3)));
        this.g = new x12(new w(this, 6));
    }

    public static final void c(k10 k10Var) {
        super.onBackPressed();
    }

    public final ff1 a() {
        ff1 ff1Var = this.e;
        if (ff1Var != null) {
            return ff1Var;
        }
        ff1 ff1Var2 = new ff1(this, true);
        this.e = ff1Var2;
        return ff1Var2;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(2131230945, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(2131230947, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(2131230948, this);
    }

    @Override // defpackage.df1
    public final xe1 getLifecycle() {
        return a();
    }

    @Override // defpackage.y12
    public final x12 getOnBackPressedDispatcher() {
        return this.g;
    }

    @Override // defpackage.tm2
    public final qm2 getSavedStateRegistry() {
        return this.f.b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.g.c();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            x12 x12Var = this.g;
            x12Var.getClass();
            x12Var.e = onBackInvokedDispatcher;
            x12Var.d(x12Var.g);
        }
        this.f.a(bundle);
        a().e(ve1.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.f.b(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        a().e(ve1.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        a().e(ve1.ON_DESTROY);
        this.e = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        b();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        b();
        super.setContentView(view, layoutParams);
    }
}
