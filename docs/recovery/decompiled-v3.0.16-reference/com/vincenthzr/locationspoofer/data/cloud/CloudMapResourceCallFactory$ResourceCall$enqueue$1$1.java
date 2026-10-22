package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.ee0;
import defpackage.fo;
import defpackage.gv;
import defpackage.k33;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s90;
import java.io.IOException;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "com.vincenthzr.locationspoofer.data.cloud.CloudMapResourceCallFactory$ResourceCall$enqueue$1$1", f = "CloudMapResourceClient.kt", l = {}, m = "invokeSuspend")
public final class CloudMapResourceCallFactory$ResourceCall$enqueue$1$1 extends k33 implements pu0 {
    final /* synthetic */ gv $responseCallback;
    int label;
    final /* synthetic */ CloudMapResourceCallFactory.ResourceCall this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudMapResourceCallFactory$ResourceCall$enqueue$1$1(gv gvVar, CloudMapResourceCallFactory.ResourceCall resourceCall, q60 q60Var) {
        super(2, q60Var);
        this.$responseCallback = gvVar;
        this.this$0 = resourceCall;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new CloudMapResourceCallFactory$ResourceCall$enqueue$1$1(this.$responseCallback, this.this$0, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
        return ((CloudMapResourceCallFactory$ResourceCall$enqueue$1$1) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ee0.J(obj);
        this.$responseCallback.onFailure(this.this$0, new IOException("map_request_cancelled"));
        return mf3.a;
    }
}
