package defpackage;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class be implements LocationListener {
    public final /* synthetic */ g80 a;

    public be(g80 g80Var) {
        this.a = g80Var;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        location.getClass();
        this.a.invoke(location);
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        str.getClass();
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
        str.getClass();
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
