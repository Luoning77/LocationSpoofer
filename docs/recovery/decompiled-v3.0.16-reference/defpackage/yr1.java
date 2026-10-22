package defpackage;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class yr1 implements FlowCollector {
    public final /* synthetic */ is1 e;

    public yr1(is1 is1Var) {
        this.e = is1Var;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, q60 q60Var) {
        String str = (String) obj;
        is1 is1Var = this.e;
        is1Var.k++;
        Job job = is1Var.h;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Job job2 = is1Var.i;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        is1Var.m = null;
        is1Var.n = null;
        is1Var.c.setValue(new cs1(str, 2015));
        if (str != null && is1Var.j) {
            is1Var.h();
        }
        return mf3.a;
    }
}
