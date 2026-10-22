package com.vincenthzr.locationspoofer.xposed.utils;

import defpackage.au0;
import defpackage.fo;
import defpackage.lu0;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class HotReloadHostKt {
    public static final void reinstallAfterHotReload(Object obj, au0 au0Var, au0 au0Var2, lu0 lu0Var) {
        au0Var.getClass();
        au0Var2.getClass();
        lu0Var.getClass();
        HotReloadHost hotReloadHostRestore = HotReloadHost.Companion.restore(obj);
        if (hotReloadHostRestore == null && (hotReloadHostRestore = (HotReloadHost) au0Var.invoke()) == null) {
            fo.n("Cannot resolve the host for module hot reload");
        } else {
            au0Var2.invoke();
            lu0Var.invoke(hotReloadHostRestore);
        }
    }
}
