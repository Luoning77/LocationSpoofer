package com.vincenthzr.locationspoofer.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.vincenthzr.locationspoofer.data.model.AppInfoItem;
import defpackage.gq0;
import defpackage.o51;
import defpackage.uj0;
import defpackage.vm3;
import defpackage.zy;
import io.github.libxposed.service.XposedService;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class LSPosedManager {
    public final List<AppInfoItem> getAllInstalledApps(Context context) {
        AppInfoItem appInfoItem;
        context.getClass();
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(0);
        installedApplications.getClass();
        ArrayList arrayList = new ArrayList();
        for (ApplicationInfo applicationInfo : installedApplications) {
            if (o51.f(applicationInfo.packageName, packageName)) {
                appInfoItem = null;
            } else {
                try {
                    String string = packageManager.getApplicationLabel(applicationInfo).toString();
                    int i = applicationInfo.flags;
                    boolean z = ((i & 1) == 0 && (i & WorkQueueKt.BUFFER_CAPACITY) == 0) ? false : true;
                    String str = applicationInfo.packageName;
                    str.getClass();
                    appInfoItem = new AppInfoItem(str, string, z);
                } catch (Exception unused) {
                    String str2 = applicationInfo.packageName;
                    str2.getClass();
                    String str3 = applicationInfo.packageName;
                    str3.getClass();
                    appInfoItem = new AppInfoItem(str2, str3, false);
                }
            }
            if (appInfoItem != null) {
                arrayList.add(appInfoItem);
            }
        }
        return zy.C0(arrayList, new gq0(10));
    }

    public final List<AppInfoItem> getHookedApps(Context context) {
        List<String> scope;
        AppInfoItem appInfoItem;
        context.getClass();
        vm3 vm3Var = vm3.a;
        XposedService xposedService = (XposedService) vm3.d.getValue();
        if (xposedService == null || (scope = xposedService.getScope()) == null) {
            scope = uj0.e;
        }
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = new ArrayList();
        for (String str : scope) {
            try {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
                applicationInfo.getClass();
                String string = packageManager.getApplicationLabel(applicationInfo).toString();
                int i = applicationInfo.flags;
                boolean z = ((i & 1) == 0 && (i & WorkQueueKt.BUFFER_CAPACITY) == 0) ? false : true;
                str.getClass();
                appInfoItem = new AppInfoItem(str, string, z);
            } catch (Exception unused) {
                str.getClass();
                appInfoItem = new AppInfoItem(str, str, false);
            }
            arrayList.add(appInfoItem);
        }
        return zy.C0(arrayList, new gq0(11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isModuleActive() {
        return ((Boolean) vm3.c.getValue()).booleanValue();
    }
}
