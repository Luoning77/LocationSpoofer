package com.vincenthzr.locationspoofer.data.repository;

import android.content.Context;
import defpackage.b81;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface SpoofingServiceController {

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class DefaultImpls {
    }

    static /* synthetic */ void setFloatingJoystickVisible$default(SpoofingServiceController spoofingServiceController, Context context, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            b81.s("Super calls with default arguments not supported in this target, function: setFloatingJoystickVisible");
            return;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        spoofingServiceController.setFloatingJoystickVisible(context, z, z2);
    }

    boolean isFloatingJoystickShowing();

    boolean isRunning();

    boolean isRunningFor(long j);

    void setFloatingJoystickVisible(Context context, boolean z, boolean z2);

    void startForeground(Context context, double d, double d2);

    void stop(Context context);
}
