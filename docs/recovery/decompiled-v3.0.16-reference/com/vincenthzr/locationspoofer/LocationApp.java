package com.vincenthzr.locationspoofer;

import android.app.Application;
import android.content.Context;
import com.vincenthzr.locationspoofer.data.cloud.MapStartupTiming;
import com.vincenthzr.locationspoofer.data.sync.AccountSyncManager;
import com.vincenthzr.locationspoofer.utils.ConfigManager;
import defpackage.am1;
import defpackage.ee;
import defpackage.ee0;
import defpackage.gn;
import defpackage.ir;
import defpackage.iv1;
import defpackage.j13;
import defpackage.j9;
import defpackage.jb0;
import defpackage.mf3;
import defpackage.mn2;
import defpackage.on;
import defpackage.ox;
import defpackage.re1;
import defpackage.t20;
import defpackage.t91;
import defpackage.tf0;
import defpackage.u91;
import defpackage.vm3;
import defpackage.vv2;
import defpackage.w;
import defpackage.x;
import defpackage.xe2;
import defpackage.zm3;
import defpackage.zy;
import io.github.libxposed.service.XposedService;
import io.github.libxposed.service.XposedServiceHelper;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class LocationApp extends Application implements XposedServiceHelper.OnServiceListener {
    public static final int $stable = 8;
    private final CoroutineScope cloudScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));

    private static final mf3 onCreate$lambda$0(LocationApp locationApp, u91 u91Var) {
        u91Var.getClass();
        gn gnVar = u91Var.a;
        ee eeVar = new ee(0);
        re1 re1Var = re1.f;
        eeVar.a = re1Var;
        gnVar.c = eeVar;
        locationApp.getClass();
        if (((t20) gnVar.c).i(re1Var)) {
            t20 t20Var = (t20) gnVar.c;
            t20Var.getClass();
            t20Var.j(re1Var, "[init] declare Android Context");
        }
        iv1 iv1Var = new iv1();
        x xVar = new x(locationApp, 6);
        ox oxVarA = xe2.a(Application.class);
        j13 j13Var = mn2.i;
        ir irVar = new ir(j13Var, oxVarA, xVar, t91.e);
        vv2 vv2Var = new vv2(irVar);
        iv1Var.a(vv2Var);
        ox oxVarA2 = xe2.a(Context.class);
        irVar.e = zy.w0(irVar.e, oxVarA2);
        iv1Var.c.put(zm3.w(oxVarA2, j13Var), vv2Var);
        gnVar.x(am1.F(iv1Var), true);
        List list = on.a;
        boolean z = u91Var.b;
        list.getClass();
        if (((t20) gnVar.c).i(re1Var)) {
            long jNanoTime = System.nanoTime();
            gnVar.x(list, z);
            double dNanoTime = (System.nanoTime() - jNanoTime) / 1000000.0d;
            int size = ((ConcurrentHashMap) ((gn) gnVar.b).c).size();
            ((t20) gnVar.c).g(re1Var, "Started " + size + " definitions in " + dNanoTime + " ms");
        } else {
            gnVar.x(list, z);
        }
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(LocationApp locationApp) {
        try {
            XposedServiceHelper.registerListener(locationApp);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        MapStartupTiming.INSTANCE.begin();
        synchronized (j9.N) {
            u91 u91Var = new u91();
            if (j9.O != null) {
                throw new jb0("A Koin Application has already been started");
            }
            j9.O = u91Var.a;
            onCreate$lambda$0(this, u91Var);
            u91Var.a.c();
        }
        ((AccountSyncManager) ee0.w(AccountSyncManager.class)).start();
        BuildersKt__Builders_commonKt.launch$default(this.cloudScope, null, null, new tf0(2, null), 3, null);
        ee0.w(ConfigManager.class);
        new Thread(new w(this, 9)).start();
    }

    @Override // io.github.libxposed.service.XposedServiceHelper.OnServiceListener
    public void onServiceBind(XposedService xposedService) {
        xposedService.getClass();
        synchronized (vm3.a) {
            vm3.d.setValue(xposedService);
            vm3.b.setValue(Boolean.TRUE);
        }
    }

    @Override // io.github.libxposed.service.XposedServiceHelper.OnServiceListener
    public void onServiceDied(XposedService xposedService) {
        xposedService.getClass();
        synchronized (vm3.a) {
            MutableStateFlow mutableStateFlow = vm3.d;
            if (mutableStateFlow.getValue() != xposedService) {
                return;
            }
            mutableStateFlow.setValue(null);
            vm3.b.setValue(Boolean.FALSE);
        }
    }
}
