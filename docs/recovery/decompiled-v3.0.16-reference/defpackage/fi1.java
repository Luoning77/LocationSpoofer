package defpackage;

import com.vincenthzr.locationspoofer.xposed.LocationHooker;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class fi1 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ LocationHooker f;

    public /* synthetic */ fi1(LocationHooker locationHooker, int i) {
        this.e = i;
        this.f = locationHooker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        LocationHooker locationHooker = this.f;
        switch (i) {
            case 0:
                LocationHooker.startSensorWorker$lambda$51$lambda$49(locationHooker);
                break;
            default:
                LocationHooker.startConfigWorker$lambda$58$lambda$56(locationHooker);
                break;
        }
    }
}
