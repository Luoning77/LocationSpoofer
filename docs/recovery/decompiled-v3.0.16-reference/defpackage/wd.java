package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.vincenthzr.locationspoofer.data.cloud.MembershipPaymentUrls;
import com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorization;
import com.vincenthzr.locationspoofer.data.cloud.RuntimeServiceOwnership;
import com.vincenthzr.locationspoofer.service.FloatingJoystickService;
import com.vincenthzr.locationspoofer.service.SpoofingService;
import com.vincenthzr.locationspoofer.utils.ConfigManager;
import io.github.libxposed.service.XposedService;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.sync.Mutex;
import org.json.JSONObject;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wd implements FlowCollector {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ wd(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object a(XposedService xposedService, q60 q60Var) {
        g40 g40Var;
        Mutex mutex;
        ConfigManager configManager = (ConfigManager) this.f;
        if (q60Var instanceof g40) {
            g40Var = (g40) q60Var;
            int i = g40Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                g40Var.j = i - Integer.MIN_VALUE;
            } else {
                g40Var = new g40(this, q60Var);
            }
        } else {
            g40Var = new g40(this, q60Var);
        }
        Object obj = g40Var.h;
        int i2 = g40Var.j;
        try {
            if (i2 == 0) {
                ee0.J(obj);
                if (xposedService != null) {
                    mutex = configManager.writeMutex;
                    g40Var.e = xposedService;
                    g40Var.f = mutex;
                    g40Var.g = configManager;
                    g40Var.j = 1;
                    Object objLock = mutex.lock(null, g40Var);
                    z70 z70Var = z70.e;
                    if (objLock == z70Var) {
                        return z70Var;
                    }
                }
                return mf3.a;
            }
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            configManager = g40Var.g;
            Mutex mutex2 = g40Var.f;
            XposedService xposedService2 = g40Var.e;
            ee0.J(obj);
            mutex = mutex2;
            xposedService = xposedService2;
            configManager.publisher.a = true;
            JSONObject jSONObject = configManager.lastJson;
            if (jSONObject != null) {
                configManager.publishLocked(jSONObject, xposedService);
            }
            return mf3.a;
        } finally {
            mutex.unlock(null);
        }
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, q60 q60Var) {
        Object value;
        Object wg2Var;
        boolean z;
        boolean z2;
        boolean z3;
        yz2 yz2Var;
        int i = this.e;
        boolean z4 = false;
        mf3 mf3Var = mf3.a;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                d31 d31Var = (d31) obj2;
                if (Build.VERSION.SDK_INT >= 34) {
                    d31Var.t().startStylusHandwriting((View) d31Var.f);
                }
                return mf3Var;
            case 1:
                return a((XposedService) obj, q60Var);
            case 2:
                FloatingJoystickService floatingJoystickService = (FloatingJoystickService) obj2;
                if (((RuntimeAuthorization) obj) == null && !floatingJoystickService.keepIdleWindow) {
                    floatingJoystickService.stopSelf();
                }
                return mf3Var;
            case 3:
                i52 i52Var = (i52) obj;
                List list = (List) i52Var.e;
                List list2 = (List) i52Var.f;
                MutableStateFlow mutableStateFlow = ((lo1) obj2).c;
                do {
                    value = mutableStateFlow.getValue();
                    ((fo1) value).getClass();
                    list.getClass();
                    list2.getClass();
                } while (!mutableStateFlow.compareAndSet(value, new fo1(list, list2, false)));
                return mf3Var;
            case 4:
                as1 as1Var = (as1) obj;
                Context context = (Context) obj2;
                String payUrl = as1Var.a.getPayUrl();
                if (o51.f(as1Var.a.getCheckoutMode(), "alipay_app") && payUrl != null) {
                    context.getClass();
                    try {
                        MembershipPaymentUrls.INSTANCE.validate(payUrl);
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("alipays://platformapi/startapp?appId=20000067&url=" + Uri.encode(payUrl))).setPackage("com.eg.android.AlipayGphone");
                        intent.getClass();
                        context.startActivity(intent.addFlags(268435456));
                        wg2Var = mf3Var;
                    } catch (Throwable th) {
                        wg2Var = new wg2(th);
                    }
                    Throwable thA = xg2.a(wg2Var);
                    if (thA != null) {
                        Log.w("MembershipPayment", "launch_failed type=".concat(thA.getClass().getSimpleName()));
                    }
                    if (wg2Var instanceof wg2) {
                        Toast.makeText(context, 2131624734, 0).show();
                    }
                }
                return mf3Var;
            case Logger.WARN /* 5 */:
                s41 s41Var = (s41) obj;
                fu1 fu1Var = (fu1) obj2;
                boolean z5 = fu1Var.u;
                boolean z6 = fu1Var.v;
                boolean z7 = fu1Var.w;
                if (s41Var instanceof vb2) {
                    fu1Var.u = true;
                    z2 = z6;
                    z3 = z7;
                    z = true;
                } else {
                    if ((s41Var instanceof wb2) || (s41Var instanceof ub2)) {
                        fu1Var.u = false;
                        z = false;
                        z2 = z6;
                    } else {
                        if (!(s41Var instanceof ly0)) {
                            if (s41Var instanceof my0) {
                                fu1Var.v = false;
                                z = z5;
                                z2 = false;
                            } else if (s41Var instanceof jp0) {
                                fu1Var.w = true;
                                z = z5;
                                z2 = z6;
                                z3 = true;
                            } else if (s41Var instanceof kp0) {
                                fu1Var.w = false;
                                z = z5;
                                z3 = false;
                                z2 = z6;
                            }
                            return mf3Var;
                        }
                        fu1Var.v = true;
                        z = z5;
                        z3 = z7;
                        z2 = true;
                    }
                    z3 = z7;
                }
                if (z5 != z) {
                    yz2Var = z ? hu1.a : hu1.b;
                } else {
                    if (z6 == z2) {
                        if (z7 != z3) {
                            yz2Var = z3 ? hu1.c : hu1.d;
                        }
                        return mf3Var;
                    }
                    yz2Var = z2 ? hu1.c : hu1.d;
                }
                if (z5 && !z) {
                    z4 = true;
                }
                float f = z2 ? 0.06f : 0.0f;
                if (z3) {
                    f += 0.08f;
                }
                if (z) {
                    f += 0.1f;
                }
                float f2 = f;
                q60 q60Var2 = null;
                if (z4 || f2 == 0.0f) {
                    Job job = fu1Var.z;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    fu1Var.z = BuildersKt__Builders_commonKt.launch$default(fu1Var.a1(), null, null, new eu1(fu1Var, f2, yz2Var, q60Var2, 0), 3, null);
                } else {
                    Job job2 = fu1Var.y;
                    if (job2 != null) {
                        Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                    }
                    Job job3 = fu1Var.z;
                    if (job3 != null) {
                        Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
                    }
                    fu1Var.y = BuildersKt__Builders_commonKt.launch$default(fu1Var.a1(), null, null, new eu1(fu1Var, f2, yz2Var, q60Var2, 1), 3, null);
                }
                return mf3Var;
            case Logger.ERROR /* 6 */:
                ((mv1) obj2).g.h(((Number) obj).floatValue());
                return mf3Var;
            default:
                SpoofingService spoofingService = (SpoofingService) obj2;
                if (((RuntimeAuthorization) obj) == null) {
                    RuntimeServiceOwnership runtimeServiceOwnership = SpoofingService.ownership;
                    Object obj3 = spoofingService.ownerToken;
                    Long l = spoofingService.runGeneration;
                    RuntimeAuthorization value2 = spoofingService.getRuntimeAuthorization().getAuthorization().getValue();
                    if (runtimeServiceOwnership.shouldCloseAfterNull(obj3, l, value2 != null ? new Long(value2.getRunGeneration()) : null)) {
                        spoofingService.closeOwnResources();
                    }
                }
                return mf3Var;
        }
    }
}
