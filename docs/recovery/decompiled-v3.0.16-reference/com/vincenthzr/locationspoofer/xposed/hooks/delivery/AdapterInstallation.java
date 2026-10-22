package com.vincenthzr.locationspoofer.xposed.hooks.delivery;

import defpackage.au0;
import defpackage.az2;
import defpackage.lu0;
import defpackage.mf3;
import defpackage.wg2;
import defpackage.xg2;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class AdapterInstallation {
    public static final AdapterInstallation INSTANCE = new AdapterInstallation();

    private AdapterInstallation() {
    }

    public final boolean acquire(Collection<AutoCloseable> collection, SystemDeliveryAdapter systemDeliveryAdapter, lu0 lu0Var) {
        Object wg2Var;
        collection.getClass();
        systemDeliveryAdapter.getClass();
        lu0Var.getClass();
        try {
            if (systemDeliveryAdapter.install()) {
                collection.add(systemDeliveryAdapter);
                return true;
            }
        } catch (Throwable th) {
            lu0Var.invoke(th);
        }
        try {
            az2.v(systemDeliveryAdapter);
            wg2Var = mf3.a;
        } catch (Throwable th2) {
            wg2Var = new wg2(th2);
        }
        Throwable thA = xg2.a(wg2Var);
        if (thA == null) {
            return false;
        }
        lu0Var.invoke(thA);
        return false;
    }

    public final boolean acquire(Collection<AutoCloseable> collection, au0 au0Var, lu0 lu0Var) {
        collection.getClass();
        au0Var.getClass();
        lu0Var.getClass();
        try {
            return acquire(collection, (SystemDeliveryAdapter) au0Var.invoke(), lu0Var);
        } catch (Throwable th) {
            lu0Var.invoke(th);
            return false;
        }
    }
}
