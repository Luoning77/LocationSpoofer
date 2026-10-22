package defpackage;

import android.widget.Toast;
import com.vincenthzr.locationspoofer.data.db.EnvironmentDao;
import com.vincenthzr.locationspoofer.data.model.AppState;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class yl1 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ ul1 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ String i;
    public final /* synthetic */ String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yl1(ul1 ul1Var, long j, String str, String str2, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.g = ul1Var;
        this.h = j;
        this.i = str;
        this.j = str2;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        switch (this.e) {
            case 0:
                return new yl1(this.g, this.h, this.i, this.j, q60Var, 0);
            case 1:
                return new yl1(this.g, this.h, this.i, this.j, q60Var, 1);
            default:
                return new yl1(this.g, this.h, this.i, this.j, q60Var, 2);
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
        }
        return ((yl1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        AppState appState;
        List listI0;
        String string;
        int i = this.e;
        String str = this.j;
        String str2 = this.i;
        mf3 mf3Var = mf3.a;
        z70 z70Var = z70.e;
        ul1 ul1Var = this.g;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ee0.J(obj);
                        return mf3Var;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                EnvironmentDao environmentDao = ul1Var.f;
                String string2 = l13.D0(str2).toString();
                String string3 = l13.D0(str).toString();
                this.f = 1;
                return environmentDao.updateCollectionRouteInfo(this.h, string2, string3, this) == z70Var ? z70Var : mf3Var;
            case 1:
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ee0.J(obj);
                        return mf3Var;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                EnvironmentDao environmentDao2 = ul1Var.f;
                String string4 = l13.D0(str2).toString();
                String string5 = l13.D0(str).toString();
                this.f = 1;
                return environmentDao2.updateBasicInfo(this.h, string4, string5, this) == z70Var ? z70Var : mf3Var;
            default:
                int i4 = this.f;
                String str3 = this.j;
                String str4 = this.i;
                try {
                    if (i4 == 0) {
                        ee0.J(obj);
                        CoroutineDispatcher io2 = Dispatchers.getIO();
                        yl1 yl1Var = new yl1(this.g, this.h, str4, str3, null, 1);
                        this.f = 1;
                        if (BuildersKt.withContext(io2, yl1Var, this) == z70Var) {
                            return z70Var;
                        }
                    } else {
                        if (i4 != 1) {
                            fo.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ee0.J(obj);
                    }
                    MutableStateFlow mutableStateFlow = ul1Var.x;
                    long j = this.h;
                    do {
                        value2 = mutableStateFlow.getValue();
                        appState = (AppState) value2;
                        listI0 = zy.i0(appState.getPendingCollectionLocations(), 1);
                        Long pinnedCollectedLocationId = appState.getPinnedCollectedLocationId();
                        if (pinnedCollectedLocationId != null && pinnedCollectedLocationId.longValue() == j) {
                            string = l13.D0(str3).toString();
                            if (l13.k0(string)) {
                                string = l13.D0(str4).toString();
                            }
                            if (l13.k0(string)) {
                                string = appState.getPinnedLocationName();
                            }
                        } else {
                            string = appState.getPinnedLocationName();
                        }
                    } while (!mutableStateFlow.compareAndSet(value2, AppState.copy$default(appState, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, listI0, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, string, -1, -201326593, 67108863, null)));
                    return mf3Var;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception unused) {
                    MutableStateFlow mutableStateFlow2 = ul1Var.x;
                    do {
                        value = mutableStateFlow2.getValue();
                    } while (!mutableStateFlow2.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -134217729, 134217727, null)));
                    Toast.makeText(ul1Var.j, 2131624287, 1).show();
                    return mf3Var;
                }
        }
    }
}
