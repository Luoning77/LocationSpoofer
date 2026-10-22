package com.vincenthzr.locationspoofer.xposed.hooks;

import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.utils.CoordinateConverterKt;
import com.vincenthzr.locationspoofer.xposed.utils.RouteEngine;
import com.vincenthzr.locationspoofer.xposed.utils.SpoofedMotion;
import com.vincenthzr.locationspoofer.xposed.utils.XposedBridge;
import defpackage.i52;
import defpackage.l13;
import defpackage.o51;
import defpackage.s13;
import defpackage.zy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class NmeaSpoofingKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    public static final String calculateNmeaChecksum(LocationHooker locationHooker, String str) {
        locationHooker.getClass();
        str.getClass();
        int iCharAt = 0;
        int iH0 = l13.h0(str, '*', 0, 6);
        if (iH0 == -1) {
            iH0 = str.length();
        }
        for (?? Z = s13.Z(str, "$", false); Z < iH0; Z++) {
            iCharAt ^= str.charAt(Z);
        }
        return String.format(Locale.US, "%02X", Arrays.copyOf(new Object[]{Integer.valueOf(iCharAt)}, 1));
    }

    public static final i52 convertToNmeaLatitude(LocationHooker locationHooker, double d) {
        locationHooker.getClass();
        double dAbs = Math.abs(d);
        int i = (int) dAbs;
        return new i52(String.format(Locale.US, "%02d%08.5f", Arrays.copyOf(new Object[]{Integer.valueOf(i), Double.valueOf((dAbs - ((double) i)) * 60.0d)}, 2)), d >= 0.0d ? "N" : "S");
    }

    public static final i52 convertToNmeaLongitude(LocationHooker locationHooker, double d) {
        locationHooker.getClass();
        double dAbs = Math.abs(d);
        int i = (int) dAbs;
        return new i52(String.format(Locale.US, "%03d%08.5f", Arrays.copyOf(new Object[]{Integer.valueOf(i), Double.valueOf((dAbs - ((double) i)) * 60.0d)}, 2)), d >= 0.0d ? "E" : "W");
    }

    public static final Object createGpsStatusNmeaListenerProxy(final LocationHooker locationHooker, final Object obj, ClassLoader classLoader) {
        locationHooker.getClass();
        obj.getClass();
        classLoader.getClass();
        Object objNewProxyInstance = Proxy.newProxyInstance(classLoader, new Class[]{classLoader.loadClass("android.location.GpsStatus$NmeaListener")}, new InvocationHandler() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.NmeaSpoofingKt$createGpsStatusNmeaListenerProxy$proxy$1
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj2, Method method, Object[] objArr) {
                Object[] objArr2;
                obj2.getClass();
                method.getClass();
                int i = 0;
                if (o51.f(method.getName(), "onNmeaReceived") && objArr != null && objArr.length >= 2) {
                    Object obj3 = objArr[1];
                    String str = obj3 instanceof String ? (String) obj3 : null;
                    if (str != null) {
                        String strSpoofNmeaMessage = NmeaSpoofingKt.spoofNmeaMessage(locationHooker, str);
                        if (strSpoofNmeaMessage == null) {
                            return null;
                        }
                        int length = objArr.length;
                        Object[] objArr3 = new Object[length];
                        int length2 = objArr.length;
                        while (i < length2) {
                            objArr3[i] = i == 1 ? strSpoofNmeaMessage : objArr[i];
                            i++;
                        }
                        return method.invoke(obj, Arrays.copyOf(objArr3, length));
                    }
                }
                if (objArr == null) {
                    objArr2 = new Object[0];
                } else {
                    int length3 = objArr.length;
                    Object[] objArr4 = new Object[length3];
                    while (i < length3) {
                        objArr4[i] = objArr[i];
                        i++;
                    }
                    objArr2 = objArr4;
                }
                return method.invoke(obj, Arrays.copyOf(objArr2, objArr2.length));
            }
        });
        objNewProxyInstance.getClass();
        return objNewProxyInstance;
    }

    public static final Object createOnNmeaMessageListenerProxy(final LocationHooker locationHooker, final Object obj, ClassLoader classLoader) {
        locationHooker.getClass();
        obj.getClass();
        classLoader.getClass();
        Object objNewProxyInstance = Proxy.newProxyInstance(classLoader, new Class[]{classLoader.loadClass("android.location.OnNmeaMessageListener")}, new InvocationHandler() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.NmeaSpoofingKt$createOnNmeaMessageListenerProxy$proxy$1
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj2, Method method, Object[] objArr) {
                Object[] objArr2;
                obj2.getClass();
                method.getClass();
                int i = 0;
                if (o51.f(method.getName(), "onNmeaMessage") && objArr != null && objArr.length >= 1) {
                    Object obj3 = objArr[0];
                    String str = obj3 instanceof String ? (String) obj3 : null;
                    if (str != null) {
                        String strSpoofNmeaMessage = NmeaSpoofingKt.spoofNmeaMessage(locationHooker, str);
                        if (strSpoofNmeaMessage == null) {
                            return null;
                        }
                        int length = objArr.length;
                        Object[] objArr3 = new Object[length];
                        int length2 = objArr.length;
                        while (i < length2) {
                            objArr3[i] = i == 0 ? strSpoofNmeaMessage : objArr[i];
                            i++;
                        }
                        return method.invoke(obj, Arrays.copyOf(objArr3, length));
                    }
                }
                if (objArr == null) {
                    objArr2 = new Object[0];
                } else {
                    int length3 = objArr.length;
                    Object[] objArr4 = new Object[length3];
                    while (i < length3) {
                        objArr4[i] = objArr[i];
                        i++;
                    }
                    objArr2 = objArr4;
                }
                return method.invoke(obj, Arrays.copyOf(objArr2, objArr2.length));
            }
        });
        objNewProxyInstance.getClass();
        return objNewProxyInstance;
    }

    public static final String spoofNmeaMessage(LocationHooker locationHooker, String str) {
        String str2;
        locationHooker.getClass();
        str.getClass();
        try {
            JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
            if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                RouteEngine routeEngine = RouteEngine.INSTANCE;
                SpoofedMotion spoofedMotionCalculateCurrentPosition$default = RouteEngine.calculateCurrentPosition$default(routeEngine, config$xposed_globalRelease, 0L, 2, null);
                i52 appTargetCoordinate = CoordinateConverterKt.getAppTargetCoordinate(locationHooker, spoofedMotionCalculateCurrentPosition$default.getLat(), spoofedMotionCalculateCurrentPosition$default.getLng(), config$xposed_globalRelease, "WGS-84");
                double dDoubleValue = ((Number) appTargetCoordinate.e).doubleValue();
                double dDoubleValue2 = ((Number) appTargetCoordinate.f).doubleValue();
                List listV0 = l13.v0(str, new String[]{"*"});
                ArrayList arrayList = new ArrayList(l13.v0((String) listV0.get(0), new String[]{","}));
                if (!arrayList.isEmpty()) {
                    String str3 = (String) arrayList.get(0);
                    if (s13.S(str3, "RMC") && arrayList.size() >= 7) {
                        i52 i52VarConvertToNmeaLatitude = convertToNmeaLatitude(locationHooker, dDoubleValue);
                        String str4 = (String) i52VarConvertToNmeaLatitude.e;
                        String str5 = (String) i52VarConvertToNmeaLatitude.f;
                        i52 i52VarConvertToNmeaLongitude = convertToNmeaLongitude(locationHooker, dDoubleValue2);
                        String str6 = (String) i52VarConvertToNmeaLongitude.e;
                        String str7 = (String) i52VarConvertToNmeaLongitude.f;
                        arrayList.set(2, "A");
                        arrayList.set(3, str4);
                        arrayList.set(4, str5);
                        arrayList.set(5, str6);
                        arrayList.set(6, str7);
                        if (arrayList.size() > 7) {
                            arrayList.set(7, String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(spoofedMotionCalculateCurrentPosition$default.getSpeed() * 1.943844f)}, 1)));
                        }
                        if (arrayList.size() > 8) {
                            arrayList.set(8, String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(spoofedMotionCalculateCurrentPosition$default.getBearing())}, 1)));
                        }
                    } else if (str3.endsWith("GGA") && arrayList.size() >= 6) {
                        i52 i52VarConvertToNmeaLatitude2 = convertToNmeaLatitude(locationHooker, dDoubleValue);
                        String str8 = (String) i52VarConvertToNmeaLatitude2.e;
                        String str9 = (String) i52VarConvertToNmeaLatitude2.f;
                        i52 i52VarConvertToNmeaLongitude2 = convertToNmeaLongitude(locationHooker, dDoubleValue2);
                        String str10 = (String) i52VarConvertToNmeaLongitude2.e;
                        String str11 = (String) i52VarConvertToNmeaLongitude2.f;
                        arrayList.set(2, str8);
                        arrayList.set(3, str9);
                        arrayList.set(4, str10);
                        arrayList.set(5, str11);
                        if (arrayList.size() > 6) {
                            arrayList.set(6, "1");
                        }
                        if (arrayList.size() > 7) {
                            arrayList.set(7, String.valueOf(config$xposed_globalRelease.optInt("satellite_count", 18)));
                        }
                        if (arrayList.size() > 8) {
                            arrayList.set(8, "0.8");
                        }
                        if (arrayList.size() > 9) {
                            arrayList.set(9, String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(RouteEngine.realisticAltitude$default(routeEngine, config$xposed_globalRelease, 0L, 2, null))}, 1)));
                        }
                    } else if (str3.endsWith("GLL") && arrayList.size() >= 5) {
                        i52 i52VarConvertToNmeaLatitude3 = convertToNmeaLatitude(locationHooker, dDoubleValue);
                        String str12 = (String) i52VarConvertToNmeaLatitude3.e;
                        String str13 = (String) i52VarConvertToNmeaLatitude3.f;
                        i52 i52VarConvertToNmeaLongitude3 = convertToNmeaLongitude(locationHooker, dDoubleValue2);
                        String str14 = (String) i52VarConvertToNmeaLongitude3.e;
                        String str15 = (String) i52VarConvertToNmeaLongitude3.f;
                        arrayList.set(1, str12);
                        arrayList.set(2, str13);
                        arrayList.set(3, str14);
                        arrayList.set(4, str15);
                        if (arrayList.size() > 6) {
                            arrayList.set(6, "A");
                        }
                    }
                    String strS0 = zy.s0(arrayList, ",", null, null, null, 62);
                    String strCalculateNmeaChecksum = calculateNmeaChecksum(locationHooker, strS0);
                    if (listV0.size() > 1) {
                        String str16 = (String) listV0.get(1);
                        str2 = "*" + strCalculateNmeaChecksum + str16.substring(Math.min(2, str16.length()));
                    } else {
                        str2 = "*" + strCalculateNmeaChecksum;
                    }
                    return strS0.concat(str2);
                }
            }
            return str;
        } catch (Exception e) {
            XposedBridge.INSTANCE.log(e);
            return str;
        }
    }
}
