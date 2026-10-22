package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s90;
import defpackage.we2;
import defpackage.z70;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "com.vincenthzr.locationspoofer.data.cloud.CloudRepository$prepareRead$2$2", f = "CloudRepository.kt", l = {864}, m = "invokeSuspend")
public final class CloudRepository$prepareRead$2$2 extends k33 implements pu0 {
    final /* synthetic */ long $stamp;
    final /* synthetic */ we2 $tokens;
    int label;
    final /* synthetic */ CloudRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudRepository$prepareRead$2$2(CloudRepository cloudRepository, we2 we2Var, long j, q60 q60Var) {
        super(2, q60Var);
        this.this$0 = cloudRepository;
        this.$tokens = we2Var;
        this.$stamp = j;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new CloudRepository$prepareRead$2$2(this.this$0, this.$tokens, this.$stamp, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
        return ((CloudRepository$prepareRead$2$2) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) throws JSONException, CloudException {
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
        CloudRepository cloudRepository = this.this$0;
        CloudTokens cloudTokens = (CloudTokens) this.$tokens.e;
        long j = this.$stamp;
        this.label = 1;
        Object objRefreshTokens = cloudRepository.refreshTokens(cloudTokens, j, this);
        z70 z70Var = z70.e;
        return objRefreshTokens == z70Var ? z70Var : objRefreshTokens;
    }
}
