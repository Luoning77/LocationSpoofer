package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wk extends e1 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ zk d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk(zk zkVar, Context context) {
        super(zkVar);
        this.d = zkVar;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.e1
    public final IntentFilter d() {
        switch (this.c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // defpackage.e1
    public final int f() {
        Location location;
        boolean z;
        long j;
        Location lastKnownLocation;
        int i = this.c;
        Object obj = this.e;
        switch (i) {
            case 0:
                return ((PowerManager) obj).isPowerSaveMode() ? 2 : 1;
            default:
                gn gnVar = (gn) obj;
                LocationManager locationManager = (LocationManager) gnVar.a;
                lf lfVar = (lf) gnVar.b;
                if (lfVar.b <= System.currentTimeMillis()) {
                    Context context = (Context) gnVar.c;
                    Location lastKnownLocation2 = null;
                    if (wc0.y(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                            lastKnownLocation = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
                        }
                        location = lastKnownLocation;
                    } else {
                        location = null;
                    }
                    if (wc0.y(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                    }
                    if (lastKnownLocation2 == null || location == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > location.getTime()) {
                        location = lastKnownLocation2;
                    }
                    z = false;
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        pd3 pd3Var = pd3.d;
                        if (pd3Var == null) {
                            pd3Var = new pd3();
                            pd3.d = pd3Var;
                        }
                        pd3 pd3Var2 = pd3Var;
                        pd3Var2.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - 86400000);
                        pd3Var2.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                        z = pd3Var2.c == 1;
                        long j2 = pd3Var2.b;
                        long j3 = pd3Var2.a;
                        pd3Var2.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis + 86400000);
                        long j4 = pd3Var2.b;
                        if (j2 == -1 || j3 == -1) {
                            j = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j3) {
                                j2 = j4;
                            } else if (jCurrentTimeMillis > j2) {
                                j2 = j3;
                            }
                            j = j2 + 60000;
                        }
                        lfVar.a = z;
                        lfVar.b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i2 = Calendar.getInstance().get(11);
                        if (i2 < 6 || i2 >= 22) {
                            z = true;
                        }
                    }
                    break;
                } else {
                    z = lfVar.a;
                }
                return z ? 2 : 1;
        }
    }

    @Override // defpackage.e1
    public final void j() {
        int i = this.c;
        zk zkVar = this.d;
        switch (i) {
            case 0:
                zkVar.s(true, true);
                break;
            default:
                zkVar.s(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk(zk zkVar, gn gnVar) {
        super(zkVar);
        this.d = zkVar;
        this.e = gnVar;
    }
}
