package defpackage;

import android.widget.Toast;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccount;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import com.vincenthzr.locationspoofer.data.cloud.CloudRuntimeBinding;
import com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorization;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.utils.ConfigManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import kotlinx.coroutines.sync.Mutex;
import org.json.JSONObject;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class c6 implements FlowCollector {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ c6(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object a(RuntimeAuthorization runtimeAuthorization, q60 q60Var) {
        f40 f40Var;
        Mutex mutex;
        ConfigManager configManager;
        ConfigManager configManager2 = (ConfigManager) this.f;
        if (q60Var instanceof f40) {
            f40Var = (f40) q60Var;
            int i = f40Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                f40Var.j = i - Integer.MIN_VALUE;
            } else {
                f40Var = new f40(this, q60Var);
            }
        } else {
            f40Var = new f40(this, q60Var);
        }
        Object obj = f40Var.h;
        int i2 = f40Var.j;
        try {
            if (i2 == 0) {
                ee0.J(obj);
                if (runtimeAuthorization != null) {
                    Mutex mutex2 = configManager2.writeMutex;
                    CoroutineScope coroutineScope = (CoroutineScope) this.g;
                    f40Var.e = mutex2;
                    f40Var.f = configManager2;
                    f40Var.g = coroutineScope;
                    f40Var.j = 1;
                    Object objLock = mutex2.lock(null, f40Var);
                    z70 z70Var = z70.e;
                    if (objLock == z70Var) {
                        return z70Var;
                    }
                    mutex = mutex2;
                }
                return mf3.a;
            }
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            configManager2 = f40Var.f;
            mutex = f40Var.e;
            ee0.J(obj);
            JSONObject jSONObject = configManager.lastJson;
            if (jSONObject != null) {
                if (!jSONObject.optBoolean("active", false)) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                        configManager.putPosition(jSONObject2, jSONObject.getDouble("lat"), jSONObject.getDouble("lng"));
                        configManager.writeLocked(jSONObject2);
                    } catch (Throwable unused) {
                    }
                }
            }
            return mf3.a;
        } finally {
            mutex.unlock(null);
        }
        configManager = configManager2;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01da  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, q60 q60Var) {
        CloudAccount account;
        CloudAccount account2;
        Object value;
        Object obj2;
        lw1 lw1Var;
        int i = this.e;
        z70 z70Var = z70.e;
        Object[] objArr = 0;
        mf3 mf3Var = mf3.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                CloudAccountState cloudAccountState = (CloudAccountState) obj;
                we2 we2Var = (we2) obj4;
                l6 l6Var = (l6) obj3;
                CloudAccount account3 = cloudAccountState.getAccount();
                String sessionId = account3 != null ? account3.getSessionId() : null;
                if (!cloudAccountState.getValidated() || (account2 = cloudAccountState.getAccount()) == null || account2.isGuest()) {
                    sessionId = null;
                }
                if (!o51.f(sessionId, we2Var.e)) {
                    l6Var.w.setValue(null);
                    l6Var.k.setValue(null);
                    l6Var.m.setValue(null);
                }
                we2Var.e = sessionId;
                if (!cloudAccountState.getValidated() || (account = cloudAccountState.getAccount()) == null || account.isGuest()) {
                    l6Var.s.setValue(uj0.e);
                }
                return mf3Var;
            case 1:
                return a((RuntimeAuthorization) obj, q60Var);
            case 2:
                s41 s41Var = (s41) obj;
                cg1 cg1Var = (cg1) obj3;
                sx1 sx1Var = (sx1) obj4;
                if ((s41Var instanceof ly0) || (s41Var instanceof jp0) || (s41Var instanceof vb2)) {
                    sx1Var.a(s41Var);
                } else if (s41Var instanceof my0) {
                    sx1Var.j(((my0) s41Var).a);
                } else if (s41Var instanceof kp0) {
                    sx1Var.j(((kp0) s41Var).a);
                } else if (s41Var instanceof wb2) {
                    sx1Var.j(((wb2) s41Var).a);
                } else if (s41Var instanceof ub2) {
                    sx1Var.j(((ub2) s41Var).a);
                }
                Object[] objArr2 = sx1Var.a;
                int i2 = sx1Var.b;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    s41 s41Var2 = (s41) objArr2[i4];
                    if (s41Var2 instanceof ly0) {
                        cg1Var.getClass();
                        i3 |= 2;
                    } else if (s41Var2 instanceof jp0) {
                        cg1Var.getClass();
                        i3 |= 1;
                    } else if (s41Var2 instanceof vb2) {
                        cg1Var.getClass();
                        i3 |= 4;
                    }
                }
                cg1Var.b.h(i3);
                return mf3Var;
            case 3:
                ul1 ul1Var = (ul1) obj3;
                we2 we2Var2 = (we2) obj4;
                CloudRuntimeBinding cloudRuntimeBinding = (CloudRuntimeBinding) ((i52) obj).e;
                if (cloudRuntimeBinding == null || ((obj2 = we2Var2.e) != null && !obj2.equals(cloudRuntimeBinding))) {
                    ul1Var.b.requestRuntimeStop(ul1Var.j);
                }
                we2Var2.e = cloudRuntimeBinding;
                long j = ul1Var.D + 1;
                ul1Var.D = j;
                Job job = ul1Var.C;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                CloudAccountState value2 = ul1Var.k.getAccountState().getValue();
                MutableStateFlow mutableStateFlow = ul1Var.x;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -6291457, 134217727, null)));
                if (value2.getValidated()) {
                    ul1Var.C = BuildersKt__Builders_commonKt.launch$default(am1.y(ul1Var), null, null, new tf0(ul1Var, j, value2, null, 2), 3, null);
                }
                return mf3Var;
            case 4:
                long jCurrentTimeMillis = System.currentTimeMillis();
                ve2 ve2Var = (ve2) obj4;
                if (jCurrentTimeMillis - ve2Var.e >= 10000) {
                    ve2Var.e = jCurrentTimeMillis;
                    Toast.makeText(((ul1) obj3).j, 2131624342, 1).show();
                }
                return mf3Var;
            case Logger.WARN /* 5 */:
                if (q60Var instanceof lw1) {
                    lw1Var = (lw1) q60Var;
                    int i5 = lw1Var.f;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        lw1Var.f = i5 - Integer.MIN_VALUE;
                    } else {
                        lw1Var = new lw1(this, q60Var);
                    }
                } else {
                    lw1Var = new lw1(this, q60Var);
                }
                Object obj5 = lw1Var.e;
                int i6 = lw1Var.f;
                if (i6 == 0) {
                    ee0.J(obj5);
                    FlowCollector flowCollector = (FlowCollector) obj4;
                    Set set = (Set) obj;
                    lt2 lt2Var = new lt2();
                    for (String str : (String[]) obj3) {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            if (s13.T(str, (String) it.next())) {
                                lt2Var.add(str);
                            }
                        }
                    }
                    lt2 lt2VarL = mc0.l(lt2Var);
                    lt2 lt2Var2 = lt2VarL.e.isEmpty() ? null : lt2VarL;
                    if (lt2Var2 != null) {
                        lw1Var.f = 1;
                        if (flowCollector.emit(lt2Var2, lw1Var) == z70Var) {
                            return z70Var;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ee0.J(obj5);
                }
                return mf3Var;
            case Logger.ERROR /* 6 */:
                s41 s41Var3 = (s41) obj;
                of ofVar = (of) obj4;
                if (!(s41Var3 instanceof xb2)) {
                    CoroutineScope coroutineScope = (CoroutineScope) obj3;
                    ax axVar = ofVar.x;
                    float f = 0.0f;
                    if (axVar == null) {
                        boolean z = ofVar.t;
                        ob0 ob0Var = ofVar.w;
                        axVar = new ax();
                        axVar.a = z;
                        axVar.b = ob0Var;
                        axVar.c = k22.a(0.0f, 0.01f);
                        axVar.d = new ArrayList();
                        ig0.z(ofVar);
                        ofVar.x = axVar;
                    }
                    ArrayList arrayList = (ArrayList) axVar.d;
                    if (s41Var3 instanceof ly0) {
                        arrayList.add(s41Var3);
                    } else if (s41Var3 instanceof my0) {
                        arrayList.remove(((my0) s41Var3).a);
                    } else if (s41Var3 instanceof jp0) {
                        arrayList.add(s41Var3);
                    } else if (s41Var3 instanceof kp0) {
                        arrayList.remove(((kp0) s41Var3).a);
                    } else if (s41Var3 instanceof mf0) {
                        arrayList.add(s41Var3);
                    } else if (s41Var3 instanceof nf0) {
                        arrayList.remove(((nf0) s41Var3).a);
                    } else if (s41Var3 instanceof lf0) {
                        arrayList.remove(((lf0) s41Var3).a);
                    }
                    s41 s41Var4 = (s41) zy.u0(arrayList);
                    if (!o51.f((s41) axVar.e, s41Var4)) {
                        if (s41Var4 != null) {
                            ((ob0) axVar.b).invoke();
                            boolean z2 = s41Var4 instanceof ly0;
                            if (z2) {
                                f = 0.08f;
                            } else if (s41Var4 instanceof jp0) {
                                f = 0.1f;
                            } else if (s41Var4 instanceof mf0) {
                                f = 0.16f;
                            }
                            od3 od3Var = th2.a;
                            if (!z2 && ((s41Var4 instanceof jp0) || (s41Var4 instanceof mf0))) {
                                od3Var = new od3(45, 0, lh0.c);
                            }
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new e90(axVar, f, od3Var, null), 3, null);
                        } else {
                            s41 s41Var5 = (s41) axVar.e;
                            od3 od3Var2 = th2.a;
                            if (!(s41Var5 instanceof ly0) && !(s41Var5 instanceof jp0) && (s41Var5 instanceof mf0)) {
                                od3Var2 = new od3(150, 0, lh0.c);
                            }
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new wr1(axVar, od3Var2, objArr == true ? 1 : 0, 14), 3, null);
                        }
                        axVar.e = s41Var4;
                    }
                } else if (ofVar.A) {
                    ofVar.m1((xb2) s41Var3);
                } else {
                    ofVar.B.a(s41Var3);
                }
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                c12 c12Var = (c12) obj;
                long j2 = c12Var.a;
                oh ohVar = (oh) obj4;
                if ((((c12) ohVar.d()).a & 9223372034707292159L) == 9205357640488583168L || (j2 & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (((c12) ohVar.d()).a & 4294967295L)) == Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                    Object objE = ohVar.e(c12Var, q60Var);
                    return objE == z70Var ? objE : mf3Var;
                }
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) obj3, null, null, new ch(ohVar, j2, null, 2), 3, null);
                return mf3Var;
            default:
                s41 s41Var6 = (s41) obj;
                ue2 ue2Var = (ue2) obj4;
                if (s41Var6 instanceof vb2) {
                    ue2Var.e++;
                } else if ((s41Var6 instanceof wb2) || (s41Var6 instanceof ub2)) {
                    ue2Var.e--;
                }
                boolean z3 = ue2Var.e > 0;
                ka3 ka3Var = (ka3) obj3;
                if (ka3Var.v != z3) {
                    ka3Var.v = z3;
                    ld0.z(ka3Var);
                }
                return mf3Var;
        }
    }
}
