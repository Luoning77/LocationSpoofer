package com.vincenthzr.locationspoofer.data.db;

import defpackage.b81;
import defpackage.ca0;
import defpackage.ee0;
import defpackage.fo;
import defpackage.o51;
import defpackage.q60;
import defpackage.r60;
import defpackage.s90;
import defpackage.vd0;
import defpackage.z60;
import defpackage.z70;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface EnvironmentDao {

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class DefaultImpls {
        @Deprecated
        public static Object findOrCreateCollectionLocation(EnvironmentDao environmentDao, double d, double d2, Long l, q60 q60Var) {
            return EnvironmentDao.super.findOrCreateCollectionLocation(d, d2, l, q60Var);
        }

        @Deprecated
        public static Object insertCompleteCollectionRoute(EnvironmentDao environmentDao, CompleteCollectionRoute completeCollectionRoute, q60 q60Var) {
            return EnvironmentDao.super.insertCompleteCollectionRoute(completeCollectionRoute, q60Var);
        }

        @Deprecated
        public static Object insertCompleteLocationData(EnvironmentDao environmentDao, CompleteLocation completeLocation, Long l, q60 q60Var) {
            return EnvironmentDao.super.insertCompleteLocationData(completeLocation, l, q60Var);
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.db.EnvironmentDao$findOrCreateCollectionLocation$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.db.EnvironmentDao", f = "EnvironmentDao.kt", l = {105, 114, 117}, m = "findOrCreateCollectionLocation$suspendImpl")
    public static final class AnonymousClass1 extends r60 {
        double D$0;
        double D$1;
        double D$2;
        double D$3;
        double D$4;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EnvironmentDao.findOrCreateCollectionLocation$suspendImpl(EnvironmentDao.this, 0.0d, 0.0d, null, this);
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.db.EnvironmentDao$insertCompleteCollectionRoute$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.db.EnvironmentDao", f = "EnvironmentDao.kt", l = {152, 153}, m = "insertCompleteCollectionRoute$suspendImpl")
    public static final class C00731 extends r60 {
        int I$0;
        int I$1;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C00731(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EnvironmentDao.insertCompleteCollectionRoute$suspendImpl(EnvironmentDao.this, null, this);
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.db.EnvironmentDao$insertCompleteLocationData$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.db.EnvironmentDao", f = "EnvironmentDao.kt", l = {143, 144, 145, 145, 146, 146, 147, 147}, m = "insertCompleteLocationData$suspendImpl")
    public static final class C00741 extends r60 {
        int I$0;
        int I$1;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public C00741(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EnvironmentDao.insertCompleteLocationData$suspendImpl(EnvironmentDao.this, null, null, this);
        }
    }

    static /* synthetic */ Object findLocationByCoordinates$default(EnvironmentDao environmentDao, double d, double d2, double d3, q60 q60Var, int i, Object obj) {
        if (obj == null) {
            return environmentDao.findLocationByCoordinates(d, d2, (i & 4) != 0 ? 1.0E-4d : d3, q60Var);
        }
        b81.s("Super calls with default arguments not supported in this target, function: findLocationByCoordinates");
        return null;
    }

    static /* synthetic */ Object findOrCreateCollectionLocation$default(EnvironmentDao environmentDao, double d, double d2, Long l, q60 q60Var, int i, Object obj) {
        if (obj != null) {
            b81.s("Super calls with default arguments not supported in this target, function: findOrCreateCollectionLocation");
            return null;
        }
        if ((i & 4) != 0) {
            l = null;
        }
        return environmentDao.findOrCreateCollectionLocation(d, d2, l, q60Var);
    }

    private static double findOrCreateCollectionLocation$normalizeLongitude(double d) {
        return ((((d + 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    static Object findOrCreateCollectionLocation$suspendImpl(EnvironmentDao environmentDao, double d, double d2, Long l, q60 q60Var) {
        AnonymousClass1 anonymousClass1;
        z70 z70Var;
        EnvironmentDao environmentDao2;
        Long l2;
        Object obj;
        double d3;
        double d4;
        double d5;
        Object next;
        double d6;
        LocationRecord locationRecord;
        double d7 = d;
        double d8 = d2;
        if (q60Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) q60Var;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = environmentDao.new AnonymousClass1(q60Var);
            }
        } else {
            anonymousClass1 = environmentDao.new AnonymousClass1(q60Var);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object obj2 = anonymousClass2.result;
        int i2 = anonymousClass2.label;
        z70 z70Var2 = z70.e;
        if (i2 != 0) {
            if (i2 == 1) {
                double d9 = anonymousClass2.D$4;
                double d10 = anonymousClass2.D$3;
                double d11 = anonymousClass2.D$2;
                double d12 = anonymousClass2.D$1;
                double d13 = anonymousClass2.D$0;
                l2 = (Long) anonymousClass2.L$1;
                environmentDao2 = (EnvironmentDao) anonymousClass2.L$0;
                ee0.J(obj2);
                z70Var = z70Var2;
                d3 = d9;
                d7 = d13;
                obj = obj2;
                d5 = d11;
                d4 = d10;
                d8 = d12;
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ee0.J(obj2);
                    return obj2;
                }
                locationRecord = (LocationRecord) anonymousClass2.L$4;
                ee0.J(obj2);
            }
            return new Long(locationRecord.getId());
        }
        ee0.J(obj2);
        double dMax = 1.818181818181818E-4d / Math.max(1.0E-6d, Math.abs(Math.cos(Math.toRadians(d7))));
        double d14 = d7 - 1.818181818181818E-4d;
        double d15 = d7 + 1.818181818181818E-4d;
        double dFindOrCreateCollectionLocation$normalizeLongitude = dMax >= 180.0d ? -180.0d : findOrCreateCollectionLocation$normalizeLongitude(d8 - dMax);
        double dFindOrCreateCollectionLocation$normalizeLongitude2 = dMax < 180.0d ? findOrCreateCollectionLocation$normalizeLongitude(d8 + dMax) : 180.0d;
        anonymousClass2.L$0 = environmentDao;
        anonymousClass2.L$1 = l;
        anonymousClass2.D$0 = d7;
        anonymousClass2.D$1 = d8;
        anonymousClass2.D$2 = 20.0d;
        anonymousClass2.D$3 = 1.818181818181818E-4d;
        anonymousClass2.D$4 = dMax;
        anonymousClass2.label = 1;
        z70Var = z70Var2;
        Object locationsInBounds = environmentDao.getLocationsInBounds(d14, d15, dFindOrCreateCollectionLocation$normalizeLongitude, dFindOrCreateCollectionLocation$normalizeLongitude2, anonymousClass2);
        if (locationsInBounds == z70Var) {
            return z70Var;
        }
        environmentDao2 = environmentDao;
        l2 = l;
        obj = locationsInBounds;
        d3 = dMax;
        d4 = 1.818181818181818E-4d;
        d5 = 20.0d;
        z60 z60Var = new z60(d7, d8);
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : (List) obj) {
            EnvironmentDao environmentDao3 = environmentDao2;
            z70 z70Var3 = z70Var;
            if (o51.f(((LocationRecord) obj3).getCollectionRouteId(), l2)) {
                arrayList.add(obj3);
            }
            environmentDao2 = environmentDao3;
            z70Var = z70Var3;
        }
        EnvironmentDao environmentDao4 = environmentDao2;
        z70 z70Var4 = z70Var;
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                LocationRecord locationRecord2 = (LocationRecord) next;
                double dO = vd0.o(z60Var, new z60(locationRecord2.getLat(), locationRecord2.getLng()));
                Object obj4 = next;
                while (true) {
                    Object next2 = it.next();
                    LocationRecord locationRecord3 = (LocationRecord) next2;
                    Object obj5 = obj4;
                    d6 = d4;
                    double dO2 = vd0.o(z60Var, new z60(locationRecord3.getLat(), locationRecord3.getLng()));
                    if (Double.compare(dO, dO2) > 0) {
                        dO = dO2;
                        obj4 = next2;
                    } else {
                        obj4 = obj5;
                    }
                    if (!it.hasNext()) {
                        break;
                    }
                    d7 = d7;
                    d4 = d6;
                    d8 = d8;
                }
                next = obj4;
            } else {
                d6 = d4;
            }
        } else {
            d6 = d4;
            next = null;
        }
        locationRecord = (LocationRecord) next;
        if (locationRecord == null || vd0.o(z60Var, new z60(locationRecord.getLat(), locationRecord.getLng())) > d5 + 1.0E-6d) {
            double d16 = d7;
            double d17 = d8;
            LocationRecord locationRecord4 = new LocationRecord(0L, d16, d17, 0L, (String) null, (String) null, (String) null, (String) null, (String) null, l2, (String) null, 1529, (ca0) null);
            anonymousClass2.L$0 = null;
            anonymousClass2.L$1 = null;
            anonymousClass2.L$2 = null;
            anonymousClass2.L$3 = null;
            anonymousClass2.L$4 = null;
            anonymousClass2.D$0 = d16;
            anonymousClass2.D$1 = d17;
            anonymousClass2.D$2 = d5;
            anonymousClass2.D$3 = d6;
            anonymousClass2.D$4 = d3;
            anonymousClass2.label = 3;
            Object objInsertLocation = environmentDao4.insertLocation(locationRecord4, anonymousClass2);
            return objInsertLocation == z70Var4 ? z70Var4 : objInsertLocation;
        }
        long id = locationRecord.getId();
        long jCurrentTimeMillis = System.currentTimeMillis();
        anonymousClass2.L$0 = null;
        anonymousClass2.L$1 = null;
        anonymousClass2.L$2 = null;
        anonymousClass2.L$3 = null;
        anonymousClass2.L$4 = locationRecord;
        anonymousClass2.D$0 = d7;
        anonymousClass2.D$1 = d8;
        anonymousClass2.D$2 = d5;
        anonymousClass2.D$3 = d6;
        anonymousClass2.D$4 = d3;
        anonymousClass2.label = 2;
        if (environmentDao4.updateCollectionTimestamp(id, jCurrentTimeMillis, anonymousClass2) == z70Var4) {
            return z70Var4;
        }
        return new Long(locationRecord.getId());
    }

    static /* synthetic */ Object getCompleteLocationsInBounds$default(EnvironmentDao environmentDao, double d, double d2, double d3, double d4, int i, q60 q60Var, int i2, Object obj) {
        if (obj == null) {
            return environmentDao.getCompleteLocationsInBounds(d, d2, d3, d4, (i2 & 16) != 0 ? 10 : i, q60Var);
        }
        b81.s("Super calls with default arguments not supported in this target, function: getCompleteLocationsInBounds");
        return null;
    }

    static /* synthetic */ Object getNearestLocations$default(EnvironmentDao environmentDao, double d, double d2, int i, q60 q60Var, int i2, Object obj) {
        if (obj != null) {
            b81.s("Super calls with default arguments not supported in this target, function: getNearestLocations");
            return null;
        }
        if ((i2 & 4) != 0) {
            i = 3;
        }
        return environmentDao.getNearestLocations(d, d2, i, q60Var);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:? A[LOOP:0: B:20:0x00a2->B:30:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008e, code lost:
    
        if (r1 == r8) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object insertCompleteCollectionRoute$suspendImpl(com.vincenthzr.locationspoofer.data.db.EnvironmentDao r23, com.vincenthzr.locationspoofer.data.db.CompleteCollectionRoute r24, defpackage.q60 r25) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vincenthzr.locationspoofer.data.db.EnvironmentDao.insertCompleteCollectionRoute$suspendImpl(com.vincenthzr.locationspoofer.data.db.EnvironmentDao, com.vincenthzr.locationspoofer.data.db.CompleteCollectionRoute, q60):java.lang.Object");
    }

    static /* synthetic */ Object insertCompleteLocationData$default(EnvironmentDao environmentDao, CompleteLocation completeLocation, Long l, q60 q60Var, int i, Object obj) {
        if (obj != null) {
            b81.s("Super calls with default arguments not supported in this target, function: insertCompleteLocationData");
            return null;
        }
        if ((i & 2) != 0) {
            l = null;
        }
        return environmentDao.insertCompleteLocationData(completeLocation, l, q60Var);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:40:0x0200  */
    /* JADX WARN: Code duplicated, block: B:44:0x0232  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0232 -> B:35:0x01d1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x02a8 -> B:56:0x02ad). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x031c -> B:13:0x004d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    static java.lang.Object insertCompleteLocationData$suspendImpl(com.vincenthzr.locationspoofer.data.db.EnvironmentDao r26, com.vincenthzr.locationspoofer.data.db.CompleteLocation r27, java.lang.Long r28, defpackage.q60 r29) {
        /*
            Method dump skipped, instruction units count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vincenthzr.locationspoofer.data.db.EnvironmentDao.insertCompleteLocationData$suspendImpl(com.vincenthzr.locationspoofer.data.db.EnvironmentDao, com.vincenthzr.locationspoofer.data.db.CompleteLocation, java.lang.Long, q60):java.lang.Object");
    }

    Object clearAll(q60 q60Var);

    Object clearCollectionRoutes(q60 q60Var);

    Object clearSyncBluetooth(long j, q60 q60Var);

    Object clearSyncCells(long j, q60 q60Var);

    Object clearSyncWifi(long j, q60 q60Var);

    Object deleteCollectionRoute(long j, q60 q60Var);

    Object deleteConnectedWifi(long j, q60 q60Var);

    Object deleteLocation(long j, q60 q60Var);

    Object deleteLocationBluetooth(long j, String str, q60 q60Var);

    Object deleteLocationCell(long j, String str, q60 q60Var);

    Object deleteLocationWifi(long j, String str, q60 q60Var);

    Object deleteLocations(List<Long> list, q60 q60Var);

    Object findLocationByCoordinates(double d, double d2, double d3, q60 q60Var);

    default Object findOrCreateCollectionLocation(double d, double d2, Long l, q60 q60Var) {
        return findOrCreateCollectionLocation$suspendImpl(this, d, d2, l, q60Var);
    }

    Object getAllCompleteLocations(q60 q60Var);

    Object getAllLocations(q60 q60Var);

    Object getCollectionRoute(long j, q60 q60Var);

    Object getCollectionRoutes(q60 q60Var);

    Object getCompleteLocationById(long j, q60 q60Var);

    Object getCompleteLocationsInBounds(double d, double d2, double d3, double d4, int i, q60 q60Var);

    Object getLocationsInBounds(double d, double d2, double d3, double d4, q60 q60Var);

    Object getNearestLocations(double d, double d2, int i, q60 q60Var);

    Object getRecordCount(q60 q60Var);

    Object insertBluetoothDevice(BluetoothDevice bluetoothDevice, q60 q60Var);

    Object insertCellDevice(CellDevice cellDevice, q60 q60Var);

    Object insertCollectionRoute(CollectionRouteRecord collectionRouteRecord, q60 q60Var);

    default Object insertCompleteCollectionRoute(CompleteCollectionRoute completeCollectionRoute, q60 q60Var) {
        return insertCompleteCollectionRoute$suspendImpl(this, completeCollectionRoute, q60Var);
    }

    default Object insertCompleteLocationData(CompleteLocation completeLocation, Long l, q60 q60Var) {
        return insertCompleteLocationData$suspendImpl(this, completeLocation, l, q60Var);
    }

    Object insertConnectedWifi(LocationConnectedWifi locationConnectedWifi, q60 q60Var);

    Object insertLocation(LocationRecord locationRecord, q60 q60Var);

    Object insertLocationBluetooth(LocationBluetooth locationBluetooth, q60 q60Var);

    Object insertLocationCell(LocationCell locationCell, q60 q60Var);

    Object insertLocationWifi(LocationWifi locationWifi, q60 q60Var);

    Object insertWifiDevice(WifiDevice wifiDevice, q60 q60Var);

    Flow<List<CompleteLocation>> observeAllCompleteLocations();

    Flow<List<CompleteCollectionRoute>> observeCollectionRoutes();

    Object updateBasicInfo(long j, String str, String str2, q60 q60Var);

    Object updateCollectionRouteInfo(long j, String str, String str2, q60 q60Var);

    Object updateCollectionTimestamp(long j, long j2, q60 q60Var);

    Object updateCoordinates(long j, double d, double d2, q60 q60Var);

    Object updateMetadata(long j, double d, double d2, String str, String str2, String str3, String str4, String str5, q60 q60Var);

    Object updateSelectedBluetooth(long j, String str, q60 q60Var);

    Object updateSelectedCell(long j, String str, q60 q60Var);

    Object updateSelectedWifi(long j, String str, q60 q60Var);

    Object updateSyncCollectionRoute(CollectionRouteRecord collectionRouteRecord, q60 q60Var);

    Object updateSyncLocation(LocationRecord locationRecord, q60 q60Var);
}
