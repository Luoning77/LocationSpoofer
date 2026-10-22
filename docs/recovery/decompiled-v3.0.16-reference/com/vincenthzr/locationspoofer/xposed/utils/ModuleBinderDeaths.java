package com.vincenthzr.locationspoofer.xposed.utils;

import android.os.IBinder;
import defpackage.au0;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ModuleBinderDeaths {
    private static boolean closed;
    public static final ModuleBinderDeaths INSTANCE = new ModuleBinderDeaths();
    private static final LinkedHashMap<IBinder.DeathRecipient, IBinder> recipients = new LinkedHashMap<>();

    private ModuleBinderDeaths() {
    }

    public final synchronized void close() {
        closed = true;
        for (Map.Entry<IBinder.DeathRecipient, IBinder> entry : recipients.entrySet()) {
            entry.getValue().unlinkToDeath(entry.getKey(), 0);
        }
        recipients.clear();
    }

    public final synchronized void watch(IBinder iBinder, final au0 au0Var) {
        iBinder.getClass();
        au0Var.getClass();
        if (closed) {
            return;
        }
        IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: com.vincenthzr.locationspoofer.xposed.utils.ModuleBinderDeaths$watch$recipient$1
            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                boolean z;
                synchronized (ModuleBinderDeaths.INSTANCE) {
                    z = (ModuleBinderDeaths.recipients.remove(this) == null || ModuleBinderDeaths.closed) ? false : true;
                }
                if (z) {
                    au0Var.invoke();
                }
            }
        };
        recipients.put(deathRecipient, iBinder);
        try {
            iBinder.linkToDeath(deathRecipient, 0);
        } catch (Throwable th) {
            recipients.remove(deathRecipient);
            throw th;
        }
    }
}
