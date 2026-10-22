package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.widget.Toast;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccount;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import com.vincenthzr.locationspoofer.data.cloud.CloudException;
import com.vincenthzr.locationspoofer.data.model.AppInfoItem;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.RoutePlanStage;
import com.vincenthzr.locationspoofer.data.model.WifiLoadStatus;
import com.vincenthzr.locationspoofer.data.motion.MotionController;
import com.vincenthzr.locationspoofer.data.repository.LocationRepository;
import com.vincenthzr.locationspoofer.utils.LSPosedManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class on1 {
    public static final boolean a(ul1 ul1Var) {
        ul1Var.getClass();
        Context context = ul1Var.j;
        if (Settings.canDrawOverlays(context)) {
            return true;
        }
        Toast.makeText(context, context.getString(2131624814), 1).show();
        context.startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName())).addFlags(268435456));
        return false;
    }

    public static final void b(ul1 ul1Var, AppState appState) {
        ul1Var.getClass();
        appState.getClass();
        if (!appState.getMockWifi() || appState.getCanMockWifi() || appState.getWifiLoadStatus() == WifiLoadStatus.ERROR) {
            return;
        }
        Toast.makeText(ul1Var.j, 2131624446, 0).show();
    }

    public static final void c(ul1 ul1Var, CloudAccountState cloudAccountState) throws CloudException {
        ul1Var.getClass();
        cloudAccountState.getClass();
        CloudAccountState value = ul1Var.k.getAccountState().getValue();
        if (cloudAccountState.getValidated() && value.getValidated()) {
            CloudAccount account = cloudAccountState.getAccount();
            String id = account != null ? account.getId() : null;
            CloudAccount account2 = value.getAccount();
            if (o51.f(id, account2 != null ? account2.getId() : null)) {
                CloudAccount account3 = cloudAccountState.getAccount();
                String sessionId = account3 != null ? account3.getSessionId() : null;
                CloudAccount account4 = value.getAccount();
                if (o51.f(sessionId, account4 != null ? account4.getSessionId() : null) && o51.f(cloudAccountState.getDeviceId(), value.getDeviceId()) && o51.f(cloudAccountState.getPublicKeyFingerprint(), value.getPublicKeyFingerprint())) {
                    return;
                }
            }
        }
        b81.w("login_required");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object d(ul1 ul1Var, r60 r60Var) {
        jn1 jn1Var;
        ArrayList arrayList;
        ul1 ul1Var2 = ul1Var;
        if (r60Var instanceof jn1) {
            jn1Var = (jn1) r60Var;
            int i = jn1Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                jn1Var.h = i - Integer.MIN_VALUE;
            } else {
                jn1Var = new jn1(r60Var);
            }
        } else {
            jn1Var = new jn1(r60Var);
        }
        Object obj = jn1Var.g;
        int i2 = jn1Var.h;
        mf3 mf3Var = mf3.a;
        z70 z70Var = z70.e;
        if (i2 == 0) {
            ee0.J(obj);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LSPosedManager lSPosedManager = ul1Var2.d;
            Context context = ul1Var2.j;
            List<AppInfoItem> hookedApps = lSPosedManager.getHookedApps(context);
            ArrayList arrayList2 = new ArrayList(az.Y(hookedApps, 10));
            Iterator<T> it = hookedApps.iterator();
            while (it.hasNext()) {
                arrayList2.add(((AppInfoItem) it.next()).getPackageName());
            }
            linkedHashSet.addAll(arrayList2);
            linkedHashSet.addAll(ul1Var2.c.getSystemHookPackages());
            Set setH0 = yo.H0(new String[]{context.getPackageName(), "android", "system", "system_server", "com.android.systemui", "com.android.phone", "com.android.bluetooth", "com.android.server.telecom", "com.xiaomi.metoknlp", "com.google.android.gms"});
            arrayList = new ArrayList();
            for (Object obj2 : linkedHashSet) {
                String str = (String) obj2;
                if (!l13.k0(str) && !setH0.contains(str)) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                LocationRepository locationRepository = ul1Var2.b;
                jn1Var.e = ul1Var2;
                jn1Var.f = arrayList;
                jn1Var.h = 1;
                if (locationRepository.checkRootAccess(jn1Var) != z70Var) {
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ee0.J(obj);
                return mf3Var;
            }
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ArrayList arrayList3 = jn1Var.f;
        ul1 ul1Var3 = jn1Var.e;
        ee0.J(obj);
        arrayList = arrayList3;
        ul1Var2 = ul1Var3;
        LocationRepository locationRepository2 = ul1Var2.b;
        jn1Var.e = null;
        jn1Var.f = null;
        jn1Var.h = 2;
        return locationRepository2.forceStopApps(arrayList, jn1Var) == z70Var ? z70Var : mf3Var;
    }

    public static final void e(ul1 ul1Var, boolean z) {
        MotionController motionController;
        ul1Var.getClass();
        MotionController motionController2 = ul1Var.i;
        if (!z || a(ul1Var)) {
            ul1Var.c.setFixedJoystickEnabled(z);
            MutableStateFlow mutableStateFlow = ul1Var.x;
            while (true) {
                Object value = mutableStateFlow.getValue();
                motionController = motionController2;
                MutableStateFlow mutableStateFlow2 = mutableStateFlow;
                if (mutableStateFlow2.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, z, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1025, -1, 134217727, null))) {
                    break;
                }
                mutableStateFlow = mutableStateFlow2;
                motionController2 = motionController;
            }
            MotionController.State value2 = motionController.getState().getValue();
            if (value2.getHasRoute()) {
                return;
            }
            if (!z && value2.getActive()) {
                motionController.joystick(0.0d, 0.0f);
            }
            ul1Var.b.setFloatingJoystickVisible(ul1Var.j, z, true);
        }
    }

    public static final void f(ul1 ul1Var, Exception exc) {
        String code;
        ul1Var.getClass();
        exc.getClass();
        CloudException cloudException = exc instanceof CloudException ? (CloudException) exc : null;
        if (cloudException == null || (code = cloudException.getCode()) == null) {
            code = "service_unavailable";
        }
        Toast.makeText(ul1Var.j, code.equals("runtime_authorization_required") ? 2131624218 : ji2.A(code), 1).show();
    }

    public static final void g(ul1 ul1Var) {
        Object value;
        AppState appState;
        ul1Var.getClass();
        MutableStateFlow mutableStateFlow = ul1Var.x;
        if (((AppState) mutableStateFlow.getValue()).isSavingCollectionInfo()) {
            return;
        }
        do {
            value = mutableStateFlow.getValue();
            appState = (AppState) value;
        } while (!mutableStateFlow.compareAndSet(value, AppState.copy$default(appState, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, zy.i0(appState.getPendingCollectionLocations(), 1), false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -67108865, 134217727, null)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object h(ul1 ul1Var, r60 r60Var) {
        kn1 kn1Var;
        Object value;
        ul1 ul1Var2 = ul1Var;
        if (r60Var instanceof kn1) {
            kn1Var = (kn1) r60Var;
            int i = kn1Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                kn1Var.g = i - Integer.MIN_VALUE;
            } else {
                kn1Var = new kn1(r60Var);
            }
        } else {
            kn1Var = new kn1(r60Var);
        }
        Object obj = kn1Var.f;
        int i2 = kn1Var.g;
        q60 q60Var = null;
        int i3 = 1;
        if (i2 == 0) {
            ee0.J(obj);
            NonCancellable nonCancellable = NonCancellable.INSTANCE;
            ol1 ol1Var = new ol1(ul1Var2, q60Var, i3);
            kn1Var.e = ul1Var2;
            kn1Var.g = 1;
            Object objWithContext = BuildersKt.withContext(nonCancellable, ol1Var, kn1Var);
            z70 z70Var = z70.e;
            if (objWithContext == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ul1Var2 = kn1Var.e;
            ee0.J(obj);
        }
        ul1Var2.i.onStopped();
        ul1Var2.c.setSpoofingActive(false);
        MutableStateFlow mutableStateFlow = ul1Var2.x;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, RoutePlanStage.IDLE, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1610612737, -513, 134217727, null)));
        return mf3.a;
    }

    public static final void i(ul1 ul1Var) {
        if (((AppState) ul1Var.x.getValue()).isSpoofingActive()) {
            ul1Var.t.launch(new g6(ul1Var, (AppState) ul1Var.x.getValue(), (q60) null, 6));
        }
    }

    public static final void j(ul1 ul1Var) {
        Object value;
        Object value2;
        ul1Var.getClass();
        MutableStateFlow mutableStateFlow = ul1Var.x;
        AppState appState = (AppState) mutableStateFlow.getValue();
        if (!appState.isStoppingCollection() && appState.getPendingCollectionLocations().isEmpty() && appState.getPendingCollectionRoute() == null) {
            if (appState.isSpoofingActive()) {
                Context context = ul1Var.j;
                Toast.makeText(context, context.getString(2131625062), 0).show();
                return;
            }
            if (appState.isContinuousScanning()) {
                do {
                    value2 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value2, AppState.copy$default((AppState) value2, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, true, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -50331649, 134217727, null)));
                Job job = ul1Var.B;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    return;
                }
                return;
            }
            if (!appState.isRouteCollection() || (!appState.isDrawingCollectionRoute() && appState.getCollectionRoutePoints().size() >= 2)) {
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, true, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -16777217, 134217699, null)));
                ul1Var.B = BuildersKt__Builders_commonKt.launch$default(am1.y(ul1Var), Dispatchers.getIO(), null, new nn1(appState, ul1Var, null), 2, null);
            }
        }
    }

    public static final void k(ul1 ul1Var) {
        ul1Var.getClass();
        MutableStateFlow mutableStateFlow = ul1Var.x;
        boolean z = !((AppState) mutableStateFlow.getValue()).getEnableJitter();
        ul1Var.c.setEnableJitter(z);
        while (true) {
            Object value = mutableStateFlow.getValue();
            boolean z2 = z;
            if (mutableStateFlow.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, z2, false, null, 0, null, false, false, false, null, null, -1, -1, 134086655, null))) {
                i(ul1Var);
                return;
            }
            z = z2;
        }
    }

    public static final void l(ul1 ul1Var) {
        ul1Var.getClass();
        MutableStateFlow mutableStateFlow = ul1Var.x;
        boolean z = !((AppState) mutableStateFlow.getValue()).getMockBluetooth();
        ul1Var.c.setMockBluetooth(z);
        while (true) {
            Object value = mutableStateFlow.getValue();
            boolean z2 = z;
            if (mutableStateFlow.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, z2, false, false, null, 0, null, false, false, false, null, null, -1, -1, 134152191, null))) {
                i(ul1Var);
                return;
            }
            z = z2;
        }
    }

    public static final void m(ul1 ul1Var) {
        ul1Var.getClass();
        MutableStateFlow mutableStateFlow = ul1Var.x;
        boolean z = !((AppState) mutableStateFlow.getValue()).getMockCell();
        ul1Var.c.setMockCell(z);
        while (true) {
            Object value = mutableStateFlow.getValue();
            boolean z2 = z;
            if (mutableStateFlow.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, z2, false, false, false, null, 0, null, false, false, false, null, null, -1, -1, 134184959, null))) {
                i(ul1Var);
                return;
            }
            z = z2;
        }
    }

    public static final void n(ul1 ul1Var) {
        ul1Var.getClass();
        MutableStateFlow mutableStateFlow = ul1Var.x;
        boolean z = !((AppState) mutableStateFlow.getValue()).getMockWifi();
        ul1Var.c.setMockWifi(z);
        while (true) {
            Object value = mutableStateFlow.getValue();
            boolean z2 = z;
            if (mutableStateFlow.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, z2, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -1, 134201343, null))) {
                i(ul1Var);
                return;
            }
            z = z2;
        }
    }
}
