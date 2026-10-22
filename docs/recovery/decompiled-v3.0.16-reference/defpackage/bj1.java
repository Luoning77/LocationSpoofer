package defpackage;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bj1 extends k33 implements pu0 {
    public final /* synthetic */ lu0 e;
    public final /* synthetic */ ey1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj1(lu0 lu0Var, ey1 ey1Var, q60 q60Var) {
        super(2, q60Var);
        this.e = lu0Var;
        this.f = ey1Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new bj1(this.e, this.f, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        bj1 bj1Var = (bj1) create((CoroutineScope) obj, (q60) obj2);
        mf3 mf3Var = mf3.a;
        bj1Var.invokeSuspend(mf3Var);
        return mf3Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        ee0.J(obj);
        Job job = (Job) this.f.getValue();
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.e.invoke(new mz2(uj0.e, false, ""));
        return mf3.a;
    }
}
