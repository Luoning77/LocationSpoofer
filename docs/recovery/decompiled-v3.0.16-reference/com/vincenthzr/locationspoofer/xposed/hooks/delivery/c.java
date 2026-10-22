package com.vincenthzr.locationspoofer.xposed.hooks.delivery;

import defpackage.au0;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class c implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                return Boolean.valueOf(FrameworkBleDelivery.hookCallback$lambda$43$lambda$42$lambda$41((FrameworkBleDelivery.Registration) obj3, (FrameworkBleDelivery) obj2, (JSONObject) obj));
            default:
                return FrameworkLocationDelivery.install$lambda$16$lambda$15((FrameworkLocationDelivery) obj3, obj2, (FrameworkLocationDelivery.StartupRequest) obj);
        }
    }
}
