package com.vincenthzr.locationspoofer.xposed.utils;

import defpackage.am1;
import defpackage.az2;
import defpackage.fo;
import defpackage.i52;
import defpackage.j41;
import defpackage.mh0;
import defpackage.o51;
import defpackage.p91;
import defpackage.rv1;
import defpackage.sv1;
import defpackage.yo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SystemSensorPolicy {
    public static final SystemSensorPolicy INSTANCE = new SystemSensorPolicy();
    public static final String PROFILE_SHA256 = "c8608011eb603ffbfdba9bb9abf222018f1dbbb6a94a27a914a657c19e7aae67";
    public static final String COLOROS15_SHA256 = "7293157e3e5babc1f812e5947b9b925f2ff83c0217445d0ca6e794c858396218";
    public static final String HYPEROS4_SHA256 = "776156ec89548910092155947f9d6429d702684a77a57efd5b2fd5fe52b93c21";
    private static final List<Profile> profiles = am1.G(new Profile("sensor-layout-pje110", PROFILE_SHA256, "device-tested"), new Profile("sensor-layout-opd2404", COLOROS15_SHA256, "static-reviewed"), new Profile("sensor-layout-popsicle", HYPEROS4_SHA256, "device-tested"));

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Profile {
        private final String id;
        private final String sha256;
        private final String validation;

        public Profile(String str, String str2, String str3) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            this.id = str;
            this.sha256 = str2;
            this.validation = str3;
        }

        public static /* synthetic */ Profile copy$default(Profile profile, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = profile.id;
            }
            if ((i & 2) != 0) {
                str2 = profile.sha256;
            }
            if ((i & 4) != 0) {
                str3 = profile.validation;
            }
            return profile.copy(str, str2, str3);
        }

        public final String component1() {
            return this.id;
        }

        public final String component2() {
            return this.sha256;
        }

        public final String component3() {
            return this.validation;
        }

        public final Profile copy(String str, String str2, String str3) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            return new Profile(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Profile)) {
                return false;
            }
            Profile profile = (Profile) obj;
            return o51.f(this.id, profile.id) && o51.f(this.sha256, profile.sha256) && o51.f(this.validation, profile.validation);
        }

        public final String getId() {
            return this.id;
        }

        public final String getSha256() {
            return this.sha256;
        }

        public final String getValidation() {
            return this.validation;
        }

        public int hashCode() {
            return this.validation.hashCode() + p91.d(this.id.hashCode() * 31, 31, this.sha256);
        }

        public String toString() {
            String str = this.id;
            String str2 = this.sha256;
            return az2.p(p91.t("Profile(id=", str, ", sha256=", str2, ", validation="), this.validation, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class SensorDescriptor {
        private final int handle;
        private final int type;
        private final boolean wakeUp;

        public SensorDescriptor(int i, int i2, boolean z) {
            this.handle = i;
            this.type = i2;
            this.wakeUp = z;
        }

        public static /* synthetic */ SensorDescriptor copy$default(SensorDescriptor sensorDescriptor, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = sensorDescriptor.handle;
            }
            if ((i3 & 2) != 0) {
                i2 = sensorDescriptor.type;
            }
            if ((i3 & 4) != 0) {
                z = sensorDescriptor.wakeUp;
            }
            return sensorDescriptor.copy(i, i2, z);
        }

        public final int component1() {
            return this.handle;
        }

        public final int component2() {
            return this.type;
        }

        public final boolean component3() {
            return this.wakeUp;
        }

        public final SensorDescriptor copy(int i, int i2, boolean z) {
            return new SensorDescriptor(i, i2, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SensorDescriptor)) {
                return false;
            }
            SensorDescriptor sensorDescriptor = (SensorDescriptor) obj;
            return this.handle == sensorDescriptor.handle && this.type == sensorDescriptor.type && this.wakeUp == sensorDescriptor.wakeUp;
        }

        public final int getHandle() {
            return this.handle;
        }

        public final int getType() {
            return this.type;
        }

        public final boolean getWakeUp() {
            return this.wakeUp;
        }

        public int hashCode() {
            return Boolean.hashCode(this.wakeUp) + p91.b(this.type, Integer.hashCode(this.handle) * 31, 31);
        }

        public String toString() {
            int i = this.handle;
            int i2 = this.type;
            boolean z = this.wakeUp;
            StringBuilder sbS = p91.s("SensorDescriptor(handle=", ", type=", i, i2, ", wakeUp=");
            sbS.append(z);
            sbS.append(")");
            return sbS.toString();
        }
    }

    private SystemSensorPolicy() {
    }

    public final double cadence(JSONObject jSONObject, long j) {
        jSONObject.getClass();
        double dOptDouble = jSONObject.optDouble("speed_m_s", 0.0d);
        Double dValueOf = Double.valueOf(dOptDouble);
        if (Math.abs(dOptDouble) > Double.MAX_VALUE) {
            dValueOf = null;
        }
        double dDoubleValue = dValueOf != null ? dValueOf.doubleValue() : 0.0d;
        if (!jSONObject.optBoolean("is_auto_cadence", true)) {
            return mh0.v(jSONObject.optInt("step_cadence_spm", 165), 60, 240);
        }
        long jOptLong = j - jSONObject.optLong("start_timestamp", j);
        if (jOptLong < 0) {
            jOptLong = 0;
        }
        double d = jOptLong / 1000.0d;
        rv1 rv1Var = sv1.a;
        rv1 rv1VarC = sv1.c(jSONObject.optInt("realism_level", 0), jSONObject.optInt("speed_fluctuation_pct", 0), jSONObject.optLong("start_timestamp"));
        return ((rv1VarC.f.H(d) * rv1VarC.b.f) + (rv1VarC.e.H(d) * rv1VarC.d * 0.4d) + 1.0d) * ((double) StepSimulationClock.Companion.autoCadence(dDoubleValue));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0056 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    /* JADX WARN: Code duplicated, block: B:27:0x005f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0080  */
    /* JADX WARN: Code duplicated, block: B:41:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:? A[LOOP:0: B:34:0x007a->B:42:?, LOOP_END, SYNTHETIC] */
    public final boolean isTarget(int i, Set<String> set, Set<String> set2, JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        Iterable iterableF0;
        Iterator it;
        set.getClass();
        set2.getClass();
        jSONObject.getClass();
        int i2 = i % 100000;
        if (10000 <= i2 && i2 < 20000 && !set.isEmpty()) {
            Set<String> set3 = set;
            if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                Iterator<T> it2 = set3.iterator();
                while (it2.hasNext()) {
                    if (set2.contains((String) it2.next())) {
                    }
                }
                if (jSONObject.optBoolean("active", false)) {
                    if (jSONObject.optBoolean("system_hook_global_mode", false)) {
                        return true;
                    }
                    jSONArrayOptJSONArray = jSONObject.optJSONArray("system_hook_packages");
                    if (jSONArrayOptJSONArray == null) {
                        return false;
                    }
                    iterableF0 = mh0.f0(0, jSONArrayOptJSONArray.length());
                    if (!(iterableF0 instanceof Collection) && ((Collection) iterableF0).isEmpty()) {
                        return false;
                    }
                    it = iterableF0.iterator();
                    while (it.hasNext()) {
                        if (set.contains(jSONArrayOptJSONArray.optString(((j41) it).nextInt()))) {
                            return true;
                        }
                    }
                }
            } else if (jSONObject.optBoolean("active", false)) {
                if (jSONObject.optBoolean("system_hook_global_mode", false)) {
                    return true;
                }
                jSONArrayOptJSONArray = jSONObject.optJSONArray("system_hook_packages");
                if (jSONArrayOptJSONArray == null) {
                    return false;
                }
                iterableF0 = mh0.f0(0, jSONArrayOptJSONArray.length());
                if (!(iterableF0 instanceof Collection)) {
                }
                it = iterableF0.iterator();
                while (it.hasNext()) {
                    if (set.contains(jSONArrayOptJSONArray.optString(((j41) it).nextInt()))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final Profile profile(boolean z, String str) {
        str.getClass();
        Object obj = null;
        if (!z) {
            return null;
        }
        for (Object obj2 : profiles) {
            if (o51.f(((Profile) obj2).getSha256(), str)) {
                obj = obj2;
                break;
            }
        }
        return (Profile) obj;
    }

    public final List<SensorDescriptor> stepCatalog(List<SensorDescriptor> list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            SensorDescriptor sensorDescriptor = (SensorDescriptor) obj;
            if (sensorDescriptor.getHandle() >= 0 && yo.H0(new Integer[]{18, 19}).contains(Integer.valueOf(sensorDescriptor.getType()))) {
                arrayList.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            SensorDescriptor sensorDescriptor2 = (SensorDescriptor) obj2;
            if (hashSet.add(new i52(Integer.valueOf(sensorDescriptor2.getHandle()), Integer.valueOf(sensorDescriptor2.getType())))) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.size() <= 32) {
            return arrayList2;
        }
        fo.i("Step sensor catalog too large");
        return null;
    }
}
