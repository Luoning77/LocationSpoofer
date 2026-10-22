package defpackage;

import com.vincenthzr.locationspoofer.xposed.LocationHooker;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class ei1 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ LocationHooker f;

    public /* synthetic */ ei1(LocationHooker locationHooker, int i) {
        this.e = i;
        this.f = locationHooker;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        LocationHooker locationHooker = this.f;
        switch (i) {
            case 0:
                return LocationHooker.handleSystemProcessGlobal$lambda$36(locationHooker);
            default:
                return LocationHooker.startFrameworkConfigReceiver$lambda$41(locationHooker);
        }
    }
}
