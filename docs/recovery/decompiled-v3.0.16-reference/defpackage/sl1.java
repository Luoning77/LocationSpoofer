package defpackage;

import com.vincenthzr.locationspoofer.data.db.EnvironmentDao;
import com.vincenthzr.locationspoofer.data.db.SavedRouteEntity;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.RootSetupTestResult;
import com.vincenthzr.locationspoofer.data.motion.MotionController;
import com.vincenthzr.locationspoofer.data.repository.LocationRepository;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class sl1 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ ul1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sl1(ul1 ul1Var, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.g = ul1Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        ul1 ul1Var = this.g;
        switch (i) {
            case 0:
                return new sl1(ul1Var, q60Var, 0);
            case 1:
                return new sl1(ul1Var, q60Var, 1);
            case 2:
                return new sl1(ul1Var, q60Var, 2);
            case 3:
                return new sl1(ul1Var, q60Var, 3);
            case 4:
                return new sl1(ul1Var, q60Var, 4);
            case Logger.WARN /* 5 */:
                return new sl1(ul1Var, q60Var, 5);
            case Logger.ERROR /* 6 */:
                return new sl1(ul1Var, q60Var, 6);
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return new sl1(ul1Var, q60Var, 7);
            case 8:
                return new sl1(ul1Var, q60Var, 8);
            case mc0.b /* 9 */:
                return new sl1(ul1Var, q60Var, 9);
            case mc0.c /* 10 */:
                return new sl1(ul1Var, q60Var, 10);
            case 11:
                return new sl1(ul1Var, q60Var, 11);
            case mc0.d /* 12 */:
                return new sl1(ul1Var, q60Var, 12);
            case 13:
                return new sl1(ul1Var, q60Var, 13);
            case 14:
                return new sl1(ul1Var, q60Var, 14);
            default:
                return new sl1(ul1Var, q60Var, 15);
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        z70 z70Var = z70.e;
        mf3 mf3Var = mf3.a;
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        q60 q60Var = (q60) obj2;
        switch (i) {
            case 0:
                return ((sl1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
            case 1:
                return ((sl1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
            case 2:
                return ((sl1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
            case 3:
                return ((sl1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
            case 4:
                ((sl1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                return z70Var;
            case Logger.WARN /* 5 */:
                return ((sl1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
            case Logger.ERROR /* 6 */:
                ((sl1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                return z70Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return ((sl1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
            case 8:
                return ((sl1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
            case mc0.b /* 9 */:
                ((sl1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                return z70Var;
            case mc0.c /* 10 */:
                return ((sl1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
            case 11:
                return ((sl1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
            case mc0.d /* 12 */:
                return ((sl1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
            case 13:
                return ((sl1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
            case 14:
                return ((sl1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
            default:
                return ((sl1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
        }
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        Object recordCount;
        Object value;
        Object recordCount2;
        Object value2;
        Object value3;
        Object objTestRootSetup;
        Object value4;
        int i = this.e;
        int i2 = 4;
        int i3 = 0;
        int i4 = 3;
        mf3 mf3Var = mf3.a;
        ul1 ul1Var = this.g;
        z70 z70Var = z70.e;
        int i5 = 1;
        q60 q60Var = null;
        switch (i) {
            case 0:
                int i6 = this.f;
                if (i6 != 0) {
                    if (i6 == 1) {
                        ee0.J(obj);
                        return mf3Var;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                we2 we2VarJ = p91.j(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new rl1(ul1Var.k.getAccountState(), 0));
                c6 c6Var = new c6(3, we2VarJ, ul1Var);
                this.f = 1;
                return flowDistinctUntilChanged.collect(c6Var, this) == z70Var ? z70Var : mf3Var;
            case 1:
                int i7 = this.f;
                if (i7 == 0) {
                    ee0.J(obj);
                    EnvironmentDao environmentDao = ul1Var.f;
                    this.f = 1;
                    recordCount = environmentDao.getRecordCount(this);
                    if (recordCount == z70Var) {
                        return z70Var;
                    }
                } else {
                    if (i7 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ee0.J(obj);
                    recordCount = obj;
                }
                int iIntValue = ((Number) recordCount).intValue();
                MutableStateFlow mutableStateFlow = ul1Var.x;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, iIntValue, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -1, 134217725, null)));
                return mf3Var;
            case 2:
                int i8 = this.f;
                if (i8 == 0) {
                    ee0.J(obj);
                    EnvironmentDao environmentDao2 = ul1Var.f;
                    this.f = 1;
                    recordCount2 = environmentDao2.getRecordCount(this);
                    if (recordCount2 == z70Var) {
                        return z70Var;
                    }
                } else {
                    if (i8 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ee0.J(obj);
                    recordCount2 = obj;
                }
                int iIntValue2 = ((Number) recordCount2).intValue();
                MutableStateFlow mutableStateFlow2 = ul1Var.x;
                do {
                    value2 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value2, AppState.copy$default((AppState) value2, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, iIntValue2, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -1, 134217725, null)));
                return mf3Var;
            case 3:
                int i9 = this.f;
                if (i9 != 0) {
                    if (i9 == 1) {
                        ee0.J(obj);
                        return mf3Var;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                LocationRepository locationRepository = ul1Var.b;
                yk1 yk1Var = new yk1(7);
                this.f = 1;
                return locationRepository.patchConfig(yk1Var, this) == z70Var ? z70Var : mf3Var;
            case 4:
                int i10 = this.f;
                if (i10 != 0) {
                    if (i10 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ee0.J(obj);
                    }
                    return null;
                }
                ee0.J(obj);
                StateFlow<MotionController.State> state = ul1Var.i.getState();
                wm1 wm1Var = new wm1(ul1Var);
                this.f = 1;
                if (state.collect(wm1Var, this) == z70Var) {
                    return z70Var;
                }
                fo.d();
                return null;
            case Logger.WARN /* 5 */:
                int i11 = this.f;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ee0.J(obj);
                        return mf3Var;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                LocationRepository locationRepository2 = ul1Var.b;
                qi1 qi1Var = new qi1(ul1Var, i4);
                this.f = 1;
                return locationRepository2.patchConfig(qi1Var, this) == z70Var ? z70Var : mf3Var;
            case Logger.ERROR /* 6 */:
                int i12 = this.f;
                if (i12 != 0) {
                    if (i12 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ee0.J(obj);
                    }
                    return null;
                }
                ee0.J(obj);
                ve2 ve2Var = new ve2();
                SharedFlow<mf3> configWriteFailures = ul1Var.b.getConfigWriteFailures();
                c6 c6Var2 = new c6(4, ve2Var, ul1Var);
                this.f = 1;
                if (configWriteFailures.collect(c6Var2, this) == z70Var) {
                    return z70Var;
                }
                fo.d();
                return null;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                int i13 = this.f;
                if (i13 != 0) {
                    if (i13 == 1) {
                        ee0.J(obj);
                        return mf3Var;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                Flow flowCombine = FlowKt.combine(ul1Var.w, ul1Var.v, new cn1(i4, q60Var, i3));
                dn1 dn1Var = new dn1(ul1Var, i3);
                this.f = 1;
                return flowCombine.collect(dn1Var, this) == z70Var ? z70Var : mf3Var;
            case 8:
                int i14 = this.f;
                if (i14 != 0) {
                    if (i14 == 1) {
                        ee0.J(obj);
                        return mf3Var;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                Flow flowSample = FlowKt.sample(FlowKt.distinctUntilChanged(new rl1(ul1Var.x, 1)), 2000L);
                dn1 dn1Var2 = new dn1(ul1Var, i5);
                this.f = 1;
                return flowSample.collect(dn1Var2, this) == z70Var ? z70Var : mf3Var;
            case mc0.b /* 9 */:
                int i15 = this.f;
                if (i15 != 0) {
                    if (i15 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ee0.J(obj);
                    }
                    return null;
                }
                ee0.J(obj);
                MutableStateFlow mutableStateFlow3 = vm3.c;
                dn1 dn1Var3 = new dn1(ul1Var, 2);
                this.f = 1;
                if (mutableStateFlow3.collect(dn1Var3, this) == z70Var) {
                    return z70Var;
                }
                fo.d();
                return null;
            case mc0.c /* 10 */:
                int i16 = this.f;
                if (i16 != 0) {
                    if (i16 == 1) {
                        ee0.J(obj);
                        return mf3Var;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                Flow<List<SavedRouteEntity>> savedRoutes = ul1Var.b.getSavedRoutes();
                dn1 dn1Var4 = new dn1(ul1Var, i4);
                this.f = 1;
                return savedRoutes.collect(dn1Var4, this) == z70Var ? z70Var : mf3Var;
            case 11:
                int i17 = this.f;
                if (i17 != 0) {
                    if (i17 == 1) {
                        ee0.J(obj);
                        return mf3Var;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                LocationRepository locationRepository3 = ul1Var.b;
                qi1 qi1Var2 = new qi1(ul1Var, i2);
                this.f = 1;
                return locationRepository3.patchConfig(qi1Var2, this) == z70Var ? z70Var : mf3Var;
            case mc0.d /* 12 */:
                int i18 = this.f;
                if (i18 != 0) {
                    if (i18 == 1) {
                        ee0.J(obj);
                        return mf3Var;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                LocationRepository locationRepository4 = ul1Var.b;
                qi1 qi1Var3 = new qi1(ul1Var, 5);
                this.f = 1;
                return locationRepository4.patchConfig(qi1Var3, this) == z70Var ? z70Var : mf3Var;
            case 13:
                int i19 = this.f;
                if (i19 != 0) {
                    if (i19 == 1) {
                        ee0.J(obj);
                        return mf3Var;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                LocationRepository locationRepository5 = ul1Var.b;
                qi1 qi1Var4 = new qi1(ul1Var, 6);
                this.f = 1;
                return locationRepository5.patchConfig(qi1Var4, this) == z70Var ? z70Var : mf3Var;
            case 14:
                int i20 = this.f;
                if (i20 == 0) {
                    ee0.J(obj);
                    MutableStateFlow mutableStateFlow4 = ul1Var.x;
                    do {
                        value3 = mutableStateFlow4.getValue();
                    } while (!mutableStateFlow4.compareAndSet(value3, AppState.copy$default((AppState) value3, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, true, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -2097153, -1, 134217727, null)));
                    LocationRepository locationRepository6 = ul1Var.b;
                    this.f = 1;
                    objTestRootSetup = locationRepository6.testRootSetup(this);
                    if (objTestRootSetup == z70Var) {
                        return z70Var;
                    }
                } else {
                    if (i20 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ee0.J(obj);
                    objTestRootSetup = obj;
                }
                RootSetupTestResult rootSetupTestResult = (RootSetupTestResult) objTestRootSetup;
                MutableStateFlow mutableStateFlow5 = ul1Var.x;
                do {
                    value4 = mutableStateFlow5.getValue();
                } while (!mutableStateFlow5.compareAndSet(value4, AppState.copy$default((AppState) value4, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, rootSetupTestResult, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -6291457, -1, 134217727, null)));
                return mf3Var;
            default:
                int i21 = this.f;
                if (i21 == 0) {
                    ee0.J(obj);
                    this.f = 1;
                    return am1.H(ul1Var, this) == z70Var ? z70Var : mf3Var;
                }
                if (i21 == 1) {
                    ee0.J(obj);
                    return mf3Var;
                }
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
