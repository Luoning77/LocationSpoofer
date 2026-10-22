package defpackage;

import android.content.Context;
import android.content.Intent;
import com.vincenthzr.locationspoofer.data.repository.SpoofingServiceController;
import com.vincenthzr.locationspoofer.service.FloatingJoystickService;
import com.vincenthzr.locationspoofer.service.SpoofingService;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class tz2 implements SpoofingServiceController {
    @Override // com.vincenthzr.locationspoofer.data.repository.SpoofingServiceController
    public final boolean isFloatingJoystickShowing() {
        FloatingJoystickService.Companion.getClass();
        return FloatingJoystickService.isShowing;
    }

    @Override // com.vincenthzr.locationspoofer.data.repository.SpoofingServiceController
    public final boolean isRunning() {
        SpoofingService.Companion.getClass();
        return SpoofingService.ownership.isRunning();
    }

    @Override // com.vincenthzr.locationspoofer.data.repository.SpoofingServiceController
    public final boolean isRunningFor(long j) {
        SpoofingService.Companion.getClass();
        return SpoofingService.ownership.isRunningFor(j);
    }

    @Override // com.vincenthzr.locationspoofer.data.repository.SpoofingServiceController
    public final void setFloatingJoystickVisible(Context context, boolean z, boolean z2) {
        context.getClass();
        Intent intentPutExtra = new Intent(context, (Class<?>) FloatingJoystickService.class).putExtra(FloatingJoystickService.EXTRA_ALLOW_IDLE, z2);
        intentPutExtra.getClass();
        if (z) {
            context.startService(intentPutExtra);
        } else {
            context.stopService(intentPutExtra);
        }
    }

    @Override // com.vincenthzr.locationspoofer.data.repository.SpoofingServiceController
    public final void startForeground(Context context, double d, double d2) {
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) SpoofingService.class);
        intent.setAction(SpoofingService.ACTION_START);
        intent.putExtra(SpoofingService.EXTRA_LAT, d);
        intent.putExtra(SpoofingService.EXTRA_LNG, d2);
        context.startForegroundService(intent);
    }

    @Override // com.vincenthzr.locationspoofer.data.repository.SpoofingServiceController
    public final void stop(Context context) {
        context.getClass();
        try {
            context.stopService(new Intent(context, (Class<?>) SpoofingService.class));
        } catch (Throwable unused) {
        }
    }
}
