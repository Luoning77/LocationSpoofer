package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s90;
import defpackage.z70;
import java.io.IOException;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "com.vincenthzr.locationspoofer.data.cloud.CloudMapResourceCallFactory$ResourceCall$execute$1", f = "CloudMapResourceClient.kt", l = {189}, m = "invokeSuspend")
public final class CloudMapResourceCallFactory$ResourceCall$execute$1 extends k33 implements pu0 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CloudMapResourceCallFactory.ResourceCall this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudMapResourceCallFactory$ResourceCall$execute$1(CloudMapResourceCallFactory.ResourceCall resourceCall, q60 q60Var) {
        super(2, q60Var);
        this.this$0 = resourceCall;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        CloudMapResourceCallFactory$ResourceCall$execute$1 cloudMapResourceCallFactory$ResourceCall$execute$1 = new CloudMapResourceCallFactory$ResourceCall$execute$1(this.this$0, q60Var);
        cloudMapResourceCallFactory$ResourceCall$execute$1.L$0 = obj;
        return cloudMapResourceCallFactory$ResourceCall$execute$1;
    }

    @Override // defpackage.pu0
    public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
        return ((CloudMapResourceCallFactory$ResourceCall$execute$1) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) throws CloudException, IOException {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ee0.J(obj);
                return obj;
            }
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ee0.J(obj);
        this.this$0.worker.set(coroutineScope.getCoroutineContext().get(Job.Key));
        this.this$0.checkCancelled();
        CloudMapResourceCallFactory.ResourceCall resourceCall = this.this$0;
        this.L$0 = null;
        this.label = 1;
        Object objPerform = resourceCall.perform(this);
        z70 z70Var = z70.e;
        return objPerform == z70Var ? z70Var : objPerform;
    }
}
