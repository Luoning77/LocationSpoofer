package com.vincenthzr.locationspoofer.data.db;

import com.vincenthzr.locationspoofer.data.model.SavedLocation;
import com.vincenthzr.locationspoofer.data.model.SavedLocation$$serializer;
import defpackage.bt2;
import defpackage.ca0;
import defpackage.ce1;
import defpackage.eg1;
import defpackage.ht2;
import defpackage.ig0;
import defpackage.k13;
import defpackage.m30;
import defpackage.o51;
import defpackage.oi1;
import defpackage.oo;
import defpackage.p91;
import defpackage.qe0;
import defpackage.uj0;
import defpackage.vj0;
import defpackage.y81;
import defpackage.zb1;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class LocationSpooferDataPackage {
    private static final zb1[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private final Map<String, String> appCoordinateSystems;
    private final String appVersion;
    private final List<CompleteCollectionRoute> collectionRoutes;
    private final long exportTimestamp;
    private final List<CompleteLocation> locations;
    private final List<SavedLocation> savedLocations;
    private final List<SavedRouteEntity> savedRoutes;
    private final ExportedSettings settings;
    private final int version;

    static {
        qe0 qe0Var = new qe0(28);
        ce1 ce1Var = ce1.f;
        $childSerializers = new zb1[]{null, null, null, ig0.A(ce1Var, qe0Var), ig0.A(ce1Var, new qe0(29)), ig0.A(ce1Var, new oi1(0)), ig0.A(ce1Var, new oi1(1)), ig0.A(ce1Var, new oi1(2)), null};
    }

    public /* synthetic */ LocationSpooferDataPackage(int i, int i2, long j, String str, List list, List list2, List list3, List list4, Map map, ExportedSettings exportedSettings, ht2 ht2Var) {
        this.version = (i & 1) == 0 ? 4 : i2;
        if ((i & 2) == 0) {
            this.exportTimestamp = System.currentTimeMillis();
        } else {
            this.exportTimestamp = j;
        }
        if ((i & 4) == 0) {
            this.appVersion = "2.0.0";
        } else {
            this.appVersion = str;
        }
        int i3 = i & 8;
        uj0 uj0Var = uj0.e;
        if (i3 == 0) {
            this.locations = uj0Var;
        } else {
            this.locations = list;
        }
        if ((i & 16) == 0) {
            this.collectionRoutes = uj0Var;
        } else {
            this.collectionRoutes = list2;
        }
        if ((i & 32) == 0) {
            this.savedLocations = uj0Var;
        } else {
            this.savedLocations = list3;
        }
        if ((i & 64) == 0) {
            this.savedRoutes = uj0Var;
        } else {
            this.savedRoutes = list4;
        }
        if ((i & WorkQueueKt.BUFFER_CAPACITY) == 0) {
            this.appCoordinateSystems = vj0.e;
        } else {
            this.appCoordinateSystems = map;
        }
        if ((i & 256) == 0) {
            this.settings = null;
        } else {
            this.settings = exportedSettings;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ y81 _childSerializers$_anonymous_() {
        return new oo(CompleteLocation$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ y81 _childSerializers$_anonymous_$0() {
        return new oo(CompleteCollectionRoute$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ y81 _childSerializers$_anonymous_$1() {
        return new oo(SavedLocation$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ y81 _childSerializers$_anonymous_$2() {
        return new oo(SavedRouteEntity$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ y81 _childSerializers$_anonymous_$3() {
        return new eg1(k13.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LocationSpooferDataPackage copy$default(LocationSpooferDataPackage locationSpooferDataPackage, int i, long j, String str, List list, List list2, List list3, List list4, Map map, ExportedSettings exportedSettings, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = locationSpooferDataPackage.version;
        }
        if ((i2 & 2) != 0) {
            j = locationSpooferDataPackage.exportTimestamp;
        }
        if ((i2 & 4) != 0) {
            str = locationSpooferDataPackage.appVersion;
        }
        if ((i2 & 8) != 0) {
            list = locationSpooferDataPackage.locations;
        }
        if ((i2 & 16) != 0) {
            list2 = locationSpooferDataPackage.collectionRoutes;
        }
        if ((i2 & 32) != 0) {
            list3 = locationSpooferDataPackage.savedLocations;
        }
        if ((i2 & 64) != 0) {
            list4 = locationSpooferDataPackage.savedRoutes;
        }
        if ((i2 & WorkQueueKt.BUFFER_CAPACITY) != 0) {
            map = locationSpooferDataPackage.appCoordinateSystems;
        }
        if ((i2 & 256) != 0) {
            exportedSettings = locationSpooferDataPackage.settings;
        }
        Map map2 = map;
        ExportedSettings exportedSettings2 = exportedSettings;
        List list5 = list4;
        List list6 = list2;
        String str2 = str;
        return locationSpooferDataPackage.copy(i, j, str2, list, list6, list3, list5, map2, exportedSettings2);
    }

    public static final /* synthetic */ void write$Self$core_data_globalRelease(LocationSpooferDataPackage locationSpooferDataPackage, m30 m30Var, bt2 bt2Var) {
        zb1[] zb1VarArr = $childSerializers;
        if (m30Var.d(bt2Var) || locationSpooferDataPackage.version != 4) {
            m30Var.i(0, locationSpooferDataPackage.version, bt2Var);
        }
        if (m30Var.d(bt2Var) || locationSpooferDataPackage.exportTimestamp != System.currentTimeMillis()) {
            m30Var.j(bt2Var, 1, locationSpooferDataPackage.exportTimestamp);
        }
        if (m30Var.d(bt2Var) || !o51.f(locationSpooferDataPackage.appVersion, "2.0.0")) {
            m30Var.n(bt2Var, 2, locationSpooferDataPackage.appVersion);
        }
        boolean zD = m30Var.d(bt2Var);
        uj0 uj0Var = uj0.e;
        if (zD || !o51.f(locationSpooferDataPackage.locations, uj0Var)) {
            m30Var.r(bt2Var, 3, (y81) zb1VarArr[3].getValue(), locationSpooferDataPackage.locations);
        }
        if (m30Var.d(bt2Var) || !o51.f(locationSpooferDataPackage.collectionRoutes, uj0Var)) {
            m30Var.r(bt2Var, 4, (y81) zb1VarArr[4].getValue(), locationSpooferDataPackage.collectionRoutes);
        }
        if (m30Var.d(bt2Var) || !o51.f(locationSpooferDataPackage.savedLocations, uj0Var)) {
            m30Var.r(bt2Var, 5, (y81) zb1VarArr[5].getValue(), locationSpooferDataPackage.savedLocations);
        }
        if (m30Var.d(bt2Var) || !o51.f(locationSpooferDataPackage.savedRoutes, uj0Var)) {
            m30Var.r(bt2Var, 6, (y81) zb1VarArr[6].getValue(), locationSpooferDataPackage.savedRoutes);
        }
        if (m30Var.d(bt2Var) || !o51.f(locationSpooferDataPackage.appCoordinateSystems, vj0.e)) {
            m30Var.r(bt2Var, 7, (y81) zb1VarArr[7].getValue(), locationSpooferDataPackage.appCoordinateSystems);
        }
        if (!m30Var.d(bt2Var) && locationSpooferDataPackage.settings == null) {
            return;
        }
        m30Var.u(bt2Var, 8, ExportedSettings$$serializer.INSTANCE, locationSpooferDataPackage.settings);
    }

    public final int component1() {
        return this.version;
    }

    public final long component2() {
        return this.exportTimestamp;
    }

    public final String component3() {
        return this.appVersion;
    }

    public final List<CompleteLocation> component4() {
        return this.locations;
    }

    public final List<CompleteCollectionRoute> component5() {
        return this.collectionRoutes;
    }

    public final List<SavedLocation> component6() {
        return this.savedLocations;
    }

    public final List<SavedRouteEntity> component7() {
        return this.savedRoutes;
    }

    public final Map<String, String> component8() {
        return this.appCoordinateSystems;
    }

    public final ExportedSettings component9() {
        return this.settings;
    }

    public final LocationSpooferDataPackage copy(int i, long j, String str, List<CompleteLocation> list, List<CompleteCollectionRoute> list2, List<SavedLocation> list3, List<SavedRouteEntity> list4, Map<String, String> map, ExportedSettings exportedSettings) {
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        map.getClass();
        return new LocationSpooferDataPackage(i, j, str, list, list2, list3, list4, map, exportedSettings);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationSpooferDataPackage)) {
            return false;
        }
        LocationSpooferDataPackage locationSpooferDataPackage = (LocationSpooferDataPackage) obj;
        return this.version == locationSpooferDataPackage.version && this.exportTimestamp == locationSpooferDataPackage.exportTimestamp && o51.f(this.appVersion, locationSpooferDataPackage.appVersion) && o51.f(this.locations, locationSpooferDataPackage.locations) && o51.f(this.collectionRoutes, locationSpooferDataPackage.collectionRoutes) && o51.f(this.savedLocations, locationSpooferDataPackage.savedLocations) && o51.f(this.savedRoutes, locationSpooferDataPackage.savedRoutes) && o51.f(this.appCoordinateSystems, locationSpooferDataPackage.appCoordinateSystems) && o51.f(this.settings, locationSpooferDataPackage.settings);
    }

    public final Map<String, String> getAppCoordinateSystems() {
        return this.appCoordinateSystems;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final List<CompleteCollectionRoute> getCollectionRoutes() {
        return this.collectionRoutes;
    }

    public final long getExportTimestamp() {
        return this.exportTimestamp;
    }

    public final List<CompleteLocation> getLocations() {
        return this.locations;
    }

    public final List<SavedLocation> getSavedLocations() {
        return this.savedLocations;
    }

    public final List<SavedRouteEntity> getSavedRoutes() {
        return this.savedRoutes;
    }

    public final ExportedSettings getSettings() {
        return this.settings;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = (this.appCoordinateSystems.hashCode() + p91.g(this.savedRoutes, p91.g(this.savedLocations, p91.g(this.collectionRoutes, p91.g(this.locations, p91.d(p91.c(Integer.hashCode(this.version) * 31, 31, this.exportTimestamp), 31, this.appVersion), 31), 31), 31), 31)) * 31;
        ExportedSettings exportedSettings = this.settings;
        return iHashCode + (exportedSettings == null ? 0 : exportedSettings.hashCode());
    }

    public String toString() {
        return "LocationSpooferDataPackage(version=" + this.version + ", exportTimestamp=" + this.exportTimestamp + ", appVersion=" + this.appVersion + ", locations=" + this.locations + ", collectionRoutes=" + this.collectionRoutes + ", savedLocations=" + this.savedLocations + ", savedRoutes=" + this.savedRoutes + ", appCoordinateSystems=" + this.appCoordinateSystems + ", settings=" + this.settings + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        private Companion() {
        }

        public final y81 serializer() {
            return LocationSpooferDataPackage$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }
    }

    public LocationSpooferDataPackage() {
        this(0, 0L, (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (ExportedSettings) null, 511, (ca0) null);
    }

    public LocationSpooferDataPackage(int i, long j, String str, List<CompleteLocation> list, List<CompleteCollectionRoute> list2, List<SavedLocation> list3, List<SavedRouteEntity> list4, Map<String, String> map, ExportedSettings exportedSettings) {
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        map.getClass();
        this.version = i;
        this.exportTimestamp = j;
        this.appVersion = str;
        this.locations = list;
        this.collectionRoutes = list2;
        this.savedLocations = list3;
        this.savedRoutes = list4;
        this.appCoordinateSystems = map;
        this.settings = exportedSettings;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LocationSpooferDataPackage(int i, long j, String str, List list, List list2, List list3, List list4, Map map, ExportedSettings exportedSettings, int i2, ca0 ca0Var) {
        i = (i2 & 1) != 0 ? 4 : i;
        j = (i2 & 2) != 0 ? System.currentTimeMillis() : j;
        str = (i2 & 4) != 0 ? "2.0.0" : str;
        int i3 = i2 & 8;
        uj0 uj0Var = uj0.e;
        this(i, j, str, i3 != 0 ? uj0Var : list, (i2 & 16) != 0 ? uj0Var : list2, (i2 & 32) != 0 ? uj0Var : list3, (i2 & 64) != 0 ? uj0Var : list4, (i2 & WorkQueueKt.BUFFER_CAPACITY) != 0 ? vj0.e : map, (i2 & 256) != 0 ? null : exportedSettings);
    }
}
