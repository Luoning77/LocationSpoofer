package defpackage;

import android.bluetooth.le.BluetoothLeScanner;
import android.view.InputDevice;
import android.view.KeyEvent;
import com.vincenthzr.locationspoofer.data.cloud.CloudArchive;
import com.vincenthzr.locationspoofer.data.cloud.RewardDevice;
import com.vincenthzr.locationspoofer.data.model.AppInfoItem;
import com.vincenthzr.locationspoofer.data.model.AppState;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class l3 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ l3(int i, Object obj, Object obj2) {
        this.e = i;
        this.g = obj;
        this.f = obj2;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        long j;
        q60 q60Var = null;
        boolean zH = false;
        switch (this.e) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                CloudArchive cloudArchive = (CloudArchive) this.g;
                ey1 ey1Var = (ey1) this.f;
                ey1Var.setValue(zBooleanValue ? pt2.O((Set) ey1Var.getValue(), cloudArchive.getId()) : pt2.L((Set) ey1Var.getValue(), cloudArchive.getId()));
                return mf3.a;
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                String str = (String) this.g;
                ey1 ey1Var2 = (ey1) this.f;
                ey1Var2.setValue(zBooleanValue2 ? pt2.O((Set) ey1Var2.getValue(), str) : pt2.L((Set) ey1Var2.getValue(), str));
                return mf3.a;
            case 2:
                return ((v1) this.g).invoke(((List) this.f).get(((Number) obj).intValue()));
            case 3:
                return ((v1) this.g).invoke(((ArrayList) this.f).get(((Number) obj).intValue()));
            case 4:
                ((Boolean) obj).getClass();
                ((ey1) this.f).setValue(((RewardDevice) this.g).getId());
                return mf3.a;
            case Logger.WARN /* 5 */:
                return ((v1) this.g).invoke(((List) this.f).get(((Number) obj).intValue()));
            case Logger.ERROR /* 6 */:
                return ((v1) this.g).invoke(((List) this.f).get(((Number) obj).intValue()));
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return ((v1) this.g).invoke(((List) this.f).get(((Number) obj).intValue()));
            case 8:
                return ((v1) this.g).invoke(((List) this.f).get(((Number) obj).intValue()));
            case mc0.b /* 9 */:
                KeyEvent keyEvent = ((e91) obj).a;
                if (((me1) this.g).a() == dx0.f && keyEvent.getKeyCode() == 4 && mh0.L(keyEvent) == 1) {
                    ((x73) this.f).d(null);
                    zH = true;
                }
                return Boolean.valueOf(zH);
            case mc0.c /* 10 */:
                jg0 jg0Var = (jg0) obj;
                jg0Var.getClass();
                xb0 xb0VarL = jg0Var.X().l();
                jg0Var.X().D((xb0) this.g);
                try {
                    cg0 cg0Var = (cg0) this.f;
                    cg0Var.q1(jg0Var, cg0Var.D);
                    return mf3.a;
                } finally {
                    jg0Var.X().D(xb0VarL);
                }
            case 11:
                try {
                    ((BluetoothLeScanner) this.g).stopScan((nl0) this.f);
                    break;
                } catch (Exception unused) {
                }
                return mf3.a;
            case mc0.d /* 12 */:
                rx2 rx2Var = (rx2) obj;
                synchronized (tx2.c) {
                    j = tx2.e;
                    tx2.e = 1 + j;
                }
                return new dy1(j, rx2Var, (lu0) this.g, (lu0) this.f);
            case 13:
                ha1 ha1Var = (ha1) this.g;
                Object obj2 = ha1Var.b;
                CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.f;
                synchronized (obj2) {
                    ((ArrayList) ha1Var.c).remove(cancellableContinuationImpl);
                }
                return mf3.a;
            case 14:
                return ((zs0) this.g).invoke(((List) this.f).get(((Number) obj).intValue()));
            case a83.e /* 15 */:
                return ((zs0) this.g).invoke(((List) this.f).get(((Number) obj).intValue()));
            case 16:
                return ((yk1) this.g).invoke(((List) this.f).get(((Number) obj).intValue()));
            case 17:
                return ((yk1) this.g).invoke(((List) this.f).get(((Number) obj).intValue()));
            case 18:
                return ((yk1) this.g).invoke(((List) this.f).get(((Number) obj).intValue()));
            case 19:
                return ((yk1) this.g).invoke(((List) this.f).get(((Number) obj).intValue()));
            case 20:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                ul1 ul1Var = (ul1) this.g;
                String packageName = ((AppInfoItem) this.f).getPackageName();
                ul1Var.getClass();
                packageName.getClass();
                MutableStateFlow mutableStateFlow = ul1Var.x;
                Set<String> setM0 = zy.M0(((AppState) mutableStateFlow.getValue()).getSystemHookPackages());
                if (zBooleanValue3) {
                    setM0.add(packageName);
                } else {
                    setM0.remove(packageName);
                }
                ul1Var.c.setSystemHookPackages(setM0);
                while (true) {
                    Object value = mutableStateFlow.getValue();
                    Set<String> set = setM0;
                    if (mutableStateFlow.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, set, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -1, 134217663, null))) {
                        if (((AppState) mutableStateFlow.getValue()).isSpoofingActive()) {
                            BuildersKt__Builders_commonKt.launch$default(am1.y(ul1Var), null, null, new sl1(ul1Var, q60Var, 13), 3, null);
                        }
                        return mf3.a;
                    }
                    setM0 = set;
                }
                break;
            case 21:
                return ((ym2) this.g).invoke(((List) this.f).get(((Number) obj).intValue()));
            case 22:
                ((ym2) this.g).invoke(((List) this.f).get(((Number) obj).intValue()));
                return "app";
            default:
                KeyEvent keyEvent2 = ((e91) obj).a;
                op0 op0Var = (op0) this.g;
                InputDevice device = keyEvent2.getDevice();
                if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent2.getSource() == 33554433) && mh0.L(keyEvent2) == 2 && keyEvent2.getSource() != 257)) {
                    if (x63.e(19, keyEvent2)) {
                        zH = ((rp0) op0Var).h(5, true);
                    } else if (x63.e(20, keyEvent2)) {
                        zH = ((rp0) op0Var).h(6, true);
                    } else if (x63.e(21, keyEvent2)) {
                        zH = ((rp0) op0Var).h(3, true);
                    } else if (x63.e(22, keyEvent2)) {
                        zH = ((rp0) op0Var).h(4, true);
                    } else if (x63.e(23, keyEvent2)) {
                        ny2 ny2Var = ((me1) this.f).c;
                        if (ny2Var != null) {
                            ((nb0) ny2Var).b();
                        }
                        zH = true;
                    }
                }
                return Boolean.valueOf(zH);
        }
    }
}
