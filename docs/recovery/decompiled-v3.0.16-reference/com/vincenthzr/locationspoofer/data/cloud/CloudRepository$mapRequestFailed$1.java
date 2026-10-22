package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.q60;
import defpackage.r60;
import defpackage.s90;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "com.vincenthzr.locationspoofer.data.cloud.CloudRepository", f = "CloudRepository.kt", l = {1508}, m = "mapRequestFailed$core_data_globalRelease")
public final class CloudRepository$mapRequestFailed$1 extends r60 {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CloudRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudRepository$mapRequestFailed$1(CloudRepository cloudRepository, q60 q60Var) {
        super(q60Var);
        this.this$0 = cloudRepository;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mapRequestFailed$core_data_globalRelease(null, null, this);
    }
}
