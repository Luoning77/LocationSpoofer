package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.au0;
import defpackage.lu0;
import defpackage.mf3;
import defpackage.my;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CloudSigningRetryKt {
    public static final <T> T retryCloudSignature(lu0 lu0Var, au0 au0Var, lu0 lu0Var2, au0 au0Var2) throws Exception {
        lu0Var.getClass();
        au0Var.getClass();
        lu0Var2.getClass();
        au0Var2.getClass();
        try {
            return (T) au0Var2.invoke();
        } catch (Exception e) {
            if (!((Boolean) lu0Var.invoke(e)).booleanValue()) {
                throw e;
            }
            au0Var.invoke();
            T t = (T) au0Var2.invoke();
            try {
                lu0Var2.invoke(e);
            } catch (Throwable unused) {
            }
            return t;
        }
    }

    public static /* synthetic */ Object retryCloudSignature$default(lu0 lu0Var, au0 au0Var, lu0 lu0Var2, au0 au0Var2, int i, Object obj) {
        if ((i & 4) != 0) {
            lu0Var2 = new my(2);
        }
        return retryCloudSignature(lu0Var, au0Var, lu0Var2, au0Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 retryCloudSignature$lambda$0(Exception exc) {
        exc.getClass();
        return mf3.a;
    }

    public static final boolean retryExpiredCloudOperation(Integer num, Integer num2, boolean z) {
        if (z) {
            return false;
        }
        if (num != null && num.intValue() == -28) {
            return true;
        }
        return num == null && num2 != null && num2.intValue() == 15;
    }
}
