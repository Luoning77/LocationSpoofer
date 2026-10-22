package defpackage;

import android.net.Uri;
import com.vincenthzr.locationspoofer.data.db.CompleteLocation;
import com.vincenthzr.locationspoofer.data.db.EnvironmentDao;
import com.vincenthzr.locationspoofer.data.db.ExportedSettings;
import com.vincenthzr.locationspoofer.data.db.LocationSpooferDataPackage;
import com.vincenthzr.locationspoofer.data.model.ImportExportSelection;
import com.vincenthzr.locationspoofer.data.model.SavedLocation;
import com.vincenthzr.locationspoofer.data.repository.LocationRepository;
import com.vincenthzr.locationspoofer.data.repository.SettingsRepository;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class em1 extends k33 implements pu0 {
    public List e;
    public List f;
    public List g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ ImportExportSelection j;
    public final /* synthetic */ ul1 k;
    public final /* synthetic */ Uri l;
    public final /* synthetic */ lu0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em1(ImportExportSelection importExportSelection, ul1 ul1Var, Uri uri, lu0 lu0Var, q60 q60Var) {
        super(2, q60Var);
        this.j = importExportSelection;
        this.k = ul1Var;
        this.l = uri;
        this.m = lu0Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        em1 em1Var = new em1(this.j, this.k, this.l, this.m, q60Var);
        em1Var.i = obj;
        return em1Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((em1) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008d A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:8:0x0027, B:49:0x00c8, B:52:0x00d7, B:54:0x00dd, B:57:0x00e9, B:59:0x00ef, B:61:0x0126, B:69:0x0176, B:78:0x0183, B:75:0x017e, B:76:0x0181, B:65:0x0160, B:56:0x00e6, B:15:0x003b, B:37:0x009c, B:39:0x00a0, B:41:0x00a6, B:43:0x00ae, B:45:0x00b4, B:16:0x0041, B:24:0x005e, B:25:0x0069, B:27:0x006f, B:29:0x0080, B:32:0x0087, B:34:0x008d, B:19:0x004a, B:21:0x0050, B:62:0x0151, B:68:0x0170, B:73:0x017c), top: B:83:0x0019, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x009b  */
    /* JADX WARN: Code duplicated, block: B:37:0x009c A[Catch: Exception -> 0x0030, PHI: r2 r13
      0x009c: PHI (r2v12 java.util.List<com.vincenthzr.locationspoofer.data.model.SavedLocation>) = 
      (r2v6 java.util.List<com.vincenthzr.locationspoofer.data.model.SavedLocation>)
      (r2v24 java.util.List<com.vincenthzr.locationspoofer.data.model.SavedLocation>)
     binds: [B:35:0x0099, B:15:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x009c: PHI (r13v6 java.lang.Object) = (r13v3 java.lang.Object), (r13v9 java.lang.Object) binds: [B:35:0x0099, B:15:0x003b] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0030, blocks: (B:8:0x0027, B:49:0x00c8, B:52:0x00d7, B:54:0x00dd, B:57:0x00e9, B:59:0x00ef, B:61:0x0126, B:69:0x0176, B:78:0x0183, B:75:0x017e, B:76:0x0181, B:65:0x0160, B:56:0x00e6, B:15:0x003b, B:37:0x009c, B:39:0x00a0, B:41:0x00a6, B:43:0x00ae, B:45:0x00b4, B:16:0x0041, B:24:0x005e, B:25:0x0069, B:27:0x006f, B:29:0x0080, B:32:0x0087, B:34:0x008d, B:19:0x004a, B:21:0x0050, B:62:0x0151, B:68:0x0170, B:73:0x017c), top: B:83:0x0019, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x009f  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a6 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:8:0x0027, B:49:0x00c8, B:52:0x00d7, B:54:0x00dd, B:57:0x00e9, B:59:0x00ef, B:61:0x0126, B:69:0x0176, B:78:0x0183, B:75:0x017e, B:76:0x0181, B:65:0x0160, B:56:0x00e6, B:15:0x003b, B:37:0x009c, B:39:0x00a0, B:41:0x00a6, B:43:0x00ae, B:45:0x00b4, B:16:0x0041, B:24:0x005e, B:25:0x0069, B:27:0x006f, B:29:0x0080, B:32:0x0087, B:34:0x008d, B:19:0x004a, B:21:0x0050, B:62:0x0151, B:68:0x0170, B:73:0x017c), top: B:83:0x0019, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b4 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:8:0x0027, B:49:0x00c8, B:52:0x00d7, B:54:0x00dd, B:57:0x00e9, B:59:0x00ef, B:61:0x0126, B:69:0x0176, B:78:0x0183, B:75:0x017e, B:76:0x0181, B:65:0x0160, B:56:0x00e6, B:15:0x003b, B:37:0x009c, B:39:0x00a0, B:41:0x00a6, B:43:0x00ae, B:45:0x00b4, B:16:0x0041, B:24:0x005e, B:25:0x0069, B:27:0x006f, B:29:0x0080, B:32:0x0087, B:34:0x008d, B:19:0x004a, B:21:0x0050, B:62:0x0151, B:68:0x0170, B:73:0x017c), top: B:83:0x0019, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00dd A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:8:0x0027, B:49:0x00c8, B:52:0x00d7, B:54:0x00dd, B:57:0x00e9, B:59:0x00ef, B:61:0x0126, B:69:0x0176, B:78:0x0183, B:75:0x017e, B:76:0x0181, B:65:0x0160, B:56:0x00e6, B:15:0x003b, B:37:0x009c, B:39:0x00a0, B:41:0x00a6, B:43:0x00ae, B:45:0x00b4, B:16:0x0041, B:24:0x005e, B:25:0x0069, B:27:0x006f, B:29:0x0080, B:32:0x0087, B:34:0x008d, B:19:0x004a, B:21:0x0050, B:62:0x0151, B:68:0x0170, B:73:0x017c), top: B:83:0x0019, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:8:0x0027, B:49:0x00c8, B:52:0x00d7, B:54:0x00dd, B:57:0x00e9, B:59:0x00ef, B:61:0x0126, B:69:0x0176, B:78:0x0183, B:75:0x017e, B:76:0x0181, B:65:0x0160, B:56:0x00e6, B:15:0x003b, B:37:0x009c, B:39:0x00a0, B:41:0x00a6, B:43:0x00ae, B:45:0x00b4, B:16:0x0041, B:24:0x005e, B:25:0x0069, B:27:0x006f, B:29:0x0080, B:32:0x0087, B:34:0x008d, B:19:0x004a, B:21:0x0050, B:62:0x0151, B:68:0x0170, B:73:0x017c), top: B:83:0x0019, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ef A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:8:0x0027, B:49:0x00c8, B:52:0x00d7, B:54:0x00dd, B:57:0x00e9, B:59:0x00ef, B:61:0x0126, B:69:0x0176, B:78:0x0183, B:75:0x017e, B:76:0x0181, B:65:0x0160, B:56:0x00e6, B:15:0x003b, B:37:0x009c, B:39:0x00a0, B:41:0x00a6, B:43:0x00ae, B:45:0x00b4, B:16:0x0041, B:24:0x005e, B:25:0x0069, B:27:0x006f, B:29:0x0080, B:32:0x0087, B:34:0x008d, B:19:0x004a, B:21:0x0050, B:62:0x0151, B:68:0x0170, B:73:0x017c), top: B:83:0x0019, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0124  */
    /* JADX WARN: Code duplicated, block: B:77:0x0182  */
    /* JADX WARN: Code duplicated, block: B:86:0x0170 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        List<SavedLocation> list;
        Object allCompleteLocations;
        List<SavedLocation> list2;
        Object collectionRoutes;
        List<SavedLocation> savedLocations;
        List<SavedLocation> list3;
        Object allSavedRoutesList;
        List<SavedLocation> list4;
        Map<String, String> appCoordinateSystems;
        ExportedSettings exportedSettings;
        byte[] bytes;
        OutputStream outputStreamOpenOutputStream;
        OutputStream outputStream;
        Uri uri = this.l;
        CoroutineScope coroutineScope = (CoroutineScope) this.i;
        int i = this.h;
        lu0 lu0Var = this.m;
        int i2 = 2;
        List<SavedLocation> list5 = uj0.e;
        boolean z = true;
        q60 q60Var = null;
        ImportExportSelection importExportSelection = this.j;
        ul1 ul1Var = this.k;
        z70 z70Var = z70.e;
        try {
            if (i != 0) {
                try {
                    if (i == 1) {
                        ee0.J(obj);
                        allCompleteLocations = obj;
                    } else {
                        if (i == 2) {
                            list = this.e;
                            ee0.J(obj);
                            collectionRoutes = obj;
                            list2 = (List) collectionRoutes;
                            if (importExportSelection.getSavedLocations()) {
                                savedLocations = ul1Var.c.getSavedLocations();
                            } else {
                                savedLocations = list5;
                            }
                            if (importExportSelection.getSavedRoutes()) {
                                LocationRepository locationRepository = ul1Var.b;
                                this.i = coroutineScope;
                                this.e = list;
                                this.f = list2;
                                this.g = savedLocations;
                                this.h = 3;
                                allSavedRoutesList = locationRepository.getAllSavedRoutesList(this);
                                if (allSavedRoutesList != z70Var) {
                                    list4 = list2;
                                }
                                return z70Var;
                            }
                            list3 = list2;
                            List<SavedLocation> list6 = list;
                            List<SavedLocation> list7 = list5;
                            List<SavedLocation> list8 = savedLocations;
                            if (importExportSelection.getAppCoordinateSystems()) {
                                appCoordinateSystems = ul1Var.c.getAppCoordinateSystems();
                            } else {
                                appCoordinateSystems = vj0.e;
                            }
                            Map<String, String> map = appCoordinateSystems;
                            if (importExportSelection.getSettings()) {
                                SettingsRepository settingsRepository = ul1Var.c;
                                SettingsRepository settingsRepository2 = ul1Var.c;
                                exportedSettings = new ExportedSettings(settingsRepository.getMockWifi(), settingsRepository2.getMockCell(), settingsRepository2.getMockBluetooth(), settingsRepository2.getEnableJitter(), settingsRepository2.getAltitude(), new Integer(settingsRepository2.getAltitudeVariationM()), settingsRepository2.getSatelliteCount(), settingsRepository2.getMapType(), settingsRepository2.getMapEngine());
                            } else {
                                exportedSettings = null;
                            }
                            bytes = ee0.d(new yk1(6)).b(LocationSpooferDataPackage.Companion.serializer(), new LocationSpooferDataPackage(4, System.currentTimeMillis(), "2.0.0", list6, list3, list8, list7, map, exportedSettings)).getBytes(sw.a);
                            bytes.getClass();
                            outputStreamOpenOutputStream = ul1Var.j.getContentResolver().openOutputStream(uri, "wt");
                            outputStream = outputStreamOpenOutputStream;
                            if (outputStream != null) {
                                try {
                                    outputStream.write(bytes);
                                    outputStream.flush();
                                    outputStream.close();
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        ji2.z(outputStream, th);
                                        throw th2;
                                    }
                                }
                            } else {
                                z = false;
                            }
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new so0(lu0Var, z, (q60) null), 2, null);
                            return mf3.a;
                        }
                        if (i != 3) {
                            fo.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List<SavedLocation> list9 = this.g;
                        list4 = this.f;
                        List<SavedLocation> list10 = this.e;
                        ee0.J(obj);
                        savedLocations = list9;
                        list = list10;
                        allSavedRoutesList = obj;
                    }
                    outputStreamOpenOutputStream = ul1Var.j.getContentResolver().openOutputStream(uri, "wt");
                } catch (Exception e) {
                    e.printStackTrace();
                    outputStreamOpenOutputStream = ul1Var.j.getContentResolver().openOutputStream(uri);
                }
                list5 = (List) allSavedRoutesList;
                list3 = list4;
                List<SavedLocation> list11 = list;
                List<SavedLocation> list12 = list5;
                List<SavedLocation> list13 = savedLocations;
                if (importExportSelection.getAppCoordinateSystems()) {
                    appCoordinateSystems = ul1Var.c.getAppCoordinateSystems();
                } else {
                    appCoordinateSystems = vj0.e;
                }
                Map<String, String> map2 = appCoordinateSystems;
                if (importExportSelection.getSettings()) {
                    SettingsRepository settingsRepository3 = ul1Var.c;
                    SettingsRepository settingsRepository4 = ul1Var.c;
                    exportedSettings = new ExportedSettings(settingsRepository3.getMockWifi(), settingsRepository4.getMockCell(), settingsRepository4.getMockBluetooth(), settingsRepository4.getEnableJitter(), settingsRepository4.getAltitude(), new Integer(settingsRepository4.getAltitudeVariationM()), settingsRepository4.getSatelliteCount(), settingsRepository4.getMapType(), settingsRepository4.getMapEngine());
                } else {
                    exportedSettings = null;
                }
                bytes = ee0.d(new yk1(6)).b(LocationSpooferDataPackage.Companion.serializer(), new LocationSpooferDataPackage(4, System.currentTimeMillis(), "2.0.0", list11, list3, list13, list12, map2, exportedSettings)).getBytes(sw.a);
                bytes.getClass();
                outputStream = outputStreamOpenOutputStream;
                if (outputStream != null) {
                    outputStream.write(bytes);
                    outputStream.flush();
                    outputStream.close();
                } else {
                    z = false;
                }
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new so0(lu0Var, z, (q60) null), 2, null);
                return mf3.a;
            }
            ee0.J(obj);
            if (importExportSelection.getLocations()) {
                EnvironmentDao environmentDao = ul1Var.f;
                this.i = coroutineScope;
                this.h = 1;
                allCompleteLocations = environmentDao.getAllCompleteLocations(this);
                if (allCompleteLocations == z70Var) {
                }
            } else {
                list = list5;
                if (importExportSelection.getLocations()) {
                    list2 = list5;
                    if (importExportSelection.getSavedLocations()) {
                        savedLocations = ul1Var.c.getSavedLocations();
                    } else {
                        savedLocations = list5;
                    }
                    if (importExportSelection.getSavedRoutes()) {
                        LocationRepository locationRepository2 = ul1Var.b;
                        this.i = coroutineScope;
                        this.e = list;
                        this.f = list2;
                        this.g = savedLocations;
                        this.h = 3;
                        allSavedRoutesList = locationRepository2.getAllSavedRoutesList(this);
                        if (allSavedRoutesList != z70Var) {
                            list4 = list2;
                            list5 = (List) allSavedRoutesList;
                            list3 = list4;
                        }
                    } else {
                        list3 = list2;
                    }
                    List<SavedLocation> list14 = list;
                    List<SavedLocation> list15 = list5;
                    List<SavedLocation> list16 = savedLocations;
                    if (importExportSelection.getAppCoordinateSystems()) {
                        appCoordinateSystems = ul1Var.c.getAppCoordinateSystems();
                    } else {
                        appCoordinateSystems = vj0.e;
                    }
                    Map<String, String> map3 = appCoordinateSystems;
                    if (importExportSelection.getSettings()) {
                        SettingsRepository settingsRepository5 = ul1Var.c;
                        SettingsRepository settingsRepository6 = ul1Var.c;
                        exportedSettings = new ExportedSettings(settingsRepository5.getMockWifi(), settingsRepository6.getMockCell(), settingsRepository6.getMockBluetooth(), settingsRepository6.getEnableJitter(), settingsRepository6.getAltitude(), new Integer(settingsRepository6.getAltitudeVariationM()), settingsRepository6.getSatelliteCount(), settingsRepository6.getMapType(), settingsRepository6.getMapEngine());
                    } else {
                        exportedSettings = null;
                    }
                    bytes = ee0.d(new yk1(6)).b(LocationSpooferDataPackage.Companion.serializer(), new LocationSpooferDataPackage(4, System.currentTimeMillis(), "2.0.0", list14, list3, list16, list15, map3, exportedSettings)).getBytes(sw.a);
                    bytes.getClass();
                    outputStreamOpenOutputStream = ul1Var.j.getContentResolver().openOutputStream(uri, "wt");
                    outputStream = outputStreamOpenOutputStream;
                    if (outputStream != null) {
                        outputStream.write(bytes);
                        outputStream.flush();
                        outputStream.close();
                    } else {
                        z = false;
                    }
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new so0(lu0Var, z, (q60) null), 2, null);
                    return mf3.a;
                }
                EnvironmentDao environmentDao2 = ul1Var.f;
                this.i = coroutineScope;
                this.e = list;
                this.h = 2;
                collectionRoutes = environmentDao2.getCollectionRoutes(this);
                if (collectionRoutes == z70Var) {
                    list2 = (List) collectionRoutes;
                    if (importExportSelection.getSavedLocations()) {
                        savedLocations = ul1Var.c.getSavedLocations();
                    } else {
                        savedLocations = list5;
                    }
                    if (importExportSelection.getSavedRoutes()) {
                        LocationRepository locationRepository3 = ul1Var.b;
                        this.i = coroutineScope;
                        this.e = list;
                        this.f = list2;
                        this.g = savedLocations;
                        this.h = 3;
                        allSavedRoutesList = locationRepository3.getAllSavedRoutesList(this);
                        if (allSavedRoutesList != z70Var) {
                            list4 = list2;
                            list5 = (List) allSavedRoutesList;
                            list3 = list4;
                        }
                    } else {
                        list3 = list2;
                    }
                    List<SavedLocation> list17 = list;
                    List<SavedLocation> list18 = list5;
                    List<SavedLocation> list19 = savedLocations;
                    if (importExportSelection.getAppCoordinateSystems()) {
                        appCoordinateSystems = ul1Var.c.getAppCoordinateSystems();
                    } else {
                        appCoordinateSystems = vj0.e;
                    }
                    Map<String, String> map4 = appCoordinateSystems;
                    if (importExportSelection.getSettings()) {
                        SettingsRepository settingsRepository7 = ul1Var.c;
                        SettingsRepository settingsRepository8 = ul1Var.c;
                        exportedSettings = new ExportedSettings(settingsRepository7.getMockWifi(), settingsRepository8.getMockCell(), settingsRepository8.getMockBluetooth(), settingsRepository8.getEnableJitter(), settingsRepository8.getAltitude(), new Integer(settingsRepository8.getAltitudeVariationM()), settingsRepository8.getSatelliteCount(), settingsRepository8.getMapType(), settingsRepository8.getMapEngine());
                    } else {
                        exportedSettings = null;
                    }
                    bytes = ee0.d(new yk1(6)).b(LocationSpooferDataPackage.Companion.serializer(), new LocationSpooferDataPackage(4, System.currentTimeMillis(), "2.0.0", list17, list3, list19, list18, map4, exportedSettings)).getBytes(sw.a);
                    bytes.getClass();
                    outputStreamOpenOutputStream = ul1Var.j.getContentResolver().openOutputStream(uri, "wt");
                    outputStream = outputStreamOpenOutputStream;
                    if (outputStream != null) {
                        outputStream.write(bytes);
                        outputStream.flush();
                        outputStream.close();
                    } else {
                        z = false;
                    }
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new so0(lu0Var, z, (q60) null), 2, null);
                    return mf3.a;
                }
            }
            return z70Var;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (Iterable) allCompleteLocations) {
                if (((CompleteLocation) obj2).getLocation().getCollectionRouteId() == null) {
                    arrayList.add(obj2);
                }
            }
            list = arrayList;
            if (importExportSelection.getLocations()) {
                list2 = list5;
                if (importExportSelection.getSavedLocations()) {
                    savedLocations = ul1Var.c.getSavedLocations();
                } else {
                    savedLocations = list5;
                }
                if (importExportSelection.getSavedRoutes()) {
                    LocationRepository locationRepository4 = ul1Var.b;
                    this.i = coroutineScope;
                    this.e = list;
                    this.f = list2;
                    this.g = savedLocations;
                    this.h = 3;
                    allSavedRoutesList = locationRepository4.getAllSavedRoutesList(this);
                    if (allSavedRoutesList != z70Var) {
                        list4 = list2;
                        list5 = (List) allSavedRoutesList;
                        list3 = list4;
                    }
                } else {
                    list3 = list2;
                }
                List<SavedLocation> list110 = list;
                List<SavedLocation> list111 = list5;
                List<SavedLocation> list112 = savedLocations;
                if (importExportSelection.getAppCoordinateSystems()) {
                    appCoordinateSystems = ul1Var.c.getAppCoordinateSystems();
                } else {
                    appCoordinateSystems = vj0.e;
                }
                Map<String, String> map5 = appCoordinateSystems;
                if (importExportSelection.getSettings()) {
                    SettingsRepository settingsRepository9 = ul1Var.c;
                    SettingsRepository settingsRepository10 = ul1Var.c;
                    exportedSettings = new ExportedSettings(settingsRepository9.getMockWifi(), settingsRepository10.getMockCell(), settingsRepository10.getMockBluetooth(), settingsRepository10.getEnableJitter(), settingsRepository10.getAltitude(), new Integer(settingsRepository10.getAltitudeVariationM()), settingsRepository10.getSatelliteCount(), settingsRepository10.getMapType(), settingsRepository10.getMapEngine());
                } else {
                    exportedSettings = null;
                }
                bytes = ee0.d(new yk1(6)).b(LocationSpooferDataPackage.Companion.serializer(), new LocationSpooferDataPackage(4, System.currentTimeMillis(), "2.0.0", list110, list3, list112, list111, map5, exportedSettings)).getBytes(sw.a);
                bytes.getClass();
                outputStreamOpenOutputStream = ul1Var.j.getContentResolver().openOutputStream(uri, "wt");
                outputStream = outputStreamOpenOutputStream;
                if (outputStream != null) {
                    outputStream.write(bytes);
                    outputStream.flush();
                    outputStream.close();
                } else {
                    z = false;
                }
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new so0(lu0Var, z, (q60) null), 2, null);
                return mf3.a;
            }
            EnvironmentDao environmentDao3 = ul1Var.f;
            this.i = coroutineScope;
            this.e = list;
            this.h = 2;
            collectionRoutes = environmentDao3.getCollectionRoutes(this);
            if (collectionRoutes == z70Var) {
                list2 = (List) collectionRoutes;
                if (importExportSelection.getSavedLocations()) {
                    savedLocations = ul1Var.c.getSavedLocations();
                } else {
                    savedLocations = list5;
                }
                if (importExportSelection.getSavedRoutes()) {
                    LocationRepository locationRepository5 = ul1Var.b;
                    this.i = coroutineScope;
                    this.e = list;
                    this.f = list2;
                    this.g = savedLocations;
                    this.h = 3;
                    allSavedRoutesList = locationRepository5.getAllSavedRoutesList(this);
                    if (allSavedRoutesList != z70Var) {
                        list4 = list2;
                        list5 = (List) allSavedRoutesList;
                        list3 = list4;
                    }
                } else {
                    list3 = list2;
                }
                List<SavedLocation> list113 = list;
                List<SavedLocation> list114 = list5;
                List<SavedLocation> list115 = savedLocations;
                if (importExportSelection.getAppCoordinateSystems()) {
                    appCoordinateSystems = ul1Var.c.getAppCoordinateSystems();
                } else {
                    appCoordinateSystems = vj0.e;
                }
                Map<String, String> map6 = appCoordinateSystems;
                if (importExportSelection.getSettings()) {
                    SettingsRepository settingsRepository11 = ul1Var.c;
                    SettingsRepository settingsRepository12 = ul1Var.c;
                    exportedSettings = new ExportedSettings(settingsRepository11.getMockWifi(), settingsRepository12.getMockCell(), settingsRepository12.getMockBluetooth(), settingsRepository12.getEnableJitter(), settingsRepository12.getAltitude(), new Integer(settingsRepository12.getAltitudeVariationM()), settingsRepository12.getSatelliteCount(), settingsRepository12.getMapType(), settingsRepository12.getMapEngine());
                } else {
                    exportedSettings = null;
                }
                bytes = ee0.d(new yk1(6)).b(LocationSpooferDataPackage.Companion.serializer(), new LocationSpooferDataPackage(4, System.currentTimeMillis(), "2.0.0", list113, list3, list115, list114, map6, exportedSettings)).getBytes(sw.a);
                bytes.getClass();
                outputStreamOpenOutputStream = ul1Var.j.getContentResolver().openOutputStream(uri, "wt");
                outputStream = outputStreamOpenOutputStream;
                if (outputStream != null) {
                    outputStream.write(bytes);
                    outputStream.flush();
                    outputStream.close();
                } else {
                    z = false;
                }
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new so0(lu0Var, z, (q60) null), 2, null);
                return mf3.a;
            }
            return z70Var;
        } catch (Exception e2) {
            e2.printStackTrace();
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new p00(lu0Var, q60Var, i2), 2, null);
        }
    }
}
