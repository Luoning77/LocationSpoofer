package com.vincenthzr.locationspoofer.data.sync;

import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import com.vincenthzr.locationspoofer.data.cloud.CloudException;
import defpackage.o51;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SyncPermissionPause {
    private String code;
    private SyncAccess.AccountKey key;

    public static /* synthetic */ void update$default(SyncPermissionPause syncPermissionPause, CloudAccountState cloudAccountState, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        syncPermissionPause.update(cloudAccountState, z);
    }

    public final String getCode() {
        return this.code;
    }

    public final void reject(Exception exc) {
        exc.getClass();
        if (this.key == null || !SyncAccess.INSTANCE.denied(exc)) {
            return;
        }
        this.code = ((CloudException) exc).getCode();
    }

    public final void update(CloudAccountState cloudAccountState, boolean z) {
        cloudAccountState.getClass();
        SyncAccess.AccountKey accountKey = SyncAccess.INSTANCE.accountKey(cloudAccountState);
        if (!o51.f(accountKey, this.key) || z) {
            this.code = null;
        }
        this.key = accountKey;
    }
}
