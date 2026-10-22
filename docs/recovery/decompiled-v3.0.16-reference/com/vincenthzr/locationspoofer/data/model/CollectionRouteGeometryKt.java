package com.vincenthzr.locationspoofer.data.model;

import com.vincenthzr.locationspoofer.data.db.CollectionRouteRecord;
import defpackage.az;
import defpackage.ee0;
import defpackage.gt2;
import defpackage.mf3;
import defpackage.my;
import defpackage.oo;
import defpackage.t61;
import defpackage.uj0;
import defpackage.wg2;
import defpackage.y61;
import defpackage.z60;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CollectionRouteGeometryKt {
    private static final t61 collectionRouteJson = ee0.d(new my(4));
    private static final CollectionRouteGeometryKt$geometryCache$1 geometryCache = new LinkedHashMap<String, List<? extends z60>>() { // from class: com.vincenthzr.locationspoofer.data.model.CollectionRouteGeometryKt$geometryCache$1
        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof String) {
                return containsKey((String) obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof List) {
                return containsValue((List<z60>) obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<String, List<z60>>> entrySet() {
            return getEntries();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof String) {
                return get((String) obj);
            }
            return null;
        }

        public /* bridge */ Set<Map.Entry<String, List<z60>>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ Set<String> getKeys() {
            return super.keySet();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof String) ? obj2 : getOrDefault((String) obj, (List<z60>) obj2);
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ Collection<List<z60>> getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<String> keySet() {
            return getKeys();
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if ((obj instanceof String) && (obj2 instanceof List)) {
                return remove((String) obj, (List<z60>) obj2);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, List<? extends z60>> entry) {
            entry.getClass();
            return size() > 64;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<List<z60>> values() {
            return getValues();
        }

        public /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public /* bridge */ boolean containsValue(List<z60> list) {
            return super.containsValue((Object) list);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ List<z60> get(Object obj) {
            if (obj instanceof String) {
                return get((String) obj);
            }
            return null;
        }

        public /* bridge */ List<z60> get(String str) {
            return (List) super.get((Object) str);
        }

        public final /* bridge */ List<z60> getOrDefault(Object obj, List<z60> list) {
            return !(obj instanceof String) ? list : getOrDefault((String) obj, list);
        }

        public /* bridge */ List<z60> getOrDefault(String str, List<z60> list) {
            return (List) super.getOrDefault((Object) str, list);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ List<z60> remove(Object obj) {
            if (obj instanceof String) {
                return remove((String) obj);
            }
            return null;
        }

        public /* bridge */ List<z60> remove(String str) {
            return (List) super.remove((Object) str);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof String) {
                return remove((String) obj);
            }
            return null;
        }

        public /* bridge */ boolean remove(String str, List<z60> list) {
            return super.remove((Object) str, (Object) list);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 collectionRouteJson$lambda$0(y61 y61Var) {
        y61Var.getClass();
        y61Var.c = true;
        return mf3.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [wg2] */
    /* JADX WARN: Type inference failed for: r2v10, types: [uj0] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public static final List<z60> geometry(CollectionRouteRecord collectionRouteRecord) {
        ?? wg2Var;
        List<z60> list;
        collectionRouteRecord.getClass();
        CollectionRouteGeometryKt$geometryCache$1 collectionRouteGeometryKt$geometryCache$1 = geometryCache;
        synchronized (collectionRouteGeometryKt$geometryCache$1) {
            try {
                String pointsJson = collectionRouteRecord.getPointsJson();
                Collection collection = collectionRouteGeometryKt$geometryCache$1.get((Object) pointsJson);
                if (collection == null) {
                    try {
                        t61 t61Var = collectionRouteJson;
                        String pointsJson2 = collectionRouteRecord.getPointsJson();
                        gt2 gt2Var = t61Var.b;
                        Iterable<RoutePoint> iterable = (Iterable) t61Var.a(new oo(RoutePoint.Companion.serializer()), pointsJson2);
                        wg2Var = new ArrayList(az.Y(iterable, 10));
                        for (RoutePoint routePoint : iterable) {
                            wg2Var.add(new z60(routePoint.getLat(), routePoint.getLng()));
                        }
                        if (!wg2Var.isEmpty()) {
                            int size = wg2Var.size();
                            int i = 0;
                            while (i < size) {
                                Object obj = wg2Var.get(i);
                                i++;
                                z60 z60Var = (z60) obj;
                                if (Math.abs(z60Var.a) <= Double.MAX_VALUE && Math.abs(z60Var.b) <= Double.MAX_VALUE) {
                                    double d = z60Var.a;
                                    if (-90.0d <= d && d <= 90.0d) {
                                        double d2 = z60Var.b;
                                        if (-180.0d > d2 || d2 > 180.0d) {
                                        }
                                    }
                                }
                                wg2Var = 0;
                                break;
                            }
                        }
                        if (wg2Var == 0) {
                            wg2Var = uj0.e;
                        }
                    } catch (Throwable th) {
                        wg2Var = new wg2(th);
                    }
                    uj0 uj0Var = uj0.e;
                    boolean z = wg2Var instanceof wg2;
                    ?? r2 = wg2Var;
                    if (z) {
                        r2 = uj0Var;
                    }
                    collection = (List) r2;
                    collectionRouteGeometryKt$geometryCache$1.put(pointsJson, collection);
                }
                list = (List) collection;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return list;
    }
}
