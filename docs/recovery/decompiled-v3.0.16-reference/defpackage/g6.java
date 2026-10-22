package defpackage;

import android.content.Context;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccount;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccountDevice;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import com.vincenthzr.locationspoofer.data.cloud.CloudException;
import com.vincenthzr.locationspoofer.data.cloud.CloudGuestRecoveryCode;
import com.vincenthzr.locationspoofer.data.cloud.CloudRepository;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.repository.LocationRepository;
import com.vincenthzr.locationspoofer.utils.ConfigManager;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.sync.Mutex;
import org.json.JSONException;
import org.json.JSONObject;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class g6 extends k33 implements lu0 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g6(Object obj, Object obj2, Object obj3, q60 q60Var, int i) {
        super(1, q60Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }

    @Override // defpackage.oq
    public final q60 create(q60 q60Var) {
        int i = this.e;
        Object obj = this.i;
        switch (i) {
            case 0:
                return new g6((l6) this.g, (String) this.h, (String) obj, q60Var, 0);
            case 1:
                return new g6((j) obj, (l6) this.g, q60Var);
            case 2:
                return new g6((l6) this.g, obj, q60Var, 2);
            case 3:
                return new g6((l6) this.g, obj, q60Var, 3);
            case 4:
                return new g6((ConfigManager) obj, q60Var);
            case Logger.WARN /* 5 */:
                return new g6((we2) this.h, (ul1) obj, q60Var, 5);
            case Logger.ERROR /* 6 */:
                return new g6((ul1) this.h, (AppState) obj, q60Var, 6);
            default:
                return new g6((d62) this.g, (wb3) this.h, (pu0) obj, q60Var, 7);
        }
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        q60 q60Var = (q60) obj;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case Logger.WARN /* 5 */:
                break;
            case Logger.ERROR /* 6 */:
                break;
        }
        return ((g6) create(q60Var)).invokeSuspend(mf3Var);
    }

    /* JADX WARN: Code duplicated, block: B:127:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:129:0x0209  */
    /* JADX WARN: Code duplicated, block: B:132:0x0213  */
    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) throws JSONException, CloudException {
        j jVar;
        String str;
        String sessionId;
        String str2;
        List list;
        CloudAccount account;
        Mutex mutex;
        ConfigManager configManager;
        Exception exc;
        CancellationException cancellationException;
        we2 we2Var;
        Exception exc2;
        switch (this.e) {
            case 0:
                l6 l6Var = (l6) this.g;
                z70 z70Var = z70.e;
                int i = this.f;
                if (i == 0) {
                    ee0.J(obj);
                    CloudRepository cloudRepository = l6Var.b;
                    String str3 = (String) this.h;
                    String str4 = (String) this.i;
                    this.f = 1;
                    if (cloudRepository.changePassword(str3, str4, this) == z70Var) {
                        return z70Var;
                    }
                } else {
                    if (i != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ee0.J(obj);
                }
                l6Var.s.setValue(uj0.e);
                l6Var.u.setValue("password_changed");
                return mf3.a;
            case 1:
                z70 z70Var2 = z70.e;
                int i2 = this.f;
                if (i2 == 0) {
                    ee0.J(obj);
                    j jVar2 = (j) this.i;
                    CloudRepository cloudRepository2 = ((l6) this.g).b;
                    this.h = jVar2;
                    this.f = 1;
                    Object objDeviceRecoveryInfo = cloudRepository2.deviceRecoveryInfo(this);
                    if (objDeviceRecoveryInfo == z70Var2) {
                        return z70Var2;
                    }
                    obj = objDeviceRecoveryInfo;
                    jVar = jVar2;
                } else {
                    if (i2 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jVar = (j) this.h;
                    ee0.J(obj);
                }
                jVar.invoke(obj);
                return mf3.a;
            case 2:
                l6 l6Var2 = (l6) this.g;
                StateFlow stateFlow = l6Var2.c;
                z70 z70Var3 = z70.e;
                int i3 = this.f;
                if (i3 == 0) {
                    ee0.J(obj);
                    CloudAccount account2 = ((CloudAccountState) stateFlow.getValue()).getAccount();
                    String sessionId2 = account2 != null ? account2.getSessionId() : null;
                    CloudRepository cloudRepository3 = l6Var2.b;
                    this.h = sessionId2;
                    this.f = 1;
                    Object objGenerateGuestRecoveryCode = cloudRepository3.generateGuestRecoveryCode(this);
                    if (objGenerateGuestRecoveryCode == z70Var3) {
                        return z70Var3;
                    }
                    str = sessionId2;
                    obj = objGenerateGuestRecoveryCode;
                } else {
                    if (i3 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) this.h;
                    ee0.J(obj);
                }
                CloudGuestRecoveryCode cloudGuestRecoveryCode = (CloudGuestRecoveryCode) obj;
                if (((CloudAccountState) stateFlow.getValue()).getValidated()) {
                    CloudAccount account3 = ((CloudAccountState) stateFlow.getValue()).getAccount();
                    if (o51.f(account3 != null ? account3.getSessionId() : null, str)) {
                        ((f4) this.i).invoke(cloudGuestRecoveryCode.getCode());
                    }
                }
                return mf3.a;
            case 3:
                CloudAccountDevice cloudAccountDevice = (CloudAccountDevice) this.i;
                l6 l6Var3 = (l6) this.g;
                z70 z70Var4 = z70.e;
                int i4 = this.f;
                if (i4 == 0) {
                    ee0.J(obj);
                    CloudAccount account4 = ((CloudAccountState) l6Var3.c.getValue()).getAccount();
                    sessionId = account4 != null ? account4.getSessionId() : null;
                    CloudRepository cloudRepository4 = l6Var3.b;
                    this.h = sessionId;
                    this.f = 1;
                    if (cloudRepository4.removeAccountDevice(cloudAccountDevice, this) != z70Var4) {
                    }
                    return z70Var4;
                }
                if (i4 == 1) {
                    String str5 = (String) this.h;
                    ee0.J(obj);
                    sessionId = str5;
                } else {
                    if (i4 != 2) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) this.h;
                    ee0.J(obj);
                }
                List list2 = (List) obj;
                sessionId = str2;
                list = list2;
                if (((CloudAccountState) l6Var3.c.getValue()).getValidated()) {
                    account = ((CloudAccountState) l6Var3.c.getValue()).getAccount();
                    if (o51.f(account != null ? account.getSessionId() : null, sessionId)) {
                        l6Var3.s.setValue(list);
                    }
                }
                return mf3.a;
                if (!cloudAccountDevice.getCurrent()) {
                    CloudRepository cloudRepository5 = l6Var3.b;
                    this.h = sessionId;
                    this.f = 2;
                    Object objAccountDevices = cloudRepository5.accountDevices(this);
                    if (objAccountDevices != z70Var4) {
                        String str6 = sessionId;
                        obj = objAccountDevices;
                        str2 = str6;
                        List list3 = (List) obj;
                        sessionId = str2;
                        list = list3;
                    }
                    return z70Var4;
                }
                list = uj0.e;
                if (((CloudAccountState) l6Var3.c.getValue()).getValidated()) {
                    account = ((CloudAccountState) l6Var3.c.getValue()).getAccount();
                    if (o51.f(account != null ? account.getSessionId() : null, sessionId)) {
                        l6Var3.s.setValue(list);
                    }
                }
                return mf3.a;
            case 4:
                z70 z70Var5 = z70.e;
                int i5 = this.f;
                if (i5 == 0) {
                    ee0.J(obj);
                    Mutex mutex2 = ((ConfigManager) this.i).writeMutex;
                    ConfigManager configManager2 = (ConfigManager) this.i;
                    this.g = mutex2;
                    this.h = configManager2;
                    this.f = 1;
                    if (mutex2.lock(null, this) == z70Var5) {
                        return z70Var5;
                    }
                    mutex = mutex2;
                    configManager = configManager2;
                } else {
                    if (i5 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    configManager = (ConfigManager) this.h;
                    mutex = (Mutex) this.g;
                    ee0.J(obj);
                }
                try {
                    synchronized (configManager) {
                        configManager.stopGeocode();
                    }
                    JSONObject jSONObject = configManager.lastJson;
                    if (jSONObject != null) {
                        JSONObject jSONObjectPut = new JSONObject(jSONObject.toString()).put("active", false);
                        jSONObjectPut.getClass();
                        configManager.writeLocked(jSONObjectPut);
                    }
                    mutex.unlock(null);
                    return mf3.a;
                } catch (Throwable th) {
                    mutex.unlock(null);
                    throw th;
                }
            case Logger.WARN /* 5 */:
                ul1 ul1Var = (ul1) this.i;
                LocationRepository locationRepository = ul1Var.b;
                z70 z70Var6 = z70.e;
                int i6 = this.f;
                try {
                    if (i6 == 0) {
                        ee0.J(obj);
                        we2 we2Var2 = (we2) this.h;
                        Context context = ul1Var.j;
                        this.g = we2Var2;
                        this.f = 1;
                        Object objRecoverAfterBoot = locationRepository.recoverAfterBoot(context, this);
                        if (objRecoverAfterBoot == z70Var6) {
                            return z70Var6;
                        }
                        we2Var = we2Var2;
                        obj = objRecoverAfterBoot;
                    } else {
                        if (i6 != 1) {
                            if (i6 == 2) {
                                cancellationException = (CancellationException) ((Serializable) this.g);
                                ee0.J(obj);
                                throw cancellationException;
                            }
                            if (i6 != 3) {
                                fo.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            exc = (Exception) ((Serializable) this.g);
                            ee0.J(obj);
                            on1.f(ul1Var, exc);
                            return mf3.a;
                        }
                        we2Var = (we2) ((Serializable) this.g);
                        ee0.J(obj);
                    }
                    we2Var.e = obj;
                    ul1Var.i.syncFromSpoofingStateIfIdle();
                    break;
                } catch (CancellationException e) {
                    if (locationRepository.getHasLiveSimulation()) {
                        throw e;
                    }
                    this.g = e;
                    this.f = 2;
                    if (on1.h(ul1Var, this) != z70Var6) {
                        cancellationException = e;
                    }
                    return z70Var6;
                } catch (Exception e2) {
                    this.g = e2;
                    this.f = 3;
                    if (on1.h(ul1Var, this) != z70Var6) {
                        exc = e2;
                    }
                    return z70Var6;
                }
                return mf3.a;
            case Logger.ERROR /* 6 */:
                ul1 ul1Var2 = (ul1) this.h;
                z70 z70Var7 = z70.e;
                int i7 = this.f;
                try {
                    if (i7 == 0) {
                        ee0.J(obj);
                        LocationRepository locationRepository2 = ul1Var2.b;
                        t tVar = new t((AppState) this.i, 26);
                        this.f = 1;
                        obj = locationRepository2.patchConfig(tVar, this);
                        if (obj == z70Var7) {
                            return z70Var7;
                        }
                    } else {
                        if (i7 != 1) {
                            if (i7 != 2) {
                                fo.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            exc2 = (Exception) this.g;
                            ee0.J(obj);
                            on1.f(ul1Var2, exc2);
                            return mf3.a;
                        }
                        ee0.J(obj);
                    }
                    if (((Boolean) obj).booleanValue()) {
                        return mf3.a;
                    }
                    throw new IllegalStateException("运行配置发布失败");
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Exception e4) {
                    this.g = e4;
                    this.f = 2;
                    if (on1.h(ul1Var2, this) != z70Var7) {
                        exc2 = e4;
                    }
                    return z70Var7;
                }
            default:
                z70 z70Var8 = z70.e;
                int i8 = this.f;
                if (i8 != 0) {
                    if (i8 == 1) {
                        ee0.J(obj);
                        return obj;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                d62 d62Var = (d62) this.g;
                wb3 wb3Var = (wb3) this.h;
                pu0 pu0Var = (pu0) this.i;
                this.f = 1;
                Object objE = d62Var.e(wb3Var, pu0Var, this);
                return objE == z70Var8 ? z70Var8 : objE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g6(l6 l6Var, Object obj, q60 q60Var, int i) {
        super(1, q60Var);
        this.e = i;
        this.g = l6Var;
        this.i = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(ConfigManager configManager, q60 q60Var) {
        super(1, q60Var);
        this.e = 4;
        this.i = configManager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g6(Object obj, Object obj2, q60 q60Var, int i) {
        super(1, q60Var);
        this.e = i;
        this.h = obj;
        this.i = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(j jVar, l6 l6Var, q60 q60Var) {
        super(1, q60Var);
        this.e = 1;
        this.i = jVar;
        this.g = l6Var;
    }
}
