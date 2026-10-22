package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class vl0 {
    public static final vl0 a = new vl0();
    public static final if2 b = new if2("[0-9a-f]{2}(:[0-9a-f]{2}){5}");
    public static final Set c = yo.H0(new String[]{"00:00:00:00:00:00", "ff:ff:ff:ff:ff:ff", "02:00:00:00:00:00"});

    public static boolean a(String str) {
        Object wg2Var;
        try {
            wg2Var = new JSONArray(str);
        } catch (Throwable th) {
            wg2Var = new wg2(th);
        }
        if (wg2Var instanceof wg2) {
            wg2Var = null;
        }
        return b((JSONArray) wg2Var);
    }

    public static boolean b(JSONArray jSONArray) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONArray != null) {
            Iterable iterableF0 = mh0.f0(0, jSONArray.length());
            if (!(iterableF0 instanceof Collection) || !((Collection) iterableF0).isEmpty()) {
                Iterator it = iterableF0.iterator();
                do {
                    j41 j41Var = (j41) it;
                    if (j41Var.g) {
                        jSONObjectOptJSONObject = jSONArray.optJSONObject(j41Var.nextInt());
                    }
                } while ((jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.length() : 0) <= 0);
                return true;
            }
        }
        return false;
    }

    public static boolean c(String str) {
        if (str == null) {
            return false;
        }
        Locale locale = Locale.ROOT;
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        return b.b(lowerCase) && !c.contains(lowerCase);
    }

    public static void d(JSONObject jSONObject) {
        jSONObject.getClass();
        for (Map.Entry entry : jq1.N(new i52("wifi", Boolean.valueOf(f(jSONObject.optJSONObject("wifi_json")) > 0)), new i52("cell", Boolean.valueOf(b(jSONObject.optJSONArray("cell_json")))), new i52("bluetooth", Boolean.valueOf(b(jSONObject.optJSONArray("bluetooth_json"))))).entrySet()) {
            String str = (String) entry.getKey();
            boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
            String strK = az2.k("mock_", str, "_requested");
            String strJ = az2.j("mock_", str);
            boolean zOptBoolean = jSONObject.optBoolean(strK, jSONObject.optBoolean(strJ, false));
            jSONObject.put(strK, zOptBoolean);
            jSONObject.put(strJ, zOptBoolean && zBooleanValue);
        }
    }

    public static int e(String str) {
        Object wg2Var;
        try {
            if (str == null) {
                str = "";
            }
            wg2Var = new JSONObject(str);
        } catch (Throwable th) {
            wg2Var = new wg2(th);
        }
        if (wg2Var instanceof wg2) {
            wg2Var = null;
        }
        return f((JSONObject) wg2Var);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    public static int f(JSONObject jSONObject) {
        String strOptString;
        String lowerCase;
        String strOptString2;
        if (jSONObject == null) {
            return 0;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("nearbyWifi");
        String str = null;
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject == null || (strOptString2 = jSONObjectOptJSONObject.optString("bssid")) == null) {
                    lowerCase = null;
                } else {
                    Locale locale = Locale.ROOT;
                    locale.getClass();
                    lowerCase = strOptString2.toLowerCase(locale);
                    lowerCase.getClass();
                    if (!c(lowerCase)) {
                        lowerCase = null;
                    }
                }
                if (lowerCase != null) {
                    linkedHashSet.add(lowerCase);
                }
            }
        }
        if (jSONObject.optBoolean("isConnected", false)) {
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("connectedWifi");
            if (jSONObjectOptJSONObject2 != null && (strOptString = jSONObjectOptJSONObject2.optString("bssid")) != null) {
                Locale locale2 = Locale.ROOT;
                locale2.getClass();
                String lowerCase2 = strOptString.toLowerCase(locale2);
                lowerCase2.getClass();
                if (c(lowerCase2)) {
                    str = lowerCase2;
                }
            }
            if (str != null) {
                linkedHashSet.add(str);
            }
        }
        return linkedHashSet.size();
    }
}
