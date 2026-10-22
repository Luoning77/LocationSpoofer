package com.vincenthzr.locationspoofer.xposed.utils;

import defpackage.ce0;
import defpackage.gn;
import defpackage.i52;
import defpackage.k91;
import defpackage.mh0;
import defpackage.o51;
import defpackage.qv1;
import defpackage.rv1;
import defpackage.s9;
import defpackage.sv1;
import defpackage.t9;
import defpackage.tj2;
import defpackage.uj2;
import defpackage.vd0;
import defpackage.z60;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class RouteEngine {
    public static final RouteEngine INSTANCE = new RouteEngine();
    private static final long JOYSTICK_MAX_EXTRAPOLATION_MS = 3000;
    private static volatile uj2 cachedPath;
    private static volatile JSONArray cachedRouteArray;

    private RouteEngine() {
    }

    public static /* synthetic */ SpoofedMotion calculateCurrentPosition$default(RouteEngine routeEngine, JSONObject jSONObject, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = System.currentTimeMillis();
        }
        return routeEngine.calculateCurrentPosition(jSONObject, j);
    }

    private final SpoofedMotion extrapolateJoystick(JSONObject jSONObject, long j, z60 z60Var, float f) {
        double dOptDouble = jSONObject.optDouble("speed_m_s", 0.0d);
        long jOptLong = jSONObject.optLong("start_timestamp", 0L);
        if (dOptDouble <= 0.0d || jOptLong <= 0) {
            return new SpoofedMotion(z60Var.a, z60Var.b, f, 0.0f);
        }
        z60 z60VarM = vd0.m(z60Var, f, (mh0.w(j - jOptLong, 0L, JOYSTICK_MAX_EXTRAPOLATION_MS) / 1000.0d) * dOptDouble);
        return new SpoofedMotion(z60VarM.a, z60VarM.b, f, (float) dOptDouble);
    }

    public static /* synthetic */ rv1 realismSession$default(RouteEngine routeEngine, JSONObject jSONObject, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = jSONObject.optLong("start_timestamp", 0L);
        }
        return routeEngine.realismSession(jSONObject, j);
    }

    public static /* synthetic */ double realisticAltitude$default(RouteEngine routeEngine, JSONObject jSONObject, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = System.currentTimeMillis();
        }
        return routeEngine.realisticAltitude(jSONObject, j);
    }

    private final uj2 routePath(JSONArray jSONArray) {
        uj2 uj2Var = cachedPath;
        if (jSONArray == cachedRouteArray && uj2Var != null) {
            return uj2Var;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                arrayList.add(new z60(jSONObjectOptJSONObject.optDouble("lat", 0.0d), jSONObjectOptJSONObject.optDouble("lng", 0.0d)));
            }
        }
        uj2 uj2Var2 = new uj2(arrayList);
        cachedPath = uj2Var2;
        cachedRouteArray = jSONArray;
        return uj2Var2;
    }

    public final SpoofedMotion calculateCurrentPosition(JSONObject jSONObject, long j) {
        jSONObject.getClass();
        double dOptDouble = jSONObject.optDouble("lat", 0.0d);
        double dOptDouble2 = jSONObject.optDouble("lng", 0.0d);
        z60 z60Var = new z60(dOptDouble, dOptDouble2);
        float fOptDouble = (float) jSONObject.optDouble("sim_bearing", 0.0d);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("route_points");
        if (!jSONObject.optBoolean("is_route_mode", false) || jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() < 2) {
            return o51.f(jSONObject.optString("sim_mode"), "JOYSTICK") ? extrapolateJoystick(jSONObject, j, z60Var, fOptDouble) : new SpoofedMotion(dOptDouble, dOptDouble2, fOptDouble, 0.0f);
        }
        uj2 uj2VarRoutePath = routePath(jSONArrayOptJSONArray);
        if (!uj2VarRoutePath.a()) {
            return new SpoofedMotion(dOptDouble, dOptDouble2, fOptDouble, 0.0f);
        }
        double dOptDouble3 = jSONObject.optDouble("speed_m_s", 3.0d);
        if (dOptDouble3 < 0.1d) {
            dOptDouble3 = 0.1d;
        }
        long jOptLong = jSONObject.optLong("start_timestamp", 0L);
        if (jOptLong <= 0) {
            jOptLong = j;
        }
        long j2 = j - jOptLong;
        double d = (j2 >= 0 ? j2 : 0L) / 1000.0d;
        rv1 rv1VarRealismSession = realismSession(jSONObject, jOptLong);
        double dOptDouble4 = jSONObject.optDouble("route_distance_offset", 0.0d);
        double d2 = dOptDouble4 >= 0.0d ? dOptDouble4 : 0.0d;
        double d3 = rv1VarRealismSession.d;
        gn gnVar = rv1VarRealismSession.e;
        double dU = (((gnVar.u(d) * d3) + d) * dOptDouble3) + d2;
        boolean zOptBoolean = jSONObject.optBoolean("stop_at_destination", false);
        tj2 tj2VarO = jSONObject.optBoolean("route_lateral_deviation", false) ? ce0.O(uj2VarRoutePath, dU, zOptBoolean, jSONObject.optLong("route_lateral_seed", jOptLong)) : uj2VarRoutePath.b(dU, zOptBoolean);
        return new SpoofedMotion(tj2VarO.a, tj2VarO.b, tj2VarO.c, tj2VarO.d ? 0.0f : (float) (((gnVar.H(d) * rv1VarRealismSession.d) + 1.0d) * dOptDouble3));
    }

    public final rv1 realismSession(JSONObject jSONObject, long j) {
        jSONObject.getClass();
        rv1 rv1Var = sv1.a;
        return sv1.c(jSONObject.optInt("realism_level", 0), jSONObject.optInt("speed_fluctuation_pct", 0), j);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x008c  */
    public final double realisticAltitude(JSONObject jSONObject, long j) {
        double d;
        s9 s9Var;
        jSONObject.getClass();
        double dOptDouble = jSONObject.optDouble("altitude", 25.0d);
        k91 k91Var = qv1.j;
        int iOptInt = jSONObject.optInt("realism_level", 0);
        k91Var.getClass();
        double d2 = k91.o(iOptInt).g;
        double dOptDouble2 = jSONObject.optDouble("altitude_variation_m", d2);
        double dSin = 0.0d;
        if (dOptDouble2 > 0.0d) {
            SpoofedMotion spoofedMotionCalculateCurrentPosition = calculateCurrentPosition(jSONObject, j);
            gn gnVar = t9.a;
            double lat = spoofedMotionCalculateCurrentPosition.getLat();
            double lng = spoofedMotionCalculateCurrentPosition.getLng();
            double dT = mh0.t(dOptDouble2, 0.0d, 100.0d);
            if (dT > 0.0d) {
                if (d2 < 0.0d) {
                    d2 = 0.0d;
                }
                double dMin = Math.min(d2, dT / 2.0d);
                double d3 = dT - dMin;
                double dCos = Math.cos((3.141592653589793d * lat) / 180.0d) * lng * 111320.0d;
                double d4 = lat * 110540.0d;
                i52 i52Var = t9.b;
                if (i52Var != null) {
                    double dDoubleValue = ((Number) i52Var.e).doubleValue();
                    s9 s9Var2 = (s9) i52Var.f;
                    if (dDoubleValue == d3) {
                        d = d3;
                        s9Var = s9Var2;
                    } else {
                        d = d3;
                        s9Var = new s9(Math.max(250.0d, (6.283185307179586d * d3) / 0.08d));
                        t9.b = new i52(Double.valueOf(d), s9Var);
                    }
                } else {
                    d = d3;
                    s9Var = new s9(Math.max(250.0d, (6.283185307179586d * d3) / 0.08d));
                    t9.b = new i52(Double.valueOf(d), s9Var);
                }
                for (int i = 0; i < 5; i++) {
                    dSin = (Math.sin((s9Var.b[i] * d4) + (s9Var.a[i] * dCos) + s9Var.c[i]) * s9Var.d[i]) + dSin;
                }
                s9Var.getClass();
                return (t9.a.H(j / 1000.0d) * dMin) + (d * dSin) + dOptDouble;
            }
        }
        return dOptDouble;
    }
}
