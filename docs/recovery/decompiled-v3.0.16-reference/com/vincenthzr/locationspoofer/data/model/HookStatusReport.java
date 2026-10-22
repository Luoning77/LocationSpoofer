package com.vincenthzr.locationspoofer.data.model;

import defpackage.am1;
import defpackage.az;
import defpackage.ca0;
import defpackage.hd0;
import defpackage.j41;
import defpackage.k41;
import defpackage.k50;
import defpackage.l13;
import defpackage.mh0;
import defpackage.o51;
import defpackage.p91;
import defpackage.us2;
import defpackage.vj0;
import defpackage.vk0;
import defpackage.xs2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class HookStatusReport {
    public static final Companion Companion = new Companion(null);
    private final List<Component> components;
    private final long configModified;
    private final String configPath;
    private final List<String> errors;
    private final boolean manualVendor;
    private final Map<String, String> nativeSensorRuntime;
    private final String process;
    private final String system;
    private final long updatedAt;
    private final String vendorId;

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Component {
        private final String className;
        private final boolean found;
        private final Map<String, Integer> methods;
        private final String name;
        private final boolean searched;
        private final String source;

        public Component(String str, boolean z, boolean z2, String str2, String str3, Map<String, Integer> map) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            map.getClass();
            this.name = str;
            this.found = z;
            this.searched = z2;
            this.className = str2;
            this.source = str3;
            this.methods = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Component copy$default(Component component, String str, boolean z, boolean z2, String str2, String str3, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = component.name;
            }
            if ((i & 2) != 0) {
                z = component.found;
            }
            if ((i & 4) != 0) {
                z2 = component.searched;
            }
            if ((i & 8) != 0) {
                str2 = component.className;
            }
            if ((i & 16) != 0) {
                str3 = component.source;
            }
            if ((i & 32) != 0) {
                map = component.methods;
            }
            String str4 = str3;
            Map map2 = map;
            return component.copy(str, z, z2, str2, str4, map2);
        }

        public final String component1() {
            return this.name;
        }

        public final boolean component2() {
            return this.found;
        }

        public final boolean component3() {
            return this.searched;
        }

        public final String component4() {
            return this.className;
        }

        public final String component5() {
            return this.source;
        }

        public final Map<String, Integer> component6() {
            return this.methods;
        }

        public final Component copy(String str, boolean z, boolean z2, String str2, String str3, Map<String, Integer> map) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            map.getClass();
            return new Component(str, z, z2, str2, str3, map);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Component)) {
                return false;
            }
            Component component = (Component) obj;
            return o51.f(this.name, component.name) && this.found == component.found && this.searched == component.searched && o51.f(this.className, component.className) && o51.f(this.source, component.source) && o51.f(this.methods, component.methods);
        }

        public final String getClassName() {
            return this.className;
        }

        public final boolean getFound() {
            return this.found;
        }

        public final Map<String, Integer> getMethods() {
            return this.methods;
        }

        public final String getName() {
            return this.name;
        }

        public final boolean getSearched() {
            return this.searched;
        }

        public final String getSource() {
            return this.source;
        }

        public final State getState() {
            if (!this.found) {
                return this.searched ? State.NOT_FOUND : State.PENDING;
            }
            Collection<Integer> collectionValues = this.methods.values();
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator<T> it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (((Number) it.next()).intValue() > 0) {
                        return State.HOOKED;
                    }
                }
            }
            return State.NO_METHODS;
        }

        public int hashCode() {
            return this.methods.hashCode() + p91.d(p91.d(p91.e(p91.e(this.name.hashCode() * 31, 31, this.found), 31, this.searched), 31, this.className), 31, this.source);
        }

        public String toString() {
            return "Component(name=" + this.name + ", found=" + this.found + ", searched=" + this.searched + ", className=" + this.className + ", source=" + this.source + ", methods=" + this.methods + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public enum State {
        HOOKED,
        NO_METHODS,
        NOT_FOUND,
        PENDING;

        private static final /* synthetic */ vk0 $ENTRIES = hd0.s(values());

        public static vk0 getEntries() {
            return $ENTRIES;
        }
    }

    public HookStatusReport(String str, long j, String str2, boolean z, String str3, String str4, long j2, List<Component> list, List<String> list2, Map<String, String> map) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        list2.getClass();
        map.getClass();
        this.process = str;
        this.updatedAt = j;
        this.vendorId = str2;
        this.manualVendor = z;
        this.system = str3;
        this.configPath = str4;
        this.configModified = j2;
        this.components = list;
        this.errors = list2;
        this.nativeSensorRuntime = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HookStatusReport copy$default(HookStatusReport hookStatusReport, String str, long j, String str2, boolean z, String str3, String str4, long j2, List list, List list2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hookStatusReport.process;
        }
        if ((i & 2) != 0) {
            j = hookStatusReport.updatedAt;
        }
        if ((i & 4) != 0) {
            str2 = hookStatusReport.vendorId;
        }
        if ((i & 8) != 0) {
            z = hookStatusReport.manualVendor;
        }
        if ((i & 16) != 0) {
            str3 = hookStatusReport.system;
        }
        if ((i & 32) != 0) {
            str4 = hookStatusReport.configPath;
        }
        if ((i & 64) != 0) {
            j2 = hookStatusReport.configModified;
        }
        if ((i & WorkQueueKt.BUFFER_CAPACITY) != 0) {
            list = hookStatusReport.components;
        }
        if ((i & 256) != 0) {
            list2 = hookStatusReport.errors;
        }
        if ((i & 512) != 0) {
            map = hookStatusReport.nativeSensorRuntime;
        }
        Map map2 = map;
        List list3 = list;
        long j3 = j2;
        String str5 = str3;
        String str6 = str4;
        String str7 = str2;
        return hookStatusReport.copy(str, j, str7, z, str5, str6, j3, list3, list2, map2);
    }

    public final String component1() {
        return this.process;
    }

    public final Map<String, String> component10() {
        return this.nativeSensorRuntime;
    }

    public final long component2() {
        return this.updatedAt;
    }

    public final String component3() {
        return this.vendorId;
    }

    public final boolean component4() {
        return this.manualVendor;
    }

    public final String component5() {
        return this.system;
    }

    public final String component6() {
        return this.configPath;
    }

    public final long component7() {
        return this.configModified;
    }

    public final List<Component> component8() {
        return this.components;
    }

    public final List<String> component9() {
        return this.errors;
    }

    public final HookStatusReport copy(String str, long j, String str2, boolean z, String str3, String str4, long j2, List<Component> list, List<String> list2, Map<String, String> map) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        list2.getClass();
        map.getClass();
        return new HookStatusReport(str, j, str2, z, str3, str4, j2, list, list2, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HookStatusReport)) {
            return false;
        }
        HookStatusReport hookStatusReport = (HookStatusReport) obj;
        return o51.f(this.process, hookStatusReport.process) && this.updatedAt == hookStatusReport.updatedAt && o51.f(this.vendorId, hookStatusReport.vendorId) && this.manualVendor == hookStatusReport.manualVendor && o51.f(this.system, hookStatusReport.system) && o51.f(this.configPath, hookStatusReport.configPath) && this.configModified == hookStatusReport.configModified && o51.f(this.components, hookStatusReport.components) && o51.f(this.errors, hookStatusReport.errors) && o51.f(this.nativeSensorRuntime, hookStatusReport.nativeSensorRuntime);
    }

    public final List<Component> getComponents() {
        return this.components;
    }

    public final long getConfigModified() {
        return this.configModified;
    }

    public final String getConfigPath() {
        return this.configPath;
    }

    public final List<String> getErrors() {
        return this.errors;
    }

    public final int getHookedCount() {
        List<Component> list = this.components;
        int i = 0;
        if (list != null && list.isEmpty()) {
            return 0;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((Component) it.next()).getState() == State.HOOKED && (i = i + 1) < 0) {
                am1.W();
                throw null;
            }
        }
        return i;
    }

    public final boolean getManualVendor() {
        return this.manualVendor;
    }

    public final Map<String, String> getNativeSensorRuntime() {
        return this.nativeSensorRuntime;
    }

    public final String getProcess() {
        return this.process;
    }

    public final String getSystem() {
        return this.system;
    }

    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getVendorId() {
        return this.vendorId;
    }

    public int hashCode() {
        return this.nativeSensorRuntime.hashCode() + p91.g(this.errors, p91.g(this.components, p91.c(p91.d(p91.d(p91.e(p91.d(p91.c(this.process.hashCode() * 31, 31, this.updatedAt), 31, this.vendorId), 31, this.manualVendor), 31, this.system), 31, this.configPath), 31, this.configModified), 31), 31);
    }

    public final boolean isStale(long j) {
        return this.updatedAt < j;
    }

    public String toString() {
        String str = this.process;
        long j = this.updatedAt;
        String str2 = this.vendorId;
        boolean z = this.manualVendor;
        String str3 = this.system;
        String str4 = this.configPath;
        long j2 = this.configModified;
        List<Component> list = this.components;
        List<String> list2 = this.errors;
        Map<String, String> map = this.nativeSensorRuntime;
        StringBuilder sb = new StringBuilder("HookStatusReport(process=");
        sb.append(str);
        sb.append(", updatedAt=");
        sb.append(j);
        sb.append(", vendorId=");
        sb.append(str2);
        sb.append(", manualVendor=");
        sb.append(z);
        p91.y(sb, ", system=", str3, ", configPath=", str4);
        sb.append(", configModified=");
        sb.append(j2);
        sb.append(", components=");
        sb.append(list);
        sb.append(", errors=");
        sb.append(list2);
        sb.append(", nativeSensorRuntime=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }

        public final HookStatusReport parse(String str) {
            vj0 vj0Var;
            LinkedHashMap linkedHashMap;
            Iterator it;
            LinkedHashMap linkedHashMap2;
            Iterator<String> itKeys;
            str.getClass();
            try {
                JSONObject jSONObject = new JSONObject(l13.D0(str).toString());
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("vendor");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("components");
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("errors");
                String string = jSONObject.getString("process");
                string.getClass();
                long jOptLong = jSONObject.optLong("updated_at");
                String strOptString = jSONObjectOptJSONObject.optString("id");
                strOptString.getClass();
                boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("manual");
                String strOptString2 = jSONObject.optString("system");
                strOptString2.getClass();
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("config");
                String strOptString3 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("path") : null;
                if (strOptString3 == null) {
                    strOptString3 = "";
                }
                String str2 = strOptString3;
                JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("config");
                long jOptLong2 = jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.optLong("modified") : 0L;
                k41 k41VarF0 = mh0.f0(0, jSONArrayOptJSONArray != null ? jSONArrayOptJSONArray.length() : 0);
                try {
                    ArrayList arrayList = new ArrayList(az.Y(k41VarF0, 10));
                    Iterator it2 = k41VarF0.iterator();
                    while (true) {
                        boolean z = ((j41) it2).g;
                        vj0Var = vj0.e;
                        if (!z) {
                            break;
                        }
                        int iNextInt = ((j41) it2).nextInt();
                        jSONArrayOptJSONArray.getClass();
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(iNextInt);
                        JSONObject jSONObjectOptJSONObject4 = jSONObject2.optJSONObject("methods");
                        String string2 = jSONObject2.getString("name");
                        string2.getClass();
                        boolean zOptBoolean2 = jSONObject2.optBoolean("found");
                        boolean zOptBoolean3 = jSONObject2.optBoolean("searched");
                        String strOptString4 = jSONObject2.optString("class");
                        strOptString4.getClass();
                        String strOptString5 = jSONObject2.optString("source");
                        strOptString5.getClass();
                        if (jSONObjectOptJSONObject4 == null || (itKeys = jSONObjectOptJSONObject4.keys()) == null) {
                            it = it2;
                            linkedHashMap2 = null;
                        } else {
                            us2 us2VarN = xs2.N(itKeys);
                            linkedHashMap2 = new LinkedHashMap();
                            Iterator it3 = ((k50) us2VarN).iterator();
                            while (it3.hasNext()) {
                                Iterator it4 = it3;
                                Object next = it4.next();
                                linkedHashMap2.put(next, Integer.valueOf(jSONObjectOptJSONObject4.optInt((String) next)));
                                it3 = it4;
                                it2 = it2;
                            }
                            it = it2;
                        }
                        arrayList.add(new Component(string2, zOptBoolean2, zOptBoolean3, strOptString4, strOptString5, linkedHashMap2 == null ? vj0Var : linkedHashMap2));
                        it2 = it;
                    }
                    k41 k41VarF1 = mh0.f0(0, jSONArrayOptJSONArray2 != null ? jSONArrayOptJSONArray2.length() : 0);
                    ArrayList arrayList2 = new ArrayList(az.Y(k41VarF1, 10));
                    Iterator it5 = k41VarF1.iterator();
                    while (((j41) it5).g) {
                        int iNextInt2 = ((j41) it5).nextInt();
                        jSONArrayOptJSONArray2.getClass();
                        arrayList2.add(jSONArrayOptJSONArray2.getString(iNextInt2));
                    }
                    JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("native_sensor_runtime");
                    if (jSONObjectOptJSONObject5 != null) {
                        Iterator<String> itKeys2 = jSONObjectOptJSONObject5.keys();
                        itKeys2.getClass();
                        us2 us2VarN2 = xs2.N(itKeys2);
                        linkedHashMap = new LinkedHashMap();
                        for (Object obj : (k50) us2VarN2) {
                            linkedHashMap.put(obj, jSONObjectOptJSONObject5.optString((String) obj));
                        }
                    } else {
                        linkedHashMap = null;
                    }
                    return new HookStatusReport(string, jOptLong, strOptString, zOptBoolean, strOptString2, str2, jOptLong2, arrayList, arrayList2, linkedHashMap == null ? vj0Var : linkedHashMap);
                } catch (Exception unused) {
                    return null;
                }
            } catch (Exception unused2) {
                return null;
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ HookStatusReport(String str, long j, String str2, boolean z, String str3, String str4, long j2, List list, List list2, Map map, int i, ca0 ca0Var) {
        this(str, j, str2, z, str3, str4, j2, list, list2, (i & 512) != 0 ? vj0.e : map);
    }
}
