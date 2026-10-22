package defpackage;

import com.vincenthzr.locationspoofer.data.db.CompleteLocation;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.SavedLocation;
import com.vincenthzr.locationspoofer.data.repository.SettingsRepository;
import java.util.Iterator;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zm1 extends k33 implements pu0 {
    public Mutex e;
    public lu0 f;
    public ul1 g;
    public long h;
    public int i;
    public int j;
    public final /* synthetic */ ul1 k;
    public final /* synthetic */ lu0 l;
    public final /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm1(ul1 ul1Var, lu0 lu0Var, long j, q60 q60Var) {
        super(2, q60Var);
        this.k = ul1Var;
        this.l = lu0Var;
        this.m = j;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new zm1(this.k, this.l, this.m, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((zm1) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0083 A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0017, B:22:0x007f, B:24:0x0083, B:25:0x008a, B:26:0x00a6, B:28:0x00ac, B:33:0x00c2, B:35:0x00c8, B:37:0x00d0, B:41:0x00da, B:43:0x00de, B:44:0x00e1, B:46:0x01af, B:47:0x01bd, B:48:0x01f6, B:50:0x02c5, B:31:0x00ba), top: B:59:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x008a A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0017, B:22:0x007f, B:24:0x0083, B:25:0x008a, B:26:0x00a6, B:28:0x00ac, B:33:0x00c2, B:35:0x00c8, B:37:0x00d0, B:41:0x00da, B:43:0x00de, B:44:0x00e1, B:46:0x01af, B:47:0x01bd, B:48:0x01f6, B:50:0x02c5, B:31:0x00ba), top: B:59:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00ac A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0017, B:22:0x007f, B:24:0x0083, B:25:0x008a, B:26:0x00a6, B:28:0x00ac, B:33:0x00c2, B:35:0x00c8, B:37:0x00d0, B:41:0x00da, B:43:0x00de, B:44:0x00e1, B:46:0x01af, B:47:0x01bd, B:48:0x01f6, B:50:0x02c5, B:31:0x00ba), top: B:59:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00de A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0017, B:22:0x007f, B:24:0x0083, B:25:0x008a, B:26:0x00a6, B:28:0x00ac, B:33:0x00c2, B:35:0x00c8, B:37:0x00d0, B:41:0x00da, B:43:0x00de, B:44:0x00e1, B:46:0x01af, B:47:0x01bd, B:48:0x01f6, B:50:0x02c5, B:31:0x00ba), top: B:59:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x01bd A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0017, B:22:0x007f, B:24:0x0083, B:25:0x008a, B:26:0x00a6, B:28:0x00ac, B:33:0x00c2, B:35:0x00c8, B:37:0x00d0, B:41:0x00da, B:43:0x00de, B:44:0x00e1, B:46:0x01af, B:47:0x01bd, B:48:0x01f6, B:50:0x02c5, B:31:0x00ba), top: B:59:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d9 A[SYNTHETIC] */
    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) throws Throwable {
        ul1 ul1Var;
        long j;
        Mutex mutex;
        lu0 lu0Var;
        int i;
        Mutex mutex2;
        Object objWithContext;
        lu0 lu0Var2;
        ul1 ul1Var2;
        long j2;
        CompleteLocation completeLocation;
        double lat;
        double lng;
        SettingsRepository settingsRepository;
        MutableStateFlow mutableStateFlow;
        Iterator<T> it;
        Object next;
        SavedLocation savedLocation;
        Object value;
        Object value2;
        SavedLocation savedLocation2;
        Long sourceLocationId;
        int i2 = this.j;
        q60 q60Var = null;
        z70 z70Var = z70.e;
        try {
            if (i2 == 0) {
                ee0.J(obj);
                ul1Var = this.k;
                Mutex mutex3 = ul1Var.F;
                this.e = mutex3;
                lu0 lu0Var3 = this.l;
                this.f = lu0Var3;
                this.g = ul1Var;
                j = this.m;
                this.h = j;
                this.i = 0;
                this.j = 1;
                if (mutex3.lock(null, this) != z70Var) {
                    mutex = mutex3;
                    lu0Var = lu0Var3;
                    i = 0;
                }
                return z70Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2 = this.h;
                ul1 ul1Var3 = this.g;
                lu0Var2 = this.f;
                mutex2 = this.e;
                try {
                    ee0.J(obj);
                    objWithContext = obj;
                    ul1Var2 = ul1Var3;
                    completeLocation = (CompleteLocation) objWithContext;
                    if (completeLocation == null) {
                        lu0Var2.invoke(tm0.a);
                    } else {
                        lat = completeLocation.getLocation().getLat();
                        lng = completeLocation.getLocation().getLng();
                        settingsRepository = ul1Var2.c;
                        mutableStateFlow = ul1Var2.x;
                        it = settingsRepository.getSavedLocations().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            savedLocation2 = (SavedLocation) next;
                            sourceLocationId = savedLocation2.getSourceLocationId();
                            if (sourceLocationId == null || sourceLocationId.longValue() != j2) {
                                if (savedLocation2.getSourceLocationId() != null && savedLocation2.getLat() == lat && savedLocation2.getLng() == lng) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        savedLocation = (SavedLocation) next;
                        if (savedLocation != null) {
                            settingsRepository.removeSavedLocation(savedLocation);
                            do {
                                value2 = mutableStateFlow.getValue();
                            } while (!mutableStateFlow.compareAndSet(value2, AppState.copy$default((AppState) value2, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, settingsRepository.getSavedLocations(), null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -5, 134217727, null)));
                            lu0Var2.invoke(new um0(savedLocation.getName()));
                        } else {
                            String strE = an1.e(completeLocation);
                            md3 md3VarD = ig0.D(ul1Var2, am1.F(completeLocation), lat, lng);
                            settingsRepository.addSavedLocation(new SavedLocation(strE, lat, lng, (String) md3VarD.e, (String) md3VarD.f, (String) md3VarD.g, new Long(j2), (String) null, (String) null, 384, (ca0) null));
                            do {
                                value = mutableStateFlow.getValue();
                            } while (!mutableStateFlow.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, settingsRepository.getSavedLocations(), null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -5, 134217727, null)));
                            lu0Var2.invoke(new sm0(strE));
                        }
                    }
                    mutex2.unlock(null);
                    return mf3.a;
                } catch (Throwable th) {
                    th = th;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            i = this.i;
            long j3 = this.h;
            ul1Var = this.g;
            lu0 lu0Var4 = this.f;
            Mutex mutex4 = this.e;
            ee0.J(obj);
            mutex = mutex4;
            lu0Var = lu0Var4;
            j = j3;
            CoroutineDispatcher io2 = Dispatchers.getIO();
            vl1 vl1Var = new vl1(ul1Var, j, q60Var, 3);
            this.e = mutex;
            this.f = lu0Var;
            this.g = ul1Var;
            this.h = j;
            this.i = i;
            this.j = 2;
            objWithContext = BuildersKt.withContext(io2, vl1Var, this);
            if (objWithContext != z70Var) {
                lu0Var2 = lu0Var;
                ul1Var2 = ul1Var;
                j2 = j;
                mutex2 = mutex;
                completeLocation = (CompleteLocation) objWithContext;
                if (completeLocation == null) {
                    lu0Var2.invoke(tm0.a);
                } else {
                    lat = completeLocation.getLocation().getLat();
                    lng = completeLocation.getLocation().getLng();
                    settingsRepository = ul1Var2.c;
                    mutableStateFlow = ul1Var2.x;
                    it = settingsRepository.getSavedLocations().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        savedLocation2 = (SavedLocation) next;
                        sourceLocationId = savedLocation2.getSourceLocationId();
                        if (sourceLocationId == null) {
                            break;
                            break;
                        }
                        if (savedLocation2.getSourceLocationId() != null) {
                        }
                    }
                    savedLocation = (SavedLocation) next;
                    if (savedLocation != null) {
                        settingsRepository.removeSavedLocation(savedLocation);
                        do {
                            value2 = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.compareAndSet(value2, AppState.copy$default((AppState) value2, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, settingsRepository.getSavedLocations(), null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -5, 134217727, null)));
                        lu0Var2.invoke(new um0(savedLocation.getName()));
                    } else {
                        String strE2 = an1.e(completeLocation);
                        md3 md3VarD2 = ig0.D(ul1Var2, am1.F(completeLocation), lat, lng);
                        settingsRepository.addSavedLocation(new SavedLocation(strE2, lat, lng, (String) md3VarD2.e, (String) md3VarD2.f, (String) md3VarD2.g, new Long(j2), (String) null, (String) null, 384, (ca0) null));
                        do {
                            value = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, settingsRepository.getSavedLocations(), null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -5, 134217727, null)));
                        lu0Var2.invoke(new sm0(strE2));
                    }
                }
                mutex2.unlock(null);
                return mf3.a;
            }
            return z70Var;
        } catch (Throwable th2) {
            th = th2;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
    }
}
