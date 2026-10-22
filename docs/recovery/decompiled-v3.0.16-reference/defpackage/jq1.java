package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class jq1 extends ig0 {
    public static Object L(Object obj, Map map) {
        map.getClass();
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static int M(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map N(i52... i52VarArr) {
        if (i52VarArr.length <= 0) {
            return vj0.e;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(M(i52VarArr.length));
        P(linkedHashMap, i52VarArr);
        return linkedHashMap;
    }

    public static LinkedHashMap O(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final void P(HashMap map, i52[] i52VarArr) {
        for (i52 i52Var : i52VarArr) {
            map.put(i52Var.e, i52Var.f);
        }
    }

    public static Map Q(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return vj0.e;
        }
        int i = 0;
        if (size == 1) {
            i52 i52Var = (i52) arrayList.get(0);
            i52Var.getClass();
            Map mapSingletonMap = Collections.singletonMap(i52Var.e, i52Var.f);
            mapSingletonMap.getClass();
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(M(arrayList.size()));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            i52 i52Var2 = (i52) obj;
            linkedHashMap.put(i52Var2.e, i52Var2.f);
        }
        return linkedHashMap;
    }

    public static Map R(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            return vj0.e;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static LinkedHashMap S(Map map) {
        map.getClass();
        return new LinkedHashMap(map);
    }
}
