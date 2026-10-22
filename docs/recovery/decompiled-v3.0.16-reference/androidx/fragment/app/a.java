package androidx.fragment.app;

import android.content.Context;
import android.os.Handler;
import defpackage.f8;
import defpackage.hs0;
import defpackage.j8;
import defpackage.oj3;
import defpackage.pj3;
import defpackage.qm2;
import defpackage.tm2;
import defpackage.x12;
import defpackage.xe1;
import defpackage.y12;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class a implements pj3, y12, j8, tm2 {
    public final Context e;
    public final Handler f;
    public final hs0 g;
    public final /* synthetic */ FragmentActivity h;

    public a(FragmentActivity fragmentActivity) {
        this.h = fragmentActivity;
        Handler handler = new Handler();
        this.e = fragmentActivity;
        this.f = handler;
        this.g = new hs0();
    }

    @Override // defpackage.j8
    public final f8 getActivityResultRegistry() {
        return this.h.getActivityResultRegistry();
    }

    @Override // defpackage.df1
    public final xe1 getLifecycle() {
        return this.h.mFragmentLifecycleRegistry;
    }

    @Override // defpackage.y12
    public final x12 getOnBackPressedDispatcher() {
        return this.h.getOnBackPressedDispatcher();
    }

    @Override // defpackage.tm2
    public final qm2 getSavedStateRegistry() {
        return this.h.getSavedStateRegistry();
    }

    @Override // defpackage.pj3
    public final oj3 getViewModelStore() {
        return this.h.getViewModelStore();
    }
}
