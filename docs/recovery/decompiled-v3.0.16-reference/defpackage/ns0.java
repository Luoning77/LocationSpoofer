package defpackage;

import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.hooks.delivery.FrameworkAdapters;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class ns0 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ LocationHooker f;
    public final /* synthetic */ ClassLoader g;

    public /* synthetic */ ns0(LocationHooker locationHooker, ClassLoader classLoader, int i) {
        this.e = i;
        this.f = locationHooker;
        this.g = classLoader;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        ClassLoader classLoader = this.g;
        LocationHooker locationHooker = this.f;
        switch (i) {
            case 0:
                return FrameworkAdapters.install$lambda$1(locationHooker, classLoader);
            case 1:
                return FrameworkAdapters.install$lambda$2(locationHooker, classLoader);
            case 2:
                return FrameworkAdapters.install$lambda$3(locationHooker, classLoader);
            case 3:
                return LocationHooker.handleSystemProcessGlobal$lambda$26(locationHooker, classLoader);
            case 4:
                return LocationHooker.handleSystemProcessGlobal$lambda$27(locationHooker, classLoader);
            case Logger.WARN /* 5 */:
                return LocationHooker.handleSystemProcessGlobal$lambda$28(locationHooker, classLoader);
            case Logger.ERROR /* 6 */:
                return LocationHooker.handleSystemProcessGlobal$lambda$29(locationHooker, classLoader);
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return LocationHooker.handleSystemProcessGlobal$lambda$30(locationHooker, classLoader);
            case 8:
                return LocationHooker.handleSystemProcessGlobal$lambda$31(locationHooker, classLoader);
            case mc0.b /* 9 */:
                return LocationHooker.handleSystemProcessGlobal$lambda$32(locationHooker, classLoader);
            case mc0.c /* 10 */:
                return LocationHooker.handleSystemProcessGlobal$lambda$33(locationHooker, classLoader);
            case 11:
                return LocationHooker.handleSystemProcessGlobal$lambda$34(locationHooker, classLoader);
            default:
                return LocationHooker.handleSystemProcessGlobal$lambda$25(locationHooker, classLoader);
        }
    }
}
