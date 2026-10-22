package com.vincenthzr.locationspoofer.data.repository;

import com.vincenthzr.locationspoofer.data.cloud.CloudException;
import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s90;
import defpackage.z70;
import java.util.Set;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "com.vincenthzr.locationspoofer.data.repository.LocationRepository$startSpoofingInternal$2$2", f = "LocationRepository.kt", l = {243}, m = "invokeSuspend")
public final class LocationRepository$startSpoofingInternal$2$2 extends k33 implements pu0 {
    final /* synthetic */ Set<String> $required;
    final /* synthetic */ long $run;
    int label;
    final /* synthetic */ LocationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationRepository$startSpoofingInternal$2$2(LocationRepository locationRepository, long j, Set<String> set, q60 q60Var) {
        super(2, q60Var);
        this.this$0 = locationRepository;
        this.$run = j;
        this.$required = set;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new LocationRepository$startSpoofingInternal$2$2(this.this$0, this.$run, this.$required, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
        return ((LocationRepository$startSpoofingInternal$2$2) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) throws CloudException {
        int i = this.label;
        if (i != 0 && i != 1) {
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ee0.J(obj);
        while (!this.this$0.spoofingServiceController.isRunningFor(this.$run)) {
            this.this$0.runtimeAuthorization.requireAuthorized(this.$required);
            this.label = 1;
            Object objDelay = DelayKt.delay(50L, this);
            z70 z70Var = z70.e;
            if (objDelay == z70Var) {
                return z70Var;
            }
        }
        return mf3.a;
    }
}
