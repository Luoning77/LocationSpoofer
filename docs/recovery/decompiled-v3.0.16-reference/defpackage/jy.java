package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudMapResourceCallFactory$ResourceCall$GuardedBody$guardedSource$1$1$1;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class jy implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ CloudMapResourceCallFactory$ResourceCall$GuardedBody$guardedSource$1$1$1 f;

    public /* synthetic */ jy(CloudMapResourceCallFactory$ResourceCall$GuardedBody$guardedSource$1$1$1 cloudMapResourceCallFactory$ResourceCall$GuardedBody$guardedSource$1$1$1, int i) {
        this.e = i;
        this.f = cloudMapResourceCallFactory$ResourceCall$GuardedBody$guardedSource$1$1$1;
    }

    @Override // defpackage.au0
    public final Object invoke() throws IOException {
        int iAvailable;
        int i = this.e;
        CloudMapResourceCallFactory$ResourceCall$GuardedBody$guardedSource$1$1$1 cloudMapResourceCallFactory$ResourceCall$GuardedBody$guardedSource$1$1$1 = this.f;
        switch (i) {
            case 0:
                return CloudMapResourceCallFactory$ResourceCall$GuardedBody$guardedSource$1$1$1.reset$lambda$4(cloudMapResourceCallFactory$ResourceCall$GuardedBody$guardedSource$1$1$1);
            case 1:
                iAvailable = super/*java.io.FilterInputStream*/.read();
                break;
            default:
                iAvailable = super/*java.io.FilterInputStream*/.available();
                break;
        }
        return Integer.valueOf(iAvailable);
    }
}
