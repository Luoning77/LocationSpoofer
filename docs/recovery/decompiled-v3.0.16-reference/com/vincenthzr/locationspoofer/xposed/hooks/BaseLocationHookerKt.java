package com.vincenthzr.locationspoofer.xposed.hooks;

import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.utils.CoordinateConverterKt;
import com.vincenthzr.locationspoofer.xposed.utils.RouteEngine;
import com.vincenthzr.locationspoofer.xposed.utils.SpoofedMotion;
import defpackage.i52;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class BaseLocationHookerKt {
    public static final SpoofedMotion getCurrentSpoofedMotion(LocationHooker locationHooker, String str) {
        locationHooker.getClass();
        str.getClass();
        JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
        if (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false)) {
            return null;
        }
        SpoofedMotion spoofedMotionCalculateCurrentPosition$default = RouteEngine.calculateCurrentPosition$default(RouteEngine.INSTANCE, config$xposed_globalRelease, 0L, 2, null);
        i52 appTargetCoordinate = CoordinateConverterKt.getAppTargetCoordinate(locationHooker, spoofedMotionCalculateCurrentPosition$default.getLat(), spoofedMotionCalculateCurrentPosition$default.getLng(), config$xposed_globalRelease, str);
        i52 jitteredLocation = CoordinateConverterKt.getJitteredLocation(locationHooker, ((Number) appTargetCoordinate.e).doubleValue(), ((Number) appTargetCoordinate.f).doubleValue());
        return new SpoofedMotion(((Number) jitteredLocation.e).doubleValue(), ((Number) jitteredLocation.f).doubleValue(), spoofedMotionCalculateCurrentPosition$default.getBearing(), spoofedMotionCalculateCurrentPosition$default.getSpeed());
    }

    public static /* synthetic */ SpoofedMotion getCurrentSpoofedMotion$default(LocationHooker locationHooker, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "GCJ-02";
        }
        return getCurrentSpoofedMotion(locationHooker, str);
    }

    public static final void hookLocationAPIs(LocationHooker locationHooker, ClassLoader classLoader, String str) {
        locationHooker.getClass();
        classLoader.getClass();
        str.getClass();
        LocationGetterHookerKt.hookLocationGetters(locationHooker, classLoader, str);
        LocationProviderHookerKt.hookLocationProviders(locationHooker, classLoader, str);
        locationHooker.hookAllMapSdks$xposed_globalRelease(classLoader);
    }
}
