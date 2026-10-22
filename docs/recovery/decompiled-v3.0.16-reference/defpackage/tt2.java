package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.vincenthzr.locationspoofer.data.model.RoutePoint;
import com.vincenthzr.locationspoofer.data.model.SavedLocation;
import com.vincenthzr.locationspoofer.data.model.SavedRoute;
import com.vincenthzr.locationspoofer.data.sync.SyncCategory;
import com.vincenthzr.locationspoofer.data.sync.SyncSelection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class tt2 {
    public static final Set c = yo.H0(new String[]{"map_type", "map_engine", "wifi_source", "mock_wifi", "mock_cell", "mock_bluetooth", "enable_jitter", "restart_apps_on_spoof", "altitude", "altitude_variation_m", "satellite_count", "fixed_joystick_enabled", "route_lateral_deviation", "barometer_fluctuation", "realism_level", "speed_fluctuation_pct", "gait_template", "use_gait_template", "keep_last_map_position", "app_coordinate_systems", "system_hook_packages", "force_location_enabled", "is_dark_mode", "language", "is_language_set"});
    public final Context a;
    public final SharedPreferences b;

    public tt2(Context context) {
        Object wg2Var;
        String str = "[]";
        this.a = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("app_settings", 0);
        sharedPreferences.getClass();
        this.b = sharedPreferences;
        gh0.D(context);
        try {
            String string = sharedPreferences.getString("saved_locations", "[]");
            if (string != null) {
                str = string;
            }
            wg2Var = new JSONArray(str);
        } catch (Throwable th) {
            wg2Var = new wg2(th);
        }
        JSONArray jSONArray = (JSONArray) (wg2Var instanceof wg2 ? new JSONArray() : wg2Var);
        if (ke0.s(jSONArray) && !this.b.edit().putString("saved_locations", jSONArray.toString()).commit()) {
            fo.n("Check failed.");
            throw null;
        }
        if ((!o51.f(this.b.getString("map_engine", null), "SELF_HOSTED") || !o51.f(this.b.getString("map_type", null), "NORMAL")) && !this.b.edit().putString("map_engine", "SELF_HOSTED").putString("map_type", "NORMAL").putString("geo_search_source", "FOLLOW_MAP").commit()) {
            fo.n("Check failed.");
            throw null;
        }
        if (this.b.contains("wigle_api_token") || this.b.contains("opencellid_api_token") || this.b.contains("wifi_source")) {
            this.b.edit().remove("wigle_api_token").remove("opencellid_api_token").remove("wifi_source").apply();
        }
        List listG = am1.G("amap_api_key", "baidu_api_key", "google_api_key");
        SharedPreferences sharedPreferences2 = this.b;
        if (!listG.isEmpty()) {
            Iterator it = listG.iterator();
            while (it.hasNext()) {
                if (sharedPreferences2.contains((String) it.next())) {
                    SharedPreferences.Editor editorEdit = this.b.edit();
                    Iterator it2 = listG.iterator();
                    while (it2.hasNext()) {
                        editorEdit.remove((String) it2.next());
                    }
                    editorEdit.apply();
                    break;
                }
            }
        }
        if (this.b.getBoolean("mock_switches_migrated_v3", false)) {
            return;
        }
        this.b.edit().putBoolean("mock_wifi", true).putBoolean("mock_cell", true).putBoolean("mock_bluetooth", true).putBoolean("is_system_hook_global_mode", true).putBoolean("mock_switches_migrated_v3", true).apply();
    }

    public final LinkedHashMap a() {
        String string = this.b.getString("app_coordinate_systems", "{}");
        String str = string != null ? string : "{}";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            itKeys.getClass();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, jSONObject.getString(next));
            }
            return linkedHashMap;
        } catch (Exception e) {
            e.printStackTrace();
            return linkedHashMap;
        }
    }

    public final ArrayList b() {
        String string = this.b.getString("saved_locations", "[]");
        if (string == null) {
            string = "[]";
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(string);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String strOptString = jSONObject.optString("name", "");
                strOptString.getClass();
                double dOptDouble = jSONObject.optDouble("lat", 0.0d);
                double dOptDouble2 = jSONObject.optDouble("lng", 0.0d);
                String strOptString2 = jSONObject.optString("wifiJson", "[]");
                strOptString2.getClass();
                String strOptString3 = jSONObject.optString("cellJson", "[]");
                strOptString3.getClass();
                String strOptString4 = jSONObject.optString("bluetoothJson", "[]");
                strOptString4.getClass();
                Long lValueOf = jSONObject.has("sourceLocationId") ? Long.valueOf(jSONObject.optLong("sourceLocationId")) : null;
                String string2 = jSONObject.getString("syncId");
                string2.getClass();
                String strOptString5 = jSONObject.optString("sourceLocationSyncId");
                strOptString5.getClass();
                arrayList.add(new SavedLocation(strOptString, dOptDouble, dOptDouble2, strOptString2, strOptString3, strOptString4, lValueOf, string2, (l13.k0(strOptString5) || strOptString5.equals("null")) ? null : strOptString5));
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            return arrayList;
        }
    }

    public final ArrayList c() {
        String string = this.b.getString("saved_routes", "[]");
        String str = string != null ? string : "[]";
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                JSONArray jSONArray2 = jSONObject.getJSONArray("points");
                k41 k41VarF0 = mh0.f0(0, jSONArray2.length());
                ArrayList arrayList2 = new ArrayList(az.Y(k41VarF0, 10));
                Iterator it = k41VarF0.iterator();
                while (((j41) it).g) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(((j41) it).nextInt());
                    arrayList2.add(new RoutePoint(jSONObject2.getDouble("lat"), jSONObject2.getDouble("lng"), 0.0d, 4, (ca0) null));
                }
                String string2 = jSONObject.getString("name");
                string2.getClass();
                arrayList.add(new SavedRoute(string2, arrayList2));
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            return arrayList;
        }
    }

    public final SyncSelection d() {
        SharedPreferences sharedPreferences = this.b;
        Set<String> stringSet = sharedPreferences.getStringSet("sync_categories", null);
        vk0 entries = SyncCategory.getEntries();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entries) {
            SyncCategory syncCategory = (SyncCategory) obj;
            if (stringSet == null || stringSet.contains(syncCategory.getId())) {
                arrayList.add(obj);
            }
        }
        return new SyncSelection(sharedPreferences.getBoolean("sync_enabled", false), zy.N0(arrayList));
    }

    public final LinkedHashSet e() {
        String string = this.b.getString("system_hook_packages", "[]");
        String str = string != null ? string : "[]";
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String string2 = jSONArray.getString(i);
                string2.getClass();
                linkedHashSet.add(string2);
            }
            return linkedHashSet;
        } catch (Exception e) {
            e.printStackTrace();
            return linkedHashSet;
        }
    }

    public final void f(List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SavedLocation savedLocation = (SavedLocation) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("syncId", savedLocation.getSyncId());
            jSONObject.put("name", savedLocation.getName());
            jSONObject.put("lat", savedLocation.getLat());
            jSONObject.put("lng", savedLocation.getLng());
            jSONObject.put("wifiJson", savedLocation.getWifiJson());
            jSONObject.put("cellJson", savedLocation.getCellJson());
            jSONObject.put("bluetoothJson", savedLocation.getBluetoothJson());
            if (savedLocation.getSourceLocationId() != null) {
                jSONObject.put("sourceLocationId", savedLocation.getSourceLocationId().longValue());
            }
            String sourceLocationSyncId = savedLocation.getSourceLocationSyncId();
            if (sourceLocationSyncId != null) {
                jSONObject.put("sourceLocationSyncId", sourceLocationSyncId);
            }
            jSONArray.put(jSONObject);
        }
        ke0.s(jSONArray);
        this.b.edit().putString("saved_locations", jSONArray.toString()).apply();
    }

    public final void g(ArrayList arrayList) {
        JSONArray jSONArray = new JSONArray();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            SavedRoute savedRoute = (SavedRoute) obj;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", savedRoute.getName());
            JSONArray jSONArray2 = new JSONArray();
            for (RoutePoint routePoint : savedRoute.getPoints()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("lat", routePoint.getLat());
                jSONObject2.put("lng", routePoint.getLng());
                jSONArray2.put(jSONObject2);
            }
            jSONObject.put("points", jSONArray2);
            jSONArray.put(jSONObject);
        }
        this.b.edit().putString("saved_routes", jSONArray.toString()).apply();
    }

    public final void h(SyncSelection syncSelection) {
        syncSelection.getClass();
        SharedPreferences.Editor editorPutBoolean = this.b.edit().putBoolean("sync_enabled", syncSelection.getEnabled());
        Set<SyncCategory> categories = syncSelection.getCategories();
        ArrayList arrayList = new ArrayList(az.Y(categories, 10));
        Iterator<T> it = categories.iterator();
        while (it.hasNext()) {
            arrayList.add(((SyncCategory) it.next()).getId());
        }
        if (editorPutBoolean.putStringSet("sync_categories", zy.N0(arrayList)).commit()) {
            return;
        }
        fo.n("Check failed.");
    }
}
