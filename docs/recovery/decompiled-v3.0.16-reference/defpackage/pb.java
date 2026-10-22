package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class pb {
    public static final pb a = new pb();

    public final void a(View view) {
        view.clearViewTranslationCallback();
    }

    public final void b(View view) {
        nb nbVar = nb.a;
        nb nbVar2 = nb.a;
        view.setViewTranslationCallback(nbVar);
    }
}
