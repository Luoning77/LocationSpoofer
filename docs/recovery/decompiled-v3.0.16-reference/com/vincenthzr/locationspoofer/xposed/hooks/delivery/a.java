package com.vincenthzr.locationspoofer.xposed.hooks.delivery;

import defpackage.au0;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class a implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ FrameworkBleDelivery f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ FrameworkBleDelivery.Owner h;

    public /* synthetic */ a(FrameworkBleDelivery frameworkBleDelivery, Object obj, FrameworkBleDelivery.Owner owner, int i) {
        this.e = i;
        this.f = frameworkBleDelivery;
        this.g = obj;
        this.h = owner;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        FrameworkBleDelivery.Owner owner = this.h;
        Object obj = this.g;
        FrameworkBleDelivery frameworkBleDelivery = this.f;
        switch (i) {
            case 0:
                return FrameworkBleDelivery.install$lambda$27$lambda$26$lambda$25$lambda$24$lambda$23(frameworkBleDelivery, obj, owner);
            default:
                return FrameworkBleDelivery.install$lambda$27$lambda$26$lambda$25(frameworkBleDelivery, obj, owner);
        }
    }
}
