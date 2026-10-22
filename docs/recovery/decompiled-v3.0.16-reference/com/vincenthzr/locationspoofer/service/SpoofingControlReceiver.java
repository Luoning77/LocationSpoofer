package com.vincenthzr.locationspoofer.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.vincenthzr.locationspoofer.data.model.SavedLocation;
import com.vincenthzr.locationspoofer.data.repository.LocationRepository;
import com.vincenthzr.locationspoofer.data.repository.SettingsRepository;
import defpackage.ce1;
import defpackage.dz2;
import defpackage.ee0;
import defpackage.ez2;
import defpackage.fo;
import defpackage.gn;
import defpackage.ig0;
import defpackage.j9;
import defpackage.mf3;
import defpackage.q60;
import defpackage.r60;
import defpackage.t3;
import defpackage.uj0;
import defpackage.w91;
import defpackage.z70;
import defpackage.zb1;
import defpackage.zy;
import java.util.Map;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SpoofingControlReceiver extends BroadcastReceiver implements w91 {
    public static final /* synthetic */ int c = 0;
    public final zb1 a;
    public final zb1 b;

    public SpoofingControlReceiver() {
        ez2 ez2Var = new ez2(this, 0);
        ce1 ce1Var = ce1.e;
        this.a = ig0.A(ce1Var, ez2Var);
        this.b = ig0.A(ce1Var, new ez2(this, 1));
    }

    @Override // defpackage.w91
    public final gn a() {
        gn gnVar = j9.O;
        if (gnVar != null) {
            return gnVar;
        }
        fo.n("KoinApplication has not been started");
        return null;
    }

    public final SettingsRepository b() {
        return (SettingsRepository) this.b.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object c(Context context, Intent intent, r60 r60Var) {
        dz2 dz2Var;
        SavedLocation savedLocation;
        if (r60Var instanceof dz2) {
            dz2Var = (dz2) r60Var;
            int i = dz2Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                dz2Var.h = i - Integer.MIN_VALUE;
            } else {
                dz2Var = new dz2(this, r60Var);
            }
        } else {
            dz2Var = new dz2(this, r60Var);
        }
        Object obj = dz2Var.f;
        int i2 = dz2Var.h;
        mf3 mf3Var = mf3.a;
        if (i2 == 0) {
            ee0.J(obj);
            savedLocation = (SavedLocation) zy.p0(b().getSavedLocations(), intent.getIntExtra("favorite", -1));
            if (savedLocation == null) {
                return mf3Var;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            LocationRepository locationRepository = (LocationRepository) this.a.getValue();
            double lat = savedLocation.getLat();
            double lng = savedLocation.getLng();
            Map<String, String> appCoordinateSystems = b().getAppCoordinateSystems();
            String wifiJson = savedLocation.getWifiJson();
            String cellJson = savedLocation.getCellJson();
            String bluetoothJson = savedLocation.getBluetoothJson();
            boolean mockWifi = b().getMockWifi();
            boolean mockCell = b().getMockCell();
            boolean mockBluetooth = b().getMockBluetooth();
            boolean enableJitter = b().getEnableJitter();
            dz2Var.e = savedLocation;
            dz2Var.h = 1;
            Object objStartSpoofing = locationRepository.startSpoofing(context, lat, lng, "STILL", 0.0f, jCurrentTimeMillis, uj0.e, false, appCoordinateSystems, (2031616 & 512) != 0 ? "[]" : wifiJson, (2031616 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? "[]" : cellJson, (2031616 & 2048) != 0 ? "[]" : bluetoothJson, (2031616 & 4096) != 0 ? true : mockWifi, (2031616 & 8192) != 0 ? true : mockCell, (2031616 & 16384) != 0 ? true : mockBluetooth, (32768 & 2031616) != 0 ? true : enableJitter, (65536 & 2031616) != 0 ? 0.0d : 0.0d, (131072 & 2031616) != 0 ? false : false, (262144 & 2031616) != 0, (524288 & 2031616) != 0 ? 165 : 0, (2031616 & 1048576) != 0, dz2Var);
            z70 z70Var = z70.e;
            if (objStartSpoofing == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SavedLocation savedLocation2 = dz2Var.e;
            ee0.J(obj);
            savedLocation = savedLocation2;
        }
        b().setSpoofingActive(true);
        b().setLastSpoofedLat(String.valueOf(savedLocation.getLat()));
        b().setLastSpoofedLng(String.valueOf(savedLocation.getLng()));
        return mf3Var;
    }

    public final Object d(Context context, t3 t3Var) {
        b().setSpoofingActive(false);
        Object objStopSpoofing$default = LocationRepository.stopSpoofing$default((LocationRepository) this.a.getValue(), context, false, t3Var, 2, null);
        return objStopSpoofing$default == z70.e ? objStopSpoofing$default : mf3.a;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new t3(intent, this, context, goAsync(), (q60) null), 3, null);
    }
}
