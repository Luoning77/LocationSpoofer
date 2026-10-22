package defpackage;

import com.vincenthzr.locationspoofer.data.db.CompleteLocation;
import com.vincenthzr.locationspoofer.data.db.EnvironmentDao;
import com.vincenthzr.locationspoofer.data.model.ImportExportCounts;
import com.vincenthzr.locationspoofer.data.repository.LocationRepository;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class dm1 extends k33 implements pu0 {
    public int e;
    public int f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ ul1 i;
    public final /* synthetic */ di0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm1(ul1 ul1Var, di0 di0Var, q60 q60Var) {
        super(2, q60Var);
        this.i = ul1Var;
        this.j = di0Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        dm1 dm1Var = new dm1(this.i, this.j, q60Var);
        dm1Var.h = obj;
        return dm1Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((dm1) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ac  */
    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        ImportExportCounts importExportCounts;
        int i;
        int size;
        int size2;
        Object allSavedRoutesList;
        int i2;
        CoroutineScope coroutineScope = (CoroutineScope) this.h;
        int i3 = this.g;
        ul1 ul1Var = this.i;
        z70 z70Var = z70.e;
        try {
            if (i3 == 0) {
                ee0.J(obj);
                EnvironmentDao environmentDao = ul1Var.f;
                this.h = coroutineScope;
                this.g = 1;
                obj = environmentDao.getAllCompleteLocations(this);
                if (obj == z70Var) {
                }
                return z70Var;
            }
            if (i3 == 1) {
                ee0.J(obj);
            } else {
                if (i3 == 2) {
                    i = this.e;
                    ee0.J(obj);
                    size = ((List) obj).size() + i;
                    size2 = ul1Var.c.getSavedLocations().size();
                    LocationRepository locationRepository = ul1Var.b;
                    this.h = coroutineScope;
                    this.e = size;
                    this.f = size2;
                    this.g = 3;
                    allSavedRoutesList = locationRepository.getAllSavedRoutesList(this);
                    if (allSavedRoutesList != z70Var) {
                        i2 = size;
                        obj = allSavedRoutesList;
                    }
                    return z70Var;
                }
                if (i3 != 3) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                size2 = this.f;
                int i4 = this.e;
                ee0.J(obj);
                i2 = i4;
            }
            importExportCounts = new ImportExportCounts(i2, size2, ((List) obj).size(), ul1Var.c.getAppCoordinateSystems().size(), 1);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new l80(this.j, importExportCounts, null, 8), 2, null);
            return mf3.a;
            Iterable iterable = (Iterable) obj;
            int i5 = 0;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    if (((CompleteLocation) it.next()).getLocation().getCollectionRouteId() == null && (i5 = i5 + 1) < 0) {
                        am1.W();
                        throw null;
                    }
                }
            }
            i = i5;
            EnvironmentDao environmentDao2 = ul1Var.f;
            this.h = coroutineScope;
            this.e = i;
            this.g = 2;
            obj = environmentDao2.getCollectionRoutes(this);
            if (obj != z70Var) {
                size = ((List) obj).size() + i;
                size2 = ul1Var.c.getSavedLocations().size();
                LocationRepository locationRepository2 = ul1Var.b;
                this.h = coroutineScope;
                this.e = size;
                this.f = size2;
                this.g = 3;
                allSavedRoutesList = locationRepository2.getAllSavedRoutesList(this);
                if (allSavedRoutesList != z70Var) {
                    i2 = size;
                    obj = allSavedRoutesList;
                    importExportCounts = new ImportExportCounts(i2, size2, ((List) obj).size(), ul1Var.c.getAppCoordinateSystems().size(), 1);
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new l80(this.j, importExportCounts, null, 8), 2, null);
                    return mf3.a;
                }
            }
            return z70Var;
        } catch (Exception e) {
            e.printStackTrace();
            importExportCounts = new ImportExportCounts(0, 0, 0, 0, 0, 31, null);
        }
    }
}
