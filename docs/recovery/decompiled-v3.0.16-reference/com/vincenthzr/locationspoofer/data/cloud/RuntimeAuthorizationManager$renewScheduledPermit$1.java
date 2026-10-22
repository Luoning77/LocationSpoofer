package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.q60;
import defpackage.r60;
import defpackage.s90;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager", f = "RuntimeAuthorizationManager.kt", l = {141}, m = "renewScheduledPermit$core_data_globalRelease")
public final class RuntimeAuthorizationManager$renewScheduledPermit$1 extends r60 {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RuntimeAuthorizationManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RuntimeAuthorizationManager$renewScheduledPermit$1(RuntimeAuthorizationManager runtimeAuthorizationManager, q60 q60Var) {
        super(q60Var);
        this.this$0 = runtimeAuthorizationManager;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.renewScheduledPermit$core_data_globalRelease(this);
    }
}
