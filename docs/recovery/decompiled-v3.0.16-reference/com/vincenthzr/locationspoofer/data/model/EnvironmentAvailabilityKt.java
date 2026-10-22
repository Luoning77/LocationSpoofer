package com.vincenthzr.locationspoofer.data.model;

import defpackage.i52;
import defpackage.r13;
import defpackage.vl0;
import defpackage.yo;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class EnvironmentAvailabilityKt {
    public static final boolean isEnvironmentPoint(AppState appState, double d, double d2) {
        Double dR;
        appState.getClass();
        Double dR2 = r13.R(appState.getLatitudeInput());
        return dR2 != null && Math.abs(dR2.doubleValue() - d) <= 1.0E-6d && (dR = r13.R(appState.getLongitudeInput())) != null && Math.abs(dR.doubleValue() - d2) <= 1.0E-6d;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003b  */
    /* JADX WARN: Code duplicated, block: B:11:0x003e  */
    /* JADX WARN: Code duplicated, block: B:14:0x004a  */
    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    public static final AppState withEnvironmentData(AppState appState, String str, String str2, String str3) {
        AppState appState2;
        boolean z;
        boolean z2;
        WifiLoadStatus wifiLoadStatus;
        i52 wifiLookupPoint;
        appState.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        vl0 vl0Var = vl0.a;
        int iE = vl0.e(str);
        i52 wifiLookupPoint2 = appState.getWifiLookupPoint();
        if (wifiLookupPoint2 != null) {
            double dDoubleValue = ((Number) wifiLookupPoint2.e).doubleValue();
            double dDoubleValue2 = ((Number) wifiLookupPoint2.f).doubleValue();
            appState2 = appState;
            if (isEnvironmentPoint(appState2, dDoubleValue, dDoubleValue2)) {
                z = true;
            }
            if (iE > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean zA = vl0.a(str2);
            boolean zA2 = vl0.a(str3);
            if (iE > 0) {
                wifiLoadStatus = WifiLoadStatus.DONE;
            } else if (z || !yo.H0(new WifiLoadStatus[]{WifiLoadStatus.LOADING, WifiLoadStatus.EMPTY, WifiLoadStatus.ERROR}).contains(appState2.getWifiLoadStatus())) {
                wifiLoadStatus = WifiLoadStatus.IDLE;
            } else {
                wifiLoadStatus = appState2.getWifiLoadStatus();
            }
            WifiLoadStatus wifiLoadStatus2 = wifiLoadStatus;
            wifiLookupPoint = appState2.getWifiLookupPoint();
            if (!z) {
                wifiLookupPoint = null;
            }
            return AppState.copy$default(appState2, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, wifiLoadStatus2, wifiLookupPoint, iE, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, str, str2, str3, false, false, false, false, false, null, 0, null, z2, zA, zA2, null, null, Integer.MAX_VALUE, -4, 104843263, null);
        }
        appState2 = appState;
        z = false;
        if (iE > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean zA3 = vl0.a(str2);
        boolean zA4 = vl0.a(str3);
        if (iE > 0) {
            wifiLoadStatus = WifiLoadStatus.DONE;
        } else if (z) {
            wifiLoadStatus = WifiLoadStatus.IDLE;
        } else {
            wifiLoadStatus = WifiLoadStatus.IDLE;
        }
        WifiLoadStatus wifiLoadStatus3 = wifiLoadStatus;
        wifiLookupPoint = appState2.getWifiLookupPoint();
        if (!z) {
            wifiLookupPoint = null;
        }
        return AppState.copy$default(appState2, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, wifiLoadStatus3, wifiLookupPoint, iE, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, str, str2, str3, false, false, false, false, false, null, 0, null, z2, zA3, zA4, null, null, Integer.MAX_VALUE, -4, 104843263, null);
    }
}
