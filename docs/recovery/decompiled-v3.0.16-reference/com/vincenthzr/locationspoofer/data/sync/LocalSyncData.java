package com.vincenthzr.locationspoofer.data.sync;

import com.vincenthzr.locationspoofer.data.db.AppDatabase;
import com.vincenthzr.locationspoofer.data.db.CollectionRouteRecord;
import com.vincenthzr.locationspoofer.data.db.CompleteCollectionRoute;
import com.vincenthzr.locationspoofer.data.db.CompleteLocation;
import com.vincenthzr.locationspoofer.data.db.EnvironmentDao;
import com.vincenthzr.locationspoofer.data.db.LocationBluetooth;
import com.vincenthzr.locationspoofer.data.db.LocationCell;
import com.vincenthzr.locationspoofer.data.db.LocationConnectedWifi;
import com.vincenthzr.locationspoofer.data.db.LocationRecord;
import com.vincenthzr.locationspoofer.data.db.LocationWifi;
import com.vincenthzr.locationspoofer.data.db.LocationWithBluetooth;
import com.vincenthzr.locationspoofer.data.db.LocationWithCell;
import com.vincenthzr.locationspoofer.data.db.LocationWithWifi;
import com.vincenthzr.locationspoofer.data.db.SavedRouteDao;
import com.vincenthzr.locationspoofer.data.db.SavedRouteEntity;
import com.vincenthzr.locationspoofer.data.model.SavedLocation;
import defpackage.am1;
import defpackage.az;
import defpackage.az2;
import defpackage.c71;
import defpackage.e71;
import defpackage.ee0;
import defpackage.fo;
import defpackage.fz;
import defpackage.gm1;
import defpackage.gt2;
import defpackage.i13;
import defpackage.i52;
import defpackage.ji2;
import defpackage.jq1;
import defpackage.k33;
import defpackage.l13;
import defpackage.lu0;
import defpackage.mf3;
import defpackage.o51;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s13;
import defpackage.s90;
import defpackage.so1;
import defpackage.t61;
import defpackage.tt2;
import defpackage.v70;
import defpackage.we2;
import defpackage.x71;
import defpackage.y61;
import defpackage.y80;
import defpackage.y81;
import defpackage.ym3;
import defpackage.yo;
import defpackage.z70;
import defpackage.zs0;
import defpackage.zy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class LocalSyncData {
    private final AppDatabase database;
    private final EnvironmentDao env;
    private final t61 json;
    private final SavedRouteDao routes;
    private final tt2 settings;

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.sync.LocalSyncData$apply$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.sync.LocalSyncData$apply$3", f = "LocalSyncData.kt", l = {80, 85, 86, 87, 106, 106, 108, 109, 111, 114, 119, 120, 121}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends k33 implements lu0 {
        final /* synthetic */ pu0 $beforeApply;
        final /* synthetic */ Map<String, String> $expectedLocal;
        final /* synthetic */ Map<String, String> $requested;
        int I$0;
        int I$1;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$14;
        Object L$15;
        Object L$16;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Map<String, String> map, Map<String, String> map2, pu0 pu0Var, q60 q60Var) {
            super(1, q60Var);
            this.$expectedLocal = map;
            this.$requested = map2;
            this.$beforeApply = pu0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:67:0x03d5  */
        /* JADX WARN: Code duplicated, block: B:70:0x0409  */
        /* JADX WARN: Code duplicated, block: B:74:0x045d  */
        /* JADX WARN: Code duplicated, block: B:7:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x045d -> B:75:0x0464). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x04f6 -> B:16:0x00db). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x058a -> B:13:0x006a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static final java.lang.Object invokeSuspend$saveLocation(java.util.Map<java.lang.String, com.vincenthzr.locationspoofer.data.db.CompleteLocation> r38, com.vincenthzr.locationspoofer.data.sync.LocalSyncData r39, com.vincenthzr.locationspoofer.data.db.CompleteLocation r40, java.lang.Long r41, defpackage.q60 r42) {
            /*
                Method dump skipped, instruction units count: 1522
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vincenthzr.locationspoofer.data.sync.LocalSyncData.AnonymousClass3.invokeSuspend$saveLocation(java.util.Map, com.vincenthzr.locationspoofer.data.sync.LocalSyncData, com.vincenthzr.locationspoofer.data.db.CompleteLocation, java.lang.Long, q60):java.lang.Object");
        }

        public static /* synthetic */ Object invokeSuspend$saveLocation$default(Map map, LocalSyncData localSyncData, CompleteLocation completeLocation, Long l, q60 q60Var, int i, Object obj) {
            if ((i & 8) != 0) {
                l = null;
            }
            return invokeSuspend$saveLocation(map, localSyncData, completeLocation, l, q60Var);
        }

        @Override // defpackage.oq
        public final q60 create(q60 q60Var) {
            return LocalSyncData.this.new AnonymousClass3(this.$expectedLocal, this.$requested, this.$beforeApply, q60Var);
        }

        @Override // defpackage.lu0
        public final Object invoke(q60 q60Var) {
            return ((AnonymousClass3) create(q60Var)).invokeSuspend(mf3.a);
        }

        /* JADX WARN: Code duplicated, block: B:101:0x04fe  */
        /* JADX WARN: Code duplicated, block: B:104:0x0532  */
        /* JADX WARN: Code duplicated, block: B:114:0x05c5 A[LOOP:7: B:112:0x05bf->B:114:0x05c5, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:117:0x05dd  */
        /* JADX WARN: Code duplicated, block: B:139:0x06d2  */
        /* JADX WARN: Code duplicated, block: B:294:0x04b1 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:305:0x089b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:307:? A[LOOP:10: B:137:0x06cc->B:307:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:314:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:64:0x0388  */
        /* JADX WARN: Code duplicated, block: B:66:0x03a4  */
        /* JADX WARN: Code duplicated, block: B:92:0x04aa  */
        /* JADX WARN: Code duplicated, block: B:96:0x04dc  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:154:0x0766 -> B:174:0x0835). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:159:0x0784 -> B:165:0x07dc). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:170:0x07fc -> B:174:0x0835). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:172:0x0832 -> B:174:0x0835). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:177:0x0847 -> B:146:0x0741). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x03bf -> B:80:0x0424). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0420 -> B:80:0x0424). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x04a0 -> B:91:0x04a6). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.oq
        public final java.lang.Object invokeSuspend(java.lang.Object r36) {
            /*
                Method dump skipped, instruction units count: 2782
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vincenthzr.locationspoofer.data.sync.LocalSyncData.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.sync.LocalSyncData$capture$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.sync.LocalSyncData$capture$2", f = "LocalSyncData.kt", l = {26, 29, 37}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends k33 implements lu0 {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        public AnonymousClass2(q60 q60Var) {
            super(1, q60Var);
        }

        @Override // defpackage.oq
        public final q60 create(q60 q60Var) {
            return LocalSyncData.this.new AnonymousClass2(q60Var);
        }

        @Override // defpackage.lu0
        public final Object invoke(q60 q60Var) {
            return ((AnonymousClass2) create(q60Var)).invokeSuspend(mf3.a);
        }

        /* JADX WARN: Code duplicated, block: B:58:0x0247  */
        /* JADX WARN: Code duplicated, block: B:61:0x029d A[LOOP:2: B:59:0x0297->B:61:0x029d, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:65:0x02d6  */
        /* JADX WARN: Code duplicated, block: B:67:0x0325  */
        /* JADX WARN: Code duplicated, block: B:71:0x0348  */
        /* JADX WARN: Code duplicated, block: B:73:0x034e  */
        /* JADX WARN: Code duplicated, block: B:80:0x0395  */
        /* JADX WARN: Code duplicated, block: B:84:0x03a3 A[LOOP:0: B:82:0x039d->B:84:0x03a3, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:91:0x0372 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:93:0x0357 A[SYNTHETIC] */
        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object allCompleteLocations;
            Map map;
            LocalSyncData localSyncData;
            int i;
            Map map2;
            Map linkedHashMap;
            Object collectionRoutes;
            Map map3;
            Throwable th;
            ArrayList arrayListB;
            int size;
            int i2;
            Map map4;
            Object allSavedRoutesList;
            Map map5;
            Map map6;
            SavedLocation savedLocation;
            ArrayList arrayList;
            Object obj2;
            LinkedHashMap linkedHashMap2;
            Long sourceLocationId;
            String sourceLocationSyncId;
            ArrayList arrayList2;
            Iterator it;
            int i3 = this.label;
            Throwable th2 = null;
            z70 z70Var = z70.e;
            if (i3 == 0) {
                ee0.J(obj);
                LocalSyncData localSyncData2 = LocalSyncData.this;
                so1 so1Var = new so1();
                Map<String, ?> all = localSyncData2.settings.b.getAll();
                all.getClass();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    String key = entry.getKey();
                    if (tt2.c.contains(key) && !o51.f(key, "is_language_set")) {
                        linkedHashMap3.put(entry.getKey(), entry.getValue());
                    }
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(jq1.M(linkedHashMap3.size()));
                for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                    Object key2 = entry2.getKey();
                    String string = new JSONArray((Collection) am1.F(entry2.getValue())).toString();
                    string.getClass();
                    String strE0 = l13.e0(1, string);
                    int length = strE0.length() - 1;
                    if (length < 0) {
                        length = 0;
                    }
                    linkedHashMap4.put(key2, l13.B0(length, strE0));
                }
                for (Map.Entry entry3 : jq1.O(linkedHashMap4, jq1.N(new i52("map_engine", "\"SELF_HOSTED\""), new i52("map_type", "\"NORMAL\""), new i52("wifi_source", "\"COMMUNITY\""))).entrySet()) {
                    String str = (String) entry3.getKey();
                    so1Var.put("setting:" + str, (String) entry3.getValue());
                }
                EnvironmentDao environmentDao = localSyncData2.env;
                this.L$0 = localSyncData2;
                this.L$1 = so1Var;
                this.L$2 = so1Var;
                this.I$0 = 0;
                this.label = 1;
                allCompleteLocations = environmentDao.getAllCompleteLocations(this);
                if (allCompleteLocations != z70Var) {
                    map = so1Var;
                    localSyncData = localSyncData2;
                    i = 0;
                    map2 = map;
                }
                return z70Var;
            }
            if (i3 == 1) {
                int i4 = this.I$0;
                Map map7 = (Map) this.L$2;
                Map map8 = (Map) this.L$1;
                LocalSyncData localSyncData3 = (LocalSyncData) this.L$0;
                ee0.J(obj);
                localSyncData = localSyncData3;
                map2 = map8;
                map = map7;
                i = i4;
                allCompleteLocations = obj;
            } else {
                if (i3 == 2) {
                    int i5 = this.I$0;
                    Map map9 = (Map) this.L$4;
                    map = (Map) this.L$2;
                    map2 = (Map) this.L$1;
                    localSyncData = (LocalSyncData) this.L$0;
                    ee0.J(obj);
                    linkedHashMap = map9;
                    i = i5;
                    collectionRoutes = obj;
                    map3 = map2;
                    for (CompleteCollectionRoute completeCollectionRoute : (Iterable) collectionRoutes) {
                        String strJ = az2.j("collection:", completeCollectionRoute.getRoute().getSyncId());
                        t61 t61Var = localSyncData.json;
                        CollectionRouteRecord collectionRouteRecordCopy$default = CollectionRouteRecord.copy$default(completeCollectionRoute.getRoute(), 0L, null, null, null, 0.0d, 0L, null, 126, null);
                        List listC0 = zy.C0(completeCollectionRoute.getSamples(), new Comparator() { // from class: com.vincenthzr.locationspoofer.data.sync.LocalSyncData$capture$2$invokeSuspend$lambda$10$lambda$5$$inlined$sortedBy$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t, T t2) {
                                return ym3.v(((CompleteLocation) t).getLocation().getSyncId(), ((CompleteLocation) t2).getLocation().getSyncId());
                            }
                        });
                        Throwable th3 = th2;
                        arrayList2 = new ArrayList(az.Y(listC0, 10));
                        it = listC0.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(localSyncData.normalized((CompleteLocation) it.next()));
                        }
                        CompleteCollectionRoute completeCollectionRouteCopy = completeCollectionRoute.copy(collectionRouteRecordCopy$default, arrayList2);
                        gt2 gt2Var = t61Var.b;
                        map.put(strJ, t61Var.b(CompleteCollectionRoute.Companion.serializer(), completeCollectionRouteCopy));
                        th2 = th3;
                    }
                    th = th2;
                    arrayListB = localSyncData.settings.b();
                    size = arrayListB.size();
                    i2 = 0;
                    while (i2 < size) {
                        Object obj3 = arrayListB.get(i2);
                        i2++;
                        savedLocation = (SavedLocation) obj3;
                        t61 t61Var2 = localSyncData.json;
                        SavedLocation savedLocationCopy$default = SavedLocation.copy$default(savedLocation, null, 0.0d, 0.0d, null, null, null, null, null, null, 447, null);
                        gt2 gt2Var2 = t61Var2.b;
                        y81 y81VarSerializer = SavedLocation.Companion.serializer();
                        y81VarSerializer.getClass();
                        we2 we2Var = new we2();
                        arrayList = arrayListB;
                        new x71(t61Var2, new gm1(2, we2Var), 1).e(y81VarSerializer, savedLocationCopy$default);
                        obj2 = we2Var.e;
                        if (obj2 != null) {
                            o51.F("result");
                            throw th;
                        }
                        linkedHashMap2 = new LinkedHashMap(e71.e((JsonElement) obj2));
                        sourceLocationId = savedLocation.getSourceLocationId();
                        Map map10 = map3;
                        if (sourceLocationId != null || (sourceLocationSyncId = (String) linkedHashMap.get(new Long(sourceLocationId.longValue()))) == null) {
                            sourceLocationSyncId = savedLocation.getSourceLocationSyncId();
                        }
                        if (sourceLocationSyncId != null) {
                            linkedHashMap2.put("sourceLocationSyncId", e71.b(sourceLocationSyncId));
                        }
                        map.put(az2.j("favorite:", savedLocation.getSyncId()), new JsonObject(linkedHashMap2).toString());
                        arrayListB = arrayList;
                        map3 = map10;
                    }
                    map4 = map3;
                    SavedRouteDao savedRouteDao = localSyncData.routes;
                    this.L$0 = localSyncData;
                    this.L$1 = map4;
                    this.L$2 = map;
                    this.L$3 = th;
                    this.L$4 = th;
                    this.I$0 = i;
                    this.label = 3;
                    allSavedRoutesList = savedRouteDao.getAllSavedRoutesList(this);
                    if (allSavedRoutesList != z70Var) {
                        map5 = map4;
                        map6 = map;
                    }
                    return z70Var;
                }
                if (i3 != 3) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                map6 = (Map) this.L$2;
                map5 = (Map) this.L$1;
                LocalSyncData localSyncData4 = (LocalSyncData) this.L$0;
                ee0.J(obj);
                localSyncData = localSyncData4;
                allSavedRoutesList = obj;
            }
            for (SavedRouteEntity savedRouteEntity : (Iterable) allSavedRoutesList) {
                String strJ2 = az2.j("route:", savedRouteEntity.getSyncId());
                t61 t61Var3 = localSyncData.json;
                SavedRouteEntity savedRouteEntityCopy$default = SavedRouteEntity.copy$default(savedRouteEntity, 0L, null, null, 0L, null, 30, null);
                gt2 gt2Var3 = t61Var3.b;
                map6.put(strJ2, t61Var3.b(SavedRouteEntity.Companion.serializer(), savedRouteEntityCopy$default));
            }
            map5.getClass();
            return new TreeMap(((so1) map5).b());
            List<CompleteLocation> list = (List) allCompleteLocations;
            int iM = jq1.M(az.Y(list, 10));
            if (iM < 16) {
                iM = 16;
            }
            linkedHashMap = new LinkedHashMap(iM);
            for (CompleteLocation completeLocation : list) {
                linkedHashMap.put(new Long(completeLocation.getLocation().getId()), completeLocation.getLocation().getSyncId());
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj4 : list) {
                if (((CompleteLocation) obj4).getLocation().getCollectionRouteId() == null) {
                    arrayList3.add(obj4);
                }
            }
            int size2 = arrayList3.size();
            int i6 = 0;
            while (i6 < size2) {
                Object obj5 = arrayList3.get(i6);
                i6++;
                CompleteLocation completeLocation2 = (CompleteLocation) obj5;
                String strJ3 = az2.j("location:", completeLocation2.getLocation().getSyncId());
                t61 t61Var4 = localSyncData.json;
                CompleteLocation completeLocationNormalized = localSyncData.normalized(completeLocation2);
                gt2 gt2Var4 = t61Var4.b;
                map.put(strJ3, t61Var4.b(CompleteLocation.Companion.serializer(), completeLocationNormalized));
            }
            EnvironmentDao environmentDao2 = localSyncData.env;
            this.L$0 = localSyncData;
            this.L$1 = map2;
            this.L$2 = map;
            this.L$3 = null;
            this.L$4 = linkedHashMap;
            this.I$0 = i;
            this.label = 2;
            collectionRoutes = environmentDao2.getCollectionRoutes(this);
            if (collectionRoutes != z70Var) {
                map3 = map2;
                while (r1.hasNext()) {
                    String strJ4 = az2.j("collection:", completeCollectionRoute.getRoute().getSyncId());
                    t61 t61Var5 = localSyncData.json;
                    CollectionRouteRecord collectionRouteRecordCopy$default2 = CollectionRouteRecord.copy$default(completeCollectionRoute.getRoute(), 0L, null, null, null, 0.0d, 0L, null, 126, null);
                    List listC1 = zy.C0(completeCollectionRoute.getSamples(), new Comparator() { // from class: com.vincenthzr.locationspoofer.data.sync.LocalSyncData$capture$2$invokeSuspend$lambda$10$lambda$5$$inlined$sortedBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ym3.v(((CompleteLocation) t).getLocation().getSyncId(), ((CompleteLocation) t2).getLocation().getSyncId());
                        }
                    });
                    Throwable th4 = th2;
                    arrayList2 = new ArrayList(az.Y(listC1, 10));
                    it = listC1.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(localSyncData.normalized((CompleteLocation) it.next()));
                    }
                    CompleteCollectionRoute completeCollectionRouteCopy2 = completeCollectionRoute.copy(collectionRouteRecordCopy$default2, arrayList2);
                    gt2 gt2Var5 = t61Var5.b;
                    map.put(strJ4, t61Var5.b(CompleteCollectionRoute.Companion.serializer(), completeCollectionRouteCopy2));
                    th2 = th4;
                }
                th = th2;
                arrayListB = localSyncData.settings.b();
                size = arrayListB.size();
                i2 = 0;
                while (i2 < size) {
                    Object obj6 = arrayListB.get(i2);
                    i2++;
                    savedLocation = (SavedLocation) obj6;
                    t61 t61Var6 = localSyncData.json;
                    SavedLocation savedLocationCopy$default2 = SavedLocation.copy$default(savedLocation, null, 0.0d, 0.0d, null, null, null, null, null, null, 447, null);
                    gt2 gt2Var6 = t61Var6.b;
                    y81 y81VarSerializer2 = SavedLocation.Companion.serializer();
                    y81VarSerializer2.getClass();
                    we2 we2Var2 = new we2();
                    arrayList = arrayListB;
                    new x71(t61Var6, new gm1(2, we2Var2), 1).e(y81VarSerializer2, savedLocationCopy$default2);
                    obj2 = we2Var2.e;
                    if (obj2 != null) {
                        o51.F("result");
                        throw th;
                    }
                    linkedHashMap2 = new LinkedHashMap(e71.e((JsonElement) obj2));
                    sourceLocationId = savedLocation.getSourceLocationId();
                    Map map11 = map3;
                    if (sourceLocationId != null) {
                        sourceLocationSyncId = savedLocation.getSourceLocationSyncId();
                    } else {
                        sourceLocationSyncId = savedLocation.getSourceLocationSyncId();
                    }
                    if (sourceLocationSyncId != null) {
                        linkedHashMap2.put("sourceLocationSyncId", e71.b(sourceLocationSyncId));
                    }
                    map.put(az2.j("favorite:", savedLocation.getSyncId()), new JsonObject(linkedHashMap2).toString());
                    arrayListB = arrayList;
                    map3 = map11;
                }
                map4 = map3;
                SavedRouteDao savedRouteDao2 = localSyncData.routes;
                this.L$0 = localSyncData;
                this.L$1 = map4;
                this.L$2 = map;
                this.L$3 = th;
                this.L$4 = th;
                this.I$0 = i;
                this.label = 3;
                allSavedRoutesList = savedRouteDao2.getAllSavedRoutesList(this);
                if (allSavedRoutesList != z70Var) {
                    map5 = map4;
                    map6 = map;
                    while (r0.hasNext()) {
                        String strJ5 = az2.j("route:", savedRouteEntity.getSyncId());
                        t61 t61Var7 = localSyncData.json;
                        SavedRouteEntity savedRouteEntityCopy$default2 = SavedRouteEntity.copy$default(savedRouteEntity, 0L, null, null, 0L, null, 30, null);
                        gt2 gt2Var7 = t61Var7.b;
                        map6.put(strJ5, t61Var7.b(SavedRouteEntity.Companion.serializer(), savedRouteEntityCopy$default2));
                    }
                    map5.getClass();
                    return new TreeMap(((so1) map5).b());
                }
            }
            return z70Var;
        }
    }

    public LocalSyncData(tt2 tt2Var, AppDatabase appDatabase) {
        tt2Var.getClass();
        appDatabase.getClass();
        this.settings = tt2Var;
        this.database = appDatabase;
        this.json = ee0.d(new zs0(26));
        this.env = appDatabase.environmentDao();
        this.routes = appDatabase.savedRouteDao();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object apply$default(LocalSyncData localSyncData, Map map, Map map2, pu0 pu0Var, q60 q60Var, int i, Object obj) {
        if ((i & 2) != 0) {
            map2 = null;
        }
        if ((i & 4) != 0) {
            pu0Var = new v70(9, (byte) 0);
        }
        return localSyncData.apply(map, map2, pu0Var, q60Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 apply$lambda$20(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 json$lambda$0(y61 y61Var) {
        y61Var.getClass();
        y61Var.a = true;
        y61Var.c = true;
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CompleteLocation normalized(CompleteLocation completeLocation) {
        LocationRecord location = completeLocation.getLocation();
        LocationRecord locationRecordCopy = location.copy((510 & 1) != 0 ? location.id : 0L, (510 & 2) != 0 ? location.lat : 0.0d, (510 & 4) != 0 ? location.lng : 0.0d, (510 & 8) != 0 ? location.timestamp : 0L, (510 & 16) != 0 ? location.placeName : null, (510 & 32) != 0 ? location.remark : null, (510 & 64) != 0 ? location.selectedWifiBssid : null, (510 & WorkQueueKt.BUFFER_CAPACITY) != 0 ? location.selectedBluetoothAddress : null, (510 & 256) != 0 ? location.selectedCellKey : null, (510 & 512) != 0 ? location.collectionRouteId : null, (510 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? location.syncId : null);
        LocationConnectedWifi connectedWifi = completeLocation.getConnectedWifi();
        LocationConnectedWifi locationConnectedWifiCopy$default = connectedWifi != null ? LocationConnectedWifi.copy$default(connectedWifi, 0L, null, null, null, null, 0, 0, 0, null, 0, 0, 2046, null) : null;
        List<LocationWithWifi> listC0 = zy.C0(completeLocation.getWifis(), new Comparator() { // from class: com.vincenthzr.locationspoofer.data.sync.LocalSyncData$normalized$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ym3.v(((LocationWithWifi) t).getDevice().getBssid(), ((LocationWithWifi) t2).getDevice().getBssid());
            }
        });
        ArrayList arrayList = new ArrayList(az.Y(listC0, 10));
        for (LocationWithWifi locationWithWifi : listC0) {
            arrayList.add(LocationWithWifi.copy$default(locationWithWifi, LocationWifi.copy$default(locationWithWifi.getLocationWifi(), 0L, null, 0, 6, null), null, 2, null));
        }
        List<LocationWithCell> listC1 = zy.C0(completeLocation.getCells(), new Comparator() { // from class: com.vincenthzr.locationspoofer.data.sync.LocalSyncData$normalized$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ym3.v(((LocationWithCell) t).getDevice().getCellKey(), ((LocationWithCell) t2).getDevice().getCellKey());
            }
        });
        ArrayList arrayList2 = new ArrayList(az.Y(listC1, 10));
        for (LocationWithCell locationWithCell : listC1) {
            arrayList2.add(LocationWithCell.copy$default(locationWithCell, LocationCell.copy$default(locationWithCell.getLocationCell(), 0L, null, 0, false, 14, null), null, 2, null));
        }
        List<LocationWithBluetooth> listC2 = zy.C0(completeLocation.getBluetooths(), new Comparator() { // from class: com.vincenthzr.locationspoofer.data.sync.LocalSyncData$normalized$$inlined$sortedBy$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ym3.v(((LocationWithBluetooth) t).getDevice().getAddress(), ((LocationWithBluetooth) t2).getDevice().getAddress());
            }
        });
        ArrayList arrayList3 = new ArrayList(az.Y(listC2, 10));
        for (LocationWithBluetooth locationWithBluetooth : listC2) {
            arrayList3.add(LocationWithBluetooth.copy$default(locationWithBluetooth, LocationBluetooth.copy$default(locationWithBluetooth.getLocationBluetooth(), 0L, null, 0, 6, null), null, 2, null));
        }
        return completeLocation.copy(locationRecordCopy, locationConnectedWifiCopy$default, arrayList, arrayList3, arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0054  */
    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x0092  */
    /* JADX WARN: Code duplicated, block: B:37:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:? A[LOOP:0: B:30:0x008c->B:39:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:? A[LOOP:1: B:19:0x0058->B:42:?, LOOP_END, SYNTHETIC] */
    private final void validLocation(CompleteLocation completeLocation) {
        List<LocationWithCell> cells;
        List<LocationWithBluetooth> bluetooths;
        validPosition(completeLocation.getLocation().getLat(), completeLocation.getLocation().getLng());
        List<LocationWithWifi> wifis = completeLocation.getWifis();
        if (wifis != null && wifis.isEmpty()) {
            cells = completeLocation.getCells();
            if (cells == null) {
                for (LocationWithCell locationWithCell : cells) {
                    if (o51.f(locationWithCell.getDevice().getCellKey(), locationWithCell.getLocationCell().getCellKey())) {
                    }
                }
                bluetooths = completeLocation.getBluetooths();
                if (bluetooths == null) {
                }
                for (LocationWithBluetooth locationWithBluetooth : bluetooths) {
                    if (o51.f(locationWithBluetooth.getDevice().getAddress(), locationWithBluetooth.getLocationBluetooth().getAddress())) {
                    }
                }
                return;
            }
            while (r4.hasNext()) {
                if (o51.f(locationWithCell.getDevice().getCellKey(), locationWithCell.getLocationCell().getCellKey())) {
                }
            }
            bluetooths = completeLocation.getBluetooths();
            if (bluetooths == null) {
            }
            while (r4.hasNext()) {
                if (o51.f(locationWithBluetooth.getDevice().getAddress(), locationWithBluetooth.getLocationBluetooth().getAddress())) {
                }
            }
            return;
        }
        for (LocationWithWifi locationWithWifi : wifis) {
            if (o51.f(locationWithWifi.getDevice().getBssid(), locationWithWifi.getLocationWifi().getBssid())) {
            }
        }
        cells = completeLocation.getCells();
        if (cells == null && cells.isEmpty()) {
            bluetooths = completeLocation.getBluetooths();
            if (bluetooths == null) {
            }
            while (r4.hasNext()) {
                if (o51.f(locationWithBluetooth.getDevice().getAddress(), locationWithBluetooth.getLocationBluetooth().getAddress())) {
                }
            }
            return;
        }
        while (r4.hasNext()) {
            if (o51.f(locationWithCell.getDevice().getCellKey(), locationWithCell.getLocationCell().getCellKey())) {
            }
        }
        bluetooths = completeLocation.getBluetooths();
        if (bluetooths == null && bluetooths.isEmpty()) {
            return;
        }
        while (r4.hasNext()) {
            if (o51.f(locationWithBluetooth.getDevice().getAddress(), locationWithBluetooth.getLocationBluetooth().getAddress())) {
            }
        }
        return;
        fo.i("Failed requirement.");
    }

    private final void validPosition(double d, double d2) {
        if (Math.abs(d) > Double.MAX_VALUE || Math.abs(d2) > Double.MAX_VALUE || -90.0d > d || d > 90.0d || -180.0d > d2 || d2 > 180.0d) {
            fo.i("Failed requirement.");
        }
    }

    public final Object apply(Map<String, String> map, Map<String, String> map2, pu0 pu0Var, q60 q60Var) {
        AppDatabase appDatabase = this.database;
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(map2, map, pu0Var, null);
        return ji2.Y(q60Var, new y80(1, null, anonymousClass3, appDatabase), appDatabase);
    }

    public final Object capture(q60 q60Var) {
        AppDatabase appDatabase = this.database;
        return ji2.Y(q60Var, new y80(1, null, new AnonymousClass2(null), appDatabase), appDatabase);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00bd  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void validate(Map<String, String> map) {
        Long lValueOf;
        Object obj;
        Object obj2;
        map.getClass();
        if (map.size() > 10000) {
            fo.i("Failed requirement.");
            return;
        }
        Set setH0 = yo.H0(new String[]{"mock_wifi", "mock_cell", "mock_bluetooth", "enable_jitter", "restart_apps_on_spoof", "barometer_fluctuation", "fixed_joystick_enabled", "route_lateral_deviation", "use_gait_template", "keep_last_map_position", "force_location_enabled", "is_dark_mode", "is_language_set"});
        Set setH1 = yo.H0(new String[]{"altitude_variation_m", "realism_level", "speed_fluctuation_pct"});
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (true) {
            int i = 0;
            zIsString = false;
            zIsString = false;
            zIsString = false;
            boolean zIsString = false;
            if (!it.hasNext()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (s13.Z(entry.getKey(), "collection:", false)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Collection<String> collectionValues = linkedHashMap.values();
                ArrayList arrayList = new ArrayList();
                for (String str : collectionValues) {
                    t61 t61Var = this.json;
                    gt2 gt2Var = t61Var.b;
                    List<CompleteLocation> samples = ((CompleteCollectionRoute) t61Var.a(CompleteCollectionRoute.Companion.serializer(), str)).getSamples();
                    ArrayList arrayList2 = new ArrayList(az.Y(samples, 10));
                    Iterator<T> it2 = samples.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((CompleteLocation) it2.next()).getLocation().getSyncId());
                    }
                    fz.b0(arrayList, arrayList2);
                }
                if (zy.h0(arrayList).size() == arrayList.size()) {
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj3 = arrayList.get(i);
                        i++;
                        if (!map.containsKey("location:" + ((String) obj3))) {
                        }
                    }
                    return;
                }
                fo.i("Failed requirement.");
                return;
            }
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            String value = next.getValue();
            String strX0 = l13.x0(key, ':');
            String strZ0 = l13.z0(key, ':');
            switch (strZ0.hashCode()) {
                case -1741312354:
                    if (strZ0.equals("collection")) {
                        t61 t61Var2 = this.json;
                        gt2 gt2Var2 = t61Var2.b;
                        CompleteCollectionRoute completeCollectionRoute = (CompleteCollectionRoute) t61Var2.a(CompleteCollectionRoute.Companion.serializer(), value);
                        if (o51.f(completeCollectionRoute.getRoute().getSyncId(), strX0)) {
                            List<CompleteLocation> samples2 = completeCollectionRoute.getSamples();
                            ArrayList arrayList3 = new ArrayList(az.Y(samples2, 10));
                            Iterator<T> it3 = samples2.iterator();
                            while (it3.hasNext()) {
                                arrayList3.add(((CompleteLocation) it3.next()).getLocation().getSyncId());
                            }
                            if (zy.h0(arrayList3).size() == completeCollectionRoute.getSamples().size()) {
                                Iterator<T> it4 = completeCollectionRoute.getSamples().iterator();
                                while (it4.hasNext()) {
                                    validLocation((CompleteLocation) it4.next());
                                }
                                break;
                            }
                        }
                        fo.i("Failed requirement.");
                    } else {
                        fo.n("未知同步分类");
                    }
                    break;
                case 108704329:
                    if (strZ0.equals("route")) {
                        t61 t61Var3 = this.json;
                        gt2 gt2Var3 = t61Var3.b;
                        SavedRouteEntity savedRouteEntity = (SavedRouteEntity) t61Var3.a(SavedRouteEntity.Companion.serializer(), value);
                        if (o51.f(savedRouteEntity.getSyncId(), strX0)) {
                            for (JsonElement jsonElement : e71.d(this.json.c(savedRouteEntity.getPointsJson()))) {
                                validPosition(Double.parseDouble(e71.f((JsonElement) jq1.L("lat", e71.e(jsonElement))).getContent()), Double.parseDouble(e71.f((JsonElement) jq1.L("lng", e71.e(jsonElement))).getContent()));
                            }
                        } else {
                            fo.i("Failed requirement.");
                        }
                    } else {
                        fo.n("未知同步分类");
                    }
                    break;
                case 1050790300:
                    if (strZ0.equals("favorite")) {
                        t61 t61Var4 = this.json;
                        gt2 gt2Var4 = t61Var4.b;
                        SavedLocation savedLocation = (SavedLocation) t61Var4.a(SavedLocation.Companion.serializer(), value);
                        if (o51.f(savedLocation.getSyncId(), strX0)) {
                            validPosition(savedLocation.getLat(), savedLocation.getLng());
                        } else {
                            fo.i("Failed requirement.");
                        }
                    } else {
                        fo.n("未知同步分类");
                    }
                    break;
                case 1901043637:
                    if (strZ0.equals("location")) {
                        t61 t61Var5 = this.json;
                        gt2 gt2Var5 = t61Var5.b;
                        CompleteLocation completeLocation = (CompleteLocation) t61Var5.a(CompleteLocation.Companion.serializer(), value);
                        if (o51.f(completeLocation.getLocation().getSyncId(), strX0)) {
                            validLocation(completeLocation);
                        } else {
                            fo.i("Failed requirement.");
                        }
                    } else {
                        fo.n("未知同步分类");
                    }
                    break;
                case 1985941072:
                    if (!strZ0.equals("setting")) {
                        fo.n("未知同步分类");
                    } else if (tt2.c.contains(strX0)) {
                        JsonPrimitive jsonPrimitiveF = e71.f(this.json.c(value));
                        Object objValueOf = null;
                        if (setH0.contains(strX0)) {
                            if (!jsonPrimitiveF.isString()) {
                                String content = jsonPrimitiveF.getContent();
                                String[] strArr = i13.a;
                                content.getClass();
                                if (content.equalsIgnoreCase("true")) {
                                    obj2 = Boolean.TRUE;
                                } else if (content.equalsIgnoreCase("false")) {
                                    obj = Boolean.FALSE;
                                }
                                if (objValueOf != null) {
                                    objValueOf = obj;
                                    objValueOf = obj2;
                                    zIsString = true;
                                }
                            }
                        } else if (!setH1.contains(strX0)) {
                            zIsString = jsonPrimitiveF.isString();
                        } else if (!jsonPrimitiveF.isString()) {
                            try {
                                lValueOf = Long.valueOf(e71.h(jsonPrimitiveF));
                            } catch (c71 unused) {
                                lValueOf = null;
                            }
                            if (lValueOf != null) {
                                long jLongValue = lValueOf.longValue();
                                if (-2147483648L <= jLongValue && jLongValue <= 2147483647L) {
                                    objValueOf = Integer.valueOf((int) jLongValue);
                                }
                            }
                            if (objValueOf != null) {
                                objValueOf = obj;
                                objValueOf = obj2;
                                zIsString = true;
                            }
                        }
                        if (!zIsString) {
                            fo.i("Failed requirement.");
                        }
                    } else {
                        fo.i("Failed requirement.");
                    }
                    break;
                default:
                    fo.n("未知同步分类");
                    break;
            }
            return;
        }
    }
}
