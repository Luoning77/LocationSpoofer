package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.ee0;
import defpackage.fo;
import defpackage.gv;
import defpackage.k33;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.qg2;
import defpackage.s90;
import defpackage.z70;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "com.vincenthzr.locationspoofer.data.cloud.CloudMapResourceCallFactory$ResourceCall$enqueue$task$1", f = "CloudMapResourceClient.kt", l = {200}, m = "invokeSuspend")
public final class CloudMapResourceCallFactory$ResourceCall$enqueue$task$1 extends k33 implements pu0 {
    final /* synthetic */ gv $responseCallback;
    int label;
    final /* synthetic */ CloudMapResourceCallFactory.ResourceCall this$0;
    final /* synthetic */ CloudMapResourceCallFactory this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudMapResourceCallFactory$ResourceCall$enqueue$task$1(CloudMapResourceCallFactory.ResourceCall resourceCall, gv gvVar, CloudMapResourceCallFactory cloudMapResourceCallFactory, q60 q60Var) {
        super(2, q60Var);
        this.this$0 = resourceCall;
        this.$responseCallback = gvVar;
        this.this$1 = cloudMapResourceCallFactory;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new CloudMapResourceCallFactory$ResourceCall$enqueue$task$1(this.this$0, this.$responseCallback, this.this$1, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
        return ((CloudMapResourceCallFactory$ResourceCall$enqueue$task$1) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                ee0.J(obj);
                this.this$0.checkCancelled();
                CloudMapResourceCallFactory.ResourceCall resourceCall = this.this$0;
                this.label = 1;
                obj = resourceCall.perform(this);
                z70 z70Var = z70.e;
                if (obj == z70Var) {
                    return z70Var;
                }
            } else {
                if (i != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
            }
            qg2 qg2Var = (qg2) obj;
            try {
                this.this$0.checkCancelled();
                if (this.this$0.delivered.compareAndSet(false, true)) {
                    this.$responseCallback.onResponse(this.this$0, qg2Var);
                } else {
                    qg2Var.close();
                }
            } catch (Exception e) {
                qg2Var.close();
                throw e;
            }
        } catch (Exception e2) {
            if (this.this$0.delivered.compareAndSet(false, true)) {
                this.$responseCallback.onFailure(this.this$0, this.this$1.safeFailure(e2));
            }
        } finally {
            this.this$1.calls.remove(this.this$0);
            this.this$0.worker.set(null);
        }
        return mf3.a;
    }
}
