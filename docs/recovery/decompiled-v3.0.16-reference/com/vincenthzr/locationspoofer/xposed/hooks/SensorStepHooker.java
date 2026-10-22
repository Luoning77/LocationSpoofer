package com.vincenthzr.locationspoofer.xposed.hooks;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.diagnostics.HookStatus;
import com.vincenthzr.locationspoofer.xposed.utils.RouteEngine;
import com.vincenthzr.locationspoofer.xposed.utils.SensorPressurePolicy;
import com.vincenthzr.locationspoofer.xposed.utils.StepEventTimeline;
import com.vincenthzr.locationspoofer.xposed.utils.StepSimulationClock;
import com.vincenthzr.locationspoofer.xposed.utils.WeakIdentityCache;
import com.vincenthzr.locationspoofer.xposed.utils.XposedHelpers;
import defpackage.am1;
import defpackage.az;
import defpackage.d0;
import defpackage.hg;
import defpackage.hv0;
import defpackage.o51;
import defpackage.qv1;
import defpackage.rv1;
import defpackage.sv1;
import defpackage.wc0;
import defpackage.yo;
import defpackage.zm3;
import defpackage.zy;
import io.github.libxposed.api.XposedInterface;
import io.github.libxposed.api.XposedModule;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SensorStepHooker {
    private static volatile hv0 cachedTemplate;
    private static volatile String cachedTemplateSource;
    private static Sensor mockAccelerometerSensor;
    private static Sensor mockStepCounterSensor;
    private static Sensor mockStepDetectorSensor;
    public static final SensorStepHooker INSTANCE = new SensorStepHooker();
    private static final CopyOnWriteArrayList<CapturedSensorListener> capturedListeners = new CopyOnWriteArrayList<>();
    private static final ConcurrentHashMap<Class<?>, Boolean> hookedListenerClasses = new ConcurrentHashMap<>();
    private static final double INITIAL_BOOT_STEPS = 2350.0d;
    private static StepSimulationClock stepClock = new StepSimulationClock(INITIAL_BOOT_STEPS, 0, 2, null);
    private static final ConcurrentHashMap<CapturedSensorListener, StepEventTimeline> detectorTimelines = new ConcurrentHashMap<>();
    private static final ThreadLocal<Boolean> syntheticDelivery = new ThreadLocal<>();
    private static final ThreadLocal<Boolean> nativeVibrationDelivery = new ThreadLocal<>();
    private static final WeakIdentityCache<Long> lastNativeAcceleration = new WeakIdentityCache<>();
    private static final ConcurrentHashMap<CapturedSensorListener, Long> counterValues = new ConcurrentHashMap<>();
    private static final Random noiseRng = new Random();
    private static final ConcurrentHashMap<Integer, Integer> handleToTypeMap = new ConcurrentHashMap<>();

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class CapturedSensorListener {
        private final Handler handler;
        private final Object listener;
        private final Sensor sensor;

        public CapturedSensorListener(Object obj, Sensor sensor, Handler handler) {
            obj.getClass();
            this.listener = obj;
            this.sensor = sensor;
            this.handler = handler;
        }

        public static /* synthetic */ CapturedSensorListener copy$default(CapturedSensorListener capturedSensorListener, Object obj, Sensor sensor, Handler handler, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = capturedSensorListener.listener;
            }
            if ((i & 2) != 0) {
                sensor = capturedSensorListener.sensor;
            }
            if ((i & 4) != 0) {
                handler = capturedSensorListener.handler;
            }
            return capturedSensorListener.copy(obj, sensor, handler);
        }

        public final Object component1() {
            return this.listener;
        }

        public final Sensor component2() {
            return this.sensor;
        }

        public final Handler component3() {
            return this.handler;
        }

        public final CapturedSensorListener copy(Object obj, Sensor sensor, Handler handler) {
            obj.getClass();
            return new CapturedSensorListener(obj, sensor, handler);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CapturedSensorListener)) {
                return false;
            }
            CapturedSensorListener capturedSensorListener = (CapturedSensorListener) obj;
            return o51.f(this.listener, capturedSensorListener.listener) && o51.f(this.sensor, capturedSensorListener.sensor) && o51.f(this.handler, capturedSensorListener.handler);
        }

        public final Handler getHandler() {
            return this.handler;
        }

        public final Object getListener() {
            return this.listener;
        }

        public final Sensor getSensor() {
            return this.sensor;
        }

        public int hashCode() {
            int iHashCode = this.listener.hashCode() * 31;
            Sensor sensor = this.sensor;
            int iHashCode2 = (iHashCode + (sensor == null ? 0 : sensor.hashCode())) * 31;
            Handler handler = this.handler;
            return iHashCode2 + (handler != null ? handler.hashCode() : 0);
        }

        public String toString() {
            return "CapturedSensorListener(listener=" + this.listener + ", sensor=" + this.sensor + ", handler=" + this.handler + ")";
        }
    }

    private SensorStepHooker() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applySyntheticVibration(float[] fArr, JSONObject jSONObject, double d) {
        char c;
        double d2;
        float[] fArr2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        double dCalculateCurrentStepsFloat$xposed_globalRelease = calculateCurrentStepsFloat$xposed_globalRelease(jSONObject, jCurrentTimeMillis);
        RouteEngine routeEngine = RouteEngine.INSTANCE;
        double speed = routeEngine.calculateCurrentPosition(jSONObject, jCurrentTimeMillis).getSpeed();
        Double dValueOf = Double.valueOf(speed);
        if (speed <= 0.0d) {
            dValueOf = null;
        }
        double dDoubleValue = dValueOf != null ? dValueOf.doubleValue() : d;
        rv1 rv1VarRealismSession$default = RouteEngine.realismSession$default(routeEngine, jSONObject, 0L, 2, null);
        hv0 hv0VarGaitTemplate = gaitTemplate(jSONObject);
        Random random = noiseRng;
        rv1VarRealismSession$default.getClass();
        random.getClass();
        long jFloor = (long) Math.floor(dCalculateCurrentStepsFloat$xposed_globalRelease);
        double d3 = dCalculateCurrentStepsFloat$xposed_globalRelease - jFloor;
        qv1 qv1Var = rv1VarRealismSession$default.b;
        double d4 = qv1Var.h;
        double d5 = qv1Var.i;
        rv1 rv1Var = sv1.a;
        long j = (rv1VarRealismSession$default.a ^ 1474889086) ^ ((-7046029254386353131L) * jFloor);
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
        double d6 = 2.0d;
        double d7 = ((((((j3 ^ (j3 >>> 33)) >>> 11) / 9.007199254740992E15d) * 2.0d) - 1.0d) * d4) + 1.0d;
        if (hv0VarGaitTemplate != null) {
            double d8 = dCalculateCurrentStepsFloat$xposed_globalRelease / 2.0d;
            double dFloor = (d8 - Math.floor(d8)) * 64.0d;
            int i = ((int) dFloor) % 64;
            int i2 = (i + 1) % 64;
            float fFloor = (float) (dFloor - Math.floor(dFloor));
            float[][] fArr3 = {hv0VarGaitTemplate.a, hv0VarGaitTemplate.b, hv0VarGaitTemplate.c};
            fArr2 = new float[3];
            int i3 = 0;
            while (i3 < 3) {
                float[] fArr4 = fArr3[i3];
                float f = (fArr4[i2] * fFloor) + ((1.0f - fFloor) * fArr4[i]);
                float f2 = hv0VarGaitTemplate.f[i3];
                float[] fArr5 = fArr2;
                fArr5[i3] = f2 + ((float) (((double) (f - f2)) * d7));
                i3++;
                fArr2 = fArr5;
            }
            c = 2;
        } else {
            c = 2;
            boolean z = dDoubleValue >= 2.2d;
            if (z) {
                d2 = dDoubleValue * 1.5d;
                d6 = 6.0d;
            } else {
                d2 = dDoubleValue * 1.0d;
            }
            double d9 = d2 + d6;
            double dB = sv1.b(z ? sv1.d : sv1.b, d3);
            double dB2 = sv1.b(z ? sv1.e : sv1.c, d3);
            double dA = (0.1d * d9 * (jFloor % 2 != 0 ? -1.0d : 1.0d) * sv1.a(d3, 0.02d, 0.05d)) + (Math.sin(dCalculateCurrentStepsFloat$xposed_globalRelease * 3.141592653589793d) * 0.12d * d9);
            double d10 = (d7 * d9 * dB) + 9.806650161743164d;
            if (d10 < 0.0d) {
                d10 = 0.0d;
            }
            fArr2 = new float[]{(float) (dA * d7), (float) (d7 * 0.35d * d9 * dB2), (float) d10};
        }
        if (d5 > 0.0d) {
            for (int i4 = 0; i4 < 3; i4++) {
                fArr2[i4] = fArr2[i4] + ((float) (random.nextGaussian() * d5));
            }
        }
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[c] = fArr2[c];
    }

    public static /* synthetic */ long calculateCurrentSteps$default(SensorStepHooker sensorStepHooker, JSONObject jSONObject, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = System.currentTimeMillis();
        }
        return sensorStepHooker.calculateCurrentSteps(jSONObject, j);
    }

    private final SensorEvent createSensorEvent(Sensor sensor, float[] fArr) {
        Class cls = Integer.TYPE;
        try {
            try {
                Constructor declaredConstructor = SensorEvent.class.getDeclaredConstructor(cls);
                declaredConstructor.setAccessible(true);
                Object objNewInstance = declaredConstructor.newInstance(Integer.valueOf(fArr.length));
                objNewInstance.getClass();
                SensorEvent sensorEvent = (SensorEvent) objNewInstance;
                System.arraycopy(fArr, 0, sensorEvent.values, 0, fArr.length);
                Field declaredField = SensorEvent.class.getDeclaredField("sensor");
                declaredField.setAccessible(true);
                declaredField.set(sensorEvent, sensor);
                Field declaredField2 = SensorEvent.class.getDeclaredField("timestamp");
                declaredField2.setAccessible(true);
                declaredField2.setLong(sensorEvent, SystemClock.elapsedRealtimeNanos());
                Field declaredField3 = SensorEvent.class.getDeclaredField("accuracy");
                declaredField3.setAccessible(true);
                declaredField3.setInt(sensorEvent, 3);
                return sensorEvent;
            } catch (Throwable unused) {
                d0 d0VarY = zm3.y(SensorEvent.class.getDeclaredConstructors());
                if (d0VarY.hasNext()) {
                    Constructor constructor = (Constructor) d0VarY.next();
                    constructor.setAccessible(true);
                    Class<?>[] parameterTypes = constructor.getParameterTypes();
                    int length = parameterTypes.length;
                    Object[] objArr = new Object[length];
                    for (int i = 0; i < length; i++) {
                        if (o51.f(parameterTypes[i], cls)) {
                            objArr[i] = Integer.valueOf(fArr.length);
                        }
                    }
                    Object objNewInstance2 = constructor.newInstance(Arrays.copyOf(objArr, length));
                    objNewInstance2.getClass();
                    SensorEvent sensorEvent2 = (SensorEvent) objNewInstance2;
                    System.arraycopy(fArr, 0, sensorEvent2.values, 0, fArr.length);
                    try {
                        Field declaredField4 = SensorEvent.class.getDeclaredField("sensor");
                        declaredField4.setAccessible(true);
                        declaredField4.set(sensorEvent2, sensor);
                        Field declaredField5 = SensorEvent.class.getDeclaredField("timestamp");
                        declaredField5.setAccessible(true);
                        declaredField5.setLong(sensorEvent2, SystemClock.elapsedRealtimeNanos());
                        Field declaredField6 = SensorEvent.class.getDeclaredField("accuracy");
                        declaredField6.setAccessible(true);
                        declaredField6.setInt(sensorEvent2, 3);
                    } catch (Throwable unused2) {
                    }
                    return sensorEvent2;
                }
                try {
                    Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                    Field declaredField7 = cls2.getDeclaredField("theUnsafe");
                    declaredField7.setAccessible(true);
                    Object objInvoke = cls2.getMethod("allocateInstance", Class.class).invoke(declaredField7.get(null), SensorEvent.class);
                    objInvoke.getClass();
                    SensorEvent sensorEvent3 = (SensorEvent) objInvoke;
                    Field declaredField8 = SensorEvent.class.getDeclaredField("values");
                    declaredField8.setAccessible(true);
                    float[] fArr2 = new float[fArr.length];
                    System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                    declaredField8.set(sensorEvent3, fArr2);
                    Field declaredField9 = SensorEvent.class.getDeclaredField("sensor");
                    declaredField9.setAccessible(true);
                    declaredField9.set(sensorEvent3, sensor);
                    Field declaredField10 = SensorEvent.class.getDeclaredField("timestamp");
                    declaredField10.setAccessible(true);
                    declaredField10.setLong(sensorEvent3, SystemClock.elapsedRealtimeNanos());
                    Field declaredField11 = SensorEvent.class.getDeclaredField("accuracy");
                    declaredField11.setAccessible(true);
                    declaredField11.setInt(sensorEvent3, 3);
                    return sensorEvent3;
                } catch (Throwable unused3) {
                    return null;
                }
            }
        } catch (Throwable unused4) {
            Class<?> cls3 = Class.forName("sun.misc.Unsafe");
            Field declaredField12 = cls3.getDeclaredField("theUnsafe");
            declaredField12.setAccessible(true);
            Object objInvoke2 = cls3.getMethod("allocateInstance", Class.class).invoke(declaredField12.get(null), SensorEvent.class);
            objInvoke2.getClass();
            SensorEvent sensorEvent4 = (SensorEvent) objInvoke2;
            Field declaredField13 = SensorEvent.class.getDeclaredField("values");
            declaredField13.setAccessible(true);
            float[] fArr3 = new float[fArr.length];
            System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
            declaredField13.set(sensorEvent4, fArr3);
            Field declaredField14 = SensorEvent.class.getDeclaredField("sensor");
            declaredField14.setAccessible(true);
            declaredField14.set(sensorEvent4, sensor);
            Field declaredField15 = SensorEvent.class.getDeclaredField("timestamp");
            declaredField15.setAccessible(true);
            declaredField15.setLong(sensorEvent4, SystemClock.elapsedRealtimeNanos());
            Field declaredField16 = SensorEvent.class.getDeclaredField("accuracy");
            declaredField16.setAccessible(true);
            declaredField16.setInt(sensorEvent4, 3);
            return sensorEvent4;
        }
    }

    private final hv0 gaitTemplate(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("gait_template", "");
        if (!o51.f(strOptString, cachedTemplateSource)) {
            cachedTemplate = wc0.B(strOptString);
            cachedTemplateSource = strOptString;
        }
        return cachedTemplate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Sensor getOrCreateMockSensor(int i, ClassLoader classLoader) {
        String str;
        Sensor sensor;
        Sensor sensor2;
        Sensor sensor3;
        if (i == 19 && (sensor3 = mockStepCounterSensor) != null) {
            return sensor3;
        }
        if (i == 18 && (sensor2 = mockStepDetectorSensor) != null) {
            return sensor2;
        }
        if (i == 1 && (sensor = mockAccelerometerSensor) != null) {
            return sensor;
        }
        try {
            Constructor<?> declaredConstructor = Class.forName("android.hardware.Sensor", false, classLoader).getDeclaredConstructor(null);
            declaredConstructor.getClass();
            declaredConstructor.setAccessible(true);
            Object objNewInstance = declaredConstructor.newInstance(null);
            objNewInstance.getClass();
            Sensor sensor4 = (Sensor) objNewInstance;
            setSensorField(sensor4, "mType", Integer.valueOf(i));
            if (i != 18) {
                str = i != 19 ? "Accelerometer Sensor" : "Step Counter Sensor";
            } else {
                str = "Step Detector Sensor";
            }
            setSensorField(sensor4, "mName", str);
            setSensorField(sensor4, "mVendor", "Android");
            setSensorField(sensor4, "mVersion", 1);
            setSensorField(sensor4, "mResolution", Float.valueOf(1.0f));
            setSensorField(sensor4, "mPower", Float.valueOf(0.05f));
            if (i == 1) {
                mockAccelerometerSensor = sensor4;
                return sensor4;
            }
            if (i == 18) {
                mockStepDetectorSensor = sensor4;
                return sensor4;
            }
            if (i != 19) {
                return sensor4;
            }
            mockStepCounterSensor = sensor4;
            return sensor4;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer getSensorHandle(Sensor sensor) {
        try {
            Field declaredField = Sensor.class.getDeclaredField("mHandle");
            declaredField.setAccessible(true);
            return Integer.valueOf(declaredField.getInt(sensor));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hookConcreteListenerClass(Class<?> cls, ClassLoader classLoader) {
        if (hookedListenerClasses.putIfAbsent(cls, Boolean.TRUE) == null) {
            try {
                XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
                ArrayList arrayList = new ArrayList();
                d0 d0VarY = zm3.y(cls.getDeclaredMethods());
                int i = 0;
                while (d0VarY.hasNext()) {
                    final Method method = (Method) d0VarY.next();
                    if (o51.f(method.getName(), "onSensorChanged") && !Modifier.isAbstract(method.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept = xposedHelpers.getModule().hook(method).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SensorStepHooker$hookConcreteListenerClass$$inlined$hookAllMethods$1
                                /* JADX WARN: Code duplicated, block: B:36:0x00c7  */
                                /* JADX WARN: Code duplicated, block: B:47:0x00ea  */
                                /* JADX WARN: Code duplicated, block: B:48:0x00ec  */
                                /* JADX WARN: Code duplicated, block: B:56:0x010d  */
                                /* JADX WARN: Code duplicated, block: B:58:0x011f  */
                                /* JADX WARN: Code duplicated, block: B:60:0x0138  */
                                public Object intercept(XposedInterface.Chain chain) {
                                    WeakIdentityCache weakIdentityCache;
                                    Object thisObject;
                                    chain.getClass();
                                    method.getClass();
                                    Object obj = SensorStepHooker.syntheticDelivery.get();
                                    Boolean bool = Boolean.TRUE;
                                    if (o51.f(obj, bool)) {
                                        List args = chain.getArgs();
                                        args.getClass();
                                        return chain.proceed(args.toArray(new Object[0]));
                                    }
                                    List args2 = chain.getArgs();
                                    args2.getClass();
                                    Object objO0 = zy.o0(args2);
                                    SensorEvent sensorEvent = objO0 instanceof SensorEvent ? (SensorEvent) objO0 : null;
                                    if (sensorEvent != null && sensorEvent.sensor != null) {
                                        XposedModule module = XposedHelpers.INSTANCE.getModule();
                                        LocationHooker locationHooker = module instanceof LocationHooker ? (LocationHooker) module : null;
                                        JSONObject config$xposed_globalRelease = locationHooker != null ? locationHooker.readConfig$xposed_globalRelease() : null;
                                        if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                            boolean zOptBoolean = config$xposed_globalRelease.optBoolean("enable_step_simulation", true);
                                            double dOptDouble = config$xposed_globalRelease.optDouble("speed_m_s", 0.0d);
                                            if (sensorEvent.sensor.getType() == 6) {
                                                SensorPressurePolicy sensorPressurePolicy = SensorPressurePolicy.INSTANCE;
                                                JSONObject jSONObject = config$xposed_globalRelease;
                                                float[] fArr = sensorEvent.values;
                                                fArr.getClass();
                                                sensorPressurePolicy.apply(fArr, sensorEvent.timestamp, jSONObject, System.currentTimeMillis(), SystemClock.elapsedRealtimeNanos());
                                            } else {
                                                JSONObject jSONObject2 = config$xposed_globalRelease;
                                                if (zOptBoolean && sensorEvent.sensor.getType() == 19) {
                                                    float[] fArr2 = sensorEvent.values;
                                                    fArr2.getClass();
                                                    if (!(fArr2.length == 0)) {
                                                        sensorEvent.values[0] = SensorStepHooker.calculateCurrentSteps$default(SensorStepHooker.INSTANCE, jSONObject2, 0L, 2, null);
                                                        sensorEvent.timestamp = SystemClock.elapsedRealtimeNanos();
                                                    } else if (!zOptBoolean) {
                                                        if (zOptBoolean) {
                                                            weakIdentityCache = SensorStepHooker.lastNativeAcceleration;
                                                            thisObject = chain.getThisObject();
                                                            if (thisObject == null) {
                                                                List args3 = chain.getArgs();
                                                                args3.getClass();
                                                                return chain.proceed(args3.toArray(new Object[0]));
                                                            }
                                                            weakIdentityCache.put(thisObject, Long.valueOf(SystemClock.elapsedRealtime()));
                                                            if (!o51.f(SensorStepHooker.nativeVibrationDelivery.get(), bool)) {
                                                                SensorStepHooker sensorStepHooker = SensorStepHooker.INSTANCE;
                                                                float[] fArr3 = sensorEvent.values;
                                                                fArr3.getClass();
                                                                sensorStepHooker.applySyntheticVibration(fArr3, jSONObject2, dOptDouble);
                                                            }
                                                        }
                                                    } else if (zOptBoolean) {
                                                        weakIdentityCache = SensorStepHooker.lastNativeAcceleration;
                                                        thisObject = chain.getThisObject();
                                                        if (thisObject == null) {
                                                            List args4 = chain.getArgs();
                                                            args4.getClass();
                                                            return chain.proceed(args4.toArray(new Object[0]));
                                                        }
                                                        weakIdentityCache.put(thisObject, Long.valueOf(SystemClock.elapsedRealtime()));
                                                        if (!o51.f(SensorStepHooker.nativeVibrationDelivery.get(), bool)) {
                                                            SensorStepHooker sensorStepHooker2 = SensorStepHooker.INSTANCE;
                                                            float[] fArr4 = sensorEvent.values;
                                                            fArr4.getClass();
                                                            sensorStepHooker2.applySyntheticVibration(fArr4, jSONObject2, dOptDouble);
                                                        }
                                                    }
                                                } else if (!zOptBoolean && sensorEvent.sensor.getType() == 18) {
                                                    float[] fArr5 = sensorEvent.values;
                                                    fArr5.getClass();
                                                    if (fArr5.length == 0) {
                                                        if (zOptBoolean) {
                                                            weakIdentityCache = SensorStepHooker.lastNativeAcceleration;
                                                            thisObject = chain.getThisObject();
                                                            if (thisObject == null) {
                                                                List args5 = chain.getArgs();
                                                                args5.getClass();
                                                                return chain.proceed(args5.toArray(new Object[0]));
                                                            }
                                                            weakIdentityCache.put(thisObject, Long.valueOf(SystemClock.elapsedRealtime()));
                                                            if (!o51.f(SensorStepHooker.nativeVibrationDelivery.get(), bool)) {
                                                                SensorStepHooker sensorStepHooker3 = SensorStepHooker.INSTANCE;
                                                                float[] fArr6 = sensorEvent.values;
                                                                fArr6.getClass();
                                                                sensorStepHooker3.applySyntheticVibration(fArr6, jSONObject2, dOptDouble);
                                                            }
                                                        }
                                                    } else if (dOptDouble > 0.05d) {
                                                        return null;
                                                    }
                                                } else if (zOptBoolean && sensorEvent.sensor.getType() == 1 && sensorEvent.values.length >= 3 && dOptDouble > 0.1d) {
                                                    weakIdentityCache = SensorStepHooker.lastNativeAcceleration;
                                                    thisObject = chain.getThisObject();
                                                    if (thisObject == null) {
                                                        List args6 = chain.getArgs();
                                                        args6.getClass();
                                                        return chain.proceed(args6.toArray(new Object[0]));
                                                    }
                                                    weakIdentityCache.put(thisObject, Long.valueOf(SystemClock.elapsedRealtime()));
                                                    if (!o51.f(SensorStepHooker.nativeVibrationDelivery.get(), bool)) {
                                                        SensorStepHooker sensorStepHooker4 = SensorStepHooker.INSTANCE;
                                                        float[] fArr7 = sensorEvent.values;
                                                        fArr7.getClass();
                                                        sensorStepHooker4.applySyntheticVibration(fArr7, jSONObject2, dOptDouble);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    List args7 = chain.getArgs();
                                    args7.getClass();
                                    return chain.proceed(args7.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept.getClass();
                            arrayList.add(hookHandleIntercept);
                            i++;
                        } catch (Throwable th) {
                            HookStatus.INSTANCE.error(cls.getName() + "#onSensorChanged", th);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(cls.getName(), "onSensorChanged", i);
            } catch (Throwable unused) {
            }
        }
    }

    private final void hookSensorEventQueue(ClassLoader classLoader) {
        try {
            XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
            Class<?> clsFindClassIfExists = xposedHelpers.findClassIfExists("android.hardware.SystemSensorManager$SensorEventQueue", classLoader);
            if (clsFindClassIfExists == null && (clsFindClassIfExists = xposedHelpers.findClassIfExists("android.hardware.SystemSensorManager$BaseEventQueue", classLoader)) == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            d0 d0VarY = zm3.y(clsFindClassIfExists.getDeclaredMethods());
            int i = 0;
            while (d0VarY.hasNext()) {
                final Method method = (Method) d0VarY.next();
                if (o51.f(method.getName(), "dispatchSensorEvent") && !Modifier.isAbstract(method.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept = xposedHelpers.getModule().hook(method).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SensorStepHooker$hookSensorEventQueue$$inlined$hookAllMethods$1
                            /* JADX WARN: Code duplicated, block: B:47:0x00ce  */
                            /* JADX WARN: Code duplicated, block: B:55:0x00e5 A[DONT_INVERT] */
                            /* JADX WARN: Code duplicated, block: B:56:0x00e7 A[ADDED_TO_REGION] */
                            public Object intercept(XposedInterface.Chain chain) {
                                chain.getClass();
                                method.getClass();
                                XposedModule module = XposedHelpers.INSTANCE.getModule();
                                LocationHooker locationHooker = module instanceof LocationHooker ? (LocationHooker) module : null;
                                JSONObject config$xposed_globalRelease = locationHooker != null ? locationHooker.readConfig$xposed_globalRelease() : null;
                                if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                    List args = chain.getArgs();
                                    args.getClass();
                                    Object objO0 = zy.o0(args);
                                    Integer num = objO0 instanceof Integer ? (Integer) objO0 : null;
                                    List args2 = chain.getArgs();
                                    args2.getClass();
                                    Object objP0 = zy.p0(args2, 1);
                                    float[] fArr = objP0 instanceof float[] ? (float[]) objP0 : null;
                                    if (num != null && fArr != null) {
                                        Integer num2 = (Integer) SensorStepHooker.handleToTypeMap.get(num);
                                        double dOptDouble = config$xposed_globalRelease.optDouble("speed_m_s", 0.0d);
                                        boolean zOptBoolean = config$xposed_globalRelease.optBoolean("enable_step_simulation", true);
                                        if (num2 != null && num2.intValue() == 6) {
                                            JSONObject jSONObject = config$xposed_globalRelease;
                                            float[] fArr2 = fArr;
                                            SensorPressurePolicy sensorPressurePolicy = SensorPressurePolicy.INSTANCE;
                                            List args3 = chain.getArgs();
                                            args3.getClass();
                                            Object objP1 = zy.p0(args3, 3);
                                            Long l = objP1 instanceof Long ? (Long) objP1 : null;
                                            sensorPressurePolicy.apply(fArr2, l != null ? l.longValue() : 0L, jSONObject, System.currentTimeMillis(), SystemClock.elapsedRealtimeNanos());
                                        } else {
                                            float[] fArr3 = fArr;
                                            JSONObject jSONObject2 = config$xposed_globalRelease;
                                            if (zOptBoolean && num2 != null && num2.intValue() == 19) {
                                                if (!(fArr3.length == 0)) {
                                                    fArr3[0] = SensorStepHooker.calculateCurrentSteps$default(SensorStepHooker.INSTANCE, jSONObject2, 0L, 2, null);
                                                } else if (zOptBoolean) {
                                                    if (zOptBoolean) {
                                                        SensorStepHooker.INSTANCE.applySyntheticVibration(fArr3, jSONObject2, dOptDouble);
                                                        SensorStepHooker.nativeVibrationDelivery.set(Boolean.TRUE);
                                                        List args4 = chain.getArgs();
                                                        args4.getClass();
                                                        return chain.proceed(args4.toArray(new Object[0]));
                                                    }
                                                } else if (zOptBoolean) {
                                                    SensorStepHooker.INSTANCE.applySyntheticVibration(fArr3, jSONObject2, dOptDouble);
                                                    SensorStepHooker.nativeVibrationDelivery.set(Boolean.TRUE);
                                                    List args5 = chain.getArgs();
                                                    args5.getClass();
                                                    return chain.proceed(args5.toArray(new Object[0]));
                                                }
                                            } else if (zOptBoolean || num2 == null || num2.intValue() != 18) {
                                                if (zOptBoolean && num2 != null && num2.intValue() == 1 && fArr3.length >= 3 && dOptDouble > 0.1d) {
                                                    SensorStepHooker.INSTANCE.applySyntheticVibration(fArr3, jSONObject2, dOptDouble);
                                                    SensorStepHooker.nativeVibrationDelivery.set(Boolean.TRUE);
                                                    try {
                                                        List args6 = chain.getArgs();
                                                        args6.getClass();
                                                        return chain.proceed(args6.toArray(new Object[0]));
                                                    } finally {
                                                        SensorStepHooker.nativeVibrationDelivery.remove();
                                                    }
                                                }
                                            } else if (dOptDouble > 0.05d) {
                                                return null;
                                            }
                                        }
                                    }
                                }
                                List args7 = chain.getArgs();
                                args7.getClass();
                                return chain.proceed(args7.toArray(new Object[0]));
                            }
                        });
                        hookHandleIntercept.getClass();
                        arrayList.add(hookHandleIntercept);
                        i++;
                    } catch (Throwable th) {
                        HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#dispatchSensorEvent", th);
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "dispatchSensorEvent", i);
        } catch (Throwable unused) {
        }
    }

    private final void postSensorEvent(Handler handler, Object obj, SensorEvent sensorEvent, JSONObject jSONObject) {
        handler.post(new hg(jSONObject, sensorEvent, obj, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postSensorEvent$lambda$19(JSONObject jSONObject, SensorEvent sensorEvent, Object obj) {
        JSONObject config$xposed_globalRelease;
        try {
            CopyOnWriteArrayList<CapturedSensorListener> copyOnWriteArrayList = capturedListeners;
            if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                for (CapturedSensorListener capturedSensorListener : copyOnWriteArrayList) {
                    if (capturedSensorListener.getListener() == obj && capturedSensorListener.getSensor() == sensorEvent.sensor) {
                        XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
                        XposedModule module = xposedHelpers.getModule();
                        LocationHooker locationHooker = module instanceof LocationHooker ? (LocationHooker) module : null;
                        if (locationHooker == null || (config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease()) == null || !config$xposed_globalRelease.optBoolean("active", false) || !config$xposed_globalRelease.optBoolean("enable_step_simulation", true) || config$xposed_globalRelease.optDouble("speed_m_s", 0.0d) <= 0.05d || config$xposed_globalRelease.optLong("start_timestamp") != jSONObject.optLong("start_timestamp") || SystemClock.elapsedRealtimeNanos() - sensorEvent.timestamp > 500000000) {
                            break;
                            break;
                            break;
                            break;
                            break;
                            break;
                            break;
                        }
                        ThreadLocal<Boolean> threadLocal = syntheticDelivery;
                        threadLocal.set(Boolean.TRUE);
                        if (obj instanceof SensorEventListener) {
                            ((SensorEventListener) obj).onSensorChanged(sensorEvent);
                        } else {
                            xposedHelpers.callMethod(obj, "onSensorChanged", sensorEvent);
                        }
                        threadLocal.remove();
                        return;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        syntheticDelivery.remove();
    }

    private final void setSensorField(Sensor sensor, String str, Object obj) {
        try {
            Field declaredField = Sensor.class.getDeclaredField(str);
            declaredField.getClass();
            declaredField.setAccessible(true);
            declaredField.set(sensor, obj);
        } catch (Throwable unused) {
        }
    }

    public final int calculateAutoCadence(double d) {
        return StepSimulationClock.Companion.autoCadence(d);
    }

    public final long calculateCurrentSteps(JSONObject jSONObject, long j) {
        jSONObject.getClass();
        return (long) calculateCurrentStepsFloat$xposed_globalRelease(jSONObject, j);
    }

    public final double calculateCurrentStepsFloat$xposed_globalRelease(JSONObject jSONObject, long j) {
        jSONObject.getClass();
        return stepClock.steps(jSONObject, j);
    }

    public final void clearReloadState$xposed_globalRelease() {
        capturedListeners.clear();
        hookedListenerClasses.clear();
        detectorTimelines.clear();
        counterValues.clear();
    }

    public final void dispatchStepEvents(JSONObject jSONObject, ClassLoader classLoader) {
        double d;
        StepEventTimeline stepEventTimelinePutIfAbsent;
        jSONObject.getClass();
        classLoader.getClass();
        int i = 0;
        if (!jSONObject.optBoolean("active", false)) {
            detectorTimelines.clear();
            counterValues.clear();
            return;
        }
        if (!jSONObject.optBoolean("enable_step_simulation", true)) {
            detectorTimelines.clear();
            counterValues.clear();
            return;
        }
        double dOptDouble = jSONObject.optDouble("speed_m_s", 0.0d);
        double d2 = 0.05d;
        if (dOptDouble <= 0.05d) {
            detectorTimelines.clear();
            counterValues.clear();
            return;
        }
        double dCalculateCurrentStepsFloat$xposed_globalRelease = calculateCurrentStepsFloat$xposed_globalRelease(jSONObject, System.currentTimeMillis());
        long j = (long) dCalculateCurrentStepsFloat$xposed_globalRelease;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        List listJ0 = zy.J0(capturedListeners);
        if (listJ0.isEmpty()) {
            return;
        }
        Iterator it = listJ0.iterator();
        while (it.hasNext()) {
            CapturedSensorListener capturedSensorListener = (CapturedSensorListener) it.next();
            i = i;
            Object listener = capturedSensorListener.getListener();
            d2 = d2;
            Sensor sensor = capturedSensorListener.getSensor();
            if (sensor != null) {
                Handler handler = capturedSensorListener.getHandler();
                if (handler == null) {
                    handler = new Handler(Looper.getMainLooper());
                }
                int type = sensor.getType();
                Iterator it2 = it;
                boolean z = true;
                if (type != 1) {
                    if (type != 18) {
                        if (type != 19) {
                            d = dCalculateCurrentStepsFloat$xposed_globalRelease;
                            z = true;
                        } else {
                            Long lPut = counterValues.put(capturedSensorListener, Long.valueOf(j));
                            if (lPut == null || lPut.longValue() != j) {
                                float[] fArr = new float[1];
                                fArr[i] = j;
                                SensorEvent sensorEventCreateSensorEvent = createSensorEvent(sensor, fArr);
                                if (sensorEventCreateSensorEvent != null) {
                                    postSensorEvent(handler, listener, sensorEventCreateSensorEvent, jSONObject);
                                }
                            }
                        }
                    } else if (dOptDouble > d2) {
                        ConcurrentHashMap<CapturedSensorListener, StepEventTimeline> concurrentHashMap = detectorTimelines;
                        StepEventTimeline stepEventTimeline = concurrentHashMap.get(capturedSensorListener);
                        if (stepEventTimeline == null && (stepEventTimelinePutIfAbsent = concurrentHashMap.putIfAbsent(capturedSensorListener, (stepEventTimeline = new StepEventTimeline()))) != null) {
                            stepEventTimeline = stepEventTimelinePutIfAbsent;
                        }
                        long[] jArrSample = stepEventTimeline.sample(dCalculateCurrentStepsFloat$xposed_globalRelease, jElapsedRealtimeNanos);
                        int length = jArrSample.length;
                        int i2 = i;
                        while (i2 < length) {
                            double d3 = dCalculateCurrentStepsFloat$xposed_globalRelease;
                            long j2 = jArrSample[i2];
                            long[] jArr = jArrSample;
                            int i3 = length;
                            float[] fArr2 = new float[1];
                            fArr2[i] = 1.0f;
                            SensorEvent sensorEventCreateSensorEvent2 = createSensorEvent(sensor, fArr2);
                            if (sensorEventCreateSensorEvent2 != null) {
                                sensorEventCreateSensorEvent2.timestamp = j2;
                                postSensorEvent(handler, listener, sensorEventCreateSensorEvent2, jSONObject);
                            }
                            i2++;
                            length = i3;
                            dCalculateCurrentStepsFloat$xposed_globalRelease = d3;
                            jArrSample = jArr;
                        }
                    }
                    it = it2;
                } else {
                    d = dCalculateCurrentStepsFloat$xposed_globalRelease;
                    Long l = lastNativeAcceleration.get(listener);
                    if ((l == null || SystemClock.elapsedRealtime() - l.longValue() >= 500) && dOptDouble > 0.1d) {
                        float[] fArr3 = {0.0f, 0.0f, 9.8f};
                        applySyntheticVibration(fArr3, jSONObject, dOptDouble);
                        SensorEvent sensorEventCreateSensorEvent3 = createSensorEvent(sensor, fArr3);
                        if (sensorEventCreateSensorEvent3 != null) {
                            postSensorEvent(handler, listener, sensorEventCreateSensorEvent3, jSONObject);
                        }
                    }
                }
                it = it2;
                dCalculateCurrentStepsFloat$xposed_globalRelease = d;
            }
        }
    }

    public final CopyOnWriteArrayList<CapturedSensorListener> getCapturedListeners() {
        return capturedListeners;
    }

    public final void hookSensorStepSimulation(final ClassLoader classLoader) {
        classLoader.getClass();
        for (String str : am1.G("android.hardware.SensorManager", "android.hardware.SystemSensorManager")) {
            XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
            Class<?> clsFindClassIfExists = xposedHelpers.findClassIfExists(str, classLoader);
            if (clsFindClassIfExists != null) {
                ArrayList arrayList = new ArrayList();
                d0 d0VarY = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                int i = 0;
                while (d0VarY.hasNext()) {
                    final Method method = (Method) d0VarY.next();
                    if (o51.f(method.getName(), "getDefaultSensor") && !Modifier.isAbstract(method.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept = xposedHelpers.getModule().hook(method).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SensorStepHooker$hookSensorStepSimulation$$inlined$hookAllMethods$1
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method.getClass();
                                    List args = chain.getArgs();
                                    args.getClass();
                                    Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                    List args2 = chain.getArgs();
                                    args2.getClass();
                                    Object objO0 = zy.o0(args2);
                                    Integer num = objO0 instanceof Integer ? (Integer) objO0 : null;
                                    if (num != null) {
                                        int iIntValue = num.intValue();
                                        if (objProceed == null && (iIntValue == 19 || iIntValue == 18)) {
                                            return SensorStepHooker.INSTANCE.getOrCreateMockSensor(iIntValue, classLoader);
                                        }
                                    }
                                    return objProceed;
                                }
                            });
                            hookHandleIntercept.getClass();
                            arrayList.add(hookHandleIntercept);
                            i++;
                        } catch (Throwable th) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#getDefaultSensor", th);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "getDefaultSensor", i);
                try {
                    XposedHelpers xposedHelpers2 = XposedHelpers.INSTANCE;
                    ArrayList arrayList2 = new ArrayList();
                    d0 d0VarY2 = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                    int i2 = 0;
                    while (d0VarY2.hasNext()) {
                        final Method method2 = (Method) d0VarY2.next();
                        if (o51.f(method2.getName(), "getSensorList") && !Modifier.isAbstract(method2.getModifiers())) {
                            try {
                                XposedInterface.HookHandle hookHandleIntercept2 = xposedHelpers2.getModule().hook(method2).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SensorStepHooker$hookSensorStepSimulation$$inlined$hookAllMethods$2
                                    public Object intercept(XposedInterface.Chain chain) {
                                        int iIntValue;
                                        Sensor orCreateMockSensor;
                                        chain.getClass();
                                        method2.getClass();
                                        List args = chain.getArgs();
                                        args.getClass();
                                        Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                        List args2 = chain.getArgs();
                                        args2.getClass();
                                        Object objO0 = zy.o0(args2);
                                        Integer num = objO0 instanceof Integer ? (Integer) objO0 : null;
                                        return (num == null || !(((iIntValue = num.intValue()) == 18 || iIntValue == 19) && (objProceed instanceof List) && ((List) objProceed).isEmpty() && (orCreateMockSensor = SensorStepHooker.INSTANCE.getOrCreateMockSensor(iIntValue, classLoader)) != null)) ? objProceed : am1.F(orCreateMockSensor);
                                    }
                                });
                                hookHandleIntercept2.getClass();
                                arrayList2.add(hookHandleIntercept2);
                                i2++;
                            } catch (Throwable th2) {
                                HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#getSensorList", th2);
                            }
                        }
                    }
                    HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "getSensorList", i2);
                } catch (Throwable unused) {
                }
                for (String str2 : am1.G("registerListener", "registerListenerImpl")) {
                    XposedHelpers xposedHelpers3 = XposedHelpers.INSTANCE;
                    ArrayList arrayList3 = new ArrayList();
                    d0 d0VarY3 = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                    int i3 = 0;
                    while (d0VarY3.hasNext()) {
                        final Method method3 = (Method) d0VarY3.next();
                        if (o51.f(method3.getName(), str2) && !Modifier.isAbstract(method3.getModifiers())) {
                            try {
                                XposedInterface.HookHandle hookHandleIntercept3 = xposedHelpers3.getModule().hook(method3).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SensorStepHooker$hookSensorStepSimulation$$inlined$hookAllMethods$3
                                    public Object intercept(XposedInterface.Chain chain) {
                                        Sensor sensor;
                                        chain.getClass();
                                        method3.getClass();
                                        List args = chain.getArgs();
                                        args.getClass();
                                        Object obj = null;
                                        Sensor orCreateMockSensor = null;
                                        Handler handler = null;
                                        for (Object obj2 : args) {
                                            if (obj2 != null) {
                                                if ((obj2 instanceof SensorEventListener) || LocationHooker.Companion.hasTypeByName(obj2.getClass(), "android.hardware.SensorEventListener")) {
                                                    obj = obj2;
                                                } else if (obj2 instanceof Sensor) {
                                                    orCreateMockSensor = (Sensor) obj2;
                                                } else if (obj2 instanceof Handler) {
                                                    handler = (Handler) obj2;
                                                }
                                            }
                                        }
                                        if (obj != null) {
                                            if (orCreateMockSensor == null) {
                                                orCreateMockSensor = SensorStepHooker.INSTANCE.getOrCreateMockSensor(19, classLoader);
                                            }
                                            if (orCreateMockSensor != null && (orCreateMockSensor.getType() == 19 || orCreateMockSensor.getType() == 18 || orCreateMockSensor.getType() == 1 || orCreateMockSensor.getType() == 6)) {
                                                SensorStepHooker.CapturedSensorListener capturedSensorListener = new SensorStepHooker.CapturedSensorListener(obj, orCreateMockSensor, handler);
                                                CopyOnWriteArrayList<SensorStepHooker.CapturedSensorListener> capturedListeners2 = SensorStepHooker.INSTANCE.getCapturedListeners();
                                                if (capturedListeners2 != null && capturedListeners2.isEmpty()) {
                                                    SensorStepHooker.INSTANCE.getCapturedListeners().add(capturedSensorListener);
                                                    break;
                                                }
                                                Iterator<T> it = capturedListeners2.iterator();
                                                while (true) {
                                                    if (!it.hasNext()) {
                                                        SensorStepHooker.INSTANCE.getCapturedListeners().add(capturedSensorListener);
                                                        break;
                                                    }
                                                    SensorStepHooker.CapturedSensorListener capturedSensorListener2 = (SensorStepHooker.CapturedSensorListener) it.next();
                                                    if (capturedSensorListener2.getListener() == obj && (sensor = capturedSensorListener2.getSensor()) != null && sensor.getType() == orCreateMockSensor.getType()) {
                                                        break;
                                                    }
                                                }
                                                SensorStepHooker sensorStepHooker = SensorStepHooker.INSTANCE;
                                                Integer sensorHandle = sensorStepHooker.getSensorHandle(orCreateMockSensor);
                                                if (sensorHandle != null) {
                                                    SensorStepHooker.handleToTypeMap.put(sensorHandle, Integer.valueOf(orCreateMockSensor.getType()));
                                                }
                                                sensorStepHooker.hookConcreteListenerClass(obj.getClass(), classLoader);
                                            }
                                        }
                                        List args2 = chain.getArgs();
                                        args2.getClass();
                                        return chain.proceed(args2.toArray(new Object[0]));
                                    }
                                });
                                hookHandleIntercept3.getClass();
                                arrayList3.add(hookHandleIntercept3);
                                i3++;
                            } catch (Throwable th3) {
                                HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#" + str2, th3);
                            }
                        }
                    }
                    HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), str2, i3);
                }
                for (String str3 : am1.G("unregisterListener", "unregisterListenerImpl")) {
                    try {
                        XposedHelpers xposedHelpers4 = XposedHelpers.INSTANCE;
                        ArrayList arrayList4 = new ArrayList();
                        d0 d0VarY4 = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                        int i4 = 0;
                        while (d0VarY4.hasNext()) {
                            final Method method4 = (Method) d0VarY4.next();
                            if (o51.f(method4.getName(), str3) && !Modifier.isAbstract(method4.getModifiers())) {
                                try {
                                    XposedInterface.HookHandle hookHandleIntercept4 = xposedHelpers4.getModule().hook(method4).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SensorStepHooker$hookSensorStepSimulation$$inlined$hookAllMethods$4
                                        public Object intercept(XposedInterface.Chain chain) {
                                            Object next;
                                            chain.getClass();
                                            method4.getClass();
                                            List args = chain.getArgs();
                                            args.getClass();
                                            Iterator it = args.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    next = null;
                                                    break;
                                                }
                                                next = it.next();
                                                if (next != null && ((next instanceof SensorEventListener) || LocationHooker.Companion.hasTypeByName(next.getClass(), "android.hardware.SensorEventListener"))) {
                                                    break;
                                                }
                                            }
                                            if (next != null) {
                                                ArrayList arrayList5 = new ArrayList();
                                                for (Object obj : args) {
                                                    if (obj instanceof Sensor) {
                                                        arrayList5.add(obj);
                                                    }
                                                }
                                                Sensor sensor = (Sensor) zy.o0(arrayList5);
                                                CopyOnWriteArrayList<SensorStepHooker.CapturedSensorListener> capturedListeners2 = SensorStepHooker.INSTANCE.getCapturedListeners();
                                                ArrayList arrayList6 = new ArrayList();
                                                for (Object obj2 : capturedListeners2) {
                                                    SensorStepHooker.CapturedSensorListener capturedSensorListener = (SensorStepHooker.CapturedSensorListener) obj2;
                                                    if (capturedSensorListener.getListener() == next && (sensor == null || capturedSensorListener.getSensor() == sensor)) {
                                                        arrayList6.add(obj2);
                                                    }
                                                }
                                                int size = arrayList6.size();
                                                int i5 = 0;
                                                while (i5 < size) {
                                                    Object obj3 = arrayList6.get(i5);
                                                    i5++;
                                                    SensorStepHooker.CapturedSensorListener capturedSensorListener2 = (SensorStepHooker.CapturedSensorListener) obj3;
                                                    SensorStepHooker.INSTANCE.getCapturedListeners().remove(capturedSensorListener2);
                                                    SensorStepHooker.detectorTimelines.remove(capturedSensorListener2);
                                                    SensorStepHooker.counterValues.remove(capturedSensorListener2);
                                                }
                                            }
                                            List args2 = chain.getArgs();
                                            args2.getClass();
                                            return chain.proceed(args2.toArray(new Object[0]));
                                        }
                                    });
                                    hookHandleIntercept4.getClass();
                                    arrayList4.add(hookHandleIntercept4);
                                    i4++;
                                } catch (Throwable th4) {
                                    HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#" + str3, th4);
                                }
                            }
                        }
                        HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), str3, i4);
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
        hookSensorEventQueue(classLoader);
    }

    public final void observeConfig(JSONObject jSONObject) {
        jSONObject.getClass();
        calculateCurrentStepsFloat$xposed_globalRelease(jSONObject, System.currentTimeMillis());
        if (jSONObject.optBoolean("active", false) && jSONObject.optBoolean("enable_step_simulation", true) && jSONObject.optDouble("speed_m_s", 0.0d) > 0.05d) {
            return;
        }
        detectorTimelines.clear();
    }

    public final void restoreReloadState$xposed_globalRelease(Object obj) {
        Object[] objArr = obj instanceof Object[] ? (Object[]) obj : null;
        if (objArr == null) {
            return;
        }
        Object objX0 = yo.x0(objArr, 0);
        Object[] objArr2 = objX0 instanceof Object[] ? (Object[]) objX0 : null;
        if (objArr2 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : objArr2) {
                if (obj2 instanceof Object[]) {
                    arrayList.add(obj2);
                }
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj3 = arrayList.get(i);
                i++;
                Object[] objArr3 = (Object[]) obj3;
                CopyOnWriteArrayList<CapturedSensorListener> copyOnWriteArrayList = capturedListeners;
                Object obj4 = objArr3[0];
                obj4.getClass();
                Object obj5 = objArr3[1];
                Sensor sensor = obj5 instanceof Sensor ? (Sensor) obj5 : null;
                Object obj6 = objArr3[2];
                copyOnWriteArrayList.add(new CapturedSensorListener(obj4, sensor, obj6 instanceof Handler ? (Handler) obj6 : null));
                SensorStepHooker sensorStepHooker = INSTANCE;
                Object obj7 = objArr3[0];
                obj7.getClass();
                Class<?> cls = obj7.getClass();
                Object obj8 = objArr3[0];
                obj8.getClass();
                ClassLoader classLoader = obj8.getClass().getClassLoader();
                if (classLoader == null) {
                    classLoader = ClassLoader.getSystemClassLoader();
                }
                classLoader.getClass();
                sensorStepHooker.hookConcreteListenerClass(cls, classLoader);
            }
        }
        Object obj9 = objArr[2];
        obj9.getClass();
        StepSimulationClock stepSimulationClock = new StepSimulationClock(((Double) obj9).doubleValue(), System.currentTimeMillis());
        Object objX1 = yo.x0(objArr, 8);
        Object[] objArr4 = objX1 instanceof Object[] ? (Object[]) objX1 : null;
        if (objArr4 != null) {
            stepSimulationClock.restore(objArr4);
        }
        stepClock = stepSimulationClock;
        Object obj10 = objArr[4];
        mockStepCounterSensor = obj10 instanceof Sensor ? (Sensor) obj10 : null;
        Object obj11 = objArr[5];
        mockStepDetectorSensor = obj11 instanceof Sensor ? (Sensor) obj11 : null;
        Object obj12 = objArr[6];
        mockAccelerometerSensor = obj12 instanceof Sensor ? (Sensor) obj12 : null;
        Object obj13 = objArr[7];
        Object[] objArr5 = obj13 instanceof Object[] ? (Object[]) obj13 : null;
        if (objArr5 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj14 : objArr5) {
                if (obj14 instanceof Object[]) {
                    arrayList2.add(obj14);
                }
            }
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj15 = arrayList2.get(i2);
                i2++;
                Object[] objArr6 = (Object[]) obj15;
                ConcurrentHashMap<Integer, Integer> concurrentHashMap = handleToTypeMap;
                Object obj16 = objArr6[0];
                obj16.getClass();
                Object obj17 = objArr6[1];
                obj17.getClass();
                concurrentHashMap.put((Integer) obj16, (Integer) obj17);
            }
        }
    }

    public final Object[] saveReloadState$xposed_globalRelease() {
        long j;
        Object[] objArrSave = stepClock.save();
        CopyOnWriteArrayList<CapturedSensorListener> copyOnWriteArrayList = capturedListeners;
        ArrayList arrayList = new ArrayList(az.Y(copyOnWriteArrayList, 10));
        for (CapturedSensorListener capturedSensorListener : copyOnWriteArrayList) {
            arrayList.add(new Object[]{capturedSensorListener.getListener(), capturedSensorListener.getSensor(), capturedSensorListener.getHandler()});
        }
        Object[] array = arrayList.toArray(new Object[0][]);
        Object obj = objArrSave[1];
        Object obj2 = objArrSave[2];
        Object obj3 = objArrSave[0];
        Object[] objArr = obj3 instanceof Object[] ? (Object[]) obj3 : null;
        if (objArr == null || (j = objArr[0]) == null) {
            j = 0L;
        }
        Sensor sensor = mockStepCounterSensor;
        Object obj4 = j;
        Sensor sensor2 = mockStepDetectorSensor;
        Sensor sensor3 = mockAccelerometerSensor;
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = handleToTypeMap;
        ArrayList arrayList2 = new ArrayList(concurrentHashMap.size());
        for (Map.Entry<Integer, Integer> entry : concurrentHashMap.entrySet()) {
            arrayList2.add(new Integer[]{entry.getKey(), entry.getValue()});
        }
        return new Object[]{array, obj, obj2, obj4, sensor, sensor2, sensor3, arrayList2.toArray(new Integer[0][]), objArrSave};
    }
}
