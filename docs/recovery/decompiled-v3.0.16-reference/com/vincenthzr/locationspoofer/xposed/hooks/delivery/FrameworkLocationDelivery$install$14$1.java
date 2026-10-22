package com.vincenthzr.locationspoofer.xposed.hooks.delivery;

import defpackage.hd;
import defpackage.mf3;
import java.util.TimerTask;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class FrameworkLocationDelivery$install$14$1 extends TimerTask {
    final /* synthetic */ FrameworkLocationDelivery this$0;

    public FrameworkLocationDelivery$install$14$1(FrameworkLocationDelivery frameworkLocationDelivery) {
        this.this$0 = frameworkLocationDelivery;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 run$lambda$0(FrameworkLocationDelivery frameworkLocationDelivery) {
        frameworkLocationDelivery.tick();
        return mf3.a;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        if (this.this$0.enabled) {
            FrameworkLocationDelivery frameworkLocationDelivery = this.this$0;
            frameworkLocationDelivery.guarded("heartbeat", new hd(frameworkLocationDelivery, 15));
        }
    }
}
