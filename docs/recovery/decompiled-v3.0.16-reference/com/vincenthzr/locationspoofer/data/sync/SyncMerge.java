package com.vincenthzr.locationspoofer.data.sync;

import defpackage.az;
import defpackage.az2;
import defpackage.e71;
import defpackage.jq1;
import defpackage.l13;
import defpackage.o51;
import defpackage.pt2;
import defpackage.s13;
import defpackage.sw;
import defpackage.t61;
import defpackage.zy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SyncMerge {
    public static final SyncMerge INSTANCE = new SyncMerge();

    private SyncMerge() {
    }

    private final String conflictCopy(String str, String str2, String str3) {
        String str4;
        LinkedHashMap linkedHashMap = new LinkedHashMap(e71.e(t61.d.c(str2)));
        String strZ0 = l13.z0(str, ':');
        if (strZ0.equals("location")) {
            str4 = "location";
        } else {
            str4 = strZ0.equals("collection") ? "route" : null;
        }
        if (str4 == null) {
            linkedHashMap.put("syncId", e71.b(str3));
        } else {
            linkedHashMap.put(str4, conflictCopy$replace(str3, e71.e((JsonElement) jq1.L(str4, linkedHashMap))));
        }
        if (s13.Z(str, "collection:", false)) {
            JsonArray jsonArrayD = e71.d((JsonElement) jq1.L("samples", linkedHashMap));
            ArrayList arrayList = new ArrayList(az.Y(jsonArrayD, 10));
            Iterator<JsonElement> it = jsonArrayD.iterator();
            while (it.hasNext()) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(e71.e(it.next()));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(e71.e((JsonElement) jq1.L("location", linkedHashMap2)));
                byte[] bytes = (str3 + "\n" + e71.f((JsonElement) jq1.L("syncId", linkedHashMap3)).getContent()).getBytes(sw.a);
                bytes.getClass();
                linkedHashMap3.put("syncId", e71.b(UUID.nameUUIDFromBytes(bytes).toString()));
                linkedHashMap2.put("location", new JsonObject(linkedHashMap3));
                arrayList.add(new JsonObject(linkedHashMap2));
            }
            linkedHashMap.put("samples", new JsonArray(arrayList));
        }
        return new JsonObject(linkedHashMap).toString();
    }

    private static final JsonObject conflictCopy$replace(String str, JsonObject jsonObject) {
        LinkedHashMap linkedHashMapS = jq1.S(jsonObject);
        linkedHashMapS.put("syncId", e71.b(str));
        return new JsonObject(linkedHashMapS);
    }

    public static /* synthetic */ Map merge$default(SyncMerge syncMerge, Map map, Map map2, Map map3, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return syncMerge.merge(map, map2, map3, z);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a8  */
    public final Map<String, String> merge(Map<String, String> map, Map<String, String> map2, Map<String, String> map3, boolean z) {
        map.getClass();
        map2.getClass();
        map3.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : zy.B0(pt2.N(pt2.N(map.keySet(), map2.keySet()), map3.keySet()))) {
            String str2 = map.get(str);
            String str3 = map2.get(str);
            String str4 = map3.get(str);
            if ((z && s13.Z(str, "setting:", false) && str4 != null) || o51.f(str3, str2)) {
                str3 = str4;
            } else if (!o51.f(str4, str2) && !o51.f(str3, str4)) {
                if (str3 == null) {
                    str3 = str4;
                } else if (str4 != null && !s13.Z(str, "setting:", false)) {
                    byte[] bytes = az2.k(str, "\n", str3).getBytes(sw.a);
                    bytes.getClass();
                    String string = UUID.nameUUIDFromBytes(bytes).toString();
                    string.getClass();
                    linkedHashMap.put(az2.k(l13.z0(str, ':'), ":", string), conflictCopy(str, str3, string));
                    str3 = str4;
                }
            }
            if (str3 != null) {
                linkedHashMap.put(str, str3);
            }
        }
        return new TreeMap(linkedHashMap);
    }
}
