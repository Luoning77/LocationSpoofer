package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.Toast;
import com.vincenthzr.locationspoofer.data.db.BluetoothDevice;
import com.vincenthzr.locationspoofer.data.db.CellDevice;
import com.vincenthzr.locationspoofer.data.db.EnvironmentDao_Impl;
import com.vincenthzr.locationspoofer.data.db.LocationBluetooth;
import com.vincenthzr.locationspoofer.data.db.LocationCell;
import com.vincenthzr.locationspoofer.data.db.LocationConnectedWifi;
import com.vincenthzr.locationspoofer.data.db.LocationWifi;
import com.vincenthzr.locationspoofer.data.db.WifiDevice;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.SavedLocation;
import com.vincenthzr.locationspoofer.data.repository.SettingsRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.future.FutureKt;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class j implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ j(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        Object value;
        int i = this.e;
        int i2 = 1;
        mf3 mf3Var = mf3.a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                ((ix1) obj3).b((ub2) obj2);
                return mf3Var;
            case 1:
                String str = (String) obj;
                str.getClass();
                ((ka) ((ay) obj3)).b(new dj(str));
                Toast.makeText((Context) obj2, 2131624246, 1).show();
                return mf3Var;
            case 2:
                ((ag0) obj).getClass();
                return ux0.a((ux0) obj3, ((j90) obj2).a(), null, 5);
            case 3:
                Context context = (Context) obj3;
                String str2 = (String) obj2;
                ImageView imageView = (ImageView) obj;
                imageView.getClass();
                try {
                    Drawable applicationIcon = context.getPackageManager().getApplicationIcon(str2);
                    applicationIcon.getClass();
                    imageView.setImageDrawable(applicationIcon);
                    break;
                } catch (Exception unused) {
                    imageView.setImageDrawable(null);
                }
                return mf3Var;
            case 4:
                up upVar = (up) obj3;
                vp vpVar = (vp) obj2;
                ga3 ga3Var = upVar.s;
                if (ga3Var != null) {
                    ga3Var.b();
                }
                upVar.s = null;
                CompletableDeferred completableDeferred = vpVar.b;
                if (completableDeferred != null) {
                    completableDeferred.complete(mf3Var);
                }
                vpVar.b = null;
                return mf3Var;
            case Logger.WARN /* 5 */:
                st stVar = (st) obj2;
                jb1 jb1Var = (jb1) obj;
                jb1Var.c();
                jg0.K(jb1Var, (re) obj3, stVar, 0.0f, null, 60);
                return mf3Var;
            case Logger.ERROR /* 6 */:
                jb1 jb1Var2 = (jb1) obj;
                jb1Var2.c();
                jg0.K(jb1Var2, ((z32) obj3).i, (st) obj2, 0.0f, null, 60);
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                ((dt) obj3).a.j((x50) obj2);
                return mf3Var;
            case 8:
                se2 se2Var = (se2) obj2;
                boolean z = se2Var.e || ((yv0) obj).h0((s11) obj3);
                se2Var.e = z;
                return Boolean.valueOf(!z);
            case mc0.b /* 9 */:
                se2 se2Var2 = (se2) obj2;
                boolean z2 = se2Var2.e || ((yv0) obj).w((x92) obj3);
                se2Var2.e = z2;
                return Boolean.valueOf(!z2);
            case mc0.c /* 10 */:
                me1 me1Var = (me1) obj3;
                st stVar2 = (st) obj2;
                jb1 jb1Var3 = (jb1) obj;
                jb1Var3.c();
                if (((Boolean) me1Var.s.getValue()).booleanValue() || ((Boolean) me1Var.t.getValue()).booleanValue()) {
                    jg0.P0(jb1Var3, stVar2, 0L, 0L, 0.0f, null, 0, 126);
                }
                return mf3Var;
            case 11:
                ga0 ga0Var = (ga0) obj3;
                uf0 uf0Var = (uf0) obj2;
                long jF = c12.f(uf0Var.S ? -1.0f : 1.0f, ((me0) obj).a);
                x32 x32Var = uf0Var.O;
                rf0 rf0Var = sf0.a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (x32Var == x32.e ? jF & 4294967295L : jF >> 32));
                switch (ga0Var.a) {
                    case 0:
                        ((ha0) ga0Var.b).a.invoke(Float.valueOf(fIntBitsToFloat));
                        return mf3Var;
                    default:
                        ((ex2) ga0Var.b).b(fIntBitsToFloat);
                        return mf3Var;
                }
            case mc0.d /* 12 */:
                cg0 cg0Var = (cg0) obj3;
                h82 h82Var = (h82) obj2;
                g82 g82Var = (g82) obj;
                g82Var.getClass();
                if (cg0Var.z) {
                    g82.F(g82Var, h82Var, 0L, cg0Var.H, 2);
                } else {
                    g82.A(g82Var, h82Var, 0L);
                }
                return mf3Var;
            case 13:
                return EnvironmentDao_Impl.insertConnectedWifi$lambda$1((EnvironmentDao_Impl) obj3, (LocationConnectedWifi) obj2, (zk2) obj);
            case 14:
                return EnvironmentDao_Impl.insertLocationCell$lambda$4((EnvironmentDao_Impl) obj3, (LocationCell) obj2, (zk2) obj);
            case a83.e /* 15 */:
                return EnvironmentDao_Impl.insertLocationBluetooth$lambda$3((EnvironmentDao_Impl) obj3, (LocationBluetooth) obj2, (zk2) obj);
            case 16:
                return EnvironmentDao_Impl.deleteLocations$lambda$33((String) obj3, (List) obj2, (zk2) obj);
            case 17:
                return EnvironmentDao_Impl.insertBluetoothDevice$lambda$9((EnvironmentDao_Impl) obj3, (BluetoothDevice) obj2, (zk2) obj);
            case 18:
                return EnvironmentDao_Impl.insertCellDevice$lambda$10((EnvironmentDao_Impl) obj3, (CellDevice) obj2, (zk2) obj);
            case 19:
                return EnvironmentDao_Impl.insertLocationWifi$lambda$2((EnvironmentDao_Impl) obj3, (LocationWifi) obj2, (zk2) obj);
            case 20:
                return EnvironmentDao_Impl.insertWifiDevice$lambda$8((EnvironmentDao_Impl) obj3, (WifiDevice) obj2, (zk2) obj);
            case 21:
                ((ix1) obj3).b((s41) obj2);
                return mf3Var;
            case 22:
                return FutureKt.asCompletableFuture$lambda$1((CompletableFuture) obj3, (Deferred) obj2, (Throwable) obj);
            case 23:
                return HandlerContext.scheduleResumeAfterDelay$lambda$2((HandlerContext) obj3, (ub) obj2, (Throwable) obj);
            case 24:
                g21 g21Var = (g21) obj3;
                e21 e21Var = (e21) obj2;
                g21Var.a.b(e21Var);
                g21Var.b.setValue(Boolean.TRUE);
                return new nn(i2, g21Var, e21Var);
            case 25:
                be1 be1Var = (be1) obj3;
                be1Var.g.i(obj2);
                return new nn(2, be1Var, obj2);
            case 26:
                return new be1((tl2) obj3, (Map) obj, (ql2) obj2);
            case 27:
                g82 g82Var2 = (g82) obj;
                ArrayList arrayListI = ym3.I((List) obj3, (au0) ((kg1) obj2).b);
                if (arrayListI != null) {
                    int size = arrayListI.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        i52 i52Var = (i52) arrayListI.get(i3);
                        h82 h82Var2 = (h82) i52Var.e;
                        au0 au0Var = (au0) i52Var.f;
                        g82.A(g82Var2, h82Var2, au0Var != null ? ((h41) au0Var.invoke()).a : 0L);
                    }
                }
                return mf3Var;
            case 28:
                List list = (List) obj;
                list.getClass();
                ((lu0) obj3).invoke(new mz2(list, true, (String) obj2));
                return mf3Var;
            default:
                ul1 ul1Var = (ul1) obj3;
                lu0 lu0Var = (lu0) obj2;
                String str3 = (String) obj;
                str3.getClass();
                ul1Var.getClass();
                SettingsRepository settingsRepository = ul1Var.c;
                MutableStateFlow mutableStateFlow = ul1Var.x;
                Double dR = r13.R(((AppState) mutableStateFlow.getValue()).getLongitudeInput());
                if (dR != null) {
                    double dDoubleValue = dR.doubleValue();
                    Double dR2 = r13.R(((AppState) mutableStateFlow.getValue()).getLatitudeInput());
                    if (dR2 != null) {
                        double dDoubleValue2 = dR2.doubleValue();
                        AppState appState = (AppState) mutableStateFlow.getValue();
                        settingsRepository.addSavedLocation(new SavedLocation(str3, dDoubleValue2, dDoubleValue, appState.getCollectedWifiJson(), appState.getCollectedCellJson(), appState.getCollectedBluetoothJson(), (Long) null, (String) null, (String) null, 448, (ca0) null));
                        do {
                            value = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, settingsRepository.getSavedLocations(), null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -5, 134217727, null)));
                    }
                }
                lu0Var.invoke(new jz2(false));
                return mf3Var;
        }
    }
}
