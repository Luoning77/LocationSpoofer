package defpackage;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class f02 extends k33 implements pu0 {
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Channel g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f02(Channel channel, q60 q60Var) {
        super(2, q60Var);
        this.g = channel;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        f02 f02Var = new f02(this.g, q60Var);
        f02Var.f = obj;
        return f02Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((f02) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        Job job;
        int i = this.e;
        q60 q60Var = null;
        if (i != 0) {
            if (i != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            job = (Job) this.f;
            try {
                ee0.J(obj);
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                return obj;
            } catch (Throwable th2) {
                th = th2;
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                throw th;
            }
        }
        ee0.J(obj);
        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.f, null, null, new d6(2, q60Var), 3, null);
        try {
            Channel channel = this.g;
            this.f = jobLaunch$default;
            this.e = 1;
            Object objReceive = channel.receive(this);
            z70 z70Var = z70.e;
            if (objReceive == z70Var) {
                return z70Var;
            }
            obj = objReceive;
            job = jobLaunch$default;
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            return obj;
        } catch (Throwable th3) {
            th = th3;
            job = jobLaunch$default;
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            throw th;
        }
    }
}
