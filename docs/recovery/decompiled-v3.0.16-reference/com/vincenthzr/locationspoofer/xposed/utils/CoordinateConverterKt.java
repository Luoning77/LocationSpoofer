package com.vincenthzr.locationspoofer.xposed.utils;

import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import defpackage.i52;
import defpackage.l13;
import defpackage.mh0;
import defpackage.o51;
import defpackage.xq1;
import defpackage.z60;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CoordinateConverterKt {
    public static final i52 bd09ToGcj02(LocationHooker locationHooker, double d, double d2) {
        locationHooker.getClass();
        double d3 = d2 - 0.0065d;
        double d4 = d - 0.006d;
        double dSqrt = Math.sqrt((d4 * d4) + (d3 * d3)) - (Math.sin(d4 * 52.35987755982988d) * 2.0E-5d);
        double dAtan2 = Math.atan2(d4, d3) - (Math.cos(d3 * 52.35987755982988d) * 3.0E-6d);
        return new i52(Double.valueOf(Math.sin(dAtan2) * dSqrt), Double.valueOf(Math.cos(dAtan2) * dSqrt));
    }

    public static final i52 bd09llToBd09mc(double d, double d2) {
        return new i52(Double.valueOf(((Math.log(Math.tan(((mh0.t(d, -85.0511287798d, 85.0511287798d) + 90.0d) * 3.141592653589793d) / 360.0d)) / 0.017453292519943295d) * 2.0037508342789244E7d) / 180.0d), Double.valueOf((d2 * 2.0037508342789244E7d) / 180.0d));
    }

    public static final i52 gcj02ToBd09(LocationHooker locationHooker, double d, double d2) {
        locationHooker.getClass();
        double dSin = (Math.sin(d * 52.35987755982988d) * 2.0E-5d) + Math.sqrt((d * d) + (d2 * d2));
        double dCos = (Math.cos(d2 * 52.35987755982988d) * 3.0E-6d) + Math.atan2(d, d2);
        z60 z60Var = new z60((Math.sin(dCos) * dSin) + 0.006d, (Math.cos(dCos) * dSin) + 0.0065d);
        return new i52(Double.valueOf(z60Var.a), Double.valueOf(z60Var.b));
    }

    public static final i52 gcj02ToWgs84(LocationHooker locationHooker, double d, double d2) {
        locationHooker.getClass();
        z60 z60VarE = xq1.E(d, d2);
        return new i52(Double.valueOf(z60VarE.a), Double.valueOf(z60VarE.b));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    public static final i52 getAppTargetCoordinate(LocationHooker locationHooker, double d, double d2, JSONObject jSONObject, String str) {
        locationHooker.getClass();
        str.getClass();
        if (jSONObject == null) {
            if (str.equals("WGS-84")) {
                return gcj02ToWgs84(locationHooker, d, d2);
            }
            return str.equals("BD-09") ? gcj02ToBd09(locationHooker, d, d2) : new i52(Double.valueOf(d), Double.valueOf(d2));
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("app_coordinate_systems");
        String strA0 = l13.A0(locationHooker.getCurrentPackageName$xposed_globalRelease(), ":");
        String strOptString = (jSONObjectOptJSONObject == null || !jSONObjectOptJSONObject.has(strA0)) ? "AUTO" : jSONObjectOptJSONObject.optString(strA0, "AUTO");
        if (o51.f(strOptString, "AUTO")) {
            strOptString = str;
        } else {
            strOptString.getClass();
            if (l13.k0(strOptString)) {
                strOptString = str;
            }
        }
        int iHashCode = strOptString.hashCode();
        if (iHashCode != -1736143482) {
            if (iHashCode != 63022964) {
                if (iHashCode == 2096794945 && strOptString.equals("GCJ-02")) {
                    return new i52(Double.valueOf(d), Double.valueOf(d2));
                }
            } else if (strOptString.equals("BD-09")) {
                return gcj02ToBd09(locationHooker, d, d2);
            }
        } else if (strOptString.equals("WGS-84")) {
            return gcj02ToWgs84(locationHooker, d, d2);
        }
        if (str.equals("WGS-84")) {
            return gcj02ToWgs84(locationHooker, d, d2);
        }
        return str.equals("BD-09") ? gcj02ToBd09(locationHooker, d, d2) : new i52(Double.valueOf(d), Double.valueOf(d2));
    }

    public static /* synthetic */ i52 getAppTargetCoordinate$default(LocationHooker locationHooker, double d, double d2, JSONObject jSONObject, String str, int i, Object obj) {
        if ((i & 8) != 0) {
            str = "GCJ-02";
        }
        return getAppTargetCoordinate(locationHooker, d, d2, jSONObject, str);
    }

    public static final float getJitteredAccuracy(LocationHooker locationHooker) {
        locationHooker.getClass();
        locationHooker.setHookAccuracyDrift$xposed_globalRelease(((locationHooker.getRng$xposed_globalRelease().nextGaussian() * 0.1d) - (locationHooker.getHookAccuracyDrift$xposed_globalRelease() * 0.05d)) + locationHooker.getHookAccuracyDrift$xposed_globalRelease());
        return (float) mh0.t(locationHooker.getHookAccuracyDrift$xposed_globalRelease() + 2.2d, 1.5d, 3.5d);
    }

    public static final i52 getJitteredLocation(LocationHooker locationHooker, double d, double d2) {
        locationHooker.getClass();
        JSONObject lastConfig$xposed_globalRelease = locationHooker.getLastConfig$xposed_globalRelease();
        if (!(lastConfig$xposed_globalRelease != null ? lastConfig$xposed_globalRelease.optBoolean("enable_jitter", true) : true)) {
            return new i52(Double.valueOf(d), Double.valueOf(d2));
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        double dT = locationHooker.getHookLastCallTime$xposed_globalRelease() > 0 ? mh0.t((jCurrentTimeMillis - locationHooker.getHookLastCallTime$xposed_globalRelease()) / 1000.0d, 0.01d, 5.0d) : 1.0d;
        locationHooker.setHookLastCallTime$xposed_globalRelease(jCurrentTimeMillis);
        locationHooker.setHookDriftLat$xposed_globalRelease(mh0.t(((locationHooker.getRng$xposed_globalRelease().nextGaussian() * (Math.sqrt(dT) * 2.0E-6d)) + locationHooker.getHookDriftLat$xposed_globalRelease()) - ((locationHooker.getHookDriftLat$xposed_globalRelease() * 0.05d) * dT), -4.0E-5d, 4.0E-5d));
        locationHooker.setHookDriftLng$xposed_globalRelease(mh0.t(((locationHooker.getRng$xposed_globalRelease().nextGaussian() * (Math.sqrt(dT) * 2.0E-6d)) + locationHooker.getHookDriftLng$xposed_globalRelease()) - ((locationHooker.getHookDriftLng$xposed_globalRelease() * 0.05d) * dT), -4.0E-5d, 4.0E-5d));
        return new i52(Double.valueOf(locationHooker.getHookDriftLat$xposed_globalRelease() + d), Double.valueOf(locationHooker.getHookDriftLng$xposed_globalRelease() + d2));
    }

    public static final i52 wgs84ToGcj02(LocationHooker locationHooker, double d, double d2) {
        locationHooker.getClass();
        z60 z60VarS = xq1.S(d, d2);
        return new i52(Double.valueOf(z60VarS.a), Double.valueOf(z60VarS.b));
    }
}
