package defpackage;

import com.vincenthzr.locationspoofer.data.db.CompleteLocation;
import com.vincenthzr.locationspoofer.data.db.EnvironmentDao;
import com.vincenthzr.locationspoofer.data.model.AppState;
import java.util.Arrays;
import java.util.Locale;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class vl1 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ ul1 g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vl1(ul1 ul1Var, long j, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.g = ul1Var;
        this.h = j;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        switch (this.e) {
            case 0:
                return new vl1(this.g, this.h, q60Var, 0);
            case 1:
                return new vl1(this.g, this.h, q60Var, 1);
            case 2:
                return new vl1(this.g, this.h, q60Var, 2);
            default:
                return new vl1(this.g, this.h, q60Var, 3);
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        q60 q60Var = (q60) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((vl1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        Object objWithContext;
        String placeName;
        Object value;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        long j = this.h;
        ul1 ul1Var = this.g;
        z70 z70Var = z70.e;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ee0.J(obj);
                    EnvironmentDao environmentDao = ul1Var.f;
                    this.f = 1;
                    return environmentDao.deleteCollectionRoute(j, this) == z70Var ? z70Var : mf3Var;
                }
                if (i2 == 1) {
                    ee0.J(obj);
                    return mf3Var;
                }
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ee0.J(obj);
                        return obj;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                EnvironmentDao environmentDao2 = ul1Var.f;
                this.f = 1;
                Object completeLocationById = environmentDao2.getCompleteLocationById(j, this);
                return completeLocationById == z70Var ? z70Var : completeLocationById;
            case 2:
                int i4 = this.f;
                long j2 = this.h;
                ul1 ul1Var2 = this.g;
                if (i4 == 0) {
                    ee0.J(obj);
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    vl1 vl1Var = new vl1(ul1Var2, j2, null, 1);
                    this.f = 1;
                    objWithContext = BuildersKt.withContext(io2, vl1Var, this);
                    if (objWithContext != z70Var) {
                    }
                    return z70Var;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        ee0.J(obj);
                        return mf3Var;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                objWithContext = obj;
                CompleteLocation completeLocation = (CompleteLocation) objWithContext;
                if (completeLocation == null) {
                    return mf3Var;
                }
                ul1Var2.E = new Long(j2);
                if (l13.k0(completeLocation.getLocation().getRemark())) {
                    placeName = !l13.k0(completeLocation.getLocation().getPlaceName()) ? completeLocation.getLocation().getPlaceName() : String.format(Locale.US, "(%.5f, %.5f)", Arrays.copyOf(new Object[]{new Double(completeLocation.getLocation().getLat()), new Double(completeLocation.getLocation().getLng())}, 2));
                } else {
                    placeName = completeLocation.getLocation().getRemark();
                }
                String str = placeName;
                MutableStateFlow mutableStateFlow = ul1Var2.x;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, String.valueOf(completeLocation.getLocation().getLng()), String.valueOf(completeLocation.getLocation().getLat()), false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, new Long(j2), str, -201326593, -1, 33554430, null)));
                double lat = completeLocation.getLocation().getLat();
                double lng = completeLocation.getLocation().getLng();
                this.f = 2;
                if (rm1.b(this.g, lat, lng, this) != z70Var) {
                    return mf3Var;
                }
                return z70Var;
            default:
                int i5 = this.f;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ee0.J(obj);
                        return obj;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                EnvironmentDao environmentDao3 = ul1Var.f;
                this.f = 1;
                Object completeLocationById2 = environmentDao3.getCompleteLocationById(j, this);
                return completeLocationById2 == z70Var ? z70Var : completeLocationById2;
        }
    }
}
