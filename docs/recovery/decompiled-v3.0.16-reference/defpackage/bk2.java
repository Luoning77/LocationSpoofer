package defpackage;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bk2 extends k33 implements pu0 {
    public final /* synthetic */ ey1 e;
    public final /* synthetic */ ey1 f;
    public final /* synthetic */ ey1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk2(ey1 ey1Var, ey1 ey1Var2, ey1 ey1Var3, q60 q60Var) {
        super(2, q60Var);
        this.e = ey1Var;
        this.f = ey1Var2;
        this.g = ey1Var3;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new bk2(this.e, this.f, this.g, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        bk2 bk2Var = (bk2) create((CoroutineScope) obj, (q60) obj2);
        mf3 mf3Var = mf3.a;
        bk2Var.invokeSuspend(mf3Var);
        return mf3Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        ee0.J(obj);
        Job job = (Job) this.e.getValue();
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f.setValue(uj0.e);
        gk2.b(this.g, false);
        return mf3.a;
    }
}
