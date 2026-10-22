package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s90;
import defpackage.z70;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "com.vincenthzr.locationspoofer.data.cloud.CloudRepository$recheckMapAccountInBackground$1", f = "CloudRepository.kt", l = {1507, 225}, m = "invokeSuspend")
public final class CloudRepository$recheckMapAccountInBackground$1 extends k33 implements pu0 {
    final /* synthetic */ long $stamp;
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CloudRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudRepository$recheckMapAccountInBackground$1(CloudRepository cloudRepository, long j, q60 q60Var) {
        super(2, q60Var);
        this.this$0 = cloudRepository;
        this.$stamp = j;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new CloudRepository$recheckMapAccountInBackground$1(this.this$0, this.$stamp, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
        return ((CloudRepository$recheckMapAccountInBackground$1) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        CloudRepository cloudRepository;
        long j;
        Mutex mutex;
        int i;
        Mutex mutex2;
        Object objAuthorized$default;
        CloudRepository cloudRepository2;
        int i2 = this.label;
        z70 z70Var = z70.e;
        try {
            try {
                if (i2 == 0) {
                    ee0.J(obj);
                    Mutex mutex3 = this.this$0.mutex;
                    cloudRepository = this.this$0;
                    j = this.$stamp;
                    this.L$0 = mutex3;
                    this.L$1 = cloudRepository;
                    this.J$0 = j;
                    this.I$0 = 0;
                    this.label = 1;
                    if (mutex3.lock(null, this) != z70Var) {
                        mutex = mutex3;
                        i = 0;
                    }
                    return z70Var;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j2 = this.J$0;
                    cloudRepository2 = (CloudRepository) this.L$1;
                    mutex2 = (Mutex) this.L$0;
                    try {
                        ee0.J(obj);
                        j = j2;
                        objAuthorized$default = obj;
                        cloudRepository2.updateAccount((JSONObject) objAuthorized$default, j);
                        mutex2.unlock(null);
                        return mf3.a;
                    } catch (Throwable th) {
                        th = th;
                        mutex2.unlock(null);
                        throw th;
                    }
                }
                i = this.I$0;
                long j3 = this.J$0;
                cloudRepository = (CloudRepository) this.L$1;
                Mutex mutex4 = (Mutex) this.L$0;
                ee0.J(obj);
                mutex = mutex4;
                j = j3;
                cloudRepository.requireValidated(j);
                this.L$0 = mutex;
                this.L$1 = cloudRepository;
                this.J$0 = j;
                this.I$0 = i;
                this.I$1 = 0;
                this.label = 2;
                CloudRepository cloudRepository3 = cloudRepository;
                objAuthorized$default = CloudRepository.authorized$default(cloudRepository3, "/v2/account", null, null, null, j, this, 14, null);
                if (objAuthorized$default != z70Var) {
                    cloudRepository2 = cloudRepository3;
                    mutex2 = mutex;
                    cloudRepository2.updateAccount((JSONObject) objAuthorized$default, j);
                    mutex2.unlock(null);
                    return mf3.a;
                }
                return z70Var;
            } catch (Throwable th2) {
                th = th2;
                mutex2 = mutex;
                mutex2.unlock(null);
                throw th;
            }
        } catch (Exception e) {
            CloudRepository.handleFailure$default(this.this$0, e, this.$stamp, "account_read", false, 8, null);
        } finally {
            this.this$0.mapRecheckRunning.set(false);
        }
    }
}
